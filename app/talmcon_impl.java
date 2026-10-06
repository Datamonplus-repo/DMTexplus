package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talmcon_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action39") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A8661Almc_Ln = (int)(GXutil.lval( httpContext.GetPar( "Almc_Ln"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_39_12G1184( Gx_mode, A396EmprCod, A719PrdNum, A8661Almc_Ln) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action49") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A8672Almc_Prov = (int)(GXutil.lval( httpContext.GetPar( "Almc_Prov"))) ;
         n8672Almc_Prov = false ;
         A8664Almc_Pre = CommonUtil.decimalVal( httpContext.GetPar( "Almc_Pre"), ".") ;
         n8664Almc_Pre = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_49_12G1184( A396EmprCod, A719PrdNum, A8672Almc_Prov, A8664Almc_Pre) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action50") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8672Almc_Prov = (int)(GXutil.lval( httpContext.GetPar( "Almc_Prov"))) ;
         n8672Almc_Prov = false ;
         AV16Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         AV21Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         A8663Almc_UniE = CommonUtil.decimalVal( httpContext.GetPar( "Almc_UniE"), ".") ;
         n8663Almc_UniE = false ;
         AV28UniOld = CommonUtil.decimalVal( httpContext.GetPar( "UniOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         A8664Almc_Pre = CommonUtil.decimalVal( httpContext.GetPar( "Almc_Pre"), ".") ;
         n8664Almc_Pre = false ;
         AV62AnyAnt = (short)(GXutil.lval( httpContext.GetPar( "AnyAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         AV63MesAnt = (byte)(GXutil.lval( httpContext.GetPar( "MesAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         AV64PrecAnt = CommonUtil.decimalVal( httpContext.GetPar( "PrecAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         A8666ALmc_Fec = localUtil.parseDateParm( httpContext.GetPar( "ALmc_Fec")) ;
         n8666ALmc_Fec = false ;
         AV65FecAnt = localUtil.parseDateParm( httpContext.GetPar( "FecAnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         AV60Modo2 = httpContext.GetPar( "Modo2") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_50_12G1184( Gx_mode, A396EmprCod, A8672Almc_Prov, AV16Year, AV21Mes, A8663Almc_UniE, AV28UniOld, A8664Almc_Pre, AV62AnyAnt, AV63MesAnt, AV64PrecAnt, A8666ALmc_Fec, AV65FecAnt, AV60Modo2) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action51") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8672Almc_Prov = (int)(GXutil.lval( httpContext.GetPar( "Almc_Prov"))) ;
         n8672Almc_Prov = false ;
         AV16Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         AV21Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         A8663Almc_UniE = CommonUtil.decimalVal( httpContext.GetPar( "Almc_UniE"), ".") ;
         n8663Almc_UniE = false ;
         AV28UniOld = CommonUtil.decimalVal( httpContext.GetPar( "UniOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         A8664Almc_Pre = CommonUtil.decimalVal( httpContext.GetPar( "Almc_Pre"), ".") ;
         n8664Almc_Pre = false ;
         AV62AnyAnt = (short)(GXutil.lval( httpContext.GetPar( "AnyAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         AV63MesAnt = (byte)(GXutil.lval( httpContext.GetPar( "MesAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         AV64PrecAnt = CommonUtil.decimalVal( httpContext.GetPar( "PrecAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         A8666ALmc_Fec = localUtil.parseDateParm( httpContext.GetPar( "ALmc_Fec")) ;
         n8666ALmc_Fec = false ;
         AV65FecAnt = localUtil.parseDateParm( httpContext.GetPar( "FecAnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         AV60Modo2 = httpContext.GetPar( "Modo2") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_51_12G1184( Gx_mode, A396EmprCod, A8672Almc_Prov, AV16Year, AV21Mes, A8663Almc_UniE, AV28UniOld, A8664Almc_Pre, AV62AnyAnt, AV63MesAnt, AV64PrecAnt, A8666ALmc_Fec, AV65FecAnt, AV60Modo2) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action52") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8672Almc_Prov = (int)(GXutil.lval( httpContext.GetPar( "Almc_Prov"))) ;
         n8672Almc_Prov = false ;
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = httpContext.GetPar( "PrdNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         AV16Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         AV21Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         A8663Almc_UniE = CommonUtil.decimalVal( httpContext.GetPar( "Almc_UniE"), ".") ;
         n8663Almc_UniE = false ;
         AV28UniOld = CommonUtil.decimalVal( httpContext.GetPar( "UniOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         A8664Almc_Pre = CommonUtil.decimalVal( httpContext.GetPar( "Almc_Pre"), ".") ;
         n8664Almc_Pre = false ;
         AV62AnyAnt = (short)(GXutil.lval( httpContext.GetPar( "AnyAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         AV63MesAnt = (byte)(GXutil.lval( httpContext.GetPar( "MesAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         AV64PrecAnt = CommonUtil.decimalVal( httpContext.GetPar( "PrecAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         A8666ALmc_Fec = localUtil.parseDateParm( httpContext.GetPar( "ALmc_Fec")) ;
         n8666ALmc_Fec = false ;
         AV65FecAnt = localUtil.parseDateParm( httpContext.GetPar( "FecAnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         AV60Modo2 = httpContext.GetPar( "Modo2") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_52_12G1184( Gx_mode, A396EmprCod, A8672Almc_Prov, A719PrdNum, A718PrdNom, AV16Year, AV21Mes, A8663Almc_UniE, AV28UniOld, A8664Almc_Pre, AV62AnyAnt, AV63MesAnt, AV64PrecAnt, A8666ALmc_Fec, AV65FecAnt, AV60Modo2) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action53") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8672Almc_Prov = (int)(GXutil.lval( httpContext.GetPar( "Almc_Prov"))) ;
         n8672Almc_Prov = false ;
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = httpContext.GetPar( "PrdNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         AV16Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         AV21Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         A8663Almc_UniE = CommonUtil.decimalVal( httpContext.GetPar( "Almc_UniE"), ".") ;
         n8663Almc_UniE = false ;
         AV28UniOld = CommonUtil.decimalVal( httpContext.GetPar( "UniOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         A8664Almc_Pre = CommonUtil.decimalVal( httpContext.GetPar( "Almc_Pre"), ".") ;
         n8664Almc_Pre = false ;
         AV62AnyAnt = (short)(GXutil.lval( httpContext.GetPar( "AnyAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         AV63MesAnt = (byte)(GXutil.lval( httpContext.GetPar( "MesAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         AV64PrecAnt = CommonUtil.decimalVal( httpContext.GetPar( "PrecAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         A8666ALmc_Fec = localUtil.parseDateParm( httpContext.GetPar( "ALmc_Fec")) ;
         n8666ALmc_Fec = false ;
         AV65FecAnt = localUtil.parseDateParm( httpContext.GetPar( "FecAnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         AV60Modo2 = httpContext.GetPar( "Modo2") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_53_12G1184( Gx_mode, A396EmprCod, A8672Almc_Prov, A719PrdNum, A718PrdNom, AV16Year, AV21Mes, A8663Almc_UniE, AV28UniOld, A8664Almc_Pre, AV62AnyAnt, AV63MesAnt, AV64PrecAnt, A8666ALmc_Fec, AV65FecAnt, AV60Modo2) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action54") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         AV16Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         AV21Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         A8663Almc_UniE = CommonUtil.decimalVal( httpContext.GetPar( "Almc_UniE"), ".") ;
         n8663Almc_UniE = false ;
         AV28UniOld = CommonUtil.decimalVal( httpContext.GetPar( "UniOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         A8664Almc_Pre = CommonUtil.decimalVal( httpContext.GetPar( "Almc_Pre"), ".") ;
         n8664Almc_Pre = false ;
         AV62AnyAnt = (short)(GXutil.lval( httpContext.GetPar( "AnyAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         AV63MesAnt = (byte)(GXutil.lval( httpContext.GetPar( "MesAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         AV64PrecAnt = CommonUtil.decimalVal( httpContext.GetPar( "PrecAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         A8666ALmc_Fec = localUtil.parseDateParm( httpContext.GetPar( "ALmc_Fec")) ;
         n8666ALmc_Fec = false ;
         AV65FecAnt = localUtil.parseDateParm( httpContext.GetPar( "FecAnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         AV60Modo2 = httpContext.GetPar( "Modo2") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_54_12G1184( Gx_mode, A396EmprCod, A719PrdNum, AV16Year, AV21Mes, A8663Almc_UniE, AV28UniOld, A8664Almc_Pre, AV62AnyAnt, AV63MesAnt, AV64PrecAnt, A8666ALmc_Fec, AV65FecAnt, AV60Modo2) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action55") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         AV16Year = (short)(GXutil.lval( httpContext.GetPar( "Year"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         AV21Mes = (byte)(GXutil.lval( httpContext.GetPar( "Mes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         A8663Almc_UniE = CommonUtil.decimalVal( httpContext.GetPar( "Almc_UniE"), ".") ;
         n8663Almc_UniE = false ;
         AV28UniOld = CommonUtil.decimalVal( httpContext.GetPar( "UniOld"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         A8664Almc_Pre = CommonUtil.decimalVal( httpContext.GetPar( "Almc_Pre"), ".") ;
         n8664Almc_Pre = false ;
         AV62AnyAnt = (short)(GXutil.lval( httpContext.GetPar( "AnyAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         AV63MesAnt = (byte)(GXutil.lval( httpContext.GetPar( "MesAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         AV64PrecAnt = CommonUtil.decimalVal( httpContext.GetPar( "PrecAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         A8666ALmc_Fec = localUtil.parseDateParm( httpContext.GetPar( "ALmc_Fec")) ;
         n8666ALmc_Fec = false ;
         AV65FecAnt = localUtil.parseDateParm( httpContext.GetPar( "FecAnt")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         AV60Modo2 = httpContext.GetPar( "Modo2") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_55_12G1184( Gx_mode, A396EmprCod, A719PrdNum, AV16Year, AV21Mes, A8663Almc_UniE, AV28UniOld, A8664Almc_Pre, AV62AnyAnt, AV63MesAnt, AV64PrecAnt, A8666ALmc_Fec, AV65FecAnt, AV60Modo2) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action56") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8672Almc_Prov = (int)(GXutil.lval( httpContext.GetPar( "Almc_Prov"))) ;
         n8672Almc_Prov = false ;
         A8666ALmc_Fec = localUtil.parseDateParm( httpContext.GetPar( "ALmc_Fec")) ;
         n8666ALmc_Fec = false ;
         A8663Almc_UniE = CommonUtil.decimalVal( httpContext.GetPar( "Almc_UniE"), ".") ;
         n8663Almc_UniE = false ;
         A8664Almc_Pre = CommonUtil.decimalVal( httpContext.GetPar( "Almc_Pre"), ".") ;
         n8664Almc_Pre = false ;
         A8661Almc_Ln = (int)(GXutil.lval( httpContext.GetPar( "Almc_Ln"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_56_12G1184( Gx_mode, A396EmprCod, A8672Almc_Prov, A8666ALmc_Fec, A8663Almc_UniE, A8664Almc_Pre, A8661Almc_Ln) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action57") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8672Almc_Prov = (int)(GXutil.lval( httpContext.GetPar( "Almc_Prov"))) ;
         n8672Almc_Prov = false ;
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = httpContext.GetPar( "PrdNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A8666ALmc_Fec = localUtil.parseDateParm( httpContext.GetPar( "ALmc_Fec")) ;
         n8666ALmc_Fec = false ;
         A8663Almc_UniE = CommonUtil.decimalVal( httpContext.GetPar( "Almc_UniE"), ".") ;
         n8663Almc_UniE = false ;
         A8664Almc_Pre = CommonUtil.decimalVal( httpContext.GetPar( "Almc_Pre"), ".") ;
         n8664Almc_Pre = false ;
         A8661Almc_Ln = (int)(GXutil.lval( httpContext.GetPar( "Almc_Ln"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_57_12G1184( Gx_mode, A396EmprCod, A8672Almc_Prov, A719PrdNum, A718PrdNom, A8666ALmc_Fec, A8663Almc_UniE, A8664Almc_Pre, A8661Almc_Ln) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action58") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A8666ALmc_Fec = localUtil.parseDateParm( httpContext.GetPar( "ALmc_Fec")) ;
         n8666ALmc_Fec = false ;
         A8663Almc_UniE = CommonUtil.decimalVal( httpContext.GetPar( "Almc_UniE"), ".") ;
         n8663Almc_UniE = false ;
         A8664Almc_Pre = CommonUtil.decimalVal( httpContext.GetPar( "Almc_Pre"), ".") ;
         n8664Almc_Pre = false ;
         A8661Almc_Ln = (int)(GXutil.lval( httpContext.GetPar( "Almc_Ln"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_58_12G1184( Gx_mode, A396EmprCod, A719PrdNum, A8666ALmc_Fec, A8663Almc_UniE, A8664Almc_Pre, A8661Almc_Ln) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action59") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A8661Almc_Ln = (int)(GXutil.lval( httpContext.GetPar( "Almc_Ln"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_59_12G1184( Gx_mode, A396EmprCod, A719PrdNum, A8661Almc_Ln) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action60") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         AV56vPrecio = CommonUtil.decimalVal( httpContext.GetPar( "vPrecio"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56vPrecio", GXutil.ltrimstr( AV56vPrecio, 14, 5));
         A8661Almc_Ln = (int)(GXutil.lval( httpContext.GetPar( "Almc_Ln"))) ;
         A8663Almc_UniE = CommonUtil.decimalVal( httpContext.GetPar( "Almc_UniE"), ".") ;
         n8663Almc_UniE = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_60_12G1184( Gx_mode, A396EmprCod, A719PrdNum, AV56vPrecio, A8661Almc_Ln, A8663Almc_UniE) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action61") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12578Almc_Ped = (int)(GXutil.lval( httpContext.GetPar( "Almc_Ped"))) ;
         n12578Almc_Ped = false ;
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A8663Almc_UniE = CommonUtil.decimalVal( httpContext.GetPar( "Almc_UniE"), ".") ;
         n8663Almc_UniE = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_61_12G1184( A396EmprCod, A12578Almc_Ped, A719PrdNum, A8663Almc_UniE) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"ULTFECCCS") == 0 )
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
         gx2asaultfecccs12G29( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel26"+"_"+"vPRDNOMX") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8672Almc_Prov = (int)(GXutil.lval( httpContext.GetPar( "Almc_Prov"))) ;
         n8672Almc_Prov = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx26asaprdnomx12G1184( A396EmprCod, A8672Almc_Prov) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_64") == 0 )
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
         gxload_64( A396EmprCod, A795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_65") == 0 )
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
         gxload_65( A396EmprCod, A856ValCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
      {
         gxnrgrid1_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ALMACEN EN CONSIGNA", ""), (short)(0)) ;
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

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_85 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_85"))) ;
      nGXsfl_85_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_85_idx"))) ;
      sGXsfl_85_idx = httpContext.GetPar( "sGXsfl_85_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public talmcon_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talmcon_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talmcon_impl.class ));
   }

   public talmcon_impl( int remoteHandle ,
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 5,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "ProductoID", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "ProveedorID", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom), GXutil.rtrim( localUtil.format( A794PrvNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom_Jsonclick, 0, "", "", "", "", "", 1, edtPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Validez", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtValCod_Internalname, GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValCod_Jsonclick, 0, "", "", "", "", "", 1, edtValCod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Control en Recuento", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRec_Internalname, GXutil.rtrim( A727PrdRec), GXutil.rtrim( localUtil.format( A727PrdRec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRec_Jsonclick, 0, "", "", "", "", "", 1, edtPrdRec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Existencias Almacen en Consgin", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlmc_Internalname, GXutil.ltrim( localUtil.ntoc( A8659PrdExiAlmc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlmc_Enabled!=0) ? localUtil.format( A8659PrdExiAlmc, "ZZZZZZ9.9999") : localUtil.format( A8659PrdExiAlmc, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlmc_Jsonclick, 0, "", "", "", "", "", 1, edtPrdExiAlmc_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Existencia Cuarto Color", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCC_Jsonclick, 0, "", "", "", "", "", 1, edtPrdExiCC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlmc_Ult_Internalname, GXutil.ltrim( localUtil.ntoc( A8660Almc_Ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlmc_Ult_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8660Almc_Ult), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8660Almc_Ult), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmc_Ult_Jsonclick, 0, "", "", "", "", "", 1, edtAlmc_Ult_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Ultimo valor Fecha,Entradas", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtUltFecCCs_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUltFecCCs_Internalname, localUtil.format(A3835UltFecCCs, "99/99/99"), localUtil.format( A3835UltFecCCs, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUltFecCCs_Jsonclick, 0, "", "", "", "", "", 1, edtUltFecCCs_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMCON.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtUltFecCCs_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtUltFecCCs_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALMCON.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Unidades por Contenedor", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumUco_Internalname, GXutil.ltrim( localUtil.ntoc( A721PrdNumUco, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdNumUco_Enabled!=0) ? localUtil.format( A721PrdNumUco, "ZZZ9.99") : localUtil.format( A721PrdNumUco, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumUco_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNumUco_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol85( ) ;
      nGXsfl_85_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1184 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1184 = (short)(1) ;
            scanStart12G1184( ) ;
            while ( RcdFound1184 != 0 )
            {
               init_level_properties1184( ) ;
               getByPrimaryKey12G1184( ) ;
               addRow12G1184( ) ;
               scanNext12G1184( ) ;
            }
            scanEnd12G1184( ) ;
            nBlankRcdCount1184 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B8659PrdExiAlmc = A8659PrdExiAlmc ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         standaloneNotModal12G1184( ) ;
         standaloneModal12G1184( ) ;
         sMode1184 = Gx_mode ;
         while ( nGXsfl_85_idx < nRC_GXsfl_85 )
         {
            bGXsfl_85_Refreshing = true ;
            readRow12G1184( ) ;
            edtavnRcdDeleted_1184_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1184_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1184_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1184_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAlmc_Ln_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_LN_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Ln_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAlmc_alb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_ALB_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlmc_alb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_alb_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAlmc_UniE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_UNIE_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlmc_UniE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_UniE_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAlmc_Pre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_PRE_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Pre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Pre_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAlmc_Rem_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_REM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Rem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Rem_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtALmc_Fec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_FEC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtALmc_Fec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALmc_Fec_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAlmc_Con_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_CON_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Con_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Con_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAlmc_Prov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_PROV_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Prov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Prov_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAlmc_Ped_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_PED_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Ped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Ped_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAlmc_Cum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_CUM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Cum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Cum_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAlmc_Lote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_LOTE_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Lote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Lote_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtAlmc_Nct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_NCT_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Nct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Nct_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            if ( ( nRcdExists_1184 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal12G1184( ) ;
            }
            sendRow12G1184( ) ;
            bGXsfl_85_Refreshing = false ;
         }
         Gx_mode = sMode1184 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A8659PrdExiAlmc = B8659PrdExiAlmc ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1184 = (short)(5) ;
         nRcdExists_1184 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart12G1184( ) ;
            while ( RcdFound1184 != 0 )
            {
               sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_851184( ) ;
               init_level_properties1184( ) ;
               standaloneNotModal12G1184( ) ;
               getByPrimaryKey12G1184( ) ;
               standaloneModal12G1184( ) ;
               addRow12G1184( ) ;
               scanNext12G1184( ) ;
            }
            scanEnd12G1184( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1184 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_851184( ) ;
      initAll12G1184( ) ;
      init_level_properties1184( ) ;
      B8659PrdExiAlmc = A8659PrdExiAlmc ;
      httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
      nRcdExists_1184 = (short)(0) ;
      nIsMod_1184 = (short)(0) ;
      nRcdDeleted_1184 = (short)(0) ;
      nBlankRcdCount1184 = (short)(nBlankRcdUsr1184+nBlankRcdCount1184) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1184 > 0 )
      {
         standaloneNotModal12G1184( ) ;
         standaloneModal12G1184( ) ;
         addRow12G1184( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAlmc_alb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1184 = (short)(nBlankRcdCount1184-1) ;
      }
      Gx_mode = sMode1184 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A8659PrdExiAlmc = B8659PrdExiAlmc ;
      httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
      }
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMCON.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TALMCON.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
         Z727PrdRec = httpContext.cgiGet( "Z727PrdRec") ;
         Z8659PrdExiAlmc = localUtil.ctond( httpContext.cgiGet( "Z8659PrdExiAlmc")) ;
         Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
         Z8660Almc_Ult = (int)(localUtil.ctol( httpContext.cgiGet( "Z8660Almc_Ult"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z721PrdNumUco = localUtil.ctond( httpContext.cgiGet( "Z721PrdNumUco")) ;
         Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z856ValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8659PrdExiAlmc = localUtil.ctond( httpContext.cgiGet( "O8659PrdExiAlmc")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_85 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_85"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV59Modo = httpContext.cgiGet( "MODO") ;
         AV68OldExiAlm = localUtil.ctond( httpContext.cgiGet( "OLDEXIALM")) ;
         AV59Modo = httpContext.cgiGet( "vMODO") ;
         AV23UsurCod = httpContext.cgiGet( "vUSURCOD") ;
         AV68OldExiAlm = localUtil.ctond( httpContext.cgiGet( "vOLDEXIALM")) ;
         Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV60Modo2 = httpContext.cgiGet( "vMODO2") ;
         AV16Year = (short)(localUtil.ctol( httpContext.cgiGet( "vYEAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV21Mes = (byte)(localUtil.ctol( httpContext.cgiGet( "vMES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV69OldEntPre = localUtil.ctond( httpContext.cgiGet( "vOLDENTPRE")) ;
         AV70OldEntUni = localUtil.ctond( httpContext.cgiGet( "vOLDENTUNI")) ;
         AV89PrdNomX = httpContext.cgiGet( "vPRDNOMX") ;
         AV28UniOld = localUtil.ctond( httpContext.cgiGet( "vUNIOLD")) ;
         AV65FecAnt = localUtil.ctod( httpContext.cgiGet( "vFECANT"), 0) ;
         AV64PrecAnt = localUtil.ctond( httpContext.cgiGet( "vPRECANT")) ;
         AV62AnyAnt = (short)(localUtil.ctol( httpContext.cgiGet( "vANYANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV63MesAnt = (byte)(localUtil.ctol( httpContext.cgiGet( "vMESANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV19Fecha = localUtil.ctod( httpContext.cgiGet( "vFECHA"), 0) ;
         AV56vPrecio = localUtil.ctond( httpContext.cgiGet( "vVPRECIO")) ;
         AV20DiasFin = (short)(localUtil.ctol( httpContext.cgiGet( "vDIASFIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV76FlagPre = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGPRE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrvNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A795PrvNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         }
         else
         {
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         }
         A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
         n794PrvNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VALCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtValCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A856ValCod = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         }
         else
         {
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         }
         A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A8659PrdExiAlmc = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlmc_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXICC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdExiCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A705PrdExiCC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         }
         else
         {
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlmc_Ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlmc_Ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALMC_ULT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlmc_Ult_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8660Almc_Ult = 0 ;
            n8660Almc_Ult = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8660Almc_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8660Almc_Ult), 6, 0));
         }
         else
         {
            A8660Almc_Ult = (int)(localUtil.ctol( httpContext.cgiGet( edtAlmc_Ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8660Almc_Ult = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8660Almc_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8660Almc_Ult), 6, 0));
         }
         A3835UltFecCCs = localUtil.ctod( httpContext.cgiGet( edtUltFecCCs_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdNumUco_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdNumUco_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDNUMUCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdNumUco_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A721PrdNumUco = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         }
         else
         {
            A721PrdNumUco = localUtil.ctond( httpContext.cgiGet( edtPrdNumUco_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TALMCON");
         forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV59Modo, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("talmcon:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "GET") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_get( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_check( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                        /* No code required for Help button. It is implemented at the Browser level. */
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll12G29( ) ;
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
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1184_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1184_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      bttBtn_get_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes12G29( ) ;
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

   public void confirm_12G0( )
   {
      beforeValidate12G29( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls12G29( ) ;
         }
         else
         {
            checkExtendedTable12G29( ) ;
            if ( AnyError == 0 )
            {
               zm12G29( 63) ;
               zm12G29( 64) ;
               zm12G29( 65) ;
            }
            closeExtendedTableCursors12G29( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode29 = Gx_mode ;
         confirm_12G1184( ) ;
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
      if ( AnyError == 0 )
      {
         confirmValues12G0( ) ;
      }
   }

   public void confirm_12G1184( )
   {
      s8659PrdExiAlmc = O8659PrdExiAlmc ;
      httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
      sV68OldExiAlm = OV68OldExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow12G1184( ) ;
         if ( ( nRcdExists_1184 != 0 ) || ( nIsMod_1184 != 0 ) )
         {
            getKey12G1184( ) ;
            if ( ( nRcdExists_1184 == 0 ) && ( nRcdDeleted_1184 == 0 ) )
            {
               if ( RcdFound1184 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate12G1184( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable12G1184( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors12G1184( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O8659PrdExiAlmc = A8659PrdExiAlmc ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
                     OV68OldExiAlm = AV68OldExiAlm ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "PRDNUM");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1184 != 0 )
               {
                  if ( nRcdDeleted_1184 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey12G1184( ) ;
                     load12G1184( ) ;
                     beforeValidate12G1184( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls12G1184( ) ;
                        O8659PrdExiAlmc = A8659PrdExiAlmc ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
                        OV68OldExiAlm = AV68OldExiAlm ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1184 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate12G1184( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable12G1184( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors12G1184( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O8659PrdExiAlmc = A8659PrdExiAlmc ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
                           OV68OldExiAlm = AV68OldExiAlm ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1184 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PRDNUM");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1184_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1184, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_Ln_Internalname, GXutil.ltrim( localUtil.ntoc( A8661Almc_Ln, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_alb_Internalname, GXutil.rtrim( A8662Almc_alb)) ;
         httpContext.changePostValue( edtAlmc_UniE_Internalname, GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_Pre_Internalname, GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_Rem_Internalname, GXutil.ltrim( localUtil.ntoc( A8665Almc_Rem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALmc_Fec_Internalname, localUtil.format(A8666ALmc_Fec, "99/99/99")) ;
         httpContext.changePostValue( edtAlmc_Con_Internalname, GXutil.ltrim( localUtil.ntoc( A8667Almc_Con, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_Prov_Internalname, GXutil.ltrim( localUtil.ntoc( A8672Almc_Prov, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_Ped_Internalname, GXutil.ltrim( localUtil.ntoc( A12578Almc_Ped, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_Cum_Internalname, GXutil.rtrim( A12579Almc_Cum)) ;
         httpContext.changePostValue( edtAlmc_Lote_Internalname, GXutil.rtrim( A12643Almc_Lote)) ;
         httpContext.changePostValue( edtAlmc_Nct_Internalname, GXutil.ltrim( localUtil.ntoc( A12849Almc_Nct, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8661Almc_Ln_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8661Almc_Ln, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8666ALmc_Fec_"+sGXsfl_85_idx, localUtil.dtoc( Z8666ALmc_Fec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8667Almc_Con_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8667Almc_Con, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8665Almc_Rem_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8665Almc_Rem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8662Almc_alb_"+sGXsfl_85_idx, GXutil.rtrim( Z8662Almc_alb)) ;
         httpContext.changePostValue( "ZT_"+"Z8663Almc_UniE_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8663Almc_UniE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8664Almc_Pre_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8664Almc_Pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8672Almc_Prov_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8672Almc_Prov, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12578Almc_Ped_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z12578Almc_Ped, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12579Almc_Cum_"+sGXsfl_85_idx, GXutil.rtrim( Z12579Almc_Cum)) ;
         httpContext.changePostValue( "ZT_"+"Z12643Almc_Lote_"+sGXsfl_85_idx, GXutil.rtrim( Z12643Almc_Lote)) ;
         httpContext.changePostValue( "ZT_"+"Z12849Almc_Nct_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z12849Almc_Nct, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T8666ALmc_Fec_"+sGXsfl_85_idx, localUtil.dtoc( O8666ALmc_Fec, 0, "/")) ;
         httpContext.changePostValue( "T8664Almc_Pre_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O8664Almc_Pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T8663Almc_UniE_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O8663Almc_UniE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T8665Almc_Rem_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O8665Almc_Rem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1184_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1184, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1184_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1184, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1184_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1184, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1184 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1184_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1184_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_LN_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Ln_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_ALB_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_alb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_UNIE_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_UniE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_PRE_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Pre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_REM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Rem_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_FEC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALmc_Fec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_CON_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Con_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_PROV_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Prov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_PED_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Ped_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_CUM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Cum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_LOTE_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Lote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_NCT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Nct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O8659PrdExiAlmc = s8659PrdExiAlmc ;
      httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
      OV68OldExiAlm = sV68OldExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption12G0( )
   {
   }

   public void zm12G29( int GX_JID )
   {
      if ( ( GX_JID == 62 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z718PrdNom = T012G5_A718PrdNom[0] ;
            Z727PrdRec = T012G5_A727PrdRec[0] ;
            Z8659PrdExiAlmc = T012G5_A8659PrdExiAlmc[0] ;
            Z705PrdExiCC = T012G5_A705PrdExiCC[0] ;
            Z8660Almc_Ult = T012G5_A8660Almc_Ult[0] ;
            Z721PrdNumUco = T012G5_A721PrdNumUco[0] ;
            Z795PrvNum = T012G5_A795PrvNum[0] ;
            Z856ValCod = T012G5_A856ValCod[0] ;
         }
         else
         {
            Z718PrdNom = A718PrdNom ;
            Z727PrdRec = A727PrdRec ;
            Z8659PrdExiAlmc = A8659PrdExiAlmc ;
            Z705PrdExiCC = A705PrdExiCC ;
            Z8660Almc_Ult = A8660Almc_Ult ;
            Z721PrdNumUco = A721PrdNumUco ;
            Z795PrvNum = A795PrvNum ;
            Z856ValCod = A856ValCod ;
         }
      }
      if ( GX_JID == -62 )
      {
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z727PrdRec = A727PrdRec ;
         Z8659PrdExiAlmc = A8659PrdExiAlmc ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z8660Almc_Ult = A8660Almc_Ult ;
         Z721PrdNumUco = A721PrdNumUco ;
         Z396EmprCod = A396EmprCod ;
         Z795PrvNum = A795PrvNum ;
         Z856ValCod = A856ValCod ;
         Z407EmprNom = A407EmprNom ;
         Z794PrvNom = A794PrvNom ;
      }
   }

   public void standaloneNotModal( )
   {
      if ( 1 < 0 )
      {
         AV23UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
      }
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
      edtPrdExiAlmc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlmc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlmc_Enabled), 5, 0), true);
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
      edtPrdExiAlmc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlmc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlmc_Enabled), 5, 0), true);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         AV59Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59Modo", AV59Modo);
      }
      else
      {
         if ( isUpd( )  )
         {
            AV59Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59Modo", AV59Modo);
         }
         else
         {
            if ( isDlt( )  )
            {
               AV59Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV59Modo", AV59Modo);
            }
         }
      }
      if ( isIns( )  )
      {
         bttBtn_get_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_get_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      AV68OldExiAlm = O8659PrdExiAlmc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_check_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_check_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      }
   }

   public void load12G29( )
   {
      /* Using cursor T012G9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A718PrdNom = T012G9_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A794PrvNom = T012G9_A794PrvNom[0] ;
         n794PrvNom = T012G9_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A727PrdRec = T012G9_A727PrdRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
         A407EmprNom = T012G9_A407EmprNom[0] ;
         n407EmprNom = T012G9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A8659PrdExiAlmc = T012G9_A8659PrdExiAlmc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         A705PrdExiCC = T012G9_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A8660Almc_Ult = T012G9_A8660Almc_Ult[0] ;
         n8660Almc_Ult = T012G9_n8660Almc_Ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8660Almc_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8660Almc_Ult), 6, 0));
         A721PrdNumUco = T012G9_A721PrdNumUco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         A795PrvNum = T012G9_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A856ValCod = T012G9_A856ValCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         zm12G29( -62) ;
      }
      pr_default.close(7);
      onLoadActions12G29( ) ;
   }

   public void onLoadActions12G29( )
   {
      GXt_date1 = A3835UltFecCCs ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date4[0] = GXt_date1 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_date4) ;
      talmcon_impl.this.A396EmprCod = GXv_char2[0] ;
      talmcon_impl.this.A719PrdNum = GXv_char3[0] ;
      talmcon_impl.this.GXt_date1 = GXv_date4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
   }

   public void checkExtendedTable12G29( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T012G6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T012G6_A407EmprNom[0] ;
      n407EmprNom = T012G6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T012G7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T012G7_A794PrvNom[0] ;
      n794PrvNom = T012G7_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      pr_default.close(5);
      /* Using cursor T012G8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
      nIsDirty_29 = (short)(1) ;
      GXt_date1 = A3835UltFecCCs ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = A719PrdNum ;
      GXv_date4[0] = GXt_date1 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_date4) ;
      talmcon_impl.this.A396EmprCod = GXv_char3[0] ;
      talmcon_impl.this.A719PrdNum = GXv_char2[0] ;
      talmcon_impl.this.GXt_date1 = GXv_date4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      if ( true /* After */ && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto inexistente", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto Compuesto", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A727PrdRec, "S") == 0 ) || ( GXutil.strcmp(A727PrdRec, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Control en Recuento", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRDREC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdRec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto en recuento", ""), 1, "PRDREC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdRec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors12G29( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_63( String A396EmprCod )
   {
      /* Using cursor T012G10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T012G10_A407EmprNom[0] ;
      n407EmprNom = T012G10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_64( String A396EmprCod ,
                          int A795PrvNum )
   {
      /* Using cursor T012G11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T012G11_A794PrvNom[0] ;
      n794PrvNom = T012G11_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A794PrvNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_65( String A396EmprCod ,
                          byte A856ValCod )
   {
      /* Using cursor T012G12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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

   public void getKey12G29( )
   {
      /* Using cursor T012G13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T012G5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm12G29( 62) ;
         RcdFound29 = (short)(1) ;
         A719PrdNum = T012G5_A719PrdNum[0] ;
         n719PrdNum = T012G5_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = T012G5_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A727PrdRec = T012G5_A727PrdRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
         A8659PrdExiAlmc = T012G5_A8659PrdExiAlmc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         A705PrdExiCC = T012G5_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A8660Almc_Ult = T012G5_A8660Almc_Ult[0] ;
         n8660Almc_Ult = T012G5_n8660Almc_Ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8660Almc_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8660Almc_Ult), 6, 0));
         A721PrdNumUco = T012G5_A721PrdNumUco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         A396EmprCod = T012G5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = T012G5_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A856ValCod = T012G5_A856ValCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         O8659PrdExiAlmc = A8659PrdExiAlmc ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load12G29( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey12G29( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey12G29( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey12G29( ) ;
      if ( RcdFound29 == 0 )
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
      RcdFound29 = (short)(0) ;
      /* Using cursor T012G14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T012G14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T012G14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T012G14_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T012G14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T012G14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T012G14_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            A396EmprCod = T012G14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T012G14_A719PrdNum[0] ;
            n719PrdNum = T012G14_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T012G15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T012G15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T012G15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T012G15_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T012G15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T012G15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T012G15_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            A396EmprCod = T012G15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T012G15_A719PrdNum[0] ;
            n719PrdNum = T012G15_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey12G29( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A8659PrdExiAlmc = O8659PrdExiAlmc ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         AV68OldExiAlm = OV68OldExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert12G29( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A8659PrdExiAlmc = O8659PrdExiAlmc ;
               httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
               AV68OldExiAlm = OV68OldExiAlm ;
               httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
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
               A8659PrdExiAlmc = O8659PrdExiAlmc ;
               httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
               AV68OldExiAlm = OV68OldExiAlm ;
               httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
               update12G29( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A8659PrdExiAlmc = O8659PrdExiAlmc ;
               httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
               AV68OldExiAlm = OV68OldExiAlm ;
               httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert12G29( ) ;
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
                  A8659PrdExiAlmc = O8659PrdExiAlmc ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
                  AV68OldExiAlm = OV68OldExiAlm ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert12G29( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A8659PrdExiAlmc = O8659PrdExiAlmc ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         AV68OldExiAlm = OV68OldExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
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

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKey12G29( ) ;
      if ( RcdFound29 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = Z719PrdNum ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
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
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "talmcon");
      GX_FocusControl = edtPrvNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_12G0( ) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrvNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart12G29( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrvNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd12G29( ) ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrvNum_Internalname ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrvNum_Internalname ;
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
      scanStart12G29( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound29 != 0 )
         {
            scanNext12G29( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrvNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd12G29( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency12G29( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T012G4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z718PrdNom, T012G4_A718PrdNom[0]) != 0 ) || ( GXutil.strcmp(Z727PrdRec, T012G4_A727PrdRec[0]) != 0 ) || ( DecimalUtil.compareTo(Z8659PrdExiAlmc, T012G4_A8659PrdExiAlmc[0]) != 0 ) || ( DecimalUtil.compareTo(Z705PrdExiCC, T012G4_A705PrdExiCC[0]) != 0 ) || ( Z8660Almc_Ult != T012G4_A8660Almc_Ult[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z721PrdNumUco, T012G4_A721PrdNumUco[0]) != 0 ) || ( Z795PrvNum != T012G4_A795PrvNum[0] ) || ( Z856ValCod != T012G4_A856ValCod[0] ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T012G4_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T012G4_A718PrdNom[0]);
            }
            if ( GXutil.strcmp(Z727PrdRec, T012G4_A727PrdRec[0]) != 0 )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"PrdRec");
               GXutil.writeLogRaw("Old: ",Z727PrdRec);
               GXutil.writeLogRaw("Current: ",T012G4_A727PrdRec[0]);
            }
            if ( DecimalUtil.compareTo(Z8659PrdExiAlmc, T012G4_A8659PrdExiAlmc[0]) != 0 )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"PrdExiAlmc");
               GXutil.writeLogRaw("Old: ",Z8659PrdExiAlmc);
               GXutil.writeLogRaw("Current: ",T012G4_A8659PrdExiAlmc[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T012G4_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T012G4_A705PrdExiCC[0]);
            }
            if ( Z8660Almc_Ult != T012G4_A8660Almc_Ult[0] )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"Almc_Ult");
               GXutil.writeLogRaw("Old: ",Z8660Almc_Ult);
               GXutil.writeLogRaw("Current: ",T012G4_A8660Almc_Ult[0]);
            }
            if ( DecimalUtil.compareTo(Z721PrdNumUco, T012G4_A721PrdNumUco[0]) != 0 )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"PrdNumUco");
               GXutil.writeLogRaw("Old: ",Z721PrdNumUco);
               GXutil.writeLogRaw("Current: ",T012G4_A721PrdNumUco[0]);
            }
            if ( Z795PrvNum != T012G4_A795PrvNum[0] )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T012G4_A795PrvNum[0]);
            }
            if ( Z856ValCod != T012G4_A856ValCod[0] )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"ValCod");
               GXutil.writeLogRaw("Old: ",Z856ValCod);
               GXutil.writeLogRaw("Current: ",T012G4_A856ValCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert12G29( )
   {
      beforeValidate12G29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12G29( ) ;
      }
      if ( AnyError == 0 )
      {
         zm12G29( 0) ;
         checkOptimisticConcurrency12G29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12G29( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert12G29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012G16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom, A727PrdRec, A8659PrdExiAlmc, A705PrdExiCC, Boolean.valueOf(n8660Almc_Ult), Integer.valueOf(A8660Almc_Ult), A721PrdNumUco, A396EmprCod, Integer.valueOf(A795PrvNum), Byte.valueOf(A856ValCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
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
                        processLevel12G29( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption12G0( ) ;
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
            load12G29( ) ;
         }
         endLevel12G29( ) ;
      }
      closeExtendedTableCursors12G29( ) ;
   }

   public void update12G29( )
   {
      beforeValidate12G29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12G29( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12G29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12G29( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate12G29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012G17 */
                  pr_default.execute(15, new Object[] {A718PrdNom, A727PrdRec, A8659PrdExiAlmc, A705PrdExiCC, Boolean.valueOf(n8660Almc_Ult), Integer.valueOf(A8660Almc_Ult), A721PrdNumUco, Integer.valueOf(A795PrvNum), Byte.valueOf(A856ValCod), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate12G29( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel12G29( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption12G0( ) ;
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
         endLevel12G29( ) ;
      }
      closeExtendedTableCursors12G29( ) ;
   }

   public void deferredUpdate12G29( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate12G29( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12G29( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls12G29( ) ;
         afterConfirm12G29( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete12G29( ) ;
            if ( AnyError == 0 )
            {
               A8659PrdExiAlmc = O8659PrdExiAlmc ;
               httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
               AV68OldExiAlm = OV68OldExiAlm ;
               httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
               scanStart12G1184( ) ;
               while ( RcdFound1184 != 0 )
               {
                  getByPrimaryKey12G1184( ) ;
                  delete12G1184( ) ;
                  scanNext12G1184( ) ;
                  O8659PrdExiAlmc = A8659PrdExiAlmc ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
                  OV68OldExiAlm = AV68OldExiAlm ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
               }
               scanEnd12G1184( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012G18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound29 == 0 )
                        {
                           initAll12G29( ) ;
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
                        resetCaption12G0( ) ;
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel12G29( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls12G29( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* After */ && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto inexistente", ""), 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T012G19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T012G19_A407EmprNom[0] ;
         n407EmprNom = T012G19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         GXt_date1 = A3835UltFecCCs ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_date4[0] = GXt_date1 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_date4) ;
         talmcon_impl.this.A396EmprCod = GXv_char3[0] ;
         talmcon_impl.this.A719PrdNum = GXv_char2[0] ;
         talmcon_impl.this.GXt_date1 = GXv_date4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A3835UltFecCCs = GXt_date1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
         /* Using cursor T012G20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = T012G20_A794PrvNom[0] ;
         n794PrvNom = T012G20_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         pr_default.close(18);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T012G21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T012G22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T012G23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T012G24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T012G25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T012G26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T012G27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T012G28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T012G29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T012G30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T012G31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T012G32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T012G33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T012G34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T012G35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T012G36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T012G37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T012G38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T012G39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T012G40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T012G41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T012G42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T012G43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T012G44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T012G45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T012G46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T012G47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T012G48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T012G49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T012G50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T012G51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T012G52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T012G53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T012G54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T012G55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T012G56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T012G57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T012G58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T012G59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T012G60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T012G61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T012G62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T012G63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T012G64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T012G65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T012G66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T012G67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T012G68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T012G69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T012G70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T012G71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T012G72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T012G73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T012G74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T012G75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T012G76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T012G77 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T012G78 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T012G79 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T012G80 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T012G81 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T012G82 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T012G83 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T012G84 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T012G85 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T012G86 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T012G87 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T012G88 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T012G89 */
         pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T012G90 */
         pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T012G91 */
         pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T012G92 */
         pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
      }
   }

   public void processNestedLevel12G1184( )
   {
      s8659PrdExiAlmc = O8659PrdExiAlmc ;
      httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
      sV68OldExiAlm = OV68OldExiAlm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow12G1184( ) ;
         if ( ( nRcdExists_1184 != 0 ) || ( nIsMod_1184 != 0 ) )
         {
            standaloneNotModal12G1184( ) ;
            getKey12G1184( ) ;
            if ( ( nRcdExists_1184 == 0 ) && ( nRcdDeleted_1184 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert12G1184( ) ;
            }
            else
            {
               if ( RcdFound1184 != 0 )
               {
                  if ( ( nRcdDeleted_1184 != 0 ) && ( nRcdExists_1184 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete12G1184( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1184 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update12G1184( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1184 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PRDNUM");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O8659PrdExiAlmc = A8659PrdExiAlmc ;
            httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
            OV68OldExiAlm = AV68OldExiAlm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1184_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1184, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_Ln_Internalname, GXutil.ltrim( localUtil.ntoc( A8661Almc_Ln, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_alb_Internalname, GXutil.rtrim( A8662Almc_alb)) ;
         httpContext.changePostValue( edtAlmc_UniE_Internalname, GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_Pre_Internalname, GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_Rem_Internalname, GXutil.ltrim( localUtil.ntoc( A8665Almc_Rem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALmc_Fec_Internalname, localUtil.format(A8666ALmc_Fec, "99/99/99")) ;
         httpContext.changePostValue( edtAlmc_Con_Internalname, GXutil.ltrim( localUtil.ntoc( A8667Almc_Con, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_Prov_Internalname, GXutil.ltrim( localUtil.ntoc( A8672Almc_Prov, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_Ped_Internalname, GXutil.ltrim( localUtil.ntoc( A12578Almc_Ped, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlmc_Cum_Internalname, GXutil.rtrim( A12579Almc_Cum)) ;
         httpContext.changePostValue( edtAlmc_Lote_Internalname, GXutil.rtrim( A12643Almc_Lote)) ;
         httpContext.changePostValue( edtAlmc_Nct_Internalname, GXutil.ltrim( localUtil.ntoc( A12849Almc_Nct, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8661Almc_Ln_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8661Almc_Ln, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8666ALmc_Fec_"+sGXsfl_85_idx, localUtil.dtoc( Z8666ALmc_Fec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8667Almc_Con_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8667Almc_Con, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8665Almc_Rem_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8665Almc_Rem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8662Almc_alb_"+sGXsfl_85_idx, GXutil.rtrim( Z8662Almc_alb)) ;
         httpContext.changePostValue( "ZT_"+"Z8663Almc_UniE_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8663Almc_UniE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8664Almc_Pre_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8664Almc_Pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8672Almc_Prov_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z8672Almc_Prov, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12578Almc_Ped_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z12578Almc_Ped, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12579Almc_Cum_"+sGXsfl_85_idx, GXutil.rtrim( Z12579Almc_Cum)) ;
         httpContext.changePostValue( "ZT_"+"Z12643Almc_Lote_"+sGXsfl_85_idx, GXutil.rtrim( Z12643Almc_Lote)) ;
         httpContext.changePostValue( "ZT_"+"Z12849Almc_Nct_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z12849Almc_Nct, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T8666ALmc_Fec_"+sGXsfl_85_idx, localUtil.dtoc( O8666ALmc_Fec, 0, "/")) ;
         httpContext.changePostValue( "T8664Almc_Pre_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O8664Almc_Pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T8663Almc_UniE_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O8663Almc_UniE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T8665Almc_Rem_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O8665Almc_Rem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1184_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1184, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1184_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1184, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1184_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1184, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1184 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1184_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1184_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_LN_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Ln_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_ALB_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_alb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_UNIE_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_UniE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_PRE_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Pre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_REM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Rem_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_FEC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALmc_Fec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_CON_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Con_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_PROV_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Prov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_PED_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Ped_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_CUM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Cum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_LOTE_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Lote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALMC_NCT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Nct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll12G1184( ) ;
      if ( AnyError != 0 )
      {
         O8659PrdExiAlmc = s8659PrdExiAlmc ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         OV68OldExiAlm = sV68OldExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
      }
      nRcdExists_1184 = (short)(0) ;
      nIsMod_1184 = (short)(0) ;
      nRcdDeleted_1184 = (short)(0) ;
   }

   public void processLevel12G29( )
   {
      /* Save parent mode. */
      sMode29 = Gx_mode ;
      processNestedLevel12G1184( ) ;
      if ( AnyError != 0 )
      {
         O8659PrdExiAlmc = s8659PrdExiAlmc ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         OV68OldExiAlm = sV68OldExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
      }
      /* Restore parent mode. */
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T012G93 */
      pr_default.execute(91, new Object[] {A8659PrdExiAlmc, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
   }

   public void endLevel12G29( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete12G29( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talmcon");
         if ( AnyError == 0 )
         {
            confirmValues12G0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talmcon");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart12G29( )
   {
      /* Using cursor T012G94 */
      pr_default.execute(92);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(92) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T012G94_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T012G94_A719PrdNum[0] ;
         n719PrdNum = T012G94_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext12G29( )
   {
      /* Scan next routine */
      pr_default.readNext(92);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(92) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T012G94_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T012G94_A719PrdNum[0] ;
         n719PrdNum = T012G94_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd12G29( )
   {
      pr_default.close(92);
   }

   public void afterConfirm12G29( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert12G29( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate12G29( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete12G29( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete12G29( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate12G29( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes12G29( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
      edtValCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), true);
      edtPrdRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRec_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrdExiAlmc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlmc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlmc_Enabled), 5, 0), true);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), true);
      edtAlmc_Ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Ult_Enabled), 5, 0), true);
      edtUltFecCCs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltFecCCs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltFecCCs_Enabled), 5, 0), true);
      edtPrdNumUco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNumUco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumUco_Enabled), 5, 0), true);
   }

   public void zm12G1184( int GX_JID )
   {
      if ( ( GX_JID == 66 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8666ALmc_Fec = T012G3_A8666ALmc_Fec[0] ;
            Z8667Almc_Con = T012G3_A8667Almc_Con[0] ;
            Z8665Almc_Rem = T012G3_A8665Almc_Rem[0] ;
            Z8662Almc_alb = T012G3_A8662Almc_alb[0] ;
            Z8663Almc_UniE = T012G3_A8663Almc_UniE[0] ;
            Z8664Almc_Pre = T012G3_A8664Almc_Pre[0] ;
            Z8672Almc_Prov = T012G3_A8672Almc_Prov[0] ;
            Z12578Almc_Ped = T012G3_A12578Almc_Ped[0] ;
            Z12579Almc_Cum = T012G3_A12579Almc_Cum[0] ;
            Z12643Almc_Lote = T012G3_A12643Almc_Lote[0] ;
            Z12849Almc_Nct = T012G3_A12849Almc_Nct[0] ;
         }
         else
         {
            Z8666ALmc_Fec = A8666ALmc_Fec ;
            Z8667Almc_Con = A8667Almc_Con ;
            Z8665Almc_Rem = A8665Almc_Rem ;
            Z8662Almc_alb = A8662Almc_alb ;
            Z8663Almc_UniE = A8663Almc_UniE ;
            Z8664Almc_Pre = A8664Almc_Pre ;
            Z8672Almc_Prov = A8672Almc_Prov ;
            Z12578Almc_Ped = A12578Almc_Ped ;
            Z12579Almc_Cum = A12579Almc_Cum ;
            Z12643Almc_Lote = A12643Almc_Lote ;
            Z12849Almc_Nct = A12849Almc_Nct ;
         }
      }
      if ( GX_JID == -66 )
      {
         Z719PrdNum = A719PrdNum ;
         Z8661Almc_Ln = A8661Almc_Ln ;
         Z8666ALmc_Fec = A8666ALmc_Fec ;
         Z8667Almc_Con = A8667Almc_Con ;
         Z8665Almc_Rem = A8665Almc_Rem ;
         Z8662Almc_alb = A8662Almc_alb ;
         Z8663Almc_UniE = A8663Almc_UniE ;
         Z8664Almc_Pre = A8664Almc_Pre ;
         Z8672Almc_Prov = A8672Almc_Prov ;
         Z12578Almc_Ped = A12578Almc_Ped ;
         Z12579Almc_Cum = A12579Almc_Cum ;
         Z12643Almc_Lote = A12643Almc_Lote ;
         Z12849Almc_Nct = A12849Almc_Nct ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal12G1184( )
   {
      edtAlmc_Ln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Ln_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Rem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Rem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Rem_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Con_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Con_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Con_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Ped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Ped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Ped_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtPrdExiAlmc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlmc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlmc_Enabled), 5, 0), true);
      edtPrdExiAlmc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlmc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlmc_Enabled), 5, 0), true);
   }

   public void standaloneModal12G1184( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         AV60Modo2 = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            AV60Modo2 = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               AV60Modo2 = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
            }
         }
      }
      if ( isIns( )  )
      {
         A8667Almc_Con = (byte)(0) ;
         n8667Almc_Con = false ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A8666ALmc_Fec)) && ( Gx_BScreen == 0 ) )
      {
         A8666ALmc_Fec = GXutil.today( ) ;
         n8666ALmc_Fec = false ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV16Year = (short)(GXutil.year( A8666ALmc_Fec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         AV19Fecha = localUtil.ymdtod( AV16Year, 12, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Fecha", localUtil.format(AV19Fecha, "99/99/99"));
         AV21Mes = (byte)(GXutil.month( A8666ALmc_Fec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         AV65FecAnt = O8666ALmc_Fec ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         AV62AnyAnt = (short)(GXutil.year( O8666ALmc_Fec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         AV63MesAnt = (byte)(GXutil.month( O8666ALmc_Fec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         AV20DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV19Fecha),A8666ALmc_Fec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20DiasFin), 3, 0));
      }
   }

   public void load12G1184( )
   {
      /* Using cursor T012G95 */
      pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A8661Almc_Ln)});
      if ( (pr_default.getStatus(93) != 101) )
      {
         RcdFound1184 = (short)(1) ;
         A8666ALmc_Fec = T012G95_A8666ALmc_Fec[0] ;
         n8666ALmc_Fec = T012G95_n8666ALmc_Fec[0] ;
         A8667Almc_Con = T012G95_A8667Almc_Con[0] ;
         n8667Almc_Con = T012G95_n8667Almc_Con[0] ;
         A8665Almc_Rem = T012G95_A8665Almc_Rem[0] ;
         n8665Almc_Rem = T012G95_n8665Almc_Rem[0] ;
         A8662Almc_alb = T012G95_A8662Almc_alb[0] ;
         n8662Almc_alb = T012G95_n8662Almc_alb[0] ;
         A8663Almc_UniE = T012G95_A8663Almc_UniE[0] ;
         n8663Almc_UniE = T012G95_n8663Almc_UniE[0] ;
         A8664Almc_Pre = T012G95_A8664Almc_Pre[0] ;
         n8664Almc_Pre = T012G95_n8664Almc_Pre[0] ;
         A8672Almc_Prov = T012G95_A8672Almc_Prov[0] ;
         n8672Almc_Prov = T012G95_n8672Almc_Prov[0] ;
         A12578Almc_Ped = T012G95_A12578Almc_Ped[0] ;
         n12578Almc_Ped = T012G95_n12578Almc_Ped[0] ;
         A12579Almc_Cum = T012G95_A12579Almc_Cum[0] ;
         n12579Almc_Cum = T012G95_n12579Almc_Cum[0] ;
         A12643Almc_Lote = T012G95_A12643Almc_Lote[0] ;
         n12643Almc_Lote = T012G95_n12643Almc_Lote[0] ;
         A12849Almc_Nct = T012G95_A12849Almc_Nct[0] ;
         n12849Almc_Nct = T012G95_n12849Almc_Nct[0] ;
         zm12G1184( -66) ;
      }
      pr_default.close(93);
      onLoadActions12G1184( ) ;
   }

   public void onLoadActions12G1184( )
   {
      if ( isIns( )  && true /* After */ )
      {
         A8665Almc_Rem = O8665Almc_Rem.add(A8663Almc_UniE) ;
         n8665Almc_Rem = false ;
      }
      else
      {
         if ( isUpd( )  && true /* After */ )
         {
            A8665Almc_Rem = (O8665Almc_Rem.add(A8663Almc_UniE).subtract(O8663Almc_UniE)) ;
            n8665Almc_Rem = false ;
         }
         else
         {
            if ( isDlt( )  && true /* After */ )
            {
               A8665Almc_Rem = (O8665Almc_Rem.subtract(A8663Almc_UniE)) ;
               n8665Almc_Rem = false ;
            }
            else
            {
               if ( DecimalUtil.compareTo(O8665Almc_Rem, O8663Almc_UniE) == 0 )
               {
                  A8665Almc_Rem = A8663Almc_UniE ;
                  n8665Almc_Rem = false ;
               }
            }
         }
      }
      if ( isDlt( )  )
      {
         A8659PrdExiAlmc = O8659PrdExiAlmc.subtract(O8663Almc_UniE) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A8659PrdExiAlmc = O8659PrdExiAlmc.add(A8663Almc_UniE).subtract(O8663Almc_UniE) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         }
      }
      AV68OldExiAlm = O8659PrdExiAlmc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
      AV70OldEntUni = O8663Almc_UniE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70OldEntUni", GXutil.ltrimstr( AV70OldEntUni, 9, 2));
      AV28UniOld = O8663Almc_UniE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
      if ( isIns( )  )
      {
         A8664Almc_Pre = AV56vPrecio ;
         n8664Almc_Pre = false ;
      }
      AV69OldEntPre = O8664Almc_Pre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69OldEntPre", GXutil.ltrimstr( AV69OldEntPre, 14, 5));
      AV64PrecAnt = O8664Almc_Pre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
      AV16Year = (short)(GXutil.year( A8666ALmc_Fec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
      AV19Fecha = localUtil.ymdtod( AV16Year, 12, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Fecha", localUtil.format(AV19Fecha, "99/99/99"));
      AV21Mes = (byte)(GXutil.month( A8666ALmc_Fec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
      AV65FecAnt = O8666ALmc_Fec ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
      AV62AnyAnt = (short)(GXutil.year( O8666ALmc_Fec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
      AV63MesAnt = (byte)(GXutil.month( O8666ALmc_Fec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
      AV20DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV19Fecha),A8666ALmc_Fec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20DiasFin), 3, 0));
      if ( true /* After */ )
      {
         GXt_char5 = AV89PrdNomX ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int6[0] = A8672Almc_Prov ;
         GXv_char2[0] = GXt_char5 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_char2) ;
         talmcon_impl.this.A396EmprCod = GXv_char3[0] ;
         talmcon_impl.this.A8672Almc_Prov = GXv_int6[0] ;
         talmcon_impl.this.GXt_char5 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV89PrdNomX = GXt_char5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89PrdNomX", AV89PrdNomX);
      }
   }

   public void checkExtendedTable12G1184( )
   {
      nIsDirty_1184 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal12G1184( ) ;
      if ( isIns( )  && true /* After */ )
      {
         nIsDirty_1184 = (short)(1) ;
         A8665Almc_Rem = O8665Almc_Rem.add(A8663Almc_UniE) ;
         n8665Almc_Rem = false ;
      }
      else
      {
         if ( isUpd( )  && true /* After */ )
         {
            nIsDirty_1184 = (short)(1) ;
            A8665Almc_Rem = (O8665Almc_Rem.add(A8663Almc_UniE).subtract(O8663Almc_UniE)) ;
            n8665Almc_Rem = false ;
         }
         else
         {
            if ( isDlt( )  && true /* After */ )
            {
               nIsDirty_1184 = (short)(1) ;
               A8665Almc_Rem = (O8665Almc_Rem.subtract(A8663Almc_UniE)) ;
               n8665Almc_Rem = false ;
            }
            else
            {
               if ( DecimalUtil.compareTo(O8665Almc_Rem, O8663Almc_UniE) == 0 )
               {
                  nIsDirty_1184 = (short)(1) ;
                  A8665Almc_Rem = A8663Almc_UniE ;
                  n8665Almc_Rem = false ;
               }
            }
         }
      }
      if ( isDlt( )  )
      {
         nIsDirty_1184 = (short)(1) ;
         A8659PrdExiAlmc = O8659PrdExiAlmc.subtract(O8663Almc_UniE) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_1184 = (short)(1) ;
            A8659PrdExiAlmc = O8659PrdExiAlmc.add(A8663Almc_UniE).subtract(O8663Almc_UniE) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         }
      }
      AV68OldExiAlm = O8659PrdExiAlmc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
      if ( DecimalUtil.compareTo(A8659PrdExiAlmc, DecimalUtil.stringToDec("999999.9998")) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad excesiva en  almacen", ""), 1, "");
         AnyError = (short)(1) ;
      }
      AV70OldEntUni = O8663Almc_UniE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70OldEntUni", GXutil.ltrimstr( AV70OldEntUni, 9, 2));
      AV28UniOld = O8663Almc_UniE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A8663Almc_UniE)==0) )
      {
         GXCCtl = "ALMC_UNIE_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe entrar unidades", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_UniE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(O8665Almc_Rem, O8663Almc_UniE) != 0 ) )
      {
         GXCCtl = "ALMC_UNIE_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencio.Linea traspasada al Almacen General ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_UniE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_decimal7[0] = AV56vPrecio ;
         new app.ppropvp(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_decimal7) ;
         talmcon_impl.this.A396EmprCod = GXv_char3[0] ;
         talmcon_impl.this.A719PrdNum = GXv_char2[0] ;
         talmcon_impl.this.AV56vPrecio = GXv_decimal7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV56vPrecio", GXutil.ltrimstr( AV56vPrecio, 14, 5));
      }
      if ( isIns( )  )
      {
         nIsDirty_1184 = (short)(1) ;
         A8664Almc_Pre = AV56vPrecio ;
         n8664Almc_Pre = false ;
      }
      AV69OldEntPre = O8664Almc_Pre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69OldEntPre", GXutil.ltrimstr( AV69OldEntPre, 14, 5));
      AV64PrecAnt = O8664Almc_Pre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A8664Almc_Pre)==0) && (0==AV76FlagPre) )
      {
         GXCCtl = "ALMC_PRE_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Precio con valor CERO", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_Pre_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A8664Almc_Pre)==0) && ( AV76FlagPre == 1 ) )
      {
         GXCCtl = "ALMC_PRE_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "MENSAJE.Precio con valor CERO", ""), 0, GXCCtl);
      }
      AV16Year = (short)(GXutil.year( A8666ALmc_Fec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
      AV19Fecha = localUtil.ymdtod( AV16Year, 12, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Fecha", localUtil.format(AV19Fecha, "99/99/99"));
      AV21Mes = (byte)(GXutil.month( A8666ALmc_Fec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
      AV65FecAnt = O8666ALmc_Fec ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
      AV62AnyAnt = (short)(GXutil.year( O8666ALmc_Fec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
      AV63MesAnt = (byte)(GXutil.month( O8666ALmc_Fec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
      AV20DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV19Fecha),A8666ALmc_Fec)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20DiasFin), 3, 0));
      if ( true /* Level */ && true /* After */ && GXutil.resetTime(A8666ALmc_Fec).after( GXutil.resetTime( Gx_date )) && isIns( )  )
      {
         GXCCtl = "ALMC_FEC_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Fecha Entrada mayor a la Fecha del Dia", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtALmc_Fec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ )
      {
         GXt_char5 = AV89PrdNomX ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int6[0] = A8672Almc_Prov ;
         GXv_char2[0] = GXt_char5 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_char2) ;
         talmcon_impl.this.A396EmprCod = GXv_char3[0] ;
         talmcon_impl.this.A8672Almc_Prov = GXv_int6[0] ;
         talmcon_impl.this.GXt_char5 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV89PrdNomX = GXt_char5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89PrdNomX", AV89PrdNomX);
      }
      if ( ( GXutil.strcmp(GXutil.trim( AV89PrdNomX), httpContext.getMessage( "Inexistente", "")) == 0 ) && true /* After */ )
      {
         GXCCtl = "ALMC_PROV_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor Inexistente", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_Prov_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( DecimalUtil.compareTo(A8665Almc_Rem, DecimalUtil.stringToDec("999999.98")) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad Remanente excesiva", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors12G1184( )
   {
   }

   public void enableDisable12G1184( )
   {
   }

   public void getKey12G1184( )
   {
      /* Using cursor T012G96 */
      pr_default.execute(94, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A8661Almc_Ln)});
      if ( (pr_default.getStatus(94) != 101) )
      {
         RcdFound1184 = (short)(1) ;
      }
      else
      {
         RcdFound1184 = (short)(0) ;
      }
      pr_default.close(94);
   }

   public void getByPrimaryKey12G1184( )
   {
      /* Using cursor T012G3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A8661Almc_Ln)});
      if ( (pr_default.getStatus(1) != 101) && ( T012G3_A8667Almc_Con[0] == 0 ) )
      {
         zm12G1184( 66) ;
         RcdFound1184 = (short)(1) ;
         initializeNonKey12G1184( ) ;
         A8661Almc_Ln = T012G3_A8661Almc_Ln[0] ;
         A8666ALmc_Fec = T012G3_A8666ALmc_Fec[0] ;
         n8666ALmc_Fec = T012G3_n8666ALmc_Fec[0] ;
         A8667Almc_Con = T012G3_A8667Almc_Con[0] ;
         n8667Almc_Con = T012G3_n8667Almc_Con[0] ;
         A8665Almc_Rem = T012G3_A8665Almc_Rem[0] ;
         n8665Almc_Rem = T012G3_n8665Almc_Rem[0] ;
         A8662Almc_alb = T012G3_A8662Almc_alb[0] ;
         n8662Almc_alb = T012G3_n8662Almc_alb[0] ;
         A8663Almc_UniE = T012G3_A8663Almc_UniE[0] ;
         n8663Almc_UniE = T012G3_n8663Almc_UniE[0] ;
         A8664Almc_Pre = T012G3_A8664Almc_Pre[0] ;
         n8664Almc_Pre = T012G3_n8664Almc_Pre[0] ;
         A8672Almc_Prov = T012G3_A8672Almc_Prov[0] ;
         n8672Almc_Prov = T012G3_n8672Almc_Prov[0] ;
         A12578Almc_Ped = T012G3_A12578Almc_Ped[0] ;
         n12578Almc_Ped = T012G3_n12578Almc_Ped[0] ;
         A12579Almc_Cum = T012G3_A12579Almc_Cum[0] ;
         n12579Almc_Cum = T012G3_n12579Almc_Cum[0] ;
         A12643Almc_Lote = T012G3_A12643Almc_Lote[0] ;
         n12643Almc_Lote = T012G3_n12643Almc_Lote[0] ;
         A12849Almc_Nct = T012G3_A12849Almc_Nct[0] ;
         n12849Almc_Nct = T012G3_n12849Almc_Nct[0] ;
         O8666ALmc_Fec = A8666ALmc_Fec ;
         n8666ALmc_Fec = false ;
         O8664Almc_Pre = A8664Almc_Pre ;
         n8664Almc_Pre = false ;
         O8663Almc_UniE = A8663Almc_UniE ;
         n8663Almc_UniE = false ;
         O8665Almc_Rem = A8665Almc_Rem ;
         n8665Almc_Rem = false ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z8661Almc_Ln = A8661Almc_Ln ;
         sMode1184 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal12G1184( ) ;
         load12G1184( ) ;
         Gx_mode = sMode1184 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1184 = (short)(0) ;
         initializeNonKey12G1184( ) ;
         sMode1184 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal12G1184( ) ;
         Gx_mode = sMode1184 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes12G1184( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency12G1184( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T012G2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A8661Almc_Ln)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALMCON"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z8666ALmc_Fec), GXutil.resetTime(T012G2_A8666ALmc_Fec[0])) ) || ( Z8667Almc_Con != T012G2_A8667Almc_Con[0] ) || ( DecimalUtil.compareTo(Z8665Almc_Rem, T012G2_A8665Almc_Rem[0]) != 0 ) || ( GXutil.strcmp(Z8662Almc_alb, T012G2_A8662Almc_alb[0]) != 0 ) || ( DecimalUtil.compareTo(Z8663Almc_UniE, T012G2_A8663Almc_UniE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8664Almc_Pre, T012G2_A8664Almc_Pre[0]) != 0 ) || ( Z8672Almc_Prov != T012G2_A8672Almc_Prov[0] ) || ( Z12578Almc_Ped != T012G2_A12578Almc_Ped[0] ) || ( GXutil.strcmp(Z12579Almc_Cum, T012G2_A12579Almc_Cum[0]) != 0 ) || ( GXutil.strcmp(Z12643Almc_Lote, T012G2_A12643Almc_Lote[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12849Almc_Nct != T012G2_A12849Almc_Nct[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8666ALmc_Fec), GXutil.resetTime(T012G2_A8666ALmc_Fec[0])) ) )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"ALmc_Fec");
               GXutil.writeLogRaw("Old: ",Z8666ALmc_Fec);
               GXutil.writeLogRaw("Current: ",T012G2_A8666ALmc_Fec[0]);
            }
            if ( Z8667Almc_Con != T012G2_A8667Almc_Con[0] )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"Almc_Con");
               GXutil.writeLogRaw("Old: ",Z8667Almc_Con);
               GXutil.writeLogRaw("Current: ",T012G2_A8667Almc_Con[0]);
            }
            if ( DecimalUtil.compareTo(Z8665Almc_Rem, T012G2_A8665Almc_Rem[0]) != 0 )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"Almc_Rem");
               GXutil.writeLogRaw("Old: ",Z8665Almc_Rem);
               GXutil.writeLogRaw("Current: ",T012G2_A8665Almc_Rem[0]);
            }
            if ( GXutil.strcmp(Z8662Almc_alb, T012G2_A8662Almc_alb[0]) != 0 )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"Almc_alb");
               GXutil.writeLogRaw("Old: ",Z8662Almc_alb);
               GXutil.writeLogRaw("Current: ",T012G2_A8662Almc_alb[0]);
            }
            if ( DecimalUtil.compareTo(Z8663Almc_UniE, T012G2_A8663Almc_UniE[0]) != 0 )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"Almc_UniE");
               GXutil.writeLogRaw("Old: ",Z8663Almc_UniE);
               GXutil.writeLogRaw("Current: ",T012G2_A8663Almc_UniE[0]);
            }
            if ( DecimalUtil.compareTo(Z8664Almc_Pre, T012G2_A8664Almc_Pre[0]) != 0 )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"Almc_Pre");
               GXutil.writeLogRaw("Old: ",Z8664Almc_Pre);
               GXutil.writeLogRaw("Current: ",T012G2_A8664Almc_Pre[0]);
            }
            if ( Z8672Almc_Prov != T012G2_A8672Almc_Prov[0] )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"Almc_Prov");
               GXutil.writeLogRaw("Old: ",Z8672Almc_Prov);
               GXutil.writeLogRaw("Current: ",T012G2_A8672Almc_Prov[0]);
            }
            if ( Z12578Almc_Ped != T012G2_A12578Almc_Ped[0] )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"Almc_Ped");
               GXutil.writeLogRaw("Old: ",Z12578Almc_Ped);
               GXutil.writeLogRaw("Current: ",T012G2_A12578Almc_Ped[0]);
            }
            if ( GXutil.strcmp(Z12579Almc_Cum, T012G2_A12579Almc_Cum[0]) != 0 )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"Almc_Cum");
               GXutil.writeLogRaw("Old: ",Z12579Almc_Cum);
               GXutil.writeLogRaw("Current: ",T012G2_A12579Almc_Cum[0]);
            }
            if ( GXutil.strcmp(Z12643Almc_Lote, T012G2_A12643Almc_Lote[0]) != 0 )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"Almc_Lote");
               GXutil.writeLogRaw("Old: ",Z12643Almc_Lote);
               GXutil.writeLogRaw("Current: ",T012G2_A12643Almc_Lote[0]);
            }
            if ( Z12849Almc_Nct != T012G2_A12849Almc_Nct[0] )
            {
               GXutil.writeLogln("talmcon:[seudo value changed for attri]"+"Almc_Nct");
               GXutil.writeLogRaw("Old: ",Z12849Almc_Nct);
               GXutil.writeLogRaw("Current: ",T012G2_A12849Almc_Nct[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALMCON"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert12G1184( )
   {
      beforeValidate12G1184( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12G1184( ) ;
      }
      if ( AnyError == 0 )
      {
         zm12G1184( 0) ;
         checkOptimisticConcurrency12G1184( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12G1184( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert12G1184( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012G97 */
                  pr_default.execute(95, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A8661Almc_Ln), Boolean.valueOf(n8666ALmc_Fec), A8666ALmc_Fec, Boolean.valueOf(n8667Almc_Con), Byte.valueOf(A8667Almc_Con), Boolean.valueOf(n8665Almc_Rem), A8665Almc_Rem, Boolean.valueOf(n8662Almc_alb), A8662Almc_alb, Boolean.valueOf(n8663Almc_UniE), A8663Almc_UniE, Boolean.valueOf(n8664Almc_Pre), A8664Almc_Pre, Boolean.valueOf(n8672Almc_Prov), Integer.valueOf(A8672Almc_Prov), Boolean.valueOf(n12578Almc_Ped), Integer.valueOf(A12578Almc_Ped), Boolean.valueOf(n12579Almc_Cum), A12579Almc_Cum, Boolean.valueOf(n12643Almc_Lote), A12643Almc_Lote, Boolean.valueOf(n12849Almc_Nct), Short.valueOf(A12849Almc_Nct), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALMCON");
                  if ( (pr_default.getStatus(95) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char3[0] = A396EmprCod ;
                        GXv_char2[0] = A719PrdNum ;
                        GXv_int6[0] = A8672Almc_Prov ;
                        GXv_decimal7[0] = A8664Almc_Pre ;
                        new app.pprenp(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int6, GXv_decimal7) ;
                        talmcon_impl.this.A396EmprCod = GXv_char3[0] ;
                        talmcon_impl.this.A719PrdNum = GXv_char2[0] ;
                        talmcon_impl.this.A8672Almc_Prov = GXv_int6[0] ;
                        talmcon_impl.this.A8664Almc_Pre = GXv_decimal7[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
            load12G1184( ) ;
         }
         endLevel12G1184( ) ;
      }
      closeExtendedTableCursors12G1184( ) ;
   }

   public void update12G1184( )
   {
      beforeValidate12G1184( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12G1184( ) ;
      }
      if ( ( nIsMod_1184 != 0 ) || ( nIsDirty_1184 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency12G1184( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm12G1184( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate12G1184( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T012G98 */
                     pr_default.execute(96, new Object[] {Boolean.valueOf(n8666ALmc_Fec), A8666ALmc_Fec, Boolean.valueOf(n8667Almc_Con), Byte.valueOf(A8667Almc_Con), Boolean.valueOf(n8665Almc_Rem), A8665Almc_Rem, Boolean.valueOf(n8662Almc_alb), A8662Almc_alb, Boolean.valueOf(n8663Almc_UniE), A8663Almc_UniE, Boolean.valueOf(n8664Almc_Pre), A8664Almc_Pre, Boolean.valueOf(n8672Almc_Prov), Integer.valueOf(A8672Almc_Prov), Boolean.valueOf(n12578Almc_Ped), Integer.valueOf(A12578Almc_Ped), Boolean.valueOf(n12579Almc_Cum), A12579Almc_Cum, Boolean.valueOf(n12643Almc_Lote), A12643Almc_Lote, Boolean.valueOf(n12849Almc_Nct), Short.valueOf(A12849Almc_Nct), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A8661Almc_Ln)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALMCON");
                     if ( (pr_default.getStatus(96) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALMCON"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate12G1184( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ || true /* After */ )
                        {
                           GXv_char3[0] = A396EmprCod ;
                           GXv_char2[0] = A719PrdNum ;
                           GXv_int6[0] = A8672Almc_Prov ;
                           GXv_decimal7[0] = A8664Almc_Pre ;
                           new app.pprenp(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int6, GXv_decimal7) ;
                           talmcon_impl.this.A396EmprCod = GXv_char3[0] ;
                           talmcon_impl.this.A719PrdNum = GXv_char2[0] ;
                           talmcon_impl.this.A8672Almc_Prov = GXv_int6[0] ;
                           talmcon_impl.this.A8664Almc_Pre = GXv_decimal7[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey12G1184( ) ;
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
            endLevel12G1184( ) ;
         }
      }
      closeExtendedTableCursors12G1184( ) ;
   }

   public void deferredUpdate12G1184( )
   {
   }

   public void delete12G1184( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate12G1184( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12G1184( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls12G1184( ) ;
         afterConfirm12G1184( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete12G1184( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T012G99 */
               pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A8661Almc_Ln)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALMCON");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ && ! (0==A12578Almc_Ped) )
                  {
                     GXv_char3[0] = A396EmprCod ;
                     GXv_int6[0] = A12578Almc_Ped ;
                     GXv_char2[0] = A719PrdNum ;
                     GXv_decimal7[0] = A8663Almc_UniE ;
                     new app.pdelconsigna(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_char2, GXv_decimal7) ;
                     talmcon_impl.this.A396EmprCod = GXv_char3[0] ;
                     talmcon_impl.this.A12578Almc_Ped = GXv_int6[0] ;
                     talmcon_impl.this.A719PrdNum = GXv_char2[0] ;
                     talmcon_impl.this.A8663Almc_UniE = GXv_decimal7[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
      sMode1184 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel12G1184( ) ;
      Gx_mode = sMode1184 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls12G1184( )
   {
      standaloneModal12G1184( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ && true /* After */ && isIns( )  )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_char2[0] = A719PrdNum ;
            GXv_decimal7[0] = AV56vPrecio ;
            new app.ppropvp(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_decimal7) ;
            talmcon_impl.this.A396EmprCod = GXv_char3[0] ;
            talmcon_impl.this.A719PrdNum = GXv_char2[0] ;
            talmcon_impl.this.AV56vPrecio = GXv_decimal7[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            httpContext.ajax_rsp_assign_attri("", false, "AV56vPrecio", GXutil.ltrimstr( AV56vPrecio, 14, 5));
         }
         if ( true /* Level */ && true /* After */ && GXutil.resetTime(A8666ALmc_Fec).after( GXutil.resetTime( Gx_date )) && isIns( )  )
         {
            GXCCtl = "ALMC_FEC_" + sGXsfl_85_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Fecha Entrada mayor a la Fecha del Dia", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtALmc_Fec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(O8665Almc_Rem, O8663Almc_UniE) != 0 ) )
         {
            GXCCtl = "ALMC_UNIE_" + sGXsfl_85_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencio.Linea traspasada al Almacen General ¡¡¡", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlmc_UniE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isDlt( )  )
         {
            A8659PrdExiAlmc = O8659PrdExiAlmc.subtract(O8663Almc_UniE) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A8659PrdExiAlmc = O8659PrdExiAlmc.add(A8663Almc_UniE).subtract(O8663Almc_UniE) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
            }
         }
         AV68OldExiAlm = O8659PrdExiAlmc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
         AV70OldEntUni = O8663Almc_UniE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70OldEntUni", GXutil.ltrimstr( AV70OldEntUni, 9, 2));
         AV28UniOld = O8663Almc_UniE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         AV69OldEntPre = O8664Almc_Pre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69OldEntPre", GXutil.ltrimstr( AV69OldEntPre, 14, 5));
         AV64PrecAnt = O8664Almc_Pre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         AV16Year = (short)(GXutil.year( A8666ALmc_Fec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         AV19Fecha = localUtil.ymdtod( AV16Year, 12, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Fecha", localUtil.format(AV19Fecha, "99/99/99"));
         AV21Mes = (byte)(GXutil.month( A8666ALmc_Fec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         AV65FecAnt = O8666ALmc_Fec ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         AV62AnyAnt = (short)(GXutil.year( O8666ALmc_Fec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         AV63MesAnt = (byte)(GXutil.month( O8666ALmc_Fec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         AV20DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV19Fecha),A8666ALmc_Fec)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20DiasFin), 3, 0));
         if ( true /* After */ )
         {
            GXt_char5 = AV89PrdNomX ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int6[0] = A8672Almc_Prov ;
            GXv_char2[0] = GXt_char5 ;
            new app.pctrprv(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_char2) ;
            talmcon_impl.this.A396EmprCod = GXv_char3[0] ;
            talmcon_impl.this.A8672Almc_Prov = GXv_int6[0] ;
            talmcon_impl.this.GXt_char5 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            AV89PrdNomX = GXt_char5 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89PrdNomX", AV89PrdNomX);
         }
         if ( isDlt( )  && true /* Level */ && ( DecimalUtil.compareTo(O8665Almc_Rem, O8663Almc_UniE) != 0 ) )
         {
            GXCCtl = "ALMC_UNIE_" + sGXsfl_85_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencio.Linea traspasada al Almacen General ¡¡¡", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlmc_UniE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
   }

   public void endLevel12G1184( )
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

   public void scanStart12G1184( )
   {
      /* Scan By routine */
      /* Using cursor T012G100 */
      pr_default.execute(98, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound1184 = (short)(0) ;
      if ( (pr_default.getStatus(98) != 101) )
      {
         RcdFound1184 = (short)(1) ;
         A8661Almc_Ln = T012G100_A8661Almc_Ln[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext12G1184( )
   {
      /* Scan next routine */
      pr_default.readNext(98);
      RcdFound1184 = (short)(0) ;
      if ( (pr_default.getStatus(98) != 101) )
      {
         RcdFound1184 = (short)(1) ;
         A8661Almc_Ln = T012G100_A8661Almc_Ln[0] ;
      }
   }

   public void scanEnd12G1184( )
   {
      pr_default.close(98);
   }

   public void afterConfirm12G1184( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_int6[0] = A8661Almc_Ln ;
         new app.palmc00(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int6) ;
         talmcon_impl.this.A396EmprCod = GXv_char3[0] ;
         talmcon_impl.this.A719PrdNum = GXv_char2[0] ;
         talmcon_impl.this.A8661Almc_Ln = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      if ( true /* Level */ && isDlt( )  && true /* After */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_int8[0] = (short)(A8661Almc_Ln) ;
         new app.palmc04(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int8) ;
         talmcon_impl.this.A396EmprCod = GXv_char3[0] ;
         talmcon_impl.this.A719PrdNum = GXv_char2[0] ;
         talmcon_impl.this.A8661Almc_Ln = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_int8[0] = AV16Year ;
         GXv_int9[0] = AV21Mes ;
         GXv_decimal7[0] = A8663Almc_UniE ;
         GXv_decimal10[0] = AV28UniOld ;
         GXv_decimal11[0] = A8664Almc_Pre ;
         GXv_int12[0] = AV16Year ;
         GXv_int13[0] = AV62AnyAnt ;
         GXv_int14[0] = AV21Mes ;
         GXv_int15[0] = AV63MesAnt ;
         GXv_decimal16[0] = AV64PrecAnt ;
         GXv_date4[0] = A8666ALmc_Fec ;
         GXv_date17[0] = AV65FecAnt ;
         GXv_char18[0] = "1" ;
         GXv_char19[0] = AV60Modo2 ;
         new app.pprden2(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int8, GXv_int9, GXv_decimal7, GXv_decimal10, GXv_decimal11, GXv_int12, GXv_int13, GXv_int14, GXv_int15, GXv_decimal16, GXv_date4, GXv_date17, GXv_char18, GXv_char19) ;
         talmcon_impl.this.A396EmprCod = GXv_char3[0] ;
         talmcon_impl.this.A719PrdNum = GXv_char2[0] ;
         talmcon_impl.this.AV16Year = GXv_int8[0] ;
         talmcon_impl.this.AV21Mes = GXv_int9[0] ;
         talmcon_impl.this.A8663Almc_UniE = GXv_decimal7[0] ;
         talmcon_impl.this.AV28UniOld = GXv_decimal10[0] ;
         talmcon_impl.this.A8664Almc_Pre = GXv_decimal11[0] ;
         talmcon_impl.this.AV16Year = GXv_int12[0] ;
         talmcon_impl.this.AV62AnyAnt = GXv_int13[0] ;
         talmcon_impl.this.AV21Mes = GXv_int14[0] ;
         talmcon_impl.this.AV63MesAnt = GXv_int15[0] ;
         talmcon_impl.this.AV64PrecAnt = GXv_decimal16[0] ;
         talmcon_impl.this.A8666ALmc_Fec = GXv_date4[0] ;
         talmcon_impl.this.AV65FecAnt = GXv_date17[0] ;
         talmcon_impl.this.AV60Modo2 = GXv_char19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      }
      if ( ( ( ( DecimalUtil.compareTo(A8663Almc_UniE, AV28UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A8666ALmc_Fec), GXutil.resetTime(AV65FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A8664Almc_Pre, AV64PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char19[0] = A396EmprCod ;
         GXv_char18[0] = A719PrdNum ;
         GXv_int13[0] = AV16Year ;
         GXv_int15[0] = AV21Mes ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = AV28UniOld ;
         GXv_decimal10[0] = A8664Almc_Pre ;
         GXv_int12[0] = AV16Year ;
         GXv_int8[0] = AV62AnyAnt ;
         GXv_int14[0] = AV21Mes ;
         GXv_int9[0] = AV63MesAnt ;
         GXv_decimal7[0] = AV64PrecAnt ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_date4[0] = AV65FecAnt ;
         GXv_char3[0] = "1" ;
         GXv_char2[0] = AV60Modo2 ;
         new app.pprden2(remoteHandle, context).execute( GXv_char19, GXv_char18, GXv_int13, GXv_int15, GXv_decimal16, GXv_decimal11, GXv_decimal10, GXv_int12, GXv_int8, GXv_int14, GXv_int9, GXv_decimal7, GXv_date17, GXv_date4, GXv_char3, GXv_char2) ;
         talmcon_impl.this.A396EmprCod = GXv_char19[0] ;
         talmcon_impl.this.A719PrdNum = GXv_char18[0] ;
         talmcon_impl.this.AV16Year = GXv_int13[0] ;
         talmcon_impl.this.AV21Mes = GXv_int15[0] ;
         talmcon_impl.this.A8663Almc_UniE = GXv_decimal16[0] ;
         talmcon_impl.this.AV28UniOld = GXv_decimal11[0] ;
         talmcon_impl.this.A8664Almc_Pre = GXv_decimal10[0] ;
         talmcon_impl.this.AV16Year = GXv_int12[0] ;
         talmcon_impl.this.AV62AnyAnt = GXv_int8[0] ;
         talmcon_impl.this.AV21Mes = GXv_int14[0] ;
         talmcon_impl.this.AV63MesAnt = GXv_int9[0] ;
         talmcon_impl.this.AV64PrecAnt = GXv_decimal7[0] ;
         talmcon_impl.this.A8666ALmc_Fec = GXv_date17[0] ;
         talmcon_impl.this.AV65FecAnt = GXv_date4[0] ;
         talmcon_impl.this.AV60Modo2 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char19[0] = A396EmprCod ;
         GXv_char18[0] = A719PrdNum ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = A8664Almc_Pre ;
         new app.pacespd(remoteHandle, context).execute( GXv_char19, GXv_char18, GXv_date17, GXv_decimal16, GXv_decimal11) ;
         talmcon_impl.this.A396EmprCod = GXv_char19[0] ;
         talmcon_impl.this.A719PrdNum = GXv_char18[0] ;
         talmcon_impl.this.A8666ALmc_Fec = GXv_date17[0] ;
         talmcon_impl.this.A8663Almc_UniE = GXv_decimal16[0] ;
         talmcon_impl.this.A8664Almc_Pre = GXv_decimal11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      if ( ( A8672Almc_Prov == 0 ) && true /* After */ )
      {
         GXCCtl = "ALMC_PROV_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor Inexistente", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_Prov_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char19[0] = A396EmprCod ;
         GXv_int6[0] = A8672Almc_Prov ;
         GXv_int13[0] = AV16Year ;
         GXv_int15[0] = AV21Mes ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = AV28UniOld ;
         GXv_decimal10[0] = A8664Almc_Pre ;
         GXv_char18[0] = "1" ;
         GXv_int12[0] = AV16Year ;
         GXv_int8[0] = AV62AnyAnt ;
         GXv_int14[0] = AV21Mes ;
         GXv_int9[0] = AV63MesAnt ;
         GXv_decimal7[0] = AV64PrecAnt ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_date4[0] = AV65FecAnt ;
         GXv_char3[0] = AV60Modo2 ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char19, GXv_int6, GXv_int13, GXv_int15, GXv_decimal16, GXv_decimal11, GXv_decimal10, GXv_char18, GXv_int12, GXv_int8, GXv_int14, GXv_int9, GXv_decimal7, GXv_date17, GXv_date4, GXv_char3) ;
         talmcon_impl.this.A396EmprCod = GXv_char19[0] ;
         talmcon_impl.this.A8672Almc_Prov = GXv_int6[0] ;
         talmcon_impl.this.AV16Year = GXv_int13[0] ;
         talmcon_impl.this.AV21Mes = GXv_int15[0] ;
         talmcon_impl.this.A8663Almc_UniE = GXv_decimal16[0] ;
         talmcon_impl.this.AV28UniOld = GXv_decimal11[0] ;
         talmcon_impl.this.A8664Almc_Pre = GXv_decimal10[0] ;
         talmcon_impl.this.AV16Year = GXv_int12[0] ;
         talmcon_impl.this.AV62AnyAnt = GXv_int8[0] ;
         talmcon_impl.this.AV21Mes = GXv_int14[0] ;
         talmcon_impl.this.AV63MesAnt = GXv_int9[0] ;
         talmcon_impl.this.AV64PrecAnt = GXv_decimal7[0] ;
         talmcon_impl.this.A8666ALmc_Fec = GXv_date17[0] ;
         talmcon_impl.this.AV65FecAnt = GXv_date4[0] ;
         talmcon_impl.this.AV60Modo2 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      }
      if ( ( ( ( DecimalUtil.compareTo(A8663Almc_UniE, AV28UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A8666ALmc_Fec), GXutil.resetTime(AV65FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A8664Almc_Pre, AV64PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char19[0] = A396EmprCod ;
         GXv_int6[0] = A8672Almc_Prov ;
         GXv_int13[0] = AV16Year ;
         GXv_int15[0] = AV21Mes ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = AV28UniOld ;
         GXv_decimal10[0] = A8664Almc_Pre ;
         GXv_char18[0] = "1" ;
         GXv_int12[0] = AV16Year ;
         GXv_int8[0] = AV62AnyAnt ;
         GXv_int14[0] = AV21Mes ;
         GXv_int9[0] = AV63MesAnt ;
         GXv_decimal7[0] = AV64PrecAnt ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_date4[0] = AV65FecAnt ;
         GXv_char3[0] = AV60Modo2 ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char19, GXv_int6, GXv_int13, GXv_int15, GXv_decimal16, GXv_decimal11, GXv_decimal10, GXv_char18, GXv_int12, GXv_int8, GXv_int14, GXv_int9, GXv_decimal7, GXv_date17, GXv_date4, GXv_char3) ;
         talmcon_impl.this.A396EmprCod = GXv_char19[0] ;
         talmcon_impl.this.A8672Almc_Prov = GXv_int6[0] ;
         talmcon_impl.this.AV16Year = GXv_int13[0] ;
         talmcon_impl.this.AV21Mes = GXv_int15[0] ;
         talmcon_impl.this.A8663Almc_UniE = GXv_decimal16[0] ;
         talmcon_impl.this.AV28UniOld = GXv_decimal11[0] ;
         talmcon_impl.this.A8664Almc_Pre = GXv_decimal10[0] ;
         talmcon_impl.this.AV16Year = GXv_int12[0] ;
         talmcon_impl.this.AV62AnyAnt = GXv_int8[0] ;
         talmcon_impl.this.AV21Mes = GXv_int14[0] ;
         talmcon_impl.this.AV63MesAnt = GXv_int9[0] ;
         talmcon_impl.this.AV64PrecAnt = GXv_decimal7[0] ;
         talmcon_impl.this.A8666ALmc_Fec = GXv_date17[0] ;
         talmcon_impl.this.AV65FecAnt = GXv_date4[0] ;
         talmcon_impl.this.AV60Modo2 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char19[0] = A396EmprCod ;
         GXv_int6[0] = A8672Almc_Prov ;
         GXv_char18[0] = A719PrdNum ;
         GXv_char3[0] = A718PrdNom ;
         GXv_int13[0] = AV16Year ;
         GXv_int15[0] = AV21Mes ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = AV28UniOld ;
         GXv_decimal10[0] = A8664Almc_Pre ;
         GXv_char2[0] = "1" ;
         GXv_int12[0] = AV16Year ;
         GXv_int8[0] = AV62AnyAnt ;
         GXv_int14[0] = AV21Mes ;
         GXv_int9[0] = AV63MesAnt ;
         GXv_decimal7[0] = AV64PrecAnt ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_date4[0] = AV65FecAnt ;
         GXv_char20[0] = AV60Modo2 ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char19, GXv_int6, GXv_char18, GXv_char3, GXv_int13, GXv_int15, GXv_decimal16, GXv_decimal11, GXv_decimal10, GXv_char2, GXv_int12, GXv_int8, GXv_int14, GXv_int9, GXv_decimal7, GXv_date17, GXv_date4, GXv_char20) ;
         talmcon_impl.this.A396EmprCod = GXv_char19[0] ;
         talmcon_impl.this.A8672Almc_Prov = GXv_int6[0] ;
         talmcon_impl.this.A719PrdNum = GXv_char18[0] ;
         talmcon_impl.this.A718PrdNom = GXv_char3[0] ;
         talmcon_impl.this.AV16Year = GXv_int13[0] ;
         talmcon_impl.this.AV21Mes = GXv_int15[0] ;
         talmcon_impl.this.A8663Almc_UniE = GXv_decimal16[0] ;
         talmcon_impl.this.AV28UniOld = GXv_decimal11[0] ;
         talmcon_impl.this.A8664Almc_Pre = GXv_decimal10[0] ;
         talmcon_impl.this.AV16Year = GXv_int12[0] ;
         talmcon_impl.this.AV62AnyAnt = GXv_int8[0] ;
         talmcon_impl.this.AV21Mes = GXv_int14[0] ;
         talmcon_impl.this.AV63MesAnt = GXv_int9[0] ;
         talmcon_impl.this.AV64PrecAnt = GXv_decimal7[0] ;
         talmcon_impl.this.A8666ALmc_Fec = GXv_date17[0] ;
         talmcon_impl.this.AV65FecAnt = GXv_date4[0] ;
         talmcon_impl.this.AV60Modo2 = GXv_char20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      }
      if ( ( ( ( DecimalUtil.compareTo(A8663Almc_UniE, AV28UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A8666ALmc_Fec), GXutil.resetTime(AV65FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A8664Almc_Pre, AV64PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int6[0] = A8672Almc_Prov ;
         GXv_char19[0] = A719PrdNum ;
         GXv_char18[0] = A718PrdNom ;
         GXv_int13[0] = AV16Year ;
         GXv_int15[0] = AV21Mes ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = AV28UniOld ;
         GXv_decimal10[0] = A8664Almc_Pre ;
         GXv_char3[0] = "1" ;
         GXv_int12[0] = AV16Year ;
         GXv_int8[0] = AV62AnyAnt ;
         GXv_int14[0] = AV21Mes ;
         GXv_int9[0] = AV63MesAnt ;
         GXv_decimal7[0] = AV64PrecAnt ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_date4[0] = AV65FecAnt ;
         GXv_char2[0] = AV60Modo2 ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char20, GXv_int6, GXv_char19, GXv_char18, GXv_int13, GXv_int15, GXv_decimal16, GXv_decimal11, GXv_decimal10, GXv_char3, GXv_int12, GXv_int8, GXv_int14, GXv_int9, GXv_decimal7, GXv_date17, GXv_date4, GXv_char2) ;
         talmcon_impl.this.A396EmprCod = GXv_char20[0] ;
         talmcon_impl.this.A8672Almc_Prov = GXv_int6[0] ;
         talmcon_impl.this.A719PrdNum = GXv_char19[0] ;
         talmcon_impl.this.A718PrdNom = GXv_char18[0] ;
         talmcon_impl.this.AV16Year = GXv_int13[0] ;
         talmcon_impl.this.AV21Mes = GXv_int15[0] ;
         talmcon_impl.this.A8663Almc_UniE = GXv_decimal16[0] ;
         talmcon_impl.this.AV28UniOld = GXv_decimal11[0] ;
         talmcon_impl.this.A8664Almc_Pre = GXv_decimal10[0] ;
         talmcon_impl.this.AV16Year = GXv_int12[0] ;
         talmcon_impl.this.AV62AnyAnt = GXv_int8[0] ;
         talmcon_impl.this.AV21Mes = GXv_int14[0] ;
         talmcon_impl.this.AV63MesAnt = GXv_int9[0] ;
         talmcon_impl.this.AV64PrecAnt = GXv_decimal7[0] ;
         talmcon_impl.this.A8666ALmc_Fec = GXv_date17[0] ;
         talmcon_impl.this.AV65FecAnt = GXv_date4[0] ;
         talmcon_impl.this.AV60Modo2 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int6[0] = A8672Almc_Prov ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_int21[0] = 0 ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = A8664Almc_Pre ;
         GXv_char19[0] = "1" ;
         new app.pacespr(remoteHandle, context).execute( GXv_char20, GXv_int6, GXv_date17, GXv_int21, GXv_decimal16, GXv_decimal11, GXv_char19) ;
         talmcon_impl.this.A396EmprCod = GXv_char20[0] ;
         talmcon_impl.this.A8672Almc_Prov = GXv_int6[0] ;
         talmcon_impl.this.A8666ALmc_Fec = GXv_date17[0] ;
         talmcon_impl.this.A8663Almc_UniE = GXv_decimal16[0] ;
         talmcon_impl.this.A8664Almc_Pre = GXv_decimal11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A8672Almc_Prov ;
         GXv_char19[0] = A719PrdNum ;
         GXv_char18[0] = A718PrdNom ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_int6[0] = 0 ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = A8664Almc_Pre ;
         GXv_char3[0] = "1" ;
         new app.pacesprx(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_char19, GXv_char18, GXv_date17, GXv_int6, GXv_decimal16, GXv_decimal11, GXv_char3) ;
         talmcon_impl.this.A396EmprCod = GXv_char20[0] ;
         talmcon_impl.this.A8672Almc_Prov = GXv_int21[0] ;
         talmcon_impl.this.A719PrdNum = GXv_char19[0] ;
         talmcon_impl.this.A718PrdNom = GXv_char18[0] ;
         talmcon_impl.this.A8666ALmc_Fec = GXv_date17[0] ;
         talmcon_impl.this.A8663Almc_UniE = GXv_decimal16[0] ;
         talmcon_impl.this.A8664Almc_Pre = GXv_decimal11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      }
   }

   public void beforeInsert12G1184( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate12G1184( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete12G1184( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete12G1184( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate12G1184( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes12G1184( )
   {
      edtAlmc_Ln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Ln_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_alb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_alb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_alb_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_UniE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_UniE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_UniE_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Pre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Pre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Pre_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Rem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Rem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Rem_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtALmc_Fec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALmc_Fec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALmc_Fec_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Con_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Con_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Con_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Prov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Prov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Prov_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Ped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Ped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Ped_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Cum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Cum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Cum_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Lote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Lote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Lote_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Nct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Nct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Nct_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void send_integrity_lvl_hashes12G1184( )
   {
   }

   public void send_integrity_lvl_hashes12G29( )
   {
   }

   public void subsflControlProps_851184( )
   {
      edtavnRcdDeleted_1184_Internalname = "vNRCDDELETED_1184_"+sGXsfl_85_idx ;
      edtAlmc_Ln_Internalname = "ALMC_LN_"+sGXsfl_85_idx ;
      edtAlmc_alb_Internalname = "ALMC_ALB_"+sGXsfl_85_idx ;
      edtAlmc_UniE_Internalname = "ALMC_UNIE_"+sGXsfl_85_idx ;
      edtAlmc_Pre_Internalname = "ALMC_PRE_"+sGXsfl_85_idx ;
      edtAlmc_Rem_Internalname = "ALMC_REM_"+sGXsfl_85_idx ;
      edtALmc_Fec_Internalname = "ALMC_FEC_"+sGXsfl_85_idx ;
      edtAlmc_Con_Internalname = "ALMC_CON_"+sGXsfl_85_idx ;
      edtAlmc_Prov_Internalname = "ALMC_PROV_"+sGXsfl_85_idx ;
      edtAlmc_Ped_Internalname = "ALMC_PED_"+sGXsfl_85_idx ;
      edtAlmc_Cum_Internalname = "ALMC_CUM_"+sGXsfl_85_idx ;
      edtAlmc_Lote_Internalname = "ALMC_LOTE_"+sGXsfl_85_idx ;
      edtAlmc_Nct_Internalname = "ALMC_NCT_"+sGXsfl_85_idx ;
   }

   public void subsflControlProps_fel_851184( )
   {
      edtavnRcdDeleted_1184_Internalname = "vNRCDDELETED_1184_"+sGXsfl_85_fel_idx ;
      edtAlmc_Ln_Internalname = "ALMC_LN_"+sGXsfl_85_fel_idx ;
      edtAlmc_alb_Internalname = "ALMC_ALB_"+sGXsfl_85_fel_idx ;
      edtAlmc_UniE_Internalname = "ALMC_UNIE_"+sGXsfl_85_fel_idx ;
      edtAlmc_Pre_Internalname = "ALMC_PRE_"+sGXsfl_85_fel_idx ;
      edtAlmc_Rem_Internalname = "ALMC_REM_"+sGXsfl_85_fel_idx ;
      edtALmc_Fec_Internalname = "ALMC_FEC_"+sGXsfl_85_fel_idx ;
      edtAlmc_Con_Internalname = "ALMC_CON_"+sGXsfl_85_fel_idx ;
      edtAlmc_Prov_Internalname = "ALMC_PROV_"+sGXsfl_85_fel_idx ;
      edtAlmc_Ped_Internalname = "ALMC_PED_"+sGXsfl_85_fel_idx ;
      edtAlmc_Cum_Internalname = "ALMC_CUM_"+sGXsfl_85_fel_idx ;
      edtAlmc_Lote_Internalname = "ALMC_LOTE_"+sGXsfl_85_fel_idx ;
      edtAlmc_Nct_Internalname = "ALMC_NCT_"+sGXsfl_85_fel_idx ;
   }

   public void addRow12G1184( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851184( ) ;
      sendRow12G1184( ) ;
   }

   public void sendRow12G1184( )
   {
      Grid1Row = GXWebRow.GetNew(context) ;
      if ( subGrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         subGrid1_Backcolor = subGrid1_Allbackcolor ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
         subGrid1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_85_idx) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1184_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1184_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1184, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1184_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1184), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1184), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1184_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1184_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlmc_Ln_Internalname,GXutil.ltrim( localUtil.ntoc( A8661Almc_Ln, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlmc_Ln_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8661Almc_Ln), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8661Almc_Ln), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlmc_Ln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlmc_Ln_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1184_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlmc_alb_Internalname,GXutil.rtrim( A8662Almc_alb),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlmc_alb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlmc_alb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1184_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlmc_UniE_Internalname,GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlmc_UniE_Enabled!=0) ? localUtil.format( A8663Almc_UniE, "ZZZZZ9.99") : localUtil.format( A8663Almc_UniE, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlmc_UniE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlmc_UniE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1184_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlmc_Pre_Internalname,GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlmc_Pre_Enabled!=0) ? localUtil.format( A8664Almc_Pre, "ZZZZZZZ9.99999") : localUtil.format( A8664Almc_Pre, "ZZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlmc_Pre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlmc_Pre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlmc_Rem_Internalname,GXutil.ltrim( localUtil.ntoc( A8665Almc_Rem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlmc_Rem_Enabled!=0) ? localUtil.format( A8665Almc_Rem, "ZZZZZ9.9999") : localUtil.format( A8665Almc_Rem, "ZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlmc_Rem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlmc_Rem_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1184_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtALmc_Fec_Internalname,localUtil.format(A8666ALmc_Fec, "99/99/99"),localUtil.format( A8666ALmc_Fec, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtALmc_Fec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtALmc_Fec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlmc_Con_Internalname,GXutil.ltrim( localUtil.ntoc( A8667Almc_Con, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlmc_Con_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8667Almc_Con), "9") : localUtil.format( DecimalUtil.doubleToDec(A8667Almc_Con), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlmc_Con_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlmc_Con_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1184_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlmc_Prov_Internalname,GXutil.ltrim( localUtil.ntoc( A8672Almc_Prov, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlmc_Prov_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8672Almc_Prov), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8672Almc_Prov), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlmc_Prov_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlmc_Prov_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlmc_Ped_Internalname,GXutil.ltrim( localUtil.ntoc( A12578Almc_Ped, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlmc_Ped_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12578Almc_Ped), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12578Almc_Ped), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlmc_Ped_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlmc_Ped_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1184_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlmc_Cum_Internalname,GXutil.rtrim( A12579Almc_Cum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlmc_Cum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlmc_Cum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1184_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlmc_Lote_Internalname,GXutil.rtrim( A12643Almc_Lote),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlmc_Lote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlmc_Lote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1184_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlmc_Nct_Internalname,GXutil.ltrim( localUtil.ntoc( A12849Almc_Nct, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlmc_Nct_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12849Almc_Nct), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12849Almc_Nct), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlmc_Nct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlmc_Nct_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes12G1184( ) ;
      GXCCtl = "Z8661Almc_Ln_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8661Almc_Ln, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8666ALmc_Fec_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z8666ALmc_Fec, 0, "/"));
      GXCCtl = "Z8667Almc_Con_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8667Almc_Con, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8665Almc_Rem_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8665Almc_Rem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8662Almc_alb_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8662Almc_alb));
      GXCCtl = "Z8663Almc_UniE_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8663Almc_UniE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8664Almc_Pre_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8664Almc_Pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8672Almc_Prov_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8672Almc_Prov, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12578Almc_Ped_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12578Almc_Ped, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12579Almc_Cum_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12579Almc_Cum));
      GXCCtl = "Z12643Almc_Lote_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12643Almc_Lote));
      GXCCtl = "Z12849Almc_Nct_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12849Almc_Nct, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O8666ALmc_Fec_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( O8666ALmc_Fec, 0, "/"));
      GXCCtl = "O8664Almc_Pre_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O8664Almc_Pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O8663Almc_UniE_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O8663Almc_UniE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O8665Almc_Rem_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O8665Almc_Rem, (byte)(11), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1184_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1184, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1184_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1184, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1184_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1184, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "MODO2_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV60Modo2));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1184_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1184_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALMC_LN_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Ln_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALMC_ALB_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_alb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALMC_UNIE_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_UniE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALMC_PRE_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Pre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALMC_REM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Rem_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALMC_FEC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALmc_Fec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALMC_CON_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Con_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALMC_PROV_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Prov_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALMC_PED_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Ped_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALMC_CUM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Cum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALMC_LOTE_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Lote_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALMC_NCT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Nct_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow12G1184( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851184( ) ;
      edtavnRcdDeleted_1184_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1184_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlmc_Ln_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_LN_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlmc_alb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_ALB_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlmc_UniE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_UNIE_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlmc_Pre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_PRE_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlmc_Rem_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_REM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtALmc_Fec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_FEC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlmc_Con_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_CON_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlmc_Prov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_PROV_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlmc_Ped_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_PED_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlmc_Cum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_CUM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlmc_Lote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_LOTE_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlmc_Nct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALMC_NCT_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1184_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1184_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1184");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1184_Internalname ;
         wbErr = true ;
         nRcdDeleted_1184 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1184 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1184_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A8661Almc_Ln = (int)(localUtil.ctol( httpContext.cgiGet( edtAlmc_Ln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A8662Almc_alb = httpContext.cgiGet( edtAlmc_alb_Internalname) ;
      n8662Almc_alb = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlmc_UniE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlmc_UniE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALMC_UNIE_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_UniE_Internalname ;
         wbErr = true ;
         A8663Almc_UniE = DecimalUtil.ZERO ;
         n8663Almc_UniE = false ;
      }
      else
      {
         A8663Almc_UniE = localUtil.ctond( httpContext.cgiGet( edtAlmc_UniE_Internalname)) ;
         n8663Almc_UniE = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlmc_Pre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlmc_Pre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ALMC_PRE_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_Pre_Internalname ;
         wbErr = true ;
         A8664Almc_Pre = DecimalUtil.ZERO ;
         n8664Almc_Pre = false ;
      }
      else
      {
         A8664Almc_Pre = localUtil.ctond( httpContext.cgiGet( edtAlmc_Pre_Internalname)) ;
         n8664Almc_Pre = false ;
      }
      A8665Almc_Rem = localUtil.ctond( httpContext.cgiGet( edtAlmc_Rem_Internalname)) ;
      n8665Almc_Rem = false ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtALmc_Fec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "ALMC_FEC_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtALmc_Fec_Internalname ;
         wbErr = true ;
         A8666ALmc_Fec = GXutil.nullDate() ;
         n8666ALmc_Fec = false ;
      }
      else
      {
         A8666ALmc_Fec = localUtil.ctod( httpContext.cgiGet( edtALmc_Fec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n8666ALmc_Fec = false ;
      }
      A8667Almc_Con = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlmc_Con_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n8667Almc_Con = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlmc_Prov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlmc_Prov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "ALMC_PROV_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_Prov_Internalname ;
         wbErr = true ;
         A8672Almc_Prov = 0 ;
         n8672Almc_Prov = false ;
      }
      else
      {
         A8672Almc_Prov = (int)(localUtil.ctol( httpContext.cgiGet( edtAlmc_Prov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8672Almc_Prov = false ;
      }
      A12578Almc_Ped = (int)(localUtil.ctol( httpContext.cgiGet( edtAlmc_Ped_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n12578Almc_Ped = false ;
      A12579Almc_Cum = httpContext.cgiGet( edtAlmc_Cum_Internalname) ;
      n12579Almc_Cum = false ;
      A12643Almc_Lote = httpContext.cgiGet( edtAlmc_Lote_Internalname) ;
      n12643Almc_Lote = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlmc_Nct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlmc_Nct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALMC_NCT_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_Nct_Internalname ;
         wbErr = true ;
         A12849Almc_Nct = (short)(0) ;
         n12849Almc_Nct = false ;
      }
      else
      {
         A12849Almc_Nct = (short)(localUtil.ctol( httpContext.cgiGet( edtAlmc_Nct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12849Almc_Nct = false ;
      }
      GXCCtl = "Z8661Almc_Ln_" + sGXsfl_85_idx ;
      Z8661Almc_Ln = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8666ALmc_Fec_" + sGXsfl_85_idx ;
      Z8666ALmc_Fec = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z8667Almc_Con_" + sGXsfl_85_idx ;
      Z8667Almc_Con = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8665Almc_Rem_" + sGXsfl_85_idx ;
      Z8665Almc_Rem = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8662Almc_alb_" + sGXsfl_85_idx ;
      Z8662Almc_alb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8663Almc_UniE_" + sGXsfl_85_idx ;
      Z8663Almc_UniE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8664Almc_Pre_" + sGXsfl_85_idx ;
      Z8664Almc_Pre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8672Almc_Prov_" + sGXsfl_85_idx ;
      Z8672Almc_Prov = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12578Almc_Ped_" + sGXsfl_85_idx ;
      Z12578Almc_Ped = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12579Almc_Cum_" + sGXsfl_85_idx ;
      Z12579Almc_Cum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12643Almc_Lote_" + sGXsfl_85_idx ;
      Z12643Almc_Lote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12849Almc_Nct_" + sGXsfl_85_idx ;
      Z12849Almc_Nct = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O8666ALmc_Fec_" + sGXsfl_85_idx ;
      O8666ALmc_Fec = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "O8664Almc_Pre_" + sGXsfl_85_idx ;
      O8664Almc_Pre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O8663Almc_UniE_" + sGXsfl_85_idx ;
      O8663Almc_UniE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O8665Almc_Rem_" + sGXsfl_85_idx ;
      O8665Almc_Rem = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1184_" + sGXsfl_85_idx ;
      nRcdDeleted_1184 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1184_" + sGXsfl_85_idx ;
      nRcdExists_1184 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1184_" + sGXsfl_85_idx ;
      nIsMod_1184 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "MODO2_" + sGXsfl_85_idx ;
      AV60Modo2 = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtAlmc_Ped_Enabled = edtAlmc_Ped_Enabled ;
      defedtAlmc_Con_Enabled = edtAlmc_Con_Enabled ;
      defedtAlmc_Rem_Enabled = edtAlmc_Rem_Enabled ;
      defedtAlmc_Ln_Enabled = edtAlmc_Ln_Enabled ;
   }

   public void confirmValues12G0( )
   {
      nGXsfl_85_idx = 0 ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851184( ) ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851184( ) ;
         httpContext.changePostValue( "Z8661Almc_Ln_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z8661Almc_Ln_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8661Almc_Ln_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z8666ALmc_Fec_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z8666ALmc_Fec_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8666ALmc_Fec_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z8667Almc_Con_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z8667Almc_Con_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8667Almc_Con_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z8665Almc_Rem_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z8665Almc_Rem_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8665Almc_Rem_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z8662Almc_alb_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z8662Almc_alb_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8662Almc_alb_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z8663Almc_UniE_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z8663Almc_UniE_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8663Almc_UniE_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z8664Almc_Pre_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z8664Almc_Pre_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8664Almc_Pre_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z8672Almc_Prov_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z8672Almc_Prov_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8672Almc_Prov_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z12578Almc_Ped_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z12578Almc_Ped_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12578Almc_Ped_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z12579Almc_Cum_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z12579Almc_Cum_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12579Almc_Cum_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z12643Almc_Lote_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z12643Almc_Lote_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12643Almc_Lote_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z12849Almc_Nct_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z12849Almc_Nct_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12849Almc_Nct_"+sGXsfl_85_idx) ;
      }
      httpContext.changePostValue( "O8666ALmc_Fec", httpContext.cgiGet( "T8666ALmc_Fec")) ;
      httpContext.deletePostValue( "T8666ALmc_Fec") ;
      httpContext.changePostValue( "O8664Almc_Pre", httpContext.cgiGet( "T8664Almc_Pre")) ;
      httpContext.deletePostValue( "T8664Almc_Pre") ;
      httpContext.changePostValue( "O8663Almc_UniE", httpContext.cgiGet( "T8663Almc_UniE")) ;
      httpContext.deletePostValue( "T8663Almc_UniE") ;
      httpContext.changePostValue( "O8665Almc_Rem", httpContext.cgiGet( "T8665Almc_Rem")) ;
      httpContext.deletePostValue( "T8665Almc_Rem") ;
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), false);
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
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.talmcon", new String[] {}, new String[] {}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "Form", true);
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TALMCON");
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV59Modo, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("talmcon:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z727PrdRec", GXutil.rtrim( Z727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8659PrdExiAlmc", GXutil.ltrim( localUtil.ntoc( Z8659PrdExiAlmc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8660Almc_Ult", GXutil.ltrim( localUtil.ntoc( Z8660Almc_Ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z721PrdNumUco", GXutil.ltrim( localUtil.ntoc( Z721PrdNumUco, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8659PrdExiAlmc", GXutil.ltrim( localUtil.ntoc( O8659PrdExiAlmc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_85", GXutil.ltrim( localUtil.ntoc( nGXsfl_85_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO", GXutil.rtrim( AV59Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "OLDEXIALM", GXutil.ltrim( localUtil.ntoc( AV68OldExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV59Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV23UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDEXIALM", GXutil.ltrim( localUtil.ntoc( AV68OldExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO2", GXutil.rtrim( AV60Modo2));
      app.GxWebStd.gx_hidden_field( httpContext, "vYEAR", GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMES", GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTPRE", GXutil.ltrim( localUtil.ntoc( AV69OldEntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDENTUNI", GXutil.ltrim( localUtil.ntoc( AV70OldEntUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNOMX", GXutil.rtrim( AV89PrdNomX));
      app.GxWebStd.gx_hidden_field( httpContext, "vUNIOLD", GXutil.ltrim( localUtil.ntoc( AV28UniOld, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECANT", localUtil.dtoc( AV65FecAnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRECANT", GXutil.ltrim( localUtil.ntoc( AV64PrecAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vANYANT", GXutil.ltrim( localUtil.ntoc( AV62AnyAnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMESANT", GXutil.ltrim( localUtil.ntoc( AV63MesAnt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHA", localUtil.dtoc( AV19Fecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vVPRECIO", GXutil.ltrim( localUtil.ntoc( AV56vPrecio, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDIASFIN", GXutil.ltrim( localUtil.ntoc( AV20DiasFin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGPRE", GXutil.ltrim( localUtil.ntoc( AV76FlagPre, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "Form" : Form.getThemeClass())+"-fx");
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
      return formatLink("app.talmcon", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TALMCON" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ALMACEN EN CONSIGNA", "") ;
   }

   public void initializeNonKey12G29( )
   {
      AV59Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Modo", AV59Modo);
      AV68OldExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrimstr( AV68OldExiAlm, 12, 4));
      A3835UltFecCCs = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A795PrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A794PrvNom = "" ;
      n794PrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A727PrdRec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A8659PrdExiAlmc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
      A705PrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A8660Almc_Ult = 0 ;
      n8660Almc_Ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8660Almc_Ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8660Almc_Ult), 6, 0));
      A721PrdNumUco = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
      O8659PrdExiAlmc = A8659PrdExiAlmc ;
      httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
      Z718PrdNom = "" ;
      Z727PrdRec = "" ;
      Z8659PrdExiAlmc = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z8660Almc_Ult = 0 ;
      Z721PrdNumUco = DecimalUtil.ZERO ;
      Z795PrvNum = 0 ;
      Z856ValCod = (byte)(0) ;
   }

   public void initAll12G29( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey12G29( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV59Modo = iV59Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Modo", AV59Modo);
   }

   public void initializeNonKey12G1184( )
   {
      AV60Modo2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      AV16Year = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
      AV21Mes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
      A8665Almc_Rem = DecimalUtil.ZERO ;
      n8665Almc_Rem = false ;
      AV69OldEntPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69OldEntPre", GXutil.ltrimstr( AV69OldEntPre, 14, 5));
      AV70OldEntUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70OldEntUni", GXutil.ltrimstr( AV70OldEntUni, 9, 2));
      AV89PrdNomX = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89PrdNomX", AV89PrdNomX);
      AV28UniOld = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
      AV65FecAnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
      AV64PrecAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
      AV62AnyAnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
      AV63MesAnt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
      AV56vPrecio = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56vPrecio", GXutil.ltrimstr( AV56vPrecio, 14, 5));
      AV76FlagPre = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76FlagPre", GXutil.str( AV76FlagPre, 1, 0));
      A8662Almc_alb = "" ;
      n8662Almc_alb = false ;
      A8663Almc_UniE = DecimalUtil.ZERO ;
      n8663Almc_UniE = false ;
      A8664Almc_Pre = DecimalUtil.ZERO ;
      n8664Almc_Pre = false ;
      A8672Almc_Prov = 0 ;
      n8672Almc_Prov = false ;
      A12578Almc_Ped = 0 ;
      n12578Almc_Ped = false ;
      A12579Almc_Cum = "" ;
      n12579Almc_Cum = false ;
      A12643Almc_Lote = "" ;
      n12643Almc_Lote = false ;
      A12849Almc_Nct = (short)(0) ;
      n12849Almc_Nct = false ;
      AV19Fecha = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Fecha", localUtil.format(AV19Fecha, "99/99/99"));
      AV20DiasFin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20DiasFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20DiasFin), 3, 0));
      A8666ALmc_Fec = GXutil.today( ) ;
      n8666ALmc_Fec = false ;
      O8666ALmc_Fec = A8666ALmc_Fec ;
      n8666ALmc_Fec = false ;
      O8664Almc_Pre = A8664Almc_Pre ;
      n8664Almc_Pre = false ;
      O8663Almc_UniE = A8663Almc_UniE ;
      n8663Almc_UniE = false ;
      O8665Almc_Rem = A8665Almc_Rem ;
      n8665Almc_Rem = false ;
      Z8666ALmc_Fec = GXutil.nullDate() ;
      Z8667Almc_Con = (byte)(0) ;
      Z8665Almc_Rem = DecimalUtil.ZERO ;
      Z8662Almc_alb = "" ;
      Z8663Almc_UniE = DecimalUtil.ZERO ;
      Z8664Almc_Pre = DecimalUtil.ZERO ;
      Z8672Almc_Prov = 0 ;
      Z12578Almc_Ped = 0 ;
      Z12579Almc_Cum = "" ;
      Z12643Almc_Lote = "" ;
      Z12849Almc_Nct = (short)(0) ;
   }

   public void initAll12G1184( )
   {
      A8661Almc_Ln = 0 ;
      initializeNonKey12G1184( ) ;
   }

   public void standaloneModalInsert12G1184( )
   {
      AV60Modo2 = iV60Modo2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      A8667Almc_Con = i8667Almc_Con ;
      n8667Almc_Con = false ;
      A8666ALmc_Fec = i8666ALmc_Fec ;
      n8666ALmc_Fec = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241541228", true, true);
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
      httpContext.AddJavascriptSource("talmcon.js", "?20268241541228", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1184( )
   {
      edtAlmc_Ped_Enabled = defedtAlmc_Ped_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Ped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Ped_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Con_Enabled = defedtAlmc_Con_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Con_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Con_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Rem_Enabled = defedtAlmc_Rem_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Rem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Rem_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtAlmc_Ln_Enabled = defedtAlmc_Ln_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmc_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmc_Ln_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void startgridcontrol85( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1184, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1184_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8661Almc_Ln, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Ln_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8662Almc_alb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_alb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_UniE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Pre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8665Almc_Rem, (byte)(11), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Rem_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A8666ALmc_Fec, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtALmc_Fec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8667Almc_Con, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Con_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8672Almc_Prov, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Prov_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12578Almc_Ped, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Ped_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12579Almc_Cum));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Cum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12643Almc_Lote));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Lote_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12849Almc_Nct, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlmc_Nct_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtValCod_Internalname = "VALCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPrdRec_Internalname = "PRDREC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtPrdExiAlmc_Internalname = "PRDEXIALMC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAlmc_Ult_Internalname = "ALMC_ULT" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtUltFecCCs_Internalname = "ULTFECCCS" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtPrdNumUco_Internalname = "PRDNUMUCO" ;
      edtavnRcdDeleted_1184_Internalname = "vNRCDDELETED_1184" ;
      edtAlmc_Ln_Internalname = "ALMC_LN" ;
      edtAlmc_alb_Internalname = "ALMC_ALB" ;
      edtAlmc_UniE_Internalname = "ALMC_UNIE" ;
      edtAlmc_Pre_Internalname = "ALMC_PRE" ;
      edtAlmc_Rem_Internalname = "ALMC_REM" ;
      edtALmc_Fec_Internalname = "ALMC_FEC" ;
      edtAlmc_Con_Internalname = "ALMC_CON" ;
      edtAlmc_Prov_Internalname = "ALMC_PROV" ;
      edtAlmc_Ped_Internalname = "ALMC_PED" ;
      edtAlmc_Cum_Internalname = "ALMC_CUM" ;
      edtAlmc_Lote_Internalname = "ALMC_LOTE" ;
      edtAlmc_Nct_Internalname = "ALMC_NCT" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
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
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "ALMACEN EN CONSIGNA", "") );
      edtAlmc_Nct_Jsonclick = "" ;
      edtAlmc_Lote_Jsonclick = "" ;
      edtAlmc_Cum_Jsonclick = "" ;
      edtAlmc_Ped_Jsonclick = "" ;
      edtAlmc_Prov_Jsonclick = "" ;
      edtAlmc_Con_Jsonclick = "" ;
      edtALmc_Fec_Jsonclick = "" ;
      edtAlmc_Rem_Jsonclick = "" ;
      edtAlmc_Pre_Jsonclick = "" ;
      edtAlmc_UniE_Jsonclick = "" ;
      edtAlmc_alb_Jsonclick = "" ;
      edtAlmc_Ln_Jsonclick = "" ;
      edtavnRcdDeleted_1184_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAlmc_Nct_Enabled = 1 ;
      edtAlmc_Lote_Enabled = 1 ;
      edtAlmc_Cum_Enabled = 1 ;
      edtAlmc_Ped_Enabled = 0 ;
      edtAlmc_Prov_Enabled = 1 ;
      edtAlmc_Con_Enabled = 0 ;
      edtALmc_Fec_Enabled = 1 ;
      edtAlmc_Rem_Enabled = 0 ;
      edtAlmc_Pre_Enabled = 1 ;
      edtAlmc_UniE_Enabled = 1 ;
      edtAlmc_alb_Enabled = 1 ;
      edtAlmc_Ln_Enabled = 0 ;
      edtavnRcdDeleted_1184_Enabled = 1 ;
      edtPrdNumUco_Jsonclick = "" ;
      edtPrdNumUco_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNumUco_Enabled = 1 ;
      edtUltFecCCs_Jsonclick = "" ;
      edtUltFecCCs_Backcolor = (int)(0xFFFFFF) ;
      edtUltFecCCs_Enabled = 0 ;
      edtAlmc_Ult_Jsonclick = "" ;
      edtAlmc_Ult_Backcolor = (int)(0xFFFFFF) ;
      edtAlmc_Ult_Enabled = 1 ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiCC_Backcolor = (int)(0xFFFFFF) ;
      edtPrdExiCC_Enabled = 1 ;
      edtPrdExiAlmc_Jsonclick = "" ;
      edtPrdExiAlmc_Backcolor = (int)(0xFFFFFF) ;
      edtPrdExiAlmc_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtPrdRec_Jsonclick = "" ;
      edtPrdRec_Backcolor = (int)(0xFFFFFF) ;
      edtPrdRec_Enabled = 1 ;
      edtValCod_Jsonclick = "" ;
      edtValCod_Backcolor = (int)(0xFFFFFF) ;
      edtValCod_Enabled = 1 ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNom_Backcolor = (int)(0xFFFFFF) ;
      edtPrvNom_Enabled = 0 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrvNum_Enabled = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNum_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 0 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
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

   public void gx2asaultfecccs12G29( String A396EmprCod ,
                                     String A719PrdNum )
   {
      GXt_date1 = A3835UltFecCCs ;
      GXv_char20[0] = A396EmprCod ;
      GXv_char19[0] = A719PrdNum ;
      GXv_date17[0] = GXt_date1 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_date17) ;
      talmcon_impl.this.A396EmprCod = GXv_char20[0] ;
      talmcon_impl.this.A719PrdNum = GXv_char19[0] ;
      talmcon_impl.this.GXt_date1 = GXv_date17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date1 ;
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

   public void gx26asaprdnomx12G1184( String A396EmprCod ,
                                      int A8672Almc_Prov )
   {
      if ( true /* After */ )
      {
         GXt_char5 = AV89PrdNomX ;
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A8672Almc_Prov ;
         GXv_char19[0] = GXt_char5 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_char19) ;
         talmcon_impl.this.A396EmprCod = GXv_char20[0] ;
         talmcon_impl.this.A8672Almc_Prov = GXv_int21[0] ;
         talmcon_impl.this.GXt_char5 = GXv_char19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV89PrdNomX = GXt_char5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89PrdNomX", AV89PrdNomX);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV89PrdNomX))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_39_12G1184( String Gx_mode ,
                              String A396EmprCod ,
                              String A719PrdNum ,
                              int A8661Almc_Ln )
   {
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = A719PrdNum ;
         GXv_int21[0] = A8661Almc_Ln ;
         new app.palmc00(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_int21) ;
         A396EmprCod = GXv_char20[0] ;
         A719PrdNum = GXv_char19[0] ;
         A8661Almc_Ln = GXv_int21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8661Almc_Ln, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_49_12G1184( String A396EmprCod ,
                              String A719PrdNum ,
                              int A8672Almc_Prov ,
                              java.math.BigDecimal A8664Almc_Pre )
   {
      if ( true /* After */ || true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = A719PrdNum ;
         GXv_int21[0] = A8672Almc_Prov ;
         GXv_decimal16[0] = A8664Almc_Pre ;
         new app.pprenp(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_int21, GXv_decimal16) ;
         A396EmprCod = GXv_char20[0] ;
         A719PrdNum = GXv_char19[0] ;
         A8672Almc_Prov = GXv_int21[0] ;
         A8664Almc_Pre = GXv_decimal16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8672Almc_Prov, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_50_12G1184( String Gx_mode ,
                              String A396EmprCod ,
                              int A8672Almc_Prov ,
                              short AV16Year ,
                              byte AV21Mes ,
                              java.math.BigDecimal A8663Almc_UniE ,
                              java.math.BigDecimal AV28UniOld ,
                              java.math.BigDecimal A8664Almc_Pre ,
                              short AV62AnyAnt ,
                              byte AV63MesAnt ,
                              java.math.BigDecimal AV64PrecAnt ,
                              java.util.Date A8666ALmc_Fec ,
                              java.util.Date AV65FecAnt ,
                              String AV60Modo2 )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A8672Almc_Prov ;
         GXv_int13[0] = AV16Year ;
         GXv_int15[0] = AV21Mes ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = AV28UniOld ;
         GXv_decimal10[0] = A8664Almc_Pre ;
         GXv_char19[0] = "1" ;
         GXv_int12[0] = AV16Year ;
         GXv_int8[0] = AV62AnyAnt ;
         GXv_int14[0] = AV21Mes ;
         GXv_int9[0] = AV63MesAnt ;
         GXv_decimal7[0] = AV64PrecAnt ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_date4[0] = AV65FecAnt ;
         GXv_char18[0] = AV60Modo2 ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_int13, GXv_int15, GXv_decimal16, GXv_decimal11, GXv_decimal10, GXv_char19, GXv_int12, GXv_int8, GXv_int14, GXv_int9, GXv_decimal7, GXv_date17, GXv_date4, GXv_char18) ;
         A396EmprCod = GXv_char20[0] ;
         A8672Almc_Prov = GXv_int21[0] ;
         AV16Year = GXv_int13[0] ;
         AV21Mes = GXv_int15[0] ;
         A8663Almc_UniE = GXv_decimal16[0] ;
         AV28UniOld = GXv_decimal11[0] ;
         A8664Almc_Pre = GXv_decimal10[0] ;
         AV16Year = GXv_int12[0] ;
         AV62AnyAnt = GXv_int8[0] ;
         AV21Mes = GXv_int14[0] ;
         AV63MesAnt = GXv_int9[0] ;
         AV64PrecAnt = GXv_decimal7[0] ;
         A8666ALmc_Fec = GXv_date17[0] ;
         AV65FecAnt = GXv_date4[0] ;
         AV60Modo2 = GXv_char18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8672Almc_Prov, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV28UniOld, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV62AnyAnt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV63MesAnt, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV64PrecAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A8666ALmc_Fec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV65FecAnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV60Modo2))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_51_12G1184( String Gx_mode ,
                              String A396EmprCod ,
                              int A8672Almc_Prov ,
                              short AV16Year ,
                              byte AV21Mes ,
                              java.math.BigDecimal A8663Almc_UniE ,
                              java.math.BigDecimal AV28UniOld ,
                              java.math.BigDecimal A8664Almc_Pre ,
                              short AV62AnyAnt ,
                              byte AV63MesAnt ,
                              java.math.BigDecimal AV64PrecAnt ,
                              java.util.Date A8666ALmc_Fec ,
                              java.util.Date AV65FecAnt ,
                              String AV60Modo2 )
   {
      if ( ( ( ( DecimalUtil.compareTo(A8663Almc_UniE, AV28UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A8666ALmc_Fec), GXutil.resetTime(AV65FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A8664Almc_Pre, AV64PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A8672Almc_Prov ;
         GXv_int13[0] = AV16Year ;
         GXv_int15[0] = AV21Mes ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = AV28UniOld ;
         GXv_decimal10[0] = A8664Almc_Pre ;
         GXv_char19[0] = "1" ;
         GXv_int12[0] = AV16Year ;
         GXv_int8[0] = AV62AnyAnt ;
         GXv_int14[0] = AV21Mes ;
         GXv_int9[0] = AV63MesAnt ;
         GXv_decimal7[0] = AV64PrecAnt ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_date4[0] = AV65FecAnt ;
         GXv_char18[0] = AV60Modo2 ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_int13, GXv_int15, GXv_decimal16, GXv_decimal11, GXv_decimal10, GXv_char19, GXv_int12, GXv_int8, GXv_int14, GXv_int9, GXv_decimal7, GXv_date17, GXv_date4, GXv_char18) ;
         A396EmprCod = GXv_char20[0] ;
         A8672Almc_Prov = GXv_int21[0] ;
         AV16Year = GXv_int13[0] ;
         AV21Mes = GXv_int15[0] ;
         A8663Almc_UniE = GXv_decimal16[0] ;
         AV28UniOld = GXv_decimal11[0] ;
         A8664Almc_Pre = GXv_decimal10[0] ;
         AV16Year = GXv_int12[0] ;
         AV62AnyAnt = GXv_int8[0] ;
         AV21Mes = GXv_int14[0] ;
         AV63MesAnt = GXv_int9[0] ;
         AV64PrecAnt = GXv_decimal7[0] ;
         A8666ALmc_Fec = GXv_date17[0] ;
         AV65FecAnt = GXv_date4[0] ;
         AV60Modo2 = GXv_char18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8672Almc_Prov, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV28UniOld, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV62AnyAnt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV63MesAnt, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV64PrecAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A8666ALmc_Fec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV65FecAnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV60Modo2))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_52_12G1184( String Gx_mode ,
                              String A396EmprCod ,
                              int A8672Almc_Prov ,
                              String A719PrdNum ,
                              String A718PrdNom ,
                              short AV16Year ,
                              byte AV21Mes ,
                              java.math.BigDecimal A8663Almc_UniE ,
                              java.math.BigDecimal AV28UniOld ,
                              java.math.BigDecimal A8664Almc_Pre ,
                              short AV62AnyAnt ,
                              byte AV63MesAnt ,
                              java.math.BigDecimal AV64PrecAnt ,
                              java.util.Date A8666ALmc_Fec ,
                              java.util.Date AV65FecAnt ,
                              String AV60Modo2 )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A8672Almc_Prov ;
         GXv_char19[0] = A719PrdNum ;
         GXv_char18[0] = A718PrdNom ;
         GXv_int13[0] = AV16Year ;
         GXv_int15[0] = AV21Mes ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = AV28UniOld ;
         GXv_decimal10[0] = A8664Almc_Pre ;
         GXv_char3[0] = "1" ;
         GXv_int12[0] = AV16Year ;
         GXv_int8[0] = AV62AnyAnt ;
         GXv_int14[0] = AV21Mes ;
         GXv_int9[0] = AV63MesAnt ;
         GXv_decimal7[0] = AV64PrecAnt ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_date4[0] = AV65FecAnt ;
         GXv_char2[0] = AV60Modo2 ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_char19, GXv_char18, GXv_int13, GXv_int15, GXv_decimal16, GXv_decimal11, GXv_decimal10, GXv_char3, GXv_int12, GXv_int8, GXv_int14, GXv_int9, GXv_decimal7, GXv_date17, GXv_date4, GXv_char2) ;
         A396EmprCod = GXv_char20[0] ;
         A8672Almc_Prov = GXv_int21[0] ;
         A719PrdNum = GXv_char19[0] ;
         A718PrdNom = GXv_char18[0] ;
         AV16Year = GXv_int13[0] ;
         AV21Mes = GXv_int15[0] ;
         A8663Almc_UniE = GXv_decimal16[0] ;
         AV28UniOld = GXv_decimal11[0] ;
         A8664Almc_Pre = GXv_decimal10[0] ;
         AV16Year = GXv_int12[0] ;
         AV62AnyAnt = GXv_int8[0] ;
         AV21Mes = GXv_int14[0] ;
         AV63MesAnt = GXv_int9[0] ;
         AV64PrecAnt = GXv_decimal7[0] ;
         A8666ALmc_Fec = GXv_date17[0] ;
         AV65FecAnt = GXv_date4[0] ;
         AV60Modo2 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8672Almc_Prov, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV28UniOld, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV62AnyAnt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV63MesAnt, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV64PrecAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A8666ALmc_Fec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV65FecAnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV60Modo2))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_53_12G1184( String Gx_mode ,
                              String A396EmprCod ,
                              int A8672Almc_Prov ,
                              String A719PrdNum ,
                              String A718PrdNom ,
                              short AV16Year ,
                              byte AV21Mes ,
                              java.math.BigDecimal A8663Almc_UniE ,
                              java.math.BigDecimal AV28UniOld ,
                              java.math.BigDecimal A8664Almc_Pre ,
                              short AV62AnyAnt ,
                              byte AV63MesAnt ,
                              java.math.BigDecimal AV64PrecAnt ,
                              java.util.Date A8666ALmc_Fec ,
                              java.util.Date AV65FecAnt ,
                              String AV60Modo2 )
   {
      if ( ( ( ( DecimalUtil.compareTo(A8663Almc_UniE, AV28UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A8666ALmc_Fec), GXutil.resetTime(AV65FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A8664Almc_Pre, AV64PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A8672Almc_Prov ;
         GXv_char19[0] = A719PrdNum ;
         GXv_char18[0] = A718PrdNom ;
         GXv_int13[0] = AV16Year ;
         GXv_int15[0] = AV21Mes ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = AV28UniOld ;
         GXv_decimal10[0] = A8664Almc_Pre ;
         GXv_char3[0] = "1" ;
         GXv_int12[0] = AV16Year ;
         GXv_int8[0] = AV62AnyAnt ;
         GXv_int14[0] = AV21Mes ;
         GXv_int9[0] = AV63MesAnt ;
         GXv_decimal7[0] = AV64PrecAnt ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_date4[0] = AV65FecAnt ;
         GXv_char2[0] = AV60Modo2 ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_char19, GXv_char18, GXv_int13, GXv_int15, GXv_decimal16, GXv_decimal11, GXv_decimal10, GXv_char3, GXv_int12, GXv_int8, GXv_int14, GXv_int9, GXv_decimal7, GXv_date17, GXv_date4, GXv_char2) ;
         A396EmprCod = GXv_char20[0] ;
         A8672Almc_Prov = GXv_int21[0] ;
         A719PrdNum = GXv_char19[0] ;
         A718PrdNom = GXv_char18[0] ;
         AV16Year = GXv_int13[0] ;
         AV21Mes = GXv_int15[0] ;
         A8663Almc_UniE = GXv_decimal16[0] ;
         AV28UniOld = GXv_decimal11[0] ;
         A8664Almc_Pre = GXv_decimal10[0] ;
         AV16Year = GXv_int12[0] ;
         AV62AnyAnt = GXv_int8[0] ;
         AV21Mes = GXv_int14[0] ;
         AV63MesAnt = GXv_int9[0] ;
         AV64PrecAnt = GXv_decimal7[0] ;
         A8666ALmc_Fec = GXv_date17[0] ;
         AV65FecAnt = GXv_date4[0] ;
         AV60Modo2 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8672Almc_Prov, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV28UniOld, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV62AnyAnt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV63MesAnt, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV64PrecAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A8666ALmc_Fec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV65FecAnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV60Modo2))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_54_12G1184( String Gx_mode ,
                              String A396EmprCod ,
                              String A719PrdNum ,
                              short AV16Year ,
                              byte AV21Mes ,
                              java.math.BigDecimal A8663Almc_UniE ,
                              java.math.BigDecimal AV28UniOld ,
                              java.math.BigDecimal A8664Almc_Pre ,
                              short AV62AnyAnt ,
                              byte AV63MesAnt ,
                              java.math.BigDecimal AV64PrecAnt ,
                              java.util.Date A8666ALmc_Fec ,
                              java.util.Date AV65FecAnt ,
                              String AV60Modo2 )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = A719PrdNum ;
         GXv_int13[0] = AV16Year ;
         GXv_int15[0] = AV21Mes ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = AV28UniOld ;
         GXv_decimal10[0] = A8664Almc_Pre ;
         GXv_int12[0] = AV16Year ;
         GXv_int8[0] = AV62AnyAnt ;
         GXv_int14[0] = AV21Mes ;
         GXv_int9[0] = AV63MesAnt ;
         GXv_decimal7[0] = AV64PrecAnt ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_date4[0] = AV65FecAnt ;
         GXv_char18[0] = "1" ;
         GXv_char3[0] = AV60Modo2 ;
         new app.pprden2(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_int13, GXv_int15, GXv_decimal16, GXv_decimal11, GXv_decimal10, GXv_int12, GXv_int8, GXv_int14, GXv_int9, GXv_decimal7, GXv_date17, GXv_date4, GXv_char18, GXv_char3) ;
         A396EmprCod = GXv_char20[0] ;
         A719PrdNum = GXv_char19[0] ;
         AV16Year = GXv_int13[0] ;
         AV21Mes = GXv_int15[0] ;
         A8663Almc_UniE = GXv_decimal16[0] ;
         AV28UniOld = GXv_decimal11[0] ;
         A8664Almc_Pre = GXv_decimal10[0] ;
         AV16Year = GXv_int12[0] ;
         AV62AnyAnt = GXv_int8[0] ;
         AV21Mes = GXv_int14[0] ;
         AV63MesAnt = GXv_int9[0] ;
         AV64PrecAnt = GXv_decimal7[0] ;
         A8666ALmc_Fec = GXv_date17[0] ;
         AV65FecAnt = GXv_date4[0] ;
         AV60Modo2 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV28UniOld, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV62AnyAnt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV63MesAnt, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV64PrecAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A8666ALmc_Fec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV65FecAnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV60Modo2))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_55_12G1184( String Gx_mode ,
                              String A396EmprCod ,
                              String A719PrdNum ,
                              short AV16Year ,
                              byte AV21Mes ,
                              java.math.BigDecimal A8663Almc_UniE ,
                              java.math.BigDecimal AV28UniOld ,
                              java.math.BigDecimal A8664Almc_Pre ,
                              short AV62AnyAnt ,
                              byte AV63MesAnt ,
                              java.math.BigDecimal AV64PrecAnt ,
                              java.util.Date A8666ALmc_Fec ,
                              java.util.Date AV65FecAnt ,
                              String AV60Modo2 )
   {
      if ( ( ( ( DecimalUtil.compareTo(A8663Almc_UniE, AV28UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A8666ALmc_Fec), GXutil.resetTime(AV65FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A8664Almc_Pre, AV64PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = A719PrdNum ;
         GXv_int13[0] = AV16Year ;
         GXv_int15[0] = AV21Mes ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = AV28UniOld ;
         GXv_decimal10[0] = A8664Almc_Pre ;
         GXv_int12[0] = AV16Year ;
         GXv_int8[0] = AV62AnyAnt ;
         GXv_int14[0] = AV21Mes ;
         GXv_int9[0] = AV63MesAnt ;
         GXv_decimal7[0] = AV64PrecAnt ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_date4[0] = AV65FecAnt ;
         GXv_char18[0] = "1" ;
         GXv_char3[0] = AV60Modo2 ;
         new app.pprden2(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_int13, GXv_int15, GXv_decimal16, GXv_decimal11, GXv_decimal10, GXv_int12, GXv_int8, GXv_int14, GXv_int9, GXv_decimal7, GXv_date17, GXv_date4, GXv_char18, GXv_char3) ;
         A396EmprCod = GXv_char20[0] ;
         A719PrdNum = GXv_char19[0] ;
         AV16Year = GXv_int13[0] ;
         AV21Mes = GXv_int15[0] ;
         A8663Almc_UniE = GXv_decimal16[0] ;
         AV28UniOld = GXv_decimal11[0] ;
         A8664Almc_Pre = GXv_decimal10[0] ;
         AV16Year = GXv_int12[0] ;
         AV62AnyAnt = GXv_int8[0] ;
         AV21Mes = GXv_int14[0] ;
         AV63MesAnt = GXv_int9[0] ;
         AV64PrecAnt = GXv_decimal7[0] ;
         A8666ALmc_Fec = GXv_date17[0] ;
         AV65FecAnt = GXv_date4[0] ;
         AV60Modo2 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrimstr( AV28UniOld, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Year), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62AnyAnt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Mes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63MesAnt), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrimstr( AV64PrecAnt, 14, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Modo2", AV60Modo2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV28UniOld, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV62AnyAnt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV63MesAnt, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV64PrecAnt, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A8666ALmc_Fec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV65FecAnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV60Modo2))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_56_12G1184( String Gx_mode ,
                              String A396EmprCod ,
                              int A8672Almc_Prov ,
                              java.util.Date A8666ALmc_Fec ,
                              java.math.BigDecimal A8663Almc_UniE ,
                              java.math.BigDecimal A8664Almc_Pre ,
                              int A8661Almc_Ln )
   {
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A8672Almc_Prov ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_int6[0] = 0 ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = A8664Almc_Pre ;
         GXv_char19[0] = "1" ;
         new app.pacespr(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_date17, GXv_int6, GXv_decimal16, GXv_decimal11, GXv_char19) ;
         A396EmprCod = GXv_char20[0] ;
         A8672Almc_Prov = GXv_int21[0] ;
         A8666ALmc_Fec = GXv_date17[0] ;
         A8663Almc_UniE = GXv_decimal16[0] ;
         A8664Almc_Pre = GXv_decimal11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8672Almc_Prov, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A8666ALmc_Fec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_57_12G1184( String Gx_mode ,
                              String A396EmprCod ,
                              int A8672Almc_Prov ,
                              String A719PrdNum ,
                              String A718PrdNom ,
                              java.util.Date A8666ALmc_Fec ,
                              java.math.BigDecimal A8663Almc_UniE ,
                              java.math.BigDecimal A8664Almc_Pre ,
                              int A8661Almc_Ln )
   {
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A8672Almc_Prov ;
         GXv_char19[0] = A719PrdNum ;
         GXv_char18[0] = A718PrdNom ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_int6[0] = 0 ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = A8664Almc_Pre ;
         GXv_char3[0] = "1" ;
         new app.pacesprx(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_char19, GXv_char18, GXv_date17, GXv_int6, GXv_decimal16, GXv_decimal11, GXv_char3) ;
         A396EmprCod = GXv_char20[0] ;
         A8672Almc_Prov = GXv_int21[0] ;
         A719PrdNum = GXv_char19[0] ;
         A718PrdNom = GXv_char18[0] ;
         A8666ALmc_Fec = GXv_date17[0] ;
         A8663Almc_UniE = GXv_decimal16[0] ;
         A8664Almc_Pre = GXv_decimal11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8672Almc_Prov, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A8666ALmc_Fec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_58_12G1184( String Gx_mode ,
                              String A396EmprCod ,
                              String A719PrdNum ,
                              java.util.Date A8666ALmc_Fec ,
                              java.math.BigDecimal A8663Almc_UniE ,
                              java.math.BigDecimal A8664Almc_Pre ,
                              int A8661Almc_Ln )
   {
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = A719PrdNum ;
         GXv_date17[0] = A8666ALmc_Fec ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         GXv_decimal11[0] = A8664Almc_Pre ;
         new app.pacespd(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_date17, GXv_decimal16, GXv_decimal11) ;
         A396EmprCod = GXv_char20[0] ;
         A719PrdNum = GXv_char19[0] ;
         A8666ALmc_Fec = GXv_date17[0] ;
         A8663Almc_UniE = GXv_decimal16[0] ;
         A8664Almc_Pre = GXv_decimal11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A8666ALmc_Fec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_59_12G1184( String Gx_mode ,
                              String A396EmprCod ,
                              String A719PrdNum ,
                              int A8661Almc_Ln )
   {
      if ( true /* Level */ && isDlt( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = A719PrdNum ;
         GXv_int13[0] = (short)(A8661Almc_Ln) ;
         new app.palmc04(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_int13) ;
         A396EmprCod = GXv_char20[0] ;
         A719PrdNum = GXv_char19[0] ;
         A8661Almc_Ln = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8661Almc_Ln, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_60_12G1184( String Gx_mode ,
                              String A396EmprCod ,
                              String A719PrdNum ,
                              java.math.BigDecimal AV56vPrecio ,
                              int A8661Almc_Ln ,
                              java.math.BigDecimal A8663Almc_UniE )
   {
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = A719PrdNum ;
         GXv_decimal16[0] = AV56vPrecio ;
         new app.ppropvp(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_decimal16) ;
         A396EmprCod = GXv_char20[0] ;
         A719PrdNum = GXv_char19[0] ;
         AV56vPrecio = GXv_decimal16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV56vPrecio", GXutil.ltrimstr( AV56vPrecio, 14, 5));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV56vPrecio, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_61_12G1184( String A396EmprCod ,
                              int A12578Almc_Ped ,
                              String A719PrdNum ,
                              java.math.BigDecimal A8663Almc_UniE )
   {
      if ( true /* After */ && ! (0==A12578Almc_Ped) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A12578Almc_Ped ;
         GXv_char19[0] = A719PrdNum ;
         GXv_decimal16[0] = A8663Almc_UniE ;
         new app.pdelconsigna(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_char19, GXv_decimal16) ;
         A396EmprCod = GXv_char20[0] ;
         A12578Almc_Ped = GXv_int21[0] ;
         A719PrdNum = GXv_char19[0] ;
         A8663Almc_UniE = GXv_decimal16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12578Almc_Ped, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8663Almc_UniE, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_851184( ) ;
      while ( nGXsfl_85_idx <= nRC_GXsfl_85 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal12G1184( ) ;
         standaloneModal12G1184( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow12G1184( ) ;
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851184( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
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
      /* Using cursor T012G19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T012G19_A407EmprNom[0] ;
      n407EmprNom = T012G19_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      GX_FocusControl = edtPrvNum_Internalname ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T012G19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T012G19_A407EmprNom[0] ;
      n407EmprNom = T012G19_n407EmprNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      GXt_date1 = A3835UltFecCCs ;
      GXv_char20[0] = A396EmprCod ;
      GXv_char19[0] = A719PrdNum ;
      GXv_date17[0] = GXt_date1 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_date17) ;
      talmcon_impl.this.A396EmprCod = GXv_char20[0] ;
      talmcon_impl.this.A719PrdNum = GXv_char19[0] ;
      talmcon_impl.this.GXt_date1 = GXv_date17[0] ;
      A3835UltFecCCs = GXt_date1 ;
      if ( true /* After */ && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto inexistente", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto Compuesto", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", GXutil.rtrim( A727PrdRec));
      httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrim( localUtil.ntoc( A8659PrdExiAlmc, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8660Almc_Ult", GXutil.ltrim( localUtil.ntoc( A8660Almc_Ult, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrim( localUtil.ntoc( A721PrdNumUco, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z727PrdRec", GXutil.rtrim( Z727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8659PrdExiAlmc", GXutil.ltrim( localUtil.ntoc( Z8659PrdExiAlmc, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8660Almc_Ult", GXutil.ltrim( localUtil.ntoc( Z8660Almc_Ult, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z721PrdNumUco", GXutil.ltrim( localUtil.ntoc( Z721PrdNumUco, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z794PrvNom", GXutil.rtrim( Z794PrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3835UltFecCCs", localUtil.format(Z3835UltFecCCs, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "O8659PrdExiAlmc", GXutil.ltrim( localUtil.ntoc( O8659PrdExiAlmc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prvnum( )
   {
      n794PrvNom = false ;
      /* Using cursor T012G20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A794PrvNom = T012G20_A794PrvNom[0] ;
      n794PrvNom = T012G20_n794PrvNom[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
   }

   public void valid_Valcod( )
   {
      /* Using cursor T012G101 */
      pr_default.execute(99, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(99) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(99);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Almc_unie( )
   {
      n719PrdNum = false ;
      n8663Almc_UniE = false ;
      n8665Almc_Rem = false ;
      n8664Almc_Pre = false ;
      if ( isIns( )  && true /* After */ )
      {
         A8665Almc_Rem = O8665Almc_Rem.add(A8663Almc_UniE) ;
         n8665Almc_Rem = false ;
      }
      else
      {
         if ( isUpd( )  && true /* After */ )
         {
            A8665Almc_Rem = (O8665Almc_Rem.add(A8663Almc_UniE).subtract(O8663Almc_UniE)) ;
            n8665Almc_Rem = false ;
         }
         else
         {
            if ( isDlt( )  && true /* After */ )
            {
               A8665Almc_Rem = (O8665Almc_Rem.subtract(A8663Almc_UniE)) ;
               n8665Almc_Rem = false ;
            }
            else
            {
               if ( DecimalUtil.compareTo(O8665Almc_Rem, O8663Almc_UniE) == 0 )
               {
                  A8665Almc_Rem = A8663Almc_UniE ;
                  n8665Almc_Rem = false ;
               }
            }
         }
      }
      if ( DecimalUtil.compareTo(A8665Almc_Rem, DecimalUtil.stringToDec("999999.98")) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad Remanente excesiva", ""), 1, "ALMC_UNIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_UniE_Internalname ;
      }
      if ( isDlt( )  )
      {
         A8659PrdExiAlmc = O8659PrdExiAlmc.subtract(O8663Almc_UniE) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A8659PrdExiAlmc = O8659PrdExiAlmc.add(A8663Almc_UniE).subtract(O8663Almc_UniE) ;
         }
      }
      AV68OldExiAlm = O8659PrdExiAlmc ;
      if ( DecimalUtil.compareTo(A8659PrdExiAlmc, DecimalUtil.stringToDec("999999.9998")) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad excesiva en  almacen", ""), 1, "ALMC_UNIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_UniE_Internalname ;
      }
      AV70OldEntUni = O8663Almc_UniE ;
      AV28UniOld = O8663Almc_UniE ;
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A8663Almc_UniE)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe entrar unidades", ""), 1, "ALMC_UNIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_UniE_Internalname ;
      }
      if ( isDlt( )  && true /* Level */ && ( DecimalUtil.compareTo(O8665Almc_Rem, O8663Almc_UniE) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencio.Linea traspasada al Almacen General ¡¡¡", ""), 1, "ALMC_UNIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_UniE_Internalname ;
      }
      if ( isUpd( )  && true /* Level */ && ( DecimalUtil.compareTo(O8665Almc_Rem, O8663Almc_UniE) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencio.Linea traspasada al Almacen General ¡¡¡", ""), 1, "ALMC_UNIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_UniE_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = A719PrdNum ;
         GXv_decimal16[0] = AV56vPrecio ;
         new app.ppropvp(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_decimal16) ;
         talmcon_impl.this.A396EmprCod = GXv_char20[0] ;
         A396EmprCod = this.A396EmprCod ;
         talmcon_impl.this.A719PrdNum = GXv_char19[0] ;
         A719PrdNum = this.A719PrdNum ;
         talmcon_impl.this.AV56vPrecio = GXv_decimal16[0] ;
         AV56vPrecio = this.AV56vPrecio ;
      }
      if ( isIns( )  )
      {
         A8664Almc_Pre = AV56vPrecio ;
         n8664Almc_Pre = false ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8665Almc_Rem", GXutil.ltrim( localUtil.ntoc( A8665Almc_Rem, (byte)(11), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV68OldExiAlm", GXutil.ltrim( localUtil.ntoc( AV68OldExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV70OldEntUni", GXutil.ltrim( localUtil.ntoc( AV70OldEntUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV28UniOld", GXutil.ltrim( localUtil.ntoc( AV28UniOld, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8664Almc_Pre", GXutil.ltrim( localUtil.ntoc( A8664Almc_Pre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "AV56vPrecio", GXutil.ltrim( localUtil.ntoc( AV56vPrecio, (byte)(14), (byte)(5), ".", "")));
   }

   public void valid_Almc_pre( )
   {
      n8664Almc_Pre = false ;
      AV69OldEntPre = O8664Almc_Pre ;
      AV64PrecAnt = O8664Almc_Pre ;
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A8664Almc_Pre)==0) && (0==AV76FlagPre) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Precio con valor CERO", ""), 1, "ALMC_PRE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_Pre_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A8664Almc_Pre)==0) && ( AV76FlagPre == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "MENSAJE.Precio con valor CERO", ""), 0, "ALMC_PRE");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV69OldEntPre", GXutil.ltrim( localUtil.ntoc( AV69OldEntPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV64PrecAnt", GXutil.ltrim( localUtil.ntoc( AV64PrecAnt, (byte)(14), (byte)(5), ".", "")));
   }

   public void valid_Almc_fec( )
   {
      n8666ALmc_Fec = false ;
      AV16Year = (short)(GXutil.year( A8666ALmc_Fec)) ;
      AV19Fecha = localUtil.ymdtod( AV16Year, 12, 1) ;
      AV21Mes = (byte)(GXutil.month( A8666ALmc_Fec)) ;
      AV65FecAnt = O8666ALmc_Fec ;
      AV62AnyAnt = (short)(GXutil.year( O8666ALmc_Fec)) ;
      AV63MesAnt = (byte)(GXutil.month( O8666ALmc_Fec)) ;
      AV20DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV19Fecha),A8666ALmc_Fec)) ;
      if ( true /* Level */ && true /* After */ && GXutil.resetTime(A8666ALmc_Fec).after( GXutil.resetTime( Gx_date )) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Fecha Entrada mayor a la Fecha del Dia", ""), 1, "ALMC_FEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtALmc_Fec_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV16Year", GXutil.ltrim( localUtil.ntoc( AV16Year, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV19Fecha", localUtil.format(AV19Fecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV21Mes", GXutil.ltrim( localUtil.ntoc( AV21Mes, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV65FecAnt", localUtil.format(AV65FecAnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV62AnyAnt", GXutil.ltrim( localUtil.ntoc( AV62AnyAnt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV63MesAnt", GXutil.ltrim( localUtil.ntoc( AV63MesAnt, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV20DiasFin", GXutil.ltrim( localUtil.ntoc( AV20DiasFin, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Almc_prov( )
   {
      n8672Almc_Prov = false ;
      if ( true /* After */ )
      {
         GXt_char5 = AV89PrdNomX ;
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A8672Almc_Prov ;
         GXv_char19[0] = GXt_char5 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_char19) ;
         talmcon_impl.this.A396EmprCod = GXv_char20[0] ;
         talmcon_impl.this.A8672Almc_Prov = GXv_int21[0] ;
         talmcon_impl.this.GXt_char5 = GXv_char19[0] ;
         AV89PrdNomX = GXt_char5 ;
      }
      if ( ( GXutil.strcmp(GXutil.trim( AV89PrdNomX), httpContext.getMessage( "Inexistente", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor Inexistente", ""), 1, "ALMC_PROV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlmc_Prov_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV89PrdNomX", GXutil.rtrim( AV89PrdNomX));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV59Modo',fld:'vMODO',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A8659PrdExiAlmc',fld:'PRDEXIALMC',pic:'ZZZZZZ9.9999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV59Modo',fld:'vMODO',pic:''},{av:'AV68OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV23UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A727PrdRec',fld:'PRDREC',pic:''},{av:'A8659PrdExiAlmc',fld:'PRDEXIALMC',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A8660Almc_Ult',fld:'ALMC_ULT',pic:'ZZZZZ9'},{av:'A721PrdNumUco',fld:'PRDNUMUCO',pic:'ZZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A3835UltFecCCs',fld:'ULTFECCCS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z718PrdNom'},{av:'Z795PrvNum'},{av:'Z856ValCod'},{av:'Z727PrdRec'},{av:'Z8659PrdExiAlmc'},{av:'Z705PrdExiCC'},{av:'Z8660Almc_Ult'},{av:'Z721PrdNumUco'},{av:'Z407EmprNom'},{av:'Z794PrvNom'},{av:'Z3835UltFecCCs'},{av:'O8659PrdExiAlmc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''}]");
      setEventMetadata("VALID_PRVNUM",",oparms:[{av:'A794PrvNom',fld:'PRVNOM',pic:''}]}");
      setEventMetadata("VALID_VALCOD","{handler:'valid_Valcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A856ValCod',fld:'VALCOD',pic:'9'}]");
      setEventMetadata("VALID_VALCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDREC","{handler:'valid_Prdrec',iparms:[]");
      setEventMetadata("VALID_PRDREC",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALMC","{handler:'valid_Prdexialmc',iparms:[]");
      setEventMetadata("VALID_PRDEXIALMC",",oparms:[]}");
      setEventMetadata("VALID_ALMC_LN","{handler:'valid_Almc_ln',iparms:[]");
      setEventMetadata("VALID_ALMC_LN",",oparms:[]}");
      setEventMetadata("VALID_ALMC_UNIE","{handler:'valid_Almc_unie',iparms:[{av:'A8661Almc_Ln',fld:'ALMC_LN',pic:'ZZZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O8659PrdExiAlmc'},{av:'O8663Almc_UniE'},{av:'O8665Almc_Rem'},{av:'A8663Almc_UniE',fld:'ALMC_UNIE',pic:'ZZZZZ9.99'},{av:'A8665Almc_Rem',fld:'ALMC_REM',pic:'ZZZZZ9.9999'},{av:'A8659PrdExiAlmc',fld:'PRDEXIALMC',pic:'ZZZZZZ9.9999'},{av:'AV56vPrecio',fld:'vVPRECIO',pic:'ZZZZZZZ9.999'},{av:'AV68OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV70OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'AV28UniOld',fld:'vUNIOLD',pic:'ZZZZZ9.99'},{av:'A8664Almc_Pre',fld:'ALMC_PRE',pic:'ZZZZZZZ9.99999'}]");
      setEventMetadata("VALID_ALMC_UNIE",",oparms:[{av:'A8665Almc_Rem',fld:'ALMC_REM',pic:'ZZZZZ9.9999'},{av:'AV68OldExiAlm',fld:'vOLDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV70OldEntUni',fld:'vOLDENTUNI',pic:'ZZZZZ9.99'},{av:'AV28UniOld',fld:'vUNIOLD',pic:'ZZZZZ9.99'},{av:'A8664Almc_Pre',fld:'ALMC_PRE',pic:'ZZZZZZZ9.99999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV56vPrecio',fld:'vVPRECIO',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_ALMC_PRE","{handler:'valid_Almc_pre',iparms:[{av:'O8664Almc_Pre'},{av:'A8664Almc_Pre',fld:'ALMC_PRE',pic:'ZZZZZZZ9.99999'},{av:'AV69OldEntPre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV64PrecAnt',fld:'vPRECANT',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_ALMC_PRE",",oparms:[{av:'AV69OldEntPre',fld:'vOLDENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV64PrecAnt',fld:'vPRECANT',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_ALMC_REM","{handler:'valid_Almc_rem',iparms:[]");
      setEventMetadata("VALID_ALMC_REM",",oparms:[]}");
      setEventMetadata("VALID_ALMC_FEC","{handler:'valid_Almc_fec',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O8666ALmc_Fec'},{av:'A8666ALmc_Fec',fld:'ALMC_FEC',pic:''},{av:'AV16Year',fld:'vYEAR',pic:'ZZZ9'},{av:'AV19Fecha',fld:'vFECHA',pic:''},{av:'AV21Mes',fld:'vMES',pic:'Z9'},{av:'AV65FecAnt',fld:'vFECANT',pic:''},{av:'AV62AnyAnt',fld:'vANYANT',pic:'ZZZ9'},{av:'AV63MesAnt',fld:'vMESANT',pic:'Z9'},{av:'AV20DiasFin',fld:'vDIASFIN',pic:'ZZ9'}]");
      setEventMetadata("VALID_ALMC_FEC",",oparms:[{av:'AV16Year',fld:'vYEAR',pic:'ZZZ9'},{av:'AV19Fecha',fld:'vFECHA',pic:''},{av:'AV21Mes',fld:'vMES',pic:'Z9'},{av:'AV65FecAnt',fld:'vFECANT',pic:''},{av:'AV62AnyAnt',fld:'vANYANT',pic:'ZZZ9'},{av:'AV63MesAnt',fld:'vMESANT',pic:'Z9'},{av:'AV20DiasFin',fld:'vDIASFIN',pic:'ZZ9'}]}");
      setEventMetadata("VALID_ALMC_PROV","{handler:'valid_Almc_prov',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8672Almc_Prov',fld:'ALMC_PROV',pic:'ZZZZZ9'},{av:'AV89PrdNomX',fld:'vPRDNOMX',pic:''}]");
      setEventMetadata("VALID_ALMC_PROV",",oparms:[{av:'AV89PrdNomX',fld:'vPRDNOMX',pic:''}]}");
      setEventMetadata("VALID_ALMC_PED","{handler:'valid_Almc_ped',iparms:[]");
      setEventMetadata("VALID_ALMC_PED",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Almc_nct',iparms:[]");
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
      pr_default.close(17);
      pr_default.close(18);
      pr_default.close(99);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z718PrdNom = "" ;
      Z727PrdRec = "" ;
      Z8659PrdExiAlmc = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z721PrdNumUco = DecimalUtil.ZERO ;
      O8659PrdExiAlmc = DecimalUtil.ZERO ;
      Z8666ALmc_Fec = GXutil.nullDate() ;
      Z8665Almc_Rem = DecimalUtil.ZERO ;
      Z8662Almc_alb = "" ;
      Z8663Almc_UniE = DecimalUtil.ZERO ;
      Z8664Almc_Pre = DecimalUtil.ZERO ;
      Z12579Almc_Cum = "" ;
      Z12643Almc_Lote = "" ;
      O8666ALmc_Fec = GXutil.nullDate() ;
      O8664Almc_Pre = DecimalUtil.ZERO ;
      O8663Almc_UniE = DecimalUtil.ZERO ;
      O8665Almc_Rem = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A8664Almc_Pre = DecimalUtil.ZERO ;
      A8663Almc_UniE = DecimalUtil.ZERO ;
      AV28UniOld = DecimalUtil.ZERO ;
      AV64PrecAnt = DecimalUtil.ZERO ;
      A8666ALmc_Fec = GXutil.nullDate() ;
      AV65FecAnt = GXutil.nullDate() ;
      AV60Modo2 = "" ;
      A718PrdNom = "" ;
      AV56vPrecio = DecimalUtil.ZERO ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      sStyleString = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A794PrvNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A727PrdRec = "" ;
      lblTextblock8_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      A8659PrdExiAlmc = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A3835UltFecCCs = GXutil.nullDate() ;
      lblTextblock13_Jsonclick = "" ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B8659PrdExiAlmc = DecimalUtil.ZERO ;
      sMode1184 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV59Modo = "" ;
      AV68OldExiAlm = DecimalUtil.ZERO ;
      AV23UsurCod = "" ;
      Gx_date = GXutil.nullDate() ;
      AV69OldEntPre = DecimalUtil.ZERO ;
      AV70OldEntUni = DecimalUtil.ZERO ;
      AV89PrdNomX = "" ;
      AV19Fecha = GXutil.nullDate() ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode29 = "" ;
      s8659PrdExiAlmc = DecimalUtil.ZERO ;
      sV68OldExiAlm = DecimalUtil.ZERO ;
      OV68OldExiAlm = DecimalUtil.ZERO ;
      A8662Almc_alb = "" ;
      A8665Almc_Rem = DecimalUtil.ZERO ;
      A12579Almc_Cum = "" ;
      A12643Almc_Lote = "" ;
      T8666ALmc_Fec = GXutil.nullDate() ;
      T8664Almc_Pre = DecimalUtil.ZERO ;
      T8663Almc_UniE = DecimalUtil.ZERO ;
      T8665Almc_Rem = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z794PrvNom = "" ;
      T012G9_A719PrdNum = new String[] {""} ;
      T012G9_n719PrdNum = new boolean[] {false} ;
      T012G9_A718PrdNom = new String[] {""} ;
      T012G9_A794PrvNom = new String[] {""} ;
      T012G9_n794PrvNom = new boolean[] {false} ;
      T012G9_A727PrdRec = new String[] {""} ;
      T012G9_A407EmprNom = new String[] {""} ;
      T012G9_n407EmprNom = new boolean[] {false} ;
      T012G9_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G9_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G9_A8660Almc_Ult = new int[1] ;
      T012G9_n8660Almc_Ult = new boolean[] {false} ;
      T012G9_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G9_A396EmprCod = new String[] {""} ;
      T012G9_A795PrvNum = new int[1] ;
      T012G9_A856ValCod = new byte[1] ;
      T012G6_A407EmprNom = new String[] {""} ;
      T012G6_n407EmprNom = new boolean[] {false} ;
      T012G7_A794PrvNom = new String[] {""} ;
      T012G7_n794PrvNom = new boolean[] {false} ;
      T012G8_A396EmprCod = new String[] {""} ;
      T012G10_A407EmprNom = new String[] {""} ;
      T012G10_n407EmprNom = new boolean[] {false} ;
      T012G11_A794PrvNom = new String[] {""} ;
      T012G11_n794PrvNom = new boolean[] {false} ;
      T012G12_A396EmprCod = new String[] {""} ;
      T012G13_A396EmprCod = new String[] {""} ;
      T012G13_A719PrdNum = new String[] {""} ;
      T012G13_n719PrdNum = new boolean[] {false} ;
      T012G5_A719PrdNum = new String[] {""} ;
      T012G5_n719PrdNum = new boolean[] {false} ;
      T012G5_A718PrdNom = new String[] {""} ;
      T012G5_A727PrdRec = new String[] {""} ;
      T012G5_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G5_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G5_A8660Almc_Ult = new int[1] ;
      T012G5_n8660Almc_Ult = new boolean[] {false} ;
      T012G5_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G5_A396EmprCod = new String[] {""} ;
      T012G5_A795PrvNum = new int[1] ;
      T012G5_A856ValCod = new byte[1] ;
      T012G14_A396EmprCod = new String[] {""} ;
      T012G14_A719PrdNum = new String[] {""} ;
      T012G14_n719PrdNum = new boolean[] {false} ;
      T012G15_A396EmprCod = new String[] {""} ;
      T012G15_A719PrdNum = new String[] {""} ;
      T012G15_n719PrdNum = new boolean[] {false} ;
      T012G4_A719PrdNum = new String[] {""} ;
      T012G4_n719PrdNum = new boolean[] {false} ;
      T012G4_A718PrdNom = new String[] {""} ;
      T012G4_A727PrdRec = new String[] {""} ;
      T012G4_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G4_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G4_A8660Almc_Ult = new int[1] ;
      T012G4_n8660Almc_Ult = new boolean[] {false} ;
      T012G4_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G4_A396EmprCod = new String[] {""} ;
      T012G4_A795PrvNum = new int[1] ;
      T012G4_A856ValCod = new byte[1] ;
      T012G19_A407EmprNom = new String[] {""} ;
      T012G19_n407EmprNom = new boolean[] {false} ;
      T012G20_A794PrvNom = new String[] {""} ;
      T012G20_n794PrvNom = new boolean[] {false} ;
      T012G21_A396EmprCod = new String[] {""} ;
      T012G21_A719PrdNum = new String[] {""} ;
      T012G21_n719PrdNum = new boolean[] {false} ;
      T012G21_A13217NormaID = new String[] {""} ;
      T012G22_A396EmprCod = new String[] {""} ;
      T012G22_A719PrdNum = new String[] {""} ;
      T012G22_n719PrdNum = new boolean[] {false} ;
      T012G22_A13586TheList = new String[] {""} ;
      T012G23_A396EmprCod = new String[] {""} ;
      T012G23_A5532Lb_numero = new int[1] ;
      T012G23_A5555Lb_opcion = new String[] {""} ;
      T012G23_A13460Lb_linCP = new short[1] ;
      T012G23_A13458Lb_TipCP = new String[] {""} ;
      T012G24_A396EmprCod = new String[] {""} ;
      T012G24_A13418AlbProID = new int[1] ;
      T012G24_A13442AlbProLine = new short[1] ;
      T012G25_A396EmprCod = new String[] {""} ;
      T012G25_A13324LDESID = new int[1] ;
      T012G25_A13333LDESNPeque = new String[] {""} ;
      T012G25_A13337LDESComb = new String[] {""} ;
      T012G25_A13339LDESFondo = new String[] {""} ;
      T012G25_A13342LDESLinea = new short[1] ;
      T012G26_A396EmprCod = new String[] {""} ;
      T012G26_A13312Lb_NLab = new int[1] ;
      T012G26_A13305Lb_IDVeces = new short[1] ;
      T012G26_A13306Lb_LinID = new short[1] ;
      T012G27_A396EmprCod = new String[] {""} ;
      T012G27_A12673LavMqId = new int[1] ;
      T012G27_A12692LavMqLnPq = new short[1] ;
      T012G27_A12681LavMqLn = new short[1] ;
      T012G28_A396EmprCod = new String[] {""} ;
      T012G28_A719PrdNum = new String[] {""} ;
      T012G28_n719PrdNum = new boolean[] {false} ;
      T012G28_A9713Tb1_Cod = new short[1] ;
      T012G29_A396EmprCod = new String[] {""} ;
      T012G29_A12236PrdNumD = new String[] {""} ;
      T012G29_A719PrdNum = new String[] {""} ;
      T012G29_n719PrdNum = new boolean[] {false} ;
      T012G30_A396EmprCod = new String[] {""} ;
      T012G30_A12225DocDisID = new long[1] ;
      T012G30_A12226LinDisID = new short[1] ;
      T012G31_A396EmprCod = new String[] {""} ;
      T012G31_A12225DocDisID = new long[1] ;
      T012G32_A396EmprCod = new String[] {""} ;
      T012G32_A12205OrdenCID = new long[1] ;
      T012G32_A12206OrdenCLnId = new short[1] ;
      T012G33_A396EmprCod = new String[] {""} ;
      T012G33_A719PrdNum = new String[] {""} ;
      T012G33_n719PrdNum = new boolean[] {false} ;
      T012G33_A11664LoteID = new String[] {""} ;
      T012G33_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T012G34_A396EmprCod = new String[] {""} ;
      T012G34_A4850DevComCod = new int[1] ;
      T012G34_A719PrdNum = new String[] {""} ;
      T012G34_n719PrdNum = new boolean[] {false} ;
      T012G35_A396EmprCod = new String[] {""} ;
      T012G35_A252CliCod = new int[1] ;
      T012G35_A494ForSer = new String[] {""} ;
      T012G35_A482ForColNom = new String[] {""} ;
      T012G35_A483ForColNum = new int[1] ;
      T012G35_A831TipColCod = new byte[1] ;
      T012G35_A3571EnsCod = new String[] {""} ;
      T012G35_A3582EnsLin = new short[1] ;
      T012G36_A396EmprCod = new String[] {""} ;
      T012G36_A129BarCod = new int[1] ;
      T012G36_A132BarCodReo = new byte[1] ;
      T012G36_A130BarCodPar = new String[] {""} ;
      T012G36_A4075recestncol = new byte[1] ;
      T012G36_A4076recestnpro = new byte[1] ;
      T012G36_A4108recestlin = new short[1] ;
      T012G37_A396EmprCod = new String[] {""} ;
      T012G37_A4052EstNumFor = new int[1] ;
      T012G37_A4053EstNumCol = new byte[1] ;
      T012G37_A4090EstEspLin = new byte[1] ;
      T012G38_A396EmprCod = new String[] {""} ;
      T012G38_A4052EstNumFor = new int[1] ;
      T012G38_A4053EstNumCol = new byte[1] ;
      T012G38_A4084EstProLin = new byte[1] ;
      T012G39_A396EmprCod = new String[] {""} ;
      T012G39_A11644TransferId = new long[1] ;
      T012G39_A11653TransferLn = new int[1] ;
      T012G40_A396EmprCod = new String[] {""} ;
      T012G40_A11634TaesId = new String[] {""} ;
      T012G40_A11637TaesLn = new short[1] ;
      T012G40_A11641TaesLnP = new short[1] ;
      T012G41_A396EmprCod = new String[] {""} ;
      T012G41_A719PrdNum = new String[] {""} ;
      T012G41_n719PrdNum = new boolean[] {false} ;
      T012G41_A11329H_stklin = new long[1] ;
      T012G42_A396EmprCod = new String[] {""} ;
      T012G42_A11270Pot_num = new int[1] ;
      T012G42_A11271Pot_lin = new short[1] ;
      T012G43_A396EmprCod = new String[] {""} ;
      T012G43_A719PrdNum = new String[] {""} ;
      T012G43_n719PrdNum = new boolean[] {false} ;
      T012G43_A11199PrdNcasC = new String[] {""} ;
      T012G44_A396EmprCod = new String[] {""} ;
      T012G44_A719PrdNum = new String[] {""} ;
      T012G44_n719PrdNum = new boolean[] {false} ;
      T012G44_A11197CFraseR = new String[] {""} ;
      T012G45_A396EmprCod = new String[] {""} ;
      T012G45_A10243Jt_codigo = new short[1] ;
      T012G45_A10246Jt_ord = new short[1] ;
      T012G46_A396EmprCod = new String[] {""} ;
      T012G46_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T012G46_A10238Bny_lin = new short[1] ;
      T012G47_A396EmprCod = new String[] {""} ;
      T012G47_A129BarCod = new int[1] ;
      T012G47_A132BarCodReo = new byte[1] ;
      T012G47_A130BarCodPar = new String[] {""} ;
      T012G47_A758ProCod = new String[] {""} ;
      T012G47_A194BarOrdLin = new short[1] ;
      T012G47_A719PrdNum = new String[] {""} ;
      T012G47_n719PrdNum = new boolean[] {false} ;
      T012G48_A396EmprCod = new String[] {""} ;
      T012G48_A719PrdNum = new String[] {""} ;
      T012G48_n719PrdNum = new boolean[] {false} ;
      T012G48_A9735Cod_Rgo = new String[] {""} ;
      T012G49_A396EmprCod = new String[] {""} ;
      T012G49_A719PrdNum = new String[] {""} ;
      T012G49_n719PrdNum = new boolean[] {false} ;
      T012G49_A9711Ct_codigo = new short[1] ;
      T012G50_A396EmprCod = new String[] {""} ;
      T012G50_A9652OeNum = new long[1] ;
      T012G50_A9653OeHdr = new int[1] ;
      T012G50_A9654OeHdrr = new byte[1] ;
      T012G50_A9655OeHdrp = new String[] {""} ;
      T012G50_A9656OeLinC = new byte[1] ;
      T012G50_A9657OeComb = new String[] {""} ;
      T012G50_A9658Oefondo = new String[] {""} ;
      T012G50_A9659OeMolCil = new byte[1] ;
      T012G50_A9686OePasLin = new short[1] ;
      T012G50_A9694OePasPLi = new short[1] ;
      T012G51_A396EmprCod = new String[] {""} ;
      T012G51_A9652OeNum = new long[1] ;
      T012G51_A9653OeHdr = new int[1] ;
      T012G51_A9654OeHdrr = new byte[1] ;
      T012G51_A9655OeHdrp = new String[] {""} ;
      T012G51_A9656OeLinC = new byte[1] ;
      T012G51_A9657OeComb = new String[] {""} ;
      T012G51_A9658Oefondo = new String[] {""} ;
      T012G51_A9659OeMolCil = new byte[1] ;
      T012G51_A9677OeMolLin = new byte[1] ;
      T012G52_A396EmprCod = new String[] {""} ;
      T012G52_A9578Pas_Num = new int[1] ;
      T012G52_A719PrdNum = new String[] {""} ;
      T012G52_n719PrdNum = new boolean[] {false} ;
      T012G53_A396EmprCod = new String[] {""} ;
      T012G53_A719PrdNum = new String[] {""} ;
      T012G53_n719PrdNum = new boolean[] {false} ;
      T012G53_A8908CC_AlmCod = new byte[1] ;
      T012G54_A396EmprCod = new String[] {""} ;
      T012G54_A719PrdNum = new String[] {""} ;
      T012G54_n719PrdNum = new boolean[] {false} ;
      T012G54_A8648Mat_PrdN = new String[] {""} ;
      T012G55_A396EmprCod = new String[] {""} ;
      T012G55_A8585Pet_cod = new long[1] ;
      T012G55_A719PrdNum = new String[] {""} ;
      T012G55_n719PrdNum = new boolean[] {false} ;
      T012G56_A396EmprCod = new String[] {""} ;
      T012G56_A719PrdNum = new String[] {""} ;
      T012G56_n719PrdNum = new boolean[] {false} ;
      T012G56_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T012G57_A396EmprCod = new String[] {""} ;
      T012G57_A719PrdNum = new String[] {""} ;
      T012G57_n719PrdNum = new boolean[] {false} ;
      T012G57_A8366PrdAnyo = new short[1] ;
      T012G57_A8360PrdProv = new int[1] ;
      T012G58_A396EmprCod = new String[] {""} ;
      T012G58_A252CliCod = new int[1] ;
      T012G58_A494ForSer = new String[] {""} ;
      T012G58_A482ForColNom = new String[] {""} ;
      T012G58_A483ForColNum = new int[1] ;
      T012G58_A831TipColCod = new byte[1] ;
      T012G58_A7797Sim_lin = new short[1] ;
      T012G59_A396EmprCod = new String[] {""} ;
      T012G59_A7163Vir_Codigo = new int[1] ;
      T012G59_A719PrdNum = new String[] {""} ;
      T012G59_n719PrdNum = new boolean[] {false} ;
      T012G60_A396EmprCod = new String[] {""} ;
      T012G60_A6310Lb_TaAuxC = new String[] {""} ;
      T012G60_A6313lb_TaAuxL = new short[1] ;
      T012G60_A6378Lb_TauxLP = new short[1] ;
      T012G61_A396EmprCod = new String[] {""} ;
      T012G61_A6290PreCoNum = new int[1] ;
      T012G61_A719PrdNum = new String[] {""} ;
      T012G61_n719PrdNum = new boolean[] {false} ;
      T012G62_A396EmprCod = new String[] {""} ;
      T012G62_A719PrdNum = new String[] {""} ;
      T012G62_n719PrdNum = new boolean[] {false} ;
      T012G62_A6158PrdPrv = new int[1] ;
      T012G63_A396EmprCod = new String[] {""} ;
      T012G63_A719PrdNum = new String[] {""} ;
      T012G63_n719PrdNum = new boolean[] {false} ;
      T012G63_A5973PrdSusNum = new String[] {""} ;
      T012G64_A396EmprCod = new String[] {""} ;
      T012G64_A5612Lb_CodGru = new String[] {""} ;
      T012G64_A5615Lb_LinGru = new short[1] ;
      T012G65_A396EmprCod = new String[] {""} ;
      T012G65_A5532Lb_numero = new int[1] ;
      T012G65_A5555Lb_opcion = new String[] {""} ;
      T012G65_A5560Lb_LineaPr = new short[1] ;
      T012G66_A396EmprCod = new String[] {""} ;
      T012G66_A5532Lb_numero = new int[1] ;
      T012G66_A5555Lb_opcion = new String[] {""} ;
      T012G66_A5557Lb_LineaC = new short[1] ;
      T012G67_A396EmprCod = new String[] {""} ;
      T012G67_A5145SobCod = new int[1] ;
      T012G67_A719PrdNum = new String[] {""} ;
      T012G67_n719PrdNum = new boolean[] {false} ;
      T012G68_A396EmprCod = new String[] {""} ;
      T012G68_A4744RecPreCod = new int[1] ;
      T012G68_A4762RecPreLin = new short[1] ;
      T012G68_A4763RecPreNli = new short[1] ;
      T012G69_A396EmprCod = new String[] {""} ;
      T012G69_A4492HreBarCod = new int[1] ;
      T012G69_A4493HreBarReo = new byte[1] ;
      T012G69_A4494HreBarPar = new String[] {""} ;
      T012G69_A4495HreNumCie = new byte[1] ;
      T012G69_A4545HreLinMaq = new short[1] ;
      T012G69_A4550HreLinPro = new byte[1] ;
      T012G69_A4557HreRecLin = new short[1] ;
      T012G70_A396EmprCod = new String[] {""} ;
      T012G70_A4492HreBarCod = new int[1] ;
      T012G70_A4493HreBarReo = new byte[1] ;
      T012G70_A4494HreBarPar = new String[] {""} ;
      T012G70_A4495HreNumCie = new byte[1] ;
      T012G70_A4508HreLinMAL = new short[1] ;
      T012G70_A4509HreNumAny = new byte[1] ;
      T012G70_A719PrdNum = new String[] {""} ;
      T012G70_n719PrdNum = new boolean[] {false} ;
      T012G71_A396EmprCod = new String[] {""} ;
      T012G71_A252CliCod = new int[1] ;
      T012G71_A4415EstCol = new String[] {""} ;
      T012G71_A4416EstColLin = new short[1] ;
      T012G72_A396EmprCod = new String[] {""} ;
      T012G72_A129BarCod = new int[1] ;
      T012G72_A132BarCodReo = new byte[1] ;
      T012G72_A130BarCodPar = new String[] {""} ;
      T012G72_A2524DisComLin = new byte[1] ;
      T012G72_A1056DisComCod = new String[] {""} ;
      T012G72_A1032FonCod = new String[] {""} ;
      T012G72_A2124RecMolCod = new byte[1] ;
      T012G72_A2672RecPasLin = new short[1] ;
      T012G72_A2675RecPasPLi = new short[1] ;
      T012G73_A396EmprCod = new String[] {""} ;
      T012G73_A129BarCod = new int[1] ;
      T012G73_A132BarCodReo = new byte[1] ;
      T012G73_A130BarCodPar = new String[] {""} ;
      T012G73_A2524DisComLin = new byte[1] ;
      T012G73_A1056DisComCod = new String[] {""} ;
      T012G73_A1032FonCod = new String[] {""} ;
      T012G73_A2124RecMolCod = new byte[1] ;
      T012G73_A2126RecMolLin = new byte[1] ;
      T012G74_A396EmprCod = new String[] {""} ;
      T012G74_A2107PasCod = new String[] {""} ;
      T012G74_A719PrdNum = new String[] {""} ;
      T012G74_n719PrdNum = new boolean[] {false} ;
      T012G75_A396EmprCod = new String[] {""} ;
      T012G75_A2637HisEstHRu = new int[1] ;
      T012G75_A2636HisEstHRe = new byte[1] ;
      T012G75_A2635HisEstHPa = new String[] {""} ;
      T012G75_A2638HisEstLCo = new byte[1] ;
      T012G75_A2630HisEstCom = new String[] {""} ;
      T012G75_A2634HisEstFon = new String[] {""} ;
      T012G75_A719PrdNum = new String[] {""} ;
      T012G75_n719PrdNum = new boolean[] {false} ;
      T012G76_A396EmprCod = new String[] {""} ;
      T012G76_A252CliCod = new int[1] ;
      T012G76_A2141SerEst = new String[] {""} ;
      T012G76_A1013DibCli = new String[] {""} ;
      T012G76_A1014DibInt = new int[1] ;
      T012G76_A2074ColCom = new String[] {""} ;
      T012G76_A2078ColFon = new String[] {""} ;
      T012G76_A2098MolCod = new byte[1] ;
      T012G76_A2535ForPrdLin = new short[1] ;
      T012G77_A396EmprCod = new String[] {""} ;
      T012G77_A719PrdNum = new String[] {""} ;
      T012G77_n719PrdNum = new boolean[] {false} ;
      T012G77_A3342CCStkLin = new long[1] ;
      T012G78_A396EmprCod = new String[] {""} ;
      T012G78_A252CliCod = new int[1] ;
      T012G78_A2891HMaForSer = new String[] {""} ;
      T012G78_A2892HMaForCNom = new String[] {""} ;
      T012G78_A2893HMaForCNum = new int[1] ;
      T012G78_A2894HMaTipCCod = new byte[1] ;
      T012G78_A2895HMaForNumC = new int[1] ;
      T012G78_A2897HMaColLin = new short[1] ;
      T012G78_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T012G78_A2907HmaLin = new short[1] ;
      T012G79_A396EmprCod = new String[] {""} ;
      T012G79_A129BarCod = new int[1] ;
      T012G79_A132BarCodReo = new byte[1] ;
      T012G79_A130BarCodPar = new String[] {""} ;
      T012G79_A2808RecLinMAL = new short[1] ;
      T012G79_A1377RecNumAny = new byte[1] ;
      T012G79_A719PrdNum = new String[] {""} ;
      T012G79_n719PrdNum = new boolean[] {false} ;
      T012G80_A396EmprCod = new String[] {""} ;
      T012G80_A129BarCod = new int[1] ;
      T012G80_A132BarCodReo = new byte[1] ;
      T012G80_A130BarCodPar = new String[] {""} ;
      T012G80_A2804RecLinMaq = new short[1] ;
      T012G80_A1273RecLinPro = new byte[1] ;
      T012G80_A811RecLin = new short[1] ;
      T012G81_A396EmprCod = new String[] {""} ;
      T012G81_A129BarCod = new int[1] ;
      T012G81_A132BarCodReo = new byte[1] ;
      T012G81_A130BarCodPar = new String[] {""} ;
      T012G81_A2494BarDosPro = new String[] {""} ;
      T012G81_A719PrdNum = new String[] {""} ;
      T012G81_n719PrdNum = new boolean[] {false} ;
      T012G82_A396EmprCod = new String[] {""} ;
      T012G82_A1314EnsLabCod = new int[1] ;
      T012G82_A1317EnsLabLin = new short[1] ;
      T012G83_A396EmprCod = new String[] {""} ;
      T012G83_A910Workstat = new String[] {""} ;
      T012G83_A887EscMLin = new int[1] ;
      T012G84_A396EmprCod = new String[] {""} ;
      T012G84_A859CumCodCont = new int[1] ;
      T012G84_A719PrdNum = new String[] {""} ;
      T012G84_n719PrdNum = new boolean[] {false} ;
      T012G85_A396EmprCod = new String[] {""} ;
      T012G85_A719PrdNum = new String[] {""} ;
      T012G85_n719PrdNum = new boolean[] {false} ;
      T012G85_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T012G86_A396EmprCod = new String[] {""} ;
      T012G86_A486ForNumCol = new int[1] ;
      T012G86_A715PrdLin = new short[1] ;
      T012G87_A396EmprCod = new String[] {""} ;
      T012G87_A719PrdNum = new String[] {""} ;
      T012G87_n719PrdNum = new boolean[] {false} ;
      T012G87_A681PrdAny = new short[1] ;
      T012G88_A396EmprCod = new String[] {""} ;
      T012G88_A719PrdNum = new String[] {""} ;
      T012G88_n719PrdNum = new boolean[] {false} ;
      T012G88_A688PrdComCod = new String[] {""} ;
      T012G89_A396EmprCod = new String[] {""} ;
      T012G89_A719PrdNum = new String[] {""} ;
      T012G89_n719PrdNum = new boolean[] {false} ;
      T012G89_A680PrdAltNum = new String[] {""} ;
      T012G90_A396EmprCod = new String[] {""} ;
      T012G90_A658PedCod = new int[1] ;
      T012G90_A719PrdNum = new String[] {""} ;
      T012G90_n719PrdNum = new boolean[] {false} ;
      T012G91_A396EmprCod = new String[] {""} ;
      T012G91_A486ForNumCol = new int[1] ;
      T012G91_A309ColLin = new short[1] ;
      T012G92_A396EmprCod = new String[] {""} ;
      T012G92_A719PrdNum = new String[] {""} ;
      T012G92_n719PrdNum = new boolean[] {false} ;
      T012G92_A647NumCon = new int[1] ;
      T012G94_A396EmprCod = new String[] {""} ;
      T012G94_A719PrdNum = new String[] {""} ;
      T012G94_n719PrdNum = new boolean[] {false} ;
      T012G95_A719PrdNum = new String[] {""} ;
      T012G95_n719PrdNum = new boolean[] {false} ;
      T012G95_A8661Almc_Ln = new int[1] ;
      T012G95_A8666ALmc_Fec = new java.util.Date[] {GXutil.nullDate()} ;
      T012G95_n8666ALmc_Fec = new boolean[] {false} ;
      T012G95_A8667Almc_Con = new byte[1] ;
      T012G95_n8667Almc_Con = new boolean[] {false} ;
      T012G95_A8665Almc_Rem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G95_n8665Almc_Rem = new boolean[] {false} ;
      T012G95_A8662Almc_alb = new String[] {""} ;
      T012G95_n8662Almc_alb = new boolean[] {false} ;
      T012G95_A8663Almc_UniE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G95_n8663Almc_UniE = new boolean[] {false} ;
      T012G95_A8664Almc_Pre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G95_n8664Almc_Pre = new boolean[] {false} ;
      T012G95_A8672Almc_Prov = new int[1] ;
      T012G95_n8672Almc_Prov = new boolean[] {false} ;
      T012G95_A12578Almc_Ped = new int[1] ;
      T012G95_n12578Almc_Ped = new boolean[] {false} ;
      T012G95_A12579Almc_Cum = new String[] {""} ;
      T012G95_n12579Almc_Cum = new boolean[] {false} ;
      T012G95_A12643Almc_Lote = new String[] {""} ;
      T012G95_n12643Almc_Lote = new boolean[] {false} ;
      T012G95_A12849Almc_Nct = new short[1] ;
      T012G95_n12849Almc_Nct = new boolean[] {false} ;
      T012G95_A396EmprCod = new String[] {""} ;
      GXCCtl = "" ;
      T012G96_A396EmprCod = new String[] {""} ;
      T012G96_A719PrdNum = new String[] {""} ;
      T012G96_n719PrdNum = new boolean[] {false} ;
      T012G96_A8661Almc_Ln = new int[1] ;
      T012G3_A719PrdNum = new String[] {""} ;
      T012G3_n719PrdNum = new boolean[] {false} ;
      T012G3_A8661Almc_Ln = new int[1] ;
      T012G3_A8666ALmc_Fec = new java.util.Date[] {GXutil.nullDate()} ;
      T012G3_n8666ALmc_Fec = new boolean[] {false} ;
      T012G3_A8667Almc_Con = new byte[1] ;
      T012G3_n8667Almc_Con = new boolean[] {false} ;
      T012G3_A8665Almc_Rem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G3_n8665Almc_Rem = new boolean[] {false} ;
      T012G3_A8662Almc_alb = new String[] {""} ;
      T012G3_n8662Almc_alb = new boolean[] {false} ;
      T012G3_A8663Almc_UniE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G3_n8663Almc_UniE = new boolean[] {false} ;
      T012G3_A8664Almc_Pre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G3_n8664Almc_Pre = new boolean[] {false} ;
      T012G3_A8672Almc_Prov = new int[1] ;
      T012G3_n8672Almc_Prov = new boolean[] {false} ;
      T012G3_A12578Almc_Ped = new int[1] ;
      T012G3_n12578Almc_Ped = new boolean[] {false} ;
      T012G3_A12579Almc_Cum = new String[] {""} ;
      T012G3_n12579Almc_Cum = new boolean[] {false} ;
      T012G3_A12643Almc_Lote = new String[] {""} ;
      T012G3_n12643Almc_Lote = new boolean[] {false} ;
      T012G3_A12849Almc_Nct = new short[1] ;
      T012G3_n12849Almc_Nct = new boolean[] {false} ;
      T012G3_A396EmprCod = new String[] {""} ;
      T012G2_A719PrdNum = new String[] {""} ;
      T012G2_n719PrdNum = new boolean[] {false} ;
      T012G2_A8661Almc_Ln = new int[1] ;
      T012G2_A8666ALmc_Fec = new java.util.Date[] {GXutil.nullDate()} ;
      T012G2_n8666ALmc_Fec = new boolean[] {false} ;
      T012G2_A8667Almc_Con = new byte[1] ;
      T012G2_n8667Almc_Con = new boolean[] {false} ;
      T012G2_A8665Almc_Rem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G2_n8665Almc_Rem = new boolean[] {false} ;
      T012G2_A8662Almc_alb = new String[] {""} ;
      T012G2_n8662Almc_alb = new boolean[] {false} ;
      T012G2_A8663Almc_UniE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G2_n8663Almc_UniE = new boolean[] {false} ;
      T012G2_A8664Almc_Pre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012G2_n8664Almc_Pre = new boolean[] {false} ;
      T012G2_A8672Almc_Prov = new int[1] ;
      T012G2_n8672Almc_Prov = new boolean[] {false} ;
      T012G2_A12578Almc_Ped = new int[1] ;
      T012G2_n12578Almc_Ped = new boolean[] {false} ;
      T012G2_A12579Almc_Cum = new String[] {""} ;
      T012G2_n12579Almc_Cum = new boolean[] {false} ;
      T012G2_A12643Almc_Lote = new String[] {""} ;
      T012G2_n12643Almc_Lote = new boolean[] {false} ;
      T012G2_A12849Almc_Nct = new short[1] ;
      T012G2_n12849Almc_Nct = new boolean[] {false} ;
      T012G2_A396EmprCod = new String[] {""} ;
      T012G100_A396EmprCod = new String[] {""} ;
      T012G100_A719PrdNum = new String[] {""} ;
      T012G100_n719PrdNum = new boolean[] {false} ;
      T012G100_A8661Almc_Ln = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV59Modo = "" ;
      iV60Modo2 = "" ;
      i8666ALmc_Fec = GXutil.nullDate() ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char2 = new String[1] ;
      GXv_int15 = new byte[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int12 = new short[1] ;
      GXv_int8 = new short[1] ;
      GXv_int14 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_date4 = new java.util.Date[1] ;
      GXv_char18 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int13 = new short[1] ;
      Z3835UltFecCCs = GXutil.nullDate() ;
      GXt_date1 = GXutil.nullDate() ;
      GXv_date17 = new java.util.Date[1] ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ718PrdNom = "" ;
      ZZ727PrdRec = "" ;
      ZZ8659PrdExiAlmc = DecimalUtil.ZERO ;
      ZZ705PrdExiCC = DecimalUtil.ZERO ;
      ZZ721PrdNumUco = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ794PrvNom = "" ;
      ZZ3835UltFecCCs = GXutil.nullDate() ;
      ZO8659PrdExiAlmc = DecimalUtil.ZERO ;
      T012G101_A396EmprCod = new String[] {""} ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      ZV68OldExiAlm = DecimalUtil.ZERO ;
      ZV70OldEntUni = DecimalUtil.ZERO ;
      ZV28UniOld = DecimalUtil.ZERO ;
      ZV56vPrecio = DecimalUtil.ZERO ;
      ZV69OldEntPre = DecimalUtil.ZERO ;
      ZV64PrecAnt = DecimalUtil.ZERO ;
      ZV19Fecha = GXutil.nullDate() ;
      ZV65FecAnt = GXutil.nullDate() ;
      GXt_char5 = "" ;
      GXv_char20 = new String[1] ;
      GXv_int21 = new int[1] ;
      GXv_char19 = new String[1] ;
      ZV89PrdNomX = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talmcon__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talmcon__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talmcon__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talmcon__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talmcon__default(),
         new Object[] {
             new Object[] {
            T012G2_A719PrdNum, T012G2_A8661Almc_Ln, T012G2_A8666ALmc_Fec, T012G2_n8666ALmc_Fec, T012G2_A8667Almc_Con, T012G2_n8667Almc_Con, T012G2_A8665Almc_Rem, T012G2_n8665Almc_Rem, T012G2_A8662Almc_alb, T012G2_n8662Almc_alb,
            T012G2_A8663Almc_UniE, T012G2_n8663Almc_UniE, T012G2_A8664Almc_Pre, T012G2_n8664Almc_Pre, T012G2_A8672Almc_Prov, T012G2_n8672Almc_Prov, T012G2_A12578Almc_Ped, T012G2_n12578Almc_Ped, T012G2_A12579Almc_Cum, T012G2_n12579Almc_Cum,
            T012G2_A12643Almc_Lote, T012G2_n12643Almc_Lote, T012G2_A12849Almc_Nct, T012G2_n12849Almc_Nct, T012G2_A396EmprCod
            }
            , new Object[] {
            T012G3_A719PrdNum, T012G3_A8661Almc_Ln, T012G3_A8666ALmc_Fec, T012G3_n8666ALmc_Fec, T012G3_A8667Almc_Con, T012G3_n8667Almc_Con, T012G3_A8665Almc_Rem, T012G3_n8665Almc_Rem, T012G3_A8662Almc_alb, T012G3_n8662Almc_alb,
            T012G3_A8663Almc_UniE, T012G3_n8663Almc_UniE, T012G3_A8664Almc_Pre, T012G3_n8664Almc_Pre, T012G3_A8672Almc_Prov, T012G3_n8672Almc_Prov, T012G3_A12578Almc_Ped, T012G3_n12578Almc_Ped, T012G3_A12579Almc_Cum, T012G3_n12579Almc_Cum,
            T012G3_A12643Almc_Lote, T012G3_n12643Almc_Lote, T012G3_A12849Almc_Nct, T012G3_n12849Almc_Nct, T012G3_A396EmprCod
            }
            , new Object[] {
            T012G4_A719PrdNum, T012G4_A718PrdNom, T012G4_A727PrdRec, T012G4_A8659PrdExiAlmc, T012G4_A705PrdExiCC, T012G4_A8660Almc_Ult, T012G4_n8660Almc_Ult, T012G4_A721PrdNumUco, T012G4_A396EmprCod, T012G4_A795PrvNum,
            T012G4_A856ValCod
            }
            , new Object[] {
            T012G5_A719PrdNum, T012G5_A718PrdNom, T012G5_A727PrdRec, T012G5_A8659PrdExiAlmc, T012G5_A705PrdExiCC, T012G5_A8660Almc_Ult, T012G5_n8660Almc_Ult, T012G5_A721PrdNumUco, T012G5_A396EmprCod, T012G5_A795PrvNum,
            T012G5_A856ValCod
            }
            , new Object[] {
            T012G6_A407EmprNom, T012G6_n407EmprNom
            }
            , new Object[] {
            T012G7_A794PrvNom, T012G7_n794PrvNom
            }
            , new Object[] {
            T012G8_A396EmprCod
            }
            , new Object[] {
            T012G9_A719PrdNum, T012G9_A718PrdNom, T012G9_A794PrvNom, T012G9_n794PrvNom, T012G9_A727PrdRec, T012G9_A407EmprNom, T012G9_n407EmprNom, T012G9_A8659PrdExiAlmc, T012G9_A705PrdExiCC, T012G9_A8660Almc_Ult,
            T012G9_n8660Almc_Ult, T012G9_A721PrdNumUco, T012G9_A396EmprCod, T012G9_A795PrvNum, T012G9_A856ValCod
            }
            , new Object[] {
            T012G10_A407EmprNom, T012G10_n407EmprNom
            }
            , new Object[] {
            T012G11_A794PrvNom, T012G11_n794PrvNom
            }
            , new Object[] {
            T012G12_A396EmprCod
            }
            , new Object[] {
            T012G13_A396EmprCod, T012G13_A719PrdNum
            }
            , new Object[] {
            T012G14_A396EmprCod, T012G14_A719PrdNum
            }
            , new Object[] {
            T012G15_A396EmprCod, T012G15_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T012G19_A407EmprNom, T012G19_n407EmprNom
            }
            , new Object[] {
            T012G20_A794PrvNom, T012G20_n794PrvNom
            }
            , new Object[] {
            T012G21_A396EmprCod, T012G21_A719PrdNum, T012G21_A13217NormaID
            }
            , new Object[] {
            T012G22_A396EmprCod, T012G22_A719PrdNum, T012G22_A13586TheList
            }
            , new Object[] {
            T012G23_A396EmprCod, T012G23_A5532Lb_numero, T012G23_A5555Lb_opcion, T012G23_A13460Lb_linCP, T012G23_A13458Lb_TipCP
            }
            , new Object[] {
            T012G24_A396EmprCod, T012G24_A13418AlbProID, T012G24_A13442AlbProLine
            }
            , new Object[] {
            T012G25_A396EmprCod, T012G25_A13324LDESID, T012G25_A13333LDESNPeque, T012G25_A13337LDESComb, T012G25_A13339LDESFondo, T012G25_A13342LDESLinea
            }
            , new Object[] {
            T012G26_A396EmprCod, T012G26_A13312Lb_NLab, T012G26_A13305Lb_IDVeces, T012G26_A13306Lb_LinID
            }
            , new Object[] {
            T012G27_A396EmprCod, T012G27_A12673LavMqId, T012G27_A12692LavMqLnPq, T012G27_A12681LavMqLn
            }
            , new Object[] {
            T012G28_A396EmprCod, T012G28_A719PrdNum, T012G28_A9713Tb1_Cod
            }
            , new Object[] {
            T012G29_A396EmprCod, T012G29_A12236PrdNumD, T012G29_A719PrdNum
            }
            , new Object[] {
            T012G30_A396EmprCod, T012G30_A12225DocDisID, T012G30_A12226LinDisID
            }
            , new Object[] {
            T012G31_A396EmprCod, T012G31_A12225DocDisID
            }
            , new Object[] {
            T012G32_A396EmprCod, T012G32_A12205OrdenCID, T012G32_A12206OrdenCLnId
            }
            , new Object[] {
            T012G33_A396EmprCod, T012G33_A719PrdNum, T012G33_A11664LoteID, T012G33_A11665LoteFec
            }
            , new Object[] {
            T012G34_A396EmprCod, T012G34_A4850DevComCod, T012G34_A719PrdNum
            }
            , new Object[] {
            T012G35_A396EmprCod, T012G35_A252CliCod, T012G35_A494ForSer, T012G35_A482ForColNom, T012G35_A483ForColNum, T012G35_A831TipColCod, T012G35_A3571EnsCod, T012G35_A3582EnsLin
            }
            , new Object[] {
            T012G36_A396EmprCod, T012G36_A129BarCod, T012G36_A132BarCodReo, T012G36_A130BarCodPar, T012G36_A4075recestncol, T012G36_A4076recestnpro, T012G36_A4108recestlin
            }
            , new Object[] {
            T012G37_A396EmprCod, T012G37_A4052EstNumFor, T012G37_A4053EstNumCol, T012G37_A4090EstEspLin
            }
            , new Object[] {
            T012G38_A396EmprCod, T012G38_A4052EstNumFor, T012G38_A4053EstNumCol, T012G38_A4084EstProLin
            }
            , new Object[] {
            T012G39_A396EmprCod, T012G39_A11644TransferId, T012G39_A11653TransferLn
            }
            , new Object[] {
            T012G40_A396EmprCod, T012G40_A11634TaesId, T012G40_A11637TaesLn, T012G40_A11641TaesLnP
            }
            , new Object[] {
            T012G41_A396EmprCod, T012G41_A719PrdNum, T012G41_A11329H_stklin
            }
            , new Object[] {
            T012G42_A396EmprCod, T012G42_A11270Pot_num, T012G42_A11271Pot_lin
            }
            , new Object[] {
            T012G43_A396EmprCod, T012G43_A719PrdNum, T012G43_A11199PrdNcasC
            }
            , new Object[] {
            T012G44_A396EmprCod, T012G44_A719PrdNum, T012G44_A11197CFraseR
            }
            , new Object[] {
            T012G45_A396EmprCod, T012G45_A10243Jt_codigo, T012G45_A10246Jt_ord
            }
            , new Object[] {
            T012G46_A396EmprCod, T012G46_A10236Bny_dia, T012G46_A10238Bny_lin
            }
            , new Object[] {
            T012G47_A396EmprCod, T012G47_A129BarCod, T012G47_A132BarCodReo, T012G47_A130BarCodPar, T012G47_A758ProCod, T012G47_A194BarOrdLin, T012G47_A719PrdNum
            }
            , new Object[] {
            T012G48_A396EmprCod, T012G48_A719PrdNum, T012G48_A9735Cod_Rgo
            }
            , new Object[] {
            T012G49_A396EmprCod, T012G49_A719PrdNum, T012G49_A9711Ct_codigo
            }
            , new Object[] {
            T012G50_A396EmprCod, T012G50_A9652OeNum, T012G50_A9653OeHdr, T012G50_A9654OeHdrr, T012G50_A9655OeHdrp, T012G50_A9656OeLinC, T012G50_A9657OeComb, T012G50_A9658Oefondo, T012G50_A9659OeMolCil, T012G50_A9686OePasLin,
            T012G50_A9694OePasPLi
            }
            , new Object[] {
            T012G51_A396EmprCod, T012G51_A9652OeNum, T012G51_A9653OeHdr, T012G51_A9654OeHdrr, T012G51_A9655OeHdrp, T012G51_A9656OeLinC, T012G51_A9657OeComb, T012G51_A9658Oefondo, T012G51_A9659OeMolCil, T012G51_A9677OeMolLin
            }
            , new Object[] {
            T012G52_A396EmprCod, T012G52_A9578Pas_Num, T012G52_A719PrdNum
            }
            , new Object[] {
            T012G53_A396EmprCod, T012G53_A719PrdNum, T012G53_A8908CC_AlmCod
            }
            , new Object[] {
            T012G54_A396EmprCod, T012G54_A719PrdNum, T012G54_A8648Mat_PrdN
            }
            , new Object[] {
            T012G55_A396EmprCod, T012G55_A8585Pet_cod, T012G55_A719PrdNum
            }
            , new Object[] {
            T012G56_A396EmprCod, T012G56_A719PrdNum, T012G56_A8577RecFecHr
            }
            , new Object[] {
            T012G57_A396EmprCod, T012G57_A719PrdNum, T012G57_A8366PrdAnyo, T012G57_A8360PrdProv
            }
            , new Object[] {
            T012G58_A396EmprCod, T012G58_A252CliCod, T012G58_A494ForSer, T012G58_A482ForColNom, T012G58_A483ForColNum, T012G58_A831TipColCod, T012G58_A7797Sim_lin
            }
            , new Object[] {
            T012G59_A396EmprCod, T012G59_A7163Vir_Codigo, T012G59_A719PrdNum
            }
            , new Object[] {
            T012G60_A396EmprCod, T012G60_A6310Lb_TaAuxC, T012G60_A6313lb_TaAuxL, T012G60_A6378Lb_TauxLP
            }
            , new Object[] {
            T012G61_A396EmprCod, T012G61_A6290PreCoNum, T012G61_A719PrdNum
            }
            , new Object[] {
            T012G62_A396EmprCod, T012G62_A719PrdNum, T012G62_A6158PrdPrv
            }
            , new Object[] {
            T012G63_A396EmprCod, T012G63_A719PrdNum, T012G63_A5973PrdSusNum
            }
            , new Object[] {
            T012G64_A396EmprCod, T012G64_A5612Lb_CodGru, T012G64_A5615Lb_LinGru
            }
            , new Object[] {
            T012G65_A396EmprCod, T012G65_A5532Lb_numero, T012G65_A5555Lb_opcion, T012G65_A5560Lb_LineaPr
            }
            , new Object[] {
            T012G66_A396EmprCod, T012G66_A5532Lb_numero, T012G66_A5555Lb_opcion, T012G66_A5557Lb_LineaC
            }
            , new Object[] {
            T012G67_A396EmprCod, T012G67_A5145SobCod, T012G67_A719PrdNum
            }
            , new Object[] {
            T012G68_A396EmprCod, T012G68_A4744RecPreCod, T012G68_A4762RecPreLin, T012G68_A4763RecPreNli
            }
            , new Object[] {
            T012G69_A396EmprCod, T012G69_A4492HreBarCod, T012G69_A4493HreBarReo, T012G69_A4494HreBarPar, T012G69_A4495HreNumCie, T012G69_A4545HreLinMaq, T012G69_A4550HreLinPro, T012G69_A4557HreRecLin
            }
            , new Object[] {
            T012G70_A396EmprCod, T012G70_A4492HreBarCod, T012G70_A4493HreBarReo, T012G70_A4494HreBarPar, T012G70_A4495HreNumCie, T012G70_A4508HreLinMAL, T012G70_A4509HreNumAny, T012G70_A719PrdNum
            }
            , new Object[] {
            T012G71_A396EmprCod, T012G71_A252CliCod, T012G71_A4415EstCol, T012G71_A4416EstColLin
            }
            , new Object[] {
            T012G72_A396EmprCod, T012G72_A129BarCod, T012G72_A132BarCodReo, T012G72_A130BarCodPar, T012G72_A2524DisComLin, T012G72_A1056DisComCod, T012G72_A1032FonCod, T012G72_A2124RecMolCod, T012G72_A2672RecPasLin, T012G72_A2675RecPasPLi
            }
            , new Object[] {
            T012G73_A396EmprCod, T012G73_A129BarCod, T012G73_A132BarCodReo, T012G73_A130BarCodPar, T012G73_A2524DisComLin, T012G73_A1056DisComCod, T012G73_A1032FonCod, T012G73_A2124RecMolCod, T012G73_A2126RecMolLin
            }
            , new Object[] {
            T012G74_A396EmprCod, T012G74_A2107PasCod, T012G74_A719PrdNum
            }
            , new Object[] {
            T012G75_A396EmprCod, T012G75_A2637HisEstHRu, T012G75_A2636HisEstHRe, T012G75_A2635HisEstHPa, T012G75_A2638HisEstLCo, T012G75_A2630HisEstCom, T012G75_A2634HisEstFon, T012G75_A719PrdNum
            }
            , new Object[] {
            T012G76_A396EmprCod, T012G76_A252CliCod, T012G76_A2141SerEst, T012G76_A1013DibCli, T012G76_A1014DibInt, T012G76_A2074ColCom, T012G76_A2078ColFon, T012G76_A2098MolCod, T012G76_A2535ForPrdLin
            }
            , new Object[] {
            T012G77_A396EmprCod, T012G77_A719PrdNum, T012G77_A3342CCStkLin
            }
            , new Object[] {
            T012G78_A396EmprCod, T012G78_A252CliCod, T012G78_A2891HMaForSer, T012G78_A2892HMaForCNom, T012G78_A2893HMaForCNum, T012G78_A2894HMaTipCCod, T012G78_A2895HMaForNumC, T012G78_A2897HMaColLin, T012G78_A2896HMaFec, T012G78_A2907HmaLin
            }
            , new Object[] {
            T012G79_A396EmprCod, T012G79_A129BarCod, T012G79_A132BarCodReo, T012G79_A130BarCodPar, T012G79_A2808RecLinMAL, T012G79_A1377RecNumAny, T012G79_A719PrdNum
            }
            , new Object[] {
            T012G80_A396EmprCod, T012G80_A129BarCod, T012G80_A132BarCodReo, T012G80_A130BarCodPar, T012G80_A2804RecLinMaq, T012G80_A1273RecLinPro, T012G80_A811RecLin
            }
            , new Object[] {
            T012G81_A396EmprCod, T012G81_A129BarCod, T012G81_A132BarCodReo, T012G81_A130BarCodPar, T012G81_A2494BarDosPro, T012G81_A719PrdNum
            }
            , new Object[] {
            T012G82_A396EmprCod, T012G82_A1314EnsLabCod, T012G82_A1317EnsLabLin
            }
            , new Object[] {
            T012G83_A396EmprCod, T012G83_A910Workstat, T012G83_A887EscMLin
            }
            , new Object[] {
            T012G84_A396EmprCod, T012G84_A859CumCodCont, T012G84_A719PrdNum
            }
            , new Object[] {
            T012G85_A396EmprCod, T012G85_A719PrdNum, T012G85_A810RecFec
            }
            , new Object[] {
            T012G86_A396EmprCod, T012G86_A486ForNumCol, T012G86_A715PrdLin
            }
            , new Object[] {
            T012G87_A396EmprCod, T012G87_A719PrdNum, T012G87_A681PrdAny
            }
            , new Object[] {
            T012G88_A396EmprCod, T012G88_A719PrdNum, T012G88_A688PrdComCod
            }
            , new Object[] {
            T012G89_A396EmprCod, T012G89_A719PrdNum, T012G89_A680PrdAltNum
            }
            , new Object[] {
            T012G90_A396EmprCod, T012G90_A658PedCod, T012G90_A719PrdNum
            }
            , new Object[] {
            T012G91_A396EmprCod, T012G91_A486ForNumCol, T012G91_A309ColLin
            }
            , new Object[] {
            T012G92_A396EmprCod, T012G92_A719PrdNum, T012G92_A647NumCon
            }
            , new Object[] {
            }
            , new Object[] {
            T012G94_A396EmprCod, T012G94_A719PrdNum
            }
            , new Object[] {
            T012G95_A719PrdNum, T012G95_A8661Almc_Ln, T012G95_A8666ALmc_Fec, T012G95_n8666ALmc_Fec, T012G95_A8667Almc_Con, T012G95_n8667Almc_Con, T012G95_A8665Almc_Rem, T012G95_n8665Almc_Rem, T012G95_A8662Almc_alb, T012G95_n8662Almc_alb,
            T012G95_A8663Almc_UniE, T012G95_n8663Almc_UniE, T012G95_A8664Almc_Pre, T012G95_n8664Almc_Pre, T012G95_A8672Almc_Prov, T012G95_n8672Almc_Prov, T012G95_A12578Almc_Ped, T012G95_n12578Almc_Ped, T012G95_A12579Almc_Cum, T012G95_n12579Almc_Cum,
            T012G95_A12643Almc_Lote, T012G95_n12643Almc_Lote, T012G95_A12849Almc_Nct, T012G95_n12849Almc_Nct, T012G95_A396EmprCod
            }
            , new Object[] {
            T012G96_A396EmprCod, T012G96_A719PrdNum, T012G96_A8661Almc_Ln
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T012G100_A396EmprCod, T012G100_A719PrdNum, T012G100_A8661Almc_Ln
            }
            , new Object[] {
            T012G101_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Z8667Almc_Con = (byte)(0) ;
      n8667Almc_Con = false ;
      A8667Almc_Con = (byte)(0) ;
      n8667Almc_Con = false ;
      i8667Almc_Con = (byte)(0) ;
      n8667Almc_Con = false ;
      Z8666ALmc_Fec = GXutil.today( ) ;
      n8666ALmc_Fec = false ;
      O8666ALmc_Fec = GXutil.today( ) ;
      n8666ALmc_Fec = false ;
      T8666ALmc_Fec = GXutil.today( ) ;
      n8666ALmc_Fec = false ;
      i8666ALmc_Fec = GXutil.today( ) ;
      n8666ALmc_Fec = false ;
      A8666ALmc_Fec = GXutil.today( ) ;
      n8666ALmc_Fec = false ;
   }

   private byte Z856ValCod ;
   private byte Z8667Almc_Con ;
   private byte GxWebError ;
   private byte AV21Mes ;
   private byte AV63MesAnt ;
   private byte A856ValCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV76FlagPre ;
   private byte A8667Almc_Con ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i8667Almc_Con ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GXv_int15[] ;
   private byte GXv_int14[] ;
   private byte GXv_int9[] ;
   private byte ZZ856ValCod ;
   private byte ZV21Mes ;
   private byte ZV63MesAnt ;
   private short Z12849Almc_Nct ;
   private short nRcdDeleted_1184 ;
   private short nRcdExists_1184 ;
   private short nIsMod_1184 ;
   private short AV16Year ;
   private short AV62AnyAnt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1184 ;
   private short RcdFound1184 ;
   private short nBlankRcdUsr1184 ;
   private short AV20DiasFin ;
   private short A12849Almc_Nct ;
   private short RcdFound29 ;
   private short nIsDirty_29 ;
   private short nIsDirty_1184 ;
   private short GXv_int12[] ;
   private short GXv_int8[] ;
   private short GXv_int13[] ;
   private short ZV16Year ;
   private short ZV62AnyAnt ;
   private short ZV20DiasFin ;
   private int Z8660Almc_Ult ;
   private int Z795PrvNum ;
   private int nRC_GXsfl_85 ;
   private int nGXsfl_85_idx=1 ;
   private int Z8661Almc_Ln ;
   private int Z8672Almc_Prov ;
   private int Z12578Almc_Ped ;
   private int A8661Almc_Ln ;
   private int A8672Almc_Prov ;
   private int A12578Almc_Ped ;
   private int A795PrvNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtPrdNum_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrvNum_Enabled ;
   private int edtPrvNom_Enabled ;
   private int edtValCod_Enabled ;
   private int edtPrdRec_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPrdExiAlmc_Enabled ;
   private int edtPrdExiCC_Enabled ;
   private int A8660Almc_Ult ;
   private int edtAlmc_Ult_Enabled ;
   private int edtUltFecCCs_Enabled ;
   private int edtPrdNumUco_Enabled ;
   private int edtavnRcdDeleted_1184_Enabled ;
   private int edtAlmc_Ln_Enabled ;
   private int edtAlmc_alb_Enabled ;
   private int edtAlmc_UniE_Enabled ;
   private int edtAlmc_Pre_Enabled ;
   private int edtAlmc_Rem_Enabled ;
   private int edtALmc_Fec_Enabled ;
   private int edtAlmc_Con_Enabled ;
   private int edtAlmc_Prov_Enabled ;
   private int edtAlmc_Ped_Enabled ;
   private int edtAlmc_Cum_Enabled ;
   private int edtAlmc_Lote_Enabled ;
   private int edtAlmc_Nct_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAlmc_Ped_Enabled ;
   private int defedtAlmc_Con_Enabled ;
   private int defedtAlmc_Rem_Enabled ;
   private int defedtAlmc_Ln_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPrdNumUco_Backcolor ;
   private int edtUltFecCCs_Backcolor ;
   private int edtAlmc_Ult_Backcolor ;
   private int edtPrdExiCC_Backcolor ;
   private int edtPrdExiAlmc_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtPrdRec_Backcolor ;
   private int edtValCod_Backcolor ;
   private int edtPrvNom_Backcolor ;
   private int edtPrvNum_Backcolor ;
   private int edtPrdNom_Backcolor ;
   private int edtPrdNum_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int6[] ;
   private int ZZ795PrvNum ;
   private int ZZ8660Almc_Ult ;
   private int GXv_int21[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z8659PrdExiAlmc ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z721PrdNumUco ;
   private java.math.BigDecimal O8659PrdExiAlmc ;
   private java.math.BigDecimal Z8665Almc_Rem ;
   private java.math.BigDecimal Z8663Almc_UniE ;
   private java.math.BigDecimal Z8664Almc_Pre ;
   private java.math.BigDecimal O8664Almc_Pre ;
   private java.math.BigDecimal O8663Almc_UniE ;
   private java.math.BigDecimal O8665Almc_Rem ;
   private java.math.BigDecimal A8664Almc_Pre ;
   private java.math.BigDecimal A8663Almc_UniE ;
   private java.math.BigDecimal AV28UniOld ;
   private java.math.BigDecimal AV64PrecAnt ;
   private java.math.BigDecimal AV56vPrecio ;
   private java.math.BigDecimal A8659PrdExiAlmc ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A721PrdNumUco ;
   private java.math.BigDecimal B8659PrdExiAlmc ;
   private java.math.BigDecimal AV68OldExiAlm ;
   private java.math.BigDecimal AV69OldEntPre ;
   private java.math.BigDecimal AV70OldEntUni ;
   private java.math.BigDecimal s8659PrdExiAlmc ;
   private java.math.BigDecimal sV68OldExiAlm ;
   private java.math.BigDecimal OV68OldExiAlm ;
   private java.math.BigDecimal A8665Almc_Rem ;
   private java.math.BigDecimal T8664Almc_Pre ;
   private java.math.BigDecimal T8663Almc_UniE ;
   private java.math.BigDecimal T8665Almc_Rem ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal ZZ8659PrdExiAlmc ;
   private java.math.BigDecimal ZZ705PrdExiCC ;
   private java.math.BigDecimal ZZ721PrdNumUco ;
   private java.math.BigDecimal ZO8659PrdExiAlmc ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal ZV68OldExiAlm ;
   private java.math.BigDecimal ZV70OldEntUni ;
   private java.math.BigDecimal ZV28UniOld ;
   private java.math.BigDecimal ZV56vPrecio ;
   private java.math.BigDecimal ZV69OldEntPre ;
   private java.math.BigDecimal ZV64PrecAnt ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String Z727PrdRec ;
   private String Z8662Almc_alb ;
   private String Z12579Almc_Cum ;
   private String Z12643Almc_Lote ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV60Modo2 ;
   private String A718PrdNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrdNum_Internalname ;
   private String sGXsfl_85_idx="0001" ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String tblTable2_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String edtPrdNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPrvNom_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtValCod_Internalname ;
   private String edtValCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPrdRec_Internalname ;
   private String A727PrdRec ;
   private String edtPrdRec_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtPrdExiAlmc_Internalname ;
   private String edtPrdExiAlmc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdExiCC_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAlmc_Ult_Internalname ;
   private String edtAlmc_Ult_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtUltFecCCs_Internalname ;
   private String edtUltFecCCs_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtPrdNumUco_Internalname ;
   private String edtPrdNumUco_Jsonclick ;
   private String sMode1184 ;
   private String edtavnRcdDeleted_1184_Internalname ;
   private String edtAlmc_Ln_Internalname ;
   private String edtAlmc_alb_Internalname ;
   private String edtAlmc_UniE_Internalname ;
   private String edtAlmc_Pre_Internalname ;
   private String edtAlmc_Rem_Internalname ;
   private String edtALmc_Fec_Internalname ;
   private String edtAlmc_Con_Internalname ;
   private String edtAlmc_Prov_Internalname ;
   private String edtAlmc_Ped_Internalname ;
   private String edtAlmc_Cum_Internalname ;
   private String edtAlmc_Lote_Internalname ;
   private String edtAlmc_Nct_Internalname ;
   private String subGrid1_Internalname ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_check_Internalname ;
   private String bttBtn_check_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String bttBtn_help_Internalname ;
   private String bttBtn_help_Jsonclick ;
   private String AV59Modo ;
   private String AV23UsurCod ;
   private String AV89PrdNomX ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode29 ;
   private String A8662Almc_alb ;
   private String A12579Almc_Cum ;
   private String A12643Almc_Lote ;
   private String Z407EmprNom ;
   private String Z794PrvNom ;
   private String GXCCtl ;
   private String sGXsfl_85_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1184_Jsonclick ;
   private String edtAlmc_Ln_Jsonclick ;
   private String edtAlmc_alb_Jsonclick ;
   private String edtAlmc_UniE_Jsonclick ;
   private String edtAlmc_Pre_Jsonclick ;
   private String edtAlmc_Rem_Jsonclick ;
   private String edtALmc_Fec_Jsonclick ;
   private String edtAlmc_Con_Jsonclick ;
   private String edtAlmc_Prov_Jsonclick ;
   private String edtAlmc_Ped_Jsonclick ;
   private String edtAlmc_Cum_Jsonclick ;
   private String edtAlmc_Lote_Jsonclick ;
   private String edtAlmc_Nct_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV59Modo ;
   private String iV60Modo2 ;
   private String subGrid1_Header ;
   private String GXv_char2[] ;
   private String GXv_char18[] ;
   private String GXv_char3[] ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ718PrdNom ;
   private String ZZ727PrdRec ;
   private String ZZ407EmprNom ;
   private String ZZ794PrvNom ;
   private String GXt_char5 ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private String ZV89PrdNomX ;
   private java.util.Date Z8666ALmc_Fec ;
   private java.util.Date O8666ALmc_Fec ;
   private java.util.Date A8666ALmc_Fec ;
   private java.util.Date AV65FecAnt ;
   private java.util.Date A3835UltFecCCs ;
   private java.util.Date Gx_date ;
   private java.util.Date AV19Fecha ;
   private java.util.Date T8666ALmc_Fec ;
   private java.util.Date i8666ALmc_Fec ;
   private java.util.Date GXv_date4[] ;
   private java.util.Date Z3835UltFecCCs ;
   private java.util.Date GXt_date1 ;
   private java.util.Date GXv_date17[] ;
   private java.util.Date ZZ3835UltFecCCs ;
   private java.util.Date ZV19Fecha ;
   private java.util.Date ZV65FecAnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean n8672Almc_Prov ;
   private boolean n8664Almc_Pre ;
   private boolean n8663Almc_UniE ;
   private boolean n8666ALmc_Fec ;
   private boolean n12578Almc_Ped ;
   private boolean wbErr ;
   private boolean bGXsfl_85_Refreshing=false ;
   private boolean n794PrvNom ;
   private boolean n407EmprNom ;
   private boolean n8660Almc_Ult ;
   private boolean Gx_longc ;
   private boolean n8667Almc_Con ;
   private boolean n8665Almc_Rem ;
   private boolean n8662Almc_alb ;
   private boolean n12579Almc_Cum ;
   private boolean n12643Almc_Lote ;
   private boolean n12849Almc_Nct ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T012G9_A719PrdNum ;
   private boolean[] T012G9_n719PrdNum ;
   private String[] T012G9_A718PrdNom ;
   private String[] T012G9_A794PrvNom ;
   private boolean[] T012G9_n794PrvNom ;
   private String[] T012G9_A727PrdRec ;
   private String[] T012G9_A407EmprNom ;
   private boolean[] T012G9_n407EmprNom ;
   private java.math.BigDecimal[] T012G9_A8659PrdExiAlmc ;
   private java.math.BigDecimal[] T012G9_A705PrdExiCC ;
   private int[] T012G9_A8660Almc_Ult ;
   private boolean[] T012G9_n8660Almc_Ult ;
   private java.math.BigDecimal[] T012G9_A721PrdNumUco ;
   private String[] T012G9_A396EmprCod ;
   private int[] T012G9_A795PrvNum ;
   private byte[] T012G9_A856ValCod ;
   private String[] T012G6_A407EmprNom ;
   private boolean[] T012G6_n407EmprNom ;
   private String[] T012G7_A794PrvNom ;
   private boolean[] T012G7_n794PrvNom ;
   private String[] T012G8_A396EmprCod ;
   private String[] T012G10_A407EmprNom ;
   private boolean[] T012G10_n407EmprNom ;
   private String[] T012G11_A794PrvNom ;
   private boolean[] T012G11_n794PrvNom ;
   private String[] T012G12_A396EmprCod ;
   private String[] T012G13_A396EmprCod ;
   private String[] T012G13_A719PrdNum ;
   private boolean[] T012G13_n719PrdNum ;
   private String[] T012G5_A719PrdNum ;
   private boolean[] T012G5_n719PrdNum ;
   private String[] T012G5_A718PrdNom ;
   private String[] T012G5_A727PrdRec ;
   private java.math.BigDecimal[] T012G5_A8659PrdExiAlmc ;
   private java.math.BigDecimal[] T012G5_A705PrdExiCC ;
   private int[] T012G5_A8660Almc_Ult ;
   private boolean[] T012G5_n8660Almc_Ult ;
   private java.math.BigDecimal[] T012G5_A721PrdNumUco ;
   private String[] T012G5_A396EmprCod ;
   private int[] T012G5_A795PrvNum ;
   private byte[] T012G5_A856ValCod ;
   private String[] T012G14_A396EmprCod ;
   private String[] T012G14_A719PrdNum ;
   private boolean[] T012G14_n719PrdNum ;
   private String[] T012G15_A396EmprCod ;
   private String[] T012G15_A719PrdNum ;
   private boolean[] T012G15_n719PrdNum ;
   private String[] T012G4_A719PrdNum ;
   private boolean[] T012G4_n719PrdNum ;
   private String[] T012G4_A718PrdNom ;
   private String[] T012G4_A727PrdRec ;
   private java.math.BigDecimal[] T012G4_A8659PrdExiAlmc ;
   private java.math.BigDecimal[] T012G4_A705PrdExiCC ;
   private int[] T012G4_A8660Almc_Ult ;
   private boolean[] T012G4_n8660Almc_Ult ;
   private java.math.BigDecimal[] T012G4_A721PrdNumUco ;
   private String[] T012G4_A396EmprCod ;
   private int[] T012G4_A795PrvNum ;
   private byte[] T012G4_A856ValCod ;
   private String[] T012G19_A407EmprNom ;
   private boolean[] T012G19_n407EmprNom ;
   private String[] T012G20_A794PrvNom ;
   private boolean[] T012G20_n794PrvNom ;
   private String[] T012G21_A396EmprCod ;
   private String[] T012G21_A719PrdNum ;
   private boolean[] T012G21_n719PrdNum ;
   private String[] T012G21_A13217NormaID ;
   private String[] T012G22_A396EmprCod ;
   private String[] T012G22_A719PrdNum ;
   private boolean[] T012G22_n719PrdNum ;
   private String[] T012G22_A13586TheList ;
   private String[] T012G23_A396EmprCod ;
   private int[] T012G23_A5532Lb_numero ;
   private String[] T012G23_A5555Lb_opcion ;
   private short[] T012G23_A13460Lb_linCP ;
   private String[] T012G23_A13458Lb_TipCP ;
   private String[] T012G24_A396EmprCod ;
   private int[] T012G24_A13418AlbProID ;
   private short[] T012G24_A13442AlbProLine ;
   private String[] T012G25_A396EmprCod ;
   private int[] T012G25_A13324LDESID ;
   private String[] T012G25_A13333LDESNPeque ;
   private String[] T012G25_A13337LDESComb ;
   private String[] T012G25_A13339LDESFondo ;
   private short[] T012G25_A13342LDESLinea ;
   private String[] T012G26_A396EmprCod ;
   private int[] T012G26_A13312Lb_NLab ;
   private short[] T012G26_A13305Lb_IDVeces ;
   private short[] T012G26_A13306Lb_LinID ;
   private String[] T012G27_A396EmprCod ;
   private int[] T012G27_A12673LavMqId ;
   private short[] T012G27_A12692LavMqLnPq ;
   private short[] T012G27_A12681LavMqLn ;
   private String[] T012G28_A396EmprCod ;
   private String[] T012G28_A719PrdNum ;
   private boolean[] T012G28_n719PrdNum ;
   private short[] T012G28_A9713Tb1_Cod ;
   private String[] T012G29_A396EmprCod ;
   private String[] T012G29_A12236PrdNumD ;
   private String[] T012G29_A719PrdNum ;
   private boolean[] T012G29_n719PrdNum ;
   private String[] T012G30_A396EmprCod ;
   private long[] T012G30_A12225DocDisID ;
   private short[] T012G30_A12226LinDisID ;
   private String[] T012G31_A396EmprCod ;
   private long[] T012G31_A12225DocDisID ;
   private String[] T012G32_A396EmprCod ;
   private long[] T012G32_A12205OrdenCID ;
   private short[] T012G32_A12206OrdenCLnId ;
   private String[] T012G33_A396EmprCod ;
   private String[] T012G33_A719PrdNum ;
   private boolean[] T012G33_n719PrdNum ;
   private String[] T012G33_A11664LoteID ;
   private java.util.Date[] T012G33_A11665LoteFec ;
   private String[] T012G34_A396EmprCod ;
   private int[] T012G34_A4850DevComCod ;
   private String[] T012G34_A719PrdNum ;
   private boolean[] T012G34_n719PrdNum ;
   private String[] T012G35_A396EmprCod ;
   private int[] T012G35_A252CliCod ;
   private String[] T012G35_A494ForSer ;
   private String[] T012G35_A482ForColNom ;
   private int[] T012G35_A483ForColNum ;
   private byte[] T012G35_A831TipColCod ;
   private String[] T012G35_A3571EnsCod ;
   private short[] T012G35_A3582EnsLin ;
   private String[] T012G36_A396EmprCod ;
   private int[] T012G36_A129BarCod ;
   private byte[] T012G36_A132BarCodReo ;
   private String[] T012G36_A130BarCodPar ;
   private byte[] T012G36_A4075recestncol ;
   private byte[] T012G36_A4076recestnpro ;
   private short[] T012G36_A4108recestlin ;
   private String[] T012G37_A396EmprCod ;
   private int[] T012G37_A4052EstNumFor ;
   private byte[] T012G37_A4053EstNumCol ;
   private byte[] T012G37_A4090EstEspLin ;
   private String[] T012G38_A396EmprCod ;
   private int[] T012G38_A4052EstNumFor ;
   private byte[] T012G38_A4053EstNumCol ;
   private byte[] T012G38_A4084EstProLin ;
   private String[] T012G39_A396EmprCod ;
   private long[] T012G39_A11644TransferId ;
   private int[] T012G39_A11653TransferLn ;
   private String[] T012G40_A396EmprCod ;
   private String[] T012G40_A11634TaesId ;
   private short[] T012G40_A11637TaesLn ;
   private short[] T012G40_A11641TaesLnP ;
   private String[] T012G41_A396EmprCod ;
   private String[] T012G41_A719PrdNum ;
   private boolean[] T012G41_n719PrdNum ;
   private long[] T012G41_A11329H_stklin ;
   private String[] T012G42_A396EmprCod ;
   private int[] T012G42_A11270Pot_num ;
   private short[] T012G42_A11271Pot_lin ;
   private String[] T012G43_A396EmprCod ;
   private String[] T012G43_A719PrdNum ;
   private boolean[] T012G43_n719PrdNum ;
   private String[] T012G43_A11199PrdNcasC ;
   private String[] T012G44_A396EmprCod ;
   private String[] T012G44_A719PrdNum ;
   private boolean[] T012G44_n719PrdNum ;
   private String[] T012G44_A11197CFraseR ;
   private String[] T012G45_A396EmprCod ;
   private short[] T012G45_A10243Jt_codigo ;
   private short[] T012G45_A10246Jt_ord ;
   private String[] T012G46_A396EmprCod ;
   private java.util.Date[] T012G46_A10236Bny_dia ;
   private short[] T012G46_A10238Bny_lin ;
   private String[] T012G47_A396EmprCod ;
   private int[] T012G47_A129BarCod ;
   private byte[] T012G47_A132BarCodReo ;
   private String[] T012G47_A130BarCodPar ;
   private String[] T012G47_A758ProCod ;
   private short[] T012G47_A194BarOrdLin ;
   private String[] T012G47_A719PrdNum ;
   private boolean[] T012G47_n719PrdNum ;
   private String[] T012G48_A396EmprCod ;
   private String[] T012G48_A719PrdNum ;
   private boolean[] T012G48_n719PrdNum ;
   private String[] T012G48_A9735Cod_Rgo ;
   private String[] T012G49_A396EmprCod ;
   private String[] T012G49_A719PrdNum ;
   private boolean[] T012G49_n719PrdNum ;
   private short[] T012G49_A9711Ct_codigo ;
   private String[] T012G50_A396EmprCod ;
   private long[] T012G50_A9652OeNum ;
   private int[] T012G50_A9653OeHdr ;
   private byte[] T012G50_A9654OeHdrr ;
   private String[] T012G50_A9655OeHdrp ;
   private byte[] T012G50_A9656OeLinC ;
   private String[] T012G50_A9657OeComb ;
   private String[] T012G50_A9658Oefondo ;
   private byte[] T012G50_A9659OeMolCil ;
   private short[] T012G50_A9686OePasLin ;
   private short[] T012G50_A9694OePasPLi ;
   private String[] T012G51_A396EmprCod ;
   private long[] T012G51_A9652OeNum ;
   private int[] T012G51_A9653OeHdr ;
   private byte[] T012G51_A9654OeHdrr ;
   private String[] T012G51_A9655OeHdrp ;
   private byte[] T012G51_A9656OeLinC ;
   private String[] T012G51_A9657OeComb ;
   private String[] T012G51_A9658Oefondo ;
   private byte[] T012G51_A9659OeMolCil ;
   private byte[] T012G51_A9677OeMolLin ;
   private String[] T012G52_A396EmprCod ;
   private int[] T012G52_A9578Pas_Num ;
   private String[] T012G52_A719PrdNum ;
   private boolean[] T012G52_n719PrdNum ;
   private String[] T012G53_A396EmprCod ;
   private String[] T012G53_A719PrdNum ;
   private boolean[] T012G53_n719PrdNum ;
   private byte[] T012G53_A8908CC_AlmCod ;
   private String[] T012G54_A396EmprCod ;
   private String[] T012G54_A719PrdNum ;
   private boolean[] T012G54_n719PrdNum ;
   private String[] T012G54_A8648Mat_PrdN ;
   private String[] T012G55_A396EmprCod ;
   private long[] T012G55_A8585Pet_cod ;
   private String[] T012G55_A719PrdNum ;
   private boolean[] T012G55_n719PrdNum ;
   private String[] T012G56_A396EmprCod ;
   private String[] T012G56_A719PrdNum ;
   private boolean[] T012G56_n719PrdNum ;
   private java.util.Date[] T012G56_A8577RecFecHr ;
   private String[] T012G57_A396EmprCod ;
   private String[] T012G57_A719PrdNum ;
   private boolean[] T012G57_n719PrdNum ;
   private short[] T012G57_A8366PrdAnyo ;
   private int[] T012G57_A8360PrdProv ;
   private String[] T012G58_A396EmprCod ;
   private int[] T012G58_A252CliCod ;
   private String[] T012G58_A494ForSer ;
   private String[] T012G58_A482ForColNom ;
   private int[] T012G58_A483ForColNum ;
   private byte[] T012G58_A831TipColCod ;
   private short[] T012G58_A7797Sim_lin ;
   private String[] T012G59_A396EmprCod ;
   private int[] T012G59_A7163Vir_Codigo ;
   private String[] T012G59_A719PrdNum ;
   private boolean[] T012G59_n719PrdNum ;
   private String[] T012G60_A396EmprCod ;
   private String[] T012G60_A6310Lb_TaAuxC ;
   private short[] T012G60_A6313lb_TaAuxL ;
   private short[] T012G60_A6378Lb_TauxLP ;
   private String[] T012G61_A396EmprCod ;
   private int[] T012G61_A6290PreCoNum ;
   private String[] T012G61_A719PrdNum ;
   private boolean[] T012G61_n719PrdNum ;
   private String[] T012G62_A396EmprCod ;
   private String[] T012G62_A719PrdNum ;
   private boolean[] T012G62_n719PrdNum ;
   private int[] T012G62_A6158PrdPrv ;
   private String[] T012G63_A396EmprCod ;
   private String[] T012G63_A719PrdNum ;
   private boolean[] T012G63_n719PrdNum ;
   private String[] T012G63_A5973PrdSusNum ;
   private String[] T012G64_A396EmprCod ;
   private String[] T012G64_A5612Lb_CodGru ;
   private short[] T012G64_A5615Lb_LinGru ;
   private String[] T012G65_A396EmprCod ;
   private int[] T012G65_A5532Lb_numero ;
   private String[] T012G65_A5555Lb_opcion ;
   private short[] T012G65_A5560Lb_LineaPr ;
   private String[] T012G66_A396EmprCod ;
   private int[] T012G66_A5532Lb_numero ;
   private String[] T012G66_A5555Lb_opcion ;
   private short[] T012G66_A5557Lb_LineaC ;
   private String[] T012G67_A396EmprCod ;
   private int[] T012G67_A5145SobCod ;
   private String[] T012G67_A719PrdNum ;
   private boolean[] T012G67_n719PrdNum ;
   private String[] T012G68_A396EmprCod ;
   private int[] T012G68_A4744RecPreCod ;
   private short[] T012G68_A4762RecPreLin ;
   private short[] T012G68_A4763RecPreNli ;
   private String[] T012G69_A396EmprCod ;
   private int[] T012G69_A4492HreBarCod ;
   private byte[] T012G69_A4493HreBarReo ;
   private String[] T012G69_A4494HreBarPar ;
   private byte[] T012G69_A4495HreNumCie ;
   private short[] T012G69_A4545HreLinMaq ;
   private byte[] T012G69_A4550HreLinPro ;
   private short[] T012G69_A4557HreRecLin ;
   private String[] T012G70_A396EmprCod ;
   private int[] T012G70_A4492HreBarCod ;
   private byte[] T012G70_A4493HreBarReo ;
   private String[] T012G70_A4494HreBarPar ;
   private byte[] T012G70_A4495HreNumCie ;
   private short[] T012G70_A4508HreLinMAL ;
   private byte[] T012G70_A4509HreNumAny ;
   private String[] T012G70_A719PrdNum ;
   private boolean[] T012G70_n719PrdNum ;
   private String[] T012G71_A396EmprCod ;
   private int[] T012G71_A252CliCod ;
   private String[] T012G71_A4415EstCol ;
   private short[] T012G71_A4416EstColLin ;
   private String[] T012G72_A396EmprCod ;
   private int[] T012G72_A129BarCod ;
   private byte[] T012G72_A132BarCodReo ;
   private String[] T012G72_A130BarCodPar ;
   private byte[] T012G72_A2524DisComLin ;
   private String[] T012G72_A1056DisComCod ;
   private String[] T012G72_A1032FonCod ;
   private byte[] T012G72_A2124RecMolCod ;
   private short[] T012G72_A2672RecPasLin ;
   private short[] T012G72_A2675RecPasPLi ;
   private String[] T012G73_A396EmprCod ;
   private int[] T012G73_A129BarCod ;
   private byte[] T012G73_A132BarCodReo ;
   private String[] T012G73_A130BarCodPar ;
   private byte[] T012G73_A2524DisComLin ;
   private String[] T012G73_A1056DisComCod ;
   private String[] T012G73_A1032FonCod ;
   private byte[] T012G73_A2124RecMolCod ;
   private byte[] T012G73_A2126RecMolLin ;
   private String[] T012G74_A396EmprCod ;
   private String[] T012G74_A2107PasCod ;
   private String[] T012G74_A719PrdNum ;
   private boolean[] T012G74_n719PrdNum ;
   private String[] T012G75_A396EmprCod ;
   private int[] T012G75_A2637HisEstHRu ;
   private byte[] T012G75_A2636HisEstHRe ;
   private String[] T012G75_A2635HisEstHPa ;
   private byte[] T012G75_A2638HisEstLCo ;
   private String[] T012G75_A2630HisEstCom ;
   private String[] T012G75_A2634HisEstFon ;
   private String[] T012G75_A719PrdNum ;
   private boolean[] T012G75_n719PrdNum ;
   private String[] T012G76_A396EmprCod ;
   private int[] T012G76_A252CliCod ;
   private String[] T012G76_A2141SerEst ;
   private String[] T012G76_A1013DibCli ;
   private int[] T012G76_A1014DibInt ;
   private String[] T012G76_A2074ColCom ;
   private String[] T012G76_A2078ColFon ;
   private byte[] T012G76_A2098MolCod ;
   private short[] T012G76_A2535ForPrdLin ;
   private String[] T012G77_A396EmprCod ;
   private String[] T012G77_A719PrdNum ;
   private boolean[] T012G77_n719PrdNum ;
   private long[] T012G77_A3342CCStkLin ;
   private String[] T012G78_A396EmprCod ;
   private int[] T012G78_A252CliCod ;
   private String[] T012G78_A2891HMaForSer ;
   private String[] T012G78_A2892HMaForCNom ;
   private int[] T012G78_A2893HMaForCNum ;
   private byte[] T012G78_A2894HMaTipCCod ;
   private int[] T012G78_A2895HMaForNumC ;
   private short[] T012G78_A2897HMaColLin ;
   private java.util.Date[] T012G78_A2896HMaFec ;
   private short[] T012G78_A2907HmaLin ;
   private String[] T012G79_A396EmprCod ;
   private int[] T012G79_A129BarCod ;
   private byte[] T012G79_A132BarCodReo ;
   private String[] T012G79_A130BarCodPar ;
   private short[] T012G79_A2808RecLinMAL ;
   private byte[] T012G79_A1377RecNumAny ;
   private String[] T012G79_A719PrdNum ;
   private boolean[] T012G79_n719PrdNum ;
   private String[] T012G80_A396EmprCod ;
   private int[] T012G80_A129BarCod ;
   private byte[] T012G80_A132BarCodReo ;
   private String[] T012G80_A130BarCodPar ;
   private short[] T012G80_A2804RecLinMaq ;
   private byte[] T012G80_A1273RecLinPro ;
   private short[] T012G80_A811RecLin ;
   private String[] T012G81_A396EmprCod ;
   private int[] T012G81_A129BarCod ;
   private byte[] T012G81_A132BarCodReo ;
   private String[] T012G81_A130BarCodPar ;
   private String[] T012G81_A2494BarDosPro ;
   private String[] T012G81_A719PrdNum ;
   private boolean[] T012G81_n719PrdNum ;
   private String[] T012G82_A396EmprCod ;
   private int[] T012G82_A1314EnsLabCod ;
   private short[] T012G82_A1317EnsLabLin ;
   private String[] T012G83_A396EmprCod ;
   private String[] T012G83_A910Workstat ;
   private int[] T012G83_A887EscMLin ;
   private String[] T012G84_A396EmprCod ;
   private int[] T012G84_A859CumCodCont ;
   private String[] T012G84_A719PrdNum ;
   private boolean[] T012G84_n719PrdNum ;
   private String[] T012G85_A396EmprCod ;
   private String[] T012G85_A719PrdNum ;
   private boolean[] T012G85_n719PrdNum ;
   private java.util.Date[] T012G85_A810RecFec ;
   private String[] T012G86_A396EmprCod ;
   private int[] T012G86_A486ForNumCol ;
   private short[] T012G86_A715PrdLin ;
   private String[] T012G87_A396EmprCod ;
   private String[] T012G87_A719PrdNum ;
   private boolean[] T012G87_n719PrdNum ;
   private short[] T012G87_A681PrdAny ;
   private String[] T012G88_A396EmprCod ;
   private String[] T012G88_A719PrdNum ;
   private boolean[] T012G88_n719PrdNum ;
   private String[] T012G88_A688PrdComCod ;
   private String[] T012G89_A396EmprCod ;
   private String[] T012G89_A719PrdNum ;
   private boolean[] T012G89_n719PrdNum ;
   private String[] T012G89_A680PrdAltNum ;
   private String[] T012G90_A396EmprCod ;
   private int[] T012G90_A658PedCod ;
   private String[] T012G90_A719PrdNum ;
   private boolean[] T012G90_n719PrdNum ;
   private String[] T012G91_A396EmprCod ;
   private int[] T012G91_A486ForNumCol ;
   private short[] T012G91_A309ColLin ;
   private String[] T012G92_A396EmprCod ;
   private String[] T012G92_A719PrdNum ;
   private boolean[] T012G92_n719PrdNum ;
   private int[] T012G92_A647NumCon ;
   private String[] T012G94_A396EmprCod ;
   private String[] T012G94_A719PrdNum ;
   private boolean[] T012G94_n719PrdNum ;
   private String[] T012G95_A719PrdNum ;
   private boolean[] T012G95_n719PrdNum ;
   private int[] T012G95_A8661Almc_Ln ;
   private java.util.Date[] T012G95_A8666ALmc_Fec ;
   private boolean[] T012G95_n8666ALmc_Fec ;
   private byte[] T012G95_A8667Almc_Con ;
   private boolean[] T012G95_n8667Almc_Con ;
   private java.math.BigDecimal[] T012G95_A8665Almc_Rem ;
   private boolean[] T012G95_n8665Almc_Rem ;
   private String[] T012G95_A8662Almc_alb ;
   private boolean[] T012G95_n8662Almc_alb ;
   private java.math.BigDecimal[] T012G95_A8663Almc_UniE ;
   private boolean[] T012G95_n8663Almc_UniE ;
   private java.math.BigDecimal[] T012G95_A8664Almc_Pre ;
   private boolean[] T012G95_n8664Almc_Pre ;
   private int[] T012G95_A8672Almc_Prov ;
   private boolean[] T012G95_n8672Almc_Prov ;
   private int[] T012G95_A12578Almc_Ped ;
   private boolean[] T012G95_n12578Almc_Ped ;
   private String[] T012G95_A12579Almc_Cum ;
   private boolean[] T012G95_n12579Almc_Cum ;
   private String[] T012G95_A12643Almc_Lote ;
   private boolean[] T012G95_n12643Almc_Lote ;
   private short[] T012G95_A12849Almc_Nct ;
   private boolean[] T012G95_n12849Almc_Nct ;
   private String[] T012G95_A396EmprCod ;
   private String[] T012G96_A396EmprCod ;
   private String[] T012G96_A719PrdNum ;
   private boolean[] T012G96_n719PrdNum ;
   private int[] T012G96_A8661Almc_Ln ;
   private String[] T012G3_A719PrdNum ;
   private boolean[] T012G3_n719PrdNum ;
   private int[] T012G3_A8661Almc_Ln ;
   private java.util.Date[] T012G3_A8666ALmc_Fec ;
   private boolean[] T012G3_n8666ALmc_Fec ;
   private byte[] T012G3_A8667Almc_Con ;
   private boolean[] T012G3_n8667Almc_Con ;
   private java.math.BigDecimal[] T012G3_A8665Almc_Rem ;
   private boolean[] T012G3_n8665Almc_Rem ;
   private String[] T012G3_A8662Almc_alb ;
   private boolean[] T012G3_n8662Almc_alb ;
   private java.math.BigDecimal[] T012G3_A8663Almc_UniE ;
   private boolean[] T012G3_n8663Almc_UniE ;
   private java.math.BigDecimal[] T012G3_A8664Almc_Pre ;
   private boolean[] T012G3_n8664Almc_Pre ;
   private int[] T012G3_A8672Almc_Prov ;
   private boolean[] T012G3_n8672Almc_Prov ;
   private int[] T012G3_A12578Almc_Ped ;
   private boolean[] T012G3_n12578Almc_Ped ;
   private String[] T012G3_A12579Almc_Cum ;
   private boolean[] T012G3_n12579Almc_Cum ;
   private String[] T012G3_A12643Almc_Lote ;
   private boolean[] T012G3_n12643Almc_Lote ;
   private short[] T012G3_A12849Almc_Nct ;
   private boolean[] T012G3_n12849Almc_Nct ;
   private String[] T012G3_A396EmprCod ;
   private String[] T012G2_A719PrdNum ;
   private boolean[] T012G2_n719PrdNum ;
   private int[] T012G2_A8661Almc_Ln ;
   private java.util.Date[] T012G2_A8666ALmc_Fec ;
   private boolean[] T012G2_n8666ALmc_Fec ;
   private byte[] T012G2_A8667Almc_Con ;
   private boolean[] T012G2_n8667Almc_Con ;
   private java.math.BigDecimal[] T012G2_A8665Almc_Rem ;
   private boolean[] T012G2_n8665Almc_Rem ;
   private String[] T012G2_A8662Almc_alb ;
   private boolean[] T012G2_n8662Almc_alb ;
   private java.math.BigDecimal[] T012G2_A8663Almc_UniE ;
   private boolean[] T012G2_n8663Almc_UniE ;
   private java.math.BigDecimal[] T012G2_A8664Almc_Pre ;
   private boolean[] T012G2_n8664Almc_Pre ;
   private int[] T012G2_A8672Almc_Prov ;
   private boolean[] T012G2_n8672Almc_Prov ;
   private int[] T012G2_A12578Almc_Ped ;
   private boolean[] T012G2_n12578Almc_Ped ;
   private String[] T012G2_A12579Almc_Cum ;
   private boolean[] T012G2_n12579Almc_Cum ;
   private String[] T012G2_A12643Almc_Lote ;
   private boolean[] T012G2_n12643Almc_Lote ;
   private short[] T012G2_A12849Almc_Nct ;
   private boolean[] T012G2_n12849Almc_Nct ;
   private String[] T012G2_A396EmprCod ;
   private String[] T012G100_A396EmprCod ;
   private String[] T012G100_A719PrdNum ;
   private boolean[] T012G100_n719PrdNum ;
   private int[] T012G100_A8661Almc_Ln ;
   private String[] T012G101_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talmcon__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talmcon__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talmcon__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talmcon__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talmcon__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T012G2", "SELECT PrdNum, Almc_Ln, ALmc_Fec, Almc_Con, Almc_Rem, Almc_alb, Almc_UniE, Almc_Pre, Almc_Prov, Almc_Ped, Almc_Cum, Almc_Lote, Almc_Nct, EmprCod FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ? AND Almc_Ln = ?  FOR UPDATE OF ALmc_Fec, Almc_Con, Almc_Rem, Almc_alb, Almc_UniE, Almc_Pre, Almc_Prov, Almc_Ped, Almc_Cum, Almc_Lote, Almc_Nct NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G3", "SELECT PrdNum, Almc_Ln, ALmc_Fec, Almc_Con, Almc_Rem, Almc_alb, Almc_UniE, Almc_Pre, Almc_Prov, Almc_Ped, Almc_Cum, Almc_Lote, Almc_Nct, EmprCod FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ? AND Almc_Ln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G4", "SELECT PrdNum, PrdNom, PrdRec, PrdExiAlmc, PrdExiCC, Almc_Ult, PrdNumUco, EmprCod, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdNom, PrdRec, PrdExiAlmc, PrdExiCC, Almc_Ult, PrdNumUco, PrvNum, ValCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G5", "SELECT PrdNum, PrdNom, PrdRec, PrdExiAlmc, PrdExiCC, Almc_Ult, PrdNumUco, EmprCod, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G7", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G8", "SELECT EmprCod FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G9", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdNum, TM1.PrdNom, T3.PrvNom, TM1.PrdRec, T2.EmprNom, TM1.PrdExiAlmc, TM1.PrdExiCC, TM1.Almc_Ult, TM1.PrdNumUco, TM1.EmprCod, TM1.PrvNum, TM1.ValCod FROM ((TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrvNum = TM1.PrvNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G11", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G12", "SELECT EmprCod FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ?) ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ?) ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T012G16", "INSERT INTO TXPPRODUC(PrdNum, PrdNom, PrdRec, PrdExiAlmc, PrdExiCC, Almc_Ult, PrdNumUco, EmprCod, PrvNum, ValCod, PrdExiAlm, PrdPreAct, PrdDetPar, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdPreAnt, PrdFecPre, MovEspULin, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T012G17", "UPDATE TXPPRODUC SET PrdNom=?, PrdRec=?, PrdExiAlmc=?, PrdExiCC=?, Almc_Ult=?, PrdNumUco=?, PrvNum=?, ValCod=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T012G18", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T012G19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G20", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G21", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G22", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G23", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G24", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G25", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G26", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G27", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G28", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G29", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G30", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G31", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G32", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G33", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G34", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G35", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G36", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G37", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G38", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G39", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G40", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G41", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G42", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G43", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G44", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G45", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G46", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G47", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G48", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G49", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G50", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G51", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G52", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G53", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G54", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G55", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G56", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G57", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G58", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G59", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G60", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G61", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G62", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G63", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G64", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G65", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G66", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G67", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G68", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G69", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G70", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G71", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G72", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G73", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G74", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G75", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G76", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G77", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G78", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G79", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G80", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G81", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G82", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G83", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G84", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G85", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G86", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G87", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G88", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G89", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G90", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G91", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012G92", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T012G93", "UPDATE TXPPRODUC SET PrdExiAlmc=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T012G94", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G95", "SELECT PrdNum, Almc_Ln, ALmc_Fec, Almc_Con, Almc_Rem, Almc_alb, Almc_UniE, Almc_Pre, Almc_Prov, Almc_Ped, Almc_Cum, Almc_Lote, Almc_Nct, EmprCod FROM TXPALMCON WHERE EmprCod = ? and PrdNum = ? and Almc_Ln = ? and Almc_Con = 0 ORDER BY EmprCod, PrdNum, Almc_Ln ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G96", "SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ? AND Almc_Ln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T012G97", "INSERT INTO TXPALMCON(PrdNum, Almc_Ln, ALmc_Fec, Almc_Con, Almc_Rem, Almc_alb, Almc_UniE, Almc_Pre, Almc_Prov, Almc_Ped, Almc_Cum, Almc_Lote, Almc_Nct, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPALMCON")
         ,new UpdateCursor("T012G98", "UPDATE TXPALMCON SET ALmc_Fec=?, Almc_Con=?, Almc_Rem=?, Almc_alb=?, Almc_UniE=?, Almc_Pre=?, Almc_Prov=?, Almc_Ped=?, Almc_Cum=?, Almc_Lote=?, Almc_Nct=?  WHERE EmprCod = ? AND PrdNum = ? AND Almc_Ln = ?", GX_NOMASK, "TXPALMCON")
         ,new UpdateCursor("T012G99", "DELETE FROM TXPALMCON  WHERE EmprCod = ? AND PrdNum = ? AND Almc_Ln = ?", GX_NOMASK, "TXPALMCON")
         ,new ForEachCursor("T012G100", "SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? and PrdNum = ? and Almc_Con = 0 ORDER BY EmprCod, PrdNum, Almc_Ln ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012G101", "SELECT EmprCod FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,4);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 48 :
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
            case 49 :
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
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 70 :
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
            case 71 :
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
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 74 :
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
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 76 :
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
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 3);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 2 :
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
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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
               stmt.setString(2, (String)parms[2], 26);
               stmt.setString(3, (String)parms[3], 1);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 4);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(8, (String)parms[9], 3);
               stmt.setInt(9, ((Number) parms[10]).intValue());
               stmt.setByte(10, ((Number) parms[11]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setString(9, (String)parms[9], 3);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[11], 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 95 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 4);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 10);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 26);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[24]).shortValue());
               }
               stmt.setString(14, (String)parms[25], 3);
               return;
            case 96 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 26);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               stmt.setString(12, (String)parms[22], 3);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 6);
               }
               stmt.setInt(14, ((Number) parms[25]).intValue());
               return;
            case 97 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               return;
            case 99 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

