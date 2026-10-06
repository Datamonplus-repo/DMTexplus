package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class albaran_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action45") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1243GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         AV61CliUltMq = (short)(GXutil.lval( httpContext.GetPar( "CliUltMq"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61CliUltMq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61CliUltMq), 4, 0));
         AV63Tintex = (byte)(GXutil.lval( httpContext.GetPar( "Tintex"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Tintex", GXutil.str( AV63Tintex, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_45_1T03( A396EmprCod, A1243GuiRemCli, AV61CliUltMq, AV63Tintex) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action46") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV7ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         AV64HueAlb = (byte)(GXutil.lval( httpContext.GetPar( "HueAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64HueAlb", GXutil.str( AV64HueAlb, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_46_1T03( A396EmprCod, AV7ContCod, A30AlbProCod, A39AlbProPri, AV64HueAlb) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action47") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV7ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         AV64HueAlb = (byte)(GXutil.lval( httpContext.GetPar( "HueAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64HueAlb", GXutil.str( AV64HueAlb, 1, 0));
         AV13FirmaD = (byte)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13FirmaD", GXutil.str( AV13FirmaD, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_47_1T03( A396EmprCod, AV7ContCod, A30AlbProCod, A39AlbProPri, AV64HueAlb, AV13FirmaD) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action48") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV7ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         AV65FlagAlb = (byte)(GXutil.lval( httpContext.GetPar( "FlagAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65FlagAlb", GXutil.str( AV65FlagAlb, 1, 0));
         AV66FlagCont = (byte)(GXutil.lval( httpContext.GetPar( "FlagCont"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66FlagCont", GXutil.str( AV66FlagCont, 1, 0));
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_48_1T03( Gx_mode, A396EmprCod, AV7ContCod, A30AlbProCod, AV65FlagAlb, AV66FlagCont, A39AlbProPri) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action49") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV7ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_49_1T03( A396EmprCod, AV7ContCod, A30AlbProCod, A39AlbProPri) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action50") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3869AlbCliDes = (int)(GXutil.lval( httpContext.GetPar( "AlbCliDes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         AV67FlagCli = (byte)(GXutil.lval( httpContext.GetPar( "FlagCli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67FlagCli", GXutil.str( AV67FlagCli, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_50_1T03( A396EmprCod, A3869AlbCliDes, AV67FlagCli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action51") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10019AlbHhfm = localUtil.parseDTimeParm( httpContext.GetPar( "AlbHhfm")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10017AlbFmd = httpContext.GetPar( "AlbFmd") ;
         n10017AlbFmd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
         A10018ALbFmdc = httpContext.GetPar( "ALbFmdc") ;
         httpContext.ajax_rsp_assign_attri("", false, "A10018ALbFmdc", A10018ALbFmdc);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         AV13FirmaD = (byte)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13FirmaD", GXutil.str( AV13FirmaD, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_51_1T03( Gx_mode, A396EmprCod, A10019AlbHhfm, A10017AlbFmd, A10018ALbFmdc, A30AlbProCod, A39AlbProPri, AV13FirmaD) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action52") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         AV14Fch = localUtil.parseDateParm( httpContext.GetPar( "Fch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Fch", localUtil.format(AV14Fch, "99/99/99"));
         AV15AlbLast = GXutil.lval( httpContext.GetPar( "AlbLast")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15AlbLast), 10, 0));
         A34AlbProfch = localUtil.parseDateParm( httpContext.GetPar( "AlbProfch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         AV11Msg_f = httpContext.GetPar( "Msg_f") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Msg_f", AV11Msg_f);
         AV16Ctrlf = (byte)(GXutil.lval( httpContext.GetPar( "Ctrlf"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Ctrlf", GXutil.str( AV16Ctrlf, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_52_1T03( A396EmprCod, A39AlbProPri, AV14Fch, AV15AlbLast, A34AlbProfch, AV11Msg_f, AV16Ctrlf) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action68") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         AV71hashAnt = (byte)(GXutil.lval( httpContext.GetPar( "hashAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71hashAnt", GXutil.str( AV71hashAnt, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_68_1T03( Gx_mode, A396EmprCod, A39AlbProPri, AV71hashAnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action70") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1243GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         AV69Endutex = (byte)(GXutil.lval( httpContext.GetPar( "Endutex"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69Endutex", GXutil.str( AV69Endutex, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_70_1T03( Gx_mode, A396EmprCod, A1243GuiRemCli, AV69Endutex) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel27"+"_"+"ALBHORSAL") == 0 )
      {
         A34AlbProfch = localUtil.parseDateParm( httpContext.GetPar( "AlbProfch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
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
         gx27asaalbhorsal1T03( A34AlbProfch, Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_77") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_77( A1253EmprGuiRem, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_78") == 0 )
      {
         A3108AlbDivCod = (byte)(GXutil.lval( httpContext.GetPar( "AlbDivCod"))) ;
         n3108AlbDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_78( A3108AlbDivCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_79") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A1259AlbDomEnv = (byte)(GXutil.lval( httpContext.GetPar( "AlbDomEnv"))) ;
         n1259AlbDomEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_79( A1253EmprGuiRem, A1243GuiRemCli, A1259AlbDomEnv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_74") == 0 )
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
         gxload_74( A1253EmprGuiRem, A1243GuiRemCli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_76") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_76( A396EmprCod, A840TrnCod) ;
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
            AV17EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
            AV51AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51AlbProCod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51AlbProCod), "ZZZZZZZZZ9")));
            AV122VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122VisualizarAcciones", AV122VisualizarAcciones);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISUALIZARACCIONES", getSecureSignedToken( "", AV122VisualizarAcciones));
            AV121AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV121AccionesEnPopup", AV121AccionesEnPopup);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCIONESENPOPUP", getSecureSignedToken( "", AV121AccionesEnPopup));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Albaranes", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbProfch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public albaran_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public albaran_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaran_impl.class ));
   }

   public albaran_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbEnvFtp = new HTMLChoice();
      cmbAlbProAT = new HTMLChoice();
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
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      }
      if ( cmbAlbProAT.getItemCount() > 0 )
      {
         A10765AlbProAT = cmbAlbProAT.getValidValue(A10765AlbProAT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProAT.setValue( GXutil.rtrim( A10765AlbProAT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Values", cmbAlbProAT.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divTablealbaran_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablealbarannumero_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "N° Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProPri_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProPri_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProPri_Internalname, GXutil.rtrim( A39AlbProPri), GXutil.rtrim( localUtil.format( A39AlbProPri, "9")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProPri_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProPri_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProEst_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProEst_Internalname, ".", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProEst_Internalname, GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProEst_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablefechas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProfch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProfch_Internalname, httpContext.getMessage( "Data", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbProfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProfch_Internalname, localUtil.format(A34AlbProfch, "99/99/99"), localUtil.format( A34AlbProfch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Albaranes\\Albaran.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbFecSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbFecSal_Internalname, httpContext.getMessage( "Data Saida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbFecSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbFecSal_Internalname, localUtil.format(A4023AlbFecSal, "99/99/99"), localUtil.format( A4023AlbFecSal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbFecSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbFecSal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbFecSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbFecSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Albaranes\\Albaran.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHorSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHorSal_Internalname, httpContext.getMessage( "Hora Saida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHorSal_Internalname, GXutil.rtrim( A3865AlbHorSal), GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHorSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHorSal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedalbdivcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbdivcod_Internalname, httpContext.getMessage( "Divisa", ""), "", "", lblTextblockalbdivcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_albdivcod.setProperty("Caption", Combo_albdivcod_Caption);
      ucCombo_albdivcod.setProperty("Cls", Combo_albdivcod_Cls);
      ucCombo_albdivcod.setProperty("EmptyItem", Combo_albdivcod_Emptyitem);
      ucCombo_albdivcod.setProperty("DropDownOptionsTitleSettingsIcons", AV113DDO_TitleSettingsIcons);
      ucCombo_albdivcod.setProperty("DropDownOptionsData", AV103AlbDivCod_Data);
      ucCombo_albdivcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_albdivcod_Internalname, "COMBO_ALBDIVCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDivCod_Internalname, httpContext.getMessage( "Divisa Albaran", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDivCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3108AlbDivCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDivCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDivCod_Visible, edtAlbDivCod_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableusuario_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbUsu_Internalname, GXutil.rtrim( A7098AlbUsu), GXutil.rtrim( localUtil.format( A7098AlbUsu, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbUsu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTablecliente_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedguiremcli_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockguiremcli_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockguiremcli_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_guiremcli.setProperty("Caption", Combo_guiremcli_Caption);
      ucCombo_guiremcli.setProperty("Cls", Combo_guiremcli_Cls);
      ucCombo_guiremcli.setProperty("EmptyItemText", Combo_guiremcli_Emptyitemtext);
      ucCombo_guiremcli.setProperty("DropDownOptionsTitleSettingsIcons", AV113DDO_TitleSettingsIcons);
      ucCombo_guiremcli.setProperty("DropDownOptionsData", AV114GuiRemCli_Data);
      ucCombo_guiremcli.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_guiremcli_Internalname, "COMBO_GUIREMCLIContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCli_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiRemCli_Visible, edtGuiRemCli_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedalbdomenv_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbdomenv_Internalname, httpContext.getMessage( "Endereço de envio", ""), "", "", lblTextblockalbdomenv_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_albdomenv.setProperty("Caption", Combo_albdomenv_Caption);
      ucCombo_albdomenv.setProperty("Cls", Combo_albdomenv_Cls);
      ucCombo_albdomenv.setProperty("DataListProc", Combo_albdomenv_Datalistproc);
      ucCombo_albdomenv.setProperty("EmptyItemText", Combo_albdomenv_Emptyitemtext);
      ucCombo_albdomenv.setProperty("DropDownOptionsTitleSettingsIcons", AV113DDO_TitleSettingsIcons);
      ucCombo_albdomenv.setProperty("DropDownOptionsData", AV104AlbDomEnv_Data);
      ucCombo_albdomenv.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_albdomenv_Internalname, "COMBO_ALBDOMENVContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDomEnv_Internalname, httpContext.getMessage( "Domicilio de Envio", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A1259AlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1259AlbDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A1259AlbDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDomEnv_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDomEnv_Visible, edtAlbDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTabletransportista_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedtrncod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktrncod_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblocktrncod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_trncod.setProperty("Caption", Combo_trncod_Caption);
      ucCombo_trncod.setProperty("Cls", Combo_trncod_Cls);
      ucCombo_trncod.setProperty("EmptyItemText", Combo_trncod_Emptyitemtext);
      ucCombo_trncod.setProperty("DropDownOptionsTitleSettingsIcons", AV113DDO_TitleSettingsIcons);
      ucCombo_trncod.setProperty("DropDownOptionsData", AV117TrnCod_Data);
      ucCombo_trncod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_trncod_Internalname, "COMBO_TRNCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnCod_Visible, edtTrnCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbMat_Internalname, httpContext.getMessage( "Matrícula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMat_Internalname, GXutil.rtrim( A3868AlbMat), GXutil.rtrim( localUtil.format( A3868AlbMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableat_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup2_Internalname, httpContext.getMessage( "AT", ""), 1, 0, "px", 0, "px", grpUnnamedgroup2_Class, "", "HLP_Albaranes\\Albaran.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divGrupoat_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTblgrupoat_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbEnvFtp.getInternalname()+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbEnvFtp, cmbAlbEnvFtp.getInternalname(), GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)), 1, cmbAlbEnvFtp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbEnvFtp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Albaranes\\Albaran.htm");
      cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbLic_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbLic_Internalname, httpContext.getMessage( "Código", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLic_Internalname, GXutil.rtrim( A7101AlbLic), GXutil.rtrim( localUtil.format( A7101AlbLic, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLic_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbLic_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProAT.getInternalname()+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProAT, cmbAlbProAT.getInternalname(), GXutil.rtrim( A10765AlbProAT), 1, cmbAlbProAT.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbProAT.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Albaranes\\Albaran.htm");
      cmbAlbProAT.setValue( GXutil.rtrim( A10765AlbProAT) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Values", cmbAlbProAT.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHhfm_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbHhfm_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHhfm_Internalname, localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10019AlbHhfm, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHhfm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHhfm_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbHhfm_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbHhfm_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Albaranes\\Albaran.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbGrossT_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbGrossT_Internalname, GXutil.ltrim( localUtil.ntoc( A10020AlbGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbGrossT_Enabled!=0) ? localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99") : localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbGrossT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbGrossT_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPdATCUD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPdATCUD_Internalname, httpContext.getMessage( "ATCUD", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPdATCUD_Internalname, GXutil.rtrim( A14069AlbPdATCUD), GXutil.rtrim( localUtil.format( A14069AlbPdATCUD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPdATCUD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbPdATCUD_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Hash", ""), 1, 0, "px", 0, "px", grpUnnamedgroup3_Class, "", "HLP_Albaranes\\Albaran.htm");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblGrupohash_Internalname, tblGrupohash_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTblhash_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbFmd_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "WizardStepDescription" ;
      StyleString = "" ;
      ClassString = "WizardStepDescription" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAlbFmd_Internalname, A10017AlbFmd, "", "", (short)(0), 1, edtAlbFmd_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</fieldset>") ;
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-9", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV124Pgmname), GXutil.rtrim( localUtil.format( AV124Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      /* User Defined Control */
      ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_albdivcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboalbdivcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV106ComboAlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboalbdivcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV106ComboAlbDivCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV106ComboAlbDivCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboalbdivcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboalbdivcod_Visible, edtavComboalbdivcod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_guiremcli_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboguiremcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV108ComboGuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboguiremcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV108ComboGuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV108ComboGuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboguiremcli_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboguiremcli_Visible, edtavComboguiremcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_albdomenv_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboalbdomenv_Internalname, GXutil.ltrim( localUtil.ntoc( AV107ComboAlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboalbdomenv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV107ComboAlbDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(AV107ComboAlbDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboalbdomenv_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboalbdomenv_Visible, edtavComboalbdomenv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_trncod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotrncod_Internalname, GXutil.ltrim( localUtil.ntoc( AV111ComboTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotrncod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV111ComboTrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV111ComboTrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtavCombotrncod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotrncod_Visible, edtavCombotrncod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprcod_Internalname, GXutil.rtrim( AV17EmprCod), GXutil.rtrim( localUtil.format( AV17EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavEmprcod_Visible, edtavEmprcod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran.htm");
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
      e111T02 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV113DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALBDIVCOD_DATA"), AV103AlbDivCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vGUIREMCLI_DATA"), AV114GuiRemCli_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALBDOMENV_DATA"), AV104AlbDomEnv_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRNCOD_DATA"), AV117TrnCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z1259AlbDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1259AlbDomEnv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z39AlbProPri = httpContext.cgiGet( "Z39AlbProPri") ;
            Z3865AlbHorSal = httpContext.cgiGet( "Z3865AlbHorSal") ;
            Z2242AlbSec = httpContext.cgiGet( "Z2242AlbSec") ;
            Z5141AlbIvaCod = httpContext.cgiGet( "Z5141AlbIvaCod") ;
            Z10836AlbTrnDm = httpContext.cgiGet( "Z10836AlbTrnDm") ;
            Z10837AlbTrnNc = httpContext.cgiGet( "Z10837AlbTrnNc") ;
            Z10835AlbTrnNm = httpContext.cgiGet( "Z10835AlbTrnNm") ;
            Z5805AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5805AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10765AlbProAT = httpContext.cgiGet( "Z10765AlbProAT") ;
            Z10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( "Z10020AlbGrossT")) ;
            Z10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( "Z10019AlbHhfm"), 0) ;
            Z10018ALbFmdc = httpContext.cgiGet( "Z10018ALbFmdc") ;
            Z10017AlbFmd = httpContext.cgiGet( "Z10017AlbFmd") ;
            Z7988AlbObsCb = httpContext.cgiGet( "Z7988AlbObsCb") ;
            Z7987AlbColCa = httpContext.cgiGet( "Z7987AlbColCa") ;
            Z7162AlbDesp = (int)(localUtil.ctol( httpContext.cgiGet( "Z7162AlbDesp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7986AlbCambio = localUtil.ctond( httpContext.cgiGet( "Z7986AlbCambio")) ;
            Z7985AlbTipDoc = (int)(localUtil.ctol( httpContext.cgiGet( "Z7985AlbTipDoc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7984AlbMotTr = httpContext.cgiGet( "Z7984AlbMotTr") ;
            Z5803AlbTipCal = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5803AlbTipCal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4023AlbFecSal = localUtil.ctod( httpContext.cgiGet( "Z4023AlbFecSal"), 0) ;
            Z7102AlbNumT = localUtil.ctol( httpContext.cgiGet( "Z7102AlbNumT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z7101AlbLic = httpContext.cgiGet( "Z7101AlbLic") ;
            Z7100AlbMarCo = httpContext.cgiGet( "Z7100AlbMarCo") ;
            Z7099AlbOComp = httpContext.cgiGet( "Z7099AlbOComp") ;
            Z7098AlbUsu = httpContext.cgiGet( "Z7098AlbUsu") ;
            Z5140AlbMarca = httpContext.cgiGet( "Z5140AlbMarca") ;
            Z3869AlbCliDes = (int)(localUtil.ctol( httpContext.cgiGet( "Z3869AlbCliDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3868AlbMat = httpContext.cgiGet( "Z3868AlbMat") ;
            Z3867AlbLocDes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3867AlbLocDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3866AlbLocCar = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3866AlbLocCar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3093AlbDivTCod = httpContext.cgiGet( "Z3093AlbDivTCod") ;
            Z33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z33AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1258GuiRemDom = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1258GuiRemDom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z34AlbProfch = localUtil.ctod( httpContext.cgiGet( "Z34AlbProfch"), 0) ;
            Z914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14069AlbPdATCUD = httpContext.cgiGet( "Z14069AlbPdATCUD") ;
            Z14073AlbPdSerAT = httpContext.cgiGet( "Z14073AlbPdSerAT") ;
            Z14074AlbPdTipAT = httpContext.cgiGet( "Z14074AlbPdTipAT") ;
            Z1253EmprGuiRem = httpContext.cgiGet( "Z1253EmprGuiRem") ;
            Z1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z1243GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3108AlbDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2242AlbSec = httpContext.cgiGet( "Z2242AlbSec") ;
            A5141AlbIvaCod = httpContext.cgiGet( "Z5141AlbIvaCod") ;
            A10836AlbTrnDm = httpContext.cgiGet( "Z10836AlbTrnDm") ;
            A10837AlbTrnNc = httpContext.cgiGet( "Z10837AlbTrnNc") ;
            A10835AlbTrnNm = httpContext.cgiGet( "Z10835AlbTrnNm") ;
            A10018ALbFmdc = httpContext.cgiGet( "Z10018ALbFmdc") ;
            A7988AlbObsCb = httpContext.cgiGet( "Z7988AlbObsCb") ;
            A7987AlbColCa = httpContext.cgiGet( "Z7987AlbColCa") ;
            A7162AlbDesp = (int)(localUtil.ctol( httpContext.cgiGet( "Z7162AlbDesp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7986AlbCambio = localUtil.ctond( httpContext.cgiGet( "Z7986AlbCambio")) ;
            A7985AlbTipDoc = (int)(localUtil.ctol( httpContext.cgiGet( "Z7985AlbTipDoc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7984AlbMotTr = httpContext.cgiGet( "Z7984AlbMotTr") ;
            A5803AlbTipCal = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5803AlbTipCal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7102AlbNumT = localUtil.ctol( httpContext.cgiGet( "Z7102AlbNumT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A7100AlbMarCo = httpContext.cgiGet( "Z7100AlbMarCo") ;
            A7099AlbOComp = httpContext.cgiGet( "Z7099AlbOComp") ;
            A5140AlbMarca = httpContext.cgiGet( "Z5140AlbMarca") ;
            A3869AlbCliDes = (int)(localUtil.ctol( httpContext.cgiGet( "Z3869AlbCliDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3867AlbLocDes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3867AlbLocDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3866AlbLocCar = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3866AlbLocCar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3093AlbDivTCod = httpContext.cgiGet( "Z3093AlbDivTCod") ;
            n3093AlbDivTCod = false ;
            A1258GuiRemDom = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1258GuiRemDom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1258GuiRemDom = false ;
            A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14073AlbPdSerAT = httpContext.cgiGet( "Z14073AlbPdSerAT") ;
            A14074AlbPdTipAT = httpContext.cgiGet( "Z14074AlbPdTipAT") ;
            A1253EmprGuiRem = httpContext.cgiGet( "Z1253EmprGuiRem") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "N3108AlbDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N1253EmprGuiRem = httpContext.cgiGet( "N1253EmprGuiRem") ;
            N1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "N1243GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N2242AlbSec = httpContext.cgiGet( "N2242AlbSec") ;
            AV112Cond_GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "vCOND_GUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV51AlbProCod = localUtil.ctol( httpContext.cgiGet( "vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV56Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV57Insert_AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALBDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV58Insert_EmprGuiRem = httpContext.cgiGet( "vINSERT_EMPRGUIREM") ;
            A1253EmprGuiRem = httpContext.cgiGet( "EMPRGUIREM") ;
            AV55Insert_GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_GUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV115IsVisibleAT = GXutil.strtobool( httpContext.cgiGet( "vISVISIBLEAT")) ;
            AV116IsVisibleHash = GXutil.strtobool( httpContext.cgiGet( "vISVISIBLEHASH")) ;
            AV101AlbProPri = httpContext.cgiGet( "vALBPROPRI") ;
            AV7ContCod = httpContext.cgiGet( "vCONTCOD") ;
            AV60AlbSec = httpContext.cgiGet( "vALBSEC") ;
            A2242AlbSec = httpContext.cgiGet( "ALBSEC") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3093AlbDivTCod = httpContext.cgiGet( "ALBDIVTCOD") ;
            A3869AlbCliDes = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCLIDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV61CliUltMq = (short)(localUtil.ctol( httpContext.cgiGet( "vCLIULTMQ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV64HueAlb = (byte)(localUtil.ctol( httpContext.cgiGet( "vHUEALB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13FirmaD = (byte)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV66FlagCont = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGCONT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV65FlagAlb = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGALB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV67FlagCli = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10018ALbFmdc = httpContext.cgiGet( "ALBFMDC") ;
            AV11Msg_f = httpContext.cgiGet( "vMSG_F") ;
            AV15AlbLast = localUtil.ctol( httpContext.cgiGet( "vALBLAST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV14Fch = localUtil.ctod( httpContext.cgiGet( "vFCH"), 0) ;
            A1260BusDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "BUSDOMENV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1260BusDomEnv = false ;
            AV18F_carvema = (byte)(localUtil.ctol( httpContext.cgiGet( "vF_CARVEMA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV68F_albanu = (byte)(localUtil.ctol( httpContext.cgiGet( "vF_ALBANU"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5140AlbMarca = httpContext.cgiGet( "ALBMARCA") ;
            AV12avisar = (byte)(localUtil.ctol( httpContext.cgiGet( "vAVISAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV44F_tinamar = (byte)(localUtil.ctol( httpContext.cgiGet( "vF_TINAMAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV69Endutex = (byte)(localUtil.ctol( httpContext.cgiGet( "vENDUTEX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV70msg_control = httpContext.cgiGet( "vMSG_CONTROL") ;
            AV71hashAnt = (byte)(localUtil.ctol( httpContext.cgiGet( "vHASHANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV62Clitipo = httpContext.cgiGet( "vCLITIPO") ;
            A5141AlbIvaCod = httpContext.cgiGet( "ALBIVACOD") ;
            A10836AlbTrnDm = httpContext.cgiGet( "ALBTRNDM") ;
            A10837AlbTrnNc = httpContext.cgiGet( "ALBTRNNC") ;
            A10835AlbTrnNm = httpContext.cgiGet( "ALBTRNNM") ;
            A7988AlbObsCb = httpContext.cgiGet( "ALBOBSCB") ;
            A7987AlbColCa = httpContext.cgiGet( "ALBCOLCA") ;
            A7162AlbDesp = (int)(localUtil.ctol( httpContext.cgiGet( "ALBDESP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7986AlbCambio = localUtil.ctond( httpContext.cgiGet( "ALBCAMBIO")) ;
            A7985AlbTipDoc = (int)(localUtil.ctol( httpContext.cgiGet( "ALBTIPDOC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7984AlbMotTr = httpContext.cgiGet( "ALBMOTTR") ;
            A5803AlbTipCal = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBTIPCAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7102AlbNumT = localUtil.ctol( httpContext.cgiGet( "ALBNUMT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A7100AlbMarCo = httpContext.cgiGet( "ALBMARCO") ;
            A7099AlbOComp = httpContext.cgiGet( "ALBOCOMP") ;
            A3867AlbLocDes = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBLOCDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3866AlbLocCar = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBLOCCAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1258GuiRemDom = (byte)(localUtil.ctol( httpContext.cgiGet( "GUIREMDOM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBPOBSCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14073AlbPdSerAT = httpContext.cgiGet( "ALBPDSERAT") ;
            A14074AlbPdTipAT = httpContext.cgiGet( "ALBPDTIPAT") ;
            A3145GuiRemDivT = httpContext.cgiGet( "GUIREMDIVT") ;
            n3145GuiRemDivT = false ;
            A1244GuiRemCln = httpContext.cgiGet( "GUIREMCLN") ;
            A3110GuiRemDiv = (byte)(localUtil.ctol( httpContext.cgiGet( "GUIREMDIV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3110GuiRemDiv = false ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A3643TrnNif = httpContext.cgiGet( "TRNNIF") ;
            n3643TrnNif = false ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
            A3109AlbDivAbr = httpContext.cgiGet( "ALBDIVABR") ;
            n3109AlbDivAbr = false ;
            Combo_albdivcod_Objectcall = httpContext.cgiGet( "COMBO_ALBDIVCOD_Objectcall") ;
            Combo_albdivcod_Class = httpContext.cgiGet( "COMBO_ALBDIVCOD_Class") ;
            Combo_albdivcod_Icontype = httpContext.cgiGet( "COMBO_ALBDIVCOD_Icontype") ;
            Combo_albdivcod_Icon = httpContext.cgiGet( "COMBO_ALBDIVCOD_Icon") ;
            Combo_albdivcod_Caption = httpContext.cgiGet( "COMBO_ALBDIVCOD_Caption") ;
            Combo_albdivcod_Tooltip = httpContext.cgiGet( "COMBO_ALBDIVCOD_Tooltip") ;
            Combo_albdivcod_Cls = httpContext.cgiGet( "COMBO_ALBDIVCOD_Cls") ;
            Combo_albdivcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_ALBDIVCOD_Selectedvalue_set") ;
            Combo_albdivcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_ALBDIVCOD_Selectedvalue_get") ;
            Combo_albdivcod_Selectedtext_set = httpContext.cgiGet( "COMBO_ALBDIVCOD_Selectedtext_set") ;
            Combo_albdivcod_Selectedtext_get = httpContext.cgiGet( "COMBO_ALBDIVCOD_Selectedtext_get") ;
            Combo_albdivcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_ALBDIVCOD_Gamoauthtoken") ;
            Combo_albdivcod_Ddointernalname = httpContext.cgiGet( "COMBO_ALBDIVCOD_Ddointernalname") ;
            Combo_albdivcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_ALBDIVCOD_Titlecontrolalign") ;
            Combo_albdivcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_ALBDIVCOD_Dropdownoptionstype") ;
            Combo_albdivcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDIVCOD_Enabled")) ;
            Combo_albdivcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDIVCOD_Visible")) ;
            Combo_albdivcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_ALBDIVCOD_Titlecontrolidtoreplace") ;
            Combo_albdivcod_Datalisttype = httpContext.cgiGet( "COMBO_ALBDIVCOD_Datalisttype") ;
            Combo_albdivcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDIVCOD_Allowmultipleselection")) ;
            Combo_albdivcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_ALBDIVCOD_Datalistfixedvalues") ;
            Combo_albdivcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDIVCOD_Isgriditem")) ;
            Combo_albdivcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDIVCOD_Hasdescription")) ;
            Combo_albdivcod_Datalistproc = httpContext.cgiGet( "COMBO_ALBDIVCOD_Datalistproc") ;
            Combo_albdivcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_ALBDIVCOD_Datalistprocparametersprefix") ;
            Combo_albdivcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_ALBDIVCOD_Remoteservicesparameters") ;
            Combo_albdivcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALBDIVCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_albdivcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDIVCOD_Includeonlyselectedoption")) ;
            Combo_albdivcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDIVCOD_Includeselectalloption")) ;
            Combo_albdivcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDIVCOD_Emptyitem")) ;
            Combo_albdivcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDIVCOD_Includeaddnewoption")) ;
            Combo_albdivcod_Htmltemplate = httpContext.cgiGet( "COMBO_ALBDIVCOD_Htmltemplate") ;
            Combo_albdivcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_ALBDIVCOD_Multiplevaluestype") ;
            Combo_albdivcod_Loadingdata = httpContext.cgiGet( "COMBO_ALBDIVCOD_Loadingdata") ;
            Combo_albdivcod_Noresultsfound = httpContext.cgiGet( "COMBO_ALBDIVCOD_Noresultsfound") ;
            Combo_albdivcod_Emptyitemtext = httpContext.cgiGet( "COMBO_ALBDIVCOD_Emptyitemtext") ;
            Combo_albdivcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_ALBDIVCOD_Onlyselectedvalues") ;
            Combo_albdivcod_Selectalltext = httpContext.cgiGet( "COMBO_ALBDIVCOD_Selectalltext") ;
            Combo_albdivcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_ALBDIVCOD_Multiplevaluesseparator") ;
            Combo_albdivcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_ALBDIVCOD_Addnewoptiontext") ;
            Combo_guiremcli_Objectcall = httpContext.cgiGet( "COMBO_GUIREMCLI_Objectcall") ;
            Combo_guiremcli_Class = httpContext.cgiGet( "COMBO_GUIREMCLI_Class") ;
            Combo_guiremcli_Icontype = httpContext.cgiGet( "COMBO_GUIREMCLI_Icontype") ;
            Combo_guiremcli_Icon = httpContext.cgiGet( "COMBO_GUIREMCLI_Icon") ;
            Combo_guiremcli_Caption = httpContext.cgiGet( "COMBO_GUIREMCLI_Caption") ;
            Combo_guiremcli_Tooltip = httpContext.cgiGet( "COMBO_GUIREMCLI_Tooltip") ;
            Combo_guiremcli_Cls = httpContext.cgiGet( "COMBO_GUIREMCLI_Cls") ;
            Combo_guiremcli_Selectedvalue_set = httpContext.cgiGet( "COMBO_GUIREMCLI_Selectedvalue_set") ;
            Combo_guiremcli_Selectedvalue_get = httpContext.cgiGet( "COMBO_GUIREMCLI_Selectedvalue_get") ;
            Combo_guiremcli_Selectedtext_set = httpContext.cgiGet( "COMBO_GUIREMCLI_Selectedtext_set") ;
            Combo_guiremcli_Selectedtext_get = httpContext.cgiGet( "COMBO_GUIREMCLI_Selectedtext_get") ;
            Combo_guiremcli_Gamoauthtoken = httpContext.cgiGet( "COMBO_GUIREMCLI_Gamoauthtoken") ;
            Combo_guiremcli_Ddointernalname = httpContext.cgiGet( "COMBO_GUIREMCLI_Ddointernalname") ;
            Combo_guiremcli_Titlecontrolalign = httpContext.cgiGet( "COMBO_GUIREMCLI_Titlecontrolalign") ;
            Combo_guiremcli_Dropdownoptionstype = httpContext.cgiGet( "COMBO_GUIREMCLI_Dropdownoptionstype") ;
            Combo_guiremcli_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Enabled")) ;
            Combo_guiremcli_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Visible")) ;
            Combo_guiremcli_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_GUIREMCLI_Titlecontrolidtoreplace") ;
            Combo_guiremcli_Datalisttype = httpContext.cgiGet( "COMBO_GUIREMCLI_Datalisttype") ;
            Combo_guiremcli_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Allowmultipleselection")) ;
            Combo_guiremcli_Datalistfixedvalues = httpContext.cgiGet( "COMBO_GUIREMCLI_Datalistfixedvalues") ;
            Combo_guiremcli_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Isgriditem")) ;
            Combo_guiremcli_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Hasdescription")) ;
            Combo_guiremcli_Datalistproc = httpContext.cgiGet( "COMBO_GUIREMCLI_Datalistproc") ;
            Combo_guiremcli_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_GUIREMCLI_Datalistprocparametersprefix") ;
            Combo_guiremcli_Remoteservicesparameters = httpContext.cgiGet( "COMBO_GUIREMCLI_Remoteservicesparameters") ;
            Combo_guiremcli_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_GUIREMCLI_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_guiremcli_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Includeonlyselectedoption")) ;
            Combo_guiremcli_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Includeselectalloption")) ;
            Combo_guiremcli_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Emptyitem")) ;
            Combo_guiremcli_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_GUIREMCLI_Includeaddnewoption")) ;
            Combo_guiremcli_Htmltemplate = httpContext.cgiGet( "COMBO_GUIREMCLI_Htmltemplate") ;
            Combo_guiremcli_Multiplevaluestype = httpContext.cgiGet( "COMBO_GUIREMCLI_Multiplevaluestype") ;
            Combo_guiremcli_Loadingdata = httpContext.cgiGet( "COMBO_GUIREMCLI_Loadingdata") ;
            Combo_guiremcli_Noresultsfound = httpContext.cgiGet( "COMBO_GUIREMCLI_Noresultsfound") ;
            Combo_guiremcli_Emptyitemtext = httpContext.cgiGet( "COMBO_GUIREMCLI_Emptyitemtext") ;
            Combo_guiremcli_Onlyselectedvalues = httpContext.cgiGet( "COMBO_GUIREMCLI_Onlyselectedvalues") ;
            Combo_guiremcli_Selectalltext = httpContext.cgiGet( "COMBO_GUIREMCLI_Selectalltext") ;
            Combo_guiremcli_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_GUIREMCLI_Multiplevaluesseparator") ;
            Combo_guiremcli_Addnewoptiontext = httpContext.cgiGet( "COMBO_GUIREMCLI_Addnewoptiontext") ;
            Combo_albdomenv_Objectcall = httpContext.cgiGet( "COMBO_ALBDOMENV_Objectcall") ;
            Combo_albdomenv_Class = httpContext.cgiGet( "COMBO_ALBDOMENV_Class") ;
            Combo_albdomenv_Icontype = httpContext.cgiGet( "COMBO_ALBDOMENV_Icontype") ;
            Combo_albdomenv_Icon = httpContext.cgiGet( "COMBO_ALBDOMENV_Icon") ;
            Combo_albdomenv_Caption = httpContext.cgiGet( "COMBO_ALBDOMENV_Caption") ;
            Combo_albdomenv_Tooltip = httpContext.cgiGet( "COMBO_ALBDOMENV_Tooltip") ;
            Combo_albdomenv_Cls = httpContext.cgiGet( "COMBO_ALBDOMENV_Cls") ;
            Combo_albdomenv_Selectedvalue_set = httpContext.cgiGet( "COMBO_ALBDOMENV_Selectedvalue_set") ;
            Combo_albdomenv_Selectedvalue_get = httpContext.cgiGet( "COMBO_ALBDOMENV_Selectedvalue_get") ;
            Combo_albdomenv_Selectedtext_set = httpContext.cgiGet( "COMBO_ALBDOMENV_Selectedtext_set") ;
            Combo_albdomenv_Selectedtext_get = httpContext.cgiGet( "COMBO_ALBDOMENV_Selectedtext_get") ;
            Combo_albdomenv_Gamoauthtoken = httpContext.cgiGet( "COMBO_ALBDOMENV_Gamoauthtoken") ;
            Combo_albdomenv_Ddointernalname = httpContext.cgiGet( "COMBO_ALBDOMENV_Ddointernalname") ;
            Combo_albdomenv_Titlecontrolalign = httpContext.cgiGet( "COMBO_ALBDOMENV_Titlecontrolalign") ;
            Combo_albdomenv_Dropdownoptionstype = httpContext.cgiGet( "COMBO_ALBDOMENV_Dropdownoptionstype") ;
            Combo_albdomenv_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Enabled")) ;
            Combo_albdomenv_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Visible")) ;
            Combo_albdomenv_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_ALBDOMENV_Titlecontrolidtoreplace") ;
            Combo_albdomenv_Datalisttype = httpContext.cgiGet( "COMBO_ALBDOMENV_Datalisttype") ;
            Combo_albdomenv_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Allowmultipleselection")) ;
            Combo_albdomenv_Datalistfixedvalues = httpContext.cgiGet( "COMBO_ALBDOMENV_Datalistfixedvalues") ;
            Combo_albdomenv_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Isgriditem")) ;
            Combo_albdomenv_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Hasdescription")) ;
            Combo_albdomenv_Datalistproc = httpContext.cgiGet( "COMBO_ALBDOMENV_Datalistproc") ;
            Combo_albdomenv_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_ALBDOMENV_Datalistprocparametersprefix") ;
            Combo_albdomenv_Remoteservicesparameters = httpContext.cgiGet( "COMBO_ALBDOMENV_Remoteservicesparameters") ;
            Combo_albdomenv_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALBDOMENV_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_albdomenv_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Includeonlyselectedoption")) ;
            Combo_albdomenv_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Includeselectalloption")) ;
            Combo_albdomenv_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Emptyitem")) ;
            Combo_albdomenv_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALBDOMENV_Includeaddnewoption")) ;
            Combo_albdomenv_Htmltemplate = httpContext.cgiGet( "COMBO_ALBDOMENV_Htmltemplate") ;
            Combo_albdomenv_Multiplevaluestype = httpContext.cgiGet( "COMBO_ALBDOMENV_Multiplevaluestype") ;
            Combo_albdomenv_Loadingdata = httpContext.cgiGet( "COMBO_ALBDOMENV_Loadingdata") ;
            Combo_albdomenv_Noresultsfound = httpContext.cgiGet( "COMBO_ALBDOMENV_Noresultsfound") ;
            Combo_albdomenv_Emptyitemtext = httpContext.cgiGet( "COMBO_ALBDOMENV_Emptyitemtext") ;
            Combo_albdomenv_Onlyselectedvalues = httpContext.cgiGet( "COMBO_ALBDOMENV_Onlyselectedvalues") ;
            Combo_albdomenv_Selectalltext = httpContext.cgiGet( "COMBO_ALBDOMENV_Selectalltext") ;
            Combo_albdomenv_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_ALBDOMENV_Multiplevaluesseparator") ;
            Combo_albdomenv_Addnewoptiontext = httpContext.cgiGet( "COMBO_ALBDOMENV_Addnewoptiontext") ;
            Combo_trncod_Objectcall = httpContext.cgiGet( "COMBO_TRNCOD_Objectcall") ;
            Combo_trncod_Class = httpContext.cgiGet( "COMBO_TRNCOD_Class") ;
            Combo_trncod_Icontype = httpContext.cgiGet( "COMBO_TRNCOD_Icontype") ;
            Combo_trncod_Icon = httpContext.cgiGet( "COMBO_TRNCOD_Icon") ;
            Combo_trncod_Caption = httpContext.cgiGet( "COMBO_TRNCOD_Caption") ;
            Combo_trncod_Tooltip = httpContext.cgiGet( "COMBO_TRNCOD_Tooltip") ;
            Combo_trncod_Cls = httpContext.cgiGet( "COMBO_TRNCOD_Cls") ;
            Combo_trncod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TRNCOD_Selectedvalue_set") ;
            Combo_trncod_Selectedvalue_get = httpContext.cgiGet( "COMBO_TRNCOD_Selectedvalue_get") ;
            Combo_trncod_Selectedtext_set = httpContext.cgiGet( "COMBO_TRNCOD_Selectedtext_set") ;
            Combo_trncod_Selectedtext_get = httpContext.cgiGet( "COMBO_TRNCOD_Selectedtext_get") ;
            Combo_trncod_Gamoauthtoken = httpContext.cgiGet( "COMBO_TRNCOD_Gamoauthtoken") ;
            Combo_trncod_Ddointernalname = httpContext.cgiGet( "COMBO_TRNCOD_Ddointernalname") ;
            Combo_trncod_Titlecontrolalign = httpContext.cgiGet( "COMBO_TRNCOD_Titlecontrolalign") ;
            Combo_trncod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TRNCOD_Dropdownoptionstype") ;
            Combo_trncod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Enabled")) ;
            Combo_trncod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Visible")) ;
            Combo_trncod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TRNCOD_Titlecontrolidtoreplace") ;
            Combo_trncod_Datalisttype = httpContext.cgiGet( "COMBO_TRNCOD_Datalisttype") ;
            Combo_trncod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Allowmultipleselection")) ;
            Combo_trncod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TRNCOD_Datalistfixedvalues") ;
            Combo_trncod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Isgriditem")) ;
            Combo_trncod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Hasdescription")) ;
            Combo_trncod_Datalistproc = httpContext.cgiGet( "COMBO_TRNCOD_Datalistproc") ;
            Combo_trncod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TRNCOD_Datalistprocparametersprefix") ;
            Combo_trncod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TRNCOD_Remoteservicesparameters") ;
            Combo_trncod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TRNCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_trncod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeonlyselectedoption")) ;
            Combo_trncod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeselectalloption")) ;
            Combo_trncod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Emptyitem")) ;
            Combo_trncod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeaddnewoption")) ;
            Combo_trncod_Htmltemplate = httpContext.cgiGet( "COMBO_TRNCOD_Htmltemplate") ;
            Combo_trncod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TRNCOD_Multiplevaluestype") ;
            Combo_trncod_Loadingdata = httpContext.cgiGet( "COMBO_TRNCOD_Loadingdata") ;
            Combo_trncod_Noresultsfound = httpContext.cgiGet( "COMBO_TRNCOD_Noresultsfound") ;
            Combo_trncod_Emptyitemtext = httpContext.cgiGet( "COMBO_TRNCOD_Emptyitemtext") ;
            Combo_trncod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TRNCOD_Onlyselectedvalues") ;
            Combo_trncod_Selectalltext = httpContext.cgiGet( "COMBO_TRNCOD_Selectalltext") ;
            Combo_trncod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TRNCOD_Multiplevaluesseparator") ;
            Combo_trncod_Addnewoptiontext = httpContext.cgiGet( "COMBO_TRNCOD_Addnewoptiontext") ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A39AlbProPri = httpContext.cgiGet( edtAlbProPri_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
            A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
            if ( localUtil.vcdate( httpContext.cgiGet( edtAlbProfch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBPROFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProfch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A34AlbProfch = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
            }
            else
            {
               A34AlbProfch = localUtil.ctod( httpContext.cgiGet( edtAlbProfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtAlbFecSal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBFECSAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbFecSal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4023AlbFecSal = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
            }
            else
            {
               A4023AlbFecSal = localUtil.ctod( httpContext.cgiGet( edtAlbFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
            }
            A3865AlbHorSal = httpContext.cgiGet( edtAlbHorSal_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBDIVCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbDivCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3108AlbDivCod = (byte)(0) ;
               n3108AlbDivCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
            }
            else
            {
               A3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3108AlbDivCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
            }
            A7098AlbUsu = httpContext.cgiGet( edtAlbUsu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBDOMENV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbDomEnv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1259AlbDomEnv = (byte)(0) ;
               n1259AlbDomEnv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
            }
            else
            {
               A1259AlbDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1259AlbDomEnv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A840TrnCod = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            else
            {
               A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            A3868AlbMat = httpContext.cgiGet( edtAlbMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
            cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
            A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
            A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
            cmbAlbProAT.setValue( httpContext.cgiGet( cmbAlbProAT.getInternalname()) );
            A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
            A10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( edtAlbHhfm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( edtAlbGrossT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
            A14069AlbPdATCUD = httpContext.cgiGet( edtAlbPdATCUD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14069AlbPdATCUD", A14069AlbPdATCUD);
            A10017AlbFmd = httpContext.cgiGet( edtAlbFmd_Internalname) ;
            n10017AlbFmd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
            AV124Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124Pgmname", AV124Pgmname);
            AV106ComboAlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtavComboalbdivcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106ComboAlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ComboAlbDivCod), 2, 0));
            AV108ComboGuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtavComboguiremcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108ComboGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108ComboGuiRemCli), 6, 0));
            AV107ComboAlbDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtavComboalbdomenv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107ComboAlbDomEnv", GXutil.str( AV107ComboAlbDomEnv, 1, 0));
            AV111ComboTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombotrncod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111ComboTrnCod), 4, 0));
            AV17EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"Albaran");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV124Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124Pgmname", AV124Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV124Pgmname, "")));
            forbiddenHiddens.add("AlbIvaCod", GXutil.rtrim( localUtil.format( A5141AlbIvaCod, "@!")));
            forbiddenHiddens.add("AlbTrnDm", GXutil.rtrim( localUtil.format( A10836AlbTrnDm, "")));
            forbiddenHiddens.add("AlbTrnNc", GXutil.rtrim( localUtil.format( A10837AlbTrnNc, "")));
            forbiddenHiddens.add("AlbTrnNm", GXutil.rtrim( localUtil.format( A10835AlbTrnNm, "")));
            A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
            forbiddenHiddens.add("AlbEnvFtp", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9"));
            A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
            forbiddenHiddens.add("AlbProAT", GXutil.rtrim( localUtil.format( A10765AlbProAT, "")));
            A10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( edtAlbGrossT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
            forbiddenHiddens.add("AlbGrossT", localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99"));
            forbiddenHiddens.add("AlbObsCb", GXutil.rtrim( localUtil.format( A7988AlbObsCb, "")));
            forbiddenHiddens.add("AlbColCa", GXutil.rtrim( localUtil.format( A7987AlbColCa, "")));
            forbiddenHiddens.add("AlbDesp", localUtil.format( DecimalUtil.doubleToDec(A7162AlbDesp), "ZZZZZ9"));
            forbiddenHiddens.add("AlbCambio", localUtil.format( A7986AlbCambio, "Z9.9999"));
            forbiddenHiddens.add("AlbTipDoc", localUtil.format( DecimalUtil.doubleToDec(A7985AlbTipDoc), "ZZZZZZZ9"));
            forbiddenHiddens.add("AlbMotTr", GXutil.rtrim( localUtil.format( A7984AlbMotTr, "")));
            forbiddenHiddens.add("AlbTipCal", localUtil.format( DecimalUtil.doubleToDec(A5803AlbTipCal), "9"));
            forbiddenHiddens.add("AlbNumT", localUtil.format( DecimalUtil.doubleToDec(A7102AlbNumT), "ZZZZZZZZZ9"));
            A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
            forbiddenHiddens.add("AlbLic", GXutil.rtrim( localUtil.format( A7101AlbLic, "")));
            forbiddenHiddens.add("AlbMarCo", GXutil.rtrim( localUtil.format( A7100AlbMarCo, "")));
            forbiddenHiddens.add("AlbOComp", GXutil.rtrim( localUtil.format( A7099AlbOComp, "")));
            A7098AlbUsu = httpContext.cgiGet( edtAlbUsu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
            forbiddenHiddens.add("AlbUsu", GXutil.rtrim( localUtil.format( A7098AlbUsu, "")));
            forbiddenHiddens.add("AlbMarca", GXutil.rtrim( localUtil.format( A5140AlbMarca, "")));
            forbiddenHiddens.add("AlbLocDes", localUtil.format( DecimalUtil.doubleToDec(A3867AlbLocDes), "9"));
            forbiddenHiddens.add("AlbLocCar", localUtil.format( DecimalUtil.doubleToDec(A3866AlbLocCar), "9"));
            forbiddenHiddens.add("AlbDivTCod", GXutil.rtrim( localUtil.format( A3093AlbDivTCod, "")));
            A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
            forbiddenHiddens.add("AlbProEst", localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"));
            forbiddenHiddens.add("GuiRemDom", localUtil.format( DecimalUtil.doubleToDec(A1258GuiRemDom), "9"));
            forbiddenHiddens.add("AlbPObsCon", localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9"));
            A14069AlbPdATCUD = httpContext.cgiGet( edtAlbPdATCUD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14069AlbPdATCUD", A14069AlbPdATCUD);
            forbiddenHiddens.add("AlbPdATCUD", GXutil.rtrim( localUtil.format( A14069AlbPdATCUD, "")));
            forbiddenHiddens.add("AlbPdSerAT", GXutil.rtrim( localUtil.format( A14073AlbPdSerAT, "")));
            forbiddenHiddens.add("AlbPdTipAT", GXutil.rtrim( localUtil.format( A14074AlbPdTipAT, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A30AlbProCod != Z30AlbProCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("albaranes\\albaran:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               getEqualNoModal( ) ;
               if ( ! (0==AV51AlbProCod) )
               {
                  A30AlbProCod = AV51AlbProCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               }
               else
               {
                  if ( ! isIns( )  )
                  {
                     A30AlbProCod = AV51AlbProCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
                  sMode3 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! (0==AV51AlbProCod) )
                  {
                     A30AlbProCod = AV51AlbProCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                  }
                  else
                  {
                     if ( ! isIns( )  )
                     {
                        A30AlbProCod = AV51AlbProCod ;
                        httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                     }
                  }
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
                        confirm_1T00( ) ;
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
                        e111T02 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121T02 ();
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
         e121T02 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1T03( ) ;
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
         disableAttributes1T03( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbdivcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbdivcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboguiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboguiremcli_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbdomenv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbdomenv_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), true);
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

   public void confirm_1T00( )
   {
      beforeValidate1T03( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1T03( ) ;
         }
         else
         {
            checkExtendedTable1T03( ) ;
            closeExtendedTableCursors1T03( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1T00( )
   {
   }

   public void e111T02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV72Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      albaran_impl.this.GXt_char1 = GXv_char2[0] ;
      AV72Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Lit0", AV72Lit0);
      GXt_char1 = AV95Lit44 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG165_", ""), (byte)(99), GXv_char2) ;
      albaran_impl.this.GXt_char1 = GXv_char2[0] ;
      AV95Lit44 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95Lit44", AV95Lit44);
      GXt_char1 = AV73Litfe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      albaran_impl.this.GXt_char1 = GXv_char2[0] ;
      AV73Litfe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Litfe", AV73Litfe);
      GXt_char1 = AV8Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      albaran_impl.this.GXt_char1 = GXv_char2[0] ;
      AV8Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Station", AV8Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV9EmprNom ;
      GXv_char4[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char2, GXv_char3, GXv_char4) ;
      albaran_impl.this.A396EmprCod = GXv_char2[0] ;
      albaran_impl.this.AV9EmprNom = GXv_char3[0] ;
      albaran_impl.this.AV10UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom", AV9EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10UsurCod", AV10UsurCod);
      GXt_int5 = AV44F_tinamar ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV44F_tinamar = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44F_tinamar", GXutil.str( AV44F_tinamar, 1, 0));
      GXt_int5 = (byte)(AV74Flag1) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISEMP", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV74Flag1 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Flag1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Flag1), 4, 0));
      GXt_int5 = AV64HueAlb ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HUEALB", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV64HueAlb = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64HueAlb", GXutil.str( AV64HueAlb, 1, 0));
      GXt_int5 = AV75PrnAlb ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRNALB", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV75PrnAlb = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75PrnAlb", GXutil.str( AV75PrnAlb, 1, 0));
      GXt_int5 = AV37FlagGv ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GAVIM ", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV37FlagGv = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37FlagGv", GXutil.str( AV37FlagGv, 1, 0));
      GXt_int5 = AV19FlagFas ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBFAS", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV19FlagFas = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19FlagFas", GXutil.str( AV19FlagFas, 1, 0));
      GXt_int5 = AV20FlagTxt ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBTXT", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV20FlagTxt = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20FlagTxt", GXutil.str( AV20FlagTxt, 1, 0));
      GXt_int5 = AV21FlagPreFas ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREFAS", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV21FlagPreFas = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21FlagPreFas", GXutil.str( AV21FlagPreFas, 1, 0));
      GXt_int5 = AV27FlagEtm ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM   ", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV27FlagEtm = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27FlagEtm", GXutil.str( AV27FlagEtm, 1, 0));
      GXt_int5 = AV22FlagPro ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100006", GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV22FlagPro = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22FlagPro", GXutil.str( AV22FlagPro, 1, 0));
      GXt_int5 = AV76FlagProPre ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBPRE", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV76FlagProPre = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76FlagProPre", GXutil.str( AV76FlagProPre, 1, 0));
      GXt_int5 = AV77FlagTintu ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV77FlagTintu = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77FlagTintu", GXutil.str( AV77FlagTintu, 1, 0));
      GXt_int5 = AV78FlagVerFor ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERFOR", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV78FlagVerFor = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78FlagVerFor", GXutil.str( AV78FlagVerFor, 1, 0));
      GXt_int5 = AV68F_albanu ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBANU", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV68F_albanu = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68F_albanu", GXutil.str( AV68F_albanu, 1, 0));
      GXt_int5 = AV79PwdGrl ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PWDGRE", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV79PwdGrl = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79PwdGrl", GXutil.str( AV79PwdGrl, 1, 0));
      GXt_int5 = AV18F_carvema ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV18F_carvema = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18F_carvema", GXutil.str( AV18F_carvema, 1, 0));
      GXt_int5 = AV23F_moda21 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV23F_moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23F_moda21", GXutil.str( AV23F_moda21, 1, 0));
      GXt_int5 = AV24Moda21 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV24Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Moda21", GXutil.str( AV24Moda21, 1, 0));
      GXt_int5 = AV25FlagPorRec ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PORREC", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV25FlagPorRec = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25FlagPorRec", GXutil.str( AV25FlagPorRec, 1, 0));
      GXt_int5 = AV81Samofil ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SAMOFI", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV81Samofil = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81Samofil", GXutil.str( AV81Samofil, 1, 0));
      GXt_int5 = AV82CCC ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CCC", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV82CCC = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82CCC", GXutil.str( AV82CCC, 1, 0));
      GXt_int5 = AV26Erfoc ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV26Erfoc = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Erfoc", GXutil.str( AV26Erfoc, 1, 0));
      GXt_int5 = AV83Boton_no ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BTNSNO", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV83Boton_no = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83Boton_no", GXutil.str( AV83Boton_no, 1, 0));
      GXt_int5 = AV28CtrQb ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTRQB", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV28CtrQb = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28CtrQb", GXutil.str( AV28CtrQb, 1, 0));
      GXt_int5 = AV84F_recpes ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SALPES", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV84F_recpes = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84F_recpes", GXutil.str( AV84F_recpes, 1, 0));
      GXt_int5 = AV63Tintex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV63Tintex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Tintex", GXutil.str( AV63Tintex, 1, 0));
      GXt_int5 = AV85Finitextil ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FINITE", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV85Finitextil = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85Finitextil", GXutil.str( AV85Finitextil, 1, 0));
      GXt_int5 = AV13FirmaD ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV13FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13FirmaD", GXutil.str( AV13FirmaD, 1, 0));
      GXt_int5 = AV87granul ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRANUL", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV87granul = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87granul", GXutil.str( AV87granul, 1, 0));
      GXt_int5 = AV88Ws ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "WSGR", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV88Ws = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Ws", GXutil.str( AV88Ws, 1, 0));
      GXt_int5 = AV99Nows ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOWS0", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV99Nows = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99Nows", GXutil.str( AV99Nows, 1, 0));
      GXt_int5 = AV16Ctrlf ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTRDAT", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV16Ctrlf = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Ctrlf", GXutil.str( AV16Ctrlf, 1, 0));
      GXt_int5 = AV89Modhh ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UPDHHS", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV89Modhh = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Modhh", GXutil.str( AV89Modhh, 1, 0));
      GXt_int5 = AV90PrnAT ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRNAT", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV90PrnAT = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90PrnAT", GXutil.str( AV90PrnAT, 1, 0));
      GXt_int5 = AV30errkgs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERRKGS", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV30errkgs = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30errkgs", GXutil.str( AV30errkgs, 1, 0));
      GXt_int5 = AV12avisar ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ATAVIS", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV12avisar = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12avisar", GXutil.str( AV12avisar, 1, 0));
      GXt_int5 = AV69Endutex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV69Endutex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69Endutex", GXutil.str( AV69Endutex, 1, 0));
      GXt_int5 = AV96PdfGx16 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PDFGUI", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV96PdfGx16 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96PdfGx16", GXutil.str( AV96PdfGx16, 1, 0));
      GXt_int5 = AV71hashAnt ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HASANT", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV71hashAnt = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71hashAnt", GXutil.str( AV71hashAnt, 1, 0));
      GXt_int5 = AV31Artemalha ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEMH", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV31Artemalha = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Artemalha", GXutil.str( AV31Artemalha, 1, 0));
      GXt_int5 = AV32siplasticos ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLASTI", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV32siplasticos = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32siplasticos", GXutil.str( AV32siplasticos, 1, 0));
      GXt_int5 = AV29Carvitin ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV29Carvitin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Carvitin", GXutil.str( AV29Carvitin, 1, 0));
      GXt_int5 = AV45Carvema ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      albaran_impl.this.GXt_int5 = GXv_int6[0] ;
      AV45Carvema = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Carvema", GXutil.str( AV45Carvema, 1, 0));
      GXt_int7 = AV86Porgm ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PORGRM", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8) ;
      albaran_impl.this.A396EmprCod = GXv_char4[0] ;
      albaran_impl.this.GXt_int7 = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV86Porgm = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86Porgm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86Porgm), 8, 0));
      AV49Porgrm2 = DecimalUtil.doubleToDec(AV86Porgm/ (double) (100)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Porgrm2", GXutil.ltrimstr( AV49Porgrm2, 6, 2));
      GXv_int8[0] = AV80ContVal ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PWDGRE", ""), GXv_int8) ;
      albaran_impl.this.AV80ContVal = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80ContVal), 8, 0));
      GXv_int8[0] = AV91Copias ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "100005", GXv_int8) ;
      albaran_impl.this.AV91Copias = (short)((short)(GXv_int8[0])) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91Copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91Copias), 4, 0));
      AV91Copias = (short)(((AV91Copias==0) ? 1 : AV91Copias)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91Copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91Copias), 4, 0));
      AV92Copias2 = AV91Copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92Copias2), 4, 0));
      AV93Msg_err1 = httpContext.getMessage( "Numero de Tubos superior a Numero de rolos", "") + GXutil.newLine( ) + httpContext.getMessage( "Atencion. El sistema iguala el numero de tubos al numero de rolos", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Msg_err1", AV93Msg_err1);
      AV60AlbSec = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60AlbSec", AV60AlbSec);
      AV101AlbProPri = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101AlbProPri", AV101AlbProPri);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV101AlbProPri, "9"))));
      AV7ContCod = "666666" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
      AV94Correcto = httpContext.getMessage( "NO", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Correcto", AV94Correcto);
      AV115IsVisibleAT = (boolean)((!(GXutil.strcmp("", A7101AlbLic)==0))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115IsVisibleAT", AV115IsVisibleAT);
      AV116IsVisibleHash = (boolean)((!(GXutil.strcmp("", A10017AlbFmd)==0))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116IsVisibleHash", AV116IsVisibleHash);
      AV106ComboAlbDivCod = (byte)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106ComboAlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ComboAlbDivCod), 2, 0));
      Combo_albdivcod_Selectedvalue_set = "2" ;
      ucCombo_albdivcod.sendProperty(context, "", false, Combo_albdivcod_Internalname, "SelectedValue_set", Combo_albdivcod_Selectedvalue_set);
      GXt_char1 = AV8Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      albaran_impl.this.GXt_char1 = GXv_char4[0] ;
      AV8Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Station", AV8Station);
      GXv_char4[0] = AV17EmprCod ;
      GXv_char3[0] = AV9EmprNom ;
      GXv_char2[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char4, GXv_char3, GXv_char2) ;
      albaran_impl.this.AV17EmprCod = GXv_char4[0] ;
      albaran_impl.this.AV9EmprNom = GXv_char3[0] ;
      albaran_impl.this.AV10UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom", AV9EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10UsurCod", AV10UsurCod);
      GXv_SdtWWPContext9[0] = AV52WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV52WWPContext = GXv_SdtWWPContext9[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = AV113DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[0] ;
      AV113DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10;
      edtTrnCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), true);
      AV111ComboTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111ComboTrnCod), 4, 0));
      edtavCombotrncod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Visible), 5, 0), true);
      edtAlbDomEnv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDomEnv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDomEnv_Visible), 5, 0), true);
      AV107ComboAlbDomEnv = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107ComboAlbDomEnv", GXutil.str( AV107ComboAlbDomEnv, 1, 0));
      edtavComboalbdomenv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbdomenv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbdomenv_Visible), 5, 0), true);
      edtGuiRemCli_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Visible), 5, 0), true);
      AV108ComboGuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108ComboGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108ComboGuiRemCli), 6, 0));
      edtavComboguiremcli_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboguiremcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboguiremcli_Visible), 5, 0), true);
      edtAlbDivCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDivCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivCod_Visible), 5, 0), true);
      AV106ComboAlbDivCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106ComboAlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ComboAlbDivCod), 2, 0));
      edtavComboalbdivcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbdivcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbdivcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOALBDIVCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOGUIREMCLI' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOALBDOMENV' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOTRNCOD' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S152 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV53TrnContext.fromxml(AV54WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV53TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV124Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV125GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV125GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125GXV1), 8, 0));
         while ( AV125GXV1 <= AV53TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV59TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV53TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV125GXV1));
            if ( GXutil.strcmp(AV59TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV56Insert_TrnCod = (short)(GXutil.lval( AV59TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56Insert_TrnCod), 4, 0));
               if ( ! (0==AV56Insert_TrnCod) )
               {
                  AV111ComboTrnCod = AV56Insert_TrnCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV111ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111ComboTrnCod), 4, 0));
                  Combo_trncod_Selectedvalue_set = GXutil.trim( GXutil.str( AV111ComboTrnCod, 4, 0)) ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
                  Combo_trncod_Enabled = false ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV59TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbDivCod") == 0 )
            {
               AV57Insert_AlbDivCod = (byte)(GXutil.lval( AV59TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV57Insert_AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Insert_AlbDivCod), 2, 0));
               if ( ! (0==AV57Insert_AlbDivCod) )
               {
                  AV106ComboAlbDivCod = AV57Insert_AlbDivCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV106ComboAlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ComboAlbDivCod), 2, 0));
                  Combo_albdivcod_Selectedvalue_set = GXutil.trim( GXutil.str( AV106ComboAlbDivCod, 2, 0)) ;
                  ucCombo_albdivcod.sendProperty(context, "", false, Combo_albdivcod_Internalname, "SelectedValue_set", Combo_albdivcod_Selectedvalue_set);
                  Combo_albdivcod_Enabled = false ;
                  ucCombo_albdivcod.sendProperty(context, "", false, Combo_albdivcod_Internalname, "Enabled", GXutil.booltostr( Combo_albdivcod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV59TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "EmprGuiRem") == 0 )
            {
               AV58Insert_EmprGuiRem = AV59TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV58Insert_EmprGuiRem", AV58Insert_EmprGuiRem);
            }
            else if ( GXutil.strcmp(AV59TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "GuiRemCli") == 0 )
            {
               AV55Insert_GuiRemCli = (int)(GXutil.lval( AV59TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55Insert_GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Insert_GuiRemCli), 6, 0));
               if ( ! (0==AV55Insert_GuiRemCli) )
               {
                  AV108ComboGuiRemCli = AV55Insert_GuiRemCli ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV108ComboGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108ComboGuiRemCli), 6, 0));
                  Combo_guiremcli_Selectedvalue_set = GXutil.trim( GXutil.str( AV108ComboGuiRemCli, 6, 0)) ;
                  ucCombo_guiremcli.sendProperty(context, "", false, Combo_guiremcli_Internalname, "SelectedValue_set", Combo_guiremcli_Selectedvalue_set);
                  Combo_guiremcli_Enabled = false ;
                  ucCombo_guiremcli.sendProperty(context, "", false, Combo_guiremcli_Internalname, "Enabled", GXutil.booltostr( Combo_guiremcli_Enabled));
               }
            }
            AV125GXV1 = (int)(AV125GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125GXV1), 8, 0));
         }
      }
      edtavEmprcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Visible), 5, 0), true);
   }

   public void e121T02( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( AV121AccionesEnPopup )
      {
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
         {
            httpContext.popup(formatLink("app.albaranes.albaranguia__ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.booltostr(AV122VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV121AccionesEnPopup))}, new String[] {"EmprCod","AlbProCod","VisualizarAcciones","AccionesEnPopup"}) , new Object[] {});
         }
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
         {
            httpContext.popup(formatLink("app.albaranes.albaranobservacion__ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.booltostr(AV122VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV121AccionesEnPopup))}, new String[] {"EmprCod","AlbProCod","VisualizarAcciones","AccionesEnPopup"}) , new Object[] {});
         }
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S152( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'LOADCOMBOTRNCOD' Routine */
      returnInSub = false ;
      GXt_char1 = AV105Combo_DataJson ;
      GXv_char4[0] = AV110ComboSelectedValue ;
      GXv_char3[0] = AV109ComboSelectedText ;
      GXv_char2[0] = GXt_char1 ;
      new app.albaranes.albaranloaddvcombo(remoteHandle, context).execute( "TrnCod", Gx_mode, false, AV17EmprCod, AV51AlbProCod, AV17EmprCod, A1243GuiRemCli, "", GXv_char4, GXv_char3, GXv_char2) ;
      albaran_impl.this.AV110ComboSelectedValue = GXv_char4[0] ;
      albaran_impl.this.AV109ComboSelectedText = GXv_char3[0] ;
      albaran_impl.this.GXt_char1 = GXv_char2[0] ;
      AV105Combo_DataJson = GXt_char1 ;
      AV117TrnCod_Data.fromJSonString(AV105Combo_DataJson, null);
      Combo_trncod_Selectedvalue_set = AV110ComboSelectedValue ;
      ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
      AV111ComboTrnCod = (short)(GXutil.lval( AV110ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111ComboTrnCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_trncod_Enabled = false ;
         ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      }
   }

   public void S132( )
   {
      /* 'LOADCOMBOALBDOMENV' Routine */
      returnInSub = false ;
      Combo_albdomenv_Datalistprocparametersprefix = GXutil.format( " \"ComboName\": \"AlbDomEnv\", \"TrnMode\": \"INS\", \"IsDynamicCall\": true, \"EmprCod\": \"\", \"AlbProCod\": 0, \"Cond_EmprCod\": \"#%1#\", \"Cond_GuiRemCli\": \"#%2#\"", edtavEmprcod_Internalname, edtGuiRemCli_Internalname, "", "", "", "", "", "", "") ;
      ucCombo_albdomenv.sendProperty(context, "", false, Combo_albdomenv_Internalname, "DataListProcParametersPrefix", Combo_albdomenv_Datalistprocparametersprefix);
      GXt_char1 = AV105Combo_DataJson ;
      GXv_char4[0] = AV110ComboSelectedValue ;
      GXv_char3[0] = AV109ComboSelectedText ;
      GXv_char2[0] = GXt_char1 ;
      new app.albaranes.albaranloaddvcombo(remoteHandle, context).execute( "AlbDomEnv", Gx_mode, false, AV17EmprCod, AV51AlbProCod, AV17EmprCod, A1243GuiRemCli, "", GXv_char4, GXv_char3, GXv_char2) ;
      albaran_impl.this.AV110ComboSelectedValue = GXv_char4[0] ;
      albaran_impl.this.AV109ComboSelectedText = GXv_char3[0] ;
      albaran_impl.this.GXt_char1 = GXv_char2[0] ;
      AV105Combo_DataJson = GXt_char1 ;
      Combo_albdomenv_Selectedvalue_set = AV110ComboSelectedValue ;
      ucCombo_albdomenv.sendProperty(context, "", false, Combo_albdomenv_Internalname, "SelectedValue_set", Combo_albdomenv_Selectedvalue_set);
      Combo_albdomenv_Selectedtext_set = AV109ComboSelectedText ;
      ucCombo_albdomenv.sendProperty(context, "", false, Combo_albdomenv_Internalname, "SelectedText_set", Combo_albdomenv_Selectedtext_set);
      AV107ComboAlbDomEnv = (byte)(GXutil.lval( AV110ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107ComboAlbDomEnv", GXutil.str( AV107ComboAlbDomEnv, 1, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_albdomenv_Enabled = false ;
         ucCombo_albdomenv.sendProperty(context, "", false, Combo_albdomenv_Internalname, "Enabled", GXutil.booltostr( Combo_albdomenv_Enabled));
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOGUIREMCLI' Routine */
      returnInSub = false ;
      GXt_char1 = AV105Combo_DataJson ;
      GXv_char4[0] = AV110ComboSelectedValue ;
      GXv_char3[0] = AV109ComboSelectedText ;
      GXv_char2[0] = GXt_char1 ;
      new app.albaranes.albaranloaddvcombo(remoteHandle, context).execute( "GuiRemCli", Gx_mode, false, AV17EmprCod, AV51AlbProCod, AV17EmprCod, A1243GuiRemCli, "", GXv_char4, GXv_char3, GXv_char2) ;
      albaran_impl.this.AV110ComboSelectedValue = GXv_char4[0] ;
      albaran_impl.this.AV109ComboSelectedText = GXv_char3[0] ;
      albaran_impl.this.GXt_char1 = GXv_char2[0] ;
      AV105Combo_DataJson = GXt_char1 ;
      AV114GuiRemCli_Data.fromJSonString(AV105Combo_DataJson, null);
      Combo_guiremcli_Selectedvalue_set = AV110ComboSelectedValue ;
      ucCombo_guiremcli.sendProperty(context, "", false, Combo_guiremcli_Internalname, "SelectedValue_set", Combo_guiremcli_Selectedvalue_set);
      AV108ComboGuiRemCli = (int)(GXutil.lval( AV110ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108ComboGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108ComboGuiRemCli), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_guiremcli_Enabled = false ;
         ucCombo_guiremcli.sendProperty(context, "", false, Combo_guiremcli_Internalname, "Enabled", GXutil.booltostr( Combo_guiremcli_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOALBDIVCOD' Routine */
      returnInSub = false ;
      GXt_char1 = AV105Combo_DataJson ;
      GXv_char4[0] = AV110ComboSelectedValue ;
      GXv_char3[0] = AV109ComboSelectedText ;
      GXv_char2[0] = GXt_char1 ;
      new app.albaranes.albaranloaddvcombo(remoteHandle, context).execute( "AlbDivCod", Gx_mode, false, AV17EmprCod, AV51AlbProCod, AV17EmprCod, A1243GuiRemCli, "", GXv_char4, GXv_char3, GXv_char2) ;
      albaran_impl.this.AV110ComboSelectedValue = GXv_char4[0] ;
      albaran_impl.this.AV109ComboSelectedText = GXv_char3[0] ;
      albaran_impl.this.GXt_char1 = GXv_char2[0] ;
      AV105Combo_DataJson = GXt_char1 ;
      AV103AlbDivCod_Data.fromJSonString(AV105Combo_DataJson, null);
      Combo_albdivcod_Selectedvalue_set = AV110ComboSelectedValue ;
      ucCombo_albdivcod.sendProperty(context, "", false, Combo_albdivcod_Internalname, "SelectedValue_set", Combo_albdivcod_Selectedvalue_set);
      AV106ComboAlbDivCod = (byte)(GXutil.lval( AV110ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106ComboAlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106ComboAlbDivCod), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_albdivcod_Enabled = false ;
         ucCombo_albdivcod.sendProperty(context, "", false, Combo_albdivcod_Internalname, "Enabled", GXutil.booltostr( Combo_albdivcod_Enabled));
      }
   }

   public void zm1T03( int GX_JID )
   {
      if ( ( GX_JID == 73 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1259AlbDomEnv = T01T03_A1259AlbDomEnv[0] ;
            Z39AlbProPri = T01T03_A39AlbProPri[0] ;
            Z3865AlbHorSal = T01T03_A3865AlbHorSal[0] ;
            Z2242AlbSec = T01T03_A2242AlbSec[0] ;
            Z5141AlbIvaCod = T01T03_A5141AlbIvaCod[0] ;
            Z10836AlbTrnDm = T01T03_A10836AlbTrnDm[0] ;
            Z10837AlbTrnNc = T01T03_A10837AlbTrnNc[0] ;
            Z10835AlbTrnNm = T01T03_A10835AlbTrnNm[0] ;
            Z5805AlbEnvFtp = T01T03_A5805AlbEnvFtp[0] ;
            Z10765AlbProAT = T01T03_A10765AlbProAT[0] ;
            Z10020AlbGrossT = T01T03_A10020AlbGrossT[0] ;
            Z10019AlbHhfm = T01T03_A10019AlbHhfm[0] ;
            Z10018ALbFmdc = T01T03_A10018ALbFmdc[0] ;
            Z10017AlbFmd = T01T03_A10017AlbFmd[0] ;
            Z7988AlbObsCb = T01T03_A7988AlbObsCb[0] ;
            Z7987AlbColCa = T01T03_A7987AlbColCa[0] ;
            Z7162AlbDesp = T01T03_A7162AlbDesp[0] ;
            Z7986AlbCambio = T01T03_A7986AlbCambio[0] ;
            Z7985AlbTipDoc = T01T03_A7985AlbTipDoc[0] ;
            Z7984AlbMotTr = T01T03_A7984AlbMotTr[0] ;
            Z5803AlbTipCal = T01T03_A5803AlbTipCal[0] ;
            Z4023AlbFecSal = T01T03_A4023AlbFecSal[0] ;
            Z7102AlbNumT = T01T03_A7102AlbNumT[0] ;
            Z7101AlbLic = T01T03_A7101AlbLic[0] ;
            Z7100AlbMarCo = T01T03_A7100AlbMarCo[0] ;
            Z7099AlbOComp = T01T03_A7099AlbOComp[0] ;
            Z7098AlbUsu = T01T03_A7098AlbUsu[0] ;
            Z5140AlbMarca = T01T03_A5140AlbMarca[0] ;
            Z3869AlbCliDes = T01T03_A3869AlbCliDes[0] ;
            Z3868AlbMat = T01T03_A3868AlbMat[0] ;
            Z3867AlbLocDes = T01T03_A3867AlbLocDes[0] ;
            Z3866AlbLocCar = T01T03_A3866AlbLocCar[0] ;
            Z3093AlbDivTCod = T01T03_A3093AlbDivTCod[0] ;
            Z33AlbProEst = T01T03_A33AlbProEst[0] ;
            Z1258GuiRemDom = T01T03_A1258GuiRemDom[0] ;
            Z34AlbProfch = T01T03_A34AlbProfch[0] ;
            Z914AlbPObsCon = T01T03_A914AlbPObsCon[0] ;
            Z14069AlbPdATCUD = T01T03_A14069AlbPdATCUD[0] ;
            Z14073AlbPdSerAT = T01T03_A14073AlbPdSerAT[0] ;
            Z14074AlbPdTipAT = T01T03_A14074AlbPdTipAT[0] ;
            Z1253EmprGuiRem = T01T03_A1253EmprGuiRem[0] ;
            Z1243GuiRemCli = T01T03_A1243GuiRemCli[0] ;
            Z840TrnCod = T01T03_A840TrnCod[0] ;
            Z3108AlbDivCod = T01T03_A3108AlbDivCod[0] ;
         }
         else
         {
            Z1259AlbDomEnv = A1259AlbDomEnv ;
            Z39AlbProPri = A39AlbProPri ;
            Z3865AlbHorSal = A3865AlbHorSal ;
            Z2242AlbSec = A2242AlbSec ;
            Z5141AlbIvaCod = A5141AlbIvaCod ;
            Z10836AlbTrnDm = A10836AlbTrnDm ;
            Z10837AlbTrnNc = A10837AlbTrnNc ;
            Z10835AlbTrnNm = A10835AlbTrnNm ;
            Z5805AlbEnvFtp = A5805AlbEnvFtp ;
            Z10765AlbProAT = A10765AlbProAT ;
            Z10020AlbGrossT = A10020AlbGrossT ;
            Z10019AlbHhfm = A10019AlbHhfm ;
            Z10018ALbFmdc = A10018ALbFmdc ;
            Z10017AlbFmd = A10017AlbFmd ;
            Z7988AlbObsCb = A7988AlbObsCb ;
            Z7987AlbColCa = A7987AlbColCa ;
            Z7162AlbDesp = A7162AlbDesp ;
            Z7986AlbCambio = A7986AlbCambio ;
            Z7985AlbTipDoc = A7985AlbTipDoc ;
            Z7984AlbMotTr = A7984AlbMotTr ;
            Z5803AlbTipCal = A5803AlbTipCal ;
            Z4023AlbFecSal = A4023AlbFecSal ;
            Z7102AlbNumT = A7102AlbNumT ;
            Z7101AlbLic = A7101AlbLic ;
            Z7100AlbMarCo = A7100AlbMarCo ;
            Z7099AlbOComp = A7099AlbOComp ;
            Z7098AlbUsu = A7098AlbUsu ;
            Z5140AlbMarca = A5140AlbMarca ;
            Z3869AlbCliDes = A3869AlbCliDes ;
            Z3868AlbMat = A3868AlbMat ;
            Z3867AlbLocDes = A3867AlbLocDes ;
            Z3866AlbLocCar = A3866AlbLocCar ;
            Z3093AlbDivTCod = A3093AlbDivTCod ;
            Z33AlbProEst = A33AlbProEst ;
            Z1258GuiRemDom = A1258GuiRemDom ;
            Z34AlbProfch = A34AlbProfch ;
            Z914AlbPObsCon = A914AlbPObsCon ;
            Z14069AlbPdATCUD = A14069AlbPdATCUD ;
            Z14073AlbPdSerAT = A14073AlbPdSerAT ;
            Z14074AlbPdTipAT = A14074AlbPdTipAT ;
            Z1253EmprGuiRem = A1253EmprGuiRem ;
            Z1243GuiRemCli = A1243GuiRemCli ;
            Z840TrnCod = A840TrnCod ;
            Z3108AlbDivCod = A3108AlbDivCod ;
         }
      }
      if ( GX_JID == -73 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z1259AlbDomEnv = A1259AlbDomEnv ;
         Z39AlbProPri = A39AlbProPri ;
         Z3865AlbHorSal = A3865AlbHorSal ;
         Z2242AlbSec = A2242AlbSec ;
         Z5141AlbIvaCod = A5141AlbIvaCod ;
         Z10836AlbTrnDm = A10836AlbTrnDm ;
         Z10837AlbTrnNc = A10837AlbTrnNc ;
         Z10835AlbTrnNm = A10835AlbTrnNm ;
         Z5805AlbEnvFtp = A5805AlbEnvFtp ;
         Z10765AlbProAT = A10765AlbProAT ;
         Z10020AlbGrossT = A10020AlbGrossT ;
         Z10019AlbHhfm = A10019AlbHhfm ;
         Z10018ALbFmdc = A10018ALbFmdc ;
         Z10017AlbFmd = A10017AlbFmd ;
         Z7988AlbObsCb = A7988AlbObsCb ;
         Z7987AlbColCa = A7987AlbColCa ;
         Z7162AlbDesp = A7162AlbDesp ;
         Z7986AlbCambio = A7986AlbCambio ;
         Z7985AlbTipDoc = A7985AlbTipDoc ;
         Z7984AlbMotTr = A7984AlbMotTr ;
         Z5803AlbTipCal = A5803AlbTipCal ;
         Z4023AlbFecSal = A4023AlbFecSal ;
         Z7102AlbNumT = A7102AlbNumT ;
         Z7101AlbLic = A7101AlbLic ;
         Z7100AlbMarCo = A7100AlbMarCo ;
         Z7099AlbOComp = A7099AlbOComp ;
         Z7098AlbUsu = A7098AlbUsu ;
         Z5140AlbMarca = A5140AlbMarca ;
         Z3869AlbCliDes = A3869AlbCliDes ;
         Z3868AlbMat = A3868AlbMat ;
         Z3867AlbLocDes = A3867AlbLocDes ;
         Z3866AlbLocCar = A3866AlbLocCar ;
         Z3093AlbDivTCod = A3093AlbDivTCod ;
         Z33AlbProEst = A33AlbProEst ;
         Z1258GuiRemDom = A1258GuiRemDom ;
         Z34AlbProfch = A34AlbProfch ;
         Z914AlbPObsCon = A914AlbPObsCon ;
         Z14069AlbPdATCUD = A14069AlbPdATCUD ;
         Z14073AlbPdSerAT = A14073AlbPdSerAT ;
         Z14074AlbPdTipAT = A14074AlbPdTipAT ;
         Z1253EmprGuiRem = A1253EmprGuiRem ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z3108AlbDivCod = A3108AlbDivCod ;
         Z407EmprNom = A407EmprNom ;
         Z3109AlbDivAbr = A3109AlbDivAbr ;
         Z3145GuiRemDivT = A3145GuiRemDivT ;
         Z1244GuiRemCln = A1244GuiRemCln ;
         Z3110GuiRemDiv = A3110GuiRemDiv ;
         Z1260BusDomEnv = A1260BusDomEnv ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFmd_Enabled), 5, 0), true);
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtAlbLic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Enabled), 5, 0), true);
      cmbAlbProAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProAT.getEnabled(), 5, 0), true);
      edtAlbHhfm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHhfm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHhfm_Enabled), 5, 0), true);
      edtAlbGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGrossT_Enabled), 5, 0), true);
      edtAlbPdATCUD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPdATCUD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPdATCUD_Enabled), 5, 0), true);
      edtAlbUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUsu_Enabled), 5, 0), true);
      edtAlbProEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEst_Enabled), 5, 0), true);
      AV124Pgmname = "Albaranes.Albaran" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV124Pgmname", AV124Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFmd_Enabled), 5, 0), true);
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtAlbLic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Enabled), 5, 0), true);
      cmbAlbProAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProAT.getEnabled(), 5, 0), true);
      edtAlbHhfm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHhfm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHhfm_Enabled), 5, 0), true);
      edtAlbGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGrossT_Enabled), 5, 0), true);
      edtAlbPdATCUD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPdATCUD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPdATCUD_Enabled), 5, 0), true);
      edtAlbUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUsu_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtAlbProPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Enabled), 5, 0), true);
      edtAlbProEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEst_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV17EmprCod)==0) )
      {
         A396EmprCod = AV17EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01T05 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01T05_A407EmprNom[0] ;
      n407EmprNom = T01T05_n407EmprNom[0] ;
      pr_default.close(3);
      if ( ! ( AV115IsVisibleAT ) )
      {
         grpUnnamedgroup2_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, grpUnnamedgroup2_Internalname, "Class", grpUnnamedgroup2_Class, true);
      }
      else
      {
         if ( AV115IsVisibleAT )
         {
            grpUnnamedgroup2_Class = httpContext.getMessage( "Group", "") ;
            httpContext.ajax_rsp_assign_prop("", false, grpUnnamedgroup2_Internalname, "Class", grpUnnamedgroup2_Class, true);
         }
      }
      if ( ! ( AV116IsVisibleHash ) )
      {
         grpUnnamedgroup3_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, grpUnnamedgroup3_Internalname, "Class", grpUnnamedgroup3_Class, true);
      }
      else
      {
         if ( AV116IsVisibleHash )
         {
            grpUnnamedgroup3_Class = httpContext.getMessage( "Group", "") ;
            httpContext.ajax_rsp_assign_prop("", false, grpUnnamedgroup3_Internalname, "Class", grpUnnamedgroup3_Class, true);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV56Insert_TrnCod) )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTrnCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV57Insert_AlbDivCod) )
      {
         edtAlbDivCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbDivCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( true )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( isUpd( )  || isDlt( )  || isIns( )  )
         {
            edtAlbProCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbProCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
         }
      }
      if ( true )
      {
         edtAlbProPri_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Enabled), 5, 0), true);
      }
      else
      {
         if ( isUpd( )  )
         {
            edtAlbProPri_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbProPri_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Enabled), 5, 0), true);
         }
      }
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Utilizar funcion F9 para eliminar Albaran", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isUpd( )  || isDlt( )  || isIns( )  )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      if ( isUpd( )  )
      {
         edtGuiRemCli_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      }
      if ( isUpd( )  )
      {
         edtAlbProPri_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV55Insert_GuiRemCli) )
      {
         edtGuiRemCli_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      }
      else
      {
         if ( isUpd( )  )
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV55Insert_GuiRemCli) )
      {
         A1243GuiRemCli = AV55Insert_GuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      }
      else
      {
         A1243GuiRemCli = AV108ComboGuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      }
      A1259AlbDomEnv = AV107ComboAlbDomEnv ;
      n1259AlbDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV56Insert_TrnCod) )
      {
         A840TrnCod = AV56Insert_TrnCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         if ( (0==AV111ComboTrnCod) )
         {
            A840TrnCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            if ( ! (0==AV111ComboTrnCod) )
            {
               A840TrnCod = AV111ComboTrnCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV57Insert_AlbDivCod) )
      {
         A3108AlbDivCod = AV57Insert_AlbDivCod ;
         n3108AlbDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
      }
      else
      {
         if ( (0==AV106ComboAlbDivCod) )
         {
            A3108AlbDivCod = (byte)(0) ;
            n3108AlbDivCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
            n3108AlbDivCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         }
         else
         {
            if ( ! (0==AV106ComboAlbDivCod) )
            {
               A3108AlbDivCod = AV106ComboAlbDivCod ;
               n3108AlbDivCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
            }
         }
      }
      A39AlbProPri = AV101AlbProPri ;
      httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      A2242AlbSec = AV60AlbSec ;
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      if ( ! (0==AV51AlbProCod) )
      {
         A30AlbProCod = AV51AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A30AlbProCod = AV51AlbProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV58Insert_EmprGuiRem)==0) )
      {
         A1253EmprGuiRem = AV58Insert_EmprGuiRem ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      }
      else
      {
         A1253EmprGuiRem = A396EmprCod ;
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A34AlbProfch)) && ( Gx_BScreen == 0 ) )
      {
         A34AlbProfch = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4023AlbFecSal)) && ( Gx_BScreen == 0 ) )
      {
         A4023AlbFecSal = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A3093AlbDivTCod = httpContext.getMessage( httpContext.getMessage( "E", ""), "") ;
         n3093AlbDivTCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      }
      if ( isIns( )  && (GXutil.strcmp("", A7098AlbUsu)==0) && ( Gx_BScreen == 0 ) )
      {
         A7098AlbUsu = AV10UsurCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10765AlbProAT)==0) && ( Gx_BScreen == 0 ) )
      {
         A10765AlbProAT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01T06 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
         A3643TrnNif = T01T06_A3643TrnNif[0] ;
         n3643TrnNif = T01T06_n3643TrnNif[0] ;
         A841TrnNom = T01T06_A841TrnNom[0] ;
         n841TrnNom = T01T06_n841TrnNom[0] ;
         pr_default.close(5);
         /* Using cursor T01T08 */
         pr_default.execute(6, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
         A3109AlbDivAbr = T01T08_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = T01T08_n3109AlbDivAbr[0] ;
         pr_default.close(6);
         if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
         {
            AV7ContCod = "555555" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
         }
         else
         {
            if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
            {
               AV7ContCod = "666666" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
            }
         }
         /* Using cursor T01T04 */
         pr_default.execute(2, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A3145GuiRemDivT = T01T04_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = T01T04_n3145GuiRemDivT[0] ;
         A1244GuiRemCln = T01T04_A1244GuiRemCln[0] ;
         A3110GuiRemDiv = T01T04_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = T01T04_n3110GuiRemDiv[0] ;
         pr_default.close(2);
         /* Using cursor T01T07 */
         pr_default.execute(5, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
         A3643TrnNif = T01T07_A3643TrnNif[0] ;
         n3643TrnNif = T01T07_n3643TrnNif[0] ;
         A841TrnNom = T01T07_A841TrnNom[0] ;
         n841TrnNom = T01T07_n841TrnNom[0] ;
         pr_default.close(5);
         /* Using cursor T01T09 */
         pr_default.execute(7, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
         if ( (pr_default.getStatus(7) != 101) )
         {
            A1260BusDomEnv = T01T09_A1260BusDomEnv[0] ;
            n1260BusDomEnv = T01T09_n1260BusDomEnv[0] ;
         }
         else
         {
            A1260BusDomEnv = (byte)(0) ;
            n1260BusDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         }
         pr_default.close(7);
      }
   }

   public void load1T03( )
   {
      /* Using cursor T01T010 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A1259AlbDomEnv = T01T010_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = T01T010_n1259AlbDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
         A39AlbProPri = T01T010_A39AlbProPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         A3865AlbHorSal = T01T010_A3865AlbHorSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
         A2242AlbSec = T01T010_A2242AlbSec[0] ;
         A407EmprNom = T01T010_A407EmprNom[0] ;
         n407EmprNom = T01T010_n407EmprNom[0] ;
         A5141AlbIvaCod = T01T010_A5141AlbIvaCod[0] ;
         A10836AlbTrnDm = T01T010_A10836AlbTrnDm[0] ;
         A10837AlbTrnNc = T01T010_A10837AlbTrnNc[0] ;
         A10835AlbTrnNm = T01T010_A10835AlbTrnNm[0] ;
         A5805AlbEnvFtp = T01T010_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A10765AlbProAT = T01T010_A10765AlbProAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
         A10020AlbGrossT = T01T010_A10020AlbGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
         A10019AlbHhfm = T01T010_A10019AlbHhfm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10018ALbFmdc = T01T010_A10018ALbFmdc[0] ;
         A10017AlbFmd = T01T010_A10017AlbFmd[0] ;
         n10017AlbFmd = T01T010_n10017AlbFmd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
         A7988AlbObsCb = T01T010_A7988AlbObsCb[0] ;
         A7987AlbColCa = T01T010_A7987AlbColCa[0] ;
         A7162AlbDesp = T01T010_A7162AlbDesp[0] ;
         A7986AlbCambio = T01T010_A7986AlbCambio[0] ;
         A7985AlbTipDoc = T01T010_A7985AlbTipDoc[0] ;
         A7984AlbMotTr = T01T010_A7984AlbMotTr[0] ;
         A5803AlbTipCal = T01T010_A5803AlbTipCal[0] ;
         A4023AlbFecSal = T01T010_A4023AlbFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
         A7102AlbNumT = T01T010_A7102AlbNumT[0] ;
         A7101AlbLic = T01T010_A7101AlbLic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
         A7100AlbMarCo = T01T010_A7100AlbMarCo[0] ;
         A7099AlbOComp = T01T010_A7099AlbOComp[0] ;
         A7098AlbUsu = T01T010_A7098AlbUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
         A5140AlbMarca = T01T010_A5140AlbMarca[0] ;
         A3869AlbCliDes = T01T010_A3869AlbCliDes[0] ;
         A3868AlbMat = T01T010_A3868AlbMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
         A3867AlbLocDes = T01T010_A3867AlbLocDes[0] ;
         A3866AlbLocCar = T01T010_A3866AlbLocCar[0] ;
         A3093AlbDivTCod = T01T010_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = T01T010_n3093AlbDivTCod[0] ;
         A3109AlbDivAbr = T01T010_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = T01T010_n3109AlbDivAbr[0] ;
         A33AlbProEst = T01T010_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         A1258GuiRemDom = T01T010_A1258GuiRemDom[0] ;
         n1258GuiRemDom = T01T010_n1258GuiRemDom[0] ;
         A3145GuiRemDivT = T01T010_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = T01T010_n3145GuiRemDivT[0] ;
         A1244GuiRemCln = T01T010_A1244GuiRemCln[0] ;
         A34AlbProfch = T01T010_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A914AlbPObsCon = T01T010_A914AlbPObsCon[0] ;
         A14069AlbPdATCUD = T01T010_A14069AlbPdATCUD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14069AlbPdATCUD", A14069AlbPdATCUD);
         A14073AlbPdSerAT = T01T010_A14073AlbPdSerAT[0] ;
         A14074AlbPdTipAT = T01T010_A14074AlbPdTipAT[0] ;
         A1253EmprGuiRem = T01T010_A1253EmprGuiRem[0] ;
         A1243GuiRemCli = T01T010_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A840TrnCod = T01T010_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3108AlbDivCod = T01T010_A3108AlbDivCod[0] ;
         n3108AlbDivCod = T01T010_n3108AlbDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         A3110GuiRemDiv = T01T010_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = T01T010_n3110GuiRemDiv[0] ;
         A1260BusDomEnv = T01T010_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01T010_n1260BusDomEnv[0] ;
         zm1T03( -73) ;
      }
      pr_default.close(8);
      onLoadActions1T03( ) ;
   }

   public void onLoadActions1T03( )
   {
      /* Using cursor T01T07 */
      pr_default.execute(5, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      A3643TrnNif = T01T07_A3643TrnNif[0] ;
      n3643TrnNif = T01T07_n3643TrnNif[0] ;
      A841TrnNom = T01T07_A841TrnNom[0] ;
      n841TrnNom = T01T07_n841TrnNom[0] ;
      pr_default.close(5);
      if ( isIns( )  && (GXutil.strcmp("", A3865AlbHorSal)==0) && true /* After */ )
      {
         GXt_char1 = A3865AlbHorSal ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = GXt_char1 ;
         new app.phragr3(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         albaran_impl.this.A396EmprCod = GXv_char4[0] ;
         albaran_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3865AlbHorSal = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
      }
      if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
      {
         AV7ContCod = "555555" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
      }
      else
      {
         if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
         {
            AV7ContCod = "666666" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
         }
      }
      if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
      {
         A3869AlbCliDes = A1243GuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
      }
      /* Using cursor T01T06 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      A3643TrnNif = T01T06_A3643TrnNif[0] ;
      n3643TrnNif = T01T06_n3643TrnNif[0] ;
      A841TrnNom = T01T06_A841TrnNom[0] ;
      n841TrnNom = T01T06_n841TrnNom[0] ;
      pr_default.close(5);
   }

   public void checkExtendedTable1T03( )
   {
      nIsDirty_3 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ! (GXutil.strcmp("", A7101AlbLic)==0) && ( AV13FirmaD == 1 ) && ( isIns( )  || isUpd( )  || isDlt( )  ) && ( AV12avisar == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01T07 */
      pr_default.execute(5, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3643TrnNif = T01T07_A3643TrnNif[0] ;
      n3643TrnNif = T01T07_n3643TrnNif[0] ;
      A841TrnNom = T01T07_A841TrnNom[0] ;
      n841TrnNom = T01T07_n841TrnNom[0] ;
      pr_default.close(5);
      /* Using cursor T01T08 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDivCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3109AlbDivAbr = T01T08_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01T08_n3109AlbDivAbr[0] ;
      pr_default.close(6);
      if ( (0==A3108AlbDivCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Divisa es requerido.", ""), 1, "ALBDIVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbDivCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01T09 */
      pr_default.execute(7, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A1260BusDomEnv = T01T09_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01T09_n1260BusDomEnv[0] ;
      }
      else
      {
         nIsDirty_3 = (short)(1) ;
         A1260BusDomEnv = (byte)(0) ;
         n1260BusDomEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      }
      pr_default.close(7);
      if ( (0==A1260BusDomEnv) && ( ! (0==A1259AlbDomEnv) ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Domicilio envio inexistente", ""), 1, "ALBDOMENV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbDomEnv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01T04 */
      pr_default.execute(2, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3145GuiRemDivT = T01T04_A3145GuiRemDivT[0] ;
      n3145GuiRemDivT = T01T04_n3145GuiRemDivT[0] ;
      A1244GuiRemCln = T01T04_A1244GuiRemCln[0] ;
      A3110GuiRemDiv = T01T04_A3110GuiRemDiv[0] ;
      n3110GuiRemDiv = T01T04_n3110GuiRemDiv[0] ;
      pr_default.close(2);
      if ( true /* After */ && ( AV63Tintex == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A1243GuiRemCli ;
         GXv_int12[0] = AV61CliUltMq ;
         new app.pcliumq(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int12) ;
         albaran_impl.this.A396EmprCod = GXv_char4[0] ;
         albaran_impl.this.A1243GuiRemCli = GXv_int8[0] ;
         albaran_impl.this.AV61CliUltMq = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV61CliUltMq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61CliUltMq), 4, 0));
      }
      if ( ( A1243GuiRemCli == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente con valor 0 ¡¡¡", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV69Endutex == 1 ) && isIns( )  && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A1243GuiRemCli ;
         GXv_char3[0] = AV62Clitipo ;
         new app.pclitipo(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         albaran_impl.this.A396EmprCod = GXv_char4[0] ;
         albaran_impl.this.A1243GuiRemCli = GXv_int8[0] ;
         albaran_impl.this.AV62Clitipo = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62Clitipo", AV62Clitipo);
      }
      if ( ( AV69Endutex == 1 ) && isIns( )  && ( GXutil.strcmp(AV62Clitipo, httpContext.getMessage( "I", "")) == 0 ) && ( ( GXutil.strcmp(AV60AlbSec, httpContext.getMessage( "D", "")) == 0 ) || ( GXutil.strcmp(AV60AlbSec, httpContext.getMessage( "B", "")) == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente INTERNO", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( AV69Endutex == 1 ) && isIns( )  && ( GXutil.strcmp(AV62Clitipo, httpContext.getMessage( "E", "")) == 0 ) && ( ( GXutil.strcmp(AV60AlbSec, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV60AlbSec, httpContext.getMessage( "C", "")) == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente EXTERNO", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A3865AlbHorSal)==0) && true /* After */ )
      {
         nIsDirty_3 = (short)(1) ;
         GXt_char1 = A3865AlbHorSal ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = GXt_char1 ;
         new app.phragr3(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         albaran_impl.this.A396EmprCod = GXv_char4[0] ;
         albaran_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3865AlbHorSal = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
      }
      if ( true /* Level */ && true /* After */ && ( AV16Ctrlf == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A39AlbProPri ;
         GXv_int6[0] = (byte)(1) ;
         GXv_date13[0] = AV14Fch ;
         GXv_int8[0] = (int)(AV15AlbLast) ;
         GXv_date14[0] = A34AlbProfch ;
         GXv_char2[0] = AV11Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_date13, GXv_int8, GXv_date14, GXv_char2) ;
         albaran_impl.this.A396EmprCod = GXv_char4[0] ;
         albaran_impl.this.A39AlbProPri = GXv_char3[0] ;
         albaran_impl.this.AV14Fch = GXv_date13[0] ;
         albaran_impl.this.AV15AlbLast = GXv_int8[0] ;
         albaran_impl.this.A34AlbProfch = GXv_date14[0] ;
         albaran_impl.this.AV11Msg_f = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV14Fch", localUtil.format(AV14Fch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV15AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15AlbLast), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV11Msg_f", AV11Msg_f);
      }
      if ( ( ( AV68F_albanu == 1 ) || ( AV13FirmaD == 1 ) ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia ANULADA", ""), 1, "ALBPROFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProfch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(AV11Msg_f, " ") != 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV11Msg_f, 1, "ALBPROFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProfch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A34AlbProfch)) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Campo Incorrecto", ""), 1, "ALBPROFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProfch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
      {
         AV7ContCod = "555555" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
      }
      else
      {
         if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
         {
            AV7ContCod = "666666" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
         }
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV7ContCod ;
         GXv_int15[0] = A30AlbProCod ;
         GXv_int6[0] = AV65FlagAlb ;
         GXv_int16[0] = AV66FlagCont ;
         new app.putil10(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int15, GXv_int6, GXv_int16) ;
         albaran_impl.this.A396EmprCod = GXv_char4[0] ;
         albaran_impl.this.AV7ContCod = GXv_char3[0] ;
         albaran_impl.this.A30AlbProCod = GXv_int15[0] ;
         albaran_impl.this.AV65FlagAlb = GXv_int6[0] ;
         albaran_impl.this.AV66FlagCont = GXv_int16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FlagAlb", GXutil.str( AV65FlagAlb, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV66FlagCont", GXutil.str( AV66FlagCont, 1, 0));
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV65FlagAlb == 0 ) && ( AV18F_carvema == 0 ) && ( AV13FirmaD == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION, Va a dar de ALTA un Albaran MANUALMENTE", ""), 0, "");
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV66FlagCont == 1 ) && ( AV18F_carvema == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Intentamos dar de ALTA un ALBARAN > CONTADOR manualmente", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV13FirmaD == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Intentamos dar de ALTA un ALBARAN > CONTADOR manualmente", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( true /* After */ && isIns( )  && ( AV71hashAnt == 1 ) )
      {
         GXv_char4[0] = AV70msg_control ;
         new app.pctrlhashanterior(remoteHandle, context).execute( A396EmprCod, A39AlbProPri, GXv_char4) ;
         albaran_impl.this.AV70msg_control = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70msg_control", AV70msg_control);
      }
      if ( true /* After */ && ( GXutil.strcmp(AV70msg_control, " ") != 0 ) && ( AV13FirmaD == 1 ) && isIns( )  && ( AV71hashAnt == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV70msg_control, 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( GXutil.strcmp(A2242AlbSec, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(A2242AlbSec, httpContext.getMessage( "N", "")) == 0 ) ) && ( AV44F_tinamar == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Incorrecto", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( true /* Level */ && true /* After */ && ! (0==A3869AlbCliDes) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A3869AlbCliDes ;
         GXv_int16[0] = AV67FlagCli ;
         new app.pexides(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int16) ;
         albaran_impl.this.A396EmprCod = GXv_char4[0] ;
         albaran_impl.this.A3869AlbCliDes = GXv_int8[0] ;
         albaran_impl.this.AV67FlagCli = GXv_int16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV67FlagCli", GXutil.str( AV67FlagCli, 1, 0));
      }
      if ( A33AlbProEst == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ALBARAN YA FACTURADO", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_3 = (short)(1) ;
         A3869AlbCliDes = A1243GuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
      }
      if ( ( AV67FlagCli == 0 ) && true /* Level */ && true /* After */ && ! (0==A3869AlbCliDes) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION. Cliente Destino INEXISTENTE", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01T06 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3643TrnNif = T01T06_A3643TrnNif[0] ;
      n3643TrnNif = T01T06_n3643TrnNif[0] ;
      A841TrnNom = T01T06_A841TrnNom[0] ;
      n841TrnNom = T01T06_n841TrnNom[0] ;
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1T03( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(2);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_77( String A1253EmprGuiRem ,
                          short A840TrnCod )
   {
      /* Using cursor T01T011 */
      pr_default.execute(9, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3643TrnNif = T01T011_A3643TrnNif[0] ;
      n3643TrnNif = T01T011_n3643TrnNif[0] ;
      A841TrnNom = T01T011_A841TrnNom[0] ;
      n841TrnNom = T01T011_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3643TrnNif))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_78( byte A3108AlbDivCod )
   {
      /* Using cursor T01T012 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDivCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3109AlbDivAbr = T01T012_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01T012_n3109AlbDivAbr[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3109AlbDivAbr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_79( String A1253EmprGuiRem ,
                          int A1243GuiRemCli ,
                          byte A1259AlbDomEnv )
   {
      /* Using cursor T01T013 */
      pr_default.execute(11, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A1260BusDomEnv = T01T013_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01T013_n1260BusDomEnv[0] ;
      }
      else
      {
         A1260BusDomEnv = (byte)(0) ;
         n1260BusDomEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1260BusDomEnv, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_74( String A1253EmprGuiRem ,
                          int A1243GuiRemCli )
   {
      /* Using cursor T01T014 */
      pr_default.execute(12, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3145GuiRemDivT = T01T014_A3145GuiRemDivT[0] ;
      n3145GuiRemDivT = T01T014_n3145GuiRemDivT[0] ;
      A1244GuiRemCln = T01T014_A1244GuiRemCln[0] ;
      A3110GuiRemDiv = T01T014_A3110GuiRemDiv[0] ;
      n3110GuiRemDiv = T01T014_n3110GuiRemDiv[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3145GuiRemDivT))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1244GuiRemCln))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3110GuiRemDiv, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_76( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01T015 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3643TrnNif = T01T015_A3643TrnNif[0] ;
      n3643TrnNif = T01T015_n3643TrnNif[0] ;
      A841TrnNom = T01T015_A841TrnNom[0] ;
      n841TrnNom = T01T015_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3643TrnNif))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey1T03( )
   {
      /* Using cursor T01T016 */
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
      /* Using cursor T01T03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01T03_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1T03( 73) ;
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01T03_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A1259AlbDomEnv = T01T03_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = T01T03_n1259AlbDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
         A39AlbProPri = T01T03_A39AlbProPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         A3865AlbHorSal = T01T03_A3865AlbHorSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
         A2242AlbSec = T01T03_A2242AlbSec[0] ;
         A5141AlbIvaCod = T01T03_A5141AlbIvaCod[0] ;
         A10836AlbTrnDm = T01T03_A10836AlbTrnDm[0] ;
         A10837AlbTrnNc = T01T03_A10837AlbTrnNc[0] ;
         A10835AlbTrnNm = T01T03_A10835AlbTrnNm[0] ;
         A5805AlbEnvFtp = T01T03_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A10765AlbProAT = T01T03_A10765AlbProAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
         A10020AlbGrossT = T01T03_A10020AlbGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
         A10019AlbHhfm = T01T03_A10019AlbHhfm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10018ALbFmdc = T01T03_A10018ALbFmdc[0] ;
         A10017AlbFmd = T01T03_A10017AlbFmd[0] ;
         n10017AlbFmd = T01T03_n10017AlbFmd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
         A7988AlbObsCb = T01T03_A7988AlbObsCb[0] ;
         A7987AlbColCa = T01T03_A7987AlbColCa[0] ;
         A7162AlbDesp = T01T03_A7162AlbDesp[0] ;
         A7986AlbCambio = T01T03_A7986AlbCambio[0] ;
         A7985AlbTipDoc = T01T03_A7985AlbTipDoc[0] ;
         A7984AlbMotTr = T01T03_A7984AlbMotTr[0] ;
         A5803AlbTipCal = T01T03_A5803AlbTipCal[0] ;
         A4023AlbFecSal = T01T03_A4023AlbFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
         A7102AlbNumT = T01T03_A7102AlbNumT[0] ;
         A7101AlbLic = T01T03_A7101AlbLic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
         A7100AlbMarCo = T01T03_A7100AlbMarCo[0] ;
         A7099AlbOComp = T01T03_A7099AlbOComp[0] ;
         A7098AlbUsu = T01T03_A7098AlbUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
         A5140AlbMarca = T01T03_A5140AlbMarca[0] ;
         A3869AlbCliDes = T01T03_A3869AlbCliDes[0] ;
         A3868AlbMat = T01T03_A3868AlbMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
         A3867AlbLocDes = T01T03_A3867AlbLocDes[0] ;
         A3866AlbLocCar = T01T03_A3866AlbLocCar[0] ;
         A3093AlbDivTCod = T01T03_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = T01T03_n3093AlbDivTCod[0] ;
         A33AlbProEst = T01T03_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         A1258GuiRemDom = T01T03_A1258GuiRemDom[0] ;
         n1258GuiRemDom = T01T03_n1258GuiRemDom[0] ;
         A34AlbProfch = T01T03_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A914AlbPObsCon = T01T03_A914AlbPObsCon[0] ;
         A14069AlbPdATCUD = T01T03_A14069AlbPdATCUD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14069AlbPdATCUD", A14069AlbPdATCUD);
         A14073AlbPdSerAT = T01T03_A14073AlbPdSerAT[0] ;
         A14074AlbPdTipAT = T01T03_A14074AlbPdTipAT[0] ;
         A1253EmprGuiRem = T01T03_A1253EmprGuiRem[0] ;
         A1243GuiRemCli = T01T03_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A840TrnCod = T01T03_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3108AlbDivCod = T01T03_A3108AlbDivCod[0] ;
         n3108AlbDivCod = T01T03_n3108AlbDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1T03( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey1T03( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey1T03( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1T03( ) ;
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
      /* Using cursor T01T017 */
      pr_default.execute(15, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( T01T017_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T01T017_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( T01T017_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T01T017_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T01T017_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T01T018 */
      pr_default.execute(16, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( T01T018_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T01T018_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( T01T018_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T01T018_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T01T018_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1T03( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbProfch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1T03( ) ;
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
               GX_FocusControl = edtAlbProfch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1T03( ) ;
               GX_FocusControl = edtAlbProfch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtAlbProfch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1T03( ) ;
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
                  GX_FocusControl = edtAlbProfch_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1T03( ) ;
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
      if ( isIns( ) || isUpd( ) || isDlt( ) )
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
         GX_FocusControl = edtAlbProfch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1T03( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01T02 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z1259AlbDomEnv != T01T02_A1259AlbDomEnv[0] ) || ( GXutil.strcmp(Z39AlbProPri, T01T02_A39AlbProPri[0]) != 0 ) || ( GXutil.strcmp(Z3865AlbHorSal, T01T02_A3865AlbHorSal[0]) != 0 ) || ( GXutil.strcmp(Z2242AlbSec, T01T02_A2242AlbSec[0]) != 0 ) || ( GXutil.strcmp(Z5141AlbIvaCod, T01T02_A5141AlbIvaCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10836AlbTrnDm, T01T02_A10836AlbTrnDm[0]) != 0 ) || ( GXutil.strcmp(Z10837AlbTrnNc, T01T02_A10837AlbTrnNc[0]) != 0 ) || ( GXutil.strcmp(Z10835AlbTrnNm, T01T02_A10835AlbTrnNm[0]) != 0 ) || ( Z5805AlbEnvFtp != T01T02_A5805AlbEnvFtp[0] ) || ( GXutil.strcmp(Z10765AlbProAT, T01T02_A10765AlbProAT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10020AlbGrossT, T01T02_A10020AlbGrossT[0]) != 0 ) || !( GXutil.dateCompare(Z10019AlbHhfm, T01T02_A10019AlbHhfm[0]) ) || ( GXutil.strcmp(Z10018ALbFmdc, T01T02_A10018ALbFmdc[0]) != 0 ) || ( GXutil.strcmp(Z10017AlbFmd, T01T02_A10017AlbFmd[0]) != 0 ) || ( GXutil.strcmp(Z7988AlbObsCb, T01T02_A7988AlbObsCb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7987AlbColCa, T01T02_A7987AlbColCa[0]) != 0 ) || ( Z7162AlbDesp != T01T02_A7162AlbDesp[0] ) || ( DecimalUtil.compareTo(Z7986AlbCambio, T01T02_A7986AlbCambio[0]) != 0 ) || ( Z7985AlbTipDoc != T01T02_A7985AlbTipDoc[0] ) || ( GXutil.strcmp(Z7984AlbMotTr, T01T02_A7984AlbMotTr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5803AlbTipCal != T01T02_A5803AlbTipCal[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z4023AlbFecSal), GXutil.resetTime(T01T02_A4023AlbFecSal[0])) ) || ( Z7102AlbNumT != T01T02_A7102AlbNumT[0] ) || ( GXutil.strcmp(Z7101AlbLic, T01T02_A7101AlbLic[0]) != 0 ) || ( GXutil.strcmp(Z7100AlbMarCo, T01T02_A7100AlbMarCo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7099AlbOComp, T01T02_A7099AlbOComp[0]) != 0 ) || ( GXutil.strcmp(Z7098AlbUsu, T01T02_A7098AlbUsu[0]) != 0 ) || ( GXutil.strcmp(Z5140AlbMarca, T01T02_A5140AlbMarca[0]) != 0 ) || ( Z3869AlbCliDes != T01T02_A3869AlbCliDes[0] ) || ( GXutil.strcmp(Z3868AlbMat, T01T02_A3868AlbMat[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3867AlbLocDes != T01T02_A3867AlbLocDes[0] ) || ( Z3866AlbLocCar != T01T02_A3866AlbLocCar[0] ) || ( GXutil.strcmp(Z3093AlbDivTCod, T01T02_A3093AlbDivTCod[0]) != 0 ) || ( Z33AlbProEst != T01T02_A33AlbProEst[0] ) || ( Z1258GuiRemDom != T01T02_A1258GuiRemDom[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01T02_A34AlbProfch[0])) ) || ( Z914AlbPObsCon != T01T02_A914AlbPObsCon[0] ) || ( GXutil.strcmp(Z14069AlbPdATCUD, T01T02_A14069AlbPdATCUD[0]) != 0 ) || ( GXutil.strcmp(Z14073AlbPdSerAT, T01T02_A14073AlbPdSerAT[0]) != 0 ) || ( GXutil.strcmp(Z14074AlbPdTipAT, T01T02_A14074AlbPdTipAT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1253EmprGuiRem, T01T02_A1253EmprGuiRem[0]) != 0 ) || ( Z1243GuiRemCli != T01T02_A1243GuiRemCli[0] ) || ( Z840TrnCod != T01T02_A840TrnCod[0] ) || ( Z3108AlbDivCod != T01T02_A3108AlbDivCod[0] ) )
         {
            if ( Z1259AlbDomEnv != T01T02_A1259AlbDomEnv[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbDomEnv");
               GXutil.writeLogRaw("Old: ",Z1259AlbDomEnv);
               GXutil.writeLogRaw("Current: ",T01T02_A1259AlbDomEnv[0]);
            }
            if ( GXutil.strcmp(Z39AlbProPri, T01T02_A39AlbProPri[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbProPri");
               GXutil.writeLogRaw("Old: ",Z39AlbProPri);
               GXutil.writeLogRaw("Current: ",T01T02_A39AlbProPri[0]);
            }
            if ( GXutil.strcmp(Z3865AlbHorSal, T01T02_A3865AlbHorSal[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbHorSal");
               GXutil.writeLogRaw("Old: ",Z3865AlbHorSal);
               GXutil.writeLogRaw("Current: ",T01T02_A3865AlbHorSal[0]);
            }
            if ( GXutil.strcmp(Z2242AlbSec, T01T02_A2242AlbSec[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbSec");
               GXutil.writeLogRaw("Old: ",Z2242AlbSec);
               GXutil.writeLogRaw("Current: ",T01T02_A2242AlbSec[0]);
            }
            if ( GXutil.strcmp(Z5141AlbIvaCod, T01T02_A5141AlbIvaCod[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbIvaCod");
               GXutil.writeLogRaw("Old: ",Z5141AlbIvaCod);
               GXutil.writeLogRaw("Current: ",T01T02_A5141AlbIvaCod[0]);
            }
            if ( GXutil.strcmp(Z10836AlbTrnDm, T01T02_A10836AlbTrnDm[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbTrnDm");
               GXutil.writeLogRaw("Old: ",Z10836AlbTrnDm);
               GXutil.writeLogRaw("Current: ",T01T02_A10836AlbTrnDm[0]);
            }
            if ( GXutil.strcmp(Z10837AlbTrnNc, T01T02_A10837AlbTrnNc[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbTrnNc");
               GXutil.writeLogRaw("Old: ",Z10837AlbTrnNc);
               GXutil.writeLogRaw("Current: ",T01T02_A10837AlbTrnNc[0]);
            }
            if ( GXutil.strcmp(Z10835AlbTrnNm, T01T02_A10835AlbTrnNm[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbTrnNm");
               GXutil.writeLogRaw("Old: ",Z10835AlbTrnNm);
               GXutil.writeLogRaw("Current: ",T01T02_A10835AlbTrnNm[0]);
            }
            if ( Z5805AlbEnvFtp != T01T02_A5805AlbEnvFtp[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbEnvFtp");
               GXutil.writeLogRaw("Old: ",Z5805AlbEnvFtp);
               GXutil.writeLogRaw("Current: ",T01T02_A5805AlbEnvFtp[0]);
            }
            if ( GXutil.strcmp(Z10765AlbProAT, T01T02_A10765AlbProAT[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbProAT");
               GXutil.writeLogRaw("Old: ",Z10765AlbProAT);
               GXutil.writeLogRaw("Current: ",T01T02_A10765AlbProAT[0]);
            }
            if ( DecimalUtil.compareTo(Z10020AlbGrossT, T01T02_A10020AlbGrossT[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbGrossT");
               GXutil.writeLogRaw("Old: ",Z10020AlbGrossT);
               GXutil.writeLogRaw("Current: ",T01T02_A10020AlbGrossT[0]);
            }
            if ( !( GXutil.dateCompare(Z10019AlbHhfm, T01T02_A10019AlbHhfm[0]) ) )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbHhfm");
               GXutil.writeLogRaw("Old: ",Z10019AlbHhfm);
               GXutil.writeLogRaw("Current: ",T01T02_A10019AlbHhfm[0]);
            }
            if ( GXutil.strcmp(Z10018ALbFmdc, T01T02_A10018ALbFmdc[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"ALbFmdc");
               GXutil.writeLogRaw("Old: ",Z10018ALbFmdc);
               GXutil.writeLogRaw("Current: ",T01T02_A10018ALbFmdc[0]);
            }
            if ( GXutil.strcmp(Z10017AlbFmd, T01T02_A10017AlbFmd[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbFmd");
               GXutil.writeLogRaw("Old: ",Z10017AlbFmd);
               GXutil.writeLogRaw("Current: ",T01T02_A10017AlbFmd[0]);
            }
            if ( GXutil.strcmp(Z7988AlbObsCb, T01T02_A7988AlbObsCb[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbObsCb");
               GXutil.writeLogRaw("Old: ",Z7988AlbObsCb);
               GXutil.writeLogRaw("Current: ",T01T02_A7988AlbObsCb[0]);
            }
            if ( GXutil.strcmp(Z7987AlbColCa, T01T02_A7987AlbColCa[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbColCa");
               GXutil.writeLogRaw("Old: ",Z7987AlbColCa);
               GXutil.writeLogRaw("Current: ",T01T02_A7987AlbColCa[0]);
            }
            if ( Z7162AlbDesp != T01T02_A7162AlbDesp[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbDesp");
               GXutil.writeLogRaw("Old: ",Z7162AlbDesp);
               GXutil.writeLogRaw("Current: ",T01T02_A7162AlbDesp[0]);
            }
            if ( DecimalUtil.compareTo(Z7986AlbCambio, T01T02_A7986AlbCambio[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbCambio");
               GXutil.writeLogRaw("Old: ",Z7986AlbCambio);
               GXutil.writeLogRaw("Current: ",T01T02_A7986AlbCambio[0]);
            }
            if ( Z7985AlbTipDoc != T01T02_A7985AlbTipDoc[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbTipDoc");
               GXutil.writeLogRaw("Old: ",Z7985AlbTipDoc);
               GXutil.writeLogRaw("Current: ",T01T02_A7985AlbTipDoc[0]);
            }
            if ( GXutil.strcmp(Z7984AlbMotTr, T01T02_A7984AlbMotTr[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbMotTr");
               GXutil.writeLogRaw("Old: ",Z7984AlbMotTr);
               GXutil.writeLogRaw("Current: ",T01T02_A7984AlbMotTr[0]);
            }
            if ( Z5803AlbTipCal != T01T02_A5803AlbTipCal[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbTipCal");
               GXutil.writeLogRaw("Old: ",Z5803AlbTipCal);
               GXutil.writeLogRaw("Current: ",T01T02_A5803AlbTipCal[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4023AlbFecSal), GXutil.resetTime(T01T02_A4023AlbFecSal[0])) ) )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbFecSal");
               GXutil.writeLogRaw("Old: ",Z4023AlbFecSal);
               GXutil.writeLogRaw("Current: ",T01T02_A4023AlbFecSal[0]);
            }
            if ( Z7102AlbNumT != T01T02_A7102AlbNumT[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbNumT");
               GXutil.writeLogRaw("Old: ",Z7102AlbNumT);
               GXutil.writeLogRaw("Current: ",T01T02_A7102AlbNumT[0]);
            }
            if ( GXutil.strcmp(Z7101AlbLic, T01T02_A7101AlbLic[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbLic");
               GXutil.writeLogRaw("Old: ",Z7101AlbLic);
               GXutil.writeLogRaw("Current: ",T01T02_A7101AlbLic[0]);
            }
            if ( GXutil.strcmp(Z7100AlbMarCo, T01T02_A7100AlbMarCo[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbMarCo");
               GXutil.writeLogRaw("Old: ",Z7100AlbMarCo);
               GXutil.writeLogRaw("Current: ",T01T02_A7100AlbMarCo[0]);
            }
            if ( GXutil.strcmp(Z7099AlbOComp, T01T02_A7099AlbOComp[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbOComp");
               GXutil.writeLogRaw("Old: ",Z7099AlbOComp);
               GXutil.writeLogRaw("Current: ",T01T02_A7099AlbOComp[0]);
            }
            if ( GXutil.strcmp(Z7098AlbUsu, T01T02_A7098AlbUsu[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbUsu");
               GXutil.writeLogRaw("Old: ",Z7098AlbUsu);
               GXutil.writeLogRaw("Current: ",T01T02_A7098AlbUsu[0]);
            }
            if ( GXutil.strcmp(Z5140AlbMarca, T01T02_A5140AlbMarca[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbMarca");
               GXutil.writeLogRaw("Old: ",Z5140AlbMarca);
               GXutil.writeLogRaw("Current: ",T01T02_A5140AlbMarca[0]);
            }
            if ( Z3869AlbCliDes != T01T02_A3869AlbCliDes[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbCliDes");
               GXutil.writeLogRaw("Old: ",Z3869AlbCliDes);
               GXutil.writeLogRaw("Current: ",T01T02_A3869AlbCliDes[0]);
            }
            if ( GXutil.strcmp(Z3868AlbMat, T01T02_A3868AlbMat[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbMat");
               GXutil.writeLogRaw("Old: ",Z3868AlbMat);
               GXutil.writeLogRaw("Current: ",T01T02_A3868AlbMat[0]);
            }
            if ( Z3867AlbLocDes != T01T02_A3867AlbLocDes[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbLocDes");
               GXutil.writeLogRaw("Old: ",Z3867AlbLocDes);
               GXutil.writeLogRaw("Current: ",T01T02_A3867AlbLocDes[0]);
            }
            if ( Z3866AlbLocCar != T01T02_A3866AlbLocCar[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbLocCar");
               GXutil.writeLogRaw("Old: ",Z3866AlbLocCar);
               GXutil.writeLogRaw("Current: ",T01T02_A3866AlbLocCar[0]);
            }
            if ( GXutil.strcmp(Z3093AlbDivTCod, T01T02_A3093AlbDivTCod[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbDivTCod");
               GXutil.writeLogRaw("Old: ",Z3093AlbDivTCod);
               GXutil.writeLogRaw("Current: ",T01T02_A3093AlbDivTCod[0]);
            }
            if ( Z33AlbProEst != T01T02_A33AlbProEst[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbProEst");
               GXutil.writeLogRaw("Old: ",Z33AlbProEst);
               GXutil.writeLogRaw("Current: ",T01T02_A33AlbProEst[0]);
            }
            if ( Z1258GuiRemDom != T01T02_A1258GuiRemDom[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"GuiRemDom");
               GXutil.writeLogRaw("Old: ",Z1258GuiRemDom);
               GXutil.writeLogRaw("Current: ",T01T02_A1258GuiRemDom[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01T02_A34AlbProfch[0])) ) )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbProfch");
               GXutil.writeLogRaw("Old: ",Z34AlbProfch);
               GXutil.writeLogRaw("Current: ",T01T02_A34AlbProfch[0]);
            }
            if ( Z914AlbPObsCon != T01T02_A914AlbPObsCon[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbPObsCon");
               GXutil.writeLogRaw("Old: ",Z914AlbPObsCon);
               GXutil.writeLogRaw("Current: ",T01T02_A914AlbPObsCon[0]);
            }
            if ( GXutil.strcmp(Z14069AlbPdATCUD, T01T02_A14069AlbPdATCUD[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbPdATCUD");
               GXutil.writeLogRaw("Old: ",Z14069AlbPdATCUD);
               GXutil.writeLogRaw("Current: ",T01T02_A14069AlbPdATCUD[0]);
            }
            if ( GXutil.strcmp(Z14073AlbPdSerAT, T01T02_A14073AlbPdSerAT[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbPdSerAT");
               GXutil.writeLogRaw("Old: ",Z14073AlbPdSerAT);
               GXutil.writeLogRaw("Current: ",T01T02_A14073AlbPdSerAT[0]);
            }
            if ( GXutil.strcmp(Z14074AlbPdTipAT, T01T02_A14074AlbPdTipAT[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbPdTipAT");
               GXutil.writeLogRaw("Old: ",Z14074AlbPdTipAT);
               GXutil.writeLogRaw("Current: ",T01T02_A14074AlbPdTipAT[0]);
            }
            if ( GXutil.strcmp(Z1253EmprGuiRem, T01T02_A1253EmprGuiRem[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"EmprGuiRem");
               GXutil.writeLogRaw("Old: ",Z1253EmprGuiRem);
               GXutil.writeLogRaw("Current: ",T01T02_A1253EmprGuiRem[0]);
            }
            if ( Z1243GuiRemCli != T01T02_A1243GuiRemCli[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"GuiRemCli");
               GXutil.writeLogRaw("Old: ",Z1243GuiRemCli);
               GXutil.writeLogRaw("Current: ",T01T02_A1243GuiRemCli[0]);
            }
            if ( Z840TrnCod != T01T02_A840TrnCod[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01T02_A840TrnCod[0]);
            }
            if ( Z3108AlbDivCod != T01T02_A3108AlbDivCod[0] )
            {
               GXutil.writeLogln("albaranes.albaran:[seudo value changed for attri]"+"AlbDivCod");
               GXutil.writeLogRaw("Old: ",Z3108AlbDivCod);
               GXutil.writeLogRaw("Current: ",T01T02_A3108AlbDivCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1T03( )
   {
      beforeValidate1T03( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T03( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1T03( 0) ;
         checkOptimisticConcurrency1T03( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T03( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1T03( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T019 */
                  pr_default.execute(17, new Object[] {Long.valueOf(A30AlbProCod), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), A39AlbProPri, A3865AlbHorSal, A2242AlbSec, A5141AlbIvaCod, A10836AlbTrnDm, A10837AlbTrnNc, A10835AlbTrnNm, Byte.valueOf(A5805AlbEnvFtp), A10765AlbProAT, A10020AlbGrossT, A10019AlbHhfm, A10018ALbFmdc, Boolean.valueOf(n10017AlbFmd), A10017AlbFmd, A7988AlbObsCb, A7987AlbColCa, Integer.valueOf(A7162AlbDesp), A7986AlbCambio, Integer.valueOf(A7985AlbTipDoc), A7984AlbMotTr, Byte.valueOf(A5803AlbTipCal), A4023AlbFecSal, Long.valueOf(A7102AlbNumT), A7101AlbLic, A7100AlbMarCo, A7099AlbOComp, A7098AlbUsu, A5140AlbMarca, Integer.valueOf(A3869AlbCliDes), A3868AlbMat, Byte.valueOf(A3867AlbLocDes), Byte.valueOf(A3866AlbLocCar), Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, Byte.valueOf(A33AlbProEst), Boolean.valueOf(n1258GuiRemDom), Byte.valueOf(A1258GuiRemDom), A34AlbProfch, Byte.valueOf(A914AlbPObsCon), A14069AlbPdATCUD, A14073AlbPdSerAT, A14074AlbPdTipAT, A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), A396EmprCod, Short.valueOf(A840TrnCod), Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
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
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
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
         else
         {
            load1T03( ) ;
         }
         endLevel1T03( ) ;
      }
      closeExtendedTableCursors1T03( ) ;
   }

   public void update1T03( )
   {
      beforeValidate1T03( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T03( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T03( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T03( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1T03( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T020 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), A39AlbProPri, A3865AlbHorSal, A2242AlbSec, A5141AlbIvaCod, A10836AlbTrnDm, A10837AlbTrnNc, A10835AlbTrnNm, Byte.valueOf(A5805AlbEnvFtp), A10765AlbProAT, A10020AlbGrossT, A10019AlbHhfm, A10018ALbFmdc, Boolean.valueOf(n10017AlbFmd), A10017AlbFmd, A7988AlbObsCb, A7987AlbColCa, Integer.valueOf(A7162AlbDesp), A7986AlbCambio, Integer.valueOf(A7985AlbTipDoc), A7984AlbMotTr, Byte.valueOf(A5803AlbTipCal), A4023AlbFecSal, Long.valueOf(A7102AlbNumT), A7101AlbLic, A7100AlbMarCo, A7099AlbOComp, A7098AlbUsu, A5140AlbMarca, Integer.valueOf(A3869AlbCliDes), A3868AlbMat, Byte.valueOf(A3867AlbLocDes), Byte.valueOf(A3866AlbLocCar), Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, Byte.valueOf(A33AlbProEst), Boolean.valueOf(n1258GuiRemDom), Byte.valueOf(A1258GuiRemDom), A34AlbProfch, Byte.valueOf(A914AlbPObsCon), A14069AlbPdATCUD, A14073AlbPdSerAT, A14074AlbPdTipAT, A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Short.valueOf(A840TrnCod), Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1T03( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
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
         endLevel1T03( ) ;
      }
      closeExtendedTableCursors1T03( ) ;
   }

   public void deferredUpdate1T03( )
   {
   }

   public void delete( )
   {
      beforeValidate1T03( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T03( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1T03( ) ;
         afterConfirm1T03( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1T03( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01T021 */
               pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     if ( isIns( ) || isUpd( ) || isDlt( ) )
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1T03( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1T03( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( AV69Endutex == 1 ) && isIns( )  && true /* After */ )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int8[0] = A1243GuiRemCli ;
            GXv_char3[0] = AV62Clitipo ;
            new app.pclitipo(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
            albaran_impl.this.A396EmprCod = GXv_char4[0] ;
            albaran_impl.this.A1243GuiRemCli = GXv_int8[0] ;
            albaran_impl.this.AV62Clitipo = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV62Clitipo", AV62Clitipo);
         }
         if ( ( AV69Endutex == 1 ) && isIns( )  && ( GXutil.strcmp(AV62Clitipo, httpContext.getMessage( "I", "")) == 0 ) && ( ( GXutil.strcmp(AV60AlbSec, httpContext.getMessage( "D", "")) == 0 ) || ( GXutil.strcmp(AV60AlbSec, httpContext.getMessage( "B", "")) == 0 ) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente INTERNO", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( ( AV69Endutex == 1 ) && isIns( )  && ( GXutil.strcmp(AV62Clitipo, httpContext.getMessage( "E", "")) == 0 ) && ( ( GXutil.strcmp(AV60AlbSec, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV60AlbSec, httpContext.getMessage( "C", "")) == 0 ) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente EXTERNO", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = AV7ContCod ;
            GXv_int15[0] = A30AlbProCod ;
            GXv_int16[0] = AV65FlagAlb ;
            GXv_int6[0] = AV66FlagCont ;
            new app.putil10(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int15, GXv_int16, GXv_int6) ;
            albaran_impl.this.A396EmprCod = GXv_char4[0] ;
            albaran_impl.this.AV7ContCod = GXv_char3[0] ;
            albaran_impl.this.A30AlbProCod = GXv_int15[0] ;
            albaran_impl.this.AV65FlagAlb = GXv_int16[0] ;
            albaran_impl.this.AV66FlagCont = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV65FlagAlb", GXutil.str( AV65FlagAlb, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV66FlagCont", GXutil.str( AV66FlagCont, 1, 0));
         }
         if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV65FlagAlb == 0 ) && ( AV18F_carvema == 0 ) && ( AV13FirmaD == 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION, Va a dar de ALTA un Albaran MANUALMENTE", ""), 0, "");
         }
         if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV66FlagCont == 1 ) && ( AV18F_carvema == 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Intentamos dar de ALTA un ALBARAN > CONTADOR manualmente", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV13FirmaD == 1 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Intentamos dar de ALTA un ALBARAN > CONTADOR manualmente", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( true /* After */ && isIns( )  && ( AV71hashAnt == 1 ) )
         {
            GXv_char4[0] = AV70msg_control ;
            new app.pctrlhashanterior(remoteHandle, context).execute( A396EmprCod, A39AlbProPri, GXv_char4) ;
            albaran_impl.this.AV70msg_control = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70msg_control", AV70msg_control);
         }
         if ( true /* After */ && ( GXutil.strcmp(AV70msg_control, " ") != 0 ) && ( AV13FirmaD == 1 ) && isIns( )  && ( AV71hashAnt == 1 ) )
         {
            httpContext.GX_msglist.addItem(AV70msg_control, 1, "");
            AnyError = (short)(1) ;
         }
         if ( ! (GXutil.strcmp("", A7101AlbLic)==0) && ( AV13FirmaD == 1 ) && ( isIns( )  || isUpd( )  || isDlt( )  ) && ( AV12avisar == 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""), 1, "");
            AnyError = (short)(1) ;
         }
         /* Using cursor T01T022 */
         pr_default.execute(20, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
         A3109AlbDivAbr = T01T022_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = T01T022_n3109AlbDivAbr[0] ;
         pr_default.close(20);
         if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
         {
            AV7ContCod = "555555" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
         }
         else
         {
            if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
            {
               AV7ContCod = "666666" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
            }
         }
         /* Using cursor T01T023 */
         pr_default.execute(21, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A3145GuiRemDivT = T01T023_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = T01T023_n3145GuiRemDivT[0] ;
         A1244GuiRemCln = T01T023_A1244GuiRemCln[0] ;
         A3110GuiRemDiv = T01T023_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = T01T023_n3110GuiRemDiv[0] ;
         pr_default.close(21);
         /* Using cursor T01T024 */
         pr_default.execute(22, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
         A3643TrnNif = T01T024_A3643TrnNif[0] ;
         n3643TrnNif = T01T024_n3643TrnNif[0] ;
         A841TrnNom = T01T024_A841TrnNom[0] ;
         n841TrnNom = T01T024_n841TrnNom[0] ;
         pr_default.close(22);
         /* Using cursor T01T025 */
         pr_default.execute(23, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            A1260BusDomEnv = T01T025_A1260BusDomEnv[0] ;
            n1260BusDomEnv = T01T025_n1260BusDomEnv[0] ;
         }
         else
         {
            A1260BusDomEnv = (byte)(0) ;
            n1260BusDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         }
         pr_default.close(23);
         /* Using cursor T01T026 */
         pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
         A3643TrnNif = T01T026_A3643TrnNif[0] ;
         n3643TrnNif = T01T026_n3643TrnNif[0] ;
         A841TrnNom = T01T026_A841TrnNom[0] ;
         n841TrnNom = T01T026_n841TrnNom[0] ;
         pr_default.close(24);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01T027 */
         pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Observaciones ALBARAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01T028 */
         pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Hdrs Albaran", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01T029 */
         pr_default.execute(27, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CNOTRET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01T030 */
         pr_default.execute(28, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01T031 */
         pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
      }
   }

   public void endLevel1T03( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1T03( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "albaranes.albaran");
         if ( AnyError == 0 )
         {
            confirmValues1T00( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "albaranes.albaran");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1T03( )
   {
      /* Scan By routine */
      /* Using cursor T01T032 */
      pr_default.execute(30, new Object[] {A396EmprCod});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01T032_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1T03( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01T032_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void scanEnd1T03( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1T03( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ && ( AV13FirmaD == 1 ) && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_dtime17[0] = A10019AlbHhfm ;
         GXv_char3[0] = A10017AlbFmd ;
         GXv_char2[0] = A10018ALbFmdc ;
         GXv_int15[0] = A30AlbProCod ;
         GXv_char18[0] = A39AlbProPri ;
         GXv_int16[0] = (byte)(1) ;
         new app.pborrec(remoteHandle, context).execute( GXv_char4, GXv_dtime17, GXv_char3, GXv_char2, GXv_int15, GXv_char18, GXv_int16) ;
         albaran_impl.this.A396EmprCod = GXv_char4[0] ;
         albaran_impl.this.A10019AlbHhfm = GXv_dtime17[0] ;
         albaran_impl.this.A10017AlbFmd = GXv_char3[0] ;
         albaran_impl.this.A10018ALbFmdc = GXv_char2[0] ;
         albaran_impl.this.A30AlbProCod = GXv_int15[0] ;
         albaran_impl.this.A39AlbProPri = GXv_char18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
         httpContext.ajax_rsp_assign_attri("", false, "A10018ALbFmdc", A10018ALbFmdc);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      }
      if ( (0==A30AlbProCod) && true /* Level */ && true /* After */ && (0==AV64HueAlb) )
      {
         GXv_int8[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV7ContCod, GXv_int8) ;
         albaran_impl.this.A30AlbProCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      if ( (0==A30AlbProCod) && true /* Level */ && true /* After */ && ( AV64HueAlb == 1 ) && ( AV13FirmaD == 0 ) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_char4[0] = AV7ContCod ;
         GXv_int8[0] = (int)(A30AlbProCod) ;
         GXv_char3[0] = A39AlbProPri ;
         new app.pnumalb(remoteHandle, context).execute( GXv_char18, GXv_char4, GXv_int8, GXv_char3) ;
         albaran_impl.this.A396EmprCod = GXv_char18[0] ;
         albaran_impl.this.AV7ContCod = GXv_char4[0] ;
         albaran_impl.this.A30AlbProCod = GXv_int8[0] ;
         albaran_impl.this.A39AlbProPri = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      }
      if ( (0==A30AlbProCod) && true /* Level */ && true /* After */ )
      {
         GXv_int8[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV7ContCod, GXv_int8) ;
         albaran_impl.this.A30AlbProCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void beforeInsert1T03( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1T03( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1T03( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1T03( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1T03( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1T03( )
   {
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtAlbProPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Enabled), 5, 0), true);
      edtAlbProEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEst_Enabled), 5, 0), true);
      edtAlbProfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Enabled), 5, 0), true);
      edtAlbFecSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFecSal_Enabled), 5, 0), true);
      edtAlbHorSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHorSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHorSal_Enabled), 5, 0), true);
      edtAlbDivCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivCod_Enabled), 5, 0), true);
      edtAlbUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUsu_Enabled), 5, 0), true);
      edtGuiRemCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      edtAlbDomEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDomEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDomEnv_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtAlbMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMat_Enabled), 5, 0), true);
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtAlbLic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Enabled), 5, 0), true);
      cmbAlbProAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProAT.getEnabled(), 5, 0), true);
      edtAlbHhfm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHhfm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHhfm_Enabled), 5, 0), true);
      edtAlbGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGrossT_Enabled), 5, 0), true);
      edtAlbPdATCUD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPdATCUD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPdATCUD_Enabled), 5, 0), true);
      edtAlbFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFmd_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboalbdivcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbdivcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbdivcod_Enabled), 5, 0), true);
      edtavComboguiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboguiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboguiremcli_Enabled), 5, 0), true);
      edtavComboalbdomenv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalbdomenv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalbdomenv_Enabled), 5, 0), true);
      edtavCombotrncod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1T03( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1T00( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.albaranes.albaran", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV17EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV51AlbProCod,10,0)),GXutil.URLEncode(GXutil.booltostr(AV122VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV121AccionesEnPopup))}, new String[] {"Gx_mode","EmprCod","AlbProCod","VisualizarAcciones","AccionesEnPopup"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Albaran");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV124Pgmname, "")));
      forbiddenHiddens.add("AlbIvaCod", GXutil.rtrim( localUtil.format( A5141AlbIvaCod, "@!")));
      forbiddenHiddens.add("AlbTrnDm", GXutil.rtrim( localUtil.format( A10836AlbTrnDm, "")));
      forbiddenHiddens.add("AlbTrnNc", GXutil.rtrim( localUtil.format( A10837AlbTrnNc, "")));
      forbiddenHiddens.add("AlbTrnNm", GXutil.rtrim( localUtil.format( A10835AlbTrnNm, "")));
      forbiddenHiddens.add("AlbEnvFtp", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9"));
      forbiddenHiddens.add("AlbProAT", GXutil.rtrim( localUtil.format( A10765AlbProAT, "")));
      forbiddenHiddens.add("AlbGrossT", localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99"));
      forbiddenHiddens.add("AlbObsCb", GXutil.rtrim( localUtil.format( A7988AlbObsCb, "")));
      forbiddenHiddens.add("AlbColCa", GXutil.rtrim( localUtil.format( A7987AlbColCa, "")));
      forbiddenHiddens.add("AlbDesp", localUtil.format( DecimalUtil.doubleToDec(A7162AlbDesp), "ZZZZZ9"));
      forbiddenHiddens.add("AlbCambio", localUtil.format( A7986AlbCambio, "Z9.9999"));
      forbiddenHiddens.add("AlbTipDoc", localUtil.format( DecimalUtil.doubleToDec(A7985AlbTipDoc), "ZZZZZZZ9"));
      forbiddenHiddens.add("AlbMotTr", GXutil.rtrim( localUtil.format( A7984AlbMotTr, "")));
      forbiddenHiddens.add("AlbTipCal", localUtil.format( DecimalUtil.doubleToDec(A5803AlbTipCal), "9"));
      forbiddenHiddens.add("AlbNumT", localUtil.format( DecimalUtil.doubleToDec(A7102AlbNumT), "ZZZZZZZZZ9"));
      forbiddenHiddens.add("AlbLic", GXutil.rtrim( localUtil.format( A7101AlbLic, "")));
      forbiddenHiddens.add("AlbMarCo", GXutil.rtrim( localUtil.format( A7100AlbMarCo, "")));
      forbiddenHiddens.add("AlbOComp", GXutil.rtrim( localUtil.format( A7099AlbOComp, "")));
      forbiddenHiddens.add("AlbUsu", GXutil.rtrim( localUtil.format( A7098AlbUsu, "")));
      forbiddenHiddens.add("AlbMarca", GXutil.rtrim( localUtil.format( A5140AlbMarca, "")));
      forbiddenHiddens.add("AlbLocDes", localUtil.format( DecimalUtil.doubleToDec(A3867AlbLocDes), "9"));
      forbiddenHiddens.add("AlbLocCar", localUtil.format( DecimalUtil.doubleToDec(A3866AlbLocCar), "9"));
      forbiddenHiddens.add("AlbDivTCod", GXutil.rtrim( localUtil.format( A3093AlbDivTCod, "")));
      forbiddenHiddens.add("AlbProEst", localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"));
      forbiddenHiddens.add("GuiRemDom", localUtil.format( DecimalUtil.doubleToDec(A1258GuiRemDom), "9"));
      forbiddenHiddens.add("AlbPObsCon", localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9"));
      forbiddenHiddens.add("AlbPdATCUD", GXutil.rtrim( localUtil.format( A14069AlbPdATCUD, "")));
      forbiddenHiddens.add("AlbPdSerAT", GXutil.rtrim( localUtil.format( A14073AlbPdSerAT, "")));
      forbiddenHiddens.add("AlbPdTipAT", GXutil.rtrim( localUtil.format( A14074AlbPdTipAT, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("albaranes\\albaran:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1259AlbDomEnv", GXutil.ltrim( localUtil.ntoc( Z1259AlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z39AlbProPri", GXutil.rtrim( Z39AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3865AlbHorSal", GXutil.rtrim( Z3865AlbHorSal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2242AlbSec", GXutil.rtrim( Z2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5141AlbIvaCod", GXutil.rtrim( Z5141AlbIvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10836AlbTrnDm", GXutil.rtrim( Z10836AlbTrnDm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10837AlbTrnNc", GXutil.rtrim( Z10837AlbTrnNc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10835AlbTrnNm", GXutil.rtrim( Z10835AlbTrnNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5805AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( Z5805AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10765AlbProAT", GXutil.rtrim( Z10765AlbProAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10020AlbGrossT", GXutil.ltrim( localUtil.ntoc( Z10020AlbGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10019AlbHhfm", localUtil.ttoc( Z10019AlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10018ALbFmdc", GXutil.rtrim( Z10018ALbFmdc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10017AlbFmd", Z10017AlbFmd);
      app.GxWebStd.gx_hidden_field( httpContext, "Z7988AlbObsCb", GXutil.rtrim( Z7988AlbObsCb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7987AlbColCa", GXutil.rtrim( Z7987AlbColCa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7162AlbDesp", GXutil.ltrim( localUtil.ntoc( Z7162AlbDesp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7986AlbCambio", GXutil.ltrim( localUtil.ntoc( Z7986AlbCambio, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7985AlbTipDoc", GXutil.ltrim( localUtil.ntoc( Z7985AlbTipDoc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7984AlbMotTr", GXutil.rtrim( Z7984AlbMotTr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5803AlbTipCal", GXutil.ltrim( localUtil.ntoc( Z5803AlbTipCal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4023AlbFecSal", localUtil.dtoc( Z4023AlbFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7102AlbNumT", GXutil.ltrim( localUtil.ntoc( Z7102AlbNumT, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7101AlbLic", GXutil.rtrim( Z7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7100AlbMarCo", GXutil.rtrim( Z7100AlbMarCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7099AlbOComp", GXutil.rtrim( Z7099AlbOComp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7098AlbUsu", GXutil.rtrim( Z7098AlbUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5140AlbMarca", GXutil.rtrim( Z5140AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3869AlbCliDes", GXutil.ltrim( localUtil.ntoc( Z3869AlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3868AlbMat", GXutil.rtrim( Z3868AlbMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3867AlbLocDes", GXutil.ltrim( localUtil.ntoc( Z3867AlbLocDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3866AlbLocCar", GXutil.ltrim( localUtil.ntoc( Z3866AlbLocCar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3093AlbDivTCod", GXutil.rtrim( Z3093AlbDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z33AlbProEst", GXutil.ltrim( localUtil.ntoc( Z33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1258GuiRemDom", GXutil.ltrim( localUtil.ntoc( Z1258GuiRemDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z34AlbProfch", localUtil.dtoc( Z34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( Z914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14069AlbPdATCUD", GXutil.rtrim( Z14069AlbPdATCUD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14073AlbPdSerAT", GXutil.rtrim( Z14073AlbPdSerAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14074AlbPdTipAT", GXutil.rtrim( Z14074AlbPdTipAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1253EmprGuiRem", GXutil.rtrim( Z1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( Z1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3108AlbDivCod", GXutil.ltrim( localUtil.ntoc( Z3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3108AlbDivCod", GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N1253EmprGuiRem", GXutil.rtrim( A1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "N1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N2242AlbSec", GXutil.rtrim( A2242AlbSec));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV113DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV113DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALBDIVCOD_DATA", AV103AlbDivCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALBDIVCOD_DATA", AV103AlbDivCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGUIREMCLI_DATA", AV114GuiRemCli_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGUIREMCLI_DATA", AV114GuiRemCli_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALBDOMENV_DATA", AV104AlbDomEnv_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALBDOMENV_DATA", AV104AlbDomEnv_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCOD_DATA", AV117TrnCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCOD_DATA", AV117TrnCod_Data);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vACCIONESENPOPUP", AV121AccionesEnPopup);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACCIONESENPOPUP", getSecureSignedToken( "", AV121AccionesEnPopup));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vVISUALIZARACCIONES", AV122VisualizarAcciones);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVISUALIZARACCIONES", getSecureSignedToken( "", AV122VisualizarAcciones));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOND_GUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV112Cond_GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV51AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV56Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALBDIVCOD", GXutil.ltrim( localUtil.ntoc( AV57Insert_AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_EMPRGUIREM", GXutil.rtrim( AV58Insert_EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRGUIREM", GXutil.rtrim( A1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_GUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV55Insert_GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vISVISIBLEAT", AV115IsVisibleAT);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vISVISIBLEHASH", AV116IsVisibleHash);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV101AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV101AlbProPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV7ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV60AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBSEC", GXutil.rtrim( A2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDIVTCOD", GXutil.rtrim( A3093AlbDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCLIDES", GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV10UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIULTMQ", GXutil.ltrim( localUtil.ntoc( AV61CliUltMq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHUEALB", GXutil.ltrim( localUtil.ntoc( AV64HueAlb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV13FirmaD, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCONT", GXutil.ltrim( localUtil.ntoc( AV66FlagCont, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGALB", GXutil.ltrim( localUtil.ntoc( AV65FlagAlb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCLI", GXutil.ltrim( localUtil.ntoc( AV67FlagCli, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBFMDC", GXutil.rtrim( A10018ALbFmdc));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_F", AV11Msg_f);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBLAST", GXutil.ltrim( localUtil.ntoc( AV15AlbLast, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFCH", localUtil.dtoc( AV14Fch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "BUSDOMENV", GXutil.ltrim( localUtil.ntoc( A1260BusDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_CARVEMA", GXutil.ltrim( localUtil.ntoc( AV18F_carvema, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_ALBANU", GXutil.ltrim( localUtil.ntoc( AV68F_albanu, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMARCA", GXutil.rtrim( A5140AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, "vAVISAR", GXutil.ltrim( localUtil.ntoc( AV12avisar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_TINAMAR", GXutil.ltrim( localUtil.ntoc( AV44F_tinamar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vENDUTEX", GXutil.ltrim( localUtil.ntoc( AV69Endutex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_CONTROL", AV70msg_control);
      app.GxWebStd.gx_hidden_field( httpContext, "vHASHANT", GXutil.ltrim( localUtil.ntoc( AV71hashAnt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLITIPO", GXutil.rtrim( AV62Clitipo));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBIVACOD", GXutil.rtrim( A5141AlbIvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTRNDM", GXutil.rtrim( A10836AlbTrnDm));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTRNNC", GXutil.rtrim( A10837AlbTrnNc));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTRNNM", GXutil.rtrim( A10835AlbTrnNm));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBOBSCB", GXutil.rtrim( A7988AlbObsCb));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOLCA", GXutil.rtrim( A7987AlbColCa));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDESP", GXutil.ltrim( localUtil.ntoc( A7162AlbDesp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCAMBIO", GXutil.ltrim( localUtil.ntoc( A7986AlbCambio, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTIPDOC", GXutil.ltrim( localUtil.ntoc( A7985AlbTipDoc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMOTTR", GXutil.rtrim( A7984AlbMotTr));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTIPCAL", GXutil.ltrim( localUtil.ntoc( A5803AlbTipCal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBNUMT", GXutil.ltrim( localUtil.ntoc( A7102AlbNumT, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMARCO", GXutil.rtrim( A7100AlbMarCo));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBOCOMP", GXutil.rtrim( A7099AlbOComp));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLOCDES", GXutil.ltrim( localUtil.ntoc( A3867AlbLocDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLOCCAR", GXutil.ltrim( localUtil.ntoc( A3866AlbLocCar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMDOM", GXutil.ltrim( localUtil.ntoc( A1258GuiRemDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPOBSCON", GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPDSERAT", GXutil.rtrim( A14073AlbPdSerAT));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPDTIPAT", GXutil.rtrim( A14074AlbPdTipAT));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMDIVT", GXutil.rtrim( A3145GuiRemDivT));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMCLN", GXutil.rtrim( A1244GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMDIV", GXutil.ltrim( localUtil.ntoc( A3110GuiRemDiv, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNIF", GXutil.rtrim( A3643TrnNif));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDIVABR", GXutil.rtrim( A3109AlbDivAbr));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDIVCOD_Objectcall", GXutil.rtrim( Combo_albdivcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDIVCOD_Cls", GXutil.rtrim( Combo_albdivcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDIVCOD_Selectedvalue_set", GXutil.rtrim( Combo_albdivcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDIVCOD_Enabled", GXutil.booltostr( Combo_albdivcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDIVCOD_Emptyitem", GXutil.booltostr( Combo_albdivcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GUIREMCLI_Objectcall", GXutil.rtrim( Combo_guiremcli_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GUIREMCLI_Cls", GXutil.rtrim( Combo_guiremcli_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GUIREMCLI_Selectedvalue_set", GXutil.rtrim( Combo_guiremcli_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GUIREMCLI_Enabled", GXutil.booltostr( Combo_guiremcli_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GUIREMCLI_Emptyitemtext", GXutil.rtrim( Combo_guiremcli_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDOMENV_Objectcall", GXutil.rtrim( Combo_albdomenv_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDOMENV_Cls", GXutil.rtrim( Combo_albdomenv_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDOMENV_Selectedvalue_set", GXutil.rtrim( Combo_albdomenv_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDOMENV_Selectedtext_set", GXutil.rtrim( Combo_albdomenv_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDOMENV_Enabled", GXutil.booltostr( Combo_albdomenv_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDOMENV_Datalistproc", GXutil.rtrim( Combo_albdomenv_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDOMENV_Datalistprocparametersprefix", GXutil.rtrim( Combo_albdomenv_Datalistprocparametersprefix));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALBDOMENV_Emptyitemtext", GXutil.rtrim( Combo_albdomenv_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Objectcall", GXutil.rtrim( Combo_trncod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Cls", GXutil.rtrim( Combo_trncod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Selectedvalue_set", GXutil.rtrim( Combo_trncod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Emptyitemtext", GXutil.rtrim( Combo_trncod_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
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
      return formatLink("app.albaranes.albaran", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV17EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV51AlbProCod,10,0)),GXutil.URLEncode(GXutil.booltostr(AV122VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV121AccionesEnPopup))}, new String[] {"Gx_mode","EmprCod","AlbProCod","VisualizarAcciones","AccionesEnPopup"})  ;
   }

   public String getPgmname( )
   {
      return "Albaranes.Albaran" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Albaranes", "") ;
   }

   public void initializeNonKey1T03( )
   {
      A840TrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
      A1253EmprGuiRem = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      A1243GuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      A1259AlbDomEnv = (byte)(0) ;
      n1259AlbDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
      A39AlbProPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      A3865AlbHorSal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
      AV61CliUltMq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61CliUltMq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61CliUltMq), 4, 0));
      AV66FlagCont = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66FlagCont", GXutil.str( AV66FlagCont, 1, 0));
      AV65FlagAlb = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65FlagAlb", GXutil.str( AV65FlagAlb, 1, 0));
      AV67FlagCli = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67FlagCli", GXutil.str( AV67FlagCli, 1, 0));
      AV11Msg_f = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Msg_f", AV11Msg_f);
      AV15AlbLast = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15AlbLast), 10, 0));
      AV14Fch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Fch", localUtil.format(AV14Fch, "99/99/99"));
      A2242AlbSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      AV70msg_control = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70msg_control", AV70msg_control);
      AV62Clitipo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Clitipo", AV62Clitipo);
      A1260BusDomEnv = (byte)(0) ;
      n1260BusDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      A5141AlbIvaCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5141AlbIvaCod", A5141AlbIvaCod);
      A10836AlbTrnDm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10836AlbTrnDm", A10836AlbTrnDm);
      A10837AlbTrnNc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
      A10835AlbTrnNm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10835AlbTrnNm", A10835AlbTrnNm);
      A5805AlbEnvFtp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A10020AlbGrossT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10018ALbFmdc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10018ALbFmdc", A10018ALbFmdc);
      A10017AlbFmd = "" ;
      n10017AlbFmd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
      A7988AlbObsCb = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7988AlbObsCb", A7988AlbObsCb);
      A7987AlbColCa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7987AlbColCa", A7987AlbColCa);
      A7162AlbDesp = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7162AlbDesp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7162AlbDesp), 6, 0));
      A7986AlbCambio = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7986AlbCambio", GXutil.ltrimstr( A7986AlbCambio, 7, 4));
      A7985AlbTipDoc = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7985AlbTipDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7985AlbTipDoc), 8, 0));
      A7984AlbMotTr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7984AlbMotTr", A7984AlbMotTr);
      A5803AlbTipCal = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5803AlbTipCal", GXutil.str( A5803AlbTipCal, 1, 0));
      A7102AlbNumT = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
      A7101AlbLic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
      A7100AlbMarCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7100AlbMarCo", A7100AlbMarCo);
      A7099AlbOComp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7099AlbOComp", A7099AlbOComp);
      A5140AlbMarca = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5140AlbMarca", A5140AlbMarca);
      A3868AlbMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
      A3867AlbLocDes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
      A3866AlbLocCar = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
      A3643TrnNif = "" ;
      n3643TrnNif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3109AlbDivAbr = "" ;
      n3109AlbDivAbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
      A33AlbProEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      A1258GuiRemDom = (byte)(0) ;
      n1258GuiRemDom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
      A3145GuiRemDivT = "" ;
      n3145GuiRemDivT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
      A3110GuiRemDiv = (byte)(0) ;
      n3110GuiRemDiv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
      A1244GuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A914AlbPObsCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      A14069AlbPdATCUD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14069AlbPdATCUD", A14069AlbPdATCUD);
      A14073AlbPdSerAT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14073AlbPdSerAT", A14073AlbPdSerAT);
      A14074AlbPdTipAT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14074AlbPdTipAT", A14074AlbPdTipAT);
      A10765AlbProAT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
      A4023AlbFecSal = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
      A7098AlbUsu = AV10UsurCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
      A3869AlbCliDes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
      A3093AlbDivTCod = httpContext.getMessage( "E", "") ;
      n3093AlbDivTCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      A34AlbProfch = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      Z1259AlbDomEnv = (byte)(0) ;
      Z39AlbProPri = "" ;
      Z3865AlbHorSal = "" ;
      Z2242AlbSec = "" ;
      Z5141AlbIvaCod = "" ;
      Z10836AlbTrnDm = "" ;
      Z10837AlbTrnNc = "" ;
      Z10835AlbTrnNm = "" ;
      Z5805AlbEnvFtp = (byte)(0) ;
      Z10765AlbProAT = "" ;
      Z10020AlbGrossT = DecimalUtil.ZERO ;
      Z10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      Z10018ALbFmdc = "" ;
      Z10017AlbFmd = "" ;
      Z7988AlbObsCb = "" ;
      Z7987AlbColCa = "" ;
      Z7162AlbDesp = 0 ;
      Z7986AlbCambio = DecimalUtil.ZERO ;
      Z7985AlbTipDoc = 0 ;
      Z7984AlbMotTr = "" ;
      Z5803AlbTipCal = (byte)(0) ;
      Z4023AlbFecSal = GXutil.nullDate() ;
      Z7102AlbNumT = 0 ;
      Z7101AlbLic = "" ;
      Z7100AlbMarCo = "" ;
      Z7099AlbOComp = "" ;
      Z7098AlbUsu = "" ;
      Z5140AlbMarca = "" ;
      Z3869AlbCliDes = 0 ;
      Z3868AlbMat = "" ;
      Z3867AlbLocDes = (byte)(0) ;
      Z3866AlbLocCar = (byte)(0) ;
      Z3093AlbDivTCod = "" ;
      Z33AlbProEst = (byte)(0) ;
      Z1258GuiRemDom = (byte)(0) ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z914AlbPObsCon = (byte)(0) ;
      Z14069AlbPdATCUD = "" ;
      Z14073AlbPdSerAT = "" ;
      Z14074AlbPdTipAT = "" ;
      Z1253EmprGuiRem = "" ;
      Z1243GuiRemCli = 0 ;
      Z840TrnCod = (short)(0) ;
      Z3108AlbDivCod = (byte)(0) ;
   }

   public void initAll1T03( )
   {
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      initializeNonKey1T03( ) ;
   }

   public void standaloneModalInsert( )
   {
      A34AlbProfch = i34AlbProfch ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A4023AlbFecSal = i4023AlbFecSal ;
      httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
      A3093AlbDivTCod = i3093AlbDivTCod ;
      n3093AlbDivTCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      A7098AlbUsu = i7098AlbUsu ;
      httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
      A10765AlbProAT = i10765AlbProAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211695827", true, true);
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
      httpContext.AddJavascriptSource("albaranes/albaran.js", "?20268211695828", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtAlbProPri_Internalname = "ALBPROPRI" ;
      edtAlbProEst_Internalname = "ALBPROEST" ;
      divTablealbarannumero_Internalname = "TABLEALBARANNUMERO" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      edtAlbFecSal_Internalname = "ALBFECSAL" ;
      edtAlbHorSal_Internalname = "ALBHORSAL" ;
      lblTextblockalbdivcod_Internalname = "TEXTBLOCKALBDIVCOD" ;
      Combo_albdivcod_Internalname = "COMBO_ALBDIVCOD" ;
      edtAlbDivCod_Internalname = "ALBDIVCOD" ;
      divTablesplittedalbdivcod_Internalname = "TABLESPLITTEDALBDIVCOD" ;
      divTablefechas_Internalname = "TABLEFECHAS" ;
      edtAlbUsu_Internalname = "ALBUSU" ;
      divTableusuario_Internalname = "TABLEUSUARIO" ;
      lblTextblockguiremcli_Internalname = "TEXTBLOCKGUIREMCLI" ;
      Combo_guiremcli_Internalname = "COMBO_GUIREMCLI" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      divTablesplittedguiremcli_Internalname = "TABLESPLITTEDGUIREMCLI" ;
      lblTextblockalbdomenv_Internalname = "TEXTBLOCKALBDOMENV" ;
      Combo_albdomenv_Internalname = "COMBO_ALBDOMENV" ;
      edtAlbDomEnv_Internalname = "ALBDOMENV" ;
      divTablesplittedalbdomenv_Internalname = "TABLESPLITTEDALBDOMENV" ;
      divTablecliente_Internalname = "TABLECLIENTE" ;
      lblTextblocktrncod_Internalname = "TEXTBLOCKTRNCOD" ;
      Combo_trncod_Internalname = "COMBO_TRNCOD" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      divTablesplittedtrncod_Internalname = "TABLESPLITTEDTRNCOD" ;
      edtAlbMat_Internalname = "ALBMAT" ;
      divTabletransportista_Internalname = "TABLETRANSPORTISTA" ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP" );
      edtAlbLic_Internalname = "ALBLIC" ;
      cmbAlbProAT.setInternalname( "ALBPROAT" );
      edtAlbHhfm_Internalname = "ALBHHFM" ;
      edtAlbGrossT_Internalname = "ALBGROSST" ;
      edtAlbPdATCUD_Internalname = "ALBPDATCUD" ;
      divTblgrupoat_Internalname = "TBLGRUPOAT" ;
      divGrupoat_Internalname = "GRUPOAT" ;
      grpUnnamedgroup2_Internalname = "UNNAMEDGROUP2" ;
      edtAlbFmd_Internalname = "ALBFMD" ;
      divTblhash_Internalname = "TBLHASH" ;
      tblGrupohash_Internalname = "GRUPOHASH" ;
      grpUnnamedgroup3_Internalname = "UNNAMEDGROUP3" ;
      divTableat_Internalname = "TABLEAT" ;
      divTablealbaran_Internalname = "TABLEALBARAN" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboalbdivcod_Internalname = "vCOMBOALBDIVCOD" ;
      divSectionattribute_albdivcod_Internalname = "SECTIONATTRIBUTE_ALBDIVCOD" ;
      edtavComboguiremcli_Internalname = "vCOMBOGUIREMCLI" ;
      divSectionattribute_guiremcli_Internalname = "SECTIONATTRIBUTE_GUIREMCLI" ;
      edtavComboalbdomenv_Internalname = "vCOMBOALBDOMENV" ;
      divSectionattribute_albdomenv_Internalname = "SECTIONATTRIBUTE_ALBDOMENV" ;
      edtavCombotrncod_Internalname = "vCOMBOTRNCOD" ;
      divSectionattribute_trncod_Internalname = "SECTIONATTRIBUTE_TRNCOD" ;
      edtavEmprcod_Internalname = "vEMPRCOD" ;
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
      Form.setCaption( httpContext.getMessage( "Albaranes", "") );
      Combo_albdomenv_Datalistprocparametersprefix = "" ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Enabled = 0 ;
      edtavEmprcod_Visible = 1 ;
      edtavCombotrncod_Jsonclick = "" ;
      edtavCombotrncod_Enabled = 0 ;
      edtavCombotrncod_Visible = 1 ;
      edtavComboalbdomenv_Jsonclick = "" ;
      edtavComboalbdomenv_Enabled = 0 ;
      edtavComboalbdomenv_Visible = 1 ;
      edtavComboguiremcli_Jsonclick = "" ;
      edtavComboguiremcli_Enabled = 0 ;
      edtavComboguiremcli_Visible = 1 ;
      edtavComboalbdivcod_Jsonclick = "" ;
      edtavComboalbdivcod_Enabled = 0 ;
      edtavComboalbdivcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbFmd_Enabled = 0 ;
      grpUnnamedgroup3_Class = "Group" ;
      edtAlbPdATCUD_Jsonclick = "" ;
      edtAlbPdATCUD_Enabled = 0 ;
      edtAlbGrossT_Jsonclick = "" ;
      edtAlbGrossT_Enabled = 0 ;
      edtAlbHhfm_Jsonclick = "" ;
      edtAlbHhfm_Enabled = 0 ;
      cmbAlbProAT.setJsonclick( "" );
      cmbAlbProAT.setEnabled( 0 );
      edtAlbLic_Jsonclick = "" ;
      edtAlbLic_Enabled = 0 ;
      cmbAlbEnvFtp.setJsonclick( "" );
      cmbAlbEnvFtp.setEnabled( 0 );
      grpUnnamedgroup2_Class = "Group" ;
      edtAlbMat_Jsonclick = "" ;
      edtAlbMat_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtTrnCod_Visible = 1 ;
      Combo_trncod_Emptyitemtext = "" ;
      Combo_trncod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_trncod_Caption = "" ;
      Combo_trncod_Enabled = GXutil.toBoolean( -1) ;
      edtAlbDomEnv_Jsonclick = "" ;
      edtAlbDomEnv_Enabled = 1 ;
      edtAlbDomEnv_Visible = 1 ;
      Combo_albdomenv_Emptyitemtext = "" ;
      Combo_albdomenv_Datalistproc = "Albaranes.AlbaranLoadDVCombo" ;
      Combo_albdomenv_Cls = "ExtendedCombo AttributeFL" ;
      Combo_albdomenv_Caption = "" ;
      Combo_albdomenv_Enabled = GXutil.toBoolean( -1) ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 1 ;
      edtGuiRemCli_Visible = 1 ;
      Combo_guiremcli_Emptyitemtext = "" ;
      Combo_guiremcli_Cls = "ExtendedCombo AttributeFL" ;
      Combo_guiremcli_Caption = "" ;
      Combo_guiremcli_Enabled = GXutil.toBoolean( -1) ;
      edtAlbUsu_Jsonclick = "" ;
      edtAlbUsu_Enabled = 0 ;
      edtAlbDivCod_Jsonclick = "" ;
      edtAlbDivCod_Enabled = 1 ;
      edtAlbDivCod_Visible = 1 ;
      Combo_albdivcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_albdivcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_albdivcod_Caption = "" ;
      Combo_albdivcod_Enabled = GXutil.toBoolean( -1) ;
      edtAlbHorSal_Jsonclick = "" ;
      edtAlbHorSal_Enabled = 1 ;
      edtAlbFecSal_Jsonclick = "" ;
      edtAlbFecSal_Enabled = 1 ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProfch_Enabled = 1 ;
      edtAlbProEst_Jsonclick = "" ;
      edtAlbProEst_Enabled = 0 ;
      edtAlbProPri_Jsonclick = "" ;
      edtAlbProPri_Enabled = 0 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 0 ;
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

   public void gx27asaalbhorsal1T03( java.util.Date A34AlbProfch ,
                                     String Gx_mode ,
                                     String A396EmprCod )
   {
      if ( isIns( )  && (GXutil.strcmp("", A3865AlbHorSal)==0) && true /* After */ )
      {
         GXt_char1 = A3865AlbHorSal ;
         GXv_char18[0] = A396EmprCod ;
         GXv_char4[0] = GXt_char1 ;
         new app.phragr3(remoteHandle, context).execute( GXv_char18, GXv_char4) ;
         albaran_impl.this.A396EmprCod = GXv_char18[0] ;
         albaran_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3865AlbHorSal = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3865AlbHorSal))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_45_1T03( String A396EmprCod ,
                           int A1243GuiRemCli ,
                           short AV61CliUltMq ,
                           byte AV63Tintex )
   {
      if ( true /* After */ && ( AV63Tintex == 1 ) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_int8[0] = A1243GuiRemCli ;
         GXv_int12[0] = AV61CliUltMq ;
         new app.pcliumq(remoteHandle, context).execute( GXv_char18, GXv_int8, GXv_int12) ;
         A396EmprCod = GXv_char18[0] ;
         A1243GuiRemCli = GXv_int8[0] ;
         AV61CliUltMq = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV61CliUltMq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61CliUltMq), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV61CliUltMq, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_46_1T03( String A396EmprCod ,
                           String AV7ContCod ,
                           long A30AlbProCod ,
                           String A39AlbProPri ,
                           byte AV64HueAlb )
   {
      if ( (0==A30AlbProCod) && true /* Level */ && true /* After */ && (0==AV64HueAlb) )
      {
         GXv_int8[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV7ContCod, GXv_int8) ;
         A30AlbProCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_47_1T03( String A396EmprCod ,
                           String AV7ContCod ,
                           long A30AlbProCod ,
                           String A39AlbProPri ,
                           byte AV64HueAlb ,
                           byte AV13FirmaD )
   {
      if ( (0==A30AlbProCod) && true /* Level */ && true /* After */ && ( AV64HueAlb == 1 ) && ( AV13FirmaD == 0 ) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_char4[0] = AV7ContCod ;
         GXv_int8[0] = (int)(A30AlbProCod) ;
         GXv_char3[0] = A39AlbProPri ;
         new app.pnumalb(remoteHandle, context).execute( GXv_char18, GXv_char4, GXv_int8, GXv_char3) ;
         A396EmprCod = GXv_char18[0] ;
         AV7ContCod = GXv_char4[0] ;
         A30AlbProCod = GXv_int8[0] ;
         A39AlbProPri = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV7ContCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A39AlbProPri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_48_1T03( String Gx_mode ,
                           String A396EmprCod ,
                           String AV7ContCod ,
                           long A30AlbProCod ,
                           byte AV65FlagAlb ,
                           byte AV66FlagCont ,
                           String A39AlbProPri )
   {
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_char4[0] = AV7ContCod ;
         GXv_int15[0] = A30AlbProCod ;
         GXv_int16[0] = AV65FlagAlb ;
         GXv_int6[0] = AV66FlagCont ;
         new app.putil10(remoteHandle, context).execute( GXv_char18, GXv_char4, GXv_int15, GXv_int16, GXv_int6) ;
         A396EmprCod = GXv_char18[0] ;
         AV7ContCod = GXv_char4[0] ;
         A30AlbProCod = GXv_int15[0] ;
         AV65FlagAlb = GXv_int16[0] ;
         AV66FlagCont = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", AV7ContCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV65FlagAlb", GXutil.str( AV65FlagAlb, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV66FlagCont", GXutil.str( AV66FlagCont, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV7ContCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV65FlagAlb, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV66FlagCont, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_49_1T03( String A396EmprCod ,
                           String AV7ContCod ,
                           long A30AlbProCod ,
                           String A39AlbProPri )
   {
      if ( (0==A30AlbProCod) && true /* Level */ && true /* After */ )
      {
         GXv_int8[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV7ContCod, GXv_int8) ;
         A30AlbProCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_50_1T03( String A396EmprCod ,
                           int A3869AlbCliDes ,
                           byte AV67FlagCli )
   {
      if ( true /* Level */ && true /* After */ && ! (0==A3869AlbCliDes) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_int8[0] = A3869AlbCliDes ;
         GXv_int16[0] = AV67FlagCli ;
         new app.pexides(remoteHandle, context).execute( GXv_char18, GXv_int8, GXv_int16) ;
         A396EmprCod = GXv_char18[0] ;
         A3869AlbCliDes = GXv_int8[0] ;
         AV67FlagCli = GXv_int16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV67FlagCli", GXutil.str( AV67FlagCli, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV67FlagCli, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_51_1T03( String Gx_mode ,
                           String A396EmprCod ,
                           java.util.Date A10019AlbHhfm ,
                           String A10017AlbFmd ,
                           String A10018ALbFmdc ,
                           long A30AlbProCod ,
                           String A39AlbProPri ,
                           byte AV13FirmaD )
   {
      if ( true /* Level */ && true /* After */ && ( AV13FirmaD == 1 ) && isIns( )  )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_dtime17[0] = A10019AlbHhfm ;
         GXv_char4[0] = A10017AlbFmd ;
         GXv_char3[0] = A10018ALbFmdc ;
         GXv_int15[0] = A30AlbProCod ;
         GXv_char2[0] = A39AlbProPri ;
         GXv_int16[0] = (byte)(1) ;
         new app.pborrec(remoteHandle, context).execute( GXv_char18, GXv_dtime17, GXv_char4, GXv_char3, GXv_int15, GXv_char2, GXv_int16) ;
         A396EmprCod = GXv_char18[0] ;
         A10019AlbHhfm = GXv_dtime17[0] ;
         A10017AlbFmd = GXv_char4[0] ;
         A10018ALbFmdc = GXv_char3[0] ;
         A30AlbProCod = GXv_int15[0] ;
         A39AlbProPri = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
         httpContext.ajax_rsp_assign_attri("", false, "A10018ALbFmdc", A10018ALbFmdc);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A10017AlbFmd)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10018ALbFmdc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A39AlbProPri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_52_1T03( String A396EmprCod ,
                           String A39AlbProPri ,
                           java.util.Date AV14Fch ,
                           long AV15AlbLast ,
                           java.util.Date A34AlbProfch ,
                           String AV11Msg_f ,
                           byte AV16Ctrlf )
   {
      if ( true /* Level */ && true /* After */ && ( AV16Ctrlf == 1 ) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_char4[0] = A39AlbProPri ;
         GXv_int16[0] = (byte)(1) ;
         GXv_date14[0] = AV14Fch ;
         GXv_int8[0] = (int)(AV15AlbLast) ;
         GXv_date13[0] = A34AlbProfch ;
         GXv_char3[0] = AV11Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char18, GXv_char4, GXv_int16, GXv_date14, GXv_int8, GXv_date13, GXv_char3) ;
         A396EmprCod = GXv_char18[0] ;
         A39AlbProPri = GXv_char4[0] ;
         AV14Fch = GXv_date14[0] ;
         AV15AlbLast = GXv_int8[0] ;
         A34AlbProfch = GXv_date13[0] ;
         AV11Msg_f = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV14Fch", localUtil.format(AV14Fch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV15AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15AlbLast), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV11Msg_f", AV11Msg_f);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A39AlbProPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV14Fch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV15AlbLast, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A34AlbProfch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV11Msg_f)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_68_1T03( String Gx_mode ,
                           String A396EmprCod ,
                           String A39AlbProPri ,
                           byte AV71hashAnt )
   {
      if ( true /* After */ && isIns( )  && ( AV71hashAnt == 1 ) )
      {
         GXv_char18[0] = AV70msg_control ;
         new app.pctrlhashanterior(remoteHandle, context).execute( A396EmprCod, A39AlbProPri, GXv_char18) ;
         AV70msg_control = GXv_char18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70msg_control", AV70msg_control);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( AV70msg_control)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_70_1T03( String Gx_mode ,
                           String A396EmprCod ,
                           int A1243GuiRemCli ,
                           byte AV69Endutex )
   {
      if ( ( AV69Endutex == 1 ) && isIns( )  && true /* After */ )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_int8[0] = A1243GuiRemCli ;
         GXv_char4[0] = AV62Clitipo ;
         new app.pclitipo(remoteHandle, context).execute( GXv_char18, GXv_int8, GXv_char4) ;
         A396EmprCod = GXv_char18[0] ;
         A1243GuiRemCli = GXv_int8[0] ;
         AV62Clitipo = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62Clitipo", AV62Clitipo);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV62Clitipo))+"\"") ;
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
      cmbAlbEnvFtp.setName( "ALBENVFTP" );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      }
      cmbAlbProAT.setName( "ALBPROAT" );
      cmbAlbProAT.setWebtags( "" );
      cmbAlbProAT.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
      cmbAlbProAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbAlbProAT.addItem("", httpContext.getMessage( "s/d", ""), (short)(0));
      if ( cmbAlbProAT.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A10765AlbProAT)==0) )
         {
            A10765AlbProAT = " " ;
            httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
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

   public void valid_Albpropri( )
   {
      if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
      {
         AV7ContCod = "555555" ;
      }
      else
      {
         if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
         {
            AV7ContCod = "666666" ;
         }
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_char4[0] = AV7ContCod ;
         GXv_int15[0] = A30AlbProCod ;
         GXv_int16[0] = AV65FlagAlb ;
         GXv_int6[0] = AV66FlagCont ;
         new app.putil10(remoteHandle, context).execute( GXv_char18, GXv_char4, GXv_int15, GXv_int16, GXv_int6) ;
         albaran_impl.this.A396EmprCod = GXv_char18[0] ;
         A396EmprCod = this.A396EmprCod ;
         albaran_impl.this.AV7ContCod = GXv_char4[0] ;
         AV7ContCod = this.AV7ContCod ;
         albaran_impl.this.A30AlbProCod = GXv_int15[0] ;
         A30AlbProCod = this.A30AlbProCod ;
         albaran_impl.this.AV65FlagAlb = GXv_int16[0] ;
         AV65FlagAlb = this.AV65FlagAlb ;
         albaran_impl.this.AV66FlagCont = GXv_int6[0] ;
         AV66FlagCont = this.AV66FlagCont ;
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV65FlagAlb == 0 ) && ( AV18F_carvema == 0 ) && ( AV13FirmaD == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION, Va a dar de ALTA un Albaran MANUALMENTE", ""), 0, "");
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV66FlagCont == 1 ) && ( AV18F_carvema == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Intentamos dar de ALTA un ALBARAN > CONTADOR manualmente", ""), 1, "ALBPROPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPri_Internalname ;
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV13FirmaD == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Intentamos dar de ALTA un ALBARAN > CONTADOR manualmente", ""), 1, "ALBPROPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPri_Internalname ;
      }
      if ( true /* After */ && isIns( )  && ( AV71hashAnt == 1 ) )
      {
         GXv_char18[0] = AV70msg_control ;
         new app.pctrlhashanterior(remoteHandle, context).execute( A396EmprCod, A39AlbProPri, GXv_char18) ;
         albaran_impl.this.AV70msg_control = GXv_char18[0] ;
         AV70msg_control = this.AV70msg_control ;
      }
      if ( true /* After */ && ( GXutil.strcmp(AV70msg_control, " ") != 0 ) && ( AV13FirmaD == 1 ) && isIns( )  && ( AV71hashAnt == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV70msg_control, 1, "ALBPROPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPri_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "AV7ContCod", GXutil.rtrim( AV7ContCod));
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV65FlagAlb", GXutil.ltrim( localUtil.ntoc( AV65FlagAlb, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV66FlagCont", GXutil.ltrim( localUtil.ntoc( AV66FlagCont, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV70msg_control", AV70msg_control);
   }

   public void valid_Albprofch( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A3865AlbHorSal)==0) && true /* After */ )
      {
         GXt_char1 = A3865AlbHorSal ;
         GXv_char18[0] = A396EmprCod ;
         GXv_char4[0] = GXt_char1 ;
         new app.phragr3(remoteHandle, context).execute( GXv_char18, GXv_char4) ;
         albaran_impl.this.A396EmprCod = GXv_char18[0] ;
         A396EmprCod = this.A396EmprCod ;
         albaran_impl.this.GXt_char1 = GXv_char4[0] ;
         A3865AlbHorSal = GXt_char1 ;
      }
      if ( true /* Level */ && true /* After */ && ( AV16Ctrlf == 1 ) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_char4[0] = A39AlbProPri ;
         GXv_int16[0] = (byte)(1) ;
         GXv_date14[0] = AV14Fch ;
         GXv_int8[0] = (int)(AV15AlbLast) ;
         GXv_date13[0] = A34AlbProfch ;
         GXv_char3[0] = AV11Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char18, GXv_char4, GXv_int16, GXv_date14, GXv_int8, GXv_date13, GXv_char3) ;
         albaran_impl.this.A396EmprCod = GXv_char18[0] ;
         A396EmprCod = this.A396EmprCod ;
         albaran_impl.this.A39AlbProPri = GXv_char4[0] ;
         A39AlbProPri = this.A39AlbProPri ;
         albaran_impl.this.AV14Fch = GXv_date14[0] ;
         AV14Fch = this.AV14Fch ;
         albaran_impl.this.AV15AlbLast = GXv_int8[0] ;
         AV15AlbLast = this.AV15AlbLast ;
         albaran_impl.this.A34AlbProfch = GXv_date13[0] ;
         A34AlbProfch = this.A34AlbProfch ;
         albaran_impl.this.AV11Msg_f = GXv_char3[0] ;
         AV11Msg_f = this.AV11Msg_f ;
      }
      if ( ( ( AV68F_albanu == 1 ) || ( AV13FirmaD == 1 ) ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia ANULADA", ""), 1, "ALBPROFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProfch_Internalname ;
      }
      if ( ( GXutil.strcmp(AV11Msg_f, " ") != 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV11Msg_f, 1, "ALBPROFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProfch_Internalname ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A34AlbProfch)) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Campo Incorrecto", ""), 1, "ALBPROFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProfch_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", GXutil.rtrim( A3865AlbHorSal));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", GXutil.rtrim( A39AlbProPri));
      httpContext.ajax_rsp_assign_attri("", false, "AV14Fch", localUtil.format(AV14Fch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV15AlbLast", GXutil.ltrim( localUtil.ntoc( AV15AlbLast, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV11Msg_f", AV11Msg_f);
   }

   public void valid_Albdivcod( )
   {
      n3108AlbDivCod = false ;
      n3109AlbDivAbr = false ;
      /* Using cursor T01T022 */
      pr_default.execute(20, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDivCod_Internalname ;
         }
      }
      A3109AlbDivAbr = T01T022_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01T022_n3109AlbDivAbr[0] ;
      pr_default.close(20);
      if ( (0==A3108AlbDivCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Divisa es requerido.", ""), 1, "ALBDIVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbDivCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", GXutil.rtrim( A3109AlbDivAbr));
   }

   public void valid_Guiremcli( )
   {
      if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
      {
         A3869AlbCliDes = A1243GuiRemCli ;
      }
      if ( true /* Level */ && true /* After */ && ! (0==A3869AlbCliDes) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_int8[0] = A3869AlbCliDes ;
         GXv_int16[0] = AV67FlagCli ;
         new app.pexides(remoteHandle, context).execute( GXv_char18, GXv_int8, GXv_int16) ;
         albaran_impl.this.A396EmprCod = GXv_char18[0] ;
         A396EmprCod = this.A396EmprCod ;
         albaran_impl.this.A3869AlbCliDes = GXv_int8[0] ;
         A3869AlbCliDes = this.A3869AlbCliDes ;
         albaran_impl.this.AV67FlagCli = GXv_int16[0] ;
         AV67FlagCli = this.AV67FlagCli ;
      }
      if ( ( AV67FlagCli == 0 ) && true /* Level */ && true /* After */ && ! (0==A3869AlbCliDes) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENCION. Cliente Destino INEXISTENTE", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
      }
      if ( true /* After */ && ( AV63Tintex == 1 ) )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_int8[0] = A1243GuiRemCli ;
         GXv_int12[0] = AV61CliUltMq ;
         new app.pcliumq(remoteHandle, context).execute( GXv_char18, GXv_int8, GXv_int12) ;
         albaran_impl.this.A396EmprCod = GXv_char18[0] ;
         A396EmprCod = this.A396EmprCod ;
         albaran_impl.this.A1243GuiRemCli = GXv_int8[0] ;
         A1243GuiRemCli = this.A1243GuiRemCli ;
         albaran_impl.this.AV61CliUltMq = GXv_int12[0] ;
         AV61CliUltMq = this.AV61CliUltMq ;
      }
      if ( ( A1243GuiRemCli == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente con valor 0 ¡¡¡", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
      }
      if ( ( AV69Endutex == 1 ) && isIns( )  && true /* After */ )
      {
         GXv_char18[0] = A396EmprCod ;
         GXv_int8[0] = A1243GuiRemCli ;
         GXv_char4[0] = AV62Clitipo ;
         new app.pclitipo(remoteHandle, context).execute( GXv_char18, GXv_int8, GXv_char4) ;
         albaran_impl.this.A396EmprCod = GXv_char18[0] ;
         A396EmprCod = this.A396EmprCod ;
         albaran_impl.this.A1243GuiRemCli = GXv_int8[0] ;
         A1243GuiRemCli = this.A1243GuiRemCli ;
         albaran_impl.this.AV62Clitipo = GXv_char4[0] ;
         AV62Clitipo = this.AV62Clitipo ;
      }
      if ( ( AV69Endutex == 1 ) && isIns( )  && ( GXutil.strcmp(AV62Clitipo, httpContext.getMessage( "I", "")) == 0 ) && ( ( GXutil.strcmp(AV60AlbSec, httpContext.getMessage( "D", "")) == 0 ) || ( GXutil.strcmp(AV60AlbSec, httpContext.getMessage( "B", "")) == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente INTERNO", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
      }
      if ( ( AV69Endutex == 1 ) && isIns( )  && ( GXutil.strcmp(AV62Clitipo, httpContext.getMessage( "E", "")) == 0 ) && ( ( GXutil.strcmp(AV60AlbSec, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV60AlbSec, httpContext.getMessage( "C", "")) == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente EXTERNO", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV67FlagCli", GXutil.ltrim( localUtil.ntoc( AV67FlagCli, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV61CliUltMq", GXutil.ltrim( localUtil.ntoc( AV61CliUltMq, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV62Clitipo", GXutil.rtrim( AV62Clitipo));
   }

   public void valid_Trncod( )
   {
      n3643TrnNif = false ;
      n841TrnNom = false ;
      /* Using cursor T01T026 */
      pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A3643TrnNif = T01T026_A3643TrnNif[0] ;
      n3643TrnNif = T01T026_n3643TrnNif[0] ;
      A841TrnNom = T01T026_A841TrnNom[0] ;
      n841TrnNom = T01T026_n841TrnNom[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", GXutil.rtrim( A3643TrnNif));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV51AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV122VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV121AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV121AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'AV122VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true},{av:'AV51AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV101AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV124Pgmname',fld:'vPGMNAME',pic:''},{av:'A5141AlbIvaCod',fld:'ALBIVACOD',pic:'@!'},{av:'A10836AlbTrnDm',fld:'ALBTRNDM',pic:''},{av:'A10837AlbTrnNc',fld:'ALBTRNNC',pic:''},{av:'A10835AlbTrnNm',fld:'ALBTRNNM',pic:''},{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'cmbAlbProAT'},{av:'A10765AlbProAT',fld:'ALBPROAT',pic:''},{av:'A10020AlbGrossT',fld:'ALBGROSST',pic:'ZZZZZZZZZ9.99'},{av:'A7988AlbObsCb',fld:'ALBOBSCB',pic:''},{av:'A7987AlbColCa',fld:'ALBCOLCA',pic:''},{av:'A7162AlbDesp',fld:'ALBDESP',pic:'ZZZZZ9'},{av:'A7986AlbCambio',fld:'ALBCAMBIO',pic:'Z9.9999'},{av:'A7985AlbTipDoc',fld:'ALBTIPDOC',pic:'ZZZZZZZ9'},{av:'A7984AlbMotTr',fld:'ALBMOTTR',pic:''},{av:'A5803AlbTipCal',fld:'ALBTIPCAL',pic:'9'},{av:'A7102AlbNumT',fld:'ALBNUMT',pic:'ZZZZZZZZZ9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A7100AlbMarCo',fld:'ALBMARCO',pic:''},{av:'A7099AlbOComp',fld:'ALBOCOMP',pic:''},{av:'A7098AlbUsu',fld:'ALBUSU',pic:''},{av:'A5140AlbMarca',fld:'ALBMARCA',pic:''},{av:'A3867AlbLocDes',fld:'ALBLOCDES',pic:'9'},{av:'A3866AlbLocCar',fld:'ALBLOCCAR',pic:'9'},{av:'A3093AlbDivTCod',fld:'ALBDIVTCOD',pic:''},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'A1258GuiRemDom',fld:'GUIREMDOM',pic:'9'},{av:'A914AlbPObsCon',fld:'ALBPOBSCON',pic:'Z9'},{av:'A14069AlbPdATCUD',fld:'ALBPDATCUD',pic:''},{av:'A14073AlbPdSerAT',fld:'ALBPDSERAT',pic:''},{av:'A14074AlbPdTipAT',fld:'ALBPDTIPAT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121T02',iparms:[{av:'AV121AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV122VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROPRI","{handler:'valid_Albpropri',iparms:[{av:'AV71hashAnt',fld:'vHASHANT',pic:'9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'AV7ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV66FlagCont',fld:'vFLAGCONT',pic:'9'},{av:'AV65FlagAlb',fld:'vFLAGALB',pic:'9'},{av:'AV70msg_control',fld:'vMSG_CONTROL',pic:''}]");
      setEventMetadata("VALID_ALBPROPRI",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV7ContCod',fld:'vCONTCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV65FlagAlb',fld:'vFLAGALB',pic:'9'},{av:'AV66FlagCont',fld:'vFLAGCONT',pic:'9'},{av:'AV70msg_control',fld:'vMSG_CONTROL',pic:''}]}");
      setEventMetadata("VALID_ALBPROEST","{handler:'valid_Albproest',iparms:[]");
      setEventMetadata("VALID_ALBPROEST",",oparms:[]}");
      setEventMetadata("VALID_ALBPROFCH","{handler:'valid_Albprofch',iparms:[{av:'AV16Ctrlf',fld:'vCTRLF',pic:'9'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A3865AlbHorSal',fld:'ALBHORSAL',pic:''},{av:'AV11Msg_f',fld:'vMSG_F',pic:''},{av:'AV15AlbLast',fld:'vALBLAST',pic:'ZZZZZZZZZ9'},{av:'AV14Fch',fld:'vFCH',pic:''}]");
      setEventMetadata("VALID_ALBPROFCH",",oparms:[{av:'A3865AlbHorSal',fld:'ALBHORSAL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'AV14Fch',fld:'vFCH',pic:''},{av:'AV15AlbLast',fld:'vALBLAST',pic:'ZZZZZZZZZ9'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV11Msg_f',fld:'vMSG_F',pic:''}]}");
      setEventMetadata("VALID_ALBDIVCOD","{handler:'valid_Albdivcod',iparms:[{av:'A3108AlbDivCod',fld:'ALBDIVCOD',pic:'Z9'},{av:'A3109AlbDivAbr',fld:'ALBDIVABR',pic:''}]");
      setEventMetadata("VALID_ALBDIVCOD",",oparms:[{av:'A3109AlbDivAbr',fld:'ALBDIVABR',pic:''}]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[{av:'AV63Tintex',fld:'vTINTEX',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'},{av:'AV69Endutex',fld:'vENDUTEX',pic:'9'},{av:'AV62Clitipo',fld:'vCLITIPO',pic:'@!'},{av:'AV60AlbSec',fld:'vALBSEC',pic:'@!'},{av:'AV67FlagCli',fld:'vFLAGCLI',pic:'9'},{av:'AV61CliUltMq',fld:'vCLIULTMQ',pic:'ZZZ9'}]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'},{av:'AV67FlagCli',fld:'vFLAGCLI',pic:'9'},{av:'AV61CliUltMq',fld:'vCLIULTMQ',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'AV62Clitipo',fld:'vCLITIPO',pic:'@!'}]}");
      setEventMetadata("VALID_ALBDOMENV","{handler:'valid_Albdomenv',iparms:[]");
      setEventMetadata("VALID_ALBDOMENV",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A3643TrnNif',fld:'TRNNIF',pic:'@!'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A3643TrnNif',fld:'TRNNIF',pic:'@!'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALID_ALBLIC","{handler:'valid_Alblic',iparms:[]");
      setEventMetadata("VALID_ALBLIC",",oparms:[]}");
      setEventMetadata("VALID_ALBHHFM","{handler:'valid_Albhhfm',iparms:[]");
      setEventMetadata("VALID_ALBHHFM",",oparms:[]}");
      setEventMetadata("VALID_ALBFMD","{handler:'valid_Albfmd',iparms:[]");
      setEventMetadata("VALID_ALBFMD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOALBDIVCOD","{handler:'validv_Comboalbdivcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOALBDIVCOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOGUIREMCLI","{handler:'validv_Comboguiremcli',iparms:[]");
      setEventMetadata("VALIDV_COMBOGUIREMCLI",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOALBDOMENV","{handler:'validv_Comboalbdomenv',iparms:[]");
      setEventMetadata("VALIDV_COMBOALBDOMENV",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOTRNCOD","{handler:'validv_Combotrncod',iparms:[]");
      setEventMetadata("VALIDV_COMBOTRNCOD",",oparms:[]}");
      setEventMetadata("VALIDV_EMPRCOD","{handler:'validv_Emprcod',iparms:[]");
      setEventMetadata("VALIDV_EMPRCOD",",oparms:[]}");
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
      pr_default.close(21);
      pr_default.close(24);
      pr_default.close(22);
      pr_default.close(20);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV17EmprCod = "" ;
      Z396EmprCod = "" ;
      Z39AlbProPri = "" ;
      Z3865AlbHorSal = "" ;
      Z2242AlbSec = "" ;
      Z5141AlbIvaCod = "" ;
      Z10836AlbTrnDm = "" ;
      Z10837AlbTrnNc = "" ;
      Z10835AlbTrnNm = "" ;
      Z10765AlbProAT = "" ;
      Z10020AlbGrossT = DecimalUtil.ZERO ;
      Z10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      Z10018ALbFmdc = "" ;
      Z10017AlbFmd = "" ;
      Z7988AlbObsCb = "" ;
      Z7987AlbColCa = "" ;
      Z7986AlbCambio = DecimalUtil.ZERO ;
      Z7984AlbMotTr = "" ;
      Z4023AlbFecSal = GXutil.nullDate() ;
      Z7101AlbLic = "" ;
      Z7100AlbMarCo = "" ;
      Z7099AlbOComp = "" ;
      Z7098AlbUsu = "" ;
      Z5140AlbMarca = "" ;
      Z3868AlbMat = "" ;
      Z3093AlbDivTCod = "" ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z14069AlbPdATCUD = "" ;
      Z14073AlbPdSerAT = "" ;
      Z14074AlbPdTipAT = "" ;
      Z1253EmprGuiRem = "" ;
      N1253EmprGuiRem = "" ;
      N2242AlbSec = "" ;
      Combo_trncod_Selectedvalue_get = "" ;
      Combo_albdomenv_Selectedvalue_get = "" ;
      Combo_guiremcli_Selectedvalue_get = "" ;
      Combo_albdivcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV7ContCod = "" ;
      A39AlbProPri = "" ;
      Gx_mode = "" ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A10017AlbFmd = "" ;
      A10018ALbFmdc = "" ;
      AV14Fch = GXutil.nullDate() ;
      A34AlbProfch = GXutil.nullDate() ;
      AV11Msg_f = "" ;
      A1253EmprGuiRem = "" ;
      AV17EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A10765AlbProAT = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      lblTextblockalbdivcod_Jsonclick = "" ;
      ucCombo_albdivcod = new com.genexus.webpanels.GXUserControl();
      AV113DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV103AlbDivCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A7098AlbUsu = "" ;
      lblTextblockguiremcli_Jsonclick = "" ;
      ucCombo_guiremcli = new com.genexus.webpanels.GXUserControl();
      AV114GuiRemCli_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockalbdomenv_Jsonclick = "" ;
      ucCombo_albdomenv = new com.genexus.webpanels.GXUserControl();
      AV104AlbDomEnv_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocktrncod_Jsonclick = "" ;
      ucCombo_trncod = new com.genexus.webpanels.GXUserControl();
      AV117TrnCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A3868AlbMat = "" ;
      A7101AlbLic = "" ;
      A10020AlbGrossT = DecimalUtil.ZERO ;
      A14069AlbPdATCUD = "" ;
      sStyleString = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV124Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A2242AlbSec = "" ;
      A5141AlbIvaCod = "" ;
      A10836AlbTrnDm = "" ;
      A10837AlbTrnNc = "" ;
      A10835AlbTrnNm = "" ;
      A7988AlbObsCb = "" ;
      A7987AlbColCa = "" ;
      A7986AlbCambio = DecimalUtil.ZERO ;
      A7984AlbMotTr = "" ;
      A7100AlbMarCo = "" ;
      A7099AlbOComp = "" ;
      A5140AlbMarca = "" ;
      A3093AlbDivTCod = "" ;
      A14073AlbPdSerAT = "" ;
      A14074AlbPdTipAT = "" ;
      AV58Insert_EmprGuiRem = "" ;
      AV101AlbProPri = "" ;
      AV60AlbSec = "" ;
      AV10UsurCod = "" ;
      AV70msg_control = "" ;
      AV62Clitipo = "" ;
      A3145GuiRemDivT = "" ;
      A1244GuiRemCln = "" ;
      A407EmprNom = "" ;
      A3643TrnNif = "" ;
      A841TrnNom = "" ;
      A3109AlbDivAbr = "" ;
      Combo_albdivcod_Objectcall = "" ;
      Combo_albdivcod_Class = "" ;
      Combo_albdivcod_Icontype = "" ;
      Combo_albdivcod_Icon = "" ;
      Combo_albdivcod_Tooltip = "" ;
      Combo_albdivcod_Selectedvalue_set = "" ;
      Combo_albdivcod_Selectedtext_set = "" ;
      Combo_albdivcod_Selectedtext_get = "" ;
      Combo_albdivcod_Gamoauthtoken = "" ;
      Combo_albdivcod_Ddointernalname = "" ;
      Combo_albdivcod_Titlecontrolalign = "" ;
      Combo_albdivcod_Dropdownoptionstype = "" ;
      Combo_albdivcod_Titlecontrolidtoreplace = "" ;
      Combo_albdivcod_Datalisttype = "" ;
      Combo_albdivcod_Datalistfixedvalues = "" ;
      Combo_albdivcod_Datalistproc = "" ;
      Combo_albdivcod_Datalistprocparametersprefix = "" ;
      Combo_albdivcod_Remoteservicesparameters = "" ;
      Combo_albdivcod_Htmltemplate = "" ;
      Combo_albdivcod_Multiplevaluestype = "" ;
      Combo_albdivcod_Loadingdata = "" ;
      Combo_albdivcod_Noresultsfound = "" ;
      Combo_albdivcod_Emptyitemtext = "" ;
      Combo_albdivcod_Onlyselectedvalues = "" ;
      Combo_albdivcod_Selectalltext = "" ;
      Combo_albdivcod_Multiplevaluesseparator = "" ;
      Combo_albdivcod_Addnewoptiontext = "" ;
      Combo_guiremcli_Objectcall = "" ;
      Combo_guiremcli_Class = "" ;
      Combo_guiremcli_Icontype = "" ;
      Combo_guiremcli_Icon = "" ;
      Combo_guiremcli_Tooltip = "" ;
      Combo_guiremcli_Selectedvalue_set = "" ;
      Combo_guiremcli_Selectedtext_set = "" ;
      Combo_guiremcli_Selectedtext_get = "" ;
      Combo_guiremcli_Gamoauthtoken = "" ;
      Combo_guiremcli_Ddointernalname = "" ;
      Combo_guiremcli_Titlecontrolalign = "" ;
      Combo_guiremcli_Dropdownoptionstype = "" ;
      Combo_guiremcli_Titlecontrolidtoreplace = "" ;
      Combo_guiremcli_Datalisttype = "" ;
      Combo_guiremcli_Datalistfixedvalues = "" ;
      Combo_guiremcli_Datalistproc = "" ;
      Combo_guiremcli_Datalistprocparametersprefix = "" ;
      Combo_guiremcli_Remoteservicesparameters = "" ;
      Combo_guiremcli_Htmltemplate = "" ;
      Combo_guiremcli_Multiplevaluestype = "" ;
      Combo_guiremcli_Loadingdata = "" ;
      Combo_guiremcli_Noresultsfound = "" ;
      Combo_guiremcli_Onlyselectedvalues = "" ;
      Combo_guiremcli_Selectalltext = "" ;
      Combo_guiremcli_Multiplevaluesseparator = "" ;
      Combo_guiremcli_Addnewoptiontext = "" ;
      Combo_albdomenv_Objectcall = "" ;
      Combo_albdomenv_Class = "" ;
      Combo_albdomenv_Icontype = "" ;
      Combo_albdomenv_Icon = "" ;
      Combo_albdomenv_Tooltip = "" ;
      Combo_albdomenv_Selectedvalue_set = "" ;
      Combo_albdomenv_Selectedtext_set = "" ;
      Combo_albdomenv_Selectedtext_get = "" ;
      Combo_albdomenv_Gamoauthtoken = "" ;
      Combo_albdomenv_Ddointernalname = "" ;
      Combo_albdomenv_Titlecontrolalign = "" ;
      Combo_albdomenv_Dropdownoptionstype = "" ;
      Combo_albdomenv_Titlecontrolidtoreplace = "" ;
      Combo_albdomenv_Datalisttype = "" ;
      Combo_albdomenv_Datalistfixedvalues = "" ;
      Combo_albdomenv_Remoteservicesparameters = "" ;
      Combo_albdomenv_Htmltemplate = "" ;
      Combo_albdomenv_Multiplevaluestype = "" ;
      Combo_albdomenv_Loadingdata = "" ;
      Combo_albdomenv_Noresultsfound = "" ;
      Combo_albdomenv_Onlyselectedvalues = "" ;
      Combo_albdomenv_Selectalltext = "" ;
      Combo_albdomenv_Multiplevaluesseparator = "" ;
      Combo_albdomenv_Addnewoptiontext = "" ;
      Combo_trncod_Objectcall = "" ;
      Combo_trncod_Class = "" ;
      Combo_trncod_Icontype = "" ;
      Combo_trncod_Icon = "" ;
      Combo_trncod_Tooltip = "" ;
      Combo_trncod_Selectedvalue_set = "" ;
      Combo_trncod_Selectedtext_set = "" ;
      Combo_trncod_Selectedtext_get = "" ;
      Combo_trncod_Gamoauthtoken = "" ;
      Combo_trncod_Ddointernalname = "" ;
      Combo_trncod_Titlecontrolalign = "" ;
      Combo_trncod_Dropdownoptionstype = "" ;
      Combo_trncod_Titlecontrolidtoreplace = "" ;
      Combo_trncod_Datalisttype = "" ;
      Combo_trncod_Datalistfixedvalues = "" ;
      Combo_trncod_Datalistproc = "" ;
      Combo_trncod_Datalistprocparametersprefix = "" ;
      Combo_trncod_Remoteservicesparameters = "" ;
      Combo_trncod_Htmltemplate = "" ;
      Combo_trncod_Multiplevaluestype = "" ;
      Combo_trncod_Loadingdata = "" ;
      Combo_trncod_Noresultsfound = "" ;
      Combo_trncod_Onlyselectedvalues = "" ;
      Combo_trncod_Selectalltext = "" ;
      Combo_trncod_Multiplevaluesseparator = "" ;
      Combo_trncod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode3 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV72Lit0 = "" ;
      AV95Lit44 = "" ;
      AV73Litfe = "" ;
      AV8Station = "" ;
      AV9EmprNom = "" ;
      AV49Porgrm2 = DecimalUtil.ZERO ;
      AV93Msg_err1 = "" ;
      AV94Correcto = "" ;
      AV52WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV53TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV54WebSession = httpContext.getWebSession();
      AV59TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV105Combo_DataJson = "" ;
      AV110ComboSelectedValue = "" ;
      AV109ComboSelectedText = "" ;
      Z407EmprNom = "" ;
      Z3109AlbDivAbr = "" ;
      Z3145GuiRemDivT = "" ;
      Z1244GuiRemCln = "" ;
      T01T05_A407EmprNom = new String[] {""} ;
      T01T05_n407EmprNom = new boolean[] {false} ;
      T01T06_A3643TrnNif = new String[] {""} ;
      T01T06_n3643TrnNif = new boolean[] {false} ;
      T01T06_A841TrnNom = new String[] {""} ;
      T01T06_n841TrnNom = new boolean[] {false} ;
      T01T08_A3109AlbDivAbr = new String[] {""} ;
      T01T08_n3109AlbDivAbr = new boolean[] {false} ;
      T01T04_A3145GuiRemDivT = new String[] {""} ;
      T01T04_n3145GuiRemDivT = new boolean[] {false} ;
      T01T04_A1244GuiRemCln = new String[] {""} ;
      T01T04_A3110GuiRemDiv = new byte[1] ;
      T01T04_n3110GuiRemDiv = new boolean[] {false} ;
      T01T07_A3643TrnNif = new String[] {""} ;
      T01T07_n3643TrnNif = new boolean[] {false} ;
      T01T07_A841TrnNom = new String[] {""} ;
      T01T07_n841TrnNom = new boolean[] {false} ;
      T01T09_A1260BusDomEnv = new byte[1] ;
      T01T09_n1260BusDomEnv = new boolean[] {false} ;
      T01T010_A252CliCod = new int[1] ;
      T01T010_A266CliEnvLin = new byte[1] ;
      T01T010_A30AlbProCod = new long[1] ;
      T01T010_A1259AlbDomEnv = new byte[1] ;
      T01T010_n1259AlbDomEnv = new boolean[] {false} ;
      T01T010_A39AlbProPri = new String[] {""} ;
      T01T010_A3865AlbHorSal = new String[] {""} ;
      T01T010_A2242AlbSec = new String[] {""} ;
      T01T010_A407EmprNom = new String[] {""} ;
      T01T010_n407EmprNom = new boolean[] {false} ;
      T01T010_A5141AlbIvaCod = new String[] {""} ;
      T01T010_A10836AlbTrnDm = new String[] {""} ;
      T01T010_A10837AlbTrnNc = new String[] {""} ;
      T01T010_A10835AlbTrnNm = new String[] {""} ;
      T01T010_A5805AlbEnvFtp = new byte[1] ;
      T01T010_A10765AlbProAT = new String[] {""} ;
      T01T010_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T010_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      T01T010_A10018ALbFmdc = new String[] {""} ;
      T01T010_A10017AlbFmd = new String[] {""} ;
      T01T010_n10017AlbFmd = new boolean[] {false} ;
      T01T010_A7988AlbObsCb = new String[] {""} ;
      T01T010_A7987AlbColCa = new String[] {""} ;
      T01T010_A7162AlbDesp = new int[1] ;
      T01T010_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T010_A7985AlbTipDoc = new int[1] ;
      T01T010_A7984AlbMotTr = new String[] {""} ;
      T01T010_A5803AlbTipCal = new byte[1] ;
      T01T010_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01T010_A7102AlbNumT = new long[1] ;
      T01T010_A7101AlbLic = new String[] {""} ;
      T01T010_A7100AlbMarCo = new String[] {""} ;
      T01T010_A7099AlbOComp = new String[] {""} ;
      T01T010_A7098AlbUsu = new String[] {""} ;
      T01T010_A5140AlbMarca = new String[] {""} ;
      T01T010_A3869AlbCliDes = new int[1] ;
      T01T010_A3868AlbMat = new String[] {""} ;
      T01T010_A3867AlbLocDes = new byte[1] ;
      T01T010_A3866AlbLocCar = new byte[1] ;
      T01T010_A3093AlbDivTCod = new String[] {""} ;
      T01T010_n3093AlbDivTCod = new boolean[] {false} ;
      T01T010_A3109AlbDivAbr = new String[] {""} ;
      T01T010_n3109AlbDivAbr = new boolean[] {false} ;
      T01T010_A33AlbProEst = new byte[1] ;
      T01T010_A1258GuiRemDom = new byte[1] ;
      T01T010_n1258GuiRemDom = new boolean[] {false} ;
      T01T010_A3145GuiRemDivT = new String[] {""} ;
      T01T010_n3145GuiRemDivT = new boolean[] {false} ;
      T01T010_A1244GuiRemCln = new String[] {""} ;
      T01T010_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T010_A914AlbPObsCon = new byte[1] ;
      T01T010_A14069AlbPdATCUD = new String[] {""} ;
      T01T010_A14073AlbPdSerAT = new String[] {""} ;
      T01T010_A14074AlbPdTipAT = new String[] {""} ;
      T01T010_A1253EmprGuiRem = new String[] {""} ;
      T01T010_A1243GuiRemCli = new int[1] ;
      T01T010_A396EmprCod = new String[] {""} ;
      T01T010_A840TrnCod = new short[1] ;
      T01T010_A3108AlbDivCod = new byte[1] ;
      T01T010_n3108AlbDivCod = new boolean[] {false} ;
      T01T010_A3110GuiRemDiv = new byte[1] ;
      T01T010_n3110GuiRemDiv = new boolean[] {false} ;
      T01T010_A1260BusDomEnv = new byte[1] ;
      T01T010_n1260BusDomEnv = new boolean[] {false} ;
      T01T011_A3643TrnNif = new String[] {""} ;
      T01T011_n3643TrnNif = new boolean[] {false} ;
      T01T011_A841TrnNom = new String[] {""} ;
      T01T011_n841TrnNom = new boolean[] {false} ;
      T01T012_A3109AlbDivAbr = new String[] {""} ;
      T01T012_n3109AlbDivAbr = new boolean[] {false} ;
      T01T013_A1260BusDomEnv = new byte[1] ;
      T01T013_n1260BusDomEnv = new boolean[] {false} ;
      T01T014_A3145GuiRemDivT = new String[] {""} ;
      T01T014_n3145GuiRemDivT = new boolean[] {false} ;
      T01T014_A1244GuiRemCln = new String[] {""} ;
      T01T014_A3110GuiRemDiv = new byte[1] ;
      T01T014_n3110GuiRemDiv = new boolean[] {false} ;
      T01T015_A3643TrnNif = new String[] {""} ;
      T01T015_n3643TrnNif = new boolean[] {false} ;
      T01T015_A841TrnNom = new String[] {""} ;
      T01T015_n841TrnNom = new boolean[] {false} ;
      T01T016_A396EmprCod = new String[] {""} ;
      T01T016_A30AlbProCod = new long[1] ;
      T01T03_A30AlbProCod = new long[1] ;
      T01T03_A1259AlbDomEnv = new byte[1] ;
      T01T03_n1259AlbDomEnv = new boolean[] {false} ;
      T01T03_A39AlbProPri = new String[] {""} ;
      T01T03_A3865AlbHorSal = new String[] {""} ;
      T01T03_A2242AlbSec = new String[] {""} ;
      T01T03_A5141AlbIvaCod = new String[] {""} ;
      T01T03_A10836AlbTrnDm = new String[] {""} ;
      T01T03_A10837AlbTrnNc = new String[] {""} ;
      T01T03_A10835AlbTrnNm = new String[] {""} ;
      T01T03_A5805AlbEnvFtp = new byte[1] ;
      T01T03_A10765AlbProAT = new String[] {""} ;
      T01T03_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T03_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      T01T03_A10018ALbFmdc = new String[] {""} ;
      T01T03_A10017AlbFmd = new String[] {""} ;
      T01T03_n10017AlbFmd = new boolean[] {false} ;
      T01T03_A7988AlbObsCb = new String[] {""} ;
      T01T03_A7987AlbColCa = new String[] {""} ;
      T01T03_A7162AlbDesp = new int[1] ;
      T01T03_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T03_A7985AlbTipDoc = new int[1] ;
      T01T03_A7984AlbMotTr = new String[] {""} ;
      T01T03_A5803AlbTipCal = new byte[1] ;
      T01T03_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01T03_A7102AlbNumT = new long[1] ;
      T01T03_A7101AlbLic = new String[] {""} ;
      T01T03_A7100AlbMarCo = new String[] {""} ;
      T01T03_A7099AlbOComp = new String[] {""} ;
      T01T03_A7098AlbUsu = new String[] {""} ;
      T01T03_A5140AlbMarca = new String[] {""} ;
      T01T03_A3869AlbCliDes = new int[1] ;
      T01T03_A3868AlbMat = new String[] {""} ;
      T01T03_A3867AlbLocDes = new byte[1] ;
      T01T03_A3866AlbLocCar = new byte[1] ;
      T01T03_A3093AlbDivTCod = new String[] {""} ;
      T01T03_n3093AlbDivTCod = new boolean[] {false} ;
      T01T03_A33AlbProEst = new byte[1] ;
      T01T03_A1258GuiRemDom = new byte[1] ;
      T01T03_n1258GuiRemDom = new boolean[] {false} ;
      T01T03_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T03_A914AlbPObsCon = new byte[1] ;
      T01T03_A14069AlbPdATCUD = new String[] {""} ;
      T01T03_A14073AlbPdSerAT = new String[] {""} ;
      T01T03_A14074AlbPdTipAT = new String[] {""} ;
      T01T03_A1253EmprGuiRem = new String[] {""} ;
      T01T03_A1243GuiRemCli = new int[1] ;
      T01T03_A396EmprCod = new String[] {""} ;
      T01T03_A840TrnCod = new short[1] ;
      T01T03_A3108AlbDivCod = new byte[1] ;
      T01T03_n3108AlbDivCod = new boolean[] {false} ;
      T01T017_A396EmprCod = new String[] {""} ;
      T01T017_A30AlbProCod = new long[1] ;
      T01T018_A396EmprCod = new String[] {""} ;
      T01T018_A30AlbProCod = new long[1] ;
      T01T02_A30AlbProCod = new long[1] ;
      T01T02_A1259AlbDomEnv = new byte[1] ;
      T01T02_n1259AlbDomEnv = new boolean[] {false} ;
      T01T02_A39AlbProPri = new String[] {""} ;
      T01T02_A3865AlbHorSal = new String[] {""} ;
      T01T02_A2242AlbSec = new String[] {""} ;
      T01T02_A5141AlbIvaCod = new String[] {""} ;
      T01T02_A10836AlbTrnDm = new String[] {""} ;
      T01T02_A10837AlbTrnNc = new String[] {""} ;
      T01T02_A10835AlbTrnNm = new String[] {""} ;
      T01T02_A5805AlbEnvFtp = new byte[1] ;
      T01T02_A10765AlbProAT = new String[] {""} ;
      T01T02_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T02_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      T01T02_A10018ALbFmdc = new String[] {""} ;
      T01T02_A10017AlbFmd = new String[] {""} ;
      T01T02_n10017AlbFmd = new boolean[] {false} ;
      T01T02_A7988AlbObsCb = new String[] {""} ;
      T01T02_A7987AlbColCa = new String[] {""} ;
      T01T02_A7162AlbDesp = new int[1] ;
      T01T02_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T02_A7985AlbTipDoc = new int[1] ;
      T01T02_A7984AlbMotTr = new String[] {""} ;
      T01T02_A5803AlbTipCal = new byte[1] ;
      T01T02_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01T02_A7102AlbNumT = new long[1] ;
      T01T02_A7101AlbLic = new String[] {""} ;
      T01T02_A7100AlbMarCo = new String[] {""} ;
      T01T02_A7099AlbOComp = new String[] {""} ;
      T01T02_A7098AlbUsu = new String[] {""} ;
      T01T02_A5140AlbMarca = new String[] {""} ;
      T01T02_A3869AlbCliDes = new int[1] ;
      T01T02_A3868AlbMat = new String[] {""} ;
      T01T02_A3867AlbLocDes = new byte[1] ;
      T01T02_A3866AlbLocCar = new byte[1] ;
      T01T02_A3093AlbDivTCod = new String[] {""} ;
      T01T02_n3093AlbDivTCod = new boolean[] {false} ;
      T01T02_A33AlbProEst = new byte[1] ;
      T01T02_A1258GuiRemDom = new byte[1] ;
      T01T02_n1258GuiRemDom = new boolean[] {false} ;
      T01T02_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T02_A914AlbPObsCon = new byte[1] ;
      T01T02_A14069AlbPdATCUD = new String[] {""} ;
      T01T02_A14073AlbPdSerAT = new String[] {""} ;
      T01T02_A14074AlbPdTipAT = new String[] {""} ;
      T01T02_A1253EmprGuiRem = new String[] {""} ;
      T01T02_A1243GuiRemCli = new int[1] ;
      T01T02_A396EmprCod = new String[] {""} ;
      T01T02_A840TrnCod = new short[1] ;
      T01T02_A3108AlbDivCod = new byte[1] ;
      T01T02_n3108AlbDivCod = new boolean[] {false} ;
      T01T022_A3109AlbDivAbr = new String[] {""} ;
      T01T022_n3109AlbDivAbr = new boolean[] {false} ;
      T01T023_A3145GuiRemDivT = new String[] {""} ;
      T01T023_n3145GuiRemDivT = new boolean[] {false} ;
      T01T023_A1244GuiRemCln = new String[] {""} ;
      T01T023_A3110GuiRemDiv = new byte[1] ;
      T01T023_n3110GuiRemDiv = new boolean[] {false} ;
      T01T024_A3643TrnNif = new String[] {""} ;
      T01T024_n3643TrnNif = new boolean[] {false} ;
      T01T024_A841TrnNom = new String[] {""} ;
      T01T024_n841TrnNom = new boolean[] {false} ;
      T01T025_A1260BusDomEnv = new byte[1] ;
      T01T025_n1260BusDomEnv = new boolean[] {false} ;
      T01T026_A3643TrnNif = new String[] {""} ;
      T01T026_n3643TrnNif = new boolean[] {false} ;
      T01T026_A841TrnNom = new String[] {""} ;
      T01T026_n841TrnNom = new boolean[] {false} ;
      T01T027_A396EmprCod = new String[] {""} ;
      T01T027_A30AlbProCod = new long[1] ;
      T01T027_A12185DltLinObs = new byte[1] ;
      T01T028_A396EmprCod = new String[] {""} ;
      T01T028_A30AlbProCod = new long[1] ;
      T01T028_A12176DltHdr = new int[1] ;
      T01T028_A12177DltR = new byte[1] ;
      T01T028_A12178DltP = new String[] {""} ;
      T01T029_A396EmprCod = new String[] {""} ;
      T01T029_A30AlbProCod = new long[1] ;
      T01T029_A7540Alb_NFisca = new String[] {""} ;
      T01T030_A396EmprCod = new String[] {""} ;
      T01T030_A30AlbProCod = new long[1] ;
      T01T030_A129BarCod = new int[1] ;
      T01T030_A132BarCodReo = new byte[1] ;
      T01T030_A130BarCodPar = new String[] {""} ;
      T01T031_A396EmprCod = new String[] {""} ;
      T01T031_A30AlbProCod = new long[1] ;
      T01T031_A915AlbPObsLin = new byte[1] ;
      T01T032_A396EmprCod = new String[] {""} ;
      T01T032_A30AlbProCod = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i34AlbProfch = GXutil.nullDate() ;
      i4023AlbFecSal = GXutil.nullDate() ;
      i3093AlbDivTCod = "" ;
      i7098AlbUsu = "" ;
      i10765AlbProAT = "" ;
      GXv_dtime17 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_int15 = new long[1] ;
      GXv_int6 = new byte[1] ;
      ZV7ContCod = "" ;
      ZV70msg_control = "" ;
      GXt_char1 = "" ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_date13 = new java.util.Date[1] ;
      GXv_char3 = new String[1] ;
      ZV14Fch = GXutil.nullDate() ;
      ZV11Msg_f = "" ;
      GXv_int16 = new byte[1] ;
      GXv_int12 = new short[1] ;
      GXv_char18 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char4 = new String[1] ;
      ZV62Clitipo = "" ;
      Z3643TrnNif = "" ;
      Z841TrnNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaran__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaran__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaran__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaran__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaran__default(),
         new Object[] {
             new Object[] {
            T01T02_A30AlbProCod, T01T02_A1259AlbDomEnv, T01T02_n1259AlbDomEnv, T01T02_A39AlbProPri, T01T02_A3865AlbHorSal, T01T02_A2242AlbSec, T01T02_A5141AlbIvaCod, T01T02_A10836AlbTrnDm, T01T02_A10837AlbTrnNc, T01T02_A10835AlbTrnNm,
            T01T02_A5805AlbEnvFtp, T01T02_A10765AlbProAT, T01T02_A10020AlbGrossT, T01T02_A10019AlbHhfm, T01T02_A10018ALbFmdc, T01T02_A10017AlbFmd, T01T02_n10017AlbFmd, T01T02_A7988AlbObsCb, T01T02_A7987AlbColCa, T01T02_A7162AlbDesp,
            T01T02_A7986AlbCambio, T01T02_A7985AlbTipDoc, T01T02_A7984AlbMotTr, T01T02_A5803AlbTipCal, T01T02_A4023AlbFecSal, T01T02_A7102AlbNumT, T01T02_A7101AlbLic, T01T02_A7100AlbMarCo, T01T02_A7099AlbOComp, T01T02_A7098AlbUsu,
            T01T02_A5140AlbMarca, T01T02_A3869AlbCliDes, T01T02_A3868AlbMat, T01T02_A3867AlbLocDes, T01T02_A3866AlbLocCar, T01T02_A3093AlbDivTCod, T01T02_n3093AlbDivTCod, T01T02_A33AlbProEst, T01T02_A1258GuiRemDom, T01T02_n1258GuiRemDom,
            T01T02_A34AlbProfch, T01T02_A914AlbPObsCon, T01T02_A14069AlbPdATCUD, T01T02_A14073AlbPdSerAT, T01T02_A14074AlbPdTipAT, T01T02_A1253EmprGuiRem, T01T02_A1243GuiRemCli, T01T02_A396EmprCod, T01T02_A840TrnCod, T01T02_A3108AlbDivCod,
            T01T02_n3108AlbDivCod
            }
            , new Object[] {
            T01T03_A30AlbProCod, T01T03_A1259AlbDomEnv, T01T03_n1259AlbDomEnv, T01T03_A39AlbProPri, T01T03_A3865AlbHorSal, T01T03_A2242AlbSec, T01T03_A5141AlbIvaCod, T01T03_A10836AlbTrnDm, T01T03_A10837AlbTrnNc, T01T03_A10835AlbTrnNm,
            T01T03_A5805AlbEnvFtp, T01T03_A10765AlbProAT, T01T03_A10020AlbGrossT, T01T03_A10019AlbHhfm, T01T03_A10018ALbFmdc, T01T03_A10017AlbFmd, T01T03_n10017AlbFmd, T01T03_A7988AlbObsCb, T01T03_A7987AlbColCa, T01T03_A7162AlbDesp,
            T01T03_A7986AlbCambio, T01T03_A7985AlbTipDoc, T01T03_A7984AlbMotTr, T01T03_A5803AlbTipCal, T01T03_A4023AlbFecSal, T01T03_A7102AlbNumT, T01T03_A7101AlbLic, T01T03_A7100AlbMarCo, T01T03_A7099AlbOComp, T01T03_A7098AlbUsu,
            T01T03_A5140AlbMarca, T01T03_A3869AlbCliDes, T01T03_A3868AlbMat, T01T03_A3867AlbLocDes, T01T03_A3866AlbLocCar, T01T03_A3093AlbDivTCod, T01T03_n3093AlbDivTCod, T01T03_A33AlbProEst, T01T03_A1258GuiRemDom, T01T03_n1258GuiRemDom,
            T01T03_A34AlbProfch, T01T03_A914AlbPObsCon, T01T03_A14069AlbPdATCUD, T01T03_A14073AlbPdSerAT, T01T03_A14074AlbPdTipAT, T01T03_A1253EmprGuiRem, T01T03_A1243GuiRemCli, T01T03_A396EmprCod, T01T03_A840TrnCod, T01T03_A3108AlbDivCod,
            T01T03_n3108AlbDivCod
            }
            , new Object[] {
            T01T04_A3145GuiRemDivT, T01T04_n3145GuiRemDivT, T01T04_A1244GuiRemCln, T01T04_A3110GuiRemDiv, T01T04_n3110GuiRemDiv
            }
            , new Object[] {
            T01T05_A407EmprNom, T01T05_n407EmprNom
            }
            , new Object[] {
            T01T06_A3643TrnNif, T01T06_n3643TrnNif, T01T06_A841TrnNom, T01T06_n841TrnNom
            }
            , new Object[] {
            T01T07_A3643TrnNif, T01T07_n3643TrnNif, T01T07_A841TrnNom, T01T07_n841TrnNom
            }
            , new Object[] {
            T01T08_A3109AlbDivAbr, T01T08_n3109AlbDivAbr
            }
            , new Object[] {
            T01T09_A1260BusDomEnv, T01T09_n1260BusDomEnv
            }
            , new Object[] {
            T01T010_A252CliCod, T01T010_A266CliEnvLin, T01T010_A30AlbProCod, T01T010_A1259AlbDomEnv, T01T010_n1259AlbDomEnv, T01T010_A39AlbProPri, T01T010_A3865AlbHorSal, T01T010_A2242AlbSec, T01T010_A407EmprNom, T01T010_n407EmprNom,
            T01T010_A5141AlbIvaCod, T01T010_A10836AlbTrnDm, T01T010_A10837AlbTrnNc, T01T010_A10835AlbTrnNm, T01T010_A5805AlbEnvFtp, T01T010_A10765AlbProAT, T01T010_A10020AlbGrossT, T01T010_A10019AlbHhfm, T01T010_A10018ALbFmdc, T01T010_A10017AlbFmd,
            T01T010_n10017AlbFmd, T01T010_A7988AlbObsCb, T01T010_A7987AlbColCa, T01T010_A7162AlbDesp, T01T010_A7986AlbCambio, T01T010_A7985AlbTipDoc, T01T010_A7984AlbMotTr, T01T010_A5803AlbTipCal, T01T010_A4023AlbFecSal, T01T010_A7102AlbNumT,
            T01T010_A7101AlbLic, T01T010_A7100AlbMarCo, T01T010_A7099AlbOComp, T01T010_A7098AlbUsu, T01T010_A5140AlbMarca, T01T010_A3869AlbCliDes, T01T010_A3868AlbMat, T01T010_A3867AlbLocDes, T01T010_A3866AlbLocCar, T01T010_A3093AlbDivTCod,
            T01T010_n3093AlbDivTCod, T01T010_A3109AlbDivAbr, T01T010_n3109AlbDivAbr, T01T010_A33AlbProEst, T01T010_A1258GuiRemDom, T01T010_n1258GuiRemDom, T01T010_A3145GuiRemDivT, T01T010_n3145GuiRemDivT, T01T010_A1244GuiRemCln, T01T010_A34AlbProfch,
            T01T010_A914AlbPObsCon, T01T010_A14069AlbPdATCUD, T01T010_A14073AlbPdSerAT, T01T010_A14074AlbPdTipAT, T01T010_A1253EmprGuiRem, T01T010_A1243GuiRemCli, T01T010_A396EmprCod, T01T010_A840TrnCod, T01T010_A3108AlbDivCod, T01T010_n3108AlbDivCod,
            T01T010_A3110GuiRemDiv, T01T010_n3110GuiRemDiv, T01T010_A1260BusDomEnv, T01T010_n1260BusDomEnv
            }
            , new Object[] {
            T01T011_A3643TrnNif, T01T011_n3643TrnNif, T01T011_A841TrnNom, T01T011_n841TrnNom
            }
            , new Object[] {
            T01T012_A3109AlbDivAbr, T01T012_n3109AlbDivAbr
            }
            , new Object[] {
            T01T013_A1260BusDomEnv, T01T013_n1260BusDomEnv
            }
            , new Object[] {
            T01T014_A3145GuiRemDivT, T01T014_n3145GuiRemDivT, T01T014_A1244GuiRemCln, T01T014_A3110GuiRemDiv, T01T014_n3110GuiRemDiv
            }
            , new Object[] {
            T01T015_A3643TrnNif, T01T015_n3643TrnNif, T01T015_A841TrnNom, T01T015_n841TrnNom
            }
            , new Object[] {
            T01T016_A396EmprCod, T01T016_A30AlbProCod
            }
            , new Object[] {
            T01T017_A396EmprCod, T01T017_A30AlbProCod
            }
            , new Object[] {
            T01T018_A396EmprCod, T01T018_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01T022_A3109AlbDivAbr, T01T022_n3109AlbDivAbr
            }
            , new Object[] {
            T01T023_A3145GuiRemDivT, T01T023_n3145GuiRemDivT, T01T023_A1244GuiRemCln, T01T023_A3110GuiRemDiv, T01T023_n3110GuiRemDiv
            }
            , new Object[] {
            T01T024_A3643TrnNif, T01T024_n3643TrnNif, T01T024_A841TrnNom, T01T024_n841TrnNom
            }
            , new Object[] {
            T01T025_A1260BusDomEnv, T01T025_n1260BusDomEnv
            }
            , new Object[] {
            T01T026_A3643TrnNif, T01T026_n3643TrnNif, T01T026_A841TrnNom, T01T026_n841TrnNom
            }
            , new Object[] {
            T01T027_A396EmprCod, T01T027_A30AlbProCod, T01T027_A12185DltLinObs
            }
            , new Object[] {
            T01T028_A396EmprCod, T01T028_A30AlbProCod, T01T028_A12176DltHdr, T01T028_A12177DltR, T01T028_A12178DltP
            }
            , new Object[] {
            T01T029_A396EmprCod, T01T029_A30AlbProCod, T01T029_A7540Alb_NFisca
            }
            , new Object[] {
            T01T030_A396EmprCod, T01T030_A30AlbProCod, T01T030_A129BarCod, T01T030_A132BarCodReo, T01T030_A130BarCodPar
            }
            , new Object[] {
            T01T031_A396EmprCod, T01T031_A30AlbProCod, T01T031_A915AlbPObsLin
            }
            , new Object[] {
            T01T032_A396EmprCod, T01T032_A30AlbProCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV124Pgmname = "Albaranes.Albaran" ;
      Z10765AlbProAT = " " ;
      A10765AlbProAT = " " ;
      i10765AlbProAT = " " ;
      Z7098AlbUsu = "" ;
      A7098AlbUsu = "" ;
      i7098AlbUsu = "" ;
      Z3869AlbCliDes = 0 ;
      A3869AlbCliDes = 0 ;
      Z3093AlbDivTCod = httpContext.getMessage( "E", "") ;
      n3093AlbDivTCod = false ;
      A3093AlbDivTCod = httpContext.getMessage( "E", "") ;
      n3093AlbDivTCod = false ;
      i3093AlbDivTCod = httpContext.getMessage( "E", "") ;
      n3093AlbDivTCod = false ;
      Z4023AlbFecSal = GXutil.today( ) ;
      A4023AlbFecSal = GXutil.today( ) ;
      i4023AlbFecSal = GXutil.today( ) ;
      Z34AlbProfch = GXutil.today( ) ;
      i34AlbProfch = GXutil.today( ) ;
      A34AlbProfch = GXutil.today( ) ;
   }

   private byte Z1259AlbDomEnv ;
   private byte Z5805AlbEnvFtp ;
   private byte Z5803AlbTipCal ;
   private byte Z3867AlbLocDes ;
   private byte Z3866AlbLocCar ;
   private byte Z33AlbProEst ;
   private byte Z1258GuiRemDom ;
   private byte Z914AlbPObsCon ;
   private byte Z3108AlbDivCod ;
   private byte N3108AlbDivCod ;
   private byte GxWebError ;
   private byte AV63Tintex ;
   private byte AV64HueAlb ;
   private byte AV13FirmaD ;
   private byte AV65FlagAlb ;
   private byte AV66FlagCont ;
   private byte AV67FlagCli ;
   private byte AV16Ctrlf ;
   private byte AV71hashAnt ;
   private byte AV69Endutex ;
   private byte A3108AlbDivCod ;
   private byte A1259AlbDomEnv ;
   private byte nKeyPressed ;
   private byte A5805AlbEnvFtp ;
   private byte A33AlbProEst ;
   private byte AV106ComboAlbDivCod ;
   private byte AV107ComboAlbDomEnv ;
   private byte A5803AlbTipCal ;
   private byte A3867AlbLocDes ;
   private byte A3866AlbLocCar ;
   private byte A1258GuiRemDom ;
   private byte A914AlbPObsCon ;
   private byte AV57Insert_AlbDivCod ;
   private byte Gx_BScreen ;
   private byte A1260BusDomEnv ;
   private byte AV18F_carvema ;
   private byte AV68F_albanu ;
   private byte AV12avisar ;
   private byte AV44F_tinamar ;
   private byte A3110GuiRemDiv ;
   private byte AV75PrnAlb ;
   private byte AV37FlagGv ;
   private byte AV19FlagFas ;
   private byte AV20FlagTxt ;
   private byte AV21FlagPreFas ;
   private byte AV27FlagEtm ;
   private byte AV22FlagPro ;
   private byte AV76FlagProPre ;
   private byte AV77FlagTintu ;
   private byte AV78FlagVerFor ;
   private byte AV79PwdGrl ;
   private byte AV23F_moda21 ;
   private byte AV24Moda21 ;
   private byte AV25FlagPorRec ;
   private byte AV81Samofil ;
   private byte AV82CCC ;
   private byte AV26Erfoc ;
   private byte AV83Boton_no ;
   private byte AV28CtrQb ;
   private byte AV84F_recpes ;
   private byte AV85Finitextil ;
   private byte AV87granul ;
   private byte AV88Ws ;
   private byte AV99Nows ;
   private byte AV89Modhh ;
   private byte AV90PrnAT ;
   private byte AV30errkgs ;
   private byte AV96PdfGx16 ;
   private byte AV31Artemalha ;
   private byte AV32siplasticos ;
   private byte AV29Carvitin ;
   private byte AV45Carvema ;
   private byte GXt_int5 ;
   private byte Z3110GuiRemDiv ;
   private byte Z1260BusDomEnv ;
   private byte gxajaxcallmode ;
   private byte GXv_int6[] ;
   private byte ZV65FlagAlb ;
   private byte ZV66FlagCont ;
   private byte GXv_int16[] ;
   private byte ZV67FlagCli ;
   private short Z840TrnCod ;
   private short N840TrnCod ;
   private short AV61CliUltMq ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV111ComboTrnCod ;
   private short AV56Insert_TrnCod ;
   private short RcdFound3 ;
   private short AV74Flag1 ;
   private short AV91Copias ;
   private short AV92Copias2 ;
   private short nIsDirty_3 ;
   private short GXv_int12[] ;
   private short ZV61CliUltMq ;
   private int Z7162AlbDesp ;
   private int Z7985AlbTipDoc ;
   private int Z3869AlbCliDes ;
   private int Z1243GuiRemCli ;
   private int N1243GuiRemCli ;
   private int A1243GuiRemCli ;
   private int A3869AlbCliDes ;
   private int trnEnded ;
   private int edtAlbProCod_Enabled ;
   private int edtAlbProPri_Enabled ;
   private int edtAlbProEst_Enabled ;
   private int edtAlbProfch_Enabled ;
   private int edtAlbFecSal_Enabled ;
   private int edtAlbHorSal_Enabled ;
   private int edtAlbDivCod_Visible ;
   private int edtAlbDivCod_Enabled ;
   private int edtAlbUsu_Enabled ;
   private int edtGuiRemCli_Visible ;
   private int edtGuiRemCli_Enabled ;
   private int edtAlbDomEnv_Enabled ;
   private int edtAlbDomEnv_Visible ;
   private int edtTrnCod_Visible ;
   private int edtTrnCod_Enabled ;
   private int edtAlbMat_Enabled ;
   private int edtAlbLic_Enabled ;
   private int edtAlbHhfm_Enabled ;
   private int edtAlbGrossT_Enabled ;
   private int edtAlbPdATCUD_Enabled ;
   private int edtAlbFmd_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavComboalbdivcod_Enabled ;
   private int edtavComboalbdivcod_Visible ;
   private int AV108ComboGuiRemCli ;
   private int edtavComboguiremcli_Enabled ;
   private int edtavComboguiremcli_Visible ;
   private int edtavComboalbdomenv_Enabled ;
   private int edtavComboalbdomenv_Visible ;
   private int edtavCombotrncod_Enabled ;
   private int edtavCombotrncod_Visible ;
   private int edtavEmprcod_Visible ;
   private int edtavEmprcod_Enabled ;
   private int A7162AlbDesp ;
   private int A7985AlbTipDoc ;
   private int AV112Cond_GuiRemCli ;
   private int AV55Insert_GuiRemCli ;
   private int Combo_albdivcod_Datalistupdateminimumcharacters ;
   private int Combo_guiremcli_Datalistupdateminimumcharacters ;
   private int Combo_albdomenv_Datalistupdateminimumcharacters ;
   private int Combo_trncod_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV86Porgm ;
   private int GXt_int7 ;
   private int AV80ContVal ;
   private int AV125GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int GXv_int8[] ;
   private long wcpOAV51AlbProCod ;
   private long Z30AlbProCod ;
   private long Z7102AlbNumT ;
   private long A30AlbProCod ;
   private long AV15AlbLast ;
   private long AV51AlbProCod ;
   private long A7102AlbNumT ;
   private long GXv_int15[] ;
   private long ZV15AlbLast ;
   private java.math.BigDecimal Z10020AlbGrossT ;
   private java.math.BigDecimal Z7986AlbCambio ;
   private java.math.BigDecimal A10020AlbGrossT ;
   private java.math.BigDecimal A7986AlbCambio ;
   private java.math.BigDecimal AV49Porgrm2 ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV17EmprCod ;
   private String Z396EmprCod ;
   private String Z39AlbProPri ;
   private String Z3865AlbHorSal ;
   private String Z2242AlbSec ;
   private String Z5141AlbIvaCod ;
   private String Z10836AlbTrnDm ;
   private String Z10837AlbTrnNc ;
   private String Z10835AlbTrnNm ;
   private String Z10765AlbProAT ;
   private String Z10018ALbFmdc ;
   private String Z7988AlbObsCb ;
   private String Z7987AlbColCa ;
   private String Z7984AlbMotTr ;
   private String Z7101AlbLic ;
   private String Z7100AlbMarCo ;
   private String Z7099AlbOComp ;
   private String Z7098AlbUsu ;
   private String Z5140AlbMarca ;
   private String Z3868AlbMat ;
   private String Z3093AlbDivTCod ;
   private String Z14069AlbPdATCUD ;
   private String Z14073AlbPdSerAT ;
   private String Z14074AlbPdTipAT ;
   private String Z1253EmprGuiRem ;
   private String N1253EmprGuiRem ;
   private String N2242AlbSec ;
   private String Combo_trncod_Selectedvalue_get ;
   private String Combo_albdomenv_Selectedvalue_get ;
   private String Combo_guiremcli_Selectedvalue_get ;
   private String Combo_albdivcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV7ContCod ;
   private String A39AlbProPri ;
   private String Gx_mode ;
   private String A10018ALbFmdc ;
   private String A1253EmprGuiRem ;
   private String AV17EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbProfch_Internalname ;
   private String A10765AlbProAT ;
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
   private String divTablealbaran_Internalname ;
   private String divTablealbarannumero_Internalname ;
   private String edtAlbProCod_Internalname ;
   private String TempTags ;
   private String edtAlbProCod_Jsonclick ;
   private String edtAlbProPri_Internalname ;
   private String edtAlbProPri_Jsonclick ;
   private String edtAlbProEst_Internalname ;
   private String edtAlbProEst_Jsonclick ;
   private String divTablefechas_Internalname ;
   private String edtAlbProfch_Jsonclick ;
   private String edtAlbFecSal_Internalname ;
   private String edtAlbFecSal_Jsonclick ;
   private String edtAlbHorSal_Internalname ;
   private String A3865AlbHorSal ;
   private String edtAlbHorSal_Jsonclick ;
   private String divTablesplittedalbdivcod_Internalname ;
   private String lblTextblockalbdivcod_Internalname ;
   private String lblTextblockalbdivcod_Jsonclick ;
   private String Combo_albdivcod_Caption ;
   private String Combo_albdivcod_Cls ;
   private String Combo_albdivcod_Internalname ;
   private String edtAlbDivCod_Internalname ;
   private String edtAlbDivCod_Jsonclick ;
   private String divTableusuario_Internalname ;
   private String edtAlbUsu_Internalname ;
   private String A7098AlbUsu ;
   private String edtAlbUsu_Jsonclick ;
   private String divTablecliente_Internalname ;
   private String divTablesplittedguiremcli_Internalname ;
   private String lblTextblockguiremcli_Internalname ;
   private String lblTextblockguiremcli_Jsonclick ;
   private String Combo_guiremcli_Caption ;
   private String Combo_guiremcli_Cls ;
   private String Combo_guiremcli_Emptyitemtext ;
   private String Combo_guiremcli_Internalname ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String divTablesplittedalbdomenv_Internalname ;
   private String lblTextblockalbdomenv_Internalname ;
   private String lblTextblockalbdomenv_Jsonclick ;
   private String Combo_albdomenv_Caption ;
   private String Combo_albdomenv_Cls ;
   private String Combo_albdomenv_Datalistproc ;
   private String Combo_albdomenv_Emptyitemtext ;
   private String Combo_albdomenv_Internalname ;
   private String edtAlbDomEnv_Internalname ;
   private String edtAlbDomEnv_Jsonclick ;
   private String divTabletransportista_Internalname ;
   private String divTablesplittedtrncod_Internalname ;
   private String lblTextblocktrncod_Internalname ;
   private String lblTextblocktrncod_Jsonclick ;
   private String Combo_trncod_Caption ;
   private String Combo_trncod_Cls ;
   private String Combo_trncod_Emptyitemtext ;
   private String Combo_trncod_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtAlbMat_Internalname ;
   private String A3868AlbMat ;
   private String edtAlbMat_Jsonclick ;
   private String divTableat_Internalname ;
   private String grpUnnamedgroup2_Internalname ;
   private String grpUnnamedgroup2_Class ;
   private String divGrupoat_Internalname ;
   private String divTblgrupoat_Internalname ;
   private String edtAlbLic_Internalname ;
   private String A7101AlbLic ;
   private String edtAlbLic_Jsonclick ;
   private String edtAlbHhfm_Internalname ;
   private String edtAlbHhfm_Jsonclick ;
   private String edtAlbGrossT_Internalname ;
   private String edtAlbGrossT_Jsonclick ;
   private String edtAlbPdATCUD_Internalname ;
   private String A14069AlbPdATCUD ;
   private String edtAlbPdATCUD_Jsonclick ;
   private String grpUnnamedgroup3_Internalname ;
   private String grpUnnamedgroup3_Class ;
   private String sStyleString ;
   private String tblGrupohash_Internalname ;
   private String divTblhash_Internalname ;
   private String edtAlbFmd_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV124Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_albdivcod_Internalname ;
   private String edtavComboalbdivcod_Internalname ;
   private String edtavComboalbdivcod_Jsonclick ;
   private String divSectionattribute_guiremcli_Internalname ;
   private String edtavComboguiremcli_Internalname ;
   private String edtavComboguiremcli_Jsonclick ;
   private String divSectionattribute_albdomenv_Internalname ;
   private String edtavComboalbdomenv_Internalname ;
   private String edtavComboalbdomenv_Jsonclick ;
   private String divSectionattribute_trncod_Internalname ;
   private String edtavCombotrncod_Internalname ;
   private String edtavCombotrncod_Jsonclick ;
   private String edtavEmprcod_Internalname ;
   private String edtavEmprcod_Jsonclick ;
   private String A2242AlbSec ;
   private String A5141AlbIvaCod ;
   private String A10836AlbTrnDm ;
   private String A10837AlbTrnNc ;
   private String A10835AlbTrnNm ;
   private String A7988AlbObsCb ;
   private String A7987AlbColCa ;
   private String A7984AlbMotTr ;
   private String A7100AlbMarCo ;
   private String A7099AlbOComp ;
   private String A5140AlbMarca ;
   private String A3093AlbDivTCod ;
   private String A14073AlbPdSerAT ;
   private String A14074AlbPdTipAT ;
   private String AV58Insert_EmprGuiRem ;
   private String AV101AlbProPri ;
   private String AV60AlbSec ;
   private String AV10UsurCod ;
   private String AV62Clitipo ;
   private String A3145GuiRemDivT ;
   private String A1244GuiRemCln ;
   private String A407EmprNom ;
   private String A3643TrnNif ;
   private String A841TrnNom ;
   private String A3109AlbDivAbr ;
   private String Combo_albdivcod_Objectcall ;
   private String Combo_albdivcod_Class ;
   private String Combo_albdivcod_Icontype ;
   private String Combo_albdivcod_Icon ;
   private String Combo_albdivcod_Tooltip ;
   private String Combo_albdivcod_Selectedvalue_set ;
   private String Combo_albdivcod_Selectedtext_set ;
   private String Combo_albdivcod_Selectedtext_get ;
   private String Combo_albdivcod_Gamoauthtoken ;
   private String Combo_albdivcod_Ddointernalname ;
   private String Combo_albdivcod_Titlecontrolalign ;
   private String Combo_albdivcod_Dropdownoptionstype ;
   private String Combo_albdivcod_Titlecontrolidtoreplace ;
   private String Combo_albdivcod_Datalisttype ;
   private String Combo_albdivcod_Datalistfixedvalues ;
   private String Combo_albdivcod_Datalistproc ;
   private String Combo_albdivcod_Datalistprocparametersprefix ;
   private String Combo_albdivcod_Remoteservicesparameters ;
   private String Combo_albdivcod_Htmltemplate ;
   private String Combo_albdivcod_Multiplevaluestype ;
   private String Combo_albdivcod_Loadingdata ;
   private String Combo_albdivcod_Noresultsfound ;
   private String Combo_albdivcod_Emptyitemtext ;
   private String Combo_albdivcod_Onlyselectedvalues ;
   private String Combo_albdivcod_Selectalltext ;
   private String Combo_albdivcod_Multiplevaluesseparator ;
   private String Combo_albdivcod_Addnewoptiontext ;
   private String Combo_guiremcli_Objectcall ;
   private String Combo_guiremcli_Class ;
   private String Combo_guiremcli_Icontype ;
   private String Combo_guiremcli_Icon ;
   private String Combo_guiremcli_Tooltip ;
   private String Combo_guiremcli_Selectedvalue_set ;
   private String Combo_guiremcli_Selectedtext_set ;
   private String Combo_guiremcli_Selectedtext_get ;
   private String Combo_guiremcli_Gamoauthtoken ;
   private String Combo_guiremcli_Ddointernalname ;
   private String Combo_guiremcli_Titlecontrolalign ;
   private String Combo_guiremcli_Dropdownoptionstype ;
   private String Combo_guiremcli_Titlecontrolidtoreplace ;
   private String Combo_guiremcli_Datalisttype ;
   private String Combo_guiremcli_Datalistfixedvalues ;
   private String Combo_guiremcli_Datalistproc ;
   private String Combo_guiremcli_Datalistprocparametersprefix ;
   private String Combo_guiremcli_Remoteservicesparameters ;
   private String Combo_guiremcli_Htmltemplate ;
   private String Combo_guiremcli_Multiplevaluestype ;
   private String Combo_guiremcli_Loadingdata ;
   private String Combo_guiremcli_Noresultsfound ;
   private String Combo_guiremcli_Onlyselectedvalues ;
   private String Combo_guiremcli_Selectalltext ;
   private String Combo_guiremcli_Multiplevaluesseparator ;
   private String Combo_guiremcli_Addnewoptiontext ;
   private String Combo_albdomenv_Objectcall ;
   private String Combo_albdomenv_Class ;
   private String Combo_albdomenv_Icontype ;
   private String Combo_albdomenv_Icon ;
   private String Combo_albdomenv_Tooltip ;
   private String Combo_albdomenv_Selectedvalue_set ;
   private String Combo_albdomenv_Selectedtext_set ;
   private String Combo_albdomenv_Selectedtext_get ;
   private String Combo_albdomenv_Gamoauthtoken ;
   private String Combo_albdomenv_Ddointernalname ;
   private String Combo_albdomenv_Titlecontrolalign ;
   private String Combo_albdomenv_Dropdownoptionstype ;
   private String Combo_albdomenv_Titlecontrolidtoreplace ;
   private String Combo_albdomenv_Datalisttype ;
   private String Combo_albdomenv_Datalistfixedvalues ;
   private String Combo_albdomenv_Datalistprocparametersprefix ;
   private String Combo_albdomenv_Remoteservicesparameters ;
   private String Combo_albdomenv_Htmltemplate ;
   private String Combo_albdomenv_Multiplevaluestype ;
   private String Combo_albdomenv_Loadingdata ;
   private String Combo_albdomenv_Noresultsfound ;
   private String Combo_albdomenv_Onlyselectedvalues ;
   private String Combo_albdomenv_Selectalltext ;
   private String Combo_albdomenv_Multiplevaluesseparator ;
   private String Combo_albdomenv_Addnewoptiontext ;
   private String Combo_trncod_Objectcall ;
   private String Combo_trncod_Class ;
   private String Combo_trncod_Icontype ;
   private String Combo_trncod_Icon ;
   private String Combo_trncod_Tooltip ;
   private String Combo_trncod_Selectedvalue_set ;
   private String Combo_trncod_Selectedtext_set ;
   private String Combo_trncod_Selectedtext_get ;
   private String Combo_trncod_Gamoauthtoken ;
   private String Combo_trncod_Ddointernalname ;
   private String Combo_trncod_Titlecontrolalign ;
   private String Combo_trncod_Dropdownoptionstype ;
   private String Combo_trncod_Titlecontrolidtoreplace ;
   private String Combo_trncod_Datalisttype ;
   private String Combo_trncod_Datalistfixedvalues ;
   private String Combo_trncod_Datalistproc ;
   private String Combo_trncod_Datalistprocparametersprefix ;
   private String Combo_trncod_Remoteservicesparameters ;
   private String Combo_trncod_Htmltemplate ;
   private String Combo_trncod_Multiplevaluestype ;
   private String Combo_trncod_Loadingdata ;
   private String Combo_trncod_Noresultsfound ;
   private String Combo_trncod_Onlyselectedvalues ;
   private String Combo_trncod_Selectalltext ;
   private String Combo_trncod_Multiplevaluesseparator ;
   private String Combo_trncod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode3 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV72Lit0 ;
   private String AV95Lit44 ;
   private String AV73Litfe ;
   private String AV8Station ;
   private String AV9EmprNom ;
   private String AV93Msg_err1 ;
   private String AV94Correcto ;
   private String Z407EmprNom ;
   private String Z3109AlbDivAbr ;
   private String Z3145GuiRemDivT ;
   private String Z1244GuiRemCln ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i3093AlbDivTCod ;
   private String i7098AlbUsu ;
   private String i10765AlbProAT ;
   private String GXv_char2[] ;
   private String ZV7ContCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char18[] ;
   private String GXv_char4[] ;
   private String ZV62Clitipo ;
   private String Z3643TrnNif ;
   private String Z841TrnNom ;
   private java.util.Date Z10019AlbHhfm ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date GXv_dtime17[] ;
   private java.util.Date Z4023AlbFecSal ;
   private java.util.Date Z34AlbProfch ;
   private java.util.Date AV14Fch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date i34AlbProfch ;
   private java.util.Date i4023AlbFecSal ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date GXv_date13[] ;
   private java.util.Date ZV14Fch ;
   private boolean wcpOAV122VisualizarAcciones ;
   private boolean wcpOAV121AccionesEnPopup ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n10017AlbFmd ;
   private boolean n3108AlbDivCod ;
   private boolean n1259AlbDomEnv ;
   private boolean AV122VisualizarAcciones ;
   private boolean AV121AccionesEnPopup ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_albdivcod_Emptyitem ;
   private boolean n3093AlbDivTCod ;
   private boolean n1258GuiRemDom ;
   private boolean AV115IsVisibleAT ;
   private boolean AV116IsVisibleHash ;
   private boolean n1260BusDomEnv ;
   private boolean n3145GuiRemDivT ;
   private boolean n3110GuiRemDiv ;
   private boolean n407EmprNom ;
   private boolean n3643TrnNif ;
   private boolean n841TrnNom ;
   private boolean n3109AlbDivAbr ;
   private boolean Combo_albdivcod_Enabled ;
   private boolean Combo_albdivcod_Visible ;
   private boolean Combo_albdivcod_Allowmultipleselection ;
   private boolean Combo_albdivcod_Isgriditem ;
   private boolean Combo_albdivcod_Hasdescription ;
   private boolean Combo_albdivcod_Includeonlyselectedoption ;
   private boolean Combo_albdivcod_Includeselectalloption ;
   private boolean Combo_albdivcod_Includeaddnewoption ;
   private boolean Combo_guiremcli_Enabled ;
   private boolean Combo_guiremcli_Visible ;
   private boolean Combo_guiremcli_Allowmultipleselection ;
   private boolean Combo_guiremcli_Isgriditem ;
   private boolean Combo_guiremcli_Hasdescription ;
   private boolean Combo_guiremcli_Includeonlyselectedoption ;
   private boolean Combo_guiremcli_Includeselectalloption ;
   private boolean Combo_guiremcli_Emptyitem ;
   private boolean Combo_guiremcli_Includeaddnewoption ;
   private boolean Combo_albdomenv_Enabled ;
   private boolean Combo_albdomenv_Visible ;
   private boolean Combo_albdomenv_Allowmultipleselection ;
   private boolean Combo_albdomenv_Isgriditem ;
   private boolean Combo_albdomenv_Hasdescription ;
   private boolean Combo_albdomenv_Includeonlyselectedoption ;
   private boolean Combo_albdomenv_Includeselectalloption ;
   private boolean Combo_albdomenv_Emptyitem ;
   private boolean Combo_albdomenv_Includeaddnewoption ;
   private boolean Combo_trncod_Enabled ;
   private boolean Combo_trncod_Visible ;
   private boolean Combo_trncod_Allowmultipleselection ;
   private boolean Combo_trncod_Isgriditem ;
   private boolean Combo_trncod_Hasdescription ;
   private boolean Combo_trncod_Includeonlyselectedoption ;
   private boolean Combo_trncod_Includeselectalloption ;
   private boolean Combo_trncod_Emptyitem ;
   private boolean Combo_trncod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV105Combo_DataJson ;
   private String Z10017AlbFmd ;
   private String A10017AlbFmd ;
   private String AV11Msg_f ;
   private String AV70msg_control ;
   private String AV110ComboSelectedValue ;
   private String AV109ComboSelectedText ;
   private String ZV70msg_control ;
   private String ZV11Msg_f ;
   private com.genexus.webpanels.WebSession AV54WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_albdivcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_guiremcli ;
   private com.genexus.webpanels.GXUserControl ucCombo_albdomenv ;
   private com.genexus.webpanels.GXUserControl ucCombo_trncod ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbEnvFtp ;
   private HTMLChoice cmbAlbProAT ;
   private IDataStoreProvider pr_default ;
   private String[] T01T05_A407EmprNom ;
   private boolean[] T01T05_n407EmprNom ;
   private String[] T01T06_A3643TrnNif ;
   private boolean[] T01T06_n3643TrnNif ;
   private String[] T01T06_A841TrnNom ;
   private boolean[] T01T06_n841TrnNom ;
   private String[] T01T08_A3109AlbDivAbr ;
   private boolean[] T01T08_n3109AlbDivAbr ;
   private String[] T01T04_A3145GuiRemDivT ;
   private boolean[] T01T04_n3145GuiRemDivT ;
   private String[] T01T04_A1244GuiRemCln ;
   private byte[] T01T04_A3110GuiRemDiv ;
   private boolean[] T01T04_n3110GuiRemDiv ;
   private String[] T01T07_A3643TrnNif ;
   private boolean[] T01T07_n3643TrnNif ;
   private String[] T01T07_A841TrnNom ;
   private boolean[] T01T07_n841TrnNom ;
   private byte[] T01T09_A1260BusDomEnv ;
   private boolean[] T01T09_n1260BusDomEnv ;
   private int[] T01T010_A252CliCod ;
   private byte[] T01T010_A266CliEnvLin ;
   private long[] T01T010_A30AlbProCod ;
   private byte[] T01T010_A1259AlbDomEnv ;
   private boolean[] T01T010_n1259AlbDomEnv ;
   private String[] T01T010_A39AlbProPri ;
   private String[] T01T010_A3865AlbHorSal ;
   private String[] T01T010_A2242AlbSec ;
   private String[] T01T010_A407EmprNom ;
   private boolean[] T01T010_n407EmprNom ;
   private String[] T01T010_A5141AlbIvaCod ;
   private String[] T01T010_A10836AlbTrnDm ;
   private String[] T01T010_A10837AlbTrnNc ;
   private String[] T01T010_A10835AlbTrnNm ;
   private byte[] T01T010_A5805AlbEnvFtp ;
   private String[] T01T010_A10765AlbProAT ;
   private java.math.BigDecimal[] T01T010_A10020AlbGrossT ;
   private java.util.Date[] T01T010_A10019AlbHhfm ;
   private String[] T01T010_A10018ALbFmdc ;
   private String[] T01T010_A10017AlbFmd ;
   private boolean[] T01T010_n10017AlbFmd ;
   private String[] T01T010_A7988AlbObsCb ;
   private String[] T01T010_A7987AlbColCa ;
   private int[] T01T010_A7162AlbDesp ;
   private java.math.BigDecimal[] T01T010_A7986AlbCambio ;
   private int[] T01T010_A7985AlbTipDoc ;
   private String[] T01T010_A7984AlbMotTr ;
   private byte[] T01T010_A5803AlbTipCal ;
   private java.util.Date[] T01T010_A4023AlbFecSal ;
   private long[] T01T010_A7102AlbNumT ;
   private String[] T01T010_A7101AlbLic ;
   private String[] T01T010_A7100AlbMarCo ;
   private String[] T01T010_A7099AlbOComp ;
   private String[] T01T010_A7098AlbUsu ;
   private String[] T01T010_A5140AlbMarca ;
   private int[] T01T010_A3869AlbCliDes ;
   private String[] T01T010_A3868AlbMat ;
   private byte[] T01T010_A3867AlbLocDes ;
   private byte[] T01T010_A3866AlbLocCar ;
   private String[] T01T010_A3093AlbDivTCod ;
   private boolean[] T01T010_n3093AlbDivTCod ;
   private String[] T01T010_A3109AlbDivAbr ;
   private boolean[] T01T010_n3109AlbDivAbr ;
   private byte[] T01T010_A33AlbProEst ;
   private byte[] T01T010_A1258GuiRemDom ;
   private boolean[] T01T010_n1258GuiRemDom ;
   private String[] T01T010_A3145GuiRemDivT ;
   private boolean[] T01T010_n3145GuiRemDivT ;
   private String[] T01T010_A1244GuiRemCln ;
   private java.util.Date[] T01T010_A34AlbProfch ;
   private byte[] T01T010_A914AlbPObsCon ;
   private String[] T01T010_A14069AlbPdATCUD ;
   private String[] T01T010_A14073AlbPdSerAT ;
   private String[] T01T010_A14074AlbPdTipAT ;
   private String[] T01T010_A1253EmprGuiRem ;
   private int[] T01T010_A1243GuiRemCli ;
   private String[] T01T010_A396EmprCod ;
   private short[] T01T010_A840TrnCod ;
   private byte[] T01T010_A3108AlbDivCod ;
   private boolean[] T01T010_n3108AlbDivCod ;
   private byte[] T01T010_A3110GuiRemDiv ;
   private boolean[] T01T010_n3110GuiRemDiv ;
   private byte[] T01T010_A1260BusDomEnv ;
   private boolean[] T01T010_n1260BusDomEnv ;
   private String[] T01T011_A3643TrnNif ;
   private boolean[] T01T011_n3643TrnNif ;
   private String[] T01T011_A841TrnNom ;
   private boolean[] T01T011_n841TrnNom ;
   private String[] T01T012_A3109AlbDivAbr ;
   private boolean[] T01T012_n3109AlbDivAbr ;
   private byte[] T01T013_A1260BusDomEnv ;
   private boolean[] T01T013_n1260BusDomEnv ;
   private String[] T01T014_A3145GuiRemDivT ;
   private boolean[] T01T014_n3145GuiRemDivT ;
   private String[] T01T014_A1244GuiRemCln ;
   private byte[] T01T014_A3110GuiRemDiv ;
   private boolean[] T01T014_n3110GuiRemDiv ;
   private String[] T01T015_A3643TrnNif ;
   private boolean[] T01T015_n3643TrnNif ;
   private String[] T01T015_A841TrnNom ;
   private boolean[] T01T015_n841TrnNom ;
   private String[] T01T016_A396EmprCod ;
   private long[] T01T016_A30AlbProCod ;
   private long[] T01T03_A30AlbProCod ;
   private byte[] T01T03_A1259AlbDomEnv ;
   private boolean[] T01T03_n1259AlbDomEnv ;
   private String[] T01T03_A39AlbProPri ;
   private String[] T01T03_A3865AlbHorSal ;
   private String[] T01T03_A2242AlbSec ;
   private String[] T01T03_A5141AlbIvaCod ;
   private String[] T01T03_A10836AlbTrnDm ;
   private String[] T01T03_A10837AlbTrnNc ;
   private String[] T01T03_A10835AlbTrnNm ;
   private byte[] T01T03_A5805AlbEnvFtp ;
   private String[] T01T03_A10765AlbProAT ;
   private java.math.BigDecimal[] T01T03_A10020AlbGrossT ;
   private java.util.Date[] T01T03_A10019AlbHhfm ;
   private String[] T01T03_A10018ALbFmdc ;
   private String[] T01T03_A10017AlbFmd ;
   private boolean[] T01T03_n10017AlbFmd ;
   private String[] T01T03_A7988AlbObsCb ;
   private String[] T01T03_A7987AlbColCa ;
   private int[] T01T03_A7162AlbDesp ;
   private java.math.BigDecimal[] T01T03_A7986AlbCambio ;
   private int[] T01T03_A7985AlbTipDoc ;
   private String[] T01T03_A7984AlbMotTr ;
   private byte[] T01T03_A5803AlbTipCal ;
   private java.util.Date[] T01T03_A4023AlbFecSal ;
   private long[] T01T03_A7102AlbNumT ;
   private String[] T01T03_A7101AlbLic ;
   private String[] T01T03_A7100AlbMarCo ;
   private String[] T01T03_A7099AlbOComp ;
   private String[] T01T03_A7098AlbUsu ;
   private String[] T01T03_A5140AlbMarca ;
   private int[] T01T03_A3869AlbCliDes ;
   private String[] T01T03_A3868AlbMat ;
   private byte[] T01T03_A3867AlbLocDes ;
   private byte[] T01T03_A3866AlbLocCar ;
   private String[] T01T03_A3093AlbDivTCod ;
   private boolean[] T01T03_n3093AlbDivTCod ;
   private byte[] T01T03_A33AlbProEst ;
   private byte[] T01T03_A1258GuiRemDom ;
   private boolean[] T01T03_n1258GuiRemDom ;
   private java.util.Date[] T01T03_A34AlbProfch ;
   private byte[] T01T03_A914AlbPObsCon ;
   private String[] T01T03_A14069AlbPdATCUD ;
   private String[] T01T03_A14073AlbPdSerAT ;
   private String[] T01T03_A14074AlbPdTipAT ;
   private String[] T01T03_A1253EmprGuiRem ;
   private int[] T01T03_A1243GuiRemCli ;
   private String[] T01T03_A396EmprCod ;
   private short[] T01T03_A840TrnCod ;
   private byte[] T01T03_A3108AlbDivCod ;
   private boolean[] T01T03_n3108AlbDivCod ;
   private String[] T01T017_A396EmprCod ;
   private long[] T01T017_A30AlbProCod ;
   private String[] T01T018_A396EmprCod ;
   private long[] T01T018_A30AlbProCod ;
   private long[] T01T02_A30AlbProCod ;
   private byte[] T01T02_A1259AlbDomEnv ;
   private boolean[] T01T02_n1259AlbDomEnv ;
   private String[] T01T02_A39AlbProPri ;
   private String[] T01T02_A3865AlbHorSal ;
   private String[] T01T02_A2242AlbSec ;
   private String[] T01T02_A5141AlbIvaCod ;
   private String[] T01T02_A10836AlbTrnDm ;
   private String[] T01T02_A10837AlbTrnNc ;
   private String[] T01T02_A10835AlbTrnNm ;
   private byte[] T01T02_A5805AlbEnvFtp ;
   private String[] T01T02_A10765AlbProAT ;
   private java.math.BigDecimal[] T01T02_A10020AlbGrossT ;
   private java.util.Date[] T01T02_A10019AlbHhfm ;
   private String[] T01T02_A10018ALbFmdc ;
   private String[] T01T02_A10017AlbFmd ;
   private boolean[] T01T02_n10017AlbFmd ;
   private String[] T01T02_A7988AlbObsCb ;
   private String[] T01T02_A7987AlbColCa ;
   private int[] T01T02_A7162AlbDesp ;
   private java.math.BigDecimal[] T01T02_A7986AlbCambio ;
   private int[] T01T02_A7985AlbTipDoc ;
   private String[] T01T02_A7984AlbMotTr ;
   private byte[] T01T02_A5803AlbTipCal ;
   private java.util.Date[] T01T02_A4023AlbFecSal ;
   private long[] T01T02_A7102AlbNumT ;
   private String[] T01T02_A7101AlbLic ;
   private String[] T01T02_A7100AlbMarCo ;
   private String[] T01T02_A7099AlbOComp ;
   private String[] T01T02_A7098AlbUsu ;
   private String[] T01T02_A5140AlbMarca ;
   private int[] T01T02_A3869AlbCliDes ;
   private String[] T01T02_A3868AlbMat ;
   private byte[] T01T02_A3867AlbLocDes ;
   private byte[] T01T02_A3866AlbLocCar ;
   private String[] T01T02_A3093AlbDivTCod ;
   private boolean[] T01T02_n3093AlbDivTCod ;
   private byte[] T01T02_A33AlbProEst ;
   private byte[] T01T02_A1258GuiRemDom ;
   private boolean[] T01T02_n1258GuiRemDom ;
   private java.util.Date[] T01T02_A34AlbProfch ;
   private byte[] T01T02_A914AlbPObsCon ;
   private String[] T01T02_A14069AlbPdATCUD ;
   private String[] T01T02_A14073AlbPdSerAT ;
   private String[] T01T02_A14074AlbPdTipAT ;
   private String[] T01T02_A1253EmprGuiRem ;
   private int[] T01T02_A1243GuiRemCli ;
   private String[] T01T02_A396EmprCod ;
   private short[] T01T02_A840TrnCod ;
   private byte[] T01T02_A3108AlbDivCod ;
   private boolean[] T01T02_n3108AlbDivCod ;
   private String[] T01T022_A3109AlbDivAbr ;
   private boolean[] T01T022_n3109AlbDivAbr ;
   private String[] T01T023_A3145GuiRemDivT ;
   private boolean[] T01T023_n3145GuiRemDivT ;
   private String[] T01T023_A1244GuiRemCln ;
   private byte[] T01T023_A3110GuiRemDiv ;
   private boolean[] T01T023_n3110GuiRemDiv ;
   private String[] T01T024_A3643TrnNif ;
   private boolean[] T01T024_n3643TrnNif ;
   private String[] T01T024_A841TrnNom ;
   private boolean[] T01T024_n841TrnNom ;
   private byte[] T01T025_A1260BusDomEnv ;
   private boolean[] T01T025_n1260BusDomEnv ;
   private String[] T01T026_A3643TrnNif ;
   private boolean[] T01T026_n3643TrnNif ;
   private String[] T01T026_A841TrnNom ;
   private boolean[] T01T026_n841TrnNom ;
   private String[] T01T027_A396EmprCod ;
   private long[] T01T027_A30AlbProCod ;
   private byte[] T01T027_A12185DltLinObs ;
   private String[] T01T028_A396EmprCod ;
   private long[] T01T028_A30AlbProCod ;
   private int[] T01T028_A12176DltHdr ;
   private byte[] T01T028_A12177DltR ;
   private String[] T01T028_A12178DltP ;
   private String[] T01T029_A396EmprCod ;
   private long[] T01T029_A30AlbProCod ;
   private String[] T01T029_A7540Alb_NFisca ;
   private String[] T01T030_A396EmprCod ;
   private long[] T01T030_A30AlbProCod ;
   private int[] T01T030_A129BarCod ;
   private byte[] T01T030_A132BarCodReo ;
   private String[] T01T030_A130BarCodPar ;
   private String[] T01T031_A396EmprCod ;
   private long[] T01T031_A30AlbProCod ;
   private byte[] T01T031_A915AlbPObsLin ;
   private String[] T01T032_A396EmprCod ;
   private long[] T01T032_A30AlbProCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV103AlbDivCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV114GuiRemCli_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV104AlbDomEnv_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV117TrnCod_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV113DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV53TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV59TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV52WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class albaran__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaran__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaran__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaran__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaran__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01T02", "SELECT AlbProCod, AlbDomEnv, AlbProPri, AlbHorSal, AlbSec, AlbIvaCod, AlbTrnDm, AlbTrnNc, AlbTrnNm, AlbEnvFtp, AlbProAT, AlbGrossT, AlbHhfm, ALbFmdc, AlbFmd, AlbObsCb, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbFecSal, AlbNumT, AlbLic, AlbMarCo, AlbOComp, AlbUsu, AlbMarca, AlbCliDes, AlbMat, AlbLocDes, AlbLocCar, AlbDivTCod, AlbProEst, GuiRemDom, AlbProfch, AlbPObsCon, AlbPdATCUD, AlbPdSerAT, AlbPdTipAT, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbDomEnv, AlbProPri, AlbHorSal, AlbSec, AlbIvaCod, AlbTrnDm, AlbTrnNc, AlbTrnNm, AlbEnvFtp, AlbProAT, AlbGrossT, AlbHhfm, ALbFmdc, AlbFmd, AlbObsCb, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbFecSal, AlbNumT, AlbLic, AlbMarCo, AlbOComp, AlbUsu, AlbMarca, AlbCliDes, AlbMat, AlbLocDes, AlbLocCar, AlbDivTCod, AlbProEst, GuiRemDom, AlbProfch, AlbPObsCon, AlbPdATCUD, AlbPdSerAT, AlbPdTipAT, EmprGuiRem, GuiRemCli, TrnCod, AlbDivCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T03", "SELECT AlbProCod, AlbDomEnv, AlbProPri, AlbHorSal, AlbSec, AlbIvaCod, AlbTrnDm, AlbTrnNc, AlbTrnNm, AlbEnvFtp, AlbProAT, AlbGrossT, AlbHhfm, ALbFmdc, AlbFmd, AlbObsCb, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbFecSal, AlbNumT, AlbLic, AlbMarCo, AlbOComp, AlbUsu, AlbMarca, AlbCliDes, AlbMat, AlbLocDes, AlbLocCar, AlbDivTCod, AlbProEst, GuiRemDom, AlbProfch, AlbPObsCon, AlbPdATCUD, AlbPdSerAT, AlbPdTipAT, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T04", "SELECT CliDivTra AS GuiRemDivT, CliNom AS GuiRemCln, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T05", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T06", "SELECT TrnNif, TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T07", "SELECT TrnNif, TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T08", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T09", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T010", "SELECT /*+ FIRST_ROWS(100) */ T5.CliCod, T5.CliEnvLin, TM1.AlbProCod, TM1.AlbDomEnv, TM1.AlbProPri, TM1.AlbHorSal, TM1.AlbSec, T2.EmprNom, TM1.AlbIvaCod, TM1.AlbTrnDm, TM1.AlbTrnNc, TM1.AlbTrnNm, TM1.AlbEnvFtp, TM1.AlbProAT, TM1.AlbGrossT, TM1.AlbHhfm, TM1.ALbFmdc, TM1.AlbFmd, TM1.AlbObsCb, TM1.AlbColCa, TM1.AlbDesp, TM1.AlbCambio, TM1.AlbTipDoc, TM1.AlbMotTr, TM1.AlbTipCal, TM1.AlbFecSal, TM1.AlbNumT, TM1.AlbLic, TM1.AlbMarCo, TM1.AlbOComp, TM1.AlbUsu, TM1.AlbMarca, TM1.AlbCliDes, TM1.AlbMat, TM1.AlbLocDes, TM1.AlbLocCar, TM1.AlbDivTCod, T3.DivAbr AS AlbDivAbr, TM1.AlbProEst, TM1.GuiRemDom, T4.CliDivTra AS GuiRemDivT, T4.CliNom AS GuiRemCln, TM1.AlbProfch, TM1.AlbPObsCon, TM1.AlbPdATCUD, TM1.AlbPdSerAT, TM1.AlbPdTipAT, TM1.EmprGuiRem AS EmprGuiRem, TM1.GuiRemCli AS GuiRemCli, TM1.EmprCod, TM1.TrnCod, TM1.AlbDivCod AS AlbDivCod, T4.CliDivCod AS GuiRemDiv, COALESCE( T5.CliEnvLin, 0) AS BusDomEnv FROM ((((TXPCALPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPDIVISA T3 ON T3.DivCod = TM1.AlbDivCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprGuiRem AND T4.CliCod = TM1.GuiRemCli) LEFT JOIN TXPCLIENV T5 ON T5.EmprCod = TM1.EmprGuiRem AND T5.CliCod = TM1.GuiRemCli AND T5.CliEnvLin = TM1.AlbDomEnv) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T011", "SELECT TrnNif, TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T012", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T013", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T014", "SELECT CliDivTra AS GuiRemDivT, CliNom AS GuiRemCln, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T015", "SELECT TrnNif, TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T016", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T017", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( AlbProCod > ?) and EmprCod = ? ORDER BY EmprCod, AlbProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T018", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( AlbProCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, AlbProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01T019", "INSERT INTO TXPCALPRD(AlbProCod, AlbDomEnv, AlbProPri, AlbHorSal, AlbSec, AlbIvaCod, AlbTrnDm, AlbTrnNc, AlbTrnNm, AlbEnvFtp, AlbProAT, AlbGrossT, AlbHhfm, ALbFmdc, AlbFmd, AlbObsCb, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbFecSal, AlbNumT, AlbLic, AlbMarCo, AlbOComp, AlbUsu, AlbMarca, AlbCliDes, AlbMat, AlbLocDes, AlbLocCar, AlbDivTCod, AlbProEst, GuiRemDom, AlbProfch, AlbPObsCon, AlbPdATCUD, AlbPdSerAT, AlbPdTipAT, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod, AlbProEso, AlbProEnt, AlbProBon, AlbProTBo, AlbKilRea, AlbProNroF, AlbDomEv, DltUltob, FpgCod, AlbFecAnu, AlbUsuAnu, AlbHorAnu, AlbEnvMail) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01T020", "UPDATE TXPCALPRD SET AlbDomEnv=?, AlbProPri=?, AlbHorSal=?, AlbSec=?, AlbIvaCod=?, AlbTrnDm=?, AlbTrnNc=?, AlbTrnNm=?, AlbEnvFtp=?, AlbProAT=?, AlbGrossT=?, AlbHhfm=?, ALbFmdc=?, AlbFmd=?, AlbObsCb=?, AlbColCa=?, AlbDesp=?, AlbCambio=?, AlbTipDoc=?, AlbMotTr=?, AlbTipCal=?, AlbFecSal=?, AlbNumT=?, AlbLic=?, AlbMarCo=?, AlbOComp=?, AlbUsu=?, AlbMarca=?, AlbCliDes=?, AlbMat=?, AlbLocDes=?, AlbLocCar=?, AlbDivTCod=?, AlbProEst=?, GuiRemDom=?, AlbProfch=?, AlbPObsCon=?, AlbPdATCUD=?, AlbPdSerAT=?, AlbPdTipAT=?, EmprGuiRem=?, GuiRemCli=?, TrnCod=?, AlbDivCod=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01T021", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T01T022", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T023", "SELECT CliDivTra AS GuiRemDivT, CliNom AS GuiRemCln, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T024", "SELECT TrnNif, TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T025", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T026", "SELECT TrnNif, TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T027", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T028", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T029", "SELECT * FROM (SELECT EmprCod, AlbProCod, Alb_NFisca FROM TXPCNOTRE WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T030", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T031", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T032", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 60);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 60);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 255);
               ((String[]) buf[15])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 60);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,4);
               ((int[]) buf[21])[0] = rslt.getInt(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 25);
               ((byte[]) buf[23])[0] = rslt.getByte(22);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(23);
               ((long[]) buf[25])[0] = rslt.getLong(24);
               ((String[]) buf[26])[0] = rslt.getString(25, 20);
               ((String[]) buf[27])[0] = rslt.getString(26, 30);
               ((String[]) buf[28])[0] = rslt.getString(27, 30);
               ((String[]) buf[29])[0] = rslt.getString(28, 8);
               ((String[]) buf[30])[0] = rslt.getString(29, 1);
               ((int[]) buf[31])[0] = rslt.getInt(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 20);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((byte[]) buf[34])[0] = rslt.getByte(33);
               ((String[]) buf[35])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(35);
               ((byte[]) buf[38])[0] = rslt.getByte(36);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(37);
               ((byte[]) buf[41])[0] = rslt.getByte(38);
               ((String[]) buf[42])[0] = rslt.getString(39, 20);
               ((String[]) buf[43])[0] = rslt.getString(40, 20);
               ((String[]) buf[44])[0] = rslt.getString(41, 4);
               ((String[]) buf[45])[0] = rslt.getString(42, 3);
               ((int[]) buf[46])[0] = rslt.getInt(43);
               ((String[]) buf[47])[0] = rslt.getString(44, 3);
               ((short[]) buf[48])[0] = rslt.getShort(45);
               ((byte[]) buf[49])[0] = rslt.getByte(46);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 60);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 60);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 255);
               ((String[]) buf[15])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 60);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,4);
               ((int[]) buf[21])[0] = rslt.getInt(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 25);
               ((byte[]) buf[23])[0] = rslt.getByte(22);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(23);
               ((long[]) buf[25])[0] = rslt.getLong(24);
               ((String[]) buf[26])[0] = rslt.getString(25, 20);
               ((String[]) buf[27])[0] = rslt.getString(26, 30);
               ((String[]) buf[28])[0] = rslt.getString(27, 30);
               ((String[]) buf[29])[0] = rslt.getString(28, 8);
               ((String[]) buf[30])[0] = rslt.getString(29, 1);
               ((int[]) buf[31])[0] = rslt.getInt(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 20);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((byte[]) buf[34])[0] = rslt.getByte(33);
               ((String[]) buf[35])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(35);
               ((byte[]) buf[38])[0] = rslt.getByte(36);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(37);
               ((byte[]) buf[41])[0] = rslt.getByte(38);
               ((String[]) buf[42])[0] = rslt.getString(39, 20);
               ((String[]) buf[43])[0] = rslt.getString(40, 20);
               ((String[]) buf[44])[0] = rslt.getString(41, 4);
               ((String[]) buf[45])[0] = rslt.getString(42, 3);
               ((int[]) buf[46])[0] = rslt.getInt(43);
               ((String[]) buf[47])[0] = rslt.getString(44, 3);
               ((short[]) buf[48])[0] = rslt.getShort(45);
               ((byte[]) buf[49])[0] = rslt.getByte(46);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((String[]) buf[11])[0] = rslt.getString(10, 60);
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((String[]) buf[13])[0] = rslt.getString(12, 60);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 255);
               ((String[]) buf[19])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 60);
               ((String[]) buf[22])[0] = rslt.getString(20, 20);
               ((int[]) buf[23])[0] = rslt.getInt(21);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,4);
               ((int[]) buf[25])[0] = rslt.getInt(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 25);
               ((byte[]) buf[27])[0] = rslt.getByte(25);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(26);
               ((long[]) buf[29])[0] = rslt.getLong(27);
               ((String[]) buf[30])[0] = rslt.getString(28, 20);
               ((String[]) buf[31])[0] = rslt.getString(29, 30);
               ((String[]) buf[32])[0] = rslt.getString(30, 30);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
               ((String[]) buf[34])[0] = rslt.getString(32, 1);
               ((int[]) buf[35])[0] = rslt.getInt(33);
               ((String[]) buf[36])[0] = rslt.getString(34, 20);
               ((byte[]) buf[37])[0] = rslt.getByte(35);
               ((byte[]) buf[38])[0] = rslt.getByte(36);
               ((String[]) buf[39])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(38, 6);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((byte[]) buf[43])[0] = rslt.getByte(39);
               ((byte[]) buf[44])[0] = rslt.getByte(40);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(41, 1);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(42, 30);
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDate(43);
               ((byte[]) buf[50])[0] = rslt.getByte(44);
               ((String[]) buf[51])[0] = rslt.getString(45, 20);
               ((String[]) buf[52])[0] = rslt.getString(46, 20);
               ((String[]) buf[53])[0] = rslt.getString(47, 4);
               ((String[]) buf[54])[0] = rslt.getString(48, 3);
               ((int[]) buf[55])[0] = rslt.getInt(49);
               ((String[]) buf[56])[0] = rslt.getString(50, 3);
               ((short[]) buf[57])[0] = rslt.getShort(51);
               ((byte[]) buf[58])[0] = rslt.getByte(52);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((byte[]) buf[60])[0] = rslt.getByte(53);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((byte[]) buf[62])[0] = rslt.getByte(54);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 23 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setString(3, (String)parms[3], 1);
               stmt.setString(4, (String)parms[4], 8);
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 3);
               stmt.setString(7, (String)parms[7], 60);
               stmt.setString(8, (String)parms[8], 20);
               stmt.setString(9, (String)parms[9], 60);
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setString(11, (String)parms[11], 1);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[12], 2);
               stmt.setDateTime(13, (java.util.Date)parms[13], false);
               stmt.setString(14, (String)parms[14], 255);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[16], 255);
               }
               stmt.setString(16, (String)parms[17], 60);
               stmt.setString(17, (String)parms[18], 20);
               stmt.setInt(18, ((Number) parms[19]).intValue());
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[20], 4);
               stmt.setInt(20, ((Number) parms[21]).intValue());
               stmt.setString(21, (String)parms[22], 25);
               stmt.setByte(22, ((Number) parms[23]).byteValue());
               stmt.setDate(23, (java.util.Date)parms[24]);
               stmt.setLong(24, ((Number) parms[25]).longValue());
               stmt.setString(25, (String)parms[26], 20);
               stmt.setString(26, (String)parms[27], 30);
               stmt.setString(27, (String)parms[28], 30);
               stmt.setString(28, (String)parms[29], 8);
               stmt.setString(29, (String)parms[30], 1);
               stmt.setInt(30, ((Number) parms[31]).intValue());
               stmt.setString(31, (String)parms[32], 20);
               stmt.setByte(32, ((Number) parms[33]).byteValue());
               stmt.setByte(33, ((Number) parms[34]).byteValue());
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[36], 1);
               }
               stmt.setByte(35, ((Number) parms[37]).byteValue());
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(36, ((Number) parms[39]).byteValue());
               }
               stmt.setDate(37, (java.util.Date)parms[40]);
               stmt.setByte(38, ((Number) parms[41]).byteValue());
               stmt.setString(39, (String)parms[42], 20);
               stmt.setString(40, (String)parms[43], 20);
               stmt.setString(41, (String)parms[44], 4);
               stmt.setString(42, (String)parms[45], 3);
               stmt.setInt(43, ((Number) parms[46]).intValue());
               stmt.setString(44, (String)parms[47], 3);
               stmt.setShort(45, ((Number) parms[48]).shortValue());
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(46, ((Number) parms[50]).byteValue());
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setString(3, (String)parms[3], 8);
               stmt.setString(4, (String)parms[4], 1);
               stmt.setString(5, (String)parms[5], 3);
               stmt.setString(6, (String)parms[6], 60);
               stmt.setString(7, (String)parms[7], 20);
               stmt.setString(8, (String)parms[8], 60);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setString(10, (String)parms[10], 1);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               stmt.setDateTime(12, (java.util.Date)parms[12], false);
               stmt.setString(13, (String)parms[13], 255);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[15], 255);
               }
               stmt.setString(15, (String)parms[16], 60);
               stmt.setString(16, (String)parms[17], 20);
               stmt.setInt(17, ((Number) parms[18]).intValue());
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[19], 4);
               stmt.setInt(19, ((Number) parms[20]).intValue());
               stmt.setString(20, (String)parms[21], 25);
               stmt.setByte(21, ((Number) parms[22]).byteValue());
               stmt.setDate(22, (java.util.Date)parms[23]);
               stmt.setLong(23, ((Number) parms[24]).longValue());
               stmt.setString(24, (String)parms[25], 20);
               stmt.setString(25, (String)parms[26], 30);
               stmt.setString(26, (String)parms[27], 30);
               stmt.setString(27, (String)parms[28], 8);
               stmt.setString(28, (String)parms[29], 1);
               stmt.setInt(29, ((Number) parms[30]).intValue());
               stmt.setString(30, (String)parms[31], 20);
               stmt.setByte(31, ((Number) parms[32]).byteValue());
               stmt.setByte(32, ((Number) parms[33]).byteValue());
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[35], 1);
               }
               stmt.setByte(34, ((Number) parms[36]).byteValue());
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(35, ((Number) parms[38]).byteValue());
               }
               stmt.setDate(36, (java.util.Date)parms[39]);
               stmt.setByte(37, ((Number) parms[40]).byteValue());
               stmt.setString(38, (String)parms[41], 20);
               stmt.setString(39, (String)parms[42], 20);
               stmt.setString(40, (String)parms[43], 4);
               stmt.setString(41, (String)parms[44], 3);
               stmt.setInt(42, ((Number) parms[45]).intValue());
               stmt.setShort(43, ((Number) parms[46]).shortValue());
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(44, ((Number) parms[48]).byteValue());
               }
               stmt.setString(45, (String)parms[49], 3);
               stmt.setLong(46, ((Number) parms[50]).longValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               return;
      }
   }

}

