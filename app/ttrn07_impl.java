package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn07_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action105") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         AV158Msg_acc = httpContext.GetPar( "Msg_acc") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV158Msg_acc", AV158Msg_acc);
         AV152Moda21 = (byte)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV152Moda21", GXutil.str( AV152Moda21, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_105_1L4195( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV158Msg_acc, AV152Moda21) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action106") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         AV87FlagFas = (byte)(GXutil.lval( httpContext.GetPar( "FlagFas"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87FlagFas", GXutil.str( AV87FlagFas, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_106_1L4195( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV87FlagFas) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action107") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         AV87FlagFas = (byte)(GXutil.lval( httpContext.GetPar( "FlagFas"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87FlagFas", GXutil.str( AV87FlagFas, 1, 0));
         AV69F_kgslam = (byte)(GXutil.lval( httpContext.GetPar( "F_kgslam"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69F_kgslam", GXutil.str( AV69F_kgslam, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_107_1L4195( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV87FlagFas, AV69F_kgslam) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action108") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A2839AlbProVal = httpContext.GetPar( "AlbProVal") ;
         AV91FlagPorRec = (byte)(GXutil.lval( httpContext.GetPar( "FlagPorRec"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91FlagPorRec", GXutil.str( AV91FlagPorRec, 1, 0));
         AV66F_carvema = (byte)(GXutil.lval( httpContext.GetPar( "F_carvema"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66F_carvema", GXutil.str( AV66F_carvema, 1, 0));
         AV186Carvitin = (byte)(GXutil.lval( httpContext.GetPar( "Carvitin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV186Carvitin", GXutil.str( AV186Carvitin, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_108_1L4195( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2839AlbProVal, AV91FlagPorRec, AV66F_carvema, AV186Carvitin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action109") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         AV186Carvitin = (byte)(GXutil.lval( httpContext.GetPar( "Carvitin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV186Carvitin", GXutil.str( AV186Carvitin, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_109_1L4195( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV186Carvitin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action110") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A1262BarPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarPreKgm"), ".") ;
         A1264BarPreMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarPreMtr"), ".") ;
         A32AlbProEsp = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEsp"))) ;
         A40AlbProRec = CommonUtil.decimalVal( httpContext.GetPar( "AlbProRec"), ".") ;
         A2761AlbBarRec = CommonUtil.decimalVal( httpContext.GetPar( "AlbBarRec"), ".") ;
         A2839AlbProVal = httpContext.GetPar( "AlbProVal") ;
         AV91FlagPorRec = (byte)(GXutil.lval( httpContext.GetPar( "FlagPorRec"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91FlagPorRec", GXutil.str( AV91FlagPorRec, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_110_1L4195( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A1262BarPreKgm, A1264BarPreMtr, A32AlbProEsp, A40AlbProRec, A2761AlbBarRec, A2839AlbProVal, AV91FlagPorRec) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action111") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A1262BarPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarPreKgm"), ".") ;
         A1264BarPreMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarPreMtr"), ".") ;
         A32AlbProEsp = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEsp"))) ;
         A40AlbProRec = CommonUtil.decimalVal( httpContext.GetPar( "AlbProRec"), ".") ;
         A5354AlbImpMan = CommonUtil.decimalVal( httpContext.GetPar( "AlbImpMan"), ".") ;
         A2839AlbProVal = httpContext.GetPar( "AlbProVal") ;
         AV186Carvitin = (byte)(GXutil.lval( httpContext.GetPar( "Carvitin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV186Carvitin", GXutil.str( AV186Carvitin, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_111_1L4195( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A1262BarPreKgm, A1264BarPreMtr, A32AlbProEsp, A40AlbProRec, A5354AlbImpMan, A2839AlbProVal, AV186Carvitin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action112") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A1458BarAlbBul = (short)(GXutil.lval( httpContext.GetPar( "BarAlbBul"))) ;
         AV88FlagGv = (byte)(GXutil.lval( httpContext.GetPar( "FlagGv"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88FlagGv", GXutil.str( AV88FlagGv, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_112_1L4195( Gx_mode, A396EmprCod, A30AlbProCod, A1458BarAlbBul, AV88FlagGv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action113") == 0 )
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
         xc_113_1L4195( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action114") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A1261BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
         A1263BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
         A1265BarAlbPie = (int)(GXutil.lval( httpContext.GetPar( "BarAlbPie"))) ;
         AV108KilAnt = CommonUtil.decimalVal( httpContext.GetPar( "KilAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108KilAnt", GXutil.ltrimstr( AV108KilAnt, 9, 2));
         AV150MetAnt = CommonUtil.decimalVal( httpContext.GetPar( "MetAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV150MetAnt", GXutil.ltrimstr( AV150MetAnt, 9, 2));
         AV165PieAnt = (int)(GXutil.lval( httpContext.GetPar( "PieAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV165PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165PieAnt), 6, 0));
         AV155Modo2 = httpContext.GetPar( "Modo2") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV155Modo2", AV155Modo2);
         A213BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
         AV35AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35AlbProFch", localUtil.format(AV35AlbProFch, "99/99/99"));
         A1095AlbTipEnt = httpContext.GetPar( "AlbTipEnt") ;
         A1206TubCod = (short)(GXutil.lval( httpContext.GetPar( "TubCod"))) ;
         n1206TubCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_114_1L4195( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A1261BarAlbKgmE, A1263BarAlbMtrE, A1265BarAlbPie, AV108KilAnt, AV150MetAnt, AV165PieAnt, AV155Modo2, A213BarSit, AV35AlbProFch, A1095AlbTipEnt, A1206TubCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action115") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         AV38KgsHdr = CommonUtil.decimalVal( httpContext.GetPar( "KgsHdr"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38KgsHdr", GXutil.ltrimstr( AV38KgsHdr, 9, 2));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_115_1L4195( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV38KgsHdr) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action116") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A1261BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
         AV173OkMerma = (byte)(GXutil.lval( httpContext.GetPar( "OkMerma"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173OkMerma", GXutil.str( AV173OkMerma, 1, 0));
         AV85FlagEtm = (byte)(GXutil.lval( httpContext.GetPar( "FlagEtm"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85FlagEtm", GXutil.str( AV85FlagEtm, 1, 0));
         AV57CtrQb = (byte)(GXutil.lval( httpContext.GetPar( "CtrQb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57CtrQb", GXutil.str( AV57CtrQb, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_116_1L4195( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A1261BarAlbKgmE, AV173OkMerma, AV85FlagEtm, AV57CtrQb) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action117") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         AV171TipDis = httpContext.GetPar( "TipDis") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV171TipDis", AV171TipDis);
         AV72F_tinamar = (byte)(GXutil.lval( httpContext.GetPar( "F_tinamar"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72F_tinamar", GXutil.str( AV72F_tinamar, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_117_1L4195( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV171TipDis, AV72F_tinamar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action131") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1206TubCod = (short)(GXutil.lval( httpContext.GetPar( "TubCod"))) ;
         n1206TubCod = false ;
         AV87FlagFas = (byte)(GXutil.lval( httpContext.GetPar( "FlagFas"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87FlagFas", GXutil.str( AV87FlagFas, 1, 0));
         AV92FlagPreFas = (byte)(GXutil.lval( httpContext.GetPar( "FlagPreFas"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92FlagPreFas", GXutil.str( AV92FlagPreFas, 1, 0));
         AV66F_carvema = (byte)(GXutil.lval( httpContext.GetPar( "F_carvema"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66F_carvema", GXutil.str( AV66F_carvema, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_131_1L4195( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, Gx_mode, A1206TubCod, AV87FlagFas, AV92FlagPreFas, AV66F_carvema) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action132") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A1262BarPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarPreKgm"), ".") ;
         A1264BarPreMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarPreMtr"), ".") ;
         A32AlbProEsp = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEsp"))) ;
         A40AlbProRec = CommonUtil.decimalVal( httpContext.GetPar( "AlbProRec"), ".") ;
         A7994AlbDto = CommonUtil.decimalVal( httpContext.GetPar( "AlbDto"), ".") ;
         A2839AlbProVal = httpContext.GetPar( "AlbProVal") ;
         AV66F_carvema = (byte)(GXutil.lval( httpContext.GetPar( "F_carvema"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66F_carvema", GXutil.str( AV66F_carvema, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_132_1L4195( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A1262BarPreKgm, A1264BarPreMtr, A32AlbProEsp, A40AlbProRec, A7994AlbDto, A2839AlbProVal, AV66F_carvema) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action133") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         AV159Msg_ctrl = httpContext.GetPar( "Msg_ctrl") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV159Msg_ctrl", AV159Msg_ctrl);
         A213BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
         AV66F_carvema = (byte)(GXutil.lval( httpContext.GetPar( "F_carvema"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66F_carvema", GXutil.str( AV66F_carvema, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_133_1L4195( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV159Msg_ctrl, A213BarSit, AV66F_carvema) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action140") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         AV61Erfoc = (byte)(GXutil.lval( httpContext.GetPar( "Erfoc"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Erfoc", GXutil.str( AV61Erfoc, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_140_1L4195( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV61Erfoc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action142") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A2761AlbBarRec = CommonUtil.decimalVal( httpContext.GetPar( "AlbBarRec"), ".") ;
         A12905AlbCadEnc = (short)(GXutil.lval( httpContext.GetPar( "AlbCadEnc"))) ;
         A7989AlbCald = httpContext.GetPar( "AlbCald") ;
         A3886AlbCliCod = (int)(GXutil.lval( httpContext.GetPar( "AlbCliCod"))) ;
         A3392AlbColNom = httpContext.GetPar( "AlbColNom") ;
         A3393AlbColNum = (int)(GXutil.lval( httpContext.GetPar( "AlbColNum"))) ;
         A7990AlbDf1 = httpContext.GetPar( "AlbDf1") ;
         A7991AlbDf2 = httpContext.GetPar( "AlbDf2") ;
         A7992AlbDf3 = httpContext.GetPar( "AlbDf3") ;
         A7994AlbDto = CommonUtil.decimalVal( httpContext.GetPar( "AlbDto"), ".") ;
         A7104AlbEncA = CommonUtil.decimalVal( httpContext.GetPar( "AlbEncA"), ".") ;
         A4815AlbEncCli = httpContext.GetPar( "AlbEncCli") ;
         A7103AlbEncL = CommonUtil.decimalVal( httpContext.GetPar( "AlbEncL"), ".") ;
         A3271AlbHdrAnc = (short)(GXutil.lval( httpContext.GetPar( "AlbHdrAnc"))) ;
         A5019AlbHdrgm2 = (short)(GXutil.lval( httpContext.GetPar( "AlbHdrgm2"))) ;
         A2441AlbHdrObs = httpContext.GetPar( "AlbHdrObs") ;
         A2763AlbHdrUlin = (short)(GXutil.lval( httpContext.GetPar( "AlbHdrUlin"))) ;
         A5354AlbImpMan = CommonUtil.decimalVal( httpContext.GetPar( "AlbImpMan"), ".") ;
         A6645AlbMetULi = (short)(GXutil.lval( httpContext.GetPar( "AlbMetULi"))) ;
         A7993AlbMqTj = httpContext.GetPar( "AlbMqTj") ;
         A12232AlbNomCli = httpContext.GetPar( "AlbNomCli") ;
         A12233AlbNumcli = (int)(GXutil.lval( httpContext.GetPar( "AlbNumcli"))) ;
         A6814AlbObsM = httpContext.GetPar( "AlbObsM") ;
         A32AlbProEsp = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEsp"))) ;
         A40AlbProRec = CommonUtil.decimalVal( httpContext.GetPar( "AlbProRec"), ".") ;
         A2839AlbProVal = httpContext.GetPar( "AlbProVal") ;
         A3391AlbSer = httpContext.GetPar( "AlbSer") ;
         A8879AlbSerD = httpContext.GetPar( "AlbSerD") ;
         A12234AlbTipArt = (short)(GXutil.lval( httpContext.GetPar( "AlbTipArt"))) ;
         A3394AlbTipCol = (byte)(GXutil.lval( httpContext.GetPar( "AlbTipCol"))) ;
         A1095AlbTipEnt = httpContext.GetPar( "AlbTipEnt") ;
         A1458BarAlbBul = (short)(GXutil.lval( httpContext.GetPar( "BarAlbBul"))) ;
         A1261BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
         A1263BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
         A1265BarAlbPie = (int)(GXutil.lval( httpContext.GetPar( "BarAlbPie"))) ;
         A6467BarAlbPlas = (short)(GXutil.lval( httpContext.GetPar( "BarAlbPlas"))) ;
         A1461BarAlbPN = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbPN"), ".") ;
         A1266BarAlbTub = (int)(GXutil.lval( httpContext.GetPar( "BarAlbTub"))) ;
         A12195BarAlbUnd = (int)(GXutil.lval( httpContext.GetPar( "BarAlbUnd"))) ;
         A2398BarFasExt = httpContext.GetPar( "BarFasExt") ;
         A1262BarPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarPreKgm"), ".") ;
         A1264BarPreMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarPreMtr"), ".") ;
         A12196BarPreUnd = CommonUtil.decimalVal( httpContext.GetPar( "BarPreUnd"), ".") ;
         A3153CodCod = httpContext.GetPar( "CodCod") ;
         n3153CodCod = false ;
         A1248GuiFasULin = (short)(GXutil.lval( httpContext.GetPar( "GuiFasULin"))) ;
         A6466PlasCod = (short)(GXutil.lval( httpContext.GetPar( "PlasCod"))) ;
         n6466PlasCod = false ;
         A5051TipAcaCod = (short)(GXutil.lval( httpContext.GetPar( "TipAcaCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5051TipAcaCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5051TipAcaCod), 4, 0));
         A1206TubCod = (short)(GXutil.lval( httpContext.GetPar( "TubCod"))) ;
         n1206TubCod = false ;
         AV87FlagFas = (byte)(GXutil.lval( httpContext.GetPar( "FlagFas"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87FlagFas", GXutil.str( AV87FlagFas, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_142_1L4195( Gx_mode, A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2761AlbBarRec, A12905AlbCadEnc, A7989AlbCald, A3886AlbCliCod, A3392AlbColNom, A3393AlbColNum, A7990AlbDf1, A7991AlbDf2, A7992AlbDf3, A7994AlbDto, A7104AlbEncA, A4815AlbEncCli, A7103AlbEncL, A3271AlbHdrAnc, A5019AlbHdrgm2, A2441AlbHdrObs, A2763AlbHdrUlin, A5354AlbImpMan, A6645AlbMetULi, A7993AlbMqTj, A12232AlbNomCli, A12233AlbNumcli, A6814AlbObsM, A32AlbProEsp, A40AlbProRec, A2839AlbProVal, A3391AlbSer, A8879AlbSerD, A12234AlbTipArt, A3394AlbTipCol, A1095AlbTipEnt, A1458BarAlbBul, A1261BarAlbKgmE, A1263BarAlbMtrE, A1265BarAlbPie, A6467BarAlbPlas, A1461BarAlbPN, A1266BarAlbTub, A12195BarAlbUnd, A2398BarFasExt, A1262BarPreKgm, A1264BarPreMtr, A12196BarPreUnd, A3153CodCod, A1248GuiFasULin, A6466PlasCod, A5051TipAcaCod, A1206TubCod, AV87FlagFas) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_144") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_144( A1253EmprGuiRem, A1243GuiRemCli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_148") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1206TubCod = (short)(GXutil.lval( httpContext.GetPar( "TubCod"))) ;
         n1206TubCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_148( A396EmprCod, A1206TubCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_149") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3153CodCod = httpContext.GetPar( "CodCod") ;
         n3153CodCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_149( A396EmprCod, A3153CodCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_147") == 0 )
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
         gxload_147( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_150") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_150( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_151") == 0 )
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
         gxload_151( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_152") == 0 )
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
         gxload_152( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
            AV198EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV198EmprCod", AV198EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV198EmprCod, "@!"))));
            AV199AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV199AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV199AlbProCod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV199AlbProCod), "ZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Guias (Detail HDRs)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprGuiRem_Internalname ;
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
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
      edtCodCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCod_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtPlasCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbPlas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_35_Refreshing);
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

   public ttrn07_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn07_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn07_impl.class ));
   }

   public ttrn07_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbProVal = new HTMLChoice();
      chkBarTipCor = UIFactory.getCheckbox(this);
      chkBarAcc = UIFactory.getCheckbox(this);
      cmbBarEstReo = new HTMLChoice();
      chkDisDes = UIFactory.getCheckbox(this);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprGuiRem_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprGuiRem_Internalname, httpContext.getMessage( "EmprGuiRem", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprGuiRem_Internalname, GXutil.rtrim( A1253EmprGuiRem), GXutil.rtrim( localUtil.format( A1253EmprGuiRem, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprGuiRem_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprGuiRem_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn07.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablainformaciongeneral_Internalname, divTablainformaciongeneral_Visible, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn07.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn07.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnregresar_Internalname, "", httpContext.getMessage( "Regresar", ""), bttBtnregresar_Jsonclick, 5, httpContext.getMessage( "Regresar", ""), "", StyleString, ClassString, bttBtnregresar_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOREGRESAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn07.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn07.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn07.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_panelfases.setProperty("Width", Dvpanel_panelfases_Width);
      ucDvpanel_panelfases.setProperty("AutoWidth", Dvpanel_panelfases_Autowidth);
      ucDvpanel_panelfases.setProperty("AutoHeight", Dvpanel_panelfases_Autoheight);
      ucDvpanel_panelfases.setProperty("Cls", Dvpanel_panelfases_Cls);
      ucDvpanel_panelfases.setProperty("Title", Dvpanel_panelfases_Title);
      ucDvpanel_panelfases.setProperty("Collapsible", Dvpanel_panelfases_Collapsible);
      ucDvpanel_panelfases.setProperty("Collapsed", Dvpanel_panelfases_Collapsed);
      ucDvpanel_panelfases.setProperty("ShowCollapseIcon", Dvpanel_panelfases_Showcollapseicon);
      ucDvpanel_panelfases.setProperty("IconPosition", Dvpanel_panelfases_Iconposition);
      ucDvpanel_panelfases.setProperty("AutoScroll", Dvpanel_panelfases_Autoscroll);
      ucDvpanel_panelfases.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelfases_Internalname, "DVPANEL_PANELFASESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELFASESContainer"+"PanelFases"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPanelfases_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnfases_Internalname, "", httpContext.getMessage( "Fases", ""), bttBtnfases_Jsonclick, 5, httpContext.getMessage( "Fases", ""), "", StyleString, ClassString, bttBtnfases_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOFASES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn07.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiRemCli_Visible, edtGuiRemCli_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn07.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLic_Internalname, GXutil.rtrim( A7101AlbLic), GXutil.rtrim( localUtil.format( A7101AlbLic, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,140);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLic_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbLic_Visible, edtAlbLic_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn07.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbEnvFtp_Internalname, GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbEnvFtp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9") : localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbEnvFtp_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbEnvFtp_Visible, edtAlbEnvFtp_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn07.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol35( ) ;
      nGXsfl_35_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount195 = (short)(10) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_195 = (short)(1) ;
            scanStart1L4195( ) ;
            while ( RcdFound195 != 0 )
            {
               init_level_properties195( ) ;
               getByPrimaryKey1L4195( ) ;
               addRow1L4195( ) ;
               scanNext1L4195( ) ;
            }
            scanEnd1L4195( ) ;
            nBlankRcdCount195 = (short)(10) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1L4195( ) ;
         standaloneModal1L4195( ) ;
         sMode195 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRow1L4195( ) ;
            edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBSER_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSer_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbSerD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBSERD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbSerD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSerD_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOLNOM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNom_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbNomCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBNOMCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNomCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOLNUM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtCodCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCodCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtCodCod_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CODCOD_"+sGXsfl_35_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCodCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCod_Visible), 5, 0), !bGXsfl_35_Refreshing);
            edtBarAlbKgmE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBKGME_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgmE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPREKGM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreKgm_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbHdrAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRANC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrAnc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbHdrgm2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRGM2_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrgm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrgm2_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarAlbMtrE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBMTRE_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtrE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPREMTR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreMtr_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarAlbPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBPIE_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPie_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtTubCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TUBCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTubCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarAlbTub_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBTUB_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbTub_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtPlasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLASCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtPlasCod_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PLASCOD_"+sGXsfl_35_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_35_Refreshing);
            edtBarAlbPlas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBPLAS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarAlbPlas_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBPLAS_"+sGXsfl_35_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbHdrObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDROBS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrObs_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            cmbAlbProVal.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROVAL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProVal.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbTipEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBTIPENT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbTipEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipEnt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbTipArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBTIPART_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipArt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarTipArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPART_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbNumcli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBNUMCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbNumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumcli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarNumCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarNomCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNOMCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarAlbUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBUND_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbUnd_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarPreUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPREUND_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreUnd_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarEstTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARESTTIP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEstTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEstTip_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCLICOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCliCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbMetULi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBMETULI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbMetULi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMetULi_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarFasExt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASEXT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasExt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            chkBarTipCor.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPCOR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarTipCor.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
            edtBarGraCob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARGRACOB_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarGraCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraCob_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarTipDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPDIS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTipDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDis_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarAlbPN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBPN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPN_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarCtrPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCTRPDAS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCtrPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCtrPdas_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBDTO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDto_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbMqTj_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBMQTJ_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbMqTj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMqTj_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbDf3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBDF3_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbDf3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf3_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbDf2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBDF2_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbDf2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf2_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbDf1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBDF1_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbDf1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf1_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbCald_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCALD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbCald_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCald_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbEncA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBENCA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbEncA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncA_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbEncL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBENCL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbEncL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncL_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbObsM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBOBSM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbObsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbObsM_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbBarRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBBARREC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbBarRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbBarRec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            chkBarAcc.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "BARACC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarAcc.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbImpMan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBIMPMAN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbImpMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbImpMan_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            cmbBarEstReo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "BARESTREO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbBarEstReo.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
            edtBarDisNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDISNUM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarGraAca_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARGRAACA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbEncCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBENCCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarEncCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENCCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarSerDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSERDSC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarTipCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPCOL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbTipCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBTIPCOL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipCol_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarPart_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPART_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPart_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarAlbBul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBBUL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbBul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbBul_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            chkDisDes.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISDES_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisDes.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbProRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROREC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProRec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbProEsp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROESP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProEsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEsp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarKla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKLA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarKla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKla_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarMla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMLA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarMla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMla_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarPlz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPLZ_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPlz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPlz_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIE_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarFecSal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECSAL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecSal_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarAncAca1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARANCACA1_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca1_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarSit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSIT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtGuiFasULin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASULIN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasULin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbHdrUlin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRULIN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrUlin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarAcaAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARACAANH_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAcaAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaAnh_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbCadEnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCADENC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbCadEnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCadEnc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            if ( ( nRcdExists_195 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1L4195( ) ;
            }
            sendRow1L4195( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount195 = (short)(10) ;
         nRcdExists_195 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1L4195( ) ;
            while ( RcdFound195 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_35195( ) ;
               init_level_properties195( ) ;
               standaloneNotModal1L4195( ) ;
               getByPrimaryKey1L4195( ) ;
               standaloneModal1L4195( ) ;
               addRow1L4195( ) ;
               scanNext1L4195( ) ;
            }
            scanEnd1L4195( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode195 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_35195( ) ;
         initAll1L4195( ) ;
         init_level_properties195( ) ;
         nRcdExists_195 = (short)(0) ;
         nIsMod_195 = (short)(0) ;
         nRcdDeleted_195 = (short)(0) ;
         nBlankRcdCount195 = (short)(nBlankRcdUsr195+nBlankRcdCount195) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount195 > 0 )
         {
            standaloneNotModal1L4195( ) ;
            standaloneModal1L4195( ) ;
            addRow1L4195( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount195 = (short)(nBlankRcdCount195-1) ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
      e111L42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z7101AlbLic = httpContext.cgiGet( "Z7101AlbLic") ;
            Z5805AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5805AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1253EmprGuiRem = httpContext.cgiGet( "Z1253EmprGuiRem") ;
            Z1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z1243GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N1253EmprGuiRem = httpContext.cgiGet( "N1253EmprGuiRem") ;
            N1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "N1243GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV198EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV199AlbProCod = localUtil.ctol( httpContext.cgiGet( "vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV203Insert_EmprGuiRem = httpContext.cgiGet( "vINSERT_EMPRGUIREM") ;
            AV200Insert_GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_GUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1244GuiRemCln = httpContext.cgiGet( "GUIREMCLN") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            AV220Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A898BarPieNDes = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIENDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A199BarPie1 = (short)(localUtil.ctol( httpContext.cgiGet( "BARPIE1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV155Modo2 = httpContext.cgiGet( "vMODO2") ;
            AV108KilAnt = localUtil.ctond( httpContext.cgiGet( "vKILANT")) ;
            AV150MetAnt = localUtil.ctond( httpContext.cgiGet( "vMETANT")) ;
            AV165PieAnt = (int)(localUtil.ctol( httpContext.cgiGet( "vPIEANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV186Carvitin = (byte)(localUtil.ctol( httpContext.cgiGet( "vCARVITIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV45BarKgm = localUtil.ctond( httpContext.cgiGet( "vBARKGM")) ;
            AV176PzasLan = (int)(localUtil.ctol( httpContext.cgiGet( "vPZASLAN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV163Msg_k = httpContext.cgiGet( "vMSG_K") ;
            AV158Msg_acc = httpContext.cgiGet( "vMSG_ACC") ;
            AV87FlagFas = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGFAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV69F_kgslam = (byte)(localUtil.ctol( httpContext.cgiGet( "vF_KGSLAM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV91FlagPorRec = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGPORREC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV66F_carvema = (byte)(localUtil.ctol( httpContext.cgiGet( "vF_CARVEMA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV88FlagGv = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGGV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV151Metros = localUtil.ctond( httpContext.cgiGet( "vMETROS")) ;
            AV35AlbProFch = localUtil.ctod( httpContext.cgiGet( "vALBPROFCH"), 0) ;
            AV38KgsHdr = localUtil.ctond( httpContext.cgiGet( "vKGSHDR")) ;
            AV173OkMerma = (byte)(localUtil.ctol( httpContext.cgiGet( "vOKMERMA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV171TipDis = httpContext.cgiGet( "vTIPDIS") ;
            AV72F_tinamar = (byte)(localUtil.ctol( httpContext.cgiGet( "vF_TINAMAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36AlbSec = httpContext.cgiGet( "vALBSEC") ;
            AV85FlagEtm = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGETM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV57CtrQb = (byte)(localUtil.ctol( httpContext.cgiGet( "vCTRQB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV92FlagPreFas = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGPREFAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV159Msg_ctrl = httpContext.cgiGet( "vMSG_CTRL") ;
            AV152Moda21 = (byte)(localUtil.ctol( httpContext.cgiGet( "vMODA21"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV63errkgs = (byte)(localUtil.ctol( httpContext.cgiGet( "vERRKGS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV61Erfoc = (byte)(localUtil.ctol( httpContext.cgiGet( "vERFOC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5051TipAcaCod = (short)(localUtil.ctol( httpContext.cgiGet( "TIPACACOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_panelfases_Objectcall = httpContext.cgiGet( "DVPANEL_PANELFASES_Objectcall") ;
            Dvpanel_panelfases_Class = httpContext.cgiGet( "DVPANEL_PANELFASES_Class") ;
            Dvpanel_panelfases_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFASES_Enabled")) ;
            Dvpanel_panelfases_Width = httpContext.cgiGet( "DVPANEL_PANELFASES_Width") ;
            Dvpanel_panelfases_Height = httpContext.cgiGet( "DVPANEL_PANELFASES_Height") ;
            Dvpanel_panelfases_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFASES_Autowidth")) ;
            Dvpanel_panelfases_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFASES_Autoheight")) ;
            Dvpanel_panelfases_Cls = httpContext.cgiGet( "DVPANEL_PANELFASES_Cls") ;
            Dvpanel_panelfases_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFASES_Showheader")) ;
            Dvpanel_panelfases_Title = httpContext.cgiGet( "DVPANEL_PANELFASES_Title") ;
            Dvpanel_panelfases_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFASES_Collapsible")) ;
            Dvpanel_panelfases_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFASES_Collapsed")) ;
            Dvpanel_panelfases_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFASES_Showcollapseicon")) ;
            Dvpanel_panelfases_Iconposition = httpContext.cgiGet( "DVPANEL_PANELFASES_Iconposition") ;
            Dvpanel_panelfases_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFASES_Autoscroll")) ;
            Dvpanel_panelfases_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFASES_Visible")) ;
            Dvpanel_panelfases_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_PANELFASES_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A1253EmprGuiRem = GXutil.upper( httpContext.cgiGet( edtEmprGuiRem_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A30AlbProCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            }
            else
            {
               A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GUIREMCLI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGuiRemCli_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1243GuiRemCli = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
            }
            else
            {
               A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
            }
            A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbEnvFtp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbEnvFtp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBENVFTP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbEnvFtp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5805AlbEnvFtp = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
            }
            else
            {
               A5805AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbEnvFtp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTrn07");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A30AlbProCod != Z30AlbProCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttrn07:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
                  sMode3 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode3 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound3 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1L40( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ALBPROCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbProCod_Internalname ;
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
                        e111L42 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121L42 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOREGRESAR'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoRegresar' */
                        e131L42 ();
                        nKeyPressed = (byte)(3) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOFASES'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoFases' */
                        e141L42 ();
                        nKeyPressed = (byte)(3) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.REFRESCAROBJETO") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e151L42 ();
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
         e121L42 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1L43( ) ;
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
         disableAttributes1L43( ) ;
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

   public void confirm_1L40( )
   {
      beforeValidate1L43( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1L43( ) ;
         }
         else
         {
            checkExtendedTable1L43( ) ;
            closeExtendedTableCursors1L43( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode3 = Gx_mode ;
         confirm_1L4195( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode3 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1L4195( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1L4195( ) ;
         if ( ( nRcdExists_195 != 0 ) || ( nIsMod_195 != 0 ) )
         {
            getKey1L4195( ) ;
            if ( ( nRcdExists_195 == 0 ) && ( nRcdDeleted_195 == 0 ) )
            {
               if ( RcdFound195 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1L4195( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1L4195( ) ;
                     closeExtendedTableCursors1L4195( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "BARCOD_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound195 != 0 )
               {
                  if ( nRcdDeleted_195 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1L4195( ) ;
                     load1L4195( ) ;
                     beforeValidate1L4195( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1L4195( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_195 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1L4195( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1L4195( ) ;
                           closeExtendedTableCursors1L4195( ) ;
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
                  if ( nRcdDeleted_195 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbSer_Internalname, GXutil.rtrim( A3391AlbSer)) ;
         httpContext.changePostValue( edtAlbSerD_Internalname, GXutil.rtrim( A8879AlbSerD)) ;
         httpContext.changePostValue( edtAlbColNom_Internalname, GXutil.rtrim( A3392AlbColNom)) ;
         httpContext.changePostValue( edtAlbNomCli_Internalname, GXutil.rtrim( A12232AlbNomCli)) ;
         httpContext.changePostValue( edtAlbColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCodCod_Internalname, GXutil.rtrim( A3153CodCod)) ;
         httpContext.changePostValue( edtBarAlbKgmE_Internalname, GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrgm2_Internalname, GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbMtrE_Internalname, GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTubCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbTub_Internalname, GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbPlas_Internalname, GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrObs_Internalname, GXutil.rtrim( A2441AlbHdrObs)) ;
         httpContext.changePostValue( cmbAlbProVal.getInternalname(), GXutil.rtrim( A2839AlbProVal)) ;
         httpContext.changePostValue( edtAlbTipEnt_Internalname, GXutil.rtrim( A1095AlbTipEnt)) ;
         httpContext.changePostValue( edtAlbTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A12234AlbTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbNumcli_Internalname, GXutil.ltrim( localUtil.ntoc( A12233AlbNumcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli)) ;
         httpContext.changePostValue( edtBarAlbUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12195BarAlbUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPreUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12196BarPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEstTip_Internalname, GXutil.rtrim( A5034BarEstTip)) ;
         httpContext.changePostValue( edtAlbCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3886AlbCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbMetULi_Internalname, GXutil.ltrim( localUtil.ntoc( A6645AlbMetULi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasExt_Internalname, GXutil.rtrim( A2398BarFasExt)) ;
         httpContext.changePostValue( chkBarTipCor.getInternalname(), ((GXutil.strcmp(A5291BarTipCor, "NO")==0) ? "NO" : "SI")) ;
         httpContext.changePostValue( edtBarGraCob_Internalname, GXutil.ltrim( localUtil.ntoc( A5027BarGraCob, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTipDis_Internalname, GXutil.rtrim( A2010BarTipDis)) ;
         httpContext.changePostValue( edtBarAlbPN_Internalname, GXutil.ltrim( localUtil.ntoc( A1461BarAlbPN, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCtrPdas_Internalname, GXutil.ltrim( localUtil.ntoc( A4937BarCtrPdas, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbDto_Internalname, GXutil.ltrim( localUtil.ntoc( A7994AlbDto, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbMqTj_Internalname, GXutil.rtrim( A7993AlbMqTj)) ;
         httpContext.changePostValue( edtAlbDf3_Internalname, GXutil.rtrim( A7992AlbDf3)) ;
         httpContext.changePostValue( edtAlbDf2_Internalname, GXutil.rtrim( A7991AlbDf2)) ;
         httpContext.changePostValue( edtAlbDf1_Internalname, GXutil.rtrim( A7990AlbDf1)) ;
         httpContext.changePostValue( edtAlbCald_Internalname, GXutil.rtrim( A7989AlbCald)) ;
         httpContext.changePostValue( edtAlbEncA_Internalname, GXutil.ltrim( localUtil.ntoc( A7104AlbEncA, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEncL_Internalname, GXutil.ltrim( localUtil.ntoc( A7103AlbEncL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbObsM_Internalname, A6814AlbObsM) ;
         httpContext.changePostValue( edtAlbBarRec_Internalname, GXutil.ltrim( localUtil.ntoc( A2761AlbBarRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkBarAcc.getInternalname(), ((GXutil.strcmp(A5253BarAcc, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtAlbImpMan_Internalname, GXutil.ltrim( localUtil.ntoc( A5354AlbImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbBarEstReo.getInternalname(), GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtBarDisNum_Internalname, GXutil.rtrim( A143BarDisNum)) ;
         httpContext.changePostValue( edtBarGraAca_Internalname, GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEncCli_Internalname, GXutil.rtrim( A4815AlbEncCli)) ;
         httpContext.changePostValue( edtBarEncCli_Internalname, GXutil.rtrim( A4812BarEncCli)) ;
         httpContext.changePostValue( edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc)) ;
         httpContext.changePostValue( edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtAlbTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPart_Internalname, GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbBul_Internalname, GXutil.ltrim( localUtil.ntoc( A1458BarAlbBul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkDisDes.getInternalname(), ((GXutil.strcmp(A365DisDes, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtAlbProRec_Internalname, GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProEsp_Internalname, GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKla_Internalname, GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarMla_Internalname, GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPlz_Internalname, GXutil.ltrim( localUtil.ntoc( A1292BarPlz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPie_Internalname, GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFecSal_Internalname, localUtil.format(A161BarFecSal, "99/99/99")) ;
         httpContext.changePostValue( edtBarAncAca1_Internalname, GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtGuiFasULin_Internalname, GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAcaAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbCadEnc_Internalname, GXutil.ltrim( localUtil.ntoc( A12905AlbCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_35_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z1266BarAlbTub_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2839AlbProVal_"+sGXsfl_35_idx, GXutil.rtrim( Z2839AlbProVal)) ;
         httpContext.changePostValue( "ZT_"+"Z3271AlbHdrAnc_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3392AlbColNom_"+sGXsfl_35_idx, GXutil.rtrim( Z3392AlbColNom)) ;
         httpContext.changePostValue( "ZT_"+"Z3393AlbColNum_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3394AlbTipCol_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z3394AlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3391AlbSer_"+sGXsfl_35_idx, GXutil.rtrim( Z3391AlbSer)) ;
         httpContext.changePostValue( "ZT_"+"Z8879AlbSerD_"+sGXsfl_35_idx, GXutil.rtrim( Z8879AlbSerD)) ;
         httpContext.changePostValue( "ZT_"+"Z3886AlbCliCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z3886AlbCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12232AlbNomCli_"+sGXsfl_35_idx, GXutil.rtrim( Z12232AlbNomCli)) ;
         httpContext.changePostValue( "ZT_"+"Z12233AlbNumcli_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12233AlbNumcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12234AlbTipArt_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12234AlbTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5019AlbHdrgm2_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12905AlbCadEnc_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12905AlbCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4815AlbEncCli_"+sGXsfl_35_idx, GXutil.rtrim( Z4815AlbEncCli)) ;
         httpContext.changePostValue( "ZT_"+"Z1095AlbTipEnt_"+sGXsfl_35_idx, GXutil.rtrim( Z1095AlbTipEnt)) ;
         httpContext.changePostValue( "ZT_"+"Z1263BarAlbMtrE_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1262BarPreKgm_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1264BarPreMtr_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z32AlbProEsp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z40AlbProRec_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2398BarFasExt_"+sGXsfl_35_idx, GXutil.rtrim( Z2398BarFasExt)) ;
         httpContext.changePostValue( "ZT_"+"Z1261BarAlbKgmE_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1265BarAlbPie_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6466PlasCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6467BarAlbPlas_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2441AlbHdrObs_"+sGXsfl_35_idx, GXutil.rtrim( Z2441AlbHdrObs)) ;
         httpContext.changePostValue( "ZT_"+"Z12195BarAlbUnd_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12195BarAlbUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12196BarPreUnd_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12196BarPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6645AlbMetULi_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6645AlbMetULi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1461BarAlbPN_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1461BarAlbPN, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7994AlbDto_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7994AlbDto, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7993AlbMqTj_"+sGXsfl_35_idx, GXutil.rtrim( Z7993AlbMqTj)) ;
         httpContext.changePostValue( "ZT_"+"Z7992AlbDf3_"+sGXsfl_35_idx, GXutil.rtrim( Z7992AlbDf3)) ;
         httpContext.changePostValue( "ZT_"+"Z7991AlbDf2_"+sGXsfl_35_idx, GXutil.rtrim( Z7991AlbDf2)) ;
         httpContext.changePostValue( "ZT_"+"Z7990AlbDf1_"+sGXsfl_35_idx, GXutil.rtrim( Z7990AlbDf1)) ;
         httpContext.changePostValue( "ZT_"+"Z7989AlbCald_"+sGXsfl_35_idx, GXutil.rtrim( Z7989AlbCald)) ;
         httpContext.changePostValue( "ZT_"+"Z7104AlbEncA_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7104AlbEncA, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7103AlbEncL_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7103AlbEncL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6814AlbObsM_"+sGXsfl_35_idx, Z6814AlbObsM) ;
         httpContext.changePostValue( "ZT_"+"Z2761AlbBarRec_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z2761AlbBarRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5354AlbImpMan_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z5354AlbImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1458BarAlbBul_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1458BarAlbBul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1248GuiFasULin_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2763AlbHdrUlin_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5051TipAcaCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z5051TipAcaCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1206TubCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3153CodCod_"+sGXsfl_35_idx, GXutil.rtrim( Z3153CodCod)) ;
         httpContext.changePostValue( "T1265BarAlbPie_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1263BarAlbMtrE_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1261BarAlbKgmE_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_195_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_195_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_195_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_195 != 0 )
         {
            httpContext.changePostValue( "BARCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBSER_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBSERD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbSerD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOLNOM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBNOMCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbNomCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOLNUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODCOD_"+sGXsfl_35_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCodCod_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBKGME_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgmE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPREKGM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRANC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRGM2_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrgm2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBMTRE_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtrE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPREMTR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBPIE_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TUBCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTubCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBTUB_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbTub_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLASCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLASCOD_"+sGXsfl_35_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBPLAS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBPLAS_"+sGXsfl_35_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDROBS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROVAL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProVal.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBTIPENT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTipEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBTIPART_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTipArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPART_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBNUMCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbNumcli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNOMCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBUND_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPREUND_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARESTTIP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEstTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCLICOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBMETULI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbMetULi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASEXT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasExt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPCOR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkBarTipCor.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARGRACOB_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGraCob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPDIS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBPN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCTRPDAS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCtrPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBDTO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBMQTJ_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbMqTj_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBDF3_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDf3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBDF2_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDf2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBDF1_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDf1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCALD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCald_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBENCA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEncA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBENCL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEncL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBOBSM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbObsM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBBARREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbBarRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARACC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkBarAcc.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBIMPMAN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbImpMan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARESTREO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbBarEstReo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDISNUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDisNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARGRAACA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGraAca_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBENCCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEncCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENCCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEncCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSERDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPCOL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBTIPCOL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTipCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPART_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPart_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBBUL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbBul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDES_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisDes.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROESP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProEsp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKLA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMLA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPLZ_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPlz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIE_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECSAL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecSal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARANCACA1_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAncAca1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSIT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASULIN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasULin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRULIN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrUlin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARACAANH_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAcaAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCADENC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCadEnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1L40( )
   {
   }

   public void e111L42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttrn07_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn07_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrn07_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn07_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV72F_tinamar ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      ttrn07_impl.this.GXt_int5 = GXv_int6[0] ;
      AV72F_tinamar = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72F_tinamar", GXutil.str( AV72F_tinamar, 1, 0));
      GXv_int6[0] = AV66F_carvema ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      ttrn07_impl.this.AV66F_carvema = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66F_carvema", GXutil.str( AV66F_carvema, 1, 0));
      GXv_int6[0] = AV87FlagFas ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "ALBFAS", ""), GXv_int6) ;
      ttrn07_impl.this.AV87FlagFas = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87FlagFas", GXutil.str( AV87FlagFas, 1, 0));
      GXv_int6[0] = AV98FlagTxt ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "ALBTXT", ""), GXv_int6) ;
      ttrn07_impl.this.AV98FlagTxt = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98FlagTxt", GXutil.str( AV98FlagTxt, 1, 0));
      GXv_int6[0] = AV92FlagPreFas ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "PREFAS", ""), GXv_int6) ;
      ttrn07_impl.this.AV92FlagPreFas = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92FlagPreFas", GXutil.str( AV92FlagPreFas, 1, 0));
      GXv_int6[0] = AV93FlagPro ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, "100006", GXv_int6) ;
      ttrn07_impl.this.AV93FlagPro = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93FlagPro", GXutil.str( AV93FlagPro, 1, 0));
      GXv_int6[0] = AV70F_moda21 ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      ttrn07_impl.this.AV70F_moda21 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70F_moda21", GXutil.str( AV70F_moda21, 1, 0));
      GXt_int5 = AV152Moda21 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      ttrn07_impl.this.GXt_int5 = GXv_int6[0] ;
      AV152Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV152Moda21", GXutil.str( AV152Moda21, 1, 0));
      GXv_int6[0] = AV91FlagPorRec ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "PORREC", ""), GXv_int6) ;
      ttrn07_impl.this.AV91FlagPorRec = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91FlagPorRec", GXutil.str( AV91FlagPorRec, 1, 0));
      GXt_int5 = AV61Erfoc ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int6) ;
      ttrn07_impl.this.GXt_int5 = GXv_int6[0] ;
      AV61Erfoc = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Erfoc", GXutil.str( AV61Erfoc, 1, 0));
      GXv_int6[0] = AV85FlagEtm ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "ETM   ", ""), GXv_int6) ;
      ttrn07_impl.this.AV85FlagEtm = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85FlagEtm", GXutil.str( AV85FlagEtm, 1, 0));
      GXt_int5 = AV57CtrQb ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "CTRQB", ""), GXv_int6) ;
      ttrn07_impl.this.GXt_int5 = GXv_int6[0] ;
      AV57CtrQb = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57CtrQb", GXutil.str( AV57CtrQb, 1, 0));
      GXt_int5 = AV186Carvitin ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      ttrn07_impl.this.GXt_int5 = GXv_int6[0] ;
      AV186Carvitin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV186Carvitin", GXutil.str( AV186Carvitin, 1, 0));
      GXt_int5 = AV63errkgs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "ERRKGS", ""), GXv_int6) ;
      ttrn07_impl.this.GXt_int5 = GXv_int6[0] ;
      AV63errkgs = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63errkgs", GXutil.str( AV63errkgs, 1, 0));
      GXt_int5 = AV201Artemalha ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "ARTEMH", ""), GXv_int6) ;
      ttrn07_impl.this.GXt_int5 = GXv_int6[0] ;
      AV201Artemalha = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV201Artemalha", GXutil.str( AV201Artemalha, 1, 0));
      GXt_int5 = AV202Siplasticos ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV198EmprCod, httpContext.getMessage( "PLASTI", ""), GXv_int6) ;
      ttrn07_impl.this.GXt_int5 = GXv_int6[0] ;
      AV202Siplasticos = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV202Siplasticos", GXutil.str( AV202Siplasticos, 1, 0));
      edtCodCod_Visible = (((AV201Artemalha==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCod_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtPlasCod_Visible = (((AV202Siplasticos==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbPlas_Visible = (((AV202Siplasticos==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), !bGXsfl_35_Refreshing);
      /* Execute user subroutine: 'ESTA USANDO FUNCIÓN TTRN06DINAMICACALLS' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttrn07_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV198EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttrn07_impl.this.AV198EmprCod = GXv_char4[0] ;
      ttrn07_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn07_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV198EmprCod", AV198EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV198EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext7[0] = AV190WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV190WWPContext = GXv_SdtWWPContext7[0] ;
      AV191TrnContext.fromxml(AV192WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV191TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV220Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV221GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV221GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV221GXV1), 8, 0));
         while ( AV221GXV1 <= AV191TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV197TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV191TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV221GXV1));
            if ( GXutil.strcmp(AV197TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "EmprGuiRem") == 0 )
            {
               AV203Insert_EmprGuiRem = AV197TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV203Insert_EmprGuiRem", AV203Insert_EmprGuiRem);
            }
            else if ( GXutil.strcmp(AV197TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "GuiRemCli") == 0 )
            {
               AV200Insert_GuiRemCli = (int)(GXutil.lval( AV197TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV200Insert_GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV200Insert_GuiRemCli), 6, 0));
            }
            AV221GXV1 = (int)(AV221GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV221GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV221GXV1), 8, 0));
         }
      }
      edtGuiRemCli_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Visible), 5, 0), true);
      edtAlbLic_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Visible), 5, 0), true);
      edtAlbEnvFtp_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEnvFtp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEnvFtp_Visible), 5, 0), true);
      divTablainformaciongeneral_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablainformaciongeneral_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablainformaciongeneral_Visible), 5, 0), true);
   }

   public void e121L42( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( 0 > 1 )
      {
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV191TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.ttrn07ww", new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV212NombreParametro = "NombreDinamicaSiguiente" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV212NombreParametro", AV212NombreParametro);
      /* Execute user subroutine: 'USO DE FUNCIÓN TTRN06DINAMICACALLS' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e131L42( )
   {
      /* 'DoRegresar' Routine */
      returnInSub = false ;
      AV212NombreParametro = "NombreDinamicaAnterior" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV212NombreParametro", AV212NombreParametro);
      /* Execute user subroutine: 'USO DE FUNCIÓN TTRN06DINAMICACALLS' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e141L42( )
   {
      /* 'DoFases' Routine */
      returnInSub = false ;
      if ( ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) && ! (0==A129BarCod) )
      {
         GXt_boolean8 = AV204ExisteRegistro ;
         GXv_boolean9[0] = GXt_boolean8 ;
         new app.existeregistrotxpalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_boolean9) ;
         ttrn07_impl.this.GXt_boolean8 = GXv_boolean9[0] ;
         AV204ExisteRegistro = GXt_boolean8 ;
         if ( AV204ExisteRegistro )
         {
            httpContext.popup(formatLink("app.ttrn09", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {});
         }
      }
   }

   public void e151L42( )
   {
      /* GlobalEvents_Refrescarobjeto Routine */
      returnInSub = false ;
      if ( ( AV206ObjetoRefrescar.indexof("TTrn07") > 0 ) && AV211Refrescar )
      {
         callWebObject(formatLink("app.ttrn07", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV198EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV199AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S122( )
   {
      /* 'USO DE FUNCIÓN TTRN06DINAMICACALLS' Routine */
      returnInSub = false ;
      AV205NombreDinamica = "" ;
      AV209SdtParametroCallsJson = AV192WebSession.getValue("TTrn06_Calls_000") ;
      AV208SdtParametroCallsCollection.fromJSonString(AV209SdtParametroCallsJson, null);
      AV222GXV2 = 1 ;
      while ( AV222GXV2 <= AV208SdtParametroCallsCollection.size() )
      {
         AV207SdtParametroCalls = (app.SdtSdtParametroCalls)((app.SdtSdtParametroCalls)AV208SdtParametroCallsCollection.elementAt(-1+AV222GXV2));
         if ( GXutil.strcmp(AV207SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Nombreparametro(), AV212NombreParametro) == 0 )
         {
            AV205NombreDinamica = AV207SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Valorparametro() ;
            if (true) break;
         }
         AV222GXV2 = (int)(AV222GXV2+1) ;
      }
      if ( ! (GXutil.strcmp("", AV205NombreDinamica)==0) )
      {
         AV192WebSession.remove("TTrn06_Calls_000");
         this.executeExternalObjectMethod("", false, "GlobalEvents", "FlujoObjeto", new Object[] {AV205NombreDinamica,AV209SdtParametroCallsJson}, true);
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(11);
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'ESTA USANDO FUNCIÓN TTRN06DINAMICACALLS' Routine */
      returnInSub = false ;
      AV205NombreDinamica = "" ;
      AV209SdtParametroCallsJson = AV192WebSession.getValue("TTrn06_Calls_000") ;
      AV208SdtParametroCallsCollection.fromJSonString(AV209SdtParametroCallsJson, null);
      AV223GXV3 = 1 ;
      while ( AV223GXV3 <= AV208SdtParametroCallsCollection.size() )
      {
         AV207SdtParametroCalls = (app.SdtSdtParametroCalls)((app.SdtSdtParametroCalls)AV208SdtParametroCallsCollection.elementAt(-1+AV223GXV3));
         if ( GXutil.strcmp(AV207SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Nombreparametro(), "NombreDinamica") == 0 )
         {
            AV205NombreDinamica = AV207SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Valorparametro() ;
            if (true) break;
         }
         AV223GXV3 = (int)(AV223GXV3+1) ;
      }
      bttBtntrn_cancel_Visible = (((GXutil.strcmp("", AV205NombreDinamica)==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_cancel_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_cancel_Visible), 5, 0), true);
      bttBtnregresar_Visible = ((!(GXutil.strcmp("", AV205NombreDinamica)==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnregresar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnregresar_Visible), 5, 0), true);
   }

   public void zm1L43( int GX_JID )
   {
      if ( ( GX_JID == 143 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7101AlbLic = T01L413_A7101AlbLic[0] ;
            Z5805AlbEnvFtp = T01L413_A5805AlbEnvFtp[0] ;
            Z1253EmprGuiRem = T01L413_A1253EmprGuiRem[0] ;
            Z1243GuiRemCli = T01L413_A1243GuiRemCli[0] ;
         }
         else
         {
            Z7101AlbLic = A7101AlbLic ;
            Z5805AlbEnvFtp = A5805AlbEnvFtp ;
            Z1253EmprGuiRem = A1253EmprGuiRem ;
            Z1243GuiRemCli = A1243GuiRemCli ;
         }
      }
      if ( GX_JID == -143 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z7101AlbLic = A7101AlbLic ;
         Z5805AlbEnvFtp = A5805AlbEnvFtp ;
         Z1253EmprGuiRem = A1253EmprGuiRem ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z1244GuiRemCln = A1244GuiRemCln ;
      }
   }

   public void standaloneNotModal( )
   {
      AV220Pgmname = "TTrn07" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV220Pgmname", AV220Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV198EmprCod)==0) )
      {
         A396EmprCod = AV198EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01L415 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01L415_A407EmprNom[0] ;
      n407EmprNom = T01L415_n407EmprNom[0] ;
      pr_default.close(11);
      if ( ! (0==AV199AlbProCod) )
      {
         A30AlbProCod = AV199AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      if ( ! (0==AV199AlbProCod) )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV199AlbProCod) )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV203Insert_EmprGuiRem)==0) )
      {
         edtEmprGuiRem_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprGuiRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprGuiRem_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprGuiRem_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprGuiRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprGuiRem_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV200Insert_GuiRemCli) )
      {
         edtGuiRemCli_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      }
      else
      {
         edtGuiRemCli_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV200Insert_GuiRemCli) )
      {
         A1243GuiRemCli = AV200Insert_GuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV203Insert_EmprGuiRem)==0) )
      {
         A1253EmprGuiRem = AV203Insert_EmprGuiRem ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
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
         /* Using cursor T01L414 */
         pr_default.execute(10, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01L414_A1244GuiRemCln[0] ;
         pr_default.close(10);
      }
   }

   public void load1L43( )
   {
      /* Using cursor T01L416 */
      pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A407EmprNom = T01L416_A407EmprNom[0] ;
         n407EmprNom = T01L416_n407EmprNom[0] ;
         A1244GuiRemCln = T01L416_A1244GuiRemCln[0] ;
         A7101AlbLic = T01L416_A7101AlbLic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
         A5805AlbEnvFtp = T01L416_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A1253EmprGuiRem = T01L416_A1253EmprGuiRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = T01L416_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         zm1L43( -143) ;
      }
      pr_default.close(12);
      onLoadActions1L43( ) ;
   }

   public void onLoadActions1L43( )
   {
      if ( ! ( ( GXutil.strcmp(A7101AlbLic, " ") != 0 ) && ( A5805AlbEnvFtp == 3 ) ) && ( ( GXutil.strcmp(sMode3, "INS") == 0 ) || ( GXutil.strcmp(sMode3, "UPD") == 0 ) ) )
      {
         Dvpanel_tableattributes_Title = GXutil.format( httpContext.getMessage( httpContext.getMessage( " Nº Albaran: %1", ""), ""), GXutil.str( A30AlbProCod, 10, 0), "", "", "", "", "", "", "", "") ;
         ucDvpanel_tableattributes.sendProperty(context, "", false, Dvpanel_tableattributes_Internalname, "Title", Dvpanel_tableattributes_Title);
      }
      else
      {
         if ( ( ( GXutil.strcmp(A7101AlbLic, " ") != 0 ) && ( A5805AlbEnvFtp == 3 ) ) && ( ( GXutil.strcmp(sMode3, "INS") == 0 ) || ( GXutil.strcmp(sMode3, "UPD") == 0 ) ) )
         {
            Dvpanel_tableattributes_Title = GXutil.format( httpContext.getMessage( httpContext.getMessage( " Nº Albaran: %1. Este guia foi comunicada à AT", ""), ""), GXutil.str( A30AlbProCod, 10, 0), "", "", "", "", "", "", "", "") ;
            ucDvpanel_tableattributes.sendProperty(context, "", false, Dvpanel_tableattributes_Internalname, "Title", Dvpanel_tableattributes_Title);
         }
      }
   }

   public void checkExtendedTable1L43( )
   {
      nIsDirty_3 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ! ( ( GXutil.strcmp(A7101AlbLic, " ") != 0 ) && ( A5805AlbEnvFtp == 3 ) ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
      {
         Dvpanel_tableattributes_Title = GXutil.format( httpContext.getMessage( httpContext.getMessage( " Nº Albaran: %1", ""), ""), GXutil.str( A30AlbProCod, 10, 0), "", "", "", "", "", "", "", "") ;
         ucDvpanel_tableattributes.sendProperty(context, "", false, Dvpanel_tableattributes_Internalname, "Title", Dvpanel_tableattributes_Title);
      }
      else
      {
         if ( ( ( GXutil.strcmp(A7101AlbLic, " ") != 0 ) && ( A5805AlbEnvFtp == 3 ) ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
         {
            Dvpanel_tableattributes_Title = GXutil.format( httpContext.getMessage( httpContext.getMessage( " Nº Albaran: %1. Este guia foi comunicada à AT", ""), ""), GXutil.str( A30AlbProCod, 10, 0), "", "", "", "", "", "", "", "") ;
            ucDvpanel_tableattributes.sendProperty(context, "", false, Dvpanel_tableattributes_Internalname, "Title", Dvpanel_tableattributes_Title);
         }
      }
      /* Using cursor T01L414 */
      pr_default.execute(10, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1244GuiRemCln = T01L414_A1244GuiRemCln[0] ;
      pr_default.close(10);
      if ( ( ( GXutil.strcmp(A7101AlbLic, " ") != 0 ) && ( A5805AlbEnvFtp == 3 ) ) && ( isIns( )  || isUpd( )  ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""), 1, "ALBLIC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbLic_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1L43( )
   {
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_144( String A1253EmprGuiRem ,
                           int A1243GuiRemCli )
   {
      /* Using cursor T01L417 */
      pr_default.execute(13, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1244GuiRemCln = T01L417_A1244GuiRemCln[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1244GuiRemCln))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey1L43( )
   {
      /* Using cursor T01L418 */
      pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01L413 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01L413_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1L43( 143) ;
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01L413_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A7101AlbLic = T01L413_A7101AlbLic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
         A5805AlbEnvFtp = T01L413_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A1253EmprGuiRem = T01L413_A1253EmprGuiRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = T01L413_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1L43( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey1L43( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey1L43( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(9);
   }

   public void getEqualNoModal( )
   {
      getKey1L43( ) ;
      if ( RcdFound3 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T01L419 */
      pr_default.execute(15, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( T01L419_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T01L419_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( T01L419_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T01L419_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T01L419_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T01L420 */
      pr_default.execute(16, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( T01L420_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T01L420_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( T01L420_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T01L420_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T01L420_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1L43( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1L43( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ALBPROCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprGuiRem_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1L43( ) ;
               GX_FocusControl = edtEmprGuiRem_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtEmprGuiRem_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1L43( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ALBPROCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtEmprGuiRem_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1L43( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
      {
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1L43( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01L412 */
         pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(8) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(8) == 101) || ( GXutil.strcmp(Z7101AlbLic, T01L412_A7101AlbLic[0]) != 0 ) || ( Z5805AlbEnvFtp != T01L412_A5805AlbEnvFtp[0] ) || ( GXutil.strcmp(Z1253EmprGuiRem, T01L412_A1253EmprGuiRem[0]) != 0 ) || ( Z1243GuiRemCli != T01L412_A1243GuiRemCli[0] ) )
         {
            if ( GXutil.strcmp(Z7101AlbLic, T01L412_A7101AlbLic[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbLic");
               GXutil.writeLogRaw("Old: ",Z7101AlbLic);
               GXutil.writeLogRaw("Current: ",T01L412_A7101AlbLic[0]);
            }
            if ( Z5805AlbEnvFtp != T01L412_A5805AlbEnvFtp[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbEnvFtp");
               GXutil.writeLogRaw("Old: ",Z5805AlbEnvFtp);
               GXutil.writeLogRaw("Current: ",T01L412_A5805AlbEnvFtp[0]);
            }
            if ( GXutil.strcmp(Z1253EmprGuiRem, T01L412_A1253EmprGuiRem[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"EmprGuiRem");
               GXutil.writeLogRaw("Old: ",Z1253EmprGuiRem);
               GXutil.writeLogRaw("Current: ",T01L412_A1253EmprGuiRem[0]);
            }
            if ( Z1243GuiRemCli != T01L412_A1243GuiRemCli[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"GuiRemCli");
               GXutil.writeLogRaw("Old: ",Z1243GuiRemCli);
               GXutil.writeLogRaw("Current: ",T01L412_A1243GuiRemCli[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1L43( )
   {
      beforeValidate1L43( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L43( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1L43( 0) ;
         checkOptimisticConcurrency1L43( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L43( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1L43( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L421 */
                  pr_default.execute(17, new Object[] {Long.valueOf(A30AlbProCod), A7101AlbLic, Byte.valueOf(A5805AlbEnvFtp), A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(17) == 1) )
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
                        processLevel1L43( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1L40( ) ;
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
            load1L43( ) ;
         }
         endLevel1L43( ) ;
      }
      closeExtendedTableCursors1L43( ) ;
   }

   public void update1L43( )
   {
      beforeValidate1L43( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L43( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L43( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L43( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1L43( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L422 */
                  pr_default.execute(18, new Object[] {A7101AlbLic, Byte.valueOf(A5805AlbEnvFtp), A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1L43( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1L43( ) ;
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
         endLevel1L43( ) ;
      }
      closeExtendedTableCursors1L43( ) ;
   }

   public void deferredUpdate1L43( )
   {
   }

   public void delete( )
   {
      beforeValidate1L43( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L43( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1L43( ) ;
         afterConfirm1L43( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1L43( ) ;
            if ( AnyError == 0 )
            {
               scanStart1L4195( ) ;
               while ( RcdFound195 != 0 )
               {
                  getByPrimaryKey1L4195( ) ;
                  delete1L4195( ) ;
                  scanNext1L4195( ) ;
               }
               scanEnd1L4195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L423 */
                  pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1L43( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1L43( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( ( GXutil.strcmp(A7101AlbLic, " ") != 0 ) && ( A5805AlbEnvFtp == 3 ) ) && ( isIns( )  || isUpd( )  ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""), 1, "ALBLIC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbLic_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01L424 */
         pr_default.execute(20, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01L424_A1244GuiRemCln[0] ;
         pr_default.close(20);
         if ( ! ( ( GXutil.strcmp(A7101AlbLic, " ") != 0 ) && ( A5805AlbEnvFtp == 3 ) ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
         {
            Dvpanel_tableattributes_Title = GXutil.format( httpContext.getMessage( httpContext.getMessage( " Nº Albaran: %1", ""), ""), GXutil.str( A30AlbProCod, 10, 0), "", "", "", "", "", "", "", "") ;
            ucDvpanel_tableattributes.sendProperty(context, "", false, Dvpanel_tableattributes_Internalname, "Title", Dvpanel_tableattributes_Title);
         }
         else
         {
            if ( ( ( GXutil.strcmp(A7101AlbLic, " ") != 0 ) && ( A5805AlbEnvFtp == 3 ) ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
            {
               Dvpanel_tableattributes_Title = GXutil.format( httpContext.getMessage( httpContext.getMessage( " Nº Albaran: %1. Este guia foi comunicada à AT", ""), ""), GXutil.str( A30AlbProCod, 10, 0), "", "", "", "", "", "", "", "") ;
               ucDvpanel_tableattributes.sendProperty(context, "", false, Dvpanel_tableattributes_Internalname, "Title", Dvpanel_tableattributes_Title);
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01L425 */
         pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Observaciones ALBARAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01L426 */
         pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Hdrs Albaran", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01L427 */
         pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CNOTRET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01L428 */
         pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01L429 */
         pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
      }
   }

   public void processNestedLevel1L4195( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1L4195( ) ;
         if ( ( nRcdExists_195 != 0 ) || ( nIsMod_195 != 0 ) )
         {
            standaloneNotModal1L4195( ) ;
            getKey1L4195( ) ;
            if ( ( nRcdExists_195 == 0 ) && ( nRcdDeleted_195 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1L4195( ) ;
            }
            else
            {
               if ( RcdFound195 != 0 )
               {
                  if ( ( nRcdDeleted_195 != 0 ) && ( nRcdExists_195 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1L4195( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_195 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1L4195( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_195 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbSer_Internalname, GXutil.rtrim( A3391AlbSer)) ;
         httpContext.changePostValue( edtAlbSerD_Internalname, GXutil.rtrim( A8879AlbSerD)) ;
         httpContext.changePostValue( edtAlbColNom_Internalname, GXutil.rtrim( A3392AlbColNom)) ;
         httpContext.changePostValue( edtAlbNomCli_Internalname, GXutil.rtrim( A12232AlbNomCli)) ;
         httpContext.changePostValue( edtAlbColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCodCod_Internalname, GXutil.rtrim( A3153CodCod)) ;
         httpContext.changePostValue( edtBarAlbKgmE_Internalname, GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrgm2_Internalname, GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbMtrE_Internalname, GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTubCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbTub_Internalname, GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbPlas_Internalname, GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrObs_Internalname, GXutil.rtrim( A2441AlbHdrObs)) ;
         httpContext.changePostValue( cmbAlbProVal.getInternalname(), GXutil.rtrim( A2839AlbProVal)) ;
         httpContext.changePostValue( edtAlbTipEnt_Internalname, GXutil.rtrim( A1095AlbTipEnt)) ;
         httpContext.changePostValue( edtAlbTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A12234AlbTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbNumcli_Internalname, GXutil.ltrim( localUtil.ntoc( A12233AlbNumcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli)) ;
         httpContext.changePostValue( edtBarAlbUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12195BarAlbUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPreUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12196BarPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEstTip_Internalname, GXutil.rtrim( A5034BarEstTip)) ;
         httpContext.changePostValue( edtAlbCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3886AlbCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbMetULi_Internalname, GXutil.ltrim( localUtil.ntoc( A6645AlbMetULi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasExt_Internalname, GXutil.rtrim( A2398BarFasExt)) ;
         httpContext.changePostValue( chkBarTipCor.getInternalname(), ((GXutil.strcmp(A5291BarTipCor, "NO")==0) ? "NO" : "SI")) ;
         httpContext.changePostValue( edtBarGraCob_Internalname, GXutil.ltrim( localUtil.ntoc( A5027BarGraCob, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTipDis_Internalname, GXutil.rtrim( A2010BarTipDis)) ;
         httpContext.changePostValue( edtBarAlbPN_Internalname, GXutil.ltrim( localUtil.ntoc( A1461BarAlbPN, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCtrPdas_Internalname, GXutil.ltrim( localUtil.ntoc( A4937BarCtrPdas, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbDto_Internalname, GXutil.ltrim( localUtil.ntoc( A7994AlbDto, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbMqTj_Internalname, GXutil.rtrim( A7993AlbMqTj)) ;
         httpContext.changePostValue( edtAlbDf3_Internalname, GXutil.rtrim( A7992AlbDf3)) ;
         httpContext.changePostValue( edtAlbDf2_Internalname, GXutil.rtrim( A7991AlbDf2)) ;
         httpContext.changePostValue( edtAlbDf1_Internalname, GXutil.rtrim( A7990AlbDf1)) ;
         httpContext.changePostValue( edtAlbCald_Internalname, GXutil.rtrim( A7989AlbCald)) ;
         httpContext.changePostValue( edtAlbEncA_Internalname, GXutil.ltrim( localUtil.ntoc( A7104AlbEncA, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEncL_Internalname, GXutil.ltrim( localUtil.ntoc( A7103AlbEncL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbObsM_Internalname, A6814AlbObsM) ;
         httpContext.changePostValue( edtAlbBarRec_Internalname, GXutil.ltrim( localUtil.ntoc( A2761AlbBarRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkBarAcc.getInternalname(), ((GXutil.strcmp(A5253BarAcc, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtAlbImpMan_Internalname, GXutil.ltrim( localUtil.ntoc( A5354AlbImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbBarEstReo.getInternalname(), GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtBarDisNum_Internalname, GXutil.rtrim( A143BarDisNum)) ;
         httpContext.changePostValue( edtBarGraAca_Internalname, GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEncCli_Internalname, GXutil.rtrim( A4815AlbEncCli)) ;
         httpContext.changePostValue( edtBarEncCli_Internalname, GXutil.rtrim( A4812BarEncCli)) ;
         httpContext.changePostValue( edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc)) ;
         httpContext.changePostValue( edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtAlbTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPart_Internalname, GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbBul_Internalname, GXutil.ltrim( localUtil.ntoc( A1458BarAlbBul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkDisDes.getInternalname(), ((GXutil.strcmp(A365DisDes, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtAlbProRec_Internalname, GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProEsp_Internalname, GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKla_Internalname, GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarMla_Internalname, GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPlz_Internalname, GXutil.ltrim( localUtil.ntoc( A1292BarPlz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPie_Internalname, GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFecSal_Internalname, localUtil.format(A161BarFecSal, "99/99/99")) ;
         httpContext.changePostValue( edtBarAncAca1_Internalname, GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtGuiFasULin_Internalname, GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAcaAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbCadEnc_Internalname, GXutil.ltrim( localUtil.ntoc( A12905AlbCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_35_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z1266BarAlbTub_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2839AlbProVal_"+sGXsfl_35_idx, GXutil.rtrim( Z2839AlbProVal)) ;
         httpContext.changePostValue( "ZT_"+"Z3271AlbHdrAnc_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3392AlbColNom_"+sGXsfl_35_idx, GXutil.rtrim( Z3392AlbColNom)) ;
         httpContext.changePostValue( "ZT_"+"Z3393AlbColNum_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3394AlbTipCol_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z3394AlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3391AlbSer_"+sGXsfl_35_idx, GXutil.rtrim( Z3391AlbSer)) ;
         httpContext.changePostValue( "ZT_"+"Z8879AlbSerD_"+sGXsfl_35_idx, GXutil.rtrim( Z8879AlbSerD)) ;
         httpContext.changePostValue( "ZT_"+"Z3886AlbCliCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z3886AlbCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12232AlbNomCli_"+sGXsfl_35_idx, GXutil.rtrim( Z12232AlbNomCli)) ;
         httpContext.changePostValue( "ZT_"+"Z12233AlbNumcli_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12233AlbNumcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12234AlbTipArt_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12234AlbTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5019AlbHdrgm2_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12905AlbCadEnc_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12905AlbCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4815AlbEncCli_"+sGXsfl_35_idx, GXutil.rtrim( Z4815AlbEncCli)) ;
         httpContext.changePostValue( "ZT_"+"Z1095AlbTipEnt_"+sGXsfl_35_idx, GXutil.rtrim( Z1095AlbTipEnt)) ;
         httpContext.changePostValue( "ZT_"+"Z1263BarAlbMtrE_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1262BarPreKgm_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1264BarPreMtr_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z32AlbProEsp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z40AlbProRec_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2398BarFasExt_"+sGXsfl_35_idx, GXutil.rtrim( Z2398BarFasExt)) ;
         httpContext.changePostValue( "ZT_"+"Z1261BarAlbKgmE_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1265BarAlbPie_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6466PlasCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6467BarAlbPlas_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2441AlbHdrObs_"+sGXsfl_35_idx, GXutil.rtrim( Z2441AlbHdrObs)) ;
         httpContext.changePostValue( "ZT_"+"Z12195BarAlbUnd_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12195BarAlbUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12196BarPreUnd_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12196BarPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6645AlbMetULi_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6645AlbMetULi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1461BarAlbPN_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1461BarAlbPN, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7994AlbDto_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7994AlbDto, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7993AlbMqTj_"+sGXsfl_35_idx, GXutil.rtrim( Z7993AlbMqTj)) ;
         httpContext.changePostValue( "ZT_"+"Z7992AlbDf3_"+sGXsfl_35_idx, GXutil.rtrim( Z7992AlbDf3)) ;
         httpContext.changePostValue( "ZT_"+"Z7991AlbDf2_"+sGXsfl_35_idx, GXutil.rtrim( Z7991AlbDf2)) ;
         httpContext.changePostValue( "ZT_"+"Z7990AlbDf1_"+sGXsfl_35_idx, GXutil.rtrim( Z7990AlbDf1)) ;
         httpContext.changePostValue( "ZT_"+"Z7989AlbCald_"+sGXsfl_35_idx, GXutil.rtrim( Z7989AlbCald)) ;
         httpContext.changePostValue( "ZT_"+"Z7104AlbEncA_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7104AlbEncA, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7103AlbEncL_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7103AlbEncL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6814AlbObsM_"+sGXsfl_35_idx, Z6814AlbObsM) ;
         httpContext.changePostValue( "ZT_"+"Z2761AlbBarRec_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z2761AlbBarRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5354AlbImpMan_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z5354AlbImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1458BarAlbBul_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1458BarAlbBul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1248GuiFasULin_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2763AlbHdrUlin_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5051TipAcaCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z5051TipAcaCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1206TubCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3153CodCod_"+sGXsfl_35_idx, GXutil.rtrim( Z3153CodCod)) ;
         httpContext.changePostValue( "T1265BarAlbPie_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1263BarAlbMtrE_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1261BarAlbKgmE_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_195_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_195_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_195_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_195 != 0 )
         {
            httpContext.changePostValue( "BARCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBSER_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBSERD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbSerD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOLNOM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBNOMCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbNomCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOLNUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODCOD_"+sGXsfl_35_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCodCod_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBKGME_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgmE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPREKGM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRANC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRGM2_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrgm2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBMTRE_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtrE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPREMTR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBPIE_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TUBCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTubCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBTUB_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbTub_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLASCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLASCOD_"+sGXsfl_35_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBPLAS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBPLAS_"+sGXsfl_35_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDROBS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROVAL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProVal.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBTIPENT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTipEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBTIPART_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTipArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPART_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBNUMCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbNumcli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNOMCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBUND_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPREUND_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARESTTIP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEstTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCLICOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBMETULI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbMetULi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASEXT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasExt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPCOR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkBarTipCor.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARGRACOB_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGraCob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPDIS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBPN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCTRPDAS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCtrPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBDTO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBMQTJ_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbMqTj_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBDF3_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDf3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBDF2_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDf2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBDF1_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDf1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCALD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCald_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBENCA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEncA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBENCL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEncL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBOBSM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbObsM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBBARREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbBarRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARACC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkBarAcc.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBIMPMAN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbImpMan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARESTREO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbBarEstReo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDISNUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDisNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARGRAACA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGraAca_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBENCCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEncCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENCCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEncCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSERDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPCOL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBTIPCOL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTipCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPART_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPart_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBBUL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbBul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISDES_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisDes.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROESP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProEsp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKLA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMLA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPLZ_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPlz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIE_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECSAL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecSal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARANCACA1_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAncAca1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSIT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASULIN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasULin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRULIN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrUlin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARACAANH_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAcaAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCADENC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCadEnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1L4195( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_195 = (short)(0) ;
      nIsMod_195 = (short)(0) ;
      nRcdDeleted_195 = (short)(0) ;
   }

   public void processLevel1L43( )
   {
      /* Save parent mode. */
      sMode3 = Gx_mode ;
      processNestedLevel1L4195( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1L43( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(8);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1L43( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn07");
         if ( AnyError == 0 )
         {
            confirmValues1L40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn07");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1L43( )
   {
      /* Scan By routine */
      /* Using cursor T01L430 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01L430_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1L43( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01L430_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void scanEnd1L43( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1L43( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1L43( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1L43( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1L43( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1L43( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1L43( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1L43( )
   {
      edtEmprGuiRem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprGuiRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprGuiRem_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtGuiRemCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      edtAlbLic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Enabled), 5, 0), true);
      edtAlbEnvFtp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEnvFtp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEnvFtp_Enabled), 5, 0), true);
   }

   public void zm1L4195( int GX_JID )
   {
      if ( ( GX_JID == 146 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1266BarAlbTub = T01L43_A1266BarAlbTub[0] ;
            Z2839AlbProVal = T01L43_A2839AlbProVal[0] ;
            Z3271AlbHdrAnc = T01L43_A3271AlbHdrAnc[0] ;
            Z3392AlbColNom = T01L43_A3392AlbColNom[0] ;
            Z3393AlbColNum = T01L43_A3393AlbColNum[0] ;
            Z3394AlbTipCol = T01L43_A3394AlbTipCol[0] ;
            Z3391AlbSer = T01L43_A3391AlbSer[0] ;
            Z8879AlbSerD = T01L43_A8879AlbSerD[0] ;
            Z3886AlbCliCod = T01L43_A3886AlbCliCod[0] ;
            Z12232AlbNomCli = T01L43_A12232AlbNomCli[0] ;
            Z12233AlbNumcli = T01L43_A12233AlbNumcli[0] ;
            Z12234AlbTipArt = T01L43_A12234AlbTipArt[0] ;
            Z5019AlbHdrgm2 = T01L43_A5019AlbHdrgm2[0] ;
            Z12905AlbCadEnc = T01L43_A12905AlbCadEnc[0] ;
            Z4815AlbEncCli = T01L43_A4815AlbEncCli[0] ;
            Z1095AlbTipEnt = T01L43_A1095AlbTipEnt[0] ;
            Z1263BarAlbMtrE = T01L43_A1263BarAlbMtrE[0] ;
            Z1262BarPreKgm = T01L43_A1262BarPreKgm[0] ;
            Z1264BarPreMtr = T01L43_A1264BarPreMtr[0] ;
            Z32AlbProEsp = T01L43_A32AlbProEsp[0] ;
            Z40AlbProRec = T01L43_A40AlbProRec[0] ;
            Z2398BarFasExt = T01L43_A2398BarFasExt[0] ;
            Z1261BarAlbKgmE = T01L43_A1261BarAlbKgmE[0] ;
            Z1265BarAlbPie = T01L43_A1265BarAlbPie[0] ;
            Z6466PlasCod = T01L43_A6466PlasCod[0] ;
            Z6467BarAlbPlas = T01L43_A6467BarAlbPlas[0] ;
            Z2441AlbHdrObs = T01L43_A2441AlbHdrObs[0] ;
            Z12195BarAlbUnd = T01L43_A12195BarAlbUnd[0] ;
            Z12196BarPreUnd = T01L43_A12196BarPreUnd[0] ;
            Z6645AlbMetULi = T01L43_A6645AlbMetULi[0] ;
            Z1461BarAlbPN = T01L43_A1461BarAlbPN[0] ;
            Z7994AlbDto = T01L43_A7994AlbDto[0] ;
            Z7993AlbMqTj = T01L43_A7993AlbMqTj[0] ;
            Z7992AlbDf3 = T01L43_A7992AlbDf3[0] ;
            Z7991AlbDf2 = T01L43_A7991AlbDf2[0] ;
            Z7990AlbDf1 = T01L43_A7990AlbDf1[0] ;
            Z7989AlbCald = T01L43_A7989AlbCald[0] ;
            Z7104AlbEncA = T01L43_A7104AlbEncA[0] ;
            Z7103AlbEncL = T01L43_A7103AlbEncL[0] ;
            Z6814AlbObsM = T01L43_A6814AlbObsM[0] ;
            Z2761AlbBarRec = T01L43_A2761AlbBarRec[0] ;
            Z5354AlbImpMan = T01L43_A5354AlbImpMan[0] ;
            Z1458BarAlbBul = T01L43_A1458BarAlbBul[0] ;
            Z1248GuiFasULin = T01L43_A1248GuiFasULin[0] ;
            Z2763AlbHdrUlin = T01L43_A2763AlbHdrUlin[0] ;
            Z5051TipAcaCod = T01L43_A5051TipAcaCod[0] ;
            Z1206TubCod = T01L43_A1206TubCod[0] ;
            Z3153CodCod = T01L43_A3153CodCod[0] ;
         }
         else
         {
            Z1266BarAlbTub = A1266BarAlbTub ;
            Z2839AlbProVal = A2839AlbProVal ;
            Z3271AlbHdrAnc = A3271AlbHdrAnc ;
            Z3392AlbColNom = A3392AlbColNom ;
            Z3393AlbColNum = A3393AlbColNum ;
            Z3394AlbTipCol = A3394AlbTipCol ;
            Z3391AlbSer = A3391AlbSer ;
            Z8879AlbSerD = A8879AlbSerD ;
            Z3886AlbCliCod = A3886AlbCliCod ;
            Z12232AlbNomCli = A12232AlbNomCli ;
            Z12233AlbNumcli = A12233AlbNumcli ;
            Z12234AlbTipArt = A12234AlbTipArt ;
            Z5019AlbHdrgm2 = A5019AlbHdrgm2 ;
            Z12905AlbCadEnc = A12905AlbCadEnc ;
            Z4815AlbEncCli = A4815AlbEncCli ;
            Z1095AlbTipEnt = A1095AlbTipEnt ;
            Z1263BarAlbMtrE = A1263BarAlbMtrE ;
            Z1262BarPreKgm = A1262BarPreKgm ;
            Z1264BarPreMtr = A1264BarPreMtr ;
            Z32AlbProEsp = A32AlbProEsp ;
            Z40AlbProRec = A40AlbProRec ;
            Z2398BarFasExt = A2398BarFasExt ;
            Z1261BarAlbKgmE = A1261BarAlbKgmE ;
            Z1265BarAlbPie = A1265BarAlbPie ;
            Z6466PlasCod = A6466PlasCod ;
            Z6467BarAlbPlas = A6467BarAlbPlas ;
            Z2441AlbHdrObs = A2441AlbHdrObs ;
            Z12195BarAlbUnd = A12195BarAlbUnd ;
            Z12196BarPreUnd = A12196BarPreUnd ;
            Z6645AlbMetULi = A6645AlbMetULi ;
            Z1461BarAlbPN = A1461BarAlbPN ;
            Z7994AlbDto = A7994AlbDto ;
            Z7993AlbMqTj = A7993AlbMqTj ;
            Z7992AlbDf3 = A7992AlbDf3 ;
            Z7991AlbDf2 = A7991AlbDf2 ;
            Z7990AlbDf1 = A7990AlbDf1 ;
            Z7989AlbCald = A7989AlbCald ;
            Z7104AlbEncA = A7104AlbEncA ;
            Z7103AlbEncL = A7103AlbEncL ;
            Z6814AlbObsM = A6814AlbObsM ;
            Z2761AlbBarRec = A2761AlbBarRec ;
            Z5354AlbImpMan = A5354AlbImpMan ;
            Z1458BarAlbBul = A1458BarAlbBul ;
            Z1248GuiFasULin = A1248GuiFasULin ;
            Z2763AlbHdrUlin = A2763AlbHdrUlin ;
            Z5051TipAcaCod = A5051TipAcaCod ;
            Z1206TubCod = A1206TubCod ;
            Z3153CodCod = A3153CodCod ;
         }
      }
      if ( GX_JID == -146 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z1266BarAlbTub = A1266BarAlbTub ;
         Z2839AlbProVal = A2839AlbProVal ;
         Z3271AlbHdrAnc = A3271AlbHdrAnc ;
         Z3392AlbColNom = A3392AlbColNom ;
         Z3393AlbColNum = A3393AlbColNum ;
         Z3394AlbTipCol = A3394AlbTipCol ;
         Z3391AlbSer = A3391AlbSer ;
         Z8879AlbSerD = A8879AlbSerD ;
         Z3886AlbCliCod = A3886AlbCliCod ;
         Z12232AlbNomCli = A12232AlbNomCli ;
         Z12233AlbNumcli = A12233AlbNumcli ;
         Z12234AlbTipArt = A12234AlbTipArt ;
         Z5019AlbHdrgm2 = A5019AlbHdrgm2 ;
         Z12905AlbCadEnc = A12905AlbCadEnc ;
         Z4815AlbEncCli = A4815AlbEncCli ;
         Z1095AlbTipEnt = A1095AlbTipEnt ;
         Z1263BarAlbMtrE = A1263BarAlbMtrE ;
         Z1262BarPreKgm = A1262BarPreKgm ;
         Z1264BarPreMtr = A1264BarPreMtr ;
         Z32AlbProEsp = A32AlbProEsp ;
         Z40AlbProRec = A40AlbProRec ;
         Z2398BarFasExt = A2398BarFasExt ;
         Z1261BarAlbKgmE = A1261BarAlbKgmE ;
         Z1265BarAlbPie = A1265BarAlbPie ;
         Z6466PlasCod = A6466PlasCod ;
         Z6467BarAlbPlas = A6467BarAlbPlas ;
         Z2441AlbHdrObs = A2441AlbHdrObs ;
         Z12195BarAlbUnd = A12195BarAlbUnd ;
         Z12196BarPreUnd = A12196BarPreUnd ;
         Z6645AlbMetULi = A6645AlbMetULi ;
         Z1461BarAlbPN = A1461BarAlbPN ;
         Z7994AlbDto = A7994AlbDto ;
         Z7993AlbMqTj = A7993AlbMqTj ;
         Z7992AlbDf3 = A7992AlbDf3 ;
         Z7991AlbDf2 = A7991AlbDf2 ;
         Z7990AlbDf1 = A7990AlbDf1 ;
         Z7989AlbCald = A7989AlbCald ;
         Z7104AlbEncA = A7104AlbEncA ;
         Z7103AlbEncL = A7103AlbEncL ;
         Z6814AlbObsM = A6814AlbObsM ;
         Z2761AlbBarRec = A2761AlbBarRec ;
         Z5354AlbImpMan = A5354AlbImpMan ;
         Z1458BarAlbBul = A1458BarAlbBul ;
         Z1248GuiFasULin = A1248GuiFasULin ;
         Z2763AlbHdrUlin = A2763AlbHdrUlin ;
         Z5051TipAcaCod = A5051TipAcaCod ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z1206TubCod = A1206TubCod ;
         Z3153CodCod = A3153CodCod ;
         Z361DisCod = A361DisCod ;
         Z1235BarNumCli = A1235BarNumCli ;
         Z1234BarNomCli = A1234BarNomCli ;
         Z5034BarEstTip = A5034BarEstTip ;
         Z5291BarTipCor = A5291BarTipCor ;
         Z5027BarGraCob = A5027BarGraCob ;
         Z2010BarTipDis = A2010BarTipDis ;
         Z4937BarCtrPdas = A4937BarCtrPdas ;
         Z5253BarAcc = A5253BarAcc ;
         Z148BarEstReo = A148BarEstReo ;
         Z143BarDisNum = A143BarDisNum ;
         Z1909BarGraAca = A1909BarGraAca ;
         Z4812BarEncCli = A4812BarEncCli ;
         Z1652BarSerDsc = A1652BarSerDsc ;
         Z218BarTipCol = A218BarTipCol ;
         Z136BarColNum = A136BarColNum ;
         Z135BarColNom = A135BarColNom ;
         Z1503BarPart = A1503BarPart ;
         Z161BarFecSal = A161BarFecSal ;
         Z125BarAncAca1 = A125BarAncAca1 ;
         Z213BarSit = A213BarSit ;
         Z212BarSer = A212BarSer ;
         Z4466BarAcaAnh = A4466BarAcaAnh ;
         Z252CliCod = A252CliCod ;
         Z217BarTipArt = A217BarTipArt ;
         Z365DisDes = A365DisDes ;
         Z1280BarMla = A1280BarMla ;
         Z1279BarKla = A1279BarKla ;
         Z1292BarPlz = A1292BarPlz ;
         Z898BarPieNDes = A898BarPieNDes ;
         Z199BarPie1 = A199BarPie1 ;
      }
   }

   public void standaloneNotModal1L4195( )
   {
      edtAlbSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSer_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbSerD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSerD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSerD_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNom_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNomCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipArt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbNumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumcli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarNumCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbUnd_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPreUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreUnd_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarEstTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEstTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEstTip_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCliCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbMetULi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMetULi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMetULi_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarFasExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasExt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      chkBarTipCor.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarTipCor.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
      edtBarGraCob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraCob_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarTipDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDis_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbPN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPN_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarCtrPdas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCtrPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCtrPdas_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDto_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbMqTj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMqTj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMqTj_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbDf3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDf3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf3_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbDf2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDf2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf2_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbDf1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDf1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf1_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbCald_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCald_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCald_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbEncA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncA_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbEncL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncL_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbObsM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbObsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbObsM_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbBarRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbBarRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbBarRec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      chkBarAcc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarAcc.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbImpMan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbImpMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbImpMan_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      cmbBarEstReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbBarEstReo.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
      edtBarDisNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarGraAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbEncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarEncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipCol_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPart_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbBul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbBul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbBul_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      chkDisDes.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisDes.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbProRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProRec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbProEsp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEsp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarKla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKla_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarMla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMla_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPlz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPlz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPlz_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarFecSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecSal_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAncAca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca1_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtGuiFasULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasULin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbHdrUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrUlin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAcaAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaAnh_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbCadEnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCadEnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCadEnc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void standaloneModal1L4195( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         AV155Modo2 = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV155Modo2", AV155Modo2);
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            AV155Modo2 = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV155Modo2", AV155Modo2);
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               AV155Modo2 = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV155Modo2", AV155Modo2);
            }
         }
      }
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Use a função X para eliminar o Ordem Serviço", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A2839AlbProVal)==0) && ( Gx_BScreen == 0 ) )
      {
         A2839AlbProVal = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A1095AlbTipEnt)==0) && ( Gx_BScreen == 0 ) )
      {
         A1095AlbTipEnt = "*" ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1L4195( )
   {
      /* Using cursor T01L433 */
      pr_default.execute(27, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A361DisCod = T01L433_A361DisCod[0] ;
         A1266BarAlbTub = T01L433_A1266BarAlbTub[0] ;
         A2839AlbProVal = T01L433_A2839AlbProVal[0] ;
         A3271AlbHdrAnc = T01L433_A3271AlbHdrAnc[0] ;
         A3392AlbColNom = T01L433_A3392AlbColNom[0] ;
         A3393AlbColNum = T01L433_A3393AlbColNum[0] ;
         A3394AlbTipCol = T01L433_A3394AlbTipCol[0] ;
         A3391AlbSer = T01L433_A3391AlbSer[0] ;
         A8879AlbSerD = T01L433_A8879AlbSerD[0] ;
         A3886AlbCliCod = T01L433_A3886AlbCliCod[0] ;
         A12232AlbNomCli = T01L433_A12232AlbNomCli[0] ;
         A12233AlbNumcli = T01L433_A12233AlbNumcli[0] ;
         A12234AlbTipArt = T01L433_A12234AlbTipArt[0] ;
         A5019AlbHdrgm2 = T01L433_A5019AlbHdrgm2[0] ;
         A12905AlbCadEnc = T01L433_A12905AlbCadEnc[0] ;
         A4815AlbEncCli = T01L433_A4815AlbEncCli[0] ;
         A1095AlbTipEnt = T01L433_A1095AlbTipEnt[0] ;
         A1263BarAlbMtrE = T01L433_A1263BarAlbMtrE[0] ;
         A1262BarPreKgm = T01L433_A1262BarPreKgm[0] ;
         A1264BarPreMtr = T01L433_A1264BarPreMtr[0] ;
         A32AlbProEsp = T01L433_A32AlbProEsp[0] ;
         A40AlbProRec = T01L433_A40AlbProRec[0] ;
         A2398BarFasExt = T01L433_A2398BarFasExt[0] ;
         A1261BarAlbKgmE = T01L433_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = T01L433_A1265BarAlbPie[0] ;
         A6466PlasCod = T01L433_A6466PlasCod[0] ;
         n6466PlasCod = T01L433_n6466PlasCod[0] ;
         A6467BarAlbPlas = T01L433_A6467BarAlbPlas[0] ;
         A2441AlbHdrObs = T01L433_A2441AlbHdrObs[0] ;
         A1235BarNumCli = T01L433_A1235BarNumCli[0] ;
         A1234BarNomCli = T01L433_A1234BarNomCli[0] ;
         A12195BarAlbUnd = T01L433_A12195BarAlbUnd[0] ;
         A12196BarPreUnd = T01L433_A12196BarPreUnd[0] ;
         A5034BarEstTip = T01L433_A5034BarEstTip[0] ;
         A6645AlbMetULi = T01L433_A6645AlbMetULi[0] ;
         A5291BarTipCor = T01L433_A5291BarTipCor[0] ;
         A5027BarGraCob = T01L433_A5027BarGraCob[0] ;
         A2010BarTipDis = T01L433_A2010BarTipDis[0] ;
         A1461BarAlbPN = T01L433_A1461BarAlbPN[0] ;
         A4937BarCtrPdas = T01L433_A4937BarCtrPdas[0] ;
         n4937BarCtrPdas = T01L433_n4937BarCtrPdas[0] ;
         A7994AlbDto = T01L433_A7994AlbDto[0] ;
         A7993AlbMqTj = T01L433_A7993AlbMqTj[0] ;
         A7992AlbDf3 = T01L433_A7992AlbDf3[0] ;
         A7991AlbDf2 = T01L433_A7991AlbDf2[0] ;
         A7990AlbDf1 = T01L433_A7990AlbDf1[0] ;
         A7989AlbCald = T01L433_A7989AlbCald[0] ;
         A7104AlbEncA = T01L433_A7104AlbEncA[0] ;
         A7103AlbEncL = T01L433_A7103AlbEncL[0] ;
         A6814AlbObsM = T01L433_A6814AlbObsM[0] ;
         A2761AlbBarRec = T01L433_A2761AlbBarRec[0] ;
         A5253BarAcc = T01L433_A5253BarAcc[0] ;
         A5354AlbImpMan = T01L433_A5354AlbImpMan[0] ;
         A148BarEstReo = T01L433_A148BarEstReo[0] ;
         A143BarDisNum = T01L433_A143BarDisNum[0] ;
         A1909BarGraAca = T01L433_A1909BarGraAca[0] ;
         A4812BarEncCli = T01L433_A4812BarEncCli[0] ;
         A1652BarSerDsc = T01L433_A1652BarSerDsc[0] ;
         A218BarTipCol = T01L433_A218BarTipCol[0] ;
         A136BarColNum = T01L433_A136BarColNum[0] ;
         A135BarColNom = T01L433_A135BarColNom[0] ;
         A1503BarPart = T01L433_A1503BarPart[0] ;
         A1458BarAlbBul = T01L433_A1458BarAlbBul[0] ;
         A365DisDes = T01L433_A365DisDes[0] ;
         A161BarFecSal = T01L433_A161BarFecSal[0] ;
         A125BarAncAca1 = T01L433_A125BarAncAca1[0] ;
         A213BarSit = T01L433_A213BarSit[0] ;
         A212BarSer = T01L433_A212BarSer[0] ;
         A1248GuiFasULin = T01L433_A1248GuiFasULin[0] ;
         A2763AlbHdrUlin = T01L433_A2763AlbHdrUlin[0] ;
         A4466BarAcaAnh = T01L433_A4466BarAcaAnh[0] ;
         A5051TipAcaCod = T01L433_A5051TipAcaCod[0] ;
         A1206TubCod = T01L433_A1206TubCod[0] ;
         n1206TubCod = T01L433_n1206TubCod[0] ;
         A3153CodCod = T01L433_A3153CodCod[0] ;
         n3153CodCod = T01L433_n3153CodCod[0] ;
         A252CliCod = T01L433_A252CliCod[0] ;
         n252CliCod = T01L433_n252CliCod[0] ;
         A217BarTipArt = T01L433_A217BarTipArt[0] ;
         n217BarTipArt = T01L433_n217BarTipArt[0] ;
         A1280BarMla = T01L433_A1280BarMla[0] ;
         A1279BarKla = T01L433_A1279BarKla[0] ;
         A1292BarPlz = T01L433_A1292BarPlz[0] ;
         A898BarPieNDes = T01L433_A898BarPieNDes[0] ;
         A199BarPie1 = T01L433_A199BarPie1[0] ;
         zm1L4195( -146) ;
      }
      pr_default.close(27);
      onLoadActions1L4195( ) ;
   }

   public void onLoadActions1L4195( )
   {
      if ( isIns( )  && ( AV45BarKgm.doubleValue() >= 0 ) )
      {
         A1261BarAlbKgmE = AV45BarKgm ;
      }
      if ( isIns( )  && ( AV176PzasLan >= 0 ) )
      {
         A1265BarAlbPie = AV176PzasLan ;
      }
      if ( isIns( )  && (0==A12233AlbNumcli) && ( Gx_BScreen == 0 ) )
      {
         A12233AlbNumcli = A1235BarNumCli ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A12232AlbNomCli)==0) && ( Gx_BScreen == 0 ) )
      {
         A12232AlbNomCli = A1234BarNomCli ;
      }
      if ( isIns( )  && (0==A5019AlbHdrgm2) && ( Gx_BScreen == 0 ) )
      {
         A5019AlbHdrgm2 = A1909BarGraAca ;
      }
      A4815AlbEncCli = ((GXutil.strcmp(A4812BarEncCli, " ")!=0) ? A4812BarEncCli : A143BarDisNum) ;
      if ( isIns( )  && (GXutil.strcmp("", A8879AlbSerD)==0) && ( Gx_BScreen == 0 ) )
      {
         A8879AlbSerD = A1652BarSerDsc ;
      }
      if ( isIns( )  && (0==A3394AlbTipCol) && ( Gx_BScreen == 0 ) )
      {
         A3394AlbTipCol = A218BarTipCol ;
      }
      if ( isIns( )  && (0==A3393AlbColNum) && ( Gx_BScreen == 0 ) )
      {
         A3393AlbColNum = A136BarColNum ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A3392AlbColNom)==0) && ( Gx_BScreen == 0 ) )
      {
         A3392AlbColNom = A135BarColNom ;
      }
      if ( isIns( )  && (0==A3271AlbHdrAnc) && ( Gx_BScreen == 0 ) )
      {
         A3271AlbHdrAnc = A125BarAncAca1 ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A3391AlbSer)==0) && ( Gx_BScreen == 0 ) )
      {
         A3391AlbSer = A212BarSer ;
      }
      if ( isIns( )  && (0==A12905AlbCadEnc) && ( Gx_BScreen == 0 ) )
      {
         A12905AlbCadEnc = A4466BarAcaAnh ;
      }
      if ( isIns( )  && (0==A3886AlbCliCod) && ( Gx_BScreen == 0 ) )
      {
         A3886AlbCliCod = A252CliCod ;
      }
      if ( isIns( )  && (0==A12234AlbTipArt) && ( Gx_BScreen == 0 ) )
      {
         A12234AlbTipArt = A217BarTipArt ;
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
      }
      else
      {
         A198BarPie = A199BarPie1 ;
      }
      AV108KilAnt = O1261BarAlbKgmE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108KilAnt", GXutil.ltrimstr( AV108KilAnt, 9, 2));
      if ( true /* After */ )
      {
         AV163Msg_k = httpContext.getMessage( httpContext.getMessage( "Os quilos saidos= ", ""), "") + GXutil.str( A1261BarAlbKgmE, 9, 2) + httpContext.getMessage( httpContext.getMessage( ", são maiores do que os quilos da OS= ", ""), "") + GXutil.str( AV38KgsHdr, 9, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV163Msg_k", AV163Msg_k);
      }
      if ( isIns( )  && ( AV151Metros.doubleValue() >= 0 ) && ( AV152Moda21 == 0 ) )
      {
         A1263BarAlbMtrE = AV151Metros ;
      }
      else
      {
         if ( ( isIns( )  || isUpd( )  ) && ( AV152Moda21 == 1 ) && true /* After */ )
         {
            A1263BarAlbMtrE = (((A5019AlbHdrgm2*A3271AlbHdrAnc)>0) ? (A1261BarAlbKgmE.divide(DecimalUtil.doubleToDec((A5019AlbHdrgm2*(A3271AlbHdrAnc/ (double) (100)))), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)) ;
         }
      }
      AV150MetAnt = O1263BarAlbMtrE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV150MetAnt", GXutil.ltrimstr( AV150MetAnt, 9, 2));
      if ( isIns( )  && (0==A1266BarAlbTub) && ( Gx_BScreen == 0 ) )
      {
         A1266BarAlbTub = A1265BarAlbPie ;
      }
      AV165PieAnt = O1265BarAlbPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV165PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165PieAnt), 6, 0));
   }

   public void checkExtendedTable1L4195( )
   {
      nIsDirty_195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1L4195( ) ;
      /* Using cursor T01L45 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1206TubCod) ) )
         {
            GXCCtl = "TUBCOD_" + sGXsfl_35_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TUBOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtTubCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(3);
      /* Using cursor T01L46 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n3153CodCod), A3153CodCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3153CodCod)==0) ) )
         {
            GXCCtl = "CODCOD_" + sGXsfl_35_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtCodCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(4);
      if ( true /* Level */ && true /* After */ && isIns( )  && ( AV186Carvitin == 1 ) )
      {
         GXv_decimal10[0] = A1262BarPreKgm ;
         GXv_decimal11[0] = A1264BarPreMtr ;
         GXv_int6[0] = A32AlbProEsp ;
         GXv_decimal12[0] = A40AlbProRec ;
         GXv_char4[0] = A2398BarFasExt ;
         new app.pbuspre4(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal10, GXv_decimal11, GXv_int6, GXv_decimal12, GXv_char4) ;
         ttrn07_impl.this.A1262BarPreKgm = GXv_decimal10[0] ;
         ttrn07_impl.this.A1264BarPreMtr = GXv_decimal11[0] ;
         ttrn07_impl.this.A32AlbProEsp = GXv_int6[0] ;
         ttrn07_impl.this.A40AlbProRec = GXv_decimal12[0] ;
         ttrn07_impl.this.A2398BarFasExt = GXv_char4[0] ;
      }
      if ( true /* After */ && ( AV152Moda21 == 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int13[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = AV158Msg_acc ;
         new app.pctrlacc(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_int6, GXv_char3, GXv_char2) ;
         ttrn07_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn07_impl.this.A129BarCod = GXv_int13[0] ;
         ttrn07_impl.this.A132BarCodReo = GXv_int6[0] ;
         ttrn07_impl.this.A130BarCodPar = GXv_char3[0] ;
         ttrn07_impl.this.AV158Msg_acc = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV158Msg_acc", AV158Msg_acc);
      }
      if ( true /* After */ && isIns( )  )
      {
         GXv_decimal12[0] = AV151Metros ;
         GXv_decimal11[0] = A1280BarMla ;
         GXv_decimal10[0] = AV45BarKgm ;
         GXv_decimal14[0] = A1279BarKla ;
         GXv_int13[0] = AV176PzasLan ;
         GXv_int15[0] = A1292BarPlz ;
         new app.pkgsmts(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_decimal14, GXv_int13, GXv_int15) ;
         ttrn07_impl.this.AV151Metros = GXv_decimal12[0] ;
         ttrn07_impl.this.A1280BarMla = GXv_decimal11[0] ;
         ttrn07_impl.this.AV45BarKgm = GXv_decimal10[0] ;
         ttrn07_impl.this.A1279BarKla = GXv_decimal14[0] ;
         ttrn07_impl.this.AV176PzasLan = GXv_int13[0] ;
         ttrn07_impl.this.A1292BarPlz = (short)((short)(GXv_int15[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV151Metros", GXutil.ltrimstr( AV151Metros, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV45BarKgm", GXutil.ltrimstr( AV45BarKgm, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV176PzasLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV176PzasLan), 6, 0));
      }
      if ( isIns( )  && ( AV45BarKgm.doubleValue() >= 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A1261BarAlbKgmE = AV45BarKgm ;
      }
      if ( isIns( )  && ( AV176PzasLan >= 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A1265BarAlbPie = AV176PzasLan ;
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int15[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_decimal14[0] = AV38KgsHdr ;
         new app.pkilos(remoteHandle, context).execute( GXv_char4, GXv_int15, GXv_int6, GXv_char3, GXv_decimal14) ;
         ttrn07_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn07_impl.this.A129BarCod = GXv_int15[0] ;
         ttrn07_impl.this.A132BarCodReo = GXv_int6[0] ;
         ttrn07_impl.this.A130BarCodPar = GXv_char3[0] ;
         ttrn07_impl.this.AV38KgsHdr = GXv_decimal14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV38KgsHdr", GXutil.ltrimstr( AV38KgsHdr, 9, 2));
      }
      if ( ( AV72F_tinamar == 1 ) && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int15[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = AV171TipDis ;
         new app.pctrmaca(remoteHandle, context).execute( GXv_char4, GXv_int15, GXv_int6, GXv_char3, GXv_char2) ;
         ttrn07_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn07_impl.this.A129BarCod = GXv_int15[0] ;
         ttrn07_impl.this.A132BarCodReo = GXv_int6[0] ;
         ttrn07_impl.this.A130BarCodPar = GXv_char3[0] ;
         ttrn07_impl.this.AV171TipDis = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV171TipDis", AV171TipDis);
      }
      if ( ( AV72F_tinamar == 1 ) && true /* Level */ && true /* After */ && ( GXutil.strcmp(AV36AlbSec, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV171TipDis, "2") != 0 ) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta OS nao es Malha Acabada", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV72F_tinamar == 1 ) && true /* Level */ && true /* After */ && ( GXutil.strcmp(AV36AlbSec, httpContext.getMessage( "S", "")) != 0 ) && ( GXutil.strcmp(AV171TipDis, "2") == 0 ) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta OS es Malha Acabada i la GR es Malha NO Acabada", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(AV158Msg_acc, " ") != 0 ) && true /* After */ && ( AV70F_moda21 == 0 ) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(AV158Msg_acc, 0, GXCCtl);
      }
      if ( true /* After */ && (0==A129BarCod) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Errado", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && true /* After */ )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço com detalhe de peças", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A213BarSit < 9 ) && true /* After */ && isIns( )  && ( AV66F_carvema == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int15[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = AV159Msg_ctrl ;
         new app.pctrlalbn(remoteHandle, context).execute( GXv_char4, GXv_int15, GXv_int6, GXv_char3, GXv_char2) ;
         ttrn07_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn07_impl.this.A129BarCod = GXv_int15[0] ;
         ttrn07_impl.this.A132BarCodReo = GXv_int6[0] ;
         ttrn07_impl.this.A130BarCodPar = GXv_char3[0] ;
         ttrn07_impl.this.AV159Msg_ctrl = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV159Msg_ctrl", AV159Msg_ctrl);
      }
      if ( ( A213BarSit < 9 ) && true /* After */ && ( GXutil.strcmp(AV159Msg_ctrl, " ") != 0 ) && isIns( )  && ( AV66F_carvema == 1 ) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(AV159Msg_ctrl, 0, GXCCtl);
      }
      if ( ( AV66F_carvema == 1 ) && ( GXutil.strcmp(A5034BarEstTip, httpContext.getMessage( "S", "")) == 0 ) && true /* After */ )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atençao. Esta OS tem Debito Condicionado !!!", ""), 0, GXCCtl);
      }
      if ( ( A5027BarGraCob == 2 ) && ( AV66F_carvema == 1 ) && true /* After */ )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atençao. Malha com Cartao Vermelho ¡¡¡", ""), 0, GXCCtl);
      }
      if ( ( A4937BarCtrPdas == 1 ) && ( AV66F_carvema == 1 ) && true /* After */ )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Esta OS tem peças que ramularam a frente¡¡¡", ""), 0, GXCCtl);
      }
      /* Using cursor T01L44 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T01L44_A361DisCod[0] ;
      A1235BarNumCli = T01L44_A1235BarNumCli[0] ;
      A1234BarNomCli = T01L44_A1234BarNomCli[0] ;
      A5034BarEstTip = T01L44_A5034BarEstTip[0] ;
      A5291BarTipCor = T01L44_A5291BarTipCor[0] ;
      A5027BarGraCob = T01L44_A5027BarGraCob[0] ;
      A2010BarTipDis = T01L44_A2010BarTipDis[0] ;
      A4937BarCtrPdas = T01L44_A4937BarCtrPdas[0] ;
      n4937BarCtrPdas = T01L44_n4937BarCtrPdas[0] ;
      A5253BarAcc = T01L44_A5253BarAcc[0] ;
      A148BarEstReo = T01L44_A148BarEstReo[0] ;
      A143BarDisNum = T01L44_A143BarDisNum[0] ;
      A1909BarGraAca = T01L44_A1909BarGraAca[0] ;
      A4812BarEncCli = T01L44_A4812BarEncCli[0] ;
      A1652BarSerDsc = T01L44_A1652BarSerDsc[0] ;
      A218BarTipCol = T01L44_A218BarTipCol[0] ;
      A136BarColNum = T01L44_A136BarColNum[0] ;
      A135BarColNom = T01L44_A135BarColNom[0] ;
      A1503BarPart = T01L44_A1503BarPart[0] ;
      A161BarFecSal = T01L44_A161BarFecSal[0] ;
      A125BarAncAca1 = T01L44_A125BarAncAca1[0] ;
      A213BarSit = T01L44_A213BarSit[0] ;
      A212BarSer = T01L44_A212BarSer[0] ;
      A4466BarAcaAnh = T01L44_A4466BarAcaAnh[0] ;
      A252CliCod = T01L44_A252CliCod[0] ;
      n252CliCod = T01L44_n252CliCod[0] ;
      A217BarTipArt = T01L44_A217BarTipArt[0] ;
      n217BarTipArt = T01L44_n217BarTipArt[0] ;
      pr_default.close(2);
      /* Using cursor T01L47 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A365DisDes = T01L47_A365DisDes[0] ;
      pr_default.close(5);
      if ( isIns( )  && (0==A12233AlbNumcli) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A12233AlbNumcli = A1235BarNumCli ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A12232AlbNomCli)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A12232AlbNomCli = A1234BarNomCli ;
      }
      if ( isIns( )  && (0==A5019AlbHdrgm2) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A5019AlbHdrgm2 = A1909BarGraAca ;
      }
      nIsDirty_195 = (short)(1) ;
      A4815AlbEncCli = ((GXutil.strcmp(A4812BarEncCli, " ")!=0) ? A4812BarEncCli : A143BarDisNum) ;
      if ( isIns( )  && (GXutil.strcmp("", A8879AlbSerD)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A8879AlbSerD = A1652BarSerDsc ;
      }
      if ( isIns( )  && (0==A3394AlbTipCol) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A3394AlbTipCol = A218BarTipCol ;
      }
      if ( isIns( )  && (0==A3393AlbColNum) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A3393AlbColNum = A136BarColNum ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A3392AlbColNom)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A3392AlbColNom = A135BarColNom ;
      }
      if ( isIns( )  && (0==A3271AlbHdrAnc) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A3271AlbHdrAnc = A125BarAncAca1 ;
      }
      if ( ( A213BarSit == 9 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço está fechado", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( A213BarSit == 11 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço está no HISTÓRICO", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A3391AlbSer)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A3391AlbSer = A212BarSer ;
      }
      if ( isIns( )  && (0==A12905AlbCadEnc) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A12905AlbCadEnc = A4466BarAcaAnh ;
      }
      if ( isIns( )  && (0==A3886AlbCliCod) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A3886AlbCliCod = A252CliCod ;
      }
      if ( ( A252CliCod != A1243GuiRemCli ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente errado", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && (0==A12234AlbTipArt) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A12234AlbTipArt = A217BarTipArt ;
      }
      /* Using cursor T01L49 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A1280BarMla = T01L49_A1280BarMla[0] ;
         A1279BarKla = T01L49_A1279BarKla[0] ;
         A1292BarPlz = T01L49_A1292BarPlz[0] ;
      }
      else
      {
         nIsDirty_195 = (short)(1) ;
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         nIsDirty_195 = (short)(1) ;
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
         nIsDirty_195 = (short)(1) ;
         A1292BarPlz = (short)(0) ;
      }
      pr_default.close(6);
      /* Using cursor T01L411 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A898BarPieNDes = T01L411_A898BarPieNDes[0] ;
         A199BarPie1 = T01L411_A199BarPie1[0] ;
      }
      else
      {
         nIsDirty_195 = (short)(1) ;
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         nIsDirty_195 = (short)(1) ;
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      }
      pr_default.close(7);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         nIsDirty_195 = (short)(1) ;
         A198BarPie = A898BarPieNDes ;
      }
      else
      {
         nIsDirty_195 = (short)(1) ;
         A198BarPie = A199BarPie1 ;
      }
      AV108KilAnt = O1261BarAlbKgmE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108KilAnt", GXutil.ltrimstr( AV108KilAnt, 9, 2));
      if ( true /* After */ )
      {
         AV163Msg_k = httpContext.getMessage( httpContext.getMessage( "Os quilos saidos= ", ""), "") + GXutil.str( A1261BarAlbKgmE, 9, 2) + httpContext.getMessage( httpContext.getMessage( ", são maiores do que os quilos da OS= ", ""), "") + GXutil.str( AV38KgsHdr, 9, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV163Msg_k", AV163Msg_k);
      }
      if ( true /* After */ && ( ( AV85FlagEtm == 1 ) || ( AV57CtrQb == 1 ) ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int15[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_decimal14[0] = A1261BarAlbKgmE ;
         GXv_int16[0] = AV173OkMerma ;
         new app.pctrmer(remoteHandle, context).execute( GXv_char4, GXv_int15, GXv_int6, GXv_char3, GXv_decimal14, GXv_int16) ;
         ttrn07_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn07_impl.this.A129BarCod = GXv_int15[0] ;
         ttrn07_impl.this.A132BarCodReo = GXv_int6[0] ;
         ttrn07_impl.this.A130BarCodPar = GXv_char3[0] ;
         ttrn07_impl.this.A1261BarAlbKgmE = GXv_decimal14[0] ;
         ttrn07_impl.this.AV173OkMerma = GXv_int16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV173OkMerma", GXutil.str( AV173OkMerma, 1, 0));
      }
      if ( true /* After */ && ( ( AV85FlagEtm == 1 ) || ( AV57CtrQb == 1 ) ) && ( AV173OkMerma == 0 ) )
      {
         GXCCtl = "BARALBKGME_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. Supera la Quebra", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( ( AV152Moda21 == 1 ) ) && ( DecimalUtil.compareTo(A1261BarAlbKgmE, AV38KgsHdr) > 0 ) && ( AV63errkgs == 1 ) && true /* After */ )
      {
         GXCCtl = "BARALBKGME_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(AV163Msg_k, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( ( AV152Moda21 == 1 ) || ( AV66F_carvema == 1 ) ) && ( DecimalUtil.compareTo(A1261BarAlbKgmE, AV38KgsHdr) > 0 ) && ( AV63errkgs == 0 ) && true /* After */ )
      {
         GXCCtl = "BARALBKGME_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(AV163Msg_k, 0, GXCCtl);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1261BarAlbKgmE)==0) && ( A1262BarPreKgm.doubleValue() == 0 ) && true /* After */ && ( AV186Carvitin == 1 ) )
      {
         GXCCtl = "BARPREKGM_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Não há preço por quilo", ""), 0, GXCCtl);
      }
      if ( isIns( )  && ( AV151Metros.doubleValue() >= 0 ) && ( AV152Moda21 == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A1263BarAlbMtrE = AV151Metros ;
      }
      else
      {
         if ( ( isIns( )  || isUpd( )  ) && ( AV152Moda21 == 1 ) && true /* After */ )
         {
            nIsDirty_195 = (short)(1) ;
            A1263BarAlbMtrE = (((A5019AlbHdrgm2*A3271AlbHdrAnc)>0) ? (A1261BarAlbKgmE.divide(DecimalUtil.doubleToDec((A5019AlbHdrgm2*(A3271AlbHdrAnc/ (double) (100)))), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)) ;
         }
      }
      AV150MetAnt = O1263BarAlbMtrE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV150MetAnt", GXutil.ltrimstr( AV150MetAnt, 9, 2));
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1263BarAlbMtrE)==0) && ( A1264BarPreMtr.doubleValue() == 0 ) && true /* After */ && ( AV186Carvitin == 1 ) )
      {
         GXCCtl = "BARPREMTR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Não há preço por metro", ""), 0, GXCCtl);
      }
      if ( isIns( )  && (0==A1266BarAlbTub) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_195 = (short)(1) ;
         A1266BarAlbTub = A1265BarAlbPie ;
      }
      AV165PieAnt = O1265BarAlbPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV165PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165PieAnt), 6, 0));
      if ( true /* After */ && ( GXutil.strcmp(A1095AlbTipEnt, "*") == 0 ) )
      {
         GXCCtl = "ALBTIPENT_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Incorrecto", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbTipEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! (0==A129BarCod) && true /* After */ && isIns( )  && ! ( GXutil.strcmp(A1095AlbTipEnt, "*") == 0 ) )
      {
         new app.workaroundttrn09popup(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2761AlbBarRec, A12905AlbCadEnc, A7989AlbCald, A3886AlbCliCod, A3392AlbColNom, A3393AlbColNum, A7990AlbDf1, A7991AlbDf2, A7992AlbDf3, A7994AlbDto, A7104AlbEncA, A4815AlbEncCli, A7103AlbEncL, A3271AlbHdrAnc, A5019AlbHdrgm2, A2441AlbHdrObs, A2763AlbHdrUlin, A5354AlbImpMan, A6645AlbMetULi, A7993AlbMqTj, A12232AlbNomCli, A12233AlbNumcli, A6814AlbObsM, A32AlbProEsp, A40AlbProRec, A2839AlbProVal, A3391AlbSer, A8879AlbSerD, A12234AlbTipArt, A3394AlbTipCol, A1095AlbTipEnt, A1458BarAlbBul, A1261BarAlbKgmE, A1263BarAlbMtrE, A1265BarAlbPie, A6467BarAlbPlas, A1461BarAlbPN, A1266BarAlbTub, A12195BarAlbUnd, A2398BarFasExt, A1262BarPreKgm, A1264BarPreMtr, A12196BarPreUnd, A3153CodCod, A1248GuiFasULin, A6466PlasCod, A5051TipAcaCod, A1206TubCod, AV87FlagFas) ;
      }
   }

   public void closeExtendedTableCursors1L4195( )
   {
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable1L4195( )
   {
   }

   public void gxload_148( String A396EmprCod ,
                           short A1206TubCod )
   {
      /* Using cursor T01L434 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1206TubCod) ) )
         {
            GXCCtl = "TUBCOD_" + sGXsfl_35_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TUBOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtTubCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(28) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(28);
   }

   public void gxload_149( String A396EmprCod ,
                           String A3153CodCod )
   {
      /* Using cursor T01L435 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n3153CodCod), A3153CodCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3153CodCod)==0) ) )
         {
            GXCCtl = "CODCOD_" + sGXsfl_35_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtCodCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(29) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(29);
   }

   public void gxload_147( String A396EmprCod ,
                           int A129BarCod ,
                           byte A132BarCodReo ,
                           String A130BarCodPar )
   {
      /* Using cursor T01L436 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(30) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T01L436_A361DisCod[0] ;
      A1235BarNumCli = T01L436_A1235BarNumCli[0] ;
      A1234BarNomCli = T01L436_A1234BarNomCli[0] ;
      A5034BarEstTip = T01L436_A5034BarEstTip[0] ;
      A5291BarTipCor = T01L436_A5291BarTipCor[0] ;
      A5027BarGraCob = T01L436_A5027BarGraCob[0] ;
      A2010BarTipDis = T01L436_A2010BarTipDis[0] ;
      A4937BarCtrPdas = T01L436_A4937BarCtrPdas[0] ;
      n4937BarCtrPdas = T01L436_n4937BarCtrPdas[0] ;
      A5253BarAcc = T01L436_A5253BarAcc[0] ;
      A148BarEstReo = T01L436_A148BarEstReo[0] ;
      A143BarDisNum = T01L436_A143BarDisNum[0] ;
      A1909BarGraAca = T01L436_A1909BarGraAca[0] ;
      A4812BarEncCli = T01L436_A4812BarEncCli[0] ;
      A1652BarSerDsc = T01L436_A1652BarSerDsc[0] ;
      A218BarTipCol = T01L436_A218BarTipCol[0] ;
      A136BarColNum = T01L436_A136BarColNum[0] ;
      A135BarColNom = T01L436_A135BarColNom[0] ;
      A1503BarPart = T01L436_A1503BarPart[0] ;
      A161BarFecSal = T01L436_A161BarFecSal[0] ;
      A125BarAncAca1 = T01L436_A125BarAncAca1[0] ;
      A213BarSit = T01L436_A213BarSit[0] ;
      A212BarSer = T01L436_A212BarSer[0] ;
      A4466BarAcaAnh = T01L436_A4466BarAcaAnh[0] ;
      A252CliCod = T01L436_A252CliCod[0] ;
      n252CliCod = T01L436_n252CliCod[0] ;
      A217BarTipArt = T01L436_A217BarTipArt[0] ;
      n217BarTipArt = T01L436_n217BarTipArt[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1234BarNomCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5034BarEstTip))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5291BarTipCor))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5027BarGraCob, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2010BarTipDis))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4937BarCtrPdas, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5253BarAcc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A143BarDisNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4812BarEncCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1652BarSerDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A161BarFecSal, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(30) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(30);
   }

   public void gxload_150( String A396EmprCod ,
                           int A361DisCod )
   {
      /* Using cursor T01L437 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A365DisDes = T01L437_A365DisDes[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(31) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(31);
   }

   public void gxload_151( String A396EmprCod ,
                           int A129BarCod ,
                           byte A132BarCodReo ,
                           String A130BarCodPar )
   {
      /* Using cursor T01L439 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(32) != 101) )
      {
         A1280BarMla = T01L439_A1280BarMla[0] ;
         A1279BarKla = T01L439_A1279BarKla[0] ;
         A1292BarPlz = T01L439_A1292BarPlz[0] ;
      }
      else
      {
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
         A1292BarPlz = (short)(0) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1292BarPlz, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(32) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(32);
   }

   public void gxload_152( String A396EmprCod ,
                           int A129BarCod ,
                           byte A132BarCodReo ,
                           String A130BarCodPar )
   {
      /* Using cursor T01L441 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(33) != 101) )
      {
         A898BarPieNDes = T01L441_A898BarPieNDes[0] ;
         A199BarPie1 = T01L441_A199BarPie1[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(33) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(33);
   }

   public void getKey1L4195( )
   {
      /* Using cursor T01L442 */
      pr_default.execute(34, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      else
      {
         RcdFound195 = (short)(0) ;
      }
      pr_default.close(34);
   }

   public void getByPrimaryKey1L4195( )
   {
      /* Using cursor T01L43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01L43_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1L4195( 146) ;
         RcdFound195 = (short)(1) ;
         initializeNonKey1L4195( ) ;
         A1266BarAlbTub = T01L43_A1266BarAlbTub[0] ;
         A2839AlbProVal = T01L43_A2839AlbProVal[0] ;
         A3271AlbHdrAnc = T01L43_A3271AlbHdrAnc[0] ;
         A3392AlbColNom = T01L43_A3392AlbColNom[0] ;
         A3393AlbColNum = T01L43_A3393AlbColNum[0] ;
         A3394AlbTipCol = T01L43_A3394AlbTipCol[0] ;
         A3391AlbSer = T01L43_A3391AlbSer[0] ;
         A8879AlbSerD = T01L43_A8879AlbSerD[0] ;
         A3886AlbCliCod = T01L43_A3886AlbCliCod[0] ;
         A12232AlbNomCli = T01L43_A12232AlbNomCli[0] ;
         A12233AlbNumcli = T01L43_A12233AlbNumcli[0] ;
         A12234AlbTipArt = T01L43_A12234AlbTipArt[0] ;
         A5019AlbHdrgm2 = T01L43_A5019AlbHdrgm2[0] ;
         A12905AlbCadEnc = T01L43_A12905AlbCadEnc[0] ;
         A4815AlbEncCli = T01L43_A4815AlbEncCli[0] ;
         A1095AlbTipEnt = T01L43_A1095AlbTipEnt[0] ;
         A1263BarAlbMtrE = T01L43_A1263BarAlbMtrE[0] ;
         A1262BarPreKgm = T01L43_A1262BarPreKgm[0] ;
         A1264BarPreMtr = T01L43_A1264BarPreMtr[0] ;
         A32AlbProEsp = T01L43_A32AlbProEsp[0] ;
         A40AlbProRec = T01L43_A40AlbProRec[0] ;
         A2398BarFasExt = T01L43_A2398BarFasExt[0] ;
         A1261BarAlbKgmE = T01L43_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = T01L43_A1265BarAlbPie[0] ;
         A6466PlasCod = T01L43_A6466PlasCod[0] ;
         n6466PlasCod = T01L43_n6466PlasCod[0] ;
         A6467BarAlbPlas = T01L43_A6467BarAlbPlas[0] ;
         A2441AlbHdrObs = T01L43_A2441AlbHdrObs[0] ;
         A12195BarAlbUnd = T01L43_A12195BarAlbUnd[0] ;
         A12196BarPreUnd = T01L43_A12196BarPreUnd[0] ;
         A6645AlbMetULi = T01L43_A6645AlbMetULi[0] ;
         A1461BarAlbPN = T01L43_A1461BarAlbPN[0] ;
         A7994AlbDto = T01L43_A7994AlbDto[0] ;
         A7993AlbMqTj = T01L43_A7993AlbMqTj[0] ;
         A7992AlbDf3 = T01L43_A7992AlbDf3[0] ;
         A7991AlbDf2 = T01L43_A7991AlbDf2[0] ;
         A7990AlbDf1 = T01L43_A7990AlbDf1[0] ;
         A7989AlbCald = T01L43_A7989AlbCald[0] ;
         A7104AlbEncA = T01L43_A7104AlbEncA[0] ;
         A7103AlbEncL = T01L43_A7103AlbEncL[0] ;
         A6814AlbObsM = T01L43_A6814AlbObsM[0] ;
         A2761AlbBarRec = T01L43_A2761AlbBarRec[0] ;
         A5354AlbImpMan = T01L43_A5354AlbImpMan[0] ;
         A1458BarAlbBul = T01L43_A1458BarAlbBul[0] ;
         A1248GuiFasULin = T01L43_A1248GuiFasULin[0] ;
         A2763AlbHdrUlin = T01L43_A2763AlbHdrUlin[0] ;
         A5051TipAcaCod = T01L43_A5051TipAcaCod[0] ;
         A129BarCod = T01L43_A129BarCod[0] ;
         A132BarCodReo = T01L43_A132BarCodReo[0] ;
         A130BarCodPar = T01L43_A130BarCodPar[0] ;
         A1206TubCod = T01L43_A1206TubCod[0] ;
         n1206TubCod = T01L43_n1206TubCod[0] ;
         A3153CodCod = T01L43_A3153CodCod[0] ;
         n3153CodCod = T01L43_n3153CodCod[0] ;
         O1265BarAlbPie = A1265BarAlbPie ;
         O1263BarAlbMtrE = A1263BarAlbMtrE ;
         O1261BarAlbKgmE = A1261BarAlbKgmE ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1L4195( ) ;
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound195 = (short)(0) ;
         initializeNonKey1L4195( ) ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1L4195( ) ;
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1L4195( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1L4195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01L42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z1266BarAlbTub != T01L42_A1266BarAlbTub[0] ) || ( GXutil.strcmp(Z2839AlbProVal, T01L42_A2839AlbProVal[0]) != 0 ) || ( Z3271AlbHdrAnc != T01L42_A3271AlbHdrAnc[0] ) || ( GXutil.strcmp(Z3392AlbColNom, T01L42_A3392AlbColNom[0]) != 0 ) || ( Z3393AlbColNum != T01L42_A3393AlbColNum[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3394AlbTipCol != T01L42_A3394AlbTipCol[0] ) || ( GXutil.strcmp(Z3391AlbSer, T01L42_A3391AlbSer[0]) != 0 ) || ( GXutil.strcmp(Z8879AlbSerD, T01L42_A8879AlbSerD[0]) != 0 ) || ( Z3886AlbCliCod != T01L42_A3886AlbCliCod[0] ) || ( GXutil.strcmp(Z12232AlbNomCli, T01L42_A12232AlbNomCli[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12233AlbNumcli != T01L42_A12233AlbNumcli[0] ) || ( Z12234AlbTipArt != T01L42_A12234AlbTipArt[0] ) || ( Z5019AlbHdrgm2 != T01L42_A5019AlbHdrgm2[0] ) || ( Z12905AlbCadEnc != T01L42_A12905AlbCadEnc[0] ) || ( GXutil.strcmp(Z4815AlbEncCli, T01L42_A4815AlbEncCli[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1095AlbTipEnt, T01L42_A1095AlbTipEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01L42_A1263BarAlbMtrE[0]) != 0 ) || ( DecimalUtil.compareTo(Z1262BarPreKgm, T01L42_A1262BarPreKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z1264BarPreMtr, T01L42_A1264BarPreMtr[0]) != 0 ) || ( Z32AlbProEsp != T01L42_A32AlbProEsp[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z40AlbProRec, T01L42_A40AlbProRec[0]) != 0 ) || ( GXutil.strcmp(Z2398BarFasExt, T01L42_A2398BarFasExt[0]) != 0 ) || ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01L42_A1261BarAlbKgmE[0]) != 0 ) || ( Z1265BarAlbPie != T01L42_A1265BarAlbPie[0] ) || ( Z6466PlasCod != T01L42_A6466PlasCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6467BarAlbPlas != T01L42_A6467BarAlbPlas[0] ) || ( GXutil.strcmp(Z2441AlbHdrObs, T01L42_A2441AlbHdrObs[0]) != 0 ) || ( Z12195BarAlbUnd != T01L42_A12195BarAlbUnd[0] ) || ( DecimalUtil.compareTo(Z12196BarPreUnd, T01L42_A12196BarPreUnd[0]) != 0 ) || ( Z6645AlbMetULi != T01L42_A6645AlbMetULi[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1461BarAlbPN, T01L42_A1461BarAlbPN[0]) != 0 ) || ( DecimalUtil.compareTo(Z7994AlbDto, T01L42_A7994AlbDto[0]) != 0 ) || ( GXutil.strcmp(Z7993AlbMqTj, T01L42_A7993AlbMqTj[0]) != 0 ) || ( GXutil.strcmp(Z7992AlbDf3, T01L42_A7992AlbDf3[0]) != 0 ) || ( GXutil.strcmp(Z7991AlbDf2, T01L42_A7991AlbDf2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7990AlbDf1, T01L42_A7990AlbDf1[0]) != 0 ) || ( GXutil.strcmp(Z7989AlbCald, T01L42_A7989AlbCald[0]) != 0 ) || ( DecimalUtil.compareTo(Z7104AlbEncA, T01L42_A7104AlbEncA[0]) != 0 ) || ( DecimalUtil.compareTo(Z7103AlbEncL, T01L42_A7103AlbEncL[0]) != 0 ) || ( GXutil.strcmp(Z6814AlbObsM, T01L42_A6814AlbObsM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z2761AlbBarRec, T01L42_A2761AlbBarRec[0]) != 0 ) || ( DecimalUtil.compareTo(Z5354AlbImpMan, T01L42_A5354AlbImpMan[0]) != 0 ) || ( Z1458BarAlbBul != T01L42_A1458BarAlbBul[0] ) || ( Z1248GuiFasULin != T01L42_A1248GuiFasULin[0] ) || ( Z2763AlbHdrUlin != T01L42_A2763AlbHdrUlin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5051TipAcaCod != T01L42_A5051TipAcaCod[0] ) || ( Z1206TubCod != T01L42_A1206TubCod[0] ) || ( GXutil.strcmp(Z3153CodCod, T01L42_A3153CodCod[0]) != 0 ) )
         {
            if ( Z1266BarAlbTub != T01L42_A1266BarAlbTub[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"BarAlbTub");
               GXutil.writeLogRaw("Old: ",Z1266BarAlbTub);
               GXutil.writeLogRaw("Current: ",T01L42_A1266BarAlbTub[0]);
            }
            if ( GXutil.strcmp(Z2839AlbProVal, T01L42_A2839AlbProVal[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbProVal");
               GXutil.writeLogRaw("Old: ",Z2839AlbProVal);
               GXutil.writeLogRaw("Current: ",T01L42_A2839AlbProVal[0]);
            }
            if ( Z3271AlbHdrAnc != T01L42_A3271AlbHdrAnc[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbHdrAnc");
               GXutil.writeLogRaw("Old: ",Z3271AlbHdrAnc);
               GXutil.writeLogRaw("Current: ",T01L42_A3271AlbHdrAnc[0]);
            }
            if ( GXutil.strcmp(Z3392AlbColNom, T01L42_A3392AlbColNom[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbColNom");
               GXutil.writeLogRaw("Old: ",Z3392AlbColNom);
               GXutil.writeLogRaw("Current: ",T01L42_A3392AlbColNom[0]);
            }
            if ( Z3393AlbColNum != T01L42_A3393AlbColNum[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbColNum");
               GXutil.writeLogRaw("Old: ",Z3393AlbColNum);
               GXutil.writeLogRaw("Current: ",T01L42_A3393AlbColNum[0]);
            }
            if ( Z3394AlbTipCol != T01L42_A3394AlbTipCol[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbTipCol");
               GXutil.writeLogRaw("Old: ",Z3394AlbTipCol);
               GXutil.writeLogRaw("Current: ",T01L42_A3394AlbTipCol[0]);
            }
            if ( GXutil.strcmp(Z3391AlbSer, T01L42_A3391AlbSer[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbSer");
               GXutil.writeLogRaw("Old: ",Z3391AlbSer);
               GXutil.writeLogRaw("Current: ",T01L42_A3391AlbSer[0]);
            }
            if ( GXutil.strcmp(Z8879AlbSerD, T01L42_A8879AlbSerD[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbSerD");
               GXutil.writeLogRaw("Old: ",Z8879AlbSerD);
               GXutil.writeLogRaw("Current: ",T01L42_A8879AlbSerD[0]);
            }
            if ( Z3886AlbCliCod != T01L42_A3886AlbCliCod[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbCliCod");
               GXutil.writeLogRaw("Old: ",Z3886AlbCliCod);
               GXutil.writeLogRaw("Current: ",T01L42_A3886AlbCliCod[0]);
            }
            if ( GXutil.strcmp(Z12232AlbNomCli, T01L42_A12232AlbNomCli[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbNomCli");
               GXutil.writeLogRaw("Old: ",Z12232AlbNomCli);
               GXutil.writeLogRaw("Current: ",T01L42_A12232AlbNomCli[0]);
            }
            if ( Z12233AlbNumcli != T01L42_A12233AlbNumcli[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbNumcli");
               GXutil.writeLogRaw("Old: ",Z12233AlbNumcli);
               GXutil.writeLogRaw("Current: ",T01L42_A12233AlbNumcli[0]);
            }
            if ( Z12234AlbTipArt != T01L42_A12234AlbTipArt[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbTipArt");
               GXutil.writeLogRaw("Old: ",Z12234AlbTipArt);
               GXutil.writeLogRaw("Current: ",T01L42_A12234AlbTipArt[0]);
            }
            if ( Z5019AlbHdrgm2 != T01L42_A5019AlbHdrgm2[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbHdrgm2");
               GXutil.writeLogRaw("Old: ",Z5019AlbHdrgm2);
               GXutil.writeLogRaw("Current: ",T01L42_A5019AlbHdrgm2[0]);
            }
            if ( Z12905AlbCadEnc != T01L42_A12905AlbCadEnc[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbCadEnc");
               GXutil.writeLogRaw("Old: ",Z12905AlbCadEnc);
               GXutil.writeLogRaw("Current: ",T01L42_A12905AlbCadEnc[0]);
            }
            if ( GXutil.strcmp(Z4815AlbEncCli, T01L42_A4815AlbEncCli[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbEncCli");
               GXutil.writeLogRaw("Old: ",Z4815AlbEncCli);
               GXutil.writeLogRaw("Current: ",T01L42_A4815AlbEncCli[0]);
            }
            if ( GXutil.strcmp(Z1095AlbTipEnt, T01L42_A1095AlbTipEnt[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbTipEnt");
               GXutil.writeLogRaw("Old: ",Z1095AlbTipEnt);
               GXutil.writeLogRaw("Current: ",T01L42_A1095AlbTipEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01L42_A1263BarAlbMtrE[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"BarAlbMtrE");
               GXutil.writeLogRaw("Old: ",Z1263BarAlbMtrE);
               GXutil.writeLogRaw("Current: ",T01L42_A1263BarAlbMtrE[0]);
            }
            if ( DecimalUtil.compareTo(Z1262BarPreKgm, T01L42_A1262BarPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"BarPreKgm");
               GXutil.writeLogRaw("Old: ",Z1262BarPreKgm);
               GXutil.writeLogRaw("Current: ",T01L42_A1262BarPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z1264BarPreMtr, T01L42_A1264BarPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"BarPreMtr");
               GXutil.writeLogRaw("Old: ",Z1264BarPreMtr);
               GXutil.writeLogRaw("Current: ",T01L42_A1264BarPreMtr[0]);
            }
            if ( Z32AlbProEsp != T01L42_A32AlbProEsp[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbProEsp");
               GXutil.writeLogRaw("Old: ",Z32AlbProEsp);
               GXutil.writeLogRaw("Current: ",T01L42_A32AlbProEsp[0]);
            }
            if ( DecimalUtil.compareTo(Z40AlbProRec, T01L42_A40AlbProRec[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbProRec");
               GXutil.writeLogRaw("Old: ",Z40AlbProRec);
               GXutil.writeLogRaw("Current: ",T01L42_A40AlbProRec[0]);
            }
            if ( GXutil.strcmp(Z2398BarFasExt, T01L42_A2398BarFasExt[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"BarFasExt");
               GXutil.writeLogRaw("Old: ",Z2398BarFasExt);
               GXutil.writeLogRaw("Current: ",T01L42_A2398BarFasExt[0]);
            }
            if ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01L42_A1261BarAlbKgmE[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"BarAlbKgmE");
               GXutil.writeLogRaw("Old: ",Z1261BarAlbKgmE);
               GXutil.writeLogRaw("Current: ",T01L42_A1261BarAlbKgmE[0]);
            }
            if ( Z1265BarAlbPie != T01L42_A1265BarAlbPie[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"BarAlbPie");
               GXutil.writeLogRaw("Old: ",Z1265BarAlbPie);
               GXutil.writeLogRaw("Current: ",T01L42_A1265BarAlbPie[0]);
            }
            if ( Z6466PlasCod != T01L42_A6466PlasCod[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"PlasCod");
               GXutil.writeLogRaw("Old: ",Z6466PlasCod);
               GXutil.writeLogRaw("Current: ",T01L42_A6466PlasCod[0]);
            }
            if ( Z6467BarAlbPlas != T01L42_A6467BarAlbPlas[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"BarAlbPlas");
               GXutil.writeLogRaw("Old: ",Z6467BarAlbPlas);
               GXutil.writeLogRaw("Current: ",T01L42_A6467BarAlbPlas[0]);
            }
            if ( GXutil.strcmp(Z2441AlbHdrObs, T01L42_A2441AlbHdrObs[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbHdrObs");
               GXutil.writeLogRaw("Old: ",Z2441AlbHdrObs);
               GXutil.writeLogRaw("Current: ",T01L42_A2441AlbHdrObs[0]);
            }
            if ( Z12195BarAlbUnd != T01L42_A12195BarAlbUnd[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"BarAlbUnd");
               GXutil.writeLogRaw("Old: ",Z12195BarAlbUnd);
               GXutil.writeLogRaw("Current: ",T01L42_A12195BarAlbUnd[0]);
            }
            if ( DecimalUtil.compareTo(Z12196BarPreUnd, T01L42_A12196BarPreUnd[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"BarPreUnd");
               GXutil.writeLogRaw("Old: ",Z12196BarPreUnd);
               GXutil.writeLogRaw("Current: ",T01L42_A12196BarPreUnd[0]);
            }
            if ( Z6645AlbMetULi != T01L42_A6645AlbMetULi[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbMetULi");
               GXutil.writeLogRaw("Old: ",Z6645AlbMetULi);
               GXutil.writeLogRaw("Current: ",T01L42_A6645AlbMetULi[0]);
            }
            if ( DecimalUtil.compareTo(Z1461BarAlbPN, T01L42_A1461BarAlbPN[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"BarAlbPN");
               GXutil.writeLogRaw("Old: ",Z1461BarAlbPN);
               GXutil.writeLogRaw("Current: ",T01L42_A1461BarAlbPN[0]);
            }
            if ( DecimalUtil.compareTo(Z7994AlbDto, T01L42_A7994AlbDto[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbDto");
               GXutil.writeLogRaw("Old: ",Z7994AlbDto);
               GXutil.writeLogRaw("Current: ",T01L42_A7994AlbDto[0]);
            }
            if ( GXutil.strcmp(Z7993AlbMqTj, T01L42_A7993AlbMqTj[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbMqTj");
               GXutil.writeLogRaw("Old: ",Z7993AlbMqTj);
               GXutil.writeLogRaw("Current: ",T01L42_A7993AlbMqTj[0]);
            }
            if ( GXutil.strcmp(Z7992AlbDf3, T01L42_A7992AlbDf3[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbDf3");
               GXutil.writeLogRaw("Old: ",Z7992AlbDf3);
               GXutil.writeLogRaw("Current: ",T01L42_A7992AlbDf3[0]);
            }
            if ( GXutil.strcmp(Z7991AlbDf2, T01L42_A7991AlbDf2[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbDf2");
               GXutil.writeLogRaw("Old: ",Z7991AlbDf2);
               GXutil.writeLogRaw("Current: ",T01L42_A7991AlbDf2[0]);
            }
            if ( GXutil.strcmp(Z7990AlbDf1, T01L42_A7990AlbDf1[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbDf1");
               GXutil.writeLogRaw("Old: ",Z7990AlbDf1);
               GXutil.writeLogRaw("Current: ",T01L42_A7990AlbDf1[0]);
            }
            if ( GXutil.strcmp(Z7989AlbCald, T01L42_A7989AlbCald[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbCald");
               GXutil.writeLogRaw("Old: ",Z7989AlbCald);
               GXutil.writeLogRaw("Current: ",T01L42_A7989AlbCald[0]);
            }
            if ( DecimalUtil.compareTo(Z7104AlbEncA, T01L42_A7104AlbEncA[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbEncA");
               GXutil.writeLogRaw("Old: ",Z7104AlbEncA);
               GXutil.writeLogRaw("Current: ",T01L42_A7104AlbEncA[0]);
            }
            if ( DecimalUtil.compareTo(Z7103AlbEncL, T01L42_A7103AlbEncL[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbEncL");
               GXutil.writeLogRaw("Old: ",Z7103AlbEncL);
               GXutil.writeLogRaw("Current: ",T01L42_A7103AlbEncL[0]);
            }
            if ( GXutil.strcmp(Z6814AlbObsM, T01L42_A6814AlbObsM[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbObsM");
               GXutil.writeLogRaw("Old: ",Z6814AlbObsM);
               GXutil.writeLogRaw("Current: ",T01L42_A6814AlbObsM[0]);
            }
            if ( DecimalUtil.compareTo(Z2761AlbBarRec, T01L42_A2761AlbBarRec[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbBarRec");
               GXutil.writeLogRaw("Old: ",Z2761AlbBarRec);
               GXutil.writeLogRaw("Current: ",T01L42_A2761AlbBarRec[0]);
            }
            if ( DecimalUtil.compareTo(Z5354AlbImpMan, T01L42_A5354AlbImpMan[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbImpMan");
               GXutil.writeLogRaw("Old: ",Z5354AlbImpMan);
               GXutil.writeLogRaw("Current: ",T01L42_A5354AlbImpMan[0]);
            }
            if ( Z1458BarAlbBul != T01L42_A1458BarAlbBul[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"BarAlbBul");
               GXutil.writeLogRaw("Old: ",Z1458BarAlbBul);
               GXutil.writeLogRaw("Current: ",T01L42_A1458BarAlbBul[0]);
            }
            if ( Z1248GuiFasULin != T01L42_A1248GuiFasULin[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"GuiFasULin");
               GXutil.writeLogRaw("Old: ",Z1248GuiFasULin);
               GXutil.writeLogRaw("Current: ",T01L42_A1248GuiFasULin[0]);
            }
            if ( Z2763AlbHdrUlin != T01L42_A2763AlbHdrUlin[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"AlbHdrUlin");
               GXutil.writeLogRaw("Old: ",Z2763AlbHdrUlin);
               GXutil.writeLogRaw("Current: ",T01L42_A2763AlbHdrUlin[0]);
            }
            if ( Z5051TipAcaCod != T01L42_A5051TipAcaCod[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"TipAcaCod");
               GXutil.writeLogRaw("Old: ",Z5051TipAcaCod);
               GXutil.writeLogRaw("Current: ",T01L42_A5051TipAcaCod[0]);
            }
            if ( Z1206TubCod != T01L42_A1206TubCod[0] )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"TubCod");
               GXutil.writeLogRaw("Old: ",Z1206TubCod);
               GXutil.writeLogRaw("Current: ",T01L42_A1206TubCod[0]);
            }
            if ( GXutil.strcmp(Z3153CodCod, T01L42_A3153CodCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrn07:[seudo value changed for attri]"+"CodCod");
               GXutil.writeLogRaw("Old: ",Z3153CodCod);
               GXutil.writeLogRaw("Current: ",T01L42_A3153CodCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1L4195( )
   {
      beforeValidate1L4195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L4195( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1L4195( 0) ;
         checkOptimisticConcurrency1L4195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L4195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1L4195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L443 */
                  pr_default.execute(35, new Object[] {Long.valueOf(A30AlbProCod), Integer.valueOf(A1266BarAlbTub), A2839AlbProVal, Short.valueOf(A3271AlbHdrAnc), A3392AlbColNom, Integer.valueOf(A3393AlbColNum), Byte.valueOf(A3394AlbTipCol), A3391AlbSer, A8879AlbSerD, Integer.valueOf(A3886AlbCliCod), A12232AlbNomCli, Integer.valueOf(A12233AlbNumcli), Short.valueOf(A12234AlbTipArt), Short.valueOf(A5019AlbHdrgm2), Short.valueOf(A12905AlbCadEnc), A4815AlbEncCli, A1095AlbTipEnt, A1263BarAlbMtrE, A1262BarPreKgm, A1264BarPreMtr, Byte.valueOf(A32AlbProEsp), A40AlbProRec, A2398BarFasExt, A1261BarAlbKgmE, Integer.valueOf(A1265BarAlbPie), Boolean.valueOf(n6466PlasCod), Short.valueOf(A6466PlasCod), Short.valueOf(A6467BarAlbPlas), A2441AlbHdrObs, Integer.valueOf(A12195BarAlbUnd), A12196BarPreUnd, Short.valueOf(A6645AlbMetULi), A1461BarAlbPN, A7994AlbDto, A7993AlbMqTj, A7992AlbDf3, A7991AlbDf2, A7990AlbDf1, A7989AlbCald, A7104AlbEncA, A7103AlbEncL, A6814AlbObsM, A2761AlbBarRec, A5354AlbImpMan, Short.valueOf(A1458BarAlbBul), Short.valueOf(A1248GuiFasULin), Short.valueOf(A2763AlbHdrUlin), Short.valueOf(A5051TipAcaCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod), Boolean.valueOf(n3153CodCod), A3153CodCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(35) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* Level */ && true /* After */ && ( AV87FlagFas == 1 ) )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int17[0] = A30AlbProCod ;
                        GXv_int15[0] = A129BarCod ;
                        GXv_int16[0] = A132BarCodReo ;
                        GXv_char3[0] = A130BarCodPar ;
                        new app.pcopfas(remoteHandle, context).execute( GXv_char4, GXv_int17, GXv_int15, GXv_int16, GXv_char3) ;
                        ttrn07_impl.this.A396EmprCod = GXv_char4[0] ;
                        ttrn07_impl.this.A30AlbProCod = GXv_int17[0] ;
                        ttrn07_impl.this.A129BarCod = GXv_int15[0] ;
                        ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
                        ttrn07_impl.this.A130BarCodPar = GXv_char3[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                     }
                     if ( true /* Level */ && true /* After */ && ( AV87FlagFas == 1 ) && ( AV69F_kgslam == 0 ) )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int17[0] = A30AlbProCod ;
                        GXv_int15[0] = A129BarCod ;
                        GXv_int16[0] = A132BarCodReo ;
                        GXv_char3[0] = A130BarCodPar ;
                        new app.pkilfas(remoteHandle, context).execute( GXv_char4, GXv_int17, GXv_int15, GXv_int16, GXv_char3) ;
                        ttrn07_impl.this.A396EmprCod = GXv_char4[0] ;
                        ttrn07_impl.this.A30AlbProCod = GXv_int17[0] ;
                        ttrn07_impl.this.A129BarCod = GXv_int15[0] ;
                        ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
                        ttrn07_impl.this.A130BarCodPar = GXv_char3[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                     }
                     if ( true /* After */ && true /* Level */ && ( AV87FlagFas == 1 ) && ( AV92FlagPreFas == 1 ) && ( AV66F_carvema == 1 ) )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int17[0] = A30AlbProCod ;
                        GXv_int15[0] = A129BarCod ;
                        GXv_int16[0] = A132BarCodReo ;
                        GXv_char3[0] = A130BarCodPar ;
                        GXv_char2[0] = Gx_mode ;
                        new app.pprevdltguias(remoteHandle, context).execute( GXv_char4, GXv_int17, GXv_int15, GXv_int16, GXv_char3, GXv_char2) ;
                        ttrn07_impl.this.A396EmprCod = GXv_char4[0] ;
                        ttrn07_impl.this.A30AlbProCod = GXv_int17[0] ;
                        ttrn07_impl.this.A129BarCod = GXv_int15[0] ;
                        ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
                        ttrn07_impl.this.A130BarCodPar = GXv_char3[0] ;
                        ttrn07_impl.this.Gx_mode = GXv_char2[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     if ( ( true /* After */ || true /* After */ ) && true /* Level */ && ( AV87FlagFas == 1 ) && ( AV92FlagPreFas == 1 ) && ( AV66F_carvema == 0 ) )
                     {
                        GXCCtl = "BARCOD_" + sGXsfl_35_idx ;
                        httpContext.GX_msglist.addItem(GXutil.format( "TTrn09( Trnmode.Update ,EmprCod ,%1, %2,BarCodReo ,BarCodPar)", GXutil.str( A30AlbProCod, 10, 0), GXutil.str( A129BarCod, 8, 0), "", "", "", "", "", "", ""), 0, GXCCtl);
                     }
                     if ( true /* Level */ && true /* After */ && ( AV61Erfoc == 1 ) )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int17[0] = A30AlbProCod ;
                        GXv_int15[0] = A129BarCod ;
                        GXv_int16[0] = A132BarCodReo ;
                        GXv_char3[0] = A130BarCodPar ;
                        new app.palbrepg(remoteHandle, context).execute( GXv_char4, GXv_int17, GXv_int15, GXv_int16, GXv_char3) ;
                        ttrn07_impl.this.A396EmprCod = GXv_char4[0] ;
                        ttrn07_impl.this.A30AlbProCod = GXv_int17[0] ;
                        ttrn07_impl.this.A129BarCod = GXv_int15[0] ;
                        ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
                        ttrn07_impl.this.A130BarCodPar = GXv_char3[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                     }
                     if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int15[0] = A129BarCod ;
                        GXv_int16[0] = A132BarCodReo ;
                        GXv_char3[0] = A130BarCodPar ;
                        GXv_decimal14[0] = A1261BarAlbKgmE ;
                        GXv_decimal12[0] = A1263BarAlbMtrE ;
                        GXv_int13[0] = A1265BarAlbPie ;
                        GXv_decimal11[0] = AV108KilAnt ;
                        GXv_decimal10[0] = AV150MetAnt ;
                        GXv_int18[0] = AV165PieAnt ;
                        GXv_char2[0] = AV155Modo2 ;
                        GXv_int6[0] = A213BarSit ;
                        GXv_date19[0] = AV35AlbProFch ;
                        GXv_char20[0] = A1095AlbTipEnt ;
                        new app.pactpi1parcialtotal(remoteHandle, context).execute( GXv_char4, GXv_int15, GXv_int16, GXv_char3, GXv_decimal14, GXv_decimal12, GXv_int13, GXv_decimal11, GXv_decimal10, GXv_int18, GXv_char2, GXv_int6, GXv_date19, GXv_char20) ;
                        ttrn07_impl.this.A396EmprCod = GXv_char4[0] ;
                        ttrn07_impl.this.A129BarCod = GXv_int15[0] ;
                        ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
                        ttrn07_impl.this.A130BarCodPar = GXv_char3[0] ;
                        ttrn07_impl.this.A1261BarAlbKgmE = GXv_decimal14[0] ;
                        ttrn07_impl.this.A1263BarAlbMtrE = GXv_decimal12[0] ;
                        ttrn07_impl.this.A1265BarAlbPie = GXv_int13[0] ;
                        ttrn07_impl.this.AV108KilAnt = GXv_decimal11[0] ;
                        ttrn07_impl.this.AV150MetAnt = GXv_decimal10[0] ;
                        ttrn07_impl.this.AV165PieAnt = GXv_int18[0] ;
                        ttrn07_impl.this.AV155Modo2 = GXv_char2[0] ;
                        ttrn07_impl.this.A213BarSit = GXv_int6[0] ;
                        ttrn07_impl.this.AV35AlbProFch = GXv_date19[0] ;
                        ttrn07_impl.this.A1095AlbTipEnt = GXv_char20[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV108KilAnt", GXutil.ltrimstr( AV108KilAnt, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV150MetAnt", GXutil.ltrimstr( AV150MetAnt, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV165PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165PieAnt), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV155Modo2", AV155Modo2);
                        httpContext.ajax_rsp_assign_attri("", false, "AV35AlbProFch", localUtil.format(AV35AlbProFch, "99/99/99"));
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
            load1L4195( ) ;
         }
         endLevel1L4195( ) ;
      }
      closeExtendedTableCursors1L4195( ) ;
   }

   public void update1L4195( )
   {
      beforeValidate1L4195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L4195( ) ;
      }
      if ( ( nIsMod_195 != 0 ) || ( nIsDirty_195 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1L4195( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1L4195( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1L4195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01L444 */
                     pr_default.execute(36, new Object[] {Integer.valueOf(A1266BarAlbTub), A2839AlbProVal, Short.valueOf(A3271AlbHdrAnc), A3392AlbColNom, Integer.valueOf(A3393AlbColNum), Byte.valueOf(A3394AlbTipCol), A3391AlbSer, A8879AlbSerD, Integer.valueOf(A3886AlbCliCod), A12232AlbNomCli, Integer.valueOf(A12233AlbNumcli), Short.valueOf(A12234AlbTipArt), Short.valueOf(A5019AlbHdrgm2), Short.valueOf(A12905AlbCadEnc), A4815AlbEncCli, A1095AlbTipEnt, A1263BarAlbMtrE, A1262BarPreKgm, A1264BarPreMtr, Byte.valueOf(A32AlbProEsp), A40AlbProRec, A2398BarFasExt, A1261BarAlbKgmE, Integer.valueOf(A1265BarAlbPie), Boolean.valueOf(n6466PlasCod), Short.valueOf(A6466PlasCod), Short.valueOf(A6467BarAlbPlas), A2441AlbHdrObs, Integer.valueOf(A12195BarAlbUnd), A12196BarPreUnd, Short.valueOf(A6645AlbMetULi), A1461BarAlbPN, A7994AlbDto, A7993AlbMqTj, A7992AlbDf3, A7991AlbDf2, A7990AlbDf1, A7989AlbCald, A7104AlbEncA, A7103AlbEncL, A6814AlbObsM, A2761AlbBarRec, A5354AlbImpMan, Short.valueOf(A1458BarAlbBul), Short.valueOf(A1248GuiFasULin), Short.valueOf(A2763AlbHdrUlin), Short.valueOf(A5051TipAcaCod), Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod), Boolean.valueOf(n3153CodCod), A3153CodCod, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                     if ( (pr_default.getStatus(36) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1L4195( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( true /* After */ || true /* After */ ) && true /* Level */ && ( AV87FlagFas == 1 ) && ( AV92FlagPreFas == 1 ) && ( AV66F_carvema == 0 ) )
                        {
                           GXCCtl = "BARCOD_" + sGXsfl_35_idx ;
                           httpContext.GX_msglist.addItem(GXutil.format( "TTrn09( Trnmode.Update ,EmprCod ,%1, %2,BarCodReo ,BarCodPar)", GXutil.str( A30AlbProCod, 10, 0), GXutil.str( A129BarCod, 8, 0), "", "", "", "", "", "", ""), 0, GXCCtl);
                        }
                        if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ )
                        {
                           GXv_char20[0] = A396EmprCod ;
                           GXv_int18[0] = A129BarCod ;
                           GXv_int16[0] = A132BarCodReo ;
                           GXv_char4[0] = A130BarCodPar ;
                           GXv_decimal14[0] = A1261BarAlbKgmE ;
                           GXv_decimal12[0] = A1263BarAlbMtrE ;
                           GXv_int15[0] = A1265BarAlbPie ;
                           GXv_decimal11[0] = AV108KilAnt ;
                           GXv_decimal10[0] = AV150MetAnt ;
                           GXv_int13[0] = AV165PieAnt ;
                           GXv_char3[0] = AV155Modo2 ;
                           GXv_int6[0] = A213BarSit ;
                           GXv_date19[0] = AV35AlbProFch ;
                           GXv_char2[0] = A1095AlbTipEnt ;
                           new app.pactpi1parcialtotal(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_decimal14, GXv_decimal12, GXv_int15, GXv_decimal11, GXv_decimal10, GXv_int13, GXv_char3, GXv_int6, GXv_date19, GXv_char2) ;
                           ttrn07_impl.this.A396EmprCod = GXv_char20[0] ;
                           ttrn07_impl.this.A129BarCod = GXv_int18[0] ;
                           ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
                           ttrn07_impl.this.A130BarCodPar = GXv_char4[0] ;
                           ttrn07_impl.this.A1261BarAlbKgmE = GXv_decimal14[0] ;
                           ttrn07_impl.this.A1263BarAlbMtrE = GXv_decimal12[0] ;
                           ttrn07_impl.this.A1265BarAlbPie = GXv_int15[0] ;
                           ttrn07_impl.this.AV108KilAnt = GXv_decimal11[0] ;
                           ttrn07_impl.this.AV150MetAnt = GXv_decimal10[0] ;
                           ttrn07_impl.this.AV165PieAnt = GXv_int13[0] ;
                           ttrn07_impl.this.AV155Modo2 = GXv_char3[0] ;
                           ttrn07_impl.this.A213BarSit = GXv_int6[0] ;
                           ttrn07_impl.this.AV35AlbProFch = GXv_date19[0] ;
                           ttrn07_impl.this.A1095AlbTipEnt = GXv_char2[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV108KilAnt", GXutil.ltrimstr( AV108KilAnt, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "AV150MetAnt", GXutil.ltrimstr( AV150MetAnt, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "AV165PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165PieAnt), 6, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV155Modo2", AV155Modo2);
                           httpContext.ajax_rsp_assign_attri("", false, "AV35AlbProFch", localUtil.format(AV35AlbProFch, "99/99/99"));
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1L4195( ) ;
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
            endLevel1L4195( ) ;
         }
      }
      closeExtendedTableCursors1L4195( ) ;
   }

   public void deferredUpdate1L4195( )
   {
   }

   public void delete1L4195( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1L4195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L4195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1L4195( ) ;
         afterConfirm1L4195( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1L4195( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01L445 */
               pr_default.execute(37, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ )
                  {
                     GXv_char20[0] = A396EmprCod ;
                     GXv_int18[0] = A129BarCod ;
                     GXv_int16[0] = A132BarCodReo ;
                     GXv_char4[0] = A130BarCodPar ;
                     GXv_decimal14[0] = A1261BarAlbKgmE ;
                     GXv_decimal12[0] = A1263BarAlbMtrE ;
                     GXv_int15[0] = A1265BarAlbPie ;
                     GXv_decimal11[0] = AV108KilAnt ;
                     GXv_decimal10[0] = AV150MetAnt ;
                     GXv_int13[0] = AV165PieAnt ;
                     GXv_char3[0] = AV155Modo2 ;
                     GXv_int6[0] = A213BarSit ;
                     GXv_date19[0] = AV35AlbProFch ;
                     GXv_char2[0] = A1095AlbTipEnt ;
                     new app.pactpi1parcialtotal(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_decimal14, GXv_decimal12, GXv_int15, GXv_decimal11, GXv_decimal10, GXv_int13, GXv_char3, GXv_int6, GXv_date19, GXv_char2) ;
                     ttrn07_impl.this.A396EmprCod = GXv_char20[0] ;
                     ttrn07_impl.this.A129BarCod = GXv_int18[0] ;
                     ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
                     ttrn07_impl.this.A130BarCodPar = GXv_char4[0] ;
                     ttrn07_impl.this.A1261BarAlbKgmE = GXv_decimal14[0] ;
                     ttrn07_impl.this.A1263BarAlbMtrE = GXv_decimal12[0] ;
                     ttrn07_impl.this.A1265BarAlbPie = GXv_int15[0] ;
                     ttrn07_impl.this.AV108KilAnt = GXv_decimal11[0] ;
                     ttrn07_impl.this.AV150MetAnt = GXv_decimal10[0] ;
                     ttrn07_impl.this.AV165PieAnt = GXv_int13[0] ;
                     ttrn07_impl.this.AV155Modo2 = GXv_char3[0] ;
                     ttrn07_impl.this.A213BarSit = GXv_int6[0] ;
                     ttrn07_impl.this.AV35AlbProFch = GXv_date19[0] ;
                     ttrn07_impl.this.A1095AlbTipEnt = GXv_char2[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "AV108KilAnt", GXutil.ltrimstr( AV108KilAnt, 9, 2));
                     httpContext.ajax_rsp_assign_attri("", false, "AV150MetAnt", GXutil.ltrimstr( AV150MetAnt, 9, 2));
                     httpContext.ajax_rsp_assign_attri("", false, "AV165PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165PieAnt), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV155Modo2", AV155Modo2);
                     httpContext.ajax_rsp_assign_attri("", false, "AV35AlbProFch", localUtil.format(AV35AlbProFch, "99/99/99"));
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
      sMode195 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1L4195( ) ;
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1L4195( )
   {
      standaloneModal1L4195( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ && true /* After */ && isIns( )  && ( AV186Carvitin == 1 ) )
         {
            GXv_decimal14[0] = A1262BarPreKgm ;
            GXv_decimal12[0] = A1264BarPreMtr ;
            GXv_int16[0] = A32AlbProEsp ;
            GXv_decimal11[0] = A40AlbProRec ;
            GXv_char20[0] = A2398BarFasExt ;
            new app.pbuspre4(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal14, GXv_decimal12, GXv_int16, GXv_decimal11, GXv_char20) ;
            ttrn07_impl.this.A1262BarPreKgm = GXv_decimal14[0] ;
            ttrn07_impl.this.A1264BarPreMtr = GXv_decimal12[0] ;
            ttrn07_impl.this.A32AlbProEsp = GXv_int16[0] ;
            ttrn07_impl.this.A40AlbProRec = GXv_decimal11[0] ;
            ttrn07_impl.this.A2398BarFasExt = GXv_char20[0] ;
         }
         if ( true /* After */ && isIns( )  )
         {
            GXv_decimal14[0] = AV151Metros ;
            GXv_decimal12[0] = A1280BarMla ;
            GXv_decimal11[0] = AV45BarKgm ;
            GXv_decimal10[0] = A1279BarKla ;
            GXv_int18[0] = AV176PzasLan ;
            GXv_int15[0] = A1292BarPlz ;
            new app.pkgsmts(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal14, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_int18, GXv_int15) ;
            ttrn07_impl.this.AV151Metros = GXv_decimal14[0] ;
            ttrn07_impl.this.A1280BarMla = GXv_decimal12[0] ;
            ttrn07_impl.this.AV45BarKgm = GXv_decimal11[0] ;
            ttrn07_impl.this.A1279BarKla = GXv_decimal10[0] ;
            ttrn07_impl.this.AV176PzasLan = GXv_int18[0] ;
            ttrn07_impl.this.A1292BarPlz = (short)((short)(GXv_int15[0])) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV151Metros", GXutil.ltrimstr( AV151Metros, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV45BarKgm", GXutil.ltrimstr( AV45BarKgm, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV176PzasLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV176PzasLan), 6, 0));
         }
         if ( ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && true /* After */ )
         {
            GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço com detalhe de peças", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCodPar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( ( A213BarSit < 9 ) && true /* After */ && isIns( )  && ( AV66F_carvema == 1 ) )
         {
            GXv_char20[0] = A396EmprCod ;
            GXv_int18[0] = A129BarCod ;
            GXv_int16[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_char3[0] = AV159Msg_ctrl ;
            new app.pctrlalbn(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_char3) ;
            ttrn07_impl.this.A396EmprCod = GXv_char20[0] ;
            ttrn07_impl.this.A129BarCod = GXv_int18[0] ;
            ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
            ttrn07_impl.this.A130BarCodPar = GXv_char4[0] ;
            ttrn07_impl.this.AV159Msg_ctrl = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV159Msg_ctrl", AV159Msg_ctrl);
         }
         if ( ( A213BarSit < 9 ) && true /* After */ && ( GXutil.strcmp(AV159Msg_ctrl, " ") != 0 ) && isIns( )  && ( AV66F_carvema == 1 ) )
         {
            GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
            httpContext.GX_msglist.addItem(AV159Msg_ctrl, 0, GXCCtl);
         }
         if ( ( A213BarSit == 9 ) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço está fechado", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( ( A213BarSit == 11 ) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço está no HISTÓRICO", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( ! (0==A129BarCod) && true /* After */ && isIns( )  && ! ( GXutil.strcmp(A1095AlbTipEnt, "*") == 0 ) )
         {
            new app.workaroundttrn09popup(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2761AlbBarRec, A12905AlbCadEnc, A7989AlbCald, A3886AlbCliCod, A3392AlbColNom, A3393AlbColNum, A7990AlbDf1, A7991AlbDf2, A7992AlbDf3, A7994AlbDto, A7104AlbEncA, A4815AlbEncCli, A7103AlbEncL, A3271AlbHdrAnc, A5019AlbHdrgm2, A2441AlbHdrObs, A2763AlbHdrUlin, A5354AlbImpMan, A6645AlbMetULi, A7993AlbMqTj, A12232AlbNomCli, A12233AlbNumcli, A6814AlbObsM, A32AlbProEsp, A40AlbProRec, A2839AlbProVal, A3391AlbSer, A8879AlbSerD, A12234AlbTipArt, A3394AlbTipCol, A1095AlbTipEnt, A1458BarAlbBul, A1261BarAlbKgmE, A1263BarAlbMtrE, A1265BarAlbPie, A6467BarAlbPlas, A1461BarAlbPN, A1266BarAlbTub, A12195BarAlbUnd, A2398BarFasExt, A1262BarPreKgm, A1264BarPreMtr, A12196BarPreUnd, A3153CodCod, A1248GuiFasULin, A6466PlasCod, A5051TipAcaCod, A1206TubCod, AV87FlagFas) ;
         }
         /* Using cursor T01L446 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A361DisCod = T01L446_A361DisCod[0] ;
         A1235BarNumCli = T01L446_A1235BarNumCli[0] ;
         A1234BarNomCli = T01L446_A1234BarNomCli[0] ;
         A5034BarEstTip = T01L446_A5034BarEstTip[0] ;
         A5291BarTipCor = T01L446_A5291BarTipCor[0] ;
         A5027BarGraCob = T01L446_A5027BarGraCob[0] ;
         A2010BarTipDis = T01L446_A2010BarTipDis[0] ;
         A4937BarCtrPdas = T01L446_A4937BarCtrPdas[0] ;
         n4937BarCtrPdas = T01L446_n4937BarCtrPdas[0] ;
         A5253BarAcc = T01L446_A5253BarAcc[0] ;
         A148BarEstReo = T01L446_A148BarEstReo[0] ;
         A143BarDisNum = T01L446_A143BarDisNum[0] ;
         A1909BarGraAca = T01L446_A1909BarGraAca[0] ;
         A4812BarEncCli = T01L446_A4812BarEncCli[0] ;
         A1652BarSerDsc = T01L446_A1652BarSerDsc[0] ;
         A218BarTipCol = T01L446_A218BarTipCol[0] ;
         A136BarColNum = T01L446_A136BarColNum[0] ;
         A135BarColNom = T01L446_A135BarColNom[0] ;
         A1503BarPart = T01L446_A1503BarPart[0] ;
         A161BarFecSal = T01L446_A161BarFecSal[0] ;
         A125BarAncAca1 = T01L446_A125BarAncAca1[0] ;
         A213BarSit = T01L446_A213BarSit[0] ;
         A212BarSer = T01L446_A212BarSer[0] ;
         A4466BarAcaAnh = T01L446_A4466BarAcaAnh[0] ;
         A252CliCod = T01L446_A252CliCod[0] ;
         n252CliCod = T01L446_n252CliCod[0] ;
         A217BarTipArt = T01L446_A217BarTipArt[0] ;
         n217BarTipArt = T01L446_n217BarTipArt[0] ;
         pr_default.close(38);
         /* Using cursor T01L447 */
         pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A365DisDes = T01L447_A365DisDes[0] ;
         pr_default.close(39);
         /* Using cursor T01L449 */
         pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            A1280BarMla = T01L449_A1280BarMla[0] ;
            A1279BarKla = T01L449_A1279BarKla[0] ;
            A1292BarPlz = T01L449_A1292BarPlz[0] ;
         }
         else
         {
            A1280BarMla = DecimalUtil.doubleToDec(0) ;
            A1279BarKla = DecimalUtil.doubleToDec(0) ;
            A1292BarPlz = (short)(0) ;
         }
         pr_default.close(40);
         /* Using cursor T01L451 */
         pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            A898BarPieNDes = T01L451_A898BarPieNDes[0] ;
            A199BarPie1 = T01L451_A199BarPie1[0] ;
         }
         else
         {
            A898BarPieNDes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
            A199BarPie1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         }
         pr_default.close(41);
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV108KilAnt = O1261BarAlbKgmE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108KilAnt", GXutil.ltrimstr( AV108KilAnt, 9, 2));
         if ( true /* After */ )
         {
            AV163Msg_k = httpContext.getMessage( httpContext.getMessage( "Os quilos saidos= ", ""), "") + GXutil.str( A1261BarAlbKgmE, 9, 2) + httpContext.getMessage( httpContext.getMessage( ", são maiores do que os quilos da OS= ", ""), "") + GXutil.str( AV38KgsHdr, 9, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV163Msg_k", AV163Msg_k);
         }
         AV150MetAnt = O1263BarAlbMtrE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV150MetAnt", GXutil.ltrimstr( AV150MetAnt, 9, 2));
         AV165PieAnt = O1265BarAlbPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV165PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165PieAnt), 6, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01L452 */
         pr_default.execute(42, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01L453 */
         pr_default.execute(43, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EDIETI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01L454 */
         pr_default.execute(44, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01L455 */
         pr_default.execute(45, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01L456 */
         pr_default.execute(46, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01L457 */
         pr_default.execute(47, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01L458 */
         pr_default.execute(48, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPCK", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01L459 */
         pr_default.execute(49, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01L460 */
         pr_default.execute(50, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01L461 */
         pr_default.execute(51, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01L462 */
         pr_default.execute(52, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
      }
   }

   public void endLevel1L4195( )
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

   public void scanStart1L4195( )
   {
      /* Scan By routine */
      /* Using cursor T01L463 */
      pr_default.execute(53, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A129BarCod = T01L463_A129BarCod[0] ;
         A132BarCodReo = T01L463_A132BarCodReo[0] ;
         A130BarCodPar = T01L463_A130BarCodPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1L4195( )
   {
      /* Scan next routine */
      pr_default.readNext(53);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A129BarCod = T01L463_A129BarCod[0] ;
         A132BarCodReo = T01L463_A132BarCodReo[0] ;
         A130BarCodPar = T01L463_A130BarCodPar[0] ;
      }
   }

   public void scanEnd1L4195( )
   {
      pr_default.close(53);
   }

   public void afterConfirm1L4195( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && isIns( )  && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) )
      {
         A32AlbProEsp = (byte)(10) ;
      }
      if ( true /* After */ && isIns( )  && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) && ! ( AV186Carvitin == 1 ) )
      {
         A1262BarPreKgm = DecimalUtil.ZERO ;
      }
      if ( true /* After */ && isIns( )  && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) && ! ( AV186Carvitin == 1 ) )
      {
         A1264BarPreMtr = DecimalUtil.ZERO ;
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && ( AV91FlagPorRec == 0 ) && ( AV66F_carvema == 0 ) && ( AV186Carvitin == 0 ) )
      {
         GXv_decimal14[0] = A1262BarPreKgm ;
         GXv_decimal12[0] = A1264BarPreMtr ;
         GXv_int16[0] = A32AlbProEsp ;
         GXv_decimal11[0] = A40AlbProRec ;
         GXv_char20[0] = A2398BarFasExt ;
         new app.pbuspre4(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal14, GXv_decimal12, GXv_int16, GXv_decimal11, GXv_char20) ;
         ttrn07_impl.this.A1262BarPreKgm = GXv_decimal14[0] ;
         ttrn07_impl.this.A1264BarPreMtr = GXv_decimal12[0] ;
         ttrn07_impl.this.A32AlbProEsp = GXv_int16[0] ;
         ttrn07_impl.this.A40AlbProRec = GXv_decimal11[0] ;
         ttrn07_impl.this.A2398BarFasExt = GXv_char20[0] ;
      }
      if ( true /* After */ && isIns( )  && true /* Level */ && ( AV88FlagGv == 0 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int17[0] = A30AlbProCod ;
         GXv_int21[0] = A1458BarAlbBul ;
         new app.pnumbul(remoteHandle, context).execute( GXv_char20, GXv_int17, GXv_int21) ;
         ttrn07_impl.this.A396EmprCod = GXv_char20[0] ;
         ttrn07_impl.this.A30AlbProCod = GXv_int17[0] ;
         ttrn07_impl.this.A1458BarAlbBul = GXv_int21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && ( AV91FlagPorRec == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal14[0] = A1262BarPreKgm ;
         GXv_decimal12[0] = A1264BarPreMtr ;
         GXv_int6[0] = A32AlbProEsp ;
         GXv_decimal11[0] = A40AlbProRec ;
         GXv_decimal10[0] = A2761AlbBarRec ;
         new app.pbusprr(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_decimal14, GXv_decimal12, GXv_int6, GXv_decimal11, GXv_decimal10) ;
         ttrn07_impl.this.A396EmprCod = GXv_char20[0] ;
         ttrn07_impl.this.A129BarCod = GXv_int18[0] ;
         ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
         ttrn07_impl.this.A130BarCodPar = GXv_char4[0] ;
         ttrn07_impl.this.A1262BarPreKgm = GXv_decimal14[0] ;
         ttrn07_impl.this.A1264BarPreMtr = GXv_decimal12[0] ;
         ttrn07_impl.this.A32AlbProEsp = GXv_int6[0] ;
         ttrn07_impl.this.A40AlbProRec = GXv_decimal11[0] ;
         ttrn07_impl.this.A2761AlbBarRec = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && ( AV186Carvitin == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal14[0] = A1262BarPreKgm ;
         GXv_decimal12[0] = A1264BarPreMtr ;
         GXv_int6[0] = A32AlbProEsp ;
         GXv_decimal11[0] = A40AlbProRec ;
         GXv_decimal10[0] = A5354AlbImpMan ;
         new app.pbuspre2(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_decimal14, GXv_decimal12, GXv_int6, GXv_decimal11, GXv_decimal10) ;
         ttrn07_impl.this.A396EmprCod = GXv_char20[0] ;
         ttrn07_impl.this.A129BarCod = GXv_int18[0] ;
         ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
         ttrn07_impl.this.A130BarCodPar = GXv_char4[0] ;
         ttrn07_impl.this.A1262BarPreKgm = GXv_decimal14[0] ;
         ttrn07_impl.this.A1264BarPreMtr = GXv_decimal12[0] ;
         ttrn07_impl.this.A32AlbProEsp = GXv_int6[0] ;
         ttrn07_impl.this.A40AlbProRec = GXv_decimal11[0] ;
         ttrn07_impl.this.A5354AlbImpMan = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && ( AV66F_carvema == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal14[0] = A1262BarPreKgm ;
         GXv_decimal12[0] = A1264BarPreMtr ;
         GXv_int6[0] = A32AlbProEsp ;
         GXv_decimal11[0] = A40AlbProRec ;
         GXv_decimal10[0] = A7994AlbDto ;
         new app.pprecarv(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_decimal14, GXv_decimal12, GXv_int6, GXv_decimal11, GXv_decimal10) ;
         ttrn07_impl.this.A396EmprCod = GXv_char20[0] ;
         ttrn07_impl.this.A129BarCod = GXv_int18[0] ;
         ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
         ttrn07_impl.this.A130BarCodPar = GXv_char4[0] ;
         ttrn07_impl.this.A1262BarPreKgm = GXv_decimal14[0] ;
         ttrn07_impl.this.A1264BarPreMtr = GXv_decimal12[0] ;
         ttrn07_impl.this.A32AlbProEsp = GXv_int6[0] ;
         ttrn07_impl.this.A40AlbProRec = GXv_decimal11[0] ;
         ttrn07_impl.this.A7994AlbDto = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
   }

   public void beforeInsert1L4195( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1L4195( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1L4195( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1L4195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1L4195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1L4195( )
   {
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSer_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbSerD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSerD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSerD_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNom_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNomCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtCodCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbKgmE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgmE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreKgm_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbHdrAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrAnc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbHdrgm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrgm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrgm2_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbMtrE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtrE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreMtr_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPie_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtTubCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTubCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbTub_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbTub_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtPlasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbPlas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbHdrObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrObs_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      cmbAlbProVal.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProVal.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbTipEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipEnt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipArt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbNumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumcli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarNumCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbUnd_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPreUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreUnd_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarEstTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEstTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEstTip_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCliCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbMetULi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMetULi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMetULi_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarFasExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasExt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      chkBarTipCor.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarTipCor.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
      edtBarGraCob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraCob_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarTipDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDis_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbPN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPN_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarCtrPdas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCtrPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCtrPdas_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDto_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbMqTj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMqTj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMqTj_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbDf3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDf3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf3_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbDf2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDf2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf2_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbDf1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDf1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf1_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbCald_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCald_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCald_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbEncA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncA_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbEncL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncL_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbObsM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbObsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbObsM_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbBarRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbBarRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbBarRec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      chkBarAcc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarAcc.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbImpMan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbImpMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbImpMan_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      cmbBarEstReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbBarEstReo.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
      edtBarDisNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarGraAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbEncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarEncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipCol_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPart_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbBul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbBul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbBul_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      chkDisDes.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisDes.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbProRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProRec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbProEsp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEsp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarKla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKla_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarMla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMla_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPlz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPlz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPlz_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarFecSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecSal_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAncAca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca1_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtGuiFasULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasULin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbHdrUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrUlin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAcaAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaAnh_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbCadEnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCadEnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCadEnc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void send_integrity_lvl_hashes1L4195( )
   {
   }

   public void send_integrity_lvl_hashes1L43( )
   {
   }

   public void subsflControlProps_35195( )
   {
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_35_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_35_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_35_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_35_idx ;
      edtAlbSer_Internalname = "ALBSER_"+sGXsfl_35_idx ;
      edtAlbSerD_Internalname = "ALBSERD_"+sGXsfl_35_idx ;
      edtAlbColNom_Internalname = "ALBCOLNOM_"+sGXsfl_35_idx ;
      edtAlbNomCli_Internalname = "ALBNOMCLI_"+sGXsfl_35_idx ;
      edtAlbColNum_Internalname = "ALBCOLNUM_"+sGXsfl_35_idx ;
      edtCodCod_Internalname = "CODCOD_"+sGXsfl_35_idx ;
      edtBarAlbKgmE_Internalname = "BARALBKGME_"+sGXsfl_35_idx ;
      edtBarPreKgm_Internalname = "BARPREKGM_"+sGXsfl_35_idx ;
      edtAlbHdrAnc_Internalname = "ALBHDRANC_"+sGXsfl_35_idx ;
      edtAlbHdrgm2_Internalname = "ALBHDRGM2_"+sGXsfl_35_idx ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE_"+sGXsfl_35_idx ;
      edtBarPreMtr_Internalname = "BARPREMTR_"+sGXsfl_35_idx ;
      edtBarAlbPie_Internalname = "BARALBPIE_"+sGXsfl_35_idx ;
      edtTubCod_Internalname = "TUBCOD_"+sGXsfl_35_idx ;
      edtBarAlbTub_Internalname = "BARALBTUB_"+sGXsfl_35_idx ;
      edtPlasCod_Internalname = "PLASCOD_"+sGXsfl_35_idx ;
      edtBarAlbPlas_Internalname = "BARALBPLAS_"+sGXsfl_35_idx ;
      edtAlbHdrObs_Internalname = "ALBHDROBS_"+sGXsfl_35_idx ;
      cmbAlbProVal.setInternalname( "ALBPROVAL_"+sGXsfl_35_idx );
      edtAlbTipEnt_Internalname = "ALBTIPENT_"+sGXsfl_35_idx ;
      edtAlbTipArt_Internalname = "ALBTIPART_"+sGXsfl_35_idx ;
      edtBarTipArt_Internalname = "BARTIPART_"+sGXsfl_35_idx ;
      edtAlbNumcli_Internalname = "ALBNUMCLI_"+sGXsfl_35_idx ;
      edtBarNumCli_Internalname = "BARNUMCLI_"+sGXsfl_35_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_35_idx ;
      edtBarAlbUnd_Internalname = "BARALBUND_"+sGXsfl_35_idx ;
      edtBarPreUnd_Internalname = "BARPREUND_"+sGXsfl_35_idx ;
      edtBarEstTip_Internalname = "BARESTTIP_"+sGXsfl_35_idx ;
      edtAlbCliCod_Internalname = "ALBCLICOD_"+sGXsfl_35_idx ;
      edtAlbMetULi_Internalname = "ALBMETULI_"+sGXsfl_35_idx ;
      edtBarFasExt_Internalname = "BARFASEXT_"+sGXsfl_35_idx ;
      chkBarTipCor.setInternalname( "BARTIPCOR_"+sGXsfl_35_idx );
      edtBarGraCob_Internalname = "BARGRACOB_"+sGXsfl_35_idx ;
      edtBarTipDis_Internalname = "BARTIPDIS_"+sGXsfl_35_idx ;
      edtBarAlbPN_Internalname = "BARALBPN_"+sGXsfl_35_idx ;
      edtBarCtrPdas_Internalname = "BARCTRPDAS_"+sGXsfl_35_idx ;
      edtAlbDto_Internalname = "ALBDTO_"+sGXsfl_35_idx ;
      edtAlbMqTj_Internalname = "ALBMQTJ_"+sGXsfl_35_idx ;
      edtAlbDf3_Internalname = "ALBDF3_"+sGXsfl_35_idx ;
      edtAlbDf2_Internalname = "ALBDF2_"+sGXsfl_35_idx ;
      edtAlbDf1_Internalname = "ALBDF1_"+sGXsfl_35_idx ;
      edtAlbCald_Internalname = "ALBCALD_"+sGXsfl_35_idx ;
      edtAlbEncA_Internalname = "ALBENCA_"+sGXsfl_35_idx ;
      edtAlbEncL_Internalname = "ALBENCL_"+sGXsfl_35_idx ;
      edtAlbObsM_Internalname = "ALBOBSM_"+sGXsfl_35_idx ;
      edtAlbBarRec_Internalname = "ALBBARREC_"+sGXsfl_35_idx ;
      chkBarAcc.setInternalname( "BARACC_"+sGXsfl_35_idx );
      edtAlbImpMan_Internalname = "ALBIMPMAN_"+sGXsfl_35_idx ;
      cmbBarEstReo.setInternalname( "BARESTREO_"+sGXsfl_35_idx );
      edtBarDisNum_Internalname = "BARDISNUM_"+sGXsfl_35_idx ;
      edtBarGraAca_Internalname = "BARGRAACA_"+sGXsfl_35_idx ;
      edtAlbEncCli_Internalname = "ALBENCCLI_"+sGXsfl_35_idx ;
      edtBarEncCli_Internalname = "BARENCCLI_"+sGXsfl_35_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_35_idx ;
      edtBarTipCol_Internalname = "BARTIPCOL_"+sGXsfl_35_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_35_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_35_idx ;
      edtAlbTipCol_Internalname = "ALBTIPCOL_"+sGXsfl_35_idx ;
      edtBarPart_Internalname = "BARPART_"+sGXsfl_35_idx ;
      edtBarAlbBul_Internalname = "BARALBBUL_"+sGXsfl_35_idx ;
      chkDisDes.setInternalname( "DISDES_"+sGXsfl_35_idx );
      edtAlbProRec_Internalname = "ALBPROREC_"+sGXsfl_35_idx ;
      edtAlbProEsp_Internalname = "ALBPROESP_"+sGXsfl_35_idx ;
      edtBarKla_Internalname = "BARKLA_"+sGXsfl_35_idx ;
      edtBarMla_Internalname = "BARMLA_"+sGXsfl_35_idx ;
      edtBarPlz_Internalname = "BARPLZ_"+sGXsfl_35_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_35_idx ;
      edtBarFecSal_Internalname = "BARFECSAL_"+sGXsfl_35_idx ;
      edtBarAncAca1_Internalname = "BARANCACA1_"+sGXsfl_35_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_35_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_35_idx ;
      edtGuiFasULin_Internalname = "GUIFASULIN_"+sGXsfl_35_idx ;
      edtAlbHdrUlin_Internalname = "ALBHDRULIN_"+sGXsfl_35_idx ;
      edtBarAcaAnh_Internalname = "BARACAANH_"+sGXsfl_35_idx ;
      edtAlbCadEnc_Internalname = "ALBCADENC_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_35195( )
   {
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_35_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_35_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_35_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_35_fel_idx ;
      edtAlbSer_Internalname = "ALBSER_"+sGXsfl_35_fel_idx ;
      edtAlbSerD_Internalname = "ALBSERD_"+sGXsfl_35_fel_idx ;
      edtAlbColNom_Internalname = "ALBCOLNOM_"+sGXsfl_35_fel_idx ;
      edtAlbNomCli_Internalname = "ALBNOMCLI_"+sGXsfl_35_fel_idx ;
      edtAlbColNum_Internalname = "ALBCOLNUM_"+sGXsfl_35_fel_idx ;
      edtCodCod_Internalname = "CODCOD_"+sGXsfl_35_fel_idx ;
      edtBarAlbKgmE_Internalname = "BARALBKGME_"+sGXsfl_35_fel_idx ;
      edtBarPreKgm_Internalname = "BARPREKGM_"+sGXsfl_35_fel_idx ;
      edtAlbHdrAnc_Internalname = "ALBHDRANC_"+sGXsfl_35_fel_idx ;
      edtAlbHdrgm2_Internalname = "ALBHDRGM2_"+sGXsfl_35_fel_idx ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE_"+sGXsfl_35_fel_idx ;
      edtBarPreMtr_Internalname = "BARPREMTR_"+sGXsfl_35_fel_idx ;
      edtBarAlbPie_Internalname = "BARALBPIE_"+sGXsfl_35_fel_idx ;
      edtTubCod_Internalname = "TUBCOD_"+sGXsfl_35_fel_idx ;
      edtBarAlbTub_Internalname = "BARALBTUB_"+sGXsfl_35_fel_idx ;
      edtPlasCod_Internalname = "PLASCOD_"+sGXsfl_35_fel_idx ;
      edtBarAlbPlas_Internalname = "BARALBPLAS_"+sGXsfl_35_fel_idx ;
      edtAlbHdrObs_Internalname = "ALBHDROBS_"+sGXsfl_35_fel_idx ;
      cmbAlbProVal.setInternalname( "ALBPROVAL_"+sGXsfl_35_fel_idx );
      edtAlbTipEnt_Internalname = "ALBTIPENT_"+sGXsfl_35_fel_idx ;
      edtAlbTipArt_Internalname = "ALBTIPART_"+sGXsfl_35_fel_idx ;
      edtBarTipArt_Internalname = "BARTIPART_"+sGXsfl_35_fel_idx ;
      edtAlbNumcli_Internalname = "ALBNUMCLI_"+sGXsfl_35_fel_idx ;
      edtBarNumCli_Internalname = "BARNUMCLI_"+sGXsfl_35_fel_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_35_fel_idx ;
      edtBarAlbUnd_Internalname = "BARALBUND_"+sGXsfl_35_fel_idx ;
      edtBarPreUnd_Internalname = "BARPREUND_"+sGXsfl_35_fel_idx ;
      edtBarEstTip_Internalname = "BARESTTIP_"+sGXsfl_35_fel_idx ;
      edtAlbCliCod_Internalname = "ALBCLICOD_"+sGXsfl_35_fel_idx ;
      edtAlbMetULi_Internalname = "ALBMETULI_"+sGXsfl_35_fel_idx ;
      edtBarFasExt_Internalname = "BARFASEXT_"+sGXsfl_35_fel_idx ;
      chkBarTipCor.setInternalname( "BARTIPCOR_"+sGXsfl_35_fel_idx );
      edtBarGraCob_Internalname = "BARGRACOB_"+sGXsfl_35_fel_idx ;
      edtBarTipDis_Internalname = "BARTIPDIS_"+sGXsfl_35_fel_idx ;
      edtBarAlbPN_Internalname = "BARALBPN_"+sGXsfl_35_fel_idx ;
      edtBarCtrPdas_Internalname = "BARCTRPDAS_"+sGXsfl_35_fel_idx ;
      edtAlbDto_Internalname = "ALBDTO_"+sGXsfl_35_fel_idx ;
      edtAlbMqTj_Internalname = "ALBMQTJ_"+sGXsfl_35_fel_idx ;
      edtAlbDf3_Internalname = "ALBDF3_"+sGXsfl_35_fel_idx ;
      edtAlbDf2_Internalname = "ALBDF2_"+sGXsfl_35_fel_idx ;
      edtAlbDf1_Internalname = "ALBDF1_"+sGXsfl_35_fel_idx ;
      edtAlbCald_Internalname = "ALBCALD_"+sGXsfl_35_fel_idx ;
      edtAlbEncA_Internalname = "ALBENCA_"+sGXsfl_35_fel_idx ;
      edtAlbEncL_Internalname = "ALBENCL_"+sGXsfl_35_fel_idx ;
      edtAlbObsM_Internalname = "ALBOBSM_"+sGXsfl_35_fel_idx ;
      edtAlbBarRec_Internalname = "ALBBARREC_"+sGXsfl_35_fel_idx ;
      chkBarAcc.setInternalname( "BARACC_"+sGXsfl_35_fel_idx );
      edtAlbImpMan_Internalname = "ALBIMPMAN_"+sGXsfl_35_fel_idx ;
      cmbBarEstReo.setInternalname( "BARESTREO_"+sGXsfl_35_fel_idx );
      edtBarDisNum_Internalname = "BARDISNUM_"+sGXsfl_35_fel_idx ;
      edtBarGraAca_Internalname = "BARGRAACA_"+sGXsfl_35_fel_idx ;
      edtAlbEncCli_Internalname = "ALBENCCLI_"+sGXsfl_35_fel_idx ;
      edtBarEncCli_Internalname = "BARENCCLI_"+sGXsfl_35_fel_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_35_fel_idx ;
      edtBarTipCol_Internalname = "BARTIPCOL_"+sGXsfl_35_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_35_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_35_fel_idx ;
      edtAlbTipCol_Internalname = "ALBTIPCOL_"+sGXsfl_35_fel_idx ;
      edtBarPart_Internalname = "BARPART_"+sGXsfl_35_fel_idx ;
      edtBarAlbBul_Internalname = "BARALBBUL_"+sGXsfl_35_fel_idx ;
      chkDisDes.setInternalname( "DISDES_"+sGXsfl_35_fel_idx );
      edtAlbProRec_Internalname = "ALBPROREC_"+sGXsfl_35_fel_idx ;
      edtAlbProEsp_Internalname = "ALBPROESP_"+sGXsfl_35_fel_idx ;
      edtBarKla_Internalname = "BARKLA_"+sGXsfl_35_fel_idx ;
      edtBarMla_Internalname = "BARMLA_"+sGXsfl_35_fel_idx ;
      edtBarPlz_Internalname = "BARPLZ_"+sGXsfl_35_fel_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_35_fel_idx ;
      edtBarFecSal_Internalname = "BARFECSAL_"+sGXsfl_35_fel_idx ;
      edtBarAncAca1_Internalname = "BARANCACA1_"+sGXsfl_35_fel_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_35_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_35_fel_idx ;
      edtGuiFasULin_Internalname = "GUIFASULIN_"+sGXsfl_35_fel_idx ;
      edtAlbHdrUlin_Internalname = "ALBHDRULIN_"+sGXsfl_35_fel_idx ;
      edtBarAcaAnh_Internalname = "BARACAANH_"+sGXsfl_35_fel_idx ;
      edtAlbCadEnc_Internalname = "ALBCADENC_"+sGXsfl_35_fel_idx ;
   }

   public void addRow1L4195( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_35195( ) ;
      sendRow1L4195( ) ;
   }

   public void sendRow1L4195( )
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
         if ( ((int)((nGXsfl_35_idx) % (2))) == 0 )
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
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarCodReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarCodPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSer_Internalname,GXutil.rtrim( A3391AlbSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSerD_Internalname,GXutil.rtrim( A8879AlbSerD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbSerD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbSerD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNom_Internalname,GXutil.rtrim( A3392AlbColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbColNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbNomCli_Internalname,GXutil.rtrim( A12232AlbNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbNomCli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbColNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCodCod_Internalname,GXutil.rtrim( A3153CodCod),GXutil.rtrim( localUtil.format( A3153CodCod, "XXXXXX")),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCodCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtCodCod_Visible),Integer.valueOf(edtCodCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgmE_Internalname,GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAlbKgmE_Enabled!=0) ? localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgmE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAlbKgmE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPreKgm_Enabled!=0) ? localUtil.format( A1262BarPreKgm, "ZZZZZZ9.999") : localUtil.format( A1262BarPreKgm, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarPreKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdrAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3271AlbHdrAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3271AlbHdrAnc), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdrAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrgm2_Internalname,GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdrgm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5019AlbHdrgm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5019AlbHdrgm2), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrgm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdrgm2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMtrE_Internalname,GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAlbMtrE_Enabled!=0) ? localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMtrE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAlbMtrE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPreMtr_Enabled!=0) ? localUtil.format( A1264BarPreMtr, "ZZZZZZ9.999") : localUtil.format( A1264BarPreMtr, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarPreMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAlbPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAlbPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTubCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTubCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1206TubCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1206TubCod), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTubCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTubCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbTub_Internalname,GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAlbTub_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbTub_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarAlbTub_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlasCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6466PlasCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6466PlasCod), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtPlasCod_Visible),Integer.valueOf(edtPlasCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPlas_Internalname,GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAlbPlas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6467BarAlbPlas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6467BarAlbPlas), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPlas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtBarAlbPlas_Visible),Integer.valueOf(edtBarAlbPlas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrObs_Internalname,GXutil.rtrim( A2441AlbHdrObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdrObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      GXCCtl = "ALBPROVAL_" + sGXsfl_35_idx ;
      cmbAlbProVal.setName( GXCCtl );
      cmbAlbProVal.setWebtags( "" );
      cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A2839AlbProVal)==0) )
         {
            A2839AlbProVal = httpContext.getMessage( "S", "") ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProVal,cmbAlbProVal.getInternalname(),GXutil.rtrim( A2839AlbProVal),Integer.valueOf(1),cmbAlbProVal.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbAlbProVal.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), !bGXsfl_35_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTipEnt_Internalname,GXutil.rtrim( A1095AlbTipEnt),GXutil.rtrim( localUtil.format( A1095AlbTipEnt, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbTipEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbTipEnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A12234AlbTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12234AlbTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12234AlbTipArt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbTipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbTipArt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarTipArt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbNumcli_Internalname,GXutil.ltrim( localUtil.ntoc( A12233AlbNumcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbNumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12233AlbNumcli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12233AlbNumcli), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbNumcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbNumcli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarNumCli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarNomCli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbUnd_Internalname,GXutil.ltrim( localUtil.ntoc( A12195BarAlbUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAlbUnd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12195BarAlbUnd), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12195BarAlbUnd), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAlbUnd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPreUnd_Internalname,GXutil.ltrim( localUtil.ntoc( A12196BarPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPreUnd_Enabled!=0) ? localUtil.format( A12196BarPreUnd, "ZZZZZZ9.99999") : localUtil.format( A12196BarPreUnd, "ZZZZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPreUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarPreUnd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEstTip_Internalname,GXutil.rtrim( A5034BarEstTip),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEstTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarEstTip_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A3886AlbCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3886AlbCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3886AlbCliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbMetULi_Internalname,GXutil.ltrim( localUtil.ntoc( A6645AlbMetULi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbMetULi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6645AlbMetULi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6645AlbMetULi), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbMetULi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbMetULi_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasExt_Internalname,GXutil.rtrim( A2398BarFasExt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarFasExt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "BARTIPCOR_" + sGXsfl_35_idx ;
      chkBarTipCor.setName( GXCCtl );
      chkBarTipCor.setWebtags( "" );
      chkBarTipCor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "TitleCaption", chkBarTipCor.getCaption(), !bGXsfl_35_Refreshing);
      chkBarTipCor.setCheckedValue( "NO" );
      A5291BarTipCor = ((GXutil.strcmp(GXutil.rtrim( A5291BarTipCor), "SI")==0) ? "SI" : "NO") ;
      Gridlevel_level1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkBarTipCor.getInternalname(),A5291BarTipCor,"","",Integer.valueOf(0),Integer.valueOf(chkBarTipCor.getEnabled()),"SI","",StyleString,ClassString,"TrnColumn","",""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarGraCob_Internalname,GXutil.ltrim( localUtil.ntoc( A5027BarGraCob, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarGraCob_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5027BarGraCob), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5027BarGraCob), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarGraCob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarGraCob_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipDis_Internalname,GXutil.rtrim( A2010BarTipDis),GXutil.rtrim( localUtil.format( A2010BarTipDis, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarTipDis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPN_Internalname,GXutil.ltrim( localUtil.ntoc( A1461BarAlbPN, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAlbPN_Enabled!=0) ? localUtil.format( A1461BarAlbPN, "ZZZZZ9.99") : localUtil.format( A1461BarAlbPN, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAlbPN_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCtrPdas_Internalname,GXutil.ltrim( localUtil.ntoc( A4937BarCtrPdas, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCtrPdas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4937BarCtrPdas), "9") : localUtil.format( DecimalUtil.doubleToDec(A4937BarCtrPdas), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCtrPdas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarCtrPdas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbDto_Internalname,GXutil.ltrim( localUtil.ntoc( A7994AlbDto, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbDto_Enabled!=0) ? localUtil.format( A7994AlbDto, "Z9.999") : localUtil.format( A7994AlbDto, "Z9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbDto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbDto_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbMqTj_Internalname,GXutil.rtrim( A7993AlbMqTj),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbMqTj_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbMqTj_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbDf3_Internalname,GXutil.rtrim( A7992AlbDf3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbDf3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbDf3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbDf2_Internalname,GXutil.rtrim( A7991AlbDf2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbDf2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbDf2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbDf1_Internalname,GXutil.rtrim( A7990AlbDf1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbDf1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbDf1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbCald_Internalname,GXutil.rtrim( A7989AlbCald),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbCald_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbCald_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbEncA_Internalname,GXutil.ltrim( localUtil.ntoc( A7104AlbEncA, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbEncA_Enabled!=0) ? localUtil.format( A7104AlbEncA, "ZZZ9.99") : localUtil.format( A7104AlbEncA, "ZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbEncA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbEncA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbEncL_Internalname,GXutil.ltrim( localUtil.ntoc( A7103AlbEncL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbEncL_Enabled!=0) ? localUtil.format( A7103AlbEncL, "ZZZ9.99") : localUtil.format( A7103AlbEncL, "ZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbEncL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbEncL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbObsM_Internalname,A6814AlbObsM,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbObsM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbObsM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbBarRec_Internalname,GXutil.ltrim( localUtil.ntoc( A2761AlbBarRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbBarRec_Enabled!=0) ? localUtil.format( A2761AlbBarRec, "ZZ9.99") : localUtil.format( A2761AlbBarRec, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbBarRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbBarRec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "BARACC_" + sGXsfl_35_idx ;
      chkBarAcc.setName( GXCCtl );
      chkBarAcc.setWebtags( "" );
      chkBarAcc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "TitleCaption", chkBarAcc.getCaption(), !bGXsfl_35_Refreshing);
      chkBarAcc.setCheckedValue( "N" );
      A5253BarAcc = ((GXutil.strcmp(GXutil.rtrim( A5253BarAcc), "S")==0) ? "S" : "N") ;
      Gridlevel_level1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkBarAcc.getInternalname(),A5253BarAcc,"","",Integer.valueOf(0),Integer.valueOf(chkBarAcc.getEnabled()),"S","",StyleString,ClassString,"TrnColumn","",""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbImpMan_Internalname,GXutil.ltrim( localUtil.ntoc( A5354AlbImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbImpMan_Enabled!=0) ? localUtil.format( A5354AlbImpMan, "ZZZZZZZ9.99") : localUtil.format( A5354AlbImpMan, "ZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbImpMan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbImpMan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "BARESTREO_" + sGXsfl_35_idx ;
      cmbBarEstReo.setName( GXCCtl );
      cmbBarEstReo.setWebtags( "" );
      cmbBarEstReo.addItem("0", httpContext.getMessage( "Normal", ""), (short)(0));
      cmbBarEstReo.addItem("1", httpContext.getMessage( "No Conformidad", ""), (short)(0));
      cmbBarEstReo.addItem("2", httpContext.getMessage( "Reclamacion", ""), (short)(0));
      if ( cmbBarEstReo.getItemCount() > 0 )
      {
         A148BarEstReo = (byte)(GXutil.lval( cmbBarEstReo.getValidValue(GXutil.trim( GXutil.str( A148BarEstReo, 1, 0))))) ;
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbBarEstReo,cmbBarEstReo.getInternalname(),GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)),Integer.valueOf(1),cmbBarEstReo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(cmbBarEstReo.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbBarEstReo.setValue( GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Values", cmbBarEstReo.ToJavascriptSource(), !bGXsfl_35_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDisNum_Internalname,GXutil.rtrim( A143BarDisNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDisNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarDisNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarGraAca_Internalname,GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarGraAca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarGraAca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarGraAca_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbEncCli_Internalname,GXutil.rtrim( A4815AlbEncCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbEncCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbEncCli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEncCli_Internalname,GXutil.rtrim( A4812BarEncCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEncCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarEncCli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarSerDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarTipCol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarColNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarColNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3394AlbTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3394AlbTipCol), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbTipCol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPart_Internalname,GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1503BarPart), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1503BarPart), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarPart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbBul_Internalname,GXutil.ltrim( localUtil.ntoc( A1458BarAlbBul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAlbBul_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1458BarAlbBul), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1458BarAlbBul), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbBul_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAlbBul_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "DISDES_" + sGXsfl_35_idx ;
      chkDisDes.setName( GXCCtl );
      chkDisDes.setWebtags( "" );
      chkDisDes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), !bGXsfl_35_Refreshing);
      chkDisDes.setCheckedValue( "N" );
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      Gridlevel_level1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkDisDes.getInternalname(),A365DisDes,"","",Integer.valueOf(0),Integer.valueOf(chkDisDes.getEnabled()),"S","",StyleString,ClassString,"TrnColumn","",""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProRec_Internalname,GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbProRec_Enabled!=0) ? localUtil.format( A40AlbProRec, "ZZZZZZ9.99") : localUtil.format( A40AlbProRec, "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbProRec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProEsp_Internalname,GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbProEsp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A32AlbProEsp), "99") : localUtil.format( DecimalUtil.doubleToDec(A32AlbProEsp), "99")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProEsp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbProEsp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKla_Internalname,GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarKla_Enabled!=0) ? localUtil.format( A1279BarKla, "ZZZZZ9.99") : localUtil.format( A1279BarKla, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarKla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMla_Internalname,GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarMla_Enabled!=0) ? localUtil.format( A1280BarMla, "ZZZZZ9.99") : localUtil.format( A1280BarMla, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarMla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPlz_Internalname,GXutil.ltrim( localUtil.ntoc( A1292BarPlz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPlz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1292BarPlz), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1292BarPlz), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPlz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarPlz_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPie_Internalname,GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecSal_Internalname,localUtil.format(A161BarFecSal, "99/99/99"),localUtil.format( A161BarFecSal, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarFecSal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAncAca1_Internalname,GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAncAca1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAncAca1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAncAca1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarSit_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasULin_Internalname,GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGuiFasULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1248GuiFasULin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1248GuiFasULin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasULin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtGuiFasULin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrUlin_Internalname,GXutil.ltrim( localUtil.ntoc( A2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdrUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2763AlbHdrUlin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2763AlbHdrUlin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrUlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbHdrUlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAcaAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAcaAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4466BarAcaAnh), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4466BarAcaAnh), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAcaAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBarAcaAnh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbCadEnc_Internalname,GXutil.ltrim( localUtil.ntoc( A12905AlbCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbCadEnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12905AlbCadEnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12905AlbCadEnc), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbCadEnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbCadEnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1L4195( ) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z132BarCodReo_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z130BarCodPar_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z130BarCodPar));
      GXCCtl = "Z1266BarAlbTub_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2839AlbProVal_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2839AlbProVal));
      GXCCtl = "Z3271AlbHdrAnc_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3392AlbColNom_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3392AlbColNom));
      GXCCtl = "Z3393AlbColNum_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3394AlbTipCol_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3394AlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3391AlbSer_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3391AlbSer));
      GXCCtl = "Z8879AlbSerD_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8879AlbSerD));
      GXCCtl = "Z3886AlbCliCod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3886AlbCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12232AlbNomCli_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12232AlbNomCli));
      GXCCtl = "Z12233AlbNumcli_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12233AlbNumcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12234AlbTipArt_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12234AlbTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5019AlbHdrgm2_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12905AlbCadEnc_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12905AlbCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4815AlbEncCli_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4815AlbEncCli));
      GXCCtl = "Z1095AlbTipEnt_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1095AlbTipEnt));
      GXCCtl = "Z1263BarAlbMtrE_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1262BarPreKgm_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1264BarPreMtr_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z32AlbProEsp_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z40AlbProRec_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2398BarFasExt_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2398BarFasExt));
      GXCCtl = "Z1261BarAlbKgmE_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1265BarAlbPie_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6466PlasCod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6467BarAlbPlas_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2441AlbHdrObs_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2441AlbHdrObs));
      GXCCtl = "Z12195BarAlbUnd_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12195BarAlbUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12196BarPreUnd_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12196BarPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6645AlbMetULi_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6645AlbMetULi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1461BarAlbPN_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1461BarAlbPN, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7994AlbDto_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7994AlbDto, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7993AlbMqTj_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7993AlbMqTj));
      GXCCtl = "Z7992AlbDf3_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7992AlbDf3));
      GXCCtl = "Z7991AlbDf2_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7991AlbDf2));
      GXCCtl = "Z7990AlbDf1_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7990AlbDf1));
      GXCCtl = "Z7989AlbCald_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7989AlbCald));
      GXCCtl = "Z7104AlbEncA_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7104AlbEncA, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7103AlbEncL_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7103AlbEncL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6814AlbObsM_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z6814AlbObsM);
      GXCCtl = "Z2761AlbBarRec_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2761AlbBarRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5354AlbImpMan_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5354AlbImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1458BarAlbBul_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1458BarAlbBul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1248GuiFasULin_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2763AlbHdrUlin_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5051TipAcaCod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5051TipAcaCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1206TubCod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3153CodCod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3153CodCod));
      GXCCtl = "O1265BarAlbPie_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1263BarAlbMtrE_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1261BarAlbKgmE_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_195_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_195_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_195_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_35_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV191TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV191TrnContext);
      }
      GXCCtl = "vNOMBREPARAMETRO_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV212NombreParametro);
      GXCCtl = "EMPRCOD_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vREFRESCAR_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_boolean_hidden_field( httpContext, GXCCtl, AV211Refrescar);
      GXCCtl = "vOBJETOREFRESCAR_" + sGXsfl_35_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV206ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV206ObjetoRefrescar);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV198EmprCod));
      GXCCtl = "vALBPROCOD_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV199AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "MODO2_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV155Modo2));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBSER_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBSERD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbSerD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOLNOM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBNOMCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbNomCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOLNUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODCOD_"+sGXsfl_35_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtCodCod_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBKGME_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgmE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPREKGM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRANC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRGM2_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrgm2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBMTRE_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtrE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPREMTR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBPIE_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TUBCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTubCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBTUB_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbTub_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLASCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLASCOD_"+sGXsfl_35_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBPLAS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBPLAS_"+sGXsfl_35_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDROBS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROVAL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProVal.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTIPENT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTipEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTIPART_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTipArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPART_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBNUMCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbNumcli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNOMCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBUND_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPREUND_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARESTTIP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEstTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCLICOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMETULI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbMetULi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEXT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasExt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPCOR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkBarTipCor.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARGRACOB_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGraCob_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPDIS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBPN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPN_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCTRPDAS_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCtrPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDTO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMQTJ_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbMqTj_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDF3_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDf3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDF2_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDf2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDF1_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDf1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCALD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCald_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBENCA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEncA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBENCL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEncL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBOBSM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbObsM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBBARREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbBarRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARACC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkBarAcc.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBIMPMAN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbImpMan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARESTREO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbBarEstReo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDisNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARGRAACA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGraAca_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBENCCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEncCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEncCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPCOL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTIPCOL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTipCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPART_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPart_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBBUL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbBul_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkDisDes.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROESP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProEsp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKLA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMLA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPLZ_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPlz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECSAL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecSal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARANCACA1_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAncAca1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASULIN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasULin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRULIN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrUlin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARACAANH_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAcaAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCADENC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCadEnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1L4195( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_35195( ) ;
      edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBSER_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbSerD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBSERD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOLNOM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbNomCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBNOMCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOLNUM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCodCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCodCod_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CODCOD_"+sGXsfl_35_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbKgmE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBKGME_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPREKGM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdrAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRANC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdrgm2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRGM2_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbMtrE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBMTRE_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPREMTR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBPIE_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTubCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TUBCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbTub_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBTUB_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLASCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlasCod_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PLASCOD_"+sGXsfl_35_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbPlas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBPLAS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbPlas_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBPLAS_"+sGXsfl_35_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdrObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDROBS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbProVal.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROVAL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtAlbTipEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBTIPENT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbTipArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBTIPART_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTipArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPART_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbNumcli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBNUMCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNumCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNomCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNOMCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBUND_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPreUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPREUND_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEstTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARESTTIP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCLICOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbMetULi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBMETULI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasExt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASEXT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkBarTipCor.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPCOR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtBarGraCob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARGRACOB_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTipDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPDIS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbPN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBPN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCtrPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCTRPDAS_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBDTO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbMqTj_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBMQTJ_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbDf3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBDF3_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbDf2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBDF2_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbDf1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBDF1_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbCald_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCALD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbEncA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBENCA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbEncL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBENCL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbObsM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBOBSM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbBarRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBBARREC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkBarAcc.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "BARACC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtAlbImpMan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBIMPMAN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbBarEstReo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "BARESTREO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtBarDisNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDISNUM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarGraAca_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARGRAACA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbEncCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBENCCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEncCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENCCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSerDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSERDSC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTipCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPCOL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbTipCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBTIPCOL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPart_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPART_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbBul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBBUL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkDisDes.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISDES_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtAlbProRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROREC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProEsp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROESP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarKla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKLA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarMla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMLA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPlz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPLZ_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIE_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFecSal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECSAL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAncAca1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARANCACA1_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSIT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGuiFasULin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASULIN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdrUlin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRULIN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAcaAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARACAANH_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbCadEnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCADENC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARCOD_" + sGXsfl_35_idx ;
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
         GXCCtl = "BARCODREO_" + sGXsfl_35_idx ;
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
      A3391AlbSer = httpContext.cgiGet( edtAlbSer_Internalname) ;
      A8879AlbSerD = httpContext.cgiGet( edtAlbSerD_Internalname) ;
      A3392AlbColNom = httpContext.cgiGet( edtAlbColNom_Internalname) ;
      A12232AlbNomCli = httpContext.cgiGet( edtAlbNomCli_Internalname) ;
      A3393AlbColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A3153CodCod = httpContext.cgiGet( edtCodCod_Internalname) ;
      n3153CodCod = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARALBKGME_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
         wbErr = true ;
         A1261BarAlbKgmE = DecimalUtil.ZERO ;
      }
      else
      {
         A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "BARPREKGM_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPreKgm_Internalname ;
         wbErr = true ;
         A1262BarPreKgm = DecimalUtil.ZERO ;
      }
      else
      {
         A1262BarPreKgm = localUtil.ctond( httpContext.cgiGet( edtBarPreKgm_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBHDRANC_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbHdrAnc_Internalname ;
         wbErr = true ;
         A3271AlbHdrAnc = (short)(0) ;
      }
      else
      {
         A3271AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBHDRGM2_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbHdrgm2_Internalname ;
         wbErr = true ;
         A5019AlbHdrgm2 = (short)(0) ;
      }
      else
      {
         A5019AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARALBMTRE_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbMtrE_Internalname ;
         wbErr = true ;
         A1263BarAlbMtrE = DecimalUtil.ZERO ;
      }
      else
      {
         A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "BARPREMTR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPreMtr_Internalname ;
         wbErr = true ;
         A1264BarPreMtr = DecimalUtil.ZERO ;
      }
      else
      {
         A1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARALBPIE_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbPie_Internalname ;
         wbErr = true ;
         A1265BarAlbPie = 0 ;
      }
      else
      {
         A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TUBCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTubCod_Internalname ;
         wbErr = true ;
         A1206TubCod = (short)(0) ;
         n1206TubCod = false ;
      }
      else
      {
         A1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1206TubCod = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARALBTUB_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbTub_Internalname ;
         wbErr = true ;
         A1266BarAlbTub = 0 ;
      }
      else
      {
         A1266BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PLASCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlasCod_Internalname ;
         wbErr = true ;
         A6466PlasCod = (short)(0) ;
         n6466PlasCod = false ;
      }
      else
      {
         A6466PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6466PlasCod = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARALBPLAS_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbPlas_Internalname ;
         wbErr = true ;
         A6467BarAlbPlas = (short)(0) ;
      }
      else
      {
         A6467BarAlbPlas = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2441AlbHdrObs = httpContext.cgiGet( edtAlbHdrObs_Internalname) ;
      cmbAlbProVal.setName( cmbAlbProVal.getInternalname() );
      cmbAlbProVal.setValue( httpContext.cgiGet( cmbAlbProVal.getInternalname()) );
      A2839AlbProVal = httpContext.cgiGet( cmbAlbProVal.getInternalname()) ;
      A1095AlbTipEnt = GXutil.upper( httpContext.cgiGet( edtAlbTipEnt_Internalname)) ;
      A12234AlbTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n217BarTipArt = false ;
      A12233AlbNumcli = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbNumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
      A12195BarAlbUnd = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbUnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A12196BarPreUnd = localUtil.ctond( httpContext.cgiGet( edtBarPreUnd_Internalname)) ;
      A5034BarEstTip = httpContext.cgiGet( edtBarEstTip_Internalname) ;
      A3886AlbCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A6645AlbMetULi = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbMetULi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A2398BarFasExt = httpContext.cgiGet( edtBarFasExt_Internalname) ;
      A5291BarTipCor = ((GXutil.strcmp(httpContext.cgiGet( chkBarTipCor.getInternalname()), "SI")==0) ? "SI" : "NO") ;
      A5027BarGraCob = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarGraCob_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A2010BarTipDis = GXutil.upper( httpContext.cgiGet( edtBarTipDis_Internalname)) ;
      A1461BarAlbPN = localUtil.ctond( httpContext.cgiGet( edtBarAlbPN_Internalname)) ;
      A4937BarCtrPdas = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCtrPdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n4937BarCtrPdas = false ;
      A7994AlbDto = localUtil.ctond( httpContext.cgiGet( edtAlbDto_Internalname)) ;
      A7993AlbMqTj = httpContext.cgiGet( edtAlbMqTj_Internalname) ;
      A7992AlbDf3 = httpContext.cgiGet( edtAlbDf3_Internalname) ;
      A7991AlbDf2 = httpContext.cgiGet( edtAlbDf2_Internalname) ;
      A7990AlbDf1 = httpContext.cgiGet( edtAlbDf1_Internalname) ;
      A7989AlbCald = httpContext.cgiGet( edtAlbCald_Internalname) ;
      A7104AlbEncA = localUtil.ctond( httpContext.cgiGet( edtAlbEncA_Internalname)) ;
      A7103AlbEncL = localUtil.ctond( httpContext.cgiGet( edtAlbEncL_Internalname)) ;
      A6814AlbObsM = httpContext.cgiGet( edtAlbObsM_Internalname) ;
      A2761AlbBarRec = localUtil.ctond( httpContext.cgiGet( edtAlbBarRec_Internalname)) ;
      A5253BarAcc = ((GXutil.strcmp(httpContext.cgiGet( chkBarAcc.getInternalname()), "S")==0) ? "S" : "N") ;
      A5354AlbImpMan = localUtil.ctond( httpContext.cgiGet( edtAlbImpMan_Internalname)) ;
      cmbBarEstReo.setName( cmbBarEstReo.getInternalname() );
      cmbBarEstReo.setValue( httpContext.cgiGet( cmbBarEstReo.getInternalname()) );
      A148BarEstReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarEstReo.getInternalname()))) ;
      A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
      A1909BarGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtBarGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4815AlbEncCli = httpContext.cgiGet( edtAlbEncCli_Internalname) ;
      A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
      A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
      A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
      A3394AlbTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1503BarPart = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1458BarAlbBul = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAlbBul_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A365DisDes = ((GXutil.strcmp(httpContext.cgiGet( chkDisDes.getInternalname()), "S")==0) ? "S" : "N") ;
      A40AlbProRec = localUtil.ctond( httpContext.cgiGet( edtAlbProRec_Internalname)) ;
      A32AlbProEsp = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEsp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1279BarKla = localUtil.ctond( httpContext.cgiGet( edtBarKla_Internalname)) ;
      A1280BarMla = localUtil.ctond( httpContext.cgiGet( edtBarMla_Internalname)) ;
      A1292BarPlz = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPlz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A161BarFecSal = localUtil.ctod( httpContext.cgiGet( edtBarFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      A125BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAncAca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
      A1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( edtGuiFasULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A2763AlbHdrUlin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A12905AlbCadEnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbCadEnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_35_idx ;
      Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z132BarCodReo_" + sGXsfl_35_idx ;
      Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z130BarCodPar_" + sGXsfl_35_idx ;
      Z130BarCodPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1266BarAlbTub_" + sGXsfl_35_idx ;
      Z1266BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2839AlbProVal_" + sGXsfl_35_idx ;
      Z2839AlbProVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3271AlbHdrAnc_" + sGXsfl_35_idx ;
      Z3271AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3392AlbColNom_" + sGXsfl_35_idx ;
      Z3392AlbColNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3393AlbColNum_" + sGXsfl_35_idx ;
      Z3393AlbColNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3394AlbTipCol_" + sGXsfl_35_idx ;
      Z3394AlbTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3391AlbSer_" + sGXsfl_35_idx ;
      Z3391AlbSer = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8879AlbSerD_" + sGXsfl_35_idx ;
      Z8879AlbSerD = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3886AlbCliCod_" + sGXsfl_35_idx ;
      Z3886AlbCliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12232AlbNomCli_" + sGXsfl_35_idx ;
      Z12232AlbNomCli = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12233AlbNumcli_" + sGXsfl_35_idx ;
      Z12233AlbNumcli = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12234AlbTipArt_" + sGXsfl_35_idx ;
      Z12234AlbTipArt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5019AlbHdrgm2_" + sGXsfl_35_idx ;
      Z5019AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12905AlbCadEnc_" + sGXsfl_35_idx ;
      Z12905AlbCadEnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4815AlbEncCli_" + sGXsfl_35_idx ;
      Z4815AlbEncCli = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1095AlbTipEnt_" + sGXsfl_35_idx ;
      Z1095AlbTipEnt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1263BarAlbMtrE_" + sGXsfl_35_idx ;
      Z1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1262BarPreKgm_" + sGXsfl_35_idx ;
      Z1262BarPreKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1264BarPreMtr_" + sGXsfl_35_idx ;
      Z1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z32AlbProEsp_" + sGXsfl_35_idx ;
      Z32AlbProEsp = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z40AlbProRec_" + sGXsfl_35_idx ;
      Z40AlbProRec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2398BarFasExt_" + sGXsfl_35_idx ;
      Z2398BarFasExt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1261BarAlbKgmE_" + sGXsfl_35_idx ;
      Z1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1265BarAlbPie_" + sGXsfl_35_idx ;
      Z1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6466PlasCod_" + sGXsfl_35_idx ;
      Z6466PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6467BarAlbPlas_" + sGXsfl_35_idx ;
      Z6467BarAlbPlas = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2441AlbHdrObs_" + sGXsfl_35_idx ;
      Z2441AlbHdrObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12195BarAlbUnd_" + sGXsfl_35_idx ;
      Z12195BarAlbUnd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12196BarPreUnd_" + sGXsfl_35_idx ;
      Z12196BarPreUnd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6645AlbMetULi_" + sGXsfl_35_idx ;
      Z6645AlbMetULi = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1461BarAlbPN_" + sGXsfl_35_idx ;
      Z1461BarAlbPN = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7994AlbDto_" + sGXsfl_35_idx ;
      Z7994AlbDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7993AlbMqTj_" + sGXsfl_35_idx ;
      Z7993AlbMqTj = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7992AlbDf3_" + sGXsfl_35_idx ;
      Z7992AlbDf3 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7991AlbDf2_" + sGXsfl_35_idx ;
      Z7991AlbDf2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7990AlbDf1_" + sGXsfl_35_idx ;
      Z7990AlbDf1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7989AlbCald_" + sGXsfl_35_idx ;
      Z7989AlbCald = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7104AlbEncA_" + sGXsfl_35_idx ;
      Z7104AlbEncA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7103AlbEncL_" + sGXsfl_35_idx ;
      Z7103AlbEncL = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6814AlbObsM_" + sGXsfl_35_idx ;
      Z6814AlbObsM = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2761AlbBarRec_" + sGXsfl_35_idx ;
      Z2761AlbBarRec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5354AlbImpMan_" + sGXsfl_35_idx ;
      Z5354AlbImpMan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1458BarAlbBul_" + sGXsfl_35_idx ;
      Z1458BarAlbBul = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1248GuiFasULin_" + sGXsfl_35_idx ;
      Z1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2763AlbHdrUlin_" + sGXsfl_35_idx ;
      Z2763AlbHdrUlin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5051TipAcaCod_" + sGXsfl_35_idx ;
      Z5051TipAcaCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1206TubCod_" + sGXsfl_35_idx ;
      Z1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3153CodCod_" + sGXsfl_35_idx ;
      Z3153CodCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5051TipAcaCod_" + sGXsfl_35_idx ;
      A5051TipAcaCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O1265BarAlbPie_" + sGXsfl_35_idx ;
      O1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O1263BarAlbMtrE_" + sGXsfl_35_idx ;
      O1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1261BarAlbKgmE_" + sGXsfl_35_idx ;
      O1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_195_" + sGXsfl_35_idx ;
      nRcdDeleted_195 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_195_" + sGXsfl_35_idx ;
      nRcdExists_195 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_195_" + sGXsfl_35_idx ;
      nIsMod_195 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "MODO2_" + sGXsfl_35_idx ;
      AV155Modo2 = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbCadEnc_Enabled = edtAlbCadEnc_Enabled ;
      defedtBarAcaAnh_Enabled = edtBarAcaAnh_Enabled ;
      defedtAlbHdrUlin_Enabled = edtAlbHdrUlin_Enabled ;
      defedtGuiFasULin_Enabled = edtGuiFasULin_Enabled ;
      defedtBarSer_Enabled = edtBarSer_Enabled ;
      defedtBarSit_Enabled = edtBarSit_Enabled ;
      defedtBarAncAca1_Enabled = edtBarAncAca1_Enabled ;
      defedtBarFecSal_Enabled = edtBarFecSal_Enabled ;
      defedtBarPie_Enabled = edtBarPie_Enabled ;
      defedtBarPlz_Enabled = edtBarPlz_Enabled ;
      defedtBarMla_Enabled = edtBarMla_Enabled ;
      defedtBarKla_Enabled = edtBarKla_Enabled ;
      defedtAlbProEsp_Enabled = edtAlbProEsp_Enabled ;
      defedtAlbProRec_Enabled = edtAlbProRec_Enabled ;
      defchkDisDes_Enabled = chkDisDes.getEnabled() ;
      defedtBarAlbBul_Enabled = edtBarAlbBul_Enabled ;
      defedtBarPart_Enabled = edtBarPart_Enabled ;
      defedtAlbTipCol_Enabled = edtAlbTipCol_Enabled ;
      defedtBarColNom_Enabled = edtBarColNom_Enabled ;
      defedtBarColNum_Enabled = edtBarColNum_Enabled ;
      defedtBarTipCol_Enabled = edtBarTipCol_Enabled ;
      defedtBarSerDsc_Enabled = edtBarSerDsc_Enabled ;
      defedtBarEncCli_Enabled = edtBarEncCli_Enabled ;
      defedtAlbEncCli_Enabled = edtAlbEncCli_Enabled ;
      defedtBarGraAca_Enabled = edtBarGraAca_Enabled ;
      defedtBarDisNum_Enabled = edtBarDisNum_Enabled ;
      defcmbBarEstReo_Enabled = cmbBarEstReo.getEnabled() ;
      defedtAlbImpMan_Enabled = edtAlbImpMan_Enabled ;
      defchkBarAcc_Enabled = chkBarAcc.getEnabled() ;
      defedtAlbBarRec_Enabled = edtAlbBarRec_Enabled ;
      defedtAlbObsM_Enabled = edtAlbObsM_Enabled ;
      defedtAlbEncL_Enabled = edtAlbEncL_Enabled ;
      defedtAlbEncA_Enabled = edtAlbEncA_Enabled ;
      defedtAlbCald_Enabled = edtAlbCald_Enabled ;
      defedtAlbDf1_Enabled = edtAlbDf1_Enabled ;
      defedtAlbDf2_Enabled = edtAlbDf2_Enabled ;
      defedtAlbDf3_Enabled = edtAlbDf3_Enabled ;
      defedtAlbMqTj_Enabled = edtAlbMqTj_Enabled ;
      defedtAlbDto_Enabled = edtAlbDto_Enabled ;
      defedtBarCtrPdas_Enabled = edtBarCtrPdas_Enabled ;
      defedtBarAlbPN_Enabled = edtBarAlbPN_Enabled ;
      defedtBarTipDis_Enabled = edtBarTipDis_Enabled ;
      defedtBarGraCob_Enabled = edtBarGraCob_Enabled ;
      defchkBarTipCor_Enabled = chkBarTipCor.getEnabled() ;
      defedtBarFasExt_Enabled = edtBarFasExt_Enabled ;
      defedtAlbMetULi_Enabled = edtAlbMetULi_Enabled ;
      defedtAlbCliCod_Enabled = edtAlbCliCod_Enabled ;
      defedtBarEstTip_Enabled = edtBarEstTip_Enabled ;
      defedtBarPreUnd_Enabled = edtBarPreUnd_Enabled ;
      defedtBarAlbUnd_Enabled = edtBarAlbUnd_Enabled ;
      defedtBarNomCli_Enabled = edtBarNomCli_Enabled ;
      defedtBarNumCli_Enabled = edtBarNumCli_Enabled ;
      defedtAlbNumcli_Enabled = edtAlbNumcli_Enabled ;
      defedtBarTipArt_Enabled = edtBarTipArt_Enabled ;
      defedtAlbTipArt_Enabled = edtAlbTipArt_Enabled ;
      defedtAlbColNum_Enabled = edtAlbColNum_Enabled ;
      defedtAlbNomCli_Enabled = edtAlbNomCli_Enabled ;
      defedtAlbColNom_Enabled = edtAlbColNom_Enabled ;
      defedtAlbSerD_Enabled = edtAlbSerD_Enabled ;
      defedtAlbSer_Enabled = edtAlbSer_Enabled ;
      defedtCliCod_Enabled = edtCliCod_Enabled ;
      defedtBarCodPar_Enabled = edtBarCodPar_Enabled ;
      defedtBarCodReo_Enabled = edtBarCodReo_Enabled ;
      defedtBarCod_Enabled = edtBarCod_Enabled ;
   }

   public void confirmValues1L40( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_35195( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_35195( ) ;
         httpContext.changePostValue( "Z129BarCod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z129BarCod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z132BarCodReo_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z132BarCodReo_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z130BarCodPar_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z130BarCodPar_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z1266BarAlbTub_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z1266BarAlbTub_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1266BarAlbTub_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z2839AlbProVal_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z2839AlbProVal_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2839AlbProVal_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z3271AlbHdrAnc_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z3271AlbHdrAnc_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3271AlbHdrAnc_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z3392AlbColNom_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z3392AlbColNom_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3392AlbColNom_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z3393AlbColNum_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z3393AlbColNum_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3393AlbColNum_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z3394AlbTipCol_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z3394AlbTipCol_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3394AlbTipCol_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z3391AlbSer_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z3391AlbSer_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3391AlbSer_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z8879AlbSerD_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z8879AlbSerD_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8879AlbSerD_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z3886AlbCliCod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z3886AlbCliCod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3886AlbCliCod_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z12232AlbNomCli_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z12232AlbNomCli_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12232AlbNomCli_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z12233AlbNumcli_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z12233AlbNumcli_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12233AlbNumcli_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z12234AlbTipArt_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z12234AlbTipArt_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12234AlbTipArt_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z5019AlbHdrgm2_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z5019AlbHdrgm2_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5019AlbHdrgm2_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z12905AlbCadEnc_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z12905AlbCadEnc_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12905AlbCadEnc_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z4815AlbEncCli_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z4815AlbEncCli_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4815AlbEncCli_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z1095AlbTipEnt_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z1095AlbTipEnt_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1095AlbTipEnt_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z1263BarAlbMtrE_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z1263BarAlbMtrE_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1263BarAlbMtrE_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z1262BarPreKgm_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z1262BarPreKgm_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1262BarPreKgm_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z1264BarPreMtr_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z1264BarPreMtr_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1264BarPreMtr_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z32AlbProEsp_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z32AlbProEsp_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z32AlbProEsp_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z40AlbProRec_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z40AlbProRec_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z40AlbProRec_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z2398BarFasExt_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z2398BarFasExt_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2398BarFasExt_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z1261BarAlbKgmE_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z1261BarAlbKgmE_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1261BarAlbKgmE_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z1265BarAlbPie_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z1265BarAlbPie_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1265BarAlbPie_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z6466PlasCod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z6466PlasCod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6466PlasCod_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z6467BarAlbPlas_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z6467BarAlbPlas_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6467BarAlbPlas_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z2441AlbHdrObs_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z2441AlbHdrObs_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2441AlbHdrObs_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z12195BarAlbUnd_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z12195BarAlbUnd_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12195BarAlbUnd_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z12196BarPreUnd_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z12196BarPreUnd_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12196BarPreUnd_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z6645AlbMetULi_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z6645AlbMetULi_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6645AlbMetULi_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z1461BarAlbPN_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z1461BarAlbPN_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1461BarAlbPN_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7994AlbDto_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7994AlbDto_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7994AlbDto_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7993AlbMqTj_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7993AlbMqTj_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7993AlbMqTj_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7992AlbDf3_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7992AlbDf3_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7992AlbDf3_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7991AlbDf2_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7991AlbDf2_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7991AlbDf2_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7990AlbDf1_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7990AlbDf1_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7990AlbDf1_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7989AlbCald_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7989AlbCald_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7989AlbCald_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7104AlbEncA_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7104AlbEncA_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7104AlbEncA_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7103AlbEncL_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7103AlbEncL_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7103AlbEncL_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z6814AlbObsM_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z6814AlbObsM_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6814AlbObsM_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z2761AlbBarRec_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z2761AlbBarRec_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2761AlbBarRec_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z5354AlbImpMan_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z5354AlbImpMan_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5354AlbImpMan_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z1458BarAlbBul_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z1458BarAlbBul_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1458BarAlbBul_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z1248GuiFasULin_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z1248GuiFasULin_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1248GuiFasULin_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z2763AlbHdrUlin_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z2763AlbHdrUlin_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2763AlbHdrUlin_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z5051TipAcaCod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z5051TipAcaCod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5051TipAcaCod_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z1206TubCod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z1206TubCod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1206TubCod_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z3153CodCod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z3153CodCod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3153CodCod_"+sGXsfl_35_idx) ;
      }
      httpContext.changePostValue( "O1265BarAlbPie", httpContext.cgiGet( "T1265BarAlbPie")) ;
      httpContext.deletePostValue( "T1265BarAlbPie") ;
      httpContext.changePostValue( "O1263BarAlbMtrE", httpContext.cgiGet( "T1263BarAlbMtrE")) ;
      httpContext.deletePostValue( "T1263BarAlbMtrE") ;
      httpContext.changePostValue( "O1261BarAlbKgmE", httpContext.cgiGet( "T1261BarAlbKgmE")) ;
      httpContext.deletePostValue( "T1261BarAlbKgmE") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttrn07", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV198EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV199AlbProCod,10,0))}, new String[] {"Gx_mode","EmprCod","AlbProCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTrn07");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttrn07:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7101AlbLic", GXutil.rtrim( Z7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5805AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( Z5805AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1253EmprGuiRem", GXutil.rtrim( Z1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( Z1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nGXsfl_35_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N1253EmprGuiRem", GXutil.rtrim( A1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "N1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV191TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV191TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV191TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOMBREPARAMETRO", AV212NombreParametro);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vREFRESCAR", AV211Refrescar);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETOREFRESCAR", AV206ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETOREFRESCAR", AV206ObjetoRefrescar);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV198EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV198EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV199AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV199AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_EMPRGUIREM", GXutil.rtrim( AV203Insert_EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_GUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV200Insert_GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMCLN", GXutil.rtrim( A1244GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV220Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO2", GXutil.rtrim( AV155Modo2));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILANT", GXutil.ltrim( localUtil.ntoc( AV108KilAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETANT", GXutil.ltrim( localUtil.ntoc( AV150MetAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEANT", GXutil.ltrim( localUtil.ntoc( AV165PieAnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV186Carvitin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARKGM", GXutil.ltrim( localUtil.ntoc( AV45BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPZASLAN", GXutil.ltrim( localUtil.ntoc( AV176PzasLan, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_K", GXutil.rtrim( AV163Msg_k));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ACC", GXutil.rtrim( AV158Msg_acc));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGFAS", GXutil.ltrim( localUtil.ntoc( AV87FlagFas, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_KGSLAM", GXutil.ltrim( localUtil.ntoc( AV69F_kgslam, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGPORREC", GXutil.ltrim( localUtil.ntoc( AV91FlagPorRec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_CARVEMA", GXutil.ltrim( localUtil.ntoc( AV66F_carvema, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGGV", GXutil.ltrim( localUtil.ntoc( AV88FlagGv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV151Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCH", localUtil.dtoc( AV35AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vKGSHDR", GXutil.ltrim( localUtil.ntoc( AV38KgsHdr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOKMERMA", GXutil.ltrim( localUtil.ntoc( AV173OkMerma, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPDIS", GXutil.rtrim( AV171TipDis));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_TINAMAR", GXutil.ltrim( localUtil.ntoc( AV72F_tinamar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV36AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGETM", GXutil.ltrim( localUtil.ntoc( AV85FlagEtm, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRQB", GXutil.ltrim( localUtil.ntoc( AV57CtrQb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGPREFAS", GXutil.ltrim( localUtil.ntoc( AV92FlagPreFas, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_CTRL", GXutil.rtrim( AV159Msg_ctrl));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV152Moda21, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRKGS", GXutil.ltrim( localUtil.ntoc( AV63errkgs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERFOC", GXutil.ltrim( localUtil.ntoc( AV61Erfoc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPACACOD", GXutil.ltrim( localUtil.ntoc( A5051TipAcaCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFASES_Objectcall", GXutil.rtrim( Dvpanel_panelfases_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFASES_Enabled", GXutil.booltostr( Dvpanel_panelfases_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFASES_Width", GXutil.rtrim( Dvpanel_panelfases_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFASES_Autowidth", GXutil.booltostr( Dvpanel_panelfases_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFASES_Autoheight", GXutil.booltostr( Dvpanel_panelfases_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFASES_Cls", GXutil.rtrim( Dvpanel_panelfases_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFASES_Title", GXutil.rtrim( Dvpanel_panelfases_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFASES_Collapsible", GXutil.booltostr( Dvpanel_panelfases_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFASES_Collapsed", GXutil.booltostr( Dvpanel_panelfases_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFASES_Showcollapseicon", GXutil.booltostr( Dvpanel_panelfases_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFASES_Iconposition", GXutil.rtrim( Dvpanel_panelfases_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFASES_Autoscroll", GXutil.booltostr( Dvpanel_panelfases_Autoscroll));
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
      return formatLink("app.ttrn07", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV198EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV199AlbProCod,10,0))}, new String[] {"Gx_mode","EmprCod","AlbProCod"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn07" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Guias (Detail HDRs)", "") ;
   }

   public void initializeNonKey1L43( )
   {
      A1253EmprGuiRem = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      A1243GuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      A1244GuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A7101AlbLic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
      A5805AlbEnvFtp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      Z7101AlbLic = "" ;
      Z5805AlbEnvFtp = (byte)(0) ;
      Z1253EmprGuiRem = "" ;
      Z1243GuiRemCli = 0 ;
   }

   public void initAll1L43( )
   {
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      initializeNonKey1L43( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1L4195( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A4815AlbEncCli = "" ;
      AV155Modo2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV155Modo2", AV155Modo2);
      AV108KilAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108KilAnt", GXutil.ltrimstr( AV108KilAnt, 9, 2));
      AV150MetAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV150MetAnt", GXutil.ltrimstr( AV150MetAnt, 9, 2));
      AV165PieAnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV165PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165PieAnt), 6, 0));
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV158Msg_acc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV158Msg_acc", AV158Msg_acc);
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A32AlbProEsp = (byte)(0) ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A2398BarFasExt = "" ;
      AV151Metros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV151Metros", GXutil.ltrimstr( AV151Metros, 9, 2));
      A1280BarMla = DecimalUtil.ZERO ;
      AV45BarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45BarKgm", GXutil.ltrimstr( AV45BarKgm, 9, 2));
      A1279BarKla = DecimalUtil.ZERO ;
      AV176PzasLan = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV176PzasLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV176PzasLan), 6, 0));
      A1292BarPlz = (short)(0) ;
      AV35AlbProFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35AlbProFch", localUtil.format(AV35AlbProFch, "99/99/99"));
      AV38KgsHdr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38KgsHdr", GXutil.ltrimstr( AV38KgsHdr, 9, 2));
      AV173OkMerma = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV173OkMerma", GXutil.str( AV173OkMerma, 1, 0));
      AV171TipDis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV171TipDis", AV171TipDis);
      AV159Msg_ctrl = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV159Msg_ctrl", AV159Msg_ctrl);
      A198BarPie = 0 ;
      AV69F_kgslam = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69F_kgslam", GXutil.str( AV69F_kgslam, 1, 0));
      AV88FlagGv = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88FlagGv", GXutil.str( AV88FlagGv, 1, 0));
      AV36AlbSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36AlbSec", AV36AlbSec);
      A3153CodCod = "" ;
      n3153CodCod = false ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1265BarAlbPie = 0 ;
      A1206TubCod = (short)(0) ;
      n1206TubCod = false ;
      A6466PlasCod = (short)(0) ;
      n6466PlasCod = false ;
      A6467BarAlbPlas = (short)(0) ;
      A2441AlbHdrObs = "" ;
      A217BarTipArt = (short)(0) ;
      n217BarTipArt = false ;
      A1235BarNumCli = 0 ;
      A1234BarNomCli = "" ;
      A12195BarAlbUnd = 0 ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A5034BarEstTip = "" ;
      A6645AlbMetULi = (short)(0) ;
      A5291BarTipCor = "" ;
      A5027BarGraCob = (byte)(0) ;
      A2010BarTipDis = "" ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A4937BarCtrPdas = (byte)(0) ;
      n4937BarCtrPdas = false ;
      A7994AlbDto = DecimalUtil.ZERO ;
      A7993AlbMqTj = "" ;
      A7992AlbDf3 = "" ;
      A7991AlbDf2 = "" ;
      A7990AlbDf1 = "" ;
      A7989AlbCald = "" ;
      A7104AlbEncA = DecimalUtil.ZERO ;
      A7103AlbEncL = DecimalUtil.ZERO ;
      A6814AlbObsM = "" ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A5253BarAcc = "" ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A148BarEstReo = (byte)(0) ;
      A143BarDisNum = "" ;
      A1909BarGraAca = (short)(0) ;
      A4812BarEncCli = "" ;
      A1652BarSerDsc = "" ;
      A218BarTipCol = (byte)(0) ;
      A136BarColNum = 0 ;
      A135BarColNom = "" ;
      A1503BarPart = (short)(0) ;
      A1458BarAlbBul = (short)(0) ;
      A365DisDes = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A125BarAncAca1 = (short)(0) ;
      A213BarSit = (byte)(0) ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      A212BarSer = "" ;
      A1248GuiFasULin = (short)(0) ;
      A2763AlbHdrUlin = (short)(0) ;
      A4466BarAcaAnh = (short)(0) ;
      A5051TipAcaCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5051TipAcaCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5051TipAcaCod), 4, 0));
      AV163Msg_k = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV163Msg_k", AV163Msg_k);
      A898BarPieNDes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      A199BarPie1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      A1266BarAlbTub = 0 ;
      A2839AlbProVal = httpContext.getMessage( "S", "") ;
      A3271AlbHdrAnc = (short)(0) ;
      A3392AlbColNom = "" ;
      A3393AlbColNum = 0 ;
      A3394AlbTipCol = (byte)(0) ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A3886AlbCliCod = 0 ;
      A12232AlbNomCli = "" ;
      A12233AlbNumcli = 0 ;
      A12234AlbTipArt = (short)(0) ;
      A5019AlbHdrgm2 = (short)(0) ;
      A12905AlbCadEnc = (short)(0) ;
      A1095AlbTipEnt = "*" ;
      O1265BarAlbPie = A1265BarAlbPie ;
      O1263BarAlbMtrE = A1263BarAlbMtrE ;
      O1261BarAlbKgmE = A1261BarAlbKgmE ;
      Z1266BarAlbTub = 0 ;
      Z2839AlbProVal = "" ;
      Z3271AlbHdrAnc = (short)(0) ;
      Z3392AlbColNom = "" ;
      Z3393AlbColNum = 0 ;
      Z3394AlbTipCol = (byte)(0) ;
      Z3391AlbSer = "" ;
      Z8879AlbSerD = "" ;
      Z3886AlbCliCod = 0 ;
      Z12232AlbNomCli = "" ;
      Z12233AlbNumcli = 0 ;
      Z12234AlbTipArt = (short)(0) ;
      Z5019AlbHdrgm2 = (short)(0) ;
      Z12905AlbCadEnc = (short)(0) ;
      Z4815AlbEncCli = "" ;
      Z1095AlbTipEnt = "" ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z1262BarPreKgm = DecimalUtil.ZERO ;
      Z1264BarPreMtr = DecimalUtil.ZERO ;
      Z32AlbProEsp = (byte)(0) ;
      Z40AlbProRec = DecimalUtil.ZERO ;
      Z2398BarFasExt = "" ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1265BarAlbPie = 0 ;
      Z6466PlasCod = (short)(0) ;
      Z6467BarAlbPlas = (short)(0) ;
      Z2441AlbHdrObs = "" ;
      Z12195BarAlbUnd = 0 ;
      Z12196BarPreUnd = DecimalUtil.ZERO ;
      Z6645AlbMetULi = (short)(0) ;
      Z1461BarAlbPN = DecimalUtil.ZERO ;
      Z7994AlbDto = DecimalUtil.ZERO ;
      Z7993AlbMqTj = "" ;
      Z7992AlbDf3 = "" ;
      Z7991AlbDf2 = "" ;
      Z7990AlbDf1 = "" ;
      Z7989AlbCald = "" ;
      Z7104AlbEncA = DecimalUtil.ZERO ;
      Z7103AlbEncL = DecimalUtil.ZERO ;
      Z6814AlbObsM = "" ;
      Z2761AlbBarRec = DecimalUtil.ZERO ;
      Z5354AlbImpMan = DecimalUtil.ZERO ;
      Z1458BarAlbBul = (short)(0) ;
      Z1248GuiFasULin = (short)(0) ;
      Z2763AlbHdrUlin = (short)(0) ;
      Z5051TipAcaCod = (short)(0) ;
      Z1206TubCod = (short)(0) ;
      Z3153CodCod = "" ;
   }

   public void initAll1L4195( )
   {
      A129BarCod = 0 ;
      A132BarCodReo = (byte)(0) ;
      A130BarCodPar = "" ;
      initializeNonKey1L4195( ) ;
   }

   public void standaloneModalInsert1L4195( )
   {
      AV155Modo2 = iV155Modo2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV155Modo2", AV155Modo2);
      A2839AlbProVal = i2839AlbProVal ;
      A1095AlbTipEnt = i1095AlbTipEnt ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415101663", true, true);
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
      httpContext.AddJavascriptSource("ttrn07.js", "?202682415101664", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties195( )
   {
      edtAlbCadEnc_Enabled = defedtAlbCadEnc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCadEnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCadEnc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAcaAnh_Enabled = defedtBarAcaAnh_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaAnh_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbHdrUlin_Enabled = defedtAlbHdrUlin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrUlin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtGuiFasULin_Enabled = defedtGuiFasULin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasULin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarSer_Enabled = defedtBarSer_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarSit_Enabled = defedtBarSit_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAncAca1_Enabled = defedtBarAncAca1_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca1_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarFecSal_Enabled = defedtBarFecSal_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecSal_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPie_Enabled = defedtBarPie_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPlz_Enabled = defedtBarPlz_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPlz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPlz_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarMla_Enabled = defedtBarMla_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMla_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarKla_Enabled = defedtBarKla_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKla_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbProEsp_Enabled = defedtAlbProEsp_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEsp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbProRec_Enabled = defedtAlbProRec_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProRec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      chkDisDes.setEnabled( defchkDisDes_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisDes.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbBul_Enabled = defedtBarAlbBul_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbBul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbBul_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPart_Enabled = defedtBarPart_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPart_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbTipCol_Enabled = defedtAlbTipCol_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipCol_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarColNom_Enabled = defedtBarColNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarColNum_Enabled = defedtBarColNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarTipCol_Enabled = defedtBarTipCol_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarSerDsc_Enabled = defedtBarSerDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarEncCli_Enabled = defedtBarEncCli_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbEncCli_Enabled = defedtAlbEncCli_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarGraAca_Enabled = defedtBarGraAca_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarDisNum_Enabled = defedtBarDisNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      cmbBarEstReo.setEnabled( defcmbBarEstReo_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbBarEstReo.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbImpMan_Enabled = defedtAlbImpMan_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbImpMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbImpMan_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      chkBarAcc.setEnabled( defchkBarAcc_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarAcc.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbBarRec_Enabled = defedtAlbBarRec_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbBarRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbBarRec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbObsM_Enabled = defedtAlbObsM_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbObsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbObsM_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbEncL_Enabled = defedtAlbEncL_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncL_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbEncA_Enabled = defedtAlbEncA_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncA_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbCald_Enabled = defedtAlbCald_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCald_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCald_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbDf1_Enabled = defedtAlbDf1_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDf1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf1_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbDf2_Enabled = defedtAlbDf2_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDf2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf2_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbDf3_Enabled = defedtAlbDf3_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDf3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf3_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbMqTj_Enabled = defedtAlbMqTj_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMqTj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMqTj_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbDto_Enabled = defedtAlbDto_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDto_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarCtrPdas_Enabled = defedtBarCtrPdas_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCtrPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCtrPdas_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbPN_Enabled = defedtBarAlbPN_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPN_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarTipDis_Enabled = defedtBarTipDis_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDis_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarGraCob_Enabled = defedtBarGraCob_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraCob_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      chkBarTipCor.setEnabled( defchkBarTipCor_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarTipCor.getEnabled(), 5, 0), !bGXsfl_35_Refreshing);
      edtBarFasExt_Enabled = defedtBarFasExt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasExt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbMetULi_Enabled = defedtAlbMetULi_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMetULi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMetULi_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbCliCod_Enabled = defedtAlbCliCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCliCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarEstTip_Enabled = defedtBarEstTip_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEstTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEstTip_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPreUnd_Enabled = defedtBarPreUnd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreUnd_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarAlbUnd_Enabled = defedtBarAlbUnd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbUnd_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarNomCli_Enabled = defedtBarNomCli_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarNumCli_Enabled = defedtBarNumCli_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbNumcli_Enabled = defedtAlbNumcli_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumcli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarTipArt_Enabled = defedtBarTipArt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbTipArt_Enabled = defedtAlbTipArt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipArt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbColNum_Enabled = defedtAlbColNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbNomCli_Enabled = defedtAlbNomCli_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNomCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbColNom_Enabled = defedtAlbColNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNom_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbSerD_Enabled = defedtAlbSerD_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSerD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSerD_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbSer_Enabled = defedtAlbSer_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSer_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtCliCod_Enabled = defedtCliCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarCodPar_Enabled = defedtBarCodPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarCodReo_Enabled = defedtBarCodReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarCod_Enabled = defedtBarCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void startgridcontrol35( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A3391AlbSer));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A8879AlbSerD));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbSerD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A3392AlbColNom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A12232AlbNomCli));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbNomCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A3153CodCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCodCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCodCod_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgmE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrgm2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtrE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTubCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbTub_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPlasCod_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAlbPlas_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A2441AlbHdrObs));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A2839AlbProVal));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProVal.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1095AlbTipEnt));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTipEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12234AlbTipArt, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTipArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12233AlbNumcli, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbNumcli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12195BarAlbUnd, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12196BarPreUnd, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A5034BarEstTip));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEstTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3886AlbCliCod, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6645AlbMetULi, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbMetULi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A2398BarFasExt));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasExt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A5291BarTipCor));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkBarTipCor.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5027BarGraCob, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGraCob_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A2010BarTipDis));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1461BarAlbPN, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPN_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4937BarCtrPdas, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCtrPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7994AlbDto, (byte)(6), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A7993AlbMqTj));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbMqTj_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A7992AlbDf3));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDf3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A7991AlbDf2));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDf2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A7990AlbDf1));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbDf1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A7989AlbCald));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCald_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7104AlbEncA, (byte)(7), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEncA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7103AlbEncL, (byte)(7), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEncL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", A6814AlbObsM);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbObsM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2761AlbBarRec, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbBarRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A5253BarAcc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkBarAcc.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5354AlbImpMan, (byte)(11), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbImpMan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbBarEstReo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A143BarDisNum));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDisNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarGraAca_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4815AlbEncCli));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEncCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4812BarEncCli));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEncCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTipCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPart_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1458BarAlbBul, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbBul_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A365DisDes));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkDisDes.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProEsp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1292BarPlz, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPlz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", localUtil.format(A161BarFecSal, "99/99/99"));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecSal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAncAca1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasULin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2763AlbHdrUlin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrUlin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAcaAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12905AlbCadEnc, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCadEnc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprGuiRem_Internalname = "EMPRGUIREM" ;
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      divTablainformaciongeneral_Internalname = "TABLAINFORMACIONGENERAL" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtAlbSer_Internalname = "ALBSER" ;
      edtAlbSerD_Internalname = "ALBSERD" ;
      edtAlbColNom_Internalname = "ALBCOLNOM" ;
      edtAlbNomCli_Internalname = "ALBNOMCLI" ;
      edtAlbColNum_Internalname = "ALBCOLNUM" ;
      edtCodCod_Internalname = "CODCOD" ;
      edtBarAlbKgmE_Internalname = "BARALBKGME" ;
      edtBarPreKgm_Internalname = "BARPREKGM" ;
      edtAlbHdrAnc_Internalname = "ALBHDRANC" ;
      edtAlbHdrgm2_Internalname = "ALBHDRGM2" ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE" ;
      edtBarPreMtr_Internalname = "BARPREMTR" ;
      edtBarAlbPie_Internalname = "BARALBPIE" ;
      edtTubCod_Internalname = "TUBCOD" ;
      edtBarAlbTub_Internalname = "BARALBTUB" ;
      edtPlasCod_Internalname = "PLASCOD" ;
      edtBarAlbPlas_Internalname = "BARALBPLAS" ;
      edtAlbHdrObs_Internalname = "ALBHDROBS" ;
      cmbAlbProVal.setInternalname( "ALBPROVAL" );
      edtAlbTipEnt_Internalname = "ALBTIPENT" ;
      edtAlbTipArt_Internalname = "ALBTIPART" ;
      edtBarTipArt_Internalname = "BARTIPART" ;
      edtAlbNumcli_Internalname = "ALBNUMCLI" ;
      edtBarNumCli_Internalname = "BARNUMCLI" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      edtBarAlbUnd_Internalname = "BARALBUND" ;
      edtBarPreUnd_Internalname = "BARPREUND" ;
      edtBarEstTip_Internalname = "BARESTTIP" ;
      edtAlbCliCod_Internalname = "ALBCLICOD" ;
      edtAlbMetULi_Internalname = "ALBMETULI" ;
      edtBarFasExt_Internalname = "BARFASEXT" ;
      chkBarTipCor.setInternalname( "BARTIPCOR" );
      edtBarGraCob_Internalname = "BARGRACOB" ;
      edtBarTipDis_Internalname = "BARTIPDIS" ;
      edtBarAlbPN_Internalname = "BARALBPN" ;
      edtBarCtrPdas_Internalname = "BARCTRPDAS" ;
      edtAlbDto_Internalname = "ALBDTO" ;
      edtAlbMqTj_Internalname = "ALBMQTJ" ;
      edtAlbDf3_Internalname = "ALBDF3" ;
      edtAlbDf2_Internalname = "ALBDF2" ;
      edtAlbDf1_Internalname = "ALBDF1" ;
      edtAlbCald_Internalname = "ALBCALD" ;
      edtAlbEncA_Internalname = "ALBENCA" ;
      edtAlbEncL_Internalname = "ALBENCL" ;
      edtAlbObsM_Internalname = "ALBOBSM" ;
      edtAlbBarRec_Internalname = "ALBBARREC" ;
      chkBarAcc.setInternalname( "BARACC" );
      edtAlbImpMan_Internalname = "ALBIMPMAN" ;
      cmbBarEstReo.setInternalname( "BARESTREO" );
      edtBarDisNum_Internalname = "BARDISNUM" ;
      edtBarGraAca_Internalname = "BARGRAACA" ;
      edtAlbEncCli_Internalname = "ALBENCCLI" ;
      edtBarEncCli_Internalname = "BARENCCLI" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtAlbTipCol_Internalname = "ALBTIPCOL" ;
      edtBarPart_Internalname = "BARPART" ;
      edtBarAlbBul_Internalname = "BARALBBUL" ;
      chkDisDes.setInternalname( "DISDES" );
      edtAlbProRec_Internalname = "ALBPROREC" ;
      edtAlbProEsp_Internalname = "ALBPROESP" ;
      edtBarKla_Internalname = "BARKLA" ;
      edtBarMla_Internalname = "BARMLA" ;
      edtBarPlz_Internalname = "BARPLZ" ;
      edtBarPie_Internalname = "BARPIE" ;
      edtBarFecSal_Internalname = "BARFECSAL" ;
      edtBarAncAca1_Internalname = "BARANCACA1" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtBarSer_Internalname = "BARSER" ;
      edtGuiFasULin_Internalname = "GUIFASULIN" ;
      edtAlbHdrUlin_Internalname = "ALBHDRULIN" ;
      edtBarAcaAnh_Internalname = "BARACAANH" ;
      edtAlbCadEnc_Internalname = "ALBCADENC" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtnregresar_Internalname = "BTNREGRESAR" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      bttBtnfases_Internalname = "BTNFASES" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divPanelfases_Internalname = "PANELFASES" ;
      Dvpanel_panelfases_Internalname = "DVPANEL_PANELFASES" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtAlbLic_Internalname = "ALBLIC" ;
      edtAlbEnvFtp_Internalname = "ALBENVFTP" ;
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
      Form.setCaption( httpContext.getMessage( "Guias (Detail HDRs)", "") );
      edtAlbCadEnc_Jsonclick = "" ;
      edtBarAcaAnh_Jsonclick = "" ;
      edtAlbHdrUlin_Jsonclick = "" ;
      edtGuiFasULin_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      edtBarAncAca1_Jsonclick = "" ;
      edtBarFecSal_Jsonclick = "" ;
      edtBarPie_Jsonclick = "" ;
      edtBarPlz_Jsonclick = "" ;
      edtBarMla_Jsonclick = "" ;
      edtBarKla_Jsonclick = "" ;
      edtAlbProEsp_Jsonclick = "" ;
      edtAlbProRec_Jsonclick = "" ;
      chkDisDes.setCaption( "" );
      edtBarAlbBul_Jsonclick = "" ;
      edtBarPart_Jsonclick = "" ;
      edtAlbTipCol_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarEncCli_Jsonclick = "" ;
      edtAlbEncCli_Jsonclick = "" ;
      edtBarGraAca_Jsonclick = "" ;
      edtBarDisNum_Jsonclick = "" ;
      cmbBarEstReo.setJsonclick( "" );
      edtAlbImpMan_Jsonclick = "" ;
      chkBarAcc.setCaption( "" );
      edtAlbBarRec_Jsonclick = "" ;
      edtAlbObsM_Jsonclick = "" ;
      edtAlbEncL_Jsonclick = "" ;
      edtAlbEncA_Jsonclick = "" ;
      edtAlbCald_Jsonclick = "" ;
      edtAlbDf1_Jsonclick = "" ;
      edtAlbDf2_Jsonclick = "" ;
      edtAlbDf3_Jsonclick = "" ;
      edtAlbMqTj_Jsonclick = "" ;
      edtAlbDto_Jsonclick = "" ;
      edtBarCtrPdas_Jsonclick = "" ;
      edtBarAlbPN_Jsonclick = "" ;
      edtBarTipDis_Jsonclick = "" ;
      edtBarGraCob_Jsonclick = "" ;
      chkBarTipCor.setCaption( "" );
      edtBarFasExt_Jsonclick = "" ;
      edtAlbMetULi_Jsonclick = "" ;
      edtAlbCliCod_Jsonclick = "" ;
      edtBarEstTip_Jsonclick = "" ;
      edtBarPreUnd_Jsonclick = "" ;
      edtBarAlbUnd_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNumCli_Jsonclick = "" ;
      edtAlbNumcli_Jsonclick = "" ;
      edtBarTipArt_Jsonclick = "" ;
      edtAlbTipArt_Jsonclick = "" ;
      edtAlbTipEnt_Jsonclick = "" ;
      cmbAlbProVal.setJsonclick( "" );
      edtAlbHdrObs_Jsonclick = "" ;
      edtBarAlbPlas_Jsonclick = "" ;
      edtPlasCod_Jsonclick = "" ;
      edtBarAlbTub_Jsonclick = "" ;
      edtTubCod_Jsonclick = "" ;
      edtBarAlbPie_Jsonclick = "" ;
      edtBarPreMtr_Jsonclick = "" ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtAlbHdrgm2_Jsonclick = "" ;
      edtAlbHdrAnc_Jsonclick = "" ;
      edtBarPreKgm_Jsonclick = "" ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtCodCod_Jsonclick = "" ;
      edtAlbColNum_Jsonclick = "" ;
      edtAlbNomCli_Jsonclick = "" ;
      edtAlbColNom_Jsonclick = "" ;
      edtAlbSerD_Jsonclick = "" ;
      edtAlbSer_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtAlbCadEnc_Enabled = 0 ;
      edtBarAcaAnh_Enabled = 0 ;
      edtAlbHdrUlin_Enabled = 0 ;
      edtGuiFasULin_Enabled = 0 ;
      edtBarSer_Enabled = 0 ;
      edtBarSit_Enabled = 0 ;
      edtBarAncAca1_Enabled = 0 ;
      edtBarFecSal_Enabled = 0 ;
      edtBarPie_Enabled = 0 ;
      edtBarPlz_Enabled = 0 ;
      edtBarMla_Enabled = 0 ;
      edtBarKla_Enabled = 0 ;
      edtAlbProEsp_Enabled = 0 ;
      edtAlbProRec_Enabled = 0 ;
      chkDisDes.setEnabled( 0 );
      edtBarAlbBul_Enabled = 0 ;
      edtBarPart_Enabled = 0 ;
      edtAlbTipCol_Enabled = 0 ;
      edtBarColNom_Enabled = 0 ;
      edtBarColNum_Enabled = 0 ;
      edtBarTipCol_Enabled = 0 ;
      edtBarSerDsc_Enabled = 0 ;
      edtBarEncCli_Enabled = 0 ;
      edtAlbEncCli_Enabled = 0 ;
      edtBarGraAca_Enabled = 0 ;
      edtBarDisNum_Enabled = 0 ;
      cmbBarEstReo.setEnabled( 0 );
      edtAlbImpMan_Enabled = 0 ;
      chkBarAcc.setEnabled( 0 );
      edtAlbBarRec_Enabled = 0 ;
      edtAlbObsM_Enabled = 0 ;
      edtAlbEncL_Enabled = 0 ;
      edtAlbEncA_Enabled = 0 ;
      edtAlbCald_Enabled = 0 ;
      edtAlbDf1_Enabled = 0 ;
      edtAlbDf2_Enabled = 0 ;
      edtAlbDf3_Enabled = 0 ;
      edtAlbMqTj_Enabled = 0 ;
      edtAlbDto_Enabled = 0 ;
      edtBarCtrPdas_Enabled = 0 ;
      edtBarAlbPN_Enabled = 0 ;
      edtBarTipDis_Enabled = 0 ;
      edtBarGraCob_Enabled = 0 ;
      chkBarTipCor.setEnabled( 0 );
      edtBarFasExt_Enabled = 0 ;
      edtAlbMetULi_Enabled = 0 ;
      edtAlbCliCod_Enabled = 0 ;
      edtBarEstTip_Enabled = 0 ;
      edtBarPreUnd_Enabled = 0 ;
      edtBarAlbUnd_Enabled = 0 ;
      edtBarNomCli_Enabled = 0 ;
      edtBarNumCli_Enabled = 0 ;
      edtAlbNumcli_Enabled = 0 ;
      edtBarTipArt_Enabled = 0 ;
      edtAlbTipArt_Enabled = 0 ;
      edtAlbTipEnt_Enabled = 1 ;
      cmbAlbProVal.setEnabled( 1 );
      edtAlbHdrObs_Enabled = 1 ;
      edtBarAlbPlas_Enabled = 1 ;
      edtPlasCod_Enabled = 1 ;
      edtBarAlbTub_Enabled = 1 ;
      edtTubCod_Enabled = 1 ;
      edtBarAlbPie_Enabled = 1 ;
      edtBarPreMtr_Enabled = 1 ;
      edtBarAlbMtrE_Enabled = 1 ;
      edtAlbHdrgm2_Enabled = 1 ;
      edtAlbHdrAnc_Enabled = 1 ;
      edtBarPreKgm_Enabled = 1 ;
      edtBarAlbKgmE_Enabled = 1 ;
      edtCodCod_Enabled = 1 ;
      edtAlbColNum_Enabled = 0 ;
      edtAlbNomCli_Enabled = 0 ;
      edtAlbColNom_Enabled = 0 ;
      edtAlbSerD_Enabled = 0 ;
      edtAlbSer_Enabled = 0 ;
      edtCliCod_Enabled = 0 ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Enabled = 1 ;
      edtAlbEnvFtp_Jsonclick = "" ;
      edtAlbEnvFtp_Enabled = 1 ;
      edtAlbEnvFtp_Visible = 1 ;
      edtAlbLic_Jsonclick = "" ;
      edtAlbLic_Enabled = 1 ;
      edtAlbLic_Visible = 1 ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 1 ;
      edtGuiRemCli_Visible = 1 ;
      bttBtnfases_Visible = 1 ;
      Dvpanel_panelfases_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelfases_Iconposition = "Right" ;
      Dvpanel_panelfases_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelfases_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelfases_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelfases_Title = "" ;
      Dvpanel_panelfases_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelfases_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelfases_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelfases_Width = "100%" ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtnregresar_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 1 ;
      divTablainformaciongeneral_Visible = 1 ;
      edtEmprGuiRem_Jsonclick = "" ;
      edtEmprGuiRem_Enabled = 1 ;
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
      edtBarAlbPlas_Visible = -1 ;
      edtPlasCod_Visible = -1 ;
      edtCodCod_Visible = -1 ;
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

   public void xc_105_1L4195( String A396EmprCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              String AV158Msg_acc ,
                              byte AV152Moda21 )
   {
      if ( true /* After */ && ( AV152Moda21 == 0 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = AV158Msg_acc ;
         new app.pctrlacc(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_char3) ;
         A396EmprCod = GXv_char20[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char4[0] ;
         AV158Msg_acc = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV158Msg_acc", AV158Msg_acc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV158Msg_acc))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_106_1L4195( String A396EmprCod ,
                              long A30AlbProCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              byte AV87FlagFas )
   {
      if ( true /* Level */ && true /* After */ && ( AV87FlagFas == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int17[0] = A30AlbProCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         new app.pcopfas(remoteHandle, context).execute( GXv_char20, GXv_int17, GXv_int18, GXv_int16, GXv_char4) ;
         A396EmprCod = GXv_char20[0] ;
         A30AlbProCod = GXv_int17[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_107_1L4195( String A396EmprCod ,
                              long A30AlbProCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              byte AV87FlagFas ,
                              byte AV69F_kgslam )
   {
      if ( true /* Level */ && true /* After */ && ( AV87FlagFas == 1 ) && ( AV69F_kgslam == 0 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int17[0] = A30AlbProCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         new app.pkilfas(remoteHandle, context).execute( GXv_char20, GXv_int17, GXv_int18, GXv_int16, GXv_char4) ;
         A396EmprCod = GXv_char20[0] ;
         A30AlbProCod = GXv_int17[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_108_1L4195( String Gx_mode ,
                              String A396EmprCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              String A2839AlbProVal ,
                              byte AV91FlagPorRec ,
                              byte AV66F_carvema ,
                              byte AV186Carvitin )
   {
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && ( AV91FlagPorRec == 0 ) && ( AV66F_carvema == 0 ) && ( AV186Carvitin == 0 ) )
      {
         GXv_decimal14[0] = A1262BarPreKgm ;
         GXv_decimal12[0] = A1264BarPreMtr ;
         GXv_int16[0] = A32AlbProEsp ;
         GXv_decimal11[0] = A40AlbProRec ;
         GXv_char20[0] = A2398BarFasExt ;
         new app.pbuspre4(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal14, GXv_decimal12, GXv_int16, GXv_decimal11, GXv_char20) ;
         A1262BarPreKgm = GXv_decimal14[0] ;
         A1264BarPreMtr = GXv_decimal12[0] ;
         A32AlbProEsp = GXv_int16[0] ;
         A40AlbProRec = GXv_decimal11[0] ;
         A2398BarFasExt = GXv_char20[0] ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2398BarFasExt))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_109_1L4195( String Gx_mode ,
                              String A396EmprCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              byte AV186Carvitin )
   {
      if ( true /* Level */ && true /* After */ && isIns( )  && ( AV186Carvitin == 1 ) )
      {
         GXv_decimal14[0] = A1262BarPreKgm ;
         GXv_decimal12[0] = A1264BarPreMtr ;
         GXv_int16[0] = A32AlbProEsp ;
         GXv_decimal11[0] = A40AlbProRec ;
         GXv_char20[0] = A2398BarFasExt ;
         new app.pbuspre4(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal14, GXv_decimal12, GXv_int16, GXv_decimal11, GXv_char20) ;
         A1262BarPreKgm = GXv_decimal14[0] ;
         A1264BarPreMtr = GXv_decimal12[0] ;
         A32AlbProEsp = GXv_int16[0] ;
         A40AlbProRec = GXv_decimal11[0] ;
         A2398BarFasExt = GXv_char20[0] ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2398BarFasExt))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_110_1L4195( String Gx_mode ,
                              String A396EmprCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              java.math.BigDecimal A1262BarPreKgm ,
                              java.math.BigDecimal A1264BarPreMtr ,
                              byte A32AlbProEsp ,
                              java.math.BigDecimal A40AlbProRec ,
                              java.math.BigDecimal A2761AlbBarRec ,
                              String A2839AlbProVal ,
                              byte AV91FlagPorRec )
   {
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && ( AV91FlagPorRec == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal14[0] = A1262BarPreKgm ;
         GXv_decimal12[0] = A1264BarPreMtr ;
         GXv_int6[0] = A32AlbProEsp ;
         GXv_decimal11[0] = A40AlbProRec ;
         GXv_decimal10[0] = A2761AlbBarRec ;
         new app.pbusprr(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_decimal14, GXv_decimal12, GXv_int6, GXv_decimal11, GXv_decimal10) ;
         A396EmprCod = GXv_char20[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A1262BarPreKgm = GXv_decimal14[0] ;
         A1264BarPreMtr = GXv_decimal12[0] ;
         A32AlbProEsp = GXv_int6[0] ;
         A40AlbProRec = GXv_decimal11[0] ;
         A2761AlbBarRec = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2761AlbBarRec, (byte)(6), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_111_1L4195( String Gx_mode ,
                              String A396EmprCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              java.math.BigDecimal A1262BarPreKgm ,
                              java.math.BigDecimal A1264BarPreMtr ,
                              byte A32AlbProEsp ,
                              java.math.BigDecimal A40AlbProRec ,
                              java.math.BigDecimal A5354AlbImpMan ,
                              String A2839AlbProVal ,
                              byte AV186Carvitin )
   {
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && ( AV186Carvitin == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal14[0] = A1262BarPreKgm ;
         GXv_decimal12[0] = A1264BarPreMtr ;
         GXv_int6[0] = A32AlbProEsp ;
         GXv_decimal11[0] = A40AlbProRec ;
         GXv_decimal10[0] = A5354AlbImpMan ;
         new app.pbuspre2(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_decimal14, GXv_decimal12, GXv_int6, GXv_decimal11, GXv_decimal10) ;
         A396EmprCod = GXv_char20[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A1262BarPreKgm = GXv_decimal14[0] ;
         A1264BarPreMtr = GXv_decimal12[0] ;
         A32AlbProEsp = GXv_int6[0] ;
         A40AlbProRec = GXv_decimal11[0] ;
         A5354AlbImpMan = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5354AlbImpMan, (byte)(11), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_112_1L4195( String Gx_mode ,
                              String A396EmprCod ,
                              long A30AlbProCod ,
                              short A1458BarAlbBul ,
                              byte AV88FlagGv )
   {
      if ( true /* After */ && isIns( )  && true /* Level */ && ( AV88FlagGv == 0 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int17[0] = A30AlbProCod ;
         GXv_int21[0] = A1458BarAlbBul ;
         new app.pnumbul(remoteHandle, context).execute( GXv_char20, GXv_int17, GXv_int21) ;
         A396EmprCod = GXv_char20[0] ;
         A30AlbProCod = GXv_int17[0] ;
         A1458BarAlbBul = GXv_int21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1458BarAlbBul, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_113_1L4195( String Gx_mode ,
                              String A396EmprCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar )
   {
      if ( true /* After */ && isIns( )  )
      {
         GXv_decimal14[0] = AV151Metros ;
         GXv_decimal12[0] = A1280BarMla ;
         GXv_decimal11[0] = AV45BarKgm ;
         GXv_decimal10[0] = A1279BarKla ;
         GXv_int18[0] = AV176PzasLan ;
         GXv_int15[0] = A1292BarPlz ;
         new app.pkgsmts(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal14, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_int18, GXv_int15) ;
         AV151Metros = GXv_decimal14[0] ;
         A1280BarMla = GXv_decimal12[0] ;
         AV45BarKgm = GXv_decimal11[0] ;
         A1279BarKla = GXv_decimal10[0] ;
         AV176PzasLan = GXv_int18[0] ;
         A1292BarPlz = (short)((short)(GXv_int15[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV151Metros", GXutil.ltrimstr( AV151Metros, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV45BarKgm", GXutil.ltrimstr( AV45BarKgm, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV176PzasLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV176PzasLan), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV151Metros, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV45BarKgm, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV176PzasLan, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1292BarPlz, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_114_1L4195( String A396EmprCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              java.math.BigDecimal A1261BarAlbKgmE ,
                              java.math.BigDecimal A1263BarAlbMtrE ,
                              int A1265BarAlbPie ,
                              java.math.BigDecimal AV108KilAnt ,
                              java.math.BigDecimal AV150MetAnt ,
                              int AV165PieAnt ,
                              String AV155Modo2 ,
                              byte A213BarSit ,
                              java.util.Date AV35AlbProFch ,
                              String A1095AlbTipEnt ,
                              short A1206TubCod )
   {
      if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal14[0] = A1261BarAlbKgmE ;
         GXv_decimal12[0] = A1263BarAlbMtrE ;
         GXv_int15[0] = A1265BarAlbPie ;
         GXv_decimal11[0] = AV108KilAnt ;
         GXv_decimal10[0] = AV150MetAnt ;
         GXv_int13[0] = AV165PieAnt ;
         GXv_char3[0] = AV155Modo2 ;
         GXv_int6[0] = A213BarSit ;
         GXv_date19[0] = AV35AlbProFch ;
         GXv_char2[0] = A1095AlbTipEnt ;
         new app.pactpi1parcialtotal(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_decimal14, GXv_decimal12, GXv_int15, GXv_decimal11, GXv_decimal10, GXv_int13, GXv_char3, GXv_int6, GXv_date19, GXv_char2) ;
         A396EmprCod = GXv_char20[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A1261BarAlbKgmE = GXv_decimal14[0] ;
         A1263BarAlbMtrE = GXv_decimal12[0] ;
         A1265BarAlbPie = GXv_int15[0] ;
         AV108KilAnt = GXv_decimal11[0] ;
         AV150MetAnt = GXv_decimal10[0] ;
         AV165PieAnt = GXv_int13[0] ;
         AV155Modo2 = GXv_char3[0] ;
         A213BarSit = GXv_int6[0] ;
         AV35AlbProFch = GXv_date19[0] ;
         A1095AlbTipEnt = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV108KilAnt", GXutil.ltrimstr( AV108KilAnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV150MetAnt", GXutil.ltrimstr( AV150MetAnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV165PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV165PieAnt), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV155Modo2", AV155Modo2);
         httpContext.ajax_rsp_assign_attri("", false, "AV35AlbProFch", localUtil.format(AV35AlbProFch, "99/99/99"));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV108KilAnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV150MetAnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV165PieAnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV155Modo2))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV35AlbProFch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1095AlbTipEnt))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_115_1L4195( String A396EmprCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              java.math.BigDecimal AV38KgsHdr )
   {
      if ( true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal14[0] = AV38KgsHdr ;
         new app.pkilos(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_decimal14) ;
         A396EmprCod = GXv_char20[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char4[0] ;
         AV38KgsHdr = GXv_decimal14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV38KgsHdr", GXutil.ltrimstr( AV38KgsHdr, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV38KgsHdr, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_116_1L4195( String A396EmprCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              java.math.BigDecimal A1261BarAlbKgmE ,
                              byte AV173OkMerma ,
                              byte AV85FlagEtm ,
                              byte AV57CtrQb )
   {
      if ( true /* After */ && ( ( AV85FlagEtm == 1 ) || ( AV57CtrQb == 1 ) ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal14[0] = A1261BarAlbKgmE ;
         GXv_int6[0] = AV173OkMerma ;
         new app.pctrmer(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_decimal14, GXv_int6) ;
         A396EmprCod = GXv_char20[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A1261BarAlbKgmE = GXv_decimal14[0] ;
         AV173OkMerma = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV173OkMerma", GXutil.str( AV173OkMerma, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV173OkMerma, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_117_1L4195( String A396EmprCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              String AV171TipDis ,
                              byte AV72F_tinamar )
   {
      if ( ( AV72F_tinamar == 1 ) && true /* Level */ && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = AV171TipDis ;
         new app.pctrmaca(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_char3) ;
         A396EmprCod = GXv_char20[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char4[0] ;
         AV171TipDis = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV171TipDis", AV171TipDis);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV171TipDis))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_131_1L4195( String A396EmprCod ,
                              long A30AlbProCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              String Gx_mode ,
                              short A1206TubCod ,
                              byte AV87FlagFas ,
                              byte AV92FlagPreFas ,
                              byte AV66F_carvema )
   {
      if ( true /* After */ && true /* Level */ && ( AV87FlagFas == 1 ) && ( AV92FlagPreFas == 1 ) && ( AV66F_carvema == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int17[0] = A30AlbProCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = Gx_mode ;
         new app.pprevdltguias(remoteHandle, context).execute( GXv_char20, GXv_int17, GXv_int18, GXv_int16, GXv_char4, GXv_char3) ;
         A396EmprCod = GXv_char20[0] ;
         A30AlbProCod = GXv_int17[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char4[0] ;
         Gx_mode = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_mode))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_132_1L4195( String Gx_mode ,
                              String A396EmprCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              java.math.BigDecimal A1262BarPreKgm ,
                              java.math.BigDecimal A1264BarPreMtr ,
                              byte A32AlbProEsp ,
                              java.math.BigDecimal A40AlbProRec ,
                              java.math.BigDecimal A7994AlbDto ,
                              String A2839AlbProVal ,
                              byte AV66F_carvema )
   {
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && ( AV66F_carvema == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal14[0] = A1262BarPreKgm ;
         GXv_decimal12[0] = A1264BarPreMtr ;
         GXv_int6[0] = A32AlbProEsp ;
         GXv_decimal11[0] = A40AlbProRec ;
         GXv_decimal10[0] = A7994AlbDto ;
         new app.pprecarv(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_decimal14, GXv_decimal12, GXv_int6, GXv_decimal11, GXv_decimal10) ;
         A396EmprCod = GXv_char20[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A1262BarPreKgm = GXv_decimal14[0] ;
         A1264BarPreMtr = GXv_decimal12[0] ;
         A32AlbProEsp = GXv_int6[0] ;
         A40AlbProRec = GXv_decimal11[0] ;
         A7994AlbDto = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7994AlbDto, (byte)(6), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_133_1L4195( String Gx_mode ,
                              String A396EmprCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              String AV159Msg_ctrl ,
                              byte A213BarSit ,
                              byte AV66F_carvema )
   {
      if ( ( A213BarSit < 9 ) && true /* After */ && isIns( )  && ( AV66F_carvema == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = AV159Msg_ctrl ;
         new app.pctrlalbn(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_char3) ;
         A396EmprCod = GXv_char20[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char4[0] ;
         AV159Msg_ctrl = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV159Msg_ctrl", AV159Msg_ctrl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV159Msg_ctrl))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_140_1L4195( String A396EmprCod ,
                              long A30AlbProCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              byte AV61Erfoc )
   {
      if ( true /* Level */ && true /* After */ && ( AV61Erfoc == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int17[0] = A30AlbProCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         new app.palbrepg(remoteHandle, context).execute( GXv_char20, GXv_int17, GXv_int18, GXv_int16, GXv_char4) ;
         A396EmprCod = GXv_char20[0] ;
         A30AlbProCod = GXv_int17[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int16[0] ;
         A130BarCodPar = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_142_1L4195( String Gx_mode ,
                              String A396EmprCod ,
                              long A30AlbProCod ,
                              int A129BarCod ,
                              byte A132BarCodReo ,
                              String A130BarCodPar ,
                              java.math.BigDecimal A2761AlbBarRec ,
                              short A12905AlbCadEnc ,
                              String A7989AlbCald ,
                              int A3886AlbCliCod ,
                              String A3392AlbColNom ,
                              int A3393AlbColNum ,
                              String A7990AlbDf1 ,
                              String A7991AlbDf2 ,
                              String A7992AlbDf3 ,
                              java.math.BigDecimal A7994AlbDto ,
                              java.math.BigDecimal A7104AlbEncA ,
                              String A4815AlbEncCli ,
                              java.math.BigDecimal A7103AlbEncL ,
                              short A3271AlbHdrAnc ,
                              short A5019AlbHdrgm2 ,
                              String A2441AlbHdrObs ,
                              short A2763AlbHdrUlin ,
                              java.math.BigDecimal A5354AlbImpMan ,
                              short A6645AlbMetULi ,
                              String A7993AlbMqTj ,
                              String A12232AlbNomCli ,
                              int A12233AlbNumcli ,
                              String A6814AlbObsM ,
                              byte A32AlbProEsp ,
                              java.math.BigDecimal A40AlbProRec ,
                              String A2839AlbProVal ,
                              String A3391AlbSer ,
                              String A8879AlbSerD ,
                              short A12234AlbTipArt ,
                              byte A3394AlbTipCol ,
                              String A1095AlbTipEnt ,
                              short A1458BarAlbBul ,
                              java.math.BigDecimal A1261BarAlbKgmE ,
                              java.math.BigDecimal A1263BarAlbMtrE ,
                              int A1265BarAlbPie ,
                              short A6467BarAlbPlas ,
                              java.math.BigDecimal A1461BarAlbPN ,
                              int A1266BarAlbTub ,
                              int A12195BarAlbUnd ,
                              String A2398BarFasExt ,
                              java.math.BigDecimal A1262BarPreKgm ,
                              java.math.BigDecimal A1264BarPreMtr ,
                              java.math.BigDecimal A12196BarPreUnd ,
                              String A3153CodCod ,
                              short A1248GuiFasULin ,
                              short A6466PlasCod ,
                              short A5051TipAcaCod ,
                              short A1206TubCod ,
                              byte AV87FlagFas )
   {
      if ( ! (0==A129BarCod) && true /* After */ && isIns( )  && ! ( GXutil.strcmp(A1095AlbTipEnt, "*") == 0 ) )
      {
         new app.workaroundttrn09popup(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2761AlbBarRec, A12905AlbCadEnc, A7989AlbCald, A3886AlbCliCod, A3392AlbColNom, A3393AlbColNum, A7990AlbDf1, A7991AlbDf2, A7992AlbDf3, A7994AlbDto, A7104AlbEncA, A4815AlbEncCli, A7103AlbEncL, A3271AlbHdrAnc, A5019AlbHdrgm2, A2441AlbHdrObs, A2763AlbHdrUlin, A5354AlbImpMan, A6645AlbMetULi, A7993AlbMqTj, A12232AlbNomCli, A12233AlbNumcli, A6814AlbObsM, A32AlbProEsp, A40AlbProRec, A2839AlbProVal, A3391AlbSer, A8879AlbSerD, A12234AlbTipArt, A3394AlbTipCol, A1095AlbTipEnt, A1458BarAlbBul, A1261BarAlbKgmE, A1263BarAlbMtrE, A1265BarAlbPie, A6467BarAlbPlas, A1461BarAlbPN, A1266BarAlbTub, A12195BarAlbUnd, A2398BarFasExt, A1262BarPreKgm, A1264BarPreMtr, A12196BarPreUnd, A3153CodCod, A1248GuiFasULin, A6466PlasCod, A5051TipAcaCod, A1206TubCod, AV87FlagFas) ;
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_35195( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1L4195( ) ;
         standaloneModal1L4195( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1L4195( ) ;
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_35195( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "ALBPROVAL_" + sGXsfl_35_idx ;
      cmbAlbProVal.setName( GXCCtl );
      cmbAlbProVal.setWebtags( "" );
      cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A2839AlbProVal)==0) )
         {
            A2839AlbProVal = httpContext.getMessage( "S", "") ;
         }
      }
      GXCCtl = "BARTIPCOR_" + sGXsfl_35_idx ;
      chkBarTipCor.setName( GXCCtl );
      chkBarTipCor.setWebtags( "" );
      chkBarTipCor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "TitleCaption", chkBarTipCor.getCaption(), !bGXsfl_35_Refreshing);
      chkBarTipCor.setCheckedValue( "NO" );
      A5291BarTipCor = ((GXutil.strcmp(GXutil.rtrim( A5291BarTipCor), "SI")==0) ? "SI" : "NO") ;
      GXCCtl = "BARACC_" + sGXsfl_35_idx ;
      chkBarAcc.setName( GXCCtl );
      chkBarAcc.setWebtags( "" );
      chkBarAcc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "TitleCaption", chkBarAcc.getCaption(), !bGXsfl_35_Refreshing);
      chkBarAcc.setCheckedValue( "N" );
      A5253BarAcc = ((GXutil.strcmp(GXutil.rtrim( A5253BarAcc), "S")==0) ? "S" : "N") ;
      GXCCtl = "BARESTREO_" + sGXsfl_35_idx ;
      cmbBarEstReo.setName( GXCCtl );
      cmbBarEstReo.setWebtags( "" );
      cmbBarEstReo.addItem("0", httpContext.getMessage( "Normal", ""), (short)(0));
      cmbBarEstReo.addItem("1", httpContext.getMessage( "No Conformidad", ""), (short)(0));
      cmbBarEstReo.addItem("2", httpContext.getMessage( "Reclamacion", ""), (short)(0));
      if ( cmbBarEstReo.getItemCount() > 0 )
      {
         A148BarEstReo = (byte)(GXutil.lval( cmbBarEstReo.getValidValue(GXutil.trim( GXutil.str( A148BarEstReo, 1, 0))))) ;
      }
      GXCCtl = "DISDES_" + sGXsfl_35_idx ;
      chkDisDes.setName( GXCCtl );
      chkDisDes.setWebtags( "" );
      chkDisDes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), !bGXsfl_35_Refreshing);
      chkDisDes.setCheckedValue( "N" );
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
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

   public void valid_Guiremcli( )
   {
      /* Using cursor T01L424 */
      pr_default.execute(20, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
      }
      A1244GuiRemCln = T01L424_A1244GuiRemCln[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", GXutil.rtrim( A1244GuiRemCln));
   }

   public void valid_Barcod( )
   {
      if ( true /* Level */ && true /* After */ && isIns( )  && ( AV186Carvitin == 1 ) )
      {
         GXv_decimal14[0] = A1262BarPreKgm ;
         GXv_decimal12[0] = A1264BarPreMtr ;
         GXv_int16[0] = A32AlbProEsp ;
         GXv_decimal11[0] = A40AlbProRec ;
         GXv_char20[0] = A2398BarFasExt ;
         new app.pbuspre4(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal14, GXv_decimal12, GXv_int16, GXv_decimal11, GXv_char20) ;
         ttrn07_impl.this.A1262BarPreKgm = GXv_decimal14[0] ;
         A1262BarPreKgm = this.A1262BarPreKgm ;
         ttrn07_impl.this.A1264BarPreMtr = GXv_decimal12[0] ;
         A1264BarPreMtr = this.A1264BarPreMtr ;
         ttrn07_impl.this.A32AlbProEsp = GXv_int16[0] ;
         A32AlbProEsp = this.A32AlbProEsp ;
         ttrn07_impl.this.A40AlbProRec = GXv_decimal11[0] ;
         A40AlbProRec = this.A40AlbProRec ;
         ttrn07_impl.this.A2398BarFasExt = GXv_char20[0] ;
         A2398BarFasExt = this.A2398BarFasExt ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1262BarPreKgm", GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1264BarPreMtr", GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A32AlbProEsp", GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A40AlbProRec", GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", GXutil.rtrim( A2398BarFasExt));
   }

   public void valid_Barcodpar( )
   {
      n252CliCod = false ;
      n217BarTipArt = false ;
      n4937BarCtrPdas = false ;
      A148BarEstReo = (byte)(GXutil.lval( cmbBarEstReo.getValue())) ;
      cmbBarEstReo.setValue( GXutil.str( A148BarEstReo, 1, 0) );
      /* Using cursor T01L446 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A361DisCod = T01L446_A361DisCod[0] ;
      A1235BarNumCli = T01L446_A1235BarNumCli[0] ;
      A1234BarNomCli = T01L446_A1234BarNomCli[0] ;
      A5034BarEstTip = T01L446_A5034BarEstTip[0] ;
      A5291BarTipCor = T01L446_A5291BarTipCor[0] ;
      A5027BarGraCob = T01L446_A5027BarGraCob[0] ;
      A2010BarTipDis = T01L446_A2010BarTipDis[0] ;
      A4937BarCtrPdas = T01L446_A4937BarCtrPdas[0] ;
      n4937BarCtrPdas = T01L446_n4937BarCtrPdas[0] ;
      A5253BarAcc = T01L446_A5253BarAcc[0] ;
      A148BarEstReo = T01L446_A148BarEstReo[0] ;
      cmbBarEstReo.setValue( GXutil.str( A148BarEstReo, 1, 0) );
      A143BarDisNum = T01L446_A143BarDisNum[0] ;
      A1909BarGraAca = T01L446_A1909BarGraAca[0] ;
      A4812BarEncCli = T01L446_A4812BarEncCli[0] ;
      A1652BarSerDsc = T01L446_A1652BarSerDsc[0] ;
      A218BarTipCol = T01L446_A218BarTipCol[0] ;
      A136BarColNum = T01L446_A136BarColNum[0] ;
      A135BarColNom = T01L446_A135BarColNom[0] ;
      A1503BarPart = T01L446_A1503BarPart[0] ;
      A161BarFecSal = T01L446_A161BarFecSal[0] ;
      A125BarAncAca1 = T01L446_A125BarAncAca1[0] ;
      A213BarSit = T01L446_A213BarSit[0] ;
      A212BarSer = T01L446_A212BarSer[0] ;
      A4466BarAcaAnh = T01L446_A4466BarAcaAnh[0] ;
      A252CliCod = T01L446_A252CliCod[0] ;
      n252CliCod = T01L446_n252CliCod[0] ;
      A217BarTipArt = T01L446_A217BarTipArt[0] ;
      n217BarTipArt = T01L446_n217BarTipArt[0] ;
      pr_default.close(38);
      /* Using cursor T01L447 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A365DisDes = T01L447_A365DisDes[0] ;
      pr_default.close(39);
      if ( isIns( )  && (0==A12233AlbNumcli) && ( Gx_BScreen == 0 ) )
      {
         A12233AlbNumcli = A1235BarNumCli ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A12232AlbNomCli)==0) && ( Gx_BScreen == 0 ) )
      {
         A12232AlbNomCli = A1234BarNomCli ;
      }
      if ( isIns( )  && (0==A5019AlbHdrgm2) && ( Gx_BScreen == 0 ) )
      {
         A5019AlbHdrgm2 = A1909BarGraAca ;
      }
      A4815AlbEncCli = ((GXutil.strcmp(A4812BarEncCli, " ")!=0) ? A4812BarEncCli : A143BarDisNum) ;
      if ( isIns( )  && (GXutil.strcmp("", A8879AlbSerD)==0) && ( Gx_BScreen == 0 ) )
      {
         A8879AlbSerD = A1652BarSerDsc ;
      }
      if ( isIns( )  && (0==A3394AlbTipCol) && ( Gx_BScreen == 0 ) )
      {
         A3394AlbTipCol = A218BarTipCol ;
      }
      if ( isIns( )  && (0==A3393AlbColNum) && ( Gx_BScreen == 0 ) )
      {
         A3393AlbColNum = A136BarColNum ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A3392AlbColNom)==0) && ( Gx_BScreen == 0 ) )
      {
         A3392AlbColNom = A135BarColNom ;
      }
      if ( isIns( )  && (0==A3271AlbHdrAnc) && ( Gx_BScreen == 0 ) )
      {
         A3271AlbHdrAnc = A125BarAncAca1 ;
      }
      if ( ( A213BarSit == 9 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço está fechado", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      if ( ( A213BarSit == 11 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço está no HISTÓRICO", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A3391AlbSer)==0) && ( Gx_BScreen == 0 ) )
      {
         A3391AlbSer = A212BarSer ;
      }
      if ( isIns( )  && (0==A12905AlbCadEnc) && ( Gx_BScreen == 0 ) )
      {
         A12905AlbCadEnc = A4466BarAcaAnh ;
      }
      if ( isIns( )  && (0==A3886AlbCliCod) && ( Gx_BScreen == 0 ) )
      {
         A3886AlbCliCod = A252CliCod ;
      }
      if ( ( A252CliCod != A1243GuiRemCli ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente errado", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      if ( isIns( )  && (0==A12234AlbTipArt) && ( Gx_BScreen == 0 ) )
      {
         A12234AlbTipArt = A217BarTipArt ;
      }
      /* Using cursor T01L449 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(40) != 101) )
      {
         A1280BarMla = T01L449_A1280BarMla[0] ;
         A1279BarKla = T01L449_A1279BarKla[0] ;
         A1292BarPlz = T01L449_A1292BarPlz[0] ;
      }
      else
      {
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
         A1292BarPlz = (short)(0) ;
      }
      pr_default.close(40);
      /* Using cursor T01L451 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(41) != 101) )
      {
         A898BarPieNDes = T01L451_A898BarPieNDes[0] ;
         A199BarPie1 = T01L451_A199BarPie1[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         A199BarPie1 = (short)(0) ;
      }
      pr_default.close(41);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
      }
      else
      {
         A198BarPie = A199BarPie1 ;
      }
      if ( true /* After */ && ( AV152Moda21 == 0 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = AV158Msg_acc ;
         new app.pctrlacc(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_char3) ;
         ttrn07_impl.this.A396EmprCod = GXv_char20[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrn07_impl.this.A129BarCod = GXv_int18[0] ;
         A129BarCod = this.A129BarCod ;
         ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         ttrn07_impl.this.A130BarCodPar = GXv_char4[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         ttrn07_impl.this.AV158Msg_acc = GXv_char3[0] ;
         AV158Msg_acc = this.AV158Msg_acc ;
      }
      if ( true /* After */ && isIns( )  )
      {
         GXv_decimal14[0] = AV151Metros ;
         GXv_decimal12[0] = A1280BarMla ;
         GXv_decimal11[0] = AV45BarKgm ;
         GXv_decimal10[0] = A1279BarKla ;
         GXv_int18[0] = AV176PzasLan ;
         GXv_int15[0] = A1292BarPlz ;
         new app.pkgsmts(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal14, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_int18, GXv_int15) ;
         ttrn07_impl.this.AV151Metros = GXv_decimal14[0] ;
         AV151Metros = this.AV151Metros ;
         ttrn07_impl.this.A1280BarMla = GXv_decimal12[0] ;
         A1280BarMla = this.A1280BarMla ;
         ttrn07_impl.this.AV45BarKgm = GXv_decimal11[0] ;
         AV45BarKgm = this.AV45BarKgm ;
         ttrn07_impl.this.A1279BarKla = GXv_decimal10[0] ;
         A1279BarKla = this.A1279BarKla ;
         ttrn07_impl.this.AV176PzasLan = GXv_int18[0] ;
         AV176PzasLan = this.AV176PzasLan ;
         ttrn07_impl.this.A1292BarPlz = (short)((short)(GXv_int15[0])) ;
         A1292BarPlz = this.A1292BarPlz ;
      }
      if ( isIns( )  && ( AV45BarKgm.doubleValue() >= 0 ) )
      {
         A1261BarAlbKgmE = AV45BarKgm ;
      }
      if ( isIns( )  && ( AV176PzasLan >= 0 ) )
      {
         A1265BarAlbPie = AV176PzasLan ;
      }
      if ( true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal14[0] = AV38KgsHdr ;
         new app.pkilos(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_decimal14) ;
         ttrn07_impl.this.A396EmprCod = GXv_char20[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrn07_impl.this.A129BarCod = GXv_int18[0] ;
         A129BarCod = this.A129BarCod ;
         ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         ttrn07_impl.this.A130BarCodPar = GXv_char4[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         ttrn07_impl.this.AV38KgsHdr = GXv_decimal14[0] ;
         AV38KgsHdr = this.AV38KgsHdr ;
      }
      if ( ( AV72F_tinamar == 1 ) && true /* Level */ && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = AV171TipDis ;
         new app.pctrmaca(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_char3) ;
         ttrn07_impl.this.A396EmprCod = GXv_char20[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrn07_impl.this.A129BarCod = GXv_int18[0] ;
         A129BarCod = this.A129BarCod ;
         ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         ttrn07_impl.this.A130BarCodPar = GXv_char4[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         ttrn07_impl.this.AV171TipDis = GXv_char3[0] ;
         AV171TipDis = this.AV171TipDis ;
      }
      if ( ( AV72F_tinamar == 1 ) && true /* Level */ && true /* After */ && ( GXutil.strcmp(AV36AlbSec, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV171TipDis, "2") != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta OS nao es Malha Acabada", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      if ( ( AV72F_tinamar == 1 ) && true /* Level */ && true /* After */ && ( GXutil.strcmp(AV36AlbSec, httpContext.getMessage( "S", "")) != 0 ) && ( GXutil.strcmp(AV171TipDis, "2") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta OS es Malha Acabada i la GR es Malha NO Acabada", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      if ( ( GXutil.strcmp(AV158Msg_acc, " ") != 0 ) && true /* After */ && ( AV70F_moda21 == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV158Msg_acc, 0, "BARCODPAR");
      }
      if ( true /* After */ && (0==A129BarCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Errado", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      if ( ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço com detalhe de peças", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      if ( ( A213BarSit < 9 ) && true /* After */ && isIns( )  && ( AV66F_carvema == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = AV159Msg_ctrl ;
         new app.pctrlalbn(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_char3) ;
         ttrn07_impl.this.A396EmprCod = GXv_char20[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrn07_impl.this.A129BarCod = GXv_int18[0] ;
         A129BarCod = this.A129BarCod ;
         ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         ttrn07_impl.this.A130BarCodPar = GXv_char4[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         ttrn07_impl.this.AV159Msg_ctrl = GXv_char3[0] ;
         AV159Msg_ctrl = this.AV159Msg_ctrl ;
      }
      if ( ( A213BarSit < 9 ) && true /* After */ && ( GXutil.strcmp(AV159Msg_ctrl, " ") != 0 ) && isIns( )  && ( AV66F_carvema == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV159Msg_ctrl, 0, "BARCODPAR");
      }
      if ( ( AV66F_carvema == 1 ) && ( GXutil.strcmp(A5034BarEstTip, httpContext.getMessage( "S", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atençao. Esta OS tem Debito Condicionado !!!", ""), 0, "BARCODPAR");
      }
      if ( ( A5027BarGraCob == 2 ) && ( AV66F_carvema == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atençao. Malha com Cartao Vermelho ¡¡¡", ""), 0, "BARCODPAR");
      }
      if ( ( A4937BarCtrPdas == 1 ) && ( AV66F_carvema == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Esta OS tem peças que ramularam a frente¡¡¡", ""), 0, "BARCODPAR");
      }
      dynload_actions( ) ;
      A5291BarTipCor = ((GXutil.strcmp(GXutil.rtrim( A5291BarTipCor), "SI")==0) ? "SI" : "NO") ;
      A5253BarAcc = ((GXutil.strcmp(GXutil.rtrim( A5253BarAcc), "S")==0) ? "S" : "N") ;
      if ( cmbBarEstReo.getItemCount() > 0 )
      {
         A148BarEstReo = (byte)(GXutil.lval( cmbBarEstReo.getValidValue(GXutil.trim( GXutil.str( A148BarEstReo, 1, 0))))) ;
         cmbBarEstReo.setValue( GXutil.str( A148BarEstReo, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbBarEstReo.setValue( GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)) );
      }
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", GXutil.rtrim( A1234BarNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A5034BarEstTip", GXutil.rtrim( A5034BarEstTip));
      httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", GXutil.rtrim( A5291BarTipCor));
      httpContext.ajax_rsp_assign_attri("", false, "A5027BarGraCob", GXutil.ltrim( localUtil.ntoc( A5027BarGraCob, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", GXutil.rtrim( A2010BarTipDis));
      httpContext.ajax_rsp_assign_attri("", false, "A4937BarCtrPdas", GXutil.ltrim( localUtil.ntoc( A4937BarCtrPdas, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5253BarAcc", GXutil.rtrim( A5253BarAcc));
      httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), ".", "")));
      cmbBarEstReo.setValue( GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Values", cmbBarEstReo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", GXutil.rtrim( A143BarDisNum));
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", GXutil.rtrim( A4812BarEncCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", GXutil.rtrim( A1652BarSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1503BarPart", GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A161BarFecSal", localUtil.format(A161BarFecSal, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A12233AlbNumcli", GXutil.ltrim( localUtil.ntoc( A12233AlbNumcli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", GXutil.rtrim( A12232AlbNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", GXutil.rtrim( A4815AlbEncCli));
      httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", GXutil.rtrim( A8879AlbSerD));
      httpContext.ajax_rsp_assign_attri("", false, "A3394AlbTipCol", GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", GXutil.rtrim( A3392AlbColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", GXutil.rtrim( A3391AlbSer));
      httpContext.ajax_rsp_assign_attri("", false, "A12905AlbCadEnc", GXutil.ltrim( localUtil.ntoc( A12905AlbCadEnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3886AlbCliCod", GXutil.ltrim( localUtil.ntoc( A3886AlbCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12234AlbTipArt", GXutil.ltrim( localUtil.ntoc( A12234AlbTipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV158Msg_acc", GXutil.rtrim( AV158Msg_acc));
      httpContext.ajax_rsp_assign_attri("", false, "AV151Metros", GXutil.ltrim( localUtil.ntoc( AV151Metros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV45BarKgm", GXutil.ltrim( localUtil.ntoc( AV45BarKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV176PzasLan", GXutil.ltrim( localUtil.ntoc( AV176PzasLan, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrim( localUtil.ntoc( A1292BarPlz, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV38KgsHdr", GXutil.ltrim( localUtil.ntoc( AV38KgsHdr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV171TipDis", GXutil.rtrim( AV171TipDis));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "AV159Msg_ctrl", GXutil.rtrim( AV159Msg_ctrl));
   }

   public void valid_Codcod( )
   {
      n3153CodCod = false ;
      /* Using cursor T01L464 */
      pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n3153CodCod), A3153CodCod});
      if ( (pr_default.getStatus(54) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3153CodCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCodCod_Internalname ;
         }
      }
      pr_default.close(54);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Baralbkgme( )
   {
      AV108KilAnt = O1261BarAlbKgmE ;
      if ( true /* After */ )
      {
         AV163Msg_k = httpContext.getMessage( httpContext.getMessage( "Os quilos saidos= ", ""), "") + GXutil.str( A1261BarAlbKgmE, 9, 2) + httpContext.getMessage( httpContext.getMessage( ", são maiores do que os quilos da OS= ", ""), "") + GXutil.str( AV38KgsHdr, 9, 2) ;
      }
      if ( true /* After */ && ( ( AV85FlagEtm == 1 ) || ( AV57CtrQb == 1 ) ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal14[0] = A1261BarAlbKgmE ;
         GXv_int6[0] = AV173OkMerma ;
         new app.pctrmer(remoteHandle, context).execute( GXv_char20, GXv_int18, GXv_int16, GXv_char4, GXv_decimal14, GXv_int6) ;
         ttrn07_impl.this.A396EmprCod = GXv_char20[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrn07_impl.this.A129BarCod = GXv_int18[0] ;
         A129BarCod = this.A129BarCod ;
         ttrn07_impl.this.A132BarCodReo = GXv_int16[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         ttrn07_impl.this.A130BarCodPar = GXv_char4[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         ttrn07_impl.this.A1261BarAlbKgmE = GXv_decimal14[0] ;
         A1261BarAlbKgmE = this.A1261BarAlbKgmE ;
         ttrn07_impl.this.AV173OkMerma = GXv_int6[0] ;
         AV173OkMerma = this.AV173OkMerma ;
      }
      if ( true /* After */ && ( ( AV85FlagEtm == 1 ) || ( AV57CtrQb == 1 ) ) && ( AV173OkMerma == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. Supera la Quebra", ""), 1, "BARALBKGME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
      }
      if ( ( ( AV152Moda21 == 1 ) ) && ( DecimalUtil.compareTo(A1261BarAlbKgmE, AV38KgsHdr) > 0 ) && ( AV63errkgs == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV163Msg_k, 1, "BARALBKGME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
      }
      if ( ( ( AV152Moda21 == 1 ) || ( AV66F_carvema == 1 ) ) && ( DecimalUtil.compareTo(A1261BarAlbKgmE, AV38KgsHdr) > 0 ) && ( AV63errkgs == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV163Msg_k, 0, "BARALBKGME");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV108KilAnt", GXutil.ltrim( localUtil.ntoc( AV108KilAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV163Msg_k", GXutil.rtrim( AV163Msg_k));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV173OkMerma", GXutil.ltrim( localUtil.ntoc( AV173OkMerma, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Baralbmtre( )
   {
      AV150MetAnt = O1263BarAlbMtrE ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV150MetAnt", GXutil.ltrim( localUtil.ntoc( AV150MetAnt, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Baralbpie( )
   {
      if ( isIns( )  && (0==A1266BarAlbTub) && ( Gx_BScreen == 0 ) )
      {
         A1266BarAlbTub = A1265BarAlbPie ;
      }
      AV165PieAnt = O1265BarAlbPie ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV165PieAnt", GXutil.ltrim( localUtil.ntoc( AV165PieAnt, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Tubcod( )
   {
      n1206TubCod = false ;
      /* Using cursor T01L465 */
      pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod)});
      if ( (pr_default.getStatus(55) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1206TubCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TUBOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TUBCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTubCod_Internalname ;
         }
      }
      pr_default.close(55);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Albtipent( )
   {
      n1206TubCod = false ;
      n6466PlasCod = false ;
      n3153CodCod = false ;
      A2839AlbProVal = cmbAlbProVal.getValue() ;
      if ( true /* After */ && ( GXutil.strcmp(A1095AlbTipEnt, "*") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Incorrecto", ""), 1, "ALBTIPENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbTipEnt_Internalname ;
      }
      if ( ! (0==A129BarCod) && true /* After */ && isIns( )  && ! ( GXutil.strcmp(A1095AlbTipEnt, "*") == 0 ) )
      {
         new app.workaroundttrn09popup(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2761AlbBarRec, A12905AlbCadEnc, A7989AlbCald, A3886AlbCliCod, A3392AlbColNom, A3393AlbColNum, A7990AlbDf1, A7991AlbDf2, A7992AlbDf3, A7994AlbDto, A7104AlbEncA, A4815AlbEncCli, A7103AlbEncL, A3271AlbHdrAnc, A5019AlbHdrgm2, A2441AlbHdrObs, A2763AlbHdrUlin, A5354AlbImpMan, A6645AlbMetULi, A7993AlbMqTj, A12232AlbNomCli, A12233AlbNumcli, A6814AlbObsM, A32AlbProEsp, A40AlbProRec, A2839AlbProVal, A3391AlbSer, A8879AlbSerD, A12234AlbTipArt, A3394AlbTipCol, A1095AlbTipEnt, A1458BarAlbBul, A1261BarAlbKgmE, A1263BarAlbMtrE, A1265BarAlbPie, A6467BarAlbPlas, A1461BarAlbPN, A1266BarAlbTub, A12195BarAlbUnd, A2398BarFasExt, A1262BarPreKgm, A1264BarPreMtr, A12196BarPreUnd, A3153CodCod, A1248GuiFasULin, A6466PlasCod, A5051TipAcaCod, A1206TubCod, AV87FlagFas) ;
      }
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV198EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV199AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV191TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV198EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV199AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121L42',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV191TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV212NombreParametro',fld:'vNOMBREPARAMETRO',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV212NombreParametro',fld:'vNOMBREPARAMETRO',pic:''}]}");
      setEventMetadata("'DOREGRESAR'","{handler:'e131L42',iparms:[{av:'AV212NombreParametro',fld:'vNOMBREPARAMETRO',pic:''}]");
      setEventMetadata("'DOREGRESAR'",",oparms:[{av:'AV212NombreParametro',fld:'vNOMBREPARAMETRO',pic:''}]}");
      setEventMetadata("'DOFASES'","{handler:'e141L42',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("'DOFASES'",",oparms:[]}");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO","{handler:'e151L42',iparms:[{av:'AV211Refrescar',fld:'vREFRESCAR',pic:''},{av:'AV206ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV198EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV199AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO",",oparms:[]}");
      setEventMetadata("VALID_EMPRGUIREM","{handler:'valid_Emprguirem',iparms:[]");
      setEventMetadata("VALID_EMPRGUIREM",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''}]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''}]}");
      setEventMetadata("VALID_ALBLIC","{handler:'valid_Alblic',iparms:[]");
      setEventMetadata("VALID_ALBLIC",",oparms:[]}");
      setEventMetadata("VALID_ALBENVFTP","{handler:'valid_Albenvftp',iparms:[]");
      setEventMetadata("VALID_ALBENVFTP",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[{av:'AV186Carvitin',fld:'vCARVITIN',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999'},{av:'A1264BarPreMtr',fld:'BARPREMTR',pic:'ZZZZZZ9.999'},{av:'A32AlbProEsp',fld:'ALBPROESP',pic:'99'},{av:'A40AlbProRec',fld:'ALBPROREC',pic:'ZZZZZZ9.99'},{av:'A2398BarFasExt',fld:'BARFASEXT',pic:''}]");
      setEventMetadata("VALID_BARCOD",",oparms:[{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999'},{av:'A1264BarPreMtr',fld:'BARPREMTR',pic:'ZZZZZZ9.999'},{av:'A32AlbProEsp',fld:'ALBPROESP',pic:'99'},{av:'A40AlbProRec',fld:'ALBPROREC',pic:'ZZZZZZ9.99'},{av:'A2398BarFasExt',fld:'BARFASEXT',pic:''}]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'AV66F_carvema',fld:'vF_CARVEMA',pic:'9'},{av:'AV72F_tinamar',fld:'vF_TINAMAR',pic:'9'},{av:'AV152Moda21',fld:'vMODA21',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1909BarGraAca',fld:'BARGRAACA',pic:'ZZZ9'},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'AV45BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV176PzasLan',fld:'vPZASLAN',pic:'ZZZZZ9'},{av:'A5034BarEstTip',fld:'BARESTTIP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5027BarGraCob',fld:'BARGRACOB',pic:'Z9'},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A4937BarCtrPdas',fld:'BARCTRPDAS',pic:'9'},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'cmbBarEstReo'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A1503BarPart',fld:'BARPART',pic:'ZZZ9'},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A12233AlbNumcli',fld:'ALBNUMCLI',pic:'ZZZZZ9'},{av:'A12232AlbNomCli',fld:'ALBNOMCLI',pic:''},{av:'A5019AlbHdrgm2',fld:'ALBHDRGM2',pic:'ZZZ9'},{av:'A4815AlbEncCli',fld:'ALBENCCLI',pic:''},{av:'A8879AlbSerD',fld:'ALBSERD',pic:''},{av:'A3394AlbTipCol',fld:'ALBTIPCOL',pic:'Z9'},{av:'A3393AlbColNum',fld:'ALBCOLNUM',pic:'ZZZZZ9'},{av:'A3392AlbColNom',fld:'ALBCOLNOM',pic:''},{av:'A3271AlbHdrAnc',fld:'ALBHDRANC',pic:'ZZZ9'},{av:'A3391AlbSer',fld:'ALBSER',pic:''},{av:'A12905AlbCadEnc',fld:'ALBCADENC',pic:'ZZZ9'},{av:'A3886AlbCliCod',fld:'ALBCLICOD',pic:'ZZZZZ9'},{av:'A12234AlbTipArt',fld:'ALBTIPART',pic:'ZZZ9'},{av:'A1280BarMla',fld:'BARMLA',pic:'ZZZZZ9.99'},{av:'A1279BarKla',fld:'BARKLA',pic:'ZZZZZ9.99'},{av:'A1292BarPlz',fld:'BARPLZ',pic:'ZZZ9'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'AV158Msg_acc',fld:'vMSG_ACC',pic:''},{av:'AV151Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV38KgsHdr',fld:'vKGSHDR',pic:'ZZZZZ9.99'},{av:'AV171TipDis',fld:'vTIPDIS',pic:'@!'},{av:'AV159Msg_ctrl',fld:'vMSG_CTRL',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A5034BarEstTip',fld:'BARESTTIP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5027BarGraCob',fld:'BARGRACOB',pic:'Z9'},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A4937BarCtrPdas',fld:'BARCTRPDAS',pic:'9'},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'cmbBarEstReo'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A1909BarGraAca',fld:'BARGRAACA',pic:'ZZZ9'},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A1503BarPart',fld:'BARPART',pic:'ZZZ9'},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A12233AlbNumcli',fld:'ALBNUMCLI',pic:'ZZZZZ9'},{av:'A12232AlbNomCli',fld:'ALBNOMCLI',pic:''},{av:'A5019AlbHdrgm2',fld:'ALBHDRGM2',pic:'ZZZ9'},{av:'A4815AlbEncCli',fld:'ALBENCCLI',pic:''},{av:'A8879AlbSerD',fld:'ALBSERD',pic:''},{av:'A3394AlbTipCol',fld:'ALBTIPCOL',pic:'Z9'},{av:'A3393AlbColNum',fld:'ALBCOLNUM',pic:'ZZZZZ9'},{av:'A3392AlbColNom',fld:'ALBCOLNOM',pic:''},{av:'A3271AlbHdrAnc',fld:'ALBHDRANC',pic:'ZZZ9'},{av:'A3391AlbSer',fld:'ALBSER',pic:''},{av:'A12905AlbCadEnc',fld:'ALBCADENC',pic:'ZZZ9'},{av:'A3886AlbCliCod',fld:'ALBCLICOD',pic:'ZZZZZ9'},{av:'A12234AlbTipArt',fld:'ALBTIPART',pic:'ZZZ9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV158Msg_acc',fld:'vMSG_ACC',pic:''},{av:'AV151Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'A1280BarMla',fld:'BARMLA',pic:'ZZZZZ9.99'},{av:'AV45BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'A1279BarKla',fld:'BARKLA',pic:'ZZZZZ9.99'},{av:'AV176PzasLan',fld:'vPZASLAN',pic:'ZZZZZ9'},{av:'A1292BarPlz',fld:'BARPLZ',pic:'ZZZ9'},{av:'AV38KgsHdr',fld:'vKGSHDR',pic:'ZZZZZ9.99'},{av:'AV171TipDis',fld:'vTIPDIS',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV159Msg_ctrl',fld:'vMSG_CTRL',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CODCOD","{handler:'valid_Codcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3153CodCod',fld:'CODCOD',pic:'XXXXXX'}]");
      setEventMetadata("VALID_CODCOD",",oparms:[]}");
      setEventMetadata("VALID_BARALBKGME","{handler:'valid_Baralbkgme',iparms:[{av:'AV57CtrQb',fld:'vCTRQB',pic:'9'},{av:'AV85FlagEtm',fld:'vFLAGETM',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'O1261BarAlbKgmE'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'AV108KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV163Msg_k',fld:'vMSG_K',pic:''},{av:'AV173OkMerma',fld:'vOKMERMA',pic:'9'}]");
      setEventMetadata("VALID_BARALBKGME",",oparms:[{av:'AV108KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV163Msg_k',fld:'vMSG_K',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'AV173OkMerma',fld:'vOKMERMA',pic:'9'}]}");
      setEventMetadata("VALID_BARPREKGM","{handler:'valid_Barprekgm',iparms:[]");
      setEventMetadata("VALID_BARPREKGM",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRGM2","{handler:'valid_Albhdrgm2',iparms:[]");
      setEventMetadata("VALID_ALBHDRGM2",",oparms:[]}");
      setEventMetadata("VALID_BARALBMTRE","{handler:'valid_Baralbmtre',iparms:[{av:'O1263BarAlbMtrE'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV150MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_BARALBMTRE",",oparms:[{av:'AV150MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_BARPREMTR","{handler:'valid_Barpremtr',iparms:[]");
      setEventMetadata("VALID_BARPREMTR",",oparms:[]}");
      setEventMetadata("VALID_BARALBPIE","{handler:'valid_Baralbpie',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O1265BarAlbPie'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A1266BarAlbTub',fld:'BARALBTUB',pic:'ZZZ9'},{av:'AV165PieAnt',fld:'vPIEANT',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARALBPIE",",oparms:[{av:'A1266BarAlbTub',fld:'BARALBTUB',pic:'ZZZ9'},{av:'AV165PieAnt',fld:'vPIEANT',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_TUBCOD","{handler:'valid_Tubcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1206TubCod',fld:'TUBCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_TUBCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROVAL","{handler:'valid_Albproval',iparms:[]");
      setEventMetadata("VALID_ALBPROVAL",",oparms:[]}");
      setEventMetadata("VALID_ALBTIPENT","{handler:'valid_Albtipent',iparms:[{av:'AV87FlagFas',fld:'vFLAGFAS',pic:'9'},{av:'A1206TubCod',fld:'TUBCOD',pic:'ZZZ9'},{av:'A5051TipAcaCod',fld:'TIPACACOD',pic:'ZZZ9'},{av:'A6466PlasCod',fld:'PLASCOD',pic:'ZZZ9'},{av:'A1248GuiFasULin',fld:'GUIFASULIN',pic:'ZZZ9'},{av:'A3153CodCod',fld:'CODCOD',pic:'XXXXXX'},{av:'A12196BarPreUnd',fld:'BARPREUND',pic:'ZZZZZZ9.99999'},{av:'A1264BarPreMtr',fld:'BARPREMTR',pic:'ZZZZZZ9.999'},{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999'},{av:'A2398BarFasExt',fld:'BARFASEXT',pic:''},{av:'A12195BarAlbUnd',fld:'BARALBUND',pic:'ZZZZZ9'},{av:'A1266BarAlbTub',fld:'BARALBTUB',pic:'ZZZ9'},{av:'A1461BarAlbPN',fld:'BARALBPN',pic:'ZZZZZ9.99'},{av:'A6467BarAlbPlas',fld:'BARALBPLAS',pic:'ZZZ9'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1458BarAlbBul',fld:'BARALBBUL',pic:'ZZZ9'},{av:'A3394AlbTipCol',fld:'ALBTIPCOL',pic:'Z9'},{av:'A12234AlbTipArt',fld:'ALBTIPART',pic:'ZZZ9'},{av:'A8879AlbSerD',fld:'ALBSERD',pic:''},{av:'A3391AlbSer',fld:'ALBSER',pic:''},{av:'cmbAlbProVal'},{av:'A2839AlbProVal',fld:'ALBPROVAL',pic:'@!'},{av:'A40AlbProRec',fld:'ALBPROREC',pic:'ZZZZZZ9.99'},{av:'A32AlbProEsp',fld:'ALBPROESP',pic:'99'},{av:'A6814AlbObsM',fld:'ALBOBSM',pic:''},{av:'A12233AlbNumcli',fld:'ALBNUMCLI',pic:'ZZZZZ9'},{av:'A12232AlbNomCli',fld:'ALBNOMCLI',pic:''},{av:'A7993AlbMqTj',fld:'ALBMQTJ',pic:''},{av:'A6645AlbMetULi',fld:'ALBMETULI',pic:'ZZZ9'},{av:'A5354AlbImpMan',fld:'ALBIMPMAN',pic:'ZZZZZZZ9.99'},{av:'A2763AlbHdrUlin',fld:'ALBHDRULIN',pic:'ZZZ9'},{av:'A2441AlbHdrObs',fld:'ALBHDROBS',pic:''},{av:'A5019AlbHdrgm2',fld:'ALBHDRGM2',pic:'ZZZ9'},{av:'A3271AlbHdrAnc',fld:'ALBHDRANC',pic:'ZZZ9'},{av:'A7103AlbEncL',fld:'ALBENCL',pic:'ZZZ9.99'},{av:'A4815AlbEncCli',fld:'ALBENCCLI',pic:''},{av:'A7104AlbEncA',fld:'ALBENCA',pic:'ZZZ9.99'},{av:'A7994AlbDto',fld:'ALBDTO',pic:'Z9.999'},{av:'A7992AlbDf3',fld:'ALBDF3',pic:''},{av:'A7991AlbDf2',fld:'ALBDF2',pic:''},{av:'A7990AlbDf1',fld:'ALBDF1',pic:''},{av:'A3393AlbColNum',fld:'ALBCOLNUM',pic:'ZZZZZ9'},{av:'A3392AlbColNom',fld:'ALBCOLNOM',pic:''},{av:'A3886AlbCliCod',fld:'ALBCLICOD',pic:'ZZZZZ9'},{av:'A7989AlbCald',fld:'ALBCALD',pic:''},{av:'A12905AlbCadEnc',fld:'ALBCADENC',pic:'ZZZ9'},{av:'A2761AlbBarRec',fld:'ALBBARREC',pic:'ZZ9.99'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A1095AlbTipEnt',fld:'ALBTIPENT',pic:'@!'}]");
      setEventMetadata("VALID_ALBTIPENT",",oparms:[]}");
      setEventMetadata("VALID_BARTIPART","{handler:'valid_Bartipart',iparms:[]");
      setEventMetadata("VALID_BARTIPART",",oparms:[]}");
      setEventMetadata("VALID_BARNUMCLI","{handler:'valid_Barnumcli',iparms:[]");
      setEventMetadata("VALID_BARNUMCLI",",oparms:[]}");
      setEventMetadata("VALID_BARNOMCLI","{handler:'valid_Barnomcli',iparms:[]");
      setEventMetadata("VALID_BARNOMCLI",",oparms:[]}");
      setEventMetadata("VALID_ALBDTO","{handler:'valid_Albdto',iparms:[]");
      setEventMetadata("VALID_ALBDTO",",oparms:[]}");
      setEventMetadata("VALID_ALBBARREC","{handler:'valid_Albbarrec',iparms:[]");
      setEventMetadata("VALID_ALBBARREC",",oparms:[]}");
      setEventMetadata("VALID_ALBIMPMAN","{handler:'valid_Albimpman',iparms:[]");
      setEventMetadata("VALID_ALBIMPMAN",",oparms:[]}");
      setEventMetadata("VALID_BARDISNUM","{handler:'valid_Bardisnum',iparms:[]");
      setEventMetadata("VALID_BARDISNUM",",oparms:[]}");
      setEventMetadata("VALID_BARGRAACA","{handler:'valid_Bargraaca',iparms:[]");
      setEventMetadata("VALID_BARGRAACA",",oparms:[]}");
      setEventMetadata("VALID_BARENCCLI","{handler:'valid_Barenccli',iparms:[]");
      setEventMetadata("VALID_BARENCCLI",",oparms:[]}");
      setEventMetadata("VALID_BARSERDSC","{handler:'valid_Barserdsc',iparms:[]");
      setEventMetadata("VALID_BARSERDSC",",oparms:[]}");
      setEventMetadata("VALID_BARTIPCOL","{handler:'valid_Bartipcol',iparms:[]");
      setEventMetadata("VALID_BARTIPCOL",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNUM","{handler:'valid_Barcolnum',iparms:[]");
      setEventMetadata("VALID_BARCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNOM","{handler:'valid_Barcolnom',iparms:[]");
      setEventMetadata("VALID_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_DISDES","{handler:'valid_Disdes',iparms:[]");
      setEventMetadata("VALID_DISDES",",oparms:[]}");
      setEventMetadata("VALID_ALBPROREC","{handler:'valid_Albprorec',iparms:[]");
      setEventMetadata("VALID_ALBPROREC",",oparms:[]}");
      setEventMetadata("VALID_ALBPROESP","{handler:'valid_Albproesp',iparms:[]");
      setEventMetadata("VALID_ALBPROESP",",oparms:[]}");
      setEventMetadata("VALID_BARANCACA1","{handler:'valid_Barancaca1',iparms:[]");
      setEventMetadata("VALID_BARANCACA1",",oparms:[]}");
      setEventMetadata("VALID_BARSIT","{handler:'valid_Barsit',iparms:[]");
      setEventMetadata("VALID_BARSIT",",oparms:[]}");
      setEventMetadata("VALID_BARSER","{handler:'valid_Barser',iparms:[]");
      setEventMetadata("VALID_BARSER",",oparms:[]}");
      setEventMetadata("VALID_BARACAANH","{handler:'valid_Baracaanh',iparms:[]");
      setEventMetadata("VALID_BARACAANH",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albcadenc',iparms:[]");
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
      pr_default.close(38);
      pr_default.close(55);
      pr_default.close(54);
      pr_default.close(39);
      pr_default.close(40);
      pr_default.close(41);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV198EmprCod = "" ;
      Z396EmprCod = "" ;
      Z7101AlbLic = "" ;
      Z1253EmprGuiRem = "" ;
      N1253EmprGuiRem = "" ;
      Z130BarCodPar = "" ;
      Z2839AlbProVal = "" ;
      Z3392AlbColNom = "" ;
      Z3391AlbSer = "" ;
      Z8879AlbSerD = "" ;
      Z12232AlbNomCli = "" ;
      Z4815AlbEncCli = "" ;
      Z1095AlbTipEnt = "" ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z1262BarPreKgm = DecimalUtil.ZERO ;
      Z1264BarPreMtr = DecimalUtil.ZERO ;
      Z40AlbProRec = DecimalUtil.ZERO ;
      Z2398BarFasExt = "" ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z2441AlbHdrObs = "" ;
      Z12196BarPreUnd = DecimalUtil.ZERO ;
      Z1461BarAlbPN = DecimalUtil.ZERO ;
      Z7994AlbDto = DecimalUtil.ZERO ;
      Z7993AlbMqTj = "" ;
      Z7992AlbDf3 = "" ;
      Z7991AlbDf2 = "" ;
      Z7990AlbDf1 = "" ;
      Z7989AlbCald = "" ;
      Z7104AlbEncA = DecimalUtil.ZERO ;
      Z7103AlbEncL = DecimalUtil.ZERO ;
      Z6814AlbObsM = "" ;
      Z2761AlbBarRec = DecimalUtil.ZERO ;
      Z5354AlbImpMan = DecimalUtil.ZERO ;
      Z3153CodCod = "" ;
      O1263BarAlbMtrE = DecimalUtil.ZERO ;
      O1261BarAlbKgmE = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV158Msg_acc = "" ;
      Gx_mode = "" ;
      A2839AlbProVal = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV108KilAnt = DecimalUtil.ZERO ;
      AV150MetAnt = DecimalUtil.ZERO ;
      AV155Modo2 = "" ;
      AV35AlbProFch = GXutil.nullDate() ;
      A1095AlbTipEnt = "" ;
      AV38KgsHdr = DecimalUtil.ZERO ;
      AV171TipDis = "" ;
      A7994AlbDto = DecimalUtil.ZERO ;
      AV159Msg_ctrl = "" ;
      A7989AlbCald = "" ;
      A3392AlbColNom = "" ;
      A7990AlbDf1 = "" ;
      A7991AlbDf2 = "" ;
      A7992AlbDf3 = "" ;
      A7104AlbEncA = DecimalUtil.ZERO ;
      A4815AlbEncCli = "" ;
      A7103AlbEncL = DecimalUtil.ZERO ;
      A2441AlbHdrObs = "" ;
      A7993AlbMqTj = "" ;
      A12232AlbNomCli = "" ;
      A6814AlbObsM = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A2398BarFasExt = "" ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A3153CodCod = "" ;
      A1253EmprGuiRem = "" ;
      AV198EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtnregresar_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucDvpanel_panelfases = new com.genexus.webpanels.GXUserControl();
      bttBtnfases_Jsonclick = "" ;
      A7101AlbLic = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode195 = "" ;
      sStyleString = "" ;
      AV203Insert_EmprGuiRem = "" ;
      A1244GuiRemCln = "" ;
      A407EmprNom = "" ;
      AV220Pgmname = "" ;
      AV45BarKgm = DecimalUtil.ZERO ;
      AV163Msg_k = "" ;
      AV151Metros = DecimalUtil.ZERO ;
      AV36AlbSec = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_panelfases_Objectcall = "" ;
      Dvpanel_panelfases_Class = "" ;
      Dvpanel_panelfases_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode3 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A1234BarNomCli = "" ;
      A5034BarEstTip = "" ;
      A5291BarTipCor = "" ;
      A2010BarTipDis = "" ;
      A5253BarAcc = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A365DisDes = "" ;
      A1279BarKla = DecimalUtil.ZERO ;
      A1280BarMla = DecimalUtil.ZERO ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      T1263BarAlbMtrE = DecimalUtil.ZERO ;
      T1261BarAlbKgmE = DecimalUtil.ZERO ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      AV190WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV191TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV192WebSession = httpContext.getWebSession();
      AV197TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV212NombreParametro = "" ;
      GXv_boolean9 = new boolean[1] ;
      AV206ObjetoRefrescar = new GXSimpleCollection<String>(String.class, "internal", "");
      AV205NombreDinamica = "" ;
      AV209SdtParametroCallsJson = "" ;
      AV208SdtParametroCallsCollection = new GXBaseCollection<app.SdtSdtParametroCalls>(app.SdtSdtParametroCalls.class, "SdtParametroCalls", "TexplusNET", remoteHandle);
      AV207SdtParametroCalls = new app.SdtSdtParametroCalls(remoteHandle, context);
      Z407EmprNom = "" ;
      Z1244GuiRemCln = "" ;
      T01L415_A407EmprNom = new String[] {""} ;
      T01L415_n407EmprNom = new boolean[] {false} ;
      T01L414_A1244GuiRemCln = new String[] {""} ;
      T01L416_A30AlbProCod = new long[1] ;
      T01L416_A407EmprNom = new String[] {""} ;
      T01L416_n407EmprNom = new boolean[] {false} ;
      T01L416_A1244GuiRemCln = new String[] {""} ;
      T01L416_A7101AlbLic = new String[] {""} ;
      T01L416_A5805AlbEnvFtp = new byte[1] ;
      T01L416_A1253EmprGuiRem = new String[] {""} ;
      T01L416_A1243GuiRemCli = new int[1] ;
      T01L416_A396EmprCod = new String[] {""} ;
      T01L417_A1244GuiRemCln = new String[] {""} ;
      T01L418_A396EmprCod = new String[] {""} ;
      T01L418_A30AlbProCod = new long[1] ;
      T01L413_A30AlbProCod = new long[1] ;
      T01L413_A7101AlbLic = new String[] {""} ;
      T01L413_A5805AlbEnvFtp = new byte[1] ;
      T01L413_A1253EmprGuiRem = new String[] {""} ;
      T01L413_A1243GuiRemCli = new int[1] ;
      T01L413_A396EmprCod = new String[] {""} ;
      T01L419_A396EmprCod = new String[] {""} ;
      T01L419_A30AlbProCod = new long[1] ;
      T01L420_A396EmprCod = new String[] {""} ;
      T01L420_A30AlbProCod = new long[1] ;
      T01L412_A30AlbProCod = new long[1] ;
      T01L412_A7101AlbLic = new String[] {""} ;
      T01L412_A5805AlbEnvFtp = new byte[1] ;
      T01L412_A1253EmprGuiRem = new String[] {""} ;
      T01L412_A1243GuiRemCli = new int[1] ;
      T01L412_A396EmprCod = new String[] {""} ;
      T01L424_A1244GuiRemCln = new String[] {""} ;
      T01L425_A396EmprCod = new String[] {""} ;
      T01L425_A30AlbProCod = new long[1] ;
      T01L425_A12185DltLinObs = new byte[1] ;
      T01L426_A396EmprCod = new String[] {""} ;
      T01L426_A30AlbProCod = new long[1] ;
      T01L426_A12176DltHdr = new int[1] ;
      T01L426_A12177DltR = new byte[1] ;
      T01L426_A12178DltP = new String[] {""} ;
      T01L427_A396EmprCod = new String[] {""} ;
      T01L427_A30AlbProCod = new long[1] ;
      T01L427_A7540Alb_NFisca = new String[] {""} ;
      T01L428_A396EmprCod = new String[] {""} ;
      T01L428_A30AlbProCod = new long[1] ;
      T01L428_A129BarCod = new int[1] ;
      T01L428_A132BarCodReo = new byte[1] ;
      T01L428_A130BarCodPar = new String[] {""} ;
      T01L428_A1240GuiFasLin = new short[1] ;
      T01L429_A396EmprCod = new String[] {""} ;
      T01L429_A30AlbProCod = new long[1] ;
      T01L429_A915AlbPObsLin = new byte[1] ;
      T01L430_A396EmprCod = new String[] {""} ;
      T01L430_A30AlbProCod = new long[1] ;
      Z1234BarNomCli = "" ;
      Z5034BarEstTip = "" ;
      Z5291BarTipCor = "" ;
      Z2010BarTipDis = "" ;
      Z5253BarAcc = "" ;
      Z143BarDisNum = "" ;
      Z4812BarEncCli = "" ;
      Z1652BarSerDsc = "" ;
      Z135BarColNom = "" ;
      Z161BarFecSal = GXutil.nullDate() ;
      Z212BarSer = "" ;
      Z365DisDes = "" ;
      Z1280BarMla = DecimalUtil.ZERO ;
      Z1279BarKla = DecimalUtil.ZERO ;
      T01L433_A361DisCod = new int[1] ;
      T01L433_A30AlbProCod = new long[1] ;
      T01L433_A1266BarAlbTub = new int[1] ;
      T01L433_A2839AlbProVal = new String[] {""} ;
      T01L433_A3271AlbHdrAnc = new short[1] ;
      T01L433_A3392AlbColNom = new String[] {""} ;
      T01L433_A3393AlbColNum = new int[1] ;
      T01L433_A3394AlbTipCol = new byte[1] ;
      T01L433_A3391AlbSer = new String[] {""} ;
      T01L433_A8879AlbSerD = new String[] {""} ;
      T01L433_A3886AlbCliCod = new int[1] ;
      T01L433_A12232AlbNomCli = new String[] {""} ;
      T01L433_A12233AlbNumcli = new int[1] ;
      T01L433_A12234AlbTipArt = new short[1] ;
      T01L433_A5019AlbHdrgm2 = new short[1] ;
      T01L433_A12905AlbCadEnc = new short[1] ;
      T01L433_A4815AlbEncCli = new String[] {""} ;
      T01L433_A1095AlbTipEnt = new String[] {""} ;
      T01L433_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A32AlbProEsp = new byte[1] ;
      T01L433_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A2398BarFasExt = new String[] {""} ;
      T01L433_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A1265BarAlbPie = new int[1] ;
      T01L433_A6466PlasCod = new short[1] ;
      T01L433_n6466PlasCod = new boolean[] {false} ;
      T01L433_A6467BarAlbPlas = new short[1] ;
      T01L433_A2441AlbHdrObs = new String[] {""} ;
      T01L433_A1235BarNumCli = new int[1] ;
      T01L433_A1234BarNomCli = new String[] {""} ;
      T01L433_A12195BarAlbUnd = new int[1] ;
      T01L433_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A5034BarEstTip = new String[] {""} ;
      T01L433_A6645AlbMetULi = new short[1] ;
      T01L433_A5291BarTipCor = new String[] {""} ;
      T01L433_A5027BarGraCob = new byte[1] ;
      T01L433_A2010BarTipDis = new String[] {""} ;
      T01L433_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A4937BarCtrPdas = new byte[1] ;
      T01L433_n4937BarCtrPdas = new boolean[] {false} ;
      T01L433_A7994AlbDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A7993AlbMqTj = new String[] {""} ;
      T01L433_A7992AlbDf3 = new String[] {""} ;
      T01L433_A7991AlbDf2 = new String[] {""} ;
      T01L433_A7990AlbDf1 = new String[] {""} ;
      T01L433_A7989AlbCald = new String[] {""} ;
      T01L433_A7104AlbEncA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A7103AlbEncL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A6814AlbObsM = new String[] {""} ;
      T01L433_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A5253BarAcc = new String[] {""} ;
      T01L433_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A148BarEstReo = new byte[1] ;
      T01L433_A143BarDisNum = new String[] {""} ;
      T01L433_A1909BarGraAca = new short[1] ;
      T01L433_A4812BarEncCli = new String[] {""} ;
      T01L433_A1652BarSerDsc = new String[] {""} ;
      T01L433_A218BarTipCol = new byte[1] ;
      T01L433_A136BarColNum = new int[1] ;
      T01L433_A135BarColNom = new String[] {""} ;
      T01L433_A1503BarPart = new short[1] ;
      T01L433_A1458BarAlbBul = new short[1] ;
      T01L433_A365DisDes = new String[] {""} ;
      T01L433_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01L433_A125BarAncAca1 = new short[1] ;
      T01L433_A213BarSit = new byte[1] ;
      T01L433_A212BarSer = new String[] {""} ;
      T01L433_A1248GuiFasULin = new short[1] ;
      T01L433_A2763AlbHdrUlin = new short[1] ;
      T01L433_A4466BarAcaAnh = new short[1] ;
      T01L433_A5051TipAcaCod = new short[1] ;
      T01L433_A396EmprCod = new String[] {""} ;
      T01L433_A129BarCod = new int[1] ;
      T01L433_A132BarCodReo = new byte[1] ;
      T01L433_A130BarCodPar = new String[] {""} ;
      T01L433_A1206TubCod = new short[1] ;
      T01L433_n1206TubCod = new boolean[] {false} ;
      T01L433_A3153CodCod = new String[] {""} ;
      T01L433_n3153CodCod = new boolean[] {false} ;
      T01L433_A252CliCod = new int[1] ;
      T01L433_n252CliCod = new boolean[] {false} ;
      T01L433_A217BarTipArt = new short[1] ;
      T01L433_n217BarTipArt = new boolean[] {false} ;
      T01L433_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L433_A1292BarPlz = new short[1] ;
      T01L433_A898BarPieNDes = new int[1] ;
      T01L433_A199BarPie1 = new short[1] ;
      T01L45_A396EmprCod = new String[] {""} ;
      T01L46_A396EmprCod = new String[] {""} ;
      T01L44_A361DisCod = new int[1] ;
      T01L44_A1235BarNumCli = new int[1] ;
      T01L44_A1234BarNomCli = new String[] {""} ;
      T01L44_A5034BarEstTip = new String[] {""} ;
      T01L44_A5291BarTipCor = new String[] {""} ;
      T01L44_A5027BarGraCob = new byte[1] ;
      T01L44_A2010BarTipDis = new String[] {""} ;
      T01L44_A4937BarCtrPdas = new byte[1] ;
      T01L44_n4937BarCtrPdas = new boolean[] {false} ;
      T01L44_A5253BarAcc = new String[] {""} ;
      T01L44_A148BarEstReo = new byte[1] ;
      T01L44_A143BarDisNum = new String[] {""} ;
      T01L44_A1909BarGraAca = new short[1] ;
      T01L44_A4812BarEncCli = new String[] {""} ;
      T01L44_A1652BarSerDsc = new String[] {""} ;
      T01L44_A218BarTipCol = new byte[1] ;
      T01L44_A136BarColNum = new int[1] ;
      T01L44_A135BarColNom = new String[] {""} ;
      T01L44_A1503BarPart = new short[1] ;
      T01L44_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01L44_A125BarAncAca1 = new short[1] ;
      T01L44_A213BarSit = new byte[1] ;
      T01L44_A212BarSer = new String[] {""} ;
      T01L44_A4466BarAcaAnh = new short[1] ;
      T01L44_A252CliCod = new int[1] ;
      T01L44_n252CliCod = new boolean[] {false} ;
      T01L44_A217BarTipArt = new short[1] ;
      T01L44_n217BarTipArt = new boolean[] {false} ;
      T01L47_A365DisDes = new String[] {""} ;
      T01L49_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L49_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L49_A1292BarPlz = new short[1] ;
      T01L411_A898BarPieNDes = new int[1] ;
      T01L411_A199BarPie1 = new short[1] ;
      T01L434_A396EmprCod = new String[] {""} ;
      T01L435_A396EmprCod = new String[] {""} ;
      T01L436_A361DisCod = new int[1] ;
      T01L436_A1235BarNumCli = new int[1] ;
      T01L436_A1234BarNomCli = new String[] {""} ;
      T01L436_A5034BarEstTip = new String[] {""} ;
      T01L436_A5291BarTipCor = new String[] {""} ;
      T01L436_A5027BarGraCob = new byte[1] ;
      T01L436_A2010BarTipDis = new String[] {""} ;
      T01L436_A4937BarCtrPdas = new byte[1] ;
      T01L436_n4937BarCtrPdas = new boolean[] {false} ;
      T01L436_A5253BarAcc = new String[] {""} ;
      T01L436_A148BarEstReo = new byte[1] ;
      T01L436_A143BarDisNum = new String[] {""} ;
      T01L436_A1909BarGraAca = new short[1] ;
      T01L436_A4812BarEncCli = new String[] {""} ;
      T01L436_A1652BarSerDsc = new String[] {""} ;
      T01L436_A218BarTipCol = new byte[1] ;
      T01L436_A136BarColNum = new int[1] ;
      T01L436_A135BarColNom = new String[] {""} ;
      T01L436_A1503BarPart = new short[1] ;
      T01L436_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01L436_A125BarAncAca1 = new short[1] ;
      T01L436_A213BarSit = new byte[1] ;
      T01L436_A212BarSer = new String[] {""} ;
      T01L436_A4466BarAcaAnh = new short[1] ;
      T01L436_A252CliCod = new int[1] ;
      T01L436_n252CliCod = new boolean[] {false} ;
      T01L436_A217BarTipArt = new short[1] ;
      T01L436_n217BarTipArt = new boolean[] {false} ;
      T01L437_A365DisDes = new String[] {""} ;
      T01L439_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L439_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L439_A1292BarPlz = new short[1] ;
      T01L441_A898BarPieNDes = new int[1] ;
      T01L441_A199BarPie1 = new short[1] ;
      T01L442_A396EmprCod = new String[] {""} ;
      T01L442_A30AlbProCod = new long[1] ;
      T01L442_A129BarCod = new int[1] ;
      T01L442_A132BarCodReo = new byte[1] ;
      T01L442_A130BarCodPar = new String[] {""} ;
      T01L43_A30AlbProCod = new long[1] ;
      T01L43_A1266BarAlbTub = new int[1] ;
      T01L43_A2839AlbProVal = new String[] {""} ;
      T01L43_A3271AlbHdrAnc = new short[1] ;
      T01L43_A3392AlbColNom = new String[] {""} ;
      T01L43_A3393AlbColNum = new int[1] ;
      T01L43_A3394AlbTipCol = new byte[1] ;
      T01L43_A3391AlbSer = new String[] {""} ;
      T01L43_A8879AlbSerD = new String[] {""} ;
      T01L43_A3886AlbCliCod = new int[1] ;
      T01L43_A12232AlbNomCli = new String[] {""} ;
      T01L43_A12233AlbNumcli = new int[1] ;
      T01L43_A12234AlbTipArt = new short[1] ;
      T01L43_A5019AlbHdrgm2 = new short[1] ;
      T01L43_A12905AlbCadEnc = new short[1] ;
      T01L43_A4815AlbEncCli = new String[] {""} ;
      T01L43_A1095AlbTipEnt = new String[] {""} ;
      T01L43_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L43_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L43_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L43_A32AlbProEsp = new byte[1] ;
      T01L43_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L43_A2398BarFasExt = new String[] {""} ;
      T01L43_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L43_A1265BarAlbPie = new int[1] ;
      T01L43_A6466PlasCod = new short[1] ;
      T01L43_n6466PlasCod = new boolean[] {false} ;
      T01L43_A6467BarAlbPlas = new short[1] ;
      T01L43_A2441AlbHdrObs = new String[] {""} ;
      T01L43_A12195BarAlbUnd = new int[1] ;
      T01L43_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L43_A6645AlbMetULi = new short[1] ;
      T01L43_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L43_A7994AlbDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L43_A7993AlbMqTj = new String[] {""} ;
      T01L43_A7992AlbDf3 = new String[] {""} ;
      T01L43_A7991AlbDf2 = new String[] {""} ;
      T01L43_A7990AlbDf1 = new String[] {""} ;
      T01L43_A7989AlbCald = new String[] {""} ;
      T01L43_A7104AlbEncA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L43_A7103AlbEncL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L43_A6814AlbObsM = new String[] {""} ;
      T01L43_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L43_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L43_A1458BarAlbBul = new short[1] ;
      T01L43_A1248GuiFasULin = new short[1] ;
      T01L43_A2763AlbHdrUlin = new short[1] ;
      T01L43_A5051TipAcaCod = new short[1] ;
      T01L43_A396EmprCod = new String[] {""} ;
      T01L43_A129BarCod = new int[1] ;
      T01L43_A132BarCodReo = new byte[1] ;
      T01L43_A130BarCodPar = new String[] {""} ;
      T01L43_A1206TubCod = new short[1] ;
      T01L43_n1206TubCod = new boolean[] {false} ;
      T01L43_A3153CodCod = new String[] {""} ;
      T01L43_n3153CodCod = new boolean[] {false} ;
      T01L42_A30AlbProCod = new long[1] ;
      T01L42_A1266BarAlbTub = new int[1] ;
      T01L42_A2839AlbProVal = new String[] {""} ;
      T01L42_A3271AlbHdrAnc = new short[1] ;
      T01L42_A3392AlbColNom = new String[] {""} ;
      T01L42_A3393AlbColNum = new int[1] ;
      T01L42_A3394AlbTipCol = new byte[1] ;
      T01L42_A3391AlbSer = new String[] {""} ;
      T01L42_A8879AlbSerD = new String[] {""} ;
      T01L42_A3886AlbCliCod = new int[1] ;
      T01L42_A12232AlbNomCli = new String[] {""} ;
      T01L42_A12233AlbNumcli = new int[1] ;
      T01L42_A12234AlbTipArt = new short[1] ;
      T01L42_A5019AlbHdrgm2 = new short[1] ;
      T01L42_A12905AlbCadEnc = new short[1] ;
      T01L42_A4815AlbEncCli = new String[] {""} ;
      T01L42_A1095AlbTipEnt = new String[] {""} ;
      T01L42_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L42_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L42_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L42_A32AlbProEsp = new byte[1] ;
      T01L42_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L42_A2398BarFasExt = new String[] {""} ;
      T01L42_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L42_A1265BarAlbPie = new int[1] ;
      T01L42_A6466PlasCod = new short[1] ;
      T01L42_n6466PlasCod = new boolean[] {false} ;
      T01L42_A6467BarAlbPlas = new short[1] ;
      T01L42_A2441AlbHdrObs = new String[] {""} ;
      T01L42_A12195BarAlbUnd = new int[1] ;
      T01L42_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L42_A6645AlbMetULi = new short[1] ;
      T01L42_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L42_A7994AlbDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L42_A7993AlbMqTj = new String[] {""} ;
      T01L42_A7992AlbDf3 = new String[] {""} ;
      T01L42_A7991AlbDf2 = new String[] {""} ;
      T01L42_A7990AlbDf1 = new String[] {""} ;
      T01L42_A7989AlbCald = new String[] {""} ;
      T01L42_A7104AlbEncA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L42_A7103AlbEncL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L42_A6814AlbObsM = new String[] {""} ;
      T01L42_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L42_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L42_A1458BarAlbBul = new short[1] ;
      T01L42_A1248GuiFasULin = new short[1] ;
      T01L42_A2763AlbHdrUlin = new short[1] ;
      T01L42_A5051TipAcaCod = new short[1] ;
      T01L42_A396EmprCod = new String[] {""} ;
      T01L42_A129BarCod = new int[1] ;
      T01L42_A132BarCodReo = new byte[1] ;
      T01L42_A130BarCodPar = new String[] {""} ;
      T01L42_A1206TubCod = new short[1] ;
      T01L42_n1206TubCod = new boolean[] {false} ;
      T01L42_A3153CodCod = new String[] {""} ;
      T01L42_n3153CodCod = new boolean[] {false} ;
      T01L446_A361DisCod = new int[1] ;
      T01L446_A1235BarNumCli = new int[1] ;
      T01L446_A1234BarNomCli = new String[] {""} ;
      T01L446_A5034BarEstTip = new String[] {""} ;
      T01L446_A5291BarTipCor = new String[] {""} ;
      T01L446_A5027BarGraCob = new byte[1] ;
      T01L446_A2010BarTipDis = new String[] {""} ;
      T01L446_A4937BarCtrPdas = new byte[1] ;
      T01L446_n4937BarCtrPdas = new boolean[] {false} ;
      T01L446_A5253BarAcc = new String[] {""} ;
      T01L446_A148BarEstReo = new byte[1] ;
      T01L446_A143BarDisNum = new String[] {""} ;
      T01L446_A1909BarGraAca = new short[1] ;
      T01L446_A4812BarEncCli = new String[] {""} ;
      T01L446_A1652BarSerDsc = new String[] {""} ;
      T01L446_A218BarTipCol = new byte[1] ;
      T01L446_A136BarColNum = new int[1] ;
      T01L446_A135BarColNom = new String[] {""} ;
      T01L446_A1503BarPart = new short[1] ;
      T01L446_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01L446_A125BarAncAca1 = new short[1] ;
      T01L446_A213BarSit = new byte[1] ;
      T01L446_A212BarSer = new String[] {""} ;
      T01L446_A4466BarAcaAnh = new short[1] ;
      T01L446_A252CliCod = new int[1] ;
      T01L446_n252CliCod = new boolean[] {false} ;
      T01L446_A217BarTipArt = new short[1] ;
      T01L446_n217BarTipArt = new boolean[] {false} ;
      T01L447_A365DisDes = new String[] {""} ;
      T01L449_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L449_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L449_A1292BarPlz = new short[1] ;
      T01L451_A898BarPieNDes = new int[1] ;
      T01L451_A199BarPie1 = new short[1] ;
      T01L452_A396EmprCod = new String[] {""} ;
      T01L452_A30AlbProCod = new long[1] ;
      T01L452_A129BarCod = new int[1] ;
      T01L452_A132BarCodReo = new byte[1] ;
      T01L452_A130BarCodPar = new String[] {""} ;
      T01L452_A6648AlbMetLin = new short[1] ;
      T01L453_A396EmprCod = new String[] {""} ;
      T01L453_A30AlbProCod = new long[1] ;
      T01L453_A129BarCod = new int[1] ;
      T01L453_A132BarCodReo = new byte[1] ;
      T01L453_A130BarCodPar = new String[] {""} ;
      T01L453_A9639Et_Numero = new short[1] ;
      T01L454_A396EmprCod = new String[] {""} ;
      T01L454_A30AlbProCod = new long[1] ;
      T01L454_A129BarCod = new int[1] ;
      T01L454_A132BarCodReo = new byte[1] ;
      T01L454_A130BarCodPar = new String[] {""} ;
      T01L454_A6622AlbHdRLn = new short[1] ;
      T01L455_A396EmprCod = new String[] {""} ;
      T01L455_A30AlbProCod = new long[1] ;
      T01L455_A129BarCod = new int[1] ;
      T01L455_A132BarCodReo = new byte[1] ;
      T01L455_A130BarCodPar = new String[] {""} ;
      T01L455_A5456P_ForLin = new short[1] ;
      T01L456_A396EmprCod = new String[] {""} ;
      T01L456_A30AlbProCod = new long[1] ;
      T01L456_A129BarCod = new int[1] ;
      T01L456_A132BarCodReo = new byte[1] ;
      T01L456_A130BarCodPar = new String[] {""} ;
      T01L456_A2524DisComLin = new byte[1] ;
      T01L456_A1056DisComCod = new String[] {""} ;
      T01L456_A1032FonCod = new String[] {""} ;
      T01L457_A396EmprCod = new String[] {""} ;
      T01L457_A3617AlbTrnCod = new long[1] ;
      T01L457_A30AlbProCod = new long[1] ;
      T01L457_A129BarCod = new int[1] ;
      T01L457_A132BarCodReo = new byte[1] ;
      T01L457_A130BarCodPar = new String[] {""} ;
      T01L458_A396EmprCod = new String[] {""} ;
      T01L458_A30AlbProCod = new long[1] ;
      T01L458_A129BarCod = new int[1] ;
      T01L458_A132BarCodReo = new byte[1] ;
      T01L458_A130BarCodPar = new String[] {""} ;
      T01L458_A3621AlbPckLin = new short[1] ;
      T01L459_A396EmprCod = new String[] {""} ;
      T01L459_A30AlbProCod = new long[1] ;
      T01L459_A129BarCod = new int[1] ;
      T01L459_A132BarCodReo = new byte[1] ;
      T01L459_A130BarCodPar = new String[] {""} ;
      T01L459_A2764AlbHdrLin = new short[1] ;
      T01L460_A396EmprCod = new String[] {""} ;
      T01L460_A30AlbProCod = new long[1] ;
      T01L460_A129BarCod = new int[1] ;
      T01L460_A132BarCodReo = new byte[1] ;
      T01L460_A130BarCodPar = new String[] {""} ;
      T01L460_A1468AlbPrdLin = new short[1] ;
      T01L461_A396EmprCod = new String[] {""} ;
      T01L461_A30AlbProCod = new long[1] ;
      T01L461_A129BarCod = new int[1] ;
      T01L461_A132BarCodReo = new byte[1] ;
      T01L461_A130BarCodPar = new String[] {""} ;
      T01L461_A200BarPieCod = new String[] {""} ;
      T01L462_A396EmprCod = new String[] {""} ;
      T01L462_A30AlbProCod = new long[1] ;
      T01L462_A129BarCod = new int[1] ;
      T01L462_A132BarCodReo = new byte[1] ;
      T01L462_A130BarCodPar = new String[] {""} ;
      T01L462_A1240GuiFasLin = new short[1] ;
      T01L463_A396EmprCod = new String[] {""} ;
      T01L463_A30AlbProCod = new long[1] ;
      T01L463_A129BarCod = new int[1] ;
      T01L463_A132BarCodReo = new byte[1] ;
      T01L463_A130BarCodPar = new String[] {""} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV155Modo2 = "" ;
      i2839AlbProVal = "" ;
      i1095AlbTipEnt = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int21 = new short[1] ;
      GXv_int13 = new int[1] ;
      GXv_date19 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_int17 = new long[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int15 = new int[1] ;
      GXv_char3 = new String[1] ;
      ZV158Msg_acc = "" ;
      ZV151Metros = DecimalUtil.ZERO ;
      ZV45BarKgm = DecimalUtil.ZERO ;
      ZV38KgsHdr = DecimalUtil.ZERO ;
      ZV171TipDis = "" ;
      ZV159Msg_ctrl = "" ;
      T01L464_A396EmprCod = new String[] {""} ;
      GXv_char20 = new String[1] ;
      GXv_int18 = new int[1] ;
      GXv_int16 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int6 = new byte[1] ;
      ZV108KilAnt = DecimalUtil.ZERO ;
      ZV163Msg_k = "" ;
      ZV150MetAnt = DecimalUtil.ZERO ;
      T01L465_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn07__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn07__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn07__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn07__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn07__default(),
         new Object[] {
             new Object[] {
            T01L42_A30AlbProCod, T01L42_A1266BarAlbTub, T01L42_A2839AlbProVal, T01L42_A3271AlbHdrAnc, T01L42_A3392AlbColNom, T01L42_A3393AlbColNum, T01L42_A3394AlbTipCol, T01L42_A3391AlbSer, T01L42_A8879AlbSerD, T01L42_A3886AlbCliCod,
            T01L42_A12232AlbNomCli, T01L42_A12233AlbNumcli, T01L42_A12234AlbTipArt, T01L42_A5019AlbHdrgm2, T01L42_A12905AlbCadEnc, T01L42_A4815AlbEncCli, T01L42_A1095AlbTipEnt, T01L42_A1263BarAlbMtrE, T01L42_A1262BarPreKgm, T01L42_A1264BarPreMtr,
            T01L42_A32AlbProEsp, T01L42_A40AlbProRec, T01L42_A2398BarFasExt, T01L42_A1261BarAlbKgmE, T01L42_A1265BarAlbPie, T01L42_A6466PlasCod, T01L42_n6466PlasCod, T01L42_A6467BarAlbPlas, T01L42_A2441AlbHdrObs, T01L42_A12195BarAlbUnd,
            T01L42_A12196BarPreUnd, T01L42_A6645AlbMetULi, T01L42_A1461BarAlbPN, T01L42_A7994AlbDto, T01L42_A7993AlbMqTj, T01L42_A7992AlbDf3, T01L42_A7991AlbDf2, T01L42_A7990AlbDf1, T01L42_A7989AlbCald, T01L42_A7104AlbEncA,
            T01L42_A7103AlbEncL, T01L42_A6814AlbObsM, T01L42_A2761AlbBarRec, T01L42_A5354AlbImpMan, T01L42_A1458BarAlbBul, T01L42_A1248GuiFasULin, T01L42_A2763AlbHdrUlin, T01L42_A5051TipAcaCod, T01L42_A396EmprCod, T01L42_A129BarCod,
            T01L42_A132BarCodReo, T01L42_A130BarCodPar, T01L42_A1206TubCod, T01L42_n1206TubCod, T01L42_A3153CodCod, T01L42_n3153CodCod
            }
            , new Object[] {
            T01L43_A30AlbProCod, T01L43_A1266BarAlbTub, T01L43_A2839AlbProVal, T01L43_A3271AlbHdrAnc, T01L43_A3392AlbColNom, T01L43_A3393AlbColNum, T01L43_A3394AlbTipCol, T01L43_A3391AlbSer, T01L43_A8879AlbSerD, T01L43_A3886AlbCliCod,
            T01L43_A12232AlbNomCli, T01L43_A12233AlbNumcli, T01L43_A12234AlbTipArt, T01L43_A5019AlbHdrgm2, T01L43_A12905AlbCadEnc, T01L43_A4815AlbEncCli, T01L43_A1095AlbTipEnt, T01L43_A1263BarAlbMtrE, T01L43_A1262BarPreKgm, T01L43_A1264BarPreMtr,
            T01L43_A32AlbProEsp, T01L43_A40AlbProRec, T01L43_A2398BarFasExt, T01L43_A1261BarAlbKgmE, T01L43_A1265BarAlbPie, T01L43_A6466PlasCod, T01L43_n6466PlasCod, T01L43_A6467BarAlbPlas, T01L43_A2441AlbHdrObs, T01L43_A12195BarAlbUnd,
            T01L43_A12196BarPreUnd, T01L43_A6645AlbMetULi, T01L43_A1461BarAlbPN, T01L43_A7994AlbDto, T01L43_A7993AlbMqTj, T01L43_A7992AlbDf3, T01L43_A7991AlbDf2, T01L43_A7990AlbDf1, T01L43_A7989AlbCald, T01L43_A7104AlbEncA,
            T01L43_A7103AlbEncL, T01L43_A6814AlbObsM, T01L43_A2761AlbBarRec, T01L43_A5354AlbImpMan, T01L43_A1458BarAlbBul, T01L43_A1248GuiFasULin, T01L43_A2763AlbHdrUlin, T01L43_A5051TipAcaCod, T01L43_A396EmprCod, T01L43_A129BarCod,
            T01L43_A132BarCodReo, T01L43_A130BarCodPar, T01L43_A1206TubCod, T01L43_n1206TubCod, T01L43_A3153CodCod, T01L43_n3153CodCod
            }
            , new Object[] {
            T01L44_A361DisCod, T01L44_A1235BarNumCli, T01L44_A1234BarNomCli, T01L44_A5034BarEstTip, T01L44_A5291BarTipCor, T01L44_A5027BarGraCob, T01L44_A2010BarTipDis, T01L44_A4937BarCtrPdas, T01L44_n4937BarCtrPdas, T01L44_A5253BarAcc,
            T01L44_A148BarEstReo, T01L44_A143BarDisNum, T01L44_A1909BarGraAca, T01L44_A4812BarEncCli, T01L44_A1652BarSerDsc, T01L44_A218BarTipCol, T01L44_A136BarColNum, T01L44_A135BarColNom, T01L44_A1503BarPart, T01L44_A161BarFecSal,
            T01L44_A125BarAncAca1, T01L44_A213BarSit, T01L44_A212BarSer, T01L44_A4466BarAcaAnh, T01L44_A252CliCod, T01L44_n252CliCod, T01L44_A217BarTipArt, T01L44_n217BarTipArt
            }
            , new Object[] {
            T01L45_A396EmprCod
            }
            , new Object[] {
            T01L46_A396EmprCod
            }
            , new Object[] {
            T01L47_A365DisDes
            }
            , new Object[] {
            T01L49_A1280BarMla, T01L49_A1279BarKla, T01L49_A1292BarPlz
            }
            , new Object[] {
            T01L411_A898BarPieNDes, T01L411_A199BarPie1
            }
            , new Object[] {
            T01L412_A30AlbProCod, T01L412_A7101AlbLic, T01L412_A5805AlbEnvFtp, T01L412_A1253EmprGuiRem, T01L412_A1243GuiRemCli, T01L412_A396EmprCod
            }
            , new Object[] {
            T01L413_A30AlbProCod, T01L413_A7101AlbLic, T01L413_A5805AlbEnvFtp, T01L413_A1253EmprGuiRem, T01L413_A1243GuiRemCli, T01L413_A396EmprCod
            }
            , new Object[] {
            T01L414_A1244GuiRemCln
            }
            , new Object[] {
            T01L415_A407EmprNom, T01L415_n407EmprNom
            }
            , new Object[] {
            T01L416_A30AlbProCod, T01L416_A407EmprNom, T01L416_n407EmprNom, T01L416_A1244GuiRemCln, T01L416_A7101AlbLic, T01L416_A5805AlbEnvFtp, T01L416_A1253EmprGuiRem, T01L416_A1243GuiRemCli, T01L416_A396EmprCod
            }
            , new Object[] {
            T01L417_A1244GuiRemCln
            }
            , new Object[] {
            T01L418_A396EmprCod, T01L418_A30AlbProCod
            }
            , new Object[] {
            T01L419_A396EmprCod, T01L419_A30AlbProCod
            }
            , new Object[] {
            T01L420_A396EmprCod, T01L420_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01L424_A1244GuiRemCln
            }
            , new Object[] {
            T01L425_A396EmprCod, T01L425_A30AlbProCod, T01L425_A12185DltLinObs
            }
            , new Object[] {
            T01L426_A396EmprCod, T01L426_A30AlbProCod, T01L426_A12176DltHdr, T01L426_A12177DltR, T01L426_A12178DltP
            }
            , new Object[] {
            T01L427_A396EmprCod, T01L427_A30AlbProCod, T01L427_A7540Alb_NFisca
            }
            , new Object[] {
            T01L428_A396EmprCod, T01L428_A30AlbProCod, T01L428_A129BarCod, T01L428_A132BarCodReo, T01L428_A130BarCodPar, T01L428_A1240GuiFasLin
            }
            , new Object[] {
            T01L429_A396EmprCod, T01L429_A30AlbProCod, T01L429_A915AlbPObsLin
            }
            , new Object[] {
            T01L430_A396EmprCod, T01L430_A30AlbProCod
            }
            , new Object[] {
            T01L433_A361DisCod, T01L433_A30AlbProCod, T01L433_A1266BarAlbTub, T01L433_A2839AlbProVal, T01L433_A3271AlbHdrAnc, T01L433_A3392AlbColNom, T01L433_A3393AlbColNum, T01L433_A3394AlbTipCol, T01L433_A3391AlbSer, T01L433_A8879AlbSerD,
            T01L433_A3886AlbCliCod, T01L433_A12232AlbNomCli, T01L433_A12233AlbNumcli, T01L433_A12234AlbTipArt, T01L433_A5019AlbHdrgm2, T01L433_A12905AlbCadEnc, T01L433_A4815AlbEncCli, T01L433_A1095AlbTipEnt, T01L433_A1263BarAlbMtrE, T01L433_A1262BarPreKgm,
            T01L433_A1264BarPreMtr, T01L433_A32AlbProEsp, T01L433_A40AlbProRec, T01L433_A2398BarFasExt, T01L433_A1261BarAlbKgmE, T01L433_A1265BarAlbPie, T01L433_A6466PlasCod, T01L433_n6466PlasCod, T01L433_A6467BarAlbPlas, T01L433_A2441AlbHdrObs,
            T01L433_A1235BarNumCli, T01L433_A1234BarNomCli, T01L433_A12195BarAlbUnd, T01L433_A12196BarPreUnd, T01L433_A5034BarEstTip, T01L433_A6645AlbMetULi, T01L433_A5291BarTipCor, T01L433_A5027BarGraCob, T01L433_A2010BarTipDis, T01L433_A1461BarAlbPN,
            T01L433_A4937BarCtrPdas, T01L433_n4937BarCtrPdas, T01L433_A7994AlbDto, T01L433_A7993AlbMqTj, T01L433_A7992AlbDf3, T01L433_A7991AlbDf2, T01L433_A7990AlbDf1, T01L433_A7989AlbCald, T01L433_A7104AlbEncA, T01L433_A7103AlbEncL,
            T01L433_A6814AlbObsM, T01L433_A2761AlbBarRec, T01L433_A5253BarAcc, T01L433_A5354AlbImpMan, T01L433_A148BarEstReo, T01L433_A143BarDisNum, T01L433_A1909BarGraAca, T01L433_A4812BarEncCli, T01L433_A1652BarSerDsc, T01L433_A218BarTipCol,
            T01L433_A136BarColNum, T01L433_A135BarColNom, T01L433_A1503BarPart, T01L433_A1458BarAlbBul, T01L433_A365DisDes, T01L433_A161BarFecSal, T01L433_A125BarAncAca1, T01L433_A213BarSit, T01L433_A212BarSer, T01L433_A1248GuiFasULin,
            T01L433_A2763AlbHdrUlin, T01L433_A4466BarAcaAnh, T01L433_A5051TipAcaCod, T01L433_A396EmprCod, T01L433_A129BarCod, T01L433_A132BarCodReo, T01L433_A130BarCodPar, T01L433_A1206TubCod, T01L433_n1206TubCod, T01L433_A3153CodCod,
            T01L433_n3153CodCod, T01L433_A252CliCod, T01L433_n252CliCod, T01L433_A217BarTipArt, T01L433_n217BarTipArt, T01L433_A1280BarMla, T01L433_A1279BarKla, T01L433_A1292BarPlz, T01L433_A898BarPieNDes, T01L433_A199BarPie1
            }
            , new Object[] {
            T01L434_A396EmprCod
            }
            , new Object[] {
            T01L435_A396EmprCod
            }
            , new Object[] {
            T01L436_A361DisCod, T01L436_A1235BarNumCli, T01L436_A1234BarNomCli, T01L436_A5034BarEstTip, T01L436_A5291BarTipCor, T01L436_A5027BarGraCob, T01L436_A2010BarTipDis, T01L436_A4937BarCtrPdas, T01L436_n4937BarCtrPdas, T01L436_A5253BarAcc,
            T01L436_A148BarEstReo, T01L436_A143BarDisNum, T01L436_A1909BarGraAca, T01L436_A4812BarEncCli, T01L436_A1652BarSerDsc, T01L436_A218BarTipCol, T01L436_A136BarColNum, T01L436_A135BarColNom, T01L436_A1503BarPart, T01L436_A161BarFecSal,
            T01L436_A125BarAncAca1, T01L436_A213BarSit, T01L436_A212BarSer, T01L436_A4466BarAcaAnh, T01L436_A252CliCod, T01L436_n252CliCod, T01L436_A217BarTipArt, T01L436_n217BarTipArt
            }
            , new Object[] {
            T01L437_A365DisDes
            }
            , new Object[] {
            T01L439_A1280BarMla, T01L439_A1279BarKla, T01L439_A1292BarPlz
            }
            , new Object[] {
            T01L441_A898BarPieNDes, T01L441_A199BarPie1
            }
            , new Object[] {
            T01L442_A396EmprCod, T01L442_A30AlbProCod, T01L442_A129BarCod, T01L442_A132BarCodReo, T01L442_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01L446_A361DisCod, T01L446_A1235BarNumCli, T01L446_A1234BarNomCli, T01L446_A5034BarEstTip, T01L446_A5291BarTipCor, T01L446_A5027BarGraCob, T01L446_A2010BarTipDis, T01L446_A4937BarCtrPdas, T01L446_n4937BarCtrPdas, T01L446_A5253BarAcc,
            T01L446_A148BarEstReo, T01L446_A143BarDisNum, T01L446_A1909BarGraAca, T01L446_A4812BarEncCli, T01L446_A1652BarSerDsc, T01L446_A218BarTipCol, T01L446_A136BarColNum, T01L446_A135BarColNom, T01L446_A1503BarPart, T01L446_A161BarFecSal,
            T01L446_A125BarAncAca1, T01L446_A213BarSit, T01L446_A212BarSer, T01L446_A4466BarAcaAnh, T01L446_A252CliCod, T01L446_n252CliCod, T01L446_A217BarTipArt, T01L446_n217BarTipArt
            }
            , new Object[] {
            T01L447_A365DisDes
            }
            , new Object[] {
            T01L449_A1280BarMla, T01L449_A1279BarKla, T01L449_A1292BarPlz
            }
            , new Object[] {
            T01L451_A898BarPieNDes, T01L451_A199BarPie1
            }
            , new Object[] {
            T01L452_A396EmprCod, T01L452_A30AlbProCod, T01L452_A129BarCod, T01L452_A132BarCodReo, T01L452_A130BarCodPar, T01L452_A6648AlbMetLin
            }
            , new Object[] {
            T01L453_A396EmprCod, T01L453_A30AlbProCod, T01L453_A129BarCod, T01L453_A132BarCodReo, T01L453_A130BarCodPar, T01L453_A9639Et_Numero
            }
            , new Object[] {
            T01L454_A396EmprCod, T01L454_A30AlbProCod, T01L454_A129BarCod, T01L454_A132BarCodReo, T01L454_A130BarCodPar, T01L454_A6622AlbHdRLn
            }
            , new Object[] {
            T01L455_A396EmprCod, T01L455_A30AlbProCod, T01L455_A129BarCod, T01L455_A132BarCodReo, T01L455_A130BarCodPar, T01L455_A5456P_ForLin
            }
            , new Object[] {
            T01L456_A396EmprCod, T01L456_A30AlbProCod, T01L456_A129BarCod, T01L456_A132BarCodReo, T01L456_A130BarCodPar, T01L456_A2524DisComLin, T01L456_A1056DisComCod, T01L456_A1032FonCod
            }
            , new Object[] {
            T01L457_A396EmprCod, T01L457_A3617AlbTrnCod, T01L457_A30AlbProCod, T01L457_A129BarCod, T01L457_A132BarCodReo, T01L457_A130BarCodPar
            }
            , new Object[] {
            T01L458_A396EmprCod, T01L458_A30AlbProCod, T01L458_A129BarCod, T01L458_A132BarCodReo, T01L458_A130BarCodPar, T01L458_A3621AlbPckLin
            }
            , new Object[] {
            T01L459_A396EmprCod, T01L459_A30AlbProCod, T01L459_A129BarCod, T01L459_A132BarCodReo, T01L459_A130BarCodPar, T01L459_A2764AlbHdrLin
            }
            , new Object[] {
            T01L460_A396EmprCod, T01L460_A30AlbProCod, T01L460_A129BarCod, T01L460_A132BarCodReo, T01L460_A130BarCodPar, T01L460_A1468AlbPrdLin
            }
            , new Object[] {
            T01L461_A396EmprCod, T01L461_A30AlbProCod, T01L461_A129BarCod, T01L461_A132BarCodReo, T01L461_A130BarCodPar, T01L461_A200BarPieCod
            }
            , new Object[] {
            T01L462_A396EmprCod, T01L462_A30AlbProCod, T01L462_A129BarCod, T01L462_A132BarCodReo, T01L462_A130BarCodPar, T01L462_A1240GuiFasLin
            }
            , new Object[] {
            T01L463_A396EmprCod, T01L463_A30AlbProCod, T01L463_A129BarCod, T01L463_A132BarCodReo, T01L463_A130BarCodPar
            }
            , new Object[] {
            T01L464_A396EmprCod
            }
            , new Object[] {
            T01L465_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV220Pgmname = "TTrn07" ;
      Z1095AlbTipEnt = "*" ;
      i1095AlbTipEnt = "*" ;
      A1095AlbTipEnt = "*" ;
      Z12905AlbCadEnc = (short)(0) ;
      A12905AlbCadEnc = (short)(0) ;
      Z8879AlbSerD = "" ;
      A8879AlbSerD = "" ;
      Z5019AlbHdrgm2 = (short)(0) ;
      A5019AlbHdrgm2 = (short)(0) ;
      Z12234AlbTipArt = (short)(0) ;
      A12234AlbTipArt = (short)(0) ;
      Z12233AlbNumcli = 0 ;
      A12233AlbNumcli = 0 ;
      Z12232AlbNomCli = "" ;
      A12232AlbNomCli = "" ;
      Z3886AlbCliCod = 0 ;
      A3886AlbCliCod = 0 ;
      Z8879AlbSerD = "" ;
      A8879AlbSerD = "" ;
      Z3391AlbSer = "" ;
      A3391AlbSer = "" ;
      Z3394AlbTipCol = (byte)(0) ;
      A3394AlbTipCol = (byte)(0) ;
      Z3393AlbColNum = 0 ;
      A3393AlbColNum = 0 ;
      Z3392AlbColNom = "" ;
      A3392AlbColNom = "" ;
      Z3271AlbHdrAnc = (short)(0) ;
      A3271AlbHdrAnc = (short)(0) ;
      Z2839AlbProVal = httpContext.getMessage( "S", "") ;
      i2839AlbProVal = httpContext.getMessage( "S", "") ;
      A2839AlbProVal = httpContext.getMessage( "S", "") ;
      Z1266BarAlbTub = 0 ;
      A1266BarAlbTub = 0 ;
   }

   private byte Z5805AlbEnvFtp ;
   private byte Z132BarCodReo ;
   private byte Z3394AlbTipCol ;
   private byte Z32AlbProEsp ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV152Moda21 ;
   private byte AV87FlagFas ;
   private byte AV69F_kgslam ;
   private byte AV91FlagPorRec ;
   private byte AV66F_carvema ;
   private byte AV186Carvitin ;
   private byte A32AlbProEsp ;
   private byte AV88FlagGv ;
   private byte A213BarSit ;
   private byte AV173OkMerma ;
   private byte AV85FlagEtm ;
   private byte AV57CtrQb ;
   private byte AV72F_tinamar ;
   private byte AV92FlagPreFas ;
   private byte AV61Erfoc ;
   private byte A3394AlbTipCol ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A5805AlbEnvFtp ;
   private byte AV63errkgs ;
   private byte A5027BarGraCob ;
   private byte A4937BarCtrPdas ;
   private byte A148BarEstReo ;
   private byte A218BarTipCol ;
   private byte AV98FlagTxt ;
   private byte AV93FlagPro ;
   private byte AV70F_moda21 ;
   private byte AV201Artemalha ;
   private byte AV202Siplasticos ;
   private byte GXt_int5 ;
   private byte Z5027BarGraCob ;
   private byte Z4937BarCtrPdas ;
   private byte Z148BarEstReo ;
   private byte Z218BarTipCol ;
   private byte Z213BarSit ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXv_int16[] ;
   private byte GXv_int6[] ;
   private byte ZV173OkMerma ;
   private short Z3271AlbHdrAnc ;
   private short Z12234AlbTipArt ;
   private short Z5019AlbHdrgm2 ;
   private short Z12905AlbCadEnc ;
   private short Z6466PlasCod ;
   private short Z6467BarAlbPlas ;
   private short Z6645AlbMetULi ;
   private short Z1458BarAlbBul ;
   private short Z1248GuiFasULin ;
   private short Z2763AlbHdrUlin ;
   private short Z5051TipAcaCod ;
   private short Z1206TubCod ;
   private short nRcdDeleted_195 ;
   private short nRcdExists_195 ;
   private short nIsMod_195 ;
   private short A1458BarAlbBul ;
   private short A1206TubCod ;
   private short A12905AlbCadEnc ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A2763AlbHdrUlin ;
   private short A6645AlbMetULi ;
   private short A12234AlbTipArt ;
   private short A6467BarAlbPlas ;
   private short A1248GuiFasULin ;
   private short A6466PlasCod ;
   private short A5051TipAcaCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount195 ;
   private short RcdFound195 ;
   private short nBlankRcdUsr195 ;
   private short A199BarPie1 ;
   private short RcdFound3 ;
   private short A217BarTipArt ;
   private short A1909BarGraAca ;
   private short A1503BarPart ;
   private short A1292BarPlz ;
   private short A125BarAncAca1 ;
   private short A4466BarAcaAnh ;
   private short nIsDirty_3 ;
   private short Z1909BarGraAca ;
   private short Z1503BarPart ;
   private short Z125BarAncAca1 ;
   private short Z4466BarAcaAnh ;
   private short Z217BarTipArt ;
   private short Z1292BarPlz ;
   private short Z199BarPie1 ;
   private short nIsDirty_195 ;
   private short GXv_int21[] ;
   private int Z1243GuiRemCli ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int N1243GuiRemCli ;
   private int Z129BarCod ;
   private int Z1266BarAlbTub ;
   private int Z3393AlbColNum ;
   private int Z3886AlbCliCod ;
   private int Z12233AlbNumcli ;
   private int Z1265BarAlbPie ;
   private int Z12195BarAlbUnd ;
   private int O1265BarAlbPie ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int AV165PieAnt ;
   private int A3886AlbCliCod ;
   private int A3393AlbColNum ;
   private int A12233AlbNumcli ;
   private int A1266BarAlbTub ;
   private int A12195BarAlbUnd ;
   private int A1243GuiRemCli ;
   private int A361DisCod ;
   private int trnEnded ;
   private int edtCodCod_Visible ;
   private int edtPlasCod_Visible ;
   private int edtBarAlbPlas_Visible ;
   private int edtEmprGuiRem_Enabled ;
   private int divTablainformaciongeneral_Visible ;
   private int edtAlbProCod_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtnregresar_Visible ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int bttBtnfases_Visible ;
   private int edtGuiRemCli_Visible ;
   private int edtGuiRemCli_Enabled ;
   private int edtAlbLic_Visible ;
   private int edtAlbLic_Enabled ;
   private int edtAlbEnvFtp_Enabled ;
   private int edtAlbEnvFtp_Visible ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtAlbSer_Enabled ;
   private int edtAlbSerD_Enabled ;
   private int edtAlbColNom_Enabled ;
   private int edtAlbNomCli_Enabled ;
   private int edtAlbColNum_Enabled ;
   private int edtCodCod_Enabled ;
   private int edtBarAlbKgmE_Enabled ;
   private int edtBarPreKgm_Enabled ;
   private int edtAlbHdrAnc_Enabled ;
   private int edtAlbHdrgm2_Enabled ;
   private int edtBarAlbMtrE_Enabled ;
   private int edtBarPreMtr_Enabled ;
   private int edtBarAlbPie_Enabled ;
   private int edtTubCod_Enabled ;
   private int edtBarAlbTub_Enabled ;
   private int edtPlasCod_Enabled ;
   private int edtBarAlbPlas_Enabled ;
   private int edtAlbHdrObs_Enabled ;
   private int edtAlbTipEnt_Enabled ;
   private int edtAlbTipArt_Enabled ;
   private int edtBarTipArt_Enabled ;
   private int edtAlbNumcli_Enabled ;
   private int edtBarNumCli_Enabled ;
   private int edtBarNomCli_Enabled ;
   private int edtBarAlbUnd_Enabled ;
   private int edtBarPreUnd_Enabled ;
   private int edtBarEstTip_Enabled ;
   private int edtAlbCliCod_Enabled ;
   private int edtAlbMetULi_Enabled ;
   private int edtBarFasExt_Enabled ;
   private int edtBarGraCob_Enabled ;
   private int edtBarTipDis_Enabled ;
   private int edtBarAlbPN_Enabled ;
   private int edtBarCtrPdas_Enabled ;
   private int edtAlbDto_Enabled ;
   private int edtAlbMqTj_Enabled ;
   private int edtAlbDf3_Enabled ;
   private int edtAlbDf2_Enabled ;
   private int edtAlbDf1_Enabled ;
   private int edtAlbCald_Enabled ;
   private int edtAlbEncA_Enabled ;
   private int edtAlbEncL_Enabled ;
   private int edtAlbObsM_Enabled ;
   private int edtAlbBarRec_Enabled ;
   private int edtAlbImpMan_Enabled ;
   private int edtBarDisNum_Enabled ;
   private int edtBarGraAca_Enabled ;
   private int edtAlbEncCli_Enabled ;
   private int edtBarEncCli_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtBarColNum_Enabled ;
   private int edtBarColNom_Enabled ;
   private int edtAlbTipCol_Enabled ;
   private int edtBarPart_Enabled ;
   private int edtBarAlbBul_Enabled ;
   private int edtAlbProRec_Enabled ;
   private int edtAlbProEsp_Enabled ;
   private int edtBarKla_Enabled ;
   private int edtBarMla_Enabled ;
   private int edtBarPlz_Enabled ;
   private int edtBarPie_Enabled ;
   private int edtBarFecSal_Enabled ;
   private int edtBarAncAca1_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtGuiFasULin_Enabled ;
   private int edtAlbHdrUlin_Enabled ;
   private int edtBarAcaAnh_Enabled ;
   private int edtAlbCadEnc_Enabled ;
   private int fRowAdded ;
   private int AV200Insert_GuiRemCli ;
   private int A898BarPieNDes ;
   private int AV176PzasLan ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Dvpanel_panelfases_Gxcontroltype ;
   private int A252CliCod ;
   private int A1235BarNumCli ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int T1265BarAlbPie ;
   private int AV221GXV1 ;
   private int AV222GXV2 ;
   private int AV223GXV3 ;
   private int GX_JID ;
   private int Z361DisCod ;
   private int Z1235BarNumCli ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int Z898BarPieNDes ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtAlbCadEnc_Enabled ;
   private int defedtBarAcaAnh_Enabled ;
   private int defedtAlbHdrUlin_Enabled ;
   private int defedtGuiFasULin_Enabled ;
   private int defedtBarSer_Enabled ;
   private int defedtBarSit_Enabled ;
   private int defedtBarAncAca1_Enabled ;
   private int defedtBarFecSal_Enabled ;
   private int defedtBarPie_Enabled ;
   private int defedtBarPlz_Enabled ;
   private int defedtBarMla_Enabled ;
   private int defedtBarKla_Enabled ;
   private int defedtAlbProEsp_Enabled ;
   private int defedtAlbProRec_Enabled ;
   private int defchkDisDes_Enabled ;
   private int defedtBarAlbBul_Enabled ;
   private int defedtBarPart_Enabled ;
   private int defedtAlbTipCol_Enabled ;
   private int defedtBarColNom_Enabled ;
   private int defedtBarColNum_Enabled ;
   private int defedtBarTipCol_Enabled ;
   private int defedtBarSerDsc_Enabled ;
   private int defedtBarEncCli_Enabled ;
   private int defedtAlbEncCli_Enabled ;
   private int defedtBarGraAca_Enabled ;
   private int defedtBarDisNum_Enabled ;
   private int defcmbBarEstReo_Enabled ;
   private int defedtAlbImpMan_Enabled ;
   private int defchkBarAcc_Enabled ;
   private int defedtAlbBarRec_Enabled ;
   private int defedtAlbObsM_Enabled ;
   private int defedtAlbEncL_Enabled ;
   private int defedtAlbEncA_Enabled ;
   private int defedtAlbCald_Enabled ;
   private int defedtAlbDf1_Enabled ;
   private int defedtAlbDf2_Enabled ;
   private int defedtAlbDf3_Enabled ;
   private int defedtAlbMqTj_Enabled ;
   private int defedtAlbDto_Enabled ;
   private int defedtBarCtrPdas_Enabled ;
   private int defedtBarAlbPN_Enabled ;
   private int defedtBarTipDis_Enabled ;
   private int defedtBarGraCob_Enabled ;
   private int defchkBarTipCor_Enabled ;
   private int defedtBarFasExt_Enabled ;
   private int defedtAlbMetULi_Enabled ;
   private int defedtAlbCliCod_Enabled ;
   private int defedtBarEstTip_Enabled ;
   private int defedtBarPreUnd_Enabled ;
   private int defedtBarAlbUnd_Enabled ;
   private int defedtBarNomCli_Enabled ;
   private int defedtBarNumCli_Enabled ;
   private int defedtAlbNumcli_Enabled ;
   private int defedtBarTipArt_Enabled ;
   private int defedtAlbTipArt_Enabled ;
   private int defedtAlbColNum_Enabled ;
   private int defedtAlbNomCli_Enabled ;
   private int defedtAlbColNom_Enabled ;
   private int defedtAlbSerD_Enabled ;
   private int defedtAlbSer_Enabled ;
   private int defedtCliCod_Enabled ;
   private int defedtBarCodPar_Enabled ;
   private int defedtBarCodReo_Enabled ;
   private int defedtBarCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int GXv_int13[] ;
   private int GXv_int15[] ;
   private int Z198BarPie ;
   private int ZV176PzasLan ;
   private int GXv_int18[] ;
   private int ZV165PieAnt ;
   private long wcpOAV199AlbProCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long AV199AlbProCod ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private long GXv_int17[] ;
   private java.math.BigDecimal Z1263BarAlbMtrE ;
   private java.math.BigDecimal Z1262BarPreKgm ;
   private java.math.BigDecimal Z1264BarPreMtr ;
   private java.math.BigDecimal Z40AlbProRec ;
   private java.math.BigDecimal Z1261BarAlbKgmE ;
   private java.math.BigDecimal Z12196BarPreUnd ;
   private java.math.BigDecimal Z1461BarAlbPN ;
   private java.math.BigDecimal Z7994AlbDto ;
   private java.math.BigDecimal Z7104AlbEncA ;
   private java.math.BigDecimal Z7103AlbEncL ;
   private java.math.BigDecimal Z2761AlbBarRec ;
   private java.math.BigDecimal Z5354AlbImpMan ;
   private java.math.BigDecimal O1263BarAlbMtrE ;
   private java.math.BigDecimal O1261BarAlbKgmE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV108KilAnt ;
   private java.math.BigDecimal AV150MetAnt ;
   private java.math.BigDecimal AV38KgsHdr ;
   private java.math.BigDecimal A7994AlbDto ;
   private java.math.BigDecimal A7104AlbEncA ;
   private java.math.BigDecimal A7103AlbEncL ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal A12196BarPreUnd ;
   private java.math.BigDecimal AV45BarKgm ;
   private java.math.BigDecimal AV151Metros ;
   private java.math.BigDecimal A1279BarKla ;
   private java.math.BigDecimal A1280BarMla ;
   private java.math.BigDecimal T1263BarAlbMtrE ;
   private java.math.BigDecimal T1261BarAlbKgmE ;
   private java.math.BigDecimal Z1280BarMla ;
   private java.math.BigDecimal Z1279BarKla ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal ZV151Metros ;
   private java.math.BigDecimal ZV45BarKgm ;
   private java.math.BigDecimal ZV38KgsHdr ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal ZV108KilAnt ;
   private java.math.BigDecimal ZV150MetAnt ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV198EmprCod ;
   private String Z396EmprCod ;
   private String Z7101AlbLic ;
   private String Z1253EmprGuiRem ;
   private String N1253EmprGuiRem ;
   private String Z130BarCodPar ;
   private String Z2839AlbProVal ;
   private String Z3392AlbColNom ;
   private String Z3391AlbSer ;
   private String Z8879AlbSerD ;
   private String Z12232AlbNomCli ;
   private String Z4815AlbEncCli ;
   private String Z1095AlbTipEnt ;
   private String Z2398BarFasExt ;
   private String Z2441AlbHdrObs ;
   private String Z7993AlbMqTj ;
   private String Z7992AlbDf3 ;
   private String Z7991AlbDf2 ;
   private String Z7990AlbDf1 ;
   private String Z7989AlbCald ;
   private String Z3153CodCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV158Msg_acc ;
   private String Gx_mode ;
   private String A2839AlbProVal ;
   private String AV155Modo2 ;
   private String A1095AlbTipEnt ;
   private String AV171TipDis ;
   private String AV159Msg_ctrl ;
   private String A7989AlbCald ;
   private String A3392AlbColNom ;
   private String A7990AlbDf1 ;
   private String A7991AlbDf2 ;
   private String A7992AlbDf3 ;
   private String A4815AlbEncCli ;
   private String A2441AlbHdrObs ;
   private String A7993AlbMqTj ;
   private String A12232AlbNomCli ;
   private String A3391AlbSer ;
   private String A8879AlbSerD ;
   private String A2398BarFasExt ;
   private String A3153CodCod ;
   private String A1253EmprGuiRem ;
   private String AV198EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprGuiRem_Internalname ;
   private String sGXsfl_35_idx="0001" ;
   private String edtCodCod_Internalname ;
   private String edtPlasCod_Internalname ;
   private String edtBarAlbPlas_Internalname ;
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
   private String edtEmprGuiRem_Jsonclick ;
   private String divTablainformaciongeneral_Internalname ;
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtnregresar_Internalname ;
   private String bttBtnregresar_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String Dvpanel_panelfases_Width ;
   private String Dvpanel_panelfases_Cls ;
   private String Dvpanel_panelfases_Title ;
   private String Dvpanel_panelfases_Iconposition ;
   private String Dvpanel_panelfases_Internalname ;
   private String divPanelfases_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnfases_Internalname ;
   private String bttBtnfases_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtAlbLic_Internalname ;
   private String A7101AlbLic ;
   private String edtAlbLic_Jsonclick ;
   private String edtAlbEnvFtp_Internalname ;
   private String edtAlbEnvFtp_Jsonclick ;
   private String sMode195 ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodPar_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtAlbSer_Internalname ;
   private String edtAlbSerD_Internalname ;
   private String edtAlbColNom_Internalname ;
   private String edtAlbNomCli_Internalname ;
   private String edtAlbColNum_Internalname ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtBarPreKgm_Internalname ;
   private String edtAlbHdrAnc_Internalname ;
   private String edtAlbHdrgm2_Internalname ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarPreMtr_Internalname ;
   private String edtBarAlbPie_Internalname ;
   private String edtTubCod_Internalname ;
   private String edtBarAlbTub_Internalname ;
   private String edtAlbHdrObs_Internalname ;
   private String edtAlbTipEnt_Internalname ;
   private String edtAlbTipArt_Internalname ;
   private String edtBarTipArt_Internalname ;
   private String edtAlbNumcli_Internalname ;
   private String edtBarNumCli_Internalname ;
   private String edtBarNomCli_Internalname ;
   private String edtBarAlbUnd_Internalname ;
   private String edtBarPreUnd_Internalname ;
   private String edtBarEstTip_Internalname ;
   private String edtAlbCliCod_Internalname ;
   private String edtAlbMetULi_Internalname ;
   private String edtBarFasExt_Internalname ;
   private String edtBarGraCob_Internalname ;
   private String edtBarTipDis_Internalname ;
   private String edtBarAlbPN_Internalname ;
   private String edtBarCtrPdas_Internalname ;
   private String edtAlbDto_Internalname ;
   private String edtAlbMqTj_Internalname ;
   private String edtAlbDf3_Internalname ;
   private String edtAlbDf2_Internalname ;
   private String edtAlbDf1_Internalname ;
   private String edtAlbCald_Internalname ;
   private String edtAlbEncA_Internalname ;
   private String edtAlbEncL_Internalname ;
   private String edtAlbObsM_Internalname ;
   private String edtAlbBarRec_Internalname ;
   private String edtAlbImpMan_Internalname ;
   private String edtBarDisNum_Internalname ;
   private String edtBarGraAca_Internalname ;
   private String edtAlbEncCli_Internalname ;
   private String edtBarEncCli_Internalname ;
   private String edtBarSerDsc_Internalname ;
   private String edtBarTipCol_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNom_Internalname ;
   private String edtAlbTipCol_Internalname ;
   private String edtBarPart_Internalname ;
   private String edtBarAlbBul_Internalname ;
   private String edtAlbProRec_Internalname ;
   private String edtAlbProEsp_Internalname ;
   private String edtBarKla_Internalname ;
   private String edtBarMla_Internalname ;
   private String edtBarPlz_Internalname ;
   private String edtBarPie_Internalname ;
   private String edtBarFecSal_Internalname ;
   private String edtBarAncAca1_Internalname ;
   private String edtBarSit_Internalname ;
   private String edtBarSer_Internalname ;
   private String edtGuiFasULin_Internalname ;
   private String edtAlbHdrUlin_Internalname ;
   private String edtBarAcaAnh_Internalname ;
   private String edtAlbCadEnc_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String AV203Insert_EmprGuiRem ;
   private String A1244GuiRemCln ;
   private String A407EmprNom ;
   private String AV220Pgmname ;
   private String AV163Msg_k ;
   private String AV36AlbSec ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_panelfases_Objectcall ;
   private String Dvpanel_panelfases_Class ;
   private String Dvpanel_panelfases_Height ;
   private String hsh ;
   private String sMode3 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A1234BarNomCli ;
   private String A5034BarEstTip ;
   private String A5291BarTipCor ;
   private String A2010BarTipDis ;
   private String A5253BarAcc ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A365DisDes ;
   private String A212BarSer ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String Z407EmprNom ;
   private String Z1244GuiRemCln ;
   private String Z1234BarNomCli ;
   private String Z5034BarEstTip ;
   private String Z5291BarTipCor ;
   private String Z2010BarTipDis ;
   private String Z5253BarAcc ;
   private String Z143BarDisNum ;
   private String Z4812BarEncCli ;
   private String Z1652BarSerDsc ;
   private String Z135BarColNom ;
   private String Z212BarSer ;
   private String Z365DisDes ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtAlbSer_Jsonclick ;
   private String edtAlbSerD_Jsonclick ;
   private String edtAlbColNom_Jsonclick ;
   private String edtAlbNomCli_Jsonclick ;
   private String edtAlbColNum_Jsonclick ;
   private String edtCodCod_Jsonclick ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtBarPreKgm_Jsonclick ;
   private String edtAlbHdrAnc_Jsonclick ;
   private String edtAlbHdrgm2_Jsonclick ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtBarPreMtr_Jsonclick ;
   private String edtBarAlbPie_Jsonclick ;
   private String edtTubCod_Jsonclick ;
   private String edtBarAlbTub_Jsonclick ;
   private String edtPlasCod_Jsonclick ;
   private String edtBarAlbPlas_Jsonclick ;
   private String edtAlbHdrObs_Jsonclick ;
   private String edtAlbTipEnt_Jsonclick ;
   private String edtAlbTipArt_Jsonclick ;
   private String edtBarTipArt_Jsonclick ;
   private String edtAlbNumcli_Jsonclick ;
   private String edtBarNumCli_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarAlbUnd_Jsonclick ;
   private String edtBarPreUnd_Jsonclick ;
   private String edtBarEstTip_Jsonclick ;
   private String edtAlbCliCod_Jsonclick ;
   private String edtAlbMetULi_Jsonclick ;
   private String edtBarFasExt_Jsonclick ;
   private String edtBarGraCob_Jsonclick ;
   private String edtBarTipDis_Jsonclick ;
   private String edtBarAlbPN_Jsonclick ;
   private String edtBarCtrPdas_Jsonclick ;
   private String edtAlbDto_Jsonclick ;
   private String edtAlbMqTj_Jsonclick ;
   private String edtAlbDf3_Jsonclick ;
   private String edtAlbDf2_Jsonclick ;
   private String edtAlbDf1_Jsonclick ;
   private String edtAlbCald_Jsonclick ;
   private String edtAlbEncA_Jsonclick ;
   private String edtAlbEncL_Jsonclick ;
   private String edtAlbObsM_Jsonclick ;
   private String edtAlbBarRec_Jsonclick ;
   private String edtAlbImpMan_Jsonclick ;
   private String edtBarDisNum_Jsonclick ;
   private String edtBarGraAca_Jsonclick ;
   private String edtAlbEncCli_Jsonclick ;
   private String edtBarEncCli_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarTipCol_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtAlbTipCol_Jsonclick ;
   private String edtBarPart_Jsonclick ;
   private String edtBarAlbBul_Jsonclick ;
   private String edtAlbProRec_Jsonclick ;
   private String edtAlbProEsp_Jsonclick ;
   private String edtBarKla_Jsonclick ;
   private String edtBarMla_Jsonclick ;
   private String edtBarPlz_Jsonclick ;
   private String edtBarPie_Jsonclick ;
   private String edtBarFecSal_Jsonclick ;
   private String edtBarAncAca1_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtGuiFasULin_Jsonclick ;
   private String edtAlbHdrUlin_Jsonclick ;
   private String edtBarAcaAnh_Jsonclick ;
   private String edtAlbCadEnc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV155Modo2 ;
   private String i2839AlbProVal ;
   private String i1095AlbTipEnt ;
   private String subGridlevel_level1_Header ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String ZV158Msg_acc ;
   private String ZV171TipDis ;
   private String ZV159Msg_ctrl ;
   private String GXv_char20[] ;
   private String GXv_char4[] ;
   private String ZV163Msg_k ;
   private java.util.Date AV35AlbProFch ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Z161BarFecSal ;
   private java.util.Date GXv_date19[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1206TubCod ;
   private boolean n3153CodCod ;
   private boolean n6466PlasCod ;
   private boolean wbErr ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_panelfases_Autowidth ;
   private boolean Dvpanel_panelfases_Autoheight ;
   private boolean Dvpanel_panelfases_Collapsible ;
   private boolean Dvpanel_panelfases_Collapsed ;
   private boolean Dvpanel_panelfases_Showcollapseicon ;
   private boolean Dvpanel_panelfases_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_panelfases_Enabled ;
   private boolean Dvpanel_panelfases_Showheader ;
   private boolean Dvpanel_panelfases_Visible ;
   private boolean returnInSub ;
   private boolean AV204ExisteRegistro ;
   private boolean GXt_boolean8 ;
   private boolean GXv_boolean9[] ;
   private boolean AV211Refrescar ;
   private boolean n4937BarCtrPdas ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean Gx_longc ;
   private String Z6814AlbObsM ;
   private String A6814AlbObsM ;
   private String AV212NombreParametro ;
   private String AV205NombreDinamica ;
   private String AV209SdtParametroCallsJson ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV192WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelfases ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV206ObjetoRefrescar ;
   private HTMLChoice cmbAlbProVal ;
   private ICheckbox chkBarTipCor ;
   private ICheckbox chkBarAcc ;
   private HTMLChoice cmbBarEstReo ;
   private ICheckbox chkDisDes ;
   private IDataStoreProvider pr_default ;
   private String[] T01L415_A407EmprNom ;
   private boolean[] T01L415_n407EmprNom ;
   private String[] T01L414_A1244GuiRemCln ;
   private long[] T01L416_A30AlbProCod ;
   private String[] T01L416_A407EmprNom ;
   private boolean[] T01L416_n407EmprNom ;
   private String[] T01L416_A1244GuiRemCln ;
   private String[] T01L416_A7101AlbLic ;
   private byte[] T01L416_A5805AlbEnvFtp ;
   private String[] T01L416_A1253EmprGuiRem ;
   private int[] T01L416_A1243GuiRemCli ;
   private String[] T01L416_A396EmprCod ;
   private String[] T01L417_A1244GuiRemCln ;
   private String[] T01L418_A396EmprCod ;
   private long[] T01L418_A30AlbProCod ;
   private long[] T01L413_A30AlbProCod ;
   private String[] T01L413_A7101AlbLic ;
   private byte[] T01L413_A5805AlbEnvFtp ;
   private String[] T01L413_A1253EmprGuiRem ;
   private int[] T01L413_A1243GuiRemCli ;
   private String[] T01L413_A396EmprCod ;
   private String[] T01L419_A396EmprCod ;
   private long[] T01L419_A30AlbProCod ;
   private String[] T01L420_A396EmprCod ;
   private long[] T01L420_A30AlbProCod ;
   private long[] T01L412_A30AlbProCod ;
   private String[] T01L412_A7101AlbLic ;
   private byte[] T01L412_A5805AlbEnvFtp ;
   private String[] T01L412_A1253EmprGuiRem ;
   private int[] T01L412_A1243GuiRemCli ;
   private String[] T01L412_A396EmprCod ;
   private String[] T01L424_A1244GuiRemCln ;
   private String[] T01L425_A396EmprCod ;
   private long[] T01L425_A30AlbProCod ;
   private byte[] T01L425_A12185DltLinObs ;
   private String[] T01L426_A396EmprCod ;
   private long[] T01L426_A30AlbProCod ;
   private int[] T01L426_A12176DltHdr ;
   private byte[] T01L426_A12177DltR ;
   private String[] T01L426_A12178DltP ;
   private String[] T01L427_A396EmprCod ;
   private long[] T01L427_A30AlbProCod ;
   private String[] T01L427_A7540Alb_NFisca ;
   private String[] T01L428_A396EmprCod ;
   private long[] T01L428_A30AlbProCod ;
   private int[] T01L428_A129BarCod ;
   private byte[] T01L428_A132BarCodReo ;
   private String[] T01L428_A130BarCodPar ;
   private short[] T01L428_A1240GuiFasLin ;
   private String[] T01L429_A396EmprCod ;
   private long[] T01L429_A30AlbProCod ;
   private byte[] T01L429_A915AlbPObsLin ;
   private String[] T01L430_A396EmprCod ;
   private long[] T01L430_A30AlbProCod ;
   private int[] T01L433_A361DisCod ;
   private long[] T01L433_A30AlbProCod ;
   private int[] T01L433_A1266BarAlbTub ;
   private String[] T01L433_A2839AlbProVal ;
   private short[] T01L433_A3271AlbHdrAnc ;
   private String[] T01L433_A3392AlbColNom ;
   private int[] T01L433_A3393AlbColNum ;
   private byte[] T01L433_A3394AlbTipCol ;
   private String[] T01L433_A3391AlbSer ;
   private String[] T01L433_A8879AlbSerD ;
   private int[] T01L433_A3886AlbCliCod ;
   private String[] T01L433_A12232AlbNomCli ;
   private int[] T01L433_A12233AlbNumcli ;
   private short[] T01L433_A12234AlbTipArt ;
   private short[] T01L433_A5019AlbHdrgm2 ;
   private short[] T01L433_A12905AlbCadEnc ;
   private String[] T01L433_A4815AlbEncCli ;
   private String[] T01L433_A1095AlbTipEnt ;
   private java.math.BigDecimal[] T01L433_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] T01L433_A1262BarPreKgm ;
   private java.math.BigDecimal[] T01L433_A1264BarPreMtr ;
   private byte[] T01L433_A32AlbProEsp ;
   private java.math.BigDecimal[] T01L433_A40AlbProRec ;
   private String[] T01L433_A2398BarFasExt ;
   private java.math.BigDecimal[] T01L433_A1261BarAlbKgmE ;
   private int[] T01L433_A1265BarAlbPie ;
   private short[] T01L433_A6466PlasCod ;
   private boolean[] T01L433_n6466PlasCod ;
   private short[] T01L433_A6467BarAlbPlas ;
   private String[] T01L433_A2441AlbHdrObs ;
   private int[] T01L433_A1235BarNumCli ;
   private String[] T01L433_A1234BarNomCli ;
   private int[] T01L433_A12195BarAlbUnd ;
   private java.math.BigDecimal[] T01L433_A12196BarPreUnd ;
   private String[] T01L433_A5034BarEstTip ;
   private short[] T01L433_A6645AlbMetULi ;
   private String[] T01L433_A5291BarTipCor ;
   private byte[] T01L433_A5027BarGraCob ;
   private String[] T01L433_A2010BarTipDis ;
   private java.math.BigDecimal[] T01L433_A1461BarAlbPN ;
   private byte[] T01L433_A4937BarCtrPdas ;
   private boolean[] T01L433_n4937BarCtrPdas ;
   private java.math.BigDecimal[] T01L433_A7994AlbDto ;
   private String[] T01L433_A7993AlbMqTj ;
   private String[] T01L433_A7992AlbDf3 ;
   private String[] T01L433_A7991AlbDf2 ;
   private String[] T01L433_A7990AlbDf1 ;
   private String[] T01L433_A7989AlbCald ;
   private java.math.BigDecimal[] T01L433_A7104AlbEncA ;
   private java.math.BigDecimal[] T01L433_A7103AlbEncL ;
   private String[] T01L433_A6814AlbObsM ;
   private java.math.BigDecimal[] T01L433_A2761AlbBarRec ;
   private String[] T01L433_A5253BarAcc ;
   private java.math.BigDecimal[] T01L433_A5354AlbImpMan ;
   private byte[] T01L433_A148BarEstReo ;
   private String[] T01L433_A143BarDisNum ;
   private short[] T01L433_A1909BarGraAca ;
   private String[] T01L433_A4812BarEncCli ;
   private String[] T01L433_A1652BarSerDsc ;
   private byte[] T01L433_A218BarTipCol ;
   private int[] T01L433_A136BarColNum ;
   private String[] T01L433_A135BarColNom ;
   private short[] T01L433_A1503BarPart ;
   private short[] T01L433_A1458BarAlbBul ;
   private String[] T01L433_A365DisDes ;
   private java.util.Date[] T01L433_A161BarFecSal ;
   private short[] T01L433_A125BarAncAca1 ;
   private byte[] T01L433_A213BarSit ;
   private String[] T01L433_A212BarSer ;
   private short[] T01L433_A1248GuiFasULin ;
   private short[] T01L433_A2763AlbHdrUlin ;
   private short[] T01L433_A4466BarAcaAnh ;
   private short[] T01L433_A5051TipAcaCod ;
   private String[] T01L433_A396EmprCod ;
   private int[] T01L433_A129BarCod ;
   private byte[] T01L433_A132BarCodReo ;
   private String[] T01L433_A130BarCodPar ;
   private short[] T01L433_A1206TubCod ;
   private boolean[] T01L433_n1206TubCod ;
   private String[] T01L433_A3153CodCod ;
   private boolean[] T01L433_n3153CodCod ;
   private int[] T01L433_A252CliCod ;
   private boolean[] T01L433_n252CliCod ;
   private short[] T01L433_A217BarTipArt ;
   private boolean[] T01L433_n217BarTipArt ;
   private java.math.BigDecimal[] T01L433_A1280BarMla ;
   private java.math.BigDecimal[] T01L433_A1279BarKla ;
   private short[] T01L433_A1292BarPlz ;
   private int[] T01L433_A898BarPieNDes ;
   private short[] T01L433_A199BarPie1 ;
   private String[] T01L45_A396EmprCod ;
   private String[] T01L46_A396EmprCod ;
   private int[] T01L44_A361DisCod ;
   private int[] T01L44_A1235BarNumCli ;
   private String[] T01L44_A1234BarNomCli ;
   private String[] T01L44_A5034BarEstTip ;
   private String[] T01L44_A5291BarTipCor ;
   private byte[] T01L44_A5027BarGraCob ;
   private String[] T01L44_A2010BarTipDis ;
   private byte[] T01L44_A4937BarCtrPdas ;
   private boolean[] T01L44_n4937BarCtrPdas ;
   private String[] T01L44_A5253BarAcc ;
   private byte[] T01L44_A148BarEstReo ;
   private String[] T01L44_A143BarDisNum ;
   private short[] T01L44_A1909BarGraAca ;
   private String[] T01L44_A4812BarEncCli ;
   private String[] T01L44_A1652BarSerDsc ;
   private byte[] T01L44_A218BarTipCol ;
   private int[] T01L44_A136BarColNum ;
   private String[] T01L44_A135BarColNom ;
   private short[] T01L44_A1503BarPart ;
   private java.util.Date[] T01L44_A161BarFecSal ;
   private short[] T01L44_A125BarAncAca1 ;
   private byte[] T01L44_A213BarSit ;
   private String[] T01L44_A212BarSer ;
   private short[] T01L44_A4466BarAcaAnh ;
   private int[] T01L44_A252CliCod ;
   private boolean[] T01L44_n252CliCod ;
   private short[] T01L44_A217BarTipArt ;
   private boolean[] T01L44_n217BarTipArt ;
   private String[] T01L47_A365DisDes ;
   private java.math.BigDecimal[] T01L49_A1280BarMla ;
   private java.math.BigDecimal[] T01L49_A1279BarKla ;
   private short[] T01L49_A1292BarPlz ;
   private int[] T01L411_A898BarPieNDes ;
   private short[] T01L411_A199BarPie1 ;
   private String[] T01L434_A396EmprCod ;
   private String[] T01L435_A396EmprCod ;
   private int[] T01L436_A361DisCod ;
   private int[] T01L436_A1235BarNumCli ;
   private String[] T01L436_A1234BarNomCli ;
   private String[] T01L436_A5034BarEstTip ;
   private String[] T01L436_A5291BarTipCor ;
   private byte[] T01L436_A5027BarGraCob ;
   private String[] T01L436_A2010BarTipDis ;
   private byte[] T01L436_A4937BarCtrPdas ;
   private boolean[] T01L436_n4937BarCtrPdas ;
   private String[] T01L436_A5253BarAcc ;
   private byte[] T01L436_A148BarEstReo ;
   private String[] T01L436_A143BarDisNum ;
   private short[] T01L436_A1909BarGraAca ;
   private String[] T01L436_A4812BarEncCli ;
   private String[] T01L436_A1652BarSerDsc ;
   private byte[] T01L436_A218BarTipCol ;
   private int[] T01L436_A136BarColNum ;
   private String[] T01L436_A135BarColNom ;
   private short[] T01L436_A1503BarPart ;
   private java.util.Date[] T01L436_A161BarFecSal ;
   private short[] T01L436_A125BarAncAca1 ;
   private byte[] T01L436_A213BarSit ;
   private String[] T01L436_A212BarSer ;
   private short[] T01L436_A4466BarAcaAnh ;
   private int[] T01L436_A252CliCod ;
   private boolean[] T01L436_n252CliCod ;
   private short[] T01L436_A217BarTipArt ;
   private boolean[] T01L436_n217BarTipArt ;
   private String[] T01L437_A365DisDes ;
   private java.math.BigDecimal[] T01L439_A1280BarMla ;
   private java.math.BigDecimal[] T01L439_A1279BarKla ;
   private short[] T01L439_A1292BarPlz ;
   private int[] T01L441_A898BarPieNDes ;
   private short[] T01L441_A199BarPie1 ;
   private String[] T01L442_A396EmprCod ;
   private long[] T01L442_A30AlbProCod ;
   private int[] T01L442_A129BarCod ;
   private byte[] T01L442_A132BarCodReo ;
   private String[] T01L442_A130BarCodPar ;
   private long[] T01L43_A30AlbProCod ;
   private int[] T01L43_A1266BarAlbTub ;
   private String[] T01L43_A2839AlbProVal ;
   private short[] T01L43_A3271AlbHdrAnc ;
   private String[] T01L43_A3392AlbColNom ;
   private int[] T01L43_A3393AlbColNum ;
   private byte[] T01L43_A3394AlbTipCol ;
   private String[] T01L43_A3391AlbSer ;
   private String[] T01L43_A8879AlbSerD ;
   private int[] T01L43_A3886AlbCliCod ;
   private String[] T01L43_A12232AlbNomCli ;
   private int[] T01L43_A12233AlbNumcli ;
   private short[] T01L43_A12234AlbTipArt ;
   private short[] T01L43_A5019AlbHdrgm2 ;
   private short[] T01L43_A12905AlbCadEnc ;
   private String[] T01L43_A4815AlbEncCli ;
   private String[] T01L43_A1095AlbTipEnt ;
   private java.math.BigDecimal[] T01L43_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] T01L43_A1262BarPreKgm ;
   private java.math.BigDecimal[] T01L43_A1264BarPreMtr ;
   private byte[] T01L43_A32AlbProEsp ;
   private java.math.BigDecimal[] T01L43_A40AlbProRec ;
   private String[] T01L43_A2398BarFasExt ;
   private java.math.BigDecimal[] T01L43_A1261BarAlbKgmE ;
   private int[] T01L43_A1265BarAlbPie ;
   private short[] T01L43_A6466PlasCod ;
   private boolean[] T01L43_n6466PlasCod ;
   private short[] T01L43_A6467BarAlbPlas ;
   private String[] T01L43_A2441AlbHdrObs ;
   private int[] T01L43_A12195BarAlbUnd ;
   private java.math.BigDecimal[] T01L43_A12196BarPreUnd ;
   private short[] T01L43_A6645AlbMetULi ;
   private java.math.BigDecimal[] T01L43_A1461BarAlbPN ;
   private java.math.BigDecimal[] T01L43_A7994AlbDto ;
   private String[] T01L43_A7993AlbMqTj ;
   private String[] T01L43_A7992AlbDf3 ;
   private String[] T01L43_A7991AlbDf2 ;
   private String[] T01L43_A7990AlbDf1 ;
   private String[] T01L43_A7989AlbCald ;
   private java.math.BigDecimal[] T01L43_A7104AlbEncA ;
   private java.math.BigDecimal[] T01L43_A7103AlbEncL ;
   private String[] T01L43_A6814AlbObsM ;
   private java.math.BigDecimal[] T01L43_A2761AlbBarRec ;
   private java.math.BigDecimal[] T01L43_A5354AlbImpMan ;
   private short[] T01L43_A1458BarAlbBul ;
   private short[] T01L43_A1248GuiFasULin ;
   private short[] T01L43_A2763AlbHdrUlin ;
   private short[] T01L43_A5051TipAcaCod ;
   private String[] T01L43_A396EmprCod ;
   private int[] T01L43_A129BarCod ;
   private byte[] T01L43_A132BarCodReo ;
   private String[] T01L43_A130BarCodPar ;
   private short[] T01L43_A1206TubCod ;
   private boolean[] T01L43_n1206TubCod ;
   private String[] T01L43_A3153CodCod ;
   private boolean[] T01L43_n3153CodCod ;
   private long[] T01L42_A30AlbProCod ;
   private int[] T01L42_A1266BarAlbTub ;
   private String[] T01L42_A2839AlbProVal ;
   private short[] T01L42_A3271AlbHdrAnc ;
   private String[] T01L42_A3392AlbColNom ;
   private int[] T01L42_A3393AlbColNum ;
   private byte[] T01L42_A3394AlbTipCol ;
   private String[] T01L42_A3391AlbSer ;
   private String[] T01L42_A8879AlbSerD ;
   private int[] T01L42_A3886AlbCliCod ;
   private String[] T01L42_A12232AlbNomCli ;
   private int[] T01L42_A12233AlbNumcli ;
   private short[] T01L42_A12234AlbTipArt ;
   private short[] T01L42_A5019AlbHdrgm2 ;
   private short[] T01L42_A12905AlbCadEnc ;
   private String[] T01L42_A4815AlbEncCli ;
   private String[] T01L42_A1095AlbTipEnt ;
   private java.math.BigDecimal[] T01L42_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] T01L42_A1262BarPreKgm ;
   private java.math.BigDecimal[] T01L42_A1264BarPreMtr ;
   private byte[] T01L42_A32AlbProEsp ;
   private java.math.BigDecimal[] T01L42_A40AlbProRec ;
   private String[] T01L42_A2398BarFasExt ;
   private java.math.BigDecimal[] T01L42_A1261BarAlbKgmE ;
   private int[] T01L42_A1265BarAlbPie ;
   private short[] T01L42_A6466PlasCod ;
   private boolean[] T01L42_n6466PlasCod ;
   private short[] T01L42_A6467BarAlbPlas ;
   private String[] T01L42_A2441AlbHdrObs ;
   private int[] T01L42_A12195BarAlbUnd ;
   private java.math.BigDecimal[] T01L42_A12196BarPreUnd ;
   private short[] T01L42_A6645AlbMetULi ;
   private java.math.BigDecimal[] T01L42_A1461BarAlbPN ;
   private java.math.BigDecimal[] T01L42_A7994AlbDto ;
   private String[] T01L42_A7993AlbMqTj ;
   private String[] T01L42_A7992AlbDf3 ;
   private String[] T01L42_A7991AlbDf2 ;
   private String[] T01L42_A7990AlbDf1 ;
   private String[] T01L42_A7989AlbCald ;
   private java.math.BigDecimal[] T01L42_A7104AlbEncA ;
   private java.math.BigDecimal[] T01L42_A7103AlbEncL ;
   private String[] T01L42_A6814AlbObsM ;
   private java.math.BigDecimal[] T01L42_A2761AlbBarRec ;
   private java.math.BigDecimal[] T01L42_A5354AlbImpMan ;
   private short[] T01L42_A1458BarAlbBul ;
   private short[] T01L42_A1248GuiFasULin ;
   private short[] T01L42_A2763AlbHdrUlin ;
   private short[] T01L42_A5051TipAcaCod ;
   private String[] T01L42_A396EmprCod ;
   private int[] T01L42_A129BarCod ;
   private byte[] T01L42_A132BarCodReo ;
   private String[] T01L42_A130BarCodPar ;
   private short[] T01L42_A1206TubCod ;
   private boolean[] T01L42_n1206TubCod ;
   private String[] T01L42_A3153CodCod ;
   private boolean[] T01L42_n3153CodCod ;
   private int[] T01L446_A361DisCod ;
   private int[] T01L446_A1235BarNumCli ;
   private String[] T01L446_A1234BarNomCli ;
   private String[] T01L446_A5034BarEstTip ;
   private String[] T01L446_A5291BarTipCor ;
   private byte[] T01L446_A5027BarGraCob ;
   private String[] T01L446_A2010BarTipDis ;
   private byte[] T01L446_A4937BarCtrPdas ;
   private boolean[] T01L446_n4937BarCtrPdas ;
   private String[] T01L446_A5253BarAcc ;
   private byte[] T01L446_A148BarEstReo ;
   private String[] T01L446_A143BarDisNum ;
   private short[] T01L446_A1909BarGraAca ;
   private String[] T01L446_A4812BarEncCli ;
   private String[] T01L446_A1652BarSerDsc ;
   private byte[] T01L446_A218BarTipCol ;
   private int[] T01L446_A136BarColNum ;
   private String[] T01L446_A135BarColNom ;
   private short[] T01L446_A1503BarPart ;
   private java.util.Date[] T01L446_A161BarFecSal ;
   private short[] T01L446_A125BarAncAca1 ;
   private byte[] T01L446_A213BarSit ;
   private String[] T01L446_A212BarSer ;
   private short[] T01L446_A4466BarAcaAnh ;
   private int[] T01L446_A252CliCod ;
   private boolean[] T01L446_n252CliCod ;
   private short[] T01L446_A217BarTipArt ;
   private boolean[] T01L446_n217BarTipArt ;
   private String[] T01L447_A365DisDes ;
   private java.math.BigDecimal[] T01L449_A1280BarMla ;
   private java.math.BigDecimal[] T01L449_A1279BarKla ;
   private short[] T01L449_A1292BarPlz ;
   private int[] T01L451_A898BarPieNDes ;
   private short[] T01L451_A199BarPie1 ;
   private String[] T01L452_A396EmprCod ;
   private long[] T01L452_A30AlbProCod ;
   private int[] T01L452_A129BarCod ;
   private byte[] T01L452_A132BarCodReo ;
   private String[] T01L452_A130BarCodPar ;
   private short[] T01L452_A6648AlbMetLin ;
   private String[] T01L453_A396EmprCod ;
   private long[] T01L453_A30AlbProCod ;
   private int[] T01L453_A129BarCod ;
   private byte[] T01L453_A132BarCodReo ;
   private String[] T01L453_A130BarCodPar ;
   private short[] T01L453_A9639Et_Numero ;
   private String[] T01L454_A396EmprCod ;
   private long[] T01L454_A30AlbProCod ;
   private int[] T01L454_A129BarCod ;
   private byte[] T01L454_A132BarCodReo ;
   private String[] T01L454_A130BarCodPar ;
   private short[] T01L454_A6622AlbHdRLn ;
   private String[] T01L455_A396EmprCod ;
   private long[] T01L455_A30AlbProCod ;
   private int[] T01L455_A129BarCod ;
   private byte[] T01L455_A132BarCodReo ;
   private String[] T01L455_A130BarCodPar ;
   private short[] T01L455_A5456P_ForLin ;
   private String[] T01L456_A396EmprCod ;
   private long[] T01L456_A30AlbProCod ;
   private int[] T01L456_A129BarCod ;
   private byte[] T01L456_A132BarCodReo ;
   private String[] T01L456_A130BarCodPar ;
   private byte[] T01L456_A2524DisComLin ;
   private String[] T01L456_A1056DisComCod ;
   private String[] T01L456_A1032FonCod ;
   private String[] T01L457_A396EmprCod ;
   private long[] T01L457_A3617AlbTrnCod ;
   private long[] T01L457_A30AlbProCod ;
   private int[] T01L457_A129BarCod ;
   private byte[] T01L457_A132BarCodReo ;
   private String[] T01L457_A130BarCodPar ;
   private String[] T01L458_A396EmprCod ;
   private long[] T01L458_A30AlbProCod ;
   private int[] T01L458_A129BarCod ;
   private byte[] T01L458_A132BarCodReo ;
   private String[] T01L458_A130BarCodPar ;
   private short[] T01L458_A3621AlbPckLin ;
   private String[] T01L459_A396EmprCod ;
   private long[] T01L459_A30AlbProCod ;
   private int[] T01L459_A129BarCod ;
   private byte[] T01L459_A132BarCodReo ;
   private String[] T01L459_A130BarCodPar ;
   private short[] T01L459_A2764AlbHdrLin ;
   private String[] T01L460_A396EmprCod ;
   private long[] T01L460_A30AlbProCod ;
   private int[] T01L460_A129BarCod ;
   private byte[] T01L460_A132BarCodReo ;
   private String[] T01L460_A130BarCodPar ;
   private short[] T01L460_A1468AlbPrdLin ;
   private String[] T01L461_A396EmprCod ;
   private long[] T01L461_A30AlbProCod ;
   private int[] T01L461_A129BarCod ;
   private byte[] T01L461_A132BarCodReo ;
   private String[] T01L461_A130BarCodPar ;
   private String[] T01L461_A200BarPieCod ;
   private String[] T01L462_A396EmprCod ;
   private long[] T01L462_A30AlbProCod ;
   private int[] T01L462_A129BarCod ;
   private byte[] T01L462_A132BarCodReo ;
   private String[] T01L462_A130BarCodPar ;
   private short[] T01L462_A1240GuiFasLin ;
   private String[] T01L463_A396EmprCod ;
   private long[] T01L463_A30AlbProCod ;
   private int[] T01L463_A129BarCod ;
   private byte[] T01L463_A132BarCodReo ;
   private String[] T01L463_A130BarCodPar ;
   private String[] T01L464_A396EmprCod ;
   private String[] T01L465_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtSdtParametroCalls> AV208SdtParametroCallsCollection ;
   private app.SdtSdtParametroCalls AV207SdtParametroCalls ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV191TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV197TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV190WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class ttrn07__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn07__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn07__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn07__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn07__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01L42", "SELECT AlbProCod, BarAlbTub, AlbProVal, AlbHdrAnc, AlbColNom, AlbColNum, AlbTipCol, AlbSer, AlbSerD, AlbCliCod, AlbNomCli, AlbNumcli, AlbTipArt, AlbHdrgm2, AlbCadEnc, AlbEncCli, AlbTipEnt, BarAlbMtrE, BarPreKgm, BarPreMtr, AlbProEsp, AlbProRec, BarFasExt, BarAlbKgmE, BarAlbPie, PlasCod, BarAlbPlas, AlbHdrObs, BarAlbUnd, BarPreUnd, AlbMetULi, BarAlbPN, AlbDto, AlbMqTj, AlbDf3, AlbDf2, AlbDf1, AlbCald, AlbEncA, AlbEncL, AlbObsM, AlbBarRec, AlbImpMan, BarAlbBul, GuiFasULin, AlbHdrUlin, TipAcaCod, EmprCod, BarCod, BarCodReo, BarCodPar, TubCod, CodCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF BarAlbTub, AlbProVal, AlbHdrAnc, AlbColNom, AlbColNum, AlbTipCol, AlbSer, AlbSerD, AlbCliCod, AlbNomCli, AlbNumcli, AlbTipArt, AlbHdrgm2, AlbCadEnc, AlbEncCli, AlbTipEnt, BarAlbMtrE, BarPreKgm, BarPreMtr, AlbProEsp, AlbProRec, BarFasExt, BarAlbKgmE, BarAlbPie, PlasCod, BarAlbPlas, AlbHdrObs, BarAlbUnd, BarPreUnd, AlbMetULi, BarAlbPN, AlbDto, AlbMqTj, AlbDf3, AlbDf2, AlbDf1, AlbCald, AlbEncA, AlbEncL, AlbObsM, AlbBarRec, AlbImpMan, BarAlbBul, GuiFasULin, AlbHdrUlin, TipAcaCod, TubCod, CodCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L43", "SELECT AlbProCod, BarAlbTub, AlbProVal, AlbHdrAnc, AlbColNom, AlbColNum, AlbTipCol, AlbSer, AlbSerD, AlbCliCod, AlbNomCli, AlbNumcli, AlbTipArt, AlbHdrgm2, AlbCadEnc, AlbEncCli, AlbTipEnt, BarAlbMtrE, BarPreKgm, BarPreMtr, AlbProEsp, AlbProRec, BarFasExt, BarAlbKgmE, BarAlbPie, PlasCod, BarAlbPlas, AlbHdrObs, BarAlbUnd, BarPreUnd, AlbMetULi, BarAlbPN, AlbDto, AlbMqTj, AlbDf3, AlbDf2, AlbDf1, AlbCald, AlbEncA, AlbEncL, AlbObsM, AlbBarRec, AlbImpMan, BarAlbBul, GuiFasULin, AlbHdrUlin, TipAcaCod, EmprCod, BarCod, BarCodReo, BarCodPar, TubCod, CodCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L44", "SELECT DisCod, BarNumCli, BarNomCli, BarEstTip, BarTipCor, BarGraCob, BarTipDis, BarCtrPdas, BarAcc, BarEstReo, BarDisNum, BarGraAca, BarEncCli, BarSerDsc, BarTipCol, BarColNum, BarColNom, BarPart, BarFecSal, BarAncAca1, BarSit, BarSer, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L45", "SELECT EmprCod FROM TXPTUBOS WHERE EmprCod = ? AND TubCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L46", "SELECT EmprCod FROM TXPCODFAC WHERE EmprCod = ? AND CodCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L47", "SELECT DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L49", "SELECT COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarKla, 0) AS BarKla, COALESCE( T1.BarPlz, 0) AS BarPlz FROM (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla, SUM(BarPieLzd) AS BarPlz FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L411", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L412", "SELECT AlbProCod, AlbLic, AlbEnvFtp, EmprGuiRem, GuiRemCli, EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbLic, AlbEnvFtp, EmprGuiRem, GuiRemCli NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L413", "SELECT AlbProCod, AlbLic, AlbEnvFtp, EmprGuiRem, GuiRemCli, EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L414", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L415", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L416", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbProCod, T2.EmprNom, T3.CliNom AS GuiRemCln, TM1.AlbLic, TM1.AlbEnvFtp, TM1.EmprGuiRem AS EmprGuiRem, TM1.GuiRemCli AS GuiRemCli, TM1.EmprCod FROM ((TXPCALPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprGuiRem AND T3.CliCod = TM1.GuiRemCli) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L417", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L418", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L419", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( AlbProCod > ?) and EmprCod = ? ORDER BY EmprCod, AlbProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L420", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( AlbProCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, AlbProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01L421", "INSERT INTO TXPCALPRD(AlbProCod, AlbLic, AlbEnvFtp, EmprGuiRem, GuiRemCli, EmprCod, AlbProPri, AlbProfch, AlbProEst, AlbPObsCon, GuiRemDom, AlbDomEnv, TrnCod, AlbProEso, AlbProEnt, AlbSec, AlbDivTCod, AlbDivCod, AlbHorSal, AlbLocCar, AlbLocDes, AlbMat, AlbCliDes, AlbFecSal, AlbProBon, AlbProTBo, AlbMarca, AlbTipCal, AlbKilRea, AlbUsu, AlbOComp, AlbMarCo, AlbNumT, AlbDesp, AlbMotTr, AlbTipDoc, AlbCambio, AlbColCa, AlbObsCb, AlbProNroF, AlbDomEv, AlbFmd, ALbFmdc, AlbHhfm, AlbGrossT, AlbProAT, AlbTrnNm, AlbTrnDm, AlbTrnNc, AlbIvaCod, DltUltob, FpgCod, AlbPdATCUD, AlbFecAnu, AlbUsuAnu, AlbHorAnu, AlbPdSerAT, AlbPdTipAT, AlbEnvMail) VALUES(?, ?, ?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, ' ', 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01L422", "UPDATE TXPCALPRD SET AlbLic=?, AlbEnvFtp=?, EmprGuiRem=?, GuiRemCli=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01L423", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T01L424", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L425", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L426", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L427", "SELECT * FROM (SELECT EmprCod, AlbProCod, Alb_NFisca FROM TXPCNOTRE WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L428", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L429", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L430", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L433", "SELECT T2.DisCod, T1.AlbProCod, T1.BarAlbTub, T1.AlbProVal, T1.AlbHdrAnc, T1.AlbColNom, T1.AlbColNum, T1.AlbTipCol, T1.AlbSer, T1.AlbSerD, T1.AlbCliCod, T1.AlbNomCli, T1.AlbNumcli, T1.AlbTipArt, T1.AlbHdrgm2, T1.AlbCadEnc, T1.AlbEncCli, T1.AlbTipEnt, T1.BarAlbMtrE, T1.BarPreKgm, T1.BarPreMtr, T1.AlbProEsp, T1.AlbProRec, T1.BarFasExt, T1.BarAlbKgmE, T1.BarAlbPie, T1.PlasCod, T1.BarAlbPlas, T1.AlbHdrObs, T2.BarNumCli, T2.BarNomCli, T1.BarAlbUnd, T1.BarPreUnd, T2.BarEstTip, T1.AlbMetULi, T2.BarTipCor, T2.BarGraCob, T2.BarTipDis, T1.BarAlbPN, T2.BarCtrPdas, T1.AlbDto, T1.AlbMqTj, T1.AlbDf3, T1.AlbDf2, T1.AlbDf1, T1.AlbCald, T1.AlbEncA, T1.AlbEncL, T1.AlbObsM, T1.AlbBarRec, T2.BarAcc, T1.AlbImpMan, T2.BarEstReo, T2.BarDisNum, T2.BarGraAca, T2.BarEncCli, T2.BarSerDsc, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarPart, T1.BarAlbBul, T3.DisDes, T2.BarFecSal, T2.BarAncAca1, T2.BarSit, T2.BarSer, T1.GuiFasULin, T1.AlbHdrUlin, T2.BarAcaAnh, T1.TipAcaCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.TubCod, T1.CodCod, T2.CliCod, T2.BarTipArt, COALESCE( T4.BarMla, 0) AS BarMla, COALESCE( T4.BarKla, 0) AS BarKla, COALESCE( T4.BarPlz, 0) AS BarPlz, COALESCE( T5.BarPieNDes, 0) AS BarPieNDes, COALESCE( T5.BarPie1, 0) AS BarPie1 FROM ((((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) LEFT JOIN (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla, SUM(BarPieLzd) AS BarPlz FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.AlbProCod = ? and T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L434", "SELECT EmprCod FROM TXPTUBOS WHERE EmprCod = ? AND TubCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L435", "SELECT EmprCod FROM TXPCODFAC WHERE EmprCod = ? AND CodCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L436", "SELECT DisCod, BarNumCli, BarNomCli, BarEstTip, BarTipCor, BarGraCob, BarTipDis, BarCtrPdas, BarAcc, BarEstReo, BarDisNum, BarGraAca, BarEncCli, BarSerDsc, BarTipCol, BarColNum, BarColNom, BarPart, BarFecSal, BarAncAca1, BarSit, BarSer, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L437", "SELECT DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L439", "SELECT COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarKla, 0) AS BarKla, COALESCE( T1.BarPlz, 0) AS BarPlz FROM (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla, SUM(BarPieLzd) AS BarPlz FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L441", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L442", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01L443", "INSERT INTO TXPALBBAR(AlbProCod, BarAlbTub, AlbProVal, AlbHdrAnc, AlbColNom, AlbColNum, AlbTipCol, AlbSer, AlbSerD, AlbCliCod, AlbNomCli, AlbNumcli, AlbTipArt, AlbHdrgm2, AlbCadEnc, AlbEncCli, AlbTipEnt, BarAlbMtrE, BarPreKgm, BarPreMtr, AlbProEsp, AlbProRec, BarFasExt, BarAlbKgmE, BarAlbPie, PlasCod, BarAlbPlas, AlbHdrObs, BarAlbUnd, BarPreUnd, AlbMetULi, BarAlbPN, AlbDto, AlbMqTj, AlbDf3, AlbDf2, AlbDf1, AlbCald, AlbEncA, AlbEncL, AlbObsM, AlbBarRec, AlbImpMan, BarAlbBul, GuiFasULin, AlbHdrUlin, TipAcaCod, EmprCod, BarCod, BarCodReo, BarCodPar, TubCod, CodCod, AlbPConPie, BarAlbTar, BarAlbFor, BarAlbTip, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarFasExtD, BarAlbObs, BarAlbExt, BarAlbTin, AlbBarDto, AlbTipCon, AlbPckUlin, P_ForULin, AlbHdRUl, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, Et_UltNum, BarKgsCli, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01L444", "UPDATE TXPALBBAR SET BarAlbTub=?, AlbProVal=?, AlbHdrAnc=?, AlbColNom=?, AlbColNum=?, AlbTipCol=?, AlbSer=?, AlbSerD=?, AlbCliCod=?, AlbNomCli=?, AlbNumcli=?, AlbTipArt=?, AlbHdrgm2=?, AlbCadEnc=?, AlbEncCli=?, AlbTipEnt=?, BarAlbMtrE=?, BarPreKgm=?, BarPreMtr=?, AlbProEsp=?, AlbProRec=?, BarFasExt=?, BarAlbKgmE=?, BarAlbPie=?, PlasCod=?, BarAlbPlas=?, AlbHdrObs=?, BarAlbUnd=?, BarPreUnd=?, AlbMetULi=?, BarAlbPN=?, AlbDto=?, AlbMqTj=?, AlbDf3=?, AlbDf2=?, AlbDf1=?, AlbCald=?, AlbEncA=?, AlbEncL=?, AlbObsM=?, AlbBarRec=?, AlbImpMan=?, BarAlbBul=?, GuiFasULin=?, AlbHdrUlin=?, TipAcaCod=?, TubCod=?, CodCod=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01L445", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01L446", "SELECT DisCod, BarNumCli, BarNomCli, BarEstTip, BarTipCor, BarGraCob, BarTipDis, BarCtrPdas, BarAcc, BarEstReo, BarDisNum, BarGraAca, BarEncCli, BarSerDsc, BarTipCol, BarColNum, BarColNom, BarPart, BarFecSal, BarAncAca1, BarSit, BarSer, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L447", "SELECT DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L449", "SELECT COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarKla, 0) AS BarKla, COALESCE( T1.BarPlz, 0) AS BarPlz FROM (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla, SUM(BarPieLzd) AS BarPlz FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L451", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L452", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbMetLin FROM TXPMETCAL WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L453", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, Et_Numero FROM TXPEDIETI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L454", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L455", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin FROM TXPALBQUI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L456", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L457", "SELECT * FROM (SELECT EmprCod, AlbTrnCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L458", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L459", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L460", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L461", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L462", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L463", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE AlbProCod = ? and EmprCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L464", "SELECT EmprCod FROM TXPCODFAC WHERE EmprCod = ? AND CodCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L465", "SELECT EmprCod FROM TXPTUBOS WHERE EmprCod = ? AND TubCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,5);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,5);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,5);
               ((String[]) buf[22])[0] = rslt.getString(23, 8);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,2);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((short[]) buf[25])[0] = rslt.getShort(26);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(27);
               ((String[]) buf[28])[0] = rslt.getString(28, 60);
               ((int[]) buf[29])[0] = rslt.getInt(29);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(30,5);
               ((short[]) buf[31])[0] = rslt.getShort(31);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(32,2);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(33,3);
               ((String[]) buf[34])[0] = rslt.getString(34, 16);
               ((String[]) buf[35])[0] = rslt.getString(35, 50);
               ((String[]) buf[36])[0] = rslt.getString(36, 50);
               ((String[]) buf[37])[0] = rslt.getString(37, 50);
               ((String[]) buf[38])[0] = rslt.getString(38, 12);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(39,2);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(40,2);
               ((String[]) buf[41])[0] = rslt.getVarchar(41);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(42,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(43,2);
               ((short[]) buf[44])[0] = rslt.getShort(44);
               ((short[]) buf[45])[0] = rslt.getShort(45);
               ((short[]) buf[46])[0] = rslt.getShort(46);
               ((short[]) buf[47])[0] = rslt.getShort(47);
               ((String[]) buf[48])[0] = rslt.getString(48, 3);
               ((int[]) buf[49])[0] = rslt.getInt(49);
               ((byte[]) buf[50])[0] = rslt.getByte(50);
               ((String[]) buf[51])[0] = rslt.getString(51, 1);
               ((short[]) buf[52])[0] = rslt.getShort(52);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(53, 6);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,5);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,5);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,5);
               ((String[]) buf[22])[0] = rslt.getString(23, 8);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,2);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((short[]) buf[25])[0] = rslt.getShort(26);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(27);
               ((String[]) buf[28])[0] = rslt.getString(28, 60);
               ((int[]) buf[29])[0] = rslt.getInt(29);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(30,5);
               ((short[]) buf[31])[0] = rslt.getShort(31);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(32,2);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(33,3);
               ((String[]) buf[34])[0] = rslt.getString(34, 16);
               ((String[]) buf[35])[0] = rslt.getString(35, 50);
               ((String[]) buf[36])[0] = rslt.getString(36, 50);
               ((String[]) buf[37])[0] = rslt.getString(37, 50);
               ((String[]) buf[38])[0] = rslt.getString(38, 12);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(39,2);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(40,2);
               ((String[]) buf[41])[0] = rslt.getVarchar(41);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(42,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(43,2);
               ((short[]) buf[44])[0] = rslt.getShort(44);
               ((short[]) buf[45])[0] = rslt.getShort(45);
               ((short[]) buf[46])[0] = rslt.getShort(46);
               ((short[]) buf[47])[0] = rslt.getShort(47);
               ((String[]) buf[48])[0] = rslt.getString(48, 3);
               ((int[]) buf[49])[0] = rslt.getInt(49);
               ((byte[]) buf[50])[0] = rslt.getByte(50);
               ((String[]) buf[51])[0] = rslt.getString(51, 1);
               ((short[]) buf[52])[0] = rslt.getShort(52);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(53, 6);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 13);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 16);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((int[]) buf[24])[0] = rslt.getInt(24);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(25);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,5);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,5);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(23,5);
               ((String[]) buf[23])[0] = rslt.getString(24, 8);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(25,2);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((short[]) buf[26])[0] = rslt.getShort(27);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 60);
               ((int[]) buf[30])[0] = rslt.getInt(30);
               ((String[]) buf[31])[0] = rslt.getString(31, 13);
               ((int[]) buf[32])[0] = rslt.getInt(32);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(33,5);
               ((String[]) buf[34])[0] = rslt.getString(34, 1);
               ((short[]) buf[35])[0] = rslt.getShort(35);
               ((String[]) buf[36])[0] = rslt.getString(36, 2);
               ((byte[]) buf[37])[0] = rslt.getByte(37);
               ((String[]) buf[38])[0] = rslt.getString(38, 1);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(39,2);
               ((byte[]) buf[40])[0] = rslt.getByte(40);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(41,3);
               ((String[]) buf[43])[0] = rslt.getString(42, 16);
               ((String[]) buf[44])[0] = rslt.getString(43, 50);
               ((String[]) buf[45])[0] = rslt.getString(44, 50);
               ((String[]) buf[46])[0] = rslt.getString(45, 50);
               ((String[]) buf[47])[0] = rslt.getString(46, 12);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(47,2);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(48,2);
               ((String[]) buf[50])[0] = rslt.getVarchar(49);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(50,2);
               ((String[]) buf[52])[0] = rslt.getString(51, 1);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(52,2);
               ((byte[]) buf[54])[0] = rslt.getByte(53);
               ((String[]) buf[55])[0] = rslt.getString(54, 8);
               ((short[]) buf[56])[0] = rslt.getShort(55);
               ((String[]) buf[57])[0] = rslt.getString(56, 20);
               ((String[]) buf[58])[0] = rslt.getString(57, 26);
               ((byte[]) buf[59])[0] = rslt.getByte(58);
               ((int[]) buf[60])[0] = rslt.getInt(59);
               ((String[]) buf[61])[0] = rslt.getString(60, 13);
               ((short[]) buf[62])[0] = rslt.getShort(61);
               ((short[]) buf[63])[0] = rslt.getShort(62);
               ((String[]) buf[64])[0] = rslt.getString(63, 1);
               ((java.util.Date[]) buf[65])[0] = rslt.getGXDate(64);
               ((short[]) buf[66])[0] = rslt.getShort(65);
               ((byte[]) buf[67])[0] = rslt.getByte(66);
               ((String[]) buf[68])[0] = rslt.getString(67, 16);
               ((short[]) buf[69])[0] = rslt.getShort(68);
               ((short[]) buf[70])[0] = rslt.getShort(69);
               ((short[]) buf[71])[0] = rslt.getShort(70);
               ((short[]) buf[72])[0] = rslt.getShort(71);
               ((String[]) buf[73])[0] = rslt.getString(72, 3);
               ((int[]) buf[74])[0] = rslt.getInt(73);
               ((byte[]) buf[75])[0] = rslt.getByte(74);
               ((String[]) buf[76])[0] = rslt.getString(75, 1);
               ((short[]) buf[77])[0] = rslt.getShort(76);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(77, 6);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((int[]) buf[81])[0] = rslt.getInt(78);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(79);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[85])[0] = rslt.getBigDecimal(80,2);
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(81,2);
               ((short[]) buf[87])[0] = rslt.getShort(82);
               ((int[]) buf[88])[0] = rslt.getInt(83);
               ((short[]) buf[89])[0] = rslt.getShort(84);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 13);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 16);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((int[]) buf[24])[0] = rslt.getInt(24);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(25);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 32 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 33 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 38 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 13);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 16);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((int[]) buf[24])[0] = rslt.getInt(24);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(25);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 40 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 55 :
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
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
            case 4 :
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
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 20);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 35 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 26);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 13);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 20);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 5);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 5);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 5);
               stmt.setString(23, (String)parms[22], 8);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 2);
               stmt.setInt(25, ((Number) parms[24]).intValue());
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[26]).shortValue());
               }
               stmt.setShort(27, ((Number) parms[27]).shortValue());
               stmt.setString(28, (String)parms[28], 60);
               stmt.setInt(29, ((Number) parms[29]).intValue());
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[30], 5);
               stmt.setShort(31, ((Number) parms[31]).shortValue());
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[32], 2);
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[33], 3);
               stmt.setString(34, (String)parms[34], 16);
               stmt.setString(35, (String)parms[35], 50);
               stmt.setString(36, (String)parms[36], 50);
               stmt.setString(37, (String)parms[37], 50);
               stmt.setString(38, (String)parms[38], 12);
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[39], 2);
               stmt.setBigDecimal(40, (java.math.BigDecimal)parms[40], 2);
               stmt.setVarchar(41, (String)parms[41], 2000, false);
               stmt.setBigDecimal(42, (java.math.BigDecimal)parms[42], 2);
               stmt.setBigDecimal(43, (java.math.BigDecimal)parms[43], 2);
               stmt.setShort(44, ((Number) parms[44]).shortValue());
               stmt.setShort(45, ((Number) parms[45]).shortValue());
               stmt.setShort(46, ((Number) parms[46]).shortValue());
               stmt.setShort(47, ((Number) parms[47]).shortValue());
               stmt.setString(48, (String)parms[48], 3);
               stmt.setInt(49, ((Number) parms[49]).intValue());
               stmt.setByte(50, ((Number) parms[50]).byteValue());
               stmt.setString(51, (String)parms[51], 1);
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(52, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[55], 6);
               }
               return;
            case 36 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 26);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setString(15, (String)parms[14], 20);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 5);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 5);
               stmt.setByte(20, ((Number) parms[19]).byteValue());
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 5);
               stmt.setString(22, (String)parms[21], 8);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 2);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[25]).shortValue());
               }
               stmt.setShort(26, ((Number) parms[26]).shortValue());
               stmt.setString(27, (String)parms[27], 60);
               stmt.setInt(28, ((Number) parms[28]).intValue());
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[29], 5);
               stmt.setShort(30, ((Number) parms[30]).shortValue());
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[31], 2);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[32], 3);
               stmt.setString(33, (String)parms[33], 16);
               stmt.setString(34, (String)parms[34], 50);
               stmt.setString(35, (String)parms[35], 50);
               stmt.setString(36, (String)parms[36], 50);
               stmt.setString(37, (String)parms[37], 12);
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[38], 2);
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[39], 2);
               stmt.setVarchar(40, (String)parms[40], 2000, false);
               stmt.setBigDecimal(41, (java.math.BigDecimal)parms[41], 2);
               stmt.setBigDecimal(42, (java.math.BigDecimal)parms[42], 2);
               stmt.setShort(43, ((Number) parms[43]).shortValue());
               stmt.setShort(44, ((Number) parms[44]).shortValue());
               stmt.setShort(45, ((Number) parms[45]).shortValue());
               stmt.setShort(46, ((Number) parms[46]).shortValue());
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[48]).shortValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[50], 6);
               }
               stmt.setString(49, (String)parms[51], 3);
               stmt.setLong(50, ((Number) parms[52]).longValue());
               stmt.setInt(51, ((Number) parms[53]).intValue());
               stmt.setByte(52, ((Number) parms[54]).byteValue());
               stmt.setString(53, (String)parms[55], 1);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 53 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
      }
   }

}

