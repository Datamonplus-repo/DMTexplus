package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn06_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action61") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV45ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45ContCod", AV45ContCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         AV99HueAlb = (byte)(GXutil.lval( httpContext.GetPar( "HueAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99HueAlb", GXutil.str( AV99HueAlb, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_61_1L33( A396EmprCod, AV45ContCod, A30AlbProCod, A39AlbProPri, AV99HueAlb) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action62") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV45ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45ContCod", AV45ContCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         AV99HueAlb = (byte)(GXutil.lval( httpContext.GetPar( "HueAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99HueAlb", GXutil.str( AV99HueAlb, 1, 0));
         AV69FirmaD = (byte)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69FirmaD", GXutil.str( AV69FirmaD, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV69FirmaD), "9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_62_1L33( A396EmprCod, AV45ContCod, A30AlbProCod, A39AlbProPri, AV99HueAlb, AV69FirmaD) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action63") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV45ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45ContCod", AV45ContCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         AV99HueAlb = (byte)(GXutil.lval( httpContext.GetPar( "HueAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99HueAlb", GXutil.str( AV99HueAlb, 1, 0));
         AV69FirmaD = (byte)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69FirmaD", GXutil.str( AV69FirmaD, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV69FirmaD), "9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_63_1L33( A396EmprCod, AV45ContCod, A30AlbProCod, A39AlbProPri, AV99HueAlb, AV69FirmaD) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action64") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV45ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45ContCod", AV45ContCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         AV71FlagAlb = (byte)(GXutil.lval( httpContext.GetPar( "FlagAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71FlagAlb", GXutil.str( AV71FlagAlb, 1, 0));
         AV76FlagCont = (byte)(GXutil.lval( httpContext.GetPar( "FlagCont"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76FlagCont", GXutil.str( AV76FlagCont, 1, 0));
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_64_1L33( Gx_mode, A396EmprCod, AV45ContCod, A30AlbProCod, AV71FlagAlb, AV76FlagCont, A39AlbProPri) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action65") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3869AlbCliDes = (int)(GXutil.lval( httpContext.GetPar( "AlbCliDes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         AV73FlagCli = (byte)(GXutil.lval( httpContext.GetPar( "FlagCli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73FlagCli", GXutil.str( AV73FlagCli, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_65_1L33( A396EmprCod, A3869AlbCliDes, AV73FlagCli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action66") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         AV67Fch = localUtil.parseDateParm( httpContext.GetPar( "Fch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Fch", localUtil.format(AV67Fch, "99/99/99"));
         AV33AlbLast = (int)(GXutil.lval( httpContext.GetPar( "AlbLast"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33AlbLast), 8, 0));
         A34AlbProfch = localUtil.parseDateParm( httpContext.GetPar( "AlbProfch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         AV156Msg_f = httpContext.GetPar( "Msg_f") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV156Msg_f", AV156Msg_f);
         AV49Ctrlf = (byte)(GXutil.lval( httpContext.GetPar( "Ctrlf"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Ctrlf", GXutil.str( AV49Ctrlf, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_66_1L33( A396EmprCod, A39AlbProPri, AV67Fch, AV33AlbLast, A34AlbProfch, AV156Msg_f, AV49Ctrlf) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"GUIREMCLI") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaguiremcli1L30( A1253EmprGuiRem, A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ALBCLIDES") == 0 )
      {
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaalbclides1L30( A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1L30( A13738TrnCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"GUIREMCLI") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaguiremcli1L30( A1253EmprGuiRem, A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"GUIREMCLI") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         h1243GuiRemCli = httpContext.GetPar( "h1243GuiRemCli") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaguiremcli1L33( A1253EmprGuiRem, h1243GuiRemCli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ALBCLIDES") == 0 )
      {
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaalbclides1L30( A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"ALBCLIDES") == 0 )
      {
         h3869AlbCliDes = httpContext.GetPar( "h3869AlbCliDes") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaalbclides1L33( h3869AlbCliDes) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1L30( A13738TrnCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TRNCOD") == 0 )
      {
         h840TrnCod = httpContext.GetPar( "h840TrnCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcatrncod1L33( h840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"ALBIMPORTE") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asaalbimporte1L33( A396EmprCod, A30AlbProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"ALBLINEASA") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asaalblineasa1L33( A396EmprCod, A30AlbProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"ALBFACTURA") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asaalbfactura1L33( A396EmprCod, A30AlbProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel27"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa108351L33( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel28"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel29"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa108371L33( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel30"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel31"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa108361L33( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel32"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel33"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa22421L33( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel34"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel35"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel36"+"_"+"ALBHORSAL") == 0 )
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
         gx36asaalbhorsal1L33( A34AlbProfch, Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_81") == 0 )
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
         gxload_81( A1253EmprGuiRem, A1243GuiRemCli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_86") == 0 )
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
         gxload_86( A1253EmprGuiRem, A1243GuiRemCli, A1259AlbDomEnv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_84") == 0 )
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
         gxload_84( A1253EmprGuiRem, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_83") == 0 )
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
         gxload_83( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_85") == 0 )
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
         gxload_85( A3108AlbDivCod) ;
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
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            AV35AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35AlbProCod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35AlbProCod), "ZZZZZZZZZ9")));
            AV208AlbProPri = httpContext.GetPar( "AlbProPri") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV208AlbProPri", AV208AlbProPri);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV208AlbProPri, "9"))));
            AV194AlbSec = httpContext.GetPar( "AlbSec") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV194AlbSec", AV194AlbSec);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV194AlbSec, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Guias (Header)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttrn06_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn06_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn06_impl.class ));
   }

   public ttrn06_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbProPri = new HTMLChoice();
      cmbAlbProEst = new HTMLChoice();
      cmbAlbSec = new HTMLChoice();
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
      if ( cmbAlbProPri.getItemCount() > 0 )
      {
         A39AlbProPri = cmbAlbProPri.getValidValue(A39AlbProPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProPri.setValue( GXutil.rtrim( A39AlbProPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Values", cmbAlbProPri.ToJavascriptSource(), true);
      }
      if ( cmbAlbProEst.getItemCount() > 0 )
      {
         A33AlbProEst = (byte)(GXutil.lval( cmbAlbProEst.getValidValue(GXutil.trim( GXutil.str( A33AlbProEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProEst.setValue( GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Values", cmbAlbProEst.ToJavascriptSource(), true);
      }
      if ( cmbAlbSec.getItemCount() > 0 )
      {
         A2242AlbSec = cmbAlbSec.getValidValue(A2242AlbSec) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbSec.setValue( GXutil.rtrim( A2242AlbSec) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Values", cmbAlbSec.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Nº Guia", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,24);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProPri.getInternalname()+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProPri, cmbAlbProPri.getInternalname(), GXutil.rtrim( A39AlbProPri), 1, cmbAlbProPri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbProPri.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "", true, (byte)(0), "HLP_TTrn06.htm");
      cmbAlbProPri.setValue( GXutil.rtrim( A39AlbProPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Values", cmbAlbProPri.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProEst.getInternalname()+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProEst, cmbAlbProEst.getInternalname(), GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)), 1, cmbAlbProEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbProEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTrn06.htm");
      cmbAlbProEst.setValue( GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Values", cmbAlbProEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbsec_cell_Internalname, 1, 0, "px", 0, "px", divAlbsec_cell_Class, "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", cmbAlbSec.getVisible(), 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbSec.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbSec.getInternalname(), httpContext.getMessage( "Malha Acab?", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbSec, cmbAlbSec.getInternalname(), GXutil.rtrim( A2242AlbSec), 1, cmbAlbSec.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbAlbSec.getVisible(), cmbAlbSec.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, (byte)(0), "HLP_TTrn06.htm");
      cmbAlbSec.setValue( GXutil.rtrim( A2242AlbSec) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Values", cmbAlbSec.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProfch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProfch_Internalname, httpContext.getMessage( "Data", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbProfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProfch_Internalname, localUtil.format(A34AlbProfch, "99/99/99"), localUtil.format( A34AlbProfch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn06.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbFecSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbFecSal_Internalname, httpContext.getMessage( "Data Saida", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbFecSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbFecSal_Internalname, localUtil.format(A4023AlbFecSal, "99/99/99"), localUtil.format( A4023AlbFecSal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbFecSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbFecSal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbFecSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbFecSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn06.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHorSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHorSal_Internalname, httpContext.getMessage( "Hora Salida", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHorSal_Internalname, GXutil.rtrim( A3865AlbHorSal), GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHorSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHorSal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbUsu_Internalname, httpContext.getMessage( "Operador", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbUsu_Internalname, GXutil.rtrim( A7098AlbUsu), GXutil.rtrim( localUtil.format( A7098AlbUsu, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbUsu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCellFL RequiredDataContentCellFL", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiRemCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCli_Internalname, httpContext.getMessage( "Cliente", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, h1243GuiRemCli, GXutil.rtrim( localUtil.format( h1243GuiRemCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCli_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbCliDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbCliDes_Internalname, httpContext.getMessage( "Cliente Destino", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCliDes_Internalname, h3869AlbCliDes, GXutil.rtrim( localUtil.format( h3869AlbCliDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCliDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbCliDes_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDomEnv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDomEnv_Internalname, httpContext.getMessage( "Envio", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A1259AlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1259AlbDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A1259AlbDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+"EALBDOMENV.CLICK."+"'", "", "", "", "", edtAlbDomEnv_Jsonclick, 5, "AttributeFL", "", "", "", "", 1, edtAlbDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, h840TrnCod, GXutil.rtrim( localUtil.format( h840TrnCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbMat_Internalname, httpContext.getMessage( "Matricula", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMat_Internalname, GXutil.rtrim( A3868AlbMat), GXutil.rtrim( localUtil.format( A3868AlbMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup8_Internalname, httpContext.getMessage( "AT", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TTrn06.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbenvftp_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbenvftp_Internalname, "", "", "", lblTextblockalbenvftp_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbEnvFtp.getInternalname(), httpContext.getMessage( "Envio Albaran FTP", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbEnvFtp, cmbAlbEnvFtp.getInternalname(), GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)), 1, cmbAlbEnvFtp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbEnvFtp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTrn06.htm");
      cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealblic_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalblic_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblockalblic_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbLic_Internalname, httpContext.getMessage( "Licencia Conducir", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLic_Internalname, GXutil.rtrim( A7101AlbLic), GXutil.rtrim( localUtil.format( A7101AlbLic, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLic_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbLic_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbproat_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbproat_Internalname, "", "", "", lblTextblockalbproat_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbProAT.getInternalname(), httpContext.getMessage( "Manual o Automatico", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProAT, cmbAlbProAT.getInternalname(), GXutil.rtrim( A10765AlbProAT), 1, cmbAlbProAT.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbProAT.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TTrn06.htm");
      cmbAlbProAT.setValue( GXutil.rtrim( A10765AlbProAT) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Values", cmbAlbProAT.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbhhfm_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbhhfm_Internalname, httpContext.getMessage( "StartTime", ""), "", "", lblTextblockalbhhfm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHhfm_Internalname, httpContext.getMessage( "Hora Firma Digital", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbHhfm_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHhfm_Internalname, localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10019AlbHhfm, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHhfm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHhfm_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbHhfm_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbHhfm_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn06.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbgrosst_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbgrosst_Internalname, httpContext.getMessage( "Gross Total", ""), "", "", lblTextblockalbgrosst_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbGrossT_Internalname, httpContext.getMessage( "Total Bruto Firma", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbGrossT_Internalname, GXutil.ltrim( localUtil.ntoc( A10020AlbGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbGrossT_Enabled!=0) ? localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99") : localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbGrossT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbGrossT_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbfmd_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbfmd_Internalname, httpContext.getMessage( "Hash", ""), "", "", lblTextblockalbfmd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbFmd_Internalname, httpContext.getMessage( "Firma Digital", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Multiple line edit */
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAlbFmd_Internalname, A10017AlbFmd, "", "", (short)(0), 1, edtAlbFmd_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TTrn06.htm");
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
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, divUnnamedtable6_Visible, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbtrnnm_cell_Internalname, 1, 0, "px", 0, "px", divAlbtrnnm_cell_Class, "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbTrnNm_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTrnNm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTrnNm_Internalname, httpContext.getMessage( "Nome Transportista", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTrnNm_Internalname, GXutil.rtrim( A10835AlbTrnNm), GXutil.rtrim( localUtil.format( A10835AlbTrnNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTrnNm_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbTrnNm_Visible, edtAlbTrnNm_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbtrnnc_cell_Internalname, 1, 0, "px", 0, "px", divAlbtrnnc_cell_Class, "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbTrnNc_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTrnNc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTrnNc_Internalname, httpContext.getMessage( "N contribuiente", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTrnNc_Internalname, GXutil.rtrim( A10837AlbTrnNc), GXutil.rtrim( localUtil.format( A10837AlbTrnNc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTrnNc_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbTrnNc_Visible, edtAlbTrnNc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbtrndm_cell_Internalname, 1, 0, "px", 0, "px", divAlbtrndm_cell_Class, "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbTrnDm_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTrnDm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTrnDm_Internalname, httpContext.getMessage( "Morada Transportista", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTrnDm_Internalname, GXutil.rtrim( A10836AlbTrnDm), GXutil.rtrim( localUtil.format( A10836AlbTrnDm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTrnDm_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbTrnDm_Visible, edtAlbTrnDm_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn06.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn06.htm");
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
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtALbFmdc_Internalname, GXutil.rtrim( A10018ALbFmdc), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,165);\"", (short)(0), edtALbFmdc_Visible, edtALbFmdc_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMarca_Internalname, GXutil.rtrim( A5140AlbMarca), GXutil.rtrim( localUtil.format( A5140AlbMarca, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMarca_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbMarca_Visible, edtAlbMarca_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLocDes_Internalname, GXutil.ltrim( localUtil.ntoc( A3867AlbLocDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbLocDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3867AlbLocDes), "9") : localUtil.format( DecimalUtil.doubleToDec(A3867AlbLocDes), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,167);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLocDes_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbLocDes_Visible, edtAlbLocDes_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLocCar_Internalname, GXutil.ltrim( localUtil.ntoc( A3866AlbLocCar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbLocCar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3866AlbLocCar), "9") : localUtil.format( DecimalUtil.doubleToDec(A3866AlbLocCar), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,168);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLocCar_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbLocCar_Visible, edtAlbLocCar_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPObsCon_Internalname, GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPObsCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPObsCon_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbPObsCon_Visible, edtAlbPObsCon_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 170,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbIvaCod_Internalname, GXutil.rtrim( A5141AlbIvaCod), GXutil.rtrim( localUtil.format( A5141AlbIvaCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,170);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbIvaCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbIvaCod_Visible, edtAlbIvaCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbColCa_Internalname, GXutil.rtrim( A7987AlbColCa), GXutil.rtrim( localUtil.format( A7987AlbColCa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbColCa_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbColCa_Visible, edtAlbColCa_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDesp_Internalname, GXutil.ltrim( localUtil.ntoc( A7162AlbDesp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDesp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7162AlbDesp), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7162AlbDesp), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,172);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDesp_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDesp_Visible, edtAlbDesp_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCambio_Internalname, GXutil.ltrim( localUtil.ntoc( A7986AlbCambio, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbCambio_Enabled!=0) ? localUtil.format( A7986AlbCambio, "Z9.9999") : localUtil.format( A7986AlbCambio, "Z9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,173);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCambio_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbCambio_Visible, edtAlbCambio_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTipDoc_Internalname, GXutil.ltrim( localUtil.ntoc( A7985AlbTipDoc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbTipDoc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7985AlbTipDoc), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7985AlbTipDoc), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTipDoc_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbTipDoc_Visible, edtAlbTipDoc_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 175,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMotTr_Internalname, GXutil.rtrim( A7984AlbMotTr), GXutil.rtrim( localUtil.format( A7984AlbMotTr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,175);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMotTr_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbMotTr_Visible, edtAlbMotTr_Enabled, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTipCal_Internalname, GXutil.ltrim( localUtil.ntoc( A5803AlbTipCal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbTipCal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5803AlbTipCal), "9") : localUtil.format( DecimalUtil.doubleToDec(A5803AlbTipCal), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTipCal_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbTipCal_Visible, edtAlbTipCal_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 177,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbObsCb_Internalname, GXutil.rtrim( A7988AlbObsCb), GXutil.rtrim( localUtil.format( A7988AlbObsCb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,177);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbObsCb_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbObsCb_Visible, edtAlbObsCb_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumT_Internalname, GXutil.ltrim( localUtil.ntoc( A7102AlbNumT, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbNumT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7102AlbNumT), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7102AlbNumT), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,178);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumT_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbNumT_Visible, edtAlbNumT_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMarCo_Internalname, GXutil.rtrim( A7100AlbMarCo), GXutil.rtrim( localUtil.format( A7100AlbMarCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMarCo_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbMarCo_Visible, edtAlbMarCo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 180,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbOComp_Internalname, GXutil.rtrim( A7099AlbOComp), GXutil.rtrim( localUtil.format( A7099AlbOComp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,180);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbOComp_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbOComp_Visible, edtAlbOComp_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNif_Internalname, GXutil.rtrim( A3643TrnNif), GXutil.rtrim( localUtil.format( A3643TrnNif, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNif_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnNif_Visible, edtTrnNif_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 182,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDivTCod_Internalname, GXutil.rtrim( A3093AlbDivTCod), GXutil.rtrim( localUtil.format( A3093AlbDivTCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,182);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDivTCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDivTCod_Visible, edtAlbDivTCod_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDivAbr_Internalname, GXutil.rtrim( A3109AlbDivAbr), GXutil.rtrim( localUtil.format( A3109AlbDivAbr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDivAbr_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDivAbr_Visible, edtAlbDivAbr_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDivCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3108AlbDivCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDivCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDivCod_Visible, edtAlbDivCod_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBusDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A1260BusDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBusDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1260BusDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A1260BusDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBusDomEnv_Jsonclick, 0, "Attribute", "", "", "", "", edtBusDomEnv_Visible, edtBusDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprGuiRem_Internalname, GXutil.rtrim( A1253EmprGuiRem), GXutil.rtrim( localUtil.format( A1253EmprGuiRem, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprGuiRem_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprGuiRem_Visible, edtEmprGuiRem_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemDom_Internalname, GXutil.ltrim( localUtil.ntoc( A1258GuiRemDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiRemDom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1258GuiRemDom), "9") : localUtil.format( DecimalUtil.doubleToDec(A1258GuiRemDom), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,187);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemDom_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiRemDom_Visible, edtGuiRemDom_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemDivT_Internalname, GXutil.rtrim( A3145GuiRemDivT), GXutil.rtrim( localUtil.format( A3145GuiRemDivT, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemDivT_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiRemDivT_Visible, edtGuiRemDivT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemDiv_Internalname, GXutil.ltrim( localUtil.ntoc( A3110GuiRemDiv, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiRemDiv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3110GuiRemDiv), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3110GuiRemDiv), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemDiv_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiRemDiv_Visible, edtGuiRemDiv_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn06.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCln_Internalname, GXutil.rtrim( A1244GuiRemCln), GXutil.rtrim( localUtil.format( A1244GuiRemCln, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCln_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiRemCln_Visible, edtGuiRemCln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnNom_Visible, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn06.htm");
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
      e111L32 ();
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
            Z3865AlbHorSal = httpContext.cgiGet( "Z3865AlbHorSal") ;
            Z2242AlbSec = httpContext.cgiGet( "Z2242AlbSec") ;
            Z39AlbProPri = httpContext.cgiGet( "Z39AlbProPri") ;
            Z33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z33AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z34AlbProfch = localUtil.ctod( httpContext.cgiGet( "Z34AlbProfch"), 0) ;
            Z4023AlbFecSal = localUtil.ctod( httpContext.cgiGet( "Z4023AlbFecSal"), 0) ;
            Z7098AlbUsu = httpContext.cgiGet( "Z7098AlbUsu") ;
            Z3869AlbCliDes = (int)(localUtil.ctol( httpContext.cgiGet( "Z3869AlbCliDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1259AlbDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1259AlbDomEnv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3868AlbMat = httpContext.cgiGet( "Z3868AlbMat") ;
            Z5805AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5805AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7101AlbLic = httpContext.cgiGet( "Z7101AlbLic") ;
            Z10765AlbProAT = httpContext.cgiGet( "Z10765AlbProAT") ;
            Z10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( "Z10019AlbHhfm"), 0) ;
            Z10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( "Z10020AlbGrossT")) ;
            Z10837AlbTrnNc = httpContext.cgiGet( "Z10837AlbTrnNc") ;
            Z10017AlbFmd = httpContext.cgiGet( "Z10017AlbFmd") ;
            Z10835AlbTrnNm = httpContext.cgiGet( "Z10835AlbTrnNm") ;
            Z10018ALbFmdc = httpContext.cgiGet( "Z10018ALbFmdc") ;
            Z10836AlbTrnDm = httpContext.cgiGet( "Z10836AlbTrnDm") ;
            Z5140AlbMarca = httpContext.cgiGet( "Z5140AlbMarca") ;
            Z3867AlbLocDes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3867AlbLocDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3866AlbLocCar = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3866AlbLocCar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5141AlbIvaCod = httpContext.cgiGet( "Z5141AlbIvaCod") ;
            Z7987AlbColCa = httpContext.cgiGet( "Z7987AlbColCa") ;
            Z7162AlbDesp = (int)(localUtil.ctol( httpContext.cgiGet( "Z7162AlbDesp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7986AlbCambio = localUtil.ctond( httpContext.cgiGet( "Z7986AlbCambio")) ;
            Z7985AlbTipDoc = (int)(localUtil.ctol( httpContext.cgiGet( "Z7985AlbTipDoc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7984AlbMotTr = httpContext.cgiGet( "Z7984AlbMotTr") ;
            Z5803AlbTipCal = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5803AlbTipCal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7988AlbObsCb = httpContext.cgiGet( "Z7988AlbObsCb") ;
            Z7102AlbNumT = localUtil.ctol( httpContext.cgiGet( "Z7102AlbNumT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z7100AlbMarCo = httpContext.cgiGet( "Z7100AlbMarCo") ;
            Z7099AlbOComp = httpContext.cgiGet( "Z7099AlbOComp") ;
            Z3093AlbDivTCod = httpContext.cgiGet( "Z3093AlbDivTCod") ;
            Z1258GuiRemDom = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1258GuiRemDom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1253EmprGuiRem = httpContext.cgiGet( "Z1253EmprGuiRem") ;
            Z1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z1243GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3108AlbDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "N1243GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "N3108AlbDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N1253EmprGuiRem = httpContext.cgiGet( "N1253EmprGuiRem") ;
            N2242AlbSec = httpContext.cgiGet( "N2242AlbSec") ;
            AV149Modo = httpContext.cgiGet( "MODO") ;
            A14253AlbImporte = localUtil.ctond( httpContext.cgiGet( "ALBIMPORTE")) ;
            A14252AlbLineasA = (short)(localUtil.ctol( httpContext.cgiGet( "ALBLINEASA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14251AlbFactura = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBFACTURA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV35AlbProCod = localUtil.ctol( httpContext.cgiGet( "vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV203Insert_GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_GUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCGUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV204Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCTRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV205Insert_AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALBDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV206Insert_EmprGuiRem = httpContext.cgiGet( "vINSERT_EMPRGUIREM") ;
            AV194AlbSec = httpContext.cgiGet( "vALBSEC") ;
            AV149Modo = httpContext.cgiGet( "vMODO") ;
            AV65F_tinamar = (byte)(localUtil.ctol( httpContext.cgiGet( "vF_TINAMAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3869AlbCliDes = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCALBCLIDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV45ContCod = httpContext.cgiGet( "vCONTCOD") ;
            AV99HueAlb = (byte)(localUtil.ctol( httpContext.cgiGet( "vHUEALB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV69FirmaD = (byte)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV76FlagCont = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGCONT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV71FlagAlb = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGALB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV73FlagCli = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV156Msg_f = httpContext.cgiGet( "vMSG_F") ;
            AV33AlbLast = (int)(localUtil.ctol( httpContext.cgiGet( "vALBLAST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV67Fch = localUtil.ctod( httpContext.cgiGet( "vFCH"), 0) ;
            AV59F_carvema = (byte)(localUtil.ctol( httpContext.cgiGet( "vF_CARVEMA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV58F_albanu = (byte)(localUtil.ctol( httpContext.cgiGet( "vF_ALBANU"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37avisar = (byte)(localUtil.ctol( httpContext.cgiGet( "vAVISAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV217Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            /* Read variables values. */
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
            cmbAlbProPri.setValue( httpContext.cgiGet( cmbAlbProPri.getInternalname()) );
            A39AlbProPri = httpContext.cgiGet( cmbAlbProPri.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
            cmbAlbProEst.setValue( httpContext.cgiGet( cmbAlbProEst.getInternalname()) );
            A33AlbProEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProEst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
            cmbAlbSec.setValue( httpContext.cgiGet( cmbAlbSec.getInternalname()) );
            A2242AlbSec = httpContext.cgiGet( cmbAlbSec.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
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
            A7098AlbUsu = httpContext.cgiGet( edtAlbUsu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
            h1243GuiRemCli = httpContext.cgiGet( edtGuiRemCli_Internalname) ;
            h3869AlbCliDes = httpContext.cgiGet( edtAlbCliDes_Internalname) ;
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
            h840TrnCod = httpContext.cgiGet( edtTrnCod_Internalname) ;
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
            A10017AlbFmd = httpContext.cgiGet( edtAlbFmd_Internalname) ;
            n10017AlbFmd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
            A10835AlbTrnNm = httpContext.cgiGet( edtAlbTrnNm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10835AlbTrnNm", A10835AlbTrnNm);
            A10837AlbTrnNc = httpContext.cgiGet( edtAlbTrnNc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
            A10836AlbTrnDm = httpContext.cgiGet( edtAlbTrnDm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10836AlbTrnDm", A10836AlbTrnDm);
            A10018ALbFmdc = httpContext.cgiGet( edtALbFmdc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10018ALbFmdc", A10018ALbFmdc);
            A5140AlbMarca = httpContext.cgiGet( edtAlbMarca_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5140AlbMarca", A5140AlbMarca);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbLocDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbLocDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBLOCDES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbLocDes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3867AlbLocDes = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
            }
            else
            {
               A3867AlbLocDes = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbLocDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbLocCar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbLocCar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBLOCCAR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbLocCar_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3866AlbLocCar = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
            }
            else
            {
               A3866AlbLocCar = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbLocCar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPObsCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPObsCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPOBSCON");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbPObsCon_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A914AlbPObsCon = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
            }
            else
            {
               A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbPObsCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
            }
            A5141AlbIvaCod = GXutil.upper( httpContext.cgiGet( edtAlbIvaCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5141AlbIvaCod", A5141AlbIvaCod);
            A7987AlbColCa = httpContext.cgiGet( edtAlbColCa_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7987AlbColCa", A7987AlbColCa);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDesp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDesp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBDESP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbDesp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7162AlbDesp = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7162AlbDesp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7162AlbDesp), 6, 0));
            }
            else
            {
               A7162AlbDesp = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbDesp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7162AlbDesp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7162AlbDesp), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbCambio_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbCambio_Internalname)), DecimalUtil.stringToDec("99.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCAMBIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbCambio_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7986AlbCambio = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A7986AlbCambio", GXutil.ltrimstr( A7986AlbCambio, 7, 4));
            }
            else
            {
               A7986AlbCambio = localUtil.ctond( httpContext.cgiGet( edtAlbCambio_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7986AlbCambio", GXutil.ltrimstr( A7986AlbCambio, 7, 4));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBTIPDOC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbTipDoc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7985AlbTipDoc = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7985AlbTipDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7985AlbTipDoc), 8, 0));
            }
            else
            {
               A7985AlbTipDoc = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbTipDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7985AlbTipDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7985AlbTipDoc), 8, 0));
            }
            A7984AlbMotTr = httpContext.cgiGet( edtAlbMotTr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7984AlbMotTr", A7984AlbMotTr);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipCal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipCal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBTIPCAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbTipCal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5803AlbTipCal = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5803AlbTipCal", GXutil.str( A5803AlbTipCal, 1, 0));
            }
            else
            {
               A5803AlbTipCal = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbTipCal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5803AlbTipCal", GXutil.str( A5803AlbTipCal, 1, 0));
            }
            A7988AlbObsCb = httpContext.cgiGet( edtAlbObsCb_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7988AlbObsCb", A7988AlbObsCb);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBNUMT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbNumT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7102AlbNumT = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
            }
            else
            {
               A7102AlbNumT = localUtil.ctol( httpContext.cgiGet( edtAlbNumT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
            }
            A7100AlbMarCo = httpContext.cgiGet( edtAlbMarCo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7100AlbMarCo", A7100AlbMarCo);
            A7099AlbOComp = httpContext.cgiGet( edtAlbOComp_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7099AlbOComp", A7099AlbOComp);
            A3643TrnNif = GXutil.upper( httpContext.cgiGet( edtTrnNif_Internalname)) ;
            n3643TrnNif = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
            A3093AlbDivTCod = httpContext.cgiGet( edtAlbDivTCod_Internalname) ;
            n3093AlbDivTCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
            A3109AlbDivAbr = httpContext.cgiGet( edtAlbDivAbr_Internalname) ;
            n3109AlbDivAbr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
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
            A1260BusDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtBusDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1260BusDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
            A1253EmprGuiRem = GXutil.upper( httpContext.cgiGet( edtEmprGuiRem_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGuiRemDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGuiRemDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GUIREMDOM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGuiRemDom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1258GuiRemDom = (byte)(0) ;
               n1258GuiRemDom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
            }
            else
            {
               A1258GuiRemDom = (byte)(localUtil.ctol( httpContext.cgiGet( edtGuiRemDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1258GuiRemDom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
            }
            A3145GuiRemDivT = httpContext.cgiGet( edtGuiRemDivT_Internalname) ;
            n3145GuiRemDivT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
            A3110GuiRemDiv = (byte)(localUtil.ctol( httpContext.cgiGet( edtGuiRemDiv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3110GuiRemDiv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
            A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
            n841TrnNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTrn06");
            A10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( edtAlbHhfm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("AlbHhfm", localUtil.format( A10019AlbHhfm, "99/99/99 99:99"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV149Modo, "")));
            A33AlbProEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProEst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
            forbiddenHiddens.add("AlbProEst", localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"));
            A7098AlbUsu = httpContext.cgiGet( edtAlbUsu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
            forbiddenHiddens.add("AlbUsu", GXutil.rtrim( localUtil.format( A7098AlbUsu, "")));
            A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
            forbiddenHiddens.add("AlbEnvFtp", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9"));
            A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
            forbiddenHiddens.add("AlbLic", GXutil.rtrim( localUtil.format( A7101AlbLic, "")));
            A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
            forbiddenHiddens.add("AlbProAT", GXutil.rtrim( localUtil.format( A10765AlbProAT, "")));
            A10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( edtAlbGrossT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
            forbiddenHiddens.add("AlbGrossT", localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99"));
            A10017AlbFmd = httpContext.cgiGet( edtAlbFmd_Internalname) ;
            n10017AlbFmd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
            forbiddenHiddens.add("AlbFmd", GXutil.rtrim( localUtil.format( A10017AlbFmd, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A30AlbProCod != Z30AlbProCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttrn06:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               if ( ! (0==AV35AlbProCod) )
               {
                  A30AlbProCod = AV35AlbProCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               }
               else
               {
                  if ( ! isIns( )  )
                  {
                     A30AlbProCod = AV35AlbProCod ;
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
                  if ( ! (0==AV35AlbProCod) )
                  {
                     A30AlbProCod = AV35AlbProCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                  }
                  else
                  {
                     if ( ! isIns( )  )
                     {
                        A30AlbProCod = AV35AlbProCod ;
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
                        confirm_1L30( ) ;
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
                        e111L32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121L32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.FLUJOOBJETO") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e131L32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ALBDOMENV.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e141L32 ();
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
         e121L32 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1L33( ) ;
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
         disableAttributes1L33( ) ;
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

   public void confirm_1L30( )
   {
      beforeValidate1L33( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1L33( ) ;
         }
         else
         {
            checkExtendedTable1L33( ) ;
            closeExtendedTableCursors1L33( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1L30( )
   {
   }

   public void e111L32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttrn06_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn06_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrn06_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn06_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV65F_tinamar ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      AV65F_tinamar = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65F_tinamar", GXutil.str( AV65F_tinamar, 1, 0));
      GXv_int6[0] = AV99HueAlb ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HUEALB", ""), GXv_int6) ;
      ttrn06_impl.this.AV99HueAlb = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99HueAlb", GXutil.str( AV99HueAlb, 1, 0));
      GXv_int6[0] = AV177PrnAlb ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRNALB", ""), GXv_int6) ;
      ttrn06_impl.this.AV177PrnAlb = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV177PrnAlb", GXutil.str( AV177PrnAlb, 1, 0));
      GXv_int6[0] = AV81FlagGv ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GAVIM ", ""), GXv_int6) ;
      ttrn06_impl.this.AV81FlagGv = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81FlagGv", GXutil.str( AV81FlagGv, 1, 0));
      GXv_int6[0] = AV78FlagEtm ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM   ", ""), GXv_int6) ;
      ttrn06_impl.this.AV78FlagEtm = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78FlagEtm", GXutil.str( AV78FlagEtm, 1, 0));
      GXv_int6[0] = AV90FlagTintu ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      ttrn06_impl.this.AV90FlagTintu = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90FlagTintu", GXutil.str( AV90FlagTintu, 1, 0));
      GXv_int6[0] = AV58F_albanu ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBANU", ""), GXv_int6) ;
      ttrn06_impl.this.AV58F_albanu = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58F_albanu", GXutil.str( AV58F_albanu, 1, 0));
      GXv_int6[0] = AV180PwdGrl ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PWDGRE", ""), GXv_int6) ;
      ttrn06_impl.this.AV180PwdGrl = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV180PwdGrl", GXutil.str( AV180PwdGrl, 1, 0));
      GXv_int7[0] = AV46ContVal ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PWDGRE", ""), GXv_int7) ;
      ttrn06_impl.this.AV46ContVal = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ContVal), 8, 0));
      GXv_int6[0] = AV59F_carvema ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      ttrn06_impl.this.AV59F_carvema = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59F_carvema", GXutil.str( AV59F_carvema, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vF_CARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59F_carvema), "9")));
      GXv_int6[0] = AV63F_moda21 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      ttrn06_impl.this.AV63F_moda21 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63F_moda21", GXutil.str( AV63F_moda21, 1, 0));
      GXt_int5 = AV147Moda21 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      AV147Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV147Moda21", GXutil.str( AV147Moda21, 1, 0));
      GXt_int5 = AV54Erfoc ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      AV54Erfoc = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Erfoc", GXutil.str( AV54Erfoc, 1, 0));
      GXt_int5 = AV182Samofil ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SAMOFI", ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      AV182Samofil = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV182Samofil", GXutil.str( AV182Samofil, 1, 0));
      GXt_int5 = AV69FirmaD ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      AV69FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69FirmaD", GXutil.str( AV69FirmaD, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV69FirmaD), "9")));
      GXt_int5 = AV93granul ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRANUL", ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      AV93granul = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93granul", GXutil.str( AV93granul, 1, 0));
      GXt_int5 = AV193Ws ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "WSGR", ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      AV193Ws = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV193Ws", GXutil.str( AV193Ws, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV193Ws), "9")));
      GXt_int5 = AV162Nows ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOWS0", ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      AV162Nows = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV162Nows", GXutil.str( AV162Nows, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOWS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV162Nows), "9")));
      GXt_int5 = AV49Ctrlf ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTRDAT", ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      AV49Ctrlf = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Ctrlf", GXutil.str( AV49Ctrlf, 1, 0));
      GXt_int5 = AV148Modhh ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UPDHHS", ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      AV148Modhh = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV148Modhh", GXutil.str( AV148Modhh, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODHH", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV148Modhh), "9")));
      GXt_int5 = AV178PrnAT ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRNAT", ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      AV178PrnAT = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV178PrnAT", GXutil.str( AV178PrnAT, 1, 0));
      GXt_int5 = AV56errkgs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERRKGS", ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      AV56errkgs = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56errkgs", GXutil.str( AV56errkgs, 1, 0));
      GXt_int8 = AV37avisar ;
      GXv_int7[0] = GXt_int8 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ATAVIS", ""), GXv_int7) ;
      ttrn06_impl.this.GXt_int8 = GXv_int7[0] ;
      AV37avisar = (byte)(GXt_int8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37avisar", GXutil.str( AV37avisar, 1, 0));
      GXt_int5 = AV53Endutex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      AV53Endutex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Endutex", GXutil.str( AV53Endutex, 1, 0));
      GXv_int7[0] = AV196Copias ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "100005", GXv_int7) ;
      ttrn06_impl.this.AV196Copias = (short)((short)(GXv_int7[0])) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV196Copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV196Copias), 4, 0));
      AV196Copias = (short)(((AV196Copias==0) ? 1 : AV196Copias)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV196Copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV196Copias), 4, 0));
      AV197Copias2 = AV196Copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV197Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV197Copias2), 4, 0));
      cmbAlbSec.setVisible( (((AV65F_tinamar==1) ? true : false) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbSec.getVisible(), 5, 0), true);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttrn06_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttrn06_impl.this.AV10EmprCod = GXv_char4[0] ;
      ttrn06_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn06_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext9[0] = AV200WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV200WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
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
      AV201TrnContext.fromxml(AV202WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV201TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV217Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV218GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV218GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV218GXV1), 8, 0));
         while ( AV218GXV1 <= AV201TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV207TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV201TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV218GXV1));
            if ( GXutil.strcmp(AV207TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "GuiRemCli") == 0 )
            {
               AV203Insert_GuiRemCli = (int)(GXutil.lval( AV207TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV203Insert_GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV203Insert_GuiRemCli), 6, 0));
            }
            else if ( GXutil.strcmp(AV207TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV204Insert_TrnCod = (short)(GXutil.lval( AV207TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV204Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV204Insert_TrnCod), 4, 0));
            }
            else if ( GXutil.strcmp(AV207TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbDivCod") == 0 )
            {
               AV205Insert_AlbDivCod = (byte)(GXutil.lval( AV207TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV205Insert_AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV205Insert_AlbDivCod), 2, 0));
            }
            else if ( GXutil.strcmp(AV207TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "EmprGuiRem") == 0 )
            {
               AV206Insert_EmprGuiRem = AV207TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV206Insert_EmprGuiRem", AV206Insert_EmprGuiRem);
            }
            AV218GXV1 = (int)(AV218GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV218GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV218GXV1), 8, 0));
         }
      }
      edtALbFmdc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALbFmdc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbFmdc_Visible), 5, 0), true);
      edtAlbMarca_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMarca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMarca_Visible), 5, 0), true);
      edtAlbLocDes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLocDes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLocDes_Visible), 5, 0), true);
      edtAlbLocCar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLocCar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLocCar_Visible), 5, 0), true);
      edtAlbPObsCon_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Visible), 5, 0), true);
      edtAlbIvaCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbIvaCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbIvaCod_Visible), 5, 0), true);
      edtAlbColCa_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColCa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColCa_Visible), 5, 0), true);
      edtAlbDesp_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDesp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDesp_Visible), 5, 0), true);
      edtAlbCambio_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCambio_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCambio_Visible), 5, 0), true);
      edtAlbTipDoc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipDoc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipDoc_Visible), 5, 0), true);
      edtAlbMotTr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMotTr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMotTr_Visible), 5, 0), true);
      edtAlbTipCal_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipCal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipCal_Visible), 5, 0), true);
      edtAlbObsCb_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbObsCb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbObsCb_Visible), 5, 0), true);
      edtAlbNumT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumT_Visible), 5, 0), true);
      edtAlbMarCo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMarCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMarCo_Visible), 5, 0), true);
      edtAlbOComp_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbOComp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbOComp_Visible), 5, 0), true);
      edtTrnNif_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNif_Visible), 5, 0), true);
      edtAlbDivTCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDivTCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivTCod_Visible), 5, 0), true);
      edtAlbDivAbr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDivAbr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivAbr_Visible), 5, 0), true);
      edtAlbDivCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDivCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivCod_Visible), 5, 0), true);
      edtBusDomEnv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBusDomEnv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBusDomEnv_Visible), 5, 0), true);
      edtEmprGuiRem_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprGuiRem_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprGuiRem_Visible), 5, 0), true);
      edtGuiRemDom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemDom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemDom_Visible), 5, 0), true);
      edtGuiRemDivT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemDivT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemDivT_Visible), 5, 0), true);
      edtGuiRemDiv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemDiv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemDiv_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtGuiRemCln_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Visible), 5, 0), true);
      edtTrnNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Visible), 5, 0), true);
      AV45ContCod = ((GXutil.strcmp(AV208AlbProPri, "0")==0) ? "555555" : ((GXutil.strcmp(AV208AlbProPri, "1")==0) ? "666666" : " ")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45ContCod", AV45ContCod);
   }

   public void e121L32( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
      {
         /* Execute user subroutine: 'REGISTRAR PARAMETROS DE USO EN TTRN06DINAMICACALLS' */
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
         new app.ttrn06dinamicacalls(remoteHandle, context).execute( "TTrn06_Calls_000", A396EmprCod, A30AlbProCod, AV212SdtParametroCallsCollection.toJSonString(false)) ;
      }
      else
      {
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
      if ( 0 > 1 )
      {
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV201TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.ttrn06ww", new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
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
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV212SdtParametroCallsCollection", AV212SdtParametroCallsCollection);
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divAlbtrnnm_cell_Class = "DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbtrnnm_cell_Internalname, "Class", divAlbtrnnm_cell_Class, true);
      divAlbtrnnc_cell_Class = "DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbtrnnc_cell_Internalname, "Class", divAlbtrnnc_cell_Class, true);
      divAlbtrndm_cell_Class = "DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbtrndm_cell_Internalname, "Class", divAlbtrndm_cell_Class, true);
      divAlbsec_cell_Class = "DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbsec_cell_Internalname, "Class", divAlbsec_cell_Class, true);
   }

   public void e141L32( )
   {
      /* AlbDomEnv_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tclienvlevel1prompt", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A1243GuiRemCli,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A1259AlbDomEnv,1,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"InEmprCod","InCliCod","InOutCliEnvLin"}) , new Object[] {"A1259AlbDomEnv",""});
      /*  Sending Event outputs  */
   }

   public void e131L32( )
   {
      /* GlobalEvents_Flujoobjeto Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(AV214NombreDinamica, "TTrn06_Calls_005") == 0 ) && ! (GXutil.strcmp("", AV214NombreDinamica)==0) )
      {
         new app.ttrn06dinamicacalls(remoteHandle, context).execute( AV214NombreDinamica, A396EmprCod, A30AlbProCod, AV215SdtParametroCallsJSon) ;
      }
      else if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         callWebObject(formatLink("app.ttrn06", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV35AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV208AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV194AlbSec))}, new String[] {"Mode","EmprCod","AlbProCod","AlbProPri","AlbSec"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
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
   }

   public void S122( )
   {
      /* 'REGISTRAR PARAMETROS DE USO EN TTRN06DINAMICACALLS' Routine */
      returnInSub = false ;
      AV212SdtParametroCallsCollection.clear();
      AV213SdtParametroCalls = (app.SdtSdtParametroCalls)new app.SdtSdtParametroCalls(remoteHandle, context);
      AV213SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Nombreparametro( "F_carvema" );
      AV213SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Valorparametro( GXutil.str( AV59F_carvema, 1, 0) );
      AV212SdtParametroCallsCollection.add(AV213SdtParametroCalls, 0);
      AV213SdtParametroCalls = (app.SdtSdtParametroCalls)new app.SdtSdtParametroCalls(remoteHandle, context);
      AV213SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Nombreparametro( "FirmaD" );
      AV213SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Valorparametro( GXutil.str( AV69FirmaD, 1, 0) );
      AV212SdtParametroCallsCollection.add(AV213SdtParametroCalls, 0);
      AV213SdtParametroCalls = (app.SdtSdtParametroCalls)new app.SdtSdtParametroCalls(remoteHandle, context);
      AV213SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Nombreparametro( "Ws" );
      AV213SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Valorparametro( GXutil.str( AV193Ws, 1, 0) );
      AV212SdtParametroCallsCollection.add(AV213SdtParametroCalls, 0);
      AV213SdtParametroCalls = (app.SdtSdtParametroCalls)new app.SdtSdtParametroCalls(remoteHandle, context);
      AV213SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Nombreparametro( "Nows" );
      AV213SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Valorparametro( GXutil.str( AV162Nows, 1, 0) );
      AV212SdtParametroCallsCollection.add(AV213SdtParametroCalls, 0);
      AV213SdtParametroCalls = (app.SdtSdtParametroCalls)new app.SdtSdtParametroCalls(remoteHandle, context);
      AV213SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Nombreparametro( "Modhh" );
      AV213SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Valorparametro( GXutil.str( AV148Modhh, 1, 0) );
      AV212SdtParametroCallsCollection.add(AV213SdtParametroCalls, 0);
      AV213SdtParametroCalls = (app.SdtSdtParametroCalls)new app.SdtSdtParametroCalls(remoteHandle, context);
      AV213SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Nombreparametro( "ModoTRN" );
      AV213SdtParametroCalls.setgxTv_SdtSdtParametroCalls_Valorparametro( GXutil.trim( Gx_mode) );
      AV212SdtParametroCallsCollection.add(AV213SdtParametroCalls, 0);
   }

   public void zm1L33( int GX_JID )
   {
      if ( ( GX_JID == 80 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3865AlbHorSal = T01L33_A3865AlbHorSal[0] ;
            Z2242AlbSec = T01L33_A2242AlbSec[0] ;
            Z39AlbProPri = T01L33_A39AlbProPri[0] ;
            Z33AlbProEst = T01L33_A33AlbProEst[0] ;
            Z34AlbProfch = T01L33_A34AlbProfch[0] ;
            Z4023AlbFecSal = T01L33_A4023AlbFecSal[0] ;
            Z7098AlbUsu = T01L33_A7098AlbUsu[0] ;
            Z3869AlbCliDes = T01L33_A3869AlbCliDes[0] ;
            Z1259AlbDomEnv = T01L33_A1259AlbDomEnv[0] ;
            Z3868AlbMat = T01L33_A3868AlbMat[0] ;
            Z5805AlbEnvFtp = T01L33_A5805AlbEnvFtp[0] ;
            Z7101AlbLic = T01L33_A7101AlbLic[0] ;
            Z10765AlbProAT = T01L33_A10765AlbProAT[0] ;
            Z10019AlbHhfm = T01L33_A10019AlbHhfm[0] ;
            Z10020AlbGrossT = T01L33_A10020AlbGrossT[0] ;
            Z10837AlbTrnNc = T01L33_A10837AlbTrnNc[0] ;
            Z10017AlbFmd = T01L33_A10017AlbFmd[0] ;
            Z10835AlbTrnNm = T01L33_A10835AlbTrnNm[0] ;
            Z10018ALbFmdc = T01L33_A10018ALbFmdc[0] ;
            Z10836AlbTrnDm = T01L33_A10836AlbTrnDm[0] ;
            Z5140AlbMarca = T01L33_A5140AlbMarca[0] ;
            Z3867AlbLocDes = T01L33_A3867AlbLocDes[0] ;
            Z3866AlbLocCar = T01L33_A3866AlbLocCar[0] ;
            Z914AlbPObsCon = T01L33_A914AlbPObsCon[0] ;
            Z5141AlbIvaCod = T01L33_A5141AlbIvaCod[0] ;
            Z7987AlbColCa = T01L33_A7987AlbColCa[0] ;
            Z7162AlbDesp = T01L33_A7162AlbDesp[0] ;
            Z7986AlbCambio = T01L33_A7986AlbCambio[0] ;
            Z7985AlbTipDoc = T01L33_A7985AlbTipDoc[0] ;
            Z7984AlbMotTr = T01L33_A7984AlbMotTr[0] ;
            Z5803AlbTipCal = T01L33_A5803AlbTipCal[0] ;
            Z7988AlbObsCb = T01L33_A7988AlbObsCb[0] ;
            Z7102AlbNumT = T01L33_A7102AlbNumT[0] ;
            Z7100AlbMarCo = T01L33_A7100AlbMarCo[0] ;
            Z7099AlbOComp = T01L33_A7099AlbOComp[0] ;
            Z3093AlbDivTCod = T01L33_A3093AlbDivTCod[0] ;
            Z1258GuiRemDom = T01L33_A1258GuiRemDom[0] ;
            Z1253EmprGuiRem = T01L33_A1253EmprGuiRem[0] ;
            Z1243GuiRemCli = T01L33_A1243GuiRemCli[0] ;
            Z840TrnCod = T01L33_A840TrnCod[0] ;
            Z3108AlbDivCod = T01L33_A3108AlbDivCod[0] ;
         }
         else
         {
            Z3865AlbHorSal = A3865AlbHorSal ;
            Z2242AlbSec = A2242AlbSec ;
            Z39AlbProPri = A39AlbProPri ;
            Z33AlbProEst = A33AlbProEst ;
            Z34AlbProfch = A34AlbProfch ;
            Z4023AlbFecSal = A4023AlbFecSal ;
            Z7098AlbUsu = A7098AlbUsu ;
            Z3869AlbCliDes = A3869AlbCliDes ;
            Z1259AlbDomEnv = A1259AlbDomEnv ;
            Z3868AlbMat = A3868AlbMat ;
            Z5805AlbEnvFtp = A5805AlbEnvFtp ;
            Z7101AlbLic = A7101AlbLic ;
            Z10765AlbProAT = A10765AlbProAT ;
            Z10019AlbHhfm = A10019AlbHhfm ;
            Z10020AlbGrossT = A10020AlbGrossT ;
            Z10837AlbTrnNc = A10837AlbTrnNc ;
            Z10017AlbFmd = A10017AlbFmd ;
            Z10835AlbTrnNm = A10835AlbTrnNm ;
            Z10018ALbFmdc = A10018ALbFmdc ;
            Z10836AlbTrnDm = A10836AlbTrnDm ;
            Z5140AlbMarca = A5140AlbMarca ;
            Z3867AlbLocDes = A3867AlbLocDes ;
            Z3866AlbLocCar = A3866AlbLocCar ;
            Z914AlbPObsCon = A914AlbPObsCon ;
            Z5141AlbIvaCod = A5141AlbIvaCod ;
            Z7987AlbColCa = A7987AlbColCa ;
            Z7162AlbDesp = A7162AlbDesp ;
            Z7986AlbCambio = A7986AlbCambio ;
            Z7985AlbTipDoc = A7985AlbTipDoc ;
            Z7984AlbMotTr = A7984AlbMotTr ;
            Z5803AlbTipCal = A5803AlbTipCal ;
            Z7988AlbObsCb = A7988AlbObsCb ;
            Z7102AlbNumT = A7102AlbNumT ;
            Z7100AlbMarCo = A7100AlbMarCo ;
            Z7099AlbOComp = A7099AlbOComp ;
            Z3093AlbDivTCod = A3093AlbDivTCod ;
            Z1258GuiRemDom = A1258GuiRemDom ;
            Z1253EmprGuiRem = A1253EmprGuiRem ;
            Z1243GuiRemCli = A1243GuiRemCli ;
            Z840TrnCod = A840TrnCod ;
            Z3108AlbDivCod = A3108AlbDivCod ;
         }
      }
      if ( GX_JID == -80 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z3865AlbHorSal = A3865AlbHorSal ;
         Z2242AlbSec = A2242AlbSec ;
         Z39AlbProPri = A39AlbProPri ;
         Z33AlbProEst = A33AlbProEst ;
         Z34AlbProfch = A34AlbProfch ;
         Z4023AlbFecSal = A4023AlbFecSal ;
         Z7098AlbUsu = A7098AlbUsu ;
         Z3869AlbCliDes = A3869AlbCliDes ;
         Z1259AlbDomEnv = A1259AlbDomEnv ;
         Z3868AlbMat = A3868AlbMat ;
         Z5805AlbEnvFtp = A5805AlbEnvFtp ;
         Z7101AlbLic = A7101AlbLic ;
         Z10765AlbProAT = A10765AlbProAT ;
         Z10019AlbHhfm = A10019AlbHhfm ;
         Z10020AlbGrossT = A10020AlbGrossT ;
         Z10837AlbTrnNc = A10837AlbTrnNc ;
         Z10017AlbFmd = A10017AlbFmd ;
         Z10835AlbTrnNm = A10835AlbTrnNm ;
         Z10018ALbFmdc = A10018ALbFmdc ;
         Z10836AlbTrnDm = A10836AlbTrnDm ;
         Z5140AlbMarca = A5140AlbMarca ;
         Z3867AlbLocDes = A3867AlbLocDes ;
         Z3866AlbLocCar = A3866AlbLocCar ;
         Z914AlbPObsCon = A914AlbPObsCon ;
         Z5141AlbIvaCod = A5141AlbIvaCod ;
         Z7987AlbColCa = A7987AlbColCa ;
         Z7162AlbDesp = A7162AlbDesp ;
         Z7986AlbCambio = A7986AlbCambio ;
         Z7985AlbTipDoc = A7985AlbTipDoc ;
         Z7984AlbMotTr = A7984AlbMotTr ;
         Z5803AlbTipCal = A5803AlbTipCal ;
         Z7988AlbObsCb = A7988AlbObsCb ;
         Z7102AlbNumT = A7102AlbNumT ;
         Z7100AlbMarCo = A7100AlbMarCo ;
         Z7099AlbOComp = A7099AlbOComp ;
         Z3093AlbDivTCod = A3093AlbDivTCod ;
         Z1258GuiRemDom = A1258GuiRemDom ;
         Z1253EmprGuiRem = A1253EmprGuiRem ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z3108AlbDivCod = A3108AlbDivCod ;
         Z407EmprNom = A407EmprNom ;
         Z3109AlbDivAbr = A3109AlbDivAbr ;
         Z1244GuiRemCln = A1244GuiRemCln ;
         Z3145GuiRemDivT = A3145GuiRemDivT ;
         Z3110GuiRemDiv = A3110GuiRemDiv ;
         Z1260BusDomEnv = A1260BusDomEnv ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbHhfm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHhfm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHhfm_Enabled), 5, 0), true);
      edtAlbGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGrossT_Enabled), 5, 0), true);
      edtAlbFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFmd_Enabled), 5, 0), true);
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtAlbLic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Enabled), 5, 0), true);
      cmbAlbProAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProAT.getEnabled(), 5, 0), true);
      edtAlbUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUsu_Enabled), 5, 0), true);
      cmbAlbProEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProEst.getEnabled(), 5, 0), true);
      AV217Pgmname = "TTrn06" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV217Pgmname", AV217Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbHhfm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHhfm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHhfm_Enabled), 5, 0), true);
      edtAlbGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGrossT_Enabled), 5, 0), true);
      edtAlbFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFmd_Enabled), 5, 0), true);
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtAlbLic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Enabled), 5, 0), true);
      cmbAlbProAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProAT.getEnabled(), 5, 0), true);
      edtAlbUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUsu_Enabled), 5, 0), true);
      cmbAlbProPri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProPri.getEnabled(), 5, 0), true);
      cmbAlbProEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProEst.getEnabled(), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         A396EmprCod = AV10EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01L35 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01L35_A407EmprNom[0] ;
      n407EmprNom = T01L35_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(3);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbTrnNm_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNm_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divAlbtrnnm_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbtrnnm_cell_Internalname, "Class", divAlbtrnnm_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
         ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divAlbtrnnm_cell_Class = httpContext.getMessage( "DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbtrnnm_cell_Internalname, "Class", divAlbtrnnm_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbTrnNc_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNc_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divAlbtrnnc_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbtrnnc_cell_Internalname, "Class", divAlbtrnnc_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
         ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divAlbtrnnc_cell_Class = httpContext.getMessage( "DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbtrnnc_cell_Internalname, "Class", divAlbtrnnc_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbTrnDm_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnDm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnDm_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divAlbtrndm_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbtrndm_cell_Internalname, "Class", divAlbtrndm_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
         ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divAlbtrndm_cell_Class = httpContext.getMessage( "DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbtrndm_cell_Internalname, "Class", divAlbtrndm_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINAMA", ""), ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      cmbAlbSec.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbSec.getVisible(), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINAMA", ""), ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divAlbsec_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbsec_cell_Internalname, "Class", divAlbsec_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINAMA", ""), ""), GXv_int6) ;
         ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divAlbsec_cell_Class = httpContext.getMessage( "DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbsec_cell_Internalname, "Class", divAlbsec_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      ttrn06_impl.this.GXt_int5 = GXv_int6[0] ;
      divUnnamedtable6_Visible = (((GXt_int5==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable6_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable6_Visible), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV35AlbProCod) )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV204Insert_TrnCod) )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTrnCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV205Insert_AlbDivCod) )
      {
         edtAlbDivCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbDivCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV206Insert_EmprGuiRem)==0) )
      {
         edtEmprGuiRem_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprGuiRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprGuiRem_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprGuiRem_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprGuiRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprGuiRem_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( true )
      {
         cmbAlbProPri.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProPri.getEnabled(), 5, 0), true);
      }
      else
      {
         if ( isUpd( )  )
         {
            cmbAlbProPri.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProPri.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbAlbProPri.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProPri.getEnabled(), 5, 0), true);
         }
      }
      if ( isIns( )  )
      {
         AV149Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV149Modo", AV149Modo);
      }
      else
      {
         if ( isUpd( )  )
         {
            AV149Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV149Modo", AV149Modo);
         }
         else
         {
            if ( isDlt( )  )
            {
               AV149Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV149Modo", AV149Modo);
            }
         }
      }
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Use a função F9 para remover Guia", ""), 1, "");
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
         cmbAlbProPri.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProPri.getEnabled(), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV204Insert_TrnCod) )
      {
         A840TrnCod = AV204Insert_TrnCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         /* Using cursor T01L310 */
         pr_default.execute(8, new Object[] {Short.valueOf(A840TrnCod)});
         h840TrnCod = "" ;
         while ( (pr_default.getStatus(8) != 101) )
         {
            h840TrnCod = T01L310_A13738TrnCNom[0] ;
            if (true) break;
         }
         pr_default.close(8);
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV203Insert_GuiRemCli) )
      {
         A1243GuiRemCli = AV203Insert_GuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         /* Using cursor T01L311 */
         pr_default.execute(9, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         h1243GuiRemCli = "" ;
         while ( (pr_default.getStatus(9) != 101) )
         {
            h1243GuiRemCli = T01L311_A13735CliCNom[0] ;
            if (true) break;
         }
         pr_default.close(9);
         httpContext.ajax_rsp_assign_attri("", false, "h1243GuiRemCli", h1243GuiRemCli);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV203Insert_GuiRemCli) )
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
      if ( isUpd( )  && ( AV65F_tinamar == 0 ) )
      {
         cmbAlbSec.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbSec.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbAlbSec.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbSec.getEnabled(), 5, 0), true);
      }
      A2242AlbSec = AV194AlbSec ;
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      if ( ! (0==AV35AlbProCod) )
      {
         A30AlbProCod = AV35AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A30AlbProCod = AV35AlbProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         }
      }
      if ( ! (0==AV35AlbProCod) )
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV206Insert_EmprGuiRem)==0) )
      {
         A1253EmprGuiRem = AV206Insert_EmprGuiRem ;
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
      if ( isIns( )  && (GXutil.strcmp("", A7098AlbUsu)==0) && ( Gx_BScreen == 0 ) )
      {
         A7098AlbUsu = AV8UsurCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10765AlbProAT)==0) && ( Gx_BScreen == 0 ) )
      {
         A10765AlbProAT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A10019AlbHhfm) && ( Gx_BScreen == 0 ) )
      {
         A10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01L36 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01L36_A841TrnNom[0] ;
         n841TrnNom = T01L36_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A3643TrnNif = T01L36_A3643TrnNif[0] ;
         n3643TrnNif = T01L36_n3643TrnNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
         pr_default.close(5);
         GXt_decimal10 = A14253AlbImporte ;
         GXv_decimal11[0] = GXt_decimal10 ;
         new app.importedocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_decimal11) ;
         ttrn06_impl.this.GXt_decimal10 = GXv_decimal11[0] ;
         A14253AlbImporte = GXt_decimal10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrimstr( A14253AlbImporte, 15, 2));
         GXt_int12 = A14252AlbLineasA ;
         GXv_int13[0] = GXt_int12 ;
         new app.documentotransporteproduccion.haydatosalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int13) ;
         ttrn06_impl.this.GXt_int12 = GXv_int13[0] ;
         A14252AlbLineasA = GXt_int12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14252AlbLineasA), 4, 0));
         GXt_int12 = A14251AlbFactura ;
         GXv_int13[0] = GXt_int12 ;
         new app.facturacion.documentofacturable(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int13) ;
         ttrn06_impl.this.GXt_int12 = GXv_int13[0] ;
         A14251AlbFactura = (byte)(GXt_int12) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.str( A14251AlbFactura, 1, 0));
         /* Using cursor T01L34 */
         pr_default.execute(2, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01L34_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         A3145GuiRemDivT = T01L34_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = T01L34_n3145GuiRemDivT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
         A3110GuiRemDiv = T01L34_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = T01L34_n3110GuiRemDiv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
         pr_default.close(2);
         /* Using cursor T01L37 */
         pr_default.execute(5, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01L37_A841TrnNom[0] ;
         n841TrnNom = T01L37_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A3643TrnNif = T01L37_A3643TrnNif[0] ;
         n3643TrnNif = T01L37_n3643TrnNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
         pr_default.close(5);
      }
   }

   public void load1L33( )
   {
      /* Using cursor T01L312 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A3865AlbHorSal = T01L312_A3865AlbHorSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
         A2242AlbSec = T01L312_A2242AlbSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
         A39AlbProPri = T01L312_A39AlbProPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         A33AlbProEst = T01L312_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         A34AlbProfch = T01L312_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A4023AlbFecSal = T01L312_A4023AlbFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
         A7098AlbUsu = T01L312_A7098AlbUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
         A1244GuiRemCln = T01L312_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         A3869AlbCliDes = T01L312_A3869AlbCliDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         A1259AlbDomEnv = T01L312_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = T01L312_n1259AlbDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
         A3868AlbMat = T01L312_A3868AlbMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
         A5805AlbEnvFtp = T01L312_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = T01L312_A7101AlbLic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
         A10765AlbProAT = T01L312_A10765AlbProAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
         A10019AlbHhfm = T01L312_A10019AlbHhfm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10020AlbGrossT = T01L312_A10020AlbGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
         A10837AlbTrnNc = T01L312_A10837AlbTrnNc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
         A10017AlbFmd = T01L312_A10017AlbFmd[0] ;
         n10017AlbFmd = T01L312_n10017AlbFmd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
         A10835AlbTrnNm = T01L312_A10835AlbTrnNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10835AlbTrnNm", A10835AlbTrnNm);
         A10018ALbFmdc = T01L312_A10018ALbFmdc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10018ALbFmdc", A10018ALbFmdc);
         A10836AlbTrnDm = T01L312_A10836AlbTrnDm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10836AlbTrnDm", A10836AlbTrnDm);
         A5140AlbMarca = T01L312_A5140AlbMarca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5140AlbMarca", A5140AlbMarca);
         A3867AlbLocDes = T01L312_A3867AlbLocDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
         A3866AlbLocCar = T01L312_A3866AlbLocCar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
         A914AlbPObsCon = T01L312_A914AlbPObsCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         A5141AlbIvaCod = T01L312_A5141AlbIvaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5141AlbIvaCod", A5141AlbIvaCod);
         A7987AlbColCa = T01L312_A7987AlbColCa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7987AlbColCa", A7987AlbColCa);
         A7162AlbDesp = T01L312_A7162AlbDesp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7162AlbDesp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7162AlbDesp), 6, 0));
         A7986AlbCambio = T01L312_A7986AlbCambio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7986AlbCambio", GXutil.ltrimstr( A7986AlbCambio, 7, 4));
         A7985AlbTipDoc = T01L312_A7985AlbTipDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7985AlbTipDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7985AlbTipDoc), 8, 0));
         A7984AlbMotTr = T01L312_A7984AlbMotTr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7984AlbMotTr", A7984AlbMotTr);
         A5803AlbTipCal = T01L312_A5803AlbTipCal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5803AlbTipCal", GXutil.str( A5803AlbTipCal, 1, 0));
         A7988AlbObsCb = T01L312_A7988AlbObsCb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7988AlbObsCb", A7988AlbObsCb);
         A7102AlbNumT = T01L312_A7102AlbNumT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
         A7100AlbMarCo = T01L312_A7100AlbMarCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7100AlbMarCo", A7100AlbMarCo);
         A7099AlbOComp = T01L312_A7099AlbOComp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7099AlbOComp", A7099AlbOComp);
         A3093AlbDivTCod = T01L312_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = T01L312_n3093AlbDivTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
         A3109AlbDivAbr = T01L312_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = T01L312_n3109AlbDivAbr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
         A1258GuiRemDom = T01L312_A1258GuiRemDom[0] ;
         n1258GuiRemDom = T01L312_n1258GuiRemDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
         A3145GuiRemDivT = T01L312_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = T01L312_n3145GuiRemDivT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
         A407EmprNom = T01L312_A407EmprNom[0] ;
         n407EmprNom = T01L312_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1253EmprGuiRem = T01L312_A1253EmprGuiRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = T01L312_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A840TrnCod = T01L312_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3108AlbDivCod = T01L312_A3108AlbDivCod[0] ;
         n3108AlbDivCod = T01L312_n3108AlbDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         A3110GuiRemDiv = T01L312_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = T01L312_n3110GuiRemDiv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
         A1260BusDomEnv = T01L312_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01L312_n1260BusDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         zm1L33( -80) ;
      }
      pr_default.close(10);
      onLoadActions1L33( ) ;
   }

   public void onLoadActions1L33( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A3865AlbHorSal)==0) && true /* After */ )
      {
         GXt_char1 = A3865AlbHorSal ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = GXt_char1 ;
         new app.phragr3(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         ttrn06_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn06_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3865AlbHorSal = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
      }
      /* Using cursor T01L37 */
      pr_default.execute(5, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      A841TrnNom = T01L37_A841TrnNom[0] ;
      n841TrnNom = T01L37_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3643TrnNif = T01L37_A3643TrnNif[0] ;
      n3643TrnNif = T01L37_n3643TrnNif[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      pr_default.close(5);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV205Insert_AlbDivCod) )
      {
         A3108AlbDivCod = AV205Insert_AlbDivCod ;
         n3108AlbDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
      }
      else
      {
         if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
         {
            A3108AlbDivCod = (byte)(2) ;
            n3108AlbDivCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         }
         else
         {
            if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
            {
               A3108AlbDivCod = A3110GuiRemDiv ;
               n3108AlbDivCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
            }
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A3093AlbDivTCod = httpContext.getMessage( httpContext.getMessage( "E", ""), "") ;
         n3093AlbDivTCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
         {
            A3093AlbDivTCod = A3145GuiRemDivT ;
            n3093AlbDivTCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
         }
      }
      if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
      {
         A3869AlbCliDes = A1243GuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         /* Using cursor T01L313 */
         pr_default.execute(11, new Object[] {Integer.valueOf(A3869AlbCliDes)});
         h3869AlbCliDes = "" ;
         while ( (pr_default.getStatus(11) != 101) )
         {
            h3869AlbCliDes = T01L313_A13735CliCNom[0] ;
            if (true) break;
         }
         pr_default.close(11);
         httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
      }
      /* Using cursor T01L36 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      A841TrnNom = T01L36_A841TrnNom[0] ;
      n841TrnNom = T01L36_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3643TrnNif = T01L36_A3643TrnNif[0] ;
      n3643TrnNif = T01L36_n3643TrnNif[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      pr_default.close(5);
      GXt_decimal10 = A14253AlbImporte ;
      GXv_decimal11[0] = GXt_decimal10 ;
      new app.importedocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_decimal11) ;
      ttrn06_impl.this.GXt_decimal10 = GXv_decimal11[0] ;
      A14253AlbImporte = GXt_decimal10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrimstr( A14253AlbImporte, 15, 2));
      GXt_int12 = A14252AlbLineasA ;
      GXv_int13[0] = GXt_int12 ;
      new app.documentotransporteproduccion.haydatosalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int13) ;
      ttrn06_impl.this.GXt_int12 = GXv_int13[0] ;
      A14252AlbLineasA = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14252AlbLineasA), 4, 0));
      GXt_int12 = A14251AlbFactura ;
      GXv_int13[0] = GXt_int12 ;
      new app.facturacion.documentofacturable(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int13) ;
      ttrn06_impl.this.GXt_int12 = GXv_int13[0] ;
      A14251AlbFactura = (byte)(GXt_int12) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.str( A14251AlbFactura, 1, 0));
      /* Using cursor T01L314 */
      pr_default.execute(12, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      h1243GuiRemCli = "" ;
      while ( (pr_default.getStatus(12) != 101) )
      {
         h1243GuiRemCli = T01L314_A13735CliCNom[0] ;
         if (true) break;
      }
      pr_default.close(12);
      httpContext.ajax_rsp_assign_attri("", false, "h1243GuiRemCli", h1243GuiRemCli);
      /* Using cursor T01L315 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A3869AlbCliDes)});
      h3869AlbCliDes = "" ;
      while ( (pr_default.getStatus(13) != 101) )
      {
         h3869AlbCliDes = T01L315_A13735CliCNom[0] ;
         if (true) break;
      }
      pr_default.close(13);
      httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
      /* Using cursor T01L316 */
      pr_default.execute(14, new Object[] {Short.valueOf(A840TrnCod)});
      h840TrnCod = "" ;
      while ( (pr_default.getStatus(14) != 101) )
      {
         h840TrnCod = T01L316_A13738TrnCNom[0] ;
         if (true) break;
      }
      pr_default.close(14);
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
   }

   public void checkExtendedTable1L33( )
   {
      nIsDirty_3 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_3 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01L317 */
         pr_default.execute(15, new Object[] {A13738TrnCNom});
         A396EmprCod = T01L317_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = T01L317_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01L317_A840TrnCod[0] ;
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
      if ( ! (GXutil.strcmp("", A7101AlbLic)==0) && ( AV69FirmaD == 1 ) && ( isIns( )  || isUpd( )  || isDlt( )  ) && ( AV37avisar == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A3865AlbHorSal)==0) && true /* After */ )
      {
         nIsDirty_3 = (short)(1) ;
         GXt_char1 = A3865AlbHorSal ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = GXt_char1 ;
         new app.phragr3(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         ttrn06_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn06_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3865AlbHorSal = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
      }
      if ( true /* Level */ && true /* After */ && ( AV49Ctrlf == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A39AlbProPri ;
         GXv_int6[0] = (byte)(1) ;
         GXv_date14[0] = AV67Fch ;
         GXv_int7[0] = AV33AlbLast ;
         GXv_date15[0] = A34AlbProfch ;
         GXv_char2[0] = AV156Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_date14, GXv_int7, GXv_date15, GXv_char2) ;
         ttrn06_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn06_impl.this.A39AlbProPri = GXv_char3[0] ;
         ttrn06_impl.this.AV67Fch = GXv_date14[0] ;
         ttrn06_impl.this.AV33AlbLast = GXv_int7[0] ;
         ttrn06_impl.this.A34AlbProfch = GXv_date15[0] ;
         ttrn06_impl.this.AV156Msg_f = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV67Fch", localUtil.format(AV67Fch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV33AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33AlbLast), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV156Msg_f", AV156Msg_f);
      }
      if ( ( ( AV58F_albanu == 1 ) || ( AV69FirmaD == 1 ) ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia ANULADA", ""), 1, "ALBPROFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProfch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(AV156Msg_f, " ") != 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV156Msg_f, 1, "ALBPROFCH");
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
      /* Using cursor T01L34 */
      pr_default.execute(2, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1244GuiRemCln = T01L34_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A3145GuiRemDivT = T01L34_A3145GuiRemDivT[0] ;
      n3145GuiRemDivT = T01L34_n3145GuiRemDivT[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
      A3110GuiRemDiv = T01L34_A3110GuiRemDiv[0] ;
      n3110GuiRemDiv = T01L34_n3110GuiRemDiv[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
      pr_default.close(2);
      /* Using cursor T01L39 */
      pr_default.execute(7, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A1260BusDomEnv = T01L39_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01L39_n1260BusDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
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
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Endereço de entrega inexistente", ""), 1, "ALBDOMENV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbDomEnv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A1243GuiRemCli) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo del Cliente es requerido.", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A1243GuiRemCli == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente com valor 0 ¡¡¡", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && ! (0==A3869AlbCliDes) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A3869AlbCliDes ;
         GXv_int6[0] = AV73FlagCli ;
         new app.pexides(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6) ;
         ttrn06_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn06_impl.this.A3869AlbCliDes = GXv_int7[0] ;
         ttrn06_impl.this.AV73FlagCli = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV73FlagCli", GXutil.str( AV73FlagCli, 1, 0));
      }
      if ( ( AV73FlagCli == 0 ) && true /* Level */ && true /* After */ && ! (0==A3869AlbCliDes) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENÇÃO. Cliente de destino NÃO EXISTENTE", ""), 1, "ALBCLIDES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbCliDes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_3 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01L318 */
         pr_default.execute(16, new Object[] {A13738TrnCNom});
         A840TrnCod = T01L318_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01L318_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(16) == 101) ) )
         {
            pr_default.readNext(16);
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
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
         pr_default.close(16);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01L37 */
      pr_default.execute(5, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T01L37_A841TrnNom[0] ;
      n841TrnNom = T01L37_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3643TrnNif = T01L37_A3643TrnNif[0] ;
      n3643TrnNif = T01L37_n3643TrnNif[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      pr_default.close(5);
      if ( ! ( ( GXutil.strcmp(A2242AlbSec, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(A2242AlbSec, httpContext.getMessage( "N", "")) == 0 ) ) && ( AV65F_tinamar == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Incorrecto", ""), 1, "ALBSEC");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbSec.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV45ContCod ;
         GXv_int16[0] = A30AlbProCod ;
         GXv_int6[0] = AV71FlagAlb ;
         GXv_int17[0] = AV76FlagCont ;
         new app.putil10(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int16, GXv_int6, GXv_int17) ;
         ttrn06_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn06_impl.this.AV45ContCod = GXv_char3[0] ;
         ttrn06_impl.this.A30AlbProCod = GXv_int16[0] ;
         ttrn06_impl.this.AV71FlagAlb = GXv_int6[0] ;
         ttrn06_impl.this.AV76FlagCont = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV45ContCod", AV45ContCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV71FlagAlb", GXutil.str( AV71FlagAlb, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV76FlagCont", GXutil.str( AV76FlagCont, 1, 0));
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV71FlagAlb == 0 ) && ( AV59F_carvema == 0 ) && ( AV69FirmaD == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENÇÃO, Você vai criar um GUIA MANUALMENTE", ""), 0, "");
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV76FlagCont == 1 ) && ( AV59F_carvema == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERRO: tentamos REGISTRAR uma GUIA > CONTADOR manualmentee", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV69FirmaD == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERRO: tentamos REGISTRAR uma GUIA > CONTADOR manualmentee", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( A33AlbProEst == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia JÁ Faturada", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV205Insert_AlbDivCod) )
      {
         nIsDirty_3 = (short)(1) ;
         A3108AlbDivCod = AV205Insert_AlbDivCod ;
         n3108AlbDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
      }
      else
      {
         if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_3 = (short)(1) ;
            A3108AlbDivCod = (byte)(2) ;
            n3108AlbDivCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         }
         else
         {
            if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
            {
               nIsDirty_3 = (short)(1) ;
               A3108AlbDivCod = A3110GuiRemDiv ;
               n3108AlbDivCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
            }
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_3 = (short)(1) ;
         A3093AlbDivTCod = httpContext.getMessage( httpContext.getMessage( "E", ""), "") ;
         n3093AlbDivTCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_3 = (short)(1) ;
            A3093AlbDivTCod = A3145GuiRemDivT ;
            n3093AlbDivTCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
         }
      }
      if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_3 = (short)(1) ;
         A3869AlbCliDes = A1243GuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         /* Using cursor T01L319 */
         pr_default.execute(17, new Object[] {Integer.valueOf(A3869AlbCliDes)});
         h3869AlbCliDes = "" ;
         while ( (pr_default.getStatus(17) != 101) )
         {
            h3869AlbCliDes = T01L319_A13735CliCNom[0] ;
            if (true) break;
         }
         pr_default.close(17);
         httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
      }
      /* Using cursor T01L36 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01L36_A841TrnNom[0] ;
      n841TrnNom = T01L36_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3643TrnNif = T01L36_A3643TrnNif[0] ;
      n3643TrnNif = T01L36_n3643TrnNif[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      pr_default.close(5);
      nIsDirty_3 = (short)(1) ;
      GXt_decimal10 = A14253AlbImporte ;
      GXv_decimal11[0] = GXt_decimal10 ;
      new app.importedocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_decimal11) ;
      ttrn06_impl.this.GXt_decimal10 = GXv_decimal11[0] ;
      A14253AlbImporte = GXt_decimal10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrimstr( A14253AlbImporte, 15, 2));
      nIsDirty_3 = (short)(1) ;
      GXt_int12 = A14252AlbLineasA ;
      GXv_int13[0] = GXt_int12 ;
      new app.documentotransporteproduccion.haydatosalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int13) ;
      ttrn06_impl.this.GXt_int12 = GXv_int13[0] ;
      A14252AlbLineasA = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14252AlbLineasA), 4, 0));
      nIsDirty_3 = (short)(1) ;
      GXt_int12 = A14251AlbFactura ;
      GXv_int13[0] = GXt_int12 ;
      new app.facturacion.documentofacturable(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int13) ;
      ttrn06_impl.this.GXt_int12 = GXv_int13[0] ;
      A14251AlbFactura = (byte)(GXt_int12) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.str( A14251AlbFactura, 1, 0));
      /* Using cursor T01L38 */
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
      A3109AlbDivAbr = T01L38_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01L38_n3109AlbDivAbr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1L33( )
   {
      pr_default.close(2);
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_81( String A1253EmprGuiRem ,
                          int A1243GuiRemCli )
   {
      /* Using cursor T01L320 */
      pr_default.execute(18, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1244GuiRemCln = T01L320_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A3145GuiRemDivT = T01L320_A3145GuiRemDivT[0] ;
      n3145GuiRemDivT = T01L320_n3145GuiRemDivT[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
      A3110GuiRemDiv = T01L320_A3110GuiRemDiv[0] ;
      n3110GuiRemDiv = T01L320_n3110GuiRemDiv[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1244GuiRemCln))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3145GuiRemDivT))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3110GuiRemDiv, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_86( String A1253EmprGuiRem ,
                          int A1243GuiRemCli ,
                          byte A1259AlbDomEnv )
   {
      /* Using cursor T01L321 */
      pr_default.execute(19, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A1260BusDomEnv = T01L321_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01L321_n1260BusDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
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
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_84( String A1253EmprGuiRem ,
                          short A840TrnCod )
   {
      /* Using cursor T01L322 */
      pr_default.execute(20, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T01L322_A841TrnNom[0] ;
      n841TrnNom = T01L322_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3643TrnNif = T01L322_A3643TrnNif[0] ;
      n3643TrnNif = T01L322_n3643TrnNif[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3643TrnNif))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_83( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01L323 */
      pr_default.execute(21, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01L323_A841TrnNom[0] ;
      n841TrnNom = T01L323_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3643TrnNif = T01L323_A3643TrnNif[0] ;
      n3643TrnNif = T01L323_n3643TrnNif[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3643TrnNif))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void gxload_85( byte A3108AlbDivCod )
   {
      /* Using cursor T01L324 */
      pr_default.execute(22, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDivCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3109AlbDivAbr = T01L324_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01L324_n3109AlbDivAbr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3109AlbDivAbr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void getKey1L33( )
   {
      /* Using cursor T01L325 */
      pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01L33 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01L33_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1L33( 80) ;
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01L33_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A3865AlbHorSal = T01L33_A3865AlbHorSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
         A2242AlbSec = T01L33_A2242AlbSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
         A39AlbProPri = T01L33_A39AlbProPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         A33AlbProEst = T01L33_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         A34AlbProfch = T01L33_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A4023AlbFecSal = T01L33_A4023AlbFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
         A7098AlbUsu = T01L33_A7098AlbUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
         A3869AlbCliDes = T01L33_A3869AlbCliDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         A1259AlbDomEnv = T01L33_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = T01L33_n1259AlbDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
         A3868AlbMat = T01L33_A3868AlbMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
         A5805AlbEnvFtp = T01L33_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = T01L33_A7101AlbLic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
         A10765AlbProAT = T01L33_A10765AlbProAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
         A10019AlbHhfm = T01L33_A10019AlbHhfm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10020AlbGrossT = T01L33_A10020AlbGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
         A10837AlbTrnNc = T01L33_A10837AlbTrnNc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
         A10017AlbFmd = T01L33_A10017AlbFmd[0] ;
         n10017AlbFmd = T01L33_n10017AlbFmd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
         A10835AlbTrnNm = T01L33_A10835AlbTrnNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10835AlbTrnNm", A10835AlbTrnNm);
         A10018ALbFmdc = T01L33_A10018ALbFmdc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10018ALbFmdc", A10018ALbFmdc);
         A10836AlbTrnDm = T01L33_A10836AlbTrnDm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10836AlbTrnDm", A10836AlbTrnDm);
         A5140AlbMarca = T01L33_A5140AlbMarca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5140AlbMarca", A5140AlbMarca);
         A3867AlbLocDes = T01L33_A3867AlbLocDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
         A3866AlbLocCar = T01L33_A3866AlbLocCar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
         A914AlbPObsCon = T01L33_A914AlbPObsCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         A5141AlbIvaCod = T01L33_A5141AlbIvaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5141AlbIvaCod", A5141AlbIvaCod);
         A7987AlbColCa = T01L33_A7987AlbColCa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7987AlbColCa", A7987AlbColCa);
         A7162AlbDesp = T01L33_A7162AlbDesp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7162AlbDesp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7162AlbDesp), 6, 0));
         A7986AlbCambio = T01L33_A7986AlbCambio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7986AlbCambio", GXutil.ltrimstr( A7986AlbCambio, 7, 4));
         A7985AlbTipDoc = T01L33_A7985AlbTipDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7985AlbTipDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7985AlbTipDoc), 8, 0));
         A7984AlbMotTr = T01L33_A7984AlbMotTr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7984AlbMotTr", A7984AlbMotTr);
         A5803AlbTipCal = T01L33_A5803AlbTipCal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5803AlbTipCal", GXutil.str( A5803AlbTipCal, 1, 0));
         A7988AlbObsCb = T01L33_A7988AlbObsCb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7988AlbObsCb", A7988AlbObsCb);
         A7102AlbNumT = T01L33_A7102AlbNumT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
         A7100AlbMarCo = T01L33_A7100AlbMarCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7100AlbMarCo", A7100AlbMarCo);
         A7099AlbOComp = T01L33_A7099AlbOComp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7099AlbOComp", A7099AlbOComp);
         A3093AlbDivTCod = T01L33_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = T01L33_n3093AlbDivTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
         A1258GuiRemDom = T01L33_A1258GuiRemDom[0] ;
         n1258GuiRemDom = T01L33_n1258GuiRemDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
         A1253EmprGuiRem = T01L33_A1253EmprGuiRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = T01L33_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A840TrnCod = T01L33_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3108AlbDivCod = T01L33_A3108AlbDivCod[0] ;
         n3108AlbDivCod = T01L33_n3108AlbDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1L33( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey1L33( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey1L33( ) ;
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
      getKey1L33( ) ;
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
      /* Using cursor T01L326 */
      pr_default.execute(24, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(24) != 101) )
      {
         while ( (pr_default.getStatus(24) != 101) && ( ( T01L326_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T01L326_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(24);
         }
         if ( (pr_default.getStatus(24) != 101) && ( ( T01L326_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T01L326_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T01L326_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(24);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T01L327 */
      pr_default.execute(25, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(25) != 101) )
      {
         while ( (pr_default.getStatus(25) != 101) && ( ( T01L327_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T01L327_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(25);
         }
         if ( (pr_default.getStatus(25) != 101) && ( ( T01L327_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T01L327_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T01L327_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(25);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1L33( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1L33( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1L33( ) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1L33( ) ;
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
                  GX_FocusControl = edtAlbProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1L33( ) ;
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
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1L33( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h840TrnCod)==0) )
         {
            A840TrnCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A13738TrnCNom = h840TrnCod ;
            /* Using cursor T01L328 */
            pr_default.execute(26, new Object[] {A13738TrnCNom});
            A396EmprCod = T01L328_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A840TrnCod = T01L328_A840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A840TrnCod = T01L328_A840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            if ( ! ( (pr_default.getStatus(26) == 101) ) )
            {
               pr_default.readNext(26);
               if ( ! ( (pr_default.getStatus(26) == 101) ) )
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
            pr_default.close(26);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01L32 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3865AlbHorSal, T01L32_A3865AlbHorSal[0]) != 0 ) || ( GXutil.strcmp(Z2242AlbSec, T01L32_A2242AlbSec[0]) != 0 ) || ( GXutil.strcmp(Z39AlbProPri, T01L32_A39AlbProPri[0]) != 0 ) || ( Z33AlbProEst != T01L32_A33AlbProEst[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01L32_A34AlbProfch[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z4023AlbFecSal), GXutil.resetTime(T01L32_A4023AlbFecSal[0])) ) || ( GXutil.strcmp(Z7098AlbUsu, T01L32_A7098AlbUsu[0]) != 0 ) || ( Z3869AlbCliDes != T01L32_A3869AlbCliDes[0] ) || ( Z1259AlbDomEnv != T01L32_A1259AlbDomEnv[0] ) || ( GXutil.strcmp(Z3868AlbMat, T01L32_A3868AlbMat[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5805AlbEnvFtp != T01L32_A5805AlbEnvFtp[0] ) || ( GXutil.strcmp(Z7101AlbLic, T01L32_A7101AlbLic[0]) != 0 ) || ( GXutil.strcmp(Z10765AlbProAT, T01L32_A10765AlbProAT[0]) != 0 ) || !( GXutil.dateCompare(Z10019AlbHhfm, T01L32_A10019AlbHhfm[0]) ) || ( DecimalUtil.compareTo(Z10020AlbGrossT, T01L32_A10020AlbGrossT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10837AlbTrnNc, T01L32_A10837AlbTrnNc[0]) != 0 ) || ( GXutil.strcmp(Z10017AlbFmd, T01L32_A10017AlbFmd[0]) != 0 ) || ( GXutil.strcmp(Z10835AlbTrnNm, T01L32_A10835AlbTrnNm[0]) != 0 ) || ( GXutil.strcmp(Z10018ALbFmdc, T01L32_A10018ALbFmdc[0]) != 0 ) || ( GXutil.strcmp(Z10836AlbTrnDm, T01L32_A10836AlbTrnDm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5140AlbMarca, T01L32_A5140AlbMarca[0]) != 0 ) || ( Z3867AlbLocDes != T01L32_A3867AlbLocDes[0] ) || ( Z3866AlbLocCar != T01L32_A3866AlbLocCar[0] ) || ( Z914AlbPObsCon != T01L32_A914AlbPObsCon[0] ) || ( GXutil.strcmp(Z5141AlbIvaCod, T01L32_A5141AlbIvaCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7987AlbColCa, T01L32_A7987AlbColCa[0]) != 0 ) || ( Z7162AlbDesp != T01L32_A7162AlbDesp[0] ) || ( DecimalUtil.compareTo(Z7986AlbCambio, T01L32_A7986AlbCambio[0]) != 0 ) || ( Z7985AlbTipDoc != T01L32_A7985AlbTipDoc[0] ) || ( GXutil.strcmp(Z7984AlbMotTr, T01L32_A7984AlbMotTr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5803AlbTipCal != T01L32_A5803AlbTipCal[0] ) || ( GXutil.strcmp(Z7988AlbObsCb, T01L32_A7988AlbObsCb[0]) != 0 ) || ( Z7102AlbNumT != T01L32_A7102AlbNumT[0] ) || ( GXutil.strcmp(Z7100AlbMarCo, T01L32_A7100AlbMarCo[0]) != 0 ) || ( GXutil.strcmp(Z7099AlbOComp, T01L32_A7099AlbOComp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3093AlbDivTCod, T01L32_A3093AlbDivTCod[0]) != 0 ) || ( Z1258GuiRemDom != T01L32_A1258GuiRemDom[0] ) || ( GXutil.strcmp(Z1253EmprGuiRem, T01L32_A1253EmprGuiRem[0]) != 0 ) || ( Z1243GuiRemCli != T01L32_A1243GuiRemCli[0] ) || ( Z840TrnCod != T01L32_A840TrnCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3108AlbDivCod != T01L32_A3108AlbDivCod[0] ) )
         {
            if ( GXutil.strcmp(Z3865AlbHorSal, T01L32_A3865AlbHorSal[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbHorSal");
               GXutil.writeLogRaw("Old: ",Z3865AlbHorSal);
               GXutil.writeLogRaw("Current: ",T01L32_A3865AlbHorSal[0]);
            }
            if ( GXutil.strcmp(Z2242AlbSec, T01L32_A2242AlbSec[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbSec");
               GXutil.writeLogRaw("Old: ",Z2242AlbSec);
               GXutil.writeLogRaw("Current: ",T01L32_A2242AlbSec[0]);
            }
            if ( GXutil.strcmp(Z39AlbProPri, T01L32_A39AlbProPri[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbProPri");
               GXutil.writeLogRaw("Old: ",Z39AlbProPri);
               GXutil.writeLogRaw("Current: ",T01L32_A39AlbProPri[0]);
            }
            if ( Z33AlbProEst != T01L32_A33AlbProEst[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbProEst");
               GXutil.writeLogRaw("Old: ",Z33AlbProEst);
               GXutil.writeLogRaw("Current: ",T01L32_A33AlbProEst[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01L32_A34AlbProfch[0])) ) )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbProfch");
               GXutil.writeLogRaw("Old: ",Z34AlbProfch);
               GXutil.writeLogRaw("Current: ",T01L32_A34AlbProfch[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4023AlbFecSal), GXutil.resetTime(T01L32_A4023AlbFecSal[0])) ) )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbFecSal");
               GXutil.writeLogRaw("Old: ",Z4023AlbFecSal);
               GXutil.writeLogRaw("Current: ",T01L32_A4023AlbFecSal[0]);
            }
            if ( GXutil.strcmp(Z7098AlbUsu, T01L32_A7098AlbUsu[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbUsu");
               GXutil.writeLogRaw("Old: ",Z7098AlbUsu);
               GXutil.writeLogRaw("Current: ",T01L32_A7098AlbUsu[0]);
            }
            if ( Z3869AlbCliDes != T01L32_A3869AlbCliDes[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbCliDes");
               GXutil.writeLogRaw("Old: ",Z3869AlbCliDes);
               GXutil.writeLogRaw("Current: ",T01L32_A3869AlbCliDes[0]);
            }
            if ( Z1259AlbDomEnv != T01L32_A1259AlbDomEnv[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbDomEnv");
               GXutil.writeLogRaw("Old: ",Z1259AlbDomEnv);
               GXutil.writeLogRaw("Current: ",T01L32_A1259AlbDomEnv[0]);
            }
            if ( GXutil.strcmp(Z3868AlbMat, T01L32_A3868AlbMat[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbMat");
               GXutil.writeLogRaw("Old: ",Z3868AlbMat);
               GXutil.writeLogRaw("Current: ",T01L32_A3868AlbMat[0]);
            }
            if ( Z5805AlbEnvFtp != T01L32_A5805AlbEnvFtp[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbEnvFtp");
               GXutil.writeLogRaw("Old: ",Z5805AlbEnvFtp);
               GXutil.writeLogRaw("Current: ",T01L32_A5805AlbEnvFtp[0]);
            }
            if ( GXutil.strcmp(Z7101AlbLic, T01L32_A7101AlbLic[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbLic");
               GXutil.writeLogRaw("Old: ",Z7101AlbLic);
               GXutil.writeLogRaw("Current: ",T01L32_A7101AlbLic[0]);
            }
            if ( GXutil.strcmp(Z10765AlbProAT, T01L32_A10765AlbProAT[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbProAT");
               GXutil.writeLogRaw("Old: ",Z10765AlbProAT);
               GXutil.writeLogRaw("Current: ",T01L32_A10765AlbProAT[0]);
            }
            if ( !( GXutil.dateCompare(Z10019AlbHhfm, T01L32_A10019AlbHhfm[0]) ) )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbHhfm");
               GXutil.writeLogRaw("Old: ",Z10019AlbHhfm);
               GXutil.writeLogRaw("Current: ",T01L32_A10019AlbHhfm[0]);
            }
            if ( DecimalUtil.compareTo(Z10020AlbGrossT, T01L32_A10020AlbGrossT[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbGrossT");
               GXutil.writeLogRaw("Old: ",Z10020AlbGrossT);
               GXutil.writeLogRaw("Current: ",T01L32_A10020AlbGrossT[0]);
            }
            if ( GXutil.strcmp(Z10837AlbTrnNc, T01L32_A10837AlbTrnNc[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbTrnNc");
               GXutil.writeLogRaw("Old: ",Z10837AlbTrnNc);
               GXutil.writeLogRaw("Current: ",T01L32_A10837AlbTrnNc[0]);
            }
            if ( GXutil.strcmp(Z10017AlbFmd, T01L32_A10017AlbFmd[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbFmd");
               GXutil.writeLogRaw("Old: ",Z10017AlbFmd);
               GXutil.writeLogRaw("Current: ",T01L32_A10017AlbFmd[0]);
            }
            if ( GXutil.strcmp(Z10835AlbTrnNm, T01L32_A10835AlbTrnNm[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbTrnNm");
               GXutil.writeLogRaw("Old: ",Z10835AlbTrnNm);
               GXutil.writeLogRaw("Current: ",T01L32_A10835AlbTrnNm[0]);
            }
            if ( GXutil.strcmp(Z10018ALbFmdc, T01L32_A10018ALbFmdc[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"ALbFmdc");
               GXutil.writeLogRaw("Old: ",Z10018ALbFmdc);
               GXutil.writeLogRaw("Current: ",T01L32_A10018ALbFmdc[0]);
            }
            if ( GXutil.strcmp(Z10836AlbTrnDm, T01L32_A10836AlbTrnDm[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbTrnDm");
               GXutil.writeLogRaw("Old: ",Z10836AlbTrnDm);
               GXutil.writeLogRaw("Current: ",T01L32_A10836AlbTrnDm[0]);
            }
            if ( GXutil.strcmp(Z5140AlbMarca, T01L32_A5140AlbMarca[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbMarca");
               GXutil.writeLogRaw("Old: ",Z5140AlbMarca);
               GXutil.writeLogRaw("Current: ",T01L32_A5140AlbMarca[0]);
            }
            if ( Z3867AlbLocDes != T01L32_A3867AlbLocDes[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbLocDes");
               GXutil.writeLogRaw("Old: ",Z3867AlbLocDes);
               GXutil.writeLogRaw("Current: ",T01L32_A3867AlbLocDes[0]);
            }
            if ( Z3866AlbLocCar != T01L32_A3866AlbLocCar[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbLocCar");
               GXutil.writeLogRaw("Old: ",Z3866AlbLocCar);
               GXutil.writeLogRaw("Current: ",T01L32_A3866AlbLocCar[0]);
            }
            if ( Z914AlbPObsCon != T01L32_A914AlbPObsCon[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbPObsCon");
               GXutil.writeLogRaw("Old: ",Z914AlbPObsCon);
               GXutil.writeLogRaw("Current: ",T01L32_A914AlbPObsCon[0]);
            }
            if ( GXutil.strcmp(Z5141AlbIvaCod, T01L32_A5141AlbIvaCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbIvaCod");
               GXutil.writeLogRaw("Old: ",Z5141AlbIvaCod);
               GXutil.writeLogRaw("Current: ",T01L32_A5141AlbIvaCod[0]);
            }
            if ( GXutil.strcmp(Z7987AlbColCa, T01L32_A7987AlbColCa[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbColCa");
               GXutil.writeLogRaw("Old: ",Z7987AlbColCa);
               GXutil.writeLogRaw("Current: ",T01L32_A7987AlbColCa[0]);
            }
            if ( Z7162AlbDesp != T01L32_A7162AlbDesp[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbDesp");
               GXutil.writeLogRaw("Old: ",Z7162AlbDesp);
               GXutil.writeLogRaw("Current: ",T01L32_A7162AlbDesp[0]);
            }
            if ( DecimalUtil.compareTo(Z7986AlbCambio, T01L32_A7986AlbCambio[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbCambio");
               GXutil.writeLogRaw("Old: ",Z7986AlbCambio);
               GXutil.writeLogRaw("Current: ",T01L32_A7986AlbCambio[0]);
            }
            if ( Z7985AlbTipDoc != T01L32_A7985AlbTipDoc[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbTipDoc");
               GXutil.writeLogRaw("Old: ",Z7985AlbTipDoc);
               GXutil.writeLogRaw("Current: ",T01L32_A7985AlbTipDoc[0]);
            }
            if ( GXutil.strcmp(Z7984AlbMotTr, T01L32_A7984AlbMotTr[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbMotTr");
               GXutil.writeLogRaw("Old: ",Z7984AlbMotTr);
               GXutil.writeLogRaw("Current: ",T01L32_A7984AlbMotTr[0]);
            }
            if ( Z5803AlbTipCal != T01L32_A5803AlbTipCal[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbTipCal");
               GXutil.writeLogRaw("Old: ",Z5803AlbTipCal);
               GXutil.writeLogRaw("Current: ",T01L32_A5803AlbTipCal[0]);
            }
            if ( GXutil.strcmp(Z7988AlbObsCb, T01L32_A7988AlbObsCb[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbObsCb");
               GXutil.writeLogRaw("Old: ",Z7988AlbObsCb);
               GXutil.writeLogRaw("Current: ",T01L32_A7988AlbObsCb[0]);
            }
            if ( Z7102AlbNumT != T01L32_A7102AlbNumT[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbNumT");
               GXutil.writeLogRaw("Old: ",Z7102AlbNumT);
               GXutil.writeLogRaw("Current: ",T01L32_A7102AlbNumT[0]);
            }
            if ( GXutil.strcmp(Z7100AlbMarCo, T01L32_A7100AlbMarCo[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbMarCo");
               GXutil.writeLogRaw("Old: ",Z7100AlbMarCo);
               GXutil.writeLogRaw("Current: ",T01L32_A7100AlbMarCo[0]);
            }
            if ( GXutil.strcmp(Z7099AlbOComp, T01L32_A7099AlbOComp[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbOComp");
               GXutil.writeLogRaw("Old: ",Z7099AlbOComp);
               GXutil.writeLogRaw("Current: ",T01L32_A7099AlbOComp[0]);
            }
            if ( GXutil.strcmp(Z3093AlbDivTCod, T01L32_A3093AlbDivTCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbDivTCod");
               GXutil.writeLogRaw("Old: ",Z3093AlbDivTCod);
               GXutil.writeLogRaw("Current: ",T01L32_A3093AlbDivTCod[0]);
            }
            if ( Z1258GuiRemDom != T01L32_A1258GuiRemDom[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"GuiRemDom");
               GXutil.writeLogRaw("Old: ",Z1258GuiRemDom);
               GXutil.writeLogRaw("Current: ",T01L32_A1258GuiRemDom[0]);
            }
            if ( GXutil.strcmp(Z1253EmprGuiRem, T01L32_A1253EmprGuiRem[0]) != 0 )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"EmprGuiRem");
               GXutil.writeLogRaw("Old: ",Z1253EmprGuiRem);
               GXutil.writeLogRaw("Current: ",T01L32_A1253EmprGuiRem[0]);
            }
            if ( Z1243GuiRemCli != T01L32_A1243GuiRemCli[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"GuiRemCli");
               GXutil.writeLogRaw("Old: ",Z1243GuiRemCli);
               GXutil.writeLogRaw("Current: ",T01L32_A1243GuiRemCli[0]);
            }
            if ( Z840TrnCod != T01L32_A840TrnCod[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01L32_A840TrnCod[0]);
            }
            if ( Z3108AlbDivCod != T01L32_A3108AlbDivCod[0] )
            {
               GXutil.writeLogln("ttrn06:[seudo value changed for attri]"+"AlbDivCod");
               GXutil.writeLogRaw("Old: ",Z3108AlbDivCod);
               GXutil.writeLogRaw("Current: ",T01L32_A3108AlbDivCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1L33( )
   {
      beforeValidate1L33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L33( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1L33( 0) ;
         checkOptimisticConcurrency1L33( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L33( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1L33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L329 */
                  pr_default.execute(27, new Object[] {Long.valueOf(A30AlbProCod), A3865AlbHorSal, A2242AlbSec, A39AlbProPri, Byte.valueOf(A33AlbProEst), A34AlbProfch, A4023AlbFecSal, A7098AlbUsu, Integer.valueOf(A3869AlbCliDes), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), A3868AlbMat, Byte.valueOf(A5805AlbEnvFtp), A7101AlbLic, A10765AlbProAT, A10019AlbHhfm, A10020AlbGrossT, A10837AlbTrnNc, Boolean.valueOf(n10017AlbFmd), A10017AlbFmd, A10835AlbTrnNm, A10018ALbFmdc, A10836AlbTrnDm, A5140AlbMarca, Byte.valueOf(A3867AlbLocDes), Byte.valueOf(A3866AlbLocCar), Byte.valueOf(A914AlbPObsCon), A5141AlbIvaCod, A7987AlbColCa, Integer.valueOf(A7162AlbDesp), A7986AlbCambio, Integer.valueOf(A7985AlbTipDoc), A7984AlbMotTr, Byte.valueOf(A5803AlbTipCal), A7988AlbObsCb, Long.valueOf(A7102AlbNumT), A7100AlbMarCo, A7099AlbOComp, Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, Boolean.valueOf(n1258GuiRemDom), Byte.valueOf(A1258GuiRemDom), A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), A396EmprCod, Short.valueOf(A840TrnCod), Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(27) == 1) )
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
            load1L33( ) ;
         }
         endLevel1L33( ) ;
      }
      closeExtendedTableCursors1L33( ) ;
   }

   public void update1L33( )
   {
      beforeValidate1L33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L33( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L33( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L33( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1L33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L330 */
                  pr_default.execute(28, new Object[] {A3865AlbHorSal, A2242AlbSec, A39AlbProPri, Byte.valueOf(A33AlbProEst), A34AlbProfch, A4023AlbFecSal, A7098AlbUsu, Integer.valueOf(A3869AlbCliDes), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), A3868AlbMat, Byte.valueOf(A5805AlbEnvFtp), A7101AlbLic, A10765AlbProAT, A10019AlbHhfm, A10020AlbGrossT, A10837AlbTrnNc, Boolean.valueOf(n10017AlbFmd), A10017AlbFmd, A10835AlbTrnNm, A10018ALbFmdc, A10836AlbTrnDm, A5140AlbMarca, Byte.valueOf(A3867AlbLocDes), Byte.valueOf(A3866AlbLocCar), Byte.valueOf(A914AlbPObsCon), A5141AlbIvaCod, A7987AlbColCa, Integer.valueOf(A7162AlbDesp), A7986AlbCambio, Integer.valueOf(A7985AlbTipDoc), A7984AlbMotTr, Byte.valueOf(A5803AlbTipCal), A7988AlbObsCb, Long.valueOf(A7102AlbNumT), A7100AlbMarCo, A7099AlbOComp, Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, Boolean.valueOf(n1258GuiRemDom), Byte.valueOf(A1258GuiRemDom), A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Short.valueOf(A840TrnCod), Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(28) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1L33( ) ;
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
         endLevel1L33( ) ;
      }
      closeExtendedTableCursors1L33( ) ;
   }

   public void deferredUpdate1L33( )
   {
   }

   public void delete( )
   {
      beforeValidate1L33( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L33( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1L33( ) ;
         afterConfirm1L33( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1L33( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01L331 */
               pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
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
      endLevel1L33( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1L33( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = AV45ContCod ;
            GXv_int16[0] = A30AlbProCod ;
            GXv_int17[0] = AV71FlagAlb ;
            GXv_int6[0] = AV76FlagCont ;
            new app.putil10(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int16, GXv_int17, GXv_int6) ;
            ttrn06_impl.this.A396EmprCod = GXv_char4[0] ;
            ttrn06_impl.this.AV45ContCod = GXv_char3[0] ;
            ttrn06_impl.this.A30AlbProCod = GXv_int16[0] ;
            ttrn06_impl.this.AV71FlagAlb = GXv_int17[0] ;
            ttrn06_impl.this.AV76FlagCont = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV45ContCod", AV45ContCod);
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV71FlagAlb", GXutil.str( AV71FlagAlb, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV76FlagCont", GXutil.str( AV76FlagCont, 1, 0));
         }
         if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV71FlagAlb == 0 ) && ( AV59F_carvema == 0 ) && ( AV69FirmaD == 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENÇÃO, Você vai criar um GUIA MANUALMENTE", ""), 0, "");
         }
         if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV76FlagCont == 1 ) && ( AV59F_carvema == 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERRO: tentamos REGISTRAR uma GUIA > CONTADOR manualmentee", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV69FirmaD == 1 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERRO: tentamos REGISTRAR uma GUIA > CONTADOR manualmentee", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( ! (GXutil.strcmp("", A7101AlbLic)==0) && ( AV69FirmaD == 1 ) && ( isIns( )  || isUpd( )  || isDlt( )  ) && ( AV37avisar == 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""), 1, "");
            AnyError = (short)(1) ;
         }
         /* Using cursor T01L332 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
         A3109AlbDivAbr = T01L332_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = T01L332_n3109AlbDivAbr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
         pr_default.close(30);
         /* Using cursor T01L333 */
         pr_default.execute(31, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01L333_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         A3145GuiRemDivT = T01L333_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = T01L333_n3145GuiRemDivT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
         A3110GuiRemDiv = T01L333_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = T01L333_n3110GuiRemDiv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
         pr_default.close(31);
         /* Using cursor T01L334 */
         pr_default.execute(32, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01L334_A841TrnNom[0] ;
         n841TrnNom = T01L334_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A3643TrnNif = T01L334_A3643TrnNif[0] ;
         n3643TrnNif = T01L334_n3643TrnNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
         pr_default.close(32);
         /* Using cursor T01L335 */
         pr_default.execute(33, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            A1260BusDomEnv = T01L335_A1260BusDomEnv[0] ;
            n1260BusDomEnv = T01L335_n1260BusDomEnv[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         }
         else
         {
            A1260BusDomEnv = (byte)(0) ;
            n1260BusDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         }
         pr_default.close(33);
         /* Using cursor T01L336 */
         pr_default.execute(34, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01L336_A841TrnNom[0] ;
         n841TrnNom = T01L336_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A3643TrnNif = T01L336_A3643TrnNif[0] ;
         n3643TrnNif = T01L336_n3643TrnNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
         pr_default.close(34);
         GXt_decimal10 = A14253AlbImporte ;
         GXv_decimal11[0] = GXt_decimal10 ;
         new app.importedocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_decimal11) ;
         ttrn06_impl.this.GXt_decimal10 = GXv_decimal11[0] ;
         A14253AlbImporte = GXt_decimal10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrimstr( A14253AlbImporte, 15, 2));
         GXt_int12 = A14252AlbLineasA ;
         GXv_int13[0] = GXt_int12 ;
         new app.documentotransporteproduccion.haydatosalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int13) ;
         ttrn06_impl.this.GXt_int12 = GXv_int13[0] ;
         A14252AlbLineasA = GXt_int12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14252AlbLineasA), 4, 0));
         GXt_int12 = A14251AlbFactura ;
         GXv_int13[0] = GXt_int12 ;
         new app.facturacion.documentofacturable(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int13) ;
         ttrn06_impl.this.GXt_int12 = GXv_int13[0] ;
         A14251AlbFactura = (byte)(GXt_int12) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.str( A14251AlbFactura, 1, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01L337 */
         pr_default.execute(35, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Observaciones ALBARAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01L338 */
         pr_default.execute(36, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Hdrs Albaran", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01L339 */
         pr_default.execute(37, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CNOTRET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01L340 */
         pr_default.execute(38, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01L341 */
         pr_default.execute(39, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
      }
   }

   public void endLevel1L33( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1L33( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn06");
         if ( AnyError == 0 )
         {
            confirmValues1L30( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn06");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1L33( )
   {
      /* Scan By routine */
      /* Using cursor T01L342 */
      pr_default.execute(40, new Object[] {A396EmprCod});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01L342_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1L33( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01L342_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void scanEnd1L33( )
   {
      pr_default.close(40);
   }

   public void afterConfirm1L33( )
   {
      /* After Confirm Rules */
      if ( (0==A30AlbProCod) && true /* Level */ && true /* After */ && ( AV99HueAlb == 1 ) && ( AV69FirmaD == 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV45ContCod ;
         GXv_int7[0] = (int)(A30AlbProCod) ;
         GXv_char2[0] = A39AlbProPri ;
         new app.pnumalb(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7, GXv_char2) ;
         ttrn06_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn06_impl.this.AV45ContCod = GXv_char3[0] ;
         ttrn06_impl.this.A30AlbProCod = GXv_int7[0] ;
         ttrn06_impl.this.A39AlbProPri = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV45ContCod", AV45ContCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      }
      if ( (0==A30AlbProCod) && true /* Level */ && true /* After */ && (0==AV99HueAlb) )
      {
         GXv_int7[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV45ContCod, GXv_int7) ;
         ttrn06_impl.this.A30AlbProCod = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      if ( (0==A30AlbProCod) && true /* Level */ && true /* After */ && ! ( (0==AV99HueAlb) || ( ( AV99HueAlb == 1 ) && ( AV69FirmaD == 0 ) ) ) )
      {
         GXv_int7[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV45ContCod, GXv_int7) ;
         ttrn06_impl.this.A30AlbProCod = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void beforeInsert1L33( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1L33( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1L33( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1L33( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1L33( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1L33( )
   {
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      cmbAlbProPri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProPri.getEnabled(), 5, 0), true);
      cmbAlbProEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProEst.getEnabled(), 5, 0), true);
      cmbAlbSec.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbSec.getEnabled(), 5, 0), true);
      edtAlbProfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Enabled), 5, 0), true);
      edtAlbFecSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFecSal_Enabled), 5, 0), true);
      edtAlbHorSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHorSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHorSal_Enabled), 5, 0), true);
      edtAlbUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUsu_Enabled), 5, 0), true);
      edtGuiRemCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      edtAlbCliDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCliDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCliDes_Enabled), 5, 0), true);
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
      edtAlbFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFmd_Enabled), 5, 0), true);
      edtAlbTrnNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNm_Enabled), 5, 0), true);
      edtAlbTrnNc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNc_Enabled), 5, 0), true);
      edtAlbTrnDm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnDm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnDm_Enabled), 5, 0), true);
      edtALbFmdc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALbFmdc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbFmdc_Enabled), 5, 0), true);
      edtAlbMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMarca_Enabled), 5, 0), true);
      edtAlbLocDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLocDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLocDes_Enabled), 5, 0), true);
      edtAlbLocCar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLocCar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLocCar_Enabled), 5, 0), true);
      edtAlbPObsCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Enabled), 5, 0), true);
      edtAlbIvaCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbIvaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbIvaCod_Enabled), 5, 0), true);
      edtAlbColCa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColCa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColCa_Enabled), 5, 0), true);
      edtAlbDesp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDesp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDesp_Enabled), 5, 0), true);
      edtAlbCambio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCambio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCambio_Enabled), 5, 0), true);
      edtAlbTipDoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipDoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipDoc_Enabled), 5, 0), true);
      edtAlbMotTr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMotTr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMotTr_Enabled), 5, 0), true);
      edtAlbTipCal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipCal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipCal_Enabled), 5, 0), true);
      edtAlbObsCb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbObsCb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbObsCb_Enabled), 5, 0), true);
      edtAlbNumT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumT_Enabled), 5, 0), true);
      edtAlbMarCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMarCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMarCo_Enabled), 5, 0), true);
      edtAlbOComp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbOComp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbOComp_Enabled), 5, 0), true);
      edtTrnNif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNif_Enabled), 5, 0), true);
      edtAlbDivTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDivTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivTCod_Enabled), 5, 0), true);
      edtAlbDivAbr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDivAbr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivAbr_Enabled), 5, 0), true);
      edtAlbDivCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivCod_Enabled), 5, 0), true);
      edtBusDomEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBusDomEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBusDomEnv_Enabled), 5, 0), true);
      edtEmprGuiRem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprGuiRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprGuiRem_Enabled), 5, 0), true);
      edtGuiRemDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemDom_Enabled), 5, 0), true);
      edtGuiRemDivT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemDivT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemDivT_Enabled), 5, 0), true);
      edtGuiRemDiv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemDiv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemDiv_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtGuiRemCln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1L33( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1L30( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttrn06", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV35AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV208AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV194AlbSec))}, new String[] {"Gx_mode","EmprCod","AlbProCod","AlbProPri","AlbSec"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTrn06");
      forbiddenHiddens.add("AlbHhfm", localUtil.format( A10019AlbHhfm, "99/99/99 99:99"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV149Modo, "")));
      forbiddenHiddens.add("AlbProEst", localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"));
      forbiddenHiddens.add("AlbUsu", GXutil.rtrim( localUtil.format( A7098AlbUsu, "")));
      forbiddenHiddens.add("AlbEnvFtp", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9"));
      forbiddenHiddens.add("AlbLic", GXutil.rtrim( localUtil.format( A7101AlbLic, "")));
      forbiddenHiddens.add("AlbProAT", GXutil.rtrim( localUtil.format( A10765AlbProAT, "")));
      forbiddenHiddens.add("AlbGrossT", localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99"));
      forbiddenHiddens.add("AlbFmd", GXutil.rtrim( localUtil.format( A10017AlbFmd, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttrn06:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3865AlbHorSal", GXutil.rtrim( Z3865AlbHorSal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2242AlbSec", GXutil.rtrim( Z2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z39AlbProPri", GXutil.rtrim( Z39AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z33AlbProEst", GXutil.ltrim( localUtil.ntoc( Z33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z34AlbProfch", localUtil.dtoc( Z34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4023AlbFecSal", localUtil.dtoc( Z4023AlbFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7098AlbUsu", GXutil.rtrim( Z7098AlbUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3869AlbCliDes", GXutil.ltrim( localUtil.ntoc( Z3869AlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1259AlbDomEnv", GXutil.ltrim( localUtil.ntoc( Z1259AlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3868AlbMat", GXutil.rtrim( Z3868AlbMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5805AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( Z5805AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7101AlbLic", GXutil.rtrim( Z7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10765AlbProAT", GXutil.rtrim( Z10765AlbProAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10019AlbHhfm", localUtil.ttoc( Z10019AlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10020AlbGrossT", GXutil.ltrim( localUtil.ntoc( Z10020AlbGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10837AlbTrnNc", GXutil.rtrim( Z10837AlbTrnNc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10017AlbFmd", Z10017AlbFmd);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10835AlbTrnNm", GXutil.rtrim( Z10835AlbTrnNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10018ALbFmdc", GXutil.rtrim( Z10018ALbFmdc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10836AlbTrnDm", GXutil.rtrim( Z10836AlbTrnDm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5140AlbMarca", GXutil.rtrim( Z5140AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3867AlbLocDes", GXutil.ltrim( localUtil.ntoc( Z3867AlbLocDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3866AlbLocCar", GXutil.ltrim( localUtil.ntoc( Z3866AlbLocCar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( Z914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5141AlbIvaCod", GXutil.rtrim( Z5141AlbIvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7987AlbColCa", GXutil.rtrim( Z7987AlbColCa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7162AlbDesp", GXutil.ltrim( localUtil.ntoc( Z7162AlbDesp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7986AlbCambio", GXutil.ltrim( localUtil.ntoc( Z7986AlbCambio, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7985AlbTipDoc", GXutil.ltrim( localUtil.ntoc( Z7985AlbTipDoc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7984AlbMotTr", GXutil.rtrim( Z7984AlbMotTr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5803AlbTipCal", GXutil.ltrim( localUtil.ntoc( Z5803AlbTipCal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7988AlbObsCb", GXutil.rtrim( Z7988AlbObsCb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7102AlbNumT", GXutil.ltrim( localUtil.ntoc( Z7102AlbNumT, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7100AlbMarCo", GXutil.rtrim( Z7100AlbMarCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7099AlbOComp", GXutil.rtrim( Z7099AlbOComp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3093AlbDivTCod", GXutil.rtrim( Z3093AlbDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1258GuiRemDom", GXutil.ltrim( localUtil.ntoc( Z1258GuiRemDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1253EmprGuiRem", GXutil.rtrim( Z1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( Z1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3108AlbDivCod", GXutil.ltrim( localUtil.ntoc( Z3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3108AlbDivCod", GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N1253EmprGuiRem", GXutil.rtrim( A1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "N2242AlbSec", GXutil.rtrim( A2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTPARAMETROCALLSCOLLECTION", AV212SdtParametroCallsCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTPARAMETROCALLSCOLLECTION", AV212SdtParametroCallsCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTPARAMETROCALLSCOLLECTION", getSecureSignedToken( "", AV212SdtParametroCallsCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV201TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV201TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV201TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vWS", GXutil.ltrim( localUtil.ntoc( AV193Ws, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV193Ws), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOWS", GXutil.ltrim( localUtil.ntoc( AV162Nows, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOWS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV162Nows), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODHH", GXutil.ltrim( localUtil.ntoc( AV148Modhh, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODHH", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV148Modhh), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSDTPARAMETROCALLSJSON", AV215SdtParametroCallsJSon);
      app.GxWebStd.gx_hidden_field( httpContext, "vNOMBREDINAMICA", AV214NombreDinamica);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV208AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV208AlbProPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO", GXutil.rtrim( AV149Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBIMPORTE", GXutil.ltrim( localUtil.ntoc( A14253AlbImporte, (byte)(15), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLINEASA", GXutil.ltrim( localUtil.ntoc( A14252AlbLineasA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBFACTURA", GXutil.ltrim( localUtil.ntoc( A14251AlbFactura, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV35AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_GUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV203Insert_GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCGUIREMCLI", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV204Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALBDIVCOD", GXutil.ltrim( localUtil.ntoc( AV205Insert_AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_EMPRGUIREM", GXutil.rtrim( AV206Insert_EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV194AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV194AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV149Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_TINAMAR", GXutil.ltrim( localUtil.ntoc( AV65F_tinamar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCALBCLIDES", GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV45ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vHUEALB", GXutil.ltrim( localUtil.ntoc( AV99HueAlb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV69FirmaD, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV69FirmaD), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCONT", GXutil.ltrim( localUtil.ntoc( AV76FlagCont, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGALB", GXutil.ltrim( localUtil.ntoc( AV71FlagAlb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCLI", GXutil.ltrim( localUtil.ntoc( AV73FlagCli, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_F", GXutil.rtrim( AV156Msg_f));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBLAST", GXutil.ltrim( localUtil.ntoc( AV33AlbLast, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFCH", localUtil.dtoc( AV67Fch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_CARVEMA", GXutil.ltrim( localUtil.ntoc( AV59F_carvema, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vF_CARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59F_carvema), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vF_ALBANU", GXutil.ltrim( localUtil.ntoc( AV58F_albanu, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAVISAR", GXutil.ltrim( localUtil.ntoc( AV37avisar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV217Pgmname));
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
      return formatLink("app.ttrn06", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV35AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV208AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV194AlbSec))}, new String[] {"Gx_mode","EmprCod","AlbProCod","AlbProPri","AlbSec"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn06" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Guias (Header)", "") ;
   }

   public void initializeNonKey1L33( )
   {
      h1243GuiRemCli = "" ;
      h840TrnCod = "" ;
      A3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
      A1253EmprGuiRem = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      A3865AlbHorSal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
      A2242AlbSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      AV149Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV149Modo", AV149Modo);
      AV76FlagCont = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76FlagCont", GXutil.str( AV76FlagCont, 1, 0));
      AV71FlagAlb = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71FlagAlb", GXutil.str( AV71FlagAlb, 1, 0));
      AV73FlagCli = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73FlagCli", GXutil.str( AV73FlagCli, 1, 0));
      AV156Msg_f = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV156Msg_f", AV156Msg_f);
      AV33AlbLast = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33AlbLast), 8, 0));
      AV67Fch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Fch", localUtil.format(AV67Fch, "99/99/99"));
      A1260BusDomEnv = (byte)(0) ;
      n1260BusDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      A14251AlbFactura = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.str( A14251AlbFactura, 1, 0));
      A14252AlbLineasA = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14252AlbLineasA), 4, 0));
      A14253AlbImporte = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrimstr( A14253AlbImporte, 15, 2));
      A39AlbProPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      A33AlbProEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      A1244GuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A1259AlbDomEnv = (byte)(0) ;
      n1259AlbDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3868AlbMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
      A5805AlbEnvFtp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A7101AlbLic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
      A10020AlbGrossT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
      A10837AlbTrnNc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
      A10017AlbFmd = "" ;
      n10017AlbFmd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
      A10835AlbTrnNm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10835AlbTrnNm", A10835AlbTrnNm);
      A10018ALbFmdc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10018ALbFmdc", A10018ALbFmdc);
      A10836AlbTrnDm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10836AlbTrnDm", A10836AlbTrnDm);
      A5140AlbMarca = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5140AlbMarca", A5140AlbMarca);
      A3867AlbLocDes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
      A3866AlbLocCar = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
      A914AlbPObsCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      A5141AlbIvaCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5141AlbIvaCod", A5141AlbIvaCod);
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
      A7988AlbObsCb = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7988AlbObsCb", A7988AlbObsCb);
      A7102AlbNumT = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
      A7100AlbMarCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7100AlbMarCo", A7100AlbMarCo);
      A7099AlbOComp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7099AlbOComp", A7099AlbOComp);
      A3643TrnNif = "" ;
      n3643TrnNif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      A3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      A3109AlbDivAbr = "" ;
      n3109AlbDivAbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
      A1258GuiRemDom = (byte)(0) ;
      n1258GuiRemDom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
      A3145GuiRemDivT = "" ;
      n3145GuiRemDivT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
      A3110GuiRemDiv = (byte)(0) ;
      n3110GuiRemDiv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
      A34AlbProfch = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A4023AlbFecSal = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
      A7098AlbUsu = AV8UsurCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
      h3869AlbCliDes = "" ;
      A10765AlbProAT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
      A10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z3865AlbHorSal = "" ;
      Z2242AlbSec = "" ;
      Z39AlbProPri = "" ;
      Z33AlbProEst = (byte)(0) ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z4023AlbFecSal = GXutil.nullDate() ;
      Z7098AlbUsu = "" ;
      Z3869AlbCliDes = 0 ;
      Z1259AlbDomEnv = (byte)(0) ;
      Z3868AlbMat = "" ;
      Z5805AlbEnvFtp = (byte)(0) ;
      Z7101AlbLic = "" ;
      Z10765AlbProAT = "" ;
      Z10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      Z10020AlbGrossT = DecimalUtil.ZERO ;
      Z10837AlbTrnNc = "" ;
      Z10017AlbFmd = "" ;
      Z10835AlbTrnNm = "" ;
      Z10018ALbFmdc = "" ;
      Z10836AlbTrnDm = "" ;
      Z5140AlbMarca = "" ;
      Z3867AlbLocDes = (byte)(0) ;
      Z3866AlbLocCar = (byte)(0) ;
      Z914AlbPObsCon = (byte)(0) ;
      Z5141AlbIvaCod = "" ;
      Z7987AlbColCa = "" ;
      Z7162AlbDesp = 0 ;
      Z7986AlbCambio = DecimalUtil.ZERO ;
      Z7985AlbTipDoc = 0 ;
      Z7984AlbMotTr = "" ;
      Z5803AlbTipCal = (byte)(0) ;
      Z7988AlbObsCb = "" ;
      Z7102AlbNumT = 0 ;
      Z7100AlbMarCo = "" ;
      Z7099AlbOComp = "" ;
      Z3093AlbDivTCod = "" ;
      Z1258GuiRemDom = (byte)(0) ;
      Z1253EmprGuiRem = "" ;
      Z1243GuiRemCli = 0 ;
      Z840TrnCod = (short)(0) ;
      Z3108AlbDivCod = (byte)(0) ;
   }

   public void initAll1L33( )
   {
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      initializeNonKey1L33( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV149Modo = iV149Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV149Modo", AV149Modo);
      A34AlbProfch = i34AlbProfch ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A4023AlbFecSal = i4023AlbFecSal ;
      httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
      A7098AlbUsu = i7098AlbUsu ;
      httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
      A10765AlbProAT = i10765AlbProAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
      A10019AlbHhfm = i10019AlbHhfm ;
      httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241591399", true, true);
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
      httpContext.AddJavascriptSource("ttrn06.js", "?2026824159140", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      cmbAlbProPri.setInternalname( "ALBPROPRI" );
      cmbAlbProEst.setInternalname( "ALBPROEST" );
      cmbAlbSec.setInternalname( "ALBSEC" );
      divAlbsec_cell_Internalname = "ALBSEC_CELL" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      edtAlbFecSal_Internalname = "ALBFECSAL" ;
      edtAlbHorSal_Internalname = "ALBHORSAL" ;
      edtAlbUsu_Internalname = "ALBUSU" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtAlbCliDes_Internalname = "ALBCLIDES" ;
      edtAlbDomEnv_Internalname = "ALBDOMENV" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtAlbMat_Internalname = "ALBMAT" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblockalbenvftp_Internalname = "TEXTBLOCKALBENVFTP" ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP" );
      divUnnamedtablealbenvftp_Internalname = "UNNAMEDTABLEALBENVFTP" ;
      lblTextblockalblic_Internalname = "TEXTBLOCKALBLIC" ;
      edtAlbLic_Internalname = "ALBLIC" ;
      divUnnamedtablealblic_Internalname = "UNNAMEDTABLEALBLIC" ;
      lblTextblockalbproat_Internalname = "TEXTBLOCKALBPROAT" ;
      cmbAlbProAT.setInternalname( "ALBPROAT" );
      divUnnamedtablealbproat_Internalname = "UNNAMEDTABLEALBPROAT" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      lblTextblockalbhhfm_Internalname = "TEXTBLOCKALBHHFM" ;
      edtAlbHhfm_Internalname = "ALBHHFM" ;
      divUnnamedtablealbhhfm_Internalname = "UNNAMEDTABLEALBHHFM" ;
      lblTextblockalbgrosst_Internalname = "TEXTBLOCKALBGROSST" ;
      edtAlbGrossT_Internalname = "ALBGROSST" ;
      divUnnamedtablealbgrosst_Internalname = "UNNAMEDTABLEALBGROSST" ;
      lblTextblockalbfmd_Internalname = "TEXTBLOCKALBFMD" ;
      edtAlbFmd_Internalname = "ALBFMD" ;
      divUnnamedtablealbfmd_Internalname = "UNNAMEDTABLEALBFMD" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      grpUnnamedgroup8_Internalname = "UNNAMEDGROUP8" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtAlbTrnNm_Internalname = "ALBTRNNM" ;
      divAlbtrnnm_cell_Internalname = "ALBTRNNM_CELL" ;
      edtAlbTrnNc_Internalname = "ALBTRNNC" ;
      divAlbtrnnc_cell_Internalname = "ALBTRNNC_CELL" ;
      edtAlbTrnDm_Internalname = "ALBTRNDM" ;
      divAlbtrndm_cell_Internalname = "ALBTRNDM_CELL" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtALbFmdc_Internalname = "ALBFMDC" ;
      edtAlbMarca_Internalname = "ALBMARCA" ;
      edtAlbLocDes_Internalname = "ALBLOCDES" ;
      edtAlbLocCar_Internalname = "ALBLOCCAR" ;
      edtAlbPObsCon_Internalname = "ALBPOBSCON" ;
      edtAlbIvaCod_Internalname = "ALBIVACOD" ;
      edtAlbColCa_Internalname = "ALBCOLCA" ;
      edtAlbDesp_Internalname = "ALBDESP" ;
      edtAlbCambio_Internalname = "ALBCAMBIO" ;
      edtAlbTipDoc_Internalname = "ALBTIPDOC" ;
      edtAlbMotTr_Internalname = "ALBMOTTR" ;
      edtAlbTipCal_Internalname = "ALBTIPCAL" ;
      edtAlbObsCb_Internalname = "ALBOBSCB" ;
      edtAlbNumT_Internalname = "ALBNUMT" ;
      edtAlbMarCo_Internalname = "ALBMARCO" ;
      edtAlbOComp_Internalname = "ALBOCOMP" ;
      edtTrnNif_Internalname = "TRNNIF" ;
      edtAlbDivTCod_Internalname = "ALBDIVTCOD" ;
      edtAlbDivAbr_Internalname = "ALBDIVABR" ;
      edtAlbDivCod_Internalname = "ALBDIVCOD" ;
      edtBusDomEnv_Internalname = "BUSDOMENV" ;
      edtEmprGuiRem_Internalname = "EMPRGUIREM" ;
      edtGuiRemDom_Internalname = "GUIREMDOM" ;
      edtGuiRemDivT_Internalname = "GUIREMDIVT" ;
      edtGuiRemDiv_Internalname = "GUIREMDIV" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtGuiRemCln_Internalname = "GUIREMCLN" ;
      edtTrnNom_Internalname = "TRNNOM" ;
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
      Form.setCaption( httpContext.getMessage( "Guias (Header)", "") );
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Enabled = 0 ;
      edtTrnNom_Visible = 1 ;
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCln_Enabled = 0 ;
      edtGuiRemCln_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprCod_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtGuiRemDiv_Jsonclick = "" ;
      edtGuiRemDiv_Enabled = 0 ;
      edtGuiRemDiv_Visible = 1 ;
      edtGuiRemDivT_Jsonclick = "" ;
      edtGuiRemDivT_Enabled = 0 ;
      edtGuiRemDivT_Visible = 1 ;
      edtGuiRemDom_Jsonclick = "" ;
      edtGuiRemDom_Enabled = 1 ;
      edtGuiRemDom_Visible = 1 ;
      edtEmprGuiRem_Jsonclick = "" ;
      edtEmprGuiRem_Enabled = 1 ;
      edtEmprGuiRem_Visible = 1 ;
      edtBusDomEnv_Jsonclick = "" ;
      edtBusDomEnv_Enabled = 0 ;
      edtBusDomEnv_Visible = 1 ;
      edtAlbDivCod_Jsonclick = "" ;
      edtAlbDivCod_Enabled = 1 ;
      edtAlbDivCod_Visible = 1 ;
      edtAlbDivAbr_Jsonclick = "" ;
      edtAlbDivAbr_Enabled = 0 ;
      edtAlbDivAbr_Visible = 1 ;
      edtAlbDivTCod_Jsonclick = "" ;
      edtAlbDivTCod_Enabled = 1 ;
      edtAlbDivTCod_Visible = 1 ;
      edtTrnNif_Jsonclick = "" ;
      edtTrnNif_Enabled = 0 ;
      edtTrnNif_Visible = 1 ;
      edtAlbOComp_Jsonclick = "" ;
      edtAlbOComp_Enabled = 1 ;
      edtAlbOComp_Visible = 1 ;
      edtAlbMarCo_Jsonclick = "" ;
      edtAlbMarCo_Enabled = 1 ;
      edtAlbMarCo_Visible = 1 ;
      edtAlbNumT_Jsonclick = "" ;
      edtAlbNumT_Enabled = 1 ;
      edtAlbNumT_Visible = 1 ;
      edtAlbObsCb_Jsonclick = "" ;
      edtAlbObsCb_Enabled = 1 ;
      edtAlbObsCb_Visible = 1 ;
      edtAlbTipCal_Jsonclick = "" ;
      edtAlbTipCal_Enabled = 1 ;
      edtAlbTipCal_Visible = 1 ;
      edtAlbMotTr_Jsonclick = "" ;
      edtAlbMotTr_Enabled = 1 ;
      edtAlbMotTr_Visible = 1 ;
      edtAlbTipDoc_Jsonclick = "" ;
      edtAlbTipDoc_Enabled = 1 ;
      edtAlbTipDoc_Visible = 1 ;
      edtAlbCambio_Jsonclick = "" ;
      edtAlbCambio_Enabled = 1 ;
      edtAlbCambio_Visible = 1 ;
      edtAlbDesp_Jsonclick = "" ;
      edtAlbDesp_Enabled = 1 ;
      edtAlbDesp_Visible = 1 ;
      edtAlbColCa_Jsonclick = "" ;
      edtAlbColCa_Enabled = 1 ;
      edtAlbColCa_Visible = 1 ;
      edtAlbIvaCod_Jsonclick = "" ;
      edtAlbIvaCod_Enabled = 1 ;
      edtAlbIvaCod_Visible = 1 ;
      edtAlbPObsCon_Jsonclick = "" ;
      edtAlbPObsCon_Enabled = 1 ;
      edtAlbPObsCon_Visible = 1 ;
      edtAlbLocCar_Jsonclick = "" ;
      edtAlbLocCar_Enabled = 1 ;
      edtAlbLocCar_Visible = 1 ;
      edtAlbLocDes_Jsonclick = "" ;
      edtAlbLocDes_Enabled = 1 ;
      edtAlbLocDes_Visible = 1 ;
      edtAlbMarca_Jsonclick = "" ;
      edtAlbMarca_Enabled = 1 ;
      edtAlbMarca_Visible = 1 ;
      edtALbFmdc_Enabled = 1 ;
      edtALbFmdc_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbTrnDm_Jsonclick = "" ;
      edtAlbTrnDm_Enabled = 1 ;
      edtAlbTrnDm_Visible = 1 ;
      divAlbtrndm_cell_Class = "" ;
      edtAlbTrnNc_Jsonclick = "" ;
      edtAlbTrnNc_Enabled = 1 ;
      edtAlbTrnNc_Visible = 1 ;
      divAlbtrnnc_cell_Class = "" ;
      edtAlbTrnNm_Jsonclick = "" ;
      edtAlbTrnNm_Enabled = 1 ;
      edtAlbTrnNm_Visible = 1 ;
      divAlbtrnnm_cell_Class = "" ;
      divUnnamedtable6_Visible = 1 ;
      edtAlbFmd_Enabled = 0 ;
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
      edtAlbMat_Jsonclick = "" ;
      edtAlbMat_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtAlbDomEnv_Jsonclick = "" ;
      edtAlbDomEnv_Enabled = 1 ;
      edtAlbCliDes_Jsonclick = "" ;
      edtAlbCliDes_Enabled = 1 ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 1 ;
      edtAlbUsu_Jsonclick = "" ;
      edtAlbUsu_Enabled = 0 ;
      edtAlbHorSal_Jsonclick = "" ;
      edtAlbHorSal_Enabled = 1 ;
      edtAlbFecSal_Jsonclick = "" ;
      edtAlbFecSal_Enabled = 1 ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProfch_Enabled = 1 ;
      cmbAlbSec.setJsonclick( "" );
      cmbAlbSec.setEnabled( 1 );
      cmbAlbSec.setVisible( 1 );
      divAlbsec_cell_Class = "" ;
      cmbAlbProEst.setJsonclick( "" );
      cmbAlbProEst.setEnabled( 0 );
      cmbAlbProPri.setJsonclick( "" );
      cmbAlbProPri.setEnabled( 0 );
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 1 ;
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

   public void gxsgaguiremcli1L30( String A1253EmprGuiRem ,
                                   String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaguiremcli_data1L30( A1253EmprGuiRem, A13735CliCNom) ;
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

   protected void gxsgaguiremcli_data1L30( String A1253EmprGuiRem ,
                                           String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor T01L343 */
      pr_default.execute(41, new Object[] {A1253EmprGuiRem, l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(41) != 101) )
      {
         gxdynajaxctrlcodr.add(T01L343_A13735CliCNom[0]);
         gxdynajaxctrldescr.add(T01L343_A13735CliCNom[0]);
         pr_default.readNext(41);
      }
      pr_default.close(41);
   }

   public void gxsgaalbclides1L30( String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaalbclides_data1L30( A13735CliCNom) ;
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

   protected void gxsgaalbclides_data1L30( String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor T01L344 */
      pr_default.execute(42, new Object[] {l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(42) != 101) )
      {
         if ( GXutil.like( GXutil.upper( T01L344_A13735CliCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13735CliCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(T01L344_A13735CliCNom[0]);
            gxdynajaxctrldescr.add(T01L344_A13735CliCNom[0]);
         }
         pr_default.readNext(42);
      }
      pr_default.close(42);
   }

   public void gxsgatrncod1L30( String A13738TrnCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatrncod_data1L30( A13738TrnCNom) ;
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

   protected void gxsgatrncod_data1L30( String A13738TrnCNom )
   {
      l13738TrnCNom = GXutil.concat( GXutil.rtrim( A13738TrnCNom), "%", "") ;
      /* Using cursor T01L345 */
      pr_default.execute(43, new Object[] {l13738TrnCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(43) != 101) )
      {
         if ( GXutil.like( GXutil.upper( T01L345_A13738TrnCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13738TrnCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(T01L345_A13738TrnCNom[0]);
            gxdynajaxctrldescr.add(T01L345_A13738TrnCNom[0]);
         }
         pr_default.readNext(43);
      }
      pr_default.close(43);
   }

   public void gxhcaguiremcli1L33( String A1253EmprGuiRem ,
                                   String A13735CliCNom )
   {
      /* Using cursor T01L346 */
      pr_default.execute(44, new Object[] {A13735CliCNom, A1253EmprGuiRem});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(44) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13735CliCNom = T01L346_A13735CliCNom[0] ;
         A396EmprCod = T01L346_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01L346_A252CliCod[0] ;
         pr_default.readNext(44);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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

   public void gxhcaalbclides1L33( String A13735CliCNom )
   {
      /* Using cursor T01L347 */
      pr_default.execute(45, new Object[] {A13735CliCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(45) != 101) )
      {
         if ( GXutil.strcmp(T01L347_A13735CliCNom[0], A13735CliCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13735CliCNom = T01L347_A13735CliCNom[0] ;
            A396EmprCod = T01L347_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01L347_A252CliCod[0] ;
         }
         pr_default.readNext(45);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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

   public void gxhcatrncod1L33( String A13738TrnCNom )
   {
      /* Using cursor T01L348 */
      pr_default.execute(46, new Object[] {A13738TrnCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(46) != 101) )
      {
         if ( GXutil.strcmp(T01L348_A13738TrnCNom[0], A13738TrnCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13738TrnCNom = T01L348_A13738TrnCNom[0] ;
            A396EmprCod = T01L348_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A840TrnCod = T01L348_A840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         pr_default.readNext(46);
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
      pr_default.close(46);
   }

   public void gx3asaalbimporte1L33( String A396EmprCod ,
                                     long A30AlbProCod )
   {
      GXt_decimal10 = A14253AlbImporte ;
      GXv_decimal11[0] = GXt_decimal10 ;
      new app.importedocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_decimal11) ;
      ttrn06_impl.this.GXt_decimal10 = GXv_decimal11[0] ;
      A14253AlbImporte = GXt_decimal10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrimstr( A14253AlbImporte, 15, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14253AlbImporte, (byte)(15), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asaalblineasa1L33( String A396EmprCod ,
                                     long A30AlbProCod )
   {
      GXt_int12 = A14252AlbLineasA ;
      GXv_int13[0] = GXt_int12 ;
      new app.documentotransporteproduccion.haydatosalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int13) ;
      ttrn06_impl.this.GXt_int12 = GXv_int13[0] ;
      A14252AlbLineasA = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14252AlbLineasA), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14252AlbLineasA, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asaalbfactura1L33( String A396EmprCod ,
                                     long A30AlbProCod )
   {
      GXt_int12 = A14251AlbFactura ;
      GXv_int13[0] = GXt_int12 ;
      new app.facturacion.documentofacturable(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int13) ;
      ttrn06_impl.this.GXt_int12 = GXv_int13[0] ;
      A14251AlbFactura = (byte)(GXt_int12) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.str( A14251AlbFactura, 1, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14251AlbFactura, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa108351L33( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int17[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int17) ;
      ttrn06_impl.this.GXt_int5 = GXv_int17[0] ;
      edtAlbTrnNm_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNm_Visible), 5, 0), true);
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

   public void gxasa108371L33( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int17[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int17) ;
      ttrn06_impl.this.GXt_int5 = GXv_int17[0] ;
      edtAlbTrnNc_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNc_Visible), 5, 0), true);
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

   public void gxasa108361L33( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int17[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int17) ;
      ttrn06_impl.this.GXt_int5 = GXv_int17[0] ;
      edtAlbTrnDm_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnDm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnDm_Visible), 5, 0), true);
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

   public void gxasa22421L33( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int17[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINAMA", ""), ""), GXv_int17) ;
      ttrn06_impl.this.GXt_int5 = GXv_int17[0] ;
      cmbAlbSec.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbSec.getVisible(), 5, 0), true);
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

   public void gx36asaalbhorsal1L33( java.util.Date A34AlbProfch ,
                                     String Gx_mode ,
                                     String A396EmprCod )
   {
      if ( isIns( )  && (GXutil.strcmp("", A3865AlbHorSal)==0) && true /* After */ )
      {
         GXt_char1 = A3865AlbHorSal ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = GXt_char1 ;
         new app.phragr3(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         ttrn06_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn06_impl.this.GXt_char1 = GXv_char3[0] ;
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

   public void xc_61_1L33( String A396EmprCod ,
                           String AV45ContCod ,
                           long A30AlbProCod ,
                           String A39AlbProPri ,
                           byte AV99HueAlb )
   {
      if ( (0==A30AlbProCod) && true /* Level */ && true /* After */ && (0==AV99HueAlb) )
      {
         GXv_int7[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV45ContCod, GXv_int7) ;
         A30AlbProCod = GXv_int7[0] ;
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

   public void xc_62_1L33( String A396EmprCod ,
                           String AV45ContCod ,
                           long A30AlbProCod ,
                           String A39AlbProPri ,
                           byte AV99HueAlb ,
                           byte AV69FirmaD )
   {
      if ( (0==A30AlbProCod) && true /* Level */ && true /* After */ && ( AV99HueAlb == 1 ) && ( AV69FirmaD == 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV45ContCod ;
         GXv_int7[0] = (int)(A30AlbProCod) ;
         GXv_char2[0] = A39AlbProPri ;
         new app.pnumalb(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         AV45ContCod = GXv_char3[0] ;
         A30AlbProCod = GXv_int7[0] ;
         A39AlbProPri = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV45ContCod", AV45ContCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV45ContCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A39AlbProPri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_63_1L33( String A396EmprCod ,
                           String AV45ContCod ,
                           long A30AlbProCod ,
                           String A39AlbProPri ,
                           byte AV99HueAlb ,
                           byte AV69FirmaD )
   {
      if ( (0==A30AlbProCod) && true /* Level */ && true /* After */ && ! ( (0==AV99HueAlb) || ( ( AV99HueAlb == 1 ) && ( AV69FirmaD == 0 ) ) ) )
      {
         GXv_int7[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV45ContCod, GXv_int7) ;
         A30AlbProCod = GXv_int7[0] ;
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

   public void xc_64_1L33( String Gx_mode ,
                           String A396EmprCod ,
                           String AV45ContCod ,
                           long A30AlbProCod ,
                           byte AV71FlagAlb ,
                           byte AV76FlagCont ,
                           String A39AlbProPri )
   {
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV45ContCod ;
         GXv_int16[0] = A30AlbProCod ;
         GXv_int17[0] = AV71FlagAlb ;
         GXv_int6[0] = AV76FlagCont ;
         new app.putil10(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int16, GXv_int17, GXv_int6) ;
         A396EmprCod = GXv_char4[0] ;
         AV45ContCod = GXv_char3[0] ;
         A30AlbProCod = GXv_int16[0] ;
         AV71FlagAlb = GXv_int17[0] ;
         AV76FlagCont = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV45ContCod", AV45ContCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV71FlagAlb", GXutil.str( AV71FlagAlb, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV76FlagCont", GXutil.str( AV76FlagCont, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV45ContCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV71FlagAlb, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV76FlagCont, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_65_1L33( String A396EmprCod ,
                           int A3869AlbCliDes ,
                           byte AV73FlagCli )
   {
      if ( true /* Level */ && true /* After */ && ! (0==A3869AlbCliDes) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A3869AlbCliDes ;
         GXv_int17[0] = AV73FlagCli ;
         new app.pexides(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int17) ;
         A396EmprCod = GXv_char4[0] ;
         A3869AlbCliDes = GXv_int7[0] ;
         AV73FlagCli = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV73FlagCli", GXutil.str( AV73FlagCli, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV73FlagCli, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_66_1L33( String A396EmprCod ,
                           String A39AlbProPri ,
                           java.util.Date AV67Fch ,
                           int AV33AlbLast ,
                           java.util.Date A34AlbProfch ,
                           String AV156Msg_f ,
                           byte AV49Ctrlf )
   {
      if ( true /* Level */ && true /* After */ && ( AV49Ctrlf == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A39AlbProPri ;
         GXv_int17[0] = (byte)(1) ;
         GXv_date15[0] = AV67Fch ;
         GXv_int7[0] = AV33AlbLast ;
         GXv_date14[0] = A34AlbProfch ;
         GXv_char2[0] = AV156Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int17, GXv_date15, GXv_int7, GXv_date14, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A39AlbProPri = GXv_char3[0] ;
         AV67Fch = GXv_date15[0] ;
         AV33AlbLast = GXv_int7[0] ;
         A34AlbProfch = GXv_date14[0] ;
         AV156Msg_f = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV67Fch", localUtil.format(AV67Fch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV33AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33AlbLast), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV156Msg_f", AV156Msg_f);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A39AlbProPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV67Fch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33AlbLast, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A34AlbProfch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV156Msg_f))+"\"") ;
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
      cmbAlbProPri.setName( "ALBPROPRI" );
      cmbAlbProPri.setWebtags( "" );
      cmbAlbProPri.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbAlbProPri.addItem("0", httpContext.getMessage( "Guia Transporte Sem Encargos", ""), (short)(0));
      if ( cmbAlbProPri.getItemCount() > 0 )
      {
         A39AlbProPri = cmbAlbProPri.getValidValue(A39AlbProPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      }
      cmbAlbProEst.setName( "ALBPROEST" );
      cmbAlbProEst.setWebtags( "" );
      cmbAlbProEst.addItem("0", httpContext.getMessage( "Gerado", ""), (short)(0));
      cmbAlbProEst.addItem("1", httpContext.getMessage( "Impresso", ""), (short)(0));
      cmbAlbProEst.addItem("2", httpContext.getMessage( "Faturado", ""), (short)(0));
      if ( cmbAlbProEst.getItemCount() > 0 )
      {
         A33AlbProEst = (byte)(GXutil.lval( cmbAlbProEst.getValidValue(GXutil.trim( GXutil.str( A33AlbProEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      }
      cmbAlbSec.setName( "ALBSEC" );
      cmbAlbSec.setWebtags( "" );
      cmbAlbSec.addItem("S", httpContext.getMessage( "SIM", ""), (short)(0));
      cmbAlbSec.addItem("N", httpContext.getMessage( "NAO", ""), (short)(0));
      if ( cmbAlbSec.getItemCount() > 0 )
      {
         A2242AlbSec = cmbAlbSec.getValidValue(A2242AlbSec) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      }
      cmbAlbEnvFtp.setName( "ALBENVFTP" );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Nao enviado", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviado a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      }
      cmbAlbProAT.setName( "ALBPROAT" );
      cmbAlbProAT.setWebtags( "" );
      cmbAlbProAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbAlbProAT.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
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

   public void valid_Albprocod( )
   {
      GXt_decimal10 = A14253AlbImporte ;
      GXv_decimal11[0] = GXt_decimal10 ;
      new app.importedocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_decimal11) ;
      ttrn06_impl.this.GXt_decimal10 = GXv_decimal11[0] ;
      A14253AlbImporte = GXt_decimal10 ;
      GXt_int12 = A14252AlbLineasA ;
      GXv_int13[0] = GXt_int12 ;
      new app.documentotransporteproduccion.haydatosalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int13) ;
      ttrn06_impl.this.GXt_int12 = GXv_int13[0] ;
      A14252AlbLineasA = GXt_int12 ;
      GXt_int12 = A14251AlbFactura ;
      GXv_int13[0] = GXt_int12 ;
      new app.facturacion.documentofacturable(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int13) ;
      ttrn06_impl.this.GXt_int12 = GXv_int13[0] ;
      A14251AlbFactura = (byte)(GXt_int12) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14253AlbImporte", GXutil.ltrim( localUtil.ntoc( A14253AlbImporte, (byte)(15), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14252AlbLineasA", GXutil.ltrim( localUtil.ntoc( A14252AlbLineasA, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14251AlbFactura", GXutil.ltrim( localUtil.ntoc( A14251AlbFactura, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Albpropri( )
   {
      A39AlbProPri = cmbAlbProPri.getValue() ;
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV45ContCod ;
         GXv_int16[0] = A30AlbProCod ;
         GXv_int17[0] = AV71FlagAlb ;
         GXv_int6[0] = AV76FlagCont ;
         new app.putil10(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int16, GXv_int17, GXv_int6) ;
         ttrn06_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrn06_impl.this.AV45ContCod = GXv_char3[0] ;
         AV45ContCod = this.AV45ContCod ;
         ttrn06_impl.this.A30AlbProCod = GXv_int16[0] ;
         A30AlbProCod = this.A30AlbProCod ;
         ttrn06_impl.this.AV71FlagAlb = GXv_int17[0] ;
         AV71FlagAlb = this.AV71FlagAlb ;
         ttrn06_impl.this.AV76FlagCont = GXv_int6[0] ;
         AV76FlagCont = this.AV76FlagCont ;
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV71FlagAlb == 0 ) && ( AV59F_carvema == 0 ) && ( AV69FirmaD == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENÇÃO, Você vai criar um GUIA MANUALMENTE", ""), 0, "");
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV76FlagCont == 1 ) && ( AV59F_carvema == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERRO: tentamos REGISTRAR uma GUIA > CONTADOR manualmentee", ""), 1, "ALBPROPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbProPri.getInternalname() ;
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A30AlbProCod) && ( AV69FirmaD == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERRO: tentamos REGISTRAR uma GUIA > CONTADOR manualmentee", ""), 1, "ALBPROPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbProPri.getInternalname() ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "AV45ContCod", GXutil.rtrim( AV45ContCod));
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV71FlagAlb", GXutil.ltrim( localUtil.ntoc( AV71FlagAlb, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV76FlagCont", GXutil.ltrim( localUtil.ntoc( AV76FlagCont, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Albprofch( )
   {
      A39AlbProPri = cmbAlbProPri.getValue() ;
      cmbAlbProPri.setValue( A39AlbProPri );
      if ( isIns( )  && (GXutil.strcmp("", A3865AlbHorSal)==0) && true /* After */ )
      {
         GXt_char1 = A3865AlbHorSal ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = GXt_char1 ;
         new app.phragr3(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         ttrn06_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrn06_impl.this.GXt_char1 = GXv_char3[0] ;
         A3865AlbHorSal = GXt_char1 ;
      }
      if ( true /* Level */ && true /* After */ && ( AV49Ctrlf == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A39AlbProPri ;
         GXv_int17[0] = (byte)(1) ;
         GXv_date15[0] = AV67Fch ;
         GXv_int7[0] = AV33AlbLast ;
         GXv_date14[0] = A34AlbProfch ;
         GXv_char2[0] = AV156Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int17, GXv_date15, GXv_int7, GXv_date14, GXv_char2) ;
         ttrn06_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrn06_impl.this.A39AlbProPri = GXv_char3[0] ;
         A39AlbProPri = this.A39AlbProPri ;
         ttrn06_impl.this.AV67Fch = GXv_date15[0] ;
         AV67Fch = this.AV67Fch ;
         ttrn06_impl.this.AV33AlbLast = GXv_int7[0] ;
         AV33AlbLast = this.AV33AlbLast ;
         ttrn06_impl.this.A34AlbProfch = GXv_date14[0] ;
         A34AlbProfch = this.A34AlbProfch ;
         ttrn06_impl.this.AV156Msg_f = GXv_char2[0] ;
         AV156Msg_f = this.AV156Msg_f ;
         cmbAlbProPri.setValue( A39AlbProPri );
      }
      if ( ( ( AV58F_albanu == 1 ) || ( AV69FirmaD == 1 ) ) && ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia ANULADA", ""), 1, "ALBPROFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProfch_Internalname ;
      }
      if ( ( GXutil.strcmp(AV156Msg_f, " ") != 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV156Msg_f, 1, "ALBPROFCH");
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
      if ( cmbAlbProPri.getItemCount() > 0 )
      {
         A39AlbProPri = cmbAlbProPri.getValidValue(A39AlbProPri) ;
         cmbAlbProPri.setValue( A39AlbProPri );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProPri.setValue( GXutil.rtrim( A39AlbProPri) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", GXutil.rtrim( A3865AlbHorSal));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", GXutil.rtrim( A39AlbProPri));
      cmbAlbProPri.setValue( GXutil.rtrim( A39AlbProPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Values", cmbAlbProPri.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "AV67Fch", localUtil.format(AV67Fch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV33AlbLast", GXutil.ltrim( localUtil.ntoc( AV33AlbLast, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV156Msg_f", GXutil.rtrim( AV156Msg_f));
   }

   public void valid_Guiremcli( )
   {
      if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
      {
         A3869AlbCliDes = A1243GuiRemCli ;
         /* Using cursor T01L349 */
         pr_default.execute(47, new Object[] {Integer.valueOf(A3869AlbCliDes)});
         h3869AlbCliDes = "" ;
         while ( (pr_default.getStatus(47) != 101) )
         {
            h3869AlbCliDes = T01L349_A13735CliCNom[0] ;
            if (true) break;
         }
         pr_default.close(47);
         httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
      }
      if ( (0==A1243GuiRemCli) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo del Cliente es requerido.", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
      }
      if ( ( A1243GuiRemCli == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente com valor 0 ¡¡¡", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
   }

   public void valid_Albclides( )
   {
      if ( (GXutil.strcmp("", h3869AlbCliDes)==0) )
      {
         A3869AlbCliDes = 0 ;
      }
      else
      {
         A13735CliCNom = h3869AlbCliDes ;
         /* Using cursor T01L350 */
         pr_default.execute(48, new Object[] {A13735CliCNom});
         A3869AlbCliDes = T01L350_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(48) == 101) ) )
         {
            pr_default.readNext(48);
            if ( ! ( (pr_default.getStatus(48) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "ALBCLIDES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbCliDes_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(48);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
      if ( true /* Level */ && true /* After */ && ! (0==A3869AlbCliDes) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A3869AlbCliDes ;
         GXv_int17[0] = AV73FlagCli ;
         new app.pexides(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int17) ;
         ttrn06_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrn06_impl.this.A3869AlbCliDes = GXv_int7[0] ;
         A3869AlbCliDes = this.A3869AlbCliDes ;
         ttrn06_impl.this.AV73FlagCli = GXv_int17[0] ;
         AV73FlagCli = this.AV73FlagCli ;
      }
      if ( ( AV73FlagCli == 0 ) && true /* Level */ && true /* After */ && ! (0==A3869AlbCliDes) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ATENÇÃO. Cliente de destino NÃO EXISTENTE", ""), 1, "ALBCLIDES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbCliDes_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV73FlagCli", GXutil.ltrim( localUtil.ntoc( AV73FlagCli, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
   }

   public void valid_Trncod( )
   {
      n841TrnNom = false ;
      n3643TrnNif = false ;
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         A840TrnCod = (short)(0) ;
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01L351 */
         pr_default.execute(49, new Object[] {A13738TrnCNom});
         A840TrnCod = T01L351_A840TrnCod[0] ;
         A840TrnCod = T01L351_A840TrnCod[0] ;
         if ( ! ( (pr_default.getStatus(49) == 101) ) )
         {
            pr_default.readNext(49);
            if ( ! ( (pr_default.getStatus(49) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(49);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01L352 */
      pr_default.execute(50, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(50) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01L352_A841TrnNom[0] ;
      n841TrnNom = T01L352_n841TrnNom[0] ;
      A3643TrnNif = T01L352_A3643TrnNif[0] ;
      n3643TrnNif = T01L352_n3643TrnNif[0] ;
      pr_default.close(50);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", GXutil.rtrim( A3643TrnNif));
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
   }

   public void valid_Busdomenv( )
   {
      n1260BusDomEnv = false ;
      n1259AlbDomEnv = false ;
      if ( (0==A1260BusDomEnv) && ( ! (0==A1259AlbDomEnv) ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Endereço de entrega inexistente", ""), 1, "BUSDOMENV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBusDomEnv_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Emprguirem( )
   {
      n3145GuiRemDivT = false ;
      n3110GuiRemDiv = false ;
      n3108AlbDivCod = false ;
      n1259AlbDomEnv = false ;
      n3093AlbDivTCod = false ;
      n3109AlbDivAbr = false ;
      n841TrnNom = false ;
      n3643TrnNif = false ;
      n1260BusDomEnv = false ;
      if ( (GXutil.strcmp("", h1243GuiRemCli)==0) )
      {
         A1243GuiRemCli = 0 ;
      }
      else
      {
         A13735CliCNom = h1243GuiRemCli ;
         /* Using cursor T01L353 */
         pr_default.execute(51, new Object[] {A13735CliCNom, A1253EmprGuiRem});
         A1243GuiRemCli = T01L353_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(51) == 101) ) )
         {
            pr_default.readNext(51);
            if ( ! ( (pr_default.getStatus(51) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "GUIREMCLI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGuiRemCli_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(51);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h1243GuiRemCli", h1243GuiRemCli);
      /* Using cursor T01L354 */
      pr_default.execute(52, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(52) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
      }
      A1244GuiRemCln = T01L354_A1244GuiRemCln[0] ;
      A3145GuiRemDivT = T01L354_A3145GuiRemDivT[0] ;
      n3145GuiRemDivT = T01L354_n3145GuiRemDivT[0] ;
      A3110GuiRemDiv = T01L354_A3110GuiRemDiv[0] ;
      n3110GuiRemDiv = T01L354_n3110GuiRemDiv[0] ;
      pr_default.close(52);
      if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A3093AlbDivTCod = httpContext.getMessage( httpContext.getMessage( "E", ""), "") ;
         n3093AlbDivTCod = false ;
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
         {
            A3093AlbDivTCod = A3145GuiRemDivT ;
            n3093AlbDivTCod = false ;
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV205Insert_AlbDivCod) )
      {
         A3108AlbDivCod = AV205Insert_AlbDivCod ;
         n3108AlbDivCod = false ;
      }
      else
      {
         if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
         {
            A3108AlbDivCod = (byte)(2) ;
            n3108AlbDivCod = false ;
         }
         else
         {
            if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
            {
               A3108AlbDivCod = A3110GuiRemDiv ;
               n3108AlbDivCod = false ;
            }
         }
      }
      /* Using cursor T01L355 */
      pr_default.execute(53, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(53) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDivCod_Internalname ;
         }
      }
      A3109AlbDivAbr = T01L355_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01L355_n3109AlbDivAbr[0] ;
      pr_default.close(53);
      /* Using cursor T01L356 */
      pr_default.execute(54, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(54) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
      }
      A841TrnNom = T01L356_A841TrnNom[0] ;
      n841TrnNom = T01L356_n841TrnNom[0] ;
      A3643TrnNif = T01L356_A3643TrnNif[0] ;
      n3643TrnNif = T01L356_n3643TrnNif[0] ;
      pr_default.close(54);
      /* Using cursor T01L357 */
      pr_default.execute(55, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(55) != 101) )
      {
         A1260BusDomEnv = T01L357_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01L357_n1260BusDomEnv[0] ;
      }
      else
      {
         A1260BusDomEnv = (byte)(0) ;
         n1260BusDomEnv = false ;
      }
      pr_default.close(55);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", GXutil.rtrim( A1253EmprGuiRem));
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", GXutil.rtrim( A1244GuiRemCln));
      httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", GXutil.rtrim( A3145GuiRemDivT));
      httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrim( localUtil.ntoc( A3110GuiRemDiv, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", GXutil.rtrim( A3093AlbDivTCod));
      httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", GXutil.rtrim( A3109AlbDivAbr));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", GXutil.rtrim( A3643TrnNif));
      httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.ltrim( localUtil.ntoc( A1260BusDomEnv, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h1243GuiRemCli", h1243GuiRemCli);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV35AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV208AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV194AlbSec',fld:'vALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV212SdtParametroCallsCollection',fld:'vSDTPARAMETROCALLSCOLLECTION',pic:'',hsh:true},{av:'AV201TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV193Ws',fld:'vWS',pic:'9',hsh:true},{av:'AV162Nows',fld:'vNOWS',pic:'9',hsh:true},{av:'AV148Modhh',fld:'vMODHH',pic:'9',hsh:true},{av:'AV208AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV35AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV194AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV69FirmaD',fld:'vFIRMAD',pic:'9',hsh:true},{av:'AV59F_carvema',fld:'vF_CARVEMA',pic:'9',hsh:true},{av:'A10019AlbHhfm',fld:'ALBHHFM',pic:'99/99/99 99:99'},{av:'AV149Modo',fld:'vMODO',pic:''},{av:'cmbAlbProEst'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'A7098AlbUsu',fld:'ALBUSU',pic:''},{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'cmbAlbProAT'},{av:'A10765AlbProAT',fld:'ALBPROAT',pic:''},{av:'A10020AlbGrossT',fld:'ALBGROSST',pic:'ZZZZZZZZZ9.99'},{av:'A10017AlbFmd',fld:'ALBFMD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121L32',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV212SdtParametroCallsCollection',fld:'vSDTPARAMETROCALLSCOLLECTION',pic:'',hsh:true},{av:'AV201TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV59F_carvema',fld:'vF_CARVEMA',pic:'9',hsh:true},{av:'AV69FirmaD',fld:'vFIRMAD',pic:'9',hsh:true},{av:'AV193Ws',fld:'vWS',pic:'9',hsh:true},{av:'AV162Nows',fld:'vNOWS',pic:'9',hsh:true},{av:'AV148Modhh',fld:'vMODHH',pic:'9',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV212SdtParametroCallsCollection',fld:'vSDTPARAMETROCALLSCOLLECTION',pic:'',hsh:true}]}");
      setEventMetadata("ALBDOMENV.CLICK","{handler:'e141L32',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1259AlbDomEnv',fld:'ALBDOMENV',pic:'9'}]");
      setEventMetadata("ALBDOMENV.CLICK",",oparms:[{av:'A1259AlbDomEnv',fld:'ALBDOMENV',pic:'9'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("GLOBALEVENTS.FLUJOOBJETO","{handler:'e131L32',iparms:[{av:'AV215SdtParametroCallsJSon',fld:'vSDTPARAMETROCALLSJSON',pic:''},{av:'AV214NombreDinamica',fld:'vNOMBREDINAMICA',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV35AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV208AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV194AlbSec',fld:'vALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("GLOBALEVENTS.FLUJOOBJETO",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A14253AlbImporte',fld:'ALBIMPORTE',pic:'ZZZZZZZZZZZ9.99'},{av:'A14252AlbLineasA',fld:'ALBLINEASA',pic:'ZZZ9'},{av:'A14251AlbFactura',fld:'ALBFACTURA',pic:'9'}]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[{av:'A14253AlbImporte',fld:'ALBIMPORTE',pic:'ZZZZZZZZZZZ9.99'},{av:'A14252AlbLineasA',fld:'ALBLINEASA',pic:'ZZZ9'},{av:'A14251AlbFactura',fld:'ALBFACTURA',pic:'9'}]}");
      setEventMetadata("VALID_ALBPROPRI","{handler:'valid_Albpropri',iparms:[{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV45ContCod',fld:'vCONTCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'cmbAlbProPri'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'AV76FlagCont',fld:'vFLAGCONT',pic:'9'},{av:'AV71FlagAlb',fld:'vFLAGALB',pic:'9'}]");
      setEventMetadata("VALID_ALBPROPRI",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV45ContCod',fld:'vCONTCOD',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV71FlagAlb',fld:'vFLAGALB',pic:'9'},{av:'AV76FlagCont',fld:'vFLAGCONT',pic:'9'}]}");
      setEventMetadata("VALID_ALBPROEST","{handler:'valid_Albproest',iparms:[]");
      setEventMetadata("VALID_ALBPROEST",",oparms:[]}");
      setEventMetadata("VALID_ALBSEC","{handler:'valid_Albsec',iparms:[]");
      setEventMetadata("VALID_ALBSEC",",oparms:[]}");
      setEventMetadata("VALID_ALBPROFCH","{handler:'valid_Albprofch',iparms:[{av:'AV49Ctrlf',fld:'vCTRLF',pic:'9'},{av:'cmbAlbProPri'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A3865AlbHorSal',fld:'ALBHORSAL',pic:''},{av:'AV156Msg_f',fld:'vMSG_F',pic:''},{av:'AV33AlbLast',fld:'vALBLAST',pic:'ZZZZZZZ9'},{av:'AV67Fch',fld:'vFCH',pic:''}]");
      setEventMetadata("VALID_ALBPROFCH",",oparms:[{av:'A3865AlbHorSal',fld:'ALBHORSAL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'cmbAlbProPri'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'AV67Fch',fld:'vFCH',pic:''},{av:'AV33AlbLast',fld:'vALBLAST',pic:'ZZZZZZZ9'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV156Msg_f',fld:'vMSG_F',pic:''}]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[{av:'h3869AlbCliDes'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'h1243GuiRemCli'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'},{av:'h3869AlbCliDes'}]}");
      setEventMetadata("VALID_ALBCLIDES","{handler:'valid_Albclides',iparms:[{av:'h3869AlbCliDes'},{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV73FlagCli',fld:'vFLAGCLI',pic:'9'}]");
      setEventMetadata("VALID_ALBCLIDES",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'},{av:'AV73FlagCli',fld:'vFLAGCLI',pic:'9'},{av:'h3869AlbCliDes'}]}");
      setEventMetadata("VALID_ALBDOMENV","{handler:'valid_Albdomenv',iparms:[]");
      setEventMetadata("VALID_ALBDOMENV",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'h840TrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A3643TrnNif',fld:'TRNNIF',pic:'@!'}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A3643TrnNif',fld:'TRNNIF',pic:'@!'},{av:'h840TrnCod'}]}");
      setEventMetadata("VALID_ALBLIC","{handler:'valid_Alblic',iparms:[]");
      setEventMetadata("VALID_ALBLIC",",oparms:[]}");
      setEventMetadata("VALID_ALBDIVCOD","{handler:'valid_Albdivcod',iparms:[]");
      setEventMetadata("VALID_ALBDIVCOD",",oparms:[]}");
      setEventMetadata("VALID_BUSDOMENV","{handler:'valid_Busdomenv',iparms:[{av:'A1260BusDomEnv',fld:'BUSDOMENV',pic:'9'},{av:'A1259AlbDomEnv',fld:'ALBDOMENV',pic:'9'}]");
      setEventMetadata("VALID_BUSDOMENV",",oparms:[]}");
      setEventMetadata("VALID_EMPRGUIREM","{handler:'valid_Emprguirem',iparms:[{av:'h1243GuiRemCli'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A3145GuiRemDivT',fld:'GUIREMDIVT',pic:''},{av:'AV205Insert_AlbDivCod',fld:'vINSERT_ALBDIVCOD',pic:'Z9'},{av:'A3110GuiRemDiv',fld:'GUIREMDIV',pic:'Z9'},{av:'A3108AlbDivCod',fld:'ALBDIVCOD',pic:'Z9'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A1259AlbDomEnv',fld:'ALBDOMENV',pic:'9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A3093AlbDivTCod',fld:'ALBDIVTCOD',pic:''},{av:'A3109AlbDivAbr',fld:'ALBDIVABR',pic:''},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A3643TrnNif',fld:'TRNNIF',pic:'@!'},{av:'A1260BusDomEnv',fld:'BUSDOMENV',pic:'9'}]");
      setEventMetadata("VALID_EMPRGUIREM",",oparms:[{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A3145GuiRemDivT',fld:'GUIREMDIVT',pic:''},{av:'A3110GuiRemDiv',fld:'GUIREMDIV',pic:'Z9'},{av:'A3093AlbDivTCod',fld:'ALBDIVTCOD',pic:''},{av:'A3108AlbDivCod',fld:'ALBDIVCOD',pic:'Z9'},{av:'A3109AlbDivAbr',fld:'ALBDIVABR',pic:''},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A3643TrnNif',fld:'TRNNIF',pic:'@!'},{av:'A1260BusDomEnv',fld:'BUSDOMENV',pic:'9'},{av:'h1243GuiRemCli'}]}");
      setEventMetadata("VALID_GUIREMDIVT","{handler:'valid_Guiremdivt',iparms:[]");
      setEventMetadata("VALID_GUIREMDIVT",",oparms:[]}");
      setEventMetadata("VALID_GUIREMDIV","{handler:'valid_Guiremdiv',iparms:[]");
      setEventMetadata("VALID_GUIREMDIV",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
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
      pr_default.close(52);
      pr_default.close(31);
      pr_default.close(54);
      pr_default.close(50);
      pr_default.close(34);
      pr_default.close(32);
      pr_default.close(53);
      pr_default.close(30);
      pr_default.close(55);
      pr_default.close(33);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV10EmprCod = "" ;
      wcpOAV208AlbProPri = "" ;
      wcpOAV194AlbSec = "" ;
      Z396EmprCod = "" ;
      Z3865AlbHorSal = "" ;
      Z2242AlbSec = "" ;
      Z39AlbProPri = "" ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z4023AlbFecSal = GXutil.nullDate() ;
      Z7098AlbUsu = "" ;
      Z3868AlbMat = "" ;
      Z7101AlbLic = "" ;
      Z10765AlbProAT = "" ;
      Z10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      Z10020AlbGrossT = DecimalUtil.ZERO ;
      Z10837AlbTrnNc = "" ;
      Z10017AlbFmd = "" ;
      Z10835AlbTrnNm = "" ;
      Z10018ALbFmdc = "" ;
      Z10836AlbTrnDm = "" ;
      Z5140AlbMarca = "" ;
      Z5141AlbIvaCod = "" ;
      Z7987AlbColCa = "" ;
      Z7986AlbCambio = DecimalUtil.ZERO ;
      Z7984AlbMotTr = "" ;
      Z7988AlbObsCb = "" ;
      Z7100AlbMarCo = "" ;
      Z7099AlbOComp = "" ;
      Z3093AlbDivTCod = "" ;
      Z1253EmprGuiRem = "" ;
      N1253EmprGuiRem = "" ;
      N2242AlbSec = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV45ContCod = "" ;
      A39AlbProPri = "" ;
      Gx_mode = "" ;
      AV67Fch = GXutil.nullDate() ;
      A34AlbProfch = GXutil.nullDate() ;
      AV156Msg_f = "" ;
      A1253EmprGuiRem = "" ;
      A13735CliCNom = "" ;
      A13738TrnCNom = "" ;
      h1243GuiRemCli = "" ;
      h3869AlbCliDes = "" ;
      h840TrnCod = "" ;
      AV10EmprCod = "" ;
      AV208AlbProPri = "" ;
      AV194AlbSec = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A2242AlbSec = "" ;
      A10765AlbProAT = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A7098AlbUsu = "" ;
      A3868AlbMat = "" ;
      lblTextblockalbenvftp_Jsonclick = "" ;
      lblTextblockalblic_Jsonclick = "" ;
      A7101AlbLic = "" ;
      lblTextblockalbproat_Jsonclick = "" ;
      lblTextblockalbhhfm_Jsonclick = "" ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      lblTextblockalbgrosst_Jsonclick = "" ;
      A10020AlbGrossT = DecimalUtil.ZERO ;
      lblTextblockalbfmd_Jsonclick = "" ;
      A10017AlbFmd = "" ;
      A10835AlbTrnNm = "" ;
      A10837AlbTrnNc = "" ;
      A10836AlbTrnDm = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      A10018ALbFmdc = "" ;
      A5140AlbMarca = "" ;
      A5141AlbIvaCod = "" ;
      A7987AlbColCa = "" ;
      A7986AlbCambio = DecimalUtil.ZERO ;
      A7984AlbMotTr = "" ;
      A7988AlbObsCb = "" ;
      A7100AlbMarCo = "" ;
      A7099AlbOComp = "" ;
      A3643TrnNif = "" ;
      A3093AlbDivTCod = "" ;
      A3109AlbDivAbr = "" ;
      A3145GuiRemDivT = "" ;
      A407EmprNom = "" ;
      A1244GuiRemCln = "" ;
      A841TrnNom = "" ;
      AV149Modo = "" ;
      A14253AlbImporte = DecimalUtil.ZERO ;
      AV206Insert_EmprGuiRem = "" ;
      AV8UsurCod = "" ;
      AV217Pgmname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode3 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV200WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV201TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV202WebSession = httpContext.getWebSession();
      AV207TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV212SdtParametroCallsCollection = new GXBaseCollection<app.SdtSdtParametroCalls>(app.SdtSdtParametroCalls.class, "SdtParametroCalls", "TexplusNET", remoteHandle);
      AV214NombreDinamica = "" ;
      AV215SdtParametroCallsJSon = "" ;
      AV213SdtParametroCalls = new app.SdtSdtParametroCalls(remoteHandle, context);
      Z407EmprNom = "" ;
      Z3109AlbDivAbr = "" ;
      Z1244GuiRemCln = "" ;
      Z3145GuiRemDivT = "" ;
      T01L35_A407EmprNom = new String[] {""} ;
      T01L35_n407EmprNom = new boolean[] {false} ;
      T01L310_A13738TrnCNom = new String[] {""} ;
      T01L310_A396EmprCod = new String[] {""} ;
      T01L310_A840TrnCod = new short[1] ;
      T01L311_A13735CliCNom = new String[] {""} ;
      T01L311_A396EmprCod = new String[] {""} ;
      T01L311_A252CliCod = new int[1] ;
      T01L36_A841TrnNom = new String[] {""} ;
      T01L36_n841TrnNom = new boolean[] {false} ;
      T01L36_A3643TrnNif = new String[] {""} ;
      T01L36_n3643TrnNif = new boolean[] {false} ;
      T01L34_A1244GuiRemCln = new String[] {""} ;
      T01L34_A3145GuiRemDivT = new String[] {""} ;
      T01L34_n3145GuiRemDivT = new boolean[] {false} ;
      T01L34_A3110GuiRemDiv = new byte[1] ;
      T01L34_n3110GuiRemDiv = new boolean[] {false} ;
      T01L37_A841TrnNom = new String[] {""} ;
      T01L37_n841TrnNom = new boolean[] {false} ;
      T01L37_A3643TrnNif = new String[] {""} ;
      T01L37_n3643TrnNif = new boolean[] {false} ;
      T01L312_A252CliCod = new int[1] ;
      T01L312_A266CliEnvLin = new byte[1] ;
      T01L312_A30AlbProCod = new long[1] ;
      T01L312_A3865AlbHorSal = new String[] {""} ;
      T01L312_A2242AlbSec = new String[] {""} ;
      T01L312_A39AlbProPri = new String[] {""} ;
      T01L312_A33AlbProEst = new byte[1] ;
      T01L312_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01L312_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01L312_A7098AlbUsu = new String[] {""} ;
      T01L312_A1244GuiRemCln = new String[] {""} ;
      T01L312_A3869AlbCliDes = new int[1] ;
      T01L312_A1259AlbDomEnv = new byte[1] ;
      T01L312_n1259AlbDomEnv = new boolean[] {false} ;
      T01L312_A3868AlbMat = new String[] {""} ;
      T01L312_A5805AlbEnvFtp = new byte[1] ;
      T01L312_A7101AlbLic = new String[] {""} ;
      T01L312_A10765AlbProAT = new String[] {""} ;
      T01L312_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      T01L312_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L312_A10837AlbTrnNc = new String[] {""} ;
      T01L312_A10017AlbFmd = new String[] {""} ;
      T01L312_n10017AlbFmd = new boolean[] {false} ;
      T01L312_A10835AlbTrnNm = new String[] {""} ;
      T01L312_A10018ALbFmdc = new String[] {""} ;
      T01L312_A10836AlbTrnDm = new String[] {""} ;
      T01L312_A5140AlbMarca = new String[] {""} ;
      T01L312_A3867AlbLocDes = new byte[1] ;
      T01L312_A3866AlbLocCar = new byte[1] ;
      T01L312_A914AlbPObsCon = new byte[1] ;
      T01L312_A5141AlbIvaCod = new String[] {""} ;
      T01L312_A7987AlbColCa = new String[] {""} ;
      T01L312_A7162AlbDesp = new int[1] ;
      T01L312_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L312_A7985AlbTipDoc = new int[1] ;
      T01L312_A7984AlbMotTr = new String[] {""} ;
      T01L312_A5803AlbTipCal = new byte[1] ;
      T01L312_A7988AlbObsCb = new String[] {""} ;
      T01L312_A7102AlbNumT = new long[1] ;
      T01L312_A7100AlbMarCo = new String[] {""} ;
      T01L312_A7099AlbOComp = new String[] {""} ;
      T01L312_A3093AlbDivTCod = new String[] {""} ;
      T01L312_n3093AlbDivTCod = new boolean[] {false} ;
      T01L312_A3109AlbDivAbr = new String[] {""} ;
      T01L312_n3109AlbDivAbr = new boolean[] {false} ;
      T01L312_A1258GuiRemDom = new byte[1] ;
      T01L312_n1258GuiRemDom = new boolean[] {false} ;
      T01L312_A3145GuiRemDivT = new String[] {""} ;
      T01L312_n3145GuiRemDivT = new boolean[] {false} ;
      T01L312_A407EmprNom = new String[] {""} ;
      T01L312_n407EmprNom = new boolean[] {false} ;
      T01L312_A1253EmprGuiRem = new String[] {""} ;
      T01L312_A1243GuiRemCli = new int[1] ;
      T01L312_A396EmprCod = new String[] {""} ;
      T01L312_A840TrnCod = new short[1] ;
      T01L312_A3108AlbDivCod = new byte[1] ;
      T01L312_n3108AlbDivCod = new boolean[] {false} ;
      T01L312_A3110GuiRemDiv = new byte[1] ;
      T01L312_n3110GuiRemDiv = new boolean[] {false} ;
      T01L312_A1260BusDomEnv = new byte[1] ;
      T01L312_n1260BusDomEnv = new boolean[] {false} ;
      T01L313_A13735CliCNom = new String[] {""} ;
      T01L313_A396EmprCod = new String[] {""} ;
      T01L313_A252CliCod = new int[1] ;
      T01L314_A13735CliCNom = new String[] {""} ;
      T01L314_A396EmprCod = new String[] {""} ;
      T01L314_A252CliCod = new int[1] ;
      T01L315_A13735CliCNom = new String[] {""} ;
      T01L315_A396EmprCod = new String[] {""} ;
      T01L315_A252CliCod = new int[1] ;
      T01L316_A13738TrnCNom = new String[] {""} ;
      T01L316_A396EmprCod = new String[] {""} ;
      T01L316_A840TrnCod = new short[1] ;
      T01L317_A13738TrnCNom = new String[] {""} ;
      T01L317_A396EmprCod = new String[] {""} ;
      T01L317_A840TrnCod = new short[1] ;
      T01L39_A1260BusDomEnv = new byte[1] ;
      T01L39_n1260BusDomEnv = new boolean[] {false} ;
      T01L318_A13738TrnCNom = new String[] {""} ;
      T01L318_A396EmprCod = new String[] {""} ;
      T01L318_A840TrnCod = new short[1] ;
      T01L319_A13735CliCNom = new String[] {""} ;
      T01L319_A396EmprCod = new String[] {""} ;
      T01L319_A252CliCod = new int[1] ;
      T01L38_A3109AlbDivAbr = new String[] {""} ;
      T01L38_n3109AlbDivAbr = new boolean[] {false} ;
      T01L320_A1244GuiRemCln = new String[] {""} ;
      T01L320_A3145GuiRemDivT = new String[] {""} ;
      T01L320_n3145GuiRemDivT = new boolean[] {false} ;
      T01L320_A3110GuiRemDiv = new byte[1] ;
      T01L320_n3110GuiRemDiv = new boolean[] {false} ;
      T01L321_A1260BusDomEnv = new byte[1] ;
      T01L321_n1260BusDomEnv = new boolean[] {false} ;
      T01L322_A841TrnNom = new String[] {""} ;
      T01L322_n841TrnNom = new boolean[] {false} ;
      T01L322_A3643TrnNif = new String[] {""} ;
      T01L322_n3643TrnNif = new boolean[] {false} ;
      T01L323_A841TrnNom = new String[] {""} ;
      T01L323_n841TrnNom = new boolean[] {false} ;
      T01L323_A3643TrnNif = new String[] {""} ;
      T01L323_n3643TrnNif = new boolean[] {false} ;
      T01L324_A3109AlbDivAbr = new String[] {""} ;
      T01L324_n3109AlbDivAbr = new boolean[] {false} ;
      T01L325_A396EmprCod = new String[] {""} ;
      T01L325_A30AlbProCod = new long[1] ;
      T01L33_A30AlbProCod = new long[1] ;
      T01L33_A3865AlbHorSal = new String[] {""} ;
      T01L33_A2242AlbSec = new String[] {""} ;
      T01L33_A39AlbProPri = new String[] {""} ;
      T01L33_A33AlbProEst = new byte[1] ;
      T01L33_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01L33_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01L33_A7098AlbUsu = new String[] {""} ;
      T01L33_A3869AlbCliDes = new int[1] ;
      T01L33_A1259AlbDomEnv = new byte[1] ;
      T01L33_n1259AlbDomEnv = new boolean[] {false} ;
      T01L33_A3868AlbMat = new String[] {""} ;
      T01L33_A5805AlbEnvFtp = new byte[1] ;
      T01L33_A7101AlbLic = new String[] {""} ;
      T01L33_A10765AlbProAT = new String[] {""} ;
      T01L33_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      T01L33_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L33_A10837AlbTrnNc = new String[] {""} ;
      T01L33_A10017AlbFmd = new String[] {""} ;
      T01L33_n10017AlbFmd = new boolean[] {false} ;
      T01L33_A10835AlbTrnNm = new String[] {""} ;
      T01L33_A10018ALbFmdc = new String[] {""} ;
      T01L33_A10836AlbTrnDm = new String[] {""} ;
      T01L33_A5140AlbMarca = new String[] {""} ;
      T01L33_A3867AlbLocDes = new byte[1] ;
      T01L33_A3866AlbLocCar = new byte[1] ;
      T01L33_A914AlbPObsCon = new byte[1] ;
      T01L33_A5141AlbIvaCod = new String[] {""} ;
      T01L33_A7987AlbColCa = new String[] {""} ;
      T01L33_A7162AlbDesp = new int[1] ;
      T01L33_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L33_A7985AlbTipDoc = new int[1] ;
      T01L33_A7984AlbMotTr = new String[] {""} ;
      T01L33_A5803AlbTipCal = new byte[1] ;
      T01L33_A7988AlbObsCb = new String[] {""} ;
      T01L33_A7102AlbNumT = new long[1] ;
      T01L33_A7100AlbMarCo = new String[] {""} ;
      T01L33_A7099AlbOComp = new String[] {""} ;
      T01L33_A3093AlbDivTCod = new String[] {""} ;
      T01L33_n3093AlbDivTCod = new boolean[] {false} ;
      T01L33_A1258GuiRemDom = new byte[1] ;
      T01L33_n1258GuiRemDom = new boolean[] {false} ;
      T01L33_A1253EmprGuiRem = new String[] {""} ;
      T01L33_A1243GuiRemCli = new int[1] ;
      T01L33_A396EmprCod = new String[] {""} ;
      T01L33_A840TrnCod = new short[1] ;
      T01L33_A3108AlbDivCod = new byte[1] ;
      T01L33_n3108AlbDivCod = new boolean[] {false} ;
      T01L326_A396EmprCod = new String[] {""} ;
      T01L326_A30AlbProCod = new long[1] ;
      T01L327_A396EmprCod = new String[] {""} ;
      T01L327_A30AlbProCod = new long[1] ;
      T01L328_A13738TrnCNom = new String[] {""} ;
      T01L328_A396EmprCod = new String[] {""} ;
      T01L328_A840TrnCod = new short[1] ;
      T01L32_A30AlbProCod = new long[1] ;
      T01L32_A3865AlbHorSal = new String[] {""} ;
      T01L32_A2242AlbSec = new String[] {""} ;
      T01L32_A39AlbProPri = new String[] {""} ;
      T01L32_A33AlbProEst = new byte[1] ;
      T01L32_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01L32_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01L32_A7098AlbUsu = new String[] {""} ;
      T01L32_A3869AlbCliDes = new int[1] ;
      T01L32_A1259AlbDomEnv = new byte[1] ;
      T01L32_n1259AlbDomEnv = new boolean[] {false} ;
      T01L32_A3868AlbMat = new String[] {""} ;
      T01L32_A5805AlbEnvFtp = new byte[1] ;
      T01L32_A7101AlbLic = new String[] {""} ;
      T01L32_A10765AlbProAT = new String[] {""} ;
      T01L32_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      T01L32_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L32_A10837AlbTrnNc = new String[] {""} ;
      T01L32_A10017AlbFmd = new String[] {""} ;
      T01L32_n10017AlbFmd = new boolean[] {false} ;
      T01L32_A10835AlbTrnNm = new String[] {""} ;
      T01L32_A10018ALbFmdc = new String[] {""} ;
      T01L32_A10836AlbTrnDm = new String[] {""} ;
      T01L32_A5140AlbMarca = new String[] {""} ;
      T01L32_A3867AlbLocDes = new byte[1] ;
      T01L32_A3866AlbLocCar = new byte[1] ;
      T01L32_A914AlbPObsCon = new byte[1] ;
      T01L32_A5141AlbIvaCod = new String[] {""} ;
      T01L32_A7987AlbColCa = new String[] {""} ;
      T01L32_A7162AlbDesp = new int[1] ;
      T01L32_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L32_A7985AlbTipDoc = new int[1] ;
      T01L32_A7984AlbMotTr = new String[] {""} ;
      T01L32_A5803AlbTipCal = new byte[1] ;
      T01L32_A7988AlbObsCb = new String[] {""} ;
      T01L32_A7102AlbNumT = new long[1] ;
      T01L32_A7100AlbMarCo = new String[] {""} ;
      T01L32_A7099AlbOComp = new String[] {""} ;
      T01L32_A3093AlbDivTCod = new String[] {""} ;
      T01L32_n3093AlbDivTCod = new boolean[] {false} ;
      T01L32_A1258GuiRemDom = new byte[1] ;
      T01L32_n1258GuiRemDom = new boolean[] {false} ;
      T01L32_A1253EmprGuiRem = new String[] {""} ;
      T01L32_A1243GuiRemCli = new int[1] ;
      T01L32_A396EmprCod = new String[] {""} ;
      T01L32_A840TrnCod = new short[1] ;
      T01L32_A3108AlbDivCod = new byte[1] ;
      T01L32_n3108AlbDivCod = new boolean[] {false} ;
      T01L332_A3109AlbDivAbr = new String[] {""} ;
      T01L332_n3109AlbDivAbr = new boolean[] {false} ;
      T01L333_A1244GuiRemCln = new String[] {""} ;
      T01L333_A3145GuiRemDivT = new String[] {""} ;
      T01L333_n3145GuiRemDivT = new boolean[] {false} ;
      T01L333_A3110GuiRemDiv = new byte[1] ;
      T01L333_n3110GuiRemDiv = new boolean[] {false} ;
      T01L334_A841TrnNom = new String[] {""} ;
      T01L334_n841TrnNom = new boolean[] {false} ;
      T01L334_A3643TrnNif = new String[] {""} ;
      T01L334_n3643TrnNif = new boolean[] {false} ;
      T01L335_A1260BusDomEnv = new byte[1] ;
      T01L335_n1260BusDomEnv = new boolean[] {false} ;
      T01L336_A841TrnNom = new String[] {""} ;
      T01L336_n841TrnNom = new boolean[] {false} ;
      T01L336_A3643TrnNif = new String[] {""} ;
      T01L336_n3643TrnNif = new boolean[] {false} ;
      T01L337_A396EmprCod = new String[] {""} ;
      T01L337_A30AlbProCod = new long[1] ;
      T01L337_A12185DltLinObs = new byte[1] ;
      T01L338_A396EmprCod = new String[] {""} ;
      T01L338_A30AlbProCod = new long[1] ;
      T01L338_A12176DltHdr = new int[1] ;
      T01L338_A12177DltR = new byte[1] ;
      T01L338_A12178DltP = new String[] {""} ;
      T01L339_A396EmprCod = new String[] {""} ;
      T01L339_A30AlbProCod = new long[1] ;
      T01L339_A7540Alb_NFisca = new String[] {""} ;
      T01L340_A396EmprCod = new String[] {""} ;
      T01L340_A30AlbProCod = new long[1] ;
      T01L340_A129BarCod = new int[1] ;
      T01L340_A132BarCodReo = new byte[1] ;
      T01L340_A130BarCodPar = new String[] {""} ;
      T01L341_A396EmprCod = new String[] {""} ;
      T01L341_A30AlbProCod = new long[1] ;
      T01L341_A915AlbPObsLin = new byte[1] ;
      T01L342_A396EmprCod = new String[] {""} ;
      T01L342_A30AlbProCod = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV149Modo = "" ;
      i34AlbProfch = GXutil.nullDate() ;
      i4023AlbFecSal = GXutil.nullDate() ;
      i7098AlbUsu = "" ;
      i10765AlbProAT = "" ;
      i10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13735CliCNom = "" ;
      T01L343_A13735CliCNom = new String[] {""} ;
      T01L344_A13735CliCNom = new String[] {""} ;
      l13738TrnCNom = "" ;
      T01L345_A13738TrnCNom = new String[] {""} ;
      T01L346_A13735CliCNom = new String[] {""} ;
      T01L346_A396EmprCod = new String[] {""} ;
      T01L346_A252CliCod = new int[1] ;
      T01L347_A13735CliCNom = new String[] {""} ;
      T01L347_A396EmprCod = new String[] {""} ;
      T01L347_A252CliCod = new int[1] ;
      T01L348_A13738TrnCNom = new String[] {""} ;
      T01L348_A396EmprCod = new String[] {""} ;
      T01L348_A840TrnCod = new short[1] ;
      GXt_decimal10 = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int13 = new short[1] ;
      Z14253AlbImporte = DecimalUtil.ZERO ;
      GXv_int16 = new long[1] ;
      GXv_int6 = new byte[1] ;
      ZV45ContCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_date15 = new java.util.Date[1] ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      ZV67Fch = GXutil.nullDate() ;
      ZV156Msg_f = "" ;
      T01L349_A13735CliCNom = new String[] {""} ;
      T01L349_A396EmprCod = new String[] {""} ;
      T01L349_A252CliCod = new int[1] ;
      Zh3869AlbCliDes = "" ;
      T01L350_A13735CliCNom = new String[] {""} ;
      T01L350_A396EmprCod = new String[] {""} ;
      T01L350_A252CliCod = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int17 = new byte[1] ;
      T01L351_A13738TrnCNom = new String[] {""} ;
      T01L351_A396EmprCod = new String[] {""} ;
      T01L351_A840TrnCod = new short[1] ;
      T01L352_A841TrnNom = new String[] {""} ;
      T01L352_n841TrnNom = new boolean[] {false} ;
      T01L352_A3643TrnNif = new String[] {""} ;
      T01L352_n3643TrnNif = new boolean[] {false} ;
      Z841TrnNom = "" ;
      Z3643TrnNif = "" ;
      Zh840TrnCod = "" ;
      T01L353_A13735CliCNom = new String[] {""} ;
      T01L353_A396EmprCod = new String[] {""} ;
      T01L353_A252CliCod = new int[1] ;
      T01L354_A1244GuiRemCln = new String[] {""} ;
      T01L354_A3145GuiRemDivT = new String[] {""} ;
      T01L354_n3145GuiRemDivT = new boolean[] {false} ;
      T01L354_A3110GuiRemDiv = new byte[1] ;
      T01L354_n3110GuiRemDiv = new boolean[] {false} ;
      T01L355_A3109AlbDivAbr = new String[] {""} ;
      T01L355_n3109AlbDivAbr = new boolean[] {false} ;
      T01L356_A841TrnNom = new String[] {""} ;
      T01L356_n841TrnNom = new boolean[] {false} ;
      T01L356_A3643TrnNif = new String[] {""} ;
      T01L356_n3643TrnNif = new boolean[] {false} ;
      T01L357_A1260BusDomEnv = new byte[1] ;
      T01L357_n1260BusDomEnv = new boolean[] {false} ;
      Zh1243GuiRemCli = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn06__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn06__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn06__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn06__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn06__default(),
         new Object[] {
             new Object[] {
            T01L32_A30AlbProCod, T01L32_A3865AlbHorSal, T01L32_A2242AlbSec, T01L32_A39AlbProPri, T01L32_A33AlbProEst, T01L32_A34AlbProfch, T01L32_A4023AlbFecSal, T01L32_A7098AlbUsu, T01L32_A3869AlbCliDes, T01L32_A1259AlbDomEnv,
            T01L32_n1259AlbDomEnv, T01L32_A3868AlbMat, T01L32_A5805AlbEnvFtp, T01L32_A7101AlbLic, T01L32_A10765AlbProAT, T01L32_A10019AlbHhfm, T01L32_A10020AlbGrossT, T01L32_A10837AlbTrnNc, T01L32_A10017AlbFmd, T01L32_n10017AlbFmd,
            T01L32_A10835AlbTrnNm, T01L32_A10018ALbFmdc, T01L32_A10836AlbTrnDm, T01L32_A5140AlbMarca, T01L32_A3867AlbLocDes, T01L32_A3866AlbLocCar, T01L32_A914AlbPObsCon, T01L32_A5141AlbIvaCod, T01L32_A7987AlbColCa, T01L32_A7162AlbDesp,
            T01L32_A7986AlbCambio, T01L32_A7985AlbTipDoc, T01L32_A7984AlbMotTr, T01L32_A5803AlbTipCal, T01L32_A7988AlbObsCb, T01L32_A7102AlbNumT, T01L32_A7100AlbMarCo, T01L32_A7099AlbOComp, T01L32_A3093AlbDivTCod, T01L32_n3093AlbDivTCod,
            T01L32_A1258GuiRemDom, T01L32_n1258GuiRemDom, T01L32_A1253EmprGuiRem, T01L32_A1243GuiRemCli, T01L32_A396EmprCod, T01L32_A840TrnCod, T01L32_A3108AlbDivCod, T01L32_n3108AlbDivCod
            }
            , new Object[] {
            T01L33_A30AlbProCod, T01L33_A3865AlbHorSal, T01L33_A2242AlbSec, T01L33_A39AlbProPri, T01L33_A33AlbProEst, T01L33_A34AlbProfch, T01L33_A4023AlbFecSal, T01L33_A7098AlbUsu, T01L33_A3869AlbCliDes, T01L33_A1259AlbDomEnv,
            T01L33_n1259AlbDomEnv, T01L33_A3868AlbMat, T01L33_A5805AlbEnvFtp, T01L33_A7101AlbLic, T01L33_A10765AlbProAT, T01L33_A10019AlbHhfm, T01L33_A10020AlbGrossT, T01L33_A10837AlbTrnNc, T01L33_A10017AlbFmd, T01L33_n10017AlbFmd,
            T01L33_A10835AlbTrnNm, T01L33_A10018ALbFmdc, T01L33_A10836AlbTrnDm, T01L33_A5140AlbMarca, T01L33_A3867AlbLocDes, T01L33_A3866AlbLocCar, T01L33_A914AlbPObsCon, T01L33_A5141AlbIvaCod, T01L33_A7987AlbColCa, T01L33_A7162AlbDesp,
            T01L33_A7986AlbCambio, T01L33_A7985AlbTipDoc, T01L33_A7984AlbMotTr, T01L33_A5803AlbTipCal, T01L33_A7988AlbObsCb, T01L33_A7102AlbNumT, T01L33_A7100AlbMarCo, T01L33_A7099AlbOComp, T01L33_A3093AlbDivTCod, T01L33_n3093AlbDivTCod,
            T01L33_A1258GuiRemDom, T01L33_n1258GuiRemDom, T01L33_A1253EmprGuiRem, T01L33_A1243GuiRemCli, T01L33_A396EmprCod, T01L33_A840TrnCod, T01L33_A3108AlbDivCod, T01L33_n3108AlbDivCod
            }
            , new Object[] {
            T01L34_A1244GuiRemCln, T01L34_A3145GuiRemDivT, T01L34_n3145GuiRemDivT, T01L34_A3110GuiRemDiv, T01L34_n3110GuiRemDiv
            }
            , new Object[] {
            T01L35_A407EmprNom, T01L35_n407EmprNom
            }
            , new Object[] {
            T01L36_A841TrnNom, T01L36_n841TrnNom, T01L36_A3643TrnNif, T01L36_n3643TrnNif
            }
            , new Object[] {
            T01L37_A841TrnNom, T01L37_n841TrnNom, T01L37_A3643TrnNif, T01L37_n3643TrnNif
            }
            , new Object[] {
            T01L38_A3109AlbDivAbr, T01L38_n3109AlbDivAbr
            }
            , new Object[] {
            T01L39_A1260BusDomEnv, T01L39_n1260BusDomEnv
            }
            , new Object[] {
            T01L310_A13738TrnCNom, T01L310_A396EmprCod, T01L310_A840TrnCod
            }
            , new Object[] {
            T01L311_A13735CliCNom, T01L311_A396EmprCod, T01L311_A252CliCod
            }
            , new Object[] {
            T01L312_A252CliCod, T01L312_A266CliEnvLin, T01L312_A30AlbProCod, T01L312_A3865AlbHorSal, T01L312_A2242AlbSec, T01L312_A39AlbProPri, T01L312_A33AlbProEst, T01L312_A34AlbProfch, T01L312_A4023AlbFecSal, T01L312_A7098AlbUsu,
            T01L312_A1244GuiRemCln, T01L312_A3869AlbCliDes, T01L312_A1259AlbDomEnv, T01L312_n1259AlbDomEnv, T01L312_A3868AlbMat, T01L312_A5805AlbEnvFtp, T01L312_A7101AlbLic, T01L312_A10765AlbProAT, T01L312_A10019AlbHhfm, T01L312_A10020AlbGrossT,
            T01L312_A10837AlbTrnNc, T01L312_A10017AlbFmd, T01L312_n10017AlbFmd, T01L312_A10835AlbTrnNm, T01L312_A10018ALbFmdc, T01L312_A10836AlbTrnDm, T01L312_A5140AlbMarca, T01L312_A3867AlbLocDes, T01L312_A3866AlbLocCar, T01L312_A914AlbPObsCon,
            T01L312_A5141AlbIvaCod, T01L312_A7987AlbColCa, T01L312_A7162AlbDesp, T01L312_A7986AlbCambio, T01L312_A7985AlbTipDoc, T01L312_A7984AlbMotTr, T01L312_A5803AlbTipCal, T01L312_A7988AlbObsCb, T01L312_A7102AlbNumT, T01L312_A7100AlbMarCo,
            T01L312_A7099AlbOComp, T01L312_A3093AlbDivTCod, T01L312_n3093AlbDivTCod, T01L312_A3109AlbDivAbr, T01L312_n3109AlbDivAbr, T01L312_A1258GuiRemDom, T01L312_n1258GuiRemDom, T01L312_A3145GuiRemDivT, T01L312_n3145GuiRemDivT, T01L312_A407EmprNom,
            T01L312_n407EmprNom, T01L312_A1253EmprGuiRem, T01L312_A1243GuiRemCli, T01L312_A396EmprCod, T01L312_A840TrnCod, T01L312_A3108AlbDivCod, T01L312_n3108AlbDivCod, T01L312_A3110GuiRemDiv, T01L312_n3110GuiRemDiv, T01L312_A1260BusDomEnv,
            T01L312_n1260BusDomEnv
            }
            , new Object[] {
            T01L313_A13735CliCNom, T01L313_A396EmprCod, T01L313_A252CliCod
            }
            , new Object[] {
            T01L314_A13735CliCNom, T01L314_A396EmprCod, T01L314_A252CliCod
            }
            , new Object[] {
            T01L315_A13735CliCNom, T01L315_A396EmprCod, T01L315_A252CliCod
            }
            , new Object[] {
            T01L316_A13738TrnCNom, T01L316_A396EmprCod, T01L316_A840TrnCod
            }
            , new Object[] {
            T01L317_A13738TrnCNom, T01L317_A396EmprCod, T01L317_A840TrnCod
            }
            , new Object[] {
            T01L318_A13738TrnCNom, T01L318_A396EmprCod, T01L318_A840TrnCod
            }
            , new Object[] {
            T01L319_A13735CliCNom, T01L319_A396EmprCod, T01L319_A252CliCod
            }
            , new Object[] {
            T01L320_A1244GuiRemCln, T01L320_A3145GuiRemDivT, T01L320_n3145GuiRemDivT, T01L320_A3110GuiRemDiv, T01L320_n3110GuiRemDiv
            }
            , new Object[] {
            T01L321_A1260BusDomEnv, T01L321_n1260BusDomEnv
            }
            , new Object[] {
            T01L322_A841TrnNom, T01L322_n841TrnNom, T01L322_A3643TrnNif, T01L322_n3643TrnNif
            }
            , new Object[] {
            T01L323_A841TrnNom, T01L323_n841TrnNom, T01L323_A3643TrnNif, T01L323_n3643TrnNif
            }
            , new Object[] {
            T01L324_A3109AlbDivAbr, T01L324_n3109AlbDivAbr
            }
            , new Object[] {
            T01L325_A396EmprCod, T01L325_A30AlbProCod
            }
            , new Object[] {
            T01L326_A396EmprCod, T01L326_A30AlbProCod
            }
            , new Object[] {
            T01L327_A396EmprCod, T01L327_A30AlbProCod
            }
            , new Object[] {
            T01L328_A13738TrnCNom, T01L328_A396EmprCod, T01L328_A840TrnCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01L332_A3109AlbDivAbr, T01L332_n3109AlbDivAbr
            }
            , new Object[] {
            T01L333_A1244GuiRemCln, T01L333_A3145GuiRemDivT, T01L333_n3145GuiRemDivT, T01L333_A3110GuiRemDiv, T01L333_n3110GuiRemDiv
            }
            , new Object[] {
            T01L334_A841TrnNom, T01L334_n841TrnNom, T01L334_A3643TrnNif, T01L334_n3643TrnNif
            }
            , new Object[] {
            T01L335_A1260BusDomEnv, T01L335_n1260BusDomEnv
            }
            , new Object[] {
            T01L336_A841TrnNom, T01L336_n841TrnNom, T01L336_A3643TrnNif, T01L336_n3643TrnNif
            }
            , new Object[] {
            T01L337_A396EmprCod, T01L337_A30AlbProCod, T01L337_A12185DltLinObs
            }
            , new Object[] {
            T01L338_A396EmprCod, T01L338_A30AlbProCod, T01L338_A12176DltHdr, T01L338_A12177DltR, T01L338_A12178DltP
            }
            , new Object[] {
            T01L339_A396EmprCod, T01L339_A30AlbProCod, T01L339_A7540Alb_NFisca
            }
            , new Object[] {
            T01L340_A396EmprCod, T01L340_A30AlbProCod, T01L340_A129BarCod, T01L340_A132BarCodReo, T01L340_A130BarCodPar
            }
            , new Object[] {
            T01L341_A396EmprCod, T01L341_A30AlbProCod, T01L341_A915AlbPObsLin
            }
            , new Object[] {
            T01L342_A396EmprCod, T01L342_A30AlbProCod
            }
            , new Object[] {
            T01L343_A13735CliCNom
            }
            , new Object[] {
            T01L344_A13735CliCNom
            }
            , new Object[] {
            T01L345_A13738TrnCNom
            }
            , new Object[] {
            T01L346_A13735CliCNom, T01L346_A396EmprCod, T01L346_A252CliCod
            }
            , new Object[] {
            T01L347_A13735CliCNom, T01L347_A396EmprCod, T01L347_A252CliCod
            }
            , new Object[] {
            T01L348_A13738TrnCNom, T01L348_A396EmprCod, T01L348_A840TrnCod
            }
            , new Object[] {
            T01L349_A13735CliCNom, T01L349_A396EmprCod, T01L349_A252CliCod
            }
            , new Object[] {
            T01L350_A13735CliCNom, T01L350_A396EmprCod, T01L350_A252CliCod
            }
            , new Object[] {
            T01L351_A13738TrnCNom, T01L351_A396EmprCod, T01L351_A840TrnCod
            }
            , new Object[] {
            T01L352_A841TrnNom, T01L352_n841TrnNom, T01L352_A3643TrnNif, T01L352_n3643TrnNif
            }
            , new Object[] {
            T01L353_A13735CliCNom, T01L353_A396EmprCod, T01L353_A252CliCod
            }
            , new Object[] {
            T01L354_A1244GuiRemCln, T01L354_A3145GuiRemDivT, T01L354_n3145GuiRemDivT, T01L354_A3110GuiRemDiv, T01L354_n3110GuiRemDiv
            }
            , new Object[] {
            T01L355_A3109AlbDivAbr, T01L355_n3109AlbDivAbr
            }
            , new Object[] {
            T01L356_A841TrnNom, T01L356_n841TrnNom, T01L356_A3643TrnNif, T01L356_n3643TrnNif
            }
            , new Object[] {
            T01L357_A1260BusDomEnv, T01L357_n1260BusDomEnv
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV217Pgmname = "TTrn06" ;
      Z10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
      i10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
      Z10765AlbProAT = " " ;
      A10765AlbProAT = " " ;
      i10765AlbProAT = " " ;
      Z7098AlbUsu = "" ;
      A7098AlbUsu = "" ;
      i7098AlbUsu = "" ;
      Z3869AlbCliDes = 0 ;
      A3869AlbCliDes = 0 ;
      Z3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      A3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      Z3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      N3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      A3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      Z3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      A3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      Z3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      N3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      A3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      Z4023AlbFecSal = GXutil.today( ) ;
      A4023AlbFecSal = GXutil.today( ) ;
      i4023AlbFecSal = GXutil.today( ) ;
      Z34AlbProfch = GXutil.today( ) ;
      i34AlbProfch = GXutil.today( ) ;
      A34AlbProfch = GXutil.today( ) ;
   }

   private byte Z33AlbProEst ;
   private byte Z1259AlbDomEnv ;
   private byte Z5805AlbEnvFtp ;
   private byte Z3867AlbLocDes ;
   private byte Z3866AlbLocCar ;
   private byte Z914AlbPObsCon ;
   private byte Z5803AlbTipCal ;
   private byte Z1258GuiRemDom ;
   private byte Z3108AlbDivCod ;
   private byte N3108AlbDivCod ;
   private byte GxWebError ;
   private byte AV99HueAlb ;
   private byte AV69FirmaD ;
   private byte AV71FlagAlb ;
   private byte AV76FlagCont ;
   private byte AV73FlagCli ;
   private byte AV49Ctrlf ;
   private byte A1259AlbDomEnv ;
   private byte A3108AlbDivCod ;
   private byte nKeyPressed ;
   private byte A33AlbProEst ;
   private byte A5805AlbEnvFtp ;
   private byte A3867AlbLocDes ;
   private byte A3866AlbLocCar ;
   private byte A914AlbPObsCon ;
   private byte A5803AlbTipCal ;
   private byte A1260BusDomEnv ;
   private byte A1258GuiRemDom ;
   private byte A3110GuiRemDiv ;
   private byte A14251AlbFactura ;
   private byte AV205Insert_AlbDivCod ;
   private byte Gx_BScreen ;
   private byte AV65F_tinamar ;
   private byte AV59F_carvema ;
   private byte AV58F_albanu ;
   private byte AV37avisar ;
   private byte AV177PrnAlb ;
   private byte AV81FlagGv ;
   private byte AV78FlagEtm ;
   private byte AV90FlagTintu ;
   private byte AV180PwdGrl ;
   private byte AV63F_moda21 ;
   private byte AV147Moda21 ;
   private byte AV54Erfoc ;
   private byte AV182Samofil ;
   private byte AV93granul ;
   private byte AV193Ws ;
   private byte AV162Nows ;
   private byte AV148Modhh ;
   private byte AV178PrnAT ;
   private byte AV56errkgs ;
   private byte AV53Endutex ;
   private byte Z3110GuiRemDiv ;
   private byte Z1260BusDomEnv ;
   private byte gxajaxcallmode ;
   private byte GXt_int5 ;
   private byte Z14251AlbFactura ;
   private byte GXv_int6[] ;
   private byte ZV71FlagAlb ;
   private byte ZV76FlagCont ;
   private byte GXv_int17[] ;
   private byte ZV73FlagCli ;
   private short Z840TrnCod ;
   private short N840TrnCod ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14252AlbLineasA ;
   private short AV204Insert_TrnCod ;
   private short RcdFound3 ;
   private short AV196Copias ;
   private short AV197Copias2 ;
   private short nIsDirty_3 ;
   private short gxhchits ;
   private short GXt_int12 ;
   private short GXv_int13[] ;
   private short Z14252AlbLineasA ;
   private int Z3869AlbCliDes ;
   private int Z7162AlbDesp ;
   private int Z7985AlbTipDoc ;
   private int Z1243GuiRemCli ;
   private int N1243GuiRemCli ;
   private int A3869AlbCliDes ;
   private int AV33AlbLast ;
   private int A1243GuiRemCli ;
   private int trnEnded ;
   private int edtAlbProCod_Enabled ;
   private int edtAlbProfch_Enabled ;
   private int edtAlbFecSal_Enabled ;
   private int edtAlbHorSal_Enabled ;
   private int edtAlbUsu_Enabled ;
   private int edtGuiRemCli_Enabled ;
   private int edtAlbCliDes_Enabled ;
   private int edtAlbDomEnv_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtAlbMat_Enabled ;
   private int edtAlbLic_Enabled ;
   private int edtAlbHhfm_Enabled ;
   private int edtAlbGrossT_Enabled ;
   private int edtAlbFmd_Enabled ;
   private int divUnnamedtable6_Visible ;
   private int edtAlbTrnNm_Visible ;
   private int edtAlbTrnNm_Enabled ;
   private int edtAlbTrnNc_Visible ;
   private int edtAlbTrnNc_Enabled ;
   private int edtAlbTrnDm_Visible ;
   private int edtAlbTrnDm_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int edtALbFmdc_Visible ;
   private int edtALbFmdc_Enabled ;
   private int edtAlbMarca_Visible ;
   private int edtAlbMarca_Enabled ;
   private int edtAlbLocDes_Enabled ;
   private int edtAlbLocDes_Visible ;
   private int edtAlbLocCar_Enabled ;
   private int edtAlbLocCar_Visible ;
   private int edtAlbPObsCon_Enabled ;
   private int edtAlbPObsCon_Visible ;
   private int edtAlbIvaCod_Visible ;
   private int edtAlbIvaCod_Enabled ;
   private int edtAlbColCa_Visible ;
   private int edtAlbColCa_Enabled ;
   private int A7162AlbDesp ;
   private int edtAlbDesp_Enabled ;
   private int edtAlbDesp_Visible ;
   private int edtAlbCambio_Enabled ;
   private int edtAlbCambio_Visible ;
   private int A7985AlbTipDoc ;
   private int edtAlbTipDoc_Enabled ;
   private int edtAlbTipDoc_Visible ;
   private int edtAlbMotTr_Visible ;
   private int edtAlbMotTr_Enabled ;
   private int edtAlbTipCal_Enabled ;
   private int edtAlbTipCal_Visible ;
   private int edtAlbObsCb_Visible ;
   private int edtAlbObsCb_Enabled ;
   private int edtAlbNumT_Enabled ;
   private int edtAlbNumT_Visible ;
   private int edtAlbMarCo_Visible ;
   private int edtAlbMarCo_Enabled ;
   private int edtAlbOComp_Visible ;
   private int edtAlbOComp_Enabled ;
   private int edtTrnNif_Visible ;
   private int edtTrnNif_Enabled ;
   private int edtAlbDivTCod_Visible ;
   private int edtAlbDivTCod_Enabled ;
   private int edtAlbDivAbr_Visible ;
   private int edtAlbDivAbr_Enabled ;
   private int edtAlbDivCod_Visible ;
   private int edtAlbDivCod_Enabled ;
   private int edtBusDomEnv_Enabled ;
   private int edtBusDomEnv_Visible ;
   private int edtEmprGuiRem_Visible ;
   private int edtEmprGuiRem_Enabled ;
   private int edtGuiRemDom_Enabled ;
   private int edtGuiRemDom_Visible ;
   private int edtGuiRemDivT_Visible ;
   private int edtGuiRemDivT_Enabled ;
   private int edtGuiRemDiv_Enabled ;
   private int edtGuiRemDiv_Visible ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtGuiRemCln_Visible ;
   private int edtGuiRemCln_Enabled ;
   private int edtTrnNom_Visible ;
   private int edtTrnNom_Enabled ;
   private int AV203Insert_GuiRemCli ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int AV46ContVal ;
   private int GXt_int8 ;
   private int AV218GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private int A252CliCod ;
   private int ZV33AlbLast ;
   private int GXv_int7[] ;
   private long wcpOAV35AlbProCod ;
   private long Z30AlbProCod ;
   private long Z7102AlbNumT ;
   private long A30AlbProCod ;
   private long AV35AlbProCod ;
   private long A7102AlbNumT ;
   private long GXv_int16[] ;
   private java.math.BigDecimal Z10020AlbGrossT ;
   private java.math.BigDecimal Z7986AlbCambio ;
   private java.math.BigDecimal A10020AlbGrossT ;
   private java.math.BigDecimal A7986AlbCambio ;
   private java.math.BigDecimal A14253AlbImporte ;
   private java.math.BigDecimal GXt_decimal10 ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal Z14253AlbImporte ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV10EmprCod ;
   private String wcpOAV208AlbProPri ;
   private String wcpOAV194AlbSec ;
   private String Z396EmprCod ;
   private String Z3865AlbHorSal ;
   private String Z2242AlbSec ;
   private String Z39AlbProPri ;
   private String Z7098AlbUsu ;
   private String Z3868AlbMat ;
   private String Z7101AlbLic ;
   private String Z10765AlbProAT ;
   private String Z10837AlbTrnNc ;
   private String Z10835AlbTrnNm ;
   private String Z10018ALbFmdc ;
   private String Z10836AlbTrnDm ;
   private String Z5140AlbMarca ;
   private String Z5141AlbIvaCod ;
   private String Z7987AlbColCa ;
   private String Z7984AlbMotTr ;
   private String Z7988AlbObsCb ;
   private String Z7100AlbMarCo ;
   private String Z7099AlbOComp ;
   private String Z3093AlbDivTCod ;
   private String Z1253EmprGuiRem ;
   private String N1253EmprGuiRem ;
   private String N2242AlbSec ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV45ContCod ;
   private String A39AlbProPri ;
   private String Gx_mode ;
   private String AV156Msg_f ;
   private String A1253EmprGuiRem ;
   private String AV10EmprCod ;
   private String AV208AlbProPri ;
   private String AV194AlbSec ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbProCod_Internalname ;
   private String A2242AlbSec ;
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
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String edtAlbProCod_Jsonclick ;
   private String divAlbsec_cell_Internalname ;
   private String divAlbsec_cell_Class ;
   private String divUnnamedtable2_Internalname ;
   private String edtAlbProfch_Internalname ;
   private String edtAlbProfch_Jsonclick ;
   private String edtAlbFecSal_Internalname ;
   private String edtAlbFecSal_Jsonclick ;
   private String edtAlbHorSal_Internalname ;
   private String A3865AlbHorSal ;
   private String edtAlbHorSal_Jsonclick ;
   private String edtAlbUsu_Internalname ;
   private String A7098AlbUsu ;
   private String edtAlbUsu_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtAlbCliDes_Internalname ;
   private String edtAlbCliDes_Jsonclick ;
   private String edtAlbDomEnv_Internalname ;
   private String edtAlbDomEnv_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtAlbMat_Internalname ;
   private String A3868AlbMat ;
   private String edtAlbMat_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String grpUnnamedgroup8_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String divUnnamedtablealbenvftp_Internalname ;
   private String lblTextblockalbenvftp_Internalname ;
   private String lblTextblockalbenvftp_Jsonclick ;
   private String divUnnamedtablealblic_Internalname ;
   private String lblTextblockalblic_Internalname ;
   private String lblTextblockalblic_Jsonclick ;
   private String edtAlbLic_Internalname ;
   private String A7101AlbLic ;
   private String edtAlbLic_Jsonclick ;
   private String divUnnamedtablealbproat_Internalname ;
   private String lblTextblockalbproat_Internalname ;
   private String lblTextblockalbproat_Jsonclick ;
   private String divUnnamedtable10_Internalname ;
   private String divUnnamedtablealbhhfm_Internalname ;
   private String lblTextblockalbhhfm_Internalname ;
   private String lblTextblockalbhhfm_Jsonclick ;
   private String edtAlbHhfm_Internalname ;
   private String edtAlbHhfm_Jsonclick ;
   private String divUnnamedtablealbgrosst_Internalname ;
   private String lblTextblockalbgrosst_Internalname ;
   private String lblTextblockalbgrosst_Jsonclick ;
   private String edtAlbGrossT_Internalname ;
   private String edtAlbGrossT_Jsonclick ;
   private String divUnnamedtablealbfmd_Internalname ;
   private String lblTextblockalbfmd_Internalname ;
   private String lblTextblockalbfmd_Jsonclick ;
   private String edtAlbFmd_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String divAlbtrnnm_cell_Internalname ;
   private String divAlbtrnnm_cell_Class ;
   private String edtAlbTrnNm_Internalname ;
   private String A10835AlbTrnNm ;
   private String edtAlbTrnNm_Jsonclick ;
   private String divAlbtrnnc_cell_Internalname ;
   private String divAlbtrnnc_cell_Class ;
   private String edtAlbTrnNc_Internalname ;
   private String A10837AlbTrnNc ;
   private String edtAlbTrnNc_Jsonclick ;
   private String divAlbtrndm_cell_Internalname ;
   private String divAlbtrndm_cell_Class ;
   private String edtAlbTrnDm_Internalname ;
   private String A10836AlbTrnDm ;
   private String edtAlbTrnDm_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtALbFmdc_Internalname ;
   private String A10018ALbFmdc ;
   private String edtAlbMarca_Internalname ;
   private String A5140AlbMarca ;
   private String edtAlbMarca_Jsonclick ;
   private String edtAlbLocDes_Internalname ;
   private String edtAlbLocDes_Jsonclick ;
   private String edtAlbLocCar_Internalname ;
   private String edtAlbLocCar_Jsonclick ;
   private String edtAlbPObsCon_Internalname ;
   private String edtAlbPObsCon_Jsonclick ;
   private String edtAlbIvaCod_Internalname ;
   private String A5141AlbIvaCod ;
   private String edtAlbIvaCod_Jsonclick ;
   private String edtAlbColCa_Internalname ;
   private String A7987AlbColCa ;
   private String edtAlbColCa_Jsonclick ;
   private String edtAlbDesp_Internalname ;
   private String edtAlbDesp_Jsonclick ;
   private String edtAlbCambio_Internalname ;
   private String edtAlbCambio_Jsonclick ;
   private String edtAlbTipDoc_Internalname ;
   private String edtAlbTipDoc_Jsonclick ;
   private String edtAlbMotTr_Internalname ;
   private String A7984AlbMotTr ;
   private String edtAlbMotTr_Jsonclick ;
   private String edtAlbTipCal_Internalname ;
   private String edtAlbTipCal_Jsonclick ;
   private String edtAlbObsCb_Internalname ;
   private String A7988AlbObsCb ;
   private String edtAlbObsCb_Jsonclick ;
   private String edtAlbNumT_Internalname ;
   private String edtAlbNumT_Jsonclick ;
   private String edtAlbMarCo_Internalname ;
   private String A7100AlbMarCo ;
   private String edtAlbMarCo_Jsonclick ;
   private String edtAlbOComp_Internalname ;
   private String A7099AlbOComp ;
   private String edtAlbOComp_Jsonclick ;
   private String edtTrnNif_Internalname ;
   private String A3643TrnNif ;
   private String edtTrnNif_Jsonclick ;
   private String edtAlbDivTCod_Internalname ;
   private String A3093AlbDivTCod ;
   private String edtAlbDivTCod_Jsonclick ;
   private String edtAlbDivAbr_Internalname ;
   private String A3109AlbDivAbr ;
   private String edtAlbDivAbr_Jsonclick ;
   private String edtAlbDivCod_Internalname ;
   private String edtAlbDivCod_Jsonclick ;
   private String edtBusDomEnv_Internalname ;
   private String edtBusDomEnv_Jsonclick ;
   private String edtEmprGuiRem_Internalname ;
   private String edtEmprGuiRem_Jsonclick ;
   private String edtGuiRemDom_Internalname ;
   private String edtGuiRemDom_Jsonclick ;
   private String edtGuiRemDivT_Internalname ;
   private String A3145GuiRemDivT ;
   private String edtGuiRemDivT_Jsonclick ;
   private String edtGuiRemDiv_Internalname ;
   private String edtGuiRemDiv_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtGuiRemCln_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String AV149Modo ;
   private String AV206Insert_EmprGuiRem ;
   private String AV8UsurCod ;
   private String AV217Pgmname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode3 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String Z407EmprNom ;
   private String Z3109AlbDivAbr ;
   private String Z1244GuiRemCln ;
   private String Z3145GuiRemDivT ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV149Modo ;
   private String i7098AlbUsu ;
   private String i10765AlbProAT ;
   private String gxwrpcisep ;
   private String ZV45ContCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV156Msg_f ;
   private String GXv_char4[] ;
   private String Z841TrnNom ;
   private String Z3643TrnNif ;
   private java.util.Date Z10019AlbHhfm ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date i10019AlbHhfm ;
   private java.util.Date Z34AlbProfch ;
   private java.util.Date Z4023AlbFecSal ;
   private java.util.Date AV67Fch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date i34AlbProfch ;
   private java.util.Date i4023AlbFecSal ;
   private java.util.Date GXv_date15[] ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date ZV67Fch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1259AlbDomEnv ;
   private boolean n3108AlbDivCod ;
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
   private boolean n10017AlbFmd ;
   private boolean n3643TrnNif ;
   private boolean n3093AlbDivTCod ;
   private boolean n3109AlbDivAbr ;
   private boolean n1260BusDomEnv ;
   private boolean n1258GuiRemDom ;
   private boolean n3145GuiRemDivT ;
   private boolean n3110GuiRemDiv ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z10017AlbFmd ;
   private String A13735CliCNom ;
   private String A13738TrnCNom ;
   private String h1243GuiRemCli ;
   private String h3869AlbCliDes ;
   private String h840TrnCod ;
   private String A10017AlbFmd ;
   private String AV214NombreDinamica ;
   private String AV215SdtParametroCallsJSon ;
   private String l13735CliCNom ;
   private String l13738TrnCNom ;
   private String Zh3869AlbCliDes ;
   private String Zh840TrnCod ;
   private String Zh1243GuiRemCli ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV202WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXBaseCollection<app.SdtSdtParametroCalls> AV212SdtParametroCallsCollection ;
   private HTMLChoice cmbAlbProPri ;
   private HTMLChoice cmbAlbProEst ;
   private HTMLChoice cmbAlbSec ;
   private HTMLChoice cmbAlbEnvFtp ;
   private HTMLChoice cmbAlbProAT ;
   private IDataStoreProvider pr_default ;
   private String[] T01L35_A407EmprNom ;
   private boolean[] T01L35_n407EmprNom ;
   private String[] T01L310_A13738TrnCNom ;
   private String[] T01L310_A396EmprCod ;
   private short[] T01L310_A840TrnCod ;
   private String[] T01L311_A13735CliCNom ;
   private String[] T01L311_A396EmprCod ;
   private int[] T01L311_A252CliCod ;
   private String[] T01L36_A841TrnNom ;
   private boolean[] T01L36_n841TrnNom ;
   private String[] T01L36_A3643TrnNif ;
   private boolean[] T01L36_n3643TrnNif ;
   private String[] T01L34_A1244GuiRemCln ;
   private String[] T01L34_A3145GuiRemDivT ;
   private boolean[] T01L34_n3145GuiRemDivT ;
   private byte[] T01L34_A3110GuiRemDiv ;
   private boolean[] T01L34_n3110GuiRemDiv ;
   private String[] T01L37_A841TrnNom ;
   private boolean[] T01L37_n841TrnNom ;
   private String[] T01L37_A3643TrnNif ;
   private boolean[] T01L37_n3643TrnNif ;
   private int[] T01L312_A252CliCod ;
   private byte[] T01L312_A266CliEnvLin ;
   private long[] T01L312_A30AlbProCod ;
   private String[] T01L312_A3865AlbHorSal ;
   private String[] T01L312_A2242AlbSec ;
   private String[] T01L312_A39AlbProPri ;
   private byte[] T01L312_A33AlbProEst ;
   private java.util.Date[] T01L312_A34AlbProfch ;
   private java.util.Date[] T01L312_A4023AlbFecSal ;
   private String[] T01L312_A7098AlbUsu ;
   private String[] T01L312_A1244GuiRemCln ;
   private int[] T01L312_A3869AlbCliDes ;
   private byte[] T01L312_A1259AlbDomEnv ;
   private boolean[] T01L312_n1259AlbDomEnv ;
   private String[] T01L312_A3868AlbMat ;
   private byte[] T01L312_A5805AlbEnvFtp ;
   private String[] T01L312_A7101AlbLic ;
   private String[] T01L312_A10765AlbProAT ;
   private java.util.Date[] T01L312_A10019AlbHhfm ;
   private java.math.BigDecimal[] T01L312_A10020AlbGrossT ;
   private String[] T01L312_A10837AlbTrnNc ;
   private String[] T01L312_A10017AlbFmd ;
   private boolean[] T01L312_n10017AlbFmd ;
   private String[] T01L312_A10835AlbTrnNm ;
   private String[] T01L312_A10018ALbFmdc ;
   private String[] T01L312_A10836AlbTrnDm ;
   private String[] T01L312_A5140AlbMarca ;
   private byte[] T01L312_A3867AlbLocDes ;
   private byte[] T01L312_A3866AlbLocCar ;
   private byte[] T01L312_A914AlbPObsCon ;
   private String[] T01L312_A5141AlbIvaCod ;
   private String[] T01L312_A7987AlbColCa ;
   private int[] T01L312_A7162AlbDesp ;
   private java.math.BigDecimal[] T01L312_A7986AlbCambio ;
   private int[] T01L312_A7985AlbTipDoc ;
   private String[] T01L312_A7984AlbMotTr ;
   private byte[] T01L312_A5803AlbTipCal ;
   private String[] T01L312_A7988AlbObsCb ;
   private long[] T01L312_A7102AlbNumT ;
   private String[] T01L312_A7100AlbMarCo ;
   private String[] T01L312_A7099AlbOComp ;
   private String[] T01L312_A3093AlbDivTCod ;
   private boolean[] T01L312_n3093AlbDivTCod ;
   private String[] T01L312_A3109AlbDivAbr ;
   private boolean[] T01L312_n3109AlbDivAbr ;
   private byte[] T01L312_A1258GuiRemDom ;
   private boolean[] T01L312_n1258GuiRemDom ;
   private String[] T01L312_A3145GuiRemDivT ;
   private boolean[] T01L312_n3145GuiRemDivT ;
   private String[] T01L312_A407EmprNom ;
   private boolean[] T01L312_n407EmprNom ;
   private String[] T01L312_A1253EmprGuiRem ;
   private int[] T01L312_A1243GuiRemCli ;
   private String[] T01L312_A396EmprCod ;
   private short[] T01L312_A840TrnCod ;
   private byte[] T01L312_A3108AlbDivCod ;
   private boolean[] T01L312_n3108AlbDivCod ;
   private byte[] T01L312_A3110GuiRemDiv ;
   private boolean[] T01L312_n3110GuiRemDiv ;
   private byte[] T01L312_A1260BusDomEnv ;
   private boolean[] T01L312_n1260BusDomEnv ;
   private String[] T01L313_A13735CliCNom ;
   private String[] T01L313_A396EmprCod ;
   private int[] T01L313_A252CliCod ;
   private String[] T01L314_A13735CliCNom ;
   private String[] T01L314_A396EmprCod ;
   private int[] T01L314_A252CliCod ;
   private String[] T01L315_A13735CliCNom ;
   private String[] T01L315_A396EmprCod ;
   private int[] T01L315_A252CliCod ;
   private String[] T01L316_A13738TrnCNom ;
   private String[] T01L316_A396EmprCod ;
   private short[] T01L316_A840TrnCod ;
   private String[] T01L317_A13738TrnCNom ;
   private String[] T01L317_A396EmprCod ;
   private short[] T01L317_A840TrnCod ;
   private byte[] T01L39_A1260BusDomEnv ;
   private boolean[] T01L39_n1260BusDomEnv ;
   private String[] T01L318_A13738TrnCNom ;
   private String[] T01L318_A396EmprCod ;
   private short[] T01L318_A840TrnCod ;
   private String[] T01L319_A13735CliCNom ;
   private String[] T01L319_A396EmprCod ;
   private int[] T01L319_A252CliCod ;
   private String[] T01L38_A3109AlbDivAbr ;
   private boolean[] T01L38_n3109AlbDivAbr ;
   private String[] T01L320_A1244GuiRemCln ;
   private String[] T01L320_A3145GuiRemDivT ;
   private boolean[] T01L320_n3145GuiRemDivT ;
   private byte[] T01L320_A3110GuiRemDiv ;
   private boolean[] T01L320_n3110GuiRemDiv ;
   private byte[] T01L321_A1260BusDomEnv ;
   private boolean[] T01L321_n1260BusDomEnv ;
   private String[] T01L322_A841TrnNom ;
   private boolean[] T01L322_n841TrnNom ;
   private String[] T01L322_A3643TrnNif ;
   private boolean[] T01L322_n3643TrnNif ;
   private String[] T01L323_A841TrnNom ;
   private boolean[] T01L323_n841TrnNom ;
   private String[] T01L323_A3643TrnNif ;
   private boolean[] T01L323_n3643TrnNif ;
   private String[] T01L324_A3109AlbDivAbr ;
   private boolean[] T01L324_n3109AlbDivAbr ;
   private String[] T01L325_A396EmprCod ;
   private long[] T01L325_A30AlbProCod ;
   private long[] T01L33_A30AlbProCod ;
   private String[] T01L33_A3865AlbHorSal ;
   private String[] T01L33_A2242AlbSec ;
   private String[] T01L33_A39AlbProPri ;
   private byte[] T01L33_A33AlbProEst ;
   private java.util.Date[] T01L33_A34AlbProfch ;
   private java.util.Date[] T01L33_A4023AlbFecSal ;
   private String[] T01L33_A7098AlbUsu ;
   private int[] T01L33_A3869AlbCliDes ;
   private byte[] T01L33_A1259AlbDomEnv ;
   private boolean[] T01L33_n1259AlbDomEnv ;
   private String[] T01L33_A3868AlbMat ;
   private byte[] T01L33_A5805AlbEnvFtp ;
   private String[] T01L33_A7101AlbLic ;
   private String[] T01L33_A10765AlbProAT ;
   private java.util.Date[] T01L33_A10019AlbHhfm ;
   private java.math.BigDecimal[] T01L33_A10020AlbGrossT ;
   private String[] T01L33_A10837AlbTrnNc ;
   private String[] T01L33_A10017AlbFmd ;
   private boolean[] T01L33_n10017AlbFmd ;
   private String[] T01L33_A10835AlbTrnNm ;
   private String[] T01L33_A10018ALbFmdc ;
   private String[] T01L33_A10836AlbTrnDm ;
   private String[] T01L33_A5140AlbMarca ;
   private byte[] T01L33_A3867AlbLocDes ;
   private byte[] T01L33_A3866AlbLocCar ;
   private byte[] T01L33_A914AlbPObsCon ;
   private String[] T01L33_A5141AlbIvaCod ;
   private String[] T01L33_A7987AlbColCa ;
   private int[] T01L33_A7162AlbDesp ;
   private java.math.BigDecimal[] T01L33_A7986AlbCambio ;
   private int[] T01L33_A7985AlbTipDoc ;
   private String[] T01L33_A7984AlbMotTr ;
   private byte[] T01L33_A5803AlbTipCal ;
   private String[] T01L33_A7988AlbObsCb ;
   private long[] T01L33_A7102AlbNumT ;
   private String[] T01L33_A7100AlbMarCo ;
   private String[] T01L33_A7099AlbOComp ;
   private String[] T01L33_A3093AlbDivTCod ;
   private boolean[] T01L33_n3093AlbDivTCod ;
   private byte[] T01L33_A1258GuiRemDom ;
   private boolean[] T01L33_n1258GuiRemDom ;
   private String[] T01L33_A1253EmprGuiRem ;
   private int[] T01L33_A1243GuiRemCli ;
   private String[] T01L33_A396EmprCod ;
   private short[] T01L33_A840TrnCod ;
   private byte[] T01L33_A3108AlbDivCod ;
   private boolean[] T01L33_n3108AlbDivCod ;
   private String[] T01L326_A396EmprCod ;
   private long[] T01L326_A30AlbProCod ;
   private String[] T01L327_A396EmprCod ;
   private long[] T01L327_A30AlbProCod ;
   private String[] T01L328_A13738TrnCNom ;
   private String[] T01L328_A396EmprCod ;
   private short[] T01L328_A840TrnCod ;
   private long[] T01L32_A30AlbProCod ;
   private String[] T01L32_A3865AlbHorSal ;
   private String[] T01L32_A2242AlbSec ;
   private String[] T01L32_A39AlbProPri ;
   private byte[] T01L32_A33AlbProEst ;
   private java.util.Date[] T01L32_A34AlbProfch ;
   private java.util.Date[] T01L32_A4023AlbFecSal ;
   private String[] T01L32_A7098AlbUsu ;
   private int[] T01L32_A3869AlbCliDes ;
   private byte[] T01L32_A1259AlbDomEnv ;
   private boolean[] T01L32_n1259AlbDomEnv ;
   private String[] T01L32_A3868AlbMat ;
   private byte[] T01L32_A5805AlbEnvFtp ;
   private String[] T01L32_A7101AlbLic ;
   private String[] T01L32_A10765AlbProAT ;
   private java.util.Date[] T01L32_A10019AlbHhfm ;
   private java.math.BigDecimal[] T01L32_A10020AlbGrossT ;
   private String[] T01L32_A10837AlbTrnNc ;
   private String[] T01L32_A10017AlbFmd ;
   private boolean[] T01L32_n10017AlbFmd ;
   private String[] T01L32_A10835AlbTrnNm ;
   private String[] T01L32_A10018ALbFmdc ;
   private String[] T01L32_A10836AlbTrnDm ;
   private String[] T01L32_A5140AlbMarca ;
   private byte[] T01L32_A3867AlbLocDes ;
   private byte[] T01L32_A3866AlbLocCar ;
   private byte[] T01L32_A914AlbPObsCon ;
   private String[] T01L32_A5141AlbIvaCod ;
   private String[] T01L32_A7987AlbColCa ;
   private int[] T01L32_A7162AlbDesp ;
   private java.math.BigDecimal[] T01L32_A7986AlbCambio ;
   private int[] T01L32_A7985AlbTipDoc ;
   private String[] T01L32_A7984AlbMotTr ;
   private byte[] T01L32_A5803AlbTipCal ;
   private String[] T01L32_A7988AlbObsCb ;
   private long[] T01L32_A7102AlbNumT ;
   private String[] T01L32_A7100AlbMarCo ;
   private String[] T01L32_A7099AlbOComp ;
   private String[] T01L32_A3093AlbDivTCod ;
   private boolean[] T01L32_n3093AlbDivTCod ;
   private byte[] T01L32_A1258GuiRemDom ;
   private boolean[] T01L32_n1258GuiRemDom ;
   private String[] T01L32_A1253EmprGuiRem ;
   private int[] T01L32_A1243GuiRemCli ;
   private String[] T01L32_A396EmprCod ;
   private short[] T01L32_A840TrnCod ;
   private byte[] T01L32_A3108AlbDivCod ;
   private boolean[] T01L32_n3108AlbDivCod ;
   private String[] T01L332_A3109AlbDivAbr ;
   private boolean[] T01L332_n3109AlbDivAbr ;
   private String[] T01L333_A1244GuiRemCln ;
   private String[] T01L333_A3145GuiRemDivT ;
   private boolean[] T01L333_n3145GuiRemDivT ;
   private byte[] T01L333_A3110GuiRemDiv ;
   private boolean[] T01L333_n3110GuiRemDiv ;
   private String[] T01L334_A841TrnNom ;
   private boolean[] T01L334_n841TrnNom ;
   private String[] T01L334_A3643TrnNif ;
   private boolean[] T01L334_n3643TrnNif ;
   private byte[] T01L335_A1260BusDomEnv ;
   private boolean[] T01L335_n1260BusDomEnv ;
   private String[] T01L336_A841TrnNom ;
   private boolean[] T01L336_n841TrnNom ;
   private String[] T01L336_A3643TrnNif ;
   private boolean[] T01L336_n3643TrnNif ;
   private String[] T01L337_A396EmprCod ;
   private long[] T01L337_A30AlbProCod ;
   private byte[] T01L337_A12185DltLinObs ;
   private String[] T01L338_A396EmprCod ;
   private long[] T01L338_A30AlbProCod ;
   private int[] T01L338_A12176DltHdr ;
   private byte[] T01L338_A12177DltR ;
   private String[] T01L338_A12178DltP ;
   private String[] T01L339_A396EmprCod ;
   private long[] T01L339_A30AlbProCod ;
   private String[] T01L339_A7540Alb_NFisca ;
   private String[] T01L340_A396EmprCod ;
   private long[] T01L340_A30AlbProCod ;
   private int[] T01L340_A129BarCod ;
   private byte[] T01L340_A132BarCodReo ;
   private String[] T01L340_A130BarCodPar ;
   private String[] T01L341_A396EmprCod ;
   private long[] T01L341_A30AlbProCod ;
   private byte[] T01L341_A915AlbPObsLin ;
   private String[] T01L342_A396EmprCod ;
   private long[] T01L342_A30AlbProCod ;
   private String[] T01L343_A13735CliCNom ;
   private String[] T01L344_A13735CliCNom ;
   private String[] T01L345_A13738TrnCNom ;
   private String[] T01L346_A13735CliCNom ;
   private String[] T01L346_A396EmprCod ;
   private int[] T01L346_A252CliCod ;
   private String[] T01L347_A13735CliCNom ;
   private String[] T01L347_A396EmprCod ;
   private int[] T01L347_A252CliCod ;
   private String[] T01L348_A13738TrnCNom ;
   private String[] T01L348_A396EmprCod ;
   private short[] T01L348_A840TrnCod ;
   private String[] T01L349_A13735CliCNom ;
   private String[] T01L349_A396EmprCod ;
   private int[] T01L349_A252CliCod ;
   private String[] T01L350_A13735CliCNom ;
   private String[] T01L350_A396EmprCod ;
   private int[] T01L350_A252CliCod ;
   private String[] T01L351_A13738TrnCNom ;
   private String[] T01L351_A396EmprCod ;
   private short[] T01L351_A840TrnCod ;
   private String[] T01L352_A841TrnNom ;
   private boolean[] T01L352_n841TrnNom ;
   private String[] T01L352_A3643TrnNif ;
   private boolean[] T01L352_n3643TrnNif ;
   private String[] T01L353_A13735CliCNom ;
   private String[] T01L353_A396EmprCod ;
   private int[] T01L353_A252CliCod ;
   private String[] T01L354_A1244GuiRemCln ;
   private String[] T01L354_A3145GuiRemDivT ;
   private boolean[] T01L354_n3145GuiRemDivT ;
   private byte[] T01L354_A3110GuiRemDiv ;
   private boolean[] T01L354_n3110GuiRemDiv ;
   private String[] T01L355_A3109AlbDivAbr ;
   private boolean[] T01L355_n3109AlbDivAbr ;
   private String[] T01L356_A841TrnNom ;
   private boolean[] T01L356_n841TrnNom ;
   private String[] T01L356_A3643TrnNif ;
   private boolean[] T01L356_n3643TrnNif ;
   private byte[] T01L357_A1260BusDomEnv ;
   private boolean[] T01L357_n1260BusDomEnv ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.SdtSdtParametroCalls AV213SdtParametroCalls ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV201TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV207TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV200WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class ttrn06__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn06__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn06__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn06__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn06__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01L32", "SELECT AlbProCod, AlbHorSal, AlbSec, AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbHorSal, AlbSec, AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, TrnCod, AlbDivCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L33", "SELECT AlbProCod, AlbHorSal, AlbSec, AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L34", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L35", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L36", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L37", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L38", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L39", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L310", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE TrnCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L311", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L312", "SELECT /*+ FIRST_ROWS(100) */ T5.CliCod, T5.CliEnvLin, TM1.AlbProCod, TM1.AlbHorSal, TM1.AlbSec, TM1.AlbProPri, TM1.AlbProEst, TM1.AlbProfch, TM1.AlbFecSal, TM1.AlbUsu, T4.CliNom AS GuiRemCln, TM1.AlbCliDes, TM1.AlbDomEnv, TM1.AlbMat, TM1.AlbEnvFtp, TM1.AlbLic, TM1.AlbProAT, TM1.AlbHhfm, TM1.AlbGrossT, TM1.AlbTrnNc, TM1.AlbFmd, TM1.AlbTrnNm, TM1.ALbFmdc, TM1.AlbTrnDm, TM1.AlbMarca, TM1.AlbLocDes, TM1.AlbLocCar, TM1.AlbPObsCon, TM1.AlbIvaCod, TM1.AlbColCa, TM1.AlbDesp, TM1.AlbCambio, TM1.AlbTipDoc, TM1.AlbMotTr, TM1.AlbTipCal, TM1.AlbObsCb, TM1.AlbNumT, TM1.AlbMarCo, TM1.AlbOComp, TM1.AlbDivTCod, T3.DivAbr AS AlbDivAbr, TM1.GuiRemDom, T4.CliDivTra AS GuiRemDivT, T2.EmprNom, TM1.EmprGuiRem AS EmprGuiRem, TM1.GuiRemCli AS GuiRemCli, TM1.EmprCod, TM1.TrnCod, TM1.AlbDivCod AS AlbDivCod, T4.CliDivCod AS GuiRemDiv, COALESCE( T5.CliEnvLin, 0) AS BusDomEnv FROM ((((TXPCALPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPDIVISA T3 ON T3.DivCod = TM1.AlbDivCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprGuiRem AND T4.CliCod = TM1.GuiRemCli) LEFT JOIN TXPCLIENV T5 ON T5.EmprCod = TM1.EmprGuiRem AND T5.CliCod = TM1.GuiRemCli AND T5.CliEnvLin = TM1.AlbDomEnv) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L313", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L314", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L315", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L316", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE TrnCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L317", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L318", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L319", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L320", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L321", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L322", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L323", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L324", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L325", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L326", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( AlbProCod > ?) and EmprCod = ? ORDER BY EmprCod, AlbProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L327", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( AlbProCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, AlbProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L328", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01L329", "INSERT INTO TXPCALPRD(AlbProCod, AlbHorSal, AlbSec, AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod, AlbProEso, AlbProEnt, AlbProBon, AlbProTBo, AlbKilRea, AlbProNroF, AlbDomEv, DltUltob, FpgCod, AlbPdATCUD, AlbFecAnu, AlbUsuAnu, AlbHorAnu, AlbPdSerAT, AlbPdTipAT, AlbEnvMail) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01L330", "UPDATE TXPCALPRD SET AlbHorSal=?, AlbSec=?, AlbProPri=?, AlbProEst=?, AlbProfch=?, AlbFecSal=?, AlbUsu=?, AlbCliDes=?, AlbDomEnv=?, AlbMat=?, AlbEnvFtp=?, AlbLic=?, AlbProAT=?, AlbHhfm=?, AlbGrossT=?, AlbTrnNc=?, AlbFmd=?, AlbTrnNm=?, ALbFmdc=?, AlbTrnDm=?, AlbMarca=?, AlbLocDes=?, AlbLocCar=?, AlbPObsCon=?, AlbIvaCod=?, AlbColCa=?, AlbDesp=?, AlbCambio=?, AlbTipDoc=?, AlbMotTr=?, AlbTipCal=?, AlbObsCb=?, AlbNumT=?, AlbMarCo=?, AlbOComp=?, AlbDivTCod=?, GuiRemDom=?, EmprGuiRem=?, GuiRemCli=?, TrnCod=?, AlbDivCod=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01L331", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T01L332", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L333", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L334", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L335", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L336", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L337", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L338", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L339", "SELECT * FROM (SELECT EmprCod, AlbProCod, Alb_NFisca FROM TXPCNOTRE WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L340", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L341", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L342", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L343", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?)) ORDER BY CliCNom) WHERE rownum <= 10 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L344", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?) ORDER BY CliCNom) WHERE rownum <= 10 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L345", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom FROM TXPTRANSP WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, '')))) like '%' || UPPER(?) ORDER BY TrnCNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L346", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L347", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L348", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L349", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L350", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L351", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L352", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L353", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L354", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L355", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L356", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L357", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((String[]) buf[18])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 60);
               ((String[]) buf[21])[0] = rslt.getString(20, 255);
               ((String[]) buf[22])[0] = rslt.getString(21, 60);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(23);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((byte[]) buf[26])[0] = rslt.getByte(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 3);
               ((String[]) buf[28])[0] = rslt.getString(27, 20);
               ((int[]) buf[29])[0] = rslt.getInt(28);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,4);
               ((int[]) buf[31])[0] = rslt.getInt(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 25);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 60);
               ((long[]) buf[35])[0] = rslt.getLong(34);
               ((String[]) buf[36])[0] = rslt.getString(35, 30);
               ((String[]) buf[37])[0] = rslt.getString(36, 30);
               ((String[]) buf[38])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(38);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(39, 3);
               ((int[]) buf[43])[0] = rslt.getInt(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 3);
               ((short[]) buf[45])[0] = rslt.getShort(42);
               ((byte[]) buf[46])[0] = rslt.getByte(43);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((String[]) buf[18])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 60);
               ((String[]) buf[21])[0] = rslt.getString(20, 255);
               ((String[]) buf[22])[0] = rslt.getString(21, 60);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(23);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((byte[]) buf[26])[0] = rslt.getByte(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 3);
               ((String[]) buf[28])[0] = rslt.getString(27, 20);
               ((int[]) buf[29])[0] = rslt.getInt(28);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,4);
               ((int[]) buf[31])[0] = rslt.getInt(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 25);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 60);
               ((long[]) buf[35])[0] = rslt.getLong(34);
               ((String[]) buf[36])[0] = rslt.getString(35, 30);
               ((String[]) buf[37])[0] = rslt.getString(36, 30);
               ((String[]) buf[38])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(38);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(39, 3);
               ((int[]) buf[43])[0] = rslt.getInt(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 3);
               ((short[]) buf[45])[0] = rslt.getShort(42);
               ((byte[]) buf[46])[0] = rslt.getByte(43);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(18);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((String[]) buf[20])[0] = rslt.getString(20, 20);
               ((String[]) buf[21])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(22, 60);
               ((String[]) buf[24])[0] = rslt.getString(23, 255);
               ((String[]) buf[25])[0] = rslt.getString(24, 60);
               ((String[]) buf[26])[0] = rslt.getString(25, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(26);
               ((byte[]) buf[28])[0] = rslt.getByte(27);
               ((byte[]) buf[29])[0] = rslt.getByte(28);
               ((String[]) buf[30])[0] = rslt.getString(29, 3);
               ((String[]) buf[31])[0] = rslt.getString(30, 20);
               ((int[]) buf[32])[0] = rslt.getInt(31);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(32,4);
               ((int[]) buf[34])[0] = rslt.getInt(33);
               ((String[]) buf[35])[0] = rslt.getString(34, 25);
               ((byte[]) buf[36])[0] = rslt.getByte(35);
               ((String[]) buf[37])[0] = rslt.getString(36, 60);
               ((long[]) buf[38])[0] = rslt.getLong(37);
               ((String[]) buf[39])[0] = rslt.getString(38, 30);
               ((String[]) buf[40])[0] = rslt.getString(39, 30);
               ((String[]) buf[41])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(41, 6);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(42);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(44, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(45, 3);
               ((int[]) buf[52])[0] = rslt.getInt(46);
               ((String[]) buf[53])[0] = rslt.getString(47, 3);
               ((short[]) buf[54])[0] = rslt.getShort(48);
               ((byte[]) buf[55])[0] = rslt.getByte(49);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((byte[]) buf[57])[0] = rslt.getByte(50);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((byte[]) buf[59])[0] = rslt.getByte(51);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 19 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 33 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 55 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
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
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 24 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 25 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 26 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 27 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[10]).byteValue());
               }
               stmt.setString(11, (String)parms[11], 20);
               stmt.setByte(12, ((Number) parms[12]).byteValue());
               stmt.setString(13, (String)parms[13], 20);
               stmt.setString(14, (String)parms[14], 1);
               stmt.setDateTime(15, (java.util.Date)parms[15], false);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[16], 2);
               stmt.setString(17, (String)parms[17], 20);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[19], 255);
               }
               stmt.setString(19, (String)parms[20], 60);
               stmt.setString(20, (String)parms[21], 255);
               stmt.setString(21, (String)parms[22], 60);
               stmt.setString(22, (String)parms[23], 1);
               stmt.setByte(23, ((Number) parms[24]).byteValue());
               stmt.setByte(24, ((Number) parms[25]).byteValue());
               stmt.setByte(25, ((Number) parms[26]).byteValue());
               stmt.setString(26, (String)parms[27], 3);
               stmt.setString(27, (String)parms[28], 20);
               stmt.setInt(28, ((Number) parms[29]).intValue());
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[30], 4);
               stmt.setInt(30, ((Number) parms[31]).intValue());
               stmt.setString(31, (String)parms[32], 25);
               stmt.setByte(32, ((Number) parms[33]).byteValue());
               stmt.setString(33, (String)parms[34], 60);
               stmt.setLong(34, ((Number) parms[35]).longValue());
               stmt.setString(35, (String)parms[36], 30);
               stmt.setString(36, (String)parms[37], 30);
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(38, ((Number) parms[41]).byteValue());
               }
               stmt.setString(39, (String)parms[42], 3);
               stmt.setInt(40, ((Number) parms[43]).intValue());
               stmt.setString(41, (String)parms[44], 3);
               stmt.setShort(42, ((Number) parms[45]).shortValue());
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(43, ((Number) parms[47]).byteValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[9]).byteValue());
               }
               stmt.setString(10, (String)parms[10], 20);
               stmt.setByte(11, ((Number) parms[11]).byteValue());
               stmt.setString(12, (String)parms[12], 20);
               stmt.setString(13, (String)parms[13], 1);
               stmt.setDateTime(14, (java.util.Date)parms[14], false);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setString(16, (String)parms[16], 20);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[18], 255);
               }
               stmt.setString(18, (String)parms[19], 60);
               stmt.setString(19, (String)parms[20], 255);
               stmt.setString(20, (String)parms[21], 60);
               stmt.setString(21, (String)parms[22], 1);
               stmt.setByte(22, ((Number) parms[23]).byteValue());
               stmt.setByte(23, ((Number) parms[24]).byteValue());
               stmt.setByte(24, ((Number) parms[25]).byteValue());
               stmt.setString(25, (String)parms[26], 3);
               stmt.setString(26, (String)parms[27], 20);
               stmt.setInt(27, ((Number) parms[28]).intValue());
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[29], 4);
               stmt.setInt(29, ((Number) parms[30]).intValue());
               stmt.setString(30, (String)parms[31], 25);
               stmt.setByte(31, ((Number) parms[32]).byteValue());
               stmt.setString(32, (String)parms[33], 60);
               stmt.setLong(33, ((Number) parms[34]).longValue());
               stmt.setString(34, (String)parms[35], 30);
               stmt.setString(35, (String)parms[36], 30);
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[38], 1);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(37, ((Number) parms[40]).byteValue());
               }
               stmt.setString(38, (String)parms[41], 3);
               stmt.setInt(39, ((Number) parms[42]).intValue());
               stmt.setShort(40, ((Number) parms[43]).shortValue());
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(41, ((Number) parms[45]).byteValue());
               }
               stmt.setString(42, (String)parms[46], 3);
               stmt.setLong(43, ((Number) parms[47]).longValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 33 :
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
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 42 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 43 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 44 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 45 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 46 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 47 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 48 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 49 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 51 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 55 :
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
      }
   }

}

