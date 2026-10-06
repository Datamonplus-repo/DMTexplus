package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcalpro_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action58") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV49contcod = httpContext.GetPar( "contcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49contcod", AV49contcod);
         A13418AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_58_1O81838( A396EmprCod, AV49contcod, A13418AlbProID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action59") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV42Fch = localUtil.parseDateParm( httpContext.GetPar( "Fch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Fch", localUtil.format(AV42Fch, "99/99/99"));
         AV41AlbLast = (int)(GXutil.lval( httpContext.GetPar( "AlbLast"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41AlbLast), 8, 0));
         A13430AlbProDate = localUtil.parseDateParm( httpContext.GetPar( "AlbProDate")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
         AV40Msg_f = httpContext.GetPar( "Msg_f") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_f", AV40Msg_f);
         AV43Ctrlf = (byte)(GXutil.lval( httpContext.GetPar( "Ctrlf"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43Ctrlf", GXutil.str( AV43Ctrlf, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_59_1O81838( A396EmprCod, AV42Fch, AV41AlbLast, A13430AlbProDate, AV40Msg_f, AV43Ctrlf) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action60") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13425AlbProCliC = (int)(GXutil.lval( httpContext.GetPar( "AlbProCliC"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         AV44FlagCli = (byte)(GXutil.lval( httpContext.GetPar( "FlagCli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44FlagCli", GXutil.str( AV44FlagCli, 1, 0));
         A13417AlbProTipo = httpContext.GetPar( "AlbProTipo") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_60_1O81838( A396EmprCod, A13425AlbProCliC, AV44FlagCli, A13417AlbProTipo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action61") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13419AlbProPrvI = (int)(GXutil.lval( httpContext.GetPar( "AlbProPrvI"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         A13452AlbProInEx = (byte)(GXutil.lval( httpContext.GetPar( "AlbProInEx"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13452AlbProInEx", GXutil.str( A13452AlbProInEx, 1, 0));
         AV45FlagProv = (byte)(GXutil.lval( httpContext.GetPar( "FlagProv"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45FlagProv", GXutil.str( AV45FlagProv, 1, 0));
         AV60msgInEx = httpContext.GetPar( "msgInEx") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60msgInEx", AV60msgInEx);
         A13417AlbProTipo = httpContext.GetPar( "AlbProTipo") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_61_1O81838( A396EmprCod, A13419AlbProPrvI, A13452AlbProInEx, AV45FlagProv, AV60msgInEx, A13417AlbProTipo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action62") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13425AlbProCliC = (int)(GXutil.lval( httpContext.GetPar( "AlbProCliC"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         A13427AlbProDomE = (byte)(GXutil.lval( httpContext.GetPar( "AlbProDomE"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.str( A13427AlbProDomE, 1, 0));
         AV46FlagDom = (byte)(GXutil.lval( httpContext.GetPar( "FlagDom"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46FlagDom", GXutil.str( AV46FlagDom, 1, 0));
         A13417AlbProTipo = httpContext.GetPar( "AlbProTipo") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_62_1O81838( A396EmprCod, A13425AlbProCliC, A13427AlbProDomE, AV46FlagDom, A13417AlbProTipo) ;
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
         xc_90_1O81839( ) ;
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
         xc_91_1O81839( ) ;
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
         xc_92_1O81839( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action93") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         A13419AlbProPrvI = (int)(GXutil.lval( httpContext.GetPar( "AlbProPrvI"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         AV53msg_errprv = httpContext.GetPar( "msg_errprv") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53msg_errprv", AV53msg_errprv);
         A13417AlbProTipo = httpContext.GetPar( "AlbProTipo") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_93_1O81839( A396EmprCod, A719PrdNum, A13419AlbProPrvI, AV53msg_errprv, A13417AlbProTipo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action94") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         A13443AlbProCnt = CommonUtil.decimalVal( httpContext.GetPar( "AlbProCnt"), ".") ;
         n13443AlbProCnt = false ;
         AV57Msg_errcant = httpContext.GetPar( "Msg_errcant") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57Msg_errcant", AV57Msg_errcant);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_94_1O81839( Gx_mode, A396EmprCod, A719PrdNum, A13443AlbProCnt, AV57Msg_errcant) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action95") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         A13443AlbProCnt = CommonUtil.decimalVal( httpContext.GetPar( "AlbProCnt"), ".") ;
         n13443AlbProCnt = false ;
         AV51AlbProCntold = CommonUtil.decimalVal( httpContext.GetPar( "AlbProCntold"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51AlbProCntold", GXutil.ltrimstr( AV51AlbProCntold, 9, 2));
         AV57Msg_errcant = httpContext.GetPar( "Msg_errcant") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57Msg_errcant", AV57Msg_errcant);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_95_1O81839( Gx_mode, A396EmprCod, A719PrdNum, A13443AlbProCnt, AV51AlbProCntold, AV57Msg_errcant) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action99") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV77Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77Pgmname", AV77Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         AV12Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         AV47Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Inc_obs", AV47Inc_obs);
         A13418AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_99_1O81839( A396EmprCod, AV77Pgmname, AV8UsurCod, AV12Station, AV47Inc_obs, A13418AlbProID, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action100") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV77Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77Pgmname", AV77Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         AV12Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         AV47Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Inc_obs", AV47Inc_obs);
         A13418AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_100_1O81839( A396EmprCod, AV77Pgmname, AV8UsurCod, AV12Station, AV47Inc_obs, A13418AlbProID, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CATDOCID") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13854CatDocNomI = httpContext.GetPar( "CatDocNomI") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgacatdocid1O80( A396EmprCod, A13854CatDocNomI) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ALBPROPRVI") == 0 )
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
         gxsgaalbproprvi1O80( A396EmprCod, A13719PrvNNom) ;
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
         gxsgatrncod1O80( A396EmprCod, A13738TrnCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CATDOCID") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13854CatDocNomI = httpContext.GetPar( "CatDocNomI") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgacatdocid1O80( A396EmprCod, A13854CatDocNomI) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"CATDOCID") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h13453CatDocID = httpContext.GetPar( "h13453CatDocID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcacatdocid1O81838( A396EmprCod, h13453CatDocID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ALBPROPRVI") == 0 )
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
         gxsgaalbproprvi1O80( A396EmprCod, A13719PrvNNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"ALBPROPRVI") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h13419AlbProPrvI = httpContext.GetPar( "h13419AlbProPrvI") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaalbproprvi1O81838( A396EmprCod, h13419AlbProPrvI) ;
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
         gxsgatrncod1O80( A396EmprCod, A13738TrnCNom) ;
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
         gxhcatrncod1O81838( A396EmprCod, h840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel20"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa134521O81838( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel21"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel22"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel23"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel33"+"_"+"ALBPROSAL") == 0 )
      {
         A13430AlbProDate = localUtil.parseDateParm( httpContext.GetPar( "AlbProDate")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
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
         gx33asaalbprosal1O81838( A13430AlbProDate, Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_103") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13425AlbProCliC = (int)(GXutil.lval( httpContext.GetPar( "AlbProCliC"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_103( A396EmprCod, A13425AlbProCliC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_104") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13419AlbProPrvI = (int)(GXutil.lval( httpContext.GetPar( "AlbProPrvI"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_104( A396EmprCod, A13419AlbProPrvI) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_105") == 0 )
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
         gxload_105( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_106") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13453CatDocID = (short)(GXutil.lval( httpContext.GetPar( "CatDocID"))) ;
         n13453CatDocID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_106( A396EmprCod, A13453CatDocID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_108") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_108( A396EmprCod, A719PrdNum) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_lalpro") == 0 )
      {
         gxnrgridlevel_lalpro_newrow_invoke( ) ;
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
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
            AV33AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33AlbProID), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33AlbProID), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Documento Transporte Proveedor", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = cmbAlbProInEx.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_lalpro_newrow_invoke( )
   {
      nRC_GXsfl_132 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_132"))) ;
      nGXsfl_132_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_132_idx"))) ;
      sGXsfl_132_idx = httpContext.GetPar( "sGXsfl_132_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A13441AlbProUltL = (short)(GXutil.lval( httpContext.GetPar( "AlbProUltL"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_lalpro_newrow( ) ;
      /* End function gxnrGridlevel_lalpro_newrow_invoke */
   }

   public tcalpro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcalpro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcalpro_impl.class ));
   }

   public tcalpro_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbProInEx = new HTMLChoice();
      cmbAlbProTipo = new HTMLChoice();
      cmbAlbProUnd = new HTMLChoice();
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
      if ( cmbAlbProInEx.getItemCount() > 0 )
      {
         A13452AlbProInEx = (byte)(GXutil.lval( cmbAlbProInEx.getValidValue(GXutil.trim( GXutil.str( A13452AlbProInEx, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13452AlbProInEx", GXutil.str( A13452AlbProInEx, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProInEx.setValue( GXutil.trim( GXutil.str( A13452AlbProInEx, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProInEx.getInternalname(), "Values", cmbAlbProInEx.ToJavascriptSource(), true);
      }
      if ( cmbAlbProTipo.getItemCount() > 0 )
      {
         A13417AlbProTipo = cmbAlbProTipo.getValidValue(A13417AlbProTipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProTipo.setValue( GXutil.rtrim( A13417AlbProTipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProTipo.getInternalname(), "Values", cmbAlbProTipo.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProID_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProID_Internalname, GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13418AlbProID), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProID_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALPRO.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divAlbproinex_cell_Internalname, 1, 0, "px", 0, "px", divAlbproinex_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", cmbAlbProInEx.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProInEx.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbProInEx.getInternalname(), httpContext.getMessage( "Mercado Interno / Externo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProInEx, cmbAlbProInEx.getInternalname(), GXutil.trim( GXutil.str( A13452AlbProInEx, 1, 0)), 1, cmbAlbProInEx.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbAlbProInEx.getVisible(), cmbAlbProInEx.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "", true, (byte)(0), "HLP_TCALPRO.htm");
      cmbAlbProInEx.setValue( GXutil.trim( GXutil.str( A13452AlbProInEx, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProInEx.getInternalname(), "Values", cmbAlbProInEx.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProTipo.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbProTipo.getInternalname(), httpContext.getMessage( "Proveedor o Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProTipo, cmbAlbProTipo.getInternalname(), GXutil.rtrim( A13417AlbProTipo), 1, cmbAlbProTipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbProTipo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "", true, (byte)(0), "HLP_TCALPRO.htm");
      cmbAlbProTipo.setValue( GXutil.rtrim( A13417AlbProTipo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProTipo.getInternalname(), "Values", cmbAlbProTipo.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProDate_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProDate_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbProDate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProDate_Internalname, localUtil.format(A13430AlbProDate, "99/99/99"), localUtil.format( A13430AlbProDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProDate_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProDate_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALPRO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProDate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProDate_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCALPRO.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProSal_Internalname, httpContext.getMessage( "Fecha-Hora Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbProSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProSal_Internalname, localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A13429AlbProSal, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProSal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALPRO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCALPRO.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCatDocID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCatDocID_Internalname, httpContext.getMessage( "Codigo Categoria", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCatDocID_Internalname, h13453CatDocID, GXutil.rtrim( localUtil.format( h13453CatDocID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCatDocID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCatDocID_Enabled, 1, "text", "", 35, "chr", 1, "row", 35, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TCALPRO.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divAlbproprvid_cell_Internalname, 1, 0, "px", 0, "px", divAlbproprvid_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbProPrvI_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProPrvI_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProPrvI_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProPrvI_Internalname, h13419AlbProPrvI, GXutil.rtrim( localUtil.format( h13419AlbProPrvI, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProPrvI_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbProPrvI_Visible, edtAlbProPrvI_Enabled, 1, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TCALPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbproclicod_cell_Internalname, 1, 0, "px", 0, "px", divAlbproclicod_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbProCliC_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCliC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCliC_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCliC_Internalname, GXutil.ltrim( localUtil.ntoc( A13425AlbProCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13425AlbProCliC), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCliC_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbProCliC_Visible, edtAlbProCliC_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALPRO.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_13425_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_13425_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgprompt_13425_Internalname, sImgUrl, imgprompt_13425_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_13425_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_TCALPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCliN_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCliN_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCliN_Internalname, GXutil.rtrim( A13426AlbProCliN), GXutil.rtrim( localUtil.format( A13426AlbProCliN, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCliN_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCliN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProDomE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProDomE_Internalname, httpContext.getMessage( "Domicilio Envio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProDomE_Internalname, GXutil.ltrim( localUtil.ntoc( A13427AlbProDomE, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProDomE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13427AlbProDomE), "9") : localUtil.format( DecimalUtil.doubleToDec(A13427AlbProDomE), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProDomE_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProDomE_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALPRO.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_13425_13427_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_13425_13427_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgprompt_13425_13427_Internalname, sImgUrl, imgprompt_13425_13427_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_13425_13427_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_TCALPRO.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, h840TrnCod, GXutil.rtrim( localUtil.format( h840TrnCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TCALPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProMatr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProMatr_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProMatr_Internalname, GXutil.rtrim( A13424AlbProMatr), GXutil.rtrim( localUtil.format( A13424AlbProMatr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProMatr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProMatr_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALPRO.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAlbProObs_Internalname, A13439AlbProObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", (short)(0), 1, edtAlbProObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TCALPRO.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup7_Internalname, httpContext.getMessage( "Local Carga", ""), 1, 0, "px", 0, "px", grpUnnamedgroup7_Class, "", "HLP_TCALPRO.htm");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable6_Internalname, tblUnnamedtable6_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProLC1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProLC1_Internalname, httpContext.getMessage( "Local 1", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProLC1_Internalname, GXutil.rtrim( A13579AlbProLC1), GXutil.rtrim( localUtil.format( A13579AlbProLC1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProLC1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProLC1_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProLC2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProLC2_Internalname, httpContext.getMessage( "Local 2", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProLC2_Internalname, GXutil.rtrim( A13580AlbProLC2), GXutil.rtrim( localUtil.format( A13580AlbProLC2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProLC2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProLC2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProLC3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProLC3_Internalname, httpContext.getMessage( "Local  3", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProLC3_Internalname, GXutil.rtrim( A13581AlbProLC3), GXutil.rtrim( localUtil.format( A13581AlbProLC3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProLC3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProLC3_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</fieldset>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup9_Internalname, httpContext.getMessage( "Local Descarga", ""), 1, 0, "px", 0, "px", grpUnnamedgroup9_Class, "", "HLP_TCALPRO.htm");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable8_Internalname, tblUnnamedtable8_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProLD1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProLD1_Internalname, httpContext.getMessage( "Local 1", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProLD1_Internalname, GXutil.rtrim( A13582AlbProLD1), GXutil.rtrim( localUtil.format( A13582AlbProLD1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProLD1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProLD1_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProLD2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProLD2_Internalname, httpContext.getMessage( "Local 2", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProLD2_Internalname, GXutil.rtrim( A13583AlbProLD2), GXutil.rtrim( localUtil.format( A13583AlbProLD2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProLD2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProLD2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='DataContentCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProLD3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProLD3_Internalname, httpContext.getMessage( "Local 3", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProLD3_Internalname, GXutil.rtrim( A13584AlbProLD3), GXutil.rtrim( localUtil.format( A13584AlbProLD3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProLD3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProLD3_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALPRO.htm");
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
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_lalpro_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_lalpro( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALPRO.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,158);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALPRO.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProSta_Internalname, GXutil.ltrim( localUtil.ntoc( A13437AlbProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProSta_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13437AlbProSta), "9") : localUtil.format( DecimalUtil.doubleToDec(A13437AlbProSta), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProSta_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProSta_Visible, edtAlbProSta_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALPRO.htm");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbProSys_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProSys_Internalname, localUtil.ttoc( A13431AlbProSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A13431AlbProSys, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProSys_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProSys_Visible, edtAlbProSys_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALPRO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProSys_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtAlbProSys_Visible==0)||(edtAlbProSys_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCALPRO.htm");
      httpContext.writeTextNL( "</div>") ;
      /* Multiple line edit */
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAlbProHh_Internalname, A13433AlbProHh, "", "", (short)(0), edtAlbProHh_Visible, edtAlbProHh_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TCALPRO.htm");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAlbProHhCt_Internalname, A13434AlbProHhCt, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,162);\"", (short)(0), edtAlbProHhCt_Visible, edtAlbProHhCt_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TCALPRO.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProEnvA_Internalname, GXutil.rtrim( A13435AlbProEnvA), GXutil.rtrim( localUtil.format( A13435AlbProEnvA, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProEnvA_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProEnvA_Visible, edtAlbProEnvA_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALPRO.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProIDAT_Internalname, GXutil.rtrim( A13436AlbProIDAT), GXutil.rtrim( localUtil.format( A13436AlbProIDAT, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProIDAT_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProIDAT_Visible, edtAlbProIDAT_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALPRO.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProStAT_Internalname, GXutil.ltrim( localUtil.ntoc( A13438AlbProStAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProStAT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13438AlbProStAT), "9") : localUtil.format( DecimalUtil.doubleToDec(A13438AlbProStAT), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProStAT_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProStAT_Visible, edtAlbProStAT_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALPRO.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProUltL_Internalname, GXutil.ltrim( localUtil.ntoc( A13441AlbProUltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProUltL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13441AlbProUltL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13441AlbProUltL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProUltL_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProUltL_Visible, edtAlbProUltL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALPRO.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProAnul_Internalname, GXutil.rtrim( A13440AlbProAnul), GXutil.rtrim( localUtil.format( A13440AlbProAnul, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,167);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProAnul_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProAnul_Visible, edtAlbProAnul_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_lalpro( )
   {
      /*  Grid Control  */
      startgridcontrol132( ) ;
      nGXsfl_132_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1839 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1839 = (short)(1) ;
            scanStart1O81839( ) ;
            while ( RcdFound1839 != 0 )
            {
               init_level_properties1839( ) ;
               getByPrimaryKey1O81839( ) ;
               addRow1O81839( ) ;
               scanNext1O81839( ) ;
            }
            scanEnd1O81839( ) ;
            nBlankRcdCount1839 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13441AlbProUltL = A13441AlbProUltL ;
         httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
         standaloneNotModal1O81839( ) ;
         standaloneModal1O81839( ) ;
         sMode1839 = Gx_mode ;
         while ( nGXsfl_132_idx < nRC_GXsfl_132 )
         {
            bGXsfl_132_Refreshing = true ;
            readRow1O81839( ) ;
            edtAlbProLine_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROLINE_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLine_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtPrdNum_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_132_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_132_Refreshing);
            edtAlbProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRODSC_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDsc_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtAlbProCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROCNT_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCnt_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            cmbAlbProUnd.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROUND_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbProUnd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProUnd.getEnabled(), 5, 0), !bGXsfl_132_Refreshing);
            edtAlbProCaja_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROCAJA_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProCaja_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCaja_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtAlbProObsL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROOBSL_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProObsL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProObsL_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtPrdExiAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtAlbProNRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRONREF_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProNRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProNRef_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtAlbProVRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROVREF_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProVRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProVRef_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtAlbProPrvp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROPRVP_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvp_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtAlbProDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRODTO_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDto_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            if ( ( nRcdExists_1839 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1O81839( ) ;
            }
            sendRow1O81839( ) ;
            bGXsfl_132_Refreshing = false ;
         }
         Gx_mode = sMode1839 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13441AlbProUltL = B13441AlbProUltL ;
         httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1839 = (short)(5) ;
         nRcdExists_1839 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1O81839( ) ;
            while ( RcdFound1839 != 0 )
            {
               sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1321839( ) ;
               init_level_properties1839( ) ;
               standaloneNotModal1O81839( ) ;
               getByPrimaryKey1O81839( ) ;
               standaloneModal1O81839( ) ;
               addRow1O81839( ) ;
               scanNext1O81839( ) ;
            }
            scanEnd1O81839( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1839 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1321839( ) ;
         initAll1O81839( ) ;
         init_level_properties1839( ) ;
         B13441AlbProUltL = A13441AlbProUltL ;
         httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
         nRcdExists_1839 = (short)(0) ;
         nIsMod_1839 = (short)(0) ;
         nRcdDeleted_1839 = (short)(0) ;
         nBlankRcdCount1839 = (short)(nBlankRcdUsr1839+nBlankRcdCount1839) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1839 > 0 )
         {
            standaloneNotModal1O81839( ) ;
            standaloneModal1O81839( ) ;
            addRow1O81839( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbProLine_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1839 = (short)(nBlankRcdCount1839-1) ;
         }
         Gx_mode = sMode1839 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13441AlbProUltL = B13441AlbProUltL ;
         httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_lalproContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_lalpro", Gridlevel_lalproContainer, subGridlevel_lalpro_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_lalproContainerData", Gridlevel_lalproContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_lalproContainerData"+"V", Gridlevel_lalproContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_lalproContainerData"+"V"+"\" value='"+Gridlevel_lalproContainer.GridValuesHidden()+"'/>") ;
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
      e111O82 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13418AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( "Z13418AlbProID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13429AlbProSal = localUtil.ctot( httpContext.cgiGet( "Z13429AlbProSal"), 0) ;
            Z13452AlbProInEx = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13452AlbProInEx"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13417AlbProTipo = httpContext.cgiGet( "Z13417AlbProTipo") ;
            Z13430AlbProDate = localUtil.ctod( httpContext.cgiGet( "Z13430AlbProDate"), 0) ;
            Z13427AlbProDomE = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13427AlbProDomE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13424AlbProMatr = httpContext.cgiGet( "Z13424AlbProMatr") ;
            Z13439AlbProObs = httpContext.cgiGet( "Z13439AlbProObs") ;
            Z13437AlbProSta = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13437AlbProSta"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13431AlbProSys = localUtil.ctot( httpContext.cgiGet( "Z13431AlbProSys"), 0) ;
            Z13433AlbProHh = httpContext.cgiGet( "Z13433AlbProHh") ;
            Z13434AlbProHhCt = httpContext.cgiGet( "Z13434AlbProHhCt") ;
            Z13435AlbProEnvA = httpContext.cgiGet( "Z13435AlbProEnvA") ;
            Z13436AlbProIDAT = httpContext.cgiGet( "Z13436AlbProIDAT") ;
            Z13438AlbProStAT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13438AlbProStAT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13440AlbProAnul = httpContext.cgiGet( "Z13440AlbProAnul") ;
            Z13441AlbProUltL = (short)(localUtil.ctol( httpContext.cgiGet( "Z13441AlbProUltL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13579AlbProLC1 = httpContext.cgiGet( "Z13579AlbProLC1") ;
            Z13580AlbProLC2 = httpContext.cgiGet( "Z13580AlbProLC2") ;
            Z13581AlbProLC3 = httpContext.cgiGet( "Z13581AlbProLC3") ;
            Z13582AlbProLD1 = httpContext.cgiGet( "Z13582AlbProLD1") ;
            Z13583AlbProLD2 = httpContext.cgiGet( "Z13583AlbProLD2") ;
            Z13584AlbProLD3 = httpContext.cgiGet( "Z13584AlbProLD3") ;
            Z14190AlbProATCU = httpContext.cgiGet( "Z14190AlbProATCU") ;
            Z14191AlbProSerA = httpContext.cgiGet( "Z14191AlbProSerA") ;
            Z14192AlbProTipA = httpContext.cgiGet( "Z14192AlbProTipA") ;
            Z13425AlbProCliC = (int)(localUtil.ctol( httpContext.cgiGet( "Z13425AlbProCliC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13419AlbProPrvI = (int)(localUtil.ctol( httpContext.cgiGet( "Z13419AlbProPrvI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13453CatDocID = (short)(localUtil.ctol( httpContext.cgiGet( "Z13453CatDocID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13426AlbProCliN = httpContext.cgiGet( "Z13426AlbProCliN") ;
            Z13420AlbProPrvN = httpContext.cgiGet( "Z13420AlbProPrvN") ;
            A14190AlbProATCU = httpContext.cgiGet( "Z14190AlbProATCU") ;
            n14190AlbProATCU = false ;
            A14191AlbProSerA = httpContext.cgiGet( "Z14191AlbProSerA") ;
            n14191AlbProSerA = false ;
            A14192AlbProTipA = httpContext.cgiGet( "Z14192AlbProTipA") ;
            n14192AlbProTipA = false ;
            A13420AlbProPrvN = httpContext.cgiGet( "Z13420AlbProPrvN") ;
            n13420AlbProPrvN = false ;
            O13441AlbProUltL = (short)(localUtil.ctol( httpContext.cgiGet( "O13441AlbProUltL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_132 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_132"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N13453CatDocID = (short)(localUtil.ctol( httpContext.cgiGet( "N13453CatDocID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N13419AlbProPrvI = (int)(localUtil.ctol( httpContext.cgiGet( "N13419AlbProPrvI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N13425AlbProCliC = (int)(localUtil.ctol( httpContext.cgiGet( "N13425AlbProCliC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV33AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( "vALBPROID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV65Insert_CatDocID = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CATDOCID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13453CatDocID = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCCATDOCID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV66Insert_AlbProPrvID = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALBPROPRVID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13419AlbProPrvI = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCALBPROPRVI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV67Insert_AlbProCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALBPROCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV68Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCTRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13420AlbProPrvN = httpContext.cgiGet( "ALBPROPRVN") ;
            AV49contcod = httpContext.cgiGet( "vCONTCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV40Msg_f = httpContext.cgiGet( "vMSG_F") ;
            AV41AlbLast = (int)(localUtil.ctol( httpContext.cgiGet( "vALBLAST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV42Fch = localUtil.ctod( httpContext.cgiGet( "vFCH"), 0) ;
            AV44FlagCli = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV60msgInEx = httpContext.cgiGet( "vMSGINEX") ;
            AV45FlagProv = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGPROV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV46FlagDom = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGDOM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34FirmaD = (byte)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37Msg_errAT = httpContext.cgiGet( "vMSG_ERRAT") ;
            A14190AlbProATCU = httpContext.cgiGet( "ALBPROATCU") ;
            A14191AlbProSerA = httpContext.cgiGet( "ALBPROSERA") ;
            A14192AlbProTipA = httpContext.cgiGet( "ALBPROTIPA") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
            A13454CatDocNom = httpContext.cgiGet( "CATDOCNOM") ;
            n13454CatDocNom = false ;
            AV77Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV51AlbProCntold = localUtil.ctond( httpContext.cgiGet( "vALBPROCNTOLD")) ;
            AV54AlbProLineaOld = (short)(localUtil.ctol( httpContext.cgiGet( "vALBPROLINEAOLD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV55AlbProDscold = httpContext.cgiGet( "vALBPRODSCOLD") ;
            AV56PrdnumOld = httpContext.cgiGet( "vPRDNUMOLD") ;
            AV47Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV50DevCant = (byte)(localUtil.ctol( httpContext.cgiGet( "vDEVCANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV53msg_errprv = httpContext.cgiGet( "vMSG_ERRPRV") ;
            AV57Msg_errcant = httpContext.cgiGet( "vMSG_ERRCANT") ;
            AV12Station = httpContext.cgiGet( "vSTATION") ;
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
            A13418AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
            cmbAlbProInEx.setName( cmbAlbProInEx.getInternalname() );
            cmbAlbProInEx.setValue( httpContext.cgiGet( cmbAlbProInEx.getInternalname()) );
            A13452AlbProInEx = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProInEx.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13452AlbProInEx", GXutil.str( A13452AlbProInEx, 1, 0));
            cmbAlbProTipo.setName( cmbAlbProTipo.getInternalname() );
            cmbAlbProTipo.setValue( httpContext.cgiGet( cmbAlbProTipo.getInternalname()) );
            A13417AlbProTipo = httpContext.cgiGet( cmbAlbProTipo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
            if ( localUtil.vcdate( httpContext.cgiGet( edtAlbProDate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBPRODATE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProDate_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13430AlbProDate = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
            }
            else
            {
               A13430AlbProDate = localUtil.ctod( httpContext.cgiGet( edtAlbProDate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtAlbProSal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ALBPROSAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProSal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A13429AlbProSal = localUtil.ctot( httpContext.cgiGet( edtAlbProSal_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            h13453CatDocID = httpContext.cgiGet( edtCatDocID_Internalname) ;
            h13419AlbProPrvI = httpContext.cgiGet( edtAlbProPrvI_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROCLIC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProCliC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13425AlbProCliC = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
            }
            else
            {
               A13425AlbProCliC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProCliC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
            }
            A13426AlbProCliN = httpContext.cgiGet( edtAlbProCliN_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13426AlbProCliN", A13426AlbProCliN);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProDomE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProDomE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPRODOME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProDomE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13427AlbProDomE = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.str( A13427AlbProDomE, 1, 0));
            }
            else
            {
               A13427AlbProDomE = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProDomE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.str( A13427AlbProDomE, 1, 0));
            }
            h840TrnCod = httpContext.cgiGet( edtTrnCod_Internalname) ;
            A13424AlbProMatr = httpContext.cgiGet( edtAlbProMatr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13424AlbProMatr", A13424AlbProMatr);
            A13439AlbProObs = httpContext.cgiGet( edtAlbProObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13439AlbProObs", A13439AlbProObs);
            A13579AlbProLC1 = httpContext.cgiGet( edtAlbProLC1_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13579AlbProLC1", A13579AlbProLC1);
            A13580AlbProLC2 = httpContext.cgiGet( edtAlbProLC2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13580AlbProLC2", A13580AlbProLC2);
            A13581AlbProLC3 = httpContext.cgiGet( edtAlbProLC3_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13581AlbProLC3", A13581AlbProLC3);
            A13582AlbProLD1 = httpContext.cgiGet( edtAlbProLD1_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13582AlbProLD1", A13582AlbProLD1);
            A13583AlbProLD2 = httpContext.cgiGet( edtAlbProLD2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13583AlbProLD2", A13583AlbProLD2);
            A13584AlbProLD3 = httpContext.cgiGet( edtAlbProLD3_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13584AlbProLD3", A13584AlbProLD3);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProSta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProSta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROSTA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProSta_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13437AlbProSta = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13437AlbProSta", GXutil.str( A13437AlbProSta, 1, 0));
            }
            else
            {
               A13437AlbProSta = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProSta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13437AlbProSta", GXutil.str( A13437AlbProSta, 1, 0));
            }
            A13431AlbProSys = localUtil.ctot( httpContext.cgiGet( edtAlbProSys_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13431AlbProSys", localUtil.ttoc( A13431AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A13433AlbProHh = httpContext.cgiGet( edtAlbProHh_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13433AlbProHh", A13433AlbProHh);
            A13434AlbProHhCt = httpContext.cgiGet( edtAlbProHhCt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13434AlbProHhCt", A13434AlbProHhCt);
            A13435AlbProEnvA = httpContext.cgiGet( edtAlbProEnvA_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
            A13436AlbProIDAT = httpContext.cgiGet( edtAlbProIDAT_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13436AlbProIDAT", A13436AlbProIDAT);
            A13438AlbProStAT = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProStAT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
            A13441AlbProUltL = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbProUltL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
            A13440AlbProAnul = httpContext.cgiGet( edtAlbProAnul_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13440AlbProAnul", A13440AlbProAnul);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCALPRO");
            A13435AlbProEnvA = httpContext.cgiGet( edtAlbProEnvA_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
            forbiddenHiddens.add("AlbProEnvA", GXutil.rtrim( localUtil.format( A13435AlbProEnvA, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A13431AlbProSys = localUtil.ctot( httpContext.cgiGet( edtAlbProSys_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13431AlbProSys", localUtil.ttoc( A13431AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("AlbProSys", localUtil.format( A13431AlbProSys, "99/99/99 99:99"));
            A13433AlbProHh = httpContext.cgiGet( edtAlbProHh_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13433AlbProHh", A13433AlbProHh);
            forbiddenHiddens.add("AlbProHh", GXutil.rtrim( localUtil.format( A13433AlbProHh, "")));
            A13436AlbProIDAT = httpContext.cgiGet( edtAlbProIDAT_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13436AlbProIDAT", A13436AlbProIDAT);
            forbiddenHiddens.add("AlbProIDAT", GXutil.rtrim( localUtil.format( A13436AlbProIDAT, "")));
            A13438AlbProStAT = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProStAT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
            forbiddenHiddens.add("AlbProStAT", localUtil.format( DecimalUtil.doubleToDec(A13438AlbProStAT), "9"));
            forbiddenHiddens.add("AlbProATCU", GXutil.rtrim( localUtil.format( A14190AlbProATCU, "")));
            forbiddenHiddens.add("AlbProSerA", GXutil.rtrim( localUtil.format( A14191AlbProSerA, "")));
            forbiddenHiddens.add("AlbProTipA", GXutil.rtrim( localUtil.format( A14192AlbProTipA, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A13418AlbProID != Z13418AlbProID ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tcalpro:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A13418AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
               getEqualNoModal( ) ;
               if ( ! (0==AV33AlbProID) )
               {
                  A13418AlbProID = AV33AlbProID ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
               }
               else
               {
                  if ( ! isIns( )  )
                  {
                     A13418AlbProID = AV33AlbProID ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
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
                  sMode1838 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! (0==AV33AlbProID) )
                  {
                     A13418AlbProID = AV33AlbProID ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
                  }
                  else
                  {
                     if ( ! isIns( )  )
                     {
                        A13418AlbProID = AV33AlbProID ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
                     }
                  }
                  Gx_mode = sMode1838 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1838 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1O80( ) ;
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
                        e111O82 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121O82 ();
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
         e121O82 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1O81838( ) ;
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
         disableAttributes1O81838( ) ;
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

   public void confirm_1O80( )
   {
      beforeValidate1O81838( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1O81838( ) ;
         }
         else
         {
            checkExtendedTable1O81838( ) ;
            closeExtendedTableCursors1O81838( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1838 = Gx_mode ;
         confirm_1O81839( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1838 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1838 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1O81839( )
   {
      s13441AlbProUltL = O13441AlbProUltL ;
      httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
      nGXsfl_132_idx = 0 ;
      while ( nGXsfl_132_idx < nRC_GXsfl_132 )
      {
         readRow1O81839( ) ;
         if ( ( nRcdExists_1839 != 0 ) || ( nIsMod_1839 != 0 ) )
         {
            getKey1O81839( ) ;
            if ( ( nRcdExists_1839 == 0 ) && ( nRcdDeleted_1839 == 0 ) )
            {
               if ( RcdFound1839 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1O81839( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1O81839( ) ;
                     closeExtendedTableCursors1O81839( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13441AlbProUltL = A13441AlbProUltL ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBPROLINE_" + sGXsfl_132_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbProLine_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1839 != 0 )
               {
                  if ( nRcdDeleted_1839 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1O81839( ) ;
                     load1O81839( ) ;
                     beforeValidate1O81839( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1O81839( ) ;
                        O13441AlbProUltL = A13441AlbProUltL ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1839 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1O81839( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1O81839( ) ;
                           closeExtendedTableCursors1O81839( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13441AlbProUltL = A13441AlbProUltL ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1839 == 0 )
                  {
                     GXCCtl = "ALBPROLINE_" + sGXsfl_132_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbProLine_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbProLine_Internalname, GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtAlbProDsc_Internalname, GXutil.rtrim( A13448AlbProDsc)) ;
         httpContext.changePostValue( edtAlbProCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbProUnd.getInternalname(), GXutil.rtrim( A13444AlbProUnd)) ;
         httpContext.changePostValue( edtAlbProCaja_Internalname, GXutil.ltrim( localUtil.ntoc( A13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProObsL_Internalname, GXutil.rtrim( A13447AlbProObsL)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProNRef_Internalname, GXutil.rtrim( A13445AlbProNRef)) ;
         httpContext.changePostValue( edtAlbProVRef_Internalname, GXutil.rtrim( A13446AlbProVRef)) ;
         httpContext.changePostValue( edtAlbProPrvp_Internalname, GXutil.ltrim( localUtil.ntoc( A13852AlbProPrvp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProDto_Internalname, GXutil.ltrim( localUtil.ntoc( A13853AlbProDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13442AlbProLine_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13448AlbProDsc_"+sGXsfl_132_idx, GXutil.rtrim( Z13448AlbProDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z13449AlbProCaja_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13444AlbProUnd_"+sGXsfl_132_idx, GXutil.rtrim( Z13444AlbProUnd)) ;
         httpContext.changePostValue( "ZT_"+"Z13443AlbProCnt_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13447AlbProObsL_"+sGXsfl_132_idx, GXutil.rtrim( Z13447AlbProObsL)) ;
         httpContext.changePostValue( "ZT_"+"Z13445AlbProNRef_"+sGXsfl_132_idx, GXutil.rtrim( Z13445AlbProNRef)) ;
         httpContext.changePostValue( "ZT_"+"Z13446AlbProVRef_"+sGXsfl_132_idx, GXutil.rtrim( Z13446AlbProVRef)) ;
         httpContext.changePostValue( "ZT_"+"Z13852AlbProPrvp_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13852AlbProPrvp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13853AlbProDto_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13853AlbProDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_132_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "T719PrdNum_"+sGXsfl_132_idx, GXutil.rtrim( O719PrdNum)) ;
         httpContext.changePostValue( "T13448AlbProDsc_"+sGXsfl_132_idx, GXutil.rtrim( O13448AlbProDsc)) ;
         httpContext.changePostValue( "T13442AlbProLine_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( O13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T13443AlbProCnt_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( O13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1839_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1839_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1839_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1839 != 0 )
         {
            httpContext.changePostValue( "ALBPROLINE_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProLine_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_132_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRODSC_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROCNT_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROUND_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProUnd.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROCAJA_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCaja_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROOBSL_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProObsL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRONREF_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProNRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROVREF_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProVRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROPRVP_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProPrvp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRODTO_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13441AlbProUltL = s13441AlbProUltL ;
      httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1O80( )
   {
   }

   public void e111O82( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tcalpro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcalpro_impl.this.A396EmprCod = GXv_char2[0] ;
      tcalpro_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcalpro_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV78Path ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CPRPEM", ""), GXv_char4) ;
      tcalpro_impl.this.GXt_char1 = GXv_char4[0] ;
      AV78Path = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78Path", AV78Path);
      GXt_int5 = AV34FirmaD ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
      AV34FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34FirmaD", GXutil.str( AV34FirmaD, 1, 0));
      GXt_int5 = AV36cernum ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CERNUM", ""), GXv_int6) ;
      tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
      AV36cernum = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36cernum", GXutil.str( AV36cernum, 1, 0));
      GXt_int5 = AV35RemTra ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REMTRA", ""), GXv_int6) ;
      tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
      AV35RemTra = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35RemTra", GXutil.str( AV35RemTra, 1, 0));
      GXt_int5 = AV48TraExt ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXTTRA", ""), GXv_int6) ;
      tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
      AV48TraExt = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TraExt", GXutil.str( AV48TraExt, 1, 0));
      GXt_int5 = AV38Ws ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "WSDT", ""), GXv_int6) ;
      tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
      AV38Ws = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Ws", GXutil.str( AV38Ws, 1, 0));
      GXt_int5 = AV39Modhh ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UPDHHS", ""), GXv_int6) ;
      tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
      AV39Modhh = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Modhh", GXutil.str( AV39Modhh, 1, 0));
      GXt_int5 = AV43Ctrlf ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTRDAT", ""), GXv_int6) ;
      tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
      AV43Ctrlf = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Ctrlf", GXutil.str( AV43Ctrlf, 1, 0));
      GXt_int5 = AV50DevCant ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVPRO", ""), GXv_int6) ;
      tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
      AV50DevCant = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50DevCant", GXutil.str( AV50DevCant, 1, 0));
      GXt_int5 = AV61Endutex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int6) ;
      tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
      AV61Endutex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Endutex", GXutil.str( AV61Endutex, 1, 0));
      if ( (0==AV35RemTra) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe contador REMTRA, crearlo", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      if ( (0==AV48TraExt) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe contador EXTTRA (mercado externo), crearlo", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV37Msg_errAT = ((AV36cernum==1) ? httpContext.getMessage( "NO se puede eliminar. Esta activo contador CERNUM", "") : httpContext.getMessage( "NO se puede eliminar. Esta activo FIRMA DIGITAL", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Msg_errAT", AV37Msg_errAT);
      AV58Msg_dev = ((AV50DevCant==0) ? " " : httpContext.getMessage( "Atencion esta activo contador DEVPRO, se genera movimientos de devolucion en Cuenta Corriente", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Msg_dev", AV58Msg_dev);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tcalpro_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tcalpro_impl.this.AV32EmprCod = GXv_char4[0] ;
      tcalpro_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcalpro_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext7[0] = AV62WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV62WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV63TrnContext.fromxml(AV64WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV63TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV77Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV79GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79GXV1), 8, 0));
         while ( AV79GXV1 <= AV63TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV69TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV63TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV79GXV1));
            if ( GXutil.strcmp(AV69TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CatDocID") == 0 )
            {
               AV65Insert_CatDocID = (short)(GXutil.lval( AV69TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65Insert_CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65Insert_CatDocID), 4, 0));
            }
            else if ( GXutil.strcmp(AV69TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbProPrvID") == 0 )
            {
               AV66Insert_AlbProPrvID = (int)(GXutil.lval( AV69TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV66Insert_AlbProPrvID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66Insert_AlbProPrvID), 6, 0));
            }
            else if ( GXutil.strcmp(AV69TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbProCliCod") == 0 )
            {
               AV67Insert_AlbProCliCod = (int)(GXutil.lval( AV69TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV67Insert_AlbProCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67Insert_AlbProCliCod), 6, 0));
            }
            else if ( GXutil.strcmp(AV69TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV68Insert_TrnCod = (short)(GXutil.lval( AV69TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV68Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Insert_TrnCod), 4, 0));
            }
            AV79GXV1 = (int)(AV79GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtAlbProSta_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSta_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSta_Visible), 5, 0), true);
      edtAlbProSys_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSys_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSys_Visible), 5, 0), true);
      edtAlbProHh_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProHh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProHh_Visible), 5, 0), true);
      edtAlbProHhCt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProHhCt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProHhCt_Visible), 5, 0), true);
      edtAlbProEnvA_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEnvA_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEnvA_Visible), 5, 0), true);
      edtAlbProIDAT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProIDAT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProIDAT_Visible), 5, 0), true);
      edtAlbProStAT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProStAT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProStAT_Visible), 5, 0), true);
      edtAlbProUltL_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProUltL_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProUltL_Visible), 5, 0), true);
      edtAlbProAnul_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProAnul_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProAnul_Visible), 5, 0), true);
   }

   public void e121O82( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A13418AlbProID ;
      GXv_date9[0] = A13430AlbProDate ;
      GXv_dtime10[0] = A13431AlbProSys ;
      GXv_char3[0] = AV70Cadena ;
      GXv_char2[0] = AV73firma ;
      new app.stocksquimicos.obtengocadenaparahashdocumentoproveedor(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_date9, GXv_dtime10, GXv_char3, GXv_char2) ;
      tcalpro_impl.this.A396EmprCod = GXv_char4[0] ;
      tcalpro_impl.this.A13418AlbProID = GXv_int8[0] ;
      tcalpro_impl.this.A13430AlbProDate = GXv_date9[0] ;
      tcalpro_impl.this.A13431AlbProSys = GXv_dtime10[0] ;
      tcalpro_impl.this.AV70Cadena = GXv_char3[0] ;
      tcalpro_impl.this.AV73firma = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A13431AlbProSys", localUtil.ttoc( A13431AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      GXv_char4[0] = AV71Hash ;
      GXv_objcol_SdtMessages_Message11[0] = AV74Messages ;
      GXv_boolean12[0] = AV75OK ;
      new app.hash_obtener(remoteHandle, context).execute( AV70Cadena, GXv_char4, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
      tcalpro_impl.this.AV71Hash = GXv_char4[0] ;
      AV74Messages = GXv_objcol_SdtMessages_Message11[0] ;
      tcalpro_impl.this.AV75OK = GXv_boolean12[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A13418AlbProID ;
      GXv_char3[0] = AV70Cadena ;
      GXv_char2[0] = AV71Hash ;
      new app.stocksquimicos.actualizohashdocumentoproveedor(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
      tcalpro_impl.this.A396EmprCod = GXv_char4[0] ;
      tcalpro_impl.this.A13418AlbProID = GXv_int8[0] ;
      tcalpro_impl.this.AV70Cadena = GXv_char3[0] ;
      tcalpro_impl.this.AV71Hash = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      httpContext.popup(formatLink("app.stocksquimicos.horasalidadocumentoenvioatdocumentoproveedor", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A13431AlbProSys)),GXutil.URLEncode(GXutil.rtrim(AV70Cadena)),GXutil.URLEncode(GXutil.rtrim(AV71Hash))}, new String[] {"Emprcod","AlbProID","AlbProSys","cadena","hash"}) , new Object[] {"A396EmprCod","A13418AlbProID","A13431AlbProSys","AV70Cadena","AV71Hash"});
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A13418AlbProID ;
      new app.stocksquimicos.panucalpro(remoteHandle, context).execute( GXv_char4, GXv_int8) ;
      tcalpro_impl.this.A396EmprCod = GXv_char4[0] ;
      tcalpro_impl.this.A13418AlbProID = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      if ( 1 == 0 )
      {
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV63TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.tcalproww", new String[] {}, new String[] {}) );
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
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divAlbproprvid_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbproprvid_cell_Internalname, "Class", divAlbproprvid_cell_Class, true);
      divAlbproclicod_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbproclicod_cell_Internalname, "Class", divAlbproclicod_cell_Class, true);
      divAlbproinex_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbproinex_cell_Internalname, "Class", divAlbproinex_cell_Class, true);
   }

   public void zm1O81838( int GX_JID )
   {
      if ( ( GX_JID == 101 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13429AlbProSal = T01O86_A13429AlbProSal[0] ;
            Z13452AlbProInEx = T01O86_A13452AlbProInEx[0] ;
            Z13417AlbProTipo = T01O86_A13417AlbProTipo[0] ;
            Z13430AlbProDate = T01O86_A13430AlbProDate[0] ;
            Z13427AlbProDomE = T01O86_A13427AlbProDomE[0] ;
            Z13424AlbProMatr = T01O86_A13424AlbProMatr[0] ;
            Z13439AlbProObs = T01O86_A13439AlbProObs[0] ;
            Z13437AlbProSta = T01O86_A13437AlbProSta[0] ;
            Z13431AlbProSys = T01O86_A13431AlbProSys[0] ;
            Z13433AlbProHh = T01O86_A13433AlbProHh[0] ;
            Z13434AlbProHhCt = T01O86_A13434AlbProHhCt[0] ;
            Z13435AlbProEnvA = T01O86_A13435AlbProEnvA[0] ;
            Z13436AlbProIDAT = T01O86_A13436AlbProIDAT[0] ;
            Z13438AlbProStAT = T01O86_A13438AlbProStAT[0] ;
            Z13440AlbProAnul = T01O86_A13440AlbProAnul[0] ;
            Z13441AlbProUltL = T01O86_A13441AlbProUltL[0] ;
            Z13579AlbProLC1 = T01O86_A13579AlbProLC1[0] ;
            Z13580AlbProLC2 = T01O86_A13580AlbProLC2[0] ;
            Z13581AlbProLC3 = T01O86_A13581AlbProLC3[0] ;
            Z13582AlbProLD1 = T01O86_A13582AlbProLD1[0] ;
            Z13583AlbProLD2 = T01O86_A13583AlbProLD2[0] ;
            Z13584AlbProLD3 = T01O86_A13584AlbProLD3[0] ;
            Z14190AlbProATCU = T01O86_A14190AlbProATCU[0] ;
            Z14191AlbProSerA = T01O86_A14191AlbProSerA[0] ;
            Z14192AlbProTipA = T01O86_A14192AlbProTipA[0] ;
            Z13425AlbProCliC = T01O86_A13425AlbProCliC[0] ;
            Z13419AlbProPrvI = T01O86_A13419AlbProPrvI[0] ;
            Z840TrnCod = T01O86_A840TrnCod[0] ;
            Z13453CatDocID = T01O86_A13453CatDocID[0] ;
         }
         else
         {
            Z13429AlbProSal = A13429AlbProSal ;
            Z13452AlbProInEx = A13452AlbProInEx ;
            Z13417AlbProTipo = A13417AlbProTipo ;
            Z13430AlbProDate = A13430AlbProDate ;
            Z13427AlbProDomE = A13427AlbProDomE ;
            Z13424AlbProMatr = A13424AlbProMatr ;
            Z13439AlbProObs = A13439AlbProObs ;
            Z13437AlbProSta = A13437AlbProSta ;
            Z13431AlbProSys = A13431AlbProSys ;
            Z13433AlbProHh = A13433AlbProHh ;
            Z13434AlbProHhCt = A13434AlbProHhCt ;
            Z13435AlbProEnvA = A13435AlbProEnvA ;
            Z13436AlbProIDAT = A13436AlbProIDAT ;
            Z13438AlbProStAT = A13438AlbProStAT ;
            Z13440AlbProAnul = A13440AlbProAnul ;
            Z13441AlbProUltL = A13441AlbProUltL ;
            Z13579AlbProLC1 = A13579AlbProLC1 ;
            Z13580AlbProLC2 = A13580AlbProLC2 ;
            Z13581AlbProLC3 = A13581AlbProLC3 ;
            Z13582AlbProLD1 = A13582AlbProLD1 ;
            Z13583AlbProLD2 = A13583AlbProLD2 ;
            Z13584AlbProLD3 = A13584AlbProLD3 ;
            Z14190AlbProATCU = A14190AlbProATCU ;
            Z14191AlbProSerA = A14191AlbProSerA ;
            Z14192AlbProTipA = A14192AlbProTipA ;
            Z13425AlbProCliC = A13425AlbProCliC ;
            Z13419AlbProPrvI = A13419AlbProPrvI ;
            Z840TrnCod = A840TrnCod ;
            Z13453CatDocID = A13453CatDocID ;
         }
      }
      if ( ( GX_JID == 103 ) || ( GX_JID == 0 ) )
      {
         Z13426AlbProCliN = T01O89_A13426AlbProCliN[0] ;
      }
      if ( ( GX_JID == 104 ) || ( GX_JID == 0 ) )
      {
         Z13420AlbProPrvN = T01O811_A13420AlbProPrvN[0] ;
      }
      if ( GX_JID == -101 )
      {
         Z13418AlbProID = A13418AlbProID ;
         Z13429AlbProSal = A13429AlbProSal ;
         Z13452AlbProInEx = A13452AlbProInEx ;
         Z13417AlbProTipo = A13417AlbProTipo ;
         Z13430AlbProDate = A13430AlbProDate ;
         Z13427AlbProDomE = A13427AlbProDomE ;
         Z13424AlbProMatr = A13424AlbProMatr ;
         Z13439AlbProObs = A13439AlbProObs ;
         Z13437AlbProSta = A13437AlbProSta ;
         Z13431AlbProSys = A13431AlbProSys ;
         Z13433AlbProHh = A13433AlbProHh ;
         Z13434AlbProHhCt = A13434AlbProHhCt ;
         Z13435AlbProEnvA = A13435AlbProEnvA ;
         Z13436AlbProIDAT = A13436AlbProIDAT ;
         Z13438AlbProStAT = A13438AlbProStAT ;
         Z13440AlbProAnul = A13440AlbProAnul ;
         Z13441AlbProUltL = A13441AlbProUltL ;
         Z13579AlbProLC1 = A13579AlbProLC1 ;
         Z13580AlbProLC2 = A13580AlbProLC2 ;
         Z13581AlbProLC3 = A13581AlbProLC3 ;
         Z13582AlbProLD1 = A13582AlbProLD1 ;
         Z13583AlbProLD2 = A13583AlbProLD2 ;
         Z13584AlbProLD3 = A13584AlbProLD3 ;
         Z14190AlbProATCU = A14190AlbProATCU ;
         Z14191AlbProSerA = A14191AlbProSerA ;
         Z14192AlbProTipA = A14192AlbProTipA ;
         Z396EmprCod = A396EmprCod ;
         Z13425AlbProCliC = A13425AlbProCliC ;
         Z13419AlbProPrvI = A13419AlbProPrvI ;
         Z840TrnCod = A840TrnCod ;
         Z13453CatDocID = A13453CatDocID ;
         Z407EmprNom = A407EmprNom ;
         Z13454CatDocNom = A13454CatDocNom ;
         Z13420AlbProPrvN = A13420AlbProPrvN ;
         Z13426AlbProCliN = A13426AlbProCliN ;
         Z841TrnNom = A841TrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbProEnvA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEnvA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEnvA_Enabled), 5, 0), true);
      edtAlbProHh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProHh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProHh_Enabled), 5, 0), true);
      edtAlbProIDAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProIDAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProIDAT_Enabled), 5, 0), true);
      edtAlbProStAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProStAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProStAT_Enabled), 5, 0), true);
      edtAlbProSys_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSys_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSys_Enabled), 5, 0), true);
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( httpContext.getMessage( "UPD", ""), "")) == 0 )
      {
         cmbAlbProInEx.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProInEx.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProInEx.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbAlbProInEx.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProInEx.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProInEx.getEnabled(), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( httpContext.getMessage( "UPD", ""), "")) == 0 )
      {
         cmbAlbProTipo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProTipo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProTipo.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbAlbProTipo.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProTipo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProTipo.getEnabled(), 5, 0), true);
      }
      edtAlbProUltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProUltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProUltL_Enabled), 5, 0), true);
      AV77Pgmname = "TCALPRO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77Pgmname", AV77Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      imgprompt_13425_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.tclientprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"ALBPROCLIC"+"'), id:'"+"ALBPROCLIC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      edtAlbProID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProID_Enabled), 5, 0), true);
      edtAlbProEnvA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEnvA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEnvA_Enabled), 5, 0), true);
      edtAlbProHh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProHh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProHh_Enabled), 5, 0), true);
      edtAlbProIDAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProIDAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProIDAT_Enabled), 5, 0), true);
      edtAlbProStAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProStAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProStAT_Enabled), 5, 0), true);
      edtAlbProSys_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSys_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSys_Enabled), 5, 0), true);
      edtAlbProUltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProUltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProUltL_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01O87 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01O87_A407EmprNom[0] ;
      n407EmprNom = T01O87_n407EmprNom[0] ;
      pr_default.close(5);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENDTEX", ""), ""), GXv_int6) ;
      tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
      cmbAlbProInEx.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProInEx.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbProInEx.getVisible(), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENDTEX", ""), ""), GXv_int6) ;
      tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divAlbproinex_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbproinex_cell_Internalname, "Class", divAlbproinex_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENDTEX", ""), ""), GXv_int6) ;
         tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divAlbproinex_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbproinex_cell_Internalname, "Class", divAlbproinex_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENDTEX", ""), ""), GXv_int6) ;
      tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         grpUnnamedgroup7_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, grpUnnamedgroup7_Internalname, "Class", grpUnnamedgroup7_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENDTEX", ""), ""), GXv_int6) ;
         tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            grpUnnamedgroup7_Class = httpContext.getMessage( "Group", "") ;
            httpContext.ajax_rsp_assign_prop("", false, grpUnnamedgroup7_Internalname, "Class", grpUnnamedgroup7_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENDTEX", ""), ""), GXv_int6) ;
      tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         grpUnnamedgroup9_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, grpUnnamedgroup9_Internalname, "Class", grpUnnamedgroup9_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENDTEX", ""), ""), GXv_int6) ;
         tcalpro_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            grpUnnamedgroup9_Class = httpContext.getMessage( "Group", "") ;
            httpContext.ajax_rsp_assign_prop("", false, grpUnnamedgroup9_Internalname, "Class", grpUnnamedgroup9_Class, true);
         }
      }
      imgprompt_13425_13427_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.tclienvlevel1prompt"+"',["+"'"+WebUtils.htmlEncode( GXutil.strReplace( GXutil.rtrim( A396EmprCod), "'", "\\'"))+"'"+","+"{Ctrl:gx.dom.el('"+"ALBPROCLIC"+"'), id:'"+"ALBPROCLIC"+"'"+",IOType:'in'}"+","+"{Ctrl:gx.dom.el('"+"ALBPRODOME"+"'), id:'"+"ALBPRODOME"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV33AlbProID) )
      {
         edtAlbProID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProID_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV65Insert_CatDocID) )
      {
         edtCatDocID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCatDocID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDocID_Enabled), 5, 0), true);
      }
      else
      {
         edtCatDocID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCatDocID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDocID_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV66Insert_AlbProPrvID) )
      {
         edtAlbProPrvI_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( httpContext.getMessage( "DSP", ""), "")) == 0 )
         {
            edtAlbProPrvI_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbProPrvI_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Enabled), 5, 0), true);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV67Insert_AlbProCliCod) )
      {
         edtAlbProCliC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliC_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbProCliC_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliC_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV68Insert_TrnCod) )
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
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion No Permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isUpd( )  )
      {
         edtAlbProCliC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliC_Enabled), 5, 0), true);
      }
      if ( isUpd( )  )
      {
         edtAlbProPrvI_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Enabled), 5, 0), true);
      }
      if ( isUpd( )  || isDlt( )  || isIns( )  )
      {
         edtAlbProID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProID_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV68Insert_TrnCod) )
      {
         A840TrnCod = AV68Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         /* Using cursor T01O814 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         h840TrnCod = "" ;
         while ( (pr_default.getStatus(12) != 101) )
         {
            h840TrnCod = T01O814_A13738TrnCNom[0] ;
            if (true) break;
         }
         pr_default.close(12);
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV65Insert_CatDocID) )
      {
         A13453CatDocID = AV65Insert_CatDocID ;
         n13453CatDocID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
         /* Using cursor T01O815 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
         h13453CatDocID = "" ;
         while ( (pr_default.getStatus(13) != 101) )
         {
            h13453CatDocID = T01O815_A13854CatDocNomI[0] ;
            if (true) break;
         }
         pr_default.close(13);
         httpContext.ajax_rsp_assign_attri("", false, "h13453CatDocID", h13453CatDocID);
      }
      if ( true /* Level */ && isDlt( )  && ( ( AV34FirmaD == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(AV37Msg_errAT, 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! (0==AV33AlbProID) )
      {
         A13418AlbProID = AV33AlbProID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A13418AlbProID = AV33AlbProID ;
            httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         }
      }
      if ( ! (0==AV33AlbProID) )
      {
         edtAlbProID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProID_Enabled), 5, 0), true);
      }
      else
      {
         if ( true )
         {
            edtAlbProID_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProID_Enabled), 5, 0), true);
         }
         else
         {
            if ( isUpd( )  || isDlt( )  || isIns( )  )
            {
               edtAlbProID_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProID_Enabled), 5, 0), true);
            }
            else
            {
               edtAlbProID_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProID_Enabled), 5, 0), true);
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DSP", "")) == 0 )
      {
         edtAlbProPrvI_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         cmbAlbProInEx.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProInEx.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProInEx.getEnabled(), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         cmbAlbProTipo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProTipo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProTipo.getEnabled(), 5, 0), true);
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A13430AlbProDate)) && ( Gx_BScreen == 0 ) )
      {
         A13430AlbProDate = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A13431AlbProSys) && ( Gx_BScreen == 0 ) )
      {
         A13431AlbProSys = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13431AlbProSys", localUtil.ttoc( A13431AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( isIns( )  && (0==A13438AlbProStAT) && ( Gx_BScreen == 0 ) )
      {
         A13438AlbProStAT = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
      }
      if ( isIns( )  && (0==A13437AlbProSta) && ( Gx_BScreen == 0 ) )
      {
         A13437AlbProSta = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13437AlbProSta", GXutil.str( A13437AlbProSta, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A13436AlbProIDAT)==0) && ( Gx_BScreen == 0 ) )
      {
         A13436AlbProIDAT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A13436AlbProIDAT", A13436AlbProIDAT);
      }
      if ( isIns( )  && (GXutil.strcmp("", A13435AlbProEnvA)==0) && ( Gx_BScreen == 0 ) )
      {
         A13435AlbProEnvA = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
      }
      if ( isIns( )  && (0==A13452AlbProInEx) && ( Gx_BScreen == 0 ) )
      {
         A13452AlbProInEx = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13452AlbProInEx", GXutil.str( A13452AlbProInEx, 1, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01O812 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01O812_A841TrnNom[0] ;
         n841TrnNom = T01O812_n841TrnNom[0] ;
         pr_default.close(10);
         /* Using cursor T01O813 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
         A13454CatDocNom = T01O813_A13454CatDocNom[0] ;
         n13454CatDocNom = T01O813_n13454CatDocNom[0] ;
         pr_default.close(11);
         if ( true /* After */ )
         {
            AV49contcod = ((A13452AlbProInEx==1) ? httpContext.getMessage( httpContext.getMessage( "REMTRA", ""), "") : httpContext.getMessage( httpContext.getMessage( "EXTTRA", ""), "")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49contcod", AV49contcod);
         }
      }
   }

   public void load1O81838( )
   {
      /* Using cursor T01O816 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1838 = (short)(1) ;
         A13420AlbProPrvN = T01O816_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = T01O816_n13420AlbProPrvN[0] ;
         A13426AlbProCliN = T01O816_A13426AlbProCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13426AlbProCliN", A13426AlbProCliN);
         A13429AlbProSal = T01O816_A13429AlbProSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A407EmprNom = T01O816_A407EmprNom[0] ;
         n407EmprNom = T01O816_n407EmprNom[0] ;
         A13452AlbProInEx = T01O816_A13452AlbProInEx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13452AlbProInEx", GXutil.str( A13452AlbProInEx, 1, 0));
         A13417AlbProTipo = T01O816_A13417AlbProTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         A13430AlbProDate = T01O816_A13430AlbProDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
         A13454CatDocNom = T01O816_A13454CatDocNom[0] ;
         n13454CatDocNom = T01O816_n13454CatDocNom[0] ;
         A13427AlbProDomE = T01O816_A13427AlbProDomE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.str( A13427AlbProDomE, 1, 0));
         A841TrnNom = T01O816_A841TrnNom[0] ;
         n841TrnNom = T01O816_n841TrnNom[0] ;
         A13424AlbProMatr = T01O816_A13424AlbProMatr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13424AlbProMatr", A13424AlbProMatr);
         A13439AlbProObs = T01O816_A13439AlbProObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13439AlbProObs", A13439AlbProObs);
         A13437AlbProSta = T01O816_A13437AlbProSta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13437AlbProSta", GXutil.str( A13437AlbProSta, 1, 0));
         A13431AlbProSys = T01O816_A13431AlbProSys[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13431AlbProSys", localUtil.ttoc( A13431AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13433AlbProHh = T01O816_A13433AlbProHh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13433AlbProHh", A13433AlbProHh);
         A13434AlbProHhCt = T01O816_A13434AlbProHhCt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13434AlbProHhCt", A13434AlbProHhCt);
         A13435AlbProEnvA = T01O816_A13435AlbProEnvA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
         A13436AlbProIDAT = T01O816_A13436AlbProIDAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13436AlbProIDAT", A13436AlbProIDAT);
         A13438AlbProStAT = T01O816_A13438AlbProStAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
         A13440AlbProAnul = T01O816_A13440AlbProAnul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13440AlbProAnul", A13440AlbProAnul);
         A13441AlbProUltL = T01O816_A13441AlbProUltL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
         A13579AlbProLC1 = T01O816_A13579AlbProLC1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13579AlbProLC1", A13579AlbProLC1);
         A13580AlbProLC2 = T01O816_A13580AlbProLC2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13580AlbProLC2", A13580AlbProLC2);
         A13581AlbProLC3 = T01O816_A13581AlbProLC3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13581AlbProLC3", A13581AlbProLC3);
         A13582AlbProLD1 = T01O816_A13582AlbProLD1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13582AlbProLD1", A13582AlbProLD1);
         A13583AlbProLD2 = T01O816_A13583AlbProLD2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13583AlbProLD2", A13583AlbProLD2);
         A13584AlbProLD3 = T01O816_A13584AlbProLD3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13584AlbProLD3", A13584AlbProLD3);
         A14190AlbProATCU = T01O816_A14190AlbProATCU[0] ;
         n14190AlbProATCU = T01O816_n14190AlbProATCU[0] ;
         A14191AlbProSerA = T01O816_A14191AlbProSerA[0] ;
         n14191AlbProSerA = T01O816_n14191AlbProSerA[0] ;
         A14192AlbProTipA = T01O816_A14192AlbProTipA[0] ;
         n14192AlbProTipA = T01O816_n14192AlbProTipA[0] ;
         A13425AlbProCliC = T01O816_A13425AlbProCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         A13419AlbProPrvI = T01O816_A13419AlbProPrvI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         A840TrnCod = T01O816_A840TrnCod[0] ;
         n840TrnCod = T01O816_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A13453CatDocID = T01O816_A13453CatDocID[0] ;
         n13453CatDocID = T01O816_n13453CatDocID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
         zm1O81838( -101) ;
      }
      pr_default.close(14);
      onLoadActions1O81838( ) ;
   }

   public void onLoadActions1O81838( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV66Insert_AlbProPrvID) )
      {
         A13419AlbProPrvI = AV66Insert_AlbProPrvID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         /* Using cursor T01O817 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
         h13419AlbProPrvI = "" ;
         while ( (pr_default.getStatus(15) != 101) )
         {
            h13419AlbProPrvI = T01O817_A13719PrvNNom[0] ;
            if (true) break;
         }
         pr_default.close(15);
         httpContext.ajax_rsp_assign_attri("", false, "h13419AlbProPrvI", h13419AlbProPrvI);
      }
      else
      {
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
         {
            A13419AlbProPrvI = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
            /* Using cursor T01O818 */
            pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
            h13419AlbProPrvI = "" ;
            while ( (pr_default.getStatus(16) != 101) )
            {
               h13419AlbProPrvI = T01O818_A13719PrvNNom[0] ;
               if (true) break;
            }
            pr_default.close(16);
            httpContext.ajax_rsp_assign_attri("", false, "h13419AlbProPrvI", h13419AlbProPrvI);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV67Insert_AlbProCliCod) )
      {
         A13425AlbProCliC = AV67Insert_AlbProCliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
      }
      else
      {
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
         {
            A13425AlbProCliC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         }
      }
      if ( true /* After */ )
      {
         AV49contcod = ((A13452AlbProInEx==1) ? httpContext.getMessage( httpContext.getMessage( "REMTRA", ""), "") : httpContext.getMessage( httpContext.getMessage( "EXTTRA", ""), "")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49contcod", AV49contcod);
      }
      edtPrdNum_Visible = ((GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), ""))==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProPrvI_Visible = ((GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), ""))==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Visible), 5, 0), true);
      if ( ! ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) ) )
      {
         divAlbproprvid_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbproprvid_cell_Internalname, "Class", divAlbproprvid_cell_Class, true);
      }
      else
      {
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
         {
            divAlbproprvid_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbproprvid_cell_Internalname, "Class", divAlbproprvid_cell_Class, true);
         }
      }
      edtAlbProCliC_Visible = ((GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), ""))==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliC_Visible), 5, 0), true);
      if ( ! ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 ) ) )
      {
         divAlbproclicod_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbproclicod_cell_Internalname, "Class", divAlbproclicod_cell_Class, true);
      }
      else
      {
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
         {
            divAlbproclicod_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbproclicod_cell_Internalname, "Class", divAlbproclicod_cell_Class, true);
         }
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A13429AlbProSal) && true /* After */ )
      {
         GXt_dtime13 = A13429AlbProSal ;
         GXv_dtime10[0] = GXt_dtime13 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime10) ;
         tcalpro_impl.this.GXt_dtime13 = GXv_dtime10[0] ;
         A13429AlbProSal = GXt_dtime13 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
      {
         A13426AlbProCliN = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A13426AlbProCliN", A13426AlbProCliN);
      }
      if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
      {
         A13420AlbProPrvN = " " ;
         n13420AlbProPrvN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13420AlbProPrvN", A13420AlbProPrvN);
      }
      /* Using cursor T01O819 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
      h13453CatDocID = "" ;
      while ( (pr_default.getStatus(17) != 101) )
      {
         h13453CatDocID = T01O819_A13854CatDocNomI[0] ;
         if (true) break;
      }
      pr_default.close(17);
      httpContext.ajax_rsp_assign_attri("", false, "h13453CatDocID", h13453CatDocID);
      /* Using cursor T01O820 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
      h13419AlbProPrvI = "" ;
      while ( (pr_default.getStatus(18) != 101) )
      {
         h13419AlbProPrvI = T01O820_A13719PrvNNom[0] ;
         if (true) break;
      }
      pr_default.close(18);
      httpContext.ajax_rsp_assign_attri("", false, "h13419AlbProPrvI", h13419AlbProPrvI);
      /* Using cursor T01O821 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      h840TrnCod = "" ;
      while ( (pr_default.getStatus(19) != 101) )
      {
         h840TrnCod = T01O821_A13738TrnCNom[0] ;
         if (true) break;
      }
      pr_default.close(19);
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
   }

   public void checkExtendedTable1O81838( )
   {
      nIsDirty_1838 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h13453CatDocID)==0) )
      {
         nIsDirty_1838 = (short)(1) ;
         A13453CatDocID = (short)(0) ;
         n13453CatDocID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
      }
      else
      {
         A13854CatDocNomI = h13453CatDocID ;
         /* Using cursor T01O822 */
         pr_default.execute(20, new Object[] {A13854CatDocNomI, A396EmprCod});
         A396EmprCod = T01O822_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13453CatDocID = T01O822_A13453CatDocID[0] ;
         n13453CatDocID = T01O822_n13453CatDocID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
         A13453CatDocID = T01O822_A13453CatDocID[0] ;
         n13453CatDocID = T01O822_n13453CatDocID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
         if ( ! ( (pr_default.getStatus(20) == 101) ) )
         {
            pr_default.readNext(20);
            if ( ! ( (pr_default.getStatus(20) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "CATDOCID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCatDocID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(20);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h13453CatDocID", h13453CatDocID);
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_1838 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01O823 */
         pr_default.execute(21, new Object[] {A13738TrnCNom, A396EmprCod});
         A396EmprCod = T01O823_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = T01O823_A840TrnCod[0] ;
         n840TrnCod = T01O823_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01O823_A840TrnCod[0] ;
         n840TrnCod = T01O823_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(21) == 101) ) )
         {
            pr_default.readNext(21);
            if ( ! ( (pr_default.getStatus(21) == 101) ) )
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
         pr_default.close(21);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      if ( ( ( GXutil.strcmp(A13436AlbProIDAT, " ") != 0 ) || ( A13438AlbProStAT == 3 ) ) && ( AV34FirmaD == 1 ) && ( isIns( )  || isUpd( )  || isDlt( )  ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV66Insert_AlbProPrvID) )
      {
         nIsDirty_1838 = (short)(1) ;
         A13419AlbProPrvI = AV66Insert_AlbProPrvID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         /* Using cursor T01O824 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
         h13419AlbProPrvI = "" ;
         while ( (pr_default.getStatus(22) != 101) )
         {
            h13419AlbProPrvI = T01O824_A13719PrvNNom[0] ;
            if (true) break;
         }
         pr_default.close(22);
         httpContext.ajax_rsp_assign_attri("", false, "h13419AlbProPrvI", h13419AlbProPrvI);
      }
      else
      {
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
         {
            nIsDirty_1838 = (short)(1) ;
            nIsDirty_1838 = (short)(1) ;
            A13419AlbProPrvI = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
            /* Using cursor T01O825 */
            pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
            h13419AlbProPrvI = "" ;
            while ( (pr_default.getStatus(23) != 101) )
            {
               h13419AlbProPrvI = T01O825_A13719PrvNNom[0] ;
               if (true) break;
            }
            pr_default.close(23);
            httpContext.ajax_rsp_assign_attri("", false, "h13419AlbProPrvI", h13419AlbProPrvI);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV67Insert_AlbProCliCod) )
      {
         nIsDirty_1838 = (short)(1) ;
         A13425AlbProCliC = AV67Insert_AlbProCliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
      }
      else
      {
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
         {
            nIsDirty_1838 = (short)(1) ;
            nIsDirty_1838 = (short)(1) ;
            A13425AlbProCliC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         }
      }
      if ( true /* After */ )
      {
         AV49contcod = ((A13452AlbProInEx==1) ? httpContext.getMessage( httpContext.getMessage( "REMTRA", ""), "") : httpContext.getMessage( httpContext.getMessage( "EXTTRA", ""), "")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49contcod", AV49contcod);
      }
      edtPrdNum_Visible = ((GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), ""))==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProPrvI_Visible = ((GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), ""))==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Visible), 5, 0), true);
      if ( ! ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) ) )
      {
         divAlbproprvid_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbproprvid_cell_Internalname, "Class", divAlbproprvid_cell_Class, true);
      }
      else
      {
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
         {
            divAlbproprvid_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbproprvid_cell_Internalname, "Class", divAlbproprvid_cell_Class, true);
         }
      }
      edtAlbProCliC_Visible = ((GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), ""))==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliC_Visible), 5, 0), true);
      if ( ! ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 ) ) )
      {
         divAlbproclicod_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbproclicod_cell_Internalname, "Class", divAlbproclicod_cell_Class, true);
      }
      else
      {
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
         {
            divAlbproclicod_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbproclicod_cell_Internalname, "Class", divAlbproclicod_cell_Class, true);
         }
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A13429AlbProSal) && true /* After */ )
      {
         nIsDirty_1838 = (short)(1) ;
         GXt_dtime13 = A13429AlbProSal ;
         GXv_dtime10[0] = GXt_dtime13 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime10) ;
         tcalpro_impl.this.GXt_dtime13 = GXv_dtime10[0] ;
         A13429AlbProSal = GXt_dtime13 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( true /* Level */ && true /* After */ && ( AV43Ctrlf == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = "" ;
         GXv_int6[0] = (byte)(3) ;
         GXv_date9[0] = AV42Fch ;
         GXv_int8[0] = AV41AlbLast ;
         GXv_date14[0] = A13430AlbProDate ;
         GXv_char2[0] = AV40Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_date9, GXv_int8, GXv_date14, GXv_char2) ;
         tcalpro_impl.this.A396EmprCod = GXv_char4[0] ;
         tcalpro_impl.this.AV42Fch = GXv_date9[0] ;
         tcalpro_impl.this.AV41AlbLast = GXv_int8[0] ;
         tcalpro_impl.this.A13430AlbProDate = GXv_date14[0] ;
         tcalpro_impl.this.AV40Msg_f = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV42Fch", localUtil.format(AV42Fch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV41AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41AlbLast), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_f", AV40Msg_f);
      }
      if ( ( GXutil.strcmp(AV40Msg_f, " ") != 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV40Msg_f, 1, "ALBPRODATE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProDate_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A13419AlbProPrvI ;
         GXv_int6[0] = A13452AlbProInEx ;
         GXv_int15[0] = AV45FlagProv ;
         GXv_char3[0] = AV60msgInEx ;
         new app.pexiproveedor(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_int15, GXv_char3) ;
         tcalpro_impl.this.A396EmprCod = GXv_char4[0] ;
         tcalpro_impl.this.A13419AlbProPrvI = GXv_int8[0] ;
         tcalpro_impl.this.A13452AlbProInEx = GXv_int6[0] ;
         tcalpro_impl.this.AV45FlagProv = GXv_int15[0] ;
         tcalpro_impl.this.AV60msgInEx = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13452AlbProInEx", GXutil.str( A13452AlbProInEx, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV45FlagProv", GXutil.str( AV45FlagProv, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV60msgInEx", AV60msgInEx);
      }
      if ( ( AV45FlagProv == 0 ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor Inexistente", ""), 1, "ALBPROPRVI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPrvI_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) && true /* After */ && ( GXutil.strcmp(AV60msgInEx, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV60msgInEx, 0, "ALBPROPRVI");
      }
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) && true /* After */ && ( A13425AlbProCliC > 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A13425AlbProCliC ;
         GXv_int15[0] = AV44FlagCli ;
         new app.pexicli(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int15) ;
         tcalpro_impl.this.A396EmprCod = GXv_char4[0] ;
         tcalpro_impl.this.A13425AlbProCliC = GXv_int8[0] ;
         tcalpro_impl.this.AV44FlagCli = GXv_int15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV44FlagCli", GXutil.str( AV44FlagCli, 1, 0));
      }
      if ( ( AV44FlagCli == 0 ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) && true /* After */ && ( A13425AlbProCliC > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Inexistente", ""), 1, "ALBPROCLIC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCliC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) && true /* After */ && ( A13427AlbProDomE > 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A13425AlbProCliC ;
         GXv_int15[0] = A13427AlbProDomE ;
         GXv_int6[0] = AV46FlagDom ;
         new app.pexidomenvio(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int15, GXv_int6) ;
         tcalpro_impl.this.A396EmprCod = GXv_char4[0] ;
         tcalpro_impl.this.A13425AlbProCliC = GXv_int8[0] ;
         tcalpro_impl.this.A13427AlbProDomE = GXv_int15[0] ;
         tcalpro_impl.this.AV46FlagDom = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.str( A13427AlbProDomE, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV46FlagDom", GXutil.str( AV46FlagDom, 1, 0));
      }
      if ( ( AV46FlagDom == 0 ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) && true /* After */ && ( A13427AlbProDomE > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Domicilio Envio Inexistente", ""), 1, "ALBPRODOME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProDomE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", h13453CatDocID)==0) )
      {
         nIsDirty_1838 = (short)(1) ;
         A13453CatDocID = (short)(0) ;
         n13453CatDocID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
      }
      else
      {
         A13854CatDocNomI = h13453CatDocID ;
         /* Using cursor T01O826 */
         pr_default.execute(24, new Object[] {A13854CatDocNomI, A396EmprCod});
         A13453CatDocID = T01O826_A13453CatDocID[0] ;
         n13453CatDocID = T01O826_n13453CatDocID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
         A13453CatDocID = T01O826_A13453CatDocID[0] ;
         n13453CatDocID = T01O826_n13453CatDocID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
         if ( ! ( (pr_default.getStatus(24) == 101) ) )
         {
            pr_default.readNext(24);
            if ( ! ( (pr_default.getStatus(24) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "CATDOCID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCatDocID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(24);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h13453CatDocID", h13453CatDocID);
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_1838 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01O827 */
         pr_default.execute(25, new Object[] {A13738TrnCNom, A396EmprCod});
         A840TrnCod = T01O827_A840TrnCod[0] ;
         n840TrnCod = T01O827_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01O827_A840TrnCod[0] ;
         n840TrnCod = T01O827_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(25) == 101) ) )
         {
            pr_default.readNext(25);
            if ( ! ( (pr_default.getStatus(25) == 101) ) )
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
         pr_default.close(25);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01O89 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13425AlbProCliC)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Cliente", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCLIC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCliC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13426AlbProCliN = T01O89_A13426AlbProCliN[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13426AlbProCliN", A13426AlbProCliN);
      pr_default.close(7);
      if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
      {
         nIsDirty_1838 = (short)(1) ;
         A13426AlbProCliN = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A13426AlbProCliN", A13426AlbProCliN);
      }
      /* Using cursor T01O811 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Proveedor", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROPRVI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPrvI_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13420AlbProPrvN = T01O811_A13420AlbProPrvN[0] ;
      n13420AlbProPrvN = T01O811_n13420AlbProPrvN[0] ;
      pr_default.close(9);
      if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
      {
         nIsDirty_1838 = (short)(1) ;
         A13420AlbProPrvN = " " ;
         n13420AlbProPrvN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13420AlbProPrvN", A13420AlbProPrvN);
      }
      /* Using cursor T01O812 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01O812_A841TrnNom[0] ;
      n841TrnNom = T01O812_n841TrnNom[0] ;
      pr_default.close(10);
      /* Using cursor T01O813 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (0==A13453CatDocID) && (GXutil.strcmp("", A13854CatDocNomI)==0) || (0==A13453CatDocID) && n13453CatDocID || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Categorias Documento Transporte", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CATDOCID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCatDocID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A13454CatDocNom = T01O813_A13454CatDocNom[0] ;
      n13454CatDocNom = T01O813_n13454CatDocNom[0] ;
      pr_default.close(11);
   }

   public void closeExtendedTableCursors1O81838( )
   {
      pr_default.close(6);
      pr_default.close(8);
      pr_default.close(10);
      pr_default.close(11);
   }

   public void enableDisable( )
   {
   }

   public void gxload_103( String A396EmprCod ,
                           int A13425AlbProCliC )
   {
      /* Using cursor T01O89 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13425AlbProCliC)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Cliente", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCLIC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCliC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13426AlbProCliN = T01O89_A13426AlbProCliN[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13426AlbProCliN", A13426AlbProCliN);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13426AlbProCliN))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_104( String A396EmprCod ,
                           int A13419AlbProPrvI )
   {
      /* Using cursor T01O811 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Proveedor", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROPRVI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPrvI_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13420AlbProPrvN = T01O811_A13420AlbProPrvN[0] ;
      n13420AlbProPrvN = T01O811_n13420AlbProPrvN[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13420AlbProPrvN))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_105( String A396EmprCod ,
                           short A840TrnCod )
   {
      /* Using cursor T01O828 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01O828_A841TrnNom[0] ;
      n841TrnNom = T01O828_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(26) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(26);
   }

   public void gxload_106( String A396EmprCod ,
                           short A13453CatDocID )
   {
      /* Using cursor T01O829 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         if ( ! ( (0==A13453CatDocID) && (GXutil.strcmp("", A13854CatDocNomI)==0) || (0==A13453CatDocID) && n13453CatDocID || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Categorias Documento Transporte", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CATDOCID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCatDocID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A13454CatDocNom = T01O829_A13454CatDocNom[0] ;
      n13454CatDocNom = T01O829_n13454CatDocNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13454CatDocNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(27) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(27);
   }

   public void getKey1O81838( )
   {
      /* Using cursor T01O830 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1838 = (short)(1) ;
      }
      else
      {
         RcdFound1838 = (short)(0) ;
      }
      pr_default.close(28);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01O86 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01O86_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1O81838( 101) ;
         RcdFound1838 = (short)(1) ;
         A13418AlbProID = T01O86_A13418AlbProID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         A13429AlbProSal = T01O86_A13429AlbProSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13452AlbProInEx = T01O86_A13452AlbProInEx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13452AlbProInEx", GXutil.str( A13452AlbProInEx, 1, 0));
         A13417AlbProTipo = T01O86_A13417AlbProTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         A13430AlbProDate = T01O86_A13430AlbProDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
         A13427AlbProDomE = T01O86_A13427AlbProDomE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.str( A13427AlbProDomE, 1, 0));
         A13424AlbProMatr = T01O86_A13424AlbProMatr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13424AlbProMatr", A13424AlbProMatr);
         A13439AlbProObs = T01O86_A13439AlbProObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13439AlbProObs", A13439AlbProObs);
         A13437AlbProSta = T01O86_A13437AlbProSta[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13437AlbProSta", GXutil.str( A13437AlbProSta, 1, 0));
         A13431AlbProSys = T01O86_A13431AlbProSys[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13431AlbProSys", localUtil.ttoc( A13431AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13433AlbProHh = T01O86_A13433AlbProHh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13433AlbProHh", A13433AlbProHh);
         A13434AlbProHhCt = T01O86_A13434AlbProHhCt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13434AlbProHhCt", A13434AlbProHhCt);
         A13435AlbProEnvA = T01O86_A13435AlbProEnvA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
         A13436AlbProIDAT = T01O86_A13436AlbProIDAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13436AlbProIDAT", A13436AlbProIDAT);
         A13438AlbProStAT = T01O86_A13438AlbProStAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
         A13440AlbProAnul = T01O86_A13440AlbProAnul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13440AlbProAnul", A13440AlbProAnul);
         A13441AlbProUltL = T01O86_A13441AlbProUltL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
         A13579AlbProLC1 = T01O86_A13579AlbProLC1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13579AlbProLC1", A13579AlbProLC1);
         A13580AlbProLC2 = T01O86_A13580AlbProLC2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13580AlbProLC2", A13580AlbProLC2);
         A13581AlbProLC3 = T01O86_A13581AlbProLC3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13581AlbProLC3", A13581AlbProLC3);
         A13582AlbProLD1 = T01O86_A13582AlbProLD1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13582AlbProLD1", A13582AlbProLD1);
         A13583AlbProLD2 = T01O86_A13583AlbProLD2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13583AlbProLD2", A13583AlbProLD2);
         A13584AlbProLD3 = T01O86_A13584AlbProLD3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13584AlbProLD3", A13584AlbProLD3);
         A14190AlbProATCU = T01O86_A14190AlbProATCU[0] ;
         n14190AlbProATCU = T01O86_n14190AlbProATCU[0] ;
         A14191AlbProSerA = T01O86_A14191AlbProSerA[0] ;
         n14191AlbProSerA = T01O86_n14191AlbProSerA[0] ;
         A14192AlbProTipA = T01O86_A14192AlbProTipA[0] ;
         n14192AlbProTipA = T01O86_n14192AlbProTipA[0] ;
         A13425AlbProCliC = T01O86_A13425AlbProCliC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         A13419AlbProPrvI = T01O86_A13419AlbProPrvI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         A840TrnCod = T01O86_A840TrnCod[0] ;
         n840TrnCod = T01O86_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A13453CatDocID = T01O86_A13453CatDocID[0] ;
         n13453CatDocID = T01O86_n13453CatDocID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
         O13441AlbProUltL = A13441AlbProUltL ;
         httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z13418AlbProID = A13418AlbProID ;
         sMode1838 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1O81838( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1838 = (short)(0) ;
            initializeNonKey1O81838( ) ;
         }
         Gx_mode = sMode1838 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1838 = (short)(0) ;
         initializeNonKey1O81838( ) ;
         sMode1838 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1838 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1O81838( ) ;
      if ( RcdFound1838 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1838 = (short)(0) ;
      /* Using cursor T01O831 */
      pr_default.execute(29, new Object[] {Integer.valueOf(A13418AlbProID), A396EmprCod});
      if ( (pr_default.getStatus(29) != 101) )
      {
         while ( (pr_default.getStatus(29) != 101) && ( ( T01O831_A13418AlbProID[0] < A13418AlbProID ) ) && ( GXutil.strcmp(T01O831_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(29);
         }
         if ( (pr_default.getStatus(29) != 101) && ( ( T01O831_A13418AlbProID[0] > A13418AlbProID ) ) && ( GXutil.strcmp(T01O831_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13418AlbProID = T01O831_A13418AlbProID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
            RcdFound1838 = (short)(1) ;
         }
      }
      pr_default.close(29);
   }

   public void move_previous( )
   {
      RcdFound1838 = (short)(0) ;
      /* Using cursor T01O832 */
      pr_default.execute(30, new Object[] {Integer.valueOf(A13418AlbProID), A396EmprCod});
      if ( (pr_default.getStatus(30) != 101) )
      {
         while ( (pr_default.getStatus(30) != 101) && ( ( T01O832_A13418AlbProID[0] > A13418AlbProID ) ) && ( GXutil.strcmp(T01O832_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(30);
         }
         if ( (pr_default.getStatus(30) != 101) && ( ( T01O832_A13418AlbProID[0] < A13418AlbProID ) ) && ( GXutil.strcmp(T01O832_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13418AlbProID = T01O832_A13418AlbProID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
            RcdFound1838 = (short)(1) ;
         }
      }
      pr_default.close(30);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1O81838( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A13441AlbProUltL = O13441AlbProUltL ;
         httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
         GX_FocusControl = cmbAlbProInEx.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1O81838( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1838 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13418AlbProID != Z13418AlbProID ) )
            {
               A13418AlbProID = Z13418AlbProID ;
               httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A13441AlbProUltL = O13441AlbProUltL ;
               httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = cmbAlbProInEx.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A13441AlbProUltL = O13441AlbProUltL ;
               httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
               update1O81838( ) ;
               GX_FocusControl = cmbAlbProInEx.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13418AlbProID != Z13418AlbProID ) )
            {
               /* Insert record */
               A13441AlbProUltL = O13441AlbProUltL ;
               httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
               GX_FocusControl = cmbAlbProInEx.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1O81838( ) ;
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
                  A13441AlbProUltL = O13441AlbProUltL ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
                  GX_FocusControl = cmbAlbProInEx.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1O81838( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13418AlbProID != Z13418AlbProID ) )
      {
         A13418AlbProID = Z13418AlbProID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A13441AlbProUltL = O13441AlbProUltL ;
         httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = cmbAlbProInEx.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1O81838( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h13453CatDocID)==0) )
         {
            A13453CatDocID = (short)(0) ;
            n13453CatDocID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
         }
         else
         {
            A13854CatDocNomI = h13453CatDocID ;
            /* Using cursor T01O833 */
            pr_default.execute(31, new Object[] {A13854CatDocNomI, A396EmprCod});
            A396EmprCod = T01O833_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13453CatDocID = T01O833_A13453CatDocID[0] ;
            n13453CatDocID = T01O833_n13453CatDocID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
            A13453CatDocID = T01O833_A13453CatDocID[0] ;
            n13453CatDocID = T01O833_n13453CatDocID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
            if ( ! ( (pr_default.getStatus(31) == 101) ) )
            {
               pr_default.readNext(31);
               if ( ! ( (pr_default.getStatus(31) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "CATDOCID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCatDocID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(31);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h13453CatDocID", h13453CatDocID);
         if ( (GXutil.strcmp("", h840TrnCod)==0) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A13738TrnCNom = h840TrnCod ;
            /* Using cursor T01O834 */
            pr_default.execute(32, new Object[] {A13738TrnCNom, A396EmprCod});
            A396EmprCod = T01O834_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A840TrnCod = T01O834_A840TrnCod[0] ;
            n840TrnCod = T01O834_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A840TrnCod = T01O834_A840TrnCod[0] ;
            n840TrnCod = T01O834_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            if ( ! ( (pr_default.getStatus(32) == 101) ) )
            {
               pr_default.readNext(32);
               if ( ! ( (pr_default.getStatus(32) == 101) ) )
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
            pr_default.close(32);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01O85 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(Z13429AlbProSal, T01O85_A13429AlbProSal[0]) ) || ( Z13452AlbProInEx != T01O85_A13452AlbProInEx[0] ) || ( GXutil.strcmp(Z13417AlbProTipo, T01O85_A13417AlbProTipo[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z13430AlbProDate), GXutil.resetTime(T01O85_A13430AlbProDate[0])) ) || ( Z13427AlbProDomE != T01O85_A13427AlbProDomE[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13424AlbProMatr, T01O85_A13424AlbProMatr[0]) != 0 ) || ( GXutil.strcmp(Z13439AlbProObs, T01O85_A13439AlbProObs[0]) != 0 ) || ( Z13437AlbProSta != T01O85_A13437AlbProSta[0] ) || !( GXutil.dateCompare(Z13431AlbProSys, T01O85_A13431AlbProSys[0]) ) || ( GXutil.strcmp(Z13433AlbProHh, T01O85_A13433AlbProHh[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13434AlbProHhCt, T01O85_A13434AlbProHhCt[0]) != 0 ) || ( GXutil.strcmp(Z13435AlbProEnvA, T01O85_A13435AlbProEnvA[0]) != 0 ) || ( GXutil.strcmp(Z13436AlbProIDAT, T01O85_A13436AlbProIDAT[0]) != 0 ) || ( Z13438AlbProStAT != T01O85_A13438AlbProStAT[0] ) || ( GXutil.strcmp(Z13440AlbProAnul, T01O85_A13440AlbProAnul[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13441AlbProUltL != T01O85_A13441AlbProUltL[0] ) || ( GXutil.strcmp(Z13579AlbProLC1, T01O85_A13579AlbProLC1[0]) != 0 ) || ( GXutil.strcmp(Z13580AlbProLC2, T01O85_A13580AlbProLC2[0]) != 0 ) || ( GXutil.strcmp(Z13581AlbProLC3, T01O85_A13581AlbProLC3[0]) != 0 ) || ( GXutil.strcmp(Z13582AlbProLD1, T01O85_A13582AlbProLD1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13583AlbProLD2, T01O85_A13583AlbProLD2[0]) != 0 ) || ( GXutil.strcmp(Z13584AlbProLD3, T01O85_A13584AlbProLD3[0]) != 0 ) || ( GXutil.strcmp(Z14190AlbProATCU, T01O85_A14190AlbProATCU[0]) != 0 ) || ( GXutil.strcmp(Z14191AlbProSerA, T01O85_A14191AlbProSerA[0]) != 0 ) || ( GXutil.strcmp(Z14192AlbProTipA, T01O85_A14192AlbProTipA[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13425AlbProCliC != T01O85_A13425AlbProCliC[0] ) || ( Z13419AlbProPrvI != T01O85_A13419AlbProPrvI[0] ) || ( Z840TrnCod != T01O85_A840TrnCod[0] ) || ( Z13453CatDocID != T01O85_A13453CatDocID[0] ) )
         {
            if ( !( GXutil.dateCompare(Z13429AlbProSal, T01O85_A13429AlbProSal[0]) ) )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProSal");
               GXutil.writeLogRaw("Old: ",Z13429AlbProSal);
               GXutil.writeLogRaw("Current: ",T01O85_A13429AlbProSal[0]);
            }
            if ( Z13452AlbProInEx != T01O85_A13452AlbProInEx[0] )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProInEx");
               GXutil.writeLogRaw("Old: ",Z13452AlbProInEx);
               GXutil.writeLogRaw("Current: ",T01O85_A13452AlbProInEx[0]);
            }
            if ( GXutil.strcmp(Z13417AlbProTipo, T01O85_A13417AlbProTipo[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProTipo");
               GXutil.writeLogRaw("Old: ",Z13417AlbProTipo);
               GXutil.writeLogRaw("Current: ",T01O85_A13417AlbProTipo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13430AlbProDate), GXutil.resetTime(T01O85_A13430AlbProDate[0])) ) )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProDate");
               GXutil.writeLogRaw("Old: ",Z13430AlbProDate);
               GXutil.writeLogRaw("Current: ",T01O85_A13430AlbProDate[0]);
            }
            if ( Z13427AlbProDomE != T01O85_A13427AlbProDomE[0] )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProDomE");
               GXutil.writeLogRaw("Old: ",Z13427AlbProDomE);
               GXutil.writeLogRaw("Current: ",T01O85_A13427AlbProDomE[0]);
            }
            if ( GXutil.strcmp(Z13424AlbProMatr, T01O85_A13424AlbProMatr[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProMatr");
               GXutil.writeLogRaw("Old: ",Z13424AlbProMatr);
               GXutil.writeLogRaw("Current: ",T01O85_A13424AlbProMatr[0]);
            }
            if ( GXutil.strcmp(Z13439AlbProObs, T01O85_A13439AlbProObs[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProObs");
               GXutil.writeLogRaw("Old: ",Z13439AlbProObs);
               GXutil.writeLogRaw("Current: ",T01O85_A13439AlbProObs[0]);
            }
            if ( Z13437AlbProSta != T01O85_A13437AlbProSta[0] )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProSta");
               GXutil.writeLogRaw("Old: ",Z13437AlbProSta);
               GXutil.writeLogRaw("Current: ",T01O85_A13437AlbProSta[0]);
            }
            if ( !( GXutil.dateCompare(Z13431AlbProSys, T01O85_A13431AlbProSys[0]) ) )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProSys");
               GXutil.writeLogRaw("Old: ",Z13431AlbProSys);
               GXutil.writeLogRaw("Current: ",T01O85_A13431AlbProSys[0]);
            }
            if ( GXutil.strcmp(Z13433AlbProHh, T01O85_A13433AlbProHh[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProHh");
               GXutil.writeLogRaw("Old: ",Z13433AlbProHh);
               GXutil.writeLogRaw("Current: ",T01O85_A13433AlbProHh[0]);
            }
            if ( GXutil.strcmp(Z13434AlbProHhCt, T01O85_A13434AlbProHhCt[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProHhCt");
               GXutil.writeLogRaw("Old: ",Z13434AlbProHhCt);
               GXutil.writeLogRaw("Current: ",T01O85_A13434AlbProHhCt[0]);
            }
            if ( GXutil.strcmp(Z13435AlbProEnvA, T01O85_A13435AlbProEnvA[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProEnvA");
               GXutil.writeLogRaw("Old: ",Z13435AlbProEnvA);
               GXutil.writeLogRaw("Current: ",T01O85_A13435AlbProEnvA[0]);
            }
            if ( GXutil.strcmp(Z13436AlbProIDAT, T01O85_A13436AlbProIDAT[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProIDAT");
               GXutil.writeLogRaw("Old: ",Z13436AlbProIDAT);
               GXutil.writeLogRaw("Current: ",T01O85_A13436AlbProIDAT[0]);
            }
            if ( Z13438AlbProStAT != T01O85_A13438AlbProStAT[0] )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProStAT");
               GXutil.writeLogRaw("Old: ",Z13438AlbProStAT);
               GXutil.writeLogRaw("Current: ",T01O85_A13438AlbProStAT[0]);
            }
            if ( GXutil.strcmp(Z13440AlbProAnul, T01O85_A13440AlbProAnul[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProAnul");
               GXutil.writeLogRaw("Old: ",Z13440AlbProAnul);
               GXutil.writeLogRaw("Current: ",T01O85_A13440AlbProAnul[0]);
            }
            if ( Z13441AlbProUltL != T01O85_A13441AlbProUltL[0] )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProUltL");
               GXutil.writeLogRaw("Old: ",Z13441AlbProUltL);
               GXutil.writeLogRaw("Current: ",T01O85_A13441AlbProUltL[0]);
            }
            if ( GXutil.strcmp(Z13579AlbProLC1, T01O85_A13579AlbProLC1[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProLC1");
               GXutil.writeLogRaw("Old: ",Z13579AlbProLC1);
               GXutil.writeLogRaw("Current: ",T01O85_A13579AlbProLC1[0]);
            }
            if ( GXutil.strcmp(Z13580AlbProLC2, T01O85_A13580AlbProLC2[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProLC2");
               GXutil.writeLogRaw("Old: ",Z13580AlbProLC2);
               GXutil.writeLogRaw("Current: ",T01O85_A13580AlbProLC2[0]);
            }
            if ( GXutil.strcmp(Z13581AlbProLC3, T01O85_A13581AlbProLC3[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProLC3");
               GXutil.writeLogRaw("Old: ",Z13581AlbProLC3);
               GXutil.writeLogRaw("Current: ",T01O85_A13581AlbProLC3[0]);
            }
            if ( GXutil.strcmp(Z13582AlbProLD1, T01O85_A13582AlbProLD1[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProLD1");
               GXutil.writeLogRaw("Old: ",Z13582AlbProLD1);
               GXutil.writeLogRaw("Current: ",T01O85_A13582AlbProLD1[0]);
            }
            if ( GXutil.strcmp(Z13583AlbProLD2, T01O85_A13583AlbProLD2[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProLD2");
               GXutil.writeLogRaw("Old: ",Z13583AlbProLD2);
               GXutil.writeLogRaw("Current: ",T01O85_A13583AlbProLD2[0]);
            }
            if ( GXutil.strcmp(Z13584AlbProLD3, T01O85_A13584AlbProLD3[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProLD3");
               GXutil.writeLogRaw("Old: ",Z13584AlbProLD3);
               GXutil.writeLogRaw("Current: ",T01O85_A13584AlbProLD3[0]);
            }
            if ( GXutil.strcmp(Z14190AlbProATCU, T01O85_A14190AlbProATCU[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProATCU");
               GXutil.writeLogRaw("Old: ",Z14190AlbProATCU);
               GXutil.writeLogRaw("Current: ",T01O85_A14190AlbProATCU[0]);
            }
            if ( GXutil.strcmp(Z14191AlbProSerA, T01O85_A14191AlbProSerA[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProSerA");
               GXutil.writeLogRaw("Old: ",Z14191AlbProSerA);
               GXutil.writeLogRaw("Current: ",T01O85_A14191AlbProSerA[0]);
            }
            if ( GXutil.strcmp(Z14192AlbProTipA, T01O85_A14192AlbProTipA[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProTipA");
               GXutil.writeLogRaw("Old: ",Z14192AlbProTipA);
               GXutil.writeLogRaw("Current: ",T01O85_A14192AlbProTipA[0]);
            }
            if ( Z13425AlbProCliC != T01O85_A13425AlbProCliC[0] )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProCliC");
               GXutil.writeLogRaw("Old: ",Z13425AlbProCliC);
               GXutil.writeLogRaw("Current: ",T01O85_A13425AlbProCliC[0]);
            }
            if ( Z13419AlbProPrvI != T01O85_A13419AlbProPrvI[0] )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProPrvI");
               GXutil.writeLogRaw("Old: ",Z13419AlbProPrvI);
               GXutil.writeLogRaw("Current: ",T01O85_A13419AlbProPrvI[0]);
            }
            if ( Z840TrnCod != T01O85_A840TrnCod[0] )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01O85_A840TrnCod[0]);
            }
            if ( Z13453CatDocID != T01O85_A13453CatDocID[0] )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"CatDocID");
               GXutil.writeLogRaw("Old: ",Z13453CatDocID);
               GXutil.writeLogRaw("Current: ",T01O85_A13453CatDocID[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01O835 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A13425AlbProCliC)});
      if ( (pr_default.getStatus(33) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( GXutil.strcmp(Z13426AlbProCliN, T01O835_A13426AlbProCliN[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13426AlbProCliN, T01O835_A13426AlbProCliN[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProCliN");
               GXutil.writeLogRaw("Old: ",Z13426AlbProCliN);
               GXutil.writeLogRaw("Current: ",T01O835_A13426AlbProCliN[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01O836 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
      if ( (pr_default.getStatus(34) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRVGEN"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( GXutil.strcmp(Z13420AlbProPrvN, T01O836_A13420AlbProPrvN[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13420AlbProPrvN, T01O836_A13420AlbProPrvN[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProPrvN");
               GXutil.writeLogRaw("Old: ",Z13420AlbProPrvN);
               GXutil.writeLogRaw("Current: ",T01O836_A13420AlbProPrvN[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRVGEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1O81838( )
   {
      beforeValidate1O81838( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O81838( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1O81838( 0) ;
         checkOptimisticConcurrency1O81838( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O81838( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1O81838( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O837 */
                  pr_default.execute(35, new Object[] {Integer.valueOf(A13418AlbProID), A13429AlbProSal, Byte.valueOf(A13452AlbProInEx), A13417AlbProTipo, A13430AlbProDate, Byte.valueOf(A13427AlbProDomE), A13424AlbProMatr, A13439AlbProObs, Byte.valueOf(A13437AlbProSta), A13431AlbProSys, A13433AlbProHh, A13434AlbProHhCt, A13435AlbProEnvA, A13436AlbProIDAT, Byte.valueOf(A13438AlbProStAT), A13440AlbProAnul, Short.valueOf(A13441AlbProUltL), A13579AlbProLC1, A13580AlbProLC2, A13581AlbProLC3, A13582AlbProLD1, A13583AlbProLD2, A13584AlbProLD3, Boolean.valueOf(n14190AlbProATCU), A14190AlbProATCU, Boolean.valueOf(n14191AlbProSerA), A14191AlbProSerA, Boolean.valueOf(n14192AlbProTipA), A14192AlbProTipA, A396EmprCod, Integer.valueOf(A13425AlbProCliC), Integer.valueOf(A13419AlbProPrvI), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
                  if ( (pr_default.getStatus(35) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11O81838( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1O81838( ) ;
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
            load1O81838( ) ;
         }
         endLevel1O81838( ) ;
      }
      closeExtendedTableCursors1O81838( ) ;
   }

   public void update1O81838( )
   {
      beforeValidate1O81838( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O81838( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O81838( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O81838( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1O81838( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O838 */
                  pr_default.execute(36, new Object[] {A13429AlbProSal, Byte.valueOf(A13452AlbProInEx), A13417AlbProTipo, A13430AlbProDate, Byte.valueOf(A13427AlbProDomE), A13424AlbProMatr, A13439AlbProObs, Byte.valueOf(A13437AlbProSta), A13431AlbProSys, A13433AlbProHh, A13434AlbProHhCt, A13435AlbProEnvA, A13436AlbProIDAT, Byte.valueOf(A13438AlbProStAT), A13440AlbProAnul, Short.valueOf(A13441AlbProUltL), A13579AlbProLC1, A13580AlbProLC2, A13581AlbProLC3, A13582AlbProLD1, A13583AlbProLD2, A13584AlbProLD3, Boolean.valueOf(n14190AlbProATCU), A14190AlbProATCU, Boolean.valueOf(n14191AlbProSerA), A14191AlbProSerA, Boolean.valueOf(n14192AlbProTipA), A14192AlbProTipA, Integer.valueOf(A13425AlbProCliC), Integer.valueOf(A13419AlbProPrvI), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID), A396EmprCod, Integer.valueOf(A13418AlbProID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
                  if ( (pr_default.getStatus(36) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1O81838( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11O81838( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1O81838( ) ;
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
         }
         endLevel1O81838( ) ;
      }
      closeExtendedTableCursors1O81838( ) ;
   }

   public void deferredUpdate1O81838( )
   {
   }

   public void delete( )
   {
      beforeValidate1O81838( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O81838( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1O81838( ) ;
         afterConfirm1O81838( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1O81838( ) ;
            if ( AnyError == 0 )
            {
               A13441AlbProUltL = O13441AlbProUltL ;
               httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
               scanStart1O81839( ) ;
               while ( RcdFound1839 != 0 )
               {
                  getByPrimaryKey1O81839( ) ;
                  delete1O81839( ) ;
                  scanNext1O81839( ) ;
                  O13441AlbProUltL = A13441AlbProUltL ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
               }
               scanEnd1O81839( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O839 */
                  pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11O81838( ) ;
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
      }
      sMode1838 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1O81838( ) ;
      Gx_mode = sMode1838 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1O81838( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( ( GXutil.strcmp(A13436AlbProIDAT, " ") != 0 ) || ( A13438AlbProStAT == 3 ) ) && ( AV34FirmaD == 1 ) && ( isIns( )  || isUpd( )  || isDlt( )  ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( true /* After */ )
         {
            AV49contcod = ((A13452AlbProInEx==1) ? httpContext.getMessage( httpContext.getMessage( "REMTRA", ""), "") : httpContext.getMessage( httpContext.getMessage( "EXTTRA", ""), "")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49contcod", AV49contcod);
         }
         edtPrdNum_Visible = ((GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), ""))==0) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_132_Refreshing);
         edtAlbProPrvI_Visible = ((GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), ""))==0) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Visible), 5, 0), true);
         if ( ! ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) ) )
         {
            divAlbproprvid_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbproprvid_cell_Internalname, "Class", divAlbproprvid_cell_Class, true);
         }
         else
         {
            if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
            {
               divAlbproprvid_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divAlbproprvid_cell_Internalname, "Class", divAlbproprvid_cell_Class, true);
            }
         }
         edtAlbProCliC_Visible = ((GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), ""))==0) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliC_Visible), 5, 0), true);
         if ( ! ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 ) ) )
         {
            divAlbproclicod_cell_Class = httpContext.getMessage( "Invisible", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbproclicod_cell_Internalname, "Class", divAlbproclicod_cell_Class, true);
         }
         else
         {
            if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
            {
               divAlbproclicod_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
               httpContext.ajax_rsp_assign_prop("", false, divAlbproclicod_cell_Internalname, "Class", divAlbproclicod_cell_Class, true);
            }
         }
         /* Using cursor T01O840 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A13425AlbProCliC)});
         Z13426AlbProCliN = T01O840_A13426AlbProCliN[0] ;
         A13426AlbProCliN = T01O840_A13426AlbProCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13426AlbProCliN", A13426AlbProCliN);
         pr_default.close(38);
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
         {
            A13426AlbProCliN = " " ;
            httpContext.ajax_rsp_assign_attri("", false, "A13426AlbProCliN", A13426AlbProCliN);
         }
         /* Using cursor T01O841 */
         pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
         Z13420AlbProPrvN = T01O841_A13420AlbProPrvN[0] ;
         A13420AlbProPrvN = T01O841_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = T01O841_n13420AlbProPrvN[0] ;
         pr_default.close(39);
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
         {
            A13420AlbProPrvN = " " ;
            n13420AlbProPrvN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13420AlbProPrvN", A13420AlbProPrvN);
         }
         /* Using cursor T01O842 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01O842_A841TrnNom[0] ;
         n841TrnNom = T01O842_n841TrnNom[0] ;
         pr_default.close(40);
         /* Using cursor T01O843 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
         A13454CatDocNom = T01O843_A13454CatDocNom[0] ;
         n13454CatDocNom = T01O843_n13454CatDocNom[0] ;
         pr_default.close(41);
      }
   }

   public void processNestedLevel1O81839( )
   {
      s13441AlbProUltL = O13441AlbProUltL ;
      httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
      nGXsfl_132_idx = 0 ;
      while ( nGXsfl_132_idx < nRC_GXsfl_132 )
      {
         readRow1O81839( ) ;
         if ( ( nRcdExists_1839 != 0 ) || ( nIsMod_1839 != 0 ) )
         {
            standaloneNotModal1O81839( ) ;
            getKey1O81839( ) ;
            if ( ( nRcdExists_1839 == 0 ) && ( nRcdDeleted_1839 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1O81839( ) ;
            }
            else
            {
               if ( RcdFound1839 != 0 )
               {
                  if ( ( nRcdDeleted_1839 != 0 ) && ( nRcdExists_1839 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1O81839( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1839 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1O81839( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1839 == 0 )
                  {
                     GXCCtl = "ALBPROLINE_" + sGXsfl_132_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbProLine_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O13441AlbProUltL = A13441AlbProUltL ;
            httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
         }
         httpContext.changePostValue( edtAlbProLine_Internalname, GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtAlbProDsc_Internalname, GXutil.rtrim( A13448AlbProDsc)) ;
         httpContext.changePostValue( edtAlbProCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbProUnd.getInternalname(), GXutil.rtrim( A13444AlbProUnd)) ;
         httpContext.changePostValue( edtAlbProCaja_Internalname, GXutil.ltrim( localUtil.ntoc( A13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProObsL_Internalname, GXutil.rtrim( A13447AlbProObsL)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProNRef_Internalname, GXutil.rtrim( A13445AlbProNRef)) ;
         httpContext.changePostValue( edtAlbProVRef_Internalname, GXutil.rtrim( A13446AlbProVRef)) ;
         httpContext.changePostValue( edtAlbProPrvp_Internalname, GXutil.ltrim( localUtil.ntoc( A13852AlbProPrvp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProDto_Internalname, GXutil.ltrim( localUtil.ntoc( A13853AlbProDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13442AlbProLine_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13448AlbProDsc_"+sGXsfl_132_idx, GXutil.rtrim( Z13448AlbProDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z13449AlbProCaja_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13444AlbProUnd_"+sGXsfl_132_idx, GXutil.rtrim( Z13444AlbProUnd)) ;
         httpContext.changePostValue( "ZT_"+"Z13443AlbProCnt_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13447AlbProObsL_"+sGXsfl_132_idx, GXutil.rtrim( Z13447AlbProObsL)) ;
         httpContext.changePostValue( "ZT_"+"Z13445AlbProNRef_"+sGXsfl_132_idx, GXutil.rtrim( Z13445AlbProNRef)) ;
         httpContext.changePostValue( "ZT_"+"Z13446AlbProVRef_"+sGXsfl_132_idx, GXutil.rtrim( Z13446AlbProVRef)) ;
         httpContext.changePostValue( "ZT_"+"Z13852AlbProPrvp_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13852AlbProPrvp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13853AlbProDto_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13853AlbProDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_132_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "T719PrdNum_"+sGXsfl_132_idx, GXutil.rtrim( O719PrdNum)) ;
         httpContext.changePostValue( "T13448AlbProDsc_"+sGXsfl_132_idx, GXutil.rtrim( O13448AlbProDsc)) ;
         httpContext.changePostValue( "T13442AlbProLine_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( O13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T13443AlbProCnt_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( O13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1839_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1839_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1839_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1839 != 0 )
         {
            httpContext.changePostValue( "ALBPROLINE_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProLine_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_132_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRODSC_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROCNT_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROUND_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProUnd.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROCAJA_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCaja_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROOBSL_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProObsL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRONREF_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProNRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROVREF_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProVRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROPRVP_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProPrvp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPRODTO_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1O81839( ) ;
      if ( AnyError != 0 )
      {
         O13441AlbProUltL = s13441AlbProUltL ;
         httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
      }
      nRcdExists_1839 = (short)(0) ;
      nIsMod_1839 = (short)(0) ;
      nRcdDeleted_1839 = (short)(0) ;
   }

   public void processLevel1O81838( )
   {
      /* Save parent mode. */
      sMode1838 = Gx_mode ;
      processNestedLevel1O81839( ) ;
      if ( AnyError != 0 )
      {
         O13441AlbProUltL = s13441AlbProUltL ;
         httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1838 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01O844 */
      pr_default.execute(42, new Object[] {Short.valueOf(A13441AlbProUltL), A396EmprCod, Integer.valueOf(A13418AlbProID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
   }

   public void updateTablesN11O81838( )
   {
      /* Using cursor T01O845 */
      pr_default.execute(43, new Object[] {A13426AlbProCliN, A396EmprCod, Integer.valueOf(A13425AlbProCliC)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
      /* Using cursor T01O846 */
      pr_default.execute(44, new Object[] {Boolean.valueOf(n13420AlbProPrvN), A13420AlbProPrvN, A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVGEN");
   }

   public void endLevel1O81838( )
   {
      pr_default.close(3);
      pr_default.close(33);
      pr_default.close(34);
      if ( AnyError == 0 )
      {
         beforeComplete1O81838( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcalpro");
         if ( AnyError == 0 )
         {
            confirmValues1O80( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcalpro");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1O81838( )
   {
      /* Scan By routine */
      /* Using cursor T01O847 */
      pr_default.execute(45, new Object[] {A396EmprCod});
      RcdFound1838 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound1838 = (short)(1) ;
         A13418AlbProID = T01O847_A13418AlbProID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1O81838( )
   {
      /* Scan next routine */
      pr_default.readNext(45);
      RcdFound1838 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound1838 = (short)(1) ;
         A13418AlbProID = T01O847_A13418AlbProID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      }
   }

   public void scanEnd1O81838( )
   {
      pr_default.close(45);
   }

   public void afterConfirm1O81838( )
   {
      /* After Confirm Rules */
      if ( (0==A13418AlbProID) && true /* After */ )
      {
         GXv_int8[0] = A13418AlbProID ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV49contcod, GXv_int8) ;
         tcalpro_impl.this.A13418AlbProID = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      }
   }

   public void beforeInsert1O81838( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1O81838( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1O81838( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1O81838( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1O81838( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1O81838( )
   {
      edtAlbProID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProID_Enabled), 5, 0), true);
      cmbAlbProInEx.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProInEx.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProInEx.getEnabled(), 5, 0), true);
      cmbAlbProTipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProTipo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProTipo.getEnabled(), 5, 0), true);
      edtAlbProDate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDate_Enabled), 5, 0), true);
      edtAlbProSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSal_Enabled), 5, 0), true);
      edtCatDocID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCatDocID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDocID_Enabled), 5, 0), true);
      edtAlbProPrvI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Enabled), 5, 0), true);
      edtAlbProCliC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliC_Enabled), 5, 0), true);
      edtAlbProCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliN_Enabled), 5, 0), true);
      edtAlbProDomE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDomE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDomE_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtAlbProMatr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProMatr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProMatr_Enabled), 5, 0), true);
      edtAlbProObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProObs_Enabled), 5, 0), true);
      edtAlbProLC1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProLC1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLC1_Enabled), 5, 0), true);
      edtAlbProLC2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProLC2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLC2_Enabled), 5, 0), true);
      edtAlbProLC3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProLC3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLC3_Enabled), 5, 0), true);
      edtAlbProLD1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProLD1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLD1_Enabled), 5, 0), true);
      edtAlbProLD2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProLD2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLD2_Enabled), 5, 0), true);
      edtAlbProLD3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProLD3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLD3_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbProSta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSta_Enabled), 5, 0), true);
      edtAlbProSys_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProSys_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProSys_Enabled), 5, 0), true);
      edtAlbProHh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProHh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProHh_Enabled), 5, 0), true);
      edtAlbProHhCt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProHhCt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProHhCt_Enabled), 5, 0), true);
      edtAlbProEnvA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEnvA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEnvA_Enabled), 5, 0), true);
      edtAlbProIDAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProIDAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProIDAT_Enabled), 5, 0), true);
      edtAlbProStAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProStAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProStAT_Enabled), 5, 0), true);
      edtAlbProUltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProUltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProUltL_Enabled), 5, 0), true);
      edtAlbProAnul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProAnul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProAnul_Enabled), 5, 0), true);
   }

   public void zm1O81839( int GX_JID )
   {
      if ( ( GX_JID == 107 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13448AlbProDsc = T01O83_A13448AlbProDsc[0] ;
            Z13449AlbProCaja = T01O83_A13449AlbProCaja[0] ;
            Z13444AlbProUnd = T01O83_A13444AlbProUnd[0] ;
            Z13443AlbProCnt = T01O83_A13443AlbProCnt[0] ;
            Z13447AlbProObsL = T01O83_A13447AlbProObsL[0] ;
            Z13445AlbProNRef = T01O83_A13445AlbProNRef[0] ;
            Z13446AlbProVRef = T01O83_A13446AlbProVRef[0] ;
            Z13852AlbProPrvp = T01O83_A13852AlbProPrvp[0] ;
            Z13853AlbProDto = T01O83_A13853AlbProDto[0] ;
            Z719PrdNum = T01O83_A719PrdNum[0] ;
         }
         else
         {
            Z13448AlbProDsc = A13448AlbProDsc ;
            Z13449AlbProCaja = A13449AlbProCaja ;
            Z13444AlbProUnd = A13444AlbProUnd ;
            Z13443AlbProCnt = A13443AlbProCnt ;
            Z13447AlbProObsL = A13447AlbProObsL ;
            Z13445AlbProNRef = A13445AlbProNRef ;
            Z13446AlbProVRef = A13446AlbProVRef ;
            Z13852AlbProPrvp = A13852AlbProPrvp ;
            Z13853AlbProDto = A13853AlbProDto ;
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( GX_JID == -107 )
      {
         Z13418AlbProID = A13418AlbProID ;
         Z13442AlbProLine = A13442AlbProLine ;
         Z13448AlbProDsc = A13448AlbProDsc ;
         Z13449AlbProCaja = A13449AlbProCaja ;
         Z13444AlbProUnd = A13444AlbProUnd ;
         Z13443AlbProCnt = A13443AlbProCnt ;
         Z13447AlbProObsL = A13447AlbProObsL ;
         Z13445AlbProNRef = A13445AlbProNRef ;
         Z13446AlbProVRef = A13446AlbProVRef ;
         Z13852AlbProPrvp = A13852AlbProPrvp ;
         Z13853AlbProDto = A13853AlbProDto ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z704PrdExiAlm = A704PrdExiAlm ;
      }
   }

   public void standaloneNotModal1O81839( )
   {
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProNRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProNRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProNRef_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProVRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProVRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProVRef_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProPrvp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvp_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDto_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProUltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProUltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProUltL_Enabled), 5, 0), true);
      edtAlbProUltL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProUltL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProUltL_Enabled), 5, 0), true);
   }

   public void standaloneModal1O81839( )
   {
      if ( isIns( )  )
      {
         A13441AlbProUltL = (short)(O13441AlbProUltL+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
      }
      if ( isIns( )  && (0==A13449AlbProCaja) && ( Gx_BScreen == 0 ) )
      {
         A13449AlbProCaja = (short)(1) ;
         n13449AlbProCaja = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A13444AlbProUnd)==0) && ( Gx_BScreen == 0 ) )
      {
         A13444AlbProUnd = " " ;
         n13444AlbProUnd = false ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A13442AlbProLine = A13441AlbProUltL ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbProLine_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLine_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      }
      else
      {
         edtAlbProLine_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLine_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV54AlbProLineaOld = O13442AlbProLine ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54AlbProLineaOld", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54AlbProLineaOld), 4, 0));
      }
   }

   public void load1O81839( )
   {
      /* Using cursor T01O848 */
      pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
      if ( (pr_default.getStatus(46) != 101) )
      {
         RcdFound1839 = (short)(1) ;
         A13448AlbProDsc = T01O848_A13448AlbProDsc[0] ;
         n13448AlbProDsc = T01O848_n13448AlbProDsc[0] ;
         A13449AlbProCaja = T01O848_A13449AlbProCaja[0] ;
         n13449AlbProCaja = T01O848_n13449AlbProCaja[0] ;
         A13444AlbProUnd = T01O848_A13444AlbProUnd[0] ;
         n13444AlbProUnd = T01O848_n13444AlbProUnd[0] ;
         A13443AlbProCnt = T01O848_A13443AlbProCnt[0] ;
         n13443AlbProCnt = T01O848_n13443AlbProCnt[0] ;
         A13447AlbProObsL = T01O848_A13447AlbProObsL[0] ;
         n13447AlbProObsL = T01O848_n13447AlbProObsL[0] ;
         A718PrdNom = T01O848_A718PrdNom[0] ;
         A704PrdExiAlm = T01O848_A704PrdExiAlm[0] ;
         A13445AlbProNRef = T01O848_A13445AlbProNRef[0] ;
         n13445AlbProNRef = T01O848_n13445AlbProNRef[0] ;
         A13446AlbProVRef = T01O848_A13446AlbProVRef[0] ;
         n13446AlbProVRef = T01O848_n13446AlbProVRef[0] ;
         A13852AlbProPrvp = T01O848_A13852AlbProPrvp[0] ;
         n13852AlbProPrvp = T01O848_n13852AlbProPrvp[0] ;
         A13853AlbProDto = T01O848_A13853AlbProDto[0] ;
         n13853AlbProDto = T01O848_n13853AlbProDto[0] ;
         A719PrdNum = T01O848_A719PrdNum[0] ;
         zm1O81839( -107) ;
      }
      pr_default.close(46);
      onLoadActions1O81839( ) ;
   }

   public void onLoadActions1O81839( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A13448AlbProDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         A13448AlbProDsc = A718PrdNom ;
         n13448AlbProDsc = false ;
      }
      AV54AlbProLineaOld = O13442AlbProLine ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54AlbProLineaOld", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54AlbProLineaOld), 4, 0));
      AV56PrdnumOld = O719PrdNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56PrdnumOld", AV56PrdnumOld);
      AV55AlbProDscold = O13448AlbProDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55AlbProDscold", AV55AlbProDscold);
      AV51AlbProCntold = O13443AlbProCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51AlbProCntold", GXutil.ltrimstr( AV51AlbProCntold, 9, 2));
   }

   public void checkExtendedTable1O81839( )
   {
      nIsDirty_1839 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1O81839( ) ;
      /* Using cursor T01O84 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01O84_A718PrdNom[0] ;
      A704PrdExiAlm = T01O84_A704PrdExiAlm[0] ;
      pr_default.close(2);
      if ( isIns( )  && (GXutil.strcmp("", A13448AlbProDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1839 = (short)(1) ;
         A13448AlbProDsc = A718PrdNom ;
         n13448AlbProDsc = false ;
      }
      AV54AlbProLineaOld = O13442AlbProLine ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54AlbProLineaOld", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54AlbProLineaOld), 4, 0));
      AV56PrdnumOld = O719PrdNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56PrdnumOld", AV56PrdnumOld);
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int8[0] = A13419AlbProPrvI ;
         GXv_char2[0] = AV53msg_errprv ;
         new app.pprvprdproductoproveedor(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_char2) ;
         tcalpro_impl.this.A396EmprCod = GXv_char4[0] ;
         tcalpro_impl.this.A719PrdNum = GXv_char3[0] ;
         tcalpro_impl.this.A13419AlbProPrvI = GXv_int8[0] ;
         tcalpro_impl.this.AV53msg_errprv = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV53msg_errprv", AV53msg_errprv);
      }
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && ( GXutil.strcmp(AV53msg_errprv, " ") != 0 ) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(AV53msg_errprv, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A719PrdNum, AV56PrdnumOld) != 0 ) && ( GXutil.strcmp(AV56PrdnumOld, " ") != 0 ) && isUpd( )  )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se puede modificar el Producto", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV55AlbProDscold = O13448AlbProDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55AlbProDscold", AV55AlbProDscold);
      AV51AlbProCntold = O13443AlbProCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51AlbProCntold", GXutil.ltrimstr( AV51AlbProCntold, 9, 2));
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_decimal16[0] = A13443AlbProCnt ;
         GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char2[0] = AV57Msg_errcant ;
         new app.pexctrlproducto(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal16, GXv_decimal17, GXv_char2) ;
         tcalpro_impl.this.A396EmprCod = GXv_char4[0] ;
         tcalpro_impl.this.A719PrdNum = GXv_char3[0] ;
         tcalpro_impl.this.A13443AlbProCnt = GXv_decimal16[0] ;
         tcalpro_impl.this.AV57Msg_errcant = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV57Msg_errcant", AV57Msg_errcant);
      }
      if ( isUpd( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_decimal17[0] = A13443AlbProCnt ;
         GXv_decimal16[0] = AV51AlbProCntold ;
         GXv_char2[0] = AV57Msg_errcant ;
         new app.pexctrlproducto(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal17, GXv_decimal16, GXv_char2) ;
         tcalpro_impl.this.A396EmprCod = GXv_char4[0] ;
         tcalpro_impl.this.A719PrdNum = GXv_char3[0] ;
         tcalpro_impl.this.A13443AlbProCnt = GXv_decimal17[0] ;
         tcalpro_impl.this.AV51AlbProCntold = GXv_decimal16[0] ;
         tcalpro_impl.this.AV57Msg_errcant = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV51AlbProCntold", GXutil.ltrimstr( AV51AlbProCntold, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV57Msg_errcant", AV57Msg_errcant);
      }
      if ( true /* After */ && ! (GXutil.strcmp("", A719PrdNum)==0) && ( GXutil.strcmp(AV57Msg_errcant, " ") != 0 ) )
      {
         GXCCtl = "ALBPROCNT_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(AV57Msg_errcant, 0, GXCCtl);
      }
   }

   public void closeExtendedTableCursors1O81839( )
   {
      pr_default.close(2);
   }

   public void enableDisable1O81839( )
   {
   }

   public void gxload_108( String A396EmprCod ,
                           String A719PrdNum )
   {
      /* Using cursor T01O849 */
      pr_default.execute(47, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(47) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01O849_A718PrdNom[0] ;
      A704PrdExiAlm = T01O849_A704PrdExiAlm[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(47) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(47);
   }

   public void getKey1O81839( )
   {
      /* Using cursor T01O850 */
      pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound1839 = (short)(1) ;
      }
      else
      {
         RcdFound1839 = (short)(0) ;
      }
      pr_default.close(48);
   }

   public void getByPrimaryKey1O81839( )
   {
      /* Using cursor T01O83 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01O83_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1O81839( 107) ;
         RcdFound1839 = (short)(1) ;
         initializeNonKey1O81839( ) ;
         A13442AlbProLine = T01O83_A13442AlbProLine[0] ;
         A13448AlbProDsc = T01O83_A13448AlbProDsc[0] ;
         n13448AlbProDsc = T01O83_n13448AlbProDsc[0] ;
         A13449AlbProCaja = T01O83_A13449AlbProCaja[0] ;
         n13449AlbProCaja = T01O83_n13449AlbProCaja[0] ;
         A13444AlbProUnd = T01O83_A13444AlbProUnd[0] ;
         n13444AlbProUnd = T01O83_n13444AlbProUnd[0] ;
         A13443AlbProCnt = T01O83_A13443AlbProCnt[0] ;
         n13443AlbProCnt = T01O83_n13443AlbProCnt[0] ;
         A13447AlbProObsL = T01O83_A13447AlbProObsL[0] ;
         n13447AlbProObsL = T01O83_n13447AlbProObsL[0] ;
         A13445AlbProNRef = T01O83_A13445AlbProNRef[0] ;
         n13445AlbProNRef = T01O83_n13445AlbProNRef[0] ;
         A13446AlbProVRef = T01O83_A13446AlbProVRef[0] ;
         n13446AlbProVRef = T01O83_n13446AlbProVRef[0] ;
         A13852AlbProPrvp = T01O83_A13852AlbProPrvp[0] ;
         n13852AlbProPrvp = T01O83_n13852AlbProPrvp[0] ;
         A13853AlbProDto = T01O83_A13853AlbProDto[0] ;
         n13853AlbProDto = T01O83_n13853AlbProDto[0] ;
         A719PrdNum = T01O83_A719PrdNum[0] ;
         O719PrdNum = A719PrdNum ;
         O13448AlbProDsc = A13448AlbProDsc ;
         n13448AlbProDsc = false ;
         O13442AlbProLine = A13442AlbProLine ;
         O13443AlbProCnt = A13443AlbProCnt ;
         n13443AlbProCnt = false ;
         Z396EmprCod = A396EmprCod ;
         Z13418AlbProID = A13418AlbProID ;
         Z13442AlbProLine = A13442AlbProLine ;
         sMode1839 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1O81839( ) ;
         Gx_mode = sMode1839 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1839 = (short)(0) ;
         initializeNonKey1O81839( ) ;
         sMode1839 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1O81839( ) ;
         Gx_mode = sMode1839 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1O81839( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1O81839( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01O82 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13448AlbProDsc, T01O82_A13448AlbProDsc[0]) != 0 ) || ( Z13449AlbProCaja != T01O82_A13449AlbProCaja[0] ) || ( GXutil.strcmp(Z13444AlbProUnd, T01O82_A13444AlbProUnd[0]) != 0 ) || ( DecimalUtil.compareTo(Z13443AlbProCnt, T01O82_A13443AlbProCnt[0]) != 0 ) || ( GXutil.strcmp(Z13447AlbProObsL, T01O82_A13447AlbProObsL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13445AlbProNRef, T01O82_A13445AlbProNRef[0]) != 0 ) || ( GXutil.strcmp(Z13446AlbProVRef, T01O82_A13446AlbProVRef[0]) != 0 ) || ( DecimalUtil.compareTo(Z13852AlbProPrvp, T01O82_A13852AlbProPrvp[0]) != 0 ) || ( DecimalUtil.compareTo(Z13853AlbProDto, T01O82_A13853AlbProDto[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T01O82_A719PrdNum[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13448AlbProDsc, T01O82_A13448AlbProDsc[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProDsc");
               GXutil.writeLogRaw("Old: ",Z13448AlbProDsc);
               GXutil.writeLogRaw("Current: ",T01O82_A13448AlbProDsc[0]);
            }
            if ( Z13449AlbProCaja != T01O82_A13449AlbProCaja[0] )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProCaja");
               GXutil.writeLogRaw("Old: ",Z13449AlbProCaja);
               GXutil.writeLogRaw("Current: ",T01O82_A13449AlbProCaja[0]);
            }
            if ( GXutil.strcmp(Z13444AlbProUnd, T01O82_A13444AlbProUnd[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProUnd");
               GXutil.writeLogRaw("Old: ",Z13444AlbProUnd);
               GXutil.writeLogRaw("Current: ",T01O82_A13444AlbProUnd[0]);
            }
            if ( DecimalUtil.compareTo(Z13443AlbProCnt, T01O82_A13443AlbProCnt[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProCnt");
               GXutil.writeLogRaw("Old: ",Z13443AlbProCnt);
               GXutil.writeLogRaw("Current: ",T01O82_A13443AlbProCnt[0]);
            }
            if ( GXutil.strcmp(Z13447AlbProObsL, T01O82_A13447AlbProObsL[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProObsL");
               GXutil.writeLogRaw("Old: ",Z13447AlbProObsL);
               GXutil.writeLogRaw("Current: ",T01O82_A13447AlbProObsL[0]);
            }
            if ( GXutil.strcmp(Z13445AlbProNRef, T01O82_A13445AlbProNRef[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProNRef");
               GXutil.writeLogRaw("Old: ",Z13445AlbProNRef);
               GXutil.writeLogRaw("Current: ",T01O82_A13445AlbProNRef[0]);
            }
            if ( GXutil.strcmp(Z13446AlbProVRef, T01O82_A13446AlbProVRef[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProVRef");
               GXutil.writeLogRaw("Old: ",Z13446AlbProVRef);
               GXutil.writeLogRaw("Current: ",T01O82_A13446AlbProVRef[0]);
            }
            if ( DecimalUtil.compareTo(Z13852AlbProPrvp, T01O82_A13852AlbProPrvp[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProPrvp");
               GXutil.writeLogRaw("Old: ",Z13852AlbProPrvp);
               GXutil.writeLogRaw("Current: ",T01O82_A13852AlbProPrvp[0]);
            }
            if ( DecimalUtil.compareTo(Z13853AlbProDto, T01O82_A13853AlbProDto[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"AlbProDto");
               GXutil.writeLogRaw("Old: ",Z13853AlbProDto);
               GXutil.writeLogRaw("Current: ",T01O82_A13853AlbProDto[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01O82_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("tcalpro:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01O82_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLALPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1O81839( )
   {
      beforeValidate1O81839( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O81839( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1O81839( 0) ;
         checkOptimisticConcurrency1O81839( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O81839( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1O81839( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O851 */
                  pr_default.execute(49, new Object[] {Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine), Boolean.valueOf(n13448AlbProDsc), A13448AlbProDsc, Boolean.valueOf(n13449AlbProCaja), Short.valueOf(A13449AlbProCaja), Boolean.valueOf(n13444AlbProUnd), A13444AlbProUnd, Boolean.valueOf(n13443AlbProCnt), A13443AlbProCnt, Boolean.valueOf(n13447AlbProObsL), A13447AlbProObsL, Boolean.valueOf(n13445AlbProNRef), A13445AlbProNRef, Boolean.valueOf(n13446AlbProVRef), A13446AlbProVRef, Boolean.valueOf(n13852AlbProPrvp), A13852AlbProPrvp, Boolean.valueOf(n13853AlbProDto), A13853AlbProDto, A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRO");
                  if ( (pr_default.getStatus(49) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( true /* After */ ) && true /* Level */ )
                     {
                        AV47Inc_obs = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") + httpContext.getMessage( httpContext.getMessage( ",Linea ", ""), "") + GXutil.trim( GXutil.str( A13442AlbProLine, 4, 0)) + " " + GXutil.trim( A13448AlbProDsc) + httpContext.getMessage( httpContext.getMessage( " Cant ", ""), "") + GXutil.trim( GXutil.str( A13443AlbProCnt, 9, 2)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV47Inc_obs", AV47Inc_obs);
                     }
                     if ( ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && true /* After */ && ( AV50DevCant == 1 ) )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = httpContext.getMessage( "INS", "") ;
                        GXv_char2[0] = A719PrdNum ;
                        GXv_int8[0] = A13418AlbProID ;
                        GXv_date14[0] = A13430AlbProDate ;
                        GXv_char18[0] = A13417AlbProTipo ;
                        GXv_int19[0] = A13442AlbProLine ;
                        GXv_int20[0] = A13419AlbProPrvI ;
                        GXv_decimal17[0] = A13443AlbProCnt ;
                        GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
                        GXv_char21[0] = AV8UsurCod ;
                        GXv_char22[0] = "" ;
                        new app.pdevcalpro(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int8, GXv_date14, GXv_char18, GXv_int19, GXv_int20, GXv_decimal17, GXv_decimal16, GXv_char21, GXv_char22) ;
                        tcalpro_impl.this.A396EmprCod = GXv_char4[0] ;
                        tcalpro_impl.this.A719PrdNum = GXv_char2[0] ;
                        tcalpro_impl.this.A13418AlbProID = GXv_int8[0] ;
                        tcalpro_impl.this.A13430AlbProDate = GXv_date14[0] ;
                        tcalpro_impl.this.A13417AlbProTipo = GXv_char18[0] ;
                        tcalpro_impl.this.A13442AlbProLine = GXv_int19[0] ;
                        tcalpro_impl.this.A13419AlbProPrvI = GXv_int20[0] ;
                        tcalpro_impl.this.A13443AlbProCnt = GXv_decimal17[0] ;
                        tcalpro_impl.this.AV8UsurCod = GXv_char21[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
                        httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
                        httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
                     }
                     if ( ( true /* After */ || true /* After */ ) && true /* Level */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV77Pgmname, AV8UsurCod, AV12Station, AV47Inc_obs, A13418AlbProID, (byte)(0), " ") ;
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
            load1O81839( ) ;
         }
         endLevel1O81839( ) ;
      }
      closeExtendedTableCursors1O81839( ) ;
   }

   public void update1O81839( )
   {
      beforeValidate1O81839( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O81839( ) ;
      }
      if ( ( nIsMod_1839 != 0 ) || ( nIsDirty_1839 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1O81839( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1O81839( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1O81839( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01O852 */
                     pr_default.execute(50, new Object[] {Boolean.valueOf(n13448AlbProDsc), A13448AlbProDsc, Boolean.valueOf(n13449AlbProCaja), Short.valueOf(A13449AlbProCaja), Boolean.valueOf(n13444AlbProUnd), A13444AlbProUnd, Boolean.valueOf(n13443AlbProCnt), A13443AlbProCnt, Boolean.valueOf(n13447AlbProObsL), A13447AlbProObsL, Boolean.valueOf(n13445AlbProNRef), A13445AlbProNRef, Boolean.valueOf(n13446AlbProVRef), A13446AlbProVRef, Boolean.valueOf(n13852AlbProPrvp), A13852AlbProPrvp, Boolean.valueOf(n13853AlbProDto), A13853AlbProDto, A719PrdNum, A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRO");
                     if ( (pr_default.getStatus(50) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALPRO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1O81839( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( true /* After */ ) && true /* Level */ )
                        {
                           AV47Inc_obs = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") + httpContext.getMessage( httpContext.getMessage( ",Linea ", ""), "") + GXutil.trim( GXutil.str( A13442AlbProLine, 4, 0)) + " " + GXutil.trim( A13448AlbProDsc) + httpContext.getMessage( httpContext.getMessage( " Cant ", ""), "") + GXutil.trim( GXutil.str( AV51AlbProCntold, 9, 2)) + "/" + GXutil.trim( GXutil.str( A13443AlbProCnt, 9, 2)) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV47Inc_obs", AV47Inc_obs);
                        }
                        if ( ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && true /* After */ && ( AV50DevCant == 1 ) )
                        {
                           GXv_char22[0] = A396EmprCod ;
                           GXv_char21[0] = httpContext.getMessage( "UPD", "") ;
                           GXv_char18[0] = A719PrdNum ;
                           GXv_int20[0] = A13418AlbProID ;
                           GXv_date14[0] = A13430AlbProDate ;
                           GXv_char4[0] = A13417AlbProTipo ;
                           GXv_int19[0] = A13442AlbProLine ;
                           GXv_int8[0] = A13419AlbProPrvI ;
                           GXv_decimal17[0] = A13443AlbProCnt ;
                           GXv_decimal16[0] = AV51AlbProCntold ;
                           GXv_char3[0] = AV8UsurCod ;
                           GXv_char2[0] = "" ;
                           new app.pdevcalpro(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_char18, GXv_int20, GXv_date14, GXv_char4, GXv_int19, GXv_int8, GXv_decimal17, GXv_decimal16, GXv_char3, GXv_char2) ;
                           tcalpro_impl.this.A396EmprCod = GXv_char22[0] ;
                           tcalpro_impl.this.A719PrdNum = GXv_char18[0] ;
                           tcalpro_impl.this.A13418AlbProID = GXv_int20[0] ;
                           tcalpro_impl.this.A13430AlbProDate = GXv_date14[0] ;
                           tcalpro_impl.this.A13417AlbProTipo = GXv_char4[0] ;
                           tcalpro_impl.this.A13442AlbProLine = GXv_int19[0] ;
                           tcalpro_impl.this.A13419AlbProPrvI = GXv_int8[0] ;
                           tcalpro_impl.this.A13443AlbProCnt = GXv_decimal17[0] ;
                           tcalpro_impl.this.AV51AlbProCntold = GXv_decimal16[0] ;
                           tcalpro_impl.this.AV8UsurCod = GXv_char3[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
                           httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
                           httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV51AlbProCntold", GXutil.ltrimstr( AV51AlbProCntold, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
                        }
                        if ( ( true /* After */ || true /* After */ ) && true /* Level */ )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV77Pgmname, AV8UsurCod, AV12Station, AV47Inc_obs, A13418AlbProID, (byte)(0), " ") ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1O81839( ) ;
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
            endLevel1O81839( ) ;
         }
      }
      closeExtendedTableCursors1O81839( ) ;
   }

   public void deferredUpdate1O81839( )
   {
   }

   public void delete1O81839( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1O81839( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O81839( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1O81839( ) ;
         afterConfirm1O81839( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1O81839( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01O853 */
               pr_default.execute(51, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID), Short.valueOf(A13442AlbProLine)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ && true /* Level */ )
                  {
                     AV47Inc_obs = httpContext.getMessage( httpContext.getMessage( "DLT", ""), "") + httpContext.getMessage( httpContext.getMessage( ",Linea ", ""), "") + GXutil.trim( GXutil.str( AV54AlbProLineaOld, 4, 0)) + " " + GXutil.trim( AV55AlbProDscold) + " " + GXutil.trim( GXutil.str( AV51AlbProCntold, 9, 2)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV47Inc_obs", AV47Inc_obs);
                  }
                  if ( ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && true /* After */ && ( AV50DevCant == 1 ) )
                  {
                     GXv_char22[0] = A396EmprCod ;
                     GXv_char21[0] = httpContext.getMessage( "DLT", "") ;
                     GXv_char18[0] = A719PrdNum ;
                     GXv_int20[0] = A13418AlbProID ;
                     GXv_date14[0] = A13430AlbProDate ;
                     GXv_char4[0] = A13417AlbProTipo ;
                     GXv_int19[0] = A13442AlbProLine ;
                     GXv_int8[0] = A13419AlbProPrvI ;
                     GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_char3[0] = AV8UsurCod ;
                     GXv_char2[0] = "" ;
                     new app.pdevcalpro(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_char18, GXv_int20, GXv_date14, GXv_char4, GXv_int19, GXv_int8, GXv_decimal17, GXv_decimal16, GXv_char3, GXv_char2) ;
                     tcalpro_impl.this.A396EmprCod = GXv_char22[0] ;
                     tcalpro_impl.this.A719PrdNum = GXv_char18[0] ;
                     tcalpro_impl.this.A13418AlbProID = GXv_int20[0] ;
                     tcalpro_impl.this.A13430AlbProDate = GXv_date14[0] ;
                     tcalpro_impl.this.A13417AlbProTipo = GXv_char4[0] ;
                     tcalpro_impl.this.A13442AlbProLine = GXv_int19[0] ;
                     tcalpro_impl.this.A13419AlbProPrvI = GXv_int8[0] ;
                     tcalpro_impl.this.AV8UsurCod = GXv_char3[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
                     httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
                     httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
                  }
                  if ( true /* After */ && true /* Level */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV77Pgmname, AV8UsurCod, AV12Station, AV47Inc_obs, A13418AlbProID, (byte)(0), " ") ;
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
      sMode1839 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1O81839( ) ;
      Gx_mode = sMode1839 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1O81839( )
   {
      standaloneModal1O81839( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
         {
            GXv_char22[0] = A396EmprCod ;
            GXv_char21[0] = A719PrdNum ;
            GXv_decimal17[0] = A13443AlbProCnt ;
            GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
            GXv_char18[0] = AV57Msg_errcant ;
            new app.pexctrlproducto(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_decimal17, GXv_decimal16, GXv_char18) ;
            tcalpro_impl.this.A396EmprCod = GXv_char22[0] ;
            tcalpro_impl.this.A719PrdNum = GXv_char21[0] ;
            tcalpro_impl.this.A13443AlbProCnt = GXv_decimal17[0] ;
            tcalpro_impl.this.AV57Msg_errcant = GXv_char18[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV57Msg_errcant", AV57Msg_errcant);
         }
         if ( isUpd( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
         {
            GXv_char22[0] = A396EmprCod ;
            GXv_char21[0] = A719PrdNum ;
            GXv_decimal17[0] = A13443AlbProCnt ;
            GXv_decimal16[0] = AV51AlbProCntold ;
            GXv_char18[0] = AV57Msg_errcant ;
            new app.pexctrlproducto(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_decimal17, GXv_decimal16, GXv_char18) ;
            tcalpro_impl.this.A396EmprCod = GXv_char22[0] ;
            tcalpro_impl.this.A719PrdNum = GXv_char21[0] ;
            tcalpro_impl.this.A13443AlbProCnt = GXv_decimal17[0] ;
            tcalpro_impl.this.AV51AlbProCntold = GXv_decimal16[0] ;
            tcalpro_impl.this.AV57Msg_errcant = GXv_char18[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV51AlbProCntold", GXutil.ltrimstr( AV51AlbProCntold, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV57Msg_errcant", AV57Msg_errcant);
         }
         AV54AlbProLineaOld = O13442AlbProLine ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54AlbProLineaOld", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54AlbProLineaOld), 4, 0));
         /* Using cursor T01O854 */
         pr_default.execute(52, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01O854_A718PrdNom[0] ;
         A704PrdExiAlm = T01O854_A704PrdExiAlm[0] ;
         pr_default.close(52);
         AV56PrdnumOld = O719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56PrdnumOld", AV56PrdnumOld);
         AV55AlbProDscold = O13448AlbProDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55AlbProDscold", AV55AlbProDscold);
         AV51AlbProCntold = O13443AlbProCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51AlbProCntold", GXutil.ltrimstr( AV51AlbProCntold, 9, 2));
      }
   }

   public void endLevel1O81839( )
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

   public void scanStart1O81839( )
   {
      /* Scan By routine */
      /* Using cursor T01O855 */
      pr_default.execute(53, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      RcdFound1839 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound1839 = (short)(1) ;
         A13442AlbProLine = T01O855_A13442AlbProLine[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1O81839( )
   {
      /* Scan next routine */
      pr_default.readNext(53);
      RcdFound1839 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound1839 = (short)(1) ;
         A13442AlbProLine = T01O855_A13442AlbProLine[0] ;
      }
   }

   public void scanEnd1O81839( )
   {
      pr_default.close(53);
   }

   public void afterConfirm1O81839( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1O81839( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1O81839( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1O81839( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1O81839( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1O81839( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1O81839( )
   {
      edtAlbProLine_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLine_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDsc_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCnt_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      cmbAlbProUnd.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProUnd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProUnd.getEnabled(), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProCaja_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCaja_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCaja_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProObsL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProObsL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProObsL_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProNRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProNRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProNRef_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProVRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProVRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProVRef_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProPrvp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvp_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDto_Enabled), 5, 0), !bGXsfl_132_Refreshing);
   }

   public void send_integrity_lvl_hashes1O81839( )
   {
   }

   public void send_integrity_lvl_hashes1O81838( )
   {
   }

   public void subsflControlProps_1321839( )
   {
      edtAlbProLine_Internalname = "ALBPROLINE_"+sGXsfl_132_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_132_idx ;
      edtAlbProDsc_Internalname = "ALBPRODSC_"+sGXsfl_132_idx ;
      edtAlbProCnt_Internalname = "ALBPROCNT_"+sGXsfl_132_idx ;
      cmbAlbProUnd.setInternalname( "ALBPROUND_"+sGXsfl_132_idx );
      edtAlbProCaja_Internalname = "ALBPROCAJA_"+sGXsfl_132_idx ;
      edtAlbProObsL_Internalname = "ALBPROOBSL_"+sGXsfl_132_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_132_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_132_idx ;
      edtAlbProNRef_Internalname = "ALBPRONREF_"+sGXsfl_132_idx ;
      edtAlbProVRef_Internalname = "ALBPROVREF_"+sGXsfl_132_idx ;
      edtAlbProPrvp_Internalname = "ALBPROPRVP_"+sGXsfl_132_idx ;
      edtAlbProDto_Internalname = "ALBPRODTO_"+sGXsfl_132_idx ;
   }

   public void subsflControlProps_fel_1321839( )
   {
      edtAlbProLine_Internalname = "ALBPROLINE_"+sGXsfl_132_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_132_fel_idx ;
      edtAlbProDsc_Internalname = "ALBPRODSC_"+sGXsfl_132_fel_idx ;
      edtAlbProCnt_Internalname = "ALBPROCNT_"+sGXsfl_132_fel_idx ;
      cmbAlbProUnd.setInternalname( "ALBPROUND_"+sGXsfl_132_fel_idx );
      edtAlbProCaja_Internalname = "ALBPROCAJA_"+sGXsfl_132_fel_idx ;
      edtAlbProObsL_Internalname = "ALBPROOBSL_"+sGXsfl_132_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_132_fel_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_132_fel_idx ;
      edtAlbProNRef_Internalname = "ALBPRONREF_"+sGXsfl_132_fel_idx ;
      edtAlbProVRef_Internalname = "ALBPROVREF_"+sGXsfl_132_fel_idx ;
      edtAlbProPrvp_Internalname = "ALBPROPRVP_"+sGXsfl_132_fel_idx ;
      edtAlbProDto_Internalname = "ALBPRODTO_"+sGXsfl_132_fel_idx ;
   }

   public void addRow1O81839( )
   {
      nGXsfl_132_idx = (int)(nGXsfl_132_idx+1) ;
      sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1321839( ) ;
      sendRow1O81839( ) ;
   }

   public void sendRow1O81839( )
   {
      Gridlevel_lalproRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_lalpro_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_lalpro_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_lalpro_Class, "") != 0 )
         {
            subGridlevel_lalpro_Linesclass = subGridlevel_lalpro_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_lalpro_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_lalpro_Backstyle = (byte)(0) ;
         subGridlevel_lalpro_Backcolor = subGridlevel_lalpro_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_lalpro_Class, "") != 0 )
         {
            subGridlevel_lalpro_Linesclass = subGridlevel_lalpro_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_lalpro_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_lalpro_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_lalpro_Class, "") != 0 )
         {
            subGridlevel_lalpro_Linesclass = subGridlevel_lalpro_Class+"Odd" ;
         }
         subGridlevel_lalpro_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_lalpro_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_lalpro_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_132_idx) % (2))) == 0 )
         {
            subGridlevel_lalpro_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_lalpro_Class, "") != 0 )
            {
               subGridlevel_lalpro_Linesclass = subGridlevel_lalpro_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_lalpro_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_lalpro_Class, "") != 0 )
            {
               subGridlevel_lalpro_Linesclass = subGridlevel_lalpro_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_132_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_lalproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProLine_Internalname,GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13442AlbProLine), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,133);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProLine_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbProLine_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_132_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 134,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lalproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_132_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lalproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProDsc_Internalname,GXutil.rtrim( A13448AlbProDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,135);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_132_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_lalproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbProCnt_Enabled!=0) ? localUtil.format( A13443AlbProCnt, "ZZZZZ9.99") : localUtil.format( A13443AlbProCnt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,136);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCnt_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbProCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_132_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 137,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      GXCCtl = "ALBPROUND_" + sGXsfl_132_idx ;
      cmbAlbProUnd.setName( GXCCtl );
      cmbAlbProUnd.setWebtags( "" );
      cmbAlbProUnd.addItem("kg", httpContext.getMessage( "kilos", ""), (short)(0));
      cmbAlbProUnd.addItem("lt", httpContext.getMessage( "litros", ""), (short)(0));
      cmbAlbProUnd.addItem("mt", httpContext.getMessage( "metros", ""), (short)(0));
      cmbAlbProUnd.addItem("und", httpContext.getMessage( "unidades", ""), (short)(0));
      cmbAlbProUnd.addItem("", httpContext.getMessage( "n/a", ""), (short)(0));
      if ( cmbAlbProUnd.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A13444AlbProUnd)==0) )
         {
            A13444AlbProUnd = " " ;
            n13444AlbProUnd = false ;
         }
      }
      /* ComboBox */
      Gridlevel_lalproRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProUnd,cmbAlbProUnd.getInternalname(),GXutil.rtrim( A13444AlbProUnd),Integer.valueOf(1),cmbAlbProUnd.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbAlbProUnd.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,137);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbProUnd.setValue( GXutil.rtrim( A13444AlbProUnd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProUnd.getInternalname(), "Values", cmbAlbProUnd.ToJavascriptSource(), !bGXsfl_132_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_132_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 138,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_lalproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCaja_Internalname,GXutil.ltrim( localUtil.ntoc( A13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbProCaja_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13449AlbProCaja), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13449AlbProCaja), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,138);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCaja_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbProCaja_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1839_" + sGXsfl_132_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 139,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lalproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProObsL_Internalname,GXutil.rtrim( A13447AlbProObsL),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProObsL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbProObsL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lalproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lalproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdExiAlm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lalproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProNRef_Internalname,GXutil.rtrim( A13445AlbProNRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProNRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbProNRef_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lalproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProVRef_Internalname,GXutil.rtrim( A13446AlbProVRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProVRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbProVRef_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lalproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProPrvp_Internalname,GXutil.ltrim( localUtil.ntoc( A13852AlbProPrvp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbProPrvp_Enabled!=0) ? localUtil.format( A13852AlbProPrvp, "ZZZZZZ9.99999") : localUtil.format( A13852AlbProPrvp, "ZZZZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProPrvp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbProPrvp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lalproRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProDto_Internalname,GXutil.ltrim( localUtil.ntoc( A13853AlbProDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbProDto_Enabled!=0) ? localUtil.format( A13853AlbProDto, "ZZ9.99") : localUtil.format( A13853AlbProDto, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProDto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbProDto_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_lalproRow);
      send_integrity_lvl_hashes1O81839( ) ;
      GXCCtl = "Z13442AlbProLine_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13448AlbProDsc_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13448AlbProDsc));
      GXCCtl = "Z13449AlbProCaja_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13444AlbProUnd_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13444AlbProUnd));
      GXCCtl = "Z13443AlbProCnt_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13447AlbProObsL_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13447AlbProObsL));
      GXCCtl = "Z13445AlbProNRef_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13445AlbProNRef));
      GXCCtl = "Z13446AlbProVRef_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13446AlbProVRef));
      GXCCtl = "Z13852AlbProPrvp_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13852AlbProPrvp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13853AlbProDto_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13853AlbProDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "O719PrdNum_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O719PrdNum));
      GXCCtl = "O13448AlbProDsc_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O13448AlbProDsc));
      GXCCtl = "O13442AlbProLine_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O13443AlbProCnt_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1839_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1839_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1839_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1839, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_132_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV63TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV63TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vALBPROID_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROLINE_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProLine_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_132_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRODSC_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCNT_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROUND_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProUnd.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCAJA_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCaja_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROOBSL_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProObsL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRONREF_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProNRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROVREF_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProVRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROPRVP_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProPrvp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPRODTO_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_lalproContainer.AddRow(Gridlevel_lalproRow);
   }

   public void readRow1O81839( )
   {
      nGXsfl_132_idx = (int)(nGXsfl_132_idx+1) ;
      sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1321839( ) ;
      edtAlbProLine_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROLINE_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_132_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRODSC_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROCNT_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbProUnd.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROUND_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtAlbProCaja_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROCAJA_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProObsL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROOBSL_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProNRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRONREF_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProVRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROVREF_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProPrvp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROPRVP_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPRODTO_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBPROLINE_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProLine_Internalname ;
         wbErr = true ;
         A13442AlbProLine = (short)(0) ;
      }
      else
      {
         A13442AlbProLine = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbProLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      A13448AlbProDsc = httpContext.cgiGet( edtAlbProDsc_Internalname) ;
      n13448AlbProDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbProCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbProCnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPROCNT_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCnt_Internalname ;
         wbErr = true ;
         A13443AlbProCnt = DecimalUtil.ZERO ;
         n13443AlbProCnt = false ;
      }
      else
      {
         A13443AlbProCnt = localUtil.ctond( httpContext.cgiGet( edtAlbProCnt_Internalname)) ;
         n13443AlbProCnt = false ;
      }
      cmbAlbProUnd.setName( cmbAlbProUnd.getInternalname() );
      cmbAlbProUnd.setValue( httpContext.cgiGet( cmbAlbProUnd.getInternalname()) );
      A13444AlbProUnd = httpContext.cgiGet( cmbAlbProUnd.getInternalname()) ;
      n13444AlbProUnd = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCaja_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCaja_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBPROCAJA_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCaja_Internalname ;
         wbErr = true ;
         A13449AlbProCaja = (short)(0) ;
         n13449AlbProCaja = false ;
      }
      else
      {
         A13449AlbProCaja = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbProCaja_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13449AlbProCaja = false ;
      }
      A13447AlbProObsL = httpContext.cgiGet( edtAlbProObsL_Internalname) ;
      n13447AlbProObsL = false ;
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
      A13445AlbProNRef = httpContext.cgiGet( edtAlbProNRef_Internalname) ;
      n13445AlbProNRef = false ;
      A13446AlbProVRef = httpContext.cgiGet( edtAlbProVRef_Internalname) ;
      n13446AlbProVRef = false ;
      A13852AlbProPrvp = localUtil.ctond( httpContext.cgiGet( edtAlbProPrvp_Internalname)) ;
      n13852AlbProPrvp = false ;
      A13853AlbProDto = localUtil.ctond( httpContext.cgiGet( edtAlbProDto_Internalname)) ;
      n13853AlbProDto = false ;
      GXCCtl = "Z13442AlbProLine_" + sGXsfl_132_idx ;
      Z13442AlbProLine = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13448AlbProDsc_" + sGXsfl_132_idx ;
      Z13448AlbProDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13449AlbProCaja_" + sGXsfl_132_idx ;
      Z13449AlbProCaja = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13444AlbProUnd_" + sGXsfl_132_idx ;
      Z13444AlbProUnd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13443AlbProCnt_" + sGXsfl_132_idx ;
      Z13443AlbProCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13447AlbProObsL_" + sGXsfl_132_idx ;
      Z13447AlbProObsL = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13445AlbProNRef_" + sGXsfl_132_idx ;
      Z13445AlbProNRef = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13446AlbProVRef_" + sGXsfl_132_idx ;
      Z13446AlbProVRef = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13852AlbProPrvp_" + sGXsfl_132_idx ;
      Z13852AlbProPrvp = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13853AlbProDto_" + sGXsfl_132_idx ;
      Z13853AlbProDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_132_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O719PrdNum_" + sGXsfl_132_idx ;
      O719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O13448AlbProDsc_" + sGXsfl_132_idx ;
      O13448AlbProDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O13442AlbProLine_" + sGXsfl_132_idx ;
      O13442AlbProLine = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O13443AlbProCnt_" + sGXsfl_132_idx ;
      O13443AlbProCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1839_" + sGXsfl_132_idx ;
      nRcdDeleted_1839 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1839_" + sGXsfl_132_idx ;
      nRcdExists_1839 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1839_" + sGXsfl_132_idx ;
      nIsMod_1839 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbProDto_Enabled = edtAlbProDto_Enabled ;
      defedtAlbProPrvp_Enabled = edtAlbProPrvp_Enabled ;
      defedtAlbProVRef_Enabled = edtAlbProVRef_Enabled ;
      defedtAlbProNRef_Enabled = edtAlbProNRef_Enabled ;
      defedtPrdExiAlm_Enabled = edtPrdExiAlm_Enabled ;
      defedtPrdNom_Enabled = edtPrdNom_Enabled ;
      defedtAlbProLine_Enabled = edtAlbProLine_Enabled ;
   }

   public void confirmValues1O80( )
   {
      nGXsfl_132_idx = 0 ;
      sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1321839( ) ;
      while ( nGXsfl_132_idx < nRC_GXsfl_132 )
      {
         nGXsfl_132_idx = (int)(nGXsfl_132_idx+1) ;
         sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1321839( ) ;
         httpContext.changePostValue( "Z13442AlbProLine_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13442AlbProLine_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13442AlbProLine_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13448AlbProDsc_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13448AlbProDsc_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13448AlbProDsc_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13449AlbProCaja_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13449AlbProCaja_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13449AlbProCaja_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13444AlbProUnd_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13444AlbProUnd_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13444AlbProUnd_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13443AlbProCnt_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13443AlbProCnt_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13443AlbProCnt_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13447AlbProObsL_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13447AlbProObsL_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13447AlbProObsL_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13445AlbProNRef_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13445AlbProNRef_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13445AlbProNRef_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13446AlbProVRef_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13446AlbProVRef_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13446AlbProVRef_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13852AlbProPrvp_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13852AlbProPrvp_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13852AlbProPrvp_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13853AlbProDto_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13853AlbProDto_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13853AlbProDto_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_132_idx) ;
      }
      httpContext.changePostValue( "O719PrdNum", httpContext.cgiGet( "T719PrdNum")) ;
      httpContext.deletePostValue( "T719PrdNum") ;
      httpContext.changePostValue( "O13448AlbProDsc", httpContext.cgiGet( "T13448AlbProDsc")) ;
      httpContext.deletePostValue( "T13448AlbProDsc") ;
      httpContext.changePostValue( "O13442AlbProLine", httpContext.cgiGet( "T13442AlbProLine")) ;
      httpContext.deletePostValue( "T13442AlbProLine") ;
      httpContext.changePostValue( "O13443AlbProCnt", httpContext.cgiGet( "T13443AlbProCnt")) ;
      httpContext.deletePostValue( "T13443AlbProCnt") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tcalpro", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33AlbProID,8,0))}, new String[] {"Gx_mode","EmprCod","AlbProID"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCALPRO");
      forbiddenHiddens.add("AlbProEnvA", GXutil.rtrim( localUtil.format( A13435AlbProEnvA, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("AlbProSys", localUtil.format( A13431AlbProSys, "99/99/99 99:99"));
      forbiddenHiddens.add("AlbProHh", GXutil.rtrim( localUtil.format( A13433AlbProHh, "")));
      forbiddenHiddens.add("AlbProIDAT", GXutil.rtrim( localUtil.format( A13436AlbProIDAT, "")));
      forbiddenHiddens.add("AlbProStAT", localUtil.format( DecimalUtil.doubleToDec(A13438AlbProStAT), "9"));
      forbiddenHiddens.add("AlbProATCU", GXutil.rtrim( localUtil.format( A14190AlbProATCU, "")));
      forbiddenHiddens.add("AlbProSerA", GXutil.rtrim( localUtil.format( A14191AlbProSerA, "")));
      forbiddenHiddens.add("AlbProTipA", GXutil.rtrim( localUtil.format( A14192AlbProTipA, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tcalpro:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13418AlbProID", GXutil.ltrim( localUtil.ntoc( Z13418AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13429AlbProSal", localUtil.ttoc( Z13429AlbProSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13452AlbProInEx", GXutil.ltrim( localUtil.ntoc( Z13452AlbProInEx, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13417AlbProTipo", GXutil.rtrim( Z13417AlbProTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13430AlbProDate", localUtil.dtoc( Z13430AlbProDate, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13427AlbProDomE", GXutil.ltrim( localUtil.ntoc( Z13427AlbProDomE, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13424AlbProMatr", GXutil.rtrim( Z13424AlbProMatr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13439AlbProObs", Z13439AlbProObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13437AlbProSta", GXutil.ltrim( localUtil.ntoc( Z13437AlbProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13431AlbProSys", localUtil.ttoc( Z13431AlbProSys, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13433AlbProHh", Z13433AlbProHh);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13434AlbProHhCt", Z13434AlbProHhCt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13435AlbProEnvA", GXutil.rtrim( Z13435AlbProEnvA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13436AlbProIDAT", GXutil.rtrim( Z13436AlbProIDAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13438AlbProStAT", GXutil.ltrim( localUtil.ntoc( Z13438AlbProStAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13440AlbProAnul", GXutil.rtrim( Z13440AlbProAnul));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13441AlbProUltL", GXutil.ltrim( localUtil.ntoc( Z13441AlbProUltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13579AlbProLC1", GXutil.rtrim( Z13579AlbProLC1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13580AlbProLC2", GXutil.rtrim( Z13580AlbProLC2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13581AlbProLC3", GXutil.rtrim( Z13581AlbProLC3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13582AlbProLD1", GXutil.rtrim( Z13582AlbProLD1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13583AlbProLD2", GXutil.rtrim( Z13583AlbProLD2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13584AlbProLD3", GXutil.rtrim( Z13584AlbProLD3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14190AlbProATCU", GXutil.rtrim( Z14190AlbProATCU));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14191AlbProSerA", GXutil.rtrim( Z14191AlbProSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14192AlbProTipA", GXutil.rtrim( Z14192AlbProTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13425AlbProCliC", GXutil.ltrim( localUtil.ntoc( Z13425AlbProCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13419AlbProPrvI", GXutil.ltrim( localUtil.ntoc( Z13419AlbProPrvI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13453CatDocID", GXutil.ltrim( localUtil.ntoc( Z13453CatDocID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13426AlbProCliN", GXutil.rtrim( Z13426AlbProCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13420AlbProPrvN", GXutil.rtrim( Z13420AlbProPrvN));
      app.GxWebStd.gx_hidden_field( httpContext, "O13441AlbProUltL", GXutil.ltrim( localUtil.ntoc( O13441AlbProUltL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_132", GXutil.ltrim( localUtil.ntoc( nGXsfl_132_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N13453CatDocID", GXutil.ltrim( localUtil.ntoc( A13453CatDocID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N13419AlbProPrvI", GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N13425AlbProCliC", GXutil.ltrim( localUtil.ntoc( A13425AlbProCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV63TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV63TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV63TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROID", GXutil.ltrim( localUtil.ntoc( AV33AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33AlbProID), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CATDOCID", GXutil.ltrim( localUtil.ntoc( AV65Insert_CatDocID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCCATDOCID", GXutil.ltrim( localUtil.ntoc( A13453CatDocID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALBPROPRVID", GXutil.ltrim( localUtil.ntoc( AV66Insert_AlbProPrvID, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCALBPROPRVI", GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALBPROCLICOD", GXutil.ltrim( localUtil.ntoc( AV67Insert_AlbProCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV68Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROPRVN", GXutil.rtrim( A13420AlbProPrvN));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV49contcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_F", GXutil.rtrim( AV40Msg_f));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBLAST", GXutil.ltrim( localUtil.ntoc( AV41AlbLast, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFCH", localUtil.dtoc( AV42Fch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCLI", GXutil.ltrim( localUtil.ntoc( AV44FlagCli, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGINEX", GXutil.rtrim( AV60msgInEx));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGPROV", GXutil.ltrim( localUtil.ntoc( AV45FlagProv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGDOM", GXutil.ltrim( localUtil.ntoc( AV46FlagDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV34FirmaD, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERRAT", GXutil.rtrim( AV37Msg_errAT));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROATCU", GXutil.rtrim( A14190AlbProATCU));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROSERA", GXutil.rtrim( A14191AlbProSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROTIPA", GXutil.rtrim( A14192AlbProTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CATDOCNOM", GXutil.rtrim( A13454CatDocNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV77Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCNTOLD", GXutil.ltrim( localUtil.ntoc( AV51AlbProCntold, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROLINEAOLD", GXutil.ltrim( localUtil.ntoc( AV54AlbProLineaOld, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPRODSCOLD", GXutil.rtrim( AV55AlbProDscold));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUMOLD", GXutil.rtrim( AV56PrdnumOld));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV47Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCANT", GXutil.ltrim( localUtil.ntoc( AV50DevCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERRPRV", GXutil.rtrim( AV53msg_errprv));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERRCANT", GXutil.rtrim( AV57Msg_errcant));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
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
      return formatLink("app.tcalpro", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33AlbProID,8,0))}, new String[] {"Gx_mode","EmprCod","AlbProID"})  ;
   }

   public String getPgmname( )
   {
      return "TCALPRO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Documento Transporte Proveedor", "") ;
   }

   public void initializeNonKey1O81838( )
   {
      h13453CatDocID = "" ;
      h13419AlbProPrvI = "" ;
      A13425AlbProCliC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
      h840TrnCod = "" ;
      A13420AlbProPrvN = "" ;
      n13420AlbProPrvN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13420AlbProPrvN", A13420AlbProPrvN);
      A13426AlbProCliN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13426AlbProCliN", A13426AlbProCliN);
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV49contcod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49contcod", AV49contcod);
      AV40Msg_f = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_f", AV40Msg_f);
      AV41AlbLast = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41AlbLast), 8, 0));
      AV42Fch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Fch", localUtil.format(AV42Fch, "99/99/99"));
      AV44FlagCli = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44FlagCli", GXutil.str( AV44FlagCli, 1, 0));
      AV60msgInEx = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60msgInEx", AV60msgInEx);
      AV45FlagProv = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45FlagProv", GXutil.str( AV45FlagProv, 1, 0));
      AV46FlagDom = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46FlagDom", GXutil.str( AV46FlagDom, 1, 0));
      A13417AlbProTipo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
      A13454CatDocNom = "" ;
      n13454CatDocNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13454CatDocNom", A13454CatDocNom);
      A13427AlbProDomE = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.str( A13427AlbProDomE, 1, 0));
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A13424AlbProMatr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13424AlbProMatr", A13424AlbProMatr);
      A13439AlbProObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13439AlbProObs", A13439AlbProObs);
      A13433AlbProHh = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13433AlbProHh", A13433AlbProHh);
      A13434AlbProHhCt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13434AlbProHhCt", A13434AlbProHhCt);
      A13440AlbProAnul = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13440AlbProAnul", A13440AlbProAnul);
      A13441AlbProUltL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
      A13579AlbProLC1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13579AlbProLC1", A13579AlbProLC1);
      A13580AlbProLC2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13580AlbProLC2", A13580AlbProLC2);
      A13581AlbProLC3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13581AlbProLC3", A13581AlbProLC3);
      A13582AlbProLD1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13582AlbProLD1", A13582AlbProLD1);
      A13583AlbProLD2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13583AlbProLD2", A13583AlbProLD2);
      A13584AlbProLD3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13584AlbProLD3", A13584AlbProLD3);
      A14190AlbProATCU = "" ;
      n14190AlbProATCU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14190AlbProATCU", A14190AlbProATCU);
      A14191AlbProSerA = "" ;
      n14191AlbProSerA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14191AlbProSerA", A14191AlbProSerA);
      A14192AlbProTipA = "" ;
      n14192AlbProTipA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14192AlbProTipA", A14192AlbProTipA);
      A13452AlbProInEx = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13452AlbProInEx", GXutil.str( A13452AlbProInEx, 1, 0));
      A13430AlbProDate = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
      A13437AlbProSta = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13437AlbProSta", GXutil.str( A13437AlbProSta, 1, 0));
      A13431AlbProSys = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13431AlbProSys", localUtil.ttoc( A13431AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A13435AlbProEnvA = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
      A13436AlbProIDAT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A13436AlbProIDAT", A13436AlbProIDAT);
      A13438AlbProStAT = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
      O13441AlbProUltL = A13441AlbProUltL ;
      httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
      Z13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      Z13452AlbProInEx = (byte)(0) ;
      Z13417AlbProTipo = "" ;
      Z13430AlbProDate = GXutil.nullDate() ;
      Z13427AlbProDomE = (byte)(0) ;
      Z13424AlbProMatr = "" ;
      Z13439AlbProObs = "" ;
      Z13437AlbProSta = (byte)(0) ;
      Z13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      Z13433AlbProHh = "" ;
      Z13434AlbProHhCt = "" ;
      Z13435AlbProEnvA = "" ;
      Z13436AlbProIDAT = "" ;
      Z13438AlbProStAT = (byte)(0) ;
      Z13440AlbProAnul = "" ;
      Z13441AlbProUltL = (short)(0) ;
      Z13579AlbProLC1 = "" ;
      Z13580AlbProLC2 = "" ;
      Z13581AlbProLC3 = "" ;
      Z13582AlbProLD1 = "" ;
      Z13583AlbProLD2 = "" ;
      Z13584AlbProLD3 = "" ;
      Z14190AlbProATCU = "" ;
      Z14191AlbProSerA = "" ;
      Z14192AlbProTipA = "" ;
      Z13425AlbProCliC = 0 ;
      Z13419AlbProPrvI = 0 ;
      Z840TrnCod = (short)(0) ;
      Z13453CatDocID = (short)(0) ;
      Z13426AlbProCliN = "" ;
      Z13420AlbProPrvN = "" ;
   }

   public void initAll1O81838( )
   {
      A13418AlbProID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      initializeNonKey1O81838( ) ;
   }

   public void standaloneModalInsert( )
   {
      A13430AlbProDate = i13430AlbProDate ;
      httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
      A13431AlbProSys = i13431AlbProSys ;
      httpContext.ajax_rsp_assign_attri("", false, "A13431AlbProSys", localUtil.ttoc( A13431AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A13438AlbProStAT = i13438AlbProStAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A13438AlbProStAT", GXutil.str( A13438AlbProStAT, 1, 0));
      A13437AlbProSta = i13437AlbProSta ;
      httpContext.ajax_rsp_assign_attri("", false, "A13437AlbProSta", GXutil.str( A13437AlbProSta, 1, 0));
      A13436AlbProIDAT = i13436AlbProIDAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A13436AlbProIDAT", A13436AlbProIDAT);
      A13435AlbProEnvA = i13435AlbProEnvA ;
      httpContext.ajax_rsp_assign_attri("", false, "A13435AlbProEnvA", A13435AlbProEnvA);
      A13452AlbProInEx = i13452AlbProInEx ;
      httpContext.ajax_rsp_assign_attri("", false, "A13452AlbProInEx", GXutil.str( A13452AlbProInEx, 1, 0));
   }

   public void initializeNonKey1O81839( )
   {
      AV51AlbProCntold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51AlbProCntold", GXutil.ltrimstr( AV51AlbProCntold, 9, 2));
      AV54AlbProLineaOld = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54AlbProLineaOld", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54AlbProLineaOld), 4, 0));
      AV55AlbProDscold = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55AlbProDscold", AV55AlbProDscold);
      AV56PrdnumOld = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56PrdnumOld", AV56PrdnumOld);
      AV53msg_errprv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53msg_errprv", AV53msg_errprv);
      AV57Msg_errcant = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Msg_errcant", AV57Msg_errcant);
      AV47Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Inc_obs", AV47Inc_obs);
      A719PrdNum = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      n13443AlbProCnt = false ;
      A13447AlbProObsL = "" ;
      n13447AlbProObsL = false ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A13445AlbProNRef = "" ;
      n13445AlbProNRef = false ;
      A13446AlbProVRef = "" ;
      n13446AlbProVRef = false ;
      A13852AlbProPrvp = DecimalUtil.ZERO ;
      n13852AlbProPrvp = false ;
      A13853AlbProDto = DecimalUtil.ZERO ;
      n13853AlbProDto = false ;
      A13448AlbProDsc = "" ;
      n13448AlbProDsc = false ;
      A13449AlbProCaja = (short)(1) ;
      n13449AlbProCaja = false ;
      A13444AlbProUnd = " " ;
      n13444AlbProUnd = false ;
      O719PrdNum = A719PrdNum ;
      O13448AlbProDsc = A13448AlbProDsc ;
      n13448AlbProDsc = false ;
      O13443AlbProCnt = A13443AlbProCnt ;
      n13443AlbProCnt = false ;
      Z13448AlbProDsc = "" ;
      Z13449AlbProCaja = (short)(0) ;
      Z13444AlbProUnd = "" ;
      Z13443AlbProCnt = DecimalUtil.ZERO ;
      Z13447AlbProObsL = "" ;
      Z13445AlbProNRef = "" ;
      Z13446AlbProVRef = "" ;
      Z13852AlbProPrvp = DecimalUtil.ZERO ;
      Z13853AlbProDto = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
   }

   public void initAll1O81839( )
   {
      A13442AlbProLine = (short)(0) ;
      initializeNonKey1O81839( ) ;
   }

   public void standaloneModalInsert1O81839( )
   {
      A13441AlbProUltL = i13441AlbProUltL ;
      httpContext.ajax_rsp_assign_attri("", false, "A13441AlbProUltL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13441AlbProUltL), 4, 0));
      A13449AlbProCaja = i13449AlbProCaja ;
      n13449AlbProCaja = false ;
      A13444AlbProUnd = i13444AlbProUnd ;
      n13444AlbProUnd = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211672193", true, true);
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
      httpContext.AddJavascriptSource("tcalpro.js", "?20268211672194", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1839( )
   {
      edtAlbProDto_Enabled = defedtAlbProDto_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProDto_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProPrvp_Enabled = defedtAlbProPrvp_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvp_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProVRef_Enabled = defedtAlbProVRef_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProVRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProVRef_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProNRef_Enabled = defedtAlbProNRef_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProNRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProNRef_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtPrdExiAlm_Enabled = defedtPrdExiAlm_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtPrdNom_Enabled = defedtPrdNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtAlbProLine_Enabled = defedtAlbProLine_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProLine_Enabled), 5, 0), !bGXsfl_132_Refreshing);
   }

   public void startgridcontrol132( )
   {
      Gridlevel_lalproContainer.AddObjectProperty("GridName", "Gridlevel_lalpro");
      Gridlevel_lalproContainer.AddObjectProperty("Header", subGridlevel_lalpro_Header);
      Gridlevel_lalproContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_lalproContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_lalpro_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_lalproContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_lalproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lalproColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lalproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProLine_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddColumnProperties(Gridlevel_lalproColumn);
      Gridlevel_lalproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lalproColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridlevel_lalproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddColumnProperties(Gridlevel_lalproColumn);
      Gridlevel_lalproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lalproColumn.AddObjectProperty("Value", GXutil.rtrim( A13448AlbProDsc));
      Gridlevel_lalproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddColumnProperties(Gridlevel_lalproColumn);
      Gridlevel_lalproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lalproColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_lalproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddColumnProperties(Gridlevel_lalproColumn);
      Gridlevel_lalproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lalproColumn.AddObjectProperty("Value", GXutil.rtrim( A13444AlbProUnd));
      Gridlevel_lalproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProUnd.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddColumnProperties(Gridlevel_lalproColumn);
      Gridlevel_lalproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lalproColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13449AlbProCaja, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lalproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProCaja_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddColumnProperties(Gridlevel_lalproColumn);
      Gridlevel_lalproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lalproColumn.AddObjectProperty("Value", GXutil.rtrim( A13447AlbProObsL));
      Gridlevel_lalproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProObsL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddColumnProperties(Gridlevel_lalproColumn);
      Gridlevel_lalproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lalproColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Gridlevel_lalproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddColumnProperties(Gridlevel_lalproColumn);
      Gridlevel_lalproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lalproColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      Gridlevel_lalproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddColumnProperties(Gridlevel_lalproColumn);
      Gridlevel_lalproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lalproColumn.AddObjectProperty("Value", GXutil.rtrim( A13445AlbProNRef));
      Gridlevel_lalproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProNRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddColumnProperties(Gridlevel_lalproColumn);
      Gridlevel_lalproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lalproColumn.AddObjectProperty("Value", GXutil.rtrim( A13446AlbProVRef));
      Gridlevel_lalproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProVRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddColumnProperties(Gridlevel_lalproColumn);
      Gridlevel_lalproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lalproColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13852AlbProPrvp, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_lalproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProPrvp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddColumnProperties(Gridlevel_lalproColumn);
      Gridlevel_lalproColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lalproColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13853AlbProDto, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_lalproColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddColumnProperties(Gridlevel_lalproColumn);
      Gridlevel_lalproContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_lalpro_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_lalpro_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_lalpro_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_lalpro_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_lalpro_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_lalpro_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lalproContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_lalpro_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtAlbProID_Internalname = "ALBPROID" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      cmbAlbProInEx.setInternalname( "ALBPROINEX" );
      divAlbproinex_cell_Internalname = "ALBPROINEX_CELL" ;
      cmbAlbProTipo.setInternalname( "ALBPROTIPO" );
      edtAlbProDate_Internalname = "ALBPRODATE" ;
      edtAlbProSal_Internalname = "ALBPROSAL" ;
      edtCatDocID_Internalname = "CATDOCID" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtAlbProPrvI_Internalname = "ALBPROPRVI" ;
      divAlbproprvid_cell_Internalname = "ALBPROPRVID_CELL" ;
      edtAlbProCliC_Internalname = "ALBPROCLIC" ;
      divAlbproclicod_cell_Internalname = "ALBPROCLICOD_CELL" ;
      edtAlbProCliN_Internalname = "ALBPROCLIN" ;
      edtAlbProDomE_Internalname = "ALBPRODOME" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtAlbProMatr_Internalname = "ALBPROMATR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtAlbProObs_Internalname = "ALBPROOBS" ;
      edtAlbProLC1_Internalname = "ALBPROLC1" ;
      edtAlbProLC2_Internalname = "ALBPROLC2" ;
      edtAlbProLC3_Internalname = "ALBPROLC3" ;
      tblUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      grpUnnamedgroup7_Internalname = "UNNAMEDGROUP7" ;
      edtAlbProLD1_Internalname = "ALBPROLD1" ;
      edtAlbProLD2_Internalname = "ALBPROLD2" ;
      edtAlbProLD3_Internalname = "ALBPROLD3" ;
      tblUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      grpUnnamedgroup9_Internalname = "UNNAMEDGROUP9" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtAlbProLine_Internalname = "ALBPROLINE" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtAlbProDsc_Internalname = "ALBPRODSC" ;
      edtAlbProCnt_Internalname = "ALBPROCNT" ;
      cmbAlbProUnd.setInternalname( "ALBPROUND" );
      edtAlbProCaja_Internalname = "ALBPROCAJA" ;
      edtAlbProObsL_Internalname = "ALBPROOBSL" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtAlbProNRef_Internalname = "ALBPRONREF" ;
      edtAlbProVRef_Internalname = "ALBPROVREF" ;
      edtAlbProPrvp_Internalname = "ALBPROPRVP" ;
      edtAlbProDto_Internalname = "ALBPRODTO" ;
      divTableleaflevel_lalpro_Internalname = "TABLELEAFLEVEL_LALPRO" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtAlbProSta_Internalname = "ALBPROSTA" ;
      edtAlbProSys_Internalname = "ALBPROSYS" ;
      edtAlbProHh_Internalname = "ALBPROHH" ;
      edtAlbProHhCt_Internalname = "ALBPROHHCT" ;
      edtAlbProEnvA_Internalname = "ALBPROENVA" ;
      edtAlbProIDAT_Internalname = "ALBPROIDAT" ;
      edtAlbProStAT_Internalname = "ALBPROSTAT" ;
      edtAlbProUltL_Internalname = "ALBPROULTL" ;
      edtAlbProAnul_Internalname = "ALBPROANUL" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_13425_Internalname = "PROMPT_13425" ;
      imgprompt_13425_13427_Internalname = "PROMPT_13425_13427" ;
      subGridlevel_lalpro_Internalname = "GRIDLEVEL_LALPRO" ;
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
      subGridlevel_lalpro_Allowcollapsing = (byte)(0) ;
      subGridlevel_lalpro_Allowselection = (byte)(0) ;
      subGridlevel_lalpro_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Documento Transporte Proveedor", "") );
      edtAlbProDto_Jsonclick = "" ;
      edtAlbProPrvp_Jsonclick = "" ;
      edtAlbProVRef_Jsonclick = "" ;
      edtAlbProNRef_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtAlbProObsL_Jsonclick = "" ;
      edtAlbProCaja_Jsonclick = "" ;
      cmbAlbProUnd.setJsonclick( "" );
      edtAlbProCnt_Jsonclick = "" ;
      edtAlbProDsc_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtAlbProLine_Jsonclick = "" ;
      subGridlevel_lalpro_Class = "GridNoBorder WorkWith" ;
      subGridlevel_lalpro_Backcolorstyle = (byte)(0) ;
      edtAlbProDto_Enabled = 0 ;
      edtAlbProPrvp_Enabled = 0 ;
      edtAlbProVRef_Enabled = 0 ;
      edtAlbProNRef_Enabled = 0 ;
      edtPrdExiAlm_Enabled = 0 ;
      edtPrdNom_Enabled = 0 ;
      edtAlbProObsL_Enabled = 1 ;
      edtAlbProCaja_Enabled = 1 ;
      cmbAlbProUnd.setEnabled( 1 );
      edtAlbProCnt_Enabled = 1 ;
      edtAlbProDsc_Enabled = 1 ;
      edtPrdNum_Visible = -1 ;
      edtPrdNum_Enabled = 1 ;
      edtAlbProLine_Enabled = 1 ;
      edtAlbProAnul_Jsonclick = "" ;
      edtAlbProAnul_Enabled = 1 ;
      edtAlbProAnul_Visible = 1 ;
      edtAlbProUltL_Jsonclick = "" ;
      edtAlbProUltL_Enabled = 0 ;
      edtAlbProUltL_Visible = 1 ;
      edtAlbProStAT_Jsonclick = "" ;
      edtAlbProStAT_Enabled = 0 ;
      edtAlbProStAT_Visible = 1 ;
      edtAlbProIDAT_Jsonclick = "" ;
      edtAlbProIDAT_Enabled = 0 ;
      edtAlbProIDAT_Visible = 1 ;
      edtAlbProEnvA_Jsonclick = "" ;
      edtAlbProEnvA_Enabled = 0 ;
      edtAlbProEnvA_Visible = 1 ;
      edtAlbProHhCt_Enabled = 1 ;
      edtAlbProHhCt_Visible = 1 ;
      edtAlbProHh_Enabled = 0 ;
      edtAlbProHh_Visible = 1 ;
      edtAlbProSys_Jsonclick = "" ;
      edtAlbProSys_Enabled = 0 ;
      edtAlbProSys_Visible = 1 ;
      edtAlbProSta_Jsonclick = "" ;
      edtAlbProSta_Enabled = 1 ;
      edtAlbProSta_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbProLD3_Jsonclick = "" ;
      edtAlbProLD3_Enabled = 1 ;
      edtAlbProLD2_Jsonclick = "" ;
      edtAlbProLD2_Enabled = 1 ;
      edtAlbProLD1_Jsonclick = "" ;
      edtAlbProLD1_Enabled = 1 ;
      grpUnnamedgroup9_Class = "Group" ;
      edtAlbProLC3_Jsonclick = "" ;
      edtAlbProLC3_Enabled = 1 ;
      edtAlbProLC2_Jsonclick = "" ;
      edtAlbProLC2_Enabled = 1 ;
      edtAlbProLC1_Jsonclick = "" ;
      edtAlbProLC1_Enabled = 1 ;
      grpUnnamedgroup7_Class = "Group" ;
      edtAlbProObs_Enabled = 1 ;
      edtAlbProMatr_Jsonclick = "" ;
      edtAlbProMatr_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      imgprompt_13425_13427_Visible = 1 ;
      imgprompt_13425_13427_Link = "" ;
      edtAlbProDomE_Jsonclick = "" ;
      edtAlbProDomE_Enabled = 1 ;
      edtAlbProCliN_Jsonclick = "" ;
      edtAlbProCliN_Enabled = 0 ;
      imgprompt_13425_Visible = 1 ;
      imgprompt_13425_Link = "" ;
      edtAlbProCliC_Jsonclick = "" ;
      edtAlbProCliC_Enabled = 1 ;
      edtAlbProCliC_Visible = 1 ;
      divAlbproclicod_cell_Class = "col-xs-12 col-sm-3" ;
      edtAlbProPrvI_Jsonclick = "" ;
      edtAlbProPrvI_Enabled = 1 ;
      edtAlbProPrvI_Visible = 1 ;
      divAlbproprvid_cell_Class = "col-xs-12 col-sm-3" ;
      edtCatDocID_Jsonclick = "" ;
      edtCatDocID_Enabled = 1 ;
      edtAlbProSal_Jsonclick = "" ;
      edtAlbProSal_Enabled = 1 ;
      edtAlbProDate_Jsonclick = "" ;
      edtAlbProDate_Enabled = 1 ;
      cmbAlbProTipo.setJsonclick( "" );
      cmbAlbProTipo.setEnabled( 1 );
      cmbAlbProInEx.setJsonclick( "" );
      cmbAlbProInEx.setEnabled( 1 );
      cmbAlbProInEx.setVisible( 1 );
      divAlbproinex_cell_Class = "col-xs-12 col-sm-3" ;
      edtAlbProID_Jsonclick = "" ;
      edtAlbProID_Enabled = 0 ;
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

   public void gxsgacatdocid1O80( String A396EmprCod ,
                                  String A13854CatDocNomI )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgacatdocid_data1O80( A396EmprCod, A13854CatDocNomI) ;
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

   protected void gxsgacatdocid_data1O80( String A396EmprCod ,
                                          String A13854CatDocNomI )
   {
      l13854CatDocNomI = GXutil.concat( GXutil.rtrim( A13854CatDocNomI), "%", "") ;
      /* Using cursor T01O856 */
      pr_default.execute(54, new Object[] {A396EmprCod, l13854CatDocNomI});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(54) != 101) )
      {
         gxdynajaxctrlcodr.add(T01O856_A13854CatDocNomI[0]);
         gxdynajaxctrldescr.add(T01O856_A13854CatDocNomI[0]);
         pr_default.readNext(54);
      }
      pr_default.close(54);
   }

   public void gxsgaalbproprvi1O80( String A396EmprCod ,
                                    String A13719PrvNNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaalbproprvi_data1O80( A396EmprCod, A13719PrvNNom) ;
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

   protected void gxsgaalbproprvi_data1O80( String A396EmprCod ,
                                            String A13719PrvNNom )
   {
      l13719PrvNNom = GXutil.concat( GXutil.rtrim( A13719PrvNNom), "%", "") ;
      /* Using cursor T01O857 */
      pr_default.execute(55, new Object[] {A396EmprCod, l13719PrvNNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(55) != 101) )
      {
         gxdynajaxctrlcodr.add(T01O857_A13719PrvNNom[0]);
         gxdynajaxctrldescr.add(T01O857_A13719PrvNNom[0]);
         pr_default.readNext(55);
      }
      pr_default.close(55);
   }

   public void gxsgatrncod1O80( String A396EmprCod ,
                                String A13738TrnCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatrncod_data1O80( A396EmprCod, A13738TrnCNom) ;
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

   protected void gxsgatrncod_data1O80( String A396EmprCod ,
                                        String A13738TrnCNom )
   {
      l13738TrnCNom = GXutil.concat( GXutil.rtrim( A13738TrnCNom), "%", "") ;
      /* Using cursor T01O858 */
      pr_default.execute(56, new Object[] {A396EmprCod, l13738TrnCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(56) != 101) )
      {
         gxdynajaxctrlcodr.add(T01O858_A13738TrnCNom[0]);
         gxdynajaxctrldescr.add(T01O858_A13738TrnCNom[0]);
         pr_default.readNext(56);
      }
      pr_default.close(56);
   }

   public void gxhcacatdocid1O81838( String A396EmprCod ,
                                     String A13854CatDocNomI )
   {
      /* Using cursor T01O859 */
      pr_default.execute(57, new Object[] {A13854CatDocNomI, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(57) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13854CatDocNomI = T01O859_A13854CatDocNomI[0] ;
         A396EmprCod = T01O859_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13453CatDocID = T01O859_A13453CatDocID[0] ;
         n13453CatDocID = T01O859_n13453CatDocID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13453CatDocID), 4, 0));
         pr_default.readNext(57);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13453CatDocID, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(57);
   }

   public void gxhcaalbproprvi1O81838( String A396EmprCod ,
                                       String A13719PrvNNom )
   {
      /* Using cursor T01O860 */
      pr_default.execute(58, new Object[] {A13719PrvNNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(58) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13719PrvNNom = T01O860_A13719PrvNNom[0] ;
         A396EmprCod = T01O860_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = T01O860_A795PrvNum[0] ;
         pr_default.readNext(58);
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
      pr_default.close(58);
   }

   public void gxhcatrncod1O81838( String A396EmprCod ,
                                   String A13738TrnCNom )
   {
      /* Using cursor T01O861 */
      pr_default.execute(59, new Object[] {A13738TrnCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(59) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13738TrnCNom = T01O861_A13738TrnCNom[0] ;
         A396EmprCod = T01O861_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = T01O861_A840TrnCod[0] ;
         n840TrnCod = T01O861_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         pr_default.readNext(59);
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
      pr_default.close(59);
   }

   public void gxasa134521O81838( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int15[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENDTEX", ""), ""), GXv_int15) ;
      tcalpro_impl.this.GXt_int5 = GXv_int15[0] ;
      cmbAlbProInEx.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProInEx.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbProInEx.getVisible(), 5, 0), true);
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

   public void gx33asaalbprosal1O81838( java.util.Date A13430AlbProDate ,
                                        String Gx_mode ,
                                        String A396EmprCod )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A13429AlbProSal) && true /* After */ )
      {
         GXt_dtime13 = A13429AlbProSal ;
         GXv_dtime10[0] = GXt_dtime13 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime10) ;
         tcalpro_impl.this.GXt_dtime13 = GXv_dtime10[0] ;
         A13429AlbProSal = GXt_dtime13 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_58_1O81838( String A396EmprCod ,
                              String AV49contcod ,
                              int A13418AlbProID )
   {
      if ( (0==A13418AlbProID) && true /* After */ )
      {
         GXv_int20[0] = A13418AlbProID ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV49contcod, GXv_int20) ;
         A13418AlbProID = GXv_int20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_59_1O81838( String A396EmprCod ,
                              java.util.Date AV42Fch ,
                              int AV41AlbLast ,
                              java.util.Date A13430AlbProDate ,
                              String AV40Msg_f ,
                              byte AV43Ctrlf )
   {
      if ( true /* Level */ && true /* After */ && ( AV43Ctrlf == 1 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_char21[0] = "" ;
         GXv_int15[0] = (byte)(3) ;
         GXv_date14[0] = AV42Fch ;
         GXv_int20[0] = AV41AlbLast ;
         GXv_date9[0] = A13430AlbProDate ;
         GXv_char18[0] = AV40Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_int15, GXv_date14, GXv_int20, GXv_date9, GXv_char18) ;
         A396EmprCod = GXv_char22[0] ;
         AV42Fch = GXv_date14[0] ;
         AV41AlbLast = GXv_int20[0] ;
         A13430AlbProDate = GXv_date9[0] ;
         AV40Msg_f = GXv_char18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV42Fch", localUtil.format(AV42Fch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV41AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41AlbLast), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_f", AV40Msg_f);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV42Fch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV41AlbLast, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A13430AlbProDate, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV40Msg_f))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_60_1O81838( String A396EmprCod ,
                              int A13425AlbProCliC ,
                              byte AV44FlagCli ,
                              String A13417AlbProTipo )
   {
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) && true /* After */ && ( A13425AlbProCliC > 0 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_int20[0] = A13425AlbProCliC ;
         GXv_int15[0] = AV44FlagCli ;
         new app.pexicli(remoteHandle, context).execute( GXv_char22, GXv_int20, GXv_int15) ;
         A396EmprCod = GXv_char22[0] ;
         A13425AlbProCliC = GXv_int20[0] ;
         AV44FlagCli = GXv_int15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV44FlagCli", GXutil.str( AV44FlagCli, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13425AlbProCliC, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV44FlagCli, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_61_1O81838( String A396EmprCod ,
                              int A13419AlbProPrvI ,
                              byte A13452AlbProInEx ,
                              byte AV45FlagProv ,
                              String AV60msgInEx ,
                              String A13417AlbProTipo )
   {
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) && true /* After */ )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_int20[0] = A13419AlbProPrvI ;
         GXv_int15[0] = A13452AlbProInEx ;
         GXv_int6[0] = AV45FlagProv ;
         GXv_char21[0] = AV60msgInEx ;
         new app.pexiproveedor(remoteHandle, context).execute( GXv_char22, GXv_int20, GXv_int15, GXv_int6, GXv_char21) ;
         A396EmprCod = GXv_char22[0] ;
         A13419AlbProPrvI = GXv_int20[0] ;
         A13452AlbProInEx = GXv_int15[0] ;
         AV45FlagProv = GXv_int6[0] ;
         AV60msgInEx = GXv_char21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13452AlbProInEx", GXutil.str( A13452AlbProInEx, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV45FlagProv", GXutil.str( AV45FlagProv, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV60msgInEx", AV60msgInEx);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13452AlbProInEx, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV45FlagProv, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV60msgInEx))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_62_1O81838( String A396EmprCod ,
                              int A13425AlbProCliC ,
                              byte A13427AlbProDomE ,
                              byte AV46FlagDom ,
                              String A13417AlbProTipo )
   {
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) && true /* After */ && ( A13427AlbProDomE > 0 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_int20[0] = A13425AlbProCliC ;
         GXv_int15[0] = A13427AlbProDomE ;
         GXv_int6[0] = AV46FlagDom ;
         new app.pexidomenvio(remoteHandle, context).execute( GXv_char22, GXv_int20, GXv_int15, GXv_int6) ;
         A396EmprCod = GXv_char22[0] ;
         A13425AlbProCliC = GXv_int20[0] ;
         A13427AlbProDomE = GXv_int15[0] ;
         AV46FlagDom = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13425AlbProCliC), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.str( A13427AlbProDomE, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV46FlagDom", GXutil.str( AV46FlagDom, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13425AlbProCliC, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13427AlbProDomE, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV46FlagDom, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_90_1O81839( )
   {
      if ( ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && true /* After */ && ( AV50DevCant == 1 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_char21[0] = httpContext.getMessage( "INS", "") ;
         GXv_char18[0] = A719PrdNum ;
         GXv_int20[0] = A13418AlbProID ;
         GXv_date14[0] = A13430AlbProDate ;
         GXv_char4[0] = A13417AlbProTipo ;
         GXv_int19[0] = A13442AlbProLine ;
         GXv_int8[0] = A13419AlbProPrvI ;
         GXv_decimal17[0] = A13443AlbProCnt ;
         GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char3[0] = AV8UsurCod ;
         GXv_char2[0] = "" ;
         new app.pdevcalpro(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_char18, GXv_int20, GXv_date14, GXv_char4, GXv_int19, GXv_int8, GXv_decimal17, GXv_decimal16, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char22[0] ;
         A719PrdNum = GXv_char18[0] ;
         A13418AlbProID = GXv_int20[0] ;
         A13430AlbProDate = GXv_date14[0] ;
         A13417AlbProTipo = GXv_char4[0] ;
         A13442AlbProLine = GXv_int19[0] ;
         A13419AlbProPrvI = GXv_int8[0] ;
         A13443AlbProCnt = GXv_decimal17[0] ;
         AV8UsurCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
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

   public void xc_91_1O81839( )
   {
      if ( ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && true /* After */ && ( AV50DevCant == 1 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_char21[0] = httpContext.getMessage( "DLT", "") ;
         GXv_char18[0] = A719PrdNum ;
         GXv_int20[0] = A13418AlbProID ;
         GXv_date14[0] = A13430AlbProDate ;
         GXv_char4[0] = A13417AlbProTipo ;
         GXv_int19[0] = A13442AlbProLine ;
         GXv_int8[0] = A13419AlbProPrvI ;
         GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char3[0] = AV8UsurCod ;
         GXv_char2[0] = "" ;
         new app.pdevcalpro(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_char18, GXv_int20, GXv_date14, GXv_char4, GXv_int19, GXv_int8, GXv_decimal17, GXv_decimal16, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char22[0] ;
         A719PrdNum = GXv_char18[0] ;
         A13418AlbProID = GXv_int20[0] ;
         A13430AlbProDate = GXv_date14[0] ;
         A13417AlbProTipo = GXv_char4[0] ;
         A13442AlbProLine = GXv_int19[0] ;
         A13419AlbProPrvI = GXv_int8[0] ;
         AV8UsurCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
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

   public void xc_92_1O81839( )
   {
      if ( ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && true /* After */ && ( AV50DevCant == 1 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_char21[0] = httpContext.getMessage( "UPD", "") ;
         GXv_char18[0] = A719PrdNum ;
         GXv_int20[0] = A13418AlbProID ;
         GXv_date14[0] = A13430AlbProDate ;
         GXv_char4[0] = A13417AlbProTipo ;
         GXv_int19[0] = A13442AlbProLine ;
         GXv_int8[0] = A13419AlbProPrvI ;
         GXv_decimal17[0] = A13443AlbProCnt ;
         GXv_decimal16[0] = AV51AlbProCntold ;
         GXv_char3[0] = AV8UsurCod ;
         GXv_char2[0] = "" ;
         new app.pdevcalpro(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_char18, GXv_int20, GXv_date14, GXv_char4, GXv_int19, GXv_int8, GXv_decimal17, GXv_decimal16, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char22[0] ;
         A719PrdNum = GXv_char18[0] ;
         A13418AlbProID = GXv_int20[0] ;
         A13430AlbProDate = GXv_date14[0] ;
         A13417AlbProTipo = GXv_char4[0] ;
         A13442AlbProLine = GXv_int19[0] ;
         A13419AlbProPrvI = GXv_int8[0] ;
         A13443AlbProCnt = GXv_decimal17[0] ;
         AV51AlbProCntold = GXv_decimal16[0] ;
         AV8UsurCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13418AlbProID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13418AlbProID), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51AlbProCntold", GXutil.ltrimstr( AV51AlbProCntold, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
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

   public void xc_93_1O81839( String A396EmprCod ,
                              String A719PrdNum ,
                              int A13419AlbProPrvI ,
                              String AV53msg_errprv ,
                              String A13417AlbProTipo )
   {
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_char21[0] = A719PrdNum ;
         GXv_int20[0] = A13419AlbProPrvI ;
         GXv_char18[0] = AV53msg_errprv ;
         new app.pprvprdproductoproveedor(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_int20, GXv_char18) ;
         A396EmprCod = GXv_char22[0] ;
         A719PrdNum = GXv_char21[0] ;
         A13419AlbProPrvI = GXv_int20[0] ;
         AV53msg_errprv = GXv_char18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13419AlbProPrvI), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV53msg_errprv", AV53msg_errprv);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV53msg_errprv))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_94_1O81839( String Gx_mode ,
                              String A396EmprCod ,
                              String A719PrdNum ,
                              java.math.BigDecimal A13443AlbProCnt ,
                              String AV57Msg_errcant )
   {
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_char21[0] = A719PrdNum ;
         GXv_decimal17[0] = A13443AlbProCnt ;
         GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char18[0] = AV57Msg_errcant ;
         new app.pexctrlproducto(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_decimal17, GXv_decimal16, GXv_char18) ;
         A396EmprCod = GXv_char22[0] ;
         A719PrdNum = GXv_char21[0] ;
         A13443AlbProCnt = GXv_decimal17[0] ;
         AV57Msg_errcant = GXv_char18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV57Msg_errcant", AV57Msg_errcant);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV57Msg_errcant))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_95_1O81839( String Gx_mode ,
                              String A396EmprCod ,
                              String A719PrdNum ,
                              java.math.BigDecimal A13443AlbProCnt ,
                              java.math.BigDecimal AV51AlbProCntold ,
                              String AV57Msg_errcant )
   {
      if ( isUpd( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_char21[0] = A719PrdNum ;
         GXv_decimal17[0] = A13443AlbProCnt ;
         GXv_decimal16[0] = AV51AlbProCntold ;
         GXv_char18[0] = AV57Msg_errcant ;
         new app.pexctrlproducto(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_decimal17, GXv_decimal16, GXv_char18) ;
         A396EmprCod = GXv_char22[0] ;
         A719PrdNum = GXv_char21[0] ;
         A13443AlbProCnt = GXv_decimal17[0] ;
         AV51AlbProCntold = GXv_decimal16[0] ;
         AV57Msg_errcant = GXv_char18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV51AlbProCntold", GXutil.ltrimstr( AV51AlbProCntold, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV57Msg_errcant", AV57Msg_errcant);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV51AlbProCntold, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV57Msg_errcant))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_99_1O81839( String A396EmprCod ,
                              String AV77Pgmname ,
                              String AV8UsurCod ,
                              String AV12Station ,
                              String AV47Inc_obs ,
                              int A13418AlbProID ,
                              String A719PrdNum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV77Pgmname, AV8UsurCod, AV12Station, AV47Inc_obs, A13418AlbProID, (byte)(0), " ") ;
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

   public void xc_100_1O81839( String A396EmprCod ,
                               String AV77Pgmname ,
                               String AV8UsurCod ,
                               String AV12Station ,
                               String AV47Inc_obs ,
                               int A13418AlbProID ,
                               String A719PrdNum )
   {
      if ( ( true /* After */ || true /* After */ ) && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV77Pgmname, AV8UsurCod, AV12Station, AV47Inc_obs, A13418AlbProID, (byte)(0), " ") ;
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

   public void gxnrgridlevel_lalpro_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1321839( ) ;
      while ( nGXsfl_132_idx <= nRC_GXsfl_132 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1O81839( ) ;
         standaloneModal1O81839( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1O81839( ) ;
         nGXsfl_132_idx = (int)(nGXsfl_132_idx+1) ;
         sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1321839( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_lalproContainer)) ;
      /* End function gxnrGridlevel_lalpro_newrow */
   }

   public void init_web_controls( )
   {
      cmbAlbProInEx.setName( "ALBPROINEX" );
      cmbAlbProInEx.setWebtags( "" );
      cmbAlbProInEx.addItem("1", httpContext.getMessage( "Mercado Interno", ""), (short)(0));
      cmbAlbProInEx.addItem("2", httpContext.getMessage( "Mercado Externo", ""), (short)(0));
      if ( cmbAlbProInEx.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A13452AlbProInEx) )
         {
            A13452AlbProInEx = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13452AlbProInEx", GXutil.str( A13452AlbProInEx, 1, 0));
         }
      }
      cmbAlbProTipo.setName( "ALBPROTIPO" );
      cmbAlbProTipo.setWebtags( "" );
      cmbAlbProTipo.addItem("P", httpContext.getMessage( "Proveedor", ""), (short)(0));
      cmbAlbProTipo.addItem("C", httpContext.getMessage( "Cliente", ""), (short)(0));
      if ( cmbAlbProTipo.getItemCount() > 0 )
      {
         A13417AlbProTipo = cmbAlbProTipo.getValidValue(A13417AlbProTipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13417AlbProTipo", A13417AlbProTipo);
      }
      GXCCtl = "ALBPROUND_" + sGXsfl_132_idx ;
      cmbAlbProUnd.setName( GXCCtl );
      cmbAlbProUnd.setWebtags( "" );
      cmbAlbProUnd.addItem("kg", httpContext.getMessage( "kilos", ""), (short)(0));
      cmbAlbProUnd.addItem("lt", httpContext.getMessage( "litros", ""), (short)(0));
      cmbAlbProUnd.addItem("mt", httpContext.getMessage( "metros", ""), (short)(0));
      cmbAlbProUnd.addItem("und", httpContext.getMessage( "unidades", ""), (short)(0));
      cmbAlbProUnd.addItem("", httpContext.getMessage( "n/a", ""), (short)(0));
      if ( cmbAlbProUnd.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A13444AlbProUnd)==0) )
         {
            A13444AlbProUnd = " " ;
            n13444AlbProUnd = false ;
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

   public void valid_Albproinex( )
   {
      A13452AlbProInEx = (byte)(GXutil.lval( cmbAlbProInEx.getValue())) ;
      if ( true /* After */ )
      {
         AV49contcod = ((A13452AlbProInEx==1) ? httpContext.getMessage( httpContext.getMessage( "REMTRA", ""), "") : httpContext.getMessage( httpContext.getMessage( "EXTTRA", ""), "")) ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV49contcod", GXutil.rtrim( AV49contcod));
   }

   public void valid_Albprotipo( )
   {
      A13417AlbProTipo = cmbAlbProTipo.getValue() ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV66Insert_AlbProPrvID) )
      {
         A13419AlbProPrvI = AV66Insert_AlbProPrvID ;
         /* Using cursor T01O862 */
         pr_default.execute(60, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
         h13419AlbProPrvI = "" ;
         while ( (pr_default.getStatus(60) != 101) )
         {
            h13419AlbProPrvI = T01O862_A13719PrvNNom[0] ;
            if (true) break;
         }
         pr_default.close(60);
         httpContext.ajax_rsp_assign_attri("", false, "h13419AlbProPrvI", h13419AlbProPrvI);
      }
      else
      {
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
         {
            A13419AlbProPrvI = 0 ;
            /* Using cursor T01O863 */
            pr_default.execute(61, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
            h13419AlbProPrvI = "" ;
            while ( (pr_default.getStatus(61) != 101) )
            {
               h13419AlbProPrvI = T01O863_A13719PrvNNom[0] ;
               if (true) break;
            }
            pr_default.close(61);
            httpContext.ajax_rsp_assign_attri("", false, "h13419AlbProPrvI", h13419AlbProPrvI);
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV67Insert_AlbProCliCod) )
      {
         A13425AlbProCliC = AV67Insert_AlbProCliCod ;
      }
      else
      {
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
         {
            A13425AlbProCliC = 0 ;
         }
      }
      edtPrdNum_Visible = ((GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), ""))==0) ? 1 : 0) ;
      edtAlbProPrvI_Visible = ((GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), ""))==0) ? 1 : 0) ;
      if ( ! ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) ) )
      {
         divAlbproprvid_cell_Class = httpContext.getMessage( "Invisible", "") ;
      }
      else
      {
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
         {
            divAlbproprvid_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
         }
      }
      edtAlbProCliC_Visible = ((GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), ""))==0) ? 1 : 0) ;
      if ( ! ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 ) ) )
      {
         divAlbproclicod_cell_Class = httpContext.getMessage( "Invisible", "") ;
      }
      else
      {
         if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
         {
            divAlbproclicod_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrim( localUtil.ntoc( A13425AlbProCliC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_132_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPrvI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPrvI_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, divAlbproprvid_cell_Internalname, "Class", divAlbproprvid_cell_Class, true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCliC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCliC_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, divAlbproclicod_cell_Internalname, "Class", divAlbproclicod_cell_Class, true);
      httpContext.ajax_rsp_assign_attri("", false, "h13419AlbProPrvI", h13419AlbProPrvI);
   }

   public void valid_Albprodate( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A13429AlbProSal) && true /* After */ )
      {
         GXt_dtime13 = A13429AlbProSal ;
         GXv_dtime10[0] = GXt_dtime13 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime10) ;
         tcalpro_impl.this.GXt_dtime13 = GXv_dtime10[0] ;
         A13429AlbProSal = GXt_dtime13 ;
      }
      if ( true /* Level */ && true /* After */ && ( AV43Ctrlf == 1 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_char21[0] = "" ;
         GXv_int15[0] = (byte)(3) ;
         GXv_date14[0] = AV42Fch ;
         GXv_int20[0] = AV41AlbLast ;
         GXv_date9[0] = A13430AlbProDate ;
         GXv_char18[0] = AV40Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_int15, GXv_date14, GXv_int20, GXv_date9, GXv_char18) ;
         tcalpro_impl.this.A396EmprCod = GXv_char22[0] ;
         A396EmprCod = this.A396EmprCod ;
         tcalpro_impl.this.AV42Fch = GXv_date14[0] ;
         AV42Fch = this.AV42Fch ;
         tcalpro_impl.this.AV41AlbLast = GXv_int20[0] ;
         AV41AlbLast = this.AV41AlbLast ;
         tcalpro_impl.this.A13430AlbProDate = GXv_date9[0] ;
         A13430AlbProDate = this.A13430AlbProDate ;
         tcalpro_impl.this.AV40Msg_f = GXv_char18[0] ;
         AV40Msg_f = this.AV40Msg_f ;
      }
      if ( ( GXutil.strcmp(AV40Msg_f, " ") != 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV40Msg_f, 1, "ALBPRODATE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProDate_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13429AlbProSal", localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "AV42Fch", localUtil.format(AV42Fch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV41AlbLast", GXutil.ltrim( localUtil.ntoc( AV41AlbLast, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13430AlbProDate", localUtil.format(A13430AlbProDate, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_f", GXutil.rtrim( AV40Msg_f));
   }

   public void valid_Catdocid( )
   {
      n13453CatDocID = false ;
      n13454CatDocNom = false ;
      if ( (GXutil.strcmp("", h13453CatDocID)==0) )
      {
         A13453CatDocID = (short)(0) ;
         n13453CatDocID = false ;
      }
      else
      {
         A13854CatDocNomI = h13453CatDocID ;
         /* Using cursor T01O864 */
         pr_default.execute(62, new Object[] {A13854CatDocNomI, A396EmprCod});
         A13453CatDocID = T01O864_A13453CatDocID[0] ;
         n13453CatDocID = T01O864_n13453CatDocID[0] ;
         A13453CatDocID = T01O864_A13453CatDocID[0] ;
         n13453CatDocID = T01O864_n13453CatDocID[0] ;
         if ( ! ( (pr_default.getStatus(62) == 101) ) )
         {
            pr_default.readNext(62);
            if ( ! ( (pr_default.getStatus(62) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "CATDOCID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCatDocID_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(62);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h13453CatDocID", h13453CatDocID);
      /* Using cursor T01O865 */
      pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n13453CatDocID), Short.valueOf(A13453CatDocID)});
      if ( (pr_default.getStatus(63) == 101) )
      {
         if ( ! ( (0==A13453CatDocID) && (GXutil.strcmp("", A13854CatDocNomI)==0) || (0==A13453CatDocID) && n13453CatDocID || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Categorias Documento Transporte", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CATDOCID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCatDocID_Internalname ;
         }
      }
      A13454CatDocNom = T01O865_A13454CatDocNom[0] ;
      n13454CatDocNom = T01O865_n13454CatDocNom[0] ;
      pr_default.close(63);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A13453CatDocID", GXutil.ltrim( localUtil.ntoc( A13453CatDocID, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13454CatDocNom", GXutil.rtrim( A13454CatDocNom));
      httpContext.ajax_rsp_assign_attri("", false, "h13453CatDocID", h13453CatDocID);
   }

   public void valid_Albproprvi( )
   {
      A13452AlbProInEx = (byte)(GXutil.lval( cmbAlbProInEx.getValue())) ;
      cmbAlbProInEx.setValue( GXutil.str( A13452AlbProInEx, 1, 0) );
      A13417AlbProTipo = cmbAlbProTipo.getValue() ;
      n13420AlbProPrvN = false ;
      if ( (GXutil.strcmp("", h13419AlbProPrvI)==0) )
      {
         A13419AlbProPrvI = 0 ;
      }
      else
      {
         A13719PrvNNom = h13419AlbProPrvI ;
         /* Using cursor T01O866 */
         pr_default.execute(64, new Object[] {A13719PrvNNom, A396EmprCod});
         A13419AlbProPrvI = T01O866_A795PrvNum[0] ;
         if ( ! ( (pr_default.getStatus(64) == 101) ) )
         {
            pr_default.readNext(64);
            if ( ! ( (pr_default.getStatus(64) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "ALBPROPRVI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProPrvI_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(64);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h13419AlbProPrvI", h13419AlbProPrvI);
      /* Using cursor T01O867 */
      pr_default.execute(65, new Object[] {A396EmprCod, Integer.valueOf(A13419AlbProPrvI)});
      Z13420AlbProPrvN = T01O867_A13420AlbProPrvN[0] ;
      if ( (pr_default.getStatus(65) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Proveedor", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROPRVI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPrvI_Internalname ;
      }
      A13420AlbProPrvN = T01O867_A13420AlbProPrvN[0] ;
      n13420AlbProPrvN = T01O867_n13420AlbProPrvN[0] ;
      pr_default.close(65);
      if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "C", ""), "")) == 0 )
      {
         A13420AlbProPrvN = " " ;
         n13420AlbProPrvN = false ;
      }
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) && true /* After */ )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_int20[0] = A13419AlbProPrvI ;
         GXv_int15[0] = A13452AlbProInEx ;
         GXv_int6[0] = AV45FlagProv ;
         GXv_char21[0] = AV60msgInEx ;
         new app.pexiproveedor(remoteHandle, context).execute( GXv_char22, GXv_int20, GXv_int15, GXv_int6, GXv_char21) ;
         tcalpro_impl.this.A396EmprCod = GXv_char22[0] ;
         A396EmprCod = this.A396EmprCod ;
         tcalpro_impl.this.A13419AlbProPrvI = GXv_int20[0] ;
         A13419AlbProPrvI = this.A13419AlbProPrvI ;
         tcalpro_impl.this.A13452AlbProInEx = GXv_int15[0] ;
         A13452AlbProInEx = this.A13452AlbProInEx ;
         tcalpro_impl.this.AV45FlagProv = GXv_int6[0] ;
         AV45FlagProv = this.AV45FlagProv ;
         tcalpro_impl.this.AV60msgInEx = GXv_char21[0] ;
         AV60msgInEx = this.AV60msgInEx ;
         cmbAlbProInEx.setValue( GXutil.str( A13452AlbProInEx, 1, 0) );
      }
      if ( ( AV45FlagProv == 0 ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor Inexistente", ""), 1, "ALBPROPRVI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPrvI_Internalname ;
      }
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) && true /* After */ && ( GXutil.strcmp(AV60msgInEx, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV60msgInEx, 0, "ALBPROPRVI");
      }
      dynload_actions( ) ;
      if ( cmbAlbProInEx.getItemCount() > 0 )
      {
         A13452AlbProInEx = (byte)(GXutil.lval( cmbAlbProInEx.getValidValue(GXutil.trim( GXutil.str( A13452AlbProInEx, 1, 0))))) ;
         cmbAlbProInEx.setValue( GXutil.str( A13452AlbProInEx, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProInEx.setValue( GXutil.trim( GXutil.str( A13452AlbProInEx, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13420AlbProPrvN", GXutil.rtrim( A13420AlbProPrvN));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13452AlbProInEx", GXutil.ltrim( localUtil.ntoc( A13452AlbProInEx, (byte)(1), (byte)(0), ".", "")));
      cmbAlbProInEx.setValue( GXutil.trim( GXutil.str( A13452AlbProInEx, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProInEx.getInternalname(), "Values", cmbAlbProInEx.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "AV45FlagProv", GXutil.ltrim( localUtil.ntoc( AV45FlagProv, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV60msgInEx", GXutil.rtrim( AV60msgInEx));
      httpContext.ajax_rsp_assign_attri("", false, "h13419AlbProPrvI", h13419AlbProPrvI);
   }

   public void valid_Albproclic( )
   {
      A13417AlbProTipo = cmbAlbProTipo.getValue() ;
      /* Using cursor T01O868 */
      pr_default.execute(66, new Object[] {A396EmprCod, Integer.valueOf(A13425AlbProCliC)});
      Z13426AlbProCliN = T01O868_A13426AlbProCliN[0] ;
      if ( (pr_default.getStatus(66) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Cliente", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCLIC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCliC_Internalname ;
      }
      A13426AlbProCliN = T01O868_A13426AlbProCliN[0] ;
      pr_default.close(66);
      if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 )
      {
         A13426AlbProCliN = " " ;
      }
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) && true /* After */ && ( A13425AlbProCliC > 0 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_int20[0] = A13425AlbProCliC ;
         GXv_int15[0] = AV44FlagCli ;
         new app.pexicli(remoteHandle, context).execute( GXv_char22, GXv_int20, GXv_int15) ;
         tcalpro_impl.this.A396EmprCod = GXv_char22[0] ;
         A396EmprCod = this.A396EmprCod ;
         tcalpro_impl.this.A13425AlbProCliC = GXv_int20[0] ;
         A13425AlbProCliC = this.A13425AlbProCliC ;
         tcalpro_impl.this.AV44FlagCli = GXv_int15[0] ;
         AV44FlagCli = this.AV44FlagCli ;
      }
      if ( ( AV44FlagCli == 0 ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) && true /* After */ && ( A13425AlbProCliC > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente Inexistente", ""), 1, "ALBPROCLIC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCliC_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13426AlbProCliN", GXutil.rtrim( A13426AlbProCliN));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrim( localUtil.ntoc( A13425AlbProCliC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV44FlagCli", GXutil.ltrim( localUtil.ntoc( AV44FlagCli, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Albprodome( )
   {
      A13417AlbProTipo = cmbAlbProTipo.getValue() ;
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) && true /* After */ && ( A13427AlbProDomE > 0 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_int20[0] = A13425AlbProCliC ;
         GXv_int15[0] = A13427AlbProDomE ;
         GXv_int6[0] = AV46FlagDom ;
         new app.pexidomenvio(remoteHandle, context).execute( GXv_char22, GXv_int20, GXv_int15, GXv_int6) ;
         tcalpro_impl.this.A396EmprCod = GXv_char22[0] ;
         A396EmprCod = this.A396EmprCod ;
         tcalpro_impl.this.A13425AlbProCliC = GXv_int20[0] ;
         A13425AlbProCliC = this.A13425AlbProCliC ;
         tcalpro_impl.this.A13427AlbProDomE = GXv_int15[0] ;
         A13427AlbProDomE = this.A13427AlbProDomE ;
         tcalpro_impl.this.AV46FlagDom = GXv_int6[0] ;
         AV46FlagDom = this.AV46FlagDom ;
      }
      if ( ( AV46FlagDom == 0 ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) && true /* After */ && ( A13427AlbProDomE > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Domicilio Envio Inexistente", ""), 1, "ALBPRODOME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProDomE_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A13425AlbProCliC", GXutil.ltrim( localUtil.ntoc( A13425AlbProCliC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13427AlbProDomE", GXutil.ltrim( localUtil.ntoc( A13427AlbProDomE, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV46FlagDom", GXutil.ltrim( localUtil.ntoc( AV46FlagDom, (byte)(1), (byte)(0), ".", "")));
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
         /* Using cursor T01O869 */
         pr_default.execute(67, new Object[] {A13738TrnCNom, A396EmprCod});
         A840TrnCod = T01O869_A840TrnCod[0] ;
         n840TrnCod = T01O869_n840TrnCod[0] ;
         A840TrnCod = T01O869_A840TrnCod[0] ;
         n840TrnCod = T01O869_n840TrnCod[0] ;
         if ( ! ( (pr_default.getStatus(67) == 101) ) )
         {
            pr_default.readNext(67);
            if ( ! ( (pr_default.getStatus(67) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(67);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01O870 */
      pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(68) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01O870_A841TrnNom[0] ;
      n841TrnNom = T01O870_n841TrnNom[0] ;
      pr_default.close(68);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
   }

   public void valid_Albproline( )
   {
      AV54AlbProLineaOld = O13442AlbProLine ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV54AlbProLineaOld", GXutil.ltrim( localUtil.ntoc( AV54AlbProLineaOld, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Prdnum( )
   {
      A13417AlbProTipo = cmbAlbProTipo.getValue() ;
      n13448AlbProDsc = false ;
      /* Using cursor T01O854 */
      pr_default.execute(52, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(52) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01O854_A718PrdNom[0] ;
      A704PrdExiAlm = T01O854_A704PrdExiAlm[0] ;
      pr_default.close(52);
      if ( isIns( )  && (GXutil.strcmp("", A13448AlbProDsc)==0) && ( Gx_BScreen == 0 ) )
      {
         A13448AlbProDsc = A718PrdNom ;
         n13448AlbProDsc = false ;
      }
      AV56PrdnumOld = O719PrdNum ;
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_char21[0] = A719PrdNum ;
         GXv_int20[0] = A13419AlbProPrvI ;
         GXv_char18[0] = AV53msg_errprv ;
         new app.pprvprdproductoproveedor(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_int20, GXv_char18) ;
         tcalpro_impl.this.A396EmprCod = GXv_char22[0] ;
         A396EmprCod = this.A396EmprCod ;
         tcalpro_impl.this.A719PrdNum = GXv_char21[0] ;
         A719PrdNum = this.A719PrdNum ;
         tcalpro_impl.this.A13419AlbProPrvI = GXv_int20[0] ;
         A13419AlbProPrvI = this.A13419AlbProPrvI ;
         tcalpro_impl.this.AV53msg_errprv = GXv_char18[0] ;
         AV53msg_errprv = this.AV53msg_errprv ;
      }
      if ( ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) && ( GXutil.strcmp(AV53msg_errprv, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV53msg_errprv, 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      if ( ( GXutil.strcmp(A719PrdNum, AV56PrdnumOld) != 0 ) && ( GXutil.strcmp(AV56PrdnumOld, " ") != 0 ) && isUpd( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se puede modificar el Producto", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13448AlbProDsc", GXutil.rtrim( A13448AlbProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV56PrdnumOld", GXutil.rtrim( AV56PrdnumOld));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A13419AlbProPrvI", GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV53msg_errprv", GXutil.rtrim( AV53msg_errprv));
      httpContext.ajax_rsp_assign_attri("", false, "h13419AlbProPrvI", h13419AlbProPrvI);
   }

   public void valid_Albprodsc( )
   {
      n13448AlbProDsc = false ;
      AV55AlbProDscold = O13448AlbProDsc ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV55AlbProDscold", GXutil.rtrim( AV55AlbProDscold));
   }

   public void valid_Albprocnt( )
   {
      n13443AlbProCnt = false ;
      AV51AlbProCntold = O13443AlbProCnt ;
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_char21[0] = A719PrdNum ;
         GXv_decimal17[0] = A13443AlbProCnt ;
         GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char18[0] = AV57Msg_errcant ;
         new app.pexctrlproducto(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_decimal17, GXv_decimal16, GXv_char18) ;
         tcalpro_impl.this.A396EmprCod = GXv_char22[0] ;
         A396EmprCod = this.A396EmprCod ;
         tcalpro_impl.this.A719PrdNum = GXv_char21[0] ;
         A719PrdNum = this.A719PrdNum ;
         tcalpro_impl.this.A13443AlbProCnt = GXv_decimal17[0] ;
         A13443AlbProCnt = this.A13443AlbProCnt ;
         tcalpro_impl.this.AV57Msg_errcant = GXv_char18[0] ;
         AV57Msg_errcant = this.AV57Msg_errcant ;
      }
      if ( isUpd( )  && true /* After */ && ( GXutil.strcmp(A719PrdNum, " ") != 0 ) )
      {
         GXv_char22[0] = A396EmprCod ;
         GXv_char21[0] = A719PrdNum ;
         GXv_decimal17[0] = A13443AlbProCnt ;
         GXv_decimal16[0] = AV51AlbProCntold ;
         GXv_char18[0] = AV57Msg_errcant ;
         new app.pexctrlproducto(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_decimal17, GXv_decimal16, GXv_char18) ;
         tcalpro_impl.this.A396EmprCod = GXv_char22[0] ;
         A396EmprCod = this.A396EmprCod ;
         tcalpro_impl.this.A719PrdNum = GXv_char21[0] ;
         A719PrdNum = this.A719PrdNum ;
         tcalpro_impl.this.A13443AlbProCnt = GXv_decimal17[0] ;
         A13443AlbProCnt = this.A13443AlbProCnt ;
         tcalpro_impl.this.AV51AlbProCntold = GXv_decimal16[0] ;
         AV51AlbProCntold = this.AV51AlbProCntold ;
         tcalpro_impl.this.AV57Msg_errcant = GXv_char18[0] ;
         AV57Msg_errcant = this.AV57Msg_errcant ;
      }
      if ( true /* After */ && ! (GXutil.strcmp("", A719PrdNum)==0) && ( GXutil.strcmp(AV57Msg_errcant, " ") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV57Msg_errcant, 0, "ALBPROCNT");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A13443AlbProCnt", GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV51AlbProCntold", GXutil.ltrim( localUtil.ntoc( AV51AlbProCntold, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV57Msg_errcant", GXutil.rtrim( AV57Msg_errcant));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV63TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33AlbProID',fld:'vALBPROID',pic:'ZZZZZZZ9',hsh:true},{av:'A13435AlbProEnvA',fld:'ALBPROENVA',pic:''},{av:'A13431AlbProSys',fld:'ALBPROSYS',pic:'99/99/99 99:99'},{av:'A13433AlbProHh',fld:'ALBPROHH',pic:''},{av:'A13436AlbProIDAT',fld:'ALBPROIDAT',pic:''},{av:'A13438AlbProStAT',fld:'ALBPROSTAT',pic:'9'},{av:'A14190AlbProATCU',fld:'ALBPROATCU',pic:''},{av:'A14191AlbProSerA',fld:'ALBPROSERA',pic:''},{av:'A14192AlbProTipA',fld:'ALBPROTIPA',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121O82',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'},{av:'A13430AlbProDate',fld:'ALBPRODATE',pic:''},{av:'A13431AlbProSys',fld:'ALBPROSYS',pic:'99/99/99 99:99'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV63TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A13431AlbProSys',fld:'ALBPROSYS',pic:'99/99/99 99:99'},{av:'A13430AlbProDate',fld:'ALBPRODATE',pic:''},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_ALBPROID","{handler:'valid_Albproid',iparms:[]");
      setEventMetadata("VALID_ALBPROID",",oparms:[]}");
      setEventMetadata("VALID_ALBPROINEX","{handler:'valid_Albproinex',iparms:[{av:'cmbAlbProInEx'},{av:'A13452AlbProInEx',fld:'ALBPROINEX',pic:'9'},{av:'AV49contcod',fld:'vCONTCOD',pic:'@!'}]");
      setEventMetadata("VALID_ALBPROINEX",",oparms:[{av:'AV49contcod',fld:'vCONTCOD',pic:'@!'}]}");
      setEventMetadata("VALID_ALBPROTIPO","{handler:'valid_Albprotipo',iparms:[{av:'h13419AlbProPrvI'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV66Insert_AlbProPrvID',fld:'vINSERT_ALBPROPRVID',pic:'ZZZZZ9'},{av:'cmbAlbProTipo'},{av:'A13417AlbProTipo',fld:'ALBPROTIPO',pic:''},{av:'AV67Insert_AlbProCliCod',fld:'vINSERT_ALBPROCLICOD',pic:'ZZZZZ9'},{av:'A13419AlbProPrvI',fld:'ALBPROPRVI',pic:'ZZZZZ9'},{av:'A13425AlbProCliC',fld:'ALBPROCLIC',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_ALBPROTIPO",",oparms:[{av:'A13419AlbProPrvI',fld:'ALBPROPRVI',pic:'ZZZZZ9'},{av:'A13425AlbProCliC',fld:'ALBPROCLIC',pic:'ZZZZZ9'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtAlbProPrvI_Visible',ctrl:'ALBPROPRVI',prop:'Visible'},{av:'divAlbproprvid_cell_Class',ctrl:'ALBPROPRVID_CELL',prop:'Class'},{av:'edtAlbProCliC_Visible',ctrl:'ALBPROCLIC',prop:'Visible'},{av:'divAlbproclicod_cell_Class',ctrl:'ALBPROCLICOD_CELL',prop:'Class'},{av:'h13419AlbProPrvI'}]}");
      setEventMetadata("VALID_ALBPRODATE","{handler:'valid_Albprodate',iparms:[{av:'AV43Ctrlf',fld:'vCTRLF',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A13430AlbProDate',fld:'ALBPRODATE',pic:''},{av:'A13429AlbProSal',fld:'ALBPROSAL',pic:'99/99/99 99:99'},{av:'AV40Msg_f',fld:'vMSG_F',pic:''},{av:'AV41AlbLast',fld:'vALBLAST',pic:'ZZZZZZZ9'},{av:'AV42Fch',fld:'vFCH',pic:''}]");
      setEventMetadata("VALID_ALBPRODATE",",oparms:[{av:'A13429AlbProSal',fld:'ALBPROSAL',pic:'99/99/99 99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV42Fch',fld:'vFCH',pic:''},{av:'AV41AlbLast',fld:'vALBLAST',pic:'ZZZZZZZ9'},{av:'A13430AlbProDate',fld:'ALBPRODATE',pic:''},{av:'AV40Msg_f',fld:'vMSG_F',pic:''}]}");
      setEventMetadata("VALID_CATDOCID","{handler:'valid_Catdocid',iparms:[{av:'h13453CatDocID'},{av:'A13453CatDocID',fld:'CATDOCID',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13454CatDocNom',fld:'CATDOCNOM',pic:''}]");
      setEventMetadata("VALID_CATDOCID",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13453CatDocID',fld:'CATDOCID',pic:'ZZZ9'},{av:'A13454CatDocNom',fld:'CATDOCNOM',pic:''},{av:'h13453CatDocID'}]}");
      setEventMetadata("VALID_ALBPROPRVI","{handler:'valid_Albproprvi',iparms:[{av:'cmbAlbProInEx'},{av:'A13452AlbProInEx',fld:'ALBPROINEX',pic:'9'},{av:'h13419AlbProPrvI'},{av:'A13419AlbProPrvI',fld:'ALBPROPRVI',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'cmbAlbProTipo'},{av:'A13417AlbProTipo',fld:'ALBPROTIPO',pic:''},{av:'A13420AlbProPrvN',fld:'ALBPROPRVN',pic:''},{av:'AV60msgInEx',fld:'vMSGINEX',pic:''},{av:'AV45FlagProv',fld:'vFLAGPROV',pic:'9'}]");
      setEventMetadata("VALID_ALBPROPRVI",",oparms:[{av:'A13420AlbProPrvN',fld:'ALBPROPRVN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13419AlbProPrvI',fld:'ALBPROPRVI',pic:'ZZZZZ9'},{av:'cmbAlbProInEx'},{av:'A13452AlbProInEx',fld:'ALBPROINEX',pic:'9'},{av:'AV45FlagProv',fld:'vFLAGPROV',pic:'9'},{av:'AV60msgInEx',fld:'vMSGINEX',pic:''},{av:'h13419AlbProPrvI'}]}");
      setEventMetadata("VALID_ALBPROCLIC","{handler:'valid_Albproclic',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13425AlbProCliC',fld:'ALBPROCLIC',pic:'ZZZZZ9'},{av:'cmbAlbProTipo'},{av:'A13417AlbProTipo',fld:'ALBPROTIPO',pic:''},{av:'A13426AlbProCliN',fld:'ALBPROCLIN',pic:''},{av:'AV44FlagCli',fld:'vFLAGCLI',pic:'9'}]");
      setEventMetadata("VALID_ALBPROCLIC",",oparms:[{av:'A13426AlbProCliN',fld:'ALBPROCLIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13425AlbProCliC',fld:'ALBPROCLIC',pic:'ZZZZZ9'},{av:'AV44FlagCli',fld:'vFLAGCLI',pic:'9'}]}");
      setEventMetadata("VALID_ALBPROCLIN","{handler:'valid_Albproclin',iparms:[]");
      setEventMetadata("VALID_ALBPROCLIN",",oparms:[]}");
      setEventMetadata("VALID_ALBPRODOME","{handler:'valid_Albprodome',iparms:[{av:'cmbAlbProTipo'},{av:'A13417AlbProTipo',fld:'ALBPROTIPO',pic:''},{av:'A13425AlbProCliC',fld:'ALBPROCLIC',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13427AlbProDomE',fld:'ALBPRODOME',pic:'9'},{av:'AV46FlagDom',fld:'vFLAGDOM',pic:'9'}]");
      setEventMetadata("VALID_ALBPRODOME",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13425AlbProCliC',fld:'ALBPROCLIC',pic:'ZZZZZ9'},{av:'A13427AlbProDomE',fld:'ALBPRODOME',pic:'9'},{av:'AV46FlagDom',fld:'vFLAGDOM',pic:'9'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'h840TrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'h840TrnCod'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROIDAT","{handler:'valid_Albproidat',iparms:[]");
      setEventMetadata("VALID_ALBPROIDAT",",oparms:[]}");
      setEventMetadata("VALID_ALBPROSTAT","{handler:'valid_Albprostat',iparms:[]");
      setEventMetadata("VALID_ALBPROSTAT",",oparms:[]}");
      setEventMetadata("VALID_ALBPROULTL","{handler:'valid_Albproultl',iparms:[]");
      setEventMetadata("VALID_ALBPROULTL",",oparms:[]}");
      setEventMetadata("VALID_ALBPROLINE","{handler:'valid_Albproline',iparms:[{av:'O13442AlbProLine'},{av:'A13442AlbProLine',fld:'ALBPROLINE',pic:'ZZZ9'},{av:'AV54AlbProLineaOld',fld:'vALBPROLINEAOLD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBPROLINE",",oparms:[{av:'AV54AlbProLineaOld',fld:'vALBPROLINEAOLD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'h13419AlbProPrvI'},{av:'cmbAlbProTipo'},{av:'A13417AlbProTipo',fld:'ALBPROTIPO',pic:''},{av:'A13419AlbProPrvI',fld:'ALBPROPRVI',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O719PrdNum'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV56PrdnumOld',fld:'vPRDNUMOLD',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A13448AlbProDsc',fld:'ALBPRODSC',pic:''},{av:'AV53msg_errprv',fld:'vMSG_ERRPRV',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A13448AlbProDsc',fld:'ALBPRODSC',pic:''},{av:'AV56PrdnumOld',fld:'vPRDNUMOLD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A13419AlbProPrvI',fld:'ALBPROPRVI',pic:'ZZZZZ9'},{av:'AV53msg_errprv',fld:'vMSG_ERRPRV',pic:''},{av:'h13419AlbProPrvI'}]}");
      setEventMetadata("VALID_ALBPRODSC","{handler:'valid_Albprodsc',iparms:[{av:'O13448AlbProDsc'},{av:'A13448AlbProDsc',fld:'ALBPRODSC',pic:''},{av:'AV55AlbProDscold',fld:'vALBPRODSCOLD',pic:''}]");
      setEventMetadata("VALID_ALBPRODSC",",oparms:[{av:'AV55AlbProDscold',fld:'vALBPRODSCOLD',pic:''}]}");
      setEventMetadata("VALID_ALBPROCNT","{handler:'valid_Albprocnt',iparms:[{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O13443AlbProCnt'},{av:'A13443AlbProCnt',fld:'ALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV51AlbProCntold',fld:'vALBPROCNTOLD',pic:'ZZZZZ9.99'},{av:'AV57Msg_errcant',fld:'vMSG_ERRCANT',pic:''}]");
      setEventMetadata("VALID_ALBPROCNT",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A13443AlbProCnt',fld:'ALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV51AlbProCntold',fld:'vALBPROCNTOLD',pic:'ZZZZZ9.99'},{av:'AV57Msg_errcant',fld:'vMSG_ERRCANT',pic:''}]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albprodto',iparms:[]");
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
      pr_default.close(52);
      pr_default.close(66);
      pr_default.close(38);
      pr_default.close(65);
      pr_default.close(39);
      pr_default.close(68);
      pr_default.close(40);
      pr_default.close(63);
      pr_default.close(41);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      Z396EmprCod = "" ;
      Z13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      Z13417AlbProTipo = "" ;
      Z13430AlbProDate = GXutil.nullDate() ;
      Z13424AlbProMatr = "" ;
      Z13439AlbProObs = "" ;
      Z13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      Z13433AlbProHh = "" ;
      Z13434AlbProHhCt = "" ;
      Z13435AlbProEnvA = "" ;
      Z13436AlbProIDAT = "" ;
      Z13440AlbProAnul = "" ;
      Z13579AlbProLC1 = "" ;
      Z13580AlbProLC2 = "" ;
      Z13581AlbProLC3 = "" ;
      Z13582AlbProLD1 = "" ;
      Z13583AlbProLD2 = "" ;
      Z13584AlbProLD3 = "" ;
      Z14190AlbProATCU = "" ;
      Z14191AlbProSerA = "" ;
      Z14192AlbProTipA = "" ;
      Z13426AlbProCliN = "" ;
      Z13420AlbProPrvN = "" ;
      Z13448AlbProDsc = "" ;
      Z13444AlbProUnd = "" ;
      Z13443AlbProCnt = DecimalUtil.ZERO ;
      Z13447AlbProObsL = "" ;
      Z13445AlbProNRef = "" ;
      Z13446AlbProVRef = "" ;
      Z13852AlbProPrvp = DecimalUtil.ZERO ;
      Z13853AlbProDto = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      O719PrdNum = "" ;
      O13448AlbProDsc = "" ;
      O13443AlbProCnt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV49contcod = "" ;
      AV42Fch = GXutil.nullDate() ;
      A13430AlbProDate = GXutil.nullDate() ;
      AV40Msg_f = "" ;
      A13417AlbProTipo = "" ;
      AV60msgInEx = "" ;
      A719PrdNum = "" ;
      AV53msg_errprv = "" ;
      Gx_mode = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      AV57Msg_errcant = "" ;
      AV51AlbProCntold = DecimalUtil.ZERO ;
      AV77Pgmname = "" ;
      AV8UsurCod = "" ;
      AV12Station = "" ;
      AV47Inc_obs = "" ;
      A13854CatDocNomI = "" ;
      A13719PrvNNom = "" ;
      A13738TrnCNom = "" ;
      h13453CatDocID = "" ;
      h13419AlbProPrvI = "" ;
      h840TrnCod = "" ;
      AV32EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      imgprompt_13425_gximage = "" ;
      sImgUrl = "" ;
      A13426AlbProCliN = "" ;
      imgprompt_13425_13427_gximage = "" ;
      A13424AlbProMatr = "" ;
      A13439AlbProObs = "" ;
      sStyleString = "" ;
      A13579AlbProLC1 = "" ;
      A13580AlbProLC2 = "" ;
      A13581AlbProLC3 = "" ;
      A13582AlbProLD1 = "" ;
      A13583AlbProLD2 = "" ;
      A13584AlbProLD3 = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      A13433AlbProHh = "" ;
      A13434AlbProHhCt = "" ;
      A13435AlbProEnvA = "" ;
      A13436AlbProIDAT = "" ;
      A13440AlbProAnul = "" ;
      Gridlevel_lalproContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1839 = "" ;
      A14190AlbProATCU = "" ;
      A14191AlbProSerA = "" ;
      A14192AlbProTipA = "" ;
      A13420AlbProPrvN = "" ;
      AV37Msg_errAT = "" ;
      A407EmprNom = "" ;
      A841TrnNom = "" ;
      A13454CatDocNom = "" ;
      AV55AlbProDscold = "" ;
      AV56PrdnumOld = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1838 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A13448AlbProDsc = "" ;
      A13444AlbProUnd = "" ;
      A13447AlbProObsL = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A13445AlbProNRef = "" ;
      A13446AlbProVRef = "" ;
      A13852AlbProPrvp = DecimalUtil.ZERO ;
      A13853AlbProDto = DecimalUtil.ZERO ;
      T719PrdNum = "" ;
      T13448AlbProDsc = "" ;
      T13443AlbProCnt = DecimalUtil.ZERO ;
      AV11EmprNom = "" ;
      AV78Path = "" ;
      AV58Msg_dev = "" ;
      GXt_char1 = "" ;
      AV62WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV63TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV64WebSession = httpContext.getWebSession();
      AV69TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV70Cadena = "" ;
      AV73firma = "" ;
      AV71Hash = "" ;
      AV74Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message11 = new GXBaseCollection[1] ;
      GXv_boolean12 = new boolean[1] ;
      Z407EmprNom = "" ;
      Z13454CatDocNom = "" ;
      Z841TrnNom = "" ;
      T01O87_A407EmprNom = new String[] {""} ;
      T01O87_n407EmprNom = new boolean[] {false} ;
      T01O814_A13738TrnCNom = new String[] {""} ;
      T01O814_A396EmprCod = new String[] {""} ;
      T01O814_A840TrnCod = new short[1] ;
      T01O814_n840TrnCod = new boolean[] {false} ;
      T01O815_A13854CatDocNomI = new String[] {""} ;
      T01O815_A396EmprCod = new String[] {""} ;
      T01O815_A13453CatDocID = new short[1] ;
      T01O815_n13453CatDocID = new boolean[] {false} ;
      T01O812_A841TrnNom = new String[] {""} ;
      T01O812_n841TrnNom = new boolean[] {false} ;
      T01O813_A13454CatDocNom = new String[] {""} ;
      T01O813_n13454CatDocNom = new boolean[] {false} ;
      T01O816_A13418AlbProID = new int[1] ;
      T01O816_A13420AlbProPrvN = new String[] {""} ;
      T01O816_n13420AlbProPrvN = new boolean[] {false} ;
      T01O816_A13426AlbProCliN = new String[] {""} ;
      T01O816_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01O816_A407EmprNom = new String[] {""} ;
      T01O816_n407EmprNom = new boolean[] {false} ;
      T01O816_A13452AlbProInEx = new byte[1] ;
      T01O816_A13417AlbProTipo = new String[] {""} ;
      T01O816_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      T01O816_A13454CatDocNom = new String[] {""} ;
      T01O816_n13454CatDocNom = new boolean[] {false} ;
      T01O816_A13427AlbProDomE = new byte[1] ;
      T01O816_A841TrnNom = new String[] {""} ;
      T01O816_n841TrnNom = new boolean[] {false} ;
      T01O816_A13424AlbProMatr = new String[] {""} ;
      T01O816_A13439AlbProObs = new String[] {""} ;
      T01O816_A13437AlbProSta = new byte[1] ;
      T01O816_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      T01O816_A13433AlbProHh = new String[] {""} ;
      T01O816_A13434AlbProHhCt = new String[] {""} ;
      T01O816_A13435AlbProEnvA = new String[] {""} ;
      T01O816_A13436AlbProIDAT = new String[] {""} ;
      T01O816_A13438AlbProStAT = new byte[1] ;
      T01O816_A13440AlbProAnul = new String[] {""} ;
      T01O816_A13441AlbProUltL = new short[1] ;
      T01O816_A13579AlbProLC1 = new String[] {""} ;
      T01O816_A13580AlbProLC2 = new String[] {""} ;
      T01O816_A13581AlbProLC3 = new String[] {""} ;
      T01O816_A13582AlbProLD1 = new String[] {""} ;
      T01O816_A13583AlbProLD2 = new String[] {""} ;
      T01O816_A13584AlbProLD3 = new String[] {""} ;
      T01O816_A14190AlbProATCU = new String[] {""} ;
      T01O816_n14190AlbProATCU = new boolean[] {false} ;
      T01O816_A14191AlbProSerA = new String[] {""} ;
      T01O816_n14191AlbProSerA = new boolean[] {false} ;
      T01O816_A14192AlbProTipA = new String[] {""} ;
      T01O816_n14192AlbProTipA = new boolean[] {false} ;
      T01O816_A396EmprCod = new String[] {""} ;
      T01O816_A13425AlbProCliC = new int[1] ;
      T01O816_A13419AlbProPrvI = new int[1] ;
      T01O816_A840TrnCod = new short[1] ;
      T01O816_n840TrnCod = new boolean[] {false} ;
      T01O816_A13453CatDocID = new short[1] ;
      T01O816_n13453CatDocID = new boolean[] {false} ;
      T01O817_A13719PrvNNom = new String[] {""} ;
      T01O817_A396EmprCod = new String[] {""} ;
      T01O817_A795PrvNum = new int[1] ;
      T01O818_A13719PrvNNom = new String[] {""} ;
      T01O818_A396EmprCod = new String[] {""} ;
      T01O818_A795PrvNum = new int[1] ;
      T01O819_A13854CatDocNomI = new String[] {""} ;
      T01O819_A396EmprCod = new String[] {""} ;
      T01O819_A13453CatDocID = new short[1] ;
      T01O819_n13453CatDocID = new boolean[] {false} ;
      T01O820_A13719PrvNNom = new String[] {""} ;
      T01O820_A396EmprCod = new String[] {""} ;
      T01O820_A795PrvNum = new int[1] ;
      T01O821_A13738TrnCNom = new String[] {""} ;
      T01O821_A396EmprCod = new String[] {""} ;
      T01O821_A840TrnCod = new short[1] ;
      T01O821_n840TrnCod = new boolean[] {false} ;
      T01O822_A13854CatDocNomI = new String[] {""} ;
      T01O822_A396EmprCod = new String[] {""} ;
      T01O822_A13453CatDocID = new short[1] ;
      T01O822_n13453CatDocID = new boolean[] {false} ;
      T01O823_A13738TrnCNom = new String[] {""} ;
      T01O823_A396EmprCod = new String[] {""} ;
      T01O823_A840TrnCod = new short[1] ;
      T01O823_n840TrnCod = new boolean[] {false} ;
      T01O824_A13719PrvNNom = new String[] {""} ;
      T01O824_A396EmprCod = new String[] {""} ;
      T01O824_A795PrvNum = new int[1] ;
      T01O825_A13719PrvNNom = new String[] {""} ;
      T01O825_A396EmprCod = new String[] {""} ;
      T01O825_A795PrvNum = new int[1] ;
      T01O826_A13854CatDocNomI = new String[] {""} ;
      T01O826_A396EmprCod = new String[] {""} ;
      T01O826_A13453CatDocID = new short[1] ;
      T01O826_n13453CatDocID = new boolean[] {false} ;
      T01O827_A13738TrnCNom = new String[] {""} ;
      T01O827_A396EmprCod = new String[] {""} ;
      T01O827_A840TrnCod = new short[1] ;
      T01O827_n840TrnCod = new boolean[] {false} ;
      T01O89_A13426AlbProCliN = new String[] {""} ;
      T01O811_A13420AlbProPrvN = new String[] {""} ;
      T01O811_n13420AlbProPrvN = new boolean[] {false} ;
      T01O828_A841TrnNom = new String[] {""} ;
      T01O828_n841TrnNom = new boolean[] {false} ;
      T01O829_A13454CatDocNom = new String[] {""} ;
      T01O829_n13454CatDocNom = new boolean[] {false} ;
      T01O830_A396EmprCod = new String[] {""} ;
      T01O830_A13418AlbProID = new int[1] ;
      T01O86_A13418AlbProID = new int[1] ;
      T01O86_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01O86_A13452AlbProInEx = new byte[1] ;
      T01O86_A13417AlbProTipo = new String[] {""} ;
      T01O86_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      T01O86_A13427AlbProDomE = new byte[1] ;
      T01O86_A13424AlbProMatr = new String[] {""} ;
      T01O86_A13439AlbProObs = new String[] {""} ;
      T01O86_A13437AlbProSta = new byte[1] ;
      T01O86_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      T01O86_A13433AlbProHh = new String[] {""} ;
      T01O86_A13434AlbProHhCt = new String[] {""} ;
      T01O86_A13435AlbProEnvA = new String[] {""} ;
      T01O86_A13436AlbProIDAT = new String[] {""} ;
      T01O86_A13438AlbProStAT = new byte[1] ;
      T01O86_A13440AlbProAnul = new String[] {""} ;
      T01O86_A13441AlbProUltL = new short[1] ;
      T01O86_A13579AlbProLC1 = new String[] {""} ;
      T01O86_A13580AlbProLC2 = new String[] {""} ;
      T01O86_A13581AlbProLC3 = new String[] {""} ;
      T01O86_A13582AlbProLD1 = new String[] {""} ;
      T01O86_A13583AlbProLD2 = new String[] {""} ;
      T01O86_A13584AlbProLD3 = new String[] {""} ;
      T01O86_A14190AlbProATCU = new String[] {""} ;
      T01O86_n14190AlbProATCU = new boolean[] {false} ;
      T01O86_A14191AlbProSerA = new String[] {""} ;
      T01O86_n14191AlbProSerA = new boolean[] {false} ;
      T01O86_A14192AlbProTipA = new String[] {""} ;
      T01O86_n14192AlbProTipA = new boolean[] {false} ;
      T01O86_A396EmprCod = new String[] {""} ;
      T01O86_A13425AlbProCliC = new int[1] ;
      T01O86_A13419AlbProPrvI = new int[1] ;
      T01O86_A840TrnCod = new short[1] ;
      T01O86_n840TrnCod = new boolean[] {false} ;
      T01O86_A13453CatDocID = new short[1] ;
      T01O86_n13453CatDocID = new boolean[] {false} ;
      T01O831_A396EmprCod = new String[] {""} ;
      T01O831_A13418AlbProID = new int[1] ;
      T01O832_A396EmprCod = new String[] {""} ;
      T01O832_A13418AlbProID = new int[1] ;
      T01O833_A13854CatDocNomI = new String[] {""} ;
      T01O833_A396EmprCod = new String[] {""} ;
      T01O833_A13453CatDocID = new short[1] ;
      T01O833_n13453CatDocID = new boolean[] {false} ;
      T01O834_A13738TrnCNom = new String[] {""} ;
      T01O834_A396EmprCod = new String[] {""} ;
      T01O834_A840TrnCod = new short[1] ;
      T01O834_n840TrnCod = new boolean[] {false} ;
      T01O85_A13418AlbProID = new int[1] ;
      T01O85_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01O85_A13452AlbProInEx = new byte[1] ;
      T01O85_A13417AlbProTipo = new String[] {""} ;
      T01O85_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      T01O85_A13427AlbProDomE = new byte[1] ;
      T01O85_A13424AlbProMatr = new String[] {""} ;
      T01O85_A13439AlbProObs = new String[] {""} ;
      T01O85_A13437AlbProSta = new byte[1] ;
      T01O85_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      T01O85_A13433AlbProHh = new String[] {""} ;
      T01O85_A13434AlbProHhCt = new String[] {""} ;
      T01O85_A13435AlbProEnvA = new String[] {""} ;
      T01O85_A13436AlbProIDAT = new String[] {""} ;
      T01O85_A13438AlbProStAT = new byte[1] ;
      T01O85_A13440AlbProAnul = new String[] {""} ;
      T01O85_A13441AlbProUltL = new short[1] ;
      T01O85_A13579AlbProLC1 = new String[] {""} ;
      T01O85_A13580AlbProLC2 = new String[] {""} ;
      T01O85_A13581AlbProLC3 = new String[] {""} ;
      T01O85_A13582AlbProLD1 = new String[] {""} ;
      T01O85_A13583AlbProLD2 = new String[] {""} ;
      T01O85_A13584AlbProLD3 = new String[] {""} ;
      T01O85_A14190AlbProATCU = new String[] {""} ;
      T01O85_n14190AlbProATCU = new boolean[] {false} ;
      T01O85_A14191AlbProSerA = new String[] {""} ;
      T01O85_n14191AlbProSerA = new boolean[] {false} ;
      T01O85_A14192AlbProTipA = new String[] {""} ;
      T01O85_n14192AlbProTipA = new boolean[] {false} ;
      T01O85_A396EmprCod = new String[] {""} ;
      T01O85_A13425AlbProCliC = new int[1] ;
      T01O85_A13419AlbProPrvI = new int[1] ;
      T01O85_A840TrnCod = new short[1] ;
      T01O85_n840TrnCod = new boolean[] {false} ;
      T01O85_A13453CatDocID = new short[1] ;
      T01O85_n13453CatDocID = new boolean[] {false} ;
      T01O835_A13426AlbProCliN = new String[] {""} ;
      T01O836_A13420AlbProPrvN = new String[] {""} ;
      T01O836_n13420AlbProPrvN = new boolean[] {false} ;
      T01O840_A13426AlbProCliN = new String[] {""} ;
      T01O841_A13420AlbProPrvN = new String[] {""} ;
      T01O841_n13420AlbProPrvN = new boolean[] {false} ;
      T01O842_A841TrnNom = new String[] {""} ;
      T01O842_n841TrnNom = new boolean[] {false} ;
      T01O843_A13454CatDocNom = new String[] {""} ;
      T01O843_n13454CatDocNom = new boolean[] {false} ;
      T01O847_A396EmprCod = new String[] {""} ;
      T01O847_A13418AlbProID = new int[1] ;
      Z718PrdNom = "" ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      T01O848_A13418AlbProID = new int[1] ;
      T01O848_A13442AlbProLine = new short[1] ;
      T01O848_A13448AlbProDsc = new String[] {""} ;
      T01O848_n13448AlbProDsc = new boolean[] {false} ;
      T01O848_A13449AlbProCaja = new short[1] ;
      T01O848_n13449AlbProCaja = new boolean[] {false} ;
      T01O848_A13444AlbProUnd = new String[] {""} ;
      T01O848_n13444AlbProUnd = new boolean[] {false} ;
      T01O848_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O848_n13443AlbProCnt = new boolean[] {false} ;
      T01O848_A13447AlbProObsL = new String[] {""} ;
      T01O848_n13447AlbProObsL = new boolean[] {false} ;
      T01O848_A718PrdNom = new String[] {""} ;
      T01O848_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O848_A13445AlbProNRef = new String[] {""} ;
      T01O848_n13445AlbProNRef = new boolean[] {false} ;
      T01O848_A13446AlbProVRef = new String[] {""} ;
      T01O848_n13446AlbProVRef = new boolean[] {false} ;
      T01O848_A13852AlbProPrvp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O848_n13852AlbProPrvp = new boolean[] {false} ;
      T01O848_A13853AlbProDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O848_n13853AlbProDto = new boolean[] {false} ;
      T01O848_A396EmprCod = new String[] {""} ;
      T01O848_A719PrdNum = new String[] {""} ;
      T01O84_A718PrdNom = new String[] {""} ;
      T01O84_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O849_A718PrdNom = new String[] {""} ;
      T01O849_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O850_A396EmprCod = new String[] {""} ;
      T01O850_A13418AlbProID = new int[1] ;
      T01O850_A13442AlbProLine = new short[1] ;
      T01O83_A13418AlbProID = new int[1] ;
      T01O83_A13442AlbProLine = new short[1] ;
      T01O83_A13448AlbProDsc = new String[] {""} ;
      T01O83_n13448AlbProDsc = new boolean[] {false} ;
      T01O83_A13449AlbProCaja = new short[1] ;
      T01O83_n13449AlbProCaja = new boolean[] {false} ;
      T01O83_A13444AlbProUnd = new String[] {""} ;
      T01O83_n13444AlbProUnd = new boolean[] {false} ;
      T01O83_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O83_n13443AlbProCnt = new boolean[] {false} ;
      T01O83_A13447AlbProObsL = new String[] {""} ;
      T01O83_n13447AlbProObsL = new boolean[] {false} ;
      T01O83_A13445AlbProNRef = new String[] {""} ;
      T01O83_n13445AlbProNRef = new boolean[] {false} ;
      T01O83_A13446AlbProVRef = new String[] {""} ;
      T01O83_n13446AlbProVRef = new boolean[] {false} ;
      T01O83_A13852AlbProPrvp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O83_n13852AlbProPrvp = new boolean[] {false} ;
      T01O83_A13853AlbProDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O83_n13853AlbProDto = new boolean[] {false} ;
      T01O83_A396EmprCod = new String[] {""} ;
      T01O83_A719PrdNum = new String[] {""} ;
      T01O82_A13418AlbProID = new int[1] ;
      T01O82_A13442AlbProLine = new short[1] ;
      T01O82_A13448AlbProDsc = new String[] {""} ;
      T01O82_n13448AlbProDsc = new boolean[] {false} ;
      T01O82_A13449AlbProCaja = new short[1] ;
      T01O82_n13449AlbProCaja = new boolean[] {false} ;
      T01O82_A13444AlbProUnd = new String[] {""} ;
      T01O82_n13444AlbProUnd = new boolean[] {false} ;
      T01O82_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O82_n13443AlbProCnt = new boolean[] {false} ;
      T01O82_A13447AlbProObsL = new String[] {""} ;
      T01O82_n13447AlbProObsL = new boolean[] {false} ;
      T01O82_A13445AlbProNRef = new String[] {""} ;
      T01O82_n13445AlbProNRef = new boolean[] {false} ;
      T01O82_A13446AlbProVRef = new String[] {""} ;
      T01O82_n13446AlbProVRef = new boolean[] {false} ;
      T01O82_A13852AlbProPrvp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O82_n13852AlbProPrvp = new boolean[] {false} ;
      T01O82_A13853AlbProDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O82_n13853AlbProDto = new boolean[] {false} ;
      T01O82_A396EmprCod = new String[] {""} ;
      T01O82_A719PrdNum = new String[] {""} ;
      T01O854_A718PrdNom = new String[] {""} ;
      T01O854_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O855_A396EmprCod = new String[] {""} ;
      T01O855_A13418AlbProID = new int[1] ;
      T01O855_A13442AlbProLine = new short[1] ;
      Gridlevel_lalproRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_lalpro_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i13430AlbProDate = GXutil.nullDate() ;
      i13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      i13436AlbProIDAT = "" ;
      i13435AlbProEnvA = "" ;
      i13444AlbProUnd = "" ;
      Gridlevel_lalproColumn = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13854CatDocNomI = "" ;
      T01O856_A13854CatDocNomI = new String[] {""} ;
      l13719PrvNNom = "" ;
      T01O857_A13719PrvNNom = new String[] {""} ;
      l13738TrnCNom = "" ;
      T01O858_A13738TrnCNom = new String[] {""} ;
      T01O859_A13854CatDocNomI = new String[] {""} ;
      T01O859_A396EmprCod = new String[] {""} ;
      T01O859_A13453CatDocID = new short[1] ;
      T01O859_n13453CatDocID = new boolean[] {false} ;
      T01O860_A13719PrvNNom = new String[] {""} ;
      T01O860_A396EmprCod = new String[] {""} ;
      T01O860_A795PrvNum = new int[1] ;
      T01O861_A13738TrnCNom = new String[] {""} ;
      T01O861_A396EmprCod = new String[] {""} ;
      T01O861_A840TrnCod = new short[1] ;
      T01O861_n840TrnCod = new boolean[] {false} ;
      GXv_char4 = new String[1] ;
      GXv_int19 = new short[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      ZV49contcod = "" ;
      T01O862_A13719PrvNNom = new String[] {""} ;
      T01O862_A396EmprCod = new String[] {""} ;
      T01O862_A795PrvNum = new int[1] ;
      T01O863_A13719PrvNNom = new String[] {""} ;
      T01O863_A396EmprCod = new String[] {""} ;
      T01O863_A795PrvNum = new int[1] ;
      Zh13419AlbProPrvI = "" ;
      GXt_dtime13 = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime10 = new java.util.Date[1] ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_date9 = new java.util.Date[1] ;
      ZV42Fch = GXutil.nullDate() ;
      ZV40Msg_f = "" ;
      T01O864_A13854CatDocNomI = new String[] {""} ;
      T01O864_A396EmprCod = new String[] {""} ;
      T01O864_A13453CatDocID = new short[1] ;
      T01O864_n13453CatDocID = new boolean[] {false} ;
      T01O865_A13454CatDocNom = new String[] {""} ;
      T01O865_n13454CatDocNom = new boolean[] {false} ;
      Zh13453CatDocID = "" ;
      T01O866_A13719PrvNNom = new String[] {""} ;
      T01O866_A396EmprCod = new String[] {""} ;
      T01O866_A795PrvNum = new int[1] ;
      T01O867_A13420AlbProPrvN = new String[] {""} ;
      T01O867_n13420AlbProPrvN = new boolean[] {false} ;
      ZV60msgInEx = "" ;
      T01O868_A13426AlbProCliN = new String[] {""} ;
      GXv_int15 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      T01O869_A13738TrnCNom = new String[] {""} ;
      T01O869_A396EmprCod = new String[] {""} ;
      T01O869_A840TrnCod = new short[1] ;
      T01O869_n840TrnCod = new boolean[] {false} ;
      T01O870_A841TrnNom = new String[] {""} ;
      T01O870_n841TrnNom = new boolean[] {false} ;
      Zh840TrnCod = "" ;
      GXv_int20 = new int[1] ;
      ZV56PrdnumOld = "" ;
      ZV53msg_errprv = "" ;
      ZV55AlbProDscold = "" ;
      GXv_char22 = new String[1] ;
      GXv_char21 = new String[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_char18 = new String[1] ;
      ZV51AlbProCntold = DecimalUtil.ZERO ;
      ZV57Msg_errcant = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcalpro__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcalpro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcalpro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcalpro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcalpro__default(),
         new Object[] {
             new Object[] {
            T01O82_A13418AlbProID, T01O82_A13442AlbProLine, T01O82_A13448AlbProDsc, T01O82_n13448AlbProDsc, T01O82_A13449AlbProCaja, T01O82_n13449AlbProCaja, T01O82_A13444AlbProUnd, T01O82_n13444AlbProUnd, T01O82_A13443AlbProCnt, T01O82_n13443AlbProCnt,
            T01O82_A13447AlbProObsL, T01O82_n13447AlbProObsL, T01O82_A13445AlbProNRef, T01O82_n13445AlbProNRef, T01O82_A13446AlbProVRef, T01O82_n13446AlbProVRef, T01O82_A13852AlbProPrvp, T01O82_n13852AlbProPrvp, T01O82_A13853AlbProDto, T01O82_n13853AlbProDto,
            T01O82_A396EmprCod, T01O82_A719PrdNum
            }
            , new Object[] {
            T01O83_A13418AlbProID, T01O83_A13442AlbProLine, T01O83_A13448AlbProDsc, T01O83_n13448AlbProDsc, T01O83_A13449AlbProCaja, T01O83_n13449AlbProCaja, T01O83_A13444AlbProUnd, T01O83_n13444AlbProUnd, T01O83_A13443AlbProCnt, T01O83_n13443AlbProCnt,
            T01O83_A13447AlbProObsL, T01O83_n13447AlbProObsL, T01O83_A13445AlbProNRef, T01O83_n13445AlbProNRef, T01O83_A13446AlbProVRef, T01O83_n13446AlbProVRef, T01O83_A13852AlbProPrvp, T01O83_n13852AlbProPrvp, T01O83_A13853AlbProDto, T01O83_n13853AlbProDto,
            T01O83_A396EmprCod, T01O83_A719PrdNum
            }
            , new Object[] {
            T01O84_A718PrdNom, T01O84_A704PrdExiAlm
            }
            , new Object[] {
            T01O85_A13418AlbProID, T01O85_A13429AlbProSal, T01O85_A13452AlbProInEx, T01O85_A13417AlbProTipo, T01O85_A13430AlbProDate, T01O85_A13427AlbProDomE, T01O85_A13424AlbProMatr, T01O85_A13439AlbProObs, T01O85_A13437AlbProSta, T01O85_A13431AlbProSys,
            T01O85_A13433AlbProHh, T01O85_A13434AlbProHhCt, T01O85_A13435AlbProEnvA, T01O85_A13436AlbProIDAT, T01O85_A13438AlbProStAT, T01O85_A13440AlbProAnul, T01O85_A13441AlbProUltL, T01O85_A13579AlbProLC1, T01O85_A13580AlbProLC2, T01O85_A13581AlbProLC3,
            T01O85_A13582AlbProLD1, T01O85_A13583AlbProLD2, T01O85_A13584AlbProLD3, T01O85_A14190AlbProATCU, T01O85_n14190AlbProATCU, T01O85_A14191AlbProSerA, T01O85_n14191AlbProSerA, T01O85_A14192AlbProTipA, T01O85_n14192AlbProTipA, T01O85_A396EmprCod,
            T01O85_A13425AlbProCliC, T01O85_A13419AlbProPrvI, T01O85_A840TrnCod, T01O85_n840TrnCod, T01O85_A13453CatDocID, T01O85_n13453CatDocID
            }
            , new Object[] {
            T01O86_A13418AlbProID, T01O86_A13429AlbProSal, T01O86_A13452AlbProInEx, T01O86_A13417AlbProTipo, T01O86_A13430AlbProDate, T01O86_A13427AlbProDomE, T01O86_A13424AlbProMatr, T01O86_A13439AlbProObs, T01O86_A13437AlbProSta, T01O86_A13431AlbProSys,
            T01O86_A13433AlbProHh, T01O86_A13434AlbProHhCt, T01O86_A13435AlbProEnvA, T01O86_A13436AlbProIDAT, T01O86_A13438AlbProStAT, T01O86_A13440AlbProAnul, T01O86_A13441AlbProUltL, T01O86_A13579AlbProLC1, T01O86_A13580AlbProLC2, T01O86_A13581AlbProLC3,
            T01O86_A13582AlbProLD1, T01O86_A13583AlbProLD2, T01O86_A13584AlbProLD3, T01O86_A14190AlbProATCU, T01O86_n14190AlbProATCU, T01O86_A14191AlbProSerA, T01O86_n14191AlbProSerA, T01O86_A14192AlbProTipA, T01O86_n14192AlbProTipA, T01O86_A396EmprCod,
            T01O86_A13425AlbProCliC, T01O86_A13419AlbProPrvI, T01O86_A840TrnCod, T01O86_n840TrnCod, T01O86_A13453CatDocID, T01O86_n13453CatDocID
            }
            , new Object[] {
            T01O87_A407EmprNom, T01O87_n407EmprNom
            }
            , new Object[] {
            T01O88_A13426AlbProCliN
            }
            , new Object[] {
            T01O89_A13426AlbProCliN
            }
            , new Object[] {
            T01O810_A13420AlbProPrvN, T01O810_n13420AlbProPrvN
            }
            , new Object[] {
            T01O811_A13420AlbProPrvN, T01O811_n13420AlbProPrvN
            }
            , new Object[] {
            T01O812_A841TrnNom, T01O812_n841TrnNom
            }
            , new Object[] {
            T01O813_A13454CatDocNom, T01O813_n13454CatDocNom
            }
            , new Object[] {
            T01O814_A13738TrnCNom, T01O814_A396EmprCod, T01O814_A840TrnCod
            }
            , new Object[] {
            T01O815_A13854CatDocNomI, T01O815_A396EmprCod, T01O815_A13453CatDocID
            }
            , new Object[] {
            T01O816_A13418AlbProID, T01O816_A13420AlbProPrvN, T01O816_n13420AlbProPrvN, T01O816_A13426AlbProCliN, T01O816_A13429AlbProSal, T01O816_A407EmprNom, T01O816_n407EmprNom, T01O816_A13452AlbProInEx, T01O816_A13417AlbProTipo, T01O816_A13430AlbProDate,
            T01O816_A13454CatDocNom, T01O816_n13454CatDocNom, T01O816_A13427AlbProDomE, T01O816_A841TrnNom, T01O816_n841TrnNom, T01O816_A13424AlbProMatr, T01O816_A13439AlbProObs, T01O816_A13437AlbProSta, T01O816_A13431AlbProSys, T01O816_A13433AlbProHh,
            T01O816_A13434AlbProHhCt, T01O816_A13435AlbProEnvA, T01O816_A13436AlbProIDAT, T01O816_A13438AlbProStAT, T01O816_A13440AlbProAnul, T01O816_A13441AlbProUltL, T01O816_A13579AlbProLC1, T01O816_A13580AlbProLC2, T01O816_A13581AlbProLC3, T01O816_A13582AlbProLD1,
            T01O816_A13583AlbProLD2, T01O816_A13584AlbProLD3, T01O816_A14190AlbProATCU, T01O816_n14190AlbProATCU, T01O816_A14191AlbProSerA, T01O816_n14191AlbProSerA, T01O816_A14192AlbProTipA, T01O816_n14192AlbProTipA, T01O816_A396EmprCod, T01O816_A13425AlbProCliC,
            T01O816_A13419AlbProPrvI, T01O816_A840TrnCod, T01O816_n840TrnCod, T01O816_A13453CatDocID, T01O816_n13453CatDocID
            }
            , new Object[] {
            T01O817_A13719PrvNNom, T01O817_A396EmprCod, T01O817_A795PrvNum
            }
            , new Object[] {
            T01O818_A13719PrvNNom, T01O818_A396EmprCod, T01O818_A795PrvNum
            }
            , new Object[] {
            T01O819_A13854CatDocNomI, T01O819_A396EmprCod, T01O819_A13453CatDocID
            }
            , new Object[] {
            T01O820_A13719PrvNNom, T01O820_A396EmprCod, T01O820_A795PrvNum
            }
            , new Object[] {
            T01O821_A13738TrnCNom, T01O821_A396EmprCod, T01O821_A840TrnCod
            }
            , new Object[] {
            T01O822_A13854CatDocNomI, T01O822_A396EmprCod, T01O822_A13453CatDocID
            }
            , new Object[] {
            T01O823_A13738TrnCNom, T01O823_A396EmprCod, T01O823_A840TrnCod
            }
            , new Object[] {
            T01O824_A13719PrvNNom, T01O824_A396EmprCod, T01O824_A795PrvNum
            }
            , new Object[] {
            T01O825_A13719PrvNNom, T01O825_A396EmprCod, T01O825_A795PrvNum
            }
            , new Object[] {
            T01O826_A13854CatDocNomI, T01O826_A396EmprCod, T01O826_A13453CatDocID
            }
            , new Object[] {
            T01O827_A13738TrnCNom, T01O827_A396EmprCod, T01O827_A840TrnCod
            }
            , new Object[] {
            T01O828_A841TrnNom, T01O828_n841TrnNom
            }
            , new Object[] {
            T01O829_A13454CatDocNom, T01O829_n13454CatDocNom
            }
            , new Object[] {
            T01O830_A396EmprCod, T01O830_A13418AlbProID
            }
            , new Object[] {
            T01O831_A396EmprCod, T01O831_A13418AlbProID
            }
            , new Object[] {
            T01O832_A396EmprCod, T01O832_A13418AlbProID
            }
            , new Object[] {
            T01O833_A13854CatDocNomI, T01O833_A396EmprCod, T01O833_A13453CatDocID
            }
            , new Object[] {
            T01O834_A13738TrnCNom, T01O834_A396EmprCod, T01O834_A840TrnCod
            }
            , new Object[] {
            T01O835_A13426AlbProCliN
            }
            , new Object[] {
            T01O836_A13420AlbProPrvN, T01O836_n13420AlbProPrvN
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O840_A13426AlbProCliN
            }
            , new Object[] {
            T01O841_A13420AlbProPrvN, T01O841_n13420AlbProPrvN
            }
            , new Object[] {
            T01O842_A841TrnNom, T01O842_n841TrnNom
            }
            , new Object[] {
            T01O843_A13454CatDocNom, T01O843_n13454CatDocNom
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O847_A396EmprCod, T01O847_A13418AlbProID
            }
            , new Object[] {
            T01O848_A13418AlbProID, T01O848_A13442AlbProLine, T01O848_A13448AlbProDsc, T01O848_n13448AlbProDsc, T01O848_A13449AlbProCaja, T01O848_n13449AlbProCaja, T01O848_A13444AlbProUnd, T01O848_n13444AlbProUnd, T01O848_A13443AlbProCnt, T01O848_n13443AlbProCnt,
            T01O848_A13447AlbProObsL, T01O848_n13447AlbProObsL, T01O848_A718PrdNom, T01O848_A704PrdExiAlm, T01O848_A13445AlbProNRef, T01O848_n13445AlbProNRef, T01O848_A13446AlbProVRef, T01O848_n13446AlbProVRef, T01O848_A13852AlbProPrvp, T01O848_n13852AlbProPrvp,
            T01O848_A13853AlbProDto, T01O848_n13853AlbProDto, T01O848_A396EmprCod, T01O848_A719PrdNum
            }
            , new Object[] {
            T01O849_A718PrdNom, T01O849_A704PrdExiAlm
            }
            , new Object[] {
            T01O850_A396EmprCod, T01O850_A13418AlbProID, T01O850_A13442AlbProLine
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O854_A718PrdNom, T01O854_A704PrdExiAlm
            }
            , new Object[] {
            T01O855_A396EmprCod, T01O855_A13418AlbProID, T01O855_A13442AlbProLine
            }
            , new Object[] {
            T01O856_A13854CatDocNomI
            }
            , new Object[] {
            T01O857_A13719PrvNNom
            }
            , new Object[] {
            T01O858_A13738TrnCNom
            }
            , new Object[] {
            T01O859_A13854CatDocNomI, T01O859_A396EmprCod, T01O859_A13453CatDocID
            }
            , new Object[] {
            T01O860_A13719PrvNNom, T01O860_A396EmprCod, T01O860_A795PrvNum
            }
            , new Object[] {
            T01O861_A13738TrnCNom, T01O861_A396EmprCod, T01O861_A840TrnCod
            }
            , new Object[] {
            T01O862_A13719PrvNNom, T01O862_A396EmprCod, T01O862_A795PrvNum
            }
            , new Object[] {
            T01O863_A13719PrvNNom, T01O863_A396EmprCod, T01O863_A795PrvNum
            }
            , new Object[] {
            T01O864_A13854CatDocNomI, T01O864_A396EmprCod, T01O864_A13453CatDocID
            }
            , new Object[] {
            T01O865_A13454CatDocNom, T01O865_n13454CatDocNom
            }
            , new Object[] {
            T01O866_A13719PrvNNom, T01O866_A396EmprCod, T01O866_A795PrvNum
            }
            , new Object[] {
            T01O867_A13420AlbProPrvN, T01O867_n13420AlbProPrvN
            }
            , new Object[] {
            T01O868_A13426AlbProCliN
            }
            , new Object[] {
            T01O869_A13738TrnCNom, T01O869_A396EmprCod, T01O869_A840TrnCod
            }
            , new Object[] {
            T01O870_A841TrnNom, T01O870_n841TrnNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV77Pgmname = "TCALPRO" ;
      Z13452AlbProInEx = (byte)(1) ;
      i13452AlbProInEx = (byte)(1) ;
      A13452AlbProInEx = (byte)(1) ;
      Z13444AlbProUnd = " " ;
      n13444AlbProUnd = false ;
      A13444AlbProUnd = " " ;
      n13444AlbProUnd = false ;
      i13444AlbProUnd = " " ;
      n13444AlbProUnd = false ;
      Z13449AlbProCaja = (short)(1) ;
      n13449AlbProCaja = false ;
      A13449AlbProCaja = (short)(1) ;
      n13449AlbProCaja = false ;
      i13449AlbProCaja = (short)(1) ;
      n13449AlbProCaja = false ;
      Z13448AlbProDsc = "" ;
      n13448AlbProDsc = false ;
      O13448AlbProDsc = "" ;
      n13448AlbProDsc = false ;
      A13448AlbProDsc = "" ;
      n13448AlbProDsc = false ;
      T13448AlbProDsc = "" ;
      n13448AlbProDsc = false ;
      Z13435AlbProEnvA = " " ;
      A13435AlbProEnvA = " " ;
      i13435AlbProEnvA = " " ;
      Z13436AlbProIDAT = " " ;
      A13436AlbProIDAT = " " ;
      i13436AlbProIDAT = " " ;
      Z13437AlbProSta = (byte)(0) ;
      A13437AlbProSta = (byte)(0) ;
      i13437AlbProSta = (byte)(0) ;
      Z13438AlbProStAT = (byte)(0) ;
      A13438AlbProStAT = (byte)(0) ;
      i13438AlbProStAT = (byte)(0) ;
      Z13431AlbProSys = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A13431AlbProSys = GXutil.serverNow( context, remoteHandle, pr_default) ;
      i13431AlbProSys = GXutil.serverNow( context, remoteHandle, pr_default) ;
      Z13430AlbProDate = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i13430AlbProDate = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A13430AlbProDate = GXutil.serverDate( context, remoteHandle, pr_default) ;
   }

   private byte Z13452AlbProInEx ;
   private byte Z13427AlbProDomE ;
   private byte Z13437AlbProSta ;
   private byte Z13438AlbProStAT ;
   private byte GxWebError ;
   private byte AV43Ctrlf ;
   private byte AV44FlagCli ;
   private byte A13452AlbProInEx ;
   private byte AV45FlagProv ;
   private byte A13427AlbProDomE ;
   private byte AV46FlagDom ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A13437AlbProSta ;
   private byte A13438AlbProStAT ;
   private byte AV34FirmaD ;
   private byte AV50DevCant ;
   private byte AV36cernum ;
   private byte AV35RemTra ;
   private byte AV48TraExt ;
   private byte AV38Ws ;
   private byte AV39Modhh ;
   private byte AV61Endutex ;
   private byte subGridlevel_lalpro_Backcolorstyle ;
   private byte subGridlevel_lalpro_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i13438AlbProStAT ;
   private byte i13437AlbProSta ;
   private byte i13452AlbProInEx ;
   private byte subGridlevel_lalpro_Allowselection ;
   private byte subGridlevel_lalpro_Allowhovering ;
   private byte subGridlevel_lalpro_Allowcollapsing ;
   private byte subGridlevel_lalpro_Collapsed ;
   private byte GXt_int5 ;
   private byte ZV45FlagProv ;
   private byte ZV44FlagCli ;
   private byte GXv_int15[] ;
   private byte GXv_int6[] ;
   private byte ZV46FlagDom ;
   private short Z13441AlbProUltL ;
   private short Z840TrnCod ;
   private short Z13453CatDocID ;
   private short O13441AlbProUltL ;
   private short N13453CatDocID ;
   private short N840TrnCod ;
   private short Z13442AlbProLine ;
   private short Z13449AlbProCaja ;
   private short O13442AlbProLine ;
   private short nRcdDeleted_1839 ;
   private short nRcdExists_1839 ;
   private short nIsMod_1839 ;
   private short A840TrnCod ;
   private short A13453CatDocID ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13441AlbProUltL ;
   private short nBlankRcdCount1839 ;
   private short RcdFound1839 ;
   private short B13441AlbProUltL ;
   private short nBlankRcdUsr1839 ;
   private short AV65Insert_CatDocID ;
   private short AV68Insert_TrnCod ;
   private short AV54AlbProLineaOld ;
   private short RcdFound1838 ;
   private short s13441AlbProUltL ;
   private short A13442AlbProLine ;
   private short A13449AlbProCaja ;
   private short T13442AlbProLine ;
   private short nIsDirty_1838 ;
   private short nIsDirty_1839 ;
   private short i13441AlbProUltL ;
   private short i13449AlbProCaja ;
   private short gxhchits ;
   private short GXv_int19[] ;
   private short ZV54AlbProLineaOld ;
   private int wcpOAV33AlbProID ;
   private int Z13418AlbProID ;
   private int Z13425AlbProCliC ;
   private int Z13419AlbProPrvI ;
   private int nRC_GXsfl_132 ;
   private int nGXsfl_132_idx=1 ;
   private int N13419AlbProPrvI ;
   private int N13425AlbProCliC ;
   private int A13418AlbProID ;
   private int AV41AlbLast ;
   private int A13425AlbProCliC ;
   private int A13419AlbProPrvI ;
   private int AV33AlbProID ;
   private int trnEnded ;
   private int edtAlbProID_Enabled ;
   private int edtAlbProDate_Enabled ;
   private int edtAlbProSal_Enabled ;
   private int edtCatDocID_Enabled ;
   private int edtAlbProPrvI_Visible ;
   private int edtAlbProPrvI_Enabled ;
   private int edtAlbProCliC_Visible ;
   private int edtAlbProCliC_Enabled ;
   private int imgprompt_13425_Visible ;
   private int edtAlbProCliN_Enabled ;
   private int edtAlbProDomE_Enabled ;
   private int imgprompt_13425_13427_Visible ;
   private int edtTrnCod_Enabled ;
   private int edtAlbProMatr_Enabled ;
   private int edtAlbProObs_Enabled ;
   private int edtAlbProLC1_Enabled ;
   private int edtAlbProLC2_Enabled ;
   private int edtAlbProLC3_Enabled ;
   private int edtAlbProLD1_Enabled ;
   private int edtAlbProLD2_Enabled ;
   private int edtAlbProLD3_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbProSta_Enabled ;
   private int edtAlbProSta_Visible ;
   private int edtAlbProSys_Visible ;
   private int edtAlbProSys_Enabled ;
   private int edtAlbProHh_Visible ;
   private int edtAlbProHh_Enabled ;
   private int edtAlbProHhCt_Visible ;
   private int edtAlbProHhCt_Enabled ;
   private int edtAlbProEnvA_Visible ;
   private int edtAlbProEnvA_Enabled ;
   private int edtAlbProIDAT_Visible ;
   private int edtAlbProIDAT_Enabled ;
   private int edtAlbProStAT_Enabled ;
   private int edtAlbProStAT_Visible ;
   private int edtAlbProUltL_Enabled ;
   private int edtAlbProUltL_Visible ;
   private int edtAlbProAnul_Visible ;
   private int edtAlbProAnul_Enabled ;
   private int edtAlbProLine_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNum_Visible ;
   private int edtAlbProDsc_Enabled ;
   private int edtAlbProCnt_Enabled ;
   private int edtAlbProCaja_Enabled ;
   private int edtAlbProObsL_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtAlbProNRef_Enabled ;
   private int edtAlbProVRef_Enabled ;
   private int edtAlbProPrvp_Enabled ;
   private int edtAlbProDto_Enabled ;
   private int fRowAdded ;
   private int AV66Insert_AlbProPrvID ;
   private int AV67Insert_AlbProCliCod ;
   private int AV79GXV1 ;
   private int GX_JID ;
   private int subGridlevel_lalpro_Backcolor ;
   private int subGridlevel_lalpro_Allbackcolor ;
   private int defedtAlbProDto_Enabled ;
   private int defedtAlbProPrvp_Enabled ;
   private int defedtAlbProVRef_Enabled ;
   private int defedtAlbProNRef_Enabled ;
   private int defedtPrdExiAlm_Enabled ;
   private int defedtPrdNom_Enabled ;
   private int defedtAlbProLine_Enabled ;
   private int idxLst ;
   private int subGridlevel_lalpro_Selectedindex ;
   private int subGridlevel_lalpro_Selectioncolor ;
   private int subGridlevel_lalpro_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int A795PrvNum ;
   private int GXv_int8[] ;
   private int ZV41AlbLast ;
   private int GXv_int20[] ;
   private long GRIDLEVEL_LALPRO_nFirstRecordOnPage ;
   private java.math.BigDecimal Z13443AlbProCnt ;
   private java.math.BigDecimal Z13852AlbProPrvp ;
   private java.math.BigDecimal Z13853AlbProDto ;
   private java.math.BigDecimal O13443AlbProCnt ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private java.math.BigDecimal AV51AlbProCntold ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A13852AlbProPrvp ;
   private java.math.BigDecimal A13853AlbProDto ;
   private java.math.BigDecimal T13443AlbProCnt ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal ZV51AlbProCntold ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String Z396EmprCod ;
   private String Z13417AlbProTipo ;
   private String Z13424AlbProMatr ;
   private String Z13435AlbProEnvA ;
   private String Z13436AlbProIDAT ;
   private String Z13440AlbProAnul ;
   private String Z13579AlbProLC1 ;
   private String Z13580AlbProLC2 ;
   private String Z13581AlbProLC3 ;
   private String Z13582AlbProLD1 ;
   private String Z13583AlbProLD2 ;
   private String Z13584AlbProLD3 ;
   private String Z14190AlbProATCU ;
   private String Z14191AlbProSerA ;
   private String Z14192AlbProTipA ;
   private String Z13426AlbProCliN ;
   private String Z13420AlbProPrvN ;
   private String Z13448AlbProDsc ;
   private String Z13444AlbProUnd ;
   private String Z13447AlbProObsL ;
   private String Z13445AlbProNRef ;
   private String Z13446AlbProVRef ;
   private String Z719PrdNum ;
   private String O719PrdNum ;
   private String O13448AlbProDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV49contcod ;
   private String AV40Msg_f ;
   private String A13417AlbProTipo ;
   private String AV60msgInEx ;
   private String A719PrdNum ;
   private String AV53msg_errprv ;
   private String Gx_mode ;
   private String AV57Msg_errcant ;
   private String AV77Pgmname ;
   private String AV8UsurCod ;
   private String AV12Station ;
   private String AV32EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String sGXsfl_132_idx="0001" ;
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
   private String edtAlbProID_Internalname ;
   private String TempTags ;
   private String edtAlbProID_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divAlbproinex_cell_Internalname ;
   private String divAlbproinex_cell_Class ;
   private String edtAlbProDate_Internalname ;
   private String edtAlbProDate_Jsonclick ;
   private String edtAlbProSal_Internalname ;
   private String edtAlbProSal_Jsonclick ;
   private String edtCatDocID_Internalname ;
   private String edtCatDocID_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divAlbproprvid_cell_Internalname ;
   private String divAlbproprvid_cell_Class ;
   private String edtAlbProPrvI_Internalname ;
   private String edtAlbProPrvI_Jsonclick ;
   private String divAlbproclicod_cell_Internalname ;
   private String divAlbproclicod_cell_Class ;
   private String edtAlbProCliC_Internalname ;
   private String edtAlbProCliC_Jsonclick ;
   private String imgprompt_13425_gximage ;
   private String sImgUrl ;
   private String imgprompt_13425_Internalname ;
   private String imgprompt_13425_Link ;
   private String edtAlbProCliN_Internalname ;
   private String A13426AlbProCliN ;
   private String edtAlbProCliN_Jsonclick ;
   private String edtAlbProDomE_Internalname ;
   private String edtAlbProDomE_Jsonclick ;
   private String imgprompt_13425_13427_gximage ;
   private String imgprompt_13425_13427_Internalname ;
   private String imgprompt_13425_13427_Link ;
   private String divUnnamedtable4_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtAlbProMatr_Internalname ;
   private String A13424AlbProMatr ;
   private String edtAlbProMatr_Jsonclick ;
   private String edtAlbProObs_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String grpUnnamedgroup7_Internalname ;
   private String grpUnnamedgroup7_Class ;
   private String sStyleString ;
   private String tblUnnamedtable6_Internalname ;
   private String edtAlbProLC1_Internalname ;
   private String A13579AlbProLC1 ;
   private String edtAlbProLC1_Jsonclick ;
   private String edtAlbProLC2_Internalname ;
   private String A13580AlbProLC2 ;
   private String edtAlbProLC2_Jsonclick ;
   private String edtAlbProLC3_Internalname ;
   private String A13581AlbProLC3 ;
   private String edtAlbProLC3_Jsonclick ;
   private String grpUnnamedgroup9_Internalname ;
   private String grpUnnamedgroup9_Class ;
   private String tblUnnamedtable8_Internalname ;
   private String edtAlbProLD1_Internalname ;
   private String A13582AlbProLD1 ;
   private String edtAlbProLD1_Jsonclick ;
   private String edtAlbProLD2_Internalname ;
   private String A13583AlbProLD2 ;
   private String edtAlbProLD2_Jsonclick ;
   private String edtAlbProLD3_Internalname ;
   private String A13584AlbProLD3 ;
   private String edtAlbProLD3_Jsonclick ;
   private String divTableleaflevel_lalpro_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtAlbProSta_Internalname ;
   private String edtAlbProSta_Jsonclick ;
   private String edtAlbProSys_Internalname ;
   private String edtAlbProSys_Jsonclick ;
   private String edtAlbProHh_Internalname ;
   private String edtAlbProHhCt_Internalname ;
   private String edtAlbProEnvA_Internalname ;
   private String A13435AlbProEnvA ;
   private String edtAlbProEnvA_Jsonclick ;
   private String edtAlbProIDAT_Internalname ;
   private String A13436AlbProIDAT ;
   private String edtAlbProIDAT_Jsonclick ;
   private String edtAlbProStAT_Internalname ;
   private String edtAlbProStAT_Jsonclick ;
   private String edtAlbProUltL_Internalname ;
   private String edtAlbProUltL_Jsonclick ;
   private String edtAlbProAnul_Internalname ;
   private String A13440AlbProAnul ;
   private String edtAlbProAnul_Jsonclick ;
   private String sMode1839 ;
   private String edtAlbProLine_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtAlbProDsc_Internalname ;
   private String edtAlbProCnt_Internalname ;
   private String edtAlbProCaja_Internalname ;
   private String edtAlbProObsL_Internalname ;
   private String edtPrdNom_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtAlbProNRef_Internalname ;
   private String edtAlbProVRef_Internalname ;
   private String edtAlbProPrvp_Internalname ;
   private String edtAlbProDto_Internalname ;
   private String subGridlevel_lalpro_Internalname ;
   private String A14190AlbProATCU ;
   private String A14191AlbProSerA ;
   private String A14192AlbProTipA ;
   private String A13420AlbProPrvN ;
   private String AV37Msg_errAT ;
   private String A407EmprNom ;
   private String A841TrnNom ;
   private String A13454CatDocNom ;
   private String AV55AlbProDscold ;
   private String AV56PrdnumOld ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1838 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A13448AlbProDsc ;
   private String A13444AlbProUnd ;
   private String A13447AlbProObsL ;
   private String A718PrdNom ;
   private String A13445AlbProNRef ;
   private String A13446AlbProVRef ;
   private String T719PrdNum ;
   private String T13448AlbProDsc ;
   private String AV11EmprNom ;
   private String AV78Path ;
   private String AV58Msg_dev ;
   private String GXt_char1 ;
   private String AV70Cadena ;
   private String AV71Hash ;
   private String Z407EmprNom ;
   private String Z13454CatDocNom ;
   private String Z841TrnNom ;
   private String Z718PrdNom ;
   private String sGXsfl_132_fel_idx="0001" ;
   private String subGridlevel_lalpro_Class ;
   private String subGridlevel_lalpro_Linesclass ;
   private String ROClassString ;
   private String edtAlbProLine_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtAlbProDsc_Jsonclick ;
   private String edtAlbProCnt_Jsonclick ;
   private String edtAlbProCaja_Jsonclick ;
   private String edtAlbProObsL_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtAlbProNRef_Jsonclick ;
   private String edtAlbProVRef_Jsonclick ;
   private String edtAlbProPrvp_Jsonclick ;
   private String edtAlbProDto_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i13436AlbProIDAT ;
   private String i13435AlbProEnvA ;
   private String i13444AlbProUnd ;
   private String subGridlevel_lalpro_Header ;
   private String gxwrpcisep ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV49contcod ;
   private String ZV40Msg_f ;
   private String ZV60msgInEx ;
   private String ZV56PrdnumOld ;
   private String ZV53msg_errprv ;
   private String ZV55AlbProDscold ;
   private String GXv_char22[] ;
   private String GXv_char21[] ;
   private String GXv_char18[] ;
   private String ZV57Msg_errcant ;
   private java.util.Date Z13429AlbProSal ;
   private java.util.Date Z13431AlbProSys ;
   private java.util.Date A13429AlbProSal ;
   private java.util.Date A13431AlbProSys ;
   private java.util.Date i13431AlbProSys ;
   private java.util.Date GXt_dtime13 ;
   private java.util.Date GXv_dtime10[] ;
   private java.util.Date Z13430AlbProDate ;
   private java.util.Date AV42Fch ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date i13430AlbProDate ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date GXv_date9[] ;
   private java.util.Date ZV42Fch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n13443AlbProCnt ;
   private boolean n840TrnCod ;
   private boolean n13453CatDocID ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_132_Refreshing=false ;
   private boolean n14190AlbProATCU ;
   private boolean n14191AlbProSerA ;
   private boolean n14192AlbProTipA ;
   private boolean n13420AlbProPrvN ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n13454CatDocNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean AV75OK ;
   private boolean GXv_boolean12[] ;
   private boolean Gx_longc ;
   private boolean n13449AlbProCaja ;
   private boolean n13444AlbProUnd ;
   private boolean n13448AlbProDsc ;
   private boolean n13447AlbProObsL ;
   private boolean n13445AlbProNRef ;
   private boolean n13446AlbProVRef ;
   private boolean n13852AlbProPrvp ;
   private boolean n13853AlbProDto ;
   private String Z13439AlbProObs ;
   private String Z13433AlbProHh ;
   private String Z13434AlbProHhCt ;
   private String AV47Inc_obs ;
   private String A13854CatDocNomI ;
   private String A13719PrvNNom ;
   private String A13738TrnCNom ;
   private String h13453CatDocID ;
   private String h13419AlbProPrvI ;
   private String h840TrnCod ;
   private String A13439AlbProObs ;
   private String A13433AlbProHh ;
   private String A13434AlbProHhCt ;
   private String AV73firma ;
   private String l13854CatDocNomI ;
   private String l13719PrvNNom ;
   private String l13738TrnCNom ;
   private String Zh13419AlbProPrvI ;
   private String Zh13453CatDocID ;
   private String Zh840TrnCod ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_lalproContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_lalproRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_lalproColumn ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV64WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbProInEx ;
   private HTMLChoice cmbAlbProTipo ;
   private HTMLChoice cmbAlbProUnd ;
   private IDataStoreProvider pr_default ;
   private String[] T01O87_A407EmprNom ;
   private boolean[] T01O87_n407EmprNom ;
   private String[] T01O814_A13738TrnCNom ;
   private String[] T01O814_A396EmprCod ;
   private short[] T01O814_A840TrnCod ;
   private boolean[] T01O814_n840TrnCod ;
   private String[] T01O815_A13854CatDocNomI ;
   private String[] T01O815_A396EmprCod ;
   private short[] T01O815_A13453CatDocID ;
   private boolean[] T01O815_n13453CatDocID ;
   private String[] T01O812_A841TrnNom ;
   private boolean[] T01O812_n841TrnNom ;
   private String[] T01O813_A13454CatDocNom ;
   private boolean[] T01O813_n13454CatDocNom ;
   private int[] T01O816_A13418AlbProID ;
   private String[] T01O816_A13420AlbProPrvN ;
   private boolean[] T01O816_n13420AlbProPrvN ;
   private String[] T01O816_A13426AlbProCliN ;
   private java.util.Date[] T01O816_A13429AlbProSal ;
   private String[] T01O816_A407EmprNom ;
   private boolean[] T01O816_n407EmprNom ;
   private byte[] T01O816_A13452AlbProInEx ;
   private String[] T01O816_A13417AlbProTipo ;
   private java.util.Date[] T01O816_A13430AlbProDate ;
   private String[] T01O816_A13454CatDocNom ;
   private boolean[] T01O816_n13454CatDocNom ;
   private byte[] T01O816_A13427AlbProDomE ;
   private String[] T01O816_A841TrnNom ;
   private boolean[] T01O816_n841TrnNom ;
   private String[] T01O816_A13424AlbProMatr ;
   private String[] T01O816_A13439AlbProObs ;
   private byte[] T01O816_A13437AlbProSta ;
   private java.util.Date[] T01O816_A13431AlbProSys ;
   private String[] T01O816_A13433AlbProHh ;
   private String[] T01O816_A13434AlbProHhCt ;
   private String[] T01O816_A13435AlbProEnvA ;
   private String[] T01O816_A13436AlbProIDAT ;
   private byte[] T01O816_A13438AlbProStAT ;
   private String[] T01O816_A13440AlbProAnul ;
   private short[] T01O816_A13441AlbProUltL ;
   private String[] T01O816_A13579AlbProLC1 ;
   private String[] T01O816_A13580AlbProLC2 ;
   private String[] T01O816_A13581AlbProLC3 ;
   private String[] T01O816_A13582AlbProLD1 ;
   private String[] T01O816_A13583AlbProLD2 ;
   private String[] T01O816_A13584AlbProLD3 ;
   private String[] T01O816_A14190AlbProATCU ;
   private boolean[] T01O816_n14190AlbProATCU ;
   private String[] T01O816_A14191AlbProSerA ;
   private boolean[] T01O816_n14191AlbProSerA ;
   private String[] T01O816_A14192AlbProTipA ;
   private boolean[] T01O816_n14192AlbProTipA ;
   private String[] T01O816_A396EmprCod ;
   private int[] T01O816_A13425AlbProCliC ;
   private int[] T01O816_A13419AlbProPrvI ;
   private short[] T01O816_A840TrnCod ;
   private boolean[] T01O816_n840TrnCod ;
   private short[] T01O816_A13453CatDocID ;
   private boolean[] T01O816_n13453CatDocID ;
   private String[] T01O817_A13719PrvNNom ;
   private String[] T01O817_A396EmprCod ;
   private int[] T01O817_A795PrvNum ;
   private String[] T01O818_A13719PrvNNom ;
   private String[] T01O818_A396EmprCod ;
   private int[] T01O818_A795PrvNum ;
   private String[] T01O819_A13854CatDocNomI ;
   private String[] T01O819_A396EmprCod ;
   private short[] T01O819_A13453CatDocID ;
   private boolean[] T01O819_n13453CatDocID ;
   private String[] T01O820_A13719PrvNNom ;
   private String[] T01O820_A396EmprCod ;
   private int[] T01O820_A795PrvNum ;
   private String[] T01O821_A13738TrnCNom ;
   private String[] T01O821_A396EmprCod ;
   private short[] T01O821_A840TrnCod ;
   private boolean[] T01O821_n840TrnCod ;
   private String[] T01O822_A13854CatDocNomI ;
   private String[] T01O822_A396EmprCod ;
   private short[] T01O822_A13453CatDocID ;
   private boolean[] T01O822_n13453CatDocID ;
   private String[] T01O823_A13738TrnCNom ;
   private String[] T01O823_A396EmprCod ;
   private short[] T01O823_A840TrnCod ;
   private boolean[] T01O823_n840TrnCod ;
   private String[] T01O824_A13719PrvNNom ;
   private String[] T01O824_A396EmprCod ;
   private int[] T01O824_A795PrvNum ;
   private String[] T01O825_A13719PrvNNom ;
   private String[] T01O825_A396EmprCod ;
   private int[] T01O825_A795PrvNum ;
   private String[] T01O826_A13854CatDocNomI ;
   private String[] T01O826_A396EmprCod ;
   private short[] T01O826_A13453CatDocID ;
   private boolean[] T01O826_n13453CatDocID ;
   private String[] T01O827_A13738TrnCNom ;
   private String[] T01O827_A396EmprCod ;
   private short[] T01O827_A840TrnCod ;
   private boolean[] T01O827_n840TrnCod ;
   private String[] T01O89_A13426AlbProCliN ;
   private String[] T01O811_A13420AlbProPrvN ;
   private boolean[] T01O811_n13420AlbProPrvN ;
   private String[] T01O828_A841TrnNom ;
   private boolean[] T01O828_n841TrnNom ;
   private String[] T01O829_A13454CatDocNom ;
   private boolean[] T01O829_n13454CatDocNom ;
   private String[] T01O830_A396EmprCod ;
   private int[] T01O830_A13418AlbProID ;
   private int[] T01O86_A13418AlbProID ;
   private java.util.Date[] T01O86_A13429AlbProSal ;
   private byte[] T01O86_A13452AlbProInEx ;
   private String[] T01O86_A13417AlbProTipo ;
   private java.util.Date[] T01O86_A13430AlbProDate ;
   private byte[] T01O86_A13427AlbProDomE ;
   private String[] T01O86_A13424AlbProMatr ;
   private String[] T01O86_A13439AlbProObs ;
   private byte[] T01O86_A13437AlbProSta ;
   private java.util.Date[] T01O86_A13431AlbProSys ;
   private String[] T01O86_A13433AlbProHh ;
   private String[] T01O86_A13434AlbProHhCt ;
   private String[] T01O86_A13435AlbProEnvA ;
   private String[] T01O86_A13436AlbProIDAT ;
   private byte[] T01O86_A13438AlbProStAT ;
   private String[] T01O86_A13440AlbProAnul ;
   private short[] T01O86_A13441AlbProUltL ;
   private String[] T01O86_A13579AlbProLC1 ;
   private String[] T01O86_A13580AlbProLC2 ;
   private String[] T01O86_A13581AlbProLC3 ;
   private String[] T01O86_A13582AlbProLD1 ;
   private String[] T01O86_A13583AlbProLD2 ;
   private String[] T01O86_A13584AlbProLD3 ;
   private String[] T01O86_A14190AlbProATCU ;
   private boolean[] T01O86_n14190AlbProATCU ;
   private String[] T01O86_A14191AlbProSerA ;
   private boolean[] T01O86_n14191AlbProSerA ;
   private String[] T01O86_A14192AlbProTipA ;
   private boolean[] T01O86_n14192AlbProTipA ;
   private String[] T01O86_A396EmprCod ;
   private int[] T01O86_A13425AlbProCliC ;
   private int[] T01O86_A13419AlbProPrvI ;
   private short[] T01O86_A840TrnCod ;
   private boolean[] T01O86_n840TrnCod ;
   private short[] T01O86_A13453CatDocID ;
   private boolean[] T01O86_n13453CatDocID ;
   private String[] T01O831_A396EmprCod ;
   private int[] T01O831_A13418AlbProID ;
   private String[] T01O832_A396EmprCod ;
   private int[] T01O832_A13418AlbProID ;
   private String[] T01O833_A13854CatDocNomI ;
   private String[] T01O833_A396EmprCod ;
   private short[] T01O833_A13453CatDocID ;
   private boolean[] T01O833_n13453CatDocID ;
   private String[] T01O834_A13738TrnCNom ;
   private String[] T01O834_A396EmprCod ;
   private short[] T01O834_A840TrnCod ;
   private boolean[] T01O834_n840TrnCod ;
   private int[] T01O85_A13418AlbProID ;
   private java.util.Date[] T01O85_A13429AlbProSal ;
   private byte[] T01O85_A13452AlbProInEx ;
   private String[] T01O85_A13417AlbProTipo ;
   private java.util.Date[] T01O85_A13430AlbProDate ;
   private byte[] T01O85_A13427AlbProDomE ;
   private String[] T01O85_A13424AlbProMatr ;
   private String[] T01O85_A13439AlbProObs ;
   private byte[] T01O85_A13437AlbProSta ;
   private java.util.Date[] T01O85_A13431AlbProSys ;
   private String[] T01O85_A13433AlbProHh ;
   private String[] T01O85_A13434AlbProHhCt ;
   private String[] T01O85_A13435AlbProEnvA ;
   private String[] T01O85_A13436AlbProIDAT ;
   private byte[] T01O85_A13438AlbProStAT ;
   private String[] T01O85_A13440AlbProAnul ;
   private short[] T01O85_A13441AlbProUltL ;
   private String[] T01O85_A13579AlbProLC1 ;
   private String[] T01O85_A13580AlbProLC2 ;
   private String[] T01O85_A13581AlbProLC3 ;
   private String[] T01O85_A13582AlbProLD1 ;
   private String[] T01O85_A13583AlbProLD2 ;
   private String[] T01O85_A13584AlbProLD3 ;
   private String[] T01O85_A14190AlbProATCU ;
   private boolean[] T01O85_n14190AlbProATCU ;
   private String[] T01O85_A14191AlbProSerA ;
   private boolean[] T01O85_n14191AlbProSerA ;
   private String[] T01O85_A14192AlbProTipA ;
   private boolean[] T01O85_n14192AlbProTipA ;
   private String[] T01O85_A396EmprCod ;
   private int[] T01O85_A13425AlbProCliC ;
   private int[] T01O85_A13419AlbProPrvI ;
   private short[] T01O85_A840TrnCod ;
   private boolean[] T01O85_n840TrnCod ;
   private short[] T01O85_A13453CatDocID ;
   private boolean[] T01O85_n13453CatDocID ;
   private String[] T01O835_A13426AlbProCliN ;
   private String[] T01O836_A13420AlbProPrvN ;
   private boolean[] T01O836_n13420AlbProPrvN ;
   private String[] T01O840_A13426AlbProCliN ;
   private String[] T01O841_A13420AlbProPrvN ;
   private boolean[] T01O841_n13420AlbProPrvN ;
   private String[] T01O842_A841TrnNom ;
   private boolean[] T01O842_n841TrnNom ;
   private String[] T01O843_A13454CatDocNom ;
   private boolean[] T01O843_n13454CatDocNom ;
   private String[] T01O847_A396EmprCod ;
   private int[] T01O847_A13418AlbProID ;
   private int[] T01O848_A13418AlbProID ;
   private short[] T01O848_A13442AlbProLine ;
   private String[] T01O848_A13448AlbProDsc ;
   private boolean[] T01O848_n13448AlbProDsc ;
   private short[] T01O848_A13449AlbProCaja ;
   private boolean[] T01O848_n13449AlbProCaja ;
   private String[] T01O848_A13444AlbProUnd ;
   private boolean[] T01O848_n13444AlbProUnd ;
   private java.math.BigDecimal[] T01O848_A13443AlbProCnt ;
   private boolean[] T01O848_n13443AlbProCnt ;
   private String[] T01O848_A13447AlbProObsL ;
   private boolean[] T01O848_n13447AlbProObsL ;
   private String[] T01O848_A718PrdNom ;
   private java.math.BigDecimal[] T01O848_A704PrdExiAlm ;
   private String[] T01O848_A13445AlbProNRef ;
   private boolean[] T01O848_n13445AlbProNRef ;
   private String[] T01O848_A13446AlbProVRef ;
   private boolean[] T01O848_n13446AlbProVRef ;
   private java.math.BigDecimal[] T01O848_A13852AlbProPrvp ;
   private boolean[] T01O848_n13852AlbProPrvp ;
   private java.math.BigDecimal[] T01O848_A13853AlbProDto ;
   private boolean[] T01O848_n13853AlbProDto ;
   private String[] T01O848_A396EmprCod ;
   private String[] T01O848_A719PrdNum ;
   private String[] T01O84_A718PrdNom ;
   private java.math.BigDecimal[] T01O84_A704PrdExiAlm ;
   private String[] T01O849_A718PrdNom ;
   private java.math.BigDecimal[] T01O849_A704PrdExiAlm ;
   private String[] T01O850_A396EmprCod ;
   private int[] T01O850_A13418AlbProID ;
   private short[] T01O850_A13442AlbProLine ;
   private int[] T01O83_A13418AlbProID ;
   private short[] T01O83_A13442AlbProLine ;
   private String[] T01O83_A13448AlbProDsc ;
   private boolean[] T01O83_n13448AlbProDsc ;
   private short[] T01O83_A13449AlbProCaja ;
   private boolean[] T01O83_n13449AlbProCaja ;
   private String[] T01O83_A13444AlbProUnd ;
   private boolean[] T01O83_n13444AlbProUnd ;
   private java.math.BigDecimal[] T01O83_A13443AlbProCnt ;
   private boolean[] T01O83_n13443AlbProCnt ;
   private String[] T01O83_A13447AlbProObsL ;
   private boolean[] T01O83_n13447AlbProObsL ;
   private String[] T01O83_A13445AlbProNRef ;
   private boolean[] T01O83_n13445AlbProNRef ;
   private String[] T01O83_A13446AlbProVRef ;
   private boolean[] T01O83_n13446AlbProVRef ;
   private java.math.BigDecimal[] T01O83_A13852AlbProPrvp ;
   private boolean[] T01O83_n13852AlbProPrvp ;
   private java.math.BigDecimal[] T01O83_A13853AlbProDto ;
   private boolean[] T01O83_n13853AlbProDto ;
   private String[] T01O83_A396EmprCod ;
   private String[] T01O83_A719PrdNum ;
   private int[] T01O82_A13418AlbProID ;
   private short[] T01O82_A13442AlbProLine ;
   private String[] T01O82_A13448AlbProDsc ;
   private boolean[] T01O82_n13448AlbProDsc ;
   private short[] T01O82_A13449AlbProCaja ;
   private boolean[] T01O82_n13449AlbProCaja ;
   private String[] T01O82_A13444AlbProUnd ;
   private boolean[] T01O82_n13444AlbProUnd ;
   private java.math.BigDecimal[] T01O82_A13443AlbProCnt ;
   private boolean[] T01O82_n13443AlbProCnt ;
   private String[] T01O82_A13447AlbProObsL ;
   private boolean[] T01O82_n13447AlbProObsL ;
   private String[] T01O82_A13445AlbProNRef ;
   private boolean[] T01O82_n13445AlbProNRef ;
   private String[] T01O82_A13446AlbProVRef ;
   private boolean[] T01O82_n13446AlbProVRef ;
   private java.math.BigDecimal[] T01O82_A13852AlbProPrvp ;
   private boolean[] T01O82_n13852AlbProPrvp ;
   private java.math.BigDecimal[] T01O82_A13853AlbProDto ;
   private boolean[] T01O82_n13853AlbProDto ;
   private String[] T01O82_A396EmprCod ;
   private String[] T01O82_A719PrdNum ;
   private String[] T01O854_A718PrdNom ;
   private java.math.BigDecimal[] T01O854_A704PrdExiAlm ;
   private String[] T01O855_A396EmprCod ;
   private int[] T01O855_A13418AlbProID ;
   private short[] T01O855_A13442AlbProLine ;
   private String[] T01O856_A13854CatDocNomI ;
   private String[] T01O857_A13719PrvNNom ;
   private String[] T01O858_A13738TrnCNom ;
   private String[] T01O859_A13854CatDocNomI ;
   private String[] T01O859_A396EmprCod ;
   private short[] T01O859_A13453CatDocID ;
   private boolean[] T01O859_n13453CatDocID ;
   private String[] T01O860_A13719PrvNNom ;
   private String[] T01O860_A396EmprCod ;
   private int[] T01O860_A795PrvNum ;
   private String[] T01O861_A13738TrnCNom ;
   private String[] T01O861_A396EmprCod ;
   private short[] T01O861_A840TrnCod ;
   private boolean[] T01O861_n840TrnCod ;
   private String[] T01O862_A13719PrvNNom ;
   private String[] T01O862_A396EmprCod ;
   private int[] T01O862_A795PrvNum ;
   private String[] T01O863_A13719PrvNNom ;
   private String[] T01O863_A396EmprCod ;
   private int[] T01O863_A795PrvNum ;
   private String[] T01O864_A13854CatDocNomI ;
   private String[] T01O864_A396EmprCod ;
   private short[] T01O864_A13453CatDocID ;
   private boolean[] T01O864_n13453CatDocID ;
   private String[] T01O865_A13454CatDocNom ;
   private boolean[] T01O865_n13454CatDocNom ;
   private String[] T01O866_A13719PrvNNom ;
   private String[] T01O866_A396EmprCod ;
   private int[] T01O866_A795PrvNum ;
   private String[] T01O867_A13420AlbProPrvN ;
   private boolean[] T01O867_n13420AlbProPrvN ;
   private String[] T01O868_A13426AlbProCliN ;
   private String[] T01O869_A13738TrnCNom ;
   private String[] T01O869_A396EmprCod ;
   private short[] T01O869_A840TrnCod ;
   private boolean[] T01O869_n840TrnCod ;
   private String[] T01O870_A841TrnNom ;
   private boolean[] T01O870_n841TrnNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] T01O88_A13426AlbProCliN ;
   private String[] T01O810_A13420AlbProPrvN ;
   private boolean[] T01O810_n13420AlbProPrvN ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV74Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV62WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV63TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV69TrnContextAtt ;
}

final  class tcalpro__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcalpro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcalpro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcalpro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcalpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01O82", "SELECT AlbProID, AlbProLine, AlbProDsc, AlbProCaja, AlbProUnd, AlbProCnt, AlbProObsL, AlbProNRef, AlbProVRef, AlbProPrvp, AlbProDto, EmprCod, PrdNum FROM TXPLALPRO WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ?  FOR UPDATE OF AlbProDsc, AlbProCaja, AlbProUnd, AlbProCnt, AlbProObsL, AlbProNRef, AlbProVRef, AlbProPrvp, AlbProDto, PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O83", "SELECT AlbProID, AlbProLine, AlbProDsc, AlbProCaja, AlbProUnd, AlbProCnt, AlbProObsL, AlbProNRef, AlbProVRef, AlbProPrvp, AlbProDto, EmprCod, PrdNum FROM TXPLALPRO WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O84", "SELECT PrdNom, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O85", "SELECT AlbProID, AlbProSal, AlbProInEx, AlbProTipo, AlbProDate, AlbProDomE, AlbProMatr, AlbProObs, AlbProSta, AlbProSys, AlbProHh, AlbProHhCt, AlbProEnvA, AlbProIDAT, AlbProStAT, AlbProAnul, AlbProUltL, AlbProLC1, AlbProLC2, AlbProLC3, AlbProLD1, AlbProLD2, AlbProLD3, AlbProATCU, AlbProSerA, AlbProTipA, EmprCod, AlbProCliC, AlbProPrvI, TrnCod, CatDocID FROM TXPCALPRO WHERE EmprCod = ? AND AlbProID = ?  FOR UPDATE OF AlbProSal, AlbProInEx, AlbProTipo, AlbProDate, AlbProDomE, AlbProMatr, AlbProObs, AlbProSta, AlbProSys, AlbProHh, AlbProHhCt, AlbProEnvA, AlbProIDAT, AlbProStAT, AlbProAnul, AlbProUltL, AlbProLC1, AlbProLC2, AlbProLC3, AlbProLD1, AlbProLD2, AlbProLD3, AlbProATCU, AlbProSerA, AlbProTipA, AlbProCliC, AlbProPrvI, TrnCod, CatDocID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O86", "SELECT AlbProID, AlbProSal, AlbProInEx, AlbProTipo, AlbProDate, AlbProDomE, AlbProMatr, AlbProObs, AlbProSta, AlbProSys, AlbProHh, AlbProHhCt, AlbProEnvA, AlbProIDAT, AlbProStAT, AlbProAnul, AlbProUltL, AlbProLC1, AlbProLC2, AlbProLC3, AlbProLD1, AlbProLD2, AlbProLD3, AlbProATCU, AlbProSerA, AlbProTipA, EmprCod, AlbProCliC, AlbProPrvI, TrnCod, CatDocID FROM TXPCALPRO WHERE EmprCod = ? AND AlbProID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O87", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O88", "SELECT CliNom AS AlbProCliN FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O89", "SELECT CliNom AS AlbProCliN FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O810", "SELECT PrvNom AS AlbProPrvN FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ?  FOR UPDATE OF PrvNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O811", "SELECT PrvNom AS AlbProPrvN FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O812", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O813", "SELECT CatDocNom FROM TXPCATDOC WHERE EmprCod = ? AND CatDocID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O814", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (EmprCod = ?) AND (TrnCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O815", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '') AS CatDocNomI, EmprCod, CatDocID FROM TXPCATDOC WHERE (EmprCod = ?) AND (CatDocID = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O816", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbProID, T4.PrvNom AS AlbProPrvN, T5.CliNom AS AlbProCliN, TM1.AlbProSal, T2.EmprNom, TM1.AlbProInEx, TM1.AlbProTipo, TM1.AlbProDate, T3.CatDocNom, TM1.AlbProDomE, T6.TrnNom, TM1.AlbProMatr, TM1.AlbProObs, TM1.AlbProSta, TM1.AlbProSys, TM1.AlbProHh, TM1.AlbProHhCt, TM1.AlbProEnvA, TM1.AlbProIDAT, TM1.AlbProStAT, TM1.AlbProAnul, TM1.AlbProUltL, TM1.AlbProLC1, TM1.AlbProLC2, TM1.AlbProLC3, TM1.AlbProLD1, TM1.AlbProLD2, TM1.AlbProLD3, TM1.AlbProATCU, TM1.AlbProSerA, TM1.AlbProTipA, TM1.EmprCod, TM1.AlbProCliC AS AlbProCliC, TM1.AlbProPrvI AS AlbProPrvI, TM1.TrnCod, TM1.CatDocID FROM (((((TXPCALPRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCATDOC T3 ON T3.EmprCod = TM1.EmprCod AND T3.CatDocID = TM1.CatDocID) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrvNum = TM1.AlbProPrvI) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.AlbProCliC) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.TrnCod) WHERE TM1.EmprCod = ? and TM1.AlbProID = ? ORDER BY TM1.EmprCod, TM1.AlbProID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O817", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O818", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O819", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '') AS CatDocNomI, EmprCod, CatDocID FROM TXPCATDOC WHERE (EmprCod = ?) AND (CatDocID = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O820", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O821", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (EmprCod = ?) AND (TrnCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O822", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '') AS CatDocNomI, EmprCod, CatDocID FROM TXPCATDOC WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '') = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O823", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O824", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O825", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O826", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '') AS CatDocNomI, EmprCod, CatDocID FROM TXPCATDOC WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '') = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O827", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O828", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O829", "SELECT CatDocNom FROM TXPCATDOC WHERE EmprCod = ? AND CatDocID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O830", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProID FROM TXPCALPRO WHERE EmprCod = ? AND AlbProID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O831", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProID FROM TXPCALPRO WHERE ( AlbProID > ?) and EmprCod = ? ORDER BY EmprCod, AlbProID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O832", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProID FROM TXPCALPRO WHERE ( AlbProID < ?) and EmprCod = ? ORDER BY EmprCod DESC, AlbProID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O833", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '') AS CatDocNomI, EmprCod, CatDocID FROM TXPCATDOC WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '') = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O834", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O835", "SELECT CliNom AS AlbProCliN FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O836", "SELECT PrvNom AS AlbProPrvN FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ?  FOR UPDATE OF PrvNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01O837", "INSERT INTO TXPCALPRO(AlbProID, AlbProSal, AlbProInEx, AlbProTipo, AlbProDate, AlbProDomE, AlbProMatr, AlbProObs, AlbProSta, AlbProSys, AlbProHh, AlbProHhCt, AlbProEnvA, AlbProIDAT, AlbProStAT, AlbProAnul, AlbProUltL, AlbProLC1, AlbProLC2, AlbProLC3, AlbProLD1, AlbProLD2, AlbProLD3, AlbProATCU, AlbProSerA, AlbProTipA, EmprCod, AlbProCliC, AlbProPrvI, TrnCod, CatDocID) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCALPRO")
         ,new UpdateCursor("T01O838", "UPDATE TXPCALPRO SET AlbProSal=?, AlbProInEx=?, AlbProTipo=?, AlbProDate=?, AlbProDomE=?, AlbProMatr=?, AlbProObs=?, AlbProSta=?, AlbProSys=?, AlbProHh=?, AlbProHhCt=?, AlbProEnvA=?, AlbProIDAT=?, AlbProStAT=?, AlbProAnul=?, AlbProUltL=?, AlbProLC1=?, AlbProLC2=?, AlbProLC3=?, AlbProLD1=?, AlbProLD2=?, AlbProLD3=?, AlbProATCU=?, AlbProSerA=?, AlbProTipA=?, AlbProCliC=?, AlbProPrvI=?, TrnCod=?, CatDocID=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK, "TXPCALPRO")
         ,new UpdateCursor("T01O839", "DELETE FROM TXPCALPRO  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK, "TXPCALPRO")
         ,new ForEachCursor("T01O840", "SELECT CliNom AS AlbProCliN FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O841", "SELECT PrvNom AS AlbProPrvN FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O842", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O843", "SELECT CatDocNom FROM TXPCATDOC WHERE EmprCod = ? AND CatDocID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01O844", "UPDATE TXPCALPRO SET AlbProUltL=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK, "TXPCALPRO")
         ,new UpdateCursor("T01O845", "UPDATE TXPCLIENT SET CliNom=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T01O846", "UPDATE TXPPRVGEN SET PrvNom=?  WHERE EmprCod = ? AND PrvNum = ?", GX_NOMASK, "TXPPRVGEN")
         ,new ForEachCursor("T01O847", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProID FROM TXPCALPRO WHERE EmprCod = ? ORDER BY EmprCod, AlbProID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O848", "SELECT T1.AlbProID, T1.AlbProLine, T1.AlbProDsc, T1.AlbProCaja, T1.AlbProUnd, T1.AlbProCnt, T1.AlbProObsL, T2.PrdNom, T2.PrdExiAlm, T1.AlbProNRef, T1.AlbProVRef, T1.AlbProPrvp, T1.AlbProDto, T1.EmprCod, T1.PrdNum FROM (TXPLALPRO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.AlbProID = ? and T1.AlbProLine = ? ORDER BY T1.EmprCod, T1.AlbProID, T1.AlbProLine ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O849", "SELECT PrdNom, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O850", "SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01O851", "INSERT INTO TXPLALPRO(AlbProID, AlbProLine, AlbProDsc, AlbProCaja, AlbProUnd, AlbProCnt, AlbProObsL, AlbProNRef, AlbProVRef, AlbProPrvp, AlbProDto, EmprCod, PrdNum, AlbProLote) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPLALPRO")
         ,new UpdateCursor("T01O852", "UPDATE TXPLALPRO SET AlbProDsc=?, AlbProCaja=?, AlbProUnd=?, AlbProCnt=?, AlbProObsL=?, AlbProNRef=?, AlbProVRef=?, AlbProPrvp=?, AlbProDto=?, PrdNum=?  WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ?", GX_NOMASK, "TXPLALPRO")
         ,new UpdateCursor("T01O853", "DELETE FROM TXPLALPRO  WHERE EmprCod = ? AND AlbProID = ? AND AlbProLine = ?", GX_NOMASK, "TXPLALPRO")
         ,new ForEachCursor("T01O854", "SELECT PrdNom, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O855", "SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID, AlbProLine ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O856", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '') AS CatDocNomI FROM TXPCATDOC WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '')) like '%' || UPPER(?)) ORDER BY CatDocNomI) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O857", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom FROM TXPPRVGEN WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, '')))) like '%' || UPPER(?)) ORDER BY PrvNNom) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O858", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom FROM TXPTRANSP WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, '')))) like '%' || UPPER(?)) ORDER BY TrnCNom) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O859", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '') AS CatDocNomI, EmprCod, CatDocID FROM TXPCATDOC WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '') = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O860", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O861", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O862", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O863", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvNum = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O864", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '') AS CatDocNomI, EmprCod, CatDocID FROM TXPCATDOC WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CatDocID,'9990'), 2))) || '-' || COALESCE( CatDocNom, '') = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O865", "SELECT CatDocNom FROM TXPCATDOC WHERE EmprCod = ? AND CatDocID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O866", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O867", "SELECT PrvNom AS AlbProPrvN FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O868", "SELECT CliNom AS AlbProCliN FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O869", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O870", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
               ((String[]) buf[21])[0] = rslt.getString(13, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
               ((String[]) buf[21])[0] = rslt.getString(13, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 40);
               ((String[]) buf[18])[0] = rslt.getString(19, 40);
               ((String[]) buf[19])[0] = rslt.getString(20, 40);
               ((String[]) buf[20])[0] = rslt.getString(21, 40);
               ((String[]) buf[21])[0] = rslt.getString(22, 40);
               ((String[]) buf[22])[0] = rslt.getString(23, 40);
               ((String[]) buf[23])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(26, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((int[]) buf[30])[0] = rslt.getInt(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((short[]) buf[32])[0] = rslt.getShort(30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(31);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 40);
               ((String[]) buf[18])[0] = rslt.getString(19, 40);
               ((String[]) buf[19])[0] = rslt.getString(20, 40);
               ((String[]) buf[20])[0] = rslt.getString(21, 40);
               ((String[]) buf[21])[0] = rslt.getString(22, 40);
               ((String[]) buf[22])[0] = rslt.getString(23, 40);
               ((String[]) buf[23])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(26, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(27, 3);
               ((int[]) buf[30])[0] = rslt.getInt(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((short[]) buf[32])[0] = rslt.getShort(30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(31);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((String[]) buf[16])[0] = rslt.getVarchar(13);
               ((byte[]) buf[17])[0] = rslt.getByte(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(15);
               ((String[]) buf[19])[0] = rslt.getVarchar(16);
               ((String[]) buf[20])[0] = rslt.getVarchar(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((byte[]) buf[23])[0] = rslt.getByte(20);
               ((String[]) buf[24])[0] = rslt.getString(21, 1);
               ((short[]) buf[25])[0] = rslt.getShort(22);
               ((String[]) buf[26])[0] = rslt.getString(23, 40);
               ((String[]) buf[27])[0] = rslt.getString(24, 40);
               ((String[]) buf[28])[0] = rslt.getString(25, 40);
               ((String[]) buf[29])[0] = rslt.getString(26, 40);
               ((String[]) buf[30])[0] = rslt.getString(27, 40);
               ((String[]) buf[31])[0] = rslt.getString(28, 40);
               ((String[]) buf[32])[0] = rslt.getString(29, 20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(30, 20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(31, 4);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(32, 3);
               ((int[]) buf[39])[0] = rslt.getInt(33);
               ((int[]) buf[40])[0] = rslt.getInt(34);
               ((short[]) buf[41])[0] = rslt.getShort(35);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(36);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 46 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 26);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[14])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 3);
               ((String[]) buf[23])[0] = rslt.getString(15, 6);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
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
            case 11 :
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
            case 12 :
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
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
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
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
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 35);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setVarchar(1, (String)parms[0], 35);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 26 :
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
            case 27 :
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
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 31 :
               stmt.setVarchar(1, (String)parms[0], 35);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 32 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 35 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 30);
               stmt.setVarchar(8, (String)parms[7], 200, false);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setDateTime(10, (java.util.Date)parms[9], false);
               stmt.setVarchar(11, (String)parms[10], 200, false);
               stmt.setVarchar(12, (String)parms[11], 200, false);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 20);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setString(18, (String)parms[17], 40);
               stmt.setString(19, (String)parms[18], 40);
               stmt.setString(20, (String)parms[19], 40);
               stmt.setString(21, (String)parms[20], 40);
               stmt.setString(22, (String)parms[21], 40);
               stmt.setString(23, (String)parms[22], 40);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[24], 20);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[26], 20);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[28], 4);
               }
               stmt.setString(27, (String)parms[29], 3);
               stmt.setInt(28, ((Number) parms[30]).intValue());
               stmt.setInt(29, ((Number) parms[31]).intValue());
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[35]).shortValue());
               }
               return;
            case 36 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 30);
               stmt.setVarchar(7, (String)parms[6], 200, false);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setDateTime(9, (java.util.Date)parms[8], false);
               stmt.setVarchar(10, (String)parms[9], 200, false);
               stmt.setVarchar(11, (String)parms[10], 200, false);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 20);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 40);
               stmt.setString(18, (String)parms[17], 40);
               stmt.setString(19, (String)parms[18], 40);
               stmt.setString(20, (String)parms[19], 40);
               stmt.setString(21, (String)parms[20], 40);
               stmt.setString(22, (String)parms[21], 40);
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[23], 20);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[25], 20);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[27], 4);
               }
               stmt.setInt(26, ((Number) parms[28]).intValue());
               stmt.setInt(27, ((Number) parms[29]).intValue());
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[33]).shortValue());
               }
               stmt.setString(30, (String)parms[34], 3);
               stmt.setInt(31, ((Number) parms[35]).intValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 40 :
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
            case 41 :
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
            case 42 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 49 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 60);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 60);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 20);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[17], 5);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[19], 2);
               }
               stmt.setString(12, (String)parms[20], 3);
               stmt.setString(13, (String)parms[21], 6);
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 60);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 5);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               stmt.setString(10, (String)parms[18], 6);
               stmt.setString(11, (String)parms[19], 3);
               stmt.setInt(12, ((Number) parms[20]).intValue());
               stmt.setShort(13, ((Number) parms[21]).shortValue());
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 35);
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 50);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 57 :
               stmt.setVarchar(1, (String)parms[0], 35);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 58 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 59 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 62 :
               stmt.setVarchar(1, (String)parms[0], 35);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 63 :
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
            case 64 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 67 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 68 :
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

