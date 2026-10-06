package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradadeproductosalmacen_trn_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action48") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_48_1R542( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action49") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_49_1R542( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action50") == 0 )
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
         xc_50_1R542( Gx_mode, A396EmprCod, A719PrdNum, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action51") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         AV53LastFec = localUtil.parseDateParm( httpContext.GetPar( "LastFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53LastFec", localUtil.format(AV53LastFec, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_51_1R542( A396EmprCod, A719PrdNum, AV53LastFec) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action52") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         AV53LastFec = localUtil.parseDateParm( httpContext.GetPar( "LastFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53LastFec", localUtil.format(AV53LastFec, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_52_1R542( A396EmprCod, A719PrdNum, AV53LastFec) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action53") == 0 )
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
         xc_53_1R542( A396EmprCod, A719PrdNum, A6156EntPrvNum, A417EntPre) ;
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
         xc_54_1R542( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action55") == 0 )
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
         xc_55_1R542( Gx_mode, A396EmprCod, A719PrdNum, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action56") == 0 )
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
         AV43PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_56_1R542( Gx_mode, A396EmprCod, A6156EntPrvNum, A415EntFecEnt, A658PedCod, A418EntUniEnt, A417EntPre, AV43PedPri, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action57") == 0 )
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
         AV43PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         A597LinEnt = (short)(GXutil.lval( httpContext.GetPar( "LinEnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_57_1R542( Gx_mode, A396EmprCod, A6156EntPrvNum, A719PrdNum, A718PrdNom, A415EntFecEnt, A658PedCod, A418EntUniEnt, A417EntPre, AV43PedPri, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action58") == 0 )
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
         xc_58_1R542( Gx_mode, A396EmprCod, A719PrdNum, A415EntFecEnt, A418EntUniEnt, A417EntPre, A597LinEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action59") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6156EntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "EntPrvNum"))) ;
         n6156EntPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         AV47Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         AV48Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         A418EntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "EntUniEnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         AV46UniOld = CommonUtil.decimalVal( httpContext.GetPar( "UniOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         AV43PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         AV49AnyAnt = (short)(GXutil.lval( httpContext.GetPar( "AnyAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         AV50MesAnt = (byte)(GXutil.lval( httpContext.GetPar( "MesAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         AV51PrecAnt = CommonUtil.decimalVal( httpContext.GetPar( "PrecAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         A415EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         AV52FecAnt = localUtil.parseDateParm( httpContext.GetPar( "FecAnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_59_1R542( Gx_mode, A396EmprCod, A6156EntPrvNum, AV47Year, AV48Mes, A418EntUniEnt, AV46UniOld, A417EntPre, AV43PedPri, AV49AnyAnt, AV50MesAnt, AV51PrecAnt, A415EntFecEnt, AV52FecAnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action60") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6156EntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "EntPrvNum"))) ;
         n6156EntPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         AV47Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         AV48Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         A418EntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "EntUniEnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         AV46UniOld = CommonUtil.decimalVal( httpContext.GetPar( "UniOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         AV43PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         AV49AnyAnt = (short)(GXutil.lval( httpContext.GetPar( "AnyAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         AV50MesAnt = (byte)(GXutil.lval( httpContext.GetPar( "MesAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         AV51PrecAnt = CommonUtil.decimalVal( httpContext.GetPar( "PrecAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         A415EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         AV52FecAnt = localUtil.parseDateParm( httpContext.GetPar( "FecAnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_60_1R542( Gx_mode, A396EmprCod, A6156EntPrvNum, AV47Year, AV48Mes, A418EntUniEnt, AV46UniOld, A417EntPre, AV43PedPri, AV49AnyAnt, AV50MesAnt, AV51PrecAnt, A415EntFecEnt, AV52FecAnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action61") == 0 )
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
         AV47Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         AV48Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         A418EntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "EntUniEnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         AV46UniOld = CommonUtil.decimalVal( httpContext.GetPar( "UniOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         AV43PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         AV49AnyAnt = (short)(GXutil.lval( httpContext.GetPar( "AnyAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         AV50MesAnt = (byte)(GXutil.lval( httpContext.GetPar( "MesAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         AV51PrecAnt = CommonUtil.decimalVal( httpContext.GetPar( "PrecAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         A415EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         AV52FecAnt = localUtil.parseDateParm( httpContext.GetPar( "FecAnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_61_1R542( Gx_mode, A396EmprCod, A6156EntPrvNum, A719PrdNum, A718PrdNom, AV47Year, AV48Mes, A418EntUniEnt, AV46UniOld, A417EntPre, AV43PedPri, AV49AnyAnt, AV50MesAnt, AV51PrecAnt, A415EntFecEnt, AV52FecAnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action62") == 0 )
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
         AV47Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         AV48Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         A418EntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "EntUniEnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         AV46UniOld = CommonUtil.decimalVal( httpContext.GetPar( "UniOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         AV43PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         AV49AnyAnt = (short)(GXutil.lval( httpContext.GetPar( "AnyAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         AV50MesAnt = (byte)(GXutil.lval( httpContext.GetPar( "MesAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         AV51PrecAnt = CommonUtil.decimalVal( httpContext.GetPar( "PrecAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         A415EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         AV52FecAnt = localUtil.parseDateParm( httpContext.GetPar( "FecAnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_62_1R542( Gx_mode, A396EmprCod, A6156EntPrvNum, A719PrdNum, A718PrdNom, AV47Year, AV48Mes, A418EntUniEnt, AV46UniOld, A417EntPre, AV43PedPri, AV49AnyAnt, AV50MesAnt, AV51PrecAnt, A415EntFecEnt, AV52FecAnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action63") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         AV47Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         AV48Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         A418EntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "EntUniEnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         AV46UniOld = CommonUtil.decimalVal( httpContext.GetPar( "UniOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         AV49AnyAnt = (short)(GXutil.lval( httpContext.GetPar( "AnyAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         AV50MesAnt = (byte)(GXutil.lval( httpContext.GetPar( "MesAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         AV51PrecAnt = CommonUtil.decimalVal( httpContext.GetPar( "PrecAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         A415EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         AV52FecAnt = localUtil.parseDateParm( httpContext.GetPar( "FecAnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         AV43PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_63_1R542( Gx_mode, A396EmprCod, A719PrdNum, AV47Year, AV48Mes, A418EntUniEnt, AV46UniOld, A417EntPre, AV49AnyAnt, AV50MesAnt, AV51PrecAnt, A415EntFecEnt, AV52FecAnt, AV43PedPri) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action64") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         AV47Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         AV48Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         A418EntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "EntUniEnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         AV46UniOld = CommonUtil.decimalVal( httpContext.GetPar( "UniOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         A417EntPre = CommonUtil.decimalVal( httpContext.GetPar( "EntPre"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         AV49AnyAnt = (short)(GXutil.lval( httpContext.GetPar( "AnyAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         AV50MesAnt = (byte)(GXutil.lval( httpContext.GetPar( "MesAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         AV51PrecAnt = CommonUtil.decimalVal( httpContext.GetPar( "PrecAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         A415EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         AV52FecAnt = localUtil.parseDateParm( httpContext.GetPar( "FecAnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         AV43PedPri = httpContext.GetPar( "PedPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_64_1R542( Gx_mode, A396EmprCod, A719PrdNum, AV47Year, AV48Mes, A418EntUniEnt, AV46UniOld, A417EntPre, AV49AnyAnt, AV50MesAnt, AV51PrecAnt, A415EntFecEnt, AV52FecAnt, AV43PedPri) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action65") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_65_1R542( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action66") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_66_1R542( ) ;
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
         xc_86_1R542( ) ;
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
         xc_87_1R542( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRDNUM") == 0 )
      {
         AV76Emprcod = httpContext.GetPar( "Emprcod") ;
         A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprdnum1R50( AV76Emprcod, A13747PrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ENTPRVNUM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaentprvnum1R50( A396EmprCod, A13719PrvNNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PRDNUM") == 0 )
      {
         AV76Emprcod = httpContext.GetPar( "Emprcod") ;
         A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaprdnum1R50( AV76Emprcod, A13747PrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"PRDNUM") == 0 )
      {
         AV76Emprcod = httpContext.GetPar( "Emprcod") ;
         h719PrdNum = httpContext.GetPar( "h719PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaprdnum1R542( AV76Emprcod, h719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ENTPRVNUM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaentprvnum1R50( A396EmprCod, A13719PrvNNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"ENTPRVNUM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h6156EntPrvNum = httpContext.GetPar( "h6156EntPrvNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaentprvnum1R542( A396EmprCod, h6156EntPrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel16"+"_"+"vPRDNOMX") == 0 )
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
         gx16asaprdnomx1R542( A396EmprCod, A6156EntPrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel43"+"_"+"PEDNUMLIN") == 0 )
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
         gx43asapednumlin1R542( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_90") == 0 )
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
         gxload_90( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_89") == 0 )
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
         gxload_89( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_91") == 0 )
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
         gxload_91( A396EmprCod, A658PedCod, A719PrdNum) ;
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada de Productos Almacen", ""), (short)(0)) ;
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

   public entradadeproductosalmacen_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradadeproductosalmacen_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradadeproductosalmacen_trn_impl.class ));
   }

   public entradadeproductosalmacen_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Codigo Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, h719PrdNum, GXutil.rtrim( localUtil.format( h719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLinEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLinEnt_Internalname, httpContext.getMessage( "Linea Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLinEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLinEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A597LinEnt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A597LinEnt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLinEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLinEnt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntFecEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntFecEnt_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEntFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntFecEnt_Internalname, localUtil.format(A415EntFecEnt, "99/99/99"), localUtil.format( A415EntFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntFecEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEntFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEntFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbaran_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbaran_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbaran_Internalname, httpContext.getMessage( "N Albaran", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbaran_Internalname, GXutil.rtrim( A11Albaran), GXutil.rtrim( localUtil.format( A11Albaran, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbaran_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbaran_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divEntnalbar_cell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntNAlbar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntNAlbar_Internalname, httpContext.getMessage( "N Albaran", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntNAlbar_Internalname, GXutil.rtrim( A12857EntNAlbar), GXutil.rtrim( localUtil.format( A12857EntNAlbar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntNAlbar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntNAlbar_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable7_Internalname, tblUnnamedtable7_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell DscTop'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepedcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpedcod_Internalname, httpContext.getMessage( "Nº Pedido", ""), "", "", lblTextblockpedcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedCod_Internalname, httpContext.getMessage( "Nº Pedido", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedCod_Internalname, GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Active images/pictures */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "ImageTopMargin35" + " " + ((GXutil.strcmp(imgLpedidprompt_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgLpedidprompt_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgLpedidprompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgLpedidprompt_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgLpedidprompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"e111r542_client"+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntPrvNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntPrvNum_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntPrvNum_Internalname, h6156EntPrvNum, GXutil.rtrim( localUtil.format( h6156EntPrvNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntPrvNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntPrvNum_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntUniEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntUniEnt_Internalname, httpContext.getMessage( "Uds  Ent", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntUniEnt_Enabled!=0) ? localUtil.format( A418EntUniEnt, "ZZZZZ9.99") : localUtil.format( A418EntUniEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntUniEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntPre_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntPre_Internalname, GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntPre_Enabled!=0) ? localUtil.format( A417EntPre, "ZZZZZZZ9.999") : localUtil.format( A417EntPre, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntPre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntUniRem_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntUniRem_Internalname, httpContext.getMessage( "Uds Rem", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntUniRem_Internalname, GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntUniRem_Enabled!=0) ? localUtil.format( A419EntUniRem, "ZZZZZ9.9999") : localUtil.format( A419EntUniRem, "ZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntUniRem_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntUniRem_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedCanEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedCanEnt_Internalname, httpContext.getMessage( "Unds Entregadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedCanEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedCanEnt_Enabled!=0) ? localUtil.format( A657PedCanEnt, "ZZZZZ9.99") : localUtil.format( A657PedCanEnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedCanEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedCanEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedUni_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedUni_Internalname, httpContext.getMessage( "Unds Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedUni_Internalname, GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedUni_Enabled!=0) ? localUtil.format( A669PedUni, "ZZZZZ9.99") : localUtil.format( A669PedUni, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedUni_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCantPdte_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCantPdte_Internalname, httpContext.getMessage( "Cant Pdte", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCantPdte_Internalname, GXutil.ltrim( localUtil.ntoc( A13833CantPdte, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCantPdte_Enabled!=0) ? localUtil.format( A13833CantPdte, "ZZZZZZZZ9.99") : localUtil.format( A13833CantPdte, "ZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCantPdte_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCantPdte_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedPre_Internalname, httpContext.getMessage( "Precio Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedPre_Internalname, GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedPre_Enabled!=0) ? localUtil.format( A665PedPre, "ZZZZZZZ9.999") : localUtil.format( A665PedPre, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedPre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedPre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedCum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedCum_Internalname, httpContext.getMessage( "Cerrado?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedCum_Internalname, GXutil.rtrim( A659PedCum), GXutil.rtrim( localUtil.format( A659PedCum, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedCum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedCum_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCanPen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCanPen_Internalname, httpContext.getMessage( "Cantidad Pendiente Recibir", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanPen_Internalname, GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanPen_Enabled!=0) ? localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999") : localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanPen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCanPen_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntLotN_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntLotN_Internalname, httpContext.getMessage( "Nº Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntLotN_Internalname, GXutil.rtrim( A5686EntLotN), GXutil.rtrim( localUtil.format( A5686EntLotN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntLotN_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntLotN_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntFVal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntFVal_Internalname, httpContext.getMessage( "Fecha Caducidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEntFVal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntFVal_Internalname, localUtil.format(A5685EntFVal, "99/99/99"), localUtil.format( A5685EntFVal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntFVal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntFVal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEntFVal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEntFVal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEntObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEntObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntObs_Internalname, GXutil.rtrim( A10783EntObs), GXutil.rtrim( localUtil.format( A10783EntObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntObs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEntObs_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntNumCon_Internalname, GXutil.ltrim( localUtil.ntoc( A416EntNumCon, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntNumCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A416EntNumCon), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A416EntNumCon), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,140);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntNumCon_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntNumCon_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntEti_Internalname, GXutil.ltrim( localUtil.ntoc( A414EntEti, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntEti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A414EntEti), "9") : localUtil.format( DecimalUtil.doubleToDec(A414EntEti), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntEti_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntEti_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntCon_Internalname, GXutil.ltrim( localUtil.ntoc( A411EntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A411EntCon), "9") : localUtil.format( DecimalUtil.doubleToDec(A411EntCon), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,142);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntCon_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntCon_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntConIni_Internalname, GXutil.ltrim( localUtil.ntoc( A413EntConIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntConIni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A413EntConIni), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A413EntConIni), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,143);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntConIni_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntConIni_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntConFin_Internalname, GXutil.ltrim( localUtil.ntoc( A412EntConFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntConFin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A412EntConFin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A412EntConFin), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntConFin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntConFin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntNro_Internalname, GXutil.ltrim( localUtil.ntoc( A5469EntNro, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5469EntNro), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5469EntNro), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntNro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntNro_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntUniAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A10782EntUniAlb, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntUniAlb_Enabled!=0) ? localUtil.format( A10782EntUniAlb, "ZZZZZ9.9999") : localUtil.format( A10782EntUniAlb, "ZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntUniAlb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntUniAlb_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntBnc_Internalname, GXutil.rtrim( A5691EntBnc), GXutil.rtrim( localUtil.format( A5691EntBnc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,147);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntBnc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntBnc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtPedFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedFec_Internalname, localUtil.format(A661PedFec, "99/99/99"), localUtil.format( A661PedFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPedFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPedFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedNumLin_Internalname, GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedNumLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A664PedNumLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A664PedNumLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedNumLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedNumLin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedSit_Internalname, GXutil.rtrim( A667PedSit), GXutil.rtrim( localUtil.format( A667PedSit, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedSit_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedSit_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtPedFulEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedFulEnt_Internalname, localUtil.format(A663PedFulEnt, "99/99/99"), localUtil.format( A663PedFulEnt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedFulEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedFulEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPedFulEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPedFulEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntCC_Internalname, GXutil.rtrim( A7695EntCC), GXutil.rtrim( localUtil.format( A7695EntCC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,152);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntCC_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntCCoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A7696EntCCoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntCCoCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7696EntCCoCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7696EntCCoCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,153);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntCCoCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntCCoCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntRemNro_Internalname, GXutil.rtrim( A10187EntRemNro), GXutil.rtrim( localUtil.format( A10187EntRemNro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntRemNro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntRemNro_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEntRemFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntRemFch_Internalname, localUtil.format(A10186EntRemFch, "99/99/99"), localUtil.format( A10186EntRemFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,155);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntRemFch_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntRemFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEntRemFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEntRemFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntRemSuc_Internalname, GXutil.rtrim( A10185EntRemSuc), GXutil.rtrim( localUtil.format( A10185EntRemSuc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntRemSuc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntRemSuc_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntRemTpo_Internalname, GXutil.rtrim( A10184EntRemTpo), GXutil.rtrim( localUtil.format( A10184EntRemTpo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,157);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntRemTpo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntRemTpo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntFabId_Internalname, GXutil.ltrim( localUtil.ntoc( A12716EntFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntFabId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12716EntFabId), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12716EntFabId), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,158);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntFabId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntFabId_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntLoteID_Internalname, GXutil.ltrim( localUtil.ntoc( A13235EntLoteID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEntLoteID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13235EntLoteID), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13235EntLoteID), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntLoteID_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntLoteID_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntUbicaci_Internalname, GXutil.rtrim( A13456EntUbicaci), GXutil.rtrim( localUtil.format( A13456EntUbicaci, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,160);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntUbicaci_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntUbicaci_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiAlm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtPrdFulEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFulEnt_Internalname, localUtil.format(A713PrdFulEnt, "99/99/99"), localUtil.format( A713PrdFulEnt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFulEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFulEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFulEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFulEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtPrdFecPre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFecPre_Internalname, localUtil.format(A709PrdFecPre, "99/99/99"), localUtil.format( A709PrdFecPre, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFecPre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFecPre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFecPre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFecPre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAnt_Internalname, GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAnt_Enabled!=0) ? localUtil.format( A725PrdPreAnt, "ZZZZZZZ9.999") : localUtil.format( A725PrdPreAnt, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPreAnt_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAct_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPreAct_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdValStk_Internalname, GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdValStk_Enabled!=0) ? localUtil.format( A750PrdValStk, "ZZZZZZZ9.99") : localUtil.format( A750PrdValStk, "ZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdValStk_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdValStk_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedDto_Internalname, GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedDto_Enabled!=0) ? localUtil.format( A660PedDto, "Z9.99") : localUtil.format( A660PedDto, "Z9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedDto_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedDto_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiCC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDetPar_Internalname, GXutil.rtrim( A698PrdDetPar), GXutil.rtrim( localUtil.format( A698PrdDetPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDetPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdDetPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRec_Internalname, GXutil.rtrim( A727PrdRec), GXutil.rtrim( localUtil.format( A727PrdRec, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdRec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtValCod_Internalname, GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtValCod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreMed_Internalname, GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreMed_Enabled!=0) ? localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999") : localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreMed_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPreMed_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedPri_Internalname, GXutil.rtrim( A666PedPri), GXutil.rtrim( localUtil.format( A666PedPri, "9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedPri_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedPri_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 177,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEntPedCum_Internalname, GXutil.rtrim( A3404EntPedCum), GXutil.rtrim( localUtil.format( A3404EntPedCum, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,177);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEntPedCum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEntPedCum_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\EntradadeProductosAlmacen_TRN.htm");
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
      e121R52 ();
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
            Z419EntUniRem = localUtil.ctond( httpContext.cgiGet( "Z419EntUniRem")) ;
            Z417EntPre = localUtil.ctond( httpContext.cgiGet( "Z417EntPre")) ;
            Z418EntUniEnt = localUtil.ctond( httpContext.cgiGet( "Z418EntUniEnt")) ;
            Z13235EntLoteID = localUtil.ctol( httpContext.cgiGet( "Z13235EntLoteID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z415EntFecEnt = localUtil.ctod( httpContext.cgiGet( "Z415EntFecEnt"), 0) ;
            Z11Albaran = httpContext.cgiGet( "Z11Albaran") ;
            Z12857EntNAlbar = httpContext.cgiGet( "Z12857EntNAlbar") ;
            Z6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z6156EntPrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5686EntLotN = httpContext.cgiGet( "Z5686EntLotN") ;
            Z5685EntFVal = localUtil.ctod( httpContext.cgiGet( "Z5685EntFVal"), 0) ;
            Z10783EntObs = httpContext.cgiGet( "Z10783EntObs") ;
            Z416EntNumCon = (short)(localUtil.ctol( httpContext.cgiGet( "Z416EntNumCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z414EntEti = (byte)(localUtil.ctol( httpContext.cgiGet( "Z414EntEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z411EntCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z411EntCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z413EntConIni = (int)(localUtil.ctol( httpContext.cgiGet( "Z413EntConIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z412EntConFin = (int)(localUtil.ctol( httpContext.cgiGet( "Z412EntConFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5469EntNro = (int)(localUtil.ctol( httpContext.cgiGet( "Z5469EntNro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10782EntUniAlb = localUtil.ctond( httpContext.cgiGet( "Z10782EntUniAlb")) ;
            Z3404EntPedCum = httpContext.cgiGet( "Z3404EntPedCum") ;
            Z5691EntBnc = httpContext.cgiGet( "Z5691EntBnc") ;
            Z7695EntCC = httpContext.cgiGet( "Z7695EntCC") ;
            Z7696EntCCoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z7696EntCCoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10187EntRemNro = httpContext.cgiGet( "Z10187EntRemNro") ;
            Z10186EntRemFch = localUtil.ctod( httpContext.cgiGet( "Z10186EntRemFch"), 0) ;
            Z10185EntRemSuc = httpContext.cgiGet( "Z10185EntRemSuc") ;
            Z10184EntRemTpo = httpContext.cgiGet( "Z10184EntRemTpo") ;
            Z12716EntFabId = (int)(localUtil.ctol( httpContext.cgiGet( "Z12716EntFabId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13456EntUbicaci = httpContext.cgiGet( "Z13456EntUbicaci") ;
            Z14035EntNEmb = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14035EntNEmb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z658PedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "Z726PrdPreMed")) ;
            Z713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( "Z713PrdFulEnt"), 0) ;
            Z709PrdFecPre = localUtil.ctod( httpContext.cgiGet( "Z709PrdFecPre"), 0) ;
            Z725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( "Z725PrdPreAnt")) ;
            Z724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "Z724PrdPreAct")) ;
            Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
            Z698PrdDetPar = httpContext.cgiGet( "Z698PrdDetPar") ;
            Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
            Z727PrdRec = httpContext.cgiGet( "Z727PrdRec") ;
            Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z856ValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14035EntNEmb = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14035EntNEmb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "O724PrdPreAct")) ;
            O750PrdValStk = localUtil.ctond( httpContext.cgiGet( "O750PrdValStk")) ;
            O419EntUniRem = localUtil.ctond( httpContext.cgiGet( "O419EntUniRem")) ;
            O418EntUniEnt = localUtil.ctond( httpContext.cgiGet( "O418EntUniEnt")) ;
            O684PrdCanPen = localUtil.ctond( httpContext.cgiGet( "O684PrdCanPen")) ;
            O704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( "O704PrdExiAlm")) ;
            O415EntFecEnt = localUtil.ctod( httpContext.cgiGet( "O415EntFecEnt"), 0) ;
            O417EntPre = localUtil.ctond( httpContext.cgiGet( "O417EntPre")) ;
            O5686EntLotN = httpContext.cgiGet( "O5686EntLotN") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV47Year = (short)(localUtil.ctol( httpContext.cgiGet( "vYEAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV48Mes = (byte)(localUtil.ctol( httpContext.cgiGet( "vMES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV42OldExiAlm = localUtil.ctond( httpContext.cgiGet( "vOLDEXIALM")) ;
            AV36OldEntPre = localUtil.ctond( httpContext.cgiGet( "vOLDENTPRE")) ;
            AV38OldEntUni = localUtil.ctond( httpContext.cgiGet( "vOLDENTUNI")) ;
            AV40OldRemanente = localUtil.ctond( httpContext.cgiGet( "vOLDREMANENTE")) ;
            AV37oldEntFecent = localUtil.ctod( httpContext.cgiGet( "vOLDENTFECENT"), 0) ;
            AV39oldlote = httpContext.cgiGet( "vOLDLOTE") ;
            AV46UniOld = localUtil.ctond( httpContext.cgiGet( "vUNIOLD")) ;
            AV52FecAnt = localUtil.ctod( httpContext.cgiGet( "vFECANT"), 0) ;
            AV51PrecAnt = localUtil.ctond( httpContext.cgiGet( "vPRECANT")) ;
            AV49AnyAnt = (short)(localUtil.ctol( httpContext.cgiGet( "vANYANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV50MesAnt = (byte)(localUtil.ctol( httpContext.cgiGet( "vMESANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCENTPRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV59PrdNomX = httpContext.cgiGet( "vPRDNOMX") ;
            AV43PedPri = httpContext.cgiGet( "vPEDPRI") ;
            AV28Consumos = (short)(localUtil.ctol( httpContext.cgiGet( "vCONSUMOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20NoUpd = (short)(localUtil.ctol( httpContext.cgiGet( "vNOUPD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV73PedCum = httpContext.cgiGet( "vPEDCUM") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "PRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV63Fecha = localUtil.ctod( httpContext.cgiGet( "vFECHA"), 0) ;
            AV53LastFec = localUtil.ctod( httpContext.cgiGet( "vLASTFEC"), 0) ;
            AV62msg_ctrl_fecha = httpContext.cgiGet( "vMSG_CTRL_FECHA") ;
            A719PrdNum = httpContext.cgiGet( "GXHCPRDNUM") ;
            AV35Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV72DiasFin = (short)(localUtil.ctol( httpContext.cgiGet( "vDIASFIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV76Emprcod = httpContext.cgiGet( "vEMPRCOD") ;
            AV10ExiLoteID = (short)(localUtil.ctol( httpContext.cgiGet( "vEXILOTEID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34FlagCcs = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGCCS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26Artextil = (short)(localUtil.ctol( httpContext.cgiGet( "vARTEXTIL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22Nalbaran20 = (short)(localUtil.ctol( httpContext.cgiGet( "vNALBARAN20"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV29FlagPre = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGPRE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32FlagFecCcs = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGFECCCS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15tintutex = (short)(localUtil.ctol( httpContext.cgiGet( "vTINTUTEX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV75Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV7Station = httpContext.cgiGet( "vSTATION") ;
            A14035EntNEmb = (byte)(localUtil.ctol( httpContext.cgiGet( "ENTNEMB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            h719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
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
            h6156EntPrvNum = httpContext.cgiGet( edtEntPrvNum_Internalname) ;
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
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEntUniRem_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEntUniRem_Internalname)), DecimalUtil.stringToDec("999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTUNIREM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntUniRem_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A419EntUniRem = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
            }
            else
            {
               A419EntUniRem = localUtil.ctond( httpContext.cgiGet( edtEntUniRem_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
            }
            A657PedCanEnt = localUtil.ctond( httpContext.cgiGet( edtPedCanEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
            A669PedUni = localUtil.ctond( httpContext.cgiGet( edtPedUni_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
            A13833CantPdte = localUtil.ctond( httpContext.cgiGet( edtCantPdte_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrimstr( A13833CantPdte, 12, 2));
            A665PedPre = localUtil.ctond( httpContext.cgiGet( edtPedPre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
            A659PedCum = GXutil.upper( httpContext.cgiGet( edtPedCum_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", A659PedCum);
            A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
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
            A10783EntObs = httpContext.cgiGet( edtEntObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10783EntObs", A10783EntObs);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntNumCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntNumCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTNUMCON");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntNumCon_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A416EntNumCon = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A416EntNumCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A416EntNumCon), 3, 0));
            }
            else
            {
               A416EntNumCon = (short)(localUtil.ctol( httpContext.cgiGet( edtEntNumCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A416EntNumCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A416EntNumCon), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTETI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntEti_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A414EntEti = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A414EntEti", GXutil.str( A414EntEti, 1, 0));
            }
            else
            {
               A414EntEti = (byte)(localUtil.ctol( httpContext.cgiGet( edtEntEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A414EntEti", GXutil.str( A414EntEti, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTCON");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntCon_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A411EntCon = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A411EntCon", GXutil.str( A411EntCon, 1, 0));
            }
            else
            {
               A411EntCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtEntCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A411EntCon", GXutil.str( A411EntCon, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntConIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntConIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTCONINI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntConIni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A413EntConIni = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A413EntConIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A413EntConIni), 8, 0));
            }
            else
            {
               A413EntConIni = (int)(localUtil.ctol( httpContext.cgiGet( edtEntConIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A413EntConIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A413EntConIni), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntConFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntConFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTCONFIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntConFin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A412EntConFin = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A412EntConFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A412EntConFin), 8, 0));
            }
            else
            {
               A412EntConFin = (int)(localUtil.ctol( httpContext.cgiGet( edtEntConFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A412EntConFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A412EntConFin), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTNRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntNro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5469EntNro = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A5469EntNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5469EntNro), 6, 0));
            }
            else
            {
               A5469EntNro = (int)(localUtil.ctol( httpContext.cgiGet( edtEntNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5469EntNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5469EntNro), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEntUniAlb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEntUniAlb_Internalname)), DecimalUtil.stringToDec("999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTUNIALB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntUniAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10782EntUniAlb = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A10782EntUniAlb", GXutil.ltrimstr( A10782EntUniAlb, 11, 4));
            }
            else
            {
               A10782EntUniAlb = localUtil.ctond( httpContext.cgiGet( edtEntUniAlb_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10782EntUniAlb", GXutil.ltrimstr( A10782EntUniAlb, 11, 4));
            }
            A5691EntBnc = httpContext.cgiGet( edtEntBnc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5691EntBnc", A5691EntBnc);
            A661PedFec = localUtil.ctod( httpContext.cgiGet( edtPedFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
            A664PedNumLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPedNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
            A667PedSit = GXutil.upper( httpContext.cgiGet( edtPedSit_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
            A663PedFulEnt = localUtil.ctod( httpContext.cgiGet( edtPedFulEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
            A7695EntCC = httpContext.cgiGet( edtEntCC_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7695EntCC", A7695EntCC);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntCCoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntCCoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTCCOCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntCCoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7696EntCCoCod = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7696EntCCoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7696EntCCoCod), 3, 0));
            }
            else
            {
               A7696EntCCoCod = (short)(localUtil.ctol( httpContext.cgiGet( edtEntCCoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7696EntCCoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7696EntCCoCod), 3, 0));
            }
            A10187EntRemNro = httpContext.cgiGet( edtEntRemNro_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10187EntRemNro", A10187EntRemNro);
            if ( localUtil.vcdate( httpContext.cgiGet( edtEntRemFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ENTREMFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntRemFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10186EntRemFch = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A10186EntRemFch", localUtil.format(A10186EntRemFch, "99/99/99"));
            }
            else
            {
               A10186EntRemFch = localUtil.ctod( httpContext.cgiGet( edtEntRemFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10186EntRemFch", localUtil.format(A10186EntRemFch, "99/99/99"));
            }
            A10185EntRemSuc = httpContext.cgiGet( edtEntRemSuc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10185EntRemSuc", A10185EntRemSuc);
            A10184EntRemTpo = httpContext.cgiGet( edtEntRemTpo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", A10184EntRemTpo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntFabId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntFabId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTFABID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntFabId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12716EntFabId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
            }
            else
            {
               A12716EntFabId = (int)(localUtil.ctol( httpContext.cgiGet( edtEntFabId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEntLoteID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEntLoteID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ENTLOTEID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntLoteID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13235EntLoteID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13235EntLoteID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13235EntLoteID), 12, 0));
            }
            else
            {
               A13235EntLoteID = localUtil.ctol( httpContext.cgiGet( edtEntLoteID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13235EntLoteID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13235EntLoteID), 12, 0));
            }
            A13456EntUbicaci = httpContext.cgiGet( edtEntUbicaci_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13456EntUbicaci", A13456EntUbicaci);
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
            A713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( edtPrdFulEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
            A709PrdFecPre = localUtil.ctod( httpContext.cgiGet( edtPrdFecPre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
            A725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( edtPrdPreAnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
            A750PrdValStk = localUtil.ctond( httpContext.cgiGet( edtPrdValStk_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
            A660PedDto = localUtil.ctond( httpContext.cgiGet( edtPedDto_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrimstr( A660PedDto, 5, 2));
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
            A698PrdDetPar = httpContext.cgiGet( edtPrdDetPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
            A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( edtPrdPreMed_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A666PedPri = httpContext.cgiGet( edtPedPri_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", A666PedPri);
            A3404EntPedCum = GXutil.upper( httpContext.cgiGet( edtEntPedCum_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"EntradadeProductosAlmacen_TRN");
            forbiddenHiddens.add("EntNEmb", localUtil.format( DecimalUtil.doubleToDec(A14035EntNEmb), "Z9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("stocksquimicos\\entradadeproductosalmacen_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal( ) ;
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
                        e121R52 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131R52 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
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
         e131R52 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1R542( ) ;
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
      if ( isIns( ) )
      {
         bttBtntrn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtntrn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
      }
      disableAttributes1R542( ) ;
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

   public void resetCaption1R50( )
   {
   }

   public void e121R52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradadeproductosalmacen_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char2[0] ;
      entradadeproductosalmacen_trn_impl.this.AV8EmprNom = GXv_char3[0] ;
      entradadeproductosalmacen_trn_impl.this.AV9UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
      GXt_int5 = (byte)(AV11F_endutex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV11F_endutex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11F_endutex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11F_endutex), 4, 0));
      GXt_int5 = (byte)(AV12St0018) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ST0018", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV12St0018 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12St0018", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12St0018), 4, 0));
      GXt_int5 = (byte)(AV13Proprv) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV13Proprv = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Proprv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Proprv), 4, 0));
      GXt_int5 = (byte)(AV14verCont) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CONTEV", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV14verCont = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14verCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14verCont), 4, 0));
      GXt_int5 = (byte)(AV15tintutex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV15tintutex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15tintutex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15tintutex), 4, 0));
      GXt_int5 = (byte)(AV16SinCompras) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SINCOP", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV16SinCompras = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16SinCompras", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16SinCompras), 4, 0));
      GXt_int5 = (byte)(AV17vincolor) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VINCOL", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV17vincolor = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17vincolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17vincolor), 4, 0));
      GXt_int5 = (byte)(AV18BCTexplus) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BCTXP", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV18BCTexplus = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18BCTexplus", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BCTexplus), 4, 0));
      GXt_int5 = (byte)(AV19AudEntradas) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ADINST", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV19AudEntradas = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19AudEntradas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AudEntradas), 4, 0));
      GXt_int5 = (byte)(AV20NoUpd) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOUPPR", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV20NoUpd = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20NoUpd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20NoUpd), 4, 0));
      GXt_int5 = (byte)(AV21Rontaltex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RONTAL", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV21Rontaltex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Rontaltex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Rontaltex), 4, 0));
      GXt_int5 = (byte)(AV22Nalbaran20) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBA20", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV22Nalbaran20 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Nalbaran20", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Nalbaran20), 4, 0));
      GXt_int5 = (byte)(AV23Carvitin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV23Carvitin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Carvitin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Carvitin), 4, 0));
      GXt_int5 = (byte)(AV10ExiLoteID) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IDLOTE", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV10ExiLoteID = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10ExiLoteID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ExiLoteID), 4, 0));
      GXt_int5 = (byte)(AV24uel041) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UEL041", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV24uel041 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24uel041", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24uel041), 4, 0));
      GXt_int5 = (byte)(AV25Er) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EROTAT", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV25Er = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Er", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Er), 4, 0));
      GXt_int5 = (byte)(AV26Artextil) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV26Artextil = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Artextil", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Artextil), 4, 0));
      GXt_int5 = (byte)(AV27Intexco) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV27Intexco = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Intexco", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Intexco), 4, 0));
      GXt_int7 = AV28Consumos ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int8) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV28Consumos = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Consumos), 4, 0));
      GXt_int5 = (byte)(AV29FlagPre) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENTPRE", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV29FlagPre = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29FlagPre", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29FlagPre), 4, 0));
      GXt_int5 = (byte)(AV30PreTot) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRETOT", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV30PreTot = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30PreTot", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30PreTot), 4, 0));
      GXt_int5 = (byte)(AV34FlagCcs) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CCSTKS", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV34FlagCcs = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34FlagCcs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34FlagCcs), 4, 0));
      GXt_int5 = (byte)(AV33FlagEti) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETIPRX", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33FlagEti = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33FlagEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33FlagEti), 4, 0));
      GXt_int5 = (byte)(AV32FlagFecCcs) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FECCCS", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV32FlagFecCcs = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32FlagFecCcs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32FlagFecCcs), 4, 0));
      GXt_int5 = (byte)(AV31FlagEst) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100009", GXv_int6) ;
      entradadeproductosalmacen_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV31FlagEst = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31FlagEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31FlagEst), 4, 0));
   }

   public void e131R52( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) && ! (0==A658PedCod) )
      {
         httpContext.popup(formatLink("app.cerrarordendecompra", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A658PedCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV65PrdNum)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","PedCod","PrdNum","PedCum"}) , new Object[] {"A396EmprCod","A658PedCod","AV65PrdNum","AV73PedCum"});
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void zm1R542( int GX_JID )
   {
      if ( ( GX_JID == 88 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z419EntUniRem = T01R53_A419EntUniRem[0] ;
            Z417EntPre = T01R53_A417EntPre[0] ;
            Z418EntUniEnt = T01R53_A418EntUniEnt[0] ;
            Z13235EntLoteID = T01R53_A13235EntLoteID[0] ;
            Z415EntFecEnt = T01R53_A415EntFecEnt[0] ;
            Z11Albaran = T01R53_A11Albaran[0] ;
            Z12857EntNAlbar = T01R53_A12857EntNAlbar[0] ;
            Z6156EntPrvNum = T01R53_A6156EntPrvNum[0] ;
            Z5686EntLotN = T01R53_A5686EntLotN[0] ;
            Z5685EntFVal = T01R53_A5685EntFVal[0] ;
            Z10783EntObs = T01R53_A10783EntObs[0] ;
            Z416EntNumCon = T01R53_A416EntNumCon[0] ;
            Z414EntEti = T01R53_A414EntEti[0] ;
            Z411EntCon = T01R53_A411EntCon[0] ;
            Z413EntConIni = T01R53_A413EntConIni[0] ;
            Z412EntConFin = T01R53_A412EntConFin[0] ;
            Z5469EntNro = T01R53_A5469EntNro[0] ;
            Z10782EntUniAlb = T01R53_A10782EntUniAlb[0] ;
            Z3404EntPedCum = T01R53_A3404EntPedCum[0] ;
            Z5691EntBnc = T01R53_A5691EntBnc[0] ;
            Z7695EntCC = T01R53_A7695EntCC[0] ;
            Z7696EntCCoCod = T01R53_A7696EntCCoCod[0] ;
            Z10187EntRemNro = T01R53_A10187EntRemNro[0] ;
            Z10186EntRemFch = T01R53_A10186EntRemFch[0] ;
            Z10185EntRemSuc = T01R53_A10185EntRemSuc[0] ;
            Z10184EntRemTpo = T01R53_A10184EntRemTpo[0] ;
            Z12716EntFabId = T01R53_A12716EntFabId[0] ;
            Z13456EntUbicaci = T01R53_A13456EntUbicaci[0] ;
            Z14035EntNEmb = T01R53_A14035EntNEmb[0] ;
            Z658PedCod = T01R53_A658PedCod[0] ;
         }
         else
         {
            Z419EntUniRem = A419EntUniRem ;
            Z417EntPre = A417EntPre ;
            Z418EntUniEnt = A418EntUniEnt ;
            Z13235EntLoteID = A13235EntLoteID ;
            Z415EntFecEnt = A415EntFecEnt ;
            Z11Albaran = A11Albaran ;
            Z12857EntNAlbar = A12857EntNAlbar ;
            Z6156EntPrvNum = A6156EntPrvNum ;
            Z5686EntLotN = A5686EntLotN ;
            Z5685EntFVal = A5685EntFVal ;
            Z10783EntObs = A10783EntObs ;
            Z416EntNumCon = A416EntNumCon ;
            Z414EntEti = A414EntEti ;
            Z411EntCon = A411EntCon ;
            Z413EntConIni = A413EntConIni ;
            Z412EntConFin = A412EntConFin ;
            Z5469EntNro = A5469EntNro ;
            Z10782EntUniAlb = A10782EntUniAlb ;
            Z3404EntPedCum = A3404EntPedCum ;
            Z5691EntBnc = A5691EntBnc ;
            Z7695EntCC = A7695EntCC ;
            Z7696EntCCoCod = A7696EntCCoCod ;
            Z10187EntRemNro = A10187EntRemNro ;
            Z10186EntRemFch = A10186EntRemFch ;
            Z10185EntRemSuc = A10185EntRemSuc ;
            Z10184EntRemTpo = A10184EntRemTpo ;
            Z12716EntFabId = A12716EntFabId ;
            Z13456EntUbicaci = A13456EntUbicaci ;
            Z14035EntNEmb = A14035EntNEmb ;
            Z658PedCod = A658PedCod ;
         }
      }
      if ( ( GX_JID == 89 ) || ( GX_JID == 0 ) )
      {
         Z726PrdPreMed = T01R55_A726PrdPreMed[0] ;
         Z713PrdFulEnt = T01R55_A713PrdFulEnt[0] ;
         Z709PrdFecPre = T01R55_A709PrdFecPre[0] ;
         Z725PrdPreAnt = T01R55_A725PrdPreAnt[0] ;
         Z724PrdPreAct = T01R55_A724PrdPreAct[0] ;
         Z705PrdExiCC = T01R55_A705PrdExiCC[0] ;
         Z698PrdDetPar = T01R55_A698PrdDetPar[0] ;
         Z718PrdNom = T01R55_A718PrdNom[0] ;
         Z727PrdRec = T01R55_A727PrdRec[0] ;
         Z795PrvNum = T01R55_A795PrvNum[0] ;
         Z856ValCod = T01R55_A856ValCod[0] ;
      }
      if ( GX_JID == -88 )
      {
         Z597LinEnt = A597LinEnt ;
         Z419EntUniRem = A419EntUniRem ;
         Z417EntPre = A417EntPre ;
         Z418EntUniEnt = A418EntUniEnt ;
         Z13235EntLoteID = A13235EntLoteID ;
         Z415EntFecEnt = A415EntFecEnt ;
         Z11Albaran = A11Albaran ;
         Z12857EntNAlbar = A12857EntNAlbar ;
         Z6156EntPrvNum = A6156EntPrvNum ;
         Z5686EntLotN = A5686EntLotN ;
         Z5685EntFVal = A5685EntFVal ;
         Z10783EntObs = A10783EntObs ;
         Z416EntNumCon = A416EntNumCon ;
         Z414EntEti = A414EntEti ;
         Z411EntCon = A411EntCon ;
         Z413EntConIni = A413EntConIni ;
         Z412EntConFin = A412EntConFin ;
         Z5469EntNro = A5469EntNro ;
         Z10782EntUniAlb = A10782EntUniAlb ;
         Z3404EntPedCum = A3404EntPedCum ;
         Z5691EntBnc = A5691EntBnc ;
         Z7695EntCC = A7695EntCC ;
         Z7696EntCCoCod = A7696EntCCoCod ;
         Z10187EntRemNro = A10187EntRemNro ;
         Z10186EntRemFch = A10186EntRemFch ;
         Z10185EntRemSuc = A10185EntRemSuc ;
         Z10184EntRemTpo = A10184EntRemTpo ;
         Z12716EntFabId = A12716EntFabId ;
         Z13456EntUbicaci = A13456EntUbicaci ;
         Z14035EntNEmb = A14035EntNEmb ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z658PedCod = A658PedCod ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z684PrdCanPen = A684PrdCanPen ;
         Z750PrdValStk = A750PrdValStk ;
         Z726PrdPreMed = A726PrdPreMed ;
         Z713PrdFulEnt = A713PrdFulEnt ;
         Z709PrdFecPre = A709PrdFecPre ;
         Z725PrdPreAnt = A725PrdPreAnt ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z698PrdDetPar = A698PrdDetPar ;
         Z718PrdNom = A718PrdNom ;
         Z727PrdRec = A727PrdRec ;
         Z795PrvNum = A795PrvNum ;
         Z856ValCod = A856ValCod ;
         Z661PedFec = A661PedFec ;
         Z666PedPri = A666PedPri ;
         Z667PedSit = A667PedSit ;
         Z659PedCum = A659PedCum ;
         Z663PedFulEnt = A663PedFulEnt ;
         Z657PedCanEnt = A657PedCanEnt ;
         Z669PedUni = A669PedUni ;
         Z665PedPre = A665PedPre ;
         Z660PedDto = A660PedDto ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      edtPrdCanPen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanPen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanPen_Enabled), 5, 0), true);
      AV75Pgmname = "StocksQuimicos.EntradadeProductosAlmacen_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Pgmname", AV75Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      edtPrdCanPen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanPen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanPen_Enabled), 5, 0), true);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A10184EntRemTpo)==0) && ( Gx_BScreen == 0 ) )
      {
         A10184EntRemTpo = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", A10184EntRemTpo);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( Gx_BScreen == 0 ) )
      {
         A415EntFecEnt = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtntrn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
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
         AV47Year = (short)(GXutil.year( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         AV63Fecha = localUtil.ymdtod( AV47Year, 12, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Fecha", localUtil.format(AV63Fecha, "99/99/99"));
         AV48Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         AV37oldEntFecent = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37oldEntFecent", localUtil.format(AV37oldEntFecent, "99/99/99"));
         AV52FecAnt = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         AV49AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         AV50MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         AV72DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV63Fecha),A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72DiasFin), 3, 0));
      }
   }

   public void load1R542( )
   {
      /* Using cursor T01R58 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A704PrdExiAlm = T01R58_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A684PrdCanPen = T01R58_A684PrdCanPen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         A419EntUniRem = T01R58_A419EntUniRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
         A750PrdValStk = T01R58_A750PrdValStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         A417EntPre = T01R58_A417EntPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         A726PrdPreMed = T01R58_A726PrdPreMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A713PrdFulEnt = T01R58_A713PrdFulEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         A709PrdFecPre = T01R58_A709PrdFecPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         A725PrdPreAnt = T01R58_A725PrdPreAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         A724PrdPreAct = T01R58_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A418EntUniEnt = T01R58_A418EntUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         A13235EntLoteID = T01R58_A13235EntLoteID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13235EntLoteID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13235EntLoteID), 12, 0));
         A415EntFecEnt = T01R58_A415EntFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         A11Albaran = T01R58_A11Albaran[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         A12857EntNAlbar = T01R58_A12857EntNAlbar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
         A6156EntPrvNum = T01R58_A6156EntPrvNum[0] ;
         n6156EntPrvNum = T01R58_n6156EntPrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         A5686EntLotN = T01R58_A5686EntLotN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
         A5685EntFVal = T01R58_A5685EntFVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
         A10783EntObs = T01R58_A10783EntObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10783EntObs", A10783EntObs);
         A416EntNumCon = T01R58_A416EntNumCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A416EntNumCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A416EntNumCon), 3, 0));
         A414EntEti = T01R58_A414EntEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A414EntEti", GXutil.str( A414EntEti, 1, 0));
         A411EntCon = T01R58_A411EntCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A411EntCon", GXutil.str( A411EntCon, 1, 0));
         A413EntConIni = T01R58_A413EntConIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A413EntConIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A413EntConIni), 8, 0));
         A412EntConFin = T01R58_A412EntConFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A412EntConFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A412EntConFin), 8, 0));
         A5469EntNro = T01R58_A5469EntNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5469EntNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5469EntNro), 6, 0));
         A10782EntUniAlb = T01R58_A10782EntUniAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10782EntUniAlb", GXutil.ltrimstr( A10782EntUniAlb, 11, 4));
         A3404EntPedCum = T01R58_A3404EntPedCum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
         A5691EntBnc = T01R58_A5691EntBnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5691EntBnc", A5691EntBnc);
         A661PedFec = T01R58_A661PedFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
         A666PedPri = T01R58_A666PedPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", A666PedPri);
         A667PedSit = T01R58_A667PedSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
         A659PedCum = T01R58_A659PedCum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", A659PedCum);
         A663PedFulEnt = T01R58_A663PedFulEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
         A657PedCanEnt = T01R58_A657PedCanEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         A669PedUni = T01R58_A669PedUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
         A665PedPre = T01R58_A665PedPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
         A7695EntCC = T01R58_A7695EntCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7695EntCC", A7695EntCC);
         A7696EntCCoCod = T01R58_A7696EntCCoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7696EntCCoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7696EntCCoCod), 3, 0));
         A10187EntRemNro = T01R58_A10187EntRemNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10187EntRemNro", A10187EntRemNro);
         A10186EntRemFch = T01R58_A10186EntRemFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10186EntRemFch", localUtil.format(A10186EntRemFch, "99/99/99"));
         A10185EntRemSuc = T01R58_A10185EntRemSuc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10185EntRemSuc", A10185EntRemSuc);
         A10184EntRemTpo = T01R58_A10184EntRemTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", A10184EntRemTpo);
         A12716EntFabId = T01R58_A12716EntFabId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
         A13456EntUbicaci = T01R58_A13456EntUbicaci[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13456EntUbicaci", A13456EntUbicaci);
         A660PedDto = T01R58_A660PedDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrimstr( A660PedDto, 5, 2));
         A705PrdExiCC = T01R58_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A698PrdDetPar = T01R58_A698PrdDetPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
         A718PrdNom = T01R58_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A727PrdRec = T01R58_A727PrdRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
         A14035EntNEmb = T01R58_A14035EntNEmb[0] ;
         A658PedCod = T01R58_A658PedCod[0] ;
         n658PedCod = T01R58_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A795PrvNum = T01R58_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A856ValCod = T01R58_A856ValCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         zm1R542( -88) ;
      }
      pr_default.close(6);
      onLoadActions1R542( ) ;
   }

   public void onLoadActions1R542( )
   {
      O724PrdPreAct = A724PrdPreAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O684PrdCanPen = A684PrdCanPen ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      if ( (0==A658PedCod) )
      {
         AV43PedPri = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
      }
      else
      {
         if ( ! (0==A658PedCod) )
         {
            AV43PedPri = A666PedPri ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         }
      }
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrimstr( A13833CantPdte, 12, 2));
      if ( isIns( )  && (0==A658PedCod) )
      {
         A417EntPre = A724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      }
      else
      {
         if ( ! (0==A658PedCod) && isIns( )  )
         {
            A417EntPre = GXutil.roundDecimal( A665PedPre.multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         }
      }
      AV47Year = (short)(GXutil.year( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
      AV63Fecha = localUtil.ymdtod( AV47Year, 12, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Fecha", localUtil.format(AV63Fecha, "99/99/99"));
      AV48Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
      AV37oldEntFecent = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37oldEntFecent", localUtil.format(AV37oldEntFecent, "99/99/99"));
      AV52FecAnt = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
      AV49AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
      AV50MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
      AV72DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV63Fecha),A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72DiasFin), 3, 0));
      if ( true /* After */ && ! (0==A658PedCod) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A418EntUniEnt)==0) && isIns( )  )
      {
         A418EntUniEnt = A13833CantPdte ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
      }
      if ( isDlt( )  && ( ! (0==A658PedCod) ) )
      {
         A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      }
      else
      {
         if ( isUpd( )  && ! ( ! (0==A658PedCod) ) && ( ! (0==A658PedCod) ) )
         {
            A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         }
         else
         {
            if ( isUpd( )  && ( ! (0==A658PedCod) ) && ! ( ! (0==A658PedCod) ) )
            {
               A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ! (0==A658PedCod) ) )
               {
                  A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt).add(O418EntUniEnt) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
               }
               else
               {
                  if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
                  {
                     A684PrdCanPen = DecimalUtil.ZERO ;
                     httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
                     httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
                  }
               }
            }
         }
      }
      AV38OldEntUni = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38OldEntUni", GXutil.ltrimstr( AV38OldEntUni, 9, 2));
      AV46UniOld = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
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
      AV42OldExiAlm = O704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OldExiAlm", GXutil.ltrimstr( AV42OldExiAlm, 12, 4));
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
      if ( isIns( )  && (GXutil.strcmp("", A3404EntPedCum)==0) && ( Gx_BScreen == 0 ) )
      {
         A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
      }
      else
      {
         if ( ( DecimalUtil.compareTo((A657PedCanEnt.add(A418EntUniEnt).subtract(AV38OldEntUni)), A669PedUni) >= 0 ) && ( ! (0==A658PedCod) ) && true /* After */ )
         {
            A3404EntPedCum = httpContext.getMessage( "S", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
         }
         else
         {
            if ( ( DecimalUtil.compareTo((A657PedCanEnt.add(A418EntUniEnt).subtract(AV38OldEntUni)), A669PedUni) < 0 ) && ( ! (0==A658PedCod) && true /* After */ ) )
            {
               A3404EntPedCum = httpContext.getMessage( "N", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
            }
         }
      }
      AV36OldEntPre = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldEntPre", GXutil.ltrimstr( AV36OldEntPre, 14, 5));
      AV51PrecAnt = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
      if ( isIns( )  && true /* Level */ )
      {
         A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV36OldEntPre.multiply(AV38OldEntUni), 2)))) ;
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
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV28Consumos == 0 ) )
            {
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV28Consumos == 0 ) )
               {
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
            }
         }
      }
      AV40OldRemanente = O419EntUniRem ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldRemanente", GXutil.ltrimstr( AV40OldRemanente, 11, 4));
      AV39oldlote = O5686EntLotN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39oldlote", AV39oldlote);
      if ( isIns( )  && (0==A6156EntPrvNum) && ( Gx_BScreen == 0 ) )
      {
         A6156EntPrvNum = A795PrvNum ;
         n6156EntPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         /* Using cursor T01R59 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum)});
         h6156EntPrvNum = "" ;
         while ( (pr_default.getStatus(7) != 101) )
         {
            h6156EntPrvNum = T01R59_A13719PrvNNom[0] ;
            if (true) break;
         }
         pr_default.close(7);
         httpContext.ajax_rsp_assign_attri("", false, "h6156EntPrvNum", h6156EntPrvNum);
      }
      if ( isIns( )  && (0==A12716EntFabId) && ( Gx_BScreen == 0 ) )
      {
         A12716EntFabId = A6156EntPrvNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
      }
      if ( true /* After */ )
      {
         GXt_char1 = AV59PrdNomX ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradadeproductosalmacen_trn_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         AV59PrdNomX = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59PrdNomX", AV59PrdNomX);
      }
      /* Using cursor T01R510 */
      pr_default.execute(8, new Object[] {AV76Emprcod, A719PrdNum});
      h719PrdNum = "" ;
      while ( (pr_default.getStatus(8) != 101) )
      {
         h719PrdNum = T01R510_A13747PrdCDsc[0] ;
         if (true) break;
      }
      pr_default.close(8);
      httpContext.ajax_rsp_assign_attri("", false, "h719PrdNum", h719PrdNum);
      /* Using cursor T01R511 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum)});
      h6156EntPrvNum = "" ;
      while ( (pr_default.getStatus(9) != 101) )
      {
         h6156EntPrvNum = T01R511_A13719PrvNNom[0] ;
         if (true) break;
      }
      pr_default.close(9);
      httpContext.ajax_rsp_assign_attri("", false, "h6156EntPrvNum", h6156EntPrvNum);
   }

   public void checkExtendedTable1R542( )
   {
      nIsDirty_42 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h719PrdNum)==0) )
      {
         nIsDirty_42 = (short)(1) ;
         A719PrdNum = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      else
      {
         A13747PrdCDsc = h719PrdNum ;
         /* Using cursor T01R512 */
         pr_default.execute(10, new Object[] {A13747PrdCDsc, AV76Emprcod});
         A396EmprCod = T01R512_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01R512_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A719PrdNum = T01R512_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         if ( ! ( (pr_default.getStatus(10) == 101) ) )
         {
            pr_default.readNext(10);
            if ( ! ( (pr_default.getStatus(10) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "PRDNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(10);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h719PrdNum", h719PrdNum);
      /* Using cursor T01R56 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A661PedFec = T01R56_A661PedFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      A666PedPri = T01R56_A666PedPri[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", A666PedPri);
      A667PedSit = T01R56_A667PedSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
      pr_default.close(4);
      if ( (0==A658PedCod) )
      {
         AV43PedPri = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
      }
      else
      {
         if ( ! (0==A658PedCod) )
         {
            AV43PedPri = A666PedPri ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         }
      }
      nIsDirty_42 = (short)(1) ;
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      /* Using cursor T01R55 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A704PrdExiAlm = T01R55_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A684PrdCanPen = T01R55_A684PrdCanPen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A750PrdValStk = T01R55_A750PrdValStk[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      A726PrdPreMed = T01R55_A726PrdPreMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      A713PrdFulEnt = T01R55_A713PrdFulEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      A709PrdFecPre = T01R55_A709PrdFecPre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      A725PrdPreAnt = T01R55_A725PrdPreAnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      A724PrdPreAct = T01R55_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A705PrdExiCC = T01R55_A705PrdExiCC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A698PrdDetPar = T01R55_A698PrdDetPar[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
      A718PrdNom = T01R55_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A727PrdRec = T01R55_A727PrdRec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
      A795PrvNum = T01R55_A795PrvNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A856ValCod = T01R55_A856ValCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      nIsDirty_42 = (short)(1) ;
      O724PrdPreAct = A724PrdPreAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      nIsDirty_42 = (short)(1) ;
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      nIsDirty_42 = (short)(1) ;
      O684PrdCanPen = A684PrdCanPen ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      nIsDirty_42 = (short)(1) ;
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      pr_default.close(3);
      if ( GXutil.strcmp(A727PrdRec, "S") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto en recuento", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( A856ValCod == 3 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto SUPRIMIDO", ""), 0, "");
      }
      if ( A856ValCod == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto a SUPRIMIR", ""), 0, "");
      }
      /* Using cursor T01R57 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A719PrdNum)==0) && (GXutil.strcmp("", A13747PrdCDsc)==0) || (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A659PedCum = T01R57_A659PedCum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", A659PedCum);
      A663PedFulEnt = T01R57_A663PedFulEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      A657PedCanEnt = T01R57_A657PedCanEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      A669PedUni = T01R57_A669PedUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
      A665PedPre = T01R57_A665PedPre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
      A660PedDto = T01R57_A660PedDto[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrimstr( A660PedDto, 5, 2));
      pr_default.close(5);
      nIsDirty_42 = (short)(1) ;
      A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrimstr( A13833CantPdte, 12, 2));
      if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ! (0==A658PedCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad entregada superior a la pedida", ""), 0, "PEDCOD");
      }
      if ( isIns( )  && (0==A658PedCod) )
      {
         nIsDirty_42 = (short)(1) ;
         A417EntPre = A724PrdPreAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      }
      else
      {
         if ( ! (0==A658PedCod) && isIns( )  )
         {
            nIsDirty_42 = (short)(1) ;
            A417EntPre = GXutil.roundDecimal( A665PedPre.multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         }
      }
      if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto Compuesto", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV47Year = (short)(GXutil.year( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
      AV63Fecha = localUtil.ymdtod( AV47Year, 12, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Fecha", localUtil.format(AV63Fecha, "99/99/99"));
      AV48Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
      AV37oldEntFecent = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37oldEntFecent", localUtil.format(AV37oldEntFecent, "99/99/99"));
      AV52FecAnt = O415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
      AV49AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
      AV50MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
      AV72DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV63Fecha),A415EntFecEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72DiasFin), 3, 0));
      if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53LastFec)) && GXutil.resetTime(AV53LastFec).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && (0==AV32FlagFecCcs) && ( isIns( )  || isUpd( )  ) )
      {
         httpContext.GX_msglist.addItem(AV62msg_ctrl_fecha, 1, "ENTFECENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53LastFec)) && GXutil.resetTime(AV53LastFec).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( AV32FlagFecCcs == 1 ) && ( isIns( )  || isUpd( )  ) )
      {
         httpContext.GX_msglist.addItem(AV62msg_ctrl_fecha, 0, "ENTFECENT");
      }
      if ( (GXutil.strcmp("", A11Albaran)==0) && true /* After */ && ( AV15tintutex == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Documento Fornecedor", ""), 1, "ALBARAN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbaran_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ! (0==A658PedCod) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A418EntUniEnt)==0) && isIns( )  )
      {
         nIsDirty_42 = (short)(1) ;
         A418EntUniEnt = A13833CantPdte ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
      }
      if ( isDlt( )  && ( ! (0==A658PedCod) ) )
      {
         nIsDirty_42 = (short)(1) ;
         A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      }
      else
      {
         if ( isUpd( )  && ! ( ! (0==A658PedCod) ) && ( ! (0==A658PedCod) ) )
         {
            nIsDirty_42 = (short)(1) ;
            A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         }
         else
         {
            if ( isUpd( )  && ( ! (0==A658PedCod) ) && ! ( ! (0==A658PedCod) ) )
            {
               nIsDirty_42 = (short)(1) ;
               A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ! (0==A658PedCod) ) )
               {
                  nIsDirty_42 = (short)(1) ;
                  A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt).add(O418EntUniEnt) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
               }
               else
               {
                  if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
                  {
                     nIsDirty_42 = (short)(1) ;
                     nIsDirty_42 = (short)(1) ;
                     A684PrdCanPen = DecimalUtil.ZERO ;
                     httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
                     httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
                  }
               }
            }
         }
      }
      if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "¡ATENCION! Cantidad Entregada superior a la Pendiente", ""), 0, "PEDCOD");
      }
      if ( true /* After */ )
      {
         GXt_char1 = AV59PrdNomX ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradadeproductosalmacen_trn_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         AV59PrdNomX = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59PrdNomX", AV59PrdNomX);
      }
      if ( ( GXutil.strcmp(GXutil.trim( AV59PrdNomX), httpContext.getMessage( "Inexistente", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedore Inexistente", ""), 1, "ENTPRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV38OldEntUni = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38OldEntUni", GXutil.ltrimstr( AV38OldEntUni, 9, 2));
      AV46UniOld = O418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
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
      AV42OldExiAlm = O704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OldExiAlm", GXutil.ltrimstr( AV42OldExiAlm, 12, 4));
      if ( DecimalUtil.compareTo(A704PrdExiAlm, DecimalUtil.stringToDec("999999.9998")) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad excesiva en  almacen", ""), 1, "");
         AnyError = (short)(1) ;
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
      if ( isIns( )  && (GXutil.strcmp("", A3404EntPedCum)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
      }
      else
      {
         if ( ( DecimalUtil.compareTo((A657PedCanEnt.add(A418EntUniEnt).subtract(AV38OldEntUni)), A669PedUni) >= 0 ) && ( ! (0==A658PedCod) ) && true /* After */ )
         {
            nIsDirty_42 = (short)(1) ;
            A3404EntPedCum = httpContext.getMessage( "S", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
         }
         else
         {
            if ( ( DecimalUtil.compareTo((A657PedCanEnt.add(A418EntUniEnt).subtract(AV38OldEntUni)), A669PedUni) < 0 ) && ( ! (0==A658PedCod) && true /* After */ ) )
            {
               nIsDirty_42 = (short)(1) ;
               A3404EntPedCum = httpContext.getMessage( "N", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
            }
         }
      }
      AV36OldEntPre = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldEntPre", GXutil.ltrimstr( AV36OldEntPre, 14, 5));
      AV51PrecAnt = O417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
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
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV36OldEntPre.multiply(AV38OldEntUni), 2)))) ;
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
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            nIsDirty_42 = (short)(1) ;
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV28Consumos == 0 ) )
            {
               nIsDirty_42 = (short)(1) ;
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV28Consumos == 0 ) )
               {
                  nIsDirty_42 = (short)(1) ;
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
            }
         }
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && (0==AV29FlagPre) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Precio con valor CERO", ""), 1, "ENTPRE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPre_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && ( AV29FlagPre == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "MENSAJE.Precio con valor CERO", ""), 0, "ENTPRE");
      }
      AV40OldRemanente = O419EntUniRem ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldRemanente", GXutil.ltrimstr( AV40OldRemanente, 11, 4));
      if ( DecimalUtil.compareTo(A419EntUniRem, DecimalUtil.stringToDec("999999.98")) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad Remanente excesiva", ""), 1, "ENTUNIREM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntUniRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV39oldlote = O5686EntLotN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39oldlote", AV39oldlote);
      if ( ( isDlt( )  || isUpd( )  ) && ( GXutil.strcmp(A5686EntLotN, httpContext.getMessage( "Disolucion Producto", "")) == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Producto DILUIDO", ""), 1, "ENTLOTN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntLotN_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A5686EntLotN)==0) && true /* After */ && ( AV15tintutex == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Lote", ""), 1, "ENTLOTN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntLotN_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A3404EntPedCum, "S") == 0 ) || ( GXutil.strcmp(A3404EntPedCum, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cerrar?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ENTPEDCUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPedCum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && (0==A12716EntFabId) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A12716EntFabId = A6156EntPrvNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
      }
      if ( isIns( )  && (0==A6156EntPrvNum) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A6156EntPrvNum = A795PrvNum ;
         n6156EntPrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         /* Using cursor T01R513 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum)});
         h6156EntPrvNum = "" ;
         while ( (pr_default.getStatus(11) != 101) )
         {
            h6156EntPrvNum = T01R513_A13719PrvNNom[0] ;
            if (true) break;
         }
         pr_default.close(11);
         httpContext.ajax_rsp_assign_attri("", false, "h6156EntPrvNum", h6156EntPrvNum);
      }
      if ( (IsModified == 1) && true /* Level */ && ( DecimalUtil.compareTo(O419EntUniRem, O418EntUniEnt) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Remanente ya modificado", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1R542( )
   {
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_90( String A396EmprCod ,
                          int A658PedCod )
   {
      /* Using cursor T01R514 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A661PedFec = T01R514_A661PedFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      A666PedPri = T01R514_A666PedPri[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", A666PedPri);
      A667PedSit = T01R514_A667PedSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A661PedFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A666PedPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A667PedSit))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_89( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01R55 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A704PrdExiAlm = T01R55_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A684PrdCanPen = T01R55_A684PrdCanPen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A750PrdValStk = T01R55_A750PrdValStk[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      A726PrdPreMed = T01R55_A726PrdPreMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      A713PrdFulEnt = T01R55_A713PrdFulEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      A709PrdFecPre = T01R55_A709PrdFecPre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      A725PrdPreAnt = T01R55_A725PrdPreAnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      A724PrdPreAct = T01R55_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A705PrdExiCC = T01R55_A705PrdExiCC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A698PrdDetPar = T01R55_A698PrdDetPar[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
      A718PrdNom = T01R55_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A727PrdRec = T01R55_A727PrdRec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
      A795PrvNum = T01R55_A795PrvNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A856ValCod = T01R55_A856ValCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      O724PrdPreAct = A724PrdPreAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O684PrdCanPen = A684PrdCanPen ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A713PrdFulEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A709PrdFecPre, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A698PrdDetPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A727PrdRec))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void gxload_91( String A396EmprCod ,
                          int A658PedCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01R515 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A719PrdNum)==0) && (GXutil.strcmp("", A13747PrdCDsc)==0) || (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A659PedCum = T01R515_A659PedCum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", A659PedCum);
      A663PedFulEnt = T01R515_A663PedFulEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      A657PedCanEnt = T01R515_A657PedCanEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      A669PedUni = T01R515_A669PedUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
      A665PedPre = T01R515_A665PedPre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
      A660PedDto = T01R515_A660PedDto[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrimstr( A660PedDto, 5, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A659PedCum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A663PedFulEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey1R542( )
   {
      /* Using cursor T01R516 */
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
      /* Using cursor T01R53 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01R53_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1R542( 88) ;
         RcdFound42 = (short)(1) ;
         A597LinEnt = T01R53_A597LinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         A419EntUniRem = T01R53_A419EntUniRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
         A417EntPre = T01R53_A417EntPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         A418EntUniEnt = T01R53_A418EntUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         A13235EntLoteID = T01R53_A13235EntLoteID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13235EntLoteID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13235EntLoteID), 12, 0));
         A415EntFecEnt = T01R53_A415EntFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         A11Albaran = T01R53_A11Albaran[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         A12857EntNAlbar = T01R53_A12857EntNAlbar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
         A6156EntPrvNum = T01R53_A6156EntPrvNum[0] ;
         n6156EntPrvNum = T01R53_n6156EntPrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         A5686EntLotN = T01R53_A5686EntLotN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
         A5685EntFVal = T01R53_A5685EntFVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
         A10783EntObs = T01R53_A10783EntObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10783EntObs", A10783EntObs);
         A416EntNumCon = T01R53_A416EntNumCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A416EntNumCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A416EntNumCon), 3, 0));
         A414EntEti = T01R53_A414EntEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A414EntEti", GXutil.str( A414EntEti, 1, 0));
         A411EntCon = T01R53_A411EntCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A411EntCon", GXutil.str( A411EntCon, 1, 0));
         A413EntConIni = T01R53_A413EntConIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A413EntConIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A413EntConIni), 8, 0));
         A412EntConFin = T01R53_A412EntConFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A412EntConFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A412EntConFin), 8, 0));
         A5469EntNro = T01R53_A5469EntNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5469EntNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5469EntNro), 6, 0));
         A10782EntUniAlb = T01R53_A10782EntUniAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10782EntUniAlb", GXutil.ltrimstr( A10782EntUniAlb, 11, 4));
         A3404EntPedCum = T01R53_A3404EntPedCum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
         A5691EntBnc = T01R53_A5691EntBnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5691EntBnc", A5691EntBnc);
         A7695EntCC = T01R53_A7695EntCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7695EntCC", A7695EntCC);
         A7696EntCCoCod = T01R53_A7696EntCCoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7696EntCCoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7696EntCCoCod), 3, 0));
         A10187EntRemNro = T01R53_A10187EntRemNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10187EntRemNro", A10187EntRemNro);
         A10186EntRemFch = T01R53_A10186EntRemFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10186EntRemFch", localUtil.format(A10186EntRemFch, "99/99/99"));
         A10185EntRemSuc = T01R53_A10185EntRemSuc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10185EntRemSuc", A10185EntRemSuc);
         A10184EntRemTpo = T01R53_A10184EntRemTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", A10184EntRemTpo);
         A12716EntFabId = T01R53_A12716EntFabId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
         A13456EntUbicaci = T01R53_A13456EntUbicaci[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13456EntUbicaci", A13456EntUbicaci);
         A14035EntNEmb = T01R53_A14035EntNEmb[0] ;
         A719PrdNum = T01R53_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A658PedCod = T01R53_A658PedCod[0] ;
         n658PedCod = T01R53_n658PedCod[0] ;
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
         standaloneModal( ) ;
         load1R542( ) ;
         if ( AnyError == 1 )
         {
            RcdFound42 = (short)(0) ;
            initializeNonKey1R542( ) ;
         }
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound42 = (short)(0) ;
         initializeNonKey1R542( ) ;
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
      getKey1R542( ) ;
      if ( RcdFound42 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound42 = (short)(0) ;
      /* Using cursor T01R517 */
      pr_default.execute(15, new Object[] {A719PrdNum, A719PrdNum, Short.valueOf(A597LinEnt), A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01R517_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01R517_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01R517_A597LinEnt[0] < A597LinEnt ) ) && ( GXutil.strcmp(T01R517_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01R517_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01R517_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01R517_A597LinEnt[0] > A597LinEnt ) ) && ( GXutil.strcmp(T01R517_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T01R517_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A597LinEnt = T01R517_A597LinEnt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
            RcdFound42 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound42 = (short)(0) ;
      /* Using cursor T01R518 */
      pr_default.execute(16, new Object[] {A719PrdNum, A719PrdNum, Short.valueOf(A597LinEnt), A396EmprCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01R518_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01R518_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01R518_A597LinEnt[0] > A597LinEnt ) ) && ( GXutil.strcmp(T01R518_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01R518_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01R518_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01R518_A597LinEnt[0] < A597LinEnt ) ) && ( GXutil.strcmp(T01R518_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T01R518_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A597LinEnt = T01R518_A597LinEnt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
            RcdFound42 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1R542( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1R542( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
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
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1R542( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1R542( ) ;
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
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1R542( ) ;
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
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) )
      {
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A597LinEnt = Z597LinEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEntFecEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1R542( ) ;
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEntFecEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1R542( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEntFecEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEntFecEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1R542( ) ;
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound42 != 0 )
         {
            scanNext1R542( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEntFecEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1R542( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1R542( )
   {
      if ( isDlt( ) )
      {
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01R52 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENTALM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z419EntUniRem, T01R52_A419EntUniRem[0]) != 0 ) || ( DecimalUtil.compareTo(Z417EntPre, T01R52_A417EntPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z418EntUniEnt, T01R52_A418EntUniEnt[0]) != 0 ) || ( Z13235EntLoteID != T01R52_A13235EntLoteID[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z415EntFecEnt), GXutil.resetTime(T01R52_A415EntFecEnt[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11Albaran, T01R52_A11Albaran[0]) != 0 ) || ( GXutil.strcmp(Z12857EntNAlbar, T01R52_A12857EntNAlbar[0]) != 0 ) || ( Z6156EntPrvNum != T01R52_A6156EntPrvNum[0] ) || ( GXutil.strcmp(Z5686EntLotN, T01R52_A5686EntLotN[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5685EntFVal), GXutil.resetTime(T01R52_A5685EntFVal[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10783EntObs, T01R52_A10783EntObs[0]) != 0 ) || ( Z416EntNumCon != T01R52_A416EntNumCon[0] ) || ( Z414EntEti != T01R52_A414EntEti[0] ) || ( Z411EntCon != T01R52_A411EntCon[0] ) || ( Z413EntConIni != T01R52_A413EntConIni[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z412EntConFin != T01R52_A412EntConFin[0] ) || ( Z5469EntNro != T01R52_A5469EntNro[0] ) || ( DecimalUtil.compareTo(Z10782EntUniAlb, T01R52_A10782EntUniAlb[0]) != 0 ) || ( GXutil.strcmp(Z3404EntPedCum, T01R52_A3404EntPedCum[0]) != 0 ) || ( GXutil.strcmp(Z5691EntBnc, T01R52_A5691EntBnc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7695EntCC, T01R52_A7695EntCC[0]) != 0 ) || ( Z7696EntCCoCod != T01R52_A7696EntCCoCod[0] ) || ( GXutil.strcmp(Z10187EntRemNro, T01R52_A10187EntRemNro[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z10186EntRemFch), GXutil.resetTime(T01R52_A10186EntRemFch[0])) ) || ( GXutil.strcmp(Z10185EntRemSuc, T01R52_A10185EntRemSuc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10184EntRemTpo, T01R52_A10184EntRemTpo[0]) != 0 ) || ( Z12716EntFabId != T01R52_A12716EntFabId[0] ) || ( GXutil.strcmp(Z13456EntUbicaci, T01R52_A13456EntUbicaci[0]) != 0 ) || ( Z14035EntNEmb != T01R52_A14035EntNEmb[0] ) || ( Z658PedCod != T01R52_A658PedCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z419EntUniRem, T01R52_A419EntUniRem[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntUniRem");
               GXutil.writeLogRaw("Old: ",Z419EntUniRem);
               GXutil.writeLogRaw("Current: ",T01R52_A419EntUniRem[0]);
            }
            if ( DecimalUtil.compareTo(Z417EntPre, T01R52_A417EntPre[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntPre");
               GXutil.writeLogRaw("Old: ",Z417EntPre);
               GXutil.writeLogRaw("Current: ",T01R52_A417EntPre[0]);
            }
            if ( DecimalUtil.compareTo(Z418EntUniEnt, T01R52_A418EntUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntUniEnt");
               GXutil.writeLogRaw("Old: ",Z418EntUniEnt);
               GXutil.writeLogRaw("Current: ",T01R52_A418EntUniEnt[0]);
            }
            if ( Z13235EntLoteID != T01R52_A13235EntLoteID[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntLoteID");
               GXutil.writeLogRaw("Old: ",Z13235EntLoteID);
               GXutil.writeLogRaw("Current: ",T01R52_A13235EntLoteID[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z415EntFecEnt), GXutil.resetTime(T01R52_A415EntFecEnt[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntFecEnt");
               GXutil.writeLogRaw("Old: ",Z415EntFecEnt);
               GXutil.writeLogRaw("Current: ",T01R52_A415EntFecEnt[0]);
            }
            if ( GXutil.strcmp(Z11Albaran, T01R52_A11Albaran[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"Albaran");
               GXutil.writeLogRaw("Old: ",Z11Albaran);
               GXutil.writeLogRaw("Current: ",T01R52_A11Albaran[0]);
            }
            if ( GXutil.strcmp(Z12857EntNAlbar, T01R52_A12857EntNAlbar[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntNAlbar");
               GXutil.writeLogRaw("Old: ",Z12857EntNAlbar);
               GXutil.writeLogRaw("Current: ",T01R52_A12857EntNAlbar[0]);
            }
            if ( Z6156EntPrvNum != T01R52_A6156EntPrvNum[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntPrvNum");
               GXutil.writeLogRaw("Old: ",Z6156EntPrvNum);
               GXutil.writeLogRaw("Current: ",T01R52_A6156EntPrvNum[0]);
            }
            if ( GXutil.strcmp(Z5686EntLotN, T01R52_A5686EntLotN[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntLotN");
               GXutil.writeLogRaw("Old: ",Z5686EntLotN);
               GXutil.writeLogRaw("Current: ",T01R52_A5686EntLotN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5685EntFVal), GXutil.resetTime(T01R52_A5685EntFVal[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntFVal");
               GXutil.writeLogRaw("Old: ",Z5685EntFVal);
               GXutil.writeLogRaw("Current: ",T01R52_A5685EntFVal[0]);
            }
            if ( GXutil.strcmp(Z10783EntObs, T01R52_A10783EntObs[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntObs");
               GXutil.writeLogRaw("Old: ",Z10783EntObs);
               GXutil.writeLogRaw("Current: ",T01R52_A10783EntObs[0]);
            }
            if ( Z416EntNumCon != T01R52_A416EntNumCon[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntNumCon");
               GXutil.writeLogRaw("Old: ",Z416EntNumCon);
               GXutil.writeLogRaw("Current: ",T01R52_A416EntNumCon[0]);
            }
            if ( Z414EntEti != T01R52_A414EntEti[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntEti");
               GXutil.writeLogRaw("Old: ",Z414EntEti);
               GXutil.writeLogRaw("Current: ",T01R52_A414EntEti[0]);
            }
            if ( Z411EntCon != T01R52_A411EntCon[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntCon");
               GXutil.writeLogRaw("Old: ",Z411EntCon);
               GXutil.writeLogRaw("Current: ",T01R52_A411EntCon[0]);
            }
            if ( Z413EntConIni != T01R52_A413EntConIni[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntConIni");
               GXutil.writeLogRaw("Old: ",Z413EntConIni);
               GXutil.writeLogRaw("Current: ",T01R52_A413EntConIni[0]);
            }
            if ( Z412EntConFin != T01R52_A412EntConFin[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntConFin");
               GXutil.writeLogRaw("Old: ",Z412EntConFin);
               GXutil.writeLogRaw("Current: ",T01R52_A412EntConFin[0]);
            }
            if ( Z5469EntNro != T01R52_A5469EntNro[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntNro");
               GXutil.writeLogRaw("Old: ",Z5469EntNro);
               GXutil.writeLogRaw("Current: ",T01R52_A5469EntNro[0]);
            }
            if ( DecimalUtil.compareTo(Z10782EntUniAlb, T01R52_A10782EntUniAlb[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntUniAlb");
               GXutil.writeLogRaw("Old: ",Z10782EntUniAlb);
               GXutil.writeLogRaw("Current: ",T01R52_A10782EntUniAlb[0]);
            }
            if ( GXutil.strcmp(Z3404EntPedCum, T01R52_A3404EntPedCum[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntPedCum");
               GXutil.writeLogRaw("Old: ",Z3404EntPedCum);
               GXutil.writeLogRaw("Current: ",T01R52_A3404EntPedCum[0]);
            }
            if ( GXutil.strcmp(Z5691EntBnc, T01R52_A5691EntBnc[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntBnc");
               GXutil.writeLogRaw("Old: ",Z5691EntBnc);
               GXutil.writeLogRaw("Current: ",T01R52_A5691EntBnc[0]);
            }
            if ( GXutil.strcmp(Z7695EntCC, T01R52_A7695EntCC[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntCC");
               GXutil.writeLogRaw("Old: ",Z7695EntCC);
               GXutil.writeLogRaw("Current: ",T01R52_A7695EntCC[0]);
            }
            if ( Z7696EntCCoCod != T01R52_A7696EntCCoCod[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntCCoCod");
               GXutil.writeLogRaw("Old: ",Z7696EntCCoCod);
               GXutil.writeLogRaw("Current: ",T01R52_A7696EntCCoCod[0]);
            }
            if ( GXutil.strcmp(Z10187EntRemNro, T01R52_A10187EntRemNro[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntRemNro");
               GXutil.writeLogRaw("Old: ",Z10187EntRemNro);
               GXutil.writeLogRaw("Current: ",T01R52_A10187EntRemNro[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10186EntRemFch), GXutil.resetTime(T01R52_A10186EntRemFch[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntRemFch");
               GXutil.writeLogRaw("Old: ",Z10186EntRemFch);
               GXutil.writeLogRaw("Current: ",T01R52_A10186EntRemFch[0]);
            }
            if ( GXutil.strcmp(Z10185EntRemSuc, T01R52_A10185EntRemSuc[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntRemSuc");
               GXutil.writeLogRaw("Old: ",Z10185EntRemSuc);
               GXutil.writeLogRaw("Current: ",T01R52_A10185EntRemSuc[0]);
            }
            if ( GXutil.strcmp(Z10184EntRemTpo, T01R52_A10184EntRemTpo[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntRemTpo");
               GXutil.writeLogRaw("Old: ",Z10184EntRemTpo);
               GXutil.writeLogRaw("Current: ",T01R52_A10184EntRemTpo[0]);
            }
            if ( Z12716EntFabId != T01R52_A12716EntFabId[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntFabId");
               GXutil.writeLogRaw("Old: ",Z12716EntFabId);
               GXutil.writeLogRaw("Current: ",T01R52_A12716EntFabId[0]);
            }
            if ( GXutil.strcmp(Z13456EntUbicaci, T01R52_A13456EntUbicaci[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntUbicaci");
               GXutil.writeLogRaw("Old: ",Z13456EntUbicaci);
               GXutil.writeLogRaw("Current: ",T01R52_A13456EntUbicaci[0]);
            }
            if ( Z14035EntNEmb != T01R52_A14035EntNEmb[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"EntNEmb");
               GXutil.writeLogRaw("Old: ",Z14035EntNEmb);
               GXutil.writeLogRaw("Current: ",T01R52_A14035EntNEmb[0]);
            }
            if ( Z658PedCod != T01R52_A658PedCod[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"PedCod");
               GXutil.writeLogRaw("Old: ",Z658PedCod);
               GXutil.writeLogRaw("Current: ",T01R52_A658PedCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENTALM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01R519 */
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
         if ( false || ( DecimalUtil.compareTo(Z726PrdPreMed, T01R519_A726PrdPreMed[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(T01R519_A713PrdFulEnt[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(T01R519_A709PrdFecPre[0])) ) || ( DecimalUtil.compareTo(Z725PrdPreAnt, T01R519_A725PrdPreAnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z724PrdPreAct, T01R519_A724PrdPreAct[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z705PrdExiCC, T01R519_A705PrdExiCC[0]) != 0 ) || ( GXutil.strcmp(Z698PrdDetPar, T01R519_A698PrdDetPar[0]) != 0 ) || ( GXutil.strcmp(Z718PrdNom, T01R519_A718PrdNom[0]) != 0 ) || ( GXutil.strcmp(Z727PrdRec, T01R519_A727PrdRec[0]) != 0 ) || ( Z795PrvNum != T01R519_A795PrvNum[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z856ValCod != T01R519_A856ValCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z726PrdPreMed, T01R519_A726PrdPreMed[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"PrdPreMed");
               GXutil.writeLogRaw("Old: ",Z726PrdPreMed);
               GXutil.writeLogRaw("Current: ",T01R519_A726PrdPreMed[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(T01R519_A713PrdFulEnt[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"PrdFulEnt");
               GXutil.writeLogRaw("Old: ",Z713PrdFulEnt);
               GXutil.writeLogRaw("Current: ",T01R519_A713PrdFulEnt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(T01R519_A709PrdFecPre[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"PrdFecPre");
               GXutil.writeLogRaw("Old: ",Z709PrdFecPre);
               GXutil.writeLogRaw("Current: ",T01R519_A709PrdFecPre[0]);
            }
            if ( DecimalUtil.compareTo(Z725PrdPreAnt, T01R519_A725PrdPreAnt[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"PrdPreAnt");
               GXutil.writeLogRaw("Old: ",Z725PrdPreAnt);
               GXutil.writeLogRaw("Current: ",T01R519_A725PrdPreAnt[0]);
            }
            if ( DecimalUtil.compareTo(Z724PrdPreAct, T01R519_A724PrdPreAct[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"PrdPreAct");
               GXutil.writeLogRaw("Old: ",Z724PrdPreAct);
               GXutil.writeLogRaw("Current: ",T01R519_A724PrdPreAct[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T01R519_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T01R519_A705PrdExiCC[0]);
            }
            if ( GXutil.strcmp(Z698PrdDetPar, T01R519_A698PrdDetPar[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"PrdDetPar");
               GXutil.writeLogRaw("Old: ",Z698PrdDetPar);
               GXutil.writeLogRaw("Current: ",T01R519_A698PrdDetPar[0]);
            }
            if ( GXutil.strcmp(Z718PrdNom, T01R519_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01R519_A718PrdNom[0]);
            }
            if ( GXutil.strcmp(Z727PrdRec, T01R519_A727PrdRec[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"PrdRec");
               GXutil.writeLogRaw("Old: ",Z727PrdRec);
               GXutil.writeLogRaw("Current: ",T01R519_A727PrdRec[0]);
            }
            if ( Z795PrvNum != T01R519_A795PrvNum[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T01R519_A795PrvNum[0]);
            }
            if ( Z856ValCod != T01R519_A856ValCod[0] )
            {
               GXutil.writeLogln("stocksquimicos.entradadeproductosalmacen_trn:[seudo value changed for attri]"+"ValCod");
               GXutil.writeLogRaw("Old: ",Z856ValCod);
               GXutil.writeLogRaw("Current: ",T01R519_A856ValCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1R542( )
   {
      beforeValidate1R542( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1R542( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1R542( 0) ;
         checkOptimisticConcurrency1R542( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1R542( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1R542( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01R520 */
                  pr_default.execute(18, new Object[] {Short.valueOf(A597LinEnt), A419EntUniRem, A417EntPre, A418EntUniEnt, Long.valueOf(A13235EntLoteID), A415EntFecEnt, A11Albaran, A12857EntNAlbar, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), A5686EntLotN, A5685EntFVal, A10783EntObs, Short.valueOf(A416EntNumCon), Byte.valueOf(A414EntEti), Byte.valueOf(A411EntCon), Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), Integer.valueOf(A5469EntNro), A10782EntUniAlb, A3404EntPedCum, A5691EntBnc, A7695EntCC, Short.valueOf(A7696EntCCoCod), A10187EntRemNro, A10186EntRemFch, A10185EntRemSuc, A10184EntRemTpo, Integer.valueOf(A12716EntFabId), A13456EntUbicaci, Byte.valueOf(A14035EntNEmb), A396EmprCod, A719PrdNum, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  if ( (pr_default.getStatus(18) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11R542( ) ;
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.core.actpedidodesdeentradaproductoalmacen(remoteHandle, context).execute( ) ;
                     }
                     if ( ( AV20NoUpd == 0 ) && ( true /* After */ || true /* After */ ) )
                     {
                        A724PrdPreAct = A417EntPre ;
                        httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
                     }
                     if ( ( true /* After */ || true /* After */ ) && (0==AV20NoUpd) )
                     {
                        A713PrdFulEnt = A415EntFecEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
                     }
                     if ( ( true /* After */ || true /* After */ ) && (0==AV20NoUpd) )
                     {
                        A709PrdFecPre = A415EntFecEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A719PrdNum ;
                        GXv_int8[0] = A6156EntPrvNum ;
                        GXv_decimal9[0] = A417EntPre ;
                        new app.pprenp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_decimal9) ;
                        entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
                        entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char3[0] ;
                        entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
                        entradadeproductosalmacen_trn_impl.this.A417EntPre = GXv_decimal9[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        AV35Inc_obs = Gx_mode + " " + GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( AV37oldEntFecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + "/" + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.str( AV38OldEntUni, 9, 2) + "/" + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV36OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV40OldRemanente, 11, 4)) + "/" + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( AV39oldlote) + "/" + GXutil.trim( A5686EntLotN) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV35Inc_obs", AV35Inc_obs);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV75Pgmname, 1, 10), AV9UsurCod, AV7Station, AV35Inc_obs, 99999999, (byte)(0), " ") ;
                     }
                     if ( ( true /* After */ || true /* After */ ) && (0==AV20NoUpd) )
                     {
                        A725PrdPreAnt = O724PrdPreAct ;
                        httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1R50( ) ;
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
            load1R542( ) ;
         }
         endLevel1R542( ) ;
      }
      closeExtendedTableCursors1R542( ) ;
   }

   public void update1R542( )
   {
      beforeValidate1R542( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1R542( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1R542( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1R542( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1R542( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01R521 */
                  pr_default.execute(19, new Object[] {A419EntUniRem, A417EntPre, A418EntUniEnt, Long.valueOf(A13235EntLoteID), A415EntFecEnt, A11Albaran, A12857EntNAlbar, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), A5686EntLotN, A5685EntFVal, A10783EntObs, Short.valueOf(A416EntNumCon), Byte.valueOf(A414EntEti), Byte.valueOf(A411EntCon), Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), Integer.valueOf(A5469EntNro), A10782EntUniAlb, A3404EntPedCum, A5691EntBnc, A7695EntCC, Short.valueOf(A7696EntCCoCod), A10187EntRemNro, A10186EntRemFch, A10185EntRemSuc, A10184EntRemTpo, Integer.valueOf(A12716EntFabId), A13456EntUbicaci, Byte.valueOf(A14035EntNEmb), Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENTALM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1R542( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11R542( ) ;
                     /* Start of After( update) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.core.actpedidodesdeentradaproductoalmacen(remoteHandle, context).execute( ) ;
                     }
                     if ( ( AV20NoUpd == 0 ) && ( true /* After */ || true /* After */ ) )
                     {
                        A724PrdPreAct = A417EntPre ;
                        httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
                     }
                     if ( ( true /* After */ || true /* After */ ) && (0==AV20NoUpd) )
                     {
                        A713PrdFulEnt = A415EntFecEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
                     }
                     if ( ( true /* After */ || true /* After */ ) && (0==AV20NoUpd) )
                     {
                        A709PrdFecPre = A415EntFecEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A719PrdNum ;
                        GXv_int8[0] = A6156EntPrvNum ;
                        GXv_decimal9[0] = A417EntPre ;
                        new app.pprenp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_decimal9) ;
                        entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
                        entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char3[0] ;
                        entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
                        entradadeproductosalmacen_trn_impl.this.A417EntPre = GXv_decimal9[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        AV35Inc_obs = Gx_mode + " " + GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( AV37oldEntFecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + "/" + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.str( AV38OldEntUni, 9, 2) + "/" + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV36OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV40OldRemanente, 11, 4)) + "/" + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( AV39oldlote) + "/" + GXutil.trim( A5686EntLotN) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV35Inc_obs", AV35Inc_obs);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV75Pgmname, 1, 10), AV9UsurCod, AV7Station, AV35Inc_obs, 99999999, (byte)(0), " ") ;
                     }
                     if ( ( true /* After */ || true /* After */ ) && (0==AV20NoUpd) )
                     {
                        A725PrdPreAnt = O724PrdPreAct ;
                        httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1R50( ) ;
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
         endLevel1R542( ) ;
      }
      closeExtendedTableCursors1R542( ) ;
   }

   public void deferredUpdate1R542( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1R542( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1R542( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1R542( ) ;
         afterConfirm1R542( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1R542( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01R522 */
               pr_default.execute(20, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
               if ( AnyError == 0 )
               {
                  updateTablesN11R542( ) ;
                  /* Start of After( delete) rules */
                  if ( true /* After */ )
                  {
                     new app.core.actpedidodesdeentradaproductoalmacen(remoteHandle, context).execute( ) ;
                  }
                  if ( true /* After */ )
                  {
                     AV35Inc_obs = Gx_mode + " " + GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV36OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV40OldRemanente, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( A5686EntLotN) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV35Inc_obs", AV35Inc_obs);
                  }
                  if ( true /* After */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV75Pgmname, 1, 10), AV9UsurCod, AV7Station, AV35Inc_obs, 99999999, (byte)(0), " ") ;
                  }
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound42 == 0 )
                     {
                        initAll1R542( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                     resetCaption1R50( ) ;
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
      endLevel1R542( ) ;
      Gx_mode = sMode42 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1R542( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53LastFec)) && GXutil.resetTime(AV53LastFec).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && (0==AV32FlagFecCcs) && ( isIns( )  || isUpd( )  ) )
         {
            httpContext.GX_msglist.addItem(AV62msg_ctrl_fecha, 1, "ENTFECENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEntFecEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53LastFec)) && GXutil.resetTime(AV53LastFec).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( AV32FlagFecCcs == 1 ) && ( isIns( )  || isUpd( )  ) )
         {
            httpContext.GX_msglist.addItem(AV62msg_ctrl_fecha, 0, "ENTFECENT");
         }
         if ( ( isDlt( )  || isUpd( )  ) && ( GXutil.strcmp(A5686EntLotN, httpContext.getMessage( "Disolucion Producto", "")) == 0 ) && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Producto DILUIDO", ""), 1, "ENTLOTN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEntLotN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01R523 */
         pr_default.execute(21, new Object[] {A396EmprCod, A719PrdNum});
         Z726PrdPreMed = T01R523_A726PrdPreMed[0] ;
         Z713PrdFulEnt = T01R523_A713PrdFulEnt[0] ;
         Z709PrdFecPre = T01R523_A709PrdFecPre[0] ;
         Z725PrdPreAnt = T01R523_A725PrdPreAnt[0] ;
         Z724PrdPreAct = T01R523_A724PrdPreAct[0] ;
         Z705PrdExiCC = T01R523_A705PrdExiCC[0] ;
         Z698PrdDetPar = T01R523_A698PrdDetPar[0] ;
         Z718PrdNom = T01R523_A718PrdNom[0] ;
         Z727PrdRec = T01R523_A727PrdRec[0] ;
         Z795PrvNum = T01R523_A795PrvNum[0] ;
         Z856ValCod = T01R523_A856ValCod[0] ;
         A704PrdExiAlm = T01R523_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A684PrdCanPen = T01R523_A684PrdCanPen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         A750PrdValStk = T01R523_A750PrdValStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         A726PrdPreMed = T01R523_A726PrdPreMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A713PrdFulEnt = T01R523_A713PrdFulEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         A709PrdFecPre = T01R523_A709PrdFecPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         A725PrdPreAnt = T01R523_A725PrdPreAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         A724PrdPreAct = T01R523_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A705PrdExiCC = T01R523_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A698PrdDetPar = T01R523_A698PrdDetPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
         A718PrdNom = T01R523_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A727PrdRec = T01R523_A727PrdRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
         A795PrvNum = T01R523_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A856ValCod = T01R523_A856ValCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         O750PrdValStk = A750PrdValStk ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         O684PrdCanPen = A684PrdCanPen ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         O704PrdExiAlm = A704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         pr_default.close(21);
         AV47Year = (short)(GXutil.year( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         AV63Fecha = localUtil.ymdtod( AV47Year, 12, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Fecha", localUtil.format(AV63Fecha, "99/99/99"));
         AV48Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         AV37oldEntFecent = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37oldEntFecent", localUtil.format(AV37oldEntFecent, "99/99/99"));
         AV52FecAnt = O415EntFecEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         AV49AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         AV50MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         AV72DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV63Fecha),A415EntFecEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72DiasFin), 3, 0));
         /* Using cursor T01R524 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         A661PedFec = T01R524_A661PedFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
         A666PedPri = T01R524_A666PedPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", A666PedPri);
         A667PedSit = T01R524_A667PedSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
         pr_default.close(22);
         /* Using cursor T01R525 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         A659PedCum = T01R525_A659PedCum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", A659PedCum);
         A663PedFulEnt = T01R525_A663PedFulEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
         A657PedCanEnt = T01R525_A657PedCanEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         A669PedUni = T01R525_A669PedUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
         A665PedPre = T01R525_A665PedPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
         A660PedDto = T01R525_A660PedDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrimstr( A660PedDto, 5, 2));
         pr_default.close(23);
         A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrimstr( A13833CantPdte, 12, 2));
         if ( (0==A658PedCod) )
         {
            AV43PedPri = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         }
         else
         {
            if ( ! (0==A658PedCod) )
            {
               AV43PedPri = A666PedPri ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
            }
         }
         A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
         if ( true /* After */ )
         {
            GXt_char1 = AV59PrdNomX ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int8[0] = A6156EntPrvNum ;
            GXv_char3[0] = GXt_char1 ;
            new app.pctrprv(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
            entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
            entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
            entradadeproductosalmacen_trn_impl.this.GXt_char1 = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
            AV59PrdNomX = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59PrdNomX", AV59PrdNomX);
         }
         AV38OldEntUni = O418EntUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38OldEntUni", GXutil.ltrimstr( AV38OldEntUni, 9, 2));
         AV46UniOld = O418EntUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
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
         AV42OldExiAlm = O704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42OldExiAlm", GXutil.ltrimstr( AV42OldExiAlm, 12, 4));
         if ( isDlt( )  && ( ! (0==A658PedCod) ) )
         {
            A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         }
         else
         {
            if ( isUpd( )  && ! ( ! (0==A658PedCod) ) && ( ! (0==A658PedCod) ) )
            {
               A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
            }
            else
            {
               if ( isUpd( )  && ( ! (0==A658PedCod) ) && ! ( ! (0==A658PedCod) ) )
               {
                  A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
               }
               else
               {
                  if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ! (0==A658PedCod) ) )
                  {
                     A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt).add(O418EntUniEnt) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
                  }
                  else
                  {
                     if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
                     {
                        A684PrdCanPen = DecimalUtil.ZERO ;
                        httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
                        httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
                     }
                  }
               }
            }
         }
         AV36OldEntPre = O417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36OldEntPre", GXutil.ltrimstr( AV36OldEntPre, 14, 5));
         AV51PrecAnt = O417EntPre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         if ( isIns( )  && true /* Level */ )
         {
            A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         }
         else
         {
            if ( isUpd( )  && true /* Level */ )
            {
               A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV36OldEntPre.multiply(AV38OldEntUni), 2)))) ;
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
         if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
         {
            A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
            {
               A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
            }
            else
            {
               if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV28Consumos == 0 ) )
               {
                  A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
               }
               else
               {
                  if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV28Consumos == 0 ) )
                  {
                     A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
                  }
               }
            }
         }
         AV40OldRemanente = O419EntUniRem ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40OldRemanente", GXutil.ltrimstr( AV40OldRemanente, 11, 4));
         AV39oldlote = O5686EntLotN ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39oldlote", AV39oldlote);
      }
   }

   public void updateTablesN11R542( )
   {
      /* Using cursor T01R526 */
      pr_default.execute(24, new Object[] {A704PrdExiAlm, A684PrdCanPen, A750PrdValStk, A726PrdPreMed, A713PrdFulEnt, A709PrdFecPre, A725PrdPreAnt, A724PrdPreAct, A396EmprCod, A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
   }

   public void endLevel1R542( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(17);
      if ( AnyError == 0 )
      {
         beforeComplete1R542( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.entradadeproductosalmacen_trn");
         if ( AnyError == 0 )
         {
            confirmValues1R50( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.entradadeproductosalmacen_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1R542( )
   {
      /* Scan By routine */
      /* Using cursor T01R527 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A719PrdNum = T01R527_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A597LinEnt = T01R527_A597LinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1R542( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A719PrdNum = T01R527_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A597LinEnt = T01R527_A597LinEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
   }

   public void scanEnd1R542( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1R542( )
   {
      /* After Confirm Rules */
      if ( ( AV10ExiLoteID == 1 ) && isIns( )  && true /* After */ && true /* Level */ )
      {
         GXv_int8[0] = (int)(A13235EntLoteID) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IDLOTE", ""), GXv_int8) ;
         entradadeproductosalmacen_trn_impl.this.A13235EntLoteID = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13235EntLoteID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13235EntLoteID), 12, 0));
      }
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int10[0] = A597LinEnt ;
         new app.plinent(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         entradadeproductosalmacen_trn_impl.this.A597LinEnt = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A719PrdNum)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date11[0] = AV53LastFec ;
         new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         entradadeproductosalmacen_trn_impl.this.AV53LastFec = GXv_date11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV53LastFec", localUtil.format(AV53LastFec, "99/99/99"));
      }
      if ( true /* Level */ && isDlt( )  && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int10[0] = A597LinEnt ;
         new app.peliccs(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         entradadeproductosalmacen_trn_impl.this.A597LinEnt = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date11[0] = A415EntFecEnt ;
         GXv_decimal9[0] = A418EntUniEnt ;
         GXv_decimal12[0] = A417EntPre ;
         new app.pacespd(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11, GXv_decimal9, GXv_decimal12) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         entradadeproductosalmacen_trn_impl.this.A415EntFecEnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal9[0] ;
         entradadeproductosalmacen_trn_impl.this.A417EntPre = GXv_decimal12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int10[0] = AV47Year ;
         GXv_int6[0] = AV48Mes ;
         GXv_decimal12[0] = A418EntUniEnt ;
         GXv_decimal9[0] = AV46UniOld ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_int14[0] = AV47Year ;
         GXv_int15[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int17[0] = AV50MesAnt ;
         GXv_decimal18[0] = AV51PrecAnt ;
         GXv_date11[0] = A415EntFecEnt ;
         GXv_date19[0] = AV52FecAnt ;
         GXv_char2[0] = AV43PedPri ;
         GXv_char20[0] = Gx_mode ;
         new app.pprden2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10, GXv_int6, GXv_decimal12, GXv_decimal9, GXv_decimal13, GXv_int14, GXv_int15, GXv_int16, GXv_int17, GXv_decimal18, GXv_date11, GXv_date19, GXv_char2, GXv_char20) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         entradadeproductosalmacen_trn_impl.this.AV47Year = GXv_int10[0] ;
         entradadeproductosalmacen_trn_impl.this.AV48Mes = GXv_int6[0] ;
         entradadeproductosalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_impl.this.AV46UniOld = GXv_decimal9[0] ;
         entradadeproductosalmacen_trn_impl.this.A417EntPre = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_impl.this.AV47Year = GXv_int14[0] ;
         entradadeproductosalmacen_trn_impl.this.AV49AnyAnt = GXv_int15[0] ;
         entradadeproductosalmacen_trn_impl.this.AV48Mes = GXv_int16[0] ;
         entradadeproductosalmacen_trn_impl.this.AV50MesAnt = GXv_int17[0] ;
         entradadeproductosalmacen_trn_impl.this.AV51PrecAnt = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_impl.this.A415EntFecEnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_impl.this.AV52FecAnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_impl.this.AV43PedPri = GXv_char2[0] ;
         entradadeproductosalmacen_trn_impl.this.Gx_mode = GXv_char20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV46UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV52FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV51PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal18[0] = A418EntUniEnt ;
         GXv_decimal13[0] = AV46UniOld ;
         GXv_decimal12[0] = A417EntPre ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal9[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char3[0] = AV43PedPri ;
         GXv_char2[0] = Gx_mode ;
         new app.pprden2(remoteHandle, context).execute( GXv_char20, GXv_char4, GXv_int15, GXv_int17, GXv_decimal18, GXv_decimal13, GXv_decimal12, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal9, GXv_date19, GXv_date11, GXv_char3, GXv_char2) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char20[0] ;
         entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char4[0] ;
         entradadeproductosalmacen_trn_impl.this.AV47Year = GXv_int15[0] ;
         entradadeproductosalmacen_trn_impl.this.AV48Mes = GXv_int17[0] ;
         entradadeproductosalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_impl.this.AV46UniOld = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_impl.this.A417EntPre = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_impl.this.AV47Year = GXv_int14[0] ;
         entradadeproductosalmacen_trn_impl.this.AV49AnyAnt = GXv_int10[0] ;
         entradadeproductosalmacen_trn_impl.this.AV48Mes = GXv_int16[0] ;
         entradadeproductosalmacen_trn_impl.this.AV50MesAnt = GXv_int6[0] ;
         entradadeproductosalmacen_trn_impl.this.AV51PrecAnt = GXv_decimal9[0] ;
         entradadeproductosalmacen_trn_impl.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_impl.this.AV52FecAnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_impl.this.AV43PedPri = GXv_char3[0] ;
         entradadeproductosalmacen_trn_impl.this.Gx_mode = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_int21[0] = A658PedCod ;
         GXv_decimal18[0] = A418EntUniEnt ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_char4[0] = AV43PedPri ;
         new app.pacespr(remoteHandle, context).execute( GXv_char20, GXv_int8, GXv_date19, GXv_int21, GXv_decimal18, GXv_decimal13, GXv_char4) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char20[0] ;
         entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradadeproductosalmacen_trn_impl.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_impl.this.A658PedCod = GXv_int21[0] ;
         entradadeproductosalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_impl.this.A417EntPre = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_impl.this.AV43PedPri = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A6156EntPrvNum ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal18[0] = A418EntUniEnt ;
         GXv_decimal13[0] = AV46UniOld ;
         GXv_decimal12[0] = A417EntPre ;
         GXv_char4[0] = AV43PedPri ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal9[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char3[0] = Gx_mode ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_int15, GXv_int17, GXv_decimal18, GXv_decimal13, GXv_decimal12, GXv_char4, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal9, GXv_date19, GXv_date11, GXv_char3) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char20[0] ;
         entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int21[0] ;
         entradadeproductosalmacen_trn_impl.this.AV47Year = GXv_int15[0] ;
         entradadeproductosalmacen_trn_impl.this.AV48Mes = GXv_int17[0] ;
         entradadeproductosalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_impl.this.AV46UniOld = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_impl.this.A417EntPre = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_impl.this.AV43PedPri = GXv_char4[0] ;
         entradadeproductosalmacen_trn_impl.this.AV47Year = GXv_int14[0] ;
         entradadeproductosalmacen_trn_impl.this.AV49AnyAnt = GXv_int10[0] ;
         entradadeproductosalmacen_trn_impl.this.AV48Mes = GXv_int16[0] ;
         entradadeproductosalmacen_trn_impl.this.AV50MesAnt = GXv_int6[0] ;
         entradadeproductosalmacen_trn_impl.this.AV51PrecAnt = GXv_decimal9[0] ;
         entradadeproductosalmacen_trn_impl.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_impl.this.AV52FecAnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_impl.this.Gx_mode = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV46UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV52FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV51PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A6156EntPrvNum ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal18[0] = A418EntUniEnt ;
         GXv_decimal13[0] = AV46UniOld ;
         GXv_decimal12[0] = A417EntPre ;
         GXv_char4[0] = AV43PedPri ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal9[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char3[0] = Gx_mode ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_int15, GXv_int17, GXv_decimal18, GXv_decimal13, GXv_decimal12, GXv_char4, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal9, GXv_date19, GXv_date11, GXv_char3) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char20[0] ;
         entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int21[0] ;
         entradadeproductosalmacen_trn_impl.this.AV47Year = GXv_int15[0] ;
         entradadeproductosalmacen_trn_impl.this.AV48Mes = GXv_int17[0] ;
         entradadeproductosalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_impl.this.AV46UniOld = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_impl.this.A417EntPre = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_impl.this.AV43PedPri = GXv_char4[0] ;
         entradadeproductosalmacen_trn_impl.this.AV47Year = GXv_int14[0] ;
         entradadeproductosalmacen_trn_impl.this.AV49AnyAnt = GXv_int10[0] ;
         entradadeproductosalmacen_trn_impl.this.AV48Mes = GXv_int16[0] ;
         entradadeproductosalmacen_trn_impl.this.AV50MesAnt = GXv_int6[0] ;
         entradadeproductosalmacen_trn_impl.this.AV51PrecAnt = GXv_decimal9[0] ;
         entradadeproductosalmacen_trn_impl.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_impl.this.AV52FecAnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_impl.this.Gx_mode = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV34FlagCcs == 1 ) && ( AV26Artextil == 0 ) && ( AV22Nalbaran20 == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_decimal18[0] = A418EntUniEnt ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char3[0] = httpContext.getMessage( "EN", "") ;
         GXv_char2[0] = AV43PedPri ;
         GXv_decimal12[0] = A417EntPre ;
         GXv_int21[0] = 0 ;
         GXv_int17[0] = (byte)(0) ;
         GXv_char22[0] = " " ;
         GXv_int8[0] = A658PedCod ;
         GXv_char23[0] = A11Albaran ;
         GXv_char24[0] = AV9UsurCod ;
         GXv_char25[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int15[0] = A597LinEnt ;
         GXv_decimal9[0] = AV46UniOld ;
         GXv_decimal26[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_char28[0] = A5686EntLotN ;
         GXv_char29[0] = A12857EntNAlbar ;
         new app.pccstk20(remoteHandle, context).execute( GXv_char20, GXv_char4, GXv_decimal18, GXv_decimal13, GXv_char3, GXv_char2, GXv_decimal12, GXv_int21, GXv_int17, GXv_char22, GXv_int8, GXv_char23, GXv_char24, GXv_char25, GXv_int15, GXv_decimal9, GXv_decimal26, GXv_date19, GXv_int27, GXv_char28, GXv_char29) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char20[0] ;
         entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char4[0] ;
         entradadeproductosalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_impl.this.AV43PedPri = GXv_char2[0] ;
         entradadeproductosalmacen_trn_impl.this.A417EntPre = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_impl.this.A658PedCod = GXv_int8[0] ;
         entradadeproductosalmacen_trn_impl.this.A11Albaran = GXv_char23[0] ;
         entradadeproductosalmacen_trn_impl.this.AV9UsurCod = GXv_char24[0] ;
         entradadeproductosalmacen_trn_impl.this.A597LinEnt = GXv_int15[0] ;
         entradadeproductosalmacen_trn_impl.this.AV46UniOld = GXv_decimal9[0] ;
         entradadeproductosalmacen_trn_impl.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int27[0] ;
         entradadeproductosalmacen_trn_impl.this.A5686EntLotN = GXv_char28[0] ;
         entradadeproductosalmacen_trn_impl.this.A12857EntNAlbar = GXv_char29[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
         httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
      }
      if ( ! (0==A658PedCod) && true /* After */ )
      {
         AV73PedCum = A3404EntPedCum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73PedCum", AV73PedCum);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_char28[0] = A719PrdNum ;
         GXv_char25[0] = A718PrdNom ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_int21[0] = A658PedCod ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = A417EntPre ;
         GXv_char24[0] = AV43PedPri ;
         new app.pacesprx(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_char28, GXv_char25, GXv_date19, GXv_int21, GXv_decimal26, GXv_decimal18, GXv_char24) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char29[0] ;
         entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int27[0] ;
         entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char28[0] ;
         entradadeproductosalmacen_trn_impl.this.A718PrdNom = GXv_char25[0] ;
         entradadeproductosalmacen_trn_impl.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_impl.this.A658PedCod = GXv_int21[0] ;
         entradadeproductosalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal26[0] ;
         entradadeproductosalmacen_trn_impl.this.A417EntPre = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_impl.this.AV43PedPri = GXv_char24[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_char28[0] = A719PrdNum ;
         GXv_char25[0] = A718PrdNom ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = AV46UniOld ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_char24[0] = AV43PedPri ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal12[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char23[0] = Gx_mode ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_char28, GXv_char25, GXv_int15, GXv_int17, GXv_decimal26, GXv_decimal18, GXv_decimal13, GXv_char24, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal12, GXv_date19, GXv_date11, GXv_char23) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char29[0] ;
         entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int27[0] ;
         entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char28[0] ;
         entradadeproductosalmacen_trn_impl.this.A718PrdNom = GXv_char25[0] ;
         entradadeproductosalmacen_trn_impl.this.AV47Year = GXv_int15[0] ;
         entradadeproductosalmacen_trn_impl.this.AV48Mes = GXv_int17[0] ;
         entradadeproductosalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal26[0] ;
         entradadeproductosalmacen_trn_impl.this.AV46UniOld = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_impl.this.A417EntPre = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_impl.this.AV43PedPri = GXv_char24[0] ;
         entradadeproductosalmacen_trn_impl.this.AV47Year = GXv_int14[0] ;
         entradadeproductosalmacen_trn_impl.this.AV49AnyAnt = GXv_int10[0] ;
         entradadeproductosalmacen_trn_impl.this.AV48Mes = GXv_int16[0] ;
         entradadeproductosalmacen_trn_impl.this.AV50MesAnt = GXv_int6[0] ;
         entradadeproductosalmacen_trn_impl.this.AV51PrecAnt = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_impl.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_impl.this.AV52FecAnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_impl.this.Gx_mode = GXv_char23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV46UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV52FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV51PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_char28[0] = A719PrdNum ;
         GXv_char25[0] = A718PrdNom ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = AV46UniOld ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_char24[0] = AV43PedPri ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal12[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char23[0] = Gx_mode ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_char28, GXv_char25, GXv_int15, GXv_int17, GXv_decimal26, GXv_decimal18, GXv_decimal13, GXv_char24, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal12, GXv_date19, GXv_date11, GXv_char23) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char29[0] ;
         entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int27[0] ;
         entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char28[0] ;
         entradadeproductosalmacen_trn_impl.this.A718PrdNom = GXv_char25[0] ;
         entradadeproductosalmacen_trn_impl.this.AV47Year = GXv_int15[0] ;
         entradadeproductosalmacen_trn_impl.this.AV48Mes = GXv_int17[0] ;
         entradadeproductosalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal26[0] ;
         entradadeproductosalmacen_trn_impl.this.AV46UniOld = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_impl.this.A417EntPre = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_impl.this.AV43PedPri = GXv_char24[0] ;
         entradadeproductosalmacen_trn_impl.this.AV47Year = GXv_int14[0] ;
         entradadeproductosalmacen_trn_impl.this.AV49AnyAnt = GXv_int10[0] ;
         entradadeproductosalmacen_trn_impl.this.AV48Mes = GXv_int16[0] ;
         entradadeproductosalmacen_trn_impl.this.AV50MesAnt = GXv_int6[0] ;
         entradadeproductosalmacen_trn_impl.this.AV51PrecAnt = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_impl.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_impl.this.AV52FecAnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_impl.this.Gx_mode = GXv_char23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV34FlagCcs == 1 ) && ( AV26Artextil == 0 ) && ( AV22Nalbaran20 == 0 ) )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char25[0] = httpContext.getMessage( "EN", "") ;
         GXv_char24[0] = AV43PedPri ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_int27[0] = 0 ;
         GXv_int17[0] = (byte)(0) ;
         GXv_char23[0] = " " ;
         GXv_int21[0] = A658PedCod ;
         GXv_char22[0] = A11Albaran ;
         GXv_char20[0] = AV9UsurCod ;
         GXv_char4[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int15[0] = A597LinEnt ;
         GXv_decimal12[0] = AV46UniOld ;
         GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = A5686EntLotN ;
         new app.pnewcc9(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_decimal26, GXv_decimal18, GXv_char25, GXv_char24, GXv_decimal13, GXv_int27, GXv_int17, GXv_char23, GXv_int21, GXv_char22, GXv_char20, GXv_char4, GXv_int15, GXv_decimal12, GXv_decimal9, GXv_date19, GXv_int8, GXv_char3) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char29[0] ;
         entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char28[0] ;
         entradadeproductosalmacen_trn_impl.this.A418EntUniEnt = GXv_decimal26[0] ;
         entradadeproductosalmacen_trn_impl.this.AV43PedPri = GXv_char24[0] ;
         entradadeproductosalmacen_trn_impl.this.A417EntPre = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_impl.this.A658PedCod = GXv_int21[0] ;
         entradadeproductosalmacen_trn_impl.this.A11Albaran = GXv_char22[0] ;
         entradadeproductosalmacen_trn_impl.this.AV9UsurCod = GXv_char20[0] ;
         entradadeproductosalmacen_trn_impl.this.A597LinEnt = GXv_int15[0] ;
         entradadeproductosalmacen_trn_impl.this.AV46UniOld = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_impl.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int8[0] ;
         entradadeproductosalmacen_trn_impl.this.A5686EntLotN = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_date19[0] = AV53LastFec ;
         new app.pstm005(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_date19) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char29[0] ;
         entradadeproductosalmacen_trn_impl.this.A719PrdNum = GXv_char28[0] ;
         entradadeproductosalmacen_trn_impl.this.AV53LastFec = GXv_date19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV53LastFec", localUtil.format(AV53LastFec, "99/99/99"));
      }
   }

   public void beforeInsert1R542( )
   {
      /* Before Insert Rules */
      if ( true /* Level */ && true /* After */ && GXutil.resetTime(A415EntFecEnt).after( GXutil.resetTime( GXutil.serverDate( context, remoteHandle, pr_default) )) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Fecha Entrada mayor a la Fecha del Dia", ""), 1, "ENTFECENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A6156EntPrvNum) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor Inexistente", ""), 1, "ENTPRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A658PedCod) )
      {
         A658PedCod = 0 ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      }
   }

   public void beforeUpdate1R542( )
   {
      /* Before Update Rules */
      if ( (0==A6156EntPrvNum) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor Inexistente", ""), 1, "ENTPRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPrvNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A658PedCod) )
      {
         A658PedCod = 0 ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      }
   }

   public void beforeDelete1R542( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1R542( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1R542( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1R542( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
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
      edtEntUniRem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniRem_Enabled), 5, 0), true);
      edtPedCanEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCanEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCanEnt_Enabled), 5, 0), true);
      edtPedUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedUni_Enabled), 5, 0), true);
      edtCantPdte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCantPdte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantPdte_Enabled), 5, 0), true);
      edtPedPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPre_Enabled), 5, 0), true);
      edtPedCum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCum_Enabled), 5, 0), true);
      edtPrdCanPen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanPen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanPen_Enabled), 5, 0), true);
      edtEntLotN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntLotN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Enabled), 5, 0), true);
      edtEntFVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntFVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFVal_Enabled), 5, 0), true);
      edtEntObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntObs_Enabled), 5, 0), true);
      edtEntNumCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNumCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNumCon_Enabled), 5, 0), true);
      edtEntEti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntEti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntEti_Enabled), 5, 0), true);
      edtEntCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntCon_Enabled), 5, 0), true);
      edtEntConIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntConIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntConIni_Enabled), 5, 0), true);
      edtEntConFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntConFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntConFin_Enabled), 5, 0), true);
      edtEntNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntNro_Enabled), 5, 0), true);
      edtEntUniAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUniAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniAlb_Enabled), 5, 0), true);
      edtEntBnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntBnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntBnc_Enabled), 5, 0), true);
      edtPedFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFec_Enabled), 5, 0), true);
      edtPedNumLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedNumLin_Enabled), 5, 0), true);
      edtPedSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedSit_Enabled), 5, 0), true);
      edtPedFulEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedFulEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFulEnt_Enabled), 5, 0), true);
      edtEntCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntCC_Enabled), 5, 0), true);
      edtEntCCoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntCCoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntCCoCod_Enabled), 5, 0), true);
      edtEntRemNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntRemNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntRemNro_Enabled), 5, 0), true);
      edtEntRemFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntRemFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntRemFch_Enabled), 5, 0), true);
      edtEntRemSuc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntRemSuc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntRemSuc_Enabled), 5, 0), true);
      edtEntRemTpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntRemTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntRemTpo_Enabled), 5, 0), true);
      edtEntFabId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntFabId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFabId_Enabled), 5, 0), true);
      edtEntLoteID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLoteID_Enabled), 5, 0), true);
      edtEntUbicaci_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntUbicaci_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUbicaci_Enabled), 5, 0), true);
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      edtPrdFulEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFulEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFulEnt_Enabled), 5, 0), true);
      edtPrdFecPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFecPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFecPre_Enabled), 5, 0), true);
      edtPrdPreAnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAnt_Enabled), 5, 0), true);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), true);
      edtPrdValStk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdValStk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdValStk_Enabled), 5, 0), true);
      edtPedDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDto_Enabled), 5, 0), true);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), true);
      edtPrdDetPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDetPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDetPar_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPrdRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRec_Enabled), 5, 0), true);
      edtValCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), true);
      edtPrdPreMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreMed_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPedPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPri_Enabled), 5, 0), true);
      edtEntPedCum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEntPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPedCum_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1R542( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1R50( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.entradadeproductosalmacen_trn", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradadeProductosAlmacen_TRN");
      forbiddenHiddens.add("EntNEmb", localUtil.format( DecimalUtil.doubleToDec(A14035EntNEmb), "Z9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\entradadeproductosalmacen_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z597LinEnt", GXutil.ltrim( localUtil.ntoc( Z597LinEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z419EntUniRem", GXutil.ltrim( localUtil.ntoc( Z419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z417EntPre", GXutil.ltrim( localUtil.ntoc( Z417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z418EntUniEnt", GXutil.ltrim( localUtil.ntoc( Z418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13235EntLoteID", GXutil.ltrim( localUtil.ntoc( Z13235EntLoteID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z415EntFecEnt", localUtil.dtoc( Z415EntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11Albaran", GXutil.rtrim( Z11Albaran));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12857EntNAlbar", GXutil.rtrim( Z12857EntNAlbar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6156EntPrvNum", GXutil.ltrim( localUtil.ntoc( Z6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5686EntLotN", GXutil.rtrim( Z5686EntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5685EntFVal", localUtil.dtoc( Z5685EntFVal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10783EntObs", GXutil.rtrim( Z10783EntObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z416EntNumCon", GXutil.ltrim( localUtil.ntoc( Z416EntNumCon, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z414EntEti", GXutil.ltrim( localUtil.ntoc( Z414EntEti, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z411EntCon", GXutil.ltrim( localUtil.ntoc( Z411EntCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z413EntConIni", GXutil.ltrim( localUtil.ntoc( Z413EntConIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z412EntConFin", GXutil.ltrim( localUtil.ntoc( Z412EntConFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5469EntNro", GXutil.ltrim( localUtil.ntoc( Z5469EntNro, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10782EntUniAlb", GXutil.ltrim( localUtil.ntoc( Z10782EntUniAlb, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3404EntPedCum", GXutil.rtrim( Z3404EntPedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5691EntBnc", GXutil.rtrim( Z5691EntBnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7695EntCC", GXutil.rtrim( Z7695EntCC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7696EntCCoCod", GXutil.ltrim( localUtil.ntoc( Z7696EntCCoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10187EntRemNro", GXutil.rtrim( Z10187EntRemNro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10186EntRemFch", localUtil.dtoc( Z10186EntRemFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10185EntRemSuc", GXutil.rtrim( Z10185EntRemSuc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10184EntRemTpo", GXutil.rtrim( Z10184EntRemTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12716EntFabId", GXutil.ltrim( localUtil.ntoc( Z12716EntFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13456EntUbicaci", GXutil.rtrim( Z13456EntUbicaci));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14035EntNEmb", GXutil.ltrim( localUtil.ntoc( Z14035EntNEmb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z658PedCod", GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z726PrdPreMed", GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z713PrdFulEnt", localUtil.dtoc( Z713PrdFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z709PrdFecPre", localUtil.dtoc( Z709PrdFecPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( Z725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z698PrdDetPar", GXutil.rtrim( Z698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z727PrdRec", GXutil.rtrim( Z727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O724PrdPreAct", GXutil.ltrim( localUtil.ntoc( O724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O750PrdValStk", GXutil.ltrim( localUtil.ntoc( O750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O419EntUniRem", GXutil.ltrim( localUtil.ntoc( O419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O418EntUniEnt", GXutil.ltrim( localUtil.ntoc( O418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O684PrdCanPen", GXutil.ltrim( localUtil.ntoc( O684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( O704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O415EntFecEnt", localUtil.dtoc( O415EntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "O417EntPre", GXutil.ltrim( localUtil.ntoc( O417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5686EntLotN", GXutil.rtrim( O5686EntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV65PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV65PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vYEAR", GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMES", GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDEXIALM", GXutil.ltrim( localUtil.ntoc( AV42OldExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTPRE", GXutil.ltrim( localUtil.ntoc( AV36OldEntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTUNI", GXutil.ltrim( localUtil.ntoc( AV38OldEntUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDREMANENTE", GXutil.ltrim( localUtil.ntoc( AV40OldRemanente, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTFECENT", localUtil.dtoc( AV37oldEntFecent, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDLOTE", GXutil.rtrim( AV39oldlote));
      app.GxWebStd.gx_hidden_field( httpContext, "vUNIOLD", GXutil.ltrim( localUtil.ntoc( AV46UniOld, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECANT", localUtil.dtoc( AV52FecAnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRECANT", GXutil.ltrim( localUtil.ntoc( AV51PrecAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vANYANT", GXutil.ltrim( localUtil.ntoc( AV49AnyAnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMESANT", GXutil.ltrim( localUtil.ntoc( AV50MesAnt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCENTPRVNUM", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNOMX", GXutil.rtrim( AV59PrdNomX));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDPRI", GXutil.rtrim( AV43PedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV28Consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOUPD", GXutil.ltrim( localUtil.ntoc( AV20NoUpd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDCUM", GXutil.rtrim( AV73PedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNUM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHA", localUtil.dtoc( AV63Fecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vLASTFEC", localUtil.dtoc( AV53LastFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_CTRL_FECHA", AV62msg_ctrl_fecha);
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCPRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV35Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vDIASFIN", GXutil.ltrim( localUtil.ntoc( AV72DiasFin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV76Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXILOTEID", GXutil.ltrim( localUtil.ntoc( AV10ExiLoteID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCCS", GXutil.ltrim( localUtil.ntoc( AV34FlagCcs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTEXTIL", GXutil.ltrim( localUtil.ntoc( AV26Artextil, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNALBARAN20", GXutil.ltrim( localUtil.ntoc( AV22Nalbaran20, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV9UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGPRE", GXutil.ltrim( localUtil.ntoc( AV29FlagPre, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGFECCCS", GXutil.ltrim( localUtil.ntoc( AV32FlagFecCcs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINTUTEX", GXutil.ltrim( localUtil.ntoc( AV15tintutex, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV75Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV7Station));
      app.GxWebStd.gx_hidden_field( httpContext, "ENTNEMB", GXutil.ltrim( localUtil.ntoc( A14035EntNEmb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.stocksquimicos.entradadeproductosalmacen_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.EntradadeProductosAlmacen_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada de Productos Almacen", "") ;
   }

   public void initializeNonKey1R542( )
   {
      AV47Year = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
      AV48Mes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
      AV42OldExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OldExiAlm", GXutil.ltrimstr( AV42OldExiAlm, 12, 4));
      AV36OldEntPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldEntPre", GXutil.ltrimstr( AV36OldEntPre, 14, 5));
      AV38OldEntUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38OldEntUni", GXutil.ltrimstr( AV38OldEntUni, 9, 2));
      AV40OldRemanente = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldRemanente", GXutil.ltrimstr( AV40OldRemanente, 11, 4));
      AV37oldEntFecent = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37oldEntFecent", localUtil.format(AV37oldEntFecent, "99/99/99"));
      AV39oldlote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39oldlote", AV39oldlote);
      AV46UniOld = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
      AV52FecAnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
      AV51PrecAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
      AV49AnyAnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
      AV50MesAnt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
      AV59PrdNomX = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59PrdNomX", AV59PrdNomX);
      AV43PedPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
      A704PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A684PrdCanPen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A419EntUniRem = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
      A750PrdValStk = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      A417EntPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      A726PrdPreMed = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      A713PrdFulEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      A709PrdFecPre = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      A725PrdPreAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      AV73PedCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73PedCum", AV73PedCum);
      A418EntUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
      AV53LastFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53LastFec", localUtil.format(AV53LastFec, "99/99/99"));
      A13235EntLoteID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13235EntLoteID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13235EntLoteID), 12, 0));
      A13833CantPdte = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrimstr( A13833CantPdte, 12, 2));
      A664PedNumLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      AV62msg_ctrl_fecha = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62msg_ctrl_fecha", AV62msg_ctrl_fecha);
      A11Albaran = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
      A12857EntNAlbar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", A12857EntNAlbar);
      A658PedCod = 0 ;
      n658PedCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      A5686EntLotN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
      A5685EntFVal = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
      A10783EntObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10783EntObs", A10783EntObs);
      A416EntNumCon = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A416EntNumCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A416EntNumCon), 3, 0));
      A414EntEti = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A414EntEti", GXutil.str( A414EntEti, 1, 0));
      A411EntCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A411EntCon", GXutil.str( A411EntCon, 1, 0));
      A413EntConIni = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A413EntConIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A413EntConIni), 8, 0));
      A412EntConFin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A412EntConFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A412EntConFin), 8, 0));
      A5469EntNro = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5469EntNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5469EntNro), 6, 0));
      A10782EntUniAlb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10782EntUniAlb", GXutil.ltrimstr( A10782EntUniAlb, 11, 4));
      A5691EntBnc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5691EntBnc", A5691EntBnc);
      A661PedFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      A666PedPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", A666PedPri);
      A667PedSit = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
      A659PedCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", A659PedCum);
      A663PedFulEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      A657PedCanEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      A669PedUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
      A665PedPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
      A7695EntCC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7695EntCC", A7695EntCC);
      A7696EntCCoCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7696EntCCoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7696EntCCoCod), 3, 0));
      A10187EntRemNro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10187EntRemNro", A10187EntRemNro);
      A10186EntRemFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A10186EntRemFch", localUtil.format(A10186EntRemFch, "99/99/99"));
      A10185EntRemSuc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10185EntRemSuc", A10185EntRemSuc);
      A13456EntUbicaci = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13456EntUbicaci", A13456EntUbicaci);
      A795PrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A13719PrvNNom = "" ;
      h6156EntPrvNum = A13719PrvNNom ;
      httpContext.ajax_rsp_assign_attri("", false, "h6156EntPrvNum", h6156EntPrvNum);
      A660PedDto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrimstr( A660PedDto, 5, 2));
      A705PrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A698PrdDetPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A727PrdRec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A14035EntNEmb = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14035EntNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14035EntNEmb), 2, 0));
      AV63Fecha = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Fecha", localUtil.format(AV63Fecha, "99/99/99"));
      AV35Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Inc_obs", AV35Inc_obs);
      AV72DiasFin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72DiasFin), 3, 0));
      A415EntFecEnt = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
      h6156EntPrvNum = "" ;
      A3404EntPedCum = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", A3404EntPedCum);
      A10184EntRemTpo = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", A10184EntRemTpo);
      A12716EntFabId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12716EntFabId), 6, 0));
      O724PrdPreAct = A724PrdPreAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      O750PrdValStk = A750PrdValStk ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      O419EntUniRem = A419EntUniRem ;
      httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrimstr( A419EntUniRem, 11, 4));
      O418EntUniEnt = A418EntUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
      O684PrdCanPen = A684PrdCanPen ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      O704PrdExiAlm = A704PrdExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      O415EntFecEnt = A415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
      O417EntPre = A417EntPre ;
      httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
      O5686EntLotN = A5686EntLotN ;
      httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", A5686EntLotN);
      Z419EntUniRem = DecimalUtil.ZERO ;
      Z417EntPre = DecimalUtil.ZERO ;
      Z418EntUniEnt = DecimalUtil.ZERO ;
      Z13235EntLoteID = 0 ;
      Z415EntFecEnt = GXutil.nullDate() ;
      Z11Albaran = "" ;
      Z12857EntNAlbar = "" ;
      Z6156EntPrvNum = 0 ;
      Z5686EntLotN = "" ;
      Z5685EntFVal = GXutil.nullDate() ;
      Z10783EntObs = "" ;
      Z416EntNumCon = (short)(0) ;
      Z414EntEti = (byte)(0) ;
      Z411EntCon = (byte)(0) ;
      Z413EntConIni = 0 ;
      Z412EntConFin = 0 ;
      Z5469EntNro = 0 ;
      Z10782EntUniAlb = DecimalUtil.ZERO ;
      Z3404EntPedCum = "" ;
      Z5691EntBnc = "" ;
      Z7695EntCC = "" ;
      Z7696EntCCoCod = (short)(0) ;
      Z10187EntRemNro = "" ;
      Z10186EntRemFch = GXutil.nullDate() ;
      Z10185EntRemSuc = "" ;
      Z10184EntRemTpo = "" ;
      Z12716EntFabId = 0 ;
      Z13456EntUbicaci = "" ;
      Z14035EntNEmb = (byte)(0) ;
      Z658PedCod = 0 ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z698PrdDetPar = "" ;
      Z718PrdNom = "" ;
      Z727PrdRec = "" ;
      Z795PrvNum = 0 ;
      Z856ValCod = (byte)(0) ;
   }

   public void initAll1R542( )
   {
      h719PrdNum = "" ;
      A597LinEnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
      initializeNonKey1R542( ) ;
   }

   public void standaloneModalInsert( )
   {
      A10184EntRemTpo = i10184EntRemTpo ;
      httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", A10184EntRemTpo);
      A415EntFecEnt = i415EntFecEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211691977", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/entradadeproductosalmacen_trn.js", "?20268211691977", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtPrdNum_Internalname = "PRDNUM" ;
      edtLinEnt_Internalname = "LINENT" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtEntFecEnt_Internalname = "ENTFECENT" ;
      edtAlbaran_Internalname = "ALBARAN" ;
      divAlbaran_cell_Internalname = "ALBARAN_CELL" ;
      edtEntNAlbar_Internalname = "ENTNALBAR" ;
      divEntnalbar_cell_Internalname = "ENTNALBAR_CELL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTextblockpedcod_Internalname = "TEXTBLOCKPEDCOD" ;
      edtPedCod_Internalname = "PEDCOD" ;
      divUnnamedtablepedcod_Internalname = "UNNAMEDTABLEPEDCOD" ;
      imgLpedidprompt_Internalname = "LPEDIDPROMPT" ;
      tblUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtEntPrvNum_Internalname = "ENTPRVNUM" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtEntUniEnt_Internalname = "ENTUNIENT" ;
      edtEntPre_Internalname = "ENTPRE" ;
      edtEntUniRem_Internalname = "ENTUNIREM" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtPedCanEnt_Internalname = "PEDCANENT" ;
      edtPedUni_Internalname = "PEDUNI" ;
      edtCantPdte_Internalname = "CANTPDTE" ;
      edtPedPre_Internalname = "PEDPRE" ;
      edtPedCum_Internalname = "PEDCUM" ;
      edtPrdCanPen_Internalname = "PRDCANPEN" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtEntLotN_Internalname = "ENTLOTN" ;
      edtEntFVal_Internalname = "ENTFVAL" ;
      edtEntObs_Internalname = "ENTOBS" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEntNumCon_Internalname = "ENTNUMCON" ;
      edtEntEti_Internalname = "ENTETI" ;
      edtEntCon_Internalname = "ENTCON" ;
      edtEntConIni_Internalname = "ENTCONINI" ;
      edtEntConFin_Internalname = "ENTCONFIN" ;
      edtEntNro_Internalname = "ENTNRO" ;
      edtEntUniAlb_Internalname = "ENTUNIALB" ;
      edtEntBnc_Internalname = "ENTBNC" ;
      edtPedFec_Internalname = "PEDFEC" ;
      edtPedNumLin_Internalname = "PEDNUMLIN" ;
      edtPedSit_Internalname = "PEDSIT" ;
      edtPedFulEnt_Internalname = "PEDFULENT" ;
      edtEntCC_Internalname = "ENTCC" ;
      edtEntCCoCod_Internalname = "ENTCCOCOD" ;
      edtEntRemNro_Internalname = "ENTREMNRO" ;
      edtEntRemFch_Internalname = "ENTREMFCH" ;
      edtEntRemSuc_Internalname = "ENTREMSUC" ;
      edtEntRemTpo_Internalname = "ENTREMTPO" ;
      edtEntFabId_Internalname = "ENTFABID" ;
      edtEntLoteID_Internalname = "ENTLOTEID" ;
      edtEntUbicaci_Internalname = "ENTUBICACI" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdFulEnt_Internalname = "PRDFULENT" ;
      edtPrdFecPre_Internalname = "PRDFECPRE" ;
      edtPrdPreAnt_Internalname = "PRDPREANT" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtPrdValStk_Internalname = "PRDVALSTK" ;
      edtPedDto_Internalname = "PEDDTO" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      edtPrdDetPar_Internalname = "PRDDETPAR" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdRec_Internalname = "PRDREC" ;
      edtValCod_Internalname = "VALCOD" ;
      edtPrdPreMed_Internalname = "PRDPREMED" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtPedPri_Internalname = "PEDPRI" ;
      edtEntPedCum_Internalname = "ENTPEDCUM" ;
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
      Form.setCaption( httpContext.getMessage( "Entrada de Productos Almacen", "") );
      edtEntPedCum_Jsonclick = "" ;
      edtEntPedCum_Enabled = 1 ;
      edtPedPri_Jsonclick = "" ;
      edtPedPri_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtPrdPreMed_Jsonclick = "" ;
      edtPrdPreMed_Enabled = 0 ;
      edtValCod_Jsonclick = "" ;
      edtValCod_Enabled = 0 ;
      edtPrdRec_Jsonclick = "" ;
      edtPrdRec_Enabled = 0 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      edtPrdDetPar_Jsonclick = "" ;
      edtPrdDetPar_Enabled = 0 ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiCC_Enabled = 0 ;
      edtPedDto_Jsonclick = "" ;
      edtPedDto_Enabled = 0 ;
      edtPrdValStk_Jsonclick = "" ;
      edtPrdValStk_Enabled = 0 ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdPreAct_Enabled = 0 ;
      edtPrdPreAnt_Jsonclick = "" ;
      edtPrdPreAnt_Enabled = 0 ;
      edtPrdFecPre_Jsonclick = "" ;
      edtPrdFecPre_Enabled = 0 ;
      edtPrdFulEnt_Jsonclick = "" ;
      edtPrdFulEnt_Enabled = 0 ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdExiAlm_Enabled = 0 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Enabled = 0 ;
      edtEntUbicaci_Jsonclick = "" ;
      edtEntUbicaci_Enabled = 1 ;
      edtEntLoteID_Jsonclick = "" ;
      edtEntLoteID_Enabled = 1 ;
      edtEntFabId_Jsonclick = "" ;
      edtEntFabId_Enabled = 1 ;
      edtEntRemTpo_Jsonclick = "" ;
      edtEntRemTpo_Enabled = 1 ;
      edtEntRemSuc_Jsonclick = "" ;
      edtEntRemSuc_Enabled = 1 ;
      edtEntRemFch_Jsonclick = "" ;
      edtEntRemFch_Enabled = 1 ;
      edtEntRemNro_Jsonclick = "" ;
      edtEntRemNro_Enabled = 1 ;
      edtEntCCoCod_Jsonclick = "" ;
      edtEntCCoCod_Enabled = 1 ;
      edtEntCC_Jsonclick = "" ;
      edtEntCC_Enabled = 1 ;
      edtPedFulEnt_Jsonclick = "" ;
      edtPedFulEnt_Enabled = 0 ;
      edtPedSit_Jsonclick = "" ;
      edtPedSit_Enabled = 0 ;
      edtPedNumLin_Jsonclick = "" ;
      edtPedNumLin_Enabled = 0 ;
      edtPedFec_Jsonclick = "" ;
      edtPedFec_Enabled = 0 ;
      edtEntBnc_Jsonclick = "" ;
      edtEntBnc_Enabled = 1 ;
      edtEntUniAlb_Jsonclick = "" ;
      edtEntUniAlb_Enabled = 1 ;
      edtEntNro_Jsonclick = "" ;
      edtEntNro_Enabled = 1 ;
      edtEntConFin_Jsonclick = "" ;
      edtEntConFin_Enabled = 1 ;
      edtEntConIni_Jsonclick = "" ;
      edtEntConIni_Enabled = 1 ;
      edtEntCon_Jsonclick = "" ;
      edtEntCon_Enabled = 1 ;
      edtEntEti_Jsonclick = "" ;
      edtEntEti_Enabled = 1 ;
      edtEntNumCon_Jsonclick = "" ;
      edtEntNumCon_Enabled = 1 ;
      bttBtntrn_delete_Enabled = 1 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtEntObs_Jsonclick = "" ;
      edtEntObs_Enabled = 1 ;
      edtEntFVal_Jsonclick = "" ;
      edtEntFVal_Enabled = 1 ;
      edtEntLotN_Jsonclick = "" ;
      edtEntLotN_Enabled = 1 ;
      edtPrdCanPen_Jsonclick = "" ;
      edtPrdCanPen_Enabled = 0 ;
      edtPedCum_Jsonclick = "" ;
      edtPedCum_Enabled = 0 ;
      edtPedPre_Jsonclick = "" ;
      edtPedPre_Enabled = 0 ;
      edtCantPdte_Jsonclick = "" ;
      edtCantPdte_Enabled = 0 ;
      edtPedUni_Jsonclick = "" ;
      edtPedUni_Enabled = 0 ;
      edtPedCanEnt_Jsonclick = "" ;
      edtPedCanEnt_Enabled = 0 ;
      edtEntUniRem_Jsonclick = "" ;
      edtEntUniRem_Enabled = 1 ;
      edtEntPre_Jsonclick = "" ;
      edtEntPre_Enabled = 1 ;
      edtEntUniEnt_Jsonclick = "" ;
      edtEntUniEnt_Enabled = 1 ;
      edtEntPrvNum_Jsonclick = "" ;
      edtEntPrvNum_Enabled = 1 ;
      imgLpedidprompt_Visible = 1 ;
      edtPedCod_Jsonclick = "" ;
      edtPedCod_Enabled = 1 ;
      edtEntNAlbar_Jsonclick = "" ;
      edtEntNAlbar_Enabled = 1 ;
      edtAlbaran_Jsonclick = "" ;
      edtAlbaran_Enabled = 1 ;
      edtEntFecEnt_Jsonclick = "" ;
      edtEntFecEnt_Enabled = 1 ;
      edtLinEnt_Jsonclick = "" ;
      edtLinEnt_Enabled = 1 ;
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

   public void gxsgaprdnum1R50( String AV76Emprcod ,
                                String A13747PrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaprdnum_data1R50( AV76Emprcod, A13747PrdCDsc) ;
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

   protected void gxsgaprdnum_data1R50( String AV76Emprcod ,
                                        String A13747PrdCDsc )
   {
      l13747PrdCDsc = GXutil.concat( GXutil.rtrim( A13747PrdCDsc), "%", "") ;
      /* Using cursor T01R528 */
      pr_default.execute(26, new Object[] {l13747PrdCDsc, AV76Emprcod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(26) != 101) )
      {
         gxdynajaxctrlcodr.add(T01R528_A13747PrdCDsc[0]);
         gxdynajaxctrldescr.add(T01R528_A13747PrdCDsc[0]);
         pr_default.readNext(26);
      }
      pr_default.close(26);
   }

   public void gxsgaentprvnum1R50( String A396EmprCod ,
                                   String A13719PrvNNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaentprvnum_data1R50( A396EmprCod, A13719PrvNNom) ;
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

   protected void gxsgaentprvnum_data1R50( String A396EmprCod ,
                                           String A13719PrvNNom )
   {
      l13719PrvNNom = GXutil.concat( GXutil.rtrim( A13719PrvNNom), "%", "") ;
      /* Using cursor T01R529 */
      pr_default.execute(27, new Object[] {A396EmprCod, l13719PrvNNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(27) != 101) )
      {
         gxdynajaxctrlcodr.add(T01R529_A13719PrvNNom[0]);
         gxdynajaxctrldescr.add(T01R529_A13719PrvNNom[0]);
         pr_default.readNext(27);
      }
      pr_default.close(27);
   }

   public void gxhcaprdnum1R542( String AV76Emprcod ,
                                 String A13747PrdCDsc )
   {
      /* Using cursor T01R530 */
      pr_default.execute(28, new Object[] {A13747PrdCDsc, AV76Emprcod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(28) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13747PrdCDsc = T01R530_A13747PrdCDsc[0] ;
         A396EmprCod = T01R530_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01R530_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         pr_default.readNext(28);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\"") ;
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
      pr_default.close(28);
   }

   public void gxhcaentprvnum1R542( String A396EmprCod ,
                                    String A13719PrvNNom )
   {
      /* Using cursor T01R531 */
      pr_default.execute(29, new Object[] {A13719PrvNNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(29) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13719PrvNNom = T01R531_A13719PrvNNom[0] ;
         A396EmprCod = T01R531_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = T01R531_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         pr_default.readNext(29);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(29);
   }

   public void gx16asaprdnomx1R542( String A396EmprCod ,
                                    int A6156EntPrvNum )
   {
      if ( true /* After */ )
      {
         GXt_char1 = AV59PrdNomX ;
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_char28[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_char28) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char29[0] ;
         entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int27[0] ;
         entradadeproductosalmacen_trn_impl.this.GXt_char1 = GXv_char28[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         AV59PrdNomX = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59PrdNomX", AV59PrdNomX);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV59PrdNomX))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx43asapednumlin1R542( String A396EmprCod ,
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

   public void xc_48_1R542( )
   {
      if ( true /* After */ || true /* After */ )
      {
         new app.core.actpedidodesdeentradaproductoalmacen(remoteHandle, context).execute( ) ;
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

   public void xc_49_1R542( )
   {
      if ( true /* After */ )
      {
         new app.core.actpedidodesdeentradaproductoalmacen(remoteHandle, context).execute( ) ;
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

   public void xc_50_1R542( String Gx_mode ,
                            String A396EmprCod ,
                            String A719PrdNum ,
                            short A597LinEnt )
   {
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_int15[0] = A597LinEnt ;
         new app.plinent(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_int15) ;
         A396EmprCod = GXv_char29[0] ;
         A719PrdNum = GXv_char28[0] ;
         A597LinEnt = GXv_int15[0] ;
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

   public void xc_51_1R542( String A396EmprCod ,
                            String A719PrdNum ,
                            java.util.Date AV53LastFec )
   {
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A719PrdNum)==0) )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_date19[0] = AV53LastFec ;
         new app.pstm005(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_date19) ;
         A396EmprCod = GXv_char29[0] ;
         A719PrdNum = GXv_char28[0] ;
         AV53LastFec = GXv_date19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV53LastFec", localUtil.format(AV53LastFec, "99/99/99"));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV53LastFec, "99/99/99"))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_52_1R542( String A396EmprCod ,
                            String A719PrdNum ,
                            java.util.Date AV53LastFec )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_date19[0] = AV53LastFec ;
         new app.pstm005(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_date19) ;
         A396EmprCod = GXv_char29[0] ;
         A719PrdNum = GXv_char28[0] ;
         AV53LastFec = GXv_date19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV53LastFec", localUtil.format(AV53LastFec, "99/99/99"));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV53LastFec, "99/99/99"))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_53_1R542( String A396EmprCod ,
                            String A719PrdNum ,
                            int A6156EntPrvNum ,
                            java.math.BigDecimal A417EntPre )
   {
      if ( true /* After */ || true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_decimal26[0] = A417EntPre ;
         new app.pprenp(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_int27, GXv_decimal26) ;
         A396EmprCod = GXv_char29[0] ;
         A719PrdNum = GXv_char28[0] ;
         A6156EntPrvNum = GXv_int27[0] ;
         A417EntPre = GXv_decimal26[0] ;
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

   public void xc_54_1R542( )
   {
      if ( ( AV10ExiLoteID == 1 ) && isIns( )  && true /* After */ && true /* Level */ )
      {
         GXv_int27[0] = (int)(A13235EntLoteID) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IDLOTE", ""), GXv_int27) ;
         A13235EntLoteID = GXv_int27[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13235EntLoteID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13235EntLoteID), 12, 0));
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

   public void xc_55_1R542( String Gx_mode ,
                            String A396EmprCod ,
                            String A719PrdNum ,
                            short A597LinEnt )
   {
      if ( true /* Level */ && isDlt( )  && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_int15[0] = A597LinEnt ;
         new app.peliccs(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_int15) ;
         A396EmprCod = GXv_char29[0] ;
         A719PrdNum = GXv_char28[0] ;
         A597LinEnt = GXv_int15[0] ;
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

   public void xc_56_1R542( String Gx_mode ,
                            String A396EmprCod ,
                            int A6156EntPrvNum ,
                            java.util.Date A415EntFecEnt ,
                            int A658PedCod ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal A417EntPre ,
                            String AV43PedPri ,
                            short A597LinEnt )
   {
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_int21[0] = A658PedCod ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = A417EntPre ;
         GXv_char28[0] = AV43PedPri ;
         new app.pacespr(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_date19, GXv_int21, GXv_decimal26, GXv_decimal18, GXv_char28) ;
         A396EmprCod = GXv_char29[0] ;
         A6156EntPrvNum = GXv_int27[0] ;
         A415EntFecEnt = GXv_date19[0] ;
         A658PedCod = GXv_int21[0] ;
         A418EntUniEnt = GXv_decimal26[0] ;
         A417EntPre = GXv_decimal18[0] ;
         AV43PedPri = GXv_char28[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV43PedPri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_57_1R542( String Gx_mode ,
                            String A396EmprCod ,
                            int A6156EntPrvNum ,
                            String A719PrdNum ,
                            String A718PrdNom ,
                            java.util.Date A415EntFecEnt ,
                            int A658PedCod ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal A417EntPre ,
                            String AV43PedPri ,
                            short A597LinEnt )
   {
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_char28[0] = A719PrdNum ;
         GXv_char25[0] = A718PrdNom ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_int21[0] = A658PedCod ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = A417EntPre ;
         GXv_char24[0] = AV43PedPri ;
         new app.pacesprx(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_char28, GXv_char25, GXv_date19, GXv_int21, GXv_decimal26, GXv_decimal18, GXv_char24) ;
         A396EmprCod = GXv_char29[0] ;
         A6156EntPrvNum = GXv_int27[0] ;
         A719PrdNum = GXv_char28[0] ;
         A718PrdNom = GXv_char25[0] ;
         A415EntFecEnt = GXv_date19[0] ;
         A658PedCod = GXv_int21[0] ;
         A418EntUniEnt = GXv_decimal26[0] ;
         A417EntPre = GXv_decimal18[0] ;
         AV43PedPri = GXv_char24[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV43PedPri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_58_1R542( String Gx_mode ,
                            String A396EmprCod ,
                            String A719PrdNum ,
                            java.util.Date A415EntFecEnt ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal A417EntPre ,
                            short A597LinEnt )
   {
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = A417EntPre ;
         new app.pacespd(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_date19, GXv_decimal26, GXv_decimal18) ;
         A396EmprCod = GXv_char29[0] ;
         A719PrdNum = GXv_char28[0] ;
         A415EntFecEnt = GXv_date19[0] ;
         A418EntUniEnt = GXv_decimal26[0] ;
         A417EntPre = GXv_decimal18[0] ;
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

   public void xc_59_1R542( String Gx_mode ,
                            String A396EmprCod ,
                            int A6156EntPrvNum ,
                            short AV47Year ,
                            byte AV48Mes ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal AV46UniOld ,
                            java.math.BigDecimal A417EntPre ,
                            String AV43PedPri ,
                            short AV49AnyAnt ,
                            byte AV50MesAnt ,
                            java.math.BigDecimal AV51PrecAnt ,
                            java.util.Date A415EntFecEnt ,
                            java.util.Date AV52FecAnt )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = AV46UniOld ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_char28[0] = AV43PedPri ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal12[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char25[0] = Gx_mode ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_int15, GXv_int17, GXv_decimal26, GXv_decimal18, GXv_decimal13, GXv_char28, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal12, GXv_date19, GXv_date11, GXv_char25) ;
         A396EmprCod = GXv_char29[0] ;
         A6156EntPrvNum = GXv_int27[0] ;
         AV47Year = GXv_int15[0] ;
         AV48Mes = GXv_int17[0] ;
         A418EntUniEnt = GXv_decimal26[0] ;
         AV46UniOld = GXv_decimal18[0] ;
         A417EntPre = GXv_decimal13[0] ;
         AV43PedPri = GXv_char28[0] ;
         AV47Year = GXv_int14[0] ;
         AV49AnyAnt = GXv_int10[0] ;
         AV48Mes = GXv_int16[0] ;
         AV50MesAnt = GXv_int6[0] ;
         AV51PrecAnt = GXv_decimal12[0] ;
         A415EntFecEnt = GXv_date19[0] ;
         AV52FecAnt = GXv_date11[0] ;
         Gx_mode = GXv_char25[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV46UniOld, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV43PedPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV49AnyAnt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV50MesAnt, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV51PrecAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV52FecAnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_mode))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_60_1R542( String Gx_mode ,
                            String A396EmprCod ,
                            int A6156EntPrvNum ,
                            short AV47Year ,
                            byte AV48Mes ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal AV46UniOld ,
                            java.math.BigDecimal A417EntPre ,
                            String AV43PedPri ,
                            short AV49AnyAnt ,
                            byte AV50MesAnt ,
                            java.math.BigDecimal AV51PrecAnt ,
                            java.util.Date A415EntFecEnt ,
                            java.util.Date AV52FecAnt )
   {
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV46UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV52FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV51PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = AV46UniOld ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_char28[0] = AV43PedPri ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal12[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char25[0] = Gx_mode ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_int15, GXv_int17, GXv_decimal26, GXv_decimal18, GXv_decimal13, GXv_char28, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal12, GXv_date19, GXv_date11, GXv_char25) ;
         A396EmprCod = GXv_char29[0] ;
         A6156EntPrvNum = GXv_int27[0] ;
         AV47Year = GXv_int15[0] ;
         AV48Mes = GXv_int17[0] ;
         A418EntUniEnt = GXv_decimal26[0] ;
         AV46UniOld = GXv_decimal18[0] ;
         A417EntPre = GXv_decimal13[0] ;
         AV43PedPri = GXv_char28[0] ;
         AV47Year = GXv_int14[0] ;
         AV49AnyAnt = GXv_int10[0] ;
         AV48Mes = GXv_int16[0] ;
         AV50MesAnt = GXv_int6[0] ;
         AV51PrecAnt = GXv_decimal12[0] ;
         A415EntFecEnt = GXv_date19[0] ;
         AV52FecAnt = GXv_date11[0] ;
         Gx_mode = GXv_char25[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV46UniOld, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV43PedPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV49AnyAnt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV50MesAnt, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV51PrecAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV52FecAnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_mode))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_61_1R542( String Gx_mode ,
                            String A396EmprCod ,
                            int A6156EntPrvNum ,
                            String A719PrdNum ,
                            String A718PrdNom ,
                            short AV47Year ,
                            byte AV48Mes ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal AV46UniOld ,
                            java.math.BigDecimal A417EntPre ,
                            String AV43PedPri ,
                            short AV49AnyAnt ,
                            byte AV50MesAnt ,
                            java.math.BigDecimal AV51PrecAnt ,
                            java.util.Date A415EntFecEnt ,
                            java.util.Date AV52FecAnt )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_char28[0] = A719PrdNum ;
         GXv_char25[0] = A718PrdNom ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = AV46UniOld ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_char24[0] = AV43PedPri ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal12[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char23[0] = Gx_mode ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_char28, GXv_char25, GXv_int15, GXv_int17, GXv_decimal26, GXv_decimal18, GXv_decimal13, GXv_char24, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal12, GXv_date19, GXv_date11, GXv_char23) ;
         A396EmprCod = GXv_char29[0] ;
         A6156EntPrvNum = GXv_int27[0] ;
         A719PrdNum = GXv_char28[0] ;
         A718PrdNom = GXv_char25[0] ;
         AV47Year = GXv_int15[0] ;
         AV48Mes = GXv_int17[0] ;
         A418EntUniEnt = GXv_decimal26[0] ;
         AV46UniOld = GXv_decimal18[0] ;
         A417EntPre = GXv_decimal13[0] ;
         AV43PedPri = GXv_char24[0] ;
         AV47Year = GXv_int14[0] ;
         AV49AnyAnt = GXv_int10[0] ;
         AV48Mes = GXv_int16[0] ;
         AV50MesAnt = GXv_int6[0] ;
         AV51PrecAnt = GXv_decimal12[0] ;
         A415EntFecEnt = GXv_date19[0] ;
         AV52FecAnt = GXv_date11[0] ;
         Gx_mode = GXv_char23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV46UniOld, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV43PedPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV49AnyAnt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV50MesAnt, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV51PrecAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV52FecAnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_mode))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_62_1R542( String Gx_mode ,
                            String A396EmprCod ,
                            int A6156EntPrvNum ,
                            String A719PrdNum ,
                            String A718PrdNom ,
                            short AV47Year ,
                            byte AV48Mes ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal AV46UniOld ,
                            java.math.BigDecimal A417EntPre ,
                            String AV43PedPri ,
                            short AV49AnyAnt ,
                            byte AV50MesAnt ,
                            java.math.BigDecimal AV51PrecAnt ,
                            java.util.Date A415EntFecEnt ,
                            java.util.Date AV52FecAnt )
   {
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV46UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV52FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV51PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_char28[0] = A719PrdNum ;
         GXv_char25[0] = A718PrdNom ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = AV46UniOld ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_char24[0] = AV43PedPri ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal12[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char23[0] = Gx_mode ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_char28, GXv_char25, GXv_int15, GXv_int17, GXv_decimal26, GXv_decimal18, GXv_decimal13, GXv_char24, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal12, GXv_date19, GXv_date11, GXv_char23) ;
         A396EmprCod = GXv_char29[0] ;
         A6156EntPrvNum = GXv_int27[0] ;
         A719PrdNum = GXv_char28[0] ;
         A718PrdNom = GXv_char25[0] ;
         AV47Year = GXv_int15[0] ;
         AV48Mes = GXv_int17[0] ;
         A418EntUniEnt = GXv_decimal26[0] ;
         AV46UniOld = GXv_decimal18[0] ;
         A417EntPre = GXv_decimal13[0] ;
         AV43PedPri = GXv_char24[0] ;
         AV47Year = GXv_int14[0] ;
         AV49AnyAnt = GXv_int10[0] ;
         AV48Mes = GXv_int16[0] ;
         AV50MesAnt = GXv_int6[0] ;
         AV51PrecAnt = GXv_decimal12[0] ;
         A415EntFecEnt = GXv_date19[0] ;
         AV52FecAnt = GXv_date11[0] ;
         Gx_mode = GXv_char23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6156EntPrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV46UniOld, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV43PedPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV49AnyAnt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV50MesAnt, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV51PrecAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV52FecAnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_mode))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_63_1R542( String Gx_mode ,
                            String A396EmprCod ,
                            String A719PrdNum ,
                            short AV47Year ,
                            byte AV48Mes ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal AV46UniOld ,
                            java.math.BigDecimal A417EntPre ,
                            short AV49AnyAnt ,
                            byte AV50MesAnt ,
                            java.math.BigDecimal AV51PrecAnt ,
                            java.util.Date A415EntFecEnt ,
                            java.util.Date AV52FecAnt ,
                            String AV43PedPri )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = AV46UniOld ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal12[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char25[0] = AV43PedPri ;
         GXv_char24[0] = Gx_mode ;
         new app.pprden2(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_int15, GXv_int17, GXv_decimal26, GXv_decimal18, GXv_decimal13, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal12, GXv_date19, GXv_date11, GXv_char25, GXv_char24) ;
         A396EmprCod = GXv_char29[0] ;
         A719PrdNum = GXv_char28[0] ;
         AV47Year = GXv_int15[0] ;
         AV48Mes = GXv_int17[0] ;
         A418EntUniEnt = GXv_decimal26[0] ;
         AV46UniOld = GXv_decimal18[0] ;
         A417EntPre = GXv_decimal13[0] ;
         AV47Year = GXv_int14[0] ;
         AV49AnyAnt = GXv_int10[0] ;
         AV48Mes = GXv_int16[0] ;
         AV50MesAnt = GXv_int6[0] ;
         AV51PrecAnt = GXv_decimal12[0] ;
         A415EntFecEnt = GXv_date19[0] ;
         AV52FecAnt = GXv_date11[0] ;
         AV43PedPri = GXv_char25[0] ;
         Gx_mode = GXv_char24[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV46UniOld, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV49AnyAnt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV50MesAnt, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV51PrecAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV52FecAnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV43PedPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_mode))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_64_1R542( String Gx_mode ,
                            String A396EmprCod ,
                            String A719PrdNum ,
                            short AV47Year ,
                            byte AV48Mes ,
                            java.math.BigDecimal A418EntUniEnt ,
                            java.math.BigDecimal AV46UniOld ,
                            java.math.BigDecimal A417EntPre ,
                            short AV49AnyAnt ,
                            byte AV50MesAnt ,
                            java.math.BigDecimal AV51PrecAnt ,
                            java.util.Date A415EntFecEnt ,
                            java.util.Date AV52FecAnt ,
                            String AV43PedPri )
   {
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV46UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV52FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV51PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = AV46UniOld ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal12[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char25[0] = AV43PedPri ;
         GXv_char24[0] = Gx_mode ;
         new app.pprden2(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_int15, GXv_int17, GXv_decimal26, GXv_decimal18, GXv_decimal13, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal12, GXv_date19, GXv_date11, GXv_char25, GXv_char24) ;
         A396EmprCod = GXv_char29[0] ;
         A719PrdNum = GXv_char28[0] ;
         AV47Year = GXv_int15[0] ;
         AV48Mes = GXv_int17[0] ;
         A418EntUniEnt = GXv_decimal26[0] ;
         AV46UniOld = GXv_decimal18[0] ;
         A417EntPre = GXv_decimal13[0] ;
         AV47Year = GXv_int14[0] ;
         AV49AnyAnt = GXv_int10[0] ;
         AV48Mes = GXv_int16[0] ;
         AV50MesAnt = GXv_int6[0] ;
         AV51PrecAnt = GXv_decimal12[0] ;
         A415EntFecEnt = GXv_date19[0] ;
         AV52FecAnt = GXv_date11[0] ;
         AV43PedPri = GXv_char25[0] ;
         Gx_mode = GXv_char24[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrimstr( AV51PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV46UniOld, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV49AnyAnt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV50MesAnt, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV51PrecAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A415EntFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV52FecAnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV43PedPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_mode))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_65_1R542( )
   {
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV34FlagCcs == 1 ) && ( AV26Artextil == 0 ) && ( AV22Nalbaran20 == 1 ) )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char25[0] = httpContext.getMessage( "EN", "") ;
         GXv_char24[0] = AV43PedPri ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_int27[0] = 0 ;
         GXv_int17[0] = (byte)(0) ;
         GXv_char23[0] = " " ;
         GXv_int21[0] = A658PedCod ;
         GXv_char22[0] = A11Albaran ;
         GXv_char20[0] = AV9UsurCod ;
         GXv_char4[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int15[0] = A597LinEnt ;
         GXv_decimal12[0] = AV46UniOld ;
         GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = A5686EntLotN ;
         GXv_char2[0] = A12857EntNAlbar ;
         new app.pccstk20(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_decimal26, GXv_decimal18, GXv_char25, GXv_char24, GXv_decimal13, GXv_int27, GXv_int17, GXv_char23, GXv_int21, GXv_char22, GXv_char20, GXv_char4, GXv_int15, GXv_decimal12, GXv_decimal9, GXv_date19, GXv_int8, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char29[0] ;
         A719PrdNum = GXv_char28[0] ;
         A418EntUniEnt = GXv_decimal26[0] ;
         AV43PedPri = GXv_char24[0] ;
         A417EntPre = GXv_decimal13[0] ;
         A658PedCod = GXv_int21[0] ;
         A11Albaran = GXv_char22[0] ;
         AV9UsurCod = GXv_char20[0] ;
         A597LinEnt = GXv_int15[0] ;
         AV46UniOld = GXv_decimal12[0] ;
         A415EntFecEnt = GXv_date19[0] ;
         A6156EntPrvNum = GXv_int8[0] ;
         A5686EntLotN = GXv_char3[0] ;
         A12857EntNAlbar = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
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

   public void xc_66_1R542( )
   {
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV34FlagCcs == 1 ) && ( AV26Artextil == 0 ) && ( AV22Nalbaran20 == 0 ) )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char25[0] = httpContext.getMessage( "EN", "") ;
         GXv_char24[0] = AV43PedPri ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_int27[0] = 0 ;
         GXv_int17[0] = (byte)(0) ;
         GXv_char23[0] = " " ;
         GXv_int21[0] = A658PedCod ;
         GXv_char22[0] = A11Albaran ;
         GXv_char20[0] = AV9UsurCod ;
         GXv_char4[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int15[0] = A597LinEnt ;
         GXv_decimal12[0] = AV46UniOld ;
         GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = A5686EntLotN ;
         new app.pnewcc9(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_decimal26, GXv_decimal18, GXv_char25, GXv_char24, GXv_decimal13, GXv_int27, GXv_int17, GXv_char23, GXv_int21, GXv_char22, GXv_char20, GXv_char4, GXv_int15, GXv_decimal12, GXv_decimal9, GXv_date19, GXv_int8, GXv_char3) ;
         A396EmprCod = GXv_char29[0] ;
         A719PrdNum = GXv_char28[0] ;
         A418EntUniEnt = GXv_decimal26[0] ;
         AV43PedPri = GXv_char24[0] ;
         A417EntPre = GXv_decimal13[0] ;
         A658PedCod = GXv_int21[0] ;
         A11Albaran = GXv_char22[0] ;
         AV9UsurCod = GXv_char20[0] ;
         A597LinEnt = GXv_int15[0] ;
         AV46UniOld = GXv_decimal12[0] ;
         A415EntFecEnt = GXv_date19[0] ;
         A6156EntPrvNum = GXv_int8[0] ;
         A5686EntLotN = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrimstr( A418EntUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", AV43PedPri);
         httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrimstr( A417EntPre, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", A11Albaran);
         httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "A597LinEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A597LinEnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrimstr( AV46UniOld, 9, 2));
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

   public void xc_86_1R542( )
   {
      if ( true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV75Pgmname, 1, 10), AV9UsurCod, AV7Station, AV35Inc_obs, 99999999, (byte)(0), " ") ;
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

   public void xc_87_1R542( )
   {
      if ( true /* After */ || true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV75Pgmname, 1, 10), AV9UsurCod, AV7Station, AV35Inc_obs, 99999999, (byte)(0), " ") ;
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

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01R532 */
      pr_default.execute(30, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A704PrdExiAlm = T01R532_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A684PrdCanPen = T01R532_A684PrdCanPen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A750PrdValStk = T01R532_A750PrdValStk[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      A726PrdPreMed = T01R532_A726PrdPreMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      A713PrdFulEnt = T01R532_A713PrdFulEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      A709PrdFecPre = T01R532_A709PrdFecPre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      A725PrdPreAnt = T01R532_A725PrdPreAnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      A724PrdPreAct = T01R532_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A705PrdExiCC = T01R532_A705PrdExiCC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A698PrdDetPar = T01R532_A698PrdDetPar[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
      A718PrdNom = T01R532_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A727PrdRec = T01R532_A727PrdRec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
      A795PrvNum = T01R532_A795PrvNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A856ValCod = T01R532_A856ValCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      pr_default.close(30);
      GX_FocusControl = edtEntFecEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
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
      n6156EntPrvNum = false ;
      /* Using cursor T01R533 */
      pr_default.execute(31, new Object[] {A396EmprCod, A719PrdNum});
      Z726PrdPreMed = T01R533_A726PrdPreMed[0] ;
      Z713PrdFulEnt = T01R533_A713PrdFulEnt[0] ;
      Z709PrdFecPre = T01R533_A709PrdFecPre[0] ;
      Z725PrdPreAnt = T01R533_A725PrdPreAnt[0] ;
      Z724PrdPreAct = T01R533_A724PrdPreAct[0] ;
      Z705PrdExiCC = T01R533_A705PrdExiCC[0] ;
      Z698PrdDetPar = T01R533_A698PrdDetPar[0] ;
      Z718PrdNom = T01R533_A718PrdNom[0] ;
      Z727PrdRec = T01R533_A727PrdRec[0] ;
      Z795PrvNum = T01R533_A795PrvNum[0] ;
      Z856ValCod = T01R533_A856ValCod[0] ;
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A704PrdExiAlm = T01R533_A704PrdExiAlm[0] ;
      A684PrdCanPen = T01R533_A684PrdCanPen[0] ;
      A750PrdValStk = T01R533_A750PrdValStk[0] ;
      A726PrdPreMed = T01R533_A726PrdPreMed[0] ;
      A713PrdFulEnt = T01R533_A713PrdFulEnt[0] ;
      A709PrdFecPre = T01R533_A709PrdFecPre[0] ;
      A725PrdPreAnt = T01R533_A725PrdPreAnt[0] ;
      A724PrdPreAct = T01R533_A724PrdPreAct[0] ;
      A705PrdExiCC = T01R533_A705PrdExiCC[0] ;
      A698PrdDetPar = T01R533_A698PrdDetPar[0] ;
      A718PrdNom = T01R533_A718PrdNom[0] ;
      A727PrdRec = T01R533_A727PrdRec[0] ;
      A795PrvNum = T01R533_A795PrvNum[0] ;
      A856ValCod = T01R533_A856ValCod[0] ;
      O724PrdPreAct = A724PrdPreAct ;
      O750PrdValStk = A750PrdValStk ;
      O684PrdCanPen = A684PrdCanPen ;
      O704PrdExiAlm = A704PrdExiAlm ;
      pr_default.close(31);
      if ( GXutil.strcmp(A727PrdRec, "S") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto en recuento", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      if ( isIns( )  && (0==A6156EntPrvNum) && ( Gx_BScreen == 0 ) )
      {
         A6156EntPrvNum = A795PrvNum ;
         n6156EntPrvNum = false ;
         /* Using cursor T01R534 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum)});
         h6156EntPrvNum = "" ;
         while ( (pr_default.getStatus(32) != 101) )
         {
            h6156EntPrvNum = T01R534_A13719PrvNNom[0] ;
            if (true) break;
         }
         pr_default.close(32);
         httpContext.ajax_rsp_assign_attri("", false, "h6156EntPrvNum", h6156EntPrvNum);
      }
      if ( A856ValCod == 3 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto SUPRIMIDO", ""), 0, "");
      }
      if ( A856ValCod == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto a SUPRIMIR", ""), 0, "");
      }
      if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto Compuesto", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( O704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O684PrdCanPen", GXutil.ltrim( localUtil.ntoc( O684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O750PrdValStk", GXutil.ltrim( localUtil.ntoc( O750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O724PrdPreAct", GXutil.ltrim( localUtil.ntoc( O724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", GXutil.rtrim( A698PrdDetPar));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", GXutil.rtrim( A727PrdRec));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h6156EntPrvNum", h6156EntPrvNum);
   }

   public void valid_Emprcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13235EntLoteID", GXutil.ltrim( localUtil.ntoc( A13235EntLoteID, (byte)(12), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A415EntFecEnt", localUtil.format(A415EntFecEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11Albaran", GXutil.rtrim( A11Albaran));
      httpContext.ajax_rsp_assign_attri("", false, "A12857EntNAlbar", GXutil.rtrim( A12857EntNAlbar));
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5686EntLotN", GXutil.rtrim( A5686EntLotN));
      httpContext.ajax_rsp_assign_attri("", false, "A5685EntFVal", localUtil.format(A5685EntFVal, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10783EntObs", GXutil.rtrim( A10783EntObs));
      httpContext.ajax_rsp_assign_attri("", false, "A416EntNumCon", GXutil.ltrim( localUtil.ntoc( A416EntNumCon, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A414EntEti", GXutil.ltrim( localUtil.ntoc( A414EntEti, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A411EntCon", GXutil.ltrim( localUtil.ntoc( A411EntCon, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A413EntConIni", GXutil.ltrim( localUtil.ntoc( A413EntConIni, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A412EntConFin", GXutil.ltrim( localUtil.ntoc( A412EntConFin, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5469EntNro", GXutil.ltrim( localUtil.ntoc( A5469EntNro, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10782EntUniAlb", GXutil.ltrim( localUtil.ntoc( A10782EntUniAlb, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5691EntBnc", GXutil.rtrim( A5691EntBnc));
      httpContext.ajax_rsp_assign_attri("", false, "A7695EntCC", GXutil.rtrim( A7695EntCC));
      httpContext.ajax_rsp_assign_attri("", false, "A7696EntCCoCod", GXutil.ltrim( localUtil.ntoc( A7696EntCCoCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10187EntRemNro", GXutil.rtrim( A10187EntRemNro));
      httpContext.ajax_rsp_assign_attri("", false, "A10186EntRemFch", localUtil.format(A10186EntRemFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10185EntRemSuc", GXutil.rtrim( A10185EntRemSuc));
      httpContext.ajax_rsp_assign_attri("", false, "A10184EntRemTpo", GXutil.rtrim( A10184EntRemTpo));
      httpContext.ajax_rsp_assign_attri("", false, "A13456EntUbicaci", GXutil.rtrim( A13456EntUbicaci));
      httpContext.ajax_rsp_assign_attri("", false, "A14035EntNEmb", GXutil.ltrim( localUtil.ntoc( A14035EntNEmb, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", GXutil.rtrim( A666PedPri));
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", GXutil.rtrim( A667PedSit));
      httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", GXutil.rtrim( AV43PedPri));
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", GXutil.rtrim( A698PrdDetPar));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", GXutil.rtrim( A727PrdRec));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", GXutil.rtrim( A659PedCum));
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrim( localUtil.ntoc( A13833CantPdte, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV63Fecha", localUtil.format(AV63Fecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV37oldEntFecent", localUtil.format(AV37oldEntFecent, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrim( localUtil.ntoc( AV49AnyAnt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrim( localUtil.ntoc( AV50MesAnt, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV72DiasFin", GXutil.ltrim( localUtil.ntoc( AV72DiasFin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV38OldEntUni", GXutil.ltrim( localUtil.ntoc( AV38OldEntUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrim( localUtil.ntoc( AV46UniOld, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV42OldExiAlm", GXutil.ltrim( localUtil.ntoc( AV42OldExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", GXutil.rtrim( A3404EntPedCum));
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldEntPre", GXutil.ltrim( localUtil.ntoc( AV36OldEntPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrim( localUtil.ntoc( AV51PrecAnt, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldRemanente", GXutil.ltrim( localUtil.ntoc( AV40OldRemanente, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV39oldlote", GXutil.rtrim( AV39oldlote));
      httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrim( localUtil.ntoc( A12716EntFabId, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV59PrdNomX", GXutil.rtrim( AV59PrdNomX));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z597LinEnt", GXutil.ltrim( localUtil.ntoc( Z597LinEnt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13235EntLoteID", GXutil.ltrim( localUtil.ntoc( Z13235EntLoteID, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z415EntFecEnt", localUtil.format(Z415EntFecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11Albaran", GXutil.rtrim( Z11Albaran));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12857EntNAlbar", GXutil.rtrim( Z12857EntNAlbar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z658PedCod", GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5686EntLotN", GXutil.rtrim( Z5686EntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5685EntFVal", localUtil.format(Z5685EntFVal, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10783EntObs", GXutil.rtrim( Z10783EntObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z416EntNumCon", GXutil.ltrim( localUtil.ntoc( Z416EntNumCon, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z414EntEti", GXutil.ltrim( localUtil.ntoc( Z414EntEti, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z411EntCon", GXutil.ltrim( localUtil.ntoc( Z411EntCon, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z413EntConIni", GXutil.ltrim( localUtil.ntoc( Z413EntConIni, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z412EntConFin", GXutil.ltrim( localUtil.ntoc( Z412EntConFin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5469EntNro", GXutil.ltrim( localUtil.ntoc( Z5469EntNro, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10782EntUniAlb", GXutil.ltrim( localUtil.ntoc( Z10782EntUniAlb, (byte)(11), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5691EntBnc", GXutil.rtrim( Z5691EntBnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7695EntCC", GXutil.rtrim( Z7695EntCC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7696EntCCoCod", GXutil.ltrim( localUtil.ntoc( Z7696EntCCoCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10187EntRemNro", GXutil.rtrim( Z10187EntRemNro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10186EntRemFch", localUtil.format(Z10186EntRemFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10185EntRemSuc", GXutil.rtrim( Z10185EntRemSuc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10184EntRemTpo", GXutil.rtrim( Z10184EntRemTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13456EntUbicaci", GXutil.rtrim( Z13456EntUbicaci));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14035EntNEmb", GXutil.ltrim( localUtil.ntoc( Z14035EntNEmb, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z661PedFec", localUtil.format(Z661PedFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z666PedPri", GXutil.rtrim( Z666PedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z667PedSit", GXutil.rtrim( Z667PedSit));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV43PedPri", GXutil.rtrim( ZV43PedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z664PedNumLin", GXutil.ltrim( localUtil.ntoc( Z664PedNumLin, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z684PrdCanPen", GXutil.ltrim( localUtil.ntoc( Z684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z750PrdValStk", GXutil.ltrim( localUtil.ntoc( Z750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z726PrdPreMed", GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z713PrdFulEnt", localUtil.format(Z713PrdFulEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z709PrdFecPre", localUtil.format(Z709PrdFecPre, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( Z725PrdPreAnt, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z698PrdDetPar", GXutil.rtrim( Z698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z727PrdRec", GXutil.rtrim( Z727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z659PedCum", GXutil.rtrim( Z659PedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z663PedFulEnt", localUtil.format(Z663PedFulEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z657PedCanEnt", GXutil.ltrim( localUtil.ntoc( Z657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z669PedUni", GXutil.ltrim( localUtil.ntoc( Z669PedUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z665PedPre", GXutil.ltrim( localUtil.ntoc( Z665PedPre, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z660PedDto", GXutil.ltrim( localUtil.ntoc( Z660PedDto, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13833CantPdte", GXutil.ltrim( localUtil.ntoc( Z13833CantPdte, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z417EntPre", GXutil.ltrim( localUtil.ntoc( Z417EntPre, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV47Year", GXutil.ltrim( localUtil.ntoc( ZV47Year, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV63Fecha", localUtil.format(ZV63Fecha, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV48Mes", GXutil.ltrim( localUtil.ntoc( ZV48Mes, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV37oldEntFecent", localUtil.format(ZV37oldEntFecent, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV52FecAnt", localUtil.format(ZV52FecAnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV49AnyAnt", GXutil.ltrim( localUtil.ntoc( ZV49AnyAnt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV50MesAnt", GXutil.ltrim( localUtil.ntoc( ZV50MesAnt, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV72DiasFin", GXutil.ltrim( localUtil.ntoc( ZV72DiasFin, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z418EntUniEnt", GXutil.ltrim( localUtil.ntoc( Z418EntUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV38OldEntUni", GXutil.ltrim( localUtil.ntoc( ZV38OldEntUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV46UniOld", GXutil.ltrim( localUtil.ntoc( ZV46UniOld, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV42OldExiAlm", GXutil.ltrim( localUtil.ntoc( ZV42OldExiAlm, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z419EntUniRem", GXutil.ltrim( localUtil.ntoc( Z419EntUniRem, (byte)(11), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3404EntPedCum", GXutil.rtrim( Z3404EntPedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV36OldEntPre", GXutil.ltrim( localUtil.ntoc( ZV36OldEntPre, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV51PrecAnt", GXutil.ltrim( localUtil.ntoc( ZV51PrecAnt, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV40OldRemanente", GXutil.ltrim( localUtil.ntoc( ZV40OldRemanente, (byte)(11), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV39oldlote", GXutil.rtrim( ZV39oldlote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6156EntPrvNum", GXutil.ltrim( localUtil.ntoc( Z6156EntPrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12716EntFabId", GXutil.ltrim( localUtil.ntoc( Z12716EntFabId, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV59PrdNomX", GXutil.rtrim( ZV59PrdNomX));
      httpContext.ajax_rsp_assign_attri("", false, "O724PrdPreAct", GXutil.ltrim( localUtil.ntoc( O724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O750PrdValStk", GXutil.ltrim( localUtil.ntoc( O750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O419EntUniRem", GXutil.ltrim( localUtil.ntoc( O419EntUniRem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O418EntUniEnt", GXutil.ltrim( localUtil.ntoc( O418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O684PrdCanPen", GXutil.ltrim( localUtil.ntoc( O684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( O704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O415EntFecEnt", localUtil.dtoc( O415EntFecEnt, 0, "/"));
      httpContext.ajax_rsp_assign_attri("", false, "O417EntPre", GXutil.ltrim( localUtil.ntoc( O417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O5686EntLotN", GXutil.rtrim( O5686EntLotN));
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "h6156EntPrvNum", h6156EntPrvNum);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Entfecent( )
   {
      AV47Year = (short)(GXutil.year( A415EntFecEnt)) ;
      AV63Fecha = localUtil.ymdtod( AV47Year, 12, 1) ;
      AV48Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
      AV37oldEntFecent = O415EntFecEnt ;
      AV52FecAnt = O415EntFecEnt ;
      AV49AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      AV50MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      AV72DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV63Fecha),A415EntFecEnt)) ;
      if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53LastFec)) && GXutil.resetTime(AV53LastFec).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && (0==AV32FlagFecCcs) && ( isIns( )  || isUpd( )  ) )
      {
         httpContext.GX_msglist.addItem(AV62msg_ctrl_fecha, 1, "ENTFECENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntFecEnt_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53LastFec)) && GXutil.resetTime(AV53LastFec).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( AV32FlagFecCcs == 1 ) && ( isIns( )  || isUpd( )  ) )
      {
         httpContext.GX_msglist.addItem(AV62msg_ctrl_fecha, 0, "ENTFECENT");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV47Year", GXutil.ltrim( localUtil.ntoc( AV47Year, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV63Fecha", localUtil.format(AV63Fecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV48Mes", GXutil.ltrim( localUtil.ntoc( AV48Mes, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV37oldEntFecent", localUtil.format(AV37oldEntFecent, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV52FecAnt", localUtil.format(AV52FecAnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV49AnyAnt", GXutil.ltrim( localUtil.ntoc( AV49AnyAnt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV50MesAnt", GXutil.ltrim( localUtil.ntoc( AV50MesAnt, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV72DiasFin", GXutil.ltrim( localUtil.ntoc( AV72DiasFin, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Pedcod( )
   {
      n658PedCod = false ;
      /* Using cursor T01R535 */
      pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
         }
      }
      A661PedFec = T01R535_A661PedFec[0] ;
      A666PedPri = T01R535_A666PedPri[0] ;
      A667PedSit = T01R535_A667PedSit[0] ;
      pr_default.close(33);
      /* Using cursor T01R536 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(34) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A719PrdNum)==0) && (GXutil.strcmp("", A13747PrdCDsc)==0) || (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
         }
      }
      A659PedCum = T01R536_A659PedCum[0] ;
      A663PedFulEnt = T01R536_A663PedFulEnt[0] ;
      A657PedCanEnt = T01R536_A657PedCanEnt[0] ;
      A669PedUni = T01R536_A669PedUni[0] ;
      A665PedPre = T01R536_A665PedPre[0] ;
      A660PedDto = T01R536_A660PedDto[0] ;
      pr_default.close(34);
      A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
      if ( (0==A658PedCod) )
      {
         AV43PedPri = "1" ;
      }
      else
      {
         if ( ! (0==A658PedCod) )
         {
            AV43PedPri = A666PedPri ;
         }
      }
      if ( isIns( )  && (0==A658PedCod) )
      {
         A417EntPre = A724PrdPreAct ;
      }
      else
      {
         if ( ! (0==A658PedCod) && isIns( )  )
         {
            A417EntPre = GXutil.roundDecimal( A665PedPre.multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         }
      }
      if ( true /* After */ && ! (0==A658PedCod) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A418EntUniEnt)==0) && isIns( )  )
      {
         A418EntUniEnt = A13833CantPdte ;
      }
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ! (0==A658PedCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad entregada superior a la pedida", ""), 0, "PEDCOD");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", GXutil.rtrim( A666PedPri));
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", GXutil.rtrim( A667PedSit));
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", GXutil.rtrim( A659PedCum));
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrim( localUtil.ntoc( A13833CantPdte, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV43PedPri", GXutil.rtrim( AV43PedPri));
      httpContext.ajax_rsp_assign_attri("", false, "A417EntPre", GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A418EntUniEnt", GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Entprvnum( )
   {
      n6156EntPrvNum = false ;
      if ( (GXutil.strcmp("", h6156EntPrvNum)==0) )
      {
         A6156EntPrvNum = 0 ;
         n6156EntPrvNum = false ;
      }
      else
      {
         A13719PrvNNom = h6156EntPrvNum ;
         /* Using cursor T01R537 */
         pr_default.execute(35, new Object[] {A13719PrvNNom, A396EmprCod});
         A6156EntPrvNum = T01R537_A795PrvNum[0] ;
         if ( ! ( (pr_default.getStatus(35) == 101) ) )
         {
            pr_default.readNext(35);
            if ( ! ( (pr_default.getStatus(35) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "ENTPRVNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEntPrvNum_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(35);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h6156EntPrvNum", h6156EntPrvNum);
      if ( true /* After */ )
      {
         GXt_char1 = AV59PrdNomX ;
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_char28[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_char28) ;
         entradadeproductosalmacen_trn_impl.this.A396EmprCod = GXv_char29[0] ;
         A396EmprCod = this.A396EmprCod ;
         entradadeproductosalmacen_trn_impl.this.A6156EntPrvNum = GXv_int27[0] ;
         A6156EntPrvNum = this.A6156EntPrvNum ;
         entradadeproductosalmacen_trn_impl.this.GXt_char1 = GXv_char28[0] ;
         AV59PrdNomX = GXt_char1 ;
      }
      if ( isIns( )  && (0==A12716EntFabId) && ( Gx_BScreen == 0 ) )
      {
         A12716EntFabId = A6156EntPrvNum ;
      }
      if ( ( GXutil.strcmp(GXutil.trim( AV59PrdNomX), httpContext.getMessage( "Inexistente", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedore Inexistente", ""), 1, "ENTPRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPrvNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6156EntPrvNum", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV59PrdNomX", GXutil.rtrim( AV59PrdNomX));
      httpContext.ajax_rsp_assign_attri("", false, "A12716EntFabId", GXutil.ltrim( localUtil.ntoc( A12716EntFabId, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h6156EntPrvNum", h6156EntPrvNum);
   }

   public void valid_Entunient( )
   {
      n658PedCod = false ;
      AV38OldEntUni = O418EntUniEnt ;
      AV46UniOld = O418EntUniEnt ;
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
      AV42OldExiAlm = O704PrdExiAlm ;
      if ( DecimalUtil.compareTo(A704PrdExiAlm, DecimalUtil.stringToDec("999999.9998")) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad excesiva en  almacen", ""), 1, "ENTUNIENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntUniEnt_Internalname ;
      }
      if ( isDlt( )  && ( ! (0==A658PedCod) ) )
      {
         A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ! (0==A658PedCod) ) && ( ! (0==A658PedCod) ) )
         {
            A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
         }
         else
         {
            if ( isUpd( )  && ( ! (0==A658PedCod) ) && ! ( ! (0==A658PedCod) ) )
            {
               A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ! (0==A658PedCod) ) )
               {
                  A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt).add(O418EntUniEnt) ;
               }
               else
               {
                  if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
                  {
                     A684PrdCanPen = DecimalUtil.ZERO ;
                  }
               }
            }
         }
      }
      if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "¡ATENCION! Cantidad Entregada superior a la Pendiente", ""), 0, "PEDCOD");
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
      if ( isIns( )  && (GXutil.strcmp("", A3404EntPedCum)==0) && ( Gx_BScreen == 0 ) )
      {
         A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      else
      {
         if ( ( DecimalUtil.compareTo((A657PedCanEnt.add(A418EntUniEnt).subtract(AV38OldEntUni)), A669PedUni) >= 0 ) && ( ! (0==A658PedCod) ) && true /* After */ )
         {
            A3404EntPedCum = httpContext.getMessage( "S", "") ;
         }
         else
         {
            if ( ( DecimalUtil.compareTo((A657PedCanEnt.add(A418EntUniEnt).subtract(AV38OldEntUni)), A669PedUni) < 0 ) && ( ! (0==A658PedCod) && true /* After */ ) )
            {
               A3404EntPedCum = httpContext.getMessage( "N", "") ;
            }
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV38OldEntUni", GXutil.ltrim( localUtil.ntoc( AV38OldEntUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV46UniOld", GXutil.ltrim( localUtil.ntoc( AV46UniOld, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV42OldExiAlm", GXutil.ltrim( localUtil.ntoc( AV42OldExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A419EntUniRem", GXutil.ltrim( localUtil.ntoc( A419EntUniRem, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3404EntPedCum", GXutil.rtrim( A3404EntPedCum));
   }

   public void valid_Entpre( )
   {
      AV36OldEntPre = O417EntPre ;
      AV51PrecAnt = O417EntPre ;
      if ( isIns( )  && true /* Level */ )
      {
         A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV36OldEntPre.multiply(AV38OldEntUni), 2)))) ;
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               A750PrdValStk = O750PrdValStk.subtract(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
            }
         }
      }
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV28Consumos == 0 ) )
            {
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV28Consumos == 0 ) )
               {
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
               }
            }
         }
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && (0==AV29FlagPre) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Precio con valor CERO", ""), 1, "ENTPRE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPre_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && ( AV29FlagPre == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "MENSAJE.Precio con valor CERO", ""), 0, "ENTPRE");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV36OldEntPre", GXutil.ltrim( localUtil.ntoc( AV36OldEntPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV51PrecAnt", GXutil.ltrim( localUtil.ntoc( AV51PrecAnt, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
   }

   public void valid_Entunirem( )
   {
      AV40OldRemanente = O419EntUniRem ;
      if ( DecimalUtil.compareTo(A419EntUniRem, DecimalUtil.stringToDec("999999.98")) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad Remanente excesiva", ""), 1, "ENTUNIREM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntUniRem_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV40OldRemanente", GXutil.ltrim( localUtil.ntoc( AV40OldRemanente, (byte)(11), (byte)(4), ".", "")));
   }

   public void valid_Entlotn( )
   {
      AV39oldlote = O5686EntLotN ;
      if ( ( isDlt( )  || isUpd( )  ) && ( GXutil.strcmp(A5686EntLotN, httpContext.getMessage( "Disolucion Producto", "")) == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Producto DILUIDO", ""), 1, "ENTLOTN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntLotN_Internalname ;
      }
      if ( (GXutil.strcmp("", A5686EntLotN)==0) && true /* After */ && ( AV15tintutex == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Lote", ""), 1, "ENTLOTN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntLotN_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV39oldlote", GXutil.rtrim( AV39oldlote));
   }

   public void valid_Entpedcum( )
   {
      n658PedCod = false ;
      n6156EntPrvNum = false ;
      if ( ! ( ( GXutil.strcmp(A3404EntPedCum, "S") == 0 ) || ( GXutil.strcmp(A3404EntPedCum, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cerrar?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ENTPEDCUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPedCum_Internalname ;
      }
      if ( (IsModified == 1) && true /* Level */ && ( DecimalUtil.compareTo(O419EntUniRem, O418EntUniEnt) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Remanente ya modificado", ""), 1, "ENTPEDCUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEntPedCum_Internalname ;
      }
      O724PrdPreAct = A724PrdPreAct ;
      O750PrdValStk = A750PrdValStk ;
      O419EntUniRem = A419EntUniRem ;
      O418EntUniEnt = A418EntUniEnt ;
      O684PrdCanPen = A684PrdCanPen ;
      O704PrdExiAlm = A704PrdExiAlm ;
      O415EntFecEnt = A415EntFecEnt ;
      O417EntPre = A417EntPre ;
      O5686EntLotN = A5686EntLotN ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV65PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'A14035EntNEmb',fld:'ENTNEMB',pic:'Z9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e131R52',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV65PrdNum',fld:'vPRDNUM',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV73PedCum',fld:'vPEDCUM',pic:'@!'},{av:'AV65PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOLPEDIDPROMPT'","{handler:'e111R542',iparms:[]");
      setEventMetadata("'DOLPEDIDPROMPT'",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'h6156EntPrvNum'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'h719PrdNum'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A727PrdRec',fld:'PRDREC',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A713PrdFulEnt',fld:'PRDFULENT',pic:''},{av:'A709PrdFecPre',fld:'PRDFECPRE',pic:''},{av:'A725PrdPreAnt',fld:'PRDPREANT',pic:'ZZZZZZZ9.999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A698PrdDetPar',fld:'PRDDETPAR',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'O704PrdExiAlm'},{av:'O684PrdCanPen'},{av:'O750PrdValStk'},{av:'O724PrdPreAct'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A713PrdFulEnt',fld:'PRDFULENT',pic:''},{av:'A709PrdFecPre',fld:'PRDFECPRE',pic:''},{av:'A725PrdPreAnt',fld:'PRDPREANT',pic:'ZZZZZZZ9.999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A698PrdDetPar',fld:'PRDDETPAR',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A727PrdRec',fld:'PRDREC',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'h6156EntPrvNum'}]}");
      setEventMetadata("VALID_LINENT","{handler:'valid_Linent',iparms:[]");
      setEventMetadata("VALID_LINENT",",oparms:[]}");
      setEventMetadata("VALID_ENTFECENT","{handler:'valid_Entfecent',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O415EntFecEnt'},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'AV47Year',fld:'vYEAR',pic:'ZZZ9'},{av:'AV63Fecha',fld:'vFECHA',pic:''},{av:'AV48Mes',fld:'vMES',pic:'Z9'},{av:'AV37oldEntFecent',fld:'vOLDENTFECENT',pic:''},{av:'AV52FecAnt',fld:'vFECANT',pic:''},{av:'AV49AnyAnt',fld:'vANYANT',pic:'ZZZ9'},{av:'AV50MesAnt',fld:'vMESANT',pic:'Z9'},{av:'AV72DiasFin',fld:'vDIASFIN',pic:'ZZ9'}]");
      setEventMetadata("VALID_ENTFECENT",",oparms:[{av:'AV47Year',fld:'vYEAR',pic:'ZZZ9'},{av:'AV63Fecha',fld:'vFECHA',pic:''},{av:'AV48Mes',fld:'vMES',pic:'Z9'},{av:'AV37oldEntFecent',fld:'vOLDENTFECENT',pic:''},{av:'AV52FecAnt',fld:'vFECANT',pic:''},{av:'AV49AnyAnt',fld:'vANYANT',pic:'ZZZ9'},{av:'AV50MesAnt',fld:'vMESANT',pic:'Z9'},{av:'AV72DiasFin',fld:'vDIASFIN',pic:'ZZ9'}]}");
      setEventMetadata("VALID_ALBARAN","{handler:'valid_Albaran',iparms:[]");
      setEventMetadata("VALID_ALBARAN",",oparms:[]}");
      setEventMetadata("VALID_ENTNALBAR","{handler:'valid_Entnalbar',iparms:[]");
      setEventMetadata("VALID_ENTNALBAR",",oparms:[]}");
      setEventMetadata("VALID_PEDCOD","{handler:'valid_Pedcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A666PedPri',fld:'PEDPRI',pic:'9'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A660PedDto',fld:'PEDDTO',pic:'Z9.99'},{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'A659PedCum',fld:'PEDCUM',pic:'@!'},{av:'A663PedFulEnt',fld:'PEDFULENT',pic:''},{av:'A13833CantPdte',fld:'CANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'AV43PedPri',fld:'vPEDPRI',pic:'9'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'}]");
      setEventMetadata("VALID_PEDCOD",",oparms:[{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A666PedPri',fld:'PEDPRI',pic:'9'},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'A659PedCum',fld:'PEDCUM',pic:'@!'},{av:'A663PedFulEnt',fld:'PEDFULENT',pic:''},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A660PedDto',fld:'PEDDTO',pic:'Z9.99'},{av:'A13833CantPdte',fld:'CANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'AV43PedPri',fld:'vPEDPRI',pic:'9'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'}]}");
      setEventMetadata("VALID_ENTPRVNUM","{handler:'valid_Entprvnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'h6156EntPrvNum'},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV59PrdNomX',fld:'vPRDNOMX',pic:''},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_ENTPRVNUM",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'AV59PrdNomX',fld:'vPRDNOMX',pic:''},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'h6156EntPrvNum'}]}");
      setEventMetadata("VALID_ENTUNIENT","{handler:'valid_Entunient',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O419EntUniRem'},{av:'O684PrdCanPen'},{av:'O704PrdExiAlm'},{av:'O418EntUniEnt'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'AV38OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'AV46UniOld',fld:'vUNIOLD',pic:'ZZZZZ9.99'},{av:'AV42OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A419EntUniRem',fld:'ENTUNIREM',pic:'ZZZZZ9.9999'},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'}]");
      setEventMetadata("VALID_ENTUNIENT",",oparms:[{av:'AV38OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'AV46UniOld',fld:'vUNIOLD',pic:'ZZZZZ9.99'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV42OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A419EntUniRem',fld:'ENTUNIREM',pic:'ZZZZZ9.9999'},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'}]}");
      setEventMetadata("VALID_ENTPRE","{handler:'valid_Entpre',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O750PrdValStk'},{av:'O417EntPre'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV36OldEntPre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV38OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV28Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'AV51PrecAnt',fld:'vPRECANT',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_ENTPRE",",oparms:[{av:'AV36OldEntPre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV51PrecAnt',fld:'vPRECANT',pic:'ZZZZZZZ9.999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_ENTUNIREM","{handler:'valid_Entunirem',iparms:[{av:'O419EntUniRem'},{av:'A419EntUniRem',fld:'ENTUNIREM',pic:'ZZZZZ9.9999'},{av:'AV40OldRemanente',fld:'vOLDREMANENTE',pic:'ZZZZZ9.9999'}]");
      setEventMetadata("VALID_ENTUNIREM",",oparms:[{av:'AV40OldRemanente',fld:'vOLDREMANENTE',pic:'ZZZZZ9.9999'}]}");
      setEventMetadata("VALID_PEDCANENT","{handler:'valid_Pedcanent',iparms:[]");
      setEventMetadata("VALID_PEDCANENT",",oparms:[]}");
      setEventMetadata("VALID_PEDUNI","{handler:'valid_Peduni',iparms:[]");
      setEventMetadata("VALID_PEDUNI",",oparms:[]}");
      setEventMetadata("VALID_PEDPRE","{handler:'valid_Pedpre',iparms:[]");
      setEventMetadata("VALID_PEDPRE",",oparms:[]}");
      setEventMetadata("VALID_PRDCANPEN","{handler:'valid_Prdcanpen',iparms:[]");
      setEventMetadata("VALID_PRDCANPEN",",oparms:[]}");
      setEventMetadata("VALID_ENTLOTN","{handler:'valid_Entlotn',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O5686EntLotN'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'AV39oldlote',fld:'vOLDLOTE',pic:''}]");
      setEventMetadata("VALID_ENTLOTN",",oparms:[{av:'AV39oldlote',fld:'vOLDLOTE',pic:''}]}");
      setEventMetadata("VALID_ENTFVAL","{handler:'valid_Entfval',iparms:[]");
      setEventMetadata("VALID_ENTFVAL",",oparms:[]}");
      setEventMetadata("VALID_ENTOBS","{handler:'valid_Entobs',iparms:[]");
      setEventMetadata("VALID_ENTOBS",",oparms:[]}");
      setEventMetadata("VALID_ENTNUMCON","{handler:'valid_Entnumcon',iparms:[]");
      setEventMetadata("VALID_ENTNUMCON",",oparms:[]}");
      setEventMetadata("VALID_ENTETI","{handler:'valid_Enteti',iparms:[]");
      setEventMetadata("VALID_ENTETI",",oparms:[]}");
      setEventMetadata("VALID_ENTCON","{handler:'valid_Entcon',iparms:[]");
      setEventMetadata("VALID_ENTCON",",oparms:[]}");
      setEventMetadata("VALID_ENTCONINI","{handler:'valid_Entconini',iparms:[]");
      setEventMetadata("VALID_ENTCONINI",",oparms:[]}");
      setEventMetadata("VALID_ENTCONFIN","{handler:'valid_Entconfin',iparms:[]");
      setEventMetadata("VALID_ENTCONFIN",",oparms:[]}");
      setEventMetadata("VALID_ENTNRO","{handler:'valid_Entnro',iparms:[]");
      setEventMetadata("VALID_ENTNRO",",oparms:[]}");
      setEventMetadata("VALID_ENTUNIALB","{handler:'valid_Entunialb',iparms:[]");
      setEventMetadata("VALID_ENTUNIALB",",oparms:[]}");
      setEventMetadata("VALID_ENTBNC","{handler:'valid_Entbnc',iparms:[]");
      setEventMetadata("VALID_ENTBNC",",oparms:[]}");
      setEventMetadata("VALID_ENTCC","{handler:'valid_Entcc',iparms:[]");
      setEventMetadata("VALID_ENTCC",",oparms:[]}");
      setEventMetadata("VALID_ENTCCOCOD","{handler:'valid_Entccocod',iparms:[]");
      setEventMetadata("VALID_ENTCCOCOD",",oparms:[]}");
      setEventMetadata("VALID_ENTREMNRO","{handler:'valid_Entremnro',iparms:[]");
      setEventMetadata("VALID_ENTREMNRO",",oparms:[]}");
      setEventMetadata("VALID_ENTREMFCH","{handler:'valid_Entremfch',iparms:[]");
      setEventMetadata("VALID_ENTREMFCH",",oparms:[]}");
      setEventMetadata("VALID_ENTREMSUC","{handler:'valid_Entremsuc',iparms:[]");
      setEventMetadata("VALID_ENTREMSUC",",oparms:[]}");
      setEventMetadata("VALID_ENTREMTPO","{handler:'valid_Entremtpo',iparms:[]");
      setEventMetadata("VALID_ENTREMTPO",",oparms:[]}");
      setEventMetadata("VALID_ENTFABID","{handler:'valid_Entfabid',iparms:[]");
      setEventMetadata("VALID_ENTFABID",",oparms:[]}");
      setEventMetadata("VALID_ENTLOTEID","{handler:'valid_Entloteid',iparms:[]");
      setEventMetadata("VALID_ENTLOTEID",",oparms:[]}");
      setEventMetadata("VALID_ENTUBICACI","{handler:'valid_Entubicaci',iparms:[]");
      setEventMetadata("VALID_ENTUBICACI",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALID_PRDPREACT","{handler:'valid_Prdpreact',iparms:[]");
      setEventMetadata("VALID_PRDPREACT",",oparms:[]}");
      setEventMetadata("VALID_PRDVALSTK","{handler:'valid_Prdvalstk',iparms:[]");
      setEventMetadata("VALID_PRDVALSTK",",oparms:[]}");
      setEventMetadata("VALID_PEDDTO","{handler:'valid_Peddto',iparms:[]");
      setEventMetadata("VALID_PEDDTO",",oparms:[]}");
      setEventMetadata("VALID_PRDEXICC","{handler:'valid_Prdexicc',iparms:[]");
      setEventMetadata("VALID_PRDEXICC",",oparms:[]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("VALID_PRDREC","{handler:'valid_Prdrec',iparms:[]");
      setEventMetadata("VALID_PRDREC",",oparms:[]}");
      setEventMetadata("VALID_VALCOD","{handler:'valid_Valcod',iparms:[]");
      setEventMetadata("VALID_VALCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDPREMED","{handler:'valid_Prdpremed',iparms:[]");
      setEventMetadata("VALID_PRDPREMED",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'AV65PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'A14035EntNEmb',fld:'ENTNEMB',pic:'Z9'},{av:'h6156EntPrvNum'},{av:'AV32FlagFecCcs',fld:'vFLAGFECCCS',pic:'ZZZ9'},{av:'AV34FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9'},{av:'AV28Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'AV26Artextil',fld:'vARTEXTIL',pic:'ZZZ9'},{av:'AV10ExiLoteID',fld:'vEXILOTEID',pic:'ZZZ9'},{av:'AV22Nalbaran20',fld:'vNALBARAN20',pic:'ZZZ9'},{av:'AV20NoUpd',fld:'vNOUPD',pic:'ZZZ9'},{av:'AV9UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV7Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A10184EntRemTpo',fld:'ENTREMTPO',pic:''},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'AV43PedPri',fld:'vPEDPRI',pic:'9'},{av:'AV47Year',fld:'vYEAR',pic:'ZZZ9'},{av:'AV63Fecha',fld:'vFECHA',pic:''},{av:'AV48Mes',fld:'vMES',pic:'Z9'},{av:'AV37oldEntFecent',fld:'vOLDENTFECENT',pic:''},{av:'AV52FecAnt',fld:'vFECANT',pic:''},{av:'AV49AnyAnt',fld:'vANYANT',pic:'ZZZ9'},{av:'AV50MesAnt',fld:'vMESANT',pic:'Z9'},{av:'AV72DiasFin',fld:'vDIASFIN',pic:'ZZ9'},{av:'AV38OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'AV46UniOld',fld:'vUNIOLD',pic:'ZZZZZ9.99'},{av:'AV42OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV36OldEntPre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV51PrecAnt',fld:'vPRECANT',pic:'ZZZZZZZ9.999'},{av:'AV40OldRemanente',fld:'vOLDREMANENTE',pic:'ZZZZZ9.9999'},{av:'AV39oldlote',fld:'vOLDLOTE',pic:''},{av:'AV59PrdNomX',fld:'vPRDNOMX',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A13235EntLoteID',fld:'ENTLOTEID',pic:'ZZZZZZZZZZZ9'},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A12857EntNAlbar',fld:'ENTNALBAR',pic:''},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'A5685EntFVal',fld:'ENTFVAL',pic:''},{av:'A10783EntObs',fld:'ENTOBS',pic:''},{av:'A416EntNumCon',fld:'ENTNUMCON',pic:'ZZ9'},{av:'A414EntEti',fld:'ENTETI',pic:'9'},{av:'A411EntCon',fld:'ENTCON',pic:'9'},{av:'A413EntConIni',fld:'ENTCONINI',pic:'ZZZZZZZ9'},{av:'A412EntConFin',fld:'ENTCONFIN',pic:'ZZZZZZZ9'},{av:'A5469EntNro',fld:'ENTNRO',pic:'ZZZZZ9'},{av:'A10782EntUniAlb',fld:'ENTUNIALB',pic:'ZZZZZ9.9999'},{av:'A5691EntBnc',fld:'ENTBNC',pic:''},{av:'A7695EntCC',fld:'ENTCC',pic:''},{av:'A7696EntCCoCod',fld:'ENTCCOCOD',pic:'ZZ9'},{av:'A10187EntRemNro',fld:'ENTREMNRO',pic:''},{av:'A10186EntRemFch',fld:'ENTREMFCH',pic:''},{av:'A10185EntRemSuc',fld:'ENTREMSUC',pic:''},{av:'A10184EntRemTpo',fld:'ENTREMTPO',pic:''},{av:'A13456EntUbicaci',fld:'ENTUBICACI',pic:''},{av:'A14035EntNEmb',fld:'ENTNEMB',pic:'Z9'},{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A666PedPri',fld:'PEDPRI',pic:'9'},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'AV43PedPri',fld:'vPEDPRI',pic:'9'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A713PrdFulEnt',fld:'PRDFULENT',pic:''},{av:'A709PrdFecPre',fld:'PRDFECPRE',pic:''},{av:'A725PrdPreAnt',fld:'PRDPREANT',pic:'ZZZZZZZ9.999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A698PrdDetPar',fld:'PRDDETPAR',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A727PrdRec',fld:'PRDREC',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A659PedCum',fld:'PEDCUM',pic:'@!'},{av:'A663PedFulEnt',fld:'PEDFULENT',pic:''},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A660PedDto',fld:'PEDDTO',pic:'Z9.99'},{av:'A13833CantPdte',fld:'CANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV47Year',fld:'vYEAR',pic:'ZZZ9'},{av:'AV63Fecha',fld:'vFECHA',pic:''},{av:'AV48Mes',fld:'vMES',pic:'Z9'},{av:'AV37oldEntFecent',fld:'vOLDENTFECENT',pic:''},{av:'AV52FecAnt',fld:'vFECANT',pic:''},{av:'AV49AnyAnt',fld:'vANYANT',pic:'ZZZ9'},{av:'AV50MesAnt',fld:'vMESANT',pic:'Z9'},{av:'AV72DiasFin',fld:'vDIASFIN',pic:'ZZ9'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV38OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'AV46UniOld',fld:'vUNIOLD',pic:'ZZZZZ9.99'},{av:'AV42OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A419EntUniRem',fld:'ENTUNIREM',pic:'ZZZZZ9.9999'},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'},{av:'AV36OldEntPre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV51PrecAnt',fld:'vPRECANT',pic:'ZZZZZZZ9.999'},{av:'AV40OldRemanente',fld:'vOLDREMANENTE',pic:'ZZZZZ9.9999'},{av:'AV39oldlote',fld:'vOLDLOTE',pic:''},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'AV59PrdNomX',fld:'vPRDNOMX',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z597LinEnt'},{av:'Z13235EntLoteID'},{av:'Z415EntFecEnt'},{av:'Z11Albaran'},{av:'Z12857EntNAlbar'},{av:'Z658PedCod'},{av:'Z5686EntLotN'},{av:'Z5685EntFVal'},{av:'Z10783EntObs'},{av:'Z416EntNumCon'},{av:'Z414EntEti'},{av:'Z411EntCon'},{av:'Z413EntConIni'},{av:'Z412EntConFin'},{av:'Z5469EntNro'},{av:'Z10782EntUniAlb'},{av:'Z5691EntBnc'},{av:'Z7695EntCC'},{av:'Z7696EntCCoCod'},{av:'Z10187EntRemNro'},{av:'Z10186EntRemFch'},{av:'Z10185EntRemSuc'},{av:'Z10184EntRemTpo'},{av:'Z13456EntUbicaci'},{av:'Z14035EntNEmb'},{av:'Z661PedFec'},{av:'Z666PedPri'},{av:'Z667PedSit'},{av:'ZV43PedPri'},{av:'Z664PedNumLin'},{av:'Z704PrdExiAlm'},{av:'Z684PrdCanPen'},{av:'Z750PrdValStk'},{av:'Z726PrdPreMed'},{av:'Z713PrdFulEnt'},{av:'Z709PrdFecPre'},{av:'Z725PrdPreAnt'},{av:'Z724PrdPreAct'},{av:'Z705PrdExiCC'},{av:'Z698PrdDetPar'},{av:'Z718PrdNom'},{av:'Z727PrdRec'},{av:'Z795PrvNum'},{av:'Z856ValCod'},{av:'Z659PedCum'},{av:'Z663PedFulEnt'},{av:'Z657PedCanEnt'},{av:'Z669PedUni'},{av:'Z665PedPre'},{av:'Z660PedDto'},{av:'Z13833CantPdte'},{av:'Z417EntPre'},{av:'ZV47Year'},{av:'ZV63Fecha'},{av:'ZV48Mes'},{av:'ZV37oldEntFecent'},{av:'ZV52FecAnt'},{av:'ZV49AnyAnt'},{av:'ZV50MesAnt'},{av:'ZV72DiasFin'},{av:'Z418EntUniEnt'},{av:'ZV38OldEntUni'},{av:'ZV46UniOld'},{av:'ZV42OldExiAlm'},{av:'Z419EntUniRem'},{av:'Z3404EntPedCum'},{av:'ZV36OldEntPre'},{av:'ZV51PrecAnt'},{av:'ZV40OldRemanente'},{av:'ZV39oldlote'},{av:'Z6156EntPrvNum'},{av:'Z12716EntFabId'},{av:'ZV59PrdNomX'},{av:'O724PrdPreAct'},{av:'O750PrdValStk'},{av:'O419EntUniRem'},{av:'O418EntUniEnt'},{av:'O684PrdCanPen'},{av:'O704PrdExiAlm'},{av:'O415EntFecEnt'},{av:'O417EntPre'},{av:'O5686EntLotN'},{ctrl:'BTNTRN_DELETE',prop:'Enabled'},{ctrl:'BTNTRN_ENTER',prop:'Enabled'},{av:'h6156EntPrvNum'}]}");
      setEventMetadata("VALID_PEDPRI","{handler:'valid_Pedpri',iparms:[]");
      setEventMetadata("VALID_PEDPRI",",oparms:[]}");
      setEventMetadata("VALID_ENTPEDCUM","{handler:'valid_Entpedcum',iparms:[{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'O418EntUniEnt'},{av:'O419EntUniRem'},{av:'A3404EntPedCum',fld:'ENTPEDCUM',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A597LinEnt',fld:'LINENT',pic:'ZZZ9'},{av:'A415EntFecEnt',fld:'ENTFECENT',pic:''},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A12857EntNAlbar',fld:'ENTNALBAR',pic:''},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A418EntUniEnt',fld:'ENTUNIENT',pic:'ZZZZZ9.99'},{av:'A417EntPre',fld:'ENTPRE',pic:'ZZZZZZZ9.999'},{av:'A419EntUniRem',fld:'ENTUNIREM',pic:'ZZZZZ9.9999'},{av:'A5686EntLotN',fld:'ENTLOTN',pic:''},{av:'A5685EntFVal',fld:'ENTFVAL',pic:''},{av:'A10783EntObs',fld:'ENTOBS',pic:''},{av:'A416EntNumCon',fld:'ENTNUMCON',pic:'ZZ9'},{av:'A414EntEti',fld:'ENTETI',pic:'9'},{av:'A411EntCon',fld:'ENTCON',pic:'9'},{av:'A413EntConIni',fld:'ENTCONINI',pic:'ZZZZZZZ9'},{av:'A412EntConFin',fld:'ENTCONFIN',pic:'ZZZZZZZ9'},{av:'A5469EntNro',fld:'ENTNRO',pic:'ZZZZZ9'},{av:'A10782EntUniAlb',fld:'ENTUNIALB',pic:'ZZZZZ9.9999'},{av:'A5691EntBnc',fld:'ENTBNC',pic:''},{av:'A7695EntCC',fld:'ENTCC',pic:''},{av:'A7696EntCCoCod',fld:'ENTCCOCOD',pic:'ZZ9'},{av:'A10187EntRemNro',fld:'ENTREMNRO',pic:''},{av:'A10186EntRemFch',fld:'ENTREMFCH',pic:''},{av:'A10185EntRemSuc',fld:'ENTREMSUC',pic:''},{av:'A10184EntRemTpo',fld:'ENTREMTPO',pic:''},{av:'A12716EntFabId',fld:'ENTFABID',pic:'ZZZZZ9'},{av:'A13235EntLoteID',fld:'ENTLOTEID',pic:'ZZZZZZZZZZZ9'},{av:'A13456EntUbicaci',fld:'ENTUBICACI',pic:''}]");
      setEventMetadata("VALID_ENTPEDCUM",",oparms:[]}");
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
      pr_default.close(31);
      pr_default.close(30);
      pr_default.close(21);
      pr_default.close(33);
      pr_default.close(22);
      pr_default.close(34);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public int getPedNumLin0( String E396EmprCod ,
                             int E658PedCod )
   {
      Gx_cnt = 0 ;
      Gx_first = true ;
      /* Using cursor T01R538 */
      pr_default.execute(36, new Object[] {E396EmprCod, Boolean.valueOf(nA658PedCod), Integer.valueOf(E658PedCod)});
      while ( (pr_default.getStatus(36) != 101) )
      {
         if ( ( ( GXutil.strcmp(T01R538_A659PedCum[0], httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E658PedCod == E658PedCod ) ) )
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
         pr_default.readNext(36);
      }
      pr_default.close(36);
      return Gx_cnt ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z419EntUniRem = DecimalUtil.ZERO ;
      Z417EntPre = DecimalUtil.ZERO ;
      Z418EntUniEnt = DecimalUtil.ZERO ;
      Z415EntFecEnt = GXutil.nullDate() ;
      Z11Albaran = "" ;
      Z12857EntNAlbar = "" ;
      Z5686EntLotN = "" ;
      Z5685EntFVal = GXutil.nullDate() ;
      Z10783EntObs = "" ;
      Z10782EntUniAlb = DecimalUtil.ZERO ;
      Z3404EntPedCum = "" ;
      Z5691EntBnc = "" ;
      Z7695EntCC = "" ;
      Z10187EntRemNro = "" ;
      Z10186EntRemFch = GXutil.nullDate() ;
      Z10185EntRemSuc = "" ;
      Z10184EntRemTpo = "" ;
      Z13456EntUbicaci = "" ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z698PrdDetPar = "" ;
      Z718PrdNom = "" ;
      Z727PrdRec = "" ;
      O724PrdPreAct = DecimalUtil.ZERO ;
      O750PrdValStk = DecimalUtil.ZERO ;
      O419EntUniRem = DecimalUtil.ZERO ;
      O418EntUniEnt = DecimalUtil.ZERO ;
      O684PrdCanPen = DecimalUtil.ZERO ;
      O704PrdExiAlm = DecimalUtil.ZERO ;
      O415EntFecEnt = GXutil.nullDate() ;
      O417EntPre = DecimalUtil.ZERO ;
      O5686EntLotN = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      AV53LastFec = GXutil.nullDate() ;
      A417EntPre = DecimalUtil.ZERO ;
      A415EntFecEnt = GXutil.nullDate() ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      AV43PedPri = "" ;
      A718PrdNom = "" ;
      AV46UniOld = DecimalUtil.ZERO ;
      AV51PrecAnt = DecimalUtil.ZERO ;
      AV52FecAnt = GXutil.nullDate() ;
      AV76Emprcod = "" ;
      A13747PrdCDsc = "" ;
      A13719PrvNNom = "" ;
      h719PrdNum = "" ;
      h6156EntPrvNum = "" ;
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
      sStyleString = "" ;
      lblTextblockpedcod_Jsonclick = "" ;
      imgLpedidprompt_gximage = "" ;
      sImgUrl = "" ;
      imgLpedidprompt_Jsonclick = "" ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A13833CantPdte = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A659PedCum = "" ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A5685EntFVal = GXutil.nullDate() ;
      A10783EntObs = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A10782EntUniAlb = DecimalUtil.ZERO ;
      A5691EntBnc = "" ;
      A661PedFec = GXutil.nullDate() ;
      A667PedSit = "" ;
      A663PedFulEnt = GXutil.nullDate() ;
      A7695EntCC = "" ;
      A10187EntRemNro = "" ;
      A10186EntRemFch = GXutil.nullDate() ;
      A10185EntRemSuc = "" ;
      A10184EntRemTpo = "" ;
      A13456EntUbicaci = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A713PrdFulEnt = GXutil.nullDate() ;
      A709PrdFecPre = GXutil.nullDate() ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A660PedDto = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A698PrdDetPar = "" ;
      A727PrdRec = "" ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A666PedPri = "" ;
      A3404EntPedCum = "" ;
      AV42OldExiAlm = DecimalUtil.ZERO ;
      AV36OldEntPre = DecimalUtil.ZERO ;
      AV38OldEntUni = DecimalUtil.ZERO ;
      AV40OldRemanente = DecimalUtil.ZERO ;
      AV37oldEntFecent = GXutil.nullDate() ;
      AV39oldlote = "" ;
      AV59PrdNomX = "" ;
      AV73PedCum = "" ;
      AV63Fecha = GXutil.nullDate() ;
      AV62msg_ctrl_fecha = "" ;
      AV35Inc_obs = "" ;
      AV9UsurCod = "" ;
      AV75Pgmname = "" ;
      AV7Station = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV8EmprNom = "" ;
      AV65PrdNum = "" ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      Z661PedFec = GXutil.nullDate() ;
      Z666PedPri = "" ;
      Z667PedSit = "" ;
      Z659PedCum = "" ;
      Z663PedFulEnt = GXutil.nullDate() ;
      Z657PedCanEnt = DecimalUtil.ZERO ;
      Z669PedUni = DecimalUtil.ZERO ;
      Z665PedPre = DecimalUtil.ZERO ;
      Z660PedDto = DecimalUtil.ZERO ;
      T01R58_A597LinEnt = new short[1] ;
      T01R58_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R58_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01R58_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A13235EntLoteID = new long[1] ;
      T01R58_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R58_A11Albaran = new String[] {""} ;
      T01R58_A12857EntNAlbar = new String[] {""} ;
      T01R58_A6156EntPrvNum = new int[1] ;
      T01R58_n6156EntPrvNum = new boolean[] {false} ;
      T01R58_A5686EntLotN = new String[] {""} ;
      T01R58_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01R58_A10783EntObs = new String[] {""} ;
      T01R58_A416EntNumCon = new short[1] ;
      T01R58_A414EntEti = new byte[1] ;
      T01R58_A411EntCon = new byte[1] ;
      T01R58_A413EntConIni = new int[1] ;
      T01R58_A412EntConFin = new int[1] ;
      T01R58_A5469EntNro = new int[1] ;
      T01R58_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A3404EntPedCum = new String[] {""} ;
      T01R58_A5691EntBnc = new String[] {""} ;
      T01R58_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01R58_A666PedPri = new String[] {""} ;
      T01R58_A667PedSit = new String[] {""} ;
      T01R58_A659PedCum = new String[] {""} ;
      T01R58_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R58_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A7695EntCC = new String[] {""} ;
      T01R58_A7696EntCCoCod = new short[1] ;
      T01R58_A10187EntRemNro = new String[] {""} ;
      T01R58_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01R58_A10185EntRemSuc = new String[] {""} ;
      T01R58_A10184EntRemTpo = new String[] {""} ;
      T01R58_A12716EntFabId = new int[1] ;
      T01R58_A13456EntUbicaci = new String[] {""} ;
      T01R58_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R58_A698PrdDetPar = new String[] {""} ;
      T01R58_A718PrdNom = new String[] {""} ;
      T01R58_A727PrdRec = new String[] {""} ;
      T01R58_A14035EntNEmb = new byte[1] ;
      T01R58_A396EmprCod = new String[] {""} ;
      T01R58_A719PrdNum = new String[] {""} ;
      T01R58_A658PedCod = new int[1] ;
      T01R58_n658PedCod = new boolean[] {false} ;
      T01R58_A795PrvNum = new int[1] ;
      T01R58_A856ValCod = new byte[1] ;
      T01R59_A13719PrvNNom = new String[] {""} ;
      T01R59_A396EmprCod = new String[] {""} ;
      T01R59_A795PrvNum = new int[1] ;
      T01R510_A13747PrdCDsc = new String[] {""} ;
      T01R510_A396EmprCod = new String[] {""} ;
      T01R510_A719PrdNum = new String[] {""} ;
      T01R511_A13719PrvNNom = new String[] {""} ;
      T01R511_A396EmprCod = new String[] {""} ;
      T01R511_A795PrvNum = new int[1] ;
      T01R512_A13747PrdCDsc = new String[] {""} ;
      T01R512_A396EmprCod = new String[] {""} ;
      T01R512_A719PrdNum = new String[] {""} ;
      T01R56_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01R56_A666PedPri = new String[] {""} ;
      T01R56_A667PedSit = new String[] {""} ;
      T01R55_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R55_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R55_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R55_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R55_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R55_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01R55_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R55_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R55_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R55_A698PrdDetPar = new String[] {""} ;
      T01R55_A718PrdNom = new String[] {""} ;
      T01R55_A727PrdRec = new String[] {""} ;
      T01R55_A795PrvNum = new int[1] ;
      T01R55_A856ValCod = new byte[1] ;
      T01R57_A659PedCum = new String[] {""} ;
      T01R57_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R57_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R57_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R57_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R57_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R513_A13719PrvNNom = new String[] {""} ;
      T01R513_A396EmprCod = new String[] {""} ;
      T01R513_A795PrvNum = new int[1] ;
      T01R514_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01R514_A666PedPri = new String[] {""} ;
      T01R514_A667PedSit = new String[] {""} ;
      T01R515_A659PedCum = new String[] {""} ;
      T01R515_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R515_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R515_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R515_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R515_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R516_A396EmprCod = new String[] {""} ;
      T01R516_A719PrdNum = new String[] {""} ;
      T01R516_A597LinEnt = new short[1] ;
      T01R53_A597LinEnt = new short[1] ;
      T01R53_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R53_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R53_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R53_A13235EntLoteID = new long[1] ;
      T01R53_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R53_A11Albaran = new String[] {""} ;
      T01R53_A12857EntNAlbar = new String[] {""} ;
      T01R53_A6156EntPrvNum = new int[1] ;
      T01R53_n6156EntPrvNum = new boolean[] {false} ;
      T01R53_A5686EntLotN = new String[] {""} ;
      T01R53_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01R53_A10783EntObs = new String[] {""} ;
      T01R53_A416EntNumCon = new short[1] ;
      T01R53_A414EntEti = new byte[1] ;
      T01R53_A411EntCon = new byte[1] ;
      T01R53_A413EntConIni = new int[1] ;
      T01R53_A412EntConFin = new int[1] ;
      T01R53_A5469EntNro = new int[1] ;
      T01R53_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R53_A3404EntPedCum = new String[] {""} ;
      T01R53_A5691EntBnc = new String[] {""} ;
      T01R53_A7695EntCC = new String[] {""} ;
      T01R53_A7696EntCCoCod = new short[1] ;
      T01R53_A10187EntRemNro = new String[] {""} ;
      T01R53_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01R53_A10185EntRemSuc = new String[] {""} ;
      T01R53_A10184EntRemTpo = new String[] {""} ;
      T01R53_A12716EntFabId = new int[1] ;
      T01R53_A13456EntUbicaci = new String[] {""} ;
      T01R53_A14035EntNEmb = new byte[1] ;
      T01R53_A396EmprCod = new String[] {""} ;
      T01R53_A719PrdNum = new String[] {""} ;
      T01R53_A658PedCod = new int[1] ;
      T01R53_n658PedCod = new boolean[] {false} ;
      sMode42 = "" ;
      T01R517_A396EmprCod = new String[] {""} ;
      T01R517_A719PrdNum = new String[] {""} ;
      T01R517_A597LinEnt = new short[1] ;
      T01R518_A396EmprCod = new String[] {""} ;
      T01R518_A719PrdNum = new String[] {""} ;
      T01R518_A597LinEnt = new short[1] ;
      T01R52_A597LinEnt = new short[1] ;
      T01R52_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R52_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R52_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R52_A13235EntLoteID = new long[1] ;
      T01R52_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R52_A11Albaran = new String[] {""} ;
      T01R52_A12857EntNAlbar = new String[] {""} ;
      T01R52_A6156EntPrvNum = new int[1] ;
      T01R52_n6156EntPrvNum = new boolean[] {false} ;
      T01R52_A5686EntLotN = new String[] {""} ;
      T01R52_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      T01R52_A10783EntObs = new String[] {""} ;
      T01R52_A416EntNumCon = new short[1] ;
      T01R52_A414EntEti = new byte[1] ;
      T01R52_A411EntCon = new byte[1] ;
      T01R52_A413EntConIni = new int[1] ;
      T01R52_A412EntConFin = new int[1] ;
      T01R52_A5469EntNro = new int[1] ;
      T01R52_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R52_A3404EntPedCum = new String[] {""} ;
      T01R52_A5691EntBnc = new String[] {""} ;
      T01R52_A7695EntCC = new String[] {""} ;
      T01R52_A7696EntCCoCod = new short[1] ;
      T01R52_A10187EntRemNro = new String[] {""} ;
      T01R52_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01R52_A10185EntRemSuc = new String[] {""} ;
      T01R52_A10184EntRemTpo = new String[] {""} ;
      T01R52_A12716EntFabId = new int[1] ;
      T01R52_A13456EntUbicaci = new String[] {""} ;
      T01R52_A14035EntNEmb = new byte[1] ;
      T01R52_A396EmprCod = new String[] {""} ;
      T01R52_A719PrdNum = new String[] {""} ;
      T01R52_A658PedCod = new int[1] ;
      T01R52_n658PedCod = new boolean[] {false} ;
      T01R519_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R519_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R519_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R519_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R519_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R519_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01R519_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R519_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R519_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R519_A698PrdDetPar = new String[] {""} ;
      T01R519_A718PrdNom = new String[] {""} ;
      T01R519_A727PrdRec = new String[] {""} ;
      T01R519_A795PrvNum = new int[1] ;
      T01R519_A856ValCod = new byte[1] ;
      T01R523_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R523_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R523_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R523_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R523_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R523_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01R523_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R523_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R523_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R523_A698PrdDetPar = new String[] {""} ;
      T01R523_A718PrdNom = new String[] {""} ;
      T01R523_A727PrdRec = new String[] {""} ;
      T01R523_A795PrvNum = new int[1] ;
      T01R523_A856ValCod = new byte[1] ;
      T01R524_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01R524_A666PedPri = new String[] {""} ;
      T01R524_A667PedSit = new String[] {""} ;
      T01R525_A659PedCum = new String[] {""} ;
      T01R525_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R525_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R525_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R525_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R525_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R527_A396EmprCod = new String[] {""} ;
      T01R527_A719PrdNum = new String[] {""} ;
      T01R527_A597LinEnt = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i10184EntRemTpo = "" ;
      i415EntFecEnt = GXutil.nullDate() ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13747PrdCDsc = "" ;
      T01R528_A13747PrdCDsc = new String[] {""} ;
      l13719PrvNNom = "" ;
      T01R529_A13719PrvNNom = new String[] {""} ;
      T01R530_A13747PrdCDsc = new String[] {""} ;
      T01R530_A396EmprCod = new String[] {""} ;
      T01R530_A719PrdNum = new String[] {""} ;
      T01R531_A13719PrvNNom = new String[] {""} ;
      T01R531_A396EmprCod = new String[] {""} ;
      T01R531_A795PrvNum = new int[1] ;
      GXv_int14 = new short[1] ;
      GXv_int10 = new short[1] ;
      GXv_int16 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_char25 = new String[1] ;
      GXv_char24 = new String[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int17 = new byte[1] ;
      GXv_char23 = new String[1] ;
      GXv_int21 = new int[1] ;
      GXv_char22 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int15 = new short[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_date19 = new java.util.Date[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      T01R532_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R532_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R532_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R532_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R532_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R532_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01R532_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R532_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R532_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R532_A698PrdDetPar = new String[] {""} ;
      T01R532_A718PrdNom = new String[] {""} ;
      T01R532_A727PrdRec = new String[] {""} ;
      T01R532_A795PrvNum = new int[1] ;
      T01R532_A856ValCod = new byte[1] ;
      ZV43PedPri = "" ;
      Z13833CantPdte = DecimalUtil.ZERO ;
      ZV63Fecha = GXutil.nullDate() ;
      ZV37oldEntFecent = GXutil.nullDate() ;
      ZV52FecAnt = GXutil.nullDate() ;
      ZV38OldEntUni = DecimalUtil.ZERO ;
      ZV46UniOld = DecimalUtil.ZERO ;
      ZV42OldExiAlm = DecimalUtil.ZERO ;
      ZV36OldEntPre = DecimalUtil.ZERO ;
      ZV51PrecAnt = DecimalUtil.ZERO ;
      ZV40OldRemanente = DecimalUtil.ZERO ;
      ZV39oldlote = "" ;
      ZV59PrdNomX = "" ;
      T01R533_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R533_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R533_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R533_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R533_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R533_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T01R533_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R533_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R533_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R533_A698PrdDetPar = new String[] {""} ;
      T01R533_A718PrdNom = new String[] {""} ;
      T01R533_A727PrdRec = new String[] {""} ;
      T01R533_A795PrvNum = new int[1] ;
      T01R533_A856ValCod = new byte[1] ;
      T01R534_A13719PrvNNom = new String[] {""} ;
      T01R534_A396EmprCod = new String[] {""} ;
      T01R534_A795PrvNum = new int[1] ;
      ZO704PrdExiAlm = DecimalUtil.ZERO ;
      ZO684PrdCanPen = DecimalUtil.ZERO ;
      ZO750PrdValStk = DecimalUtil.ZERO ;
      ZO724PrdPreAct = DecimalUtil.ZERO ;
      Zh6156EntPrvNum = "" ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ415EntFecEnt = GXutil.nullDate() ;
      ZZ11Albaran = "" ;
      ZZ12857EntNAlbar = "" ;
      ZZ5686EntLotN = "" ;
      ZZ5685EntFVal = GXutil.nullDate() ;
      ZZ10783EntObs = "" ;
      ZZ10782EntUniAlb = DecimalUtil.ZERO ;
      ZZ5691EntBnc = "" ;
      ZZ7695EntCC = "" ;
      ZZ10187EntRemNro = "" ;
      ZZ10186EntRemFch = GXutil.nullDate() ;
      ZZ10185EntRemSuc = "" ;
      ZZ10184EntRemTpo = "" ;
      ZZ13456EntUbicaci = "" ;
      ZZ661PedFec = GXutil.nullDate() ;
      ZZ666PedPri = "" ;
      ZZ667PedSit = "" ;
      ZZV43PedPri = "" ;
      ZZ704PrdExiAlm = DecimalUtil.ZERO ;
      ZZ684PrdCanPen = DecimalUtil.ZERO ;
      ZZ750PrdValStk = DecimalUtil.ZERO ;
      ZZ726PrdPreMed = DecimalUtil.ZERO ;
      ZZ713PrdFulEnt = GXutil.nullDate() ;
      ZZ709PrdFecPre = GXutil.nullDate() ;
      ZZ725PrdPreAnt = DecimalUtil.ZERO ;
      ZZ724PrdPreAct = DecimalUtil.ZERO ;
      ZZ705PrdExiCC = DecimalUtil.ZERO ;
      ZZ698PrdDetPar = "" ;
      ZZ718PrdNom = "" ;
      ZZ727PrdRec = "" ;
      ZZ659PedCum = "" ;
      ZZ663PedFulEnt = GXutil.nullDate() ;
      ZZ657PedCanEnt = DecimalUtil.ZERO ;
      ZZ669PedUni = DecimalUtil.ZERO ;
      ZZ665PedPre = DecimalUtil.ZERO ;
      ZZ660PedDto = DecimalUtil.ZERO ;
      ZZ13833CantPdte = DecimalUtil.ZERO ;
      ZZ417EntPre = DecimalUtil.ZERO ;
      ZZV63Fecha = GXutil.nullDate() ;
      ZZV37oldEntFecent = GXutil.nullDate() ;
      ZZV52FecAnt = GXutil.nullDate() ;
      ZZ418EntUniEnt = DecimalUtil.ZERO ;
      ZZV38OldEntUni = DecimalUtil.ZERO ;
      ZZV46UniOld = DecimalUtil.ZERO ;
      ZZV42OldExiAlm = DecimalUtil.ZERO ;
      ZZ419EntUniRem = DecimalUtil.ZERO ;
      ZZ3404EntPedCum = "" ;
      ZZV36OldEntPre = DecimalUtil.ZERO ;
      ZZV51PrecAnt = DecimalUtil.ZERO ;
      ZZV40OldRemanente = DecimalUtil.ZERO ;
      ZZV39oldlote = "" ;
      ZZV59PrdNomX = "" ;
      ZO419EntUniRem = DecimalUtil.ZERO ;
      ZO418EntUniEnt = DecimalUtil.ZERO ;
      ZO415EntFecEnt = GXutil.nullDate() ;
      ZO417EntPre = DecimalUtil.ZERO ;
      ZO5686EntLotN = "" ;
      T01R535_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01R535_A666PedPri = new String[] {""} ;
      T01R535_A667PedSit = new String[] {""} ;
      T01R536_A659PedCum = new String[] {""} ;
      T01R536_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01R536_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R536_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R536_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R536_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01R537_A13719PrvNNom = new String[] {""} ;
      T01R537_A396EmprCod = new String[] {""} ;
      T01R537_A795PrvNum = new int[1] ;
      GXt_char1 = "" ;
      GXv_char29 = new String[1] ;
      GXv_int27 = new int[1] ;
      GXv_char28 = new String[1] ;
      E396EmprCod = "" ;
      T01R538_A396EmprCod = new String[] {""} ;
      T01R538_A658PedCod = new int[1] ;
      T01R538_n658PedCod = new boolean[] {false} ;
      T01R538_A719PrdNum = new String[] {""} ;
      T01R538_A659PedCum = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradadeproductosalmacen_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradadeproductosalmacen_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradadeproductosalmacen_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradadeproductosalmacen_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradadeproductosalmacen_trn__default(),
         new Object[] {
             new Object[] {
            T01R52_A597LinEnt, T01R52_A419EntUniRem, T01R52_A417EntPre, T01R52_A418EntUniEnt, T01R52_A13235EntLoteID, T01R52_A415EntFecEnt, T01R52_A11Albaran, T01R52_A12857EntNAlbar, T01R52_A6156EntPrvNum, T01R52_n6156EntPrvNum,
            T01R52_A5686EntLotN, T01R52_A5685EntFVal, T01R52_A10783EntObs, T01R52_A416EntNumCon, T01R52_A414EntEti, T01R52_A411EntCon, T01R52_A413EntConIni, T01R52_A412EntConFin, T01R52_A5469EntNro, T01R52_A10782EntUniAlb,
            T01R52_A3404EntPedCum, T01R52_A5691EntBnc, T01R52_A7695EntCC, T01R52_A7696EntCCoCod, T01R52_A10187EntRemNro, T01R52_A10186EntRemFch, T01R52_A10185EntRemSuc, T01R52_A10184EntRemTpo, T01R52_A12716EntFabId, T01R52_A13456EntUbicaci,
            T01R52_A14035EntNEmb, T01R52_A396EmprCod, T01R52_A719PrdNum, T01R52_A658PedCod, T01R52_n658PedCod
            }
            , new Object[] {
            T01R53_A597LinEnt, T01R53_A419EntUniRem, T01R53_A417EntPre, T01R53_A418EntUniEnt, T01R53_A13235EntLoteID, T01R53_A415EntFecEnt, T01R53_A11Albaran, T01R53_A12857EntNAlbar, T01R53_A6156EntPrvNum, T01R53_n6156EntPrvNum,
            T01R53_A5686EntLotN, T01R53_A5685EntFVal, T01R53_A10783EntObs, T01R53_A416EntNumCon, T01R53_A414EntEti, T01R53_A411EntCon, T01R53_A413EntConIni, T01R53_A412EntConFin, T01R53_A5469EntNro, T01R53_A10782EntUniAlb,
            T01R53_A3404EntPedCum, T01R53_A5691EntBnc, T01R53_A7695EntCC, T01R53_A7696EntCCoCod, T01R53_A10187EntRemNro, T01R53_A10186EntRemFch, T01R53_A10185EntRemSuc, T01R53_A10184EntRemTpo, T01R53_A12716EntFabId, T01R53_A13456EntUbicaci,
            T01R53_A14035EntNEmb, T01R53_A396EmprCod, T01R53_A719PrdNum, T01R53_A658PedCod, T01R53_n658PedCod
            }
            , new Object[] {
            T01R54_A704PrdExiAlm, T01R54_A684PrdCanPen, T01R54_A750PrdValStk, T01R54_A726PrdPreMed, T01R54_A713PrdFulEnt, T01R54_A709PrdFecPre, T01R54_A725PrdPreAnt, T01R54_A724PrdPreAct, T01R54_A705PrdExiCC, T01R54_A698PrdDetPar,
            T01R54_A718PrdNom, T01R54_A727PrdRec, T01R54_A795PrvNum, T01R54_A856ValCod
            }
            , new Object[] {
            T01R55_A704PrdExiAlm, T01R55_A684PrdCanPen, T01R55_A750PrdValStk, T01R55_A726PrdPreMed, T01R55_A713PrdFulEnt, T01R55_A709PrdFecPre, T01R55_A725PrdPreAnt, T01R55_A724PrdPreAct, T01R55_A705PrdExiCC, T01R55_A698PrdDetPar,
            T01R55_A718PrdNom, T01R55_A727PrdRec, T01R55_A795PrvNum, T01R55_A856ValCod
            }
            , new Object[] {
            T01R56_A661PedFec, T01R56_A666PedPri, T01R56_A667PedSit
            }
            , new Object[] {
            T01R57_A659PedCum, T01R57_A663PedFulEnt, T01R57_A657PedCanEnt, T01R57_A669PedUni, T01R57_A665PedPre, T01R57_A660PedDto
            }
            , new Object[] {
            T01R58_A597LinEnt, T01R58_A704PrdExiAlm, T01R58_A684PrdCanPen, T01R58_A419EntUniRem, T01R58_A750PrdValStk, T01R58_A417EntPre, T01R58_A726PrdPreMed, T01R58_A713PrdFulEnt, T01R58_A709PrdFecPre, T01R58_A725PrdPreAnt,
            T01R58_A724PrdPreAct, T01R58_A418EntUniEnt, T01R58_A13235EntLoteID, T01R58_A415EntFecEnt, T01R58_A11Albaran, T01R58_A12857EntNAlbar, T01R58_A6156EntPrvNum, T01R58_n6156EntPrvNum, T01R58_A5686EntLotN, T01R58_A5685EntFVal,
            T01R58_A10783EntObs, T01R58_A416EntNumCon, T01R58_A414EntEti, T01R58_A411EntCon, T01R58_A413EntConIni, T01R58_A412EntConFin, T01R58_A5469EntNro, T01R58_A10782EntUniAlb, T01R58_A3404EntPedCum, T01R58_A5691EntBnc,
            T01R58_A661PedFec, T01R58_A666PedPri, T01R58_A667PedSit, T01R58_A659PedCum, T01R58_A663PedFulEnt, T01R58_A657PedCanEnt, T01R58_A669PedUni, T01R58_A665PedPre, T01R58_A7695EntCC, T01R58_A7696EntCCoCod,
            T01R58_A10187EntRemNro, T01R58_A10186EntRemFch, T01R58_A10185EntRemSuc, T01R58_A10184EntRemTpo, T01R58_A12716EntFabId, T01R58_A13456EntUbicaci, T01R58_A660PedDto, T01R58_A705PrdExiCC, T01R58_A698PrdDetPar, T01R58_A718PrdNom,
            T01R58_A727PrdRec, T01R58_A14035EntNEmb, T01R58_A396EmprCod, T01R58_A719PrdNum, T01R58_A658PedCod, T01R58_n658PedCod, T01R58_A795PrvNum, T01R58_A856ValCod
            }
            , new Object[] {
            T01R59_A13719PrvNNom, T01R59_A396EmprCod, T01R59_A795PrvNum
            }
            , new Object[] {
            T01R510_A13747PrdCDsc, T01R510_A396EmprCod, T01R510_A719PrdNum
            }
            , new Object[] {
            T01R511_A13719PrvNNom, T01R511_A396EmprCod, T01R511_A795PrvNum
            }
            , new Object[] {
            T01R512_A13747PrdCDsc, T01R512_A396EmprCod, T01R512_A719PrdNum
            }
            , new Object[] {
            T01R513_A13719PrvNNom, T01R513_A396EmprCod, T01R513_A795PrvNum
            }
            , new Object[] {
            T01R514_A661PedFec, T01R514_A666PedPri, T01R514_A667PedSit
            }
            , new Object[] {
            T01R515_A659PedCum, T01R515_A663PedFulEnt, T01R515_A657PedCanEnt, T01R515_A669PedUni, T01R515_A665PedPre, T01R515_A660PedDto
            }
            , new Object[] {
            T01R516_A396EmprCod, T01R516_A719PrdNum, T01R516_A597LinEnt
            }
            , new Object[] {
            T01R517_A396EmprCod, T01R517_A719PrdNum, T01R517_A597LinEnt
            }
            , new Object[] {
            T01R518_A396EmprCod, T01R518_A719PrdNum, T01R518_A597LinEnt
            }
            , new Object[] {
            T01R519_A704PrdExiAlm, T01R519_A684PrdCanPen, T01R519_A750PrdValStk, T01R519_A726PrdPreMed, T01R519_A713PrdFulEnt, T01R519_A709PrdFecPre, T01R519_A725PrdPreAnt, T01R519_A724PrdPreAct, T01R519_A705PrdExiCC, T01R519_A698PrdDetPar,
            T01R519_A718PrdNom, T01R519_A727PrdRec, T01R519_A795PrvNum, T01R519_A856ValCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01R523_A704PrdExiAlm, T01R523_A684PrdCanPen, T01R523_A750PrdValStk, T01R523_A726PrdPreMed, T01R523_A713PrdFulEnt, T01R523_A709PrdFecPre, T01R523_A725PrdPreAnt, T01R523_A724PrdPreAct, T01R523_A705PrdExiCC, T01R523_A698PrdDetPar,
            T01R523_A718PrdNom, T01R523_A727PrdRec, T01R523_A795PrvNum, T01R523_A856ValCod
            }
            , new Object[] {
            T01R524_A661PedFec, T01R524_A666PedPri, T01R524_A667PedSit
            }
            , new Object[] {
            T01R525_A659PedCum, T01R525_A663PedFulEnt, T01R525_A657PedCanEnt, T01R525_A669PedUni, T01R525_A665PedPre, T01R525_A660PedDto
            }
            , new Object[] {
            }
            , new Object[] {
            T01R527_A396EmprCod, T01R527_A719PrdNum, T01R527_A597LinEnt
            }
            , new Object[] {
            T01R528_A13747PrdCDsc
            }
            , new Object[] {
            T01R529_A13719PrvNNom
            }
            , new Object[] {
            T01R530_A13747PrdCDsc, T01R530_A396EmprCod, T01R530_A719PrdNum
            }
            , new Object[] {
            T01R531_A13719PrvNNom, T01R531_A396EmprCod, T01R531_A795PrvNum
            }
            , new Object[] {
            T01R532_A704PrdExiAlm, T01R532_A684PrdCanPen, T01R532_A750PrdValStk, T01R532_A726PrdPreMed, T01R532_A713PrdFulEnt, T01R532_A709PrdFecPre, T01R532_A725PrdPreAnt, T01R532_A724PrdPreAct, T01R532_A705PrdExiCC, T01R532_A698PrdDetPar,
            T01R532_A718PrdNom, T01R532_A727PrdRec, T01R532_A795PrvNum, T01R532_A856ValCod
            }
            , new Object[] {
            T01R533_A704PrdExiAlm, T01R533_A684PrdCanPen, T01R533_A750PrdValStk, T01R533_A726PrdPreMed, T01R533_A713PrdFulEnt, T01R533_A709PrdFecPre, T01R533_A725PrdPreAnt, T01R533_A724PrdPreAct, T01R533_A705PrdExiCC, T01R533_A698PrdDetPar,
            T01R533_A718PrdNom, T01R533_A727PrdRec, T01R533_A795PrvNum, T01R533_A856ValCod
            }
            , new Object[] {
            T01R534_A13719PrvNNom, T01R534_A396EmprCod, T01R534_A795PrvNum
            }
            , new Object[] {
            T01R535_A661PedFec, T01R535_A666PedPri, T01R535_A667PedSit
            }
            , new Object[] {
            T01R536_A659PedCum, T01R536_A663PedFulEnt, T01R536_A657PedCanEnt, T01R536_A669PedUni, T01R536_A665PedPre, T01R536_A660PedDto
            }
            , new Object[] {
            T01R537_A13719PrvNNom, T01R537_A396EmprCod, T01R537_A795PrvNum
            }
            , new Object[] {
            T01R538_A396EmprCod, T01R538_A658PedCod, T01R538_A719PrdNum, T01R538_A659PedCum
            }
         }
      );
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
      AV75Pgmname = "StocksQuimicos.EntradadeProductosAlmacen_TRN" ;
      Z415EntFecEnt = GXutil.serverDate( context, remoteHandle, pr_default) ;
      O415EntFecEnt = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i415EntFecEnt = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A415EntFecEnt = GXutil.serverDate( context, remoteHandle, pr_default) ;
      Z6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      A6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      Z12716EntFabId = 0 ;
      A12716EntFabId = 0 ;
      Z3404EntPedCum = httpContext.getMessage( "N", "") ;
      A3404EntPedCum = httpContext.getMessage( "N", "") ;
      Z10184EntRemTpo = " " ;
      A10184EntRemTpo = " " ;
      i10184EntRemTpo = " " ;
   }

   private byte Z414EntEti ;
   private byte Z411EntCon ;
   private byte Z14035EntNEmb ;
   private byte Z856ValCod ;
   private byte GxWebError ;
   private byte AV48Mes ;
   private byte AV50MesAnt ;
   private byte nKeyPressed ;
   private byte A414EntEti ;
   private byte A411EntCon ;
   private byte A856ValCod ;
   private byte A14035EntNEmb ;
   private byte Gx_BScreen ;
   private byte GXt_int5 ;
   private byte gxajaxcallmode ;
   private byte GXv_int16[] ;
   private byte GXv_int6[] ;
   private byte GXv_int17[] ;
   private byte ZV48Mes ;
   private byte ZV50MesAnt ;
   private byte ZZ414EntEti ;
   private byte ZZ411EntCon ;
   private byte ZZ14035EntNEmb ;
   private byte ZZ856ValCod ;
   private byte ZZV48Mes ;
   private byte ZZV50MesAnt ;
   private short Z597LinEnt ;
   private short Z416EntNumCon ;
   private short Z7696EntCCoCod ;
   private short A597LinEnt ;
   private short AV47Year ;
   private short AV49AnyAnt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A416EntNumCon ;
   private short A664PedNumLin ;
   private short A7696EntCCoCod ;
   private short AV28Consumos ;
   private short AV20NoUpd ;
   private short AV72DiasFin ;
   private short AV10ExiLoteID ;
   private short AV34FlagCcs ;
   private short AV26Artextil ;
   private short AV22Nalbaran20 ;
   private short AV29FlagPre ;
   private short AV32FlagFecCcs ;
   private short AV15tintutex ;
   private short AV11F_endutex ;
   private short AV12St0018 ;
   private short AV13Proprv ;
   private short AV14verCont ;
   private short AV16SinCompras ;
   private short AV17vincolor ;
   private short AV18BCTexplus ;
   private short AV19AudEntradas ;
   private short AV21Rontaltex ;
   private short AV23Carvitin ;
   private short AV24uel041 ;
   private short AV25Er ;
   private short AV27Intexco ;
   private short AV30PreTot ;
   private short AV33FlagEti ;
   private short AV31FlagEst ;
   private short RcdFound42 ;
   private short nIsDirty_42 ;
   private short gxhchits ;
   private short GXv_int14[] ;
   private short GXv_int10[] ;
   private short GXv_int15[] ;
   private short Z664PedNumLin ;
   private short ZV47Year ;
   private short ZV49AnyAnt ;
   private short ZV72DiasFin ;
   private short ZZ597LinEnt ;
   private short ZZ416EntNumCon ;
   private short ZZ7696EntCCoCod ;
   private short ZZ664PedNumLin ;
   private short ZZV47Year ;
   private short ZZV49AnyAnt ;
   private short ZZV72DiasFin ;
   private int Z6156EntPrvNum ;
   private int Z413EntConIni ;
   private int Z412EntConFin ;
   private int Z5469EntNro ;
   private int Z12716EntFabId ;
   private int Z658PedCod ;
   private int Z795PrvNum ;
   private int A6156EntPrvNum ;
   private int A658PedCod ;
   private int trnEnded ;
   private int edtPrdNum_Enabled ;
   private int edtLinEnt_Enabled ;
   private int edtEntFecEnt_Enabled ;
   private int edtAlbaran_Enabled ;
   private int edtEntNAlbar_Enabled ;
   private int edtPedCod_Enabled ;
   private int imgLpedidprompt_Visible ;
   private int edtEntPrvNum_Enabled ;
   private int edtEntUniEnt_Enabled ;
   private int edtEntPre_Enabled ;
   private int edtEntUniRem_Enabled ;
   private int edtPedCanEnt_Enabled ;
   private int edtPedUni_Enabled ;
   private int edtCantPdte_Enabled ;
   private int edtPedPre_Enabled ;
   private int edtPedCum_Enabled ;
   private int edtPrdCanPen_Enabled ;
   private int edtEntLotN_Enabled ;
   private int edtEntFVal_Enabled ;
   private int edtEntObs_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEntNumCon_Enabled ;
   private int edtEntEti_Enabled ;
   private int edtEntCon_Enabled ;
   private int A413EntConIni ;
   private int edtEntConIni_Enabled ;
   private int A412EntConFin ;
   private int edtEntConFin_Enabled ;
   private int A5469EntNro ;
   private int edtEntNro_Enabled ;
   private int edtEntUniAlb_Enabled ;
   private int edtEntBnc_Enabled ;
   private int edtPedFec_Enabled ;
   private int edtPedNumLin_Enabled ;
   private int edtPedSit_Enabled ;
   private int edtPedFulEnt_Enabled ;
   private int edtEntCC_Enabled ;
   private int edtEntCCoCod_Enabled ;
   private int edtEntRemNro_Enabled ;
   private int edtEntRemFch_Enabled ;
   private int edtEntRemSuc_Enabled ;
   private int edtEntRemTpo_Enabled ;
   private int A12716EntFabId ;
   private int edtEntFabId_Enabled ;
   private int edtEntLoteID_Enabled ;
   private int edtEntUbicaci_Enabled ;
   private int A795PrvNum ;
   private int edtPrvNum_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdFulEnt_Enabled ;
   private int edtPrdFecPre_Enabled ;
   private int edtPrdPreAnt_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtPrdValStk_Enabled ;
   private int edtPedDto_Enabled ;
   private int edtPrdExiCC_Enabled ;
   private int edtPrdDetPar_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdRec_Enabled ;
   private int edtValCod_Enabled ;
   private int edtPrdPreMed_Enabled ;
   private int edtEmprCod_Enabled ;
   private int edtPedPri_Enabled ;
   private int edtEntPedCum_Enabled ;
   private int GXt_int7 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private int GXv_int21[] ;
   private int GXv_int8[] ;
   private int ZZ658PedCod ;
   private int ZZ413EntConIni ;
   private int ZZ412EntConFin ;
   private int ZZ5469EntNro ;
   private int ZZ795PrvNum ;
   private int ZZ6156EntPrvNum ;
   private int ZZ12716EntFabId ;
   private int GXv_int27[] ;
   private int Gx_cnt ;
   private int E658PedCod ;
   private long Z13235EntLoteID ;
   private long A13235EntLoteID ;
   private long ZZ13235EntLoteID ;
   private java.math.BigDecimal Z419EntUniRem ;
   private java.math.BigDecimal Z417EntPre ;
   private java.math.BigDecimal Z418EntUniEnt ;
   private java.math.BigDecimal Z10782EntUniAlb ;
   private java.math.BigDecimal Z726PrdPreMed ;
   private java.math.BigDecimal Z725PrdPreAnt ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal O724PrdPreAct ;
   private java.math.BigDecimal O750PrdValStk ;
   private java.math.BigDecimal O419EntUniRem ;
   private java.math.BigDecimal O418EntUniEnt ;
   private java.math.BigDecimal O684PrdCanPen ;
   private java.math.BigDecimal O704PrdExiAlm ;
   private java.math.BigDecimal O417EntPre ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal AV46UniOld ;
   private java.math.BigDecimal AV51PrecAnt ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A13833CantPdte ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A10782EntUniAlb ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A660PedDto ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal AV42OldExiAlm ;
   private java.math.BigDecimal AV36OldEntPre ;
   private java.math.BigDecimal AV38OldEntUni ;
   private java.math.BigDecimal AV40OldRemanente ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z684PrdCanPen ;
   private java.math.BigDecimal Z750PrdValStk ;
   private java.math.BigDecimal Z657PedCanEnt ;
   private java.math.BigDecimal Z669PedUni ;
   private java.math.BigDecimal Z665PedPre ;
   private java.math.BigDecimal Z660PedDto ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal Z13833CantPdte ;
   private java.math.BigDecimal ZV38OldEntUni ;
   private java.math.BigDecimal ZV46UniOld ;
   private java.math.BigDecimal ZV42OldExiAlm ;
   private java.math.BigDecimal ZV36OldEntPre ;
   private java.math.BigDecimal ZV51PrecAnt ;
   private java.math.BigDecimal ZV40OldRemanente ;
   private java.math.BigDecimal ZO704PrdExiAlm ;
   private java.math.BigDecimal ZO684PrdCanPen ;
   private java.math.BigDecimal ZO750PrdValStk ;
   private java.math.BigDecimal ZO724PrdPreAct ;
   private java.math.BigDecimal ZZ10782EntUniAlb ;
   private java.math.BigDecimal ZZ704PrdExiAlm ;
   private java.math.BigDecimal ZZ684PrdCanPen ;
   private java.math.BigDecimal ZZ750PrdValStk ;
   private java.math.BigDecimal ZZ726PrdPreMed ;
   private java.math.BigDecimal ZZ725PrdPreAnt ;
   private java.math.BigDecimal ZZ724PrdPreAct ;
   private java.math.BigDecimal ZZ705PrdExiCC ;
   private java.math.BigDecimal ZZ657PedCanEnt ;
   private java.math.BigDecimal ZZ669PedUni ;
   private java.math.BigDecimal ZZ665PedPre ;
   private java.math.BigDecimal ZZ660PedDto ;
   private java.math.BigDecimal ZZ13833CantPdte ;
   private java.math.BigDecimal ZZ417EntPre ;
   private java.math.BigDecimal ZZ418EntUniEnt ;
   private java.math.BigDecimal ZZV38OldEntUni ;
   private java.math.BigDecimal ZZV46UniOld ;
   private java.math.BigDecimal ZZV42OldExiAlm ;
   private java.math.BigDecimal ZZ419EntUniRem ;
   private java.math.BigDecimal ZZV36OldEntPre ;
   private java.math.BigDecimal ZZV51PrecAnt ;
   private java.math.BigDecimal ZZV40OldRemanente ;
   private java.math.BigDecimal ZO419EntUniRem ;
   private java.math.BigDecimal ZO418EntUniEnt ;
   private java.math.BigDecimal ZO417EntPre ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z11Albaran ;
   private String Z12857EntNAlbar ;
   private String Z5686EntLotN ;
   private String Z10783EntObs ;
   private String Z3404EntPedCum ;
   private String Z5691EntBnc ;
   private String Z7695EntCC ;
   private String Z10187EntRemNro ;
   private String Z10185EntRemSuc ;
   private String Z10184EntRemTpo ;
   private String Z13456EntUbicaci ;
   private String Z698PrdDetPar ;
   private String Z718PrdNom ;
   private String Z727PrdRec ;
   private String O5686EntLotN ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV43PedPri ;
   private String A718PrdNom ;
   private String AV76Emprcod ;
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
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String edtPrdNum_Jsonclick ;
   private String edtLinEnt_Internalname ;
   private String edtLinEnt_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtEntFecEnt_Internalname ;
   private String edtEntFecEnt_Jsonclick ;
   private String divAlbaran_cell_Internalname ;
   private String edtAlbaran_Internalname ;
   private String A11Albaran ;
   private String edtAlbaran_Jsonclick ;
   private String divEntnalbar_cell_Internalname ;
   private String edtEntNAlbar_Internalname ;
   private String A12857EntNAlbar ;
   private String edtEntNAlbar_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String sStyleString ;
   private String tblUnnamedtable7_Internalname ;
   private String divUnnamedtablepedcod_Internalname ;
   private String lblTextblockpedcod_Internalname ;
   private String lblTextblockpedcod_Jsonclick ;
   private String edtPedCod_Internalname ;
   private String edtPedCod_Jsonclick ;
   private String imgLpedidprompt_gximage ;
   private String sImgUrl ;
   private String imgLpedidprompt_Internalname ;
   private String imgLpedidprompt_Jsonclick ;
   private String edtEntPrvNum_Internalname ;
   private String edtEntPrvNum_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtEntUniEnt_Internalname ;
   private String edtEntUniEnt_Jsonclick ;
   private String edtEntPre_Internalname ;
   private String edtEntPre_Jsonclick ;
   private String edtEntUniRem_Internalname ;
   private String edtEntUniRem_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtPedCanEnt_Internalname ;
   private String edtPedCanEnt_Jsonclick ;
   private String edtPedUni_Internalname ;
   private String edtPedUni_Jsonclick ;
   private String edtCantPdte_Internalname ;
   private String edtCantPdte_Jsonclick ;
   private String edtPedPre_Internalname ;
   private String edtPedPre_Jsonclick ;
   private String edtPedCum_Internalname ;
   private String A659PedCum ;
   private String edtPedCum_Jsonclick ;
   private String edtPrdCanPen_Internalname ;
   private String edtPrdCanPen_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtEntLotN_Internalname ;
   private String A5686EntLotN ;
   private String edtEntLotN_Jsonclick ;
   private String edtEntFVal_Internalname ;
   private String edtEntFVal_Jsonclick ;
   private String edtEntObs_Internalname ;
   private String A10783EntObs ;
   private String edtEntObs_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEntNumCon_Internalname ;
   private String edtEntNumCon_Jsonclick ;
   private String edtEntEti_Internalname ;
   private String edtEntEti_Jsonclick ;
   private String edtEntCon_Internalname ;
   private String edtEntCon_Jsonclick ;
   private String edtEntConIni_Internalname ;
   private String edtEntConIni_Jsonclick ;
   private String edtEntConFin_Internalname ;
   private String edtEntConFin_Jsonclick ;
   private String edtEntNro_Internalname ;
   private String edtEntNro_Jsonclick ;
   private String edtEntUniAlb_Internalname ;
   private String edtEntUniAlb_Jsonclick ;
   private String edtEntBnc_Internalname ;
   private String A5691EntBnc ;
   private String edtEntBnc_Jsonclick ;
   private String edtPedFec_Internalname ;
   private String edtPedFec_Jsonclick ;
   private String edtPedNumLin_Internalname ;
   private String edtPedNumLin_Jsonclick ;
   private String edtPedSit_Internalname ;
   private String A667PedSit ;
   private String edtPedSit_Jsonclick ;
   private String edtPedFulEnt_Internalname ;
   private String edtPedFulEnt_Jsonclick ;
   private String edtEntCC_Internalname ;
   private String A7695EntCC ;
   private String edtEntCC_Jsonclick ;
   private String edtEntCCoCod_Internalname ;
   private String edtEntCCoCod_Jsonclick ;
   private String edtEntRemNro_Internalname ;
   private String A10187EntRemNro ;
   private String edtEntRemNro_Jsonclick ;
   private String edtEntRemFch_Internalname ;
   private String edtEntRemFch_Jsonclick ;
   private String edtEntRemSuc_Internalname ;
   private String A10185EntRemSuc ;
   private String edtEntRemSuc_Jsonclick ;
   private String edtEntRemTpo_Internalname ;
   private String A10184EntRemTpo ;
   private String edtEntRemTpo_Jsonclick ;
   private String edtEntFabId_Internalname ;
   private String edtEntFabId_Jsonclick ;
   private String edtEntLoteID_Internalname ;
   private String edtEntLoteID_Jsonclick ;
   private String edtEntUbicaci_Internalname ;
   private String A13456EntUbicaci ;
   private String edtEntUbicaci_Jsonclick ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdFulEnt_Internalname ;
   private String edtPrdFulEnt_Jsonclick ;
   private String edtPrdFecPre_Internalname ;
   private String edtPrdFecPre_Jsonclick ;
   private String edtPrdPreAnt_Internalname ;
   private String edtPrdPreAnt_Jsonclick ;
   private String edtPrdPreAct_Internalname ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtPrdValStk_Internalname ;
   private String edtPrdValStk_Jsonclick ;
   private String edtPedDto_Internalname ;
   private String edtPedDto_Jsonclick ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtPrdDetPar_Internalname ;
   private String A698PrdDetPar ;
   private String edtPrdDetPar_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdRec_Internalname ;
   private String A727PrdRec ;
   private String edtPrdRec_Jsonclick ;
   private String edtValCod_Internalname ;
   private String edtValCod_Jsonclick ;
   private String edtPrdPreMed_Internalname ;
   private String edtPrdPreMed_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtPedPri_Internalname ;
   private String A666PedPri ;
   private String edtPedPri_Jsonclick ;
   private String edtEntPedCum_Internalname ;
   private String A3404EntPedCum ;
   private String edtEntPedCum_Jsonclick ;
   private String AV39oldlote ;
   private String AV59PrdNomX ;
   private String AV73PedCum ;
   private String AV9UsurCod ;
   private String AV75Pgmname ;
   private String AV7Station ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV8EmprNom ;
   private String AV65PrdNum ;
   private String Z666PedPri ;
   private String Z667PedSit ;
   private String Z659PedCum ;
   private String sMode42 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i10184EntRemTpo ;
   private String gxwrpcisep ;
   private String GXv_char2[] ;
   private String GXv_char25[] ;
   private String GXv_char24[] ;
   private String GXv_char23[] ;
   private String GXv_char22[] ;
   private String GXv_char20[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String ZV43PedPri ;
   private String ZV39oldlote ;
   private String ZV59PrdNomX ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ11Albaran ;
   private String ZZ12857EntNAlbar ;
   private String ZZ5686EntLotN ;
   private String ZZ10783EntObs ;
   private String ZZ5691EntBnc ;
   private String ZZ7695EntCC ;
   private String ZZ10187EntRemNro ;
   private String ZZ10185EntRemSuc ;
   private String ZZ10184EntRemTpo ;
   private String ZZ13456EntUbicaci ;
   private String ZZ666PedPri ;
   private String ZZ667PedSit ;
   private String ZZV43PedPri ;
   private String ZZ698PrdDetPar ;
   private String ZZ718PrdNom ;
   private String ZZ727PrdRec ;
   private String ZZ659PedCum ;
   private String ZZ3404EntPedCum ;
   private String ZZV39oldlote ;
   private String ZZV59PrdNomX ;
   private String ZO5686EntLotN ;
   private String GXt_char1 ;
   private String GXv_char29[] ;
   private String GXv_char28[] ;
   private String E396EmprCod ;
   private java.util.Date Z415EntFecEnt ;
   private java.util.Date Z5685EntFVal ;
   private java.util.Date Z10186EntRemFch ;
   private java.util.Date Z713PrdFulEnt ;
   private java.util.Date Z709PrdFecPre ;
   private java.util.Date O415EntFecEnt ;
   private java.util.Date AV53LastFec ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date AV52FecAnt ;
   private java.util.Date A5685EntFVal ;
   private java.util.Date A661PedFec ;
   private java.util.Date A663PedFulEnt ;
   private java.util.Date A10186EntRemFch ;
   private java.util.Date A713PrdFulEnt ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date AV37oldEntFecent ;
   private java.util.Date AV63Fecha ;
   private java.util.Date Z661PedFec ;
   private java.util.Date Z663PedFulEnt ;
   private java.util.Date i415EntFecEnt ;
   private java.util.Date GXv_date11[] ;
   private java.util.Date GXv_date19[] ;
   private java.util.Date ZV63Fecha ;
   private java.util.Date ZV37oldEntFecent ;
   private java.util.Date ZV52FecAnt ;
   private java.util.Date ZZ415EntFecEnt ;
   private java.util.Date ZZ5685EntFVal ;
   private java.util.Date ZZ10186EntRemFch ;
   private java.util.Date ZZ661PedFec ;
   private java.util.Date ZZ713PrdFulEnt ;
   private java.util.Date ZZ709PrdFecPre ;
   private java.util.Date ZZ663PedFulEnt ;
   private java.util.Date ZZV63Fecha ;
   private java.util.Date ZZV37oldEntFecent ;
   private java.util.Date ZZV52FecAnt ;
   private java.util.Date ZO415EntFecEnt ;
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
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean Gx_first ;
   private boolean nA658PedCod ;
   private String A13747PrdCDsc ;
   private String A13719PrvNNom ;
   private String h719PrdNum ;
   private String h6156EntPrvNum ;
   private String AV62msg_ctrl_fecha ;
   private String AV35Inc_obs ;
   private String l13747PrdCDsc ;
   private String l13719PrvNNom ;
   private String Zh6156EntPrvNum ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private short[] T01R58_A597LinEnt ;
   private java.math.BigDecimal[] T01R58_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01R58_A684PrdCanPen ;
   private java.math.BigDecimal[] T01R58_A419EntUniRem ;
   private java.math.BigDecimal[] T01R58_A750PrdValStk ;
   private java.math.BigDecimal[] T01R58_A417EntPre ;
   private java.math.BigDecimal[] T01R58_A726PrdPreMed ;
   private java.util.Date[] T01R58_A713PrdFulEnt ;
   private java.util.Date[] T01R58_A709PrdFecPre ;
   private java.math.BigDecimal[] T01R58_A725PrdPreAnt ;
   private java.math.BigDecimal[] T01R58_A724PrdPreAct ;
   private java.math.BigDecimal[] T01R58_A418EntUniEnt ;
   private long[] T01R58_A13235EntLoteID ;
   private java.util.Date[] T01R58_A415EntFecEnt ;
   private String[] T01R58_A11Albaran ;
   private String[] T01R58_A12857EntNAlbar ;
   private int[] T01R58_A6156EntPrvNum ;
   private boolean[] T01R58_n6156EntPrvNum ;
   private String[] T01R58_A5686EntLotN ;
   private java.util.Date[] T01R58_A5685EntFVal ;
   private String[] T01R58_A10783EntObs ;
   private short[] T01R58_A416EntNumCon ;
   private byte[] T01R58_A414EntEti ;
   private byte[] T01R58_A411EntCon ;
   private int[] T01R58_A413EntConIni ;
   private int[] T01R58_A412EntConFin ;
   private int[] T01R58_A5469EntNro ;
   private java.math.BigDecimal[] T01R58_A10782EntUniAlb ;
   private String[] T01R58_A3404EntPedCum ;
   private String[] T01R58_A5691EntBnc ;
   private java.util.Date[] T01R58_A661PedFec ;
   private String[] T01R58_A666PedPri ;
   private String[] T01R58_A667PedSit ;
   private String[] T01R58_A659PedCum ;
   private java.util.Date[] T01R58_A663PedFulEnt ;
   private java.math.BigDecimal[] T01R58_A657PedCanEnt ;
   private java.math.BigDecimal[] T01R58_A669PedUni ;
   private java.math.BigDecimal[] T01R58_A665PedPre ;
   private String[] T01R58_A7695EntCC ;
   private short[] T01R58_A7696EntCCoCod ;
   private String[] T01R58_A10187EntRemNro ;
   private java.util.Date[] T01R58_A10186EntRemFch ;
   private String[] T01R58_A10185EntRemSuc ;
   private String[] T01R58_A10184EntRemTpo ;
   private int[] T01R58_A12716EntFabId ;
   private String[] T01R58_A13456EntUbicaci ;
   private java.math.BigDecimal[] T01R58_A660PedDto ;
   private java.math.BigDecimal[] T01R58_A705PrdExiCC ;
   private String[] T01R58_A698PrdDetPar ;
   private String[] T01R58_A718PrdNom ;
   private String[] T01R58_A727PrdRec ;
   private byte[] T01R58_A14035EntNEmb ;
   private String[] T01R58_A396EmprCod ;
   private String[] T01R58_A719PrdNum ;
   private int[] T01R58_A658PedCod ;
   private boolean[] T01R58_n658PedCod ;
   private int[] T01R58_A795PrvNum ;
   private byte[] T01R58_A856ValCod ;
   private String[] T01R59_A13719PrvNNom ;
   private String[] T01R59_A396EmprCod ;
   private int[] T01R59_A795PrvNum ;
   private String[] T01R510_A13747PrdCDsc ;
   private String[] T01R510_A396EmprCod ;
   private String[] T01R510_A719PrdNum ;
   private String[] T01R511_A13719PrvNNom ;
   private String[] T01R511_A396EmprCod ;
   private int[] T01R511_A795PrvNum ;
   private String[] T01R512_A13747PrdCDsc ;
   private String[] T01R512_A396EmprCod ;
   private String[] T01R512_A719PrdNum ;
   private java.util.Date[] T01R56_A661PedFec ;
   private String[] T01R56_A666PedPri ;
   private String[] T01R56_A667PedSit ;
   private java.math.BigDecimal[] T01R55_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01R55_A684PrdCanPen ;
   private java.math.BigDecimal[] T01R55_A750PrdValStk ;
   private java.math.BigDecimal[] T01R55_A726PrdPreMed ;
   private java.util.Date[] T01R55_A713PrdFulEnt ;
   private java.util.Date[] T01R55_A709PrdFecPre ;
   private java.math.BigDecimal[] T01R55_A725PrdPreAnt ;
   private java.math.BigDecimal[] T01R55_A724PrdPreAct ;
   private java.math.BigDecimal[] T01R55_A705PrdExiCC ;
   private String[] T01R55_A698PrdDetPar ;
   private String[] T01R55_A718PrdNom ;
   private String[] T01R55_A727PrdRec ;
   private int[] T01R55_A795PrvNum ;
   private byte[] T01R55_A856ValCod ;
   private String[] T01R57_A659PedCum ;
   private java.util.Date[] T01R57_A663PedFulEnt ;
   private java.math.BigDecimal[] T01R57_A657PedCanEnt ;
   private java.math.BigDecimal[] T01R57_A669PedUni ;
   private java.math.BigDecimal[] T01R57_A665PedPre ;
   private java.math.BigDecimal[] T01R57_A660PedDto ;
   private String[] T01R513_A13719PrvNNom ;
   private String[] T01R513_A396EmprCod ;
   private int[] T01R513_A795PrvNum ;
   private java.util.Date[] T01R514_A661PedFec ;
   private String[] T01R514_A666PedPri ;
   private String[] T01R514_A667PedSit ;
   private String[] T01R515_A659PedCum ;
   private java.util.Date[] T01R515_A663PedFulEnt ;
   private java.math.BigDecimal[] T01R515_A657PedCanEnt ;
   private java.math.BigDecimal[] T01R515_A669PedUni ;
   private java.math.BigDecimal[] T01R515_A665PedPre ;
   private java.math.BigDecimal[] T01R515_A660PedDto ;
   private String[] T01R516_A396EmprCod ;
   private String[] T01R516_A719PrdNum ;
   private short[] T01R516_A597LinEnt ;
   private short[] T01R53_A597LinEnt ;
   private java.math.BigDecimal[] T01R53_A419EntUniRem ;
   private java.math.BigDecimal[] T01R53_A417EntPre ;
   private java.math.BigDecimal[] T01R53_A418EntUniEnt ;
   private long[] T01R53_A13235EntLoteID ;
   private java.util.Date[] T01R53_A415EntFecEnt ;
   private String[] T01R53_A11Albaran ;
   private String[] T01R53_A12857EntNAlbar ;
   private int[] T01R53_A6156EntPrvNum ;
   private boolean[] T01R53_n6156EntPrvNum ;
   private String[] T01R53_A5686EntLotN ;
   private java.util.Date[] T01R53_A5685EntFVal ;
   private String[] T01R53_A10783EntObs ;
   private short[] T01R53_A416EntNumCon ;
   private byte[] T01R53_A414EntEti ;
   private byte[] T01R53_A411EntCon ;
   private int[] T01R53_A413EntConIni ;
   private int[] T01R53_A412EntConFin ;
   private int[] T01R53_A5469EntNro ;
   private java.math.BigDecimal[] T01R53_A10782EntUniAlb ;
   private String[] T01R53_A3404EntPedCum ;
   private String[] T01R53_A5691EntBnc ;
   private String[] T01R53_A7695EntCC ;
   private short[] T01R53_A7696EntCCoCod ;
   private String[] T01R53_A10187EntRemNro ;
   private java.util.Date[] T01R53_A10186EntRemFch ;
   private String[] T01R53_A10185EntRemSuc ;
   private String[] T01R53_A10184EntRemTpo ;
   private int[] T01R53_A12716EntFabId ;
   private String[] T01R53_A13456EntUbicaci ;
   private byte[] T01R53_A14035EntNEmb ;
   private String[] T01R53_A396EmprCod ;
   private String[] T01R53_A719PrdNum ;
   private int[] T01R53_A658PedCod ;
   private boolean[] T01R53_n658PedCod ;
   private String[] T01R517_A396EmprCod ;
   private String[] T01R517_A719PrdNum ;
   private short[] T01R517_A597LinEnt ;
   private String[] T01R518_A396EmprCod ;
   private String[] T01R518_A719PrdNum ;
   private short[] T01R518_A597LinEnt ;
   private short[] T01R52_A597LinEnt ;
   private java.math.BigDecimal[] T01R52_A419EntUniRem ;
   private java.math.BigDecimal[] T01R52_A417EntPre ;
   private java.math.BigDecimal[] T01R52_A418EntUniEnt ;
   private long[] T01R52_A13235EntLoteID ;
   private java.util.Date[] T01R52_A415EntFecEnt ;
   private String[] T01R52_A11Albaran ;
   private String[] T01R52_A12857EntNAlbar ;
   private int[] T01R52_A6156EntPrvNum ;
   private boolean[] T01R52_n6156EntPrvNum ;
   private String[] T01R52_A5686EntLotN ;
   private java.util.Date[] T01R52_A5685EntFVal ;
   private String[] T01R52_A10783EntObs ;
   private short[] T01R52_A416EntNumCon ;
   private byte[] T01R52_A414EntEti ;
   private byte[] T01R52_A411EntCon ;
   private int[] T01R52_A413EntConIni ;
   private int[] T01R52_A412EntConFin ;
   private int[] T01R52_A5469EntNro ;
   private java.math.BigDecimal[] T01R52_A10782EntUniAlb ;
   private String[] T01R52_A3404EntPedCum ;
   private String[] T01R52_A5691EntBnc ;
   private String[] T01R52_A7695EntCC ;
   private short[] T01R52_A7696EntCCoCod ;
   private String[] T01R52_A10187EntRemNro ;
   private java.util.Date[] T01R52_A10186EntRemFch ;
   private String[] T01R52_A10185EntRemSuc ;
   private String[] T01R52_A10184EntRemTpo ;
   private int[] T01R52_A12716EntFabId ;
   private String[] T01R52_A13456EntUbicaci ;
   private byte[] T01R52_A14035EntNEmb ;
   private String[] T01R52_A396EmprCod ;
   private String[] T01R52_A719PrdNum ;
   private int[] T01R52_A658PedCod ;
   private boolean[] T01R52_n658PedCod ;
   private java.math.BigDecimal[] T01R519_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01R519_A684PrdCanPen ;
   private java.math.BigDecimal[] T01R519_A750PrdValStk ;
   private java.math.BigDecimal[] T01R519_A726PrdPreMed ;
   private java.util.Date[] T01R519_A713PrdFulEnt ;
   private java.util.Date[] T01R519_A709PrdFecPre ;
   private java.math.BigDecimal[] T01R519_A725PrdPreAnt ;
   private java.math.BigDecimal[] T01R519_A724PrdPreAct ;
   private java.math.BigDecimal[] T01R519_A705PrdExiCC ;
   private String[] T01R519_A698PrdDetPar ;
   private String[] T01R519_A718PrdNom ;
   private String[] T01R519_A727PrdRec ;
   private int[] T01R519_A795PrvNum ;
   private byte[] T01R519_A856ValCod ;
   private java.math.BigDecimal[] T01R523_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01R523_A684PrdCanPen ;
   private java.math.BigDecimal[] T01R523_A750PrdValStk ;
   private java.math.BigDecimal[] T01R523_A726PrdPreMed ;
   private java.util.Date[] T01R523_A713PrdFulEnt ;
   private java.util.Date[] T01R523_A709PrdFecPre ;
   private java.math.BigDecimal[] T01R523_A725PrdPreAnt ;
   private java.math.BigDecimal[] T01R523_A724PrdPreAct ;
   private java.math.BigDecimal[] T01R523_A705PrdExiCC ;
   private String[] T01R523_A698PrdDetPar ;
   private String[] T01R523_A718PrdNom ;
   private String[] T01R523_A727PrdRec ;
   private int[] T01R523_A795PrvNum ;
   private byte[] T01R523_A856ValCod ;
   private java.util.Date[] T01R524_A661PedFec ;
   private String[] T01R524_A666PedPri ;
   private String[] T01R524_A667PedSit ;
   private String[] T01R525_A659PedCum ;
   private java.util.Date[] T01R525_A663PedFulEnt ;
   private java.math.BigDecimal[] T01R525_A657PedCanEnt ;
   private java.math.BigDecimal[] T01R525_A669PedUni ;
   private java.math.BigDecimal[] T01R525_A665PedPre ;
   private java.math.BigDecimal[] T01R525_A660PedDto ;
   private String[] T01R527_A396EmprCod ;
   private String[] T01R527_A719PrdNum ;
   private short[] T01R527_A597LinEnt ;
   private String[] T01R528_A13747PrdCDsc ;
   private String[] T01R529_A13719PrvNNom ;
   private String[] T01R530_A13747PrdCDsc ;
   private String[] T01R530_A396EmprCod ;
   private String[] T01R530_A719PrdNum ;
   private String[] T01R531_A13719PrvNNom ;
   private String[] T01R531_A396EmprCod ;
   private int[] T01R531_A795PrvNum ;
   private java.math.BigDecimal[] T01R532_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01R532_A684PrdCanPen ;
   private java.math.BigDecimal[] T01R532_A750PrdValStk ;
   private java.math.BigDecimal[] T01R532_A726PrdPreMed ;
   private java.util.Date[] T01R532_A713PrdFulEnt ;
   private java.util.Date[] T01R532_A709PrdFecPre ;
   private java.math.BigDecimal[] T01R532_A725PrdPreAnt ;
   private java.math.BigDecimal[] T01R532_A724PrdPreAct ;
   private java.math.BigDecimal[] T01R532_A705PrdExiCC ;
   private String[] T01R532_A698PrdDetPar ;
   private String[] T01R532_A718PrdNom ;
   private String[] T01R532_A727PrdRec ;
   private int[] T01R532_A795PrvNum ;
   private byte[] T01R532_A856ValCod ;
   private java.math.BigDecimal[] T01R533_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01R533_A684PrdCanPen ;
   private java.math.BigDecimal[] T01R533_A750PrdValStk ;
   private java.math.BigDecimal[] T01R533_A726PrdPreMed ;
   private java.util.Date[] T01R533_A713PrdFulEnt ;
   private java.util.Date[] T01R533_A709PrdFecPre ;
   private java.math.BigDecimal[] T01R533_A725PrdPreAnt ;
   private java.math.BigDecimal[] T01R533_A724PrdPreAct ;
   private java.math.BigDecimal[] T01R533_A705PrdExiCC ;
   private String[] T01R533_A698PrdDetPar ;
   private String[] T01R533_A718PrdNom ;
   private String[] T01R533_A727PrdRec ;
   private int[] T01R533_A795PrvNum ;
   private byte[] T01R533_A856ValCod ;
   private String[] T01R534_A13719PrvNNom ;
   private String[] T01R534_A396EmprCod ;
   private int[] T01R534_A795PrvNum ;
   private java.util.Date[] T01R535_A661PedFec ;
   private String[] T01R535_A666PedPri ;
   private String[] T01R535_A667PedSit ;
   private String[] T01R536_A659PedCum ;
   private java.util.Date[] T01R536_A663PedFulEnt ;
   private java.math.BigDecimal[] T01R536_A657PedCanEnt ;
   private java.math.BigDecimal[] T01R536_A669PedUni ;
   private java.math.BigDecimal[] T01R536_A665PedPre ;
   private java.math.BigDecimal[] T01R536_A660PedDto ;
   private String[] T01R537_A13719PrvNNom ;
   private String[] T01R537_A396EmprCod ;
   private int[] T01R537_A795PrvNum ;
   private String[] T01R538_A396EmprCod ;
   private int[] T01R538_A658PedCod ;
   private boolean[] T01R538_n658PedCod ;
   private String[] T01R538_A719PrdNum ;
   private String[] T01R538_A659PedCum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] T01R54_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01R54_A684PrdCanPen ;
   private java.math.BigDecimal[] T01R54_A750PrdValStk ;
   private java.math.BigDecimal[] T01R54_A726PrdPreMed ;
   private java.util.Date[] T01R54_A713PrdFulEnt ;
   private java.util.Date[] T01R54_A709PrdFecPre ;
   private java.math.BigDecimal[] T01R54_A725PrdPreAnt ;
   private java.math.BigDecimal[] T01R54_A724PrdPreAct ;
   private java.math.BigDecimal[] T01R54_A705PrdExiCC ;
   private String[] T01R54_A698PrdDetPar ;
   private String[] T01R54_A718PrdNom ;
   private String[] T01R54_A727PrdRec ;
   private int[] T01R54_A795PrvNum ;
   private byte[] T01R54_A856ValCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class entradadeproductosalmacen_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradadeproductosalmacen_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradadeproductosalmacen_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradadeproductosalmacen_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradadeproductosalmacen_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01R52", "SELECT LinEnt, EntUniRem, EntPre, EntUniEnt, EntLoteID, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntUbicaci, EntNEmb, EmprCod, PrdNum, PedCod FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?  FOR UPDATE OF EntUniRem, EntPre, EntUniEnt, EntLoteID, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntUbicaci, EntNEmb, PedCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R53", "SELECT LinEnt, EntUniRem, EntPre, EntUniEnt, EntLoteID, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntUbicaci, EntNEmb, EmprCod, PrdNum, PedCod FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R54", "SELECT PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdExiCC, PrdDetPar, PrdNom, PrdRec, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R55", "SELECT PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdExiCC, PrdDetPar, PrdNom, PrdRec, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R56", "SELECT PedFec, PedPri, PedSit FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R57", "SELECT PedCum, PedFulEnt, PedCanEnt, PedUni, PedPre, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R58", "SELECT /*+ FIRST_ROWS(100) */ TM1.LinEnt, T2.PrdExiAlm, T2.PrdCanPen, TM1.EntUniRem, T2.PrdValStk, TM1.EntPre, T2.PrdPreMed, T2.PrdFulEnt, T2.PrdFecPre, T2.PrdPreAnt, T2.PrdPreAct, TM1.EntUniEnt, TM1.EntLoteID, TM1.EntFecEnt, TM1.Albaran, TM1.EntNAlbar, TM1.EntPrvNum, TM1.EntLotN, TM1.EntFVal, TM1.EntObs, TM1.EntNumCon, TM1.EntEti, TM1.EntCon, TM1.EntConIni, TM1.EntConFin, TM1.EntNro, TM1.EntUniAlb, TM1.EntPedCum, TM1.EntBnc, T3.PedFec, T3.PedPri, T3.PedSit, T4.PedCum, T4.PedFulEnt, T4.PedCanEnt, T4.PedUni, T4.PedPre, TM1.EntCC, TM1.EntCCoCod, TM1.EntRemNro, TM1.EntRemFch, TM1.EntRemSuc, TM1.EntRemTpo, TM1.EntFabId, TM1.EntUbicaci, T4.PedDto, T2.PrdExiCC, T2.PrdDetPar, T2.PrdNom, T2.PrdRec, TM1.EntNEmb, TM1.EmprCod, TM1.PrdNum, TM1.PedCod, T2.PrvNum, T2.ValCod FROM (((TXPENTALM TM1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = TM1.EmprCod AND T2.PrdNum = TM1.PrdNum) LEFT JOIN TXPCPEDID T3 ON T3.EmprCod = TM1.EmprCod AND T3.PedCod = TM1.PedCod) LEFT JOIN TXPLPEDID T4 ON T4.EmprCod = TM1.EmprCod AND T4.PedCod = TM1.PedCod AND T4.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.LinEnt = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R59", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R510", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (EmprCod = ?) AND (PrdNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R511", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R512", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R513", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R514", "SELECT PedFec, PedPri, PedSit FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R515", "SELECT PedCum, PedFulEnt, PedCanEnt, PedUni, PedPre, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R516", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R517", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE ( PrdNum > ? or PrdNum = ? and LinEnt > ?) and EmprCod = ? ORDER BY EmprCod, PrdNum, LinEnt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01R518", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE ( PrdNum < ? or PrdNum = ? and LinEnt < ?) and EmprCod = ? ORDER BY EmprCod DESC, PrdNum DESC, LinEnt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01R519", "SELECT PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdExiCC, PrdDetPar, PrdNom, PrdRec, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01R520", "INSERT INTO TXPENTALM(LinEnt, EntUniRem, EntPre, EntUniEnt, EntLoteID, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntUbicaci, EntNEmb, EmprCod, PrdNum, PedCod, EntHfCon, EntFfCon, EntHiCon, EntFiCon) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPENTALM")
         ,new UpdateCursor("T01R521", "UPDATE TXPENTALM SET EntUniRem=?, EntPre=?, EntUniEnt=?, EntLoteID=?, EntFecEnt=?, Albaran=?, EntNAlbar=?, EntPrvNum=?, EntLotN=?, EntFVal=?, EntObs=?, EntNumCon=?, EntEti=?, EntCon=?, EntConIni=?, EntConFin=?, EntNro=?, EntUniAlb=?, EntPedCum=?, EntBnc=?, EntCC=?, EntCCoCod=?, EntRemNro=?, EntRemFch=?, EntRemSuc=?, EntRemTpo=?, EntFabId=?, EntUbicaci=?, EntNEmb=?, PedCod=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK, "TXPENTALM")
         ,new UpdateCursor("T01R522", "DELETE FROM TXPENTALM  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK, "TXPENTALM")
         ,new ForEachCursor("T01R523", "SELECT PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdExiCC, PrdDetPar, PrdNom, PrdRec, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R524", "SELECT PedFec, PedPri, PedSit FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R525", "SELECT PedCum, PedFulEnt, PedCanEnt, PedUni, PedPre, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01R526", "UPDATE TXPPRODUC SET PrdExiAlm=?, PrdCanPen=?, PrdValStk=?, PrdPreMed=?, PrdFulEnt=?, PrdFecPre=?, PrdPreAnt=?, PrdPreAct=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T01R527", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EmprCod = ? ORDER BY EmprCod, PrdNum, LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R528", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc FROM TXPPRODUC WHERE (UPPER(RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom))) like '%' || UPPER(?)) AND (EmprCod = ?)) WHERE rownum <= 50 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R529", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom FROM TXPPRVGEN WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, '')))) like '%' || UPPER(?))) WHERE rownum <= 50 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R530", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R531", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R532", "SELECT PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdExiCC, PrdDetPar, PrdNom, PrdRec, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R533", "SELECT PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdExiCC, PrdDetPar, PrdNom, PrdRec, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R534", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R535", "SELECT PedFec, PedPri, PedSit FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R536", "SELECT PedCum, PedFulEnt, PedCanEnt, PedUni, PedPre, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R537", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01R538", "SELECT EmprCod, PedCod, PrdNum, PedCum FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? ORDER BY EmprCod, PedCod, PrdNum ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 100);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,4);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((String[]) buf[21])[0] = rslt.getString(21, 10);
               ((String[]) buf[22])[0] = rslt.getString(22, 1);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 12);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 4);
               ((String[]) buf[27])[0] = rslt.getString(27, 4);
               ((int[]) buf[28])[0] = rslt.getInt(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 20);
               ((byte[]) buf[30])[0] = rslt.getByte(30);
               ((String[]) buf[31])[0] = rslt.getString(31, 3);
               ((String[]) buf[32])[0] = rslt.getString(32, 6);
               ((int[]) buf[33])[0] = rslt.getInt(33);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 100);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,4);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((String[]) buf[21])[0] = rslt.getString(21, 10);
               ((String[]) buf[22])[0] = rslt.getString(22, 1);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 12);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 4);
               ((String[]) buf[27])[0] = rslt.getString(27, 4);
               ((int[]) buf[28])[0] = rslt.getInt(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 20);
               ((byte[]) buf[30])[0] = rslt.getByte(30);
               ((String[]) buf[31])[0] = rslt.getString(31, 3);
               ((String[]) buf[32])[0] = rslt.getString(32, 6);
               ((int[]) buf[33])[0] = rslt.getInt(33);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((long[]) buf[12])[0] = rslt.getLong(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 10);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(18, 26);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 100);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((byte[]) buf[22])[0] = rslt.getByte(22);
               ((byte[]) buf[23])[0] = rslt.getByte(23);
               ((int[]) buf[24])[0] = rslt.getInt(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((int[]) buf[26])[0] = rslt.getInt(26);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(27,4);
               ((String[]) buf[28])[0] = rslt.getString(28, 1);
               ((String[]) buf[29])[0] = rslt.getString(29, 10);
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(30);
               ((String[]) buf[31])[0] = rslt.getString(31, 1);
               ((String[]) buf[32])[0] = rslt.getString(32, 1);
               ((String[]) buf[33])[0] = rslt.getString(33, 1);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(34);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(35,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(37,5);
               ((String[]) buf[38])[0] = rslt.getString(38, 1);
               ((short[]) buf[39])[0] = rslt.getShort(39);
               ((String[]) buf[40])[0] = rslt.getString(40, 12);
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDate(41);
               ((String[]) buf[42])[0] = rslt.getString(42, 4);
               ((String[]) buf[43])[0] = rslt.getString(43, 4);
               ((int[]) buf[44])[0] = rslt.getInt(44);
               ((String[]) buf[45])[0] = rslt.getString(45, 20);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(46,2);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(47,4);
               ((String[]) buf[48])[0] = rslt.getString(48, 1);
               ((String[]) buf[49])[0] = rslt.getString(49, 26);
               ((String[]) buf[50])[0] = rslt.getString(50, 1);
               ((byte[]) buf[51])[0] = rslt.getByte(51);
               ((String[]) buf[52])[0] = rslt.getString(52, 3);
               ((String[]) buf[53])[0] = rslt.getString(53, 6);
               ((int[]) buf[54])[0] = rslt.getInt(54);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((int[]) buf[56])[0] = rslt.getInt(55);
               ((byte[]) buf[57])[0] = rslt.getByte(56);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
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
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 21 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 22 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 31 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 33 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 36 :
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
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
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 13 :
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setLong(5, ((Number) parms[4]).longValue());
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
               stmt.setString(10, (String)parms[10], 26);
               stmt.setDate(11, (java.util.Date)parms[11]);
               stmt.setString(12, (String)parms[12], 100);
               stmt.setShort(13, ((Number) parms[13]).shortValue());
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               stmt.setInt(16, ((Number) parms[16]).intValue());
               stmt.setInt(17, ((Number) parms[17]).intValue());
               stmt.setInt(18, ((Number) parms[18]).intValue());
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 4);
               stmt.setString(20, (String)parms[20], 1);
               stmt.setString(21, (String)parms[21], 10);
               stmt.setString(22, (String)parms[22], 1);
               stmt.setShort(23, ((Number) parms[23]).shortValue());
               stmt.setString(24, (String)parms[24], 12);
               stmt.setDate(25, (java.util.Date)parms[25]);
               stmt.setString(26, (String)parms[26], 4);
               stmt.setString(27, (String)parms[27], 4);
               stmt.setInt(28, ((Number) parms[28]).intValue());
               stmt.setString(29, (String)parms[29], 20);
               stmt.setByte(30, ((Number) parms[30]).byteValue());
               stmt.setString(31, (String)parms[31], 3);
               stmt.setString(32, (String)parms[32], 6);
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(33, ((Number) parms[34]).intValue());
               }
               return;
            case 19 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setLong(4, ((Number) parms[3]).longValue());
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
               stmt.setString(9, (String)parms[9], 26);
               stmt.setDate(10, (java.util.Date)parms[10]);
               stmt.setString(11, (String)parms[11], 100);
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setByte(13, ((Number) parms[13]).byteValue());
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setInt(15, ((Number) parms[15]).intValue());
               stmt.setInt(16, ((Number) parms[16]).intValue());
               stmt.setInt(17, ((Number) parms[17]).intValue());
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[18], 4);
               stmt.setString(19, (String)parms[19], 1);
               stmt.setString(20, (String)parms[20], 10);
               stmt.setString(21, (String)parms[21], 1);
               stmt.setShort(22, ((Number) parms[22]).shortValue());
               stmt.setString(23, (String)parms[23], 12);
               stmt.setDate(24, (java.util.Date)parms[24]);
               stmt.setString(25, (String)parms[25], 4);
               stmt.setString(26, (String)parms[26], 4);
               stmt.setInt(27, ((Number) parms[27]).intValue());
               stmt.setString(28, (String)parms[28], 20);
               stmt.setByte(29, ((Number) parms[29]).byteValue());
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[31]).intValue());
               }
               stmt.setString(31, (String)parms[32], 3);
               stmt.setString(32, (String)parms[33], 6);
               stmt.setShort(33, ((Number) parms[34]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 22 :
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
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 24 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 6);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 50);
               return;
            case 28 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 29 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 32 :
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
            case 33 :
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
            case 34 :
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
            case 35 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 36 :
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

