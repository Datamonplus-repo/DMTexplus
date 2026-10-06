package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetasdetinte_agrupacion_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
      {
         AV36ControlAlbaran = (short)(GXutil.lval( httpContext.GetPar( "ControlAlbaran"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36ControlAlbaran", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36ControlAlbaran), 4, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_1RJ12( AV36ControlAlbaran, A129BarCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action26") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         AV14FlagMAgr = (short)(GXutil.lval( httpContext.GetPar( "FlagMAgr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
         AV15FlagEli = (short)(GXutil.lval( httpContext.GetPar( "FlagEli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FlagEli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15FlagEli), 4, 0));
         AV17FasMin = (short)(GXutil.lval( httpContext.GetPar( "FasMin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17FasMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FasMin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASMIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17FasMin), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_26_1RJ12( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV14FlagMAgr, AV15FlagEli, AV17FasMin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action56") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         AV14FlagMAgr = (short)(GXutil.lval( httpContext.GetPar( "FlagMAgr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
         AV15FlagEli = (short)(GXutil.lval( httpContext.GetPar( "FlagEli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FlagEli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15FlagEli), 4, 0));
         AV17FasMin = (short)(GXutil.lval( httpContext.GetPar( "FasMin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17FasMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FasMin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASMIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17FasMin), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_56_1RJ13( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV14FlagMAgr, AV15FlagEli, AV17FasMin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action57") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         AV32CliCodAgr = (int)(GXutil.lval( httpContext.GetPar( "CliCodAgr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32CliCodAgr), 6, 0));
         AV33BarAgrSer = httpContext.GetPar( "BarAgrSer") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33BarAgrSer", AV33BarAgrSer);
         AV34ColNomAgr = httpContext.GetPar( "ColNomAgr") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34ColNomAgr", AV34ColNomAgr);
         AV35ColNumAgr = (int)(GXutil.lval( httpContext.GetPar( "ColNumAgr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35ColNumAgr), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_57_1RJ13( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, AV32CliCodAgr, AV33BarAgrSer, AV34ColNomAgr, AV35ColNumAgr) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action58") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         A1508CliCodAgr = (int)(GXutil.lval( httpContext.GetPar( "CliCodAgr"))) ;
         A1245BarAgrSer = httpContext.GetPar( "BarAgrSer") ;
         A1510ColNomAgr = httpContext.GetPar( "ColNomAgr") ;
         A1512ColNumAgr = (int)(GXutil.lval( httpContext.GetPar( "ColNumAgr"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_58_1RJ13( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, A1508CliCodAgr, A1245BarAgrSer, A1510ColNomAgr, A1512ColNumAgr) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action59") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         A180BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         A236BarVolMaq = (int)(GXutil.lval( httpContext.GetPar( "BarVolMaq"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
         A671PieAgr = (short)(GXutil.lval( httpContext.GetPar( "PieAgr"))) ;
         A590KgmAgr = CommonUtil.decimalVal( httpContext.GetPar( "KgmAgr"), ".") ;
         A869MtrAgr = CommonUtil.decimalVal( httpContext.GetPar( "MtrAgr"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_59_1RJ13( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, A180BarMaqCod, A236BarVolMaq, A671PieAgr, A590KgmAgr, A869MtrAgr) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action60") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_60_1RJ13( Gx_mode, A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action61") == 0 )
      {
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_61_1RJ13( A119BarAgrCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action68") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV8BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
         AV9BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
         AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         AV17FasMin = (short)(GXutil.lval( httpContext.GetPar( "FasMin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17FasMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FasMin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASMIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17FasMin), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_68_1RJ13( Gx_mode, A396EmprCod, AV8BarCod, AV9BarCodReo, AV10BarCodPar, A119BarAgrCod, AV17FasMin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"PEDIDOCLIE") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4812BarEncCli = httpContext.GetPar( "BarEncCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A143BarDisNum = httpContext.GetPar( "BarDisNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asapedidoclie1RJ12( A396EmprCod, A4812BarEncCli, A143BarDisNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_70") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_70( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_71") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_71( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_72") == 0 )
      {
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A180BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_72( A129BarCod, A132BarCodReo, A130BarCodPar, A180BarMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_73") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_73( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_75") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_75( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_76") == 0 )
      {
         A401EmprCodVi = httpContext.GetPar( "EmprCodVi") ;
         httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_76( A401EmprCodVi, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_77") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_77( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_baragr") == 0 )
      {
         gxnrgridlevel_baragr_newrow_invoke( ) ;
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
            AV8BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
            AV9BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
            AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Recetas de Tinte (Agrupacion)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_baragr_newrow_invoke( )
   {
      nRC_GXsfl_47 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_47"))) ;
      nGXsfl_47_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_47_idx"))) ;
      sGXsfl_47_idx = httpContext.GetPar( "sGXsfl_47_idx") ;
      AV17FasMin = (short)(GXutil.lval( httpContext.GetPar( "FasMin"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      n396EmprCod = false ;
      AV8BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV9BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_baragr_newrow( ) ;
      /* End function gxnrGridlevel_baragr_newrow_invoke */
   }

   public recetasdetinte_agrupacion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetasdetinte_agrupacion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdetinte_agrupacion_impl.class ));
   }

   public recetasdetinte_agrupacion_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNHdr_Internalname, httpContext.getMessage( "N° Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNHdr_Internalname, GXutil.rtrim( A13696BarNHdr), GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNHdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarNHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarMaqCod_Internalname, httpContext.getMessage( "Codigo Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMaqCod_Internalname, GXutil.rtrim( A180BarMaqCod), GXutil.rtrim( localUtil.format( A180BarMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarVolMaq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarVolMaq_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarVolMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A236BarVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarVolMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A236BarVolMaq), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A236BarVolMaq), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarVolMaq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarVolMaq_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSer_Internalname, httpContext.getMessage( "Serie", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_baragr_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_baragr( ) ;
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeTinte_Agrupacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeTinte_Agrupacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarlinea_Internalname, "", httpContext.getMessage( "Eliminar Linea", ""), bttBtneliminarlinea_Jsonclick, 7, httpContext.getMessage( "Eliminar Linea", ""), "", StyleString, ClassString, bttBtneliminarlinea_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111rj12_client"+"'", TempTags, "", 2, "HLP_RecetasdeTinte_Agrupacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminaragrupacion_Internalname, "", httpContext.getMessage( "Eliminar Agrupacion", ""), bttBtneliminaragrupacion_Jsonclick, 7, httpContext.getMessage( "Eliminar Agrupacion", ""), "", StyleString, ClassString, bttBtneliminaragrupacion_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121rj12_client"+"'", TempTags, "", 2, "HLP_RecetasdeTinte_Agrupacion.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, edtBarCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, edtBarCodReo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, edtBarCodPar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedidoClie_Internalname, GXutil.rtrim( A13878PedidoClie), GXutil.rtrim( localUtil.format( A13878PedidoClie, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedidoClie_Jsonclick, 0, "Attribute", "", "", "", "", edtPedidoClie_Visible, edtPedidoClie_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDisNum_Internalname, GXutil.rtrim( A143BarDisNum), GXutil.rtrim( localUtil.format( A143BarDisNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDisNum_Jsonclick, 0, "Attribute", "", "", "", "", edtBarDisNum_Visible, edtBarDisNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCodVi_Internalname, GXutil.rtrim( A401EmprCodVi), GXutil.rtrim( localUtil.format( A401EmprCodVi, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCodVi_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCodVi_Visible, edtEmprCodVi_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrEst_Internalname, GXutil.rtrim( A120BarAgrEst), GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrEst_Jsonclick, 0, "Attribute", "", "", "", "", edtBarAgrEst_Visible, edtBarAgrEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindVolMed_Internalname, GXutil.ltrim( localUtil.ntoc( A479FindVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFindVolMed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A479FindVolMed), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A479FindVolMed), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindVolMed_Jsonclick, 0, "Attribute", "", "", "", "", edtFindVolMed_Visible, edtFindVolMed_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindVolMin_Internalname, GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFindVolMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A480FindVolMin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A480FindVolMin), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindVolMin_Jsonclick, 0, "Attribute", "", "", "", "", edtFindVolMin_Visible, edtFindVolMin_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindVolMax_Internalname, GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFindVolMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A478FindVolMax), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A478FindVolMax), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindVolMax_Jsonclick, 0, "Attribute", "", "", "", "", edtFindVolMax_Visible, edtFindVolMax_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "Attribute", "", "", "", "", edtBarSit_Visible, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrCant_Internalname, GXutil.ltrim( localUtil.ntoc( A13846BarAgrCant, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAgrCant_Enabled!=0) ? localUtil.format( A13846BarAgrCant, "ZZZ,ZZ9.99") : localUtil.format( A13846BarAgrCant, "ZZZ,ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrCant_Jsonclick, 0, "Attribute", "", "", "", "", edtBarAgrCant_Visible, edtBarAgrCant_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Cantidad", "right", false, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "Attribute", "", "", "", "", edtBarColNom_Visible, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "Attribute", "", "", "", "", edtBarColNum_Visible, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion.htm");
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminaragrupacion_Internalname, tblTabledvelop_confirmpanel_eliminaragrupacion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
      /* User Defined Control */
      ucDvelop_confirmpanel_eliminaragrupacion.setProperty("Title", Dvelop_confirmpanel_eliminaragrupacion_Title);
      ucDvelop_confirmpanel_eliminaragrupacion.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext);
      ucDvelop_confirmpanel_eliminaragrupacion.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption);
      ucDvelop_confirmpanel_eliminaragrupacion.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption);
      ucDvelop_confirmpanel_eliminaragrupacion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption);
      ucDvelop_confirmpanel_eliminaragrupacion.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition);
      ucDvelop_confirmpanel_eliminaragrupacion.setProperty("ConfirmType", Dvelop_confirmpanel_eliminaragrupacion_Confirmtype);
      ucDvelop_confirmpanel_eliminaragrupacion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminaragrupacion_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACIONContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARAGRUPACIONContainer"+"Body"+"\" style=\"display:none;\">") ;
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

   public void gxdraw_gridlevel_baragr( )
   {
      /*  Grid Control  */
      startgridcontrol47( ) ;
      nGXsfl_47_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount13 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_13 = (short)(1) ;
            scanStart1RJ13( ) ;
            while ( RcdFound13 != 0 )
            {
               init_level_properties13( ) ;
               getByPrimaryKey1RJ13( ) ;
               addRow1RJ13( ) ;
               scanNext1RJ13( ) ;
            }
            scanEnd1RJ13( ) ;
            nBlankRcdCount13 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13846BarAgrCant = A13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         standaloneNotModal1RJ13( ) ;
         standaloneModal1RJ13( ) ;
         sMode13 = Gx_mode ;
         while ( nGXsfl_47_idx < nRC_GXsfl_47 )
         {
            bGXsfl_47_Refreshing = true ;
            readRow1RJ13( ) ;
            edtBarAgrCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRCOD_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtBarAgrReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRREO_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtBarAgrPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRPAR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtCliCodAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICODAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtBarAgrSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRSER_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrSer_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtBarAgrDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRDSC_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtColNomAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNOMAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColNomAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtColNumAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNUMAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColNumAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNumAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtKgmAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "KGMAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtMtrAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTRAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtPieAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PIEAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtBarAgrKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRKGM_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrKgm_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtBarAgrMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRMTR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrMtr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtBarAgrPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRPIE_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPie_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtBarAgrNDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRNDES_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNDes_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtBarPNDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPNDES_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPNDes_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtFindDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FINDDES_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFindDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindDes_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtFindBarAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FINDBARAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFindBarAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindBarAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtDisCodAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCODAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCodAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtColNoCAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNOCAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColNoCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNoCAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtColNuCAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNUCAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColNuCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNuCAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtBarAgrDNu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRDNU_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDNu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDNu_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtBarAGrHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRHDR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAGrHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAGrHdr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtBarAgrNhdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRNHDR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNhdr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            if ( ( nRcdExists_13 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1RJ13( ) ;
            }
            sendRow1RJ13( ) ;
            bGXsfl_47_Refreshing = false ;
         }
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13846BarAgrCant = B13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount13 = (short)(5) ;
         nRcdExists_13 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1RJ13( ) ;
            while ( RcdFound13 != 0 )
            {
               sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_4713( ) ;
               init_level_properties13( ) ;
               standaloneNotModal1RJ13( ) ;
               getByPrimaryKey1RJ13( ) ;
               standaloneModal1RJ13( ) ;
               addRow1RJ13( ) ;
               scanNext1RJ13( ) ;
            }
            scanEnd1RJ13( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode13 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_4713( ) ;
         initAll1RJ13( ) ;
         init_level_properties13( ) ;
         B13846BarAgrCant = A13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         nRcdExists_13 = (short)(0) ;
         nIsMod_13 = (short)(0) ;
         nRcdDeleted_13 = (short)(0) ;
         nBlankRcdCount13 = (short)(nBlankRcdUsr13+nBlankRcdCount13) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount13 > 0 )
         {
            standaloneNotModal1RJ13( ) ;
            standaloneModal1RJ13( ) ;
            addRow1RJ13( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtBarAgrCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount13 = (short)(nBlankRcdCount13-1) ;
         }
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13846BarAgrCant = B13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_baragrContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_baragr", Gridlevel_baragrContainer, subGridlevel_baragr_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_baragrContainerData", Gridlevel_baragrContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_baragrContainerData"+"V", Gridlevel_baragrContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_baragrContainerData"+"V"+"\" value='"+Gridlevel_baragrContainer.GridValuesHidden()+"'/>") ;
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
      e131RJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            Z143BarDisNum = httpContext.cgiGet( "Z143BarDisNum") ;
            Z120BarAgrEst = httpContext.cgiGet( "Z120BarAgrEst") ;
            Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            Z236BarVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( "Z236BarVolMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z213BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z212BarSer = httpContext.cgiGet( "Z212BarSer") ;
            Z135BarColNom = httpContext.cgiGet( "Z135BarColNom") ;
            Z136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z136BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4812BarEncCli = httpContext.cgiGet( "Z4812BarEncCli") ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            A4812BarEncCli = httpContext.cgiGet( "Z4812BarEncCli") ;
            O13846BarAgrCant = localUtil.ctond( httpContext.cgiGet( "O13846BarAgrCant")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_47 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_47"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "N129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "N132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N130BarCodPar = httpContext.cgiGet( "N130BarCodPar") ;
            A4812BarEncCli = httpContext.cgiGet( "BARENCCLI") ;
            A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV17FasMin = (short)(localUtil.ctol( httpContext.cgiGet( "vFASMIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36ControlAlbaran = (short)(localUtil.ctol( httpContext.cgiGet( "vCONTROLALBARAN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV39Albaranes = httpContext.cgiGet( "vALBARANES") ;
            AV14FlagMAgr = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGMAGR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15FlagEli = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGELI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            AV35ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( "vCOLNUMAGR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34ColNomAgr = httpContext.cgiGet( "vCOLNOMAGR") ;
            AV33BarAgrSer = httpContext.cgiGet( "vBARAGRSER") ;
            AV32CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICODAGR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV43Flagrec = localUtil.ctond( httpContext.cgiGet( "vFLAGREC")) ;
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
            Dvelop_confirmpanel_eliminaragrupacion_Objectcall = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Objectcall") ;
            Dvelop_confirmpanel_eliminaragrupacion_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Enabled")) ;
            Dvelop_confirmpanel_eliminaragrupacion_Width = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Width") ;
            Dvelop_confirmpanel_eliminaragrupacion_Height = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Height") ;
            Dvelop_confirmpanel_eliminaragrupacion_Class = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Class") ;
            Dvelop_confirmpanel_eliminaragrupacion_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Title") ;
            Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Confirmationtext") ;
            Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Yesbuttoncaption") ;
            Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Nobuttoncaption") ;
            Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Cancelbuttoncaption") ;
            Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Yesbuttonposition") ;
            Dvelop_confirmpanel_eliminaragrupacion_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Confirmtype") ;
            Dvelop_confirmpanel_eliminaragrupacion_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Comment") ;
            Dvelop_confirmpanel_eliminaragrupacion_Bodytype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Bodytype") ;
            Dvelop_confirmpanel_eliminaragrupacion_Bodycontentinternalname = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Bodycontentinternalname") ;
            Dvelop_confirmpanel_eliminaragrupacion_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Result") ;
            Dvelop_confirmpanel_eliminaragrupacion_Texttype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Texttype") ;
            Dvelop_confirmpanel_eliminaragrupacion_Visible = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Visible")) ;
            /* Read variables values. */
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A180BarMaqCod = httpContext.cgiGet( edtBarMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
            A236BarVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( edtBarVolMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            n396EmprCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129BarCod = 0 ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCodReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A132BarCodReo = (byte)(0) ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
            A401EmprCodVi = GXutil.upper( httpContext.cgiGet( edtEmprCodVi_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
            A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
            A479FindVolMed = (int)(localUtil.ctol( httpContext.cgiGet( edtFindVolMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
            A480FindVolMin = (int)(localUtil.ctol( httpContext.cgiGet( edtFindVolMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
            A478FindVolMax = (int)(localUtil.ctol( httpContext.cgiGet( edtFindVolMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARSIT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarSit_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A213BarSit = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
            }
            else
            {
               A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
            }
            A13846BarAgrCant = localUtil.ctond( httpContext.cgiGet( edtBarAgrCant_Internalname)) ;
            n13846BarAgrCant = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOLNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A136BarColNum = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            }
            else
            {
               A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"RecetasdeTinte_Agrupacion");
            forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            forbiddenHiddens.add("BarSer", GXutil.rtrim( localUtil.format( A212BarSer, "")));
            forbiddenHiddens.add("BarEncCli", GXutil.rtrim( localUtil.format( A4812BarEncCli, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("recetasdetinte_agrupacion:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               n396EmprCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               n130BarCodPar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
                  sMode12 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode12 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound12 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1RJ0( ) ;
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
                     if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e141RJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION.CLOSE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e151RJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e131RJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e161RJ2 ();
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
         e161RJ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1RJ12( ) ;
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
         disableAttributes1RJ12( ) ;
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

   public void confirm_1RJ0( )
   {
      beforeValidate1RJ12( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1RJ12( ) ;
         }
         else
         {
            checkExtendedTable1RJ12( ) ;
            closeExtendedTableCursors1RJ12( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_1RJ13( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode12 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1RJ13( )
   {
      s13846BarAgrCant = O13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      sV14FlagMAgr = OV14FlagMAgr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
      nGXsfl_47_idx = 0 ;
      while ( nGXsfl_47_idx < nRC_GXsfl_47 )
      {
         readRow1RJ13( ) ;
         if ( ( nRcdExists_13 != 0 ) || ( nIsMod_13 != 0 ) )
         {
            getKey1RJ13( ) ;
            if ( ( nRcdExists_13 == 0 ) && ( nRcdDeleted_13 == 0 ) )
            {
               if ( RcdFound13 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1RJ13( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1RJ13( ) ;
                     closeExtendedTableCursors1RJ13( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13846BarAgrCant = A13846BarAgrCant ;
                     n13846BarAgrCant = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
                     OV14FlagMAgr = AV14FlagMAgr ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "BARAGRCOD_" + sGXsfl_47_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarAgrCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound13 != 0 )
               {
                  if ( nRcdDeleted_13 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1RJ13( ) ;
                     load1RJ13( ) ;
                     beforeValidate1RJ13( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1RJ13( ) ;
                        O13846BarAgrCant = A13846BarAgrCant ;
                        n13846BarAgrCant = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
                        OV14FlagMAgr = AV14FlagMAgr ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_13 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1RJ13( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1RJ13( ) ;
                           closeExtendedTableCursors1RJ13( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13846BarAgrCant = A13846BarAgrCant ;
                           n13846BarAgrCant = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
                           OV14FlagMAgr = AV14FlagMAgr ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_13 == 0 )
                  {
                     GXCCtl = "BARAGRCOD_" + sGXsfl_47_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarAgrCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtBarAgrCod_Internalname, GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrReo_Internalname, GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrPar_Internalname, GXutil.rtrim( A122BarAgrPar)) ;
         httpContext.changePostValue( edtCliCodAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrSer_Internalname, GXutil.rtrim( A1245BarAgrSer)) ;
         httpContext.changePostValue( edtBarAgrDsc_Internalname, GXutil.rtrim( A1507BarAgrDsc)) ;
         httpContext.changePostValue( edtColNomAgr_Internalname, GXutil.rtrim( A1510ColNomAgr)) ;
         httpContext.changePostValue( edtColNumAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtKgmAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtrAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPieAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrPie_Internalname, GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFindDes_Internalname, GXutil.rtrim( A1653FindDes)) ;
         httpContext.changePostValue( edtFindBarAgr_Internalname, GXutil.rtrim( A474FindBarAgr)) ;
         httpContext.changePostValue( edtDisCodAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColNoCAgr_Internalname, GXutil.rtrim( A1509ColNoCAgr)) ;
         httpContext.changePostValue( edtColNuCAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrDNu_Internalname, GXutil.rtrim( A1649BarAgrDNu)) ;
         httpContext.changePostValue( edtBarAGrHdr_Internalname, GXutil.rtrim( A13695BarAGrHdr)) ;
         httpContext.changePostValue( edtBarAgrNhdr_Internalname, GXutil.rtrim( A13792BarAgrNhdr)) ;
         httpContext.changePostValue( "ZT_"+"Z119BarAgrCod_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z124BarAgrReo_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z122BarAgrPar_"+sGXsfl_47_idx, GXutil.rtrim( Z122BarAgrPar)) ;
         httpContext.changePostValue( "ZT_"+"Z590KgmAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z671PieAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z869MtrAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1508CliCodAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1245BarAgrSer_"+sGXsfl_47_idx, GXutil.rtrim( Z1245BarAgrSer)) ;
         httpContext.changePostValue( "ZT_"+"Z1507BarAgrDsc_"+sGXsfl_47_idx, GXutil.rtrim( Z1507BarAgrDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z1510ColNomAgr_"+sGXsfl_47_idx, GXutil.rtrim( Z1510ColNomAgr)) ;
         httpContext.changePostValue( "ZT_"+"Z1512ColNumAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1513DisCodAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1509ColNoCAgr_"+sGXsfl_47_idx, GXutil.rtrim( Z1509ColNoCAgr)) ;
         httpContext.changePostValue( "ZT_"+"Z1511ColNuCAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1649BarAgrDNu_"+sGXsfl_47_idx, GXutil.rtrim( Z1649BarAgrDNu)) ;
         httpContext.changePostValue( "T119BarAgrCod_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( O119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_13_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_13_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_13_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_13 != 0 )
         {
            httpContext.changePostValue( "BARAGRCOD_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRREO_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRPAR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICODAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCodAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRSER_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRDSC_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNOMAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNomAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNUMAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNumAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "KGMAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKgmAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTRAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PIEAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPieAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRKGM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRMTR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRPIE_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRNDES_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPNDES_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPNDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FINDDES_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FINDBARAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindBarAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCODAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisCodAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNOCAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNoCAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNUCAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNuCAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRDNU_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDNu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRHDR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAGrHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRNHDR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNhdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13846BarAgrCant = s13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      OV14FlagMAgr = sV14FlagMAgr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1RJ0( )
   {
   }

   public void e131RJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV41Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetasdetinte_agrupacion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV41Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Station", AV41Station);
      GXv_char2[0] = AV22BuscarEmprCod ;
      GXv_char3[0] = AV23EmprNom ;
      GXv_char4[0] = AV24UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetasdetinte_agrupacion_impl.this.AV22BuscarEmprCod = GXv_char2[0] ;
      recetasdetinte_agrupacion_impl.this.AV23EmprNom = GXv_char3[0] ;
      recetasdetinte_agrupacion_impl.this.AV24UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22BuscarEmprCod", AV22BuscarEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprNom", AV23EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV24UsurCod", AV24UsurCod);
      GXt_int5 = (byte)(AV16Vincolor) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV22BuscarEmprCod, httpContext.getMessage( "VINCOL", ""), GXv_int6) ;
      recetasdetinte_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV16Vincolor = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Vincolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Vincolor), 4, 0));
      AV14FlagMAgr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
      AV15FlagEli = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FlagEli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15FlagEli), 4, 0));
      GXt_int5 = (byte)(AV17FasMin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV22BuscarEmprCod, httpContext.getMessage( "FASMIN", ""), GXv_int6) ;
      recetasdetinte_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV17FasMin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17FasMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FasMin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASMIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17FasMin), "ZZZ9")));
      GXt_int5 = (byte)(AV18Wckgcol) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV22BuscarEmprCod, httpContext.getMessage( "WCHGCO", ""), GXv_int6) ;
      recetasdetinte_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV18Wckgcol = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Wckgcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Wckgcol), 4, 0));
      GXt_int5 = (byte)(AV19AgrCol) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV22BuscarEmprCod, httpContext.getMessage( "AGRCOL", ""), GXv_int6) ;
      recetasdetinte_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV19AgrCol = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19AgrCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AgrCol), 4, 0));
      GXt_int5 = (byte)(AV20Lindalana) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV22BuscarEmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int6) ;
      recetasdetinte_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV20Lindalana = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lindalana", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Lindalana), 4, 0));
      GXt_int5 = (byte)(AV21Eliot) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV22BuscarEmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int6) ;
      recetasdetinte_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV21Eliot = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Eliot", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Eliot), 4, 0));
      GXt_int5 = (byte)(AV17FasMin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV22BuscarEmprCod, httpContext.getMessage( "FASMIN", ""), GXv_int6) ;
      recetasdetinte_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV17FasMin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17FasMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FasMin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASMIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17FasMin), "ZZZ9")));
      GXt_int5 = (byte)(AV18Wckgcol) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV22BuscarEmprCod, httpContext.getMessage( "WCHGCO", ""), GXv_int6) ;
      recetasdetinte_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV18Wckgcol = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Wckgcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Wckgcol), 4, 0));
      GXt_int5 = (byte)(AV19AgrCol) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV22BuscarEmprCod, httpContext.getMessage( "AGRCOL", ""), GXv_int6) ;
      recetasdetinte_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV19AgrCol = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19AgrCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AgrCol), 4, 0));
      GXt_int5 = (byte)(AV20Lindalana) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV22BuscarEmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int6) ;
      recetasdetinte_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV20Lindalana = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lindalana", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Lindalana), 4, 0));
      GXt_int5 = (byte)(AV36ControlAlbaran) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBAGR", ""), GXv_int6) ;
      recetasdetinte_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV36ControlAlbaran = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36ControlAlbaran", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36ControlAlbaran), 4, 0));
      GXt_int5 = (byte)(AV37carvema) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      recetasdetinte_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV37carvema = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37carvema", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37carvema), 4, 0));
      GXt_int5 = (byte)(AV38Tintutex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      recetasdetinte_agrupacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV38Tintutex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Tintutex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Tintutex), 4, 0));
      GXt_char1 = AV25msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG245_", ""), (byte)(99), GXv_char4) ;
      recetasdetinte_agrupacion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25msg0", AV25msg0);
      GXt_char1 = AV26msg1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG232_", ""), (byte)(99), GXv_char4) ;
      recetasdetinte_agrupacion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV26msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26msg1", AV26msg1);
      GXt_char1 = AV27msg2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG229_", ""), (byte)(99), GXv_char4) ;
      recetasdetinte_agrupacion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27msg2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27msg2", AV27msg2);
      GXt_char1 = AV28msg3 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG088_", ""), (byte)(99), GXv_char4) ;
      recetasdetinte_agrupacion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28msg3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28msg3", AV28msg3);
      GXt_char1 = AV29msg4 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG245_", ""), (byte)(99), GXv_char4) ;
      recetasdetinte_agrupacion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29msg4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29msg4", AV29msg4);
      GXt_char1 = AV30msg5 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGLR304_", ""), (byte)(99), GXv_char4) ;
      recetasdetinte_agrupacion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV30msg5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30msg5", AV30msg5);
      GXt_char1 = AV41Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recetasdetinte_agrupacion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV41Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Station", AV41Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV23EmprNom ;
      GXv_char2[0] = AV24UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char4, GXv_char3, GXv_char2) ;
      recetasdetinte_agrupacion_impl.this.AV7EmprCod = GXv_char4[0] ;
      recetasdetinte_agrupacion_impl.this.AV23EmprNom = GXv_char3[0] ;
      recetasdetinte_agrupacion_impl.this.AV24UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprNom", AV23EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV24UsurCod", AV24UsurCod);
      GXv_SdtWWPContext7[0] = AV11WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV11WWPContext = GXv_SdtWWPContext7[0] ;
      AV12TrnContext.fromxml(AV13WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtBarCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), true);
      edtBarCodReo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), true);
      edtBarCodPar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), true);
      edtPedidoClie_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedidoClie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtBarDisNum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Visible), 5, 0), true);
      edtEmprCodVi_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCodVi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCodVi_Visible), 5, 0), true);
      edtBarAgrEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Visible), 5, 0), true);
      edtFindVolMed_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMed_Visible), 5, 0), true);
      edtFindVolMin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMin_Visible), 5, 0), true);
      edtFindVolMax_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMax_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMax_Visible), 5, 0), true);
      edtBarSit_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), true);
      edtBarAgrCant_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCant_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCant_Visible), 5, 0), true);
      edtBarColNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), true);
      edtBarColNum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), true);
   }

   public void e161RJ2( )
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
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e141RJ2( )
   {
      /* Dvelop_confirmpanel_eliminarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARLINEA' */
         S112 ();
         if ( returnInSub )
         {
            pr_default.close(10);
            pr_default.close(9);
            pr_default.close(8);
            pr_default.close(7);
            pr_default.close(6);
            pr_default.close(4);
            pr_default.close(3);
            pr_default.close(2);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
   }

   public void e151RJ2( )
   {
      /* Dvelop_confirmpanel_eliminaragrupacion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminaragrupacion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARAGRUPACION' */
         S122 ();
         if ( returnInSub )
         {
            pr_default.close(10);
            pr_default.close(9);
            pr_default.close(8);
            pr_default.close(7);
            pr_default.close(6);
            pr_default.close(4);
            pr_default.close(3);
            pr_default.close(2);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'DO ACTION ELIMINARLINEA' Routine */
      returnInSub = false ;
      if ( AV17FasMin == 1 )
      {
         GXv_char4[0] = AV7EmprCod ;
         GXv_int8[0] = AV8BarCod ;
         GXv_int6[0] = AV9BarCodReo ;
         GXv_char3[0] = AV10BarCodPar ;
         new app.pelimin(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3) ;
         recetasdetinte_agrupacion_impl.this.AV7EmprCod = GXv_char4[0] ;
         recetasdetinte_agrupacion_impl.this.AV8BarCod = GXv_int8[0] ;
         recetasdetinte_agrupacion_impl.this.AV9BarCodReo = GXv_int6[0] ;
         recetasdetinte_agrupacion_impl.this.AV10BarCodPar = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
      }
      GXv_char4[0] = AV7EmprCod ;
      GXv_int8[0] = AV8BarCod ;
      GXv_int6[0] = AV9BarCodReo ;
      GXv_char3[0] = AV10BarCodPar ;
      GXv_int9[0] = A119BarAgrCod ;
      GXv_int10[0] = A124BarAgrReo ;
      GXv_char2[0] = A122BarAgrPar ;
      GXv_char11[0] = "" ;
      GXv_char12[0] = "" ;
      new app.pelibar(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3, GXv_int9, GXv_int10, GXv_char2, GXv_char11, GXv_char12) ;
      recetasdetinte_agrupacion_impl.this.AV7EmprCod = GXv_char4[0] ;
      recetasdetinte_agrupacion_impl.this.AV8BarCod = GXv_int8[0] ;
      recetasdetinte_agrupacion_impl.this.AV9BarCodReo = GXv_int6[0] ;
      recetasdetinte_agrupacion_impl.this.AV10BarCodPar = GXv_char3[0] ;
      recetasdetinte_agrupacion_impl.this.A119BarAgrCod = GXv_int9[0] ;
      recetasdetinte_agrupacion_impl.this.A124BarAgrReo = GXv_int10[0] ;
      recetasdetinte_agrupacion_impl.this.A122BarAgrPar = GXv_char2[0] ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'DO ACTION ELIMINARAGRUPACION' Routine */
      returnInSub = false ;
      GXv_char12[0] = AV7EmprCod ;
      GXv_int9[0] = AV8BarCod ;
      GXv_int10[0] = AV9BarCodReo ;
      GXv_char11[0] = AV10BarCodPar ;
      new app.peliagr(remoteHandle, context).execute( GXv_char12, GXv_int9, GXv_int10, GXv_char11) ;
      recetasdetinte_agrupacion_impl.this.AV7EmprCod = GXv_char12[0] ;
      recetasdetinte_agrupacion_impl.this.AV8BarCod = GXv_int9[0] ;
      recetasdetinte_agrupacion_impl.this.AV9BarCodReo = GXv_int10[0] ;
      recetasdetinte_agrupacion_impl.this.AV10BarCodPar = GXv_char11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1RJ12( int GX_JID )
   {
      if ( ( GX_JID == 69 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z361DisCod = T01RJ9_A361DisCod[0] ;
            Z2759BarMaqGru = T01RJ9_A2759BarMaqGru[0] ;
            Z143BarDisNum = T01RJ9_A143BarDisNum[0] ;
            Z120BarAgrEst = T01RJ9_A120BarAgrEst[0] ;
            Z180BarMaqCod = T01RJ9_A180BarMaqCod[0] ;
            Z236BarVolMaq = T01RJ9_A236BarVolMaq[0] ;
            Z213BarSit = T01RJ9_A213BarSit[0] ;
            Z212BarSer = T01RJ9_A212BarSer[0] ;
            Z135BarColNom = T01RJ9_A135BarColNom[0] ;
            Z136BarColNum = T01RJ9_A136BarColNum[0] ;
            Z4812BarEncCli = T01RJ9_A4812BarEncCli[0] ;
         }
         else
         {
            Z361DisCod = A361DisCod ;
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z143BarDisNum = A143BarDisNum ;
            Z120BarAgrEst = A120BarAgrEst ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z236BarVolMaq = A236BarVolMaq ;
            Z213BarSit = A213BarSit ;
            Z212BarSer = A212BarSer ;
            Z135BarColNom = A135BarColNom ;
            Z136BarColNum = A136BarColNum ;
            Z4812BarEncCli = A4812BarEncCli ;
         }
      }
      if ( GX_JID == -69 )
      {
         Z361DisCod = A361DisCod ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z143BarDisNum = A143BarDisNum ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z236BarVolMaq = A236BarVolMaq ;
         Z213BarSit = A213BarSit ;
         Z252CliCod = A252CliCod ;
         Z212BarSer = A212BarSer ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z4812BarEncCli = A4812BarEncCli ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z13846BarAgrCant = A13846BarAgrCant ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtBarMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqCod_Enabled), 5, 0), true);
      edtBarVolMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarVolMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarVolMaq_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtBarMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqCod_Enabled), 5, 0), true);
      edtBarVolMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarVolMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarVolMaq_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8BarCod) )
      {
         A129BarCod = AV8BarCod ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV8BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9BarCodReo) )
      {
         A132BarCodReo = AV9BarCodReo ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (0==AV9BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         A130BarCodPar = AV10BarCodPar ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01RJ10 */
         pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         A407EmprNom = T01RJ10_A407EmprNom[0] ;
         n407EmprNom = T01RJ10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(7);
         A401EmprCodVi = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
         /* Using cursor T01RJ15 */
         pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(10) != 101) )
         {
            A13846BarAgrCant = T01RJ15_A13846BarAgrCant[0] ;
            n13846BarAgrCant = T01RJ15_n13846BarAgrCant[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         }
         else
         {
            A13846BarAgrCant = DecimalUtil.doubleToDec(0) ;
            n13846BarAgrCant = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         }
         O13846BarAgrCant = A13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         pr_default.close(10);
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
         if ( true /* Level */ && ( AV17FasMin == 1 ) )
         {
            AV8BarCod = A129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
         }
         if ( true /* Level */ && ( AV17FasMin == 1 ) )
         {
            AV10BarCodPar = A130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
         }
         if ( true /* Level */ && ( AV17FasMin == 1 ) )
         {
            AV9BarCodReo = A132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
         }
      }
   }

   public void load1RJ12( )
   {
      /* Using cursor T01RJ17 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A361DisCod = T01RJ17_A361DisCod[0] ;
         A2759BarMaqGru = T01RJ17_A2759BarMaqGru[0] ;
         A407EmprNom = T01RJ17_A407EmprNom[0] ;
         n407EmprNom = T01RJ17_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A143BarDisNum = T01RJ17_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A120BarAgrEst = T01RJ17_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A180BarMaqCod = T01RJ17_A180BarMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         A236BarVolMaq = T01RJ17_A236BarVolMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
         A213BarSit = T01RJ17_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A252CliCod = T01RJ17_A252CliCod[0] ;
         n252CliCod = T01RJ17_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A212BarSer = T01RJ17_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A135BarColNom = T01RJ17_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01RJ17_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A4812BarEncCli = T01RJ17_A4812BarEncCli[0] ;
         A365DisDes = T01RJ17_A365DisDes[0] ;
         A13846BarAgrCant = T01RJ17_A13846BarAgrCant[0] ;
         n13846BarAgrCant = T01RJ17_n13846BarAgrCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         zm1RJ12( -69) ;
      }
      pr_default.close(11);
      onLoadActions1RJ12( ) ;
   }

   public void onLoadActions1RJ12( )
   {
      O13846BarAgrCant = A13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      /* Using cursor T01RJ11 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      A252CliCod = T01RJ11_A252CliCod[0] ;
      n252CliCod = T01RJ11_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = T01RJ11_A365DisDes[0] ;
      pr_default.close(8);
      GXt_char1 = A13878PedidoClie ;
      GXv_char12[0] = A396EmprCod ;
      GXv_char11[0] = A4812BarEncCli ;
      GXv_char4[0] = A143BarDisNum ;
      GXv_char3[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_char4, GXv_char3) ;
      recetasdetinte_agrupacion_impl.this.A396EmprCod = GXv_char12[0] ;
      recetasdetinte_agrupacion_impl.this.A4812BarEncCli = GXv_char11[0] ;
      recetasdetinte_agrupacion_impl.this.A143BarDisNum = GXv_char4[0] ;
      recetasdetinte_agrupacion_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A13878PedidoClie = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      A401EmprCodVi = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
      if ( true /* Level */ && ( AV17FasMin == 1 ) )
      {
         AV8BarCod = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
      }
      if ( true /* Level */ && ( AV17FasMin == 1 ) )
      {
         AV9BarCodReo = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
      }
      /* Using cursor T01RJ13 */
      pr_default.execute(9, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A478FindVolMax = T01RJ13_A478FindVolMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = T01RJ13_A479FindVolMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = T01RJ13_A480FindVolMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      else
      {
         A478FindVolMax = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      pr_default.close(9);
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      if ( true /* Level */ && ( AV17FasMin == 1 ) )
      {
         AV10BarCodPar = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
      }
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
   }

   public void checkExtendedTable1RJ12( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01RJ10 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RJ10_A407EmprNom[0] ;
      n407EmprNom = T01RJ10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
      /* Using cursor T01RJ11 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01RJ11_A252CliCod[0] ;
      n252CliCod = T01RJ11_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = T01RJ11_A365DisDes[0] ;
      pr_default.close(8);
      nIsDirty_12 = (short)(1) ;
      GXt_char1 = A13878PedidoClie ;
      GXv_char12[0] = A396EmprCod ;
      GXv_char11[0] = A4812BarEncCli ;
      GXv_char4[0] = A143BarDisNum ;
      GXv_char3[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_char4, GXv_char3) ;
      recetasdetinte_agrupacion_impl.this.A396EmprCod = GXv_char12[0] ;
      recetasdetinte_agrupacion_impl.this.A4812BarEncCli = GXv_char11[0] ;
      recetasdetinte_agrupacion_impl.this.A143BarDisNum = GXv_char4[0] ;
      recetasdetinte_agrupacion_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A13878PedidoClie = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      nIsDirty_12 = (short)(1) ;
      A401EmprCodVi = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
      if ( true /* Level */ && ( AV17FasMin == 1 ) )
      {
         AV8BarCod = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
      }
      if ( true /* Level */ && ( AV17FasMin == 1 ) )
      {
         AV9BarCodReo = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
      }
      /* Using cursor T01RJ13 */
      pr_default.execute(9, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A478FindVolMax = T01RJ13_A478FindVolMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = T01RJ13_A479FindVolMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = T01RJ13_A480FindVolMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      else
      {
         nIsDirty_12 = (short)(1) ;
         A478FindVolMax = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         nIsDirty_12 = (short)(1) ;
         A479FindVolMed = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         nIsDirty_12 = (short)(1) ;
         A480FindVolMin = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      pr_default.close(9);
      /* Using cursor T01RJ15 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A13846BarAgrCant = T01RJ15_A13846BarAgrCant[0] ;
         n13846BarAgrCant = T01RJ15_n13846BarAgrCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      else
      {
         nIsDirty_12 = (short)(1) ;
         A13846BarAgrCant = DecimalUtil.doubleToDec(0) ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      pr_default.close(10);
      nIsDirty_12 = (short)(1) ;
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      if ( true /* Level */ && ( AV17FasMin == 1 ) )
      {
         AV10BarCodPar = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
      }
      nIsDirty_12 = (short)(1) ;
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
   }

   public void closeExtendedTableCursors1RJ12( )
   {
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_70( String A396EmprCod )
   {
      /* Using cursor T01RJ18 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01RJ18_A407EmprNom[0] ;
      n407EmprNom = T01RJ18_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_71( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01RJ19 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01RJ19_A252CliCod[0] ;
      n252CliCod = T01RJ19_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = T01RJ19_A365DisDes[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_72( int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar ,
                          String A180BarMaqCod )
   {
      /* Using cursor T01RJ21 */
      pr_default.execute(14, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A478FindVolMax = T01RJ21_A478FindVolMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = T01RJ21_A479FindVolMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = T01RJ21_A480FindVolMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      else
      {
         A478FindVolMax = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A479FindVolMed, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_73( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01RJ23 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A13846BarAgrCant = T01RJ23_A13846BarAgrCant[0] ;
         n13846BarAgrCant = T01RJ23_n13846BarAgrCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      else
      {
         A13846BarAgrCant = DecimalUtil.doubleToDec(0) ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13846BarAgrCant, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void getKey1RJ12( )
   {
      /* Using cursor T01RJ24 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RJ9 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm1RJ12( 69) ;
         RcdFound12 = (short)(1) ;
         A361DisCod = T01RJ9_A361DisCod[0] ;
         A2759BarMaqGru = T01RJ9_A2759BarMaqGru[0] ;
         A129BarCod = T01RJ9_A129BarCod[0] ;
         n129BarCod = T01RJ9_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RJ9_A132BarCodReo[0] ;
         n132BarCodReo = T01RJ9_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RJ9_A130BarCodPar[0] ;
         n130BarCodPar = T01RJ9_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A143BarDisNum = T01RJ9_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A120BarAgrEst = T01RJ9_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A180BarMaqCod = T01RJ9_A180BarMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         A236BarVolMaq = T01RJ9_A236BarVolMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
         A213BarSit = T01RJ9_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A212BarSer = T01RJ9_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A135BarColNom = T01RJ9_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01RJ9_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A4812BarEncCli = T01RJ9_A4812BarEncCli[0] ;
         A396EmprCod = T01RJ9_A396EmprCod[0] ;
         n396EmprCod = T01RJ9_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RJ12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey1RJ12( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey1RJ12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1RJ12( ) ;
      if ( RcdFound12 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T01RJ25 */
      pr_default.execute(17, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01RJ25_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RJ25_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RJ25_A129BarCod[0] < A129BarCod ) || ( T01RJ25_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RJ25_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RJ25_A132BarCodReo[0] < A132BarCodReo ) || ( T01RJ25_A132BarCodReo[0] == A132BarCodReo ) && ( T01RJ25_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RJ25_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RJ25_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01RJ25_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RJ25_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RJ25_A129BarCod[0] > A129BarCod ) || ( T01RJ25_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RJ25_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RJ25_A132BarCodReo[0] > A132BarCodReo ) || ( T01RJ25_A132BarCodReo[0] == A132BarCodReo ) && ( T01RJ25_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RJ25_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RJ25_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            A396EmprCod = T01RJ25_A396EmprCod[0] ;
            n396EmprCod = T01RJ25_n396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01RJ25_A129BarCod[0] ;
            n129BarCod = T01RJ25_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RJ25_A132BarCodReo[0] ;
            n132BarCodReo = T01RJ25_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RJ25_A130BarCodPar[0] ;
            n130BarCodPar = T01RJ25_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T01RJ26 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T01RJ26_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RJ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RJ26_A129BarCod[0] > A129BarCod ) || ( T01RJ26_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RJ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RJ26_A132BarCodReo[0] > A132BarCodReo ) || ( T01RJ26_A132BarCodReo[0] == A132BarCodReo ) && ( T01RJ26_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RJ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RJ26_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T01RJ26_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RJ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RJ26_A129BarCod[0] < A129BarCod ) || ( T01RJ26_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RJ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RJ26_A132BarCodReo[0] < A132BarCodReo ) || ( T01RJ26_A132BarCodReo[0] == A132BarCodReo ) && ( T01RJ26_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RJ26_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RJ26_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            A396EmprCod = T01RJ26_A396EmprCod[0] ;
            n396EmprCod = T01RJ26_n396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01RJ26_A129BarCod[0] ;
            n129BarCod = T01RJ26_n129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RJ26_A132BarCodReo[0] ;
            n132BarCodReo = T01RJ26_n132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RJ26_A130BarCodPar[0] ;
            n130BarCodPar = T01RJ26_n130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RJ12( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A13846BarAgrCant = O13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         AV14FlagMAgr = OV14FlagMAgr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RJ12( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               n396EmprCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               n130BarCodPar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A13846BarAgrCant = O13846BarAgrCant ;
               n13846BarAgrCant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
               AV14FlagMAgr = OV14FlagMAgr ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A13846BarAgrCant = O13846BarAgrCant ;
               n13846BarAgrCant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
               AV14FlagMAgr = OV14FlagMAgr ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
               update1RJ12( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               /* Insert record */
               A13846BarAgrCant = O13846BarAgrCant ;
               n13846BarAgrCant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
               AV14FlagMAgr = OV14FlagMAgr ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RJ12( ) ;
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
                  A13846BarAgrCant = O13846BarAgrCant ;
                  n13846BarAgrCant = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
                  AV14FlagMAgr = OV14FlagMAgr ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1RJ12( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A13846BarAgrCant = O13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         AV14FlagMAgr = OV14FlagMAgr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1RJ12( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RJ8 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || ( Z361DisCod != T01RJ8_A361DisCod[0] ) || ( GXutil.strcmp(Z2759BarMaqGru, T01RJ8_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z143BarDisNum, T01RJ8_A143BarDisNum[0]) != 0 ) || ( GXutil.strcmp(Z120BarAgrEst, T01RJ8_A120BarAgrEst[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T01RJ8_A180BarMaqCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z236BarVolMaq != T01RJ8_A236BarVolMaq[0] ) || ( Z213BarSit != T01RJ8_A213BarSit[0] ) || ( GXutil.strcmp(Z212BarSer, T01RJ8_A212BarSer[0]) != 0 ) || ( GXutil.strcmp(Z135BarColNom, T01RJ8_A135BarColNom[0]) != 0 ) || ( Z136BarColNum != T01RJ8_A136BarColNum[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4812BarEncCli, T01RJ8_A4812BarEncCli[0]) != 0 ) )
         {
            if ( Z361DisCod != T01RJ8_A361DisCod[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T01RJ8_A361DisCod[0]);
            }
            if ( GXutil.strcmp(Z2759BarMaqGru, T01RJ8_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T01RJ8_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z143BarDisNum, T01RJ8_A143BarDisNum[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"BarDisNum");
               GXutil.writeLogRaw("Old: ",Z143BarDisNum);
               GXutil.writeLogRaw("Current: ",T01RJ8_A143BarDisNum[0]);
            }
            if ( GXutil.strcmp(Z120BarAgrEst, T01RJ8_A120BarAgrEst[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"BarAgrEst");
               GXutil.writeLogRaw("Old: ",Z120BarAgrEst);
               GXutil.writeLogRaw("Current: ",T01RJ8_A120BarAgrEst[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T01RJ8_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T01RJ8_A180BarMaqCod[0]);
            }
            if ( Z236BarVolMaq != T01RJ8_A236BarVolMaq[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"BarVolMaq");
               GXutil.writeLogRaw("Old: ",Z236BarVolMaq);
               GXutil.writeLogRaw("Current: ",T01RJ8_A236BarVolMaq[0]);
            }
            if ( Z213BarSit != T01RJ8_A213BarSit[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"BarSit");
               GXutil.writeLogRaw("Old: ",Z213BarSit);
               GXutil.writeLogRaw("Current: ",T01RJ8_A213BarSit[0]);
            }
            if ( GXutil.strcmp(Z212BarSer, T01RJ8_A212BarSer[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"BarSer");
               GXutil.writeLogRaw("Old: ",Z212BarSer);
               GXutil.writeLogRaw("Current: ",T01RJ8_A212BarSer[0]);
            }
            if ( GXutil.strcmp(Z135BarColNom, T01RJ8_A135BarColNom[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"BarColNom");
               GXutil.writeLogRaw("Old: ",Z135BarColNom);
               GXutil.writeLogRaw("Current: ",T01RJ8_A135BarColNom[0]);
            }
            if ( Z136BarColNum != T01RJ8_A136BarColNum[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"BarColNum");
               GXutil.writeLogRaw("Old: ",Z136BarColNum);
               GXutil.writeLogRaw("Current: ",T01RJ8_A136BarColNum[0]);
            }
            if ( GXutil.strcmp(Z4812BarEncCli, T01RJ8_A4812BarEncCli[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"BarEncCli");
               GXutil.writeLogRaw("Old: ",Z4812BarEncCli);
               GXutil.writeLogRaw("Current: ",T01RJ8_A4812BarEncCli[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RJ12( )
   {
      beforeValidate1RJ12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RJ12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RJ12( 0) ;
         checkOptimisticConcurrency1RJ12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RJ12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RJ12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RJ27 */
                  pr_default.execute(19, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A143BarDisNum, A120BarAgrEst, A180BarMaqCod, Integer.valueOf(A236BarVolMaq), Byte.valueOf(A213BarSit), A212BarSer, A135BarColNom, Integer.valueOf(A136BarColNum), A4812BarEncCli, Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(19) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11RJ12( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1RJ12( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1RJ0( ) ;
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
            load1RJ12( ) ;
         }
         endLevel1RJ12( ) ;
      }
      closeExtendedTableCursors1RJ12( ) ;
   }

   public void update1RJ12( )
   {
      beforeValidate1RJ12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RJ12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RJ12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RJ12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RJ12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RJ28 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, A143BarDisNum, A120BarAgrEst, A180BarMaqCod, Integer.valueOf(A236BarVolMaq), Byte.valueOf(A213BarSit), A212BarSer, A135BarColNom, Integer.valueOf(A136BarColNum), A4812BarEncCli, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RJ12( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char12[0] = A396EmprCod ;
                     GXv_int9[0] = A129BarCod ;
                     GXv_int10[0] = A132BarCodReo ;
                     GXv_char11[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char12, GXv_int9, GXv_int10, GXv_char11) ;
                     recetasdetinte_agrupacion_impl.this.A396EmprCod = GXv_char12[0] ;
                     recetasdetinte_agrupacion_impl.this.A129BarCod = GXv_int9[0] ;
                     recetasdetinte_agrupacion_impl.this.A132BarCodReo = GXv_int10[0] ;
                     recetasdetinte_agrupacion_impl.this.A130BarCodPar = GXv_char11[0] ;
                     updateTablesN11RJ12( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1RJ12( ) ;
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
         endLevel1RJ12( ) ;
      }
      closeExtendedTableCursors1RJ12( ) ;
   }

   public void deferredUpdate1RJ12( )
   {
   }

   public void delete( )
   {
      beforeValidate1RJ12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RJ12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RJ12( ) ;
         afterConfirm1RJ12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RJ12( ) ;
            if ( AnyError == 0 )
            {
               A13846BarAgrCant = O13846BarAgrCant ;
               n13846BarAgrCant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
               AV14FlagMAgr = OV14FlagMAgr ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
               scanStart1RJ13( ) ;
               while ( RcdFound13 != 0 )
               {
                  getByPrimaryKey1RJ13( ) ;
                  delete1RJ13( ) ;
                  scanNext1RJ13( ) ;
                  O13846BarAgrCant = A13846BarAgrCant ;
                  n13846BarAgrCant = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
                  OV14FlagMAgr = AV14FlagMAgr ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
               }
               scanEnd1RJ13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RJ29 */
                  pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11RJ12( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RJ12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RJ12( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RJ30 */
         pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         A407EmprNom = T01RJ30_A407EmprNom[0] ;
         n407EmprNom = T01RJ30_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(22);
         A401EmprCodVi = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
         if ( true /* Level */ && ( AV17FasMin == 1 ) )
         {
            AV8BarCod = A129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
         }
         if ( true /* Level */ && ( AV17FasMin == 1 ) )
         {
            AV9BarCodReo = A132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
         }
         /* Using cursor T01RJ32 */
         pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            A13846BarAgrCant = T01RJ32_A13846BarAgrCant[0] ;
            n13846BarAgrCant = T01RJ32_n13846BarAgrCant[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         }
         else
         {
            A13846BarAgrCant = DecimalUtil.doubleToDec(0) ;
            n13846BarAgrCant = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         }
         pr_default.close(23);
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
         if ( true /* Level */ && ( AV17FasMin == 1 ) )
         {
            AV10BarCodPar = A130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
         }
         /* Using cursor T01RJ33 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
         A252CliCod = T01RJ33_A252CliCod[0] ;
         n252CliCod = T01RJ33_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A365DisDes = T01RJ33_A365DisDes[0] ;
         pr_default.close(24);
         /* Using cursor T01RJ35 */
         pr_default.execute(25, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            A478FindVolMax = T01RJ35_A478FindVolMax[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
            A479FindVolMed = T01RJ35_A479FindVolMed[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
            A480FindVolMin = T01RJ35_A480FindVolMin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
         }
         else
         {
            A478FindVolMax = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
            A479FindVolMed = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
            A480FindVolMin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
         }
         pr_default.close(25);
         GXt_char1 = A13878PedidoClie ;
         GXv_char12[0] = A396EmprCod ;
         GXv_char11[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_char4, GXv_char3) ;
         recetasdetinte_agrupacion_impl.this.A396EmprCod = GXv_char12[0] ;
         recetasdetinte_agrupacion_impl.this.A4812BarEncCli = GXv_char11[0] ;
         recetasdetinte_agrupacion_impl.this.A143BarDisNum = GXv_char4[0] ;
         recetasdetinte_agrupacion_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01RJ36 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01RJ37 */
         pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01RJ38 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01RJ39 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01RJ40 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01RJ41 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01RJ42 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01RJ43 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01RJ44 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01RJ45 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01RJ46 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01RJ47 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "tinagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01RJ48 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01RJ49 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01RJ50 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01RJ51 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDITORIA PIEZAS HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01RJ52 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ensayos de HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01RJ53 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REFHDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01RJ54 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01RJ55 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01RJ56 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01RJ57 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01RJ58 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01RJ59 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01RJ60 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01RJ61 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01RJ62 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRACA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01RJ63 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01RJ64 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01RJ65 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01RJ66 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01RJ67 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01RJ68 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01RJ69 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01RJ70 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01RJ71 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01RJ72 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01RJ73 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01RJ74 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01RJ75 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01RJ76 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01RJ77 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01RJ78 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01RJ79 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01RJ80 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01RJ81 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01RJ82 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01RJ83 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01RJ84 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01RJ85 */
         pr_default.execute(75, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01RJ86 */
         pr_default.execute(76, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01RJ87 */
         pr_default.execute(77, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01RJ88 */
         pr_default.execute(78, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T01RJ89 */
         pr_default.execute(79, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T01RJ90 */
         pr_default.execute(80, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T01RJ91 */
         pr_default.execute(81, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T01RJ92 */
         pr_default.execute(82, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T01RJ93 */
         pr_default.execute(83, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T01RJ94 */
         pr_default.execute(84, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T01RJ95 */
         pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T01RJ96 */
         pr_default.execute(86, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T01RJ97 */
         pr_default.execute(87, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
      }
   }

   public void processNestedLevel1RJ13( )
   {
      s13846BarAgrCant = O13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      sV14FlagMAgr = OV14FlagMAgr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
      nGXsfl_47_idx = 0 ;
      while ( nGXsfl_47_idx < nRC_GXsfl_47 )
      {
         readRow1RJ13( ) ;
         if ( ( nRcdExists_13 != 0 ) || ( nIsMod_13 != 0 ) )
         {
            standaloneNotModal1RJ13( ) ;
            getKey1RJ13( ) ;
            if ( ( nRcdExists_13 == 0 ) && ( nRcdDeleted_13 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1RJ13( ) ;
            }
            else
            {
               if ( RcdFound13 != 0 )
               {
                  if ( ( nRcdDeleted_13 != 0 ) && ( nRcdExists_13 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1RJ13( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_13 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1RJ13( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_13 == 0 )
                  {
                     GXCCtl = "BARAGRCOD_" + sGXsfl_47_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarAgrCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O13846BarAgrCant = A13846BarAgrCant ;
            n13846BarAgrCant = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
            OV14FlagMAgr = AV14FlagMAgr ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
         }
         httpContext.changePostValue( edtBarAgrCod_Internalname, GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrReo_Internalname, GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrPar_Internalname, GXutil.rtrim( A122BarAgrPar)) ;
         httpContext.changePostValue( edtCliCodAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrSer_Internalname, GXutil.rtrim( A1245BarAgrSer)) ;
         httpContext.changePostValue( edtBarAgrDsc_Internalname, GXutil.rtrim( A1507BarAgrDsc)) ;
         httpContext.changePostValue( edtColNomAgr_Internalname, GXutil.rtrim( A1510ColNomAgr)) ;
         httpContext.changePostValue( edtColNumAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtKgmAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtrAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPieAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrPie_Internalname, GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFindDes_Internalname, GXutil.rtrim( A1653FindDes)) ;
         httpContext.changePostValue( edtFindBarAgr_Internalname, GXutil.rtrim( A474FindBarAgr)) ;
         httpContext.changePostValue( edtDisCodAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColNoCAgr_Internalname, GXutil.rtrim( A1509ColNoCAgr)) ;
         httpContext.changePostValue( edtColNuCAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrDNu_Internalname, GXutil.rtrim( A1649BarAgrDNu)) ;
         httpContext.changePostValue( edtBarAGrHdr_Internalname, GXutil.rtrim( A13695BarAGrHdr)) ;
         httpContext.changePostValue( edtBarAgrNhdr_Internalname, GXutil.rtrim( A13792BarAgrNhdr)) ;
         httpContext.changePostValue( "ZT_"+"Z119BarAgrCod_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z124BarAgrReo_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z122BarAgrPar_"+sGXsfl_47_idx, GXutil.rtrim( Z122BarAgrPar)) ;
         httpContext.changePostValue( "ZT_"+"Z590KgmAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z671PieAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z869MtrAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1508CliCodAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1245BarAgrSer_"+sGXsfl_47_idx, GXutil.rtrim( Z1245BarAgrSer)) ;
         httpContext.changePostValue( "ZT_"+"Z1507BarAgrDsc_"+sGXsfl_47_idx, GXutil.rtrim( Z1507BarAgrDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z1510ColNomAgr_"+sGXsfl_47_idx, GXutil.rtrim( Z1510ColNomAgr)) ;
         httpContext.changePostValue( "ZT_"+"Z1512ColNumAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1513DisCodAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1509ColNoCAgr_"+sGXsfl_47_idx, GXutil.rtrim( Z1509ColNoCAgr)) ;
         httpContext.changePostValue( "ZT_"+"Z1511ColNuCAgr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1649BarAgrDNu_"+sGXsfl_47_idx, GXutil.rtrim( Z1649BarAgrDNu)) ;
         httpContext.changePostValue( "T119BarAgrCod_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( O119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_13_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_13_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_13_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_13 != 0 )
         {
            httpContext.changePostValue( "BARAGRCOD_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRREO_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRPAR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICODAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCodAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRSER_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRDSC_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNOMAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNomAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNUMAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNumAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "KGMAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKgmAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTRAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PIEAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPieAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRKGM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRMTR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRPIE_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRNDES_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPNDES_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPNDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FINDDES_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FINDBARAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindBarAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCODAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisCodAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNOCAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNoCAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNUCAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNuCAgr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRDNU_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDNu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRHDR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAGrHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRNHDR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNhdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1RJ13( ) ;
      if ( AnyError != 0 )
      {
         O13846BarAgrCant = s13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         OV14FlagMAgr = sV14FlagMAgr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
      }
      nRcdExists_13 = (short)(0) ;
      nIsMod_13 = (short)(0) ;
      nRcdDeleted_13 = (short)(0) ;
   }

   public void processLevel1RJ12( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel1RJ13( ) ;
      if ( AnyError != 0 )
      {
         O13846BarAgrCant = s13846BarAgrCant ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         OV14FlagMAgr = sV14FlagMAgr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN11RJ12( )
   {
      /* Using cursor T01RJ98 */
      pr_default.execute(88, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevel1RJ12( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RJ12( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "recetasdetinte_agrupacion");
         if ( AnyError == 0 )
         {
            confirmValues1RJ0( ) ;
         }
         /* After transaction rules */
         if ( true /* After */ && ( ( AV14FlagMAgr == 1 ) || ( AV15FlagEli == 1 ) ) && ( AV17FasMin == 1 ) )
         {
            GXv_char12[0] = A396EmprCod ;
            GXv_int9[0] = A129BarCod ;
            GXv_int10[0] = A132BarCodReo ;
            GXv_char11[0] = A130BarCodPar ;
            new app.pcremag(remoteHandle, context).execute( GXv_char12, GXv_int9, GXv_int10, GXv_char11) ;
            recetasdetinte_agrupacion_impl.this.A396EmprCod = GXv_char12[0] ;
            recetasdetinte_agrupacion_impl.this.A129BarCod = GXv_int9[0] ;
            recetasdetinte_agrupacion_impl.this.A132BarCodReo = GXv_int10[0] ;
            recetasdetinte_agrupacion_impl.this.A130BarCodPar = GXv_char11[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "recetasdetinte_agrupacion");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RJ12( )
   {
      /* Scan By routine */
      /* Using cursor T01RJ99 */
      pr_default.execute(89);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(89) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A396EmprCod = T01RJ99_A396EmprCod[0] ;
         n396EmprCod = T01RJ99_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RJ99_A129BarCod[0] ;
         n129BarCod = T01RJ99_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RJ99_A132BarCodReo[0] ;
         n132BarCodReo = T01RJ99_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RJ99_A130BarCodPar[0] ;
         n130BarCodPar = T01RJ99_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RJ12( )
   {
      /* Scan next routine */
      pr_default.readNext(89);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(89) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A396EmprCod = T01RJ99_A396EmprCod[0] ;
         n396EmprCod = T01RJ99_n396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RJ99_A129BarCod[0] ;
         n129BarCod = T01RJ99_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RJ99_A132BarCodReo[0] ;
         n132BarCodReo = T01RJ99_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RJ99_A130BarCodPar[0] ;
         n130BarCodPar = T01RJ99_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void scanEnd1RJ12( )
   {
      pr_default.close(89);
   }

   public void afterConfirm1RJ12( )
   {
      /* After Confirm Rules */
      if ( ( AV36ControlAlbaran == 1 ) && true /* Level */ && true /* After */ )
      {
         new app.pexalbdehdr(remoteHandle, context).execute( ) ;
      }
      if ( ( AV36ControlAlbaran == 1 ) && true /* Level */ && ( GXutil.strcmp(AV39Albaranes, " ") != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV39Albaranes, 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1RJ12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RJ12( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RJ12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RJ12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RJ12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RJ12( )
   {
      edtBarNHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtBarMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqCod_Enabled), 5, 0), true);
      edtBarVolMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarVolMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarVolMaq_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtPedidoClie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedidoClie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarDisNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), true);
      edtEmprCodVi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCodVi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCodVi_Enabled), 5, 0), true);
      edtBarAgrEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Enabled), 5, 0), true);
      edtFindVolMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMed_Enabled), 5, 0), true);
      edtFindVolMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMin_Enabled), 5, 0), true);
      edtFindVolMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindVolMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindVolMax_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtBarAgrCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCant_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
   }

   public void zm1RJ13( int GX_JID )
   {
      if ( ( GX_JID == 74 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z590KgmAgr = T01RJ3_A590KgmAgr[0] ;
            Z671PieAgr = T01RJ3_A671PieAgr[0] ;
            Z869MtrAgr = T01RJ3_A869MtrAgr[0] ;
            Z1508CliCodAgr = T01RJ3_A1508CliCodAgr[0] ;
            Z1245BarAgrSer = T01RJ3_A1245BarAgrSer[0] ;
            Z1507BarAgrDsc = T01RJ3_A1507BarAgrDsc[0] ;
            Z1510ColNomAgr = T01RJ3_A1510ColNomAgr[0] ;
            Z1512ColNumAgr = T01RJ3_A1512ColNumAgr[0] ;
            Z1513DisCodAgr = T01RJ3_A1513DisCodAgr[0] ;
            Z1509ColNoCAgr = T01RJ3_A1509ColNoCAgr[0] ;
            Z1511ColNuCAgr = T01RJ3_A1511ColNuCAgr[0] ;
            Z1649BarAgrDNu = T01RJ3_A1649BarAgrDNu[0] ;
         }
         else
         {
            Z590KgmAgr = A590KgmAgr ;
            Z671PieAgr = A671PieAgr ;
            Z869MtrAgr = A869MtrAgr ;
            Z1508CliCodAgr = A1508CliCodAgr ;
            Z1245BarAgrSer = A1245BarAgrSer ;
            Z1507BarAgrDsc = A1507BarAgrDsc ;
            Z1510ColNomAgr = A1510ColNomAgr ;
            Z1512ColNumAgr = A1512ColNumAgr ;
            Z1513DisCodAgr = A1513DisCodAgr ;
            Z1509ColNoCAgr = A1509ColNoCAgr ;
            Z1511ColNuCAgr = A1511ColNuCAgr ;
            Z1649BarAgrDNu = A1649BarAgrDNu ;
         }
      }
      if ( GX_JID == -74 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z119BarAgrCod = A119BarAgrCod ;
         Z124BarAgrReo = A124BarAgrReo ;
         Z122BarAgrPar = A122BarAgrPar ;
         Z590KgmAgr = A590KgmAgr ;
         Z671PieAgr = A671PieAgr ;
         Z869MtrAgr = A869MtrAgr ;
         Z1508CliCodAgr = A1508CliCodAgr ;
         Z1245BarAgrSer = A1245BarAgrSer ;
         Z1507BarAgrDsc = A1507BarAgrDsc ;
         Z1510ColNomAgr = A1510ColNomAgr ;
         Z1512ColNumAgr = A1512ColNumAgr ;
         Z1513DisCodAgr = A1513DisCodAgr ;
         Z1509ColNoCAgr = A1509ColNoCAgr ;
         Z1511ColNuCAgr = A1511ColNuCAgr ;
         Z1649BarAgrDNu = A1649BarAgrDNu ;
         Z396EmprCod = A396EmprCod ;
         Z474FindBarAgr = A474FindBarAgr ;
         Z1653FindDes = A1653FindDes ;
      }
   }

   public void standaloneNotModal1RJ13( )
   {
      edtCliCodAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrSer_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtColNomAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNomAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtColNumAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNumAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNumAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtKgmAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtMtrAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtPieAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrKgm_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrMtr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPie_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNDes_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarPNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPNDes_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFindDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindDes_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFindBarAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindBarAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindBarAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtDisCodAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCodAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtColNoCAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNoCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNoCAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtColNuCAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNuCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNuCAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrDNu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDNu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDNu_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAGrHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAGrHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAGrHdr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrNhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNhdr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
   }

   public void standaloneModal1RJ13( )
   {
      if ( isIns( )  && true /* Level */ && ( AV17FasMin == 1 ) )
      {
         AV14FlagMAgr = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
      }
      if ( isIns( )  && true /* Level */ && ( AV17FasMin == 1 ) )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int9[0] = AV8BarCod ;
         GXv_int10[0] = AV9BarCodReo ;
         GXv_char11[0] = AV10BarCodPar ;
         new app.pelimin(remoteHandle, context).execute( GXv_char12, GXv_int9, GXv_int10, GXv_char11) ;
         recetasdetinte_agrupacion_impl.this.A396EmprCod = GXv_char12[0] ;
         recetasdetinte_agrupacion_impl.this.AV8BarCod = GXv_int9[0] ;
         recetasdetinte_agrupacion_impl.this.AV9BarCodReo = GXv_int10[0] ;
         recetasdetinte_agrupacion_impl.this.AV10BarCodPar = GXv_char11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
      }
      if ( isIns( )  )
      {
         A13846BarAgrCant = O13846BarAgrCant.add(DecimalUtil.doubleToDec(1)) ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A13846BarAgrCant = O13846BarAgrCant ;
            n13846BarAgrCant = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A13846BarAgrCant = O13846BarAgrCant.subtract(DecimalUtil.doubleToDec(1)) ;
               n13846BarAgrCant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarAgrCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      }
      else
      {
         edtBarAgrCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarAgrReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      }
      else
      {
         edtBarAgrReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarAgrPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      }
      else
      {
         edtBarAgrPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      }
   }

   public void load1RJ13( )
   {
      /* Using cursor T01RJ100 */
      pr_default.execute(90, new Object[] {A401EmprCodVi, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(90) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A590KgmAgr = T01RJ100_A590KgmAgr[0] ;
         A671PieAgr = T01RJ100_A671PieAgr[0] ;
         A869MtrAgr = T01RJ100_A869MtrAgr[0] ;
         A1508CliCodAgr = T01RJ100_A1508CliCodAgr[0] ;
         A1245BarAgrSer = T01RJ100_A1245BarAgrSer[0] ;
         A1507BarAgrDsc = T01RJ100_A1507BarAgrDsc[0] ;
         A1510ColNomAgr = T01RJ100_A1510ColNomAgr[0] ;
         A1512ColNumAgr = T01RJ100_A1512ColNumAgr[0] ;
         A1513DisCodAgr = T01RJ100_A1513DisCodAgr[0] ;
         A1509ColNoCAgr = T01RJ100_A1509ColNoCAgr[0] ;
         A1511ColNuCAgr = T01RJ100_A1511ColNuCAgr[0] ;
         A1649BarAgrDNu = T01RJ100_A1649BarAgrDNu[0] ;
         A474FindBarAgr = T01RJ100_A474FindBarAgr[0] ;
         n474FindBarAgr = T01RJ100_n474FindBarAgr[0] ;
         A1653FindDes = T01RJ100_A1653FindDes[0] ;
         n1653FindDes = T01RJ100_n1653FindDes[0] ;
         zm1RJ13( -74) ;
      }
      pr_default.close(90);
      onLoadActions1RJ13( ) ;
   }

   public void onLoadActions1RJ13( )
   {
      /* Using cursor T01RJ5 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A121BarAgrKgm = T01RJ5_A121BarAgrKgm[0] ;
         A868BarAgrMtr = T01RJ5_A868BarAgrMtr[0] ;
         A1650BarAgrNDes = T01RJ5_A1650BarAgrNDes[0] ;
         A1651BarPNDes = T01RJ5_A1651BarPNDes[0] ;
      }
      else
      {
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         A1650BarAgrNDes = (short)(0) ;
         A1651BarPNDes = (short)(0) ;
      }
      pr_default.close(2);
      if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A123BarAgrPie = A1650BarAgrNDes ;
      }
      else
      {
         A123BarAgrPie = A1651BarPNDes ;
      }
      A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
      A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
   }

   public void checkExtendedTable1RJ13( )
   {
      nIsDirty_13 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1RJ13( ) ;
      /* Using cursor T01RJ5 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A121BarAgrKgm = T01RJ5_A121BarAgrKgm[0] ;
         A868BarAgrMtr = T01RJ5_A868BarAgrMtr[0] ;
         A1650BarAgrNDes = T01RJ5_A1650BarAgrNDes[0] ;
         A1651BarPNDes = T01RJ5_A1651BarPNDes[0] ;
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         nIsDirty_13 = (short)(1) ;
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         nIsDirty_13 = (short)(1) ;
         A1650BarAgrNDes = (short)(0) ;
         nIsDirty_13 = (short)(1) ;
         A1651BarPNDes = (short)(0) ;
      }
      pr_default.close(2);
      /* Using cursor T01RJ6 */
      pr_default.execute(3, new Object[] {A401EmprCodVi, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A474FindBarAgr = T01RJ6_A474FindBarAgr[0] ;
         n474FindBarAgr = T01RJ6_n474FindBarAgr[0] ;
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A474FindBarAgr = "" ;
         n474FindBarAgr = false ;
      }
      pr_default.close(3);
      if ( (GXutil.strcmp("", A474FindBarAgr)==0) && isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de ruta inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(A474FindBarAgr, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Barcada ya agrupada", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01RJ7 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A1653FindDes = T01RJ7_A1653FindDes[0] ;
         n1653FindDes = T01RJ7_n1653FindDes[0] ;
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A1653FindDes = " " ;
         n1653FindDes = false ;
      }
      pr_default.close(4);
      if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
      {
         nIsDirty_13 = (short)(1) ;
         A123BarAgrPie = A1650BarAgrNDes ;
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A123BarAgrPie = A1651BarPNDes ;
      }
      nIsDirty_13 = (short)(1) ;
      A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
      nIsDirty_13 = (short)(1) ;
      A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
      if ( true /* After */ && true /* Level */ )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int9[0] = A119BarAgrCod ;
         GXv_int10[0] = A124BarAgrReo ;
         GXv_char11[0] = A122BarAgrPar ;
         GXv_int8[0] = AV32CliCodAgr ;
         GXv_char4[0] = AV33BarAgrSer ;
         GXv_char3[0] = AV34ColNomAgr ;
         GXv_int13[0] = AV35ColNumAgr ;
         new app.pbushra(remoteHandle, context).execute( GXv_char12, GXv_int9, GXv_int10, GXv_char11, GXv_int8, GXv_char4, GXv_char3, GXv_int13) ;
         recetasdetinte_agrupacion_impl.this.A396EmprCod = GXv_char12[0] ;
         recetasdetinte_agrupacion_impl.this.A119BarAgrCod = GXv_int9[0] ;
         recetasdetinte_agrupacion_impl.this.A124BarAgrReo = GXv_int10[0] ;
         recetasdetinte_agrupacion_impl.this.A122BarAgrPar = GXv_char11[0] ;
         recetasdetinte_agrupacion_impl.this.AV32CliCodAgr = GXv_int8[0] ;
         recetasdetinte_agrupacion_impl.this.AV33BarAgrSer = GXv_char4[0] ;
         recetasdetinte_agrupacion_impl.this.AV34ColNomAgr = GXv_char3[0] ;
         recetasdetinte_agrupacion_impl.this.AV35ColNumAgr = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32CliCodAgr), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33BarAgrSer", AV33BarAgrSer);
         httpContext.ajax_rsp_assign_attri("", false, "AV34ColNomAgr", AV34ColNomAgr);
         httpContext.ajax_rsp_assign_attri("", false, "AV35ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35ColNumAgr), 6, 0));
      }
      if ( ( A129BarCod == A119BarAgrCod ) && ( A132BarCodReo == A124BarAgrReo ) && ( GXutil.strcmp(A130BarCodPar, A122BarAgrPar) == 0 ) )
      {
         GXCCtl = "BARAGRCOD_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Misma Hdr en Cabecera que en Lineas", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && (IsModified == 1) && ! ( O119BarAgrCod == 0 ) )
      {
         GXCCtl = "BARAGRCOD_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se pueden modificar barcadas asociadas", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1RJ13( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable1RJ13( )
   {
   }

   public void gxload_75( String A396EmprCod ,
                          int A119BarAgrCod ,
                          byte A124BarAgrReo ,
                          String A122BarAgrPar )
   {
      /* Using cursor T01RJ102 */
      pr_default.execute(91, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(91) != 101) )
      {
         A121BarAgrKgm = T01RJ102_A121BarAgrKgm[0] ;
         A868BarAgrMtr = T01RJ102_A868BarAgrMtr[0] ;
         A1650BarAgrNDes = T01RJ102_A1650BarAgrNDes[0] ;
         A1651BarPNDes = T01RJ102_A1651BarPNDes[0] ;
      }
      else
      {
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         A1650BarAgrNDes = (short)(0) ;
         A1651BarPNDes = (short)(0) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(91) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(91);
   }

   public void gxload_76( String A401EmprCodVi ,
                          int A119BarAgrCod ,
                          byte A124BarAgrReo ,
                          String A122BarAgrPar )
   {
      /* Using cursor T01RJ103 */
      pr_default.execute(92, new Object[] {A401EmprCodVi, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(92) != 101) )
      {
         A474FindBarAgr = T01RJ103_A474FindBarAgr[0] ;
         n474FindBarAgr = T01RJ103_n474FindBarAgr[0] ;
      }
      else
      {
         A474FindBarAgr = "" ;
         n474FindBarAgr = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A474FindBarAgr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(92) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(92);
   }

   public void gxload_77( String A396EmprCod ,
                          int A119BarAgrCod ,
                          byte A124BarAgrReo ,
                          String A122BarAgrPar )
   {
      /* Using cursor T01RJ104 */
      pr_default.execute(93, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(93) != 101) )
      {
         A1653FindDes = T01RJ104_A1653FindDes[0] ;
         n1653FindDes = T01RJ104_n1653FindDes[0] ;
      }
      else
      {
         A1653FindDes = " " ;
         n1653FindDes = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1653FindDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(93) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(93);
   }

   public void getKey1RJ13( )
   {
      /* Using cursor T01RJ105 */
      pr_default.execute(94, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(94) != 101) )
      {
         RcdFound13 = (short)(1) ;
      }
      else
      {
         RcdFound13 = (short)(0) ;
      }
      pr_default.close(94);
   }

   public void getByPrimaryKey1RJ13( )
   {
      /* Using cursor T01RJ3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RJ13( 74) ;
         RcdFound13 = (short)(1) ;
         initializeNonKey1RJ13( ) ;
         A119BarAgrCod = T01RJ3_A119BarAgrCod[0] ;
         A124BarAgrReo = T01RJ3_A124BarAgrReo[0] ;
         A122BarAgrPar = T01RJ3_A122BarAgrPar[0] ;
         A590KgmAgr = T01RJ3_A590KgmAgr[0] ;
         A671PieAgr = T01RJ3_A671PieAgr[0] ;
         A869MtrAgr = T01RJ3_A869MtrAgr[0] ;
         A1508CliCodAgr = T01RJ3_A1508CliCodAgr[0] ;
         A1245BarAgrSer = T01RJ3_A1245BarAgrSer[0] ;
         A1507BarAgrDsc = T01RJ3_A1507BarAgrDsc[0] ;
         A1510ColNomAgr = T01RJ3_A1510ColNomAgr[0] ;
         A1512ColNumAgr = T01RJ3_A1512ColNumAgr[0] ;
         A1513DisCodAgr = T01RJ3_A1513DisCodAgr[0] ;
         A1509ColNoCAgr = T01RJ3_A1509ColNoCAgr[0] ;
         A1511ColNuCAgr = T01RJ3_A1511ColNuCAgr[0] ;
         A1649BarAgrDNu = T01RJ3_A1649BarAgrDNu[0] ;
         O119BarAgrCod = A119BarAgrCod ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z119BarAgrCod = A119BarAgrCod ;
         Z124BarAgrReo = A124BarAgrReo ;
         Z122BarAgrPar = A122BarAgrPar ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RJ13( ) ;
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound13 = (short)(0) ;
         initializeNonKey1RJ13( ) ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1RJ13( ) ;
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1RJ13( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1RJ13( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RJ2 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARAGR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z590KgmAgr, T01RJ2_A590KgmAgr[0]) != 0 ) || ( Z671PieAgr != T01RJ2_A671PieAgr[0] ) || ( DecimalUtil.compareTo(Z869MtrAgr, T01RJ2_A869MtrAgr[0]) != 0 ) || ( Z1508CliCodAgr != T01RJ2_A1508CliCodAgr[0] ) || ( GXutil.strcmp(Z1245BarAgrSer, T01RJ2_A1245BarAgrSer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1507BarAgrDsc, T01RJ2_A1507BarAgrDsc[0]) != 0 ) || ( GXutil.strcmp(Z1510ColNomAgr, T01RJ2_A1510ColNomAgr[0]) != 0 ) || ( Z1512ColNumAgr != T01RJ2_A1512ColNumAgr[0] ) || ( Z1513DisCodAgr != T01RJ2_A1513DisCodAgr[0] ) || ( GXutil.strcmp(Z1509ColNoCAgr, T01RJ2_A1509ColNoCAgr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1511ColNuCAgr != T01RJ2_A1511ColNuCAgr[0] ) || ( GXutil.strcmp(Z1649BarAgrDNu, T01RJ2_A1649BarAgrDNu[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z590KgmAgr, T01RJ2_A590KgmAgr[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"KgmAgr");
               GXutil.writeLogRaw("Old: ",Z590KgmAgr);
               GXutil.writeLogRaw("Current: ",T01RJ2_A590KgmAgr[0]);
            }
            if ( Z671PieAgr != T01RJ2_A671PieAgr[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"PieAgr");
               GXutil.writeLogRaw("Old: ",Z671PieAgr);
               GXutil.writeLogRaw("Current: ",T01RJ2_A671PieAgr[0]);
            }
            if ( DecimalUtil.compareTo(Z869MtrAgr, T01RJ2_A869MtrAgr[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"MtrAgr");
               GXutil.writeLogRaw("Old: ",Z869MtrAgr);
               GXutil.writeLogRaw("Current: ",T01RJ2_A869MtrAgr[0]);
            }
            if ( Z1508CliCodAgr != T01RJ2_A1508CliCodAgr[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"CliCodAgr");
               GXutil.writeLogRaw("Old: ",Z1508CliCodAgr);
               GXutil.writeLogRaw("Current: ",T01RJ2_A1508CliCodAgr[0]);
            }
            if ( GXutil.strcmp(Z1245BarAgrSer, T01RJ2_A1245BarAgrSer[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"BarAgrSer");
               GXutil.writeLogRaw("Old: ",Z1245BarAgrSer);
               GXutil.writeLogRaw("Current: ",T01RJ2_A1245BarAgrSer[0]);
            }
            if ( GXutil.strcmp(Z1507BarAgrDsc, T01RJ2_A1507BarAgrDsc[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"BarAgrDsc");
               GXutil.writeLogRaw("Old: ",Z1507BarAgrDsc);
               GXutil.writeLogRaw("Current: ",T01RJ2_A1507BarAgrDsc[0]);
            }
            if ( GXutil.strcmp(Z1510ColNomAgr, T01RJ2_A1510ColNomAgr[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"ColNomAgr");
               GXutil.writeLogRaw("Old: ",Z1510ColNomAgr);
               GXutil.writeLogRaw("Current: ",T01RJ2_A1510ColNomAgr[0]);
            }
            if ( Z1512ColNumAgr != T01RJ2_A1512ColNumAgr[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"ColNumAgr");
               GXutil.writeLogRaw("Old: ",Z1512ColNumAgr);
               GXutil.writeLogRaw("Current: ",T01RJ2_A1512ColNumAgr[0]);
            }
            if ( Z1513DisCodAgr != T01RJ2_A1513DisCodAgr[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"DisCodAgr");
               GXutil.writeLogRaw("Old: ",Z1513DisCodAgr);
               GXutil.writeLogRaw("Current: ",T01RJ2_A1513DisCodAgr[0]);
            }
            if ( GXutil.strcmp(Z1509ColNoCAgr, T01RJ2_A1509ColNoCAgr[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"ColNoCAgr");
               GXutil.writeLogRaw("Old: ",Z1509ColNoCAgr);
               GXutil.writeLogRaw("Current: ",T01RJ2_A1509ColNoCAgr[0]);
            }
            if ( Z1511ColNuCAgr != T01RJ2_A1511ColNuCAgr[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"ColNuCAgr");
               GXutil.writeLogRaw("Old: ",Z1511ColNuCAgr);
               GXutil.writeLogRaw("Current: ",T01RJ2_A1511ColNuCAgr[0]);
            }
            if ( GXutil.strcmp(Z1649BarAgrDNu, T01RJ2_A1649BarAgrDNu[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion:[seudo value changed for attri]"+"BarAgrDNu");
               GXutil.writeLogRaw("Old: ",Z1649BarAgrDNu);
               GXutil.writeLogRaw("Current: ",T01RJ2_A1649BarAgrDNu[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARAGR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RJ13( )
   {
      beforeValidate1RJ13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RJ13( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RJ13( 0) ;
         checkOptimisticConcurrency1RJ13( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RJ13( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RJ13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RJ106 */
                  pr_default.execute(95, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A590KgmAgr, Short.valueOf(A671PieAgr), A869MtrAgr, Integer.valueOf(A1508CliCodAgr), A1245BarAgrSer, A1507BarAgrDsc, A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), Integer.valueOf(A1513DisCodAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
                  if ( (pr_default.getStatus(95) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && true /* Level */ )
                     {
                        GXv_char12[0] = A396EmprCod ;
                        GXv_int13[0] = A129BarCod ;
                        GXv_int10[0] = A132BarCodReo ;
                        GXv_char11[0] = A130BarCodPar ;
                        GXv_int9[0] = A119BarAgrCod ;
                        GXv_int6[0] = A124BarAgrReo ;
                        GXv_char4[0] = A122BarAgrPar ;
                        GXv_char3[0] = A180BarMaqCod ;
                        GXv_int8[0] = A236BarVolMaq ;
                        GXv_int14[0] = A671PieAgr ;
                        GXv_decimal15[0] = A590KgmAgr ;
                        GXv_decimal16[0] = A869MtrAgr ;
                        new app.pcreagr(remoteHandle, context).execute( GXv_char12, GXv_int13, GXv_int10, GXv_char11, GXv_int9, GXv_int6, GXv_char4, GXv_char3, GXv_int8, GXv_int14, GXv_decimal15, GXv_decimal16) ;
                        recetasdetinte_agrupacion_impl.this.A396EmprCod = GXv_char12[0] ;
                        recetasdetinte_agrupacion_impl.this.A129BarCod = GXv_int13[0] ;
                        recetasdetinte_agrupacion_impl.this.A132BarCodReo = GXv_int10[0] ;
                        recetasdetinte_agrupacion_impl.this.A130BarCodPar = GXv_char11[0] ;
                        recetasdetinte_agrupacion_impl.this.A119BarAgrCod = GXv_int9[0] ;
                        recetasdetinte_agrupacion_impl.this.A124BarAgrReo = GXv_int6[0] ;
                        recetasdetinte_agrupacion_impl.this.A122BarAgrPar = GXv_char4[0] ;
                        recetasdetinte_agrupacion_impl.this.A180BarMaqCod = GXv_char3[0] ;
                        recetasdetinte_agrupacion_impl.this.A236BarVolMaq = GXv_int8[0] ;
                        recetasdetinte_agrupacion_impl.this.A671PieAgr = GXv_int14[0] ;
                        recetasdetinte_agrupacion_impl.this.A590KgmAgr = GXv_decimal15[0] ;
                        recetasdetinte_agrupacion_impl.this.A869MtrAgr = GXv_decimal16[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                        httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
                     }
                     if ( true /* After */ && true /* Level */ )
                     {
                        GXv_char12[0] = A396EmprCod ;
                        GXv_int13[0] = A119BarAgrCod ;
                        GXv_int10[0] = A124BarAgrReo ;
                        GXv_char11[0] = A122BarAgrPar ;
                        GXv_int9[0] = A1508CliCodAgr ;
                        GXv_char4[0] = A1245BarAgrSer ;
                        GXv_char3[0] = A1510ColNomAgr ;
                        GXv_int8[0] = A1512ColNumAgr ;
                        new app.pbushra(remoteHandle, context).execute( GXv_char12, GXv_int13, GXv_int10, GXv_char11, GXv_int9, GXv_char4, GXv_char3, GXv_int8) ;
                        recetasdetinte_agrupacion_impl.this.A396EmprCod = GXv_char12[0] ;
                        recetasdetinte_agrupacion_impl.this.A119BarAgrCod = GXv_int13[0] ;
                        recetasdetinte_agrupacion_impl.this.A124BarAgrReo = GXv_int10[0] ;
                        recetasdetinte_agrupacion_impl.this.A122BarAgrPar = GXv_char11[0] ;
                        recetasdetinte_agrupacion_impl.this.A1508CliCodAgr = GXv_int9[0] ;
                        recetasdetinte_agrupacion_impl.this.A1245BarAgrSer = GXv_char4[0] ;
                        recetasdetinte_agrupacion_impl.this.A1510ColNomAgr = GXv_char3[0] ;
                        recetasdetinte_agrupacion_impl.this.A1512ColNumAgr = GXv_int8[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
            load1RJ13( ) ;
         }
         endLevel1RJ13( ) ;
      }
      closeExtendedTableCursors1RJ13( ) ;
   }

   public void update1RJ13( )
   {
      beforeValidate1RJ13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RJ13( ) ;
      }
      if ( ( nIsMod_13 != 0 ) || ( nIsDirty_13 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1RJ13( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1RJ13( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1RJ13( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01RJ107 */
                     pr_default.execute(96, new Object[] {A590KgmAgr, Short.valueOf(A671PieAgr), A869MtrAgr, Integer.valueOf(A1508CliCodAgr), A1245BarAgrSer, A1507BarAgrDsc, A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), Integer.valueOf(A1513DisCodAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
                     if ( (pr_default.getStatus(96) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARAGR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1RJ13( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char12[0] = A396EmprCod ;
                        GXv_int13[0] = A129BarCod ;
                        GXv_int10[0] = A132BarCodReo ;
                        GXv_char11[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char12, GXv_int13, GXv_int10, GXv_char11) ;
                        recetasdetinte_agrupacion_impl.this.A396EmprCod = GXv_char12[0] ;
                        recetasdetinte_agrupacion_impl.this.A129BarCod = GXv_int13[0] ;
                        recetasdetinte_agrupacion_impl.this.A132BarCodReo = GXv_int10[0] ;
                        recetasdetinte_agrupacion_impl.this.A130BarCodPar = GXv_char11[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1RJ13( ) ;
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
            endLevel1RJ13( ) ;
         }
      }
      closeExtendedTableCursors1RJ13( ) ;
   }

   public void deferredUpdate1RJ13( )
   {
   }

   public void delete1RJ13( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RJ13( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RJ13( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RJ13( ) ;
         afterConfirm1RJ13( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RJ13( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RJ108 */
               pr_default.execute(97, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
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
      sMode13 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RJ13( ) ;
      Gx_mode = sMode13 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RJ13( )
   {
      standaloneModal1RJ13( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( (GXutil.strcmp("", A474FindBarAgr)==0) && isIns( )  && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de ruta inexistente", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( ( GXutil.strcmp(A474FindBarAgr, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Barcada ya agrupada", ""), 1, "");
            AnyError = (short)(1) ;
         }
         /* Using cursor T01RJ110 */
         pr_default.execute(98, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
         if ( (pr_default.getStatus(98) != 101) )
         {
            A121BarAgrKgm = T01RJ110_A121BarAgrKgm[0] ;
            A868BarAgrMtr = T01RJ110_A868BarAgrMtr[0] ;
            A1650BarAgrNDes = T01RJ110_A1650BarAgrNDes[0] ;
            A1651BarPNDes = T01RJ110_A1651BarPNDes[0] ;
         }
         else
         {
            A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
            A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
            A1650BarAgrNDes = (short)(0) ;
            A1651BarPNDes = (short)(0) ;
         }
         pr_default.close(98);
         /* Using cursor T01RJ111 */
         pr_default.execute(99, new Object[] {A401EmprCodVi, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         if ( (pr_default.getStatus(99) != 101) )
         {
            A474FindBarAgr = T01RJ111_A474FindBarAgr[0] ;
            n474FindBarAgr = T01RJ111_n474FindBarAgr[0] ;
         }
         else
         {
            A474FindBarAgr = "" ;
            n474FindBarAgr = false ;
         }
         pr_default.close(99);
         /* Using cursor T01RJ112 */
         pr_default.execute(100, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         if ( (pr_default.getStatus(100) != 101) )
         {
            A1653FindDes = T01RJ112_A1653FindDes[0] ;
            n1653FindDes = T01RJ112_n1653FindDes[0] ;
         }
         else
         {
            A1653FindDes = " " ;
            n1653FindDes = false ;
         }
         pr_default.close(100);
         if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A123BarAgrPie = A1650BarAgrNDes ;
         }
         else
         {
            A123BarAgrPie = A1651BarPNDes ;
         }
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
      }
   }

   public void endLevel1RJ13( )
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

   public void scanStart1RJ13( )
   {
      /* Scan By routine */
      /* Using cursor T01RJ113 */
      pr_default.execute(101, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(101) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A119BarAgrCod = T01RJ113_A119BarAgrCod[0] ;
         A124BarAgrReo = T01RJ113_A124BarAgrReo[0] ;
         A122BarAgrPar = T01RJ113_A122BarAgrPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RJ13( )
   {
      /* Scan next routine */
      pr_default.readNext(101);
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(101) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A119BarAgrCod = T01RJ113_A119BarAgrCod[0] ;
         A124BarAgrReo = T01RJ113_A124BarAgrReo[0] ;
         A122BarAgrPar = T01RJ113_A122BarAgrPar[0] ;
      }
   }

   public void scanEnd1RJ13( )
   {
      pr_default.close(101);
   }

   public void afterConfirm1RJ13( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ )
      {
         new app.pexalbdehdr(remoteHandle, context).execute( ) ;
      }
      if ( true /* Level */ && isIns( )  && true /* After */ )
      {
         GXv_int10[0] = (byte)(DecimalUtil.decToDouble(AV43Flagrec)) ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, GXv_int10) ;
         recetasdetinte_agrupacion_impl.this.AV43Flagrec = DecimalUtil.doubleToDec(GXv_int10[0]) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43Flagrec", GXutil.ltrimstr( AV43Flagrec, 10, 2));
      }
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         A671PieAgr = A123BarAgrPie ;
      }
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         A590KgmAgr = A121BarAgrKgm ;
      }
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         A869MtrAgr = A868BarAgrMtr ;
      }
      if ( ( AV36ControlAlbaran == 1 ) && true /* Level */ && ( GXutil.strcmp(AV39Albaranes, " ") != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV39Albaranes, 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( true /* Level */ && isIns( )  && true /* After */ && ( AV43Flagrec.doubleValue() == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Esta Hoja de Ruta tiene RECETA. Cerrar primero", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1RJ13( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RJ13( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RJ13( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RJ13( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RJ13( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RJ13( )
   {
      edtBarAgrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtCliCodAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrSer_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtColNomAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNomAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtColNumAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNumAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNumAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtKgmAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtMtrAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtPieAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrKgm_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrMtr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPie_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNDes_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarPNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPNDes_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFindDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindDes_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFindBarAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindBarAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindBarAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtDisCodAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCodAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtColNoCAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNoCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNoCAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtColNuCAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNuCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNuCAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrDNu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDNu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDNu_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAGrHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAGrHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAGrHdr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrNhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNhdr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
   }

   public void send_integrity_lvl_hashes1RJ13( )
   {
   }

   public void send_integrity_lvl_hashes1RJ12( )
   {
   }

   public void subsflControlProps_4713( )
   {
      edtBarAgrCod_Internalname = "BARAGRCOD_"+sGXsfl_47_idx ;
      edtBarAgrReo_Internalname = "BARAGRREO_"+sGXsfl_47_idx ;
      edtBarAgrPar_Internalname = "BARAGRPAR_"+sGXsfl_47_idx ;
      edtCliCodAgr_Internalname = "CLICODAGR_"+sGXsfl_47_idx ;
      edtBarAgrSer_Internalname = "BARAGRSER_"+sGXsfl_47_idx ;
      edtBarAgrDsc_Internalname = "BARAGRDSC_"+sGXsfl_47_idx ;
      edtColNomAgr_Internalname = "COLNOMAGR_"+sGXsfl_47_idx ;
      edtColNumAgr_Internalname = "COLNUMAGR_"+sGXsfl_47_idx ;
      edtKgmAgr_Internalname = "KGMAGR_"+sGXsfl_47_idx ;
      edtMtrAgr_Internalname = "MTRAGR_"+sGXsfl_47_idx ;
      edtPieAgr_Internalname = "PIEAGR_"+sGXsfl_47_idx ;
      edtBarAgrKgm_Internalname = "BARAGRKGM_"+sGXsfl_47_idx ;
      edtBarAgrMtr_Internalname = "BARAGRMTR_"+sGXsfl_47_idx ;
      edtBarAgrPie_Internalname = "BARAGRPIE_"+sGXsfl_47_idx ;
      edtBarAgrNDes_Internalname = "BARAGRNDES_"+sGXsfl_47_idx ;
      edtBarPNDes_Internalname = "BARPNDES_"+sGXsfl_47_idx ;
      edtFindDes_Internalname = "FINDDES_"+sGXsfl_47_idx ;
      edtFindBarAgr_Internalname = "FINDBARAGR_"+sGXsfl_47_idx ;
      edtDisCodAgr_Internalname = "DISCODAGR_"+sGXsfl_47_idx ;
      edtColNoCAgr_Internalname = "COLNOCAGR_"+sGXsfl_47_idx ;
      edtColNuCAgr_Internalname = "COLNUCAGR_"+sGXsfl_47_idx ;
      edtBarAgrDNu_Internalname = "BARAGRDNU_"+sGXsfl_47_idx ;
      edtBarAGrHdr_Internalname = "BARAGRHDR_"+sGXsfl_47_idx ;
      edtBarAgrNhdr_Internalname = "BARAGRNHDR_"+sGXsfl_47_idx ;
   }

   public void subsflControlProps_fel_4713( )
   {
      edtBarAgrCod_Internalname = "BARAGRCOD_"+sGXsfl_47_fel_idx ;
      edtBarAgrReo_Internalname = "BARAGRREO_"+sGXsfl_47_fel_idx ;
      edtBarAgrPar_Internalname = "BARAGRPAR_"+sGXsfl_47_fel_idx ;
      edtCliCodAgr_Internalname = "CLICODAGR_"+sGXsfl_47_fel_idx ;
      edtBarAgrSer_Internalname = "BARAGRSER_"+sGXsfl_47_fel_idx ;
      edtBarAgrDsc_Internalname = "BARAGRDSC_"+sGXsfl_47_fel_idx ;
      edtColNomAgr_Internalname = "COLNOMAGR_"+sGXsfl_47_fel_idx ;
      edtColNumAgr_Internalname = "COLNUMAGR_"+sGXsfl_47_fel_idx ;
      edtKgmAgr_Internalname = "KGMAGR_"+sGXsfl_47_fel_idx ;
      edtMtrAgr_Internalname = "MTRAGR_"+sGXsfl_47_fel_idx ;
      edtPieAgr_Internalname = "PIEAGR_"+sGXsfl_47_fel_idx ;
      edtBarAgrKgm_Internalname = "BARAGRKGM_"+sGXsfl_47_fel_idx ;
      edtBarAgrMtr_Internalname = "BARAGRMTR_"+sGXsfl_47_fel_idx ;
      edtBarAgrPie_Internalname = "BARAGRPIE_"+sGXsfl_47_fel_idx ;
      edtBarAgrNDes_Internalname = "BARAGRNDES_"+sGXsfl_47_fel_idx ;
      edtBarPNDes_Internalname = "BARPNDES_"+sGXsfl_47_fel_idx ;
      edtFindDes_Internalname = "FINDDES_"+sGXsfl_47_fel_idx ;
      edtFindBarAgr_Internalname = "FINDBARAGR_"+sGXsfl_47_fel_idx ;
      edtDisCodAgr_Internalname = "DISCODAGR_"+sGXsfl_47_fel_idx ;
      edtColNoCAgr_Internalname = "COLNOCAGR_"+sGXsfl_47_fel_idx ;
      edtColNuCAgr_Internalname = "COLNUCAGR_"+sGXsfl_47_fel_idx ;
      edtBarAgrDNu_Internalname = "BARAGRDNU_"+sGXsfl_47_fel_idx ;
      edtBarAGrHdr_Internalname = "BARAGRHDR_"+sGXsfl_47_fel_idx ;
      edtBarAgrNhdr_Internalname = "BARAGRNHDR_"+sGXsfl_47_fel_idx ;
   }

   public void addRow1RJ13( )
   {
      nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4713( ) ;
      sendRow1RJ13( ) ;
   }

   public void sendRow1RJ13( )
   {
      Gridlevel_baragrRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_baragr_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_baragr_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_baragr_Class, "") != 0 )
         {
            subGridlevel_baragr_Linesclass = subGridlevel_baragr_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_baragr_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_baragr_Backstyle = (byte)(0) ;
         subGridlevel_baragr_Backcolor = subGridlevel_baragr_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_baragr_Class, "") != 0 )
         {
            subGridlevel_baragr_Linesclass = subGridlevel_baragr_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_baragr_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_baragr_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_baragr_Class, "") != 0 )
         {
            subGridlevel_baragr_Linesclass = subGridlevel_baragr_Class+"Odd" ;
         }
         subGridlevel_baragr_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_baragr_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_baragr_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_47_idx) % (2))) == 0 )
         {
            subGridlevel_baragr_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_baragr_Class, "") != 0 )
            {
               subGridlevel_baragr_Linesclass = subGridlevel_baragr_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_baragr_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_baragr_Class, "") != 0 )
            {
               subGridlevel_baragr_Linesclass = subGridlevel_baragr_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_13_" + sGXsfl_47_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrCod_Internalname,GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A119BarAgrCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAgrCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_13_" + sGXsfl_47_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrReo_Internalname,GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A124BarAgrReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAgrReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_13_" + sGXsfl_47_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrPar_Internalname,GXutil.rtrim( A122BarAgrPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAgrPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCodAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCodAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1508CliCodAgr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1508CliCodAgr), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCodAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliCodAgr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrSer_Internalname,GXutil.rtrim( A1245BarAgrSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAgrSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrDsc_Internalname,GXutil.rtrim( A1507BarAgrDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAgrDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNomAgr_Internalname,GXutil.rtrim( A1510ColNomAgr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNomAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtColNomAgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNumAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtColNumAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1512ColNumAgr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1512ColNumAgr), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNumAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtColNumAgr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKgmAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtKgmAgr_Enabled!=0) ? localUtil.format( A590KgmAgr, "ZZZZZ9.99") : localUtil.format( A590KgmAgr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKgmAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtKgmAgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtrAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMtrAgr_Enabled!=0) ? localUtil.format( A869MtrAgr, "ZZZZZ9.99") : localUtil.format( A869MtrAgr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMtrAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMtrAgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPieAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPieAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A671PieAgr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A671PieAgr), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPieAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPieAgr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAgrKgm_Enabled!=0) ? localUtil.format( A121BarAgrKgm, "ZZZZZ9.99") : localUtil.format( A121BarAgrKgm, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAgrKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAgrMtr_Enabled!=0) ? localUtil.format( A868BarAgrMtr, "ZZZZZ9.99") : localUtil.format( A868BarAgrMtr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAgrMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrPie_Internalname,GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAgrPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A123BarAgrPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A123BarAgrPie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAgrPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrNDes_Internalname,GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAgrNDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1650BarAgrNDes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1650BarAgrNDes), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrNDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAgrNDes_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPNDes_Internalname,GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPNDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1651BarPNDes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1651BarPNDes), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPNDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarPNDes_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFindDes_Internalname,GXutil.rtrim( A1653FindDes),GXutil.rtrim( localUtil.format( A1653FindDes, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFindDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFindDes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFindBarAgr_Internalname,GXutil.rtrim( A474FindBarAgr),GXutil.rtrim( localUtil.format( A474FindBarAgr, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFindBarAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFindBarAgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCodAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisCodAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1513DisCodAgr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1513DisCodAgr), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCodAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtDisCodAgr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNoCAgr_Internalname,GXutil.rtrim( A1509ColNoCAgr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNoCAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtColNoCAgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNuCAgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtColNuCAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1511ColNuCAgr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1511ColNuCAgr), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNuCAgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtColNuCAgr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrDNu_Internalname,GXutil.rtrim( A1649BarAgrDNu),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrDNu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAgrDNu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAGrHdr_Internalname,GXutil.rtrim( A13695BarAGrHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAGrHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAGrHdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_baragrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrNhdr_Internalname,GXutil.rtrim( A13792BarAgrNhdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrNhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAgrNhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_baragrRow);
      send_integrity_lvl_hashes1RJ13( ) ;
      GXCCtl = "Z119BarAgrCod_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z124BarAgrReo_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z122BarAgrPar_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z122BarAgrPar));
      GXCCtl = "Z590KgmAgr_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z671PieAgr_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z869MtrAgr_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1508CliCodAgr_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1245BarAgrSer_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1245BarAgrSer));
      GXCCtl = "Z1507BarAgrDsc_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1507BarAgrDsc));
      GXCCtl = "Z1510ColNomAgr_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1510ColNomAgr));
      GXCCtl = "Z1512ColNumAgr_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1513DisCodAgr_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1509ColNoCAgr_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1509ColNoCAgr));
      GXCCtl = "Z1511ColNuCAgr_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1649BarAgrDNu_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1649BarAgrDNu));
      GXCCtl = "O119BarAgrCod_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_13_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_13_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_13_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_13, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vFASMIN_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV17FasMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vBARCOD_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV9BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV10BarCodPar));
      GXCCtl = "vMODE_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRCOD_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRREO_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRPAR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICODAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCodAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRSER_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRDSC_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLNOMAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNomAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLNUMAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNumAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "KGMAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKgmAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MTRAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PIEAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPieAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRKGM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRMTR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRPIE_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRNDES_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPNDES_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPNDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FINDDES_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FINDBARAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFindBarAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCODAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisCodAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLNOCAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNoCAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLNUCAGR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNuCAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRDNU_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDNu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRHDR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAGrHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRNHDR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_baragrContainer.AddRow(Gridlevel_baragrRow);
   }

   public void readRow1RJ13( )
   {
      nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4713( ) ;
      edtBarAgrCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRCOD_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRREO_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRPAR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCodAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICODAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRSER_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRDSC_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColNomAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNOMAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColNumAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNUMAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtKgmAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "KGMAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMtrAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTRAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPieAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PIEAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRKGM_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRMTR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRPIE_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrNDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRNDES_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPNDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPNDES_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFindDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FINDDES_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFindBarAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FINDBARAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisCodAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCODAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColNoCAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNOCAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColNuCAgr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNUCAGR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrDNu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRDNU_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAGrHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRHDR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrNhdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRNHDR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARAGRCOD_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrCod_Internalname ;
         wbErr = true ;
         A119BarAgrCod = 0 ;
      }
      else
      {
         A119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARAGRREO_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrReo_Internalname ;
         wbErr = true ;
         A124BarAgrReo = (byte)(0) ;
      }
      else
      {
         A124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A122BarAgrPar = httpContext.cgiGet( edtBarAgrPar_Internalname) ;
      A1508CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1245BarAgrSer = httpContext.cgiGet( edtBarAgrSer_Internalname) ;
      A1507BarAgrDsc = httpContext.cgiGet( edtBarAgrDsc_Internalname) ;
      A1510ColNomAgr = httpContext.cgiGet( edtColNomAgr_Internalname) ;
      A1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A590KgmAgr = localUtil.ctond( httpContext.cgiGet( edtKgmAgr_Internalname)) ;
      A869MtrAgr = localUtil.ctond( httpContext.cgiGet( edtMtrAgr_Internalname)) ;
      A671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( edtPieAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A121BarAgrKgm = localUtil.ctond( httpContext.cgiGet( edtBarAgrKgm_Internalname)) ;
      A868BarAgrMtr = localUtil.ctond( httpContext.cgiGet( edtBarAgrMtr_Internalname)) ;
      A123BarAgrPie = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAgrPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1650BarAgrNDes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAgrNDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1651BarPNDes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPNDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1653FindDes = GXutil.upper( httpContext.cgiGet( edtFindDes_Internalname)) ;
      n1653FindDes = false ;
      A474FindBarAgr = GXutil.upper( httpContext.cgiGet( edtFindBarAgr_Internalname)) ;
      n474FindBarAgr = false ;
      A1513DisCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1509ColNoCAgr = httpContext.cgiGet( edtColNoCAgr_Internalname) ;
      A1511ColNuCAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNuCAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1649BarAgrDNu = httpContext.cgiGet( edtBarAgrDNu_Internalname) ;
      A13695BarAGrHdr = httpContext.cgiGet( edtBarAGrHdr_Internalname) ;
      A13792BarAgrNhdr = httpContext.cgiGet( edtBarAgrNhdr_Internalname) ;
      GXCCtl = "Z119BarAgrCod_" + sGXsfl_47_idx ;
      Z119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z124BarAgrReo_" + sGXsfl_47_idx ;
      Z124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z122BarAgrPar_" + sGXsfl_47_idx ;
      Z122BarAgrPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z590KgmAgr_" + sGXsfl_47_idx ;
      Z590KgmAgr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z671PieAgr_" + sGXsfl_47_idx ;
      Z671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z869MtrAgr_" + sGXsfl_47_idx ;
      Z869MtrAgr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1508CliCodAgr_" + sGXsfl_47_idx ;
      Z1508CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1245BarAgrSer_" + sGXsfl_47_idx ;
      Z1245BarAgrSer = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1507BarAgrDsc_" + sGXsfl_47_idx ;
      Z1507BarAgrDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1510ColNomAgr_" + sGXsfl_47_idx ;
      Z1510ColNomAgr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1512ColNumAgr_" + sGXsfl_47_idx ;
      Z1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1513DisCodAgr_" + sGXsfl_47_idx ;
      Z1513DisCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1509ColNoCAgr_" + sGXsfl_47_idx ;
      Z1509ColNoCAgr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1511ColNuCAgr_" + sGXsfl_47_idx ;
      Z1511ColNuCAgr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1649BarAgrDNu_" + sGXsfl_47_idx ;
      Z1649BarAgrDNu = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O119BarAgrCod_" + sGXsfl_47_idx ;
      O119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_13_" + sGXsfl_47_idx ;
      nRcdDeleted_13 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_13_" + sGXsfl_47_idx ;
      nRcdExists_13 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_13_" + sGXsfl_47_idx ;
      nIsMod_13 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarAgrNhdr_Enabled = edtBarAgrNhdr_Enabled ;
      defedtBarAGrHdr_Enabled = edtBarAGrHdr_Enabled ;
      defedtBarAgrDNu_Enabled = edtBarAgrDNu_Enabled ;
      defedtColNuCAgr_Enabled = edtColNuCAgr_Enabled ;
      defedtColNoCAgr_Enabled = edtColNoCAgr_Enabled ;
      defedtDisCodAgr_Enabled = edtDisCodAgr_Enabled ;
      defedtFindBarAgr_Enabled = edtFindBarAgr_Enabled ;
      defedtFindDes_Enabled = edtFindDes_Enabled ;
      defedtBarPNDes_Enabled = edtBarPNDes_Enabled ;
      defedtBarAgrNDes_Enabled = edtBarAgrNDes_Enabled ;
      defedtBarAgrPie_Enabled = edtBarAgrPie_Enabled ;
      defedtBarAgrMtr_Enabled = edtBarAgrMtr_Enabled ;
      defedtBarAgrKgm_Enabled = edtBarAgrKgm_Enabled ;
      defedtPieAgr_Enabled = edtPieAgr_Enabled ;
      defedtMtrAgr_Enabled = edtMtrAgr_Enabled ;
      defedtKgmAgr_Enabled = edtKgmAgr_Enabled ;
      defedtColNumAgr_Enabled = edtColNumAgr_Enabled ;
      defedtColNomAgr_Enabled = edtColNomAgr_Enabled ;
      defedtBarAgrDsc_Enabled = edtBarAgrDsc_Enabled ;
      defedtBarAgrSer_Enabled = edtBarAgrSer_Enabled ;
      defedtCliCodAgr_Enabled = edtCliCodAgr_Enabled ;
      defedtBarAgrPar_Enabled = edtBarAgrPar_Enabled ;
      defedtBarAgrReo_Enabled = edtBarAgrReo_Enabled ;
      defedtBarAgrCod_Enabled = edtBarAgrCod_Enabled ;
   }

   public void confirmValues1RJ0( )
   {
      nGXsfl_47_idx = 0 ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4713( ) ;
      while ( nGXsfl_47_idx < nRC_GXsfl_47 )
      {
         nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_4713( ) ;
         httpContext.changePostValue( "Z119BarAgrCod_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z119BarAgrCod_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z119BarAgrCod_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z124BarAgrReo_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z124BarAgrReo_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z124BarAgrReo_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z122BarAgrPar_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z122BarAgrPar_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z122BarAgrPar_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z590KgmAgr_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z590KgmAgr_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z590KgmAgr_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z671PieAgr_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z671PieAgr_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z671PieAgr_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z869MtrAgr_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z869MtrAgr_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z869MtrAgr_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z1508CliCodAgr_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1508CliCodAgr_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1508CliCodAgr_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z1245BarAgrSer_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1245BarAgrSer_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1245BarAgrSer_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z1507BarAgrDsc_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1507BarAgrDsc_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1507BarAgrDsc_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z1510ColNomAgr_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1510ColNomAgr_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1510ColNomAgr_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z1512ColNumAgr_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1512ColNumAgr_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1512ColNumAgr_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z1513DisCodAgr_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1513DisCodAgr_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1513DisCodAgr_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z1509ColNoCAgr_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1509ColNoCAgr_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1509ColNoCAgr_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z1511ColNuCAgr_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1511ColNuCAgr_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1511ColNuCAgr_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z1649BarAgrDNu_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1649BarAgrDNu_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1649BarAgrDNu_"+sGXsfl_47_idx) ;
      }
      httpContext.changePostValue( "O119BarAgrCod", httpContext.cgiGet( "T119BarAgrCod")) ;
      httpContext.deletePostValue( "T119BarAgrCod") ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetasdetinte_agrupacion", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetasdeTinte_Agrupacion");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("BarSer", GXutil.rtrim( localUtil.format( A212BarSer, "")));
      forbiddenHiddens.add("BarEncCli", GXutil.rtrim( localUtil.format( A4812BarEncCli, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetasdetinte_agrupacion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z236BarVolMaq", GXutil.ltrim( localUtil.ntoc( Z236BarVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4812BarEncCli", GXutil.rtrim( Z4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "O13846BarAgrCant", GXutil.ltrim( localUtil.ntoc( O13846BarAgrCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_47", GXutil.ltrim( localUtil.ntoc( nGXsfl_47_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N130BarCodPar", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV10BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASMIN", GXutil.ltrim( localUtil.ntoc( AV17FasMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASMIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17FasMin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTROLALBARAN", GXutil.ltrim( localUtil.ntoc( AV36ControlAlbaran, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBARANES", AV39Albaranes);
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMAGR", GXutil.ltrim( localUtil.ntoc( AV14FlagMAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGELI", GXutil.ltrim( localUtil.ntoc( AV15FlagEli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOLNUMAGR", GXutil.ltrim( localUtil.ntoc( AV35ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOLNOMAGR", GXutil.rtrim( AV34ColNomAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGRSER", GXutil.rtrim( AV33BarAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICODAGR", GXutil.ltrim( localUtil.ntoc( AV32CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGREC", GXutil.ltrim( localUtil.ntoc( AV43Flagrec, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Objectcall", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Enabled", GXutil.booltostr( Dvelop_confirmpanel_eliminaragrupacion_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Confirmtype));
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
      return formatLink("app.recetasdetinte_agrupacion", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "RecetasdeTinte_Agrupacion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recetas de Tinte (Agrupacion)", "") ;
   }

   public void initializeNonKey1RJ12( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A13696BarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      A401EmprCodVi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
      A478FindVolMax = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
      A479FindVolMed = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
      A480FindVolMin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      A13878PedidoClie = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      AV39Albaranes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Albaranes", AV39Albaranes);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A143BarDisNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A120BarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A236BarVolMaq = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A13846BarAgrCant = DecimalUtil.ZERO ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A4812BarEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      O13846BarAgrCant = A13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      Z361DisCod = 0 ;
      Z2759BarMaqGru = "" ;
      Z143BarDisNum = "" ;
      Z120BarAgrEst = "" ;
      Z180BarMaqCod = "" ;
      Z236BarVolMaq = 0 ;
      Z213BarSit = (byte)(0) ;
      Z212BarSer = "" ;
      Z135BarColNom = "" ;
      Z136BarColNum = 0 ;
      Z4812BarEncCli = "" ;
   }

   public void initAll1RJ12( )
   {
      A396EmprCod = "" ;
      n396EmprCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      initializeNonKey1RJ12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1RJ13( )
   {
      AV35ColNumAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35ColNumAgr), 6, 0));
      AV34ColNomAgr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34ColNomAgr", AV34ColNomAgr);
      AV33BarAgrSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33BarAgrSer", AV33BarAgrSer);
      AV32CliCodAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32CliCodAgr), 6, 0));
      AV43Flagrec = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Flagrec", GXutil.ltrimstr( AV43Flagrec, 10, 2));
      A590KgmAgr = DecimalUtil.ZERO ;
      A671PieAgr = (short)(0) ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A123BarAgrPie = (short)(0) ;
      A121BarAgrKgm = DecimalUtil.ZERO ;
      A474FindBarAgr = "" ;
      n474FindBarAgr = false ;
      A868BarAgrMtr = DecimalUtil.ZERO ;
      A1650BarAgrNDes = (short)(0) ;
      A1651BarPNDes = (short)(0) ;
      A1653FindDes = "" ;
      n1653FindDes = false ;
      A13695BarAGrHdr = "" ;
      A13792BarAgrNhdr = "" ;
      A1508CliCodAgr = 0 ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1510ColNomAgr = "" ;
      A1512ColNumAgr = 0 ;
      A1513DisCodAgr = 0 ;
      A1509ColNoCAgr = "" ;
      A1511ColNuCAgr = 0 ;
      A1649BarAgrDNu = "" ;
      Z590KgmAgr = DecimalUtil.ZERO ;
      Z671PieAgr = (short)(0) ;
      Z869MtrAgr = DecimalUtil.ZERO ;
      Z1508CliCodAgr = 0 ;
      Z1245BarAgrSer = "" ;
      Z1507BarAgrDsc = "" ;
      Z1510ColNomAgr = "" ;
      Z1512ColNumAgr = 0 ;
      Z1513DisCodAgr = 0 ;
      Z1509ColNoCAgr = "" ;
      Z1511ColNuCAgr = 0 ;
      Z1649BarAgrDNu = "" ;
   }

   public void initAll1RJ13( )
   {
      A119BarAgrCod = 0 ;
      A124BarAgrReo = (byte)(0) ;
      A122BarAgrPar = "" ;
      initializeNonKey1RJ13( ) ;
   }

   public void standaloneModalInsert1RJ13( )
   {
      AV14FlagMAgr = iV14FlagMAgr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FlagMAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14FlagMAgr), 4, 0));
      A13846BarAgrCant = i13846BarAgrCant ;
      n13846BarAgrCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415121182", true, true);
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
      httpContext.AddJavascriptSource("recetasdetinte_agrupacion.js", "?202682415121182", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties13( )
   {
      edtBarAgrNhdr_Enabled = defedtBarAgrNhdr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNhdr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAGrHdr_Enabled = defedtBarAGrHdr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAGrHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAGrHdr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrDNu_Enabled = defedtBarAgrDNu_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDNu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDNu_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtColNuCAgr_Enabled = defedtColNuCAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNuCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNuCAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtColNoCAgr_Enabled = defedtColNoCAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNoCAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNoCAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtDisCodAgr_Enabled = defedtDisCodAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCodAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFindBarAgr_Enabled = defedtFindBarAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindBarAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindBarAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFindDes_Enabled = defedtFindDes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindDes_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarPNDes_Enabled = defedtBarPNDes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPNDes_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrNDes_Enabled = defedtBarAgrNDes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrNDes_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrPie_Enabled = defedtBarAgrPie_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPie_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrMtr_Enabled = defedtBarAgrMtr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrMtr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrKgm_Enabled = defedtBarAgrKgm_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrKgm_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtPieAgr_Enabled = defedtPieAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtMtrAgr_Enabled = defedtMtrAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtKgmAgr_Enabled = defedtKgmAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtColNumAgr_Enabled = defedtColNumAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNumAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNumAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtColNomAgr_Enabled = defedtColNomAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNomAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrDsc_Enabled = defedtBarAgrDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrSer_Enabled = defedtBarAgrSer_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrSer_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtCliCodAgr_Enabled = defedtCliCodAgr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodAgr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrPar_Enabled = defedtBarAgrPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrReo_Enabled = defedtBarAgrReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtBarAgrCod_Enabled = defedtBarAgrCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
   }

   public void startgridcontrol47( )
   {
      Gridlevel_baragrContainer.AddObjectProperty("GridName", "Gridlevel_baragr");
      Gridlevel_baragrContainer.AddObjectProperty("Header", subGridlevel_baragr_Header);
      Gridlevel_baragrContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_baragrContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_baragr_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_baragrContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.rtrim( A122BarAgrPar));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCodAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.rtrim( A1245BarAgrSer));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.rtrim( A1507BarAgrDsc));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.rtrim( A1510ColNomAgr));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColNomAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColNumAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtKgmAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPieAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPNDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.rtrim( A1653FindDes));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFindDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.rtrim( A474FindBarAgr));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFindBarAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1513DisCodAgr, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisCodAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.rtrim( A1509ColNoCAgr));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColNoCAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColNuCAgr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.rtrim( A1649BarAgrDNu));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrDNu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.rtrim( A13695BarAGrHdr));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAGrHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_baragrColumn.AddObjectProperty("Value", GXutil.rtrim( A13792BarAgrNhdr));
      Gridlevel_baragrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrNhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddColumnProperties(Gridlevel_baragrColumn);
      Gridlevel_baragrContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_baragr_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_baragr_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_baragr_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_baragr_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_baragr_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_baragr_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_baragrContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_baragr_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarMaqCod_Internalname = "BARMAQCOD" ;
      edtBarVolMaq_Internalname = "BARVOLMAQ" ;
      edtBarSer_Internalname = "BARSER" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtBarAgrCod_Internalname = "BARAGRCOD" ;
      edtBarAgrReo_Internalname = "BARAGRREO" ;
      edtBarAgrPar_Internalname = "BARAGRPAR" ;
      edtCliCodAgr_Internalname = "CLICODAGR" ;
      edtBarAgrSer_Internalname = "BARAGRSER" ;
      edtBarAgrDsc_Internalname = "BARAGRDSC" ;
      edtColNomAgr_Internalname = "COLNOMAGR" ;
      edtColNumAgr_Internalname = "COLNUMAGR" ;
      edtKgmAgr_Internalname = "KGMAGR" ;
      edtMtrAgr_Internalname = "MTRAGR" ;
      edtPieAgr_Internalname = "PIEAGR" ;
      edtBarAgrKgm_Internalname = "BARAGRKGM" ;
      edtBarAgrMtr_Internalname = "BARAGRMTR" ;
      edtBarAgrPie_Internalname = "BARAGRPIE" ;
      edtBarAgrNDes_Internalname = "BARAGRNDES" ;
      edtBarPNDes_Internalname = "BARPNDES" ;
      edtFindDes_Internalname = "FINDDES" ;
      edtFindBarAgr_Internalname = "FINDBARAGR" ;
      edtDisCodAgr_Internalname = "DISCODAGR" ;
      edtColNoCAgr_Internalname = "COLNOCAGR" ;
      edtColNuCAgr_Internalname = "COLNUCAGR" ;
      edtBarAgrDNu_Internalname = "BARAGRDNU" ;
      edtBarAGrHdr_Internalname = "BARAGRHDR" ;
      edtBarAgrNhdr_Internalname = "BARAGRNHDR" ;
      divTableleaflevel_baragr_Internalname = "TABLELEAFLEVEL_BARAGR" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtneliminarlinea_Internalname = "BTNELIMINARLINEA" ;
      bttBtneliminaragrupacion_Internalname = "BTNELIMINARAGRUPACION" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtPedidoClie_Internalname = "PEDIDOCLIE" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtBarDisNum_Internalname = "BARDISNUM" ;
      edtEmprCodVi_Internalname = "EMPRCODVI" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      edtFindVolMed_Internalname = "FINDVOLMED" ;
      edtFindVolMin_Internalname = "FINDVOLMIN" ;
      edtFindVolMax_Internalname = "FINDVOLMAX" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtBarAgrCant_Internalname = "BARAGRCANT" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      Dvelop_confirmpanel_eliminarlinea_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      tblTabledvelop_confirmpanel_eliminarlinea_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      Dvelop_confirmpanel_eliminaragrupacion_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION" ;
      tblTabledvelop_confirmpanel_eliminaragrupacion_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARAGRUPACION" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_baragr_Internalname = "GRIDLEVEL_BARAGR" ;
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
      subGridlevel_baragr_Allowcollapsing = (byte)(0) ;
      subGridlevel_baragr_Allowselection = (byte)(0) ;
      subGridlevel_baragr_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Recetas de Tinte (Agrupacion)", "") );
      edtBarAgrNhdr_Jsonclick = "" ;
      edtBarAGrHdr_Jsonclick = "" ;
      edtBarAgrDNu_Jsonclick = "" ;
      edtColNuCAgr_Jsonclick = "" ;
      edtColNoCAgr_Jsonclick = "" ;
      edtDisCodAgr_Jsonclick = "" ;
      edtFindBarAgr_Jsonclick = "" ;
      edtFindDes_Jsonclick = "" ;
      edtBarPNDes_Jsonclick = "" ;
      edtBarAgrNDes_Jsonclick = "" ;
      edtBarAgrPie_Jsonclick = "" ;
      edtBarAgrMtr_Jsonclick = "" ;
      edtBarAgrKgm_Jsonclick = "" ;
      edtPieAgr_Jsonclick = "" ;
      edtMtrAgr_Jsonclick = "" ;
      edtKgmAgr_Jsonclick = "" ;
      edtColNumAgr_Jsonclick = "" ;
      edtColNomAgr_Jsonclick = "" ;
      edtBarAgrDsc_Jsonclick = "" ;
      edtBarAgrSer_Jsonclick = "" ;
      edtCliCodAgr_Jsonclick = "" ;
      edtBarAgrPar_Jsonclick = "" ;
      edtBarAgrReo_Jsonclick = "" ;
      edtBarAgrCod_Jsonclick = "" ;
      subGridlevel_baragr_Class = "GridNoBorder WorkWith" ;
      subGridlevel_baragr_Backcolorstyle = (byte)(0) ;
      edtBarAgrNhdr_Enabled = 0 ;
      edtBarAGrHdr_Enabled = 0 ;
      edtBarAgrDNu_Enabled = 0 ;
      edtColNuCAgr_Enabled = 0 ;
      edtColNoCAgr_Enabled = 0 ;
      edtDisCodAgr_Enabled = 0 ;
      edtFindBarAgr_Enabled = 0 ;
      edtFindDes_Enabled = 0 ;
      edtBarPNDes_Enabled = 0 ;
      edtBarAgrNDes_Enabled = 0 ;
      edtBarAgrPie_Enabled = 0 ;
      edtBarAgrMtr_Enabled = 0 ;
      edtBarAgrKgm_Enabled = 0 ;
      edtPieAgr_Enabled = 0 ;
      edtMtrAgr_Enabled = 0 ;
      edtKgmAgr_Enabled = 0 ;
      edtColNumAgr_Enabled = 0 ;
      edtColNomAgr_Enabled = 0 ;
      edtBarAgrDsc_Enabled = 0 ;
      edtBarAgrSer_Enabled = 0 ;
      edtCliCodAgr_Enabled = 0 ;
      edtBarAgrPar_Enabled = 1 ;
      edtBarAgrReo_Enabled = 1 ;
      edtBarAgrCod_Enabled = 1 ;
      Dvelop_confirmpanel_eliminaragrupacion_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext = "¿Desea eliminar la Agrupacion?" ;
      Dvelop_confirmpanel_eliminaragrupacion_Title = "" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminarlinea_Title = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Enabled = 1 ;
      edtBarColNum_Visible = 1 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Enabled = 1 ;
      edtBarColNom_Visible = 1 ;
      edtBarAgrCant_Jsonclick = "" ;
      edtBarAgrCant_Enabled = 0 ;
      edtBarAgrCant_Visible = 1 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Enabled = 1 ;
      edtBarSit_Visible = 1 ;
      edtFindVolMax_Jsonclick = "" ;
      edtFindVolMax_Enabled = 0 ;
      edtFindVolMax_Visible = 1 ;
      edtFindVolMin_Jsonclick = "" ;
      edtFindVolMin_Enabled = 0 ;
      edtFindVolMin_Visible = 1 ;
      edtFindVolMed_Jsonclick = "" ;
      edtFindVolMed_Enabled = 0 ;
      edtFindVolMed_Visible = 1 ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAgrEst_Enabled = 1 ;
      edtBarAgrEst_Visible = 1 ;
      edtEmprCodVi_Jsonclick = "" ;
      edtEmprCodVi_Enabled = 0 ;
      edtEmprCodVi_Visible = 1 ;
      edtBarDisNum_Jsonclick = "" ;
      edtBarDisNum_Enabled = 1 ;
      edtBarDisNum_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtPedidoClie_Jsonclick = "" ;
      edtPedidoClie_Enabled = 0 ;
      edtPedidoClie_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodPar_Visible = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCodReo_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtBarCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      bttBtneliminaragrupacion_Visible = 1 ;
      bttBtneliminarlinea_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Enabled = 0 ;
      edtBarVolMaq_Jsonclick = "" ;
      edtBarVolMaq_Enabled = 0 ;
      edtBarMaqCod_Jsonclick = "" ;
      edtBarMaqCod_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Enabled = 0 ;
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

   public void gx1asapedidoclie1RJ12( String A396EmprCod ,
                                      String A4812BarEncCli ,
                                      String A143BarDisNum )
   {
      GXt_char1 = A13878PedidoClie ;
      GXv_char12[0] = A396EmprCod ;
      GXv_char11[0] = A4812BarEncCli ;
      GXv_char4[0] = A143BarDisNum ;
      GXv_char3[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_char4, GXv_char3) ;
      recetasdetinte_agrupacion_impl.this.A396EmprCod = GXv_char12[0] ;
      recetasdetinte_agrupacion_impl.this.A4812BarEncCli = GXv_char11[0] ;
      recetasdetinte_agrupacion_impl.this.A143BarDisNum = GXv_char4[0] ;
      recetasdetinte_agrupacion_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A13878PedidoClie = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13878PedidoClie))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_24_1RJ12( short AV36ControlAlbaran ,
                            int A129BarCod )
   {
      if ( ( AV36ControlAlbaran == 1 ) && true /* Level */ && true /* After */ )
      {
         new app.pexalbdehdr(remoteHandle, context).execute( ) ;
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

   public void xc_26_1RJ12( String A396EmprCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            short AV14FlagMAgr ,
                            short AV15FlagEli ,
                            short AV17FasMin )
   {
      if ( true /* After */ && ( ( AV14FlagMAgr == 1 ) || ( AV15FlagEli == 1 ) ) && ( AV17FasMin == 1 ) )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int13[0] = A129BarCod ;
         GXv_int10[0] = A132BarCodReo ;
         GXv_char11[0] = A130BarCodPar ;
         new app.pcremag(remoteHandle, context).execute( GXv_char12, GXv_int13, GXv_int10, GXv_char11) ;
         A396EmprCod = GXv_char12[0] ;
         A129BarCod = GXv_int13[0] ;
         A132BarCodReo = GXv_int10[0] ;
         A130BarCodPar = GXv_char11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_56_1RJ13( String A396EmprCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            short AV14FlagMAgr ,
                            short AV15FlagEli ,
                            short AV17FasMin )
   {
      if ( true /* After */ && ( ( AV14FlagMAgr == 1 ) || ( AV15FlagEli == 1 ) ) && ( AV17FasMin == 1 ) )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int13[0] = A129BarCod ;
         GXv_int10[0] = A132BarCodReo ;
         GXv_char11[0] = A130BarCodPar ;
         new app.pcremag(remoteHandle, context).execute( GXv_char12, GXv_int13, GXv_int10, GXv_char11) ;
         A396EmprCod = GXv_char12[0] ;
         A129BarCod = GXv_int13[0] ;
         A132BarCodReo = GXv_int10[0] ;
         A130BarCodPar = GXv_char11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_57_1RJ13( String A396EmprCod ,
                            int A119BarAgrCod ,
                            byte A124BarAgrReo ,
                            String A122BarAgrPar ,
                            int AV32CliCodAgr ,
                            String AV33BarAgrSer ,
                            String AV34ColNomAgr ,
                            int AV35ColNumAgr )
   {
      if ( true /* After */ && true /* Level */ )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int13[0] = A119BarAgrCod ;
         GXv_int10[0] = A124BarAgrReo ;
         GXv_char11[0] = A122BarAgrPar ;
         GXv_int9[0] = AV32CliCodAgr ;
         GXv_char4[0] = AV33BarAgrSer ;
         GXv_char3[0] = AV34ColNomAgr ;
         GXv_int8[0] = AV35ColNumAgr ;
         new app.pbushra(remoteHandle, context).execute( GXv_char12, GXv_int13, GXv_int10, GXv_char11, GXv_int9, GXv_char4, GXv_char3, GXv_int8) ;
         A396EmprCod = GXv_char12[0] ;
         A119BarAgrCod = GXv_int13[0] ;
         A124BarAgrReo = GXv_int10[0] ;
         A122BarAgrPar = GXv_char11[0] ;
         AV32CliCodAgr = GXv_int9[0] ;
         AV33BarAgrSer = GXv_char4[0] ;
         AV34ColNomAgr = GXv_char3[0] ;
         AV35ColNumAgr = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV32CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32CliCodAgr), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33BarAgrSer", AV33BarAgrSer);
         httpContext.ajax_rsp_assign_attri("", false, "AV34ColNomAgr", AV34ColNomAgr);
         httpContext.ajax_rsp_assign_attri("", false, "AV35ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35ColNumAgr), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A122BarAgrPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32CliCodAgr, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV33BarAgrSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV34ColNomAgr))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35ColNumAgr, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_58_1RJ13( String A396EmprCod ,
                            int A119BarAgrCod ,
                            byte A124BarAgrReo ,
                            String A122BarAgrPar ,
                            int A1508CliCodAgr ,
                            String A1245BarAgrSer ,
                            String A1510ColNomAgr ,
                            int A1512ColNumAgr )
   {
      if ( true /* After */ && true /* Level */ )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int13[0] = A119BarAgrCod ;
         GXv_int10[0] = A124BarAgrReo ;
         GXv_char11[0] = A122BarAgrPar ;
         GXv_int9[0] = A1508CliCodAgr ;
         GXv_char4[0] = A1245BarAgrSer ;
         GXv_char3[0] = A1510ColNomAgr ;
         GXv_int8[0] = A1512ColNumAgr ;
         new app.pbushra(remoteHandle, context).execute( GXv_char12, GXv_int13, GXv_int10, GXv_char11, GXv_int9, GXv_char4, GXv_char3, GXv_int8) ;
         A396EmprCod = GXv_char12[0] ;
         A119BarAgrCod = GXv_int13[0] ;
         A124BarAgrReo = GXv_int10[0] ;
         A122BarAgrPar = GXv_char11[0] ;
         A1508CliCodAgr = GXv_int9[0] ;
         A1245BarAgrSer = GXv_char4[0] ;
         A1510ColNomAgr = GXv_char3[0] ;
         A1512ColNumAgr = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A122BarAgrPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1245BarAgrSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1510ColNomAgr))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_59_1RJ13( String A396EmprCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            int A119BarAgrCod ,
                            byte A124BarAgrReo ,
                            String A122BarAgrPar ,
                            String A180BarMaqCod ,
                            int A236BarVolMaq ,
                            short A671PieAgr ,
                            java.math.BigDecimal A590KgmAgr ,
                            java.math.BigDecimal A869MtrAgr )
   {
      if ( true /* After */ && true /* Level */ )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int13[0] = A129BarCod ;
         GXv_int10[0] = A132BarCodReo ;
         GXv_char11[0] = A130BarCodPar ;
         GXv_int9[0] = A119BarAgrCod ;
         GXv_int6[0] = A124BarAgrReo ;
         GXv_char4[0] = A122BarAgrPar ;
         GXv_char3[0] = A180BarMaqCod ;
         GXv_int8[0] = A236BarVolMaq ;
         GXv_int14[0] = A671PieAgr ;
         GXv_decimal16[0] = A590KgmAgr ;
         GXv_decimal15[0] = A869MtrAgr ;
         new app.pcreagr(remoteHandle, context).execute( GXv_char12, GXv_int13, GXv_int10, GXv_char11, GXv_int9, GXv_int6, GXv_char4, GXv_char3, GXv_int8, GXv_int14, GXv_decimal16, GXv_decimal15) ;
         A396EmprCod = GXv_char12[0] ;
         A129BarCod = GXv_int13[0] ;
         A132BarCodReo = GXv_int10[0] ;
         A130BarCodPar = GXv_char11[0] ;
         A119BarAgrCod = GXv_int9[0] ;
         A124BarAgrReo = GXv_int6[0] ;
         A122BarAgrPar = GXv_char4[0] ;
         A180BarMaqCod = GXv_char3[0] ;
         A236BarVolMaq = GXv_int8[0] ;
         A671PieAgr = GXv_int14[0] ;
         A590KgmAgr = GXv_decimal16[0] ;
         A869MtrAgr = GXv_decimal15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A122BarAgrPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A180BarMaqCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A236BarVolMaq, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_60_1RJ13( String Gx_mode ,
                            String A396EmprCod ,
                            int A119BarAgrCod ,
                            byte A124BarAgrReo ,
                            String A122BarAgrPar )
   {
      if ( true /* Level */ && isIns( )  && true /* After */ )
      {
         GXv_int10[0] = (byte)(DecimalUtil.decToDouble(AV43Flagrec)) ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, GXv_int10) ;
         AV43Flagrec = DecimalUtil.doubleToDec(GXv_int10[0]) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43Flagrec", GXutil.ltrimstr( AV43Flagrec, 10, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV43Flagrec, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_61_1RJ13( int A119BarAgrCod )
   {
      if ( true /* Level */ && true /* After */ )
      {
         new app.pexalbdehdr(remoteHandle, context).execute( ) ;
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

   public void xc_68_1RJ13( String Gx_mode ,
                            String A396EmprCod ,
                            int AV8BarCod ,
                            byte AV9BarCodReo ,
                            String AV10BarCodPar ,
                            int A119BarAgrCod ,
                            short AV17FasMin )
   {
      if ( isIns( )  && true /* Level */ && ( AV17FasMin == 1 ) )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int13[0] = AV8BarCod ;
         GXv_int10[0] = AV9BarCodReo ;
         GXv_char11[0] = AV10BarCodPar ;
         new app.pelimin(remoteHandle, context).execute( GXv_char12, GXv_int13, GXv_int10, GXv_char11) ;
         A396EmprCod = GXv_char12[0] ;
         AV8BarCod = GXv_int13[0] ;
         AV9BarCodReo = GXv_int10[0] ;
         AV10BarCodPar = GXv_char11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV9BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV10BarCodPar))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_baragr_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_4713( ) ;
      while ( nGXsfl_47_idx <= nRC_GXsfl_47 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1RJ13( ) ;
         standaloneModal1RJ13( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1RJ13( ) ;
         nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_4713( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_baragrContainer)) ;
      /* End function gxnrGridlevel_baragr_newrow */
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

   public void valid_Emprcod( )
   {
      n396EmprCod = false ;
      n407EmprNom = false ;
      n252CliCod = false ;
      /* Using cursor T01RJ30 */
      pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01RJ30_A407EmprNom[0] ;
      n407EmprNom = T01RJ30_n407EmprNom[0] ;
      pr_default.close(22);
      /* Using cursor T01RJ33 */
      pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A252CliCod = T01RJ33_A252CliCod[0] ;
      n252CliCod = T01RJ33_n252CliCod[0] ;
      A365DisDes = T01RJ33_A365DisDes[0] ;
      pr_default.close(24);
      A401EmprCodVi = A396EmprCod ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", GXutil.rtrim( A401EmprCodVi));
   }

   public void valid_Barcod( )
   {
      n129BarCod = false ;
      if ( true /* Level */ && ( AV17FasMin == 1 ) )
      {
         AV8BarCod = A129BarCod ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), ".", "")));
   }

   public void valid_Barcodreo( )
   {
      n132BarCodReo = false ;
      if ( true /* Level */ && ( AV17FasMin == 1 ) )
      {
         AV9BarCodReo = A132BarCodReo ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.ltrim( localUtil.ntoc( AV9BarCodReo, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Barcodpar( )
   {
      n396EmprCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      n13846BarAgrCant = false ;
      /* Using cursor T01RJ32 */
      pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A13846BarAgrCant = T01RJ32_A13846BarAgrCant[0] ;
         n13846BarAgrCant = T01RJ32_n13846BarAgrCant[0] ;
      }
      else
      {
         A13846BarAgrCant = DecimalUtil.doubleToDec(0) ;
         n13846BarAgrCant = false ;
      }
      pr_default.close(23);
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      if ( true /* Level */ && ( AV17FasMin == 1 ) )
      {
         AV10BarCodPar = A130BarCodPar ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrim( localUtil.ntoc( A13846BarAgrCant, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", GXutil.rtrim( A13696BarNHdr));
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", GXutil.rtrim( AV10BarCodPar));
   }

   public void valid_Barmaqcod( )
   {
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      /* Using cursor T01RJ35 */
      pr_default.execute(25, new Object[] {A180BarMaqCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(25) != 101) )
      {
         A478FindVolMax = T01RJ35_A478FindVolMax[0] ;
         A479FindVolMed = T01RJ35_A479FindVolMed[0] ;
         A480FindVolMin = T01RJ35_A480FindVolMin[0] ;
      }
      else
      {
         A478FindVolMax = 0 ;
         A479FindVolMed = 0 ;
         A480FindVolMin = 0 ;
      }
      pr_default.close(25);
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrim( localUtil.ntoc( A479FindVolMed, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
   }

   public void valid_Bardisnum( )
   {
      n396EmprCod = false ;
      GXt_char1 = A13878PedidoClie ;
      GXv_char12[0] = A396EmprCod ;
      GXv_char11[0] = A4812BarEncCli ;
      GXv_char4[0] = A143BarDisNum ;
      GXv_char3[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_char4, GXv_char3) ;
      recetasdetinte_agrupacion_impl.this.A396EmprCod = GXv_char12[0] ;
      recetasdetinte_agrupacion_impl.this.A4812BarEncCli = GXv_char11[0] ;
      recetasdetinte_agrupacion_impl.this.A143BarDisNum = GXv_char4[0] ;
      recetasdetinte_agrupacion_impl.this.GXt_char1 = GXv_char3[0] ;
      A13878PedidoClie = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", GXutil.rtrim( A13878PedidoClie));
   }

   public void valid_Baragrpar( )
   {
      n396EmprCod = false ;
      n474FindBarAgr = false ;
      n1653FindDes = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      /* Using cursor T01RJ110 */
      pr_default.execute(98, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(98) != 101) )
      {
         A121BarAgrKgm = T01RJ110_A121BarAgrKgm[0] ;
         A868BarAgrMtr = T01RJ110_A868BarAgrMtr[0] ;
         A1650BarAgrNDes = T01RJ110_A1650BarAgrNDes[0] ;
         A1651BarPNDes = T01RJ110_A1651BarPNDes[0] ;
      }
      else
      {
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         A1650BarAgrNDes = (short)(0) ;
         A1651BarPNDes = (short)(0) ;
      }
      pr_default.close(98);
      /* Using cursor T01RJ111 */
      pr_default.execute(99, new Object[] {A401EmprCodVi, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(99) != 101) )
      {
         A474FindBarAgr = T01RJ111_A474FindBarAgr[0] ;
         n474FindBarAgr = T01RJ111_n474FindBarAgr[0] ;
      }
      else
      {
         A474FindBarAgr = "" ;
         n474FindBarAgr = false ;
      }
      pr_default.close(99);
      if ( (GXutil.strcmp("", A474FindBarAgr)==0) && isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de ruta inexistente", ""), 1, "BARAGRPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrPar_Internalname ;
      }
      if ( ( GXutil.strcmp(A474FindBarAgr, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Barcada ya agrupada", ""), 1, "BARAGRPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrPar_Internalname ;
      }
      /* Using cursor T01RJ112 */
      pr_default.execute(100, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(100) != 101) )
      {
         A1653FindDes = T01RJ112_A1653FindDes[0] ;
         n1653FindDes = T01RJ112_n1653FindDes[0] ;
      }
      else
      {
         A1653FindDes = " " ;
         n1653FindDes = false ;
      }
      pr_default.close(100);
      if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A123BarAgrPie = A1650BarAgrNDes ;
      }
      else
      {
         A123BarAgrPie = A1651BarPNDes ;
      }
      A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
      A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
      if ( true /* After */ && true /* Level */ )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_int13[0] = A119BarAgrCod ;
         GXv_int10[0] = A124BarAgrReo ;
         GXv_char11[0] = A122BarAgrPar ;
         GXv_int9[0] = AV32CliCodAgr ;
         GXv_char4[0] = AV33BarAgrSer ;
         GXv_char3[0] = AV34ColNomAgr ;
         GXv_int8[0] = AV35ColNumAgr ;
         new app.pbushra(remoteHandle, context).execute( GXv_char12, GXv_int13, GXv_int10, GXv_char11, GXv_int9, GXv_char4, GXv_char3, GXv_int8) ;
         recetasdetinte_agrupacion_impl.this.A396EmprCod = GXv_char12[0] ;
         A396EmprCod = this.A396EmprCod ;
         recetasdetinte_agrupacion_impl.this.A119BarAgrCod = GXv_int13[0] ;
         A119BarAgrCod = this.A119BarAgrCod ;
         recetasdetinte_agrupacion_impl.this.A124BarAgrReo = GXv_int10[0] ;
         A124BarAgrReo = this.A124BarAgrReo ;
         recetasdetinte_agrupacion_impl.this.A122BarAgrPar = GXv_char11[0] ;
         A122BarAgrPar = this.A122BarAgrPar ;
         recetasdetinte_agrupacion_impl.this.AV32CliCodAgr = GXv_int9[0] ;
         AV32CliCodAgr = this.AV32CliCodAgr ;
         recetasdetinte_agrupacion_impl.this.AV33BarAgrSer = GXv_char4[0] ;
         AV33BarAgrSer = this.AV33BarAgrSer ;
         recetasdetinte_agrupacion_impl.this.AV34ColNomAgr = GXv_char3[0] ;
         AV34ColNomAgr = this.AV34ColNomAgr ;
         recetasdetinte_agrupacion_impl.this.AV35ColNumAgr = GXv_int8[0] ;
         AV35ColNumAgr = this.AV35ColNumAgr ;
      }
      if ( ( A129BarCod == A119BarAgrCod ) && ( A132BarCodReo == A124BarAgrReo ) && ( GXutil.strcmp(A130BarCodPar, A122BarAgrPar) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Misma Hdr en Cabecera que en Lineas", ""), 1, "BARAGRPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrPar_Internalname ;
      }
      if ( true /* Level */ && (IsModified == 1) && ! ( O119BarAgrCod == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se pueden modificar barcadas asociadas", ""), 1, "BARAGRPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrPar_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", GXutil.rtrim( A474FindBarAgr));
      httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", GXutil.rtrim( A1653FindDes));
      httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", GXutil.rtrim( A13792BarAgrNhdr));
      httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", GXutil.rtrim( A13695BarAGrHdr));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", GXutil.rtrim( A122BarAgrPar));
      httpContext.ajax_rsp_assign_attri("", false, "AV32CliCodAgr", GXutil.ltrim( localUtil.ntoc( AV32CliCodAgr, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33BarAgrSer", GXutil.rtrim( AV33BarAgrSer));
      httpContext.ajax_rsp_assign_attri("", false, "AV34ColNomAgr", GXutil.rtrim( AV34ColNomAgr));
      httpContext.ajax_rsp_assign_attri("", false, "AV35ColNumAgr", GXutil.ltrim( localUtil.ntoc( AV35ColNumAgr, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV17FasMin',fld:'vFASMIN',pic:'ZZZ9',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e161RJ2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DOELIMINARLINEA'","{handler:'e111RJ12',iparms:[{av:'A13792BarAgrNhdr',fld:'BARAGRNHDR',pic:''}]");
      setEventMetadata("'DOELIMINARLINEA'",",oparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE","{handler:'e141RJ2',iparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'Result'},{av:'AV17FasMin',fld:'vFASMIN',pic:'ZZZ9',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE",",oparms:[{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("'DOELIMINARAGRUPACION'","{handler:'e121RJ12',iparms:[]");
      setEventMetadata("'DOELIMINARAGRUPACION'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION.CLOSE","{handler:'e151RJ2',iparms:[{av:'Dvelop_confirmpanel_eliminaragrupacion_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION',prop:'Result'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION.CLOSE",",oparms:[{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_BARMAQCOD","{handler:'valid_Barmaqcod',iparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A478FindVolMax',fld:'FINDVOLMAX',pic:'ZZZZ9'},{av:'A479FindVolMed',fld:'FINDVOLMED',pic:'ZZZZ9'},{av:'A480FindVolMin',fld:'FINDVOLMIN',pic:'ZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''}]");
      setEventMetadata("VALID_BARMAQCOD",",oparms:[{av:'A478FindVolMax',fld:'FINDVOLMAX',pic:'ZZZZ9'},{av:'A479FindVolMed',fld:'FINDVOLMED',pic:'ZZZZ9'},{av:'A480FindVolMin',fld:'FINDVOLMIN',pic:'ZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''}]}");
      setEventMetadata("VALID_BARVOLMAQ","{handler:'valid_Barvolmaq',iparms:[]");
      setEventMetadata("VALID_BARVOLMAQ",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A401EmprCodVi',fld:'EMPRCODVI',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A401EmprCodVi',fld:'EMPRCODVI',pic:'@!'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV17FasMin',fld:'vFASMIN',pic:'ZZZ9',hsh:true},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_BARCOD",",oparms:[{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV17FasMin',fld:'vFASMIN',pic:'ZZZ9',hsh:true},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'}]");
      setEventMetadata("VALID_BARCODREO",",oparms:[{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9'}]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV17FasMin',fld:'vFASMIN',pic:'ZZZ9',hsh:true},{av:'A13846BarAgrCant',fld:'BARAGRCANT',pic:'ZZZ,ZZ9.99'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A13846BarAgrCant',fld:'BARAGRCANT',pic:'ZZZ,ZZ9.99'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''}]}");
      setEventMetadata("VALID_BARDISNUM","{handler:'valid_Bardisnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''}]");
      setEventMetadata("VALID_BARDISNUM",",oparms:[{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''}]}");
      setEventMetadata("VALID_EMPRCODVI","{handler:'valid_Emprcodvi',iparms:[]");
      setEventMetadata("VALID_EMPRCODVI",",oparms:[]}");
      setEventMetadata("VALID_BARAGRCOD","{handler:'valid_Baragrcod',iparms:[]");
      setEventMetadata("VALID_BARAGRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARAGRREO","{handler:'valid_Baragrreo',iparms:[]");
      setEventMetadata("VALID_BARAGRREO",",oparms:[]}");
      setEventMetadata("VALID_BARAGRPAR","{handler:'valid_Baragrpar',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O119BarAgrCod'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A401EmprCodVi',fld:'EMPRCODVI',pic:'@!'},{av:'A474FindBarAgr',fld:'FINDBARAGR',pic:'@!'},{av:'A1650BarAgrNDes',fld:'BARAGRNDES',pic:'ZZZ9'},{av:'A1653FindDes',fld:'FINDDES',pic:'@!'},{av:'A1651BarPNDes',fld:'BARPNDES',pic:'ZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A1508CliCodAgr',fld:'CLICODAGR',pic:'ZZZZZ9'},{av:'A1245BarAgrSer',fld:'BARAGRSER',pic:''},{av:'A1507BarAgrDsc',fld:'BARAGRDSC',pic:''},{av:'A1510ColNomAgr',fld:'COLNOMAGR',pic:''},{av:'A1512ColNumAgr',fld:'COLNUMAGR',pic:'ZZZZZ9'},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'},{av:'A1513DisCodAgr',fld:'DISCODAGR',pic:'ZZZZZZZ9'},{av:'A1509ColNoCAgr',fld:'COLNOCAGR',pic:''},{av:'A1511ColNuCAgr',fld:'COLNUCAGR',pic:'ZZZZZ9'},{av:'A1649BarAgrDNu',fld:'BARAGRDNU',pic:''},{av:'A121BarAgrKgm',fld:'BARAGRKGM',pic:'ZZZZZ9.99'},{av:'A868BarAgrMtr',fld:'BARAGRMTR',pic:'ZZZZZ9.99'},{av:'A123BarAgrPie',fld:'BARAGRPIE',pic:'ZZZ9'},{av:'A13792BarAgrNhdr',fld:'BARAGRNHDR',pic:''},{av:'A13695BarAGrHdr',fld:'BARAGRHDR',pic:''},{av:'AV35ColNumAgr',fld:'vCOLNUMAGR',pic:'ZZZZZ9'},{av:'AV34ColNomAgr',fld:'vCOLNOMAGR',pic:''},{av:'AV33BarAgrSer',fld:'vBARAGRSER',pic:''},{av:'AV32CliCodAgr',fld:'vCLICODAGR',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARAGRPAR",",oparms:[{av:'A121BarAgrKgm',fld:'BARAGRKGM',pic:'ZZZZZ9.99'},{av:'A868BarAgrMtr',fld:'BARAGRMTR',pic:'ZZZZZ9.99'},{av:'A1650BarAgrNDes',fld:'BARAGRNDES',pic:'ZZZ9'},{av:'A1651BarPNDes',fld:'BARPNDES',pic:'ZZZ9'},{av:'A474FindBarAgr',fld:'FINDBARAGR',pic:'@!'},{av:'A1653FindDes',fld:'FINDDES',pic:'@!'},{av:'A123BarAgrPie',fld:'BARAGRPIE',pic:'ZZZ9'},{av:'A13792BarAgrNhdr',fld:'BARAGRNHDR',pic:''},{av:'A13695BarAGrHdr',fld:'BARAGRHDR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'AV32CliCodAgr',fld:'vCLICODAGR',pic:'ZZZZZ9'},{av:'AV33BarAgrSer',fld:'vBARAGRSER',pic:''},{av:'AV34ColNomAgr',fld:'vCOLNOMAGR',pic:''},{av:'AV35ColNumAgr',fld:'vCOLNUMAGR',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_CLICODAGR","{handler:'valid_Clicodagr',iparms:[]");
      setEventMetadata("VALID_CLICODAGR",",oparms:[]}");
      setEventMetadata("VALID_BARAGRSER","{handler:'valid_Baragrser',iparms:[]");
      setEventMetadata("VALID_BARAGRSER",",oparms:[]}");
      setEventMetadata("VALID_BARAGRDSC","{handler:'valid_Baragrdsc',iparms:[]");
      setEventMetadata("VALID_BARAGRDSC",",oparms:[]}");
      setEventMetadata("VALID_COLNOMAGR","{handler:'valid_Colnomagr',iparms:[]");
      setEventMetadata("VALID_COLNOMAGR",",oparms:[]}");
      setEventMetadata("VALID_COLNUMAGR","{handler:'valid_Colnumagr',iparms:[]");
      setEventMetadata("VALID_COLNUMAGR",",oparms:[]}");
      setEventMetadata("VALID_KGMAGR","{handler:'valid_Kgmagr',iparms:[]");
      setEventMetadata("VALID_KGMAGR",",oparms:[]}");
      setEventMetadata("VALID_MTRAGR","{handler:'valid_Mtragr',iparms:[]");
      setEventMetadata("VALID_MTRAGR",",oparms:[]}");
      setEventMetadata("VALID_PIEAGR","{handler:'valid_Pieagr',iparms:[]");
      setEventMetadata("VALID_PIEAGR",",oparms:[]}");
      setEventMetadata("VALID_BARAGRKGM","{handler:'valid_Baragrkgm',iparms:[]");
      setEventMetadata("VALID_BARAGRKGM",",oparms:[]}");
      setEventMetadata("VALID_BARAGRMTR","{handler:'valid_Baragrmtr',iparms:[]");
      setEventMetadata("VALID_BARAGRMTR",",oparms:[]}");
      setEventMetadata("VALID_BARAGRPIE","{handler:'valid_Baragrpie',iparms:[]");
      setEventMetadata("VALID_BARAGRPIE",",oparms:[]}");
      setEventMetadata("VALID_BARAGRNDES","{handler:'valid_Baragrndes',iparms:[]");
      setEventMetadata("VALID_BARAGRNDES",",oparms:[]}");
      setEventMetadata("VALID_BARPNDES","{handler:'valid_Barpndes',iparms:[]");
      setEventMetadata("VALID_BARPNDES",",oparms:[]}");
      setEventMetadata("VALID_FINDDES","{handler:'valid_Finddes',iparms:[]");
      setEventMetadata("VALID_FINDDES",",oparms:[]}");
      setEventMetadata("VALID_FINDBARAGR","{handler:'valid_Findbaragr',iparms:[]");
      setEventMetadata("VALID_FINDBARAGR",",oparms:[]}");
      setEventMetadata("VALID_DISCODAGR","{handler:'valid_Discodagr',iparms:[]");
      setEventMetadata("VALID_DISCODAGR",",oparms:[]}");
      setEventMetadata("VALID_COLNOCAGR","{handler:'valid_Colnocagr',iparms:[]");
      setEventMetadata("VALID_COLNOCAGR",",oparms:[]}");
      setEventMetadata("VALID_COLNUCAGR","{handler:'valid_Colnucagr',iparms:[]");
      setEventMetadata("VALID_COLNUCAGR",",oparms:[]}");
      setEventMetadata("VALID_BARAGRDNU","{handler:'valid_Baragrdnu',iparms:[]");
      setEventMetadata("VALID_BARAGRDNU",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Baragrnhdr',iparms:[]");
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
      pr_default.close(98);
      pr_default.close(99);
      pr_default.close(100);
      pr_default.close(22);
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV10BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z143BarDisNum = "" ;
      Z120BarAgrEst = "" ;
      Z180BarMaqCod = "" ;
      Z212BarSer = "" ;
      Z135BarColNom = "" ;
      Z4812BarEncCli = "" ;
      O13846BarAgrCant = DecimalUtil.ZERO ;
      N130BarCodPar = "" ;
      Dvelop_confirmpanel_eliminarlinea_Result = "" ;
      Dvelop_confirmpanel_eliminaragrupacion_Result = "" ;
      Z122BarAgrPar = "" ;
      Z590KgmAgr = DecimalUtil.ZERO ;
      Z869MtrAgr = DecimalUtil.ZERO ;
      Z1245BarAgrSer = "" ;
      Z1507BarAgrDsc = "" ;
      Z1510ColNomAgr = "" ;
      Z1509ColNoCAgr = "" ;
      Z1649BarAgrDNu = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A122BarAgrPar = "" ;
      AV33BarAgrSer = "" ;
      AV34ColNomAgr = "" ;
      A1245BarAgrSer = "" ;
      A1510ColNomAgr = "" ;
      A180BarMaqCod = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      Gx_mode = "" ;
      AV10BarCodPar = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A401EmprCodVi = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtneliminarlinea_Jsonclick = "" ;
      bttBtneliminaragrupacion_Jsonclick = "" ;
      A13878PedidoClie = "" ;
      A407EmprNom = "" ;
      A120BarAgrEst = "" ;
      A13846BarAgrCant = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_eliminarlinea = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminaragrupacion = new com.genexus.webpanels.GXUserControl();
      Gridlevel_baragrContainer = new com.genexus.webpanels.GXWebGrid(context);
      B13846BarAgrCant = DecimalUtil.ZERO ;
      sMode13 = "" ;
      A2759BarMaqGru = "" ;
      AV39Albaranes = "" ;
      A365DisDes = "" ;
      AV43Flagrec = DecimalUtil.ZERO ;
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
      Dvelop_confirmpanel_eliminaragrupacion_Objectcall = "" ;
      Dvelop_confirmpanel_eliminaragrupacion_Width = "" ;
      Dvelop_confirmpanel_eliminaragrupacion_Height = "" ;
      Dvelop_confirmpanel_eliminaragrupacion_Class = "" ;
      Dvelop_confirmpanel_eliminaragrupacion_Comment = "" ;
      Dvelop_confirmpanel_eliminaragrupacion_Bodytype = "" ;
      Dvelop_confirmpanel_eliminaragrupacion_Bodycontentinternalname = "" ;
      Dvelop_confirmpanel_eliminaragrupacion_Texttype = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode12 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s13846BarAgrCant = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A1507BarAgrDsc = "" ;
      A121BarAgrKgm = DecimalUtil.ZERO ;
      A868BarAgrMtr = DecimalUtil.ZERO ;
      A1653FindDes = "" ;
      A474FindBarAgr = "" ;
      A1509ColNoCAgr = "" ;
      A1649BarAgrDNu = "" ;
      A13695BarAGrHdr = "" ;
      A13792BarAgrNhdr = "" ;
      AV41Station = "" ;
      AV22BuscarEmprCod = "" ;
      AV23EmprNom = "" ;
      AV24UsurCod = "" ;
      AV25msg0 = "" ;
      AV26msg1 = "" ;
      AV27msg2 = "" ;
      AV28msg3 = "" ;
      AV29msg4 = "" ;
      AV30msg5 = "" ;
      AV11WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13WebSession = httpContext.getWebSession();
      GXv_char2 = new String[1] ;
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      Z13846BarAgrCant = DecimalUtil.ZERO ;
      T01RJ10_A407EmprNom = new String[] {""} ;
      T01RJ10_n407EmprNom = new boolean[] {false} ;
      T01RJ15_A13846BarAgrCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ15_n13846BarAgrCant = new boolean[] {false} ;
      T01RJ17_A361DisCod = new int[1] ;
      T01RJ17_A2759BarMaqGru = new String[] {""} ;
      T01RJ17_A129BarCod = new int[1] ;
      T01RJ17_n129BarCod = new boolean[] {false} ;
      T01RJ17_A132BarCodReo = new byte[1] ;
      T01RJ17_n132BarCodReo = new boolean[] {false} ;
      T01RJ17_A130BarCodPar = new String[] {""} ;
      T01RJ17_n130BarCodPar = new boolean[] {false} ;
      T01RJ17_A407EmprNom = new String[] {""} ;
      T01RJ17_n407EmprNom = new boolean[] {false} ;
      T01RJ17_A143BarDisNum = new String[] {""} ;
      T01RJ17_A120BarAgrEst = new String[] {""} ;
      T01RJ17_A180BarMaqCod = new String[] {""} ;
      T01RJ17_A236BarVolMaq = new int[1] ;
      T01RJ17_A213BarSit = new byte[1] ;
      T01RJ17_A252CliCod = new int[1] ;
      T01RJ17_n252CliCod = new boolean[] {false} ;
      T01RJ17_A212BarSer = new String[] {""} ;
      T01RJ17_A135BarColNom = new String[] {""} ;
      T01RJ17_A136BarColNum = new int[1] ;
      T01RJ17_A4812BarEncCli = new String[] {""} ;
      T01RJ17_A365DisDes = new String[] {""} ;
      T01RJ17_A396EmprCod = new String[] {""} ;
      T01RJ17_n396EmprCod = new boolean[] {false} ;
      T01RJ17_A13846BarAgrCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ17_n13846BarAgrCant = new boolean[] {false} ;
      T01RJ11_A252CliCod = new int[1] ;
      T01RJ11_n252CliCod = new boolean[] {false} ;
      T01RJ11_A365DisDes = new String[] {""} ;
      T01RJ13_A478FindVolMax = new int[1] ;
      T01RJ13_A479FindVolMed = new int[1] ;
      T01RJ13_A480FindVolMin = new int[1] ;
      T01RJ18_A407EmprNom = new String[] {""} ;
      T01RJ18_n407EmprNom = new boolean[] {false} ;
      T01RJ19_A252CliCod = new int[1] ;
      T01RJ19_n252CliCod = new boolean[] {false} ;
      T01RJ19_A365DisDes = new String[] {""} ;
      T01RJ21_A478FindVolMax = new int[1] ;
      T01RJ21_A479FindVolMed = new int[1] ;
      T01RJ21_A480FindVolMin = new int[1] ;
      T01RJ23_A13846BarAgrCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ23_n13846BarAgrCant = new boolean[] {false} ;
      T01RJ24_A396EmprCod = new String[] {""} ;
      T01RJ24_n396EmprCod = new boolean[] {false} ;
      T01RJ24_A129BarCod = new int[1] ;
      T01RJ24_n129BarCod = new boolean[] {false} ;
      T01RJ24_A132BarCodReo = new byte[1] ;
      T01RJ24_n132BarCodReo = new boolean[] {false} ;
      T01RJ24_A130BarCodPar = new String[] {""} ;
      T01RJ24_n130BarCodPar = new boolean[] {false} ;
      T01RJ9_A361DisCod = new int[1] ;
      T01RJ9_A2759BarMaqGru = new String[] {""} ;
      T01RJ9_A129BarCod = new int[1] ;
      T01RJ9_n129BarCod = new boolean[] {false} ;
      T01RJ9_A132BarCodReo = new byte[1] ;
      T01RJ9_n132BarCodReo = new boolean[] {false} ;
      T01RJ9_A130BarCodPar = new String[] {""} ;
      T01RJ9_n130BarCodPar = new boolean[] {false} ;
      T01RJ9_A143BarDisNum = new String[] {""} ;
      T01RJ9_A120BarAgrEst = new String[] {""} ;
      T01RJ9_A180BarMaqCod = new String[] {""} ;
      T01RJ9_A236BarVolMaq = new int[1] ;
      T01RJ9_A213BarSit = new byte[1] ;
      T01RJ9_A212BarSer = new String[] {""} ;
      T01RJ9_A135BarColNom = new String[] {""} ;
      T01RJ9_A136BarColNum = new int[1] ;
      T01RJ9_A4812BarEncCli = new String[] {""} ;
      T01RJ9_A396EmprCod = new String[] {""} ;
      T01RJ9_n396EmprCod = new boolean[] {false} ;
      T01RJ9_A252CliCod = new int[1] ;
      T01RJ9_n252CliCod = new boolean[] {false} ;
      T01RJ9_A365DisDes = new String[] {""} ;
      T01RJ25_A396EmprCod = new String[] {""} ;
      T01RJ25_n396EmprCod = new boolean[] {false} ;
      T01RJ25_A129BarCod = new int[1] ;
      T01RJ25_n129BarCod = new boolean[] {false} ;
      T01RJ25_A132BarCodReo = new byte[1] ;
      T01RJ25_n132BarCodReo = new boolean[] {false} ;
      T01RJ25_A130BarCodPar = new String[] {""} ;
      T01RJ25_n130BarCodPar = new boolean[] {false} ;
      T01RJ26_A396EmprCod = new String[] {""} ;
      T01RJ26_n396EmprCod = new boolean[] {false} ;
      T01RJ26_A129BarCod = new int[1] ;
      T01RJ26_n129BarCod = new boolean[] {false} ;
      T01RJ26_A132BarCodReo = new byte[1] ;
      T01RJ26_n132BarCodReo = new boolean[] {false} ;
      T01RJ26_A130BarCodPar = new String[] {""} ;
      T01RJ26_n130BarCodPar = new boolean[] {false} ;
      T01RJ8_A361DisCod = new int[1] ;
      T01RJ8_A2759BarMaqGru = new String[] {""} ;
      T01RJ8_A129BarCod = new int[1] ;
      T01RJ8_n129BarCod = new boolean[] {false} ;
      T01RJ8_A132BarCodReo = new byte[1] ;
      T01RJ8_n132BarCodReo = new boolean[] {false} ;
      T01RJ8_A130BarCodPar = new String[] {""} ;
      T01RJ8_n130BarCodPar = new boolean[] {false} ;
      T01RJ8_A143BarDisNum = new String[] {""} ;
      T01RJ8_A120BarAgrEst = new String[] {""} ;
      T01RJ8_A180BarMaqCod = new String[] {""} ;
      T01RJ8_A236BarVolMaq = new int[1] ;
      T01RJ8_A213BarSit = new byte[1] ;
      T01RJ8_A212BarSer = new String[] {""} ;
      T01RJ8_A135BarColNom = new String[] {""} ;
      T01RJ8_A136BarColNum = new int[1] ;
      T01RJ8_A4812BarEncCli = new String[] {""} ;
      T01RJ8_A396EmprCod = new String[] {""} ;
      T01RJ8_n396EmprCod = new boolean[] {false} ;
      T01RJ8_A252CliCod = new int[1] ;
      T01RJ8_n252CliCod = new boolean[] {false} ;
      T01RJ8_A365DisDes = new String[] {""} ;
      T01RJ30_A407EmprNom = new String[] {""} ;
      T01RJ30_n407EmprNom = new boolean[] {false} ;
      T01RJ32_A13846BarAgrCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ32_n13846BarAgrCant = new boolean[] {false} ;
      T01RJ33_A252CliCod = new int[1] ;
      T01RJ33_n252CliCod = new boolean[] {false} ;
      T01RJ33_A365DisDes = new String[] {""} ;
      T01RJ35_A478FindVolMax = new int[1] ;
      T01RJ35_A479FindVolMed = new int[1] ;
      T01RJ35_A480FindVolMin = new int[1] ;
      T01RJ36_A14681MRPrId = new long[1] ;
      T01RJ37_A5921XCjaDis = new String[] {""} ;
      T01RJ37_A5922XCjaCod = new long[1] ;
      T01RJ38_A396EmprCod = new String[] {""} ;
      T01RJ38_n396EmprCod = new boolean[] {false} ;
      T01RJ38_A129BarCod = new int[1] ;
      T01RJ38_n129BarCod = new boolean[] {false} ;
      T01RJ38_A132BarCodReo = new byte[1] ;
      T01RJ38_n132BarCodReo = new boolean[] {false} ;
      T01RJ38_A130BarCodPar = new String[] {""} ;
      T01RJ38_n130BarCodPar = new boolean[] {false} ;
      T01RJ38_A14152MEnvOrd = new short[1] ;
      T01RJ39_A396EmprCod = new String[] {""} ;
      T01RJ39_n396EmprCod = new boolean[] {false} ;
      T01RJ39_A129BarCod = new int[1] ;
      T01RJ39_n129BarCod = new boolean[] {false} ;
      T01RJ39_A132BarCodReo = new byte[1] ;
      T01RJ39_n132BarCodReo = new boolean[] {false} ;
      T01RJ39_A130BarCodPar = new String[] {""} ;
      T01RJ39_n130BarCodPar = new boolean[] {false} ;
      T01RJ39_A13905BarTraID = new String[] {""} ;
      T01RJ40_A396EmprCod = new String[] {""} ;
      T01RJ40_n396EmprCod = new boolean[] {false} ;
      T01RJ40_A129BarCod = new int[1] ;
      T01RJ40_n129BarCod = new boolean[] {false} ;
      T01RJ40_A132BarCodReo = new byte[1] ;
      T01RJ40_n132BarCodReo = new boolean[] {false} ;
      T01RJ40_A130BarCodPar = new String[] {""} ;
      T01RJ40_n130BarCodPar = new boolean[] {false} ;
      T01RJ40_A13093BarDGLin = new byte[1] ;
      T01RJ40_A13094BarDGDibCl = new String[] {""} ;
      T01RJ40_A13095BarDGDibIn = new int[1] ;
      T01RJ40_A13096BarDGComb = new String[] {""} ;
      T01RJ40_A13097BarDGFOndo = new String[] {""} ;
      T01RJ41_A396EmprCod = new String[] {""} ;
      T01RJ41_n396EmprCod = new boolean[] {false} ;
      T01RJ41_A11917Ebd_numero = new int[1] ;
      T01RJ42_A396EmprCod = new String[] {""} ;
      T01RJ42_n396EmprCod = new boolean[] {false} ;
      T01RJ42_A11898Prd_numero = new int[1] ;
      T01RJ43_A396EmprCod = new String[] {""} ;
      T01RJ43_n396EmprCod = new boolean[] {false} ;
      T01RJ43_A11849Cte_numero = new int[1] ;
      T01RJ44_A396EmprCod = new String[] {""} ;
      T01RJ44_n396EmprCod = new boolean[] {false} ;
      T01RJ44_A11791Ap_numero = new int[1] ;
      T01RJ45_A396EmprCod = new String[] {""} ;
      T01RJ45_n396EmprCod = new boolean[] {false} ;
      T01RJ45_A3985CalBarCod = new int[1] ;
      T01RJ45_A3986CalBarCodR = new byte[1] ;
      T01RJ45_A3987CalBarCodP = new String[] {""} ;
      T01RJ46_A396EmprCod = new String[] {""} ;
      T01RJ46_n396EmprCod = new boolean[] {false} ;
      T01RJ46_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01RJ46_A652OpeCod = new int[1] ;
      T01RJ47_A396EmprCod = new String[] {""} ;
      T01RJ47_n396EmprCod = new boolean[] {false} ;
      T01RJ47_A129BarCod = new int[1] ;
      T01RJ47_n129BarCod = new boolean[] {false} ;
      T01RJ47_A132BarCodReo = new byte[1] ;
      T01RJ47_n132BarCodReo = new boolean[] {false} ;
      T01RJ47_A130BarCodPar = new String[] {""} ;
      T01RJ47_n130BarCodPar = new boolean[] {false} ;
      T01RJ47_A4118tinagrcod = new int[1] ;
      T01RJ47_A4119tinagrreo = new byte[1] ;
      T01RJ47_A4120tinagrpar = new String[] {""} ;
      T01RJ48_A396EmprCod = new String[] {""} ;
      T01RJ48_n396EmprCod = new boolean[] {false} ;
      T01RJ48_A129BarCod = new int[1] ;
      T01RJ48_n129BarCod = new boolean[] {false} ;
      T01RJ48_A132BarCodReo = new byte[1] ;
      T01RJ48_n132BarCodReo = new boolean[] {false} ;
      T01RJ48_A130BarCodPar = new String[] {""} ;
      T01RJ48_n130BarCodPar = new boolean[] {false} ;
      T01RJ48_A4080estagrcod = new int[1] ;
      T01RJ48_A4081estagrreo = new byte[1] ;
      T01RJ48_A4082estagrpar = new String[] {""} ;
      T01RJ49_A396EmprCod = new String[] {""} ;
      T01RJ49_n396EmprCod = new boolean[] {false} ;
      T01RJ49_A129BarCod = new int[1] ;
      T01RJ49_n129BarCod = new boolean[] {false} ;
      T01RJ49_A132BarCodReo = new byte[1] ;
      T01RJ49_n132BarCodReo = new boolean[] {false} ;
      T01RJ49_A130BarCodPar = new String[] {""} ;
      T01RJ49_n130BarCodPar = new boolean[] {false} ;
      T01RJ49_A4075recestncol = new byte[1] ;
      T01RJ49_A4076recestnpro = new byte[1] ;
      T01RJ50_A396EmprCod = new String[] {""} ;
      T01RJ50_n396EmprCod = new boolean[] {false} ;
      T01RJ50_A602MaqCod = new String[] {""} ;
      T01RJ50_A1142MaqFCod = new String[] {""} ;
      T01RJ50_A3068PlaEtaOrd = new short[1] ;
      T01RJ50_A3069PlaEtaOrdA = new byte[1] ;
      T01RJ50_A129BarCod = new int[1] ;
      T01RJ50_n129BarCod = new boolean[] {false} ;
      T01RJ50_A132BarCodReo = new byte[1] ;
      T01RJ50_n132BarCodReo = new boolean[] {false} ;
      T01RJ50_A130BarCodPar = new String[] {""} ;
      T01RJ50_n130BarCodPar = new boolean[] {false} ;
      T01RJ51_A396EmprCod = new String[] {""} ;
      T01RJ51_n396EmprCod = new boolean[] {false} ;
      T01RJ51_A129BarCod = new int[1] ;
      T01RJ51_n129BarCod = new boolean[] {false} ;
      T01RJ51_A132BarCodReo = new byte[1] ;
      T01RJ51_n132BarCodReo = new boolean[] {false} ;
      T01RJ51_A130BarCodPar = new String[] {""} ;
      T01RJ51_n130BarCodPar = new boolean[] {false} ;
      T01RJ51_A4846BarAudLin = new short[1] ;
      T01RJ52_A396EmprCod = new String[] {""} ;
      T01RJ52_n396EmprCod = new boolean[] {false} ;
      T01RJ52_A129BarCod = new int[1] ;
      T01RJ52_n129BarCod = new boolean[] {false} ;
      T01RJ52_A132BarCodReo = new byte[1] ;
      T01RJ52_n132BarCodReo = new boolean[] {false} ;
      T01RJ52_A130BarCodPar = new String[] {""} ;
      T01RJ52_n130BarCodPar = new boolean[] {false} ;
      T01RJ52_A3940BarEnsLin = new short[1] ;
      T01RJ53_A396EmprCod = new String[] {""} ;
      T01RJ53_n396EmprCod = new boolean[] {false} ;
      T01RJ53_A129BarCod = new int[1] ;
      T01RJ53_n129BarCod = new boolean[] {false} ;
      T01RJ53_A132BarCodReo = new byte[1] ;
      T01RJ53_n132BarCodReo = new boolean[] {false} ;
      T01RJ53_A130BarCodPar = new String[] {""} ;
      T01RJ53_n130BarCodPar = new boolean[] {false} ;
      T01RJ53_A3384RefBarCod = new int[1] ;
      T01RJ53_A3385RefBarReo = new byte[1] ;
      T01RJ53_A3386RefBarPar = new String[] {""} ;
      T01RJ54_A396EmprCod = new String[] {""} ;
      T01RJ54_n396EmprCod = new boolean[] {false} ;
      T01RJ54_A10914SolSalCod = new int[1] ;
      T01RJ55_A396EmprCod = new String[] {""} ;
      T01RJ55_n396EmprCod = new boolean[] {false} ;
      T01RJ55_A10364Ph_numero = new int[1] ;
      T01RJ56_A396EmprCod = new String[] {""} ;
      T01RJ56_n396EmprCod = new boolean[] {false} ;
      T01RJ56_A129BarCod = new int[1] ;
      T01RJ56_n129BarCod = new boolean[] {false} ;
      T01RJ56_A132BarCodReo = new byte[1] ;
      T01RJ56_n132BarCodReo = new boolean[] {false} ;
      T01RJ56_A130BarCodPar = new String[] {""} ;
      T01RJ56_n130BarCodPar = new boolean[] {false} ;
      T01RJ56_A10197ProEspCod = new String[] {""} ;
      T01RJ57_A396EmprCod = new String[] {""} ;
      T01RJ57_n396EmprCod = new boolean[] {false} ;
      T01RJ57_A129BarCod = new int[1] ;
      T01RJ57_n129BarCod = new boolean[] {false} ;
      T01RJ57_A132BarCodReo = new byte[1] ;
      T01RJ57_n132BarCodReo = new boolean[] {false} ;
      T01RJ57_A130BarCodPar = new String[] {""} ;
      T01RJ57_n130BarCodPar = new boolean[] {false} ;
      T01RJ57_A5322Dp_Nrecep = new int[1] ;
      T01RJ58_A396EmprCod = new String[] {""} ;
      T01RJ58_n396EmprCod = new boolean[] {false} ;
      T01RJ58_A129BarCod = new int[1] ;
      T01RJ58_n129BarCod = new boolean[] {false} ;
      T01RJ58_A132BarCodReo = new byte[1] ;
      T01RJ58_n132BarCodReo = new boolean[] {false} ;
      T01RJ58_A130BarCodPar = new String[] {""} ;
      T01RJ58_n130BarCodPar = new boolean[] {false} ;
      T01RJ58_A8569EntSecLn = new int[1] ;
      T01RJ59_A396EmprCod = new String[] {""} ;
      T01RJ59_n396EmprCod = new boolean[] {false} ;
      T01RJ59_A7434PLLNro = new int[1] ;
      T01RJ59_A7443LPLNro = new short[1] ;
      T01RJ59_A7459CPLCom = new short[1] ;
      T01RJ59_A129BarCod = new int[1] ;
      T01RJ59_n129BarCod = new boolean[] {false} ;
      T01RJ59_A132BarCodReo = new byte[1] ;
      T01RJ59_n132BarCodReo = new boolean[] {false} ;
      T01RJ59_A130BarCodPar = new String[] {""} ;
      T01RJ59_n130BarCodPar = new boolean[] {false} ;
      T01RJ60_A396EmprCod = new String[] {""} ;
      T01RJ60_n396EmprCod = new boolean[] {false} ;
      T01RJ60_A7145OSSCod = new int[1] ;
      T01RJ61_A396EmprCod = new String[] {""} ;
      T01RJ61_n396EmprCod = new boolean[] {false} ;
      T01RJ61_A7049OGSCod = new int[1] ;
      T01RJ62_A396EmprCod = new String[] {""} ;
      T01RJ62_n396EmprCod = new boolean[] {false} ;
      T01RJ62_A129BarCod = new int[1] ;
      T01RJ62_n129BarCod = new boolean[] {false} ;
      T01RJ62_A132BarCodReo = new byte[1] ;
      T01RJ62_n132BarCodReo = new boolean[] {false} ;
      T01RJ62_A130BarCodPar = new String[] {""} ;
      T01RJ62_n130BarCodPar = new boolean[] {false} ;
      T01RJ62_A6031Ac_Barcod = new int[1] ;
      T01RJ62_A6032Ac_BarReo = new byte[1] ;
      T01RJ62_A6033Ac_BarPar = new String[] {""} ;
      T01RJ63_A396EmprCod = new String[] {""} ;
      T01RJ63_n396EmprCod = new boolean[] {false} ;
      T01RJ63_A129BarCod = new int[1] ;
      T01RJ63_n129BarCod = new boolean[] {false} ;
      T01RJ63_A132BarCodReo = new byte[1] ;
      T01RJ63_n132BarCodReo = new boolean[] {false} ;
      T01RJ63_A130BarCodPar = new String[] {""} ;
      T01RJ63_n130BarCodPar = new boolean[] {false} ;
      T01RJ63_A5908PartPal = new int[1] ;
      T01RJ64_A396EmprCod = new String[] {""} ;
      T01RJ64_n396EmprCod = new boolean[] {false} ;
      T01RJ64_A129BarCod = new int[1] ;
      T01RJ64_n129BarCod = new boolean[] {false} ;
      T01RJ64_A132BarCodReo = new byte[1] ;
      T01RJ64_n132BarCodReo = new boolean[] {false} ;
      T01RJ64_A130BarCodPar = new String[] {""} ;
      T01RJ64_n130BarCodPar = new boolean[] {false} ;
      T01RJ64_A2524DisComLin = new byte[1] ;
      T01RJ64_A1056DisComCod = new String[] {""} ;
      T01RJ64_A1032FonCod = new String[] {""} ;
      T01RJ65_A396EmprCod = new String[] {""} ;
      T01RJ65_n396EmprCod = new boolean[] {false} ;
      T01RJ65_A1736AlbExtCod = new long[1] ;
      T01RJ65_A129BarCod = new int[1] ;
      T01RJ65_n129BarCod = new boolean[] {false} ;
      T01RJ65_A132BarCodReo = new byte[1] ;
      T01RJ65_n132BarCodReo = new boolean[] {false} ;
      T01RJ65_A130BarCodPar = new String[] {""} ;
      T01RJ65_n130BarCodPar = new boolean[] {false} ;
      T01RJ66_A396EmprCod = new String[] {""} ;
      T01RJ66_n396EmprCod = new boolean[] {false} ;
      T01RJ66_A129BarCod = new int[1] ;
      T01RJ66_n129BarCod = new boolean[] {false} ;
      T01RJ66_A132BarCodReo = new byte[1] ;
      T01RJ66_n132BarCodReo = new boolean[] {false} ;
      T01RJ66_A130BarCodPar = new String[] {""} ;
      T01RJ66_n130BarCodPar = new boolean[] {false} ;
      T01RJ66_A3753BarFoaCod = new int[1] ;
      T01RJ66_A3754BarFoaReo = new byte[1] ;
      T01RJ66_A3755BarFoaPar = new String[] {""} ;
      T01RJ67_A396EmprCod = new String[] {""} ;
      T01RJ67_n396EmprCod = new boolean[] {false} ;
      T01RJ67_A129BarCod = new int[1] ;
      T01RJ67_n129BarCod = new boolean[] {false} ;
      T01RJ67_A132BarCodReo = new byte[1] ;
      T01RJ67_n132BarCodReo = new boolean[] {false} ;
      T01RJ67_A130BarCodPar = new String[] {""} ;
      T01RJ67_n130BarCodPar = new boolean[] {false} ;
      T01RJ67_A3747BarPegCod = new int[1] ;
      T01RJ67_A3748BarPegReo = new byte[1] ;
      T01RJ67_A3749BarPegPar = new String[] {""} ;
      T01RJ68_A396EmprCod = new String[] {""} ;
      T01RJ68_n396EmprCod = new boolean[] {false} ;
      T01RJ68_A3253SolTraCod = new int[1] ;
      T01RJ69_A396EmprCod = new String[] {""} ;
      T01RJ69_n396EmprCod = new boolean[] {false} ;
      T01RJ69_A3235SolSubCod = new int[1] ;
      T01RJ70_A396EmprCod = new String[] {""} ;
      T01RJ70_n396EmprCod = new boolean[] {false} ;
      T01RJ70_A3218SolLuzCod = new int[1] ;
      T01RJ71_A396EmprCod = new String[] {""} ;
      T01RJ71_n396EmprCod = new boolean[] {false} ;
      T01RJ71_A3196SolFriCod = new int[1] ;
      T01RJ72_A396EmprCod = new String[] {""} ;
      T01RJ72_n396EmprCod = new boolean[] {false} ;
      T01RJ72_A3165SolPilCod = new int[1] ;
      T01RJ73_A396EmprCod = new String[] {""} ;
      T01RJ73_n396EmprCod = new boolean[] {false} ;
      T01RJ73_A129BarCod = new int[1] ;
      T01RJ73_n129BarCod = new boolean[] {false} ;
      T01RJ73_A132BarCodReo = new byte[1] ;
      T01RJ73_n132BarCodReo = new boolean[] {false} ;
      T01RJ73_A130BarCodPar = new String[] {""} ;
      T01RJ73_n130BarCodPar = new boolean[] {false} ;
      T01RJ73_A2872HAnRLinMaq = new short[1] ;
      T01RJ73_A2873HAnRLinPro = new byte[1] ;
      T01RJ73_A2874HAnRLin = new short[1] ;
      T01RJ73_A2875HAnNumAny = new byte[1] ;
      T01RJ74_A396EmprCod = new String[] {""} ;
      T01RJ74_n396EmprCod = new boolean[] {false} ;
      T01RJ74_A2817PlaTer = new String[] {""} ;
      T01RJ74_A2818PlaOrd = new short[1] ;
      T01RJ75_A396EmprCod = new String[] {""} ;
      T01RJ75_n396EmprCod = new boolean[] {false} ;
      T01RJ75_A2809MetTerCod = new String[] {""} ;
      T01RJ75_A129BarCod = new int[1] ;
      T01RJ75_n129BarCod = new boolean[] {false} ;
      T01RJ75_A132BarCodReo = new byte[1] ;
      T01RJ75_n132BarCodReo = new boolean[] {false} ;
      T01RJ75_A130BarCodPar = new String[] {""} ;
      T01RJ75_n130BarCodPar = new boolean[] {false} ;
      T01RJ76_A396EmprCod = new String[] {""} ;
      T01RJ76_n396EmprCod = new boolean[] {false} ;
      T01RJ76_A129BarCod = new int[1] ;
      T01RJ76_n129BarCod = new boolean[] {false} ;
      T01RJ76_A132BarCodReo = new byte[1] ;
      T01RJ76_n132BarCodReo = new boolean[] {false} ;
      T01RJ76_A130BarCodPar = new String[] {""} ;
      T01RJ76_n130BarCodPar = new boolean[] {false} ;
      T01RJ76_A2808RecLinMAL = new short[1] ;
      T01RJ76_A1377RecNumAny = new byte[1] ;
      T01RJ76_A719PrdNum = new String[] {""} ;
      T01RJ77_A396EmprCod = new String[] {""} ;
      T01RJ77_n396EmprCod = new boolean[] {false} ;
      T01RJ77_A129BarCod = new int[1] ;
      T01RJ77_n129BarCod = new boolean[] {false} ;
      T01RJ77_A132BarCodReo = new byte[1] ;
      T01RJ77_n132BarCodReo = new boolean[] {false} ;
      T01RJ77_A130BarCodPar = new String[] {""} ;
      T01RJ77_n130BarCodPar = new boolean[] {false} ;
      T01RJ77_A2804RecLinMaq = new short[1] ;
      T01RJ78_A396EmprCod = new String[] {""} ;
      T01RJ78_n396EmprCod = new boolean[] {false} ;
      T01RJ78_A2792TermiCod = new String[] {""} ;
      T01RJ78_A129BarCod = new int[1] ;
      T01RJ78_n129BarCod = new boolean[] {false} ;
      T01RJ78_A132BarCodReo = new byte[1] ;
      T01RJ78_n132BarCodReo = new boolean[] {false} ;
      T01RJ78_A130BarCodPar = new String[] {""} ;
      T01RJ78_n130BarCodPar = new boolean[] {false} ;
      T01RJ79_A396EmprCod = new String[] {""} ;
      T01RJ79_n396EmprCod = new boolean[] {false} ;
      T01RJ79_A2248ManCod = new short[1] ;
      T01RJ79_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01RJ79_A2713RpExHdLi = new short[1] ;
      T01RJ80_A396EmprCod = new String[] {""} ;
      T01RJ80_n396EmprCod = new boolean[] {false} ;
      T01RJ80_A2248ManCod = new short[1] ;
      T01RJ80_A2689ExHdrFas = new String[] {""} ;
      T01RJ80_A2692ExHdrLin = new int[1] ;
      T01RJ81_A396EmprCod = new String[] {""} ;
      T01RJ81_n396EmprCod = new boolean[] {false} ;
      T01RJ81_A129BarCod = new int[1] ;
      T01RJ81_n129BarCod = new boolean[] {false} ;
      T01RJ81_A132BarCodReo = new byte[1] ;
      T01RJ81_n132BarCodReo = new boolean[] {false} ;
      T01RJ81_A130BarCodPar = new String[] {""} ;
      T01RJ81_n130BarCodPar = new boolean[] {false} ;
      T01RJ81_A2494BarDosPro = new String[] {""} ;
      T01RJ81_A719PrdNum = new String[] {""} ;
      T01RJ82_A396EmprCod = new String[] {""} ;
      T01RJ82_n396EmprCod = new boolean[] {false} ;
      T01RJ82_A602MaqCod = new String[] {""} ;
      T01RJ82_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T01RJ82_A129BarCod = new int[1] ;
      T01RJ82_n129BarCod = new boolean[] {false} ;
      T01RJ82_A132BarCodReo = new byte[1] ;
      T01RJ82_n132BarCodReo = new boolean[] {false} ;
      T01RJ82_A130BarCodPar = new String[] {""} ;
      T01RJ82_n130BarCodPar = new boolean[] {false} ;
      T01RJ83_A396EmprCod = new String[] {""} ;
      T01RJ83_n396EmprCod = new boolean[] {false} ;
      T01RJ83_A129BarCod = new int[1] ;
      T01RJ83_n129BarCod = new boolean[] {false} ;
      T01RJ83_A132BarCodReo = new byte[1] ;
      T01RJ83_n132BarCodReo = new boolean[] {false} ;
      T01RJ83_A130BarCodPar = new String[] {""} ;
      T01RJ83_n130BarCodPar = new boolean[] {false} ;
      T01RJ83_A2457BarObLin = new short[1] ;
      T01RJ84_A396EmprCod = new String[] {""} ;
      T01RJ84_n396EmprCod = new boolean[] {false} ;
      T01RJ84_A129BarCod = new int[1] ;
      T01RJ84_n129BarCod = new boolean[] {false} ;
      T01RJ84_A132BarCodReo = new byte[1] ;
      T01RJ84_n132BarCodReo = new boolean[] {false} ;
      T01RJ84_A130BarCodPar = new String[] {""} ;
      T01RJ84_n130BarCodPar = new boolean[] {false} ;
      T01RJ84_A2444BarEnLin = new short[1] ;
      T01RJ85_A396EmprCod = new String[] {""} ;
      T01RJ85_n396EmprCod = new boolean[] {false} ;
      T01RJ85_A2406ExhAlbCod = new int[1] ;
      T01RJ85_A129BarCod = new int[1] ;
      T01RJ85_n129BarCod = new boolean[] {false} ;
      T01RJ85_A132BarCodReo = new byte[1] ;
      T01RJ85_n132BarCodReo = new boolean[] {false} ;
      T01RJ85_A130BarCodPar = new String[] {""} ;
      T01RJ85_n130BarCodPar = new boolean[] {false} ;
      T01RJ86_A396EmprCod = new String[] {""} ;
      T01RJ86_n396EmprCod = new boolean[] {false} ;
      T01RJ86_A2253SalExtAlb = new int[1] ;
      T01RJ86_A129BarCod = new int[1] ;
      T01RJ86_n129BarCod = new boolean[] {false} ;
      T01RJ86_A132BarCodReo = new byte[1] ;
      T01RJ86_n132BarCodReo = new boolean[] {false} ;
      T01RJ86_A130BarCodPar = new String[] {""} ;
      T01RJ86_n130BarCodPar = new boolean[] {false} ;
      T01RJ87_A396EmprCod = new String[] {""} ;
      T01RJ87_n396EmprCod = new boolean[] {false} ;
      T01RJ87_A30AlbProCod = new long[1] ;
      T01RJ87_A129BarCod = new int[1] ;
      T01RJ87_n129BarCod = new boolean[] {false} ;
      T01RJ87_A132BarCodReo = new byte[1] ;
      T01RJ87_n132BarCodReo = new boolean[] {false} ;
      T01RJ87_A130BarCodPar = new String[] {""} ;
      T01RJ87_n130BarCodPar = new boolean[] {false} ;
      T01RJ88_A396EmprCod = new String[] {""} ;
      T01RJ88_n396EmprCod = new boolean[] {false} ;
      T01RJ88_A1348SolColCod = new int[1] ;
      T01RJ89_A396EmprCod = new String[] {""} ;
      T01RJ89_n396EmprCod = new boolean[] {false} ;
      T01RJ89_A1333EstDimCod = new int[1] ;
      T01RJ90_A396EmprCod = new String[] {""} ;
      T01RJ90_n396EmprCod = new boolean[] {false} ;
      T01RJ90_A1314EnsLabCod = new int[1] ;
      T01RJ91_A396EmprCod = new String[] {""} ;
      T01RJ91_n396EmprCod = new boolean[] {false} ;
      T01RJ91_A129BarCod = new int[1] ;
      T01RJ91_n129BarCod = new boolean[] {false} ;
      T01RJ91_A132BarCodReo = new byte[1] ;
      T01RJ91_n132BarCodReo = new boolean[] {false} ;
      T01RJ91_A130BarCodPar = new String[] {""} ;
      T01RJ91_n130BarCodPar = new boolean[] {false} ;
      T01RJ91_A906ObsReoLin = new byte[1] ;
      T01RJ92_A396EmprCod = new String[] {""} ;
      T01RJ92_n396EmprCod = new boolean[] {false} ;
      T01RJ92_A859CumCodCont = new int[1] ;
      T01RJ93_A396EmprCod = new String[] {""} ;
      T01RJ93_n396EmprCod = new boolean[] {false} ;
      T01RJ93_A602MaqCod = new String[] {""} ;
      T01RJ93_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01RJ93_A561HisProLin = new int[1] ;
      T01RJ94_A396EmprCod = new String[] {""} ;
      T01RJ94_n396EmprCod = new boolean[] {false} ;
      T01RJ94_A252CliCod = new int[1] ;
      T01RJ94_n252CliCod = new boolean[] {false} ;
      T01RJ94_A494ForSer = new String[] {""} ;
      T01RJ94_A482ForColNom = new String[] {""} ;
      T01RJ94_A483ForColNum = new int[1] ;
      T01RJ94_A831TipColCod = new byte[1] ;
      T01RJ95_A396EmprCod = new String[] {""} ;
      T01RJ95_n396EmprCod = new boolean[] {false} ;
      T01RJ95_A129BarCod = new int[1] ;
      T01RJ95_n129BarCod = new boolean[] {false} ;
      T01RJ95_A132BarCodReo = new byte[1] ;
      T01RJ95_n132BarCodReo = new boolean[] {false} ;
      T01RJ95_A130BarCodPar = new String[] {""} ;
      T01RJ95_n130BarCodPar = new boolean[] {false} ;
      T01RJ95_A200BarPieCod = new String[] {""} ;
      T01RJ96_A396EmprCod = new String[] {""} ;
      T01RJ96_n396EmprCod = new boolean[] {false} ;
      T01RJ96_A129BarCod = new int[1] ;
      T01RJ96_n129BarCod = new boolean[] {false} ;
      T01RJ96_A132BarCodReo = new byte[1] ;
      T01RJ96_n132BarCodReo = new boolean[] {false} ;
      T01RJ96_A130BarCodPar = new String[] {""} ;
      T01RJ96_n130BarCodPar = new boolean[] {false} ;
      T01RJ96_A188BarNotLin = new byte[1] ;
      T01RJ97_A396EmprCod = new String[] {""} ;
      T01RJ97_n396EmprCod = new boolean[] {false} ;
      T01RJ97_A129BarCod = new int[1] ;
      T01RJ97_n129BarCod = new boolean[] {false} ;
      T01RJ97_A132BarCodReo = new byte[1] ;
      T01RJ97_n132BarCodReo = new boolean[] {false} ;
      T01RJ97_A130BarCodPar = new String[] {""} ;
      T01RJ97_n130BarCodPar = new boolean[] {false} ;
      T01RJ97_A758ProCod = new String[] {""} ;
      T01RJ99_A396EmprCod = new String[] {""} ;
      T01RJ99_n396EmprCod = new boolean[] {false} ;
      T01RJ99_A129BarCod = new int[1] ;
      T01RJ99_n129BarCod = new boolean[] {false} ;
      T01RJ99_A132BarCodReo = new byte[1] ;
      T01RJ99_n132BarCodReo = new boolean[] {false} ;
      T01RJ99_A130BarCodPar = new String[] {""} ;
      T01RJ99_n130BarCodPar = new boolean[] {false} ;
      Z474FindBarAgr = "" ;
      Z1653FindDes = "" ;
      T01RJ100_A129BarCod = new int[1] ;
      T01RJ100_n129BarCod = new boolean[] {false} ;
      T01RJ100_A132BarCodReo = new byte[1] ;
      T01RJ100_n132BarCodReo = new boolean[] {false} ;
      T01RJ100_A130BarCodPar = new String[] {""} ;
      T01RJ100_n130BarCodPar = new boolean[] {false} ;
      T01RJ100_A119BarAgrCod = new int[1] ;
      T01RJ100_A124BarAgrReo = new byte[1] ;
      T01RJ100_A122BarAgrPar = new String[] {""} ;
      T01RJ100_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ100_A671PieAgr = new short[1] ;
      T01RJ100_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ100_A1508CliCodAgr = new int[1] ;
      T01RJ100_A1245BarAgrSer = new String[] {""} ;
      T01RJ100_A1507BarAgrDsc = new String[] {""} ;
      T01RJ100_A1510ColNomAgr = new String[] {""} ;
      T01RJ100_A1512ColNumAgr = new int[1] ;
      T01RJ100_A1513DisCodAgr = new int[1] ;
      T01RJ100_A1509ColNoCAgr = new String[] {""} ;
      T01RJ100_A1511ColNuCAgr = new int[1] ;
      T01RJ100_A1649BarAgrDNu = new String[] {""} ;
      T01RJ100_A396EmprCod = new String[] {""} ;
      T01RJ100_n396EmprCod = new boolean[] {false} ;
      T01RJ100_A474FindBarAgr = new String[] {""} ;
      T01RJ100_n474FindBarAgr = new boolean[] {false} ;
      T01RJ100_A1653FindDes = new String[] {""} ;
      T01RJ100_n1653FindDes = new boolean[] {false} ;
      T01RJ5_A121BarAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ5_A868BarAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ5_A1650BarAgrNDes = new short[1] ;
      T01RJ5_A1651BarPNDes = new short[1] ;
      T01RJ6_A474FindBarAgr = new String[] {""} ;
      T01RJ6_n474FindBarAgr = new boolean[] {false} ;
      T01RJ7_A1653FindDes = new String[] {""} ;
      T01RJ7_n1653FindDes = new boolean[] {false} ;
      T01RJ102_A121BarAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ102_A868BarAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ102_A1650BarAgrNDes = new short[1] ;
      T01RJ102_A1651BarPNDes = new short[1] ;
      T01RJ103_A474FindBarAgr = new String[] {""} ;
      T01RJ103_n474FindBarAgr = new boolean[] {false} ;
      T01RJ104_A1653FindDes = new String[] {""} ;
      T01RJ104_n1653FindDes = new boolean[] {false} ;
      T01RJ105_A396EmprCod = new String[] {""} ;
      T01RJ105_n396EmprCod = new boolean[] {false} ;
      T01RJ105_A129BarCod = new int[1] ;
      T01RJ105_n129BarCod = new boolean[] {false} ;
      T01RJ105_A132BarCodReo = new byte[1] ;
      T01RJ105_n132BarCodReo = new boolean[] {false} ;
      T01RJ105_A130BarCodPar = new String[] {""} ;
      T01RJ105_n130BarCodPar = new boolean[] {false} ;
      T01RJ105_A119BarAgrCod = new int[1] ;
      T01RJ105_A124BarAgrReo = new byte[1] ;
      T01RJ105_A122BarAgrPar = new String[] {""} ;
      T01RJ3_A129BarCod = new int[1] ;
      T01RJ3_n129BarCod = new boolean[] {false} ;
      T01RJ3_A132BarCodReo = new byte[1] ;
      T01RJ3_n132BarCodReo = new boolean[] {false} ;
      T01RJ3_A130BarCodPar = new String[] {""} ;
      T01RJ3_n130BarCodPar = new boolean[] {false} ;
      T01RJ3_A119BarAgrCod = new int[1] ;
      T01RJ3_A124BarAgrReo = new byte[1] ;
      T01RJ3_A122BarAgrPar = new String[] {""} ;
      T01RJ3_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ3_A671PieAgr = new short[1] ;
      T01RJ3_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ3_A1508CliCodAgr = new int[1] ;
      T01RJ3_A1245BarAgrSer = new String[] {""} ;
      T01RJ3_A1507BarAgrDsc = new String[] {""} ;
      T01RJ3_A1510ColNomAgr = new String[] {""} ;
      T01RJ3_A1512ColNumAgr = new int[1] ;
      T01RJ3_A1513DisCodAgr = new int[1] ;
      T01RJ3_A1509ColNoCAgr = new String[] {""} ;
      T01RJ3_A1511ColNuCAgr = new int[1] ;
      T01RJ3_A1649BarAgrDNu = new String[] {""} ;
      T01RJ3_A396EmprCod = new String[] {""} ;
      T01RJ3_n396EmprCod = new boolean[] {false} ;
      T01RJ2_A129BarCod = new int[1] ;
      T01RJ2_n129BarCod = new boolean[] {false} ;
      T01RJ2_A132BarCodReo = new byte[1] ;
      T01RJ2_n132BarCodReo = new boolean[] {false} ;
      T01RJ2_A130BarCodPar = new String[] {""} ;
      T01RJ2_n130BarCodPar = new boolean[] {false} ;
      T01RJ2_A119BarAgrCod = new int[1] ;
      T01RJ2_A124BarAgrReo = new byte[1] ;
      T01RJ2_A122BarAgrPar = new String[] {""} ;
      T01RJ2_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ2_A671PieAgr = new short[1] ;
      T01RJ2_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ2_A1508CliCodAgr = new int[1] ;
      T01RJ2_A1245BarAgrSer = new String[] {""} ;
      T01RJ2_A1507BarAgrDsc = new String[] {""} ;
      T01RJ2_A1510ColNomAgr = new String[] {""} ;
      T01RJ2_A1512ColNumAgr = new int[1] ;
      T01RJ2_A1513DisCodAgr = new int[1] ;
      T01RJ2_A1509ColNoCAgr = new String[] {""} ;
      T01RJ2_A1511ColNuCAgr = new int[1] ;
      T01RJ2_A1649BarAgrDNu = new String[] {""} ;
      T01RJ2_A396EmprCod = new String[] {""} ;
      T01RJ2_n396EmprCod = new boolean[] {false} ;
      T01RJ110_A121BarAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ110_A868BarAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RJ110_A1650BarAgrNDes = new short[1] ;
      T01RJ110_A1651BarPNDes = new short[1] ;
      T01RJ111_A474FindBarAgr = new String[] {""} ;
      T01RJ111_n474FindBarAgr = new boolean[] {false} ;
      T01RJ112_A1653FindDes = new String[] {""} ;
      T01RJ112_n1653FindDes = new boolean[] {false} ;
      T01RJ113_A396EmprCod = new String[] {""} ;
      T01RJ113_n396EmprCod = new boolean[] {false} ;
      T01RJ113_A129BarCod = new int[1] ;
      T01RJ113_n129BarCod = new boolean[] {false} ;
      T01RJ113_A132BarCodReo = new byte[1] ;
      T01RJ113_n132BarCodReo = new boolean[] {false} ;
      T01RJ113_A130BarCodPar = new String[] {""} ;
      T01RJ113_n130BarCodPar = new boolean[] {false} ;
      T01RJ113_A119BarAgrCod = new int[1] ;
      T01RJ113_A124BarAgrReo = new byte[1] ;
      T01RJ113_A122BarAgrPar = new String[] {""} ;
      Gridlevel_baragrRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_baragr_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i13846BarAgrCant = DecimalUtil.ZERO ;
      Gridlevel_baragrColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_int6 = new byte[1] ;
      GXv_int14 = new short[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      Z401EmprCodVi = "" ;
      Z13696BarNHdr = "" ;
      ZV10BarCodPar = "" ;
      GXt_char1 = "" ;
      Z13878PedidoClie = "" ;
      GXv_char12 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new int[1] ;
      Z121BarAgrKgm = DecimalUtil.ZERO ;
      Z868BarAgrMtr = DecimalUtil.ZERO ;
      Z13792BarAgrNhdr = "" ;
      Z13695BarAGrHdr = "" ;
      ZV33BarAgrSer = "" ;
      ZV34ColNomAgr = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.recetasdetinte_agrupacion__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.recetasdetinte_agrupacion__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.recetasdetinte_agrupacion__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.recetasdetinte_agrupacion__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdetinte_agrupacion__default(),
         new Object[] {
             new Object[] {
            T01RJ2_A129BarCod, T01RJ2_A132BarCodReo, T01RJ2_A130BarCodPar, T01RJ2_A119BarAgrCod, T01RJ2_A124BarAgrReo, T01RJ2_A122BarAgrPar, T01RJ2_A590KgmAgr, T01RJ2_A671PieAgr, T01RJ2_A869MtrAgr, T01RJ2_A1508CliCodAgr,
            T01RJ2_A1245BarAgrSer, T01RJ2_A1507BarAgrDsc, T01RJ2_A1510ColNomAgr, T01RJ2_A1512ColNumAgr, T01RJ2_A1513DisCodAgr, T01RJ2_A1509ColNoCAgr, T01RJ2_A1511ColNuCAgr, T01RJ2_A1649BarAgrDNu, T01RJ2_A396EmprCod
            }
            , new Object[] {
            T01RJ3_A129BarCod, T01RJ3_A132BarCodReo, T01RJ3_A130BarCodPar, T01RJ3_A119BarAgrCod, T01RJ3_A124BarAgrReo, T01RJ3_A122BarAgrPar, T01RJ3_A590KgmAgr, T01RJ3_A671PieAgr, T01RJ3_A869MtrAgr, T01RJ3_A1508CliCodAgr,
            T01RJ3_A1245BarAgrSer, T01RJ3_A1507BarAgrDsc, T01RJ3_A1510ColNomAgr, T01RJ3_A1512ColNumAgr, T01RJ3_A1513DisCodAgr, T01RJ3_A1509ColNoCAgr, T01RJ3_A1511ColNuCAgr, T01RJ3_A1649BarAgrDNu, T01RJ3_A396EmprCod
            }
            , new Object[] {
            T01RJ5_A121BarAgrKgm, T01RJ5_A868BarAgrMtr, T01RJ5_A1650BarAgrNDes, T01RJ5_A1651BarPNDes
            }
            , new Object[] {
            T01RJ6_A474FindBarAgr, T01RJ6_n474FindBarAgr
            }
            , new Object[] {
            T01RJ7_A1653FindDes, T01RJ7_n1653FindDes
            }
            , new Object[] {
            T01RJ8_A361DisCod, T01RJ8_A2759BarMaqGru, T01RJ8_A129BarCod, T01RJ8_A132BarCodReo, T01RJ8_A130BarCodPar, T01RJ8_A143BarDisNum, T01RJ8_A120BarAgrEst, T01RJ8_A180BarMaqCod, T01RJ8_A236BarVolMaq, T01RJ8_A213BarSit,
            T01RJ8_A212BarSer, T01RJ8_A135BarColNom, T01RJ8_A136BarColNum, T01RJ8_A4812BarEncCli, T01RJ8_A396EmprCod, T01RJ8_A252CliCod, T01RJ8_n252CliCod, T01RJ8_A365DisDes
            }
            , new Object[] {
            T01RJ9_A361DisCod, T01RJ9_A2759BarMaqGru, T01RJ9_A129BarCod, T01RJ9_A132BarCodReo, T01RJ9_A130BarCodPar, T01RJ9_A143BarDisNum, T01RJ9_A120BarAgrEst, T01RJ9_A180BarMaqCod, T01RJ9_A236BarVolMaq, T01RJ9_A213BarSit,
            T01RJ9_A212BarSer, T01RJ9_A135BarColNom, T01RJ9_A136BarColNum, T01RJ9_A4812BarEncCli, T01RJ9_A396EmprCod, T01RJ9_A252CliCod, T01RJ9_n252CliCod, T01RJ9_A365DisDes
            }
            , new Object[] {
            T01RJ10_A407EmprNom, T01RJ10_n407EmprNom
            }
            , new Object[] {
            T01RJ11_A252CliCod, T01RJ11_A365DisDes
            }
            , new Object[] {
            T01RJ13_A478FindVolMax, T01RJ13_A479FindVolMed, T01RJ13_A480FindVolMin
            }
            , new Object[] {
            T01RJ15_A13846BarAgrCant, T01RJ15_n13846BarAgrCant
            }
            , new Object[] {
            T01RJ17_A361DisCod, T01RJ17_A2759BarMaqGru, T01RJ17_A129BarCod, T01RJ17_A132BarCodReo, T01RJ17_A130BarCodPar, T01RJ17_A407EmprNom, T01RJ17_n407EmprNom, T01RJ17_A143BarDisNum, T01RJ17_A120BarAgrEst, T01RJ17_A180BarMaqCod,
            T01RJ17_A236BarVolMaq, T01RJ17_A213BarSit, T01RJ17_A252CliCod, T01RJ17_n252CliCod, T01RJ17_A212BarSer, T01RJ17_A135BarColNom, T01RJ17_A136BarColNum, T01RJ17_A4812BarEncCli, T01RJ17_A365DisDes, T01RJ17_A396EmprCod,
            T01RJ17_A13846BarAgrCant, T01RJ17_n13846BarAgrCant
            }
            , new Object[] {
            T01RJ18_A407EmprNom, T01RJ18_n407EmprNom
            }
            , new Object[] {
            T01RJ19_A252CliCod, T01RJ19_A365DisDes
            }
            , new Object[] {
            T01RJ21_A478FindVolMax, T01RJ21_A479FindVolMed, T01RJ21_A480FindVolMin
            }
            , new Object[] {
            T01RJ23_A13846BarAgrCant, T01RJ23_n13846BarAgrCant
            }
            , new Object[] {
            T01RJ24_A396EmprCod, T01RJ24_A129BarCod, T01RJ24_A132BarCodReo, T01RJ24_A130BarCodPar
            }
            , new Object[] {
            T01RJ25_A396EmprCod, T01RJ25_A129BarCod, T01RJ25_A132BarCodReo, T01RJ25_A130BarCodPar
            }
            , new Object[] {
            T01RJ26_A396EmprCod, T01RJ26_A129BarCod, T01RJ26_A132BarCodReo, T01RJ26_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RJ30_A407EmprNom, T01RJ30_n407EmprNom
            }
            , new Object[] {
            T01RJ32_A13846BarAgrCant, T01RJ32_n13846BarAgrCant
            }
            , new Object[] {
            T01RJ33_A252CliCod, T01RJ33_A365DisDes
            }
            , new Object[] {
            T01RJ35_A478FindVolMax, T01RJ35_A479FindVolMed, T01RJ35_A480FindVolMin
            }
            , new Object[] {
            T01RJ36_A14681MRPrId
            }
            , new Object[] {
            T01RJ37_A5921XCjaDis, T01RJ37_A5922XCjaCod
            }
            , new Object[] {
            T01RJ38_A396EmprCod, T01RJ38_A129BarCod, T01RJ38_A132BarCodReo, T01RJ38_A130BarCodPar, T01RJ38_A14152MEnvOrd
            }
            , new Object[] {
            T01RJ39_A396EmprCod, T01RJ39_A129BarCod, T01RJ39_A132BarCodReo, T01RJ39_A130BarCodPar, T01RJ39_A13905BarTraID
            }
            , new Object[] {
            T01RJ40_A396EmprCod, T01RJ40_A129BarCod, T01RJ40_A132BarCodReo, T01RJ40_A130BarCodPar, T01RJ40_A13093BarDGLin, T01RJ40_A13094BarDGDibCl, T01RJ40_A13095BarDGDibIn, T01RJ40_A13096BarDGComb, T01RJ40_A13097BarDGFOndo
            }
            , new Object[] {
            T01RJ41_A396EmprCod, T01RJ41_A11917Ebd_numero
            }
            , new Object[] {
            T01RJ42_A396EmprCod, T01RJ42_A11898Prd_numero
            }
            , new Object[] {
            T01RJ43_A396EmprCod, T01RJ43_A11849Cte_numero
            }
            , new Object[] {
            T01RJ44_A396EmprCod, T01RJ44_A11791Ap_numero
            }
            , new Object[] {
            T01RJ45_A396EmprCod, T01RJ45_A3985CalBarCod, T01RJ45_A3986CalBarCodR, T01RJ45_A3987CalBarCodP
            }
            , new Object[] {
            T01RJ46_A396EmprCod, T01RJ46_A5294InPTime, T01RJ46_A652OpeCod
            }
            , new Object[] {
            T01RJ47_A396EmprCod, T01RJ47_A129BarCod, T01RJ47_A132BarCodReo, T01RJ47_A130BarCodPar, T01RJ47_A4118tinagrcod, T01RJ47_A4119tinagrreo, T01RJ47_A4120tinagrpar
            }
            , new Object[] {
            T01RJ48_A396EmprCod, T01RJ48_A129BarCod, T01RJ48_A132BarCodReo, T01RJ48_A130BarCodPar, T01RJ48_A4080estagrcod, T01RJ48_A4081estagrreo, T01RJ48_A4082estagrpar
            }
            , new Object[] {
            T01RJ49_A396EmprCod, T01RJ49_A129BarCod, T01RJ49_A132BarCodReo, T01RJ49_A130BarCodPar, T01RJ49_A4075recestncol, T01RJ49_A4076recestnpro
            }
            , new Object[] {
            T01RJ50_A396EmprCod, T01RJ50_A602MaqCod, T01RJ50_A1142MaqFCod, T01RJ50_A3068PlaEtaOrd, T01RJ50_A3069PlaEtaOrdA, T01RJ50_A129BarCod, T01RJ50_A132BarCodReo, T01RJ50_A130BarCodPar
            }
            , new Object[] {
            T01RJ51_A396EmprCod, T01RJ51_A129BarCod, T01RJ51_A132BarCodReo, T01RJ51_A130BarCodPar, T01RJ51_A4846BarAudLin
            }
            , new Object[] {
            T01RJ52_A396EmprCod, T01RJ52_A129BarCod, T01RJ52_A132BarCodReo, T01RJ52_A130BarCodPar, T01RJ52_A3940BarEnsLin
            }
            , new Object[] {
            T01RJ53_A396EmprCod, T01RJ53_A129BarCod, T01RJ53_A132BarCodReo, T01RJ53_A130BarCodPar, T01RJ53_A3384RefBarCod, T01RJ53_A3385RefBarReo, T01RJ53_A3386RefBarPar
            }
            , new Object[] {
            T01RJ54_A396EmprCod, T01RJ54_A10914SolSalCod
            }
            , new Object[] {
            T01RJ55_A396EmprCod, T01RJ55_A10364Ph_numero
            }
            , new Object[] {
            T01RJ56_A396EmprCod, T01RJ56_A129BarCod, T01RJ56_A132BarCodReo, T01RJ56_A130BarCodPar, T01RJ56_A10197ProEspCod
            }
            , new Object[] {
            T01RJ57_A396EmprCod, T01RJ57_A129BarCod, T01RJ57_A132BarCodReo, T01RJ57_A130BarCodPar, T01RJ57_A5322Dp_Nrecep
            }
            , new Object[] {
            T01RJ58_A396EmprCod, T01RJ58_A129BarCod, T01RJ58_A132BarCodReo, T01RJ58_A130BarCodPar, T01RJ58_A8569EntSecLn
            }
            , new Object[] {
            T01RJ59_A396EmprCod, T01RJ59_A7434PLLNro, T01RJ59_A7443LPLNro, T01RJ59_A7459CPLCom, T01RJ59_A129BarCod, T01RJ59_A132BarCodReo, T01RJ59_A130BarCodPar
            }
            , new Object[] {
            T01RJ60_A396EmprCod, T01RJ60_A7145OSSCod
            }
            , new Object[] {
            T01RJ61_A396EmprCod, T01RJ61_A7049OGSCod
            }
            , new Object[] {
            T01RJ62_A396EmprCod, T01RJ62_A129BarCod, T01RJ62_A132BarCodReo, T01RJ62_A130BarCodPar, T01RJ62_A6031Ac_Barcod, T01RJ62_A6032Ac_BarReo, T01RJ62_A6033Ac_BarPar
            }
            , new Object[] {
            T01RJ63_A396EmprCod, T01RJ63_A129BarCod, T01RJ63_A132BarCodReo, T01RJ63_A130BarCodPar, T01RJ63_A5908PartPal
            }
            , new Object[] {
            T01RJ64_A396EmprCod, T01RJ64_A129BarCod, T01RJ64_A132BarCodReo, T01RJ64_A130BarCodPar, T01RJ64_A2524DisComLin, T01RJ64_A1056DisComCod, T01RJ64_A1032FonCod
            }
            , new Object[] {
            T01RJ65_A396EmprCod, T01RJ65_A1736AlbExtCod, T01RJ65_A129BarCod, T01RJ65_A132BarCodReo, T01RJ65_A130BarCodPar
            }
            , new Object[] {
            T01RJ66_A396EmprCod, T01RJ66_A129BarCod, T01RJ66_A132BarCodReo, T01RJ66_A130BarCodPar, T01RJ66_A3753BarFoaCod, T01RJ66_A3754BarFoaReo, T01RJ66_A3755BarFoaPar
            }
            , new Object[] {
            T01RJ67_A396EmprCod, T01RJ67_A129BarCod, T01RJ67_A132BarCodReo, T01RJ67_A130BarCodPar, T01RJ67_A3747BarPegCod, T01RJ67_A3748BarPegReo, T01RJ67_A3749BarPegPar
            }
            , new Object[] {
            T01RJ68_A396EmprCod, T01RJ68_A3253SolTraCod
            }
            , new Object[] {
            T01RJ69_A396EmprCod, T01RJ69_A3235SolSubCod
            }
            , new Object[] {
            T01RJ70_A396EmprCod, T01RJ70_A3218SolLuzCod
            }
            , new Object[] {
            T01RJ71_A396EmprCod, T01RJ71_A3196SolFriCod
            }
            , new Object[] {
            T01RJ72_A396EmprCod, T01RJ72_A3165SolPilCod
            }
            , new Object[] {
            T01RJ73_A396EmprCod, T01RJ73_A129BarCod, T01RJ73_A132BarCodReo, T01RJ73_A130BarCodPar, T01RJ73_A2872HAnRLinMaq, T01RJ73_A2873HAnRLinPro, T01RJ73_A2874HAnRLin, T01RJ73_A2875HAnNumAny
            }
            , new Object[] {
            T01RJ74_A396EmprCod, T01RJ74_A2817PlaTer, T01RJ74_A2818PlaOrd
            }
            , new Object[] {
            T01RJ75_A396EmprCod, T01RJ75_A2809MetTerCod, T01RJ75_A129BarCod, T01RJ75_A132BarCodReo, T01RJ75_A130BarCodPar
            }
            , new Object[] {
            T01RJ76_A396EmprCod, T01RJ76_A129BarCod, T01RJ76_A132BarCodReo, T01RJ76_A130BarCodPar, T01RJ76_A2808RecLinMAL, T01RJ76_A1377RecNumAny, T01RJ76_A719PrdNum
            }
            , new Object[] {
            T01RJ77_A396EmprCod, T01RJ77_A129BarCod, T01RJ77_A132BarCodReo, T01RJ77_A130BarCodPar, T01RJ77_A2804RecLinMaq
            }
            , new Object[] {
            T01RJ78_A396EmprCod, T01RJ78_A2792TermiCod, T01RJ78_A129BarCod, T01RJ78_A132BarCodReo, T01RJ78_A130BarCodPar
            }
            , new Object[] {
            T01RJ79_A396EmprCod, T01RJ79_A2248ManCod, T01RJ79_A2711RpExHdFe, T01RJ79_A2713RpExHdLi
            }
            , new Object[] {
            T01RJ80_A396EmprCod, T01RJ80_A2248ManCod, T01RJ80_A2689ExHdrFas, T01RJ80_A2692ExHdrLin
            }
            , new Object[] {
            T01RJ81_A396EmprCod, T01RJ81_A129BarCod, T01RJ81_A132BarCodReo, T01RJ81_A130BarCodPar, T01RJ81_A2494BarDosPro, T01RJ81_A719PrdNum
            }
            , new Object[] {
            T01RJ82_A396EmprCod, T01RJ82_A602MaqCod, T01RJ82_A2461PlaFecTin, T01RJ82_A129BarCod, T01RJ82_A132BarCodReo, T01RJ82_A130BarCodPar
            }
            , new Object[] {
            T01RJ83_A396EmprCod, T01RJ83_A129BarCod, T01RJ83_A132BarCodReo, T01RJ83_A130BarCodPar, T01RJ83_A2457BarObLin
            }
            , new Object[] {
            T01RJ84_A396EmprCod, T01RJ84_A129BarCod, T01RJ84_A132BarCodReo, T01RJ84_A130BarCodPar, T01RJ84_A2444BarEnLin
            }
            , new Object[] {
            T01RJ85_A396EmprCod, T01RJ85_A2406ExhAlbCod, T01RJ85_A129BarCod, T01RJ85_A132BarCodReo, T01RJ85_A130BarCodPar
            }
            , new Object[] {
            T01RJ86_A396EmprCod, T01RJ86_A2253SalExtAlb, T01RJ86_A129BarCod, T01RJ86_A132BarCodReo, T01RJ86_A130BarCodPar
            }
            , new Object[] {
            T01RJ87_A396EmprCod, T01RJ87_A30AlbProCod, T01RJ87_A129BarCod, T01RJ87_A132BarCodReo, T01RJ87_A130BarCodPar
            }
            , new Object[] {
            T01RJ88_A396EmprCod, T01RJ88_A1348SolColCod
            }
            , new Object[] {
            T01RJ89_A396EmprCod, T01RJ89_A1333EstDimCod
            }
            , new Object[] {
            T01RJ90_A396EmprCod, T01RJ90_A1314EnsLabCod
            }
            , new Object[] {
            T01RJ91_A396EmprCod, T01RJ91_A129BarCod, T01RJ91_A132BarCodReo, T01RJ91_A130BarCodPar, T01RJ91_A906ObsReoLin
            }
            , new Object[] {
            T01RJ92_A396EmprCod, T01RJ92_A859CumCodCont
            }
            , new Object[] {
            T01RJ93_A396EmprCod, T01RJ93_A602MaqCod, T01RJ93_A558HisProFec, T01RJ93_A561HisProLin
            }
            , new Object[] {
            T01RJ94_A396EmprCod, T01RJ94_A252CliCod, T01RJ94_A494ForSer, T01RJ94_A482ForColNom, T01RJ94_A483ForColNum, T01RJ94_A831TipColCod
            }
            , new Object[] {
            T01RJ95_A396EmprCod, T01RJ95_A129BarCod, T01RJ95_A132BarCodReo, T01RJ95_A130BarCodPar, T01RJ95_A200BarPieCod
            }
            , new Object[] {
            T01RJ96_A396EmprCod, T01RJ96_A129BarCod, T01RJ96_A132BarCodReo, T01RJ96_A130BarCodPar, T01RJ96_A188BarNotLin
            }
            , new Object[] {
            T01RJ97_A396EmprCod, T01RJ97_A129BarCod, T01RJ97_A132BarCodReo, T01RJ97_A130BarCodPar, T01RJ97_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01RJ99_A396EmprCod, T01RJ99_A129BarCod, T01RJ99_A132BarCodReo, T01RJ99_A130BarCodPar
            }
            , new Object[] {
            T01RJ100_A129BarCod, T01RJ100_A132BarCodReo, T01RJ100_A130BarCodPar, T01RJ100_A119BarAgrCod, T01RJ100_A124BarAgrReo, T01RJ100_A122BarAgrPar, T01RJ100_A590KgmAgr, T01RJ100_A671PieAgr, T01RJ100_A869MtrAgr, T01RJ100_A1508CliCodAgr,
            T01RJ100_A1245BarAgrSer, T01RJ100_A1507BarAgrDsc, T01RJ100_A1510ColNomAgr, T01RJ100_A1512ColNumAgr, T01RJ100_A1513DisCodAgr, T01RJ100_A1509ColNoCAgr, T01RJ100_A1511ColNuCAgr, T01RJ100_A1649BarAgrDNu, T01RJ100_A396EmprCod, T01RJ100_A474FindBarAgr,
            T01RJ100_n474FindBarAgr, T01RJ100_A1653FindDes, T01RJ100_n1653FindDes
            }
            , new Object[] {
            T01RJ102_A121BarAgrKgm, T01RJ102_A868BarAgrMtr, T01RJ102_A1650BarAgrNDes, T01RJ102_A1651BarPNDes
            }
            , new Object[] {
            T01RJ103_A474FindBarAgr, T01RJ103_n474FindBarAgr
            }
            , new Object[] {
            T01RJ104_A1653FindDes, T01RJ104_n1653FindDes
            }
            , new Object[] {
            T01RJ105_A396EmprCod, T01RJ105_A129BarCod, T01RJ105_A132BarCodReo, T01RJ105_A130BarCodPar, T01RJ105_A119BarAgrCod, T01RJ105_A124BarAgrReo, T01RJ105_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RJ110_A121BarAgrKgm, T01RJ110_A868BarAgrMtr, T01RJ110_A1650BarAgrNDes, T01RJ110_A1651BarPNDes
            }
            , new Object[] {
            T01RJ111_A474FindBarAgr, T01RJ111_n474FindBarAgr
            }
            , new Object[] {
            T01RJ112_A1653FindDes, T01RJ112_n1653FindDes
            }
            , new Object[] {
            T01RJ113_A396EmprCod, T01RJ113_A129BarCod, T01RJ113_A132BarCodReo, T01RJ113_A130BarCodPar, T01RJ113_A119BarAgrCod, T01RJ113_A124BarAgrReo, T01RJ113_A122BarAgrPar
            }
         }
      );
   }

   private byte wcpOAV9BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z213BarSit ;
   private byte N132BarCodReo ;
   private byte Z124BarAgrReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte AV9BarCodReo ;
   private byte nKeyPressed ;
   private byte A213BarSit ;
   private byte GXt_int5 ;
   private byte Gx_BScreen ;
   private byte subGridlevel_baragr_Backcolorstyle ;
   private byte subGridlevel_baragr_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_baragr_Allowselection ;
   private byte subGridlevel_baragr_Allowhovering ;
   private byte subGridlevel_baragr_Allowcollapsing ;
   private byte subGridlevel_baragr_Collapsed ;
   private byte GXv_int6[] ;
   private byte ZV9BarCodReo ;
   private byte GXv_int10[] ;
   private short Z671PieAgr ;
   private short nRcdDeleted_13 ;
   private short nRcdExists_13 ;
   private short nIsMod_13 ;
   private short AV36ControlAlbaran ;
   private short AV14FlagMAgr ;
   private short AV15FlagEli ;
   private short AV17FasMin ;
   private short A671PieAgr ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount13 ;
   private short RcdFound13 ;
   private short nBlankRcdUsr13 ;
   private short RcdFound12 ;
   private short sV14FlagMAgr ;
   private short OV14FlagMAgr ;
   private short A123BarAgrPie ;
   private short A1650BarAgrNDes ;
   private short A1651BarPNDes ;
   private short AV16Vincolor ;
   private short AV18Wckgcol ;
   private short AV19AgrCol ;
   private short AV20Lindalana ;
   private short AV21Eliot ;
   private short AV37carvema ;
   private short AV38Tintutex ;
   private short nIsDirty_12 ;
   private short nIsDirty_13 ;
   private short iV14FlagMAgr ;
   private short GXv_int14[] ;
   private short Z1650BarAgrNDes ;
   private short Z1651BarPNDes ;
   private short Z123BarAgrPie ;
   private int wcpOAV8BarCod ;
   private int Z129BarCod ;
   private int Z361DisCod ;
   private int Z236BarVolMaq ;
   private int Z136BarColNum ;
   private int nRC_GXsfl_47 ;
   private int nGXsfl_47_idx=1 ;
   private int N129BarCod ;
   private int Z119BarAgrCod ;
   private int Z1508CliCodAgr ;
   private int Z1512ColNumAgr ;
   private int Z1513DisCodAgr ;
   private int Z1511ColNuCAgr ;
   private int O119BarAgrCod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int AV32CliCodAgr ;
   private int AV35ColNumAgr ;
   private int A1508CliCodAgr ;
   private int A1512ColNumAgr ;
   private int A236BarVolMaq ;
   private int AV8BarCod ;
   private int A361DisCod ;
   private int trnEnded ;
   private int edtBarNHdr_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtBarMaqCod_Enabled ;
   private int edtBarVolMaq_Enabled ;
   private int edtBarSer_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtneliminarlinea_Visible ;
   private int bttBtneliminaragrupacion_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Visible ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Visible ;
   private int edtBarCodPar_Enabled ;
   private int edtPedidoClie_Visible ;
   private int edtPedidoClie_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtBarDisNum_Visible ;
   private int edtBarDisNum_Enabled ;
   private int edtEmprCodVi_Visible ;
   private int edtEmprCodVi_Enabled ;
   private int edtBarAgrEst_Visible ;
   private int edtBarAgrEst_Enabled ;
   private int A479FindVolMed ;
   private int edtFindVolMed_Enabled ;
   private int edtFindVolMed_Visible ;
   private int A480FindVolMin ;
   private int edtFindVolMin_Enabled ;
   private int edtFindVolMin_Visible ;
   private int A478FindVolMax ;
   private int edtFindVolMax_Enabled ;
   private int edtFindVolMax_Visible ;
   private int edtBarSit_Enabled ;
   private int edtBarSit_Visible ;
   private int edtBarAgrCant_Enabled ;
   private int edtBarAgrCant_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarColNum_Visible ;
   private int edtBarAgrCod_Enabled ;
   private int edtBarAgrReo_Enabled ;
   private int edtBarAgrPar_Enabled ;
   private int edtCliCodAgr_Enabled ;
   private int edtBarAgrSer_Enabled ;
   private int edtBarAgrDsc_Enabled ;
   private int edtColNomAgr_Enabled ;
   private int edtColNumAgr_Enabled ;
   private int edtKgmAgr_Enabled ;
   private int edtMtrAgr_Enabled ;
   private int edtPieAgr_Enabled ;
   private int edtBarAgrKgm_Enabled ;
   private int edtBarAgrMtr_Enabled ;
   private int edtBarAgrPie_Enabled ;
   private int edtBarAgrNDes_Enabled ;
   private int edtBarPNDes_Enabled ;
   private int edtFindDes_Enabled ;
   private int edtFindBarAgr_Enabled ;
   private int edtDisCodAgr_Enabled ;
   private int edtColNoCAgr_Enabled ;
   private int edtColNuCAgr_Enabled ;
   private int edtBarAgrDNu_Enabled ;
   private int edtBarAGrHdr_Enabled ;
   private int edtBarAgrNhdr_Enabled ;
   private int fRowAdded ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int A1513DisCodAgr ;
   private int A1511ColNuCAgr ;
   private int T119BarAgrCod ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int subGridlevel_baragr_Backcolor ;
   private int subGridlevel_baragr_Allbackcolor ;
   private int defedtBarAgrNhdr_Enabled ;
   private int defedtBarAGrHdr_Enabled ;
   private int defedtBarAgrDNu_Enabled ;
   private int defedtColNuCAgr_Enabled ;
   private int defedtColNoCAgr_Enabled ;
   private int defedtDisCodAgr_Enabled ;
   private int defedtFindBarAgr_Enabled ;
   private int defedtFindDes_Enabled ;
   private int defedtBarPNDes_Enabled ;
   private int defedtBarAgrNDes_Enabled ;
   private int defedtBarAgrPie_Enabled ;
   private int defedtBarAgrMtr_Enabled ;
   private int defedtBarAgrKgm_Enabled ;
   private int defedtPieAgr_Enabled ;
   private int defedtMtrAgr_Enabled ;
   private int defedtKgmAgr_Enabled ;
   private int defedtColNumAgr_Enabled ;
   private int defedtColNomAgr_Enabled ;
   private int defedtBarAgrDsc_Enabled ;
   private int defedtBarAgrSer_Enabled ;
   private int defedtCliCodAgr_Enabled ;
   private int defedtBarAgrPar_Enabled ;
   private int defedtBarAgrReo_Enabled ;
   private int defedtBarAgrCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_baragr_Selectedindex ;
   private int subGridlevel_baragr_Selectioncolor ;
   private int subGridlevel_baragr_Hoveringcolor ;
   private int ZV8BarCod ;
   private int Z478FindVolMax ;
   private int Z479FindVolMed ;
   private int Z480FindVolMin ;
   private int GXv_int13[] ;
   private int GXv_int9[] ;
   private int GXv_int8[] ;
   private int ZV32CliCodAgr ;
   private int ZV35ColNumAgr ;
   private long GRIDLEVEL_BARAGR_nFirstRecordOnPage ;
   private java.math.BigDecimal O13846BarAgrCant ;
   private java.math.BigDecimal Z590KgmAgr ;
   private java.math.BigDecimal Z869MtrAgr ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal A13846BarAgrCant ;
   private java.math.BigDecimal B13846BarAgrCant ;
   private java.math.BigDecimal AV43Flagrec ;
   private java.math.BigDecimal s13846BarAgrCant ;
   private java.math.BigDecimal A121BarAgrKgm ;
   private java.math.BigDecimal A868BarAgrMtr ;
   private java.math.BigDecimal Z13846BarAgrCant ;
   private java.math.BigDecimal i13846BarAgrCant ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal Z121BarAgrKgm ;
   private java.math.BigDecimal Z868BarAgrMtr ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV10BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z143BarDisNum ;
   private String Z120BarAgrEst ;
   private String Z180BarMaqCod ;
   private String Z212BarSer ;
   private String Z135BarColNom ;
   private String Z4812BarEncCli ;
   private String N130BarCodPar ;
   private String Dvelop_confirmpanel_eliminarlinea_Result ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Result ;
   private String Z122BarAgrPar ;
   private String Z1245BarAgrSer ;
   private String Z1507BarAgrDsc ;
   private String Z1510ColNomAgr ;
   private String Z1509ColNoCAgr ;
   private String Z1649BarAgrDNu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private String AV33BarAgrSer ;
   private String AV34ColNomAgr ;
   private String A1245BarAgrSer ;
   private String A1510ColNomAgr ;
   private String A180BarMaqCod ;
   private String Gx_mode ;
   private String AV10BarCodPar ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A401EmprCodVi ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_47_idx="0001" ;
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
   private String edtBarNHdr_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtBarMaqCod_Internalname ;
   private String edtBarMaqCod_Jsonclick ;
   private String edtBarVolMaq_Internalname ;
   private String edtBarVolMaq_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String divTableleaflevel_baragr_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtneliminarlinea_Internalname ;
   private String bttBtneliminarlinea_Jsonclick ;
   private String bttBtneliminaragrupacion_Internalname ;
   private String bttBtneliminaragrupacion_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtPedidoClie_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtBarDisNum_Internalname ;
   private String edtBarDisNum_Jsonclick ;
   private String edtEmprCodVi_Internalname ;
   private String edtEmprCodVi_Jsonclick ;
   private String edtBarAgrEst_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Jsonclick ;
   private String edtFindVolMed_Internalname ;
   private String edtFindVolMed_Jsonclick ;
   private String edtFindVolMin_Internalname ;
   private String edtFindVolMin_Jsonclick ;
   private String edtFindVolMax_Internalname ;
   private String edtFindVolMax_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String edtBarAgrCant_Internalname ;
   private String edtBarAgrCant_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
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
   private String tblTabledvelop_confirmpanel_eliminaragrupacion_Internalname ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Title ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Confirmtype ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Internalname ;
   private String sMode13 ;
   private String edtBarAgrCod_Internalname ;
   private String edtBarAgrReo_Internalname ;
   private String edtBarAgrPar_Internalname ;
   private String edtCliCodAgr_Internalname ;
   private String edtBarAgrSer_Internalname ;
   private String edtBarAgrDsc_Internalname ;
   private String edtColNomAgr_Internalname ;
   private String edtColNumAgr_Internalname ;
   private String edtKgmAgr_Internalname ;
   private String edtMtrAgr_Internalname ;
   private String edtPieAgr_Internalname ;
   private String edtBarAgrKgm_Internalname ;
   private String edtBarAgrMtr_Internalname ;
   private String edtBarAgrPie_Internalname ;
   private String edtBarAgrNDes_Internalname ;
   private String edtBarPNDes_Internalname ;
   private String edtFindDes_Internalname ;
   private String edtFindBarAgr_Internalname ;
   private String edtDisCodAgr_Internalname ;
   private String edtColNoCAgr_Internalname ;
   private String edtColNuCAgr_Internalname ;
   private String edtBarAgrDNu_Internalname ;
   private String edtBarAGrHdr_Internalname ;
   private String edtBarAgrNhdr_Internalname ;
   private String subGridlevel_baragr_Internalname ;
   private String A2759BarMaqGru ;
   private String A365DisDes ;
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
   private String Dvelop_confirmpanel_eliminaragrupacion_Objectcall ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Width ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Height ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Class ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Comment ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Bodytype ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Bodycontentinternalname ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Texttype ;
   private String hsh ;
   private String sMode12 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A1507BarAgrDsc ;
   private String A1653FindDes ;
   private String A474FindBarAgr ;
   private String A1509ColNoCAgr ;
   private String A1649BarAgrDNu ;
   private String A13695BarAGrHdr ;
   private String A13792BarAgrNhdr ;
   private String AV41Station ;
   private String AV22BuscarEmprCod ;
   private String AV23EmprNom ;
   private String AV24UsurCod ;
   private String GXv_char2[] ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String Z474FindBarAgr ;
   private String Z1653FindDes ;
   private String sGXsfl_47_fel_idx="0001" ;
   private String subGridlevel_baragr_Class ;
   private String subGridlevel_baragr_Linesclass ;
   private String ROClassString ;
   private String edtBarAgrCod_Jsonclick ;
   private String edtBarAgrReo_Jsonclick ;
   private String edtBarAgrPar_Jsonclick ;
   private String edtCliCodAgr_Jsonclick ;
   private String edtBarAgrSer_Jsonclick ;
   private String edtBarAgrDsc_Jsonclick ;
   private String edtColNomAgr_Jsonclick ;
   private String edtColNumAgr_Jsonclick ;
   private String edtKgmAgr_Jsonclick ;
   private String edtMtrAgr_Jsonclick ;
   private String edtPieAgr_Jsonclick ;
   private String edtBarAgrKgm_Jsonclick ;
   private String edtBarAgrMtr_Jsonclick ;
   private String edtBarAgrPie_Jsonclick ;
   private String edtBarAgrNDes_Jsonclick ;
   private String edtBarPNDes_Jsonclick ;
   private String edtFindDes_Jsonclick ;
   private String edtFindBarAgr_Jsonclick ;
   private String edtDisCodAgr_Jsonclick ;
   private String edtColNoCAgr_Jsonclick ;
   private String edtColNuCAgr_Jsonclick ;
   private String edtBarAgrDNu_Jsonclick ;
   private String edtBarAGrHdr_Jsonclick ;
   private String edtBarAgrNhdr_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_baragr_Header ;
   private String Z401EmprCodVi ;
   private String Z13696BarNHdr ;
   private String ZV10BarCodPar ;
   private String GXt_char1 ;
   private String Z13878PedidoClie ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z13792BarAgrNhdr ;
   private String Z13695BarAGrHdr ;
   private String ZV33BarAgrSer ;
   private String ZV34ColNomAgr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n396EmprCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n13846BarAgrCant ;
   private boolean bGXsfl_47_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvelop_confirmpanel_eliminarlinea_Enabled ;
   private boolean Dvelop_confirmpanel_eliminarlinea_Visible ;
   private boolean Dvelop_confirmpanel_eliminaragrupacion_Enabled ;
   private boolean Dvelop_confirmpanel_eliminaragrupacion_Visible ;
   private boolean n252CliCod ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n474FindBarAgr ;
   private boolean n1653FindDes ;
   private String AV39Albaranes ;
   private String AV25msg0 ;
   private String AV26msg1 ;
   private String AV27msg2 ;
   private String AV28msg3 ;
   private String AV29msg4 ;
   private String AV30msg5 ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_baragrContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_baragrRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_baragrColumn ;
   private com.genexus.webpanels.WebSession AV13WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarlinea ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminaragrupacion ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01RJ10_A407EmprNom ;
   private boolean[] T01RJ10_n407EmprNom ;
   private java.math.BigDecimal[] T01RJ15_A13846BarAgrCant ;
   private boolean[] T01RJ15_n13846BarAgrCant ;
   private int[] T01RJ17_A361DisCod ;
   private String[] T01RJ17_A2759BarMaqGru ;
   private int[] T01RJ17_A129BarCod ;
   private boolean[] T01RJ17_n129BarCod ;
   private byte[] T01RJ17_A132BarCodReo ;
   private boolean[] T01RJ17_n132BarCodReo ;
   private String[] T01RJ17_A130BarCodPar ;
   private boolean[] T01RJ17_n130BarCodPar ;
   private String[] T01RJ17_A407EmprNom ;
   private boolean[] T01RJ17_n407EmprNom ;
   private String[] T01RJ17_A143BarDisNum ;
   private String[] T01RJ17_A120BarAgrEst ;
   private String[] T01RJ17_A180BarMaqCod ;
   private int[] T01RJ17_A236BarVolMaq ;
   private byte[] T01RJ17_A213BarSit ;
   private int[] T01RJ17_A252CliCod ;
   private boolean[] T01RJ17_n252CliCod ;
   private String[] T01RJ17_A212BarSer ;
   private String[] T01RJ17_A135BarColNom ;
   private int[] T01RJ17_A136BarColNum ;
   private String[] T01RJ17_A4812BarEncCli ;
   private String[] T01RJ17_A365DisDes ;
   private String[] T01RJ17_A396EmprCod ;
   private boolean[] T01RJ17_n396EmprCod ;
   private java.math.BigDecimal[] T01RJ17_A13846BarAgrCant ;
   private boolean[] T01RJ17_n13846BarAgrCant ;
   private int[] T01RJ11_A252CliCod ;
   private boolean[] T01RJ11_n252CliCod ;
   private String[] T01RJ11_A365DisDes ;
   private int[] T01RJ13_A478FindVolMax ;
   private int[] T01RJ13_A479FindVolMed ;
   private int[] T01RJ13_A480FindVolMin ;
   private String[] T01RJ18_A407EmprNom ;
   private boolean[] T01RJ18_n407EmprNom ;
   private int[] T01RJ19_A252CliCod ;
   private boolean[] T01RJ19_n252CliCod ;
   private String[] T01RJ19_A365DisDes ;
   private int[] T01RJ21_A478FindVolMax ;
   private int[] T01RJ21_A479FindVolMed ;
   private int[] T01RJ21_A480FindVolMin ;
   private java.math.BigDecimal[] T01RJ23_A13846BarAgrCant ;
   private boolean[] T01RJ23_n13846BarAgrCant ;
   private String[] T01RJ24_A396EmprCod ;
   private boolean[] T01RJ24_n396EmprCod ;
   private int[] T01RJ24_A129BarCod ;
   private boolean[] T01RJ24_n129BarCod ;
   private byte[] T01RJ24_A132BarCodReo ;
   private boolean[] T01RJ24_n132BarCodReo ;
   private String[] T01RJ24_A130BarCodPar ;
   private boolean[] T01RJ24_n130BarCodPar ;
   private int[] T01RJ9_A361DisCod ;
   private String[] T01RJ9_A2759BarMaqGru ;
   private int[] T01RJ9_A129BarCod ;
   private boolean[] T01RJ9_n129BarCod ;
   private byte[] T01RJ9_A132BarCodReo ;
   private boolean[] T01RJ9_n132BarCodReo ;
   private String[] T01RJ9_A130BarCodPar ;
   private boolean[] T01RJ9_n130BarCodPar ;
   private String[] T01RJ9_A143BarDisNum ;
   private String[] T01RJ9_A120BarAgrEst ;
   private String[] T01RJ9_A180BarMaqCod ;
   private int[] T01RJ9_A236BarVolMaq ;
   private byte[] T01RJ9_A213BarSit ;
   private String[] T01RJ9_A212BarSer ;
   private String[] T01RJ9_A135BarColNom ;
   private int[] T01RJ9_A136BarColNum ;
   private String[] T01RJ9_A4812BarEncCli ;
   private String[] T01RJ9_A396EmprCod ;
   private boolean[] T01RJ9_n396EmprCod ;
   private int[] T01RJ9_A252CliCod ;
   private boolean[] T01RJ9_n252CliCod ;
   private String[] T01RJ9_A365DisDes ;
   private String[] T01RJ25_A396EmprCod ;
   private boolean[] T01RJ25_n396EmprCod ;
   private int[] T01RJ25_A129BarCod ;
   private boolean[] T01RJ25_n129BarCod ;
   private byte[] T01RJ25_A132BarCodReo ;
   private boolean[] T01RJ25_n132BarCodReo ;
   private String[] T01RJ25_A130BarCodPar ;
   private boolean[] T01RJ25_n130BarCodPar ;
   private String[] T01RJ26_A396EmprCod ;
   private boolean[] T01RJ26_n396EmprCod ;
   private int[] T01RJ26_A129BarCod ;
   private boolean[] T01RJ26_n129BarCod ;
   private byte[] T01RJ26_A132BarCodReo ;
   private boolean[] T01RJ26_n132BarCodReo ;
   private String[] T01RJ26_A130BarCodPar ;
   private boolean[] T01RJ26_n130BarCodPar ;
   private int[] T01RJ8_A361DisCod ;
   private String[] T01RJ8_A2759BarMaqGru ;
   private int[] T01RJ8_A129BarCod ;
   private boolean[] T01RJ8_n129BarCod ;
   private byte[] T01RJ8_A132BarCodReo ;
   private boolean[] T01RJ8_n132BarCodReo ;
   private String[] T01RJ8_A130BarCodPar ;
   private boolean[] T01RJ8_n130BarCodPar ;
   private String[] T01RJ8_A143BarDisNum ;
   private String[] T01RJ8_A120BarAgrEst ;
   private String[] T01RJ8_A180BarMaqCod ;
   private int[] T01RJ8_A236BarVolMaq ;
   private byte[] T01RJ8_A213BarSit ;
   private String[] T01RJ8_A212BarSer ;
   private String[] T01RJ8_A135BarColNom ;
   private int[] T01RJ8_A136BarColNum ;
   private String[] T01RJ8_A4812BarEncCli ;
   private String[] T01RJ8_A396EmprCod ;
   private boolean[] T01RJ8_n396EmprCod ;
   private int[] T01RJ8_A252CliCod ;
   private boolean[] T01RJ8_n252CliCod ;
   private String[] T01RJ8_A365DisDes ;
   private String[] T01RJ30_A407EmprNom ;
   private boolean[] T01RJ30_n407EmprNom ;
   private java.math.BigDecimal[] T01RJ32_A13846BarAgrCant ;
   private boolean[] T01RJ32_n13846BarAgrCant ;
   private int[] T01RJ33_A252CliCod ;
   private boolean[] T01RJ33_n252CliCod ;
   private String[] T01RJ33_A365DisDes ;
   private int[] T01RJ35_A478FindVolMax ;
   private int[] T01RJ35_A479FindVolMed ;
   private int[] T01RJ35_A480FindVolMin ;
   private long[] T01RJ36_A14681MRPrId ;
   private String[] T01RJ37_A5921XCjaDis ;
   private long[] T01RJ37_A5922XCjaCod ;
   private String[] T01RJ38_A396EmprCod ;
   private boolean[] T01RJ38_n396EmprCod ;
   private int[] T01RJ38_A129BarCod ;
   private boolean[] T01RJ38_n129BarCod ;
   private byte[] T01RJ38_A132BarCodReo ;
   private boolean[] T01RJ38_n132BarCodReo ;
   private String[] T01RJ38_A130BarCodPar ;
   private boolean[] T01RJ38_n130BarCodPar ;
   private short[] T01RJ38_A14152MEnvOrd ;
   private String[] T01RJ39_A396EmprCod ;
   private boolean[] T01RJ39_n396EmprCod ;
   private int[] T01RJ39_A129BarCod ;
   private boolean[] T01RJ39_n129BarCod ;
   private byte[] T01RJ39_A132BarCodReo ;
   private boolean[] T01RJ39_n132BarCodReo ;
   private String[] T01RJ39_A130BarCodPar ;
   private boolean[] T01RJ39_n130BarCodPar ;
   private String[] T01RJ39_A13905BarTraID ;
   private String[] T01RJ40_A396EmprCod ;
   private boolean[] T01RJ40_n396EmprCod ;
   private int[] T01RJ40_A129BarCod ;
   private boolean[] T01RJ40_n129BarCod ;
   private byte[] T01RJ40_A132BarCodReo ;
   private boolean[] T01RJ40_n132BarCodReo ;
   private String[] T01RJ40_A130BarCodPar ;
   private boolean[] T01RJ40_n130BarCodPar ;
   private byte[] T01RJ40_A13093BarDGLin ;
   private String[] T01RJ40_A13094BarDGDibCl ;
   private int[] T01RJ40_A13095BarDGDibIn ;
   private String[] T01RJ40_A13096BarDGComb ;
   private String[] T01RJ40_A13097BarDGFOndo ;
   private String[] T01RJ41_A396EmprCod ;
   private boolean[] T01RJ41_n396EmprCod ;
   private int[] T01RJ41_A11917Ebd_numero ;
   private String[] T01RJ42_A396EmprCod ;
   private boolean[] T01RJ42_n396EmprCod ;
   private int[] T01RJ42_A11898Prd_numero ;
   private String[] T01RJ43_A396EmprCod ;
   private boolean[] T01RJ43_n396EmprCod ;
   private int[] T01RJ43_A11849Cte_numero ;
   private String[] T01RJ44_A396EmprCod ;
   private boolean[] T01RJ44_n396EmprCod ;
   private int[] T01RJ44_A11791Ap_numero ;
   private String[] T01RJ45_A396EmprCod ;
   private boolean[] T01RJ45_n396EmprCod ;
   private int[] T01RJ45_A3985CalBarCod ;
   private byte[] T01RJ45_A3986CalBarCodR ;
   private String[] T01RJ45_A3987CalBarCodP ;
   private String[] T01RJ46_A396EmprCod ;
   private boolean[] T01RJ46_n396EmprCod ;
   private java.util.Date[] T01RJ46_A5294InPTime ;
   private int[] T01RJ46_A652OpeCod ;
   private String[] T01RJ47_A396EmprCod ;
   private boolean[] T01RJ47_n396EmprCod ;
   private int[] T01RJ47_A129BarCod ;
   private boolean[] T01RJ47_n129BarCod ;
   private byte[] T01RJ47_A132BarCodReo ;
   private boolean[] T01RJ47_n132BarCodReo ;
   private String[] T01RJ47_A130BarCodPar ;
   private boolean[] T01RJ47_n130BarCodPar ;
   private int[] T01RJ47_A4118tinagrcod ;
   private byte[] T01RJ47_A4119tinagrreo ;
   private String[] T01RJ47_A4120tinagrpar ;
   private String[] T01RJ48_A396EmprCod ;
   private boolean[] T01RJ48_n396EmprCod ;
   private int[] T01RJ48_A129BarCod ;
   private boolean[] T01RJ48_n129BarCod ;
   private byte[] T01RJ48_A132BarCodReo ;
   private boolean[] T01RJ48_n132BarCodReo ;
   private String[] T01RJ48_A130BarCodPar ;
   private boolean[] T01RJ48_n130BarCodPar ;
   private int[] T01RJ48_A4080estagrcod ;
   private byte[] T01RJ48_A4081estagrreo ;
   private String[] T01RJ48_A4082estagrpar ;
   private String[] T01RJ49_A396EmprCod ;
   private boolean[] T01RJ49_n396EmprCod ;
   private int[] T01RJ49_A129BarCod ;
   private boolean[] T01RJ49_n129BarCod ;
   private byte[] T01RJ49_A132BarCodReo ;
   private boolean[] T01RJ49_n132BarCodReo ;
   private String[] T01RJ49_A130BarCodPar ;
   private boolean[] T01RJ49_n130BarCodPar ;
   private byte[] T01RJ49_A4075recestncol ;
   private byte[] T01RJ49_A4076recestnpro ;
   private String[] T01RJ50_A396EmprCod ;
   private boolean[] T01RJ50_n396EmprCod ;
   private String[] T01RJ50_A602MaqCod ;
   private String[] T01RJ50_A1142MaqFCod ;
   private short[] T01RJ50_A3068PlaEtaOrd ;
   private byte[] T01RJ50_A3069PlaEtaOrdA ;
   private int[] T01RJ50_A129BarCod ;
   private boolean[] T01RJ50_n129BarCod ;
   private byte[] T01RJ50_A132BarCodReo ;
   private boolean[] T01RJ50_n132BarCodReo ;
   private String[] T01RJ50_A130BarCodPar ;
   private boolean[] T01RJ50_n130BarCodPar ;
   private String[] T01RJ51_A396EmprCod ;
   private boolean[] T01RJ51_n396EmprCod ;
   private int[] T01RJ51_A129BarCod ;
   private boolean[] T01RJ51_n129BarCod ;
   private byte[] T01RJ51_A132BarCodReo ;
   private boolean[] T01RJ51_n132BarCodReo ;
   private String[] T01RJ51_A130BarCodPar ;
   private boolean[] T01RJ51_n130BarCodPar ;
   private short[] T01RJ51_A4846BarAudLin ;
   private String[] T01RJ52_A396EmprCod ;
   private boolean[] T01RJ52_n396EmprCod ;
   private int[] T01RJ52_A129BarCod ;
   private boolean[] T01RJ52_n129BarCod ;
   private byte[] T01RJ52_A132BarCodReo ;
   private boolean[] T01RJ52_n132BarCodReo ;
   private String[] T01RJ52_A130BarCodPar ;
   private boolean[] T01RJ52_n130BarCodPar ;
   private short[] T01RJ52_A3940BarEnsLin ;
   private String[] T01RJ53_A396EmprCod ;
   private boolean[] T01RJ53_n396EmprCod ;
   private int[] T01RJ53_A129BarCod ;
   private boolean[] T01RJ53_n129BarCod ;
   private byte[] T01RJ53_A132BarCodReo ;
   private boolean[] T01RJ53_n132BarCodReo ;
   private String[] T01RJ53_A130BarCodPar ;
   private boolean[] T01RJ53_n130BarCodPar ;
   private int[] T01RJ53_A3384RefBarCod ;
   private byte[] T01RJ53_A3385RefBarReo ;
   private String[] T01RJ53_A3386RefBarPar ;
   private String[] T01RJ54_A396EmprCod ;
   private boolean[] T01RJ54_n396EmprCod ;
   private int[] T01RJ54_A10914SolSalCod ;
   private String[] T01RJ55_A396EmprCod ;
   private boolean[] T01RJ55_n396EmprCod ;
   private int[] T01RJ55_A10364Ph_numero ;
   private String[] T01RJ56_A396EmprCod ;
   private boolean[] T01RJ56_n396EmprCod ;
   private int[] T01RJ56_A129BarCod ;
   private boolean[] T01RJ56_n129BarCod ;
   private byte[] T01RJ56_A132BarCodReo ;
   private boolean[] T01RJ56_n132BarCodReo ;
   private String[] T01RJ56_A130BarCodPar ;
   private boolean[] T01RJ56_n130BarCodPar ;
   private String[] T01RJ56_A10197ProEspCod ;
   private String[] T01RJ57_A396EmprCod ;
   private boolean[] T01RJ57_n396EmprCod ;
   private int[] T01RJ57_A129BarCod ;
   private boolean[] T01RJ57_n129BarCod ;
   private byte[] T01RJ57_A132BarCodReo ;
   private boolean[] T01RJ57_n132BarCodReo ;
   private String[] T01RJ57_A130BarCodPar ;
   private boolean[] T01RJ57_n130BarCodPar ;
   private int[] T01RJ57_A5322Dp_Nrecep ;
   private String[] T01RJ58_A396EmprCod ;
   private boolean[] T01RJ58_n396EmprCod ;
   private int[] T01RJ58_A129BarCod ;
   private boolean[] T01RJ58_n129BarCod ;
   private byte[] T01RJ58_A132BarCodReo ;
   private boolean[] T01RJ58_n132BarCodReo ;
   private String[] T01RJ58_A130BarCodPar ;
   private boolean[] T01RJ58_n130BarCodPar ;
   private int[] T01RJ58_A8569EntSecLn ;
   private String[] T01RJ59_A396EmprCod ;
   private boolean[] T01RJ59_n396EmprCod ;
   private int[] T01RJ59_A7434PLLNro ;
   private short[] T01RJ59_A7443LPLNro ;
   private short[] T01RJ59_A7459CPLCom ;
   private int[] T01RJ59_A129BarCod ;
   private boolean[] T01RJ59_n129BarCod ;
   private byte[] T01RJ59_A132BarCodReo ;
   private boolean[] T01RJ59_n132BarCodReo ;
   private String[] T01RJ59_A130BarCodPar ;
   private boolean[] T01RJ59_n130BarCodPar ;
   private String[] T01RJ60_A396EmprCod ;
   private boolean[] T01RJ60_n396EmprCod ;
   private int[] T01RJ60_A7145OSSCod ;
   private String[] T01RJ61_A396EmprCod ;
   private boolean[] T01RJ61_n396EmprCod ;
   private int[] T01RJ61_A7049OGSCod ;
   private String[] T01RJ62_A396EmprCod ;
   private boolean[] T01RJ62_n396EmprCod ;
   private int[] T01RJ62_A129BarCod ;
   private boolean[] T01RJ62_n129BarCod ;
   private byte[] T01RJ62_A132BarCodReo ;
   private boolean[] T01RJ62_n132BarCodReo ;
   private String[] T01RJ62_A130BarCodPar ;
   private boolean[] T01RJ62_n130BarCodPar ;
   private int[] T01RJ62_A6031Ac_Barcod ;
   private byte[] T01RJ62_A6032Ac_BarReo ;
   private String[] T01RJ62_A6033Ac_BarPar ;
   private String[] T01RJ63_A396EmprCod ;
   private boolean[] T01RJ63_n396EmprCod ;
   private int[] T01RJ63_A129BarCod ;
   private boolean[] T01RJ63_n129BarCod ;
   private byte[] T01RJ63_A132BarCodReo ;
   private boolean[] T01RJ63_n132BarCodReo ;
   private String[] T01RJ63_A130BarCodPar ;
   private boolean[] T01RJ63_n130BarCodPar ;
   private int[] T01RJ63_A5908PartPal ;
   private String[] T01RJ64_A396EmprCod ;
   private boolean[] T01RJ64_n396EmprCod ;
   private int[] T01RJ64_A129BarCod ;
   private boolean[] T01RJ64_n129BarCod ;
   private byte[] T01RJ64_A132BarCodReo ;
   private boolean[] T01RJ64_n132BarCodReo ;
   private String[] T01RJ64_A130BarCodPar ;
   private boolean[] T01RJ64_n130BarCodPar ;
   private byte[] T01RJ64_A2524DisComLin ;
   private String[] T01RJ64_A1056DisComCod ;
   private String[] T01RJ64_A1032FonCod ;
   private String[] T01RJ65_A396EmprCod ;
   private boolean[] T01RJ65_n396EmprCod ;
   private long[] T01RJ65_A1736AlbExtCod ;
   private int[] T01RJ65_A129BarCod ;
   private boolean[] T01RJ65_n129BarCod ;
   private byte[] T01RJ65_A132BarCodReo ;
   private boolean[] T01RJ65_n132BarCodReo ;
   private String[] T01RJ65_A130BarCodPar ;
   private boolean[] T01RJ65_n130BarCodPar ;
   private String[] T01RJ66_A396EmprCod ;
   private boolean[] T01RJ66_n396EmprCod ;
   private int[] T01RJ66_A129BarCod ;
   private boolean[] T01RJ66_n129BarCod ;
   private byte[] T01RJ66_A132BarCodReo ;
   private boolean[] T01RJ66_n132BarCodReo ;
   private String[] T01RJ66_A130BarCodPar ;
   private boolean[] T01RJ66_n130BarCodPar ;
   private int[] T01RJ66_A3753BarFoaCod ;
   private byte[] T01RJ66_A3754BarFoaReo ;
   private String[] T01RJ66_A3755BarFoaPar ;
   private String[] T01RJ67_A396EmprCod ;
   private boolean[] T01RJ67_n396EmprCod ;
   private int[] T01RJ67_A129BarCod ;
   private boolean[] T01RJ67_n129BarCod ;
   private byte[] T01RJ67_A132BarCodReo ;
   private boolean[] T01RJ67_n132BarCodReo ;
   private String[] T01RJ67_A130BarCodPar ;
   private boolean[] T01RJ67_n130BarCodPar ;
   private int[] T01RJ67_A3747BarPegCod ;
   private byte[] T01RJ67_A3748BarPegReo ;
   private String[] T01RJ67_A3749BarPegPar ;
   private String[] T01RJ68_A396EmprCod ;
   private boolean[] T01RJ68_n396EmprCod ;
   private int[] T01RJ68_A3253SolTraCod ;
   private String[] T01RJ69_A396EmprCod ;
   private boolean[] T01RJ69_n396EmprCod ;
   private int[] T01RJ69_A3235SolSubCod ;
   private String[] T01RJ70_A396EmprCod ;
   private boolean[] T01RJ70_n396EmprCod ;
   private int[] T01RJ70_A3218SolLuzCod ;
   private String[] T01RJ71_A396EmprCod ;
   private boolean[] T01RJ71_n396EmprCod ;
   private int[] T01RJ71_A3196SolFriCod ;
   private String[] T01RJ72_A396EmprCod ;
   private boolean[] T01RJ72_n396EmprCod ;
   private int[] T01RJ72_A3165SolPilCod ;
   private String[] T01RJ73_A396EmprCod ;
   private boolean[] T01RJ73_n396EmprCod ;
   private int[] T01RJ73_A129BarCod ;
   private boolean[] T01RJ73_n129BarCod ;
   private byte[] T01RJ73_A132BarCodReo ;
   private boolean[] T01RJ73_n132BarCodReo ;
   private String[] T01RJ73_A130BarCodPar ;
   private boolean[] T01RJ73_n130BarCodPar ;
   private short[] T01RJ73_A2872HAnRLinMaq ;
   private byte[] T01RJ73_A2873HAnRLinPro ;
   private short[] T01RJ73_A2874HAnRLin ;
   private byte[] T01RJ73_A2875HAnNumAny ;
   private String[] T01RJ74_A396EmprCod ;
   private boolean[] T01RJ74_n396EmprCod ;
   private String[] T01RJ74_A2817PlaTer ;
   private short[] T01RJ74_A2818PlaOrd ;
   private String[] T01RJ75_A396EmprCod ;
   private boolean[] T01RJ75_n396EmprCod ;
   private String[] T01RJ75_A2809MetTerCod ;
   private int[] T01RJ75_A129BarCod ;
   private boolean[] T01RJ75_n129BarCod ;
   private byte[] T01RJ75_A132BarCodReo ;
   private boolean[] T01RJ75_n132BarCodReo ;
   private String[] T01RJ75_A130BarCodPar ;
   private boolean[] T01RJ75_n130BarCodPar ;
   private String[] T01RJ76_A396EmprCod ;
   private boolean[] T01RJ76_n396EmprCod ;
   private int[] T01RJ76_A129BarCod ;
   private boolean[] T01RJ76_n129BarCod ;
   private byte[] T01RJ76_A132BarCodReo ;
   private boolean[] T01RJ76_n132BarCodReo ;
   private String[] T01RJ76_A130BarCodPar ;
   private boolean[] T01RJ76_n130BarCodPar ;
   private short[] T01RJ76_A2808RecLinMAL ;
   private byte[] T01RJ76_A1377RecNumAny ;
   private String[] T01RJ76_A719PrdNum ;
   private String[] T01RJ77_A396EmprCod ;
   private boolean[] T01RJ77_n396EmprCod ;
   private int[] T01RJ77_A129BarCod ;
   private boolean[] T01RJ77_n129BarCod ;
   private byte[] T01RJ77_A132BarCodReo ;
   private boolean[] T01RJ77_n132BarCodReo ;
   private String[] T01RJ77_A130BarCodPar ;
   private boolean[] T01RJ77_n130BarCodPar ;
   private short[] T01RJ77_A2804RecLinMaq ;
   private String[] T01RJ78_A396EmprCod ;
   private boolean[] T01RJ78_n396EmprCod ;
   private String[] T01RJ78_A2792TermiCod ;
   private int[] T01RJ78_A129BarCod ;
   private boolean[] T01RJ78_n129BarCod ;
   private byte[] T01RJ78_A132BarCodReo ;
   private boolean[] T01RJ78_n132BarCodReo ;
   private String[] T01RJ78_A130BarCodPar ;
   private boolean[] T01RJ78_n130BarCodPar ;
   private String[] T01RJ79_A396EmprCod ;
   private boolean[] T01RJ79_n396EmprCod ;
   private short[] T01RJ79_A2248ManCod ;
   private java.util.Date[] T01RJ79_A2711RpExHdFe ;
   private short[] T01RJ79_A2713RpExHdLi ;
   private String[] T01RJ80_A396EmprCod ;
   private boolean[] T01RJ80_n396EmprCod ;
   private short[] T01RJ80_A2248ManCod ;
   private String[] T01RJ80_A2689ExHdrFas ;
   private int[] T01RJ80_A2692ExHdrLin ;
   private String[] T01RJ81_A396EmprCod ;
   private boolean[] T01RJ81_n396EmprCod ;
   private int[] T01RJ81_A129BarCod ;
   private boolean[] T01RJ81_n129BarCod ;
   private byte[] T01RJ81_A132BarCodReo ;
   private boolean[] T01RJ81_n132BarCodReo ;
   private String[] T01RJ81_A130BarCodPar ;
   private boolean[] T01RJ81_n130BarCodPar ;
   private String[] T01RJ81_A2494BarDosPro ;
   private String[] T01RJ81_A719PrdNum ;
   private String[] T01RJ82_A396EmprCod ;
   private boolean[] T01RJ82_n396EmprCod ;
   private String[] T01RJ82_A602MaqCod ;
   private java.util.Date[] T01RJ82_A2461PlaFecTin ;
   private int[] T01RJ82_A129BarCod ;
   private boolean[] T01RJ82_n129BarCod ;
   private byte[] T01RJ82_A132BarCodReo ;
   private boolean[] T01RJ82_n132BarCodReo ;
   private String[] T01RJ82_A130BarCodPar ;
   private boolean[] T01RJ82_n130BarCodPar ;
   private String[] T01RJ83_A396EmprCod ;
   private boolean[] T01RJ83_n396EmprCod ;
   private int[] T01RJ83_A129BarCod ;
   private boolean[] T01RJ83_n129BarCod ;
   private byte[] T01RJ83_A132BarCodReo ;
   private boolean[] T01RJ83_n132BarCodReo ;
   private String[] T01RJ83_A130BarCodPar ;
   private boolean[] T01RJ83_n130BarCodPar ;
   private short[] T01RJ83_A2457BarObLin ;
   private String[] T01RJ84_A396EmprCod ;
   private boolean[] T01RJ84_n396EmprCod ;
   private int[] T01RJ84_A129BarCod ;
   private boolean[] T01RJ84_n129BarCod ;
   private byte[] T01RJ84_A132BarCodReo ;
   private boolean[] T01RJ84_n132BarCodReo ;
   private String[] T01RJ84_A130BarCodPar ;
   private boolean[] T01RJ84_n130BarCodPar ;
   private short[] T01RJ84_A2444BarEnLin ;
   private String[] T01RJ85_A396EmprCod ;
   private boolean[] T01RJ85_n396EmprCod ;
   private int[] T01RJ85_A2406ExhAlbCod ;
   private int[] T01RJ85_A129BarCod ;
   private boolean[] T01RJ85_n129BarCod ;
   private byte[] T01RJ85_A132BarCodReo ;
   private boolean[] T01RJ85_n132BarCodReo ;
   private String[] T01RJ85_A130BarCodPar ;
   private boolean[] T01RJ85_n130BarCodPar ;
   private String[] T01RJ86_A396EmprCod ;
   private boolean[] T01RJ86_n396EmprCod ;
   private int[] T01RJ86_A2253SalExtAlb ;
   private int[] T01RJ86_A129BarCod ;
   private boolean[] T01RJ86_n129BarCod ;
   private byte[] T01RJ86_A132BarCodReo ;
   private boolean[] T01RJ86_n132BarCodReo ;
   private String[] T01RJ86_A130BarCodPar ;
   private boolean[] T01RJ86_n130BarCodPar ;
   private String[] T01RJ87_A396EmprCod ;
   private boolean[] T01RJ87_n396EmprCod ;
   private long[] T01RJ87_A30AlbProCod ;
   private int[] T01RJ87_A129BarCod ;
   private boolean[] T01RJ87_n129BarCod ;
   private byte[] T01RJ87_A132BarCodReo ;
   private boolean[] T01RJ87_n132BarCodReo ;
   private String[] T01RJ87_A130BarCodPar ;
   private boolean[] T01RJ87_n130BarCodPar ;
   private String[] T01RJ88_A396EmprCod ;
   private boolean[] T01RJ88_n396EmprCod ;
   private int[] T01RJ88_A1348SolColCod ;
   private String[] T01RJ89_A396EmprCod ;
   private boolean[] T01RJ89_n396EmprCod ;
   private int[] T01RJ89_A1333EstDimCod ;
   private String[] T01RJ90_A396EmprCod ;
   private boolean[] T01RJ90_n396EmprCod ;
   private int[] T01RJ90_A1314EnsLabCod ;
   private String[] T01RJ91_A396EmprCod ;
   private boolean[] T01RJ91_n396EmprCod ;
   private int[] T01RJ91_A129BarCod ;
   private boolean[] T01RJ91_n129BarCod ;
   private byte[] T01RJ91_A132BarCodReo ;
   private boolean[] T01RJ91_n132BarCodReo ;
   private String[] T01RJ91_A130BarCodPar ;
   private boolean[] T01RJ91_n130BarCodPar ;
   private byte[] T01RJ91_A906ObsReoLin ;
   private String[] T01RJ92_A396EmprCod ;
   private boolean[] T01RJ92_n396EmprCod ;
   private int[] T01RJ92_A859CumCodCont ;
   private String[] T01RJ93_A396EmprCod ;
   private boolean[] T01RJ93_n396EmprCod ;
   private String[] T01RJ93_A602MaqCod ;
   private java.util.Date[] T01RJ93_A558HisProFec ;
   private int[] T01RJ93_A561HisProLin ;
   private String[] T01RJ94_A396EmprCod ;
   private boolean[] T01RJ94_n396EmprCod ;
   private int[] T01RJ94_A252CliCod ;
   private boolean[] T01RJ94_n252CliCod ;
   private String[] T01RJ94_A494ForSer ;
   private String[] T01RJ94_A482ForColNom ;
   private int[] T01RJ94_A483ForColNum ;
   private byte[] T01RJ94_A831TipColCod ;
   private String[] T01RJ95_A396EmprCod ;
   private boolean[] T01RJ95_n396EmprCod ;
   private int[] T01RJ95_A129BarCod ;
   private boolean[] T01RJ95_n129BarCod ;
   private byte[] T01RJ95_A132BarCodReo ;
   private boolean[] T01RJ95_n132BarCodReo ;
   private String[] T01RJ95_A130BarCodPar ;
   private boolean[] T01RJ95_n130BarCodPar ;
   private String[] T01RJ95_A200BarPieCod ;
   private String[] T01RJ96_A396EmprCod ;
   private boolean[] T01RJ96_n396EmprCod ;
   private int[] T01RJ96_A129BarCod ;
   private boolean[] T01RJ96_n129BarCod ;
   private byte[] T01RJ96_A132BarCodReo ;
   private boolean[] T01RJ96_n132BarCodReo ;
   private String[] T01RJ96_A130BarCodPar ;
   private boolean[] T01RJ96_n130BarCodPar ;
   private byte[] T01RJ96_A188BarNotLin ;
   private String[] T01RJ97_A396EmprCod ;
   private boolean[] T01RJ97_n396EmprCod ;
   private int[] T01RJ97_A129BarCod ;
   private boolean[] T01RJ97_n129BarCod ;
   private byte[] T01RJ97_A132BarCodReo ;
   private boolean[] T01RJ97_n132BarCodReo ;
   private String[] T01RJ97_A130BarCodPar ;
   private boolean[] T01RJ97_n130BarCodPar ;
   private String[] T01RJ97_A758ProCod ;
   private String[] T01RJ99_A396EmprCod ;
   private boolean[] T01RJ99_n396EmprCod ;
   private int[] T01RJ99_A129BarCod ;
   private boolean[] T01RJ99_n129BarCod ;
   private byte[] T01RJ99_A132BarCodReo ;
   private boolean[] T01RJ99_n132BarCodReo ;
   private String[] T01RJ99_A130BarCodPar ;
   private boolean[] T01RJ99_n130BarCodPar ;
   private int[] T01RJ100_A129BarCod ;
   private boolean[] T01RJ100_n129BarCod ;
   private byte[] T01RJ100_A132BarCodReo ;
   private boolean[] T01RJ100_n132BarCodReo ;
   private String[] T01RJ100_A130BarCodPar ;
   private boolean[] T01RJ100_n130BarCodPar ;
   private int[] T01RJ100_A119BarAgrCod ;
   private byte[] T01RJ100_A124BarAgrReo ;
   private String[] T01RJ100_A122BarAgrPar ;
   private java.math.BigDecimal[] T01RJ100_A590KgmAgr ;
   private short[] T01RJ100_A671PieAgr ;
   private java.math.BigDecimal[] T01RJ100_A869MtrAgr ;
   private int[] T01RJ100_A1508CliCodAgr ;
   private String[] T01RJ100_A1245BarAgrSer ;
   private String[] T01RJ100_A1507BarAgrDsc ;
   private String[] T01RJ100_A1510ColNomAgr ;
   private int[] T01RJ100_A1512ColNumAgr ;
   private int[] T01RJ100_A1513DisCodAgr ;
   private String[] T01RJ100_A1509ColNoCAgr ;
   private int[] T01RJ100_A1511ColNuCAgr ;
   private String[] T01RJ100_A1649BarAgrDNu ;
   private String[] T01RJ100_A396EmprCod ;
   private boolean[] T01RJ100_n396EmprCod ;
   private String[] T01RJ100_A474FindBarAgr ;
   private boolean[] T01RJ100_n474FindBarAgr ;
   private String[] T01RJ100_A1653FindDes ;
   private boolean[] T01RJ100_n1653FindDes ;
   private java.math.BigDecimal[] T01RJ5_A121BarAgrKgm ;
   private java.math.BigDecimal[] T01RJ5_A868BarAgrMtr ;
   private short[] T01RJ5_A1650BarAgrNDes ;
   private short[] T01RJ5_A1651BarPNDes ;
   private String[] T01RJ6_A474FindBarAgr ;
   private boolean[] T01RJ6_n474FindBarAgr ;
   private String[] T01RJ7_A1653FindDes ;
   private boolean[] T01RJ7_n1653FindDes ;
   private java.math.BigDecimal[] T01RJ102_A121BarAgrKgm ;
   private java.math.BigDecimal[] T01RJ102_A868BarAgrMtr ;
   private short[] T01RJ102_A1650BarAgrNDes ;
   private short[] T01RJ102_A1651BarPNDes ;
   private String[] T01RJ103_A474FindBarAgr ;
   private boolean[] T01RJ103_n474FindBarAgr ;
   private String[] T01RJ104_A1653FindDes ;
   private boolean[] T01RJ104_n1653FindDes ;
   private String[] T01RJ105_A396EmprCod ;
   private boolean[] T01RJ105_n396EmprCod ;
   private int[] T01RJ105_A129BarCod ;
   private boolean[] T01RJ105_n129BarCod ;
   private byte[] T01RJ105_A132BarCodReo ;
   private boolean[] T01RJ105_n132BarCodReo ;
   private String[] T01RJ105_A130BarCodPar ;
   private boolean[] T01RJ105_n130BarCodPar ;
   private int[] T01RJ105_A119BarAgrCod ;
   private byte[] T01RJ105_A124BarAgrReo ;
   private String[] T01RJ105_A122BarAgrPar ;
   private int[] T01RJ3_A129BarCod ;
   private boolean[] T01RJ3_n129BarCod ;
   private byte[] T01RJ3_A132BarCodReo ;
   private boolean[] T01RJ3_n132BarCodReo ;
   private String[] T01RJ3_A130BarCodPar ;
   private boolean[] T01RJ3_n130BarCodPar ;
   private int[] T01RJ3_A119BarAgrCod ;
   private byte[] T01RJ3_A124BarAgrReo ;
   private String[] T01RJ3_A122BarAgrPar ;
   private java.math.BigDecimal[] T01RJ3_A590KgmAgr ;
   private short[] T01RJ3_A671PieAgr ;
   private java.math.BigDecimal[] T01RJ3_A869MtrAgr ;
   private int[] T01RJ3_A1508CliCodAgr ;
   private String[] T01RJ3_A1245BarAgrSer ;
   private String[] T01RJ3_A1507BarAgrDsc ;
   private String[] T01RJ3_A1510ColNomAgr ;
   private int[] T01RJ3_A1512ColNumAgr ;
   private int[] T01RJ3_A1513DisCodAgr ;
   private String[] T01RJ3_A1509ColNoCAgr ;
   private int[] T01RJ3_A1511ColNuCAgr ;
   private String[] T01RJ3_A1649BarAgrDNu ;
   private String[] T01RJ3_A396EmprCod ;
   private boolean[] T01RJ3_n396EmprCod ;
   private int[] T01RJ2_A129BarCod ;
   private boolean[] T01RJ2_n129BarCod ;
   private byte[] T01RJ2_A132BarCodReo ;
   private boolean[] T01RJ2_n132BarCodReo ;
   private String[] T01RJ2_A130BarCodPar ;
   private boolean[] T01RJ2_n130BarCodPar ;
   private int[] T01RJ2_A119BarAgrCod ;
   private byte[] T01RJ2_A124BarAgrReo ;
   private String[] T01RJ2_A122BarAgrPar ;
   private java.math.BigDecimal[] T01RJ2_A590KgmAgr ;
   private short[] T01RJ2_A671PieAgr ;
   private java.math.BigDecimal[] T01RJ2_A869MtrAgr ;
   private int[] T01RJ2_A1508CliCodAgr ;
   private String[] T01RJ2_A1245BarAgrSer ;
   private String[] T01RJ2_A1507BarAgrDsc ;
   private String[] T01RJ2_A1510ColNomAgr ;
   private int[] T01RJ2_A1512ColNumAgr ;
   private int[] T01RJ2_A1513DisCodAgr ;
   private String[] T01RJ2_A1509ColNoCAgr ;
   private int[] T01RJ2_A1511ColNuCAgr ;
   private String[] T01RJ2_A1649BarAgrDNu ;
   private String[] T01RJ2_A396EmprCod ;
   private boolean[] T01RJ2_n396EmprCod ;
   private java.math.BigDecimal[] T01RJ110_A121BarAgrKgm ;
   private java.math.BigDecimal[] T01RJ110_A868BarAgrMtr ;
   private short[] T01RJ110_A1650BarAgrNDes ;
   private short[] T01RJ110_A1651BarPNDes ;
   private String[] T01RJ111_A474FindBarAgr ;
   private boolean[] T01RJ111_n474FindBarAgr ;
   private String[] T01RJ112_A1653FindDes ;
   private boolean[] T01RJ112_n1653FindDes ;
   private String[] T01RJ113_A396EmprCod ;
   private boolean[] T01RJ113_n396EmprCod ;
   private int[] T01RJ113_A129BarCod ;
   private boolean[] T01RJ113_n129BarCod ;
   private byte[] T01RJ113_A132BarCodReo ;
   private boolean[] T01RJ113_n132BarCodReo ;
   private String[] T01RJ113_A130BarCodPar ;
   private boolean[] T01RJ113_n130BarCodPar ;
   private int[] T01RJ113_A119BarAgrCod ;
   private byte[] T01RJ113_A124BarAgrReo ;
   private String[] T01RJ113_A122BarAgrPar ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV11WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
}

final  class recetasdetinte_agrupacion__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetasdetinte_agrupacion__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetasdetinte_agrupacion__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetasdetinte_agrupacion__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetasdetinte_agrupacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RJ2", "SELECT BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, CliCodAgr, BarAgrSer, BarAgrDsc, ColNomAgr, ColNumAgr, DisCodAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, EmprCod FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?  FOR UPDATE OF KgmAgr, PieAgr, MtrAgr, CliCodAgr, BarAgrSer, BarAgrDsc, ColNomAgr, ColNumAgr, DisCodAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ3", "SELECT BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, CliCodAgr, BarAgrSer, BarAgrDsc, ColNomAgr, ColNumAgr, DisCodAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, EmprCod FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ5", "SELECT COALESCE( T1.BarAgrKgm, 0) AS BarAgrKgm, COALESCE( T1.BarAgrMtr, 0) AS BarAgrMtr, COALESCE( T1.BarAgrNDes, 0) AS BarAgrNDes, COALESCE( T1.BarPNDes, 0) AS BarPNDes FROM (SELECT SUM(BarPieKil) AS BarAgrKgm, EmprCod, SUM(BarPieMet) AS BarAgrMtr, SUM(BarPiePie) AS BarAgrNDes, COUNT(*) AS BarPNDes FROM TXPBARPIE WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ6", "SELECT COALESCE( BarAgrEst, '') AS FindBarAgr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ7", "SELECT COALESCE( DisDes, ' ') AS FindDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ8", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarDisNum, BarAgrEst, BarMaqCod, BarVolMaq, BarSit, BarSer, BarColNom, BarColNum, BarEncCli, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF DisCod, BarMaqGru, BarDisNum, BarAgrEst, BarMaqCod, BarVolMaq, BarSit, BarSer, BarColNom, BarColNum, BarEncCli, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ9", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarDisNum, BarAgrEst, BarMaqCod, BarVolMaq, BarSit, BarSer, BarColNom, BarColNum, BarEncCli, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ11", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ13", "SELECT COALESCE( T1.FindVolMax, 0) AS FindVolMax, COALESCE( T1.FindVolMed, 0) AS FindVolMed, COALESCE( T1.FindVolMin, 0) AS FindVolMin FROM (SELECT MIN(T2.MaqVolMax) AS FindVolMax, T3.BarCod, T3.BarCodReo, T3.BarCodPar, MIN(T2.MaqVolMed) AS FindVolMed, MIN(T2.MaqVolMin) AS FindVolMin FROM TXPMAQUIN T2,  TXPBARCAD T3 WHERE (T2.EmprCod = T3.EmprCod) AND (T2.MaqCod = ?) GROUP BY T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T1 WHERE T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ15", "SELECT COALESCE( T1.BarAgrCant, 0) AS BarAgrCant FROM (SELECT COUNT(*) AS BarAgrCant, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ17", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, T2.EmprNom, TM1.BarDisNum, TM1.BarAgrEst, TM1.BarMaqCod, TM1.BarVolMaq, TM1.BarSit, TM1.CliCod, TM1.BarSer, TM1.BarColNom, TM1.BarColNum, TM1.BarEncCli, TM1.DisDes, TM1.EmprCod, COALESCE( T3.BarAgrCant, 0) AS BarAgrCant FROM ((TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS BarAgrCant, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ18", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ19", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ21", "SELECT COALESCE( T1.FindVolMax, 0) AS FindVolMax, COALESCE( T1.FindVolMed, 0) AS FindVolMed, COALESCE( T1.FindVolMin, 0) AS FindVolMin FROM (SELECT MIN(T2.MaqVolMax) AS FindVolMax, T3.BarCod, T3.BarCodReo, T3.BarCodPar, MIN(T2.MaqVolMed) AS FindVolMed, MIN(T2.MaqVolMin) AS FindVolMin FROM TXPMAQUIN T2,  TXPBARCAD T3 WHERE (T2.EmprCod = T3.EmprCod) AND (T2.MaqCod = ?) GROUP BY T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T1 WHERE T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ23", "SELECT COALESCE( T1.BarAgrCant, 0) AS BarAgrCant FROM (SELECT COUNT(*) AS BarAgrCant, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ24", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ25", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ26", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RJ27", "INSERT INTO TXPBARCAD(CliCod, DisDes, DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarDisNum, BarAgrEst, BarMaqCod, BarVolMaq, BarSit, BarSer, BarColNom, BarColNum, BarEncCli, EmprCod, BarTipArt, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01RJ28", "UPDATE TXPBARCAD SET CliCod=?, DisDes=?, DisCod=?, BarMaqGru=?, BarDisNum=?, BarAgrEst=?, BarMaqCod=?, BarVolMaq=?, BarSit=?, BarSer=?, BarColNom=?, BarColNum=?, BarEncCli=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01RJ29", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T01RJ30", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ32", "SELECT COALESCE( T1.BarAgrCant, 0) AS BarAgrCant FROM (SELECT COUNT(*) AS BarAgrCant, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ33", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ35", "SELECT COALESCE( T1.FindVolMax, 0) AS FindVolMax, COALESCE( T1.FindVolMed, 0) AS FindVolMed, COALESCE( T1.FindVolMin, 0) AS FindVolMin FROM (SELECT MIN(T2.MaqVolMax) AS FindVolMax, T3.BarCod, T3.BarCodReo, T3.BarCodPar, MIN(T2.MaqVolMed) AS FindVolMed, MIN(T2.MaqVolMin) AS FindVolMin FROM TXPMAQUIN T2,  TXPBARCAD T3 WHERE (T2.EmprCod = T3.EmprCod) AND (T2.MaqCod = ?) GROUP BY T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T1 WHERE T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ36", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ37", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ38", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ39", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ40", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ41", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ42", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ43", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ44", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ45", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ46", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ47", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ48", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ49", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ50", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ51", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ52", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ53", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ54", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ55", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ56", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ57", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ58", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ59", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ60", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ61", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ62", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ63", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ64", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ65", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ66", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ67", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ68", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ69", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ70", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ71", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ72", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ73", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ74", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ75", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ76", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ77", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ78", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ79", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ80", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ81", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ82", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ83", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ84", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ85", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ86", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ87", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ88", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ89", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ90", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ91", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ92", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ93", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ94", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ95", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ96", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RJ97", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RJ98", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T01RJ99", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ100", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAgrCod, T1.BarAgrReo, T1.BarAgrPar, T1.KgmAgr, T1.PieAgr, T1.MtrAgr, T1.CliCodAgr, T1.BarAgrSer, T1.BarAgrDsc, T1.ColNomAgr, T1.ColNumAgr, T1.DisCodAgr, T1.ColNoCAgr, T1.ColNuCAgr, T1.BarAgrDNu, T1.EmprCod, COALESCE( T2.BarAgrEst, '') AS FindBarAgr, COALESCE( T3.DisDes, ' ') AS FindDes FROM ((TXPBARAGR T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = ? AND T2.BarCod = T1.BarAgrCod AND T2.BarCodReo = T1.BarAgrReo AND T2.BarCodPar = T1.BarAgrPar) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarAgrCod AND T3.BarCodReo = T1.BarAgrReo AND T3.BarCodPar = T1.BarAgrPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarAgrCod = ? and T1.BarAgrReo = ? and T1.BarAgrPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAgrCod, T1.BarAgrReo, T1.BarAgrPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ102", "SELECT COALESCE( T1.BarAgrKgm, 0) AS BarAgrKgm, COALESCE( T1.BarAgrMtr, 0) AS BarAgrMtr, COALESCE( T1.BarAgrNDes, 0) AS BarAgrNDes, COALESCE( T1.BarPNDes, 0) AS BarPNDes FROM (SELECT SUM(BarPieKil) AS BarAgrKgm, EmprCod, SUM(BarPieMet) AS BarAgrMtr, SUM(BarPiePie) AS BarAgrNDes, COUNT(*) AS BarPNDes FROM TXPBARPIE WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ103", "SELECT COALESCE( BarAgrEst, '') AS FindBarAgr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ104", "SELECT COALESCE( DisDes, ' ') AS FindDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ105", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01RJ106", "INSERT INTO TXPBARAGR(BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, CliCodAgr, BarAgrSer, BarAgrDsc, ColNomAgr, ColNumAgr, DisCodAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, EmprCod, BarAgrMac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPBARAGR")
         ,new UpdateCursor("T01RJ107", "UPDATE TXPBARAGR SET KgmAgr=?, PieAgr=?, MtrAgr=?, CliCodAgr=?, BarAgrSer=?, BarAgrDsc=?, ColNomAgr=?, ColNumAgr=?, DisCodAgr=?, ColNoCAgr=?, ColNuCAgr=?, BarAgrDNu=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK, "TXPBARAGR")
         ,new UpdateCursor("T01RJ108", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK, "TXPBARAGR")
         ,new ForEachCursor("T01RJ110", "SELECT COALESCE( T1.BarAgrKgm, 0) AS BarAgrKgm, COALESCE( T1.BarAgrMtr, 0) AS BarAgrMtr, COALESCE( T1.BarAgrNDes, 0) AS BarAgrNDes, COALESCE( T1.BarPNDes, 0) AS BarPNDes FROM (SELECT SUM(BarPieKil) AS BarAgrKgm, EmprCod, SUM(BarPieMet) AS BarAgrMtr, SUM(BarPiePie) AS BarAgrNDes, COUNT(*) AS BarPNDes FROM TXPBARPIE WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ111", "SELECT COALESCE( BarAgrEst, '') AS FindBarAgr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ112", "SELECT COALESCE( DisDes, ' ') AS FindDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RJ113", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 13);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 13);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((String[]) buf[15])[0] = rslt.getString(14, 13);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 20);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 25 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 13);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 91 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 98 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 3);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 6);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 6);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
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
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
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
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 4);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 1);
               }
               stmt.setString(8, (String)parms[11], 8);
               stmt.setString(9, (String)parms[12], 1);
               stmt.setString(10, (String)parms[13], 6);
               stmt.setInt(11, ((Number) parms[14]).intValue());
               stmt.setByte(12, ((Number) parms[15]).byteValue());
               stmt.setString(13, (String)parms[16], 16);
               stmt.setString(14, (String)parms[17], 13);
               stmt.setInt(15, ((Number) parms[18]).intValue());
               stmt.setString(16, (String)parms[19], 20);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[21], 3);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 4);
               stmt.setString(5, (String)parms[5], 8);
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 6);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setString(10, (String)parms[10], 16);
               stmt.setString(11, (String)parms[11], 13);
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setString(13, (String)parms[13], 20);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[15], 3);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[21], 1);
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 6);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 37 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 40 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 41 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 45 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 46 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 47 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 48 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 49 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 52 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 54 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 55 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 56 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 57 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 58 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 59 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 61 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 62 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 63 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 64 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 66 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 68 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 69 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 70 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 71 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 72 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 73 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 74 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 75 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 76 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 77 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 78 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 79 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 80 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 81 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 82 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 83 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 84 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 85 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 86 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 87 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 88 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
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
                  stmt.setString(2, (String)parms[2], 3);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setString(8, (String)parms[11], 1);
               return;
            case 91 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 3);
               }
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 93 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 94 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 95 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setInt(4, ((Number) parms[6]).intValue());
               stmt.setByte(5, ((Number) parms[7]).byteValue());
               stmt.setString(6, (String)parms[8], 1);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               stmt.setShort(8, ((Number) parms[10]).shortValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               stmt.setInt(10, ((Number) parms[12]).intValue());
               stmt.setString(11, (String)parms[13], 16);
               stmt.setString(12, (String)parms[14], 26);
               stmt.setString(13, (String)parms[15], 13);
               stmt.setInt(14, ((Number) parms[16]).intValue());
               stmt.setInt(15, ((Number) parms[17]).intValue());
               stmt.setString(16, (String)parms[18], 13);
               stmt.setInt(17, ((Number) parms[19]).intValue());
               stmt.setString(18, (String)parms[20], 8);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[22], 3);
               }
               return;
            case 96 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 26);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 8);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[19], 1);
               }
               stmt.setInt(17, ((Number) parms[20]).intValue());
               stmt.setByte(18, ((Number) parms[21]).byteValue());
               stmt.setString(19, (String)parms[22], 1);
               return;
            case 97 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setInt(5, ((Number) parms[8]).intValue());
               stmt.setByte(6, ((Number) parms[9]).byteValue());
               stmt.setString(7, (String)parms[10], 1);
               return;
            case 98 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 3);
               }
               return;
            case 99 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 100 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 1);
               return;
            case 101 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
   }

}

