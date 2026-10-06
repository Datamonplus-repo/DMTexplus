package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbdet_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action63") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_63_7C7( Gx_mode, A396EmprCod, A44AlbRecCod, A45AlbRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action64") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_64_7C7( A396EmprCod, A252CliCod, A45AlbRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action65") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV124Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV124Pgmname", AV124Pgmname);
         AV17UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         AV38Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Station", AV38Station);
         AV93Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A5806AlbREnt2 = httpContext.GetPar( "AlbREnt2") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         AV92OldAlb2 = httpContext.GetPar( "OldAlb2") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92OldAlb2", AV92OldAlb2);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_65_7C7( A396EmprCod, AV124Pgmname, AV17UsurCod, AV38Station, AV93Inc_obs, A44AlbRecCod, A5806AlbREnt2, AV92OldAlb2) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action66") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         AV78SiArt = (byte)(GXutil.lval( httpContext.GetPar( "SiArt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78SiArt", GXutil.str( AV78SiArt, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_66_7C7( A396EmprCod, A252CliCod, A45AlbRef, AV78SiArt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action67") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_67_7C7( A396EmprCod, A252CliCod, A45AlbRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action78") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A50AlbRLoc = httpContext.GetPar( "AlbRLoc") ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         AV105UbicaL = (byte)(GXutil.lval( httpContext.GetPar( "UbicaL"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105UbicaL", GXutil.str( AV105UbicaL, 1, 0));
         AV108ValorUbica = (byte)(GXutil.lval( httpContext.GetPar( "ValorUbica"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108ValorUbica", GXutil.str( AV108ValorUbica, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_78_7C7( A396EmprCod, A50AlbRLoc, AV105UbicaL, AV108ValorUbica) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action81") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A50AlbRLoc = httpContext.GetPar( "AlbRLoc") ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         AV106Msg_Ubica = httpContext.GetPar( "Msg_Ubica") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106Msg_Ubica", AV106Msg_Ubica);
         AV105UbicaL = (byte)(GXutil.lval( httpContext.GetPar( "UbicaL"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105UbicaL", GXutil.str( AV105UbicaL, 1, 0));
         AV108ValorUbica = (byte)(GXutil.lval( httpContext.GetPar( "ValorUbica"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108ValorUbica", GXutil.str( AV108ValorUbica, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_81_7C7( A396EmprCod, A50AlbRLoc, AV106Msg_Ubica, AV105UbicaL, AV108ValorUbica) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action84") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV124Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV124Pgmname", AV124Pgmname);
         AV17UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         AV38Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Station", AV38Station);
         AV93Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_84_7C7( A396EmprCod, AV124Pgmname, AV17UsurCod, AV38Station, AV93Inc_obs, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action125") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV124Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV124Pgmname", AV124Pgmname);
         AV17UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         AV38Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Station", AV38Station);
         AV93Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A5806AlbREnt2 = httpContext.GetPar( "AlbREnt2") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         AV92OldAlb2 = httpContext.GetPar( "OldAlb2") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92OldAlb2", AV92OldAlb2);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_125_7C299( A396EmprCod, AV124Pgmname, AV17UsurCod, AV38Station, AV93Inc_obs, A44AlbRecCod, A5806AlbREnt2, AV92OldAlb2) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action130") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         AV82Noctrlpz = (byte)(GXutil.lval( httpContext.GetPar( "Noctrlpz"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82Noctrlpz", GXutil.str( AV82Noctrlpz, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_130_7C299( Gx_mode, A396EmprCod, A2159AlbRecPie, AV82Noctrlpz) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action133") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         AV57SumPza = (byte)(GXutil.lval( httpContext.GetPar( "SumPza"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57SumPza", GXutil.str( AV57SumPza, 1, 0));
         A2155AlbRecKgm = CommonUtil.decimalVal( httpContext.GetPar( "AlbRecKgm"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_133_7C299( Gx_mode, A396EmprCod, A44AlbRecCod, A2159AlbRecPie, AV57SumPza, A2155AlbRecKgm) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action134") == 0 )
      {
         A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A2157AlbRecMtr = CommonUtil.decimalVal( httpContext.GetPar( "AlbRecMtr"), ".") ;
         A2155AlbRecKgm = CommonUtil.decimalVal( httpContext.GetPar( "AlbRecKgm"), ".") ;
         AV60FlagArt = (byte)(GXutil.lval( httpContext.GetPar( "FlagArt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60FlagArt", GXutil.str( AV60FlagArt, 1, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         AV61CalMKT = (byte)(GXutil.lval( httpContext.GetPar( "CalMKT"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61CalMKT", GXutil.str( AV61CalMKT, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_134_7C299( A56AlbRUni, A2157AlbRecMtr, A2155AlbRecKgm, AV60FlagArt, A2159AlbRecPie, AV61CalMKT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action135") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV124Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV124Pgmname", AV124Pgmname);
         AV17UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         AV38Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Station", AV38Station);
         AV93Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_135_7C299( A396EmprCod, AV124Pgmname, AV17UsurCod, AV38Station, AV93Inc_obs, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlaclicod7C7( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"ALBREF") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlaalbref7C7( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"PROCECOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlaprocecod7C7( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlatrncod7C7( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"TIPENTCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlatipentcod7C7( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel21"+"_"+"") == 0 )
      {
         AV88Enc20c = (byte)(GXutil.lval( httpContext.GetPar( "Enc20c"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88Enc20c", GXutil.str( AV88Enc20c, 1, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa467C7( AV88Enc20c, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel22"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel23"+"_"+"") == 0 )
      {
         AV88Enc20c = (byte)(GXutil.lval( httpContext.GetPar( "Enc20c"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88Enc20c", GXutil.str( AV88Enc20c, 1, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa58067C7( AV88Enc20c, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel24"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel25"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel42"+"_"+"vERRP") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx42asaerrp7C7( A396EmprCod, A970ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel51"+"_"+"ALBDETPIEU") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx51asaalbdetpieu7C7( A396EmprCod, A44AlbRecCod, A56AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel86"+"_"+"ALBDETPIEU") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx86asaalbdetpieu7C299( A396EmprCod, A44AlbRecCod, A56AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel97"+"_"+"vPZAPROD") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx97asapzaprod7C299( Gx_mode, A396EmprCod, A44AlbRecCod, A2159AlbRecPie) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel98"+"_"+"vPIEUTI") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx98asapieuti7C299( Gx_mode, A396EmprCod, A44AlbRecCod, A2159AlbRecPie) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_138") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_138( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_139") == 0 )
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
         gxload_139( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_140") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_140( A396EmprCod, A970ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_141") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1211TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_141( A396EmprCod, A1211TipEntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_142") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_142( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_144") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_144( A396EmprCod, A44AlbRecCod, A2159AlbRecPie) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_piezas") == 0 )
      {
         gxnrgridlevel_piezas_newrow_invoke( ) ;
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
            AV113EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113EmprCod", AV113EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV113EmprCod, "@!"))));
            AV114AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114AlbRecCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV114AlbRecCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Almacen de Entrada, con detalle de rollos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_piezas_newrow_invoke( )
   {
      nRC_GXsfl_181 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_181"))) ;
      nGXsfl_181_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_181_idx"))) ;
      sGXsfl_181_idx = httpContext.GetPar( "sGXsfl_181_idx") ;
      A4921AlbRAnc = (short)(GXutil.lval( httpContext.GetPar( "AlbRAnc"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A10761AlbUltP = (short)(GXutil.lval( httpContext.GetPar( "AlbUltP"))) ;
      n10761AlbUltP = false ;
      A2147AlbDetKgmD = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetKgmD"), ".") ;
      A2150AlbDetMtrD = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetMtrD"), ".") ;
      A47AlbREst = (byte)(GXutil.lval( httpContext.GetPar( "AlbREst"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A2146AlbDetKgm = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetKgm"), ".") ;
      A2148AlbDetKgmU = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetKgmU"), ".") ;
      A2149AlbDetMtr = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetMtr"), ".") ;
      A2151AlbDetMtrU = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetMtrU"), ".") ;
      A2152AlbDetPie = (short)(GXutil.lval( httpContext.GetPar( "AlbDetPie"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
      n44AlbRecCod = false ;
      A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
      A2153AlbDetPieU = (short)(GXutil.lval( httpContext.GetPar( "AlbDetPieU"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_piezas_newrow( ) ;
      /* End function gxnrGridlevel_piezas_newrow_invoke */
   }

   public talbdet_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbdet_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbdet_impl.class ));
   }

   public talbdet_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynCliCod = new HTMLChoice();
      dynAlbRef = new HTMLChoice();
      dynProceCod = new HTMLChoice();
      dynTrnCod = new HTMLChoice();
      dynTipEntCod = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
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
      if ( dynCliCod.getItemCount() > 0 )
      {
         A252CliCod = (int)(GXutil.lval( dynCliCod.getValidValue(GXutil.trim( GXutil.str( A252CliCod, 6, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynCliCod.setValue( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynCliCod.getInternalname(), "Values", dynCliCod.ToJavascriptSource(), true);
      }
      if ( dynAlbRef.getItemCount() > 0 )
      {
         A45AlbRef = dynAlbRef.getValidValue(A45AlbRef) ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynAlbRef.setValue( GXutil.rtrim( A45AlbRef) );
         httpContext.ajax_rsp_assign_prop("", false, dynAlbRef.getInternalname(), "Values", dynAlbRef.ToJavascriptSource(), true);
      }
      if ( dynProceCod.getItemCount() > 0 )
      {
         A970ProceCod = (short)(GXutil.lval( dynProceCod.getValidValue(GXutil.trim( GXutil.str( A970ProceCod, 4, 0))))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynProceCod.setValue( GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynProceCod.getInternalname(), "Values", dynProceCod.ToJavascriptSource(), true);
      }
      if ( dynTrnCod.getItemCount() > 0 )
      {
         A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValidValue(GXutil.trim( GXutil.str( A840TrnCod, 4, 0))))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynTrnCod.setValue( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynTrnCod.getInternalname(), "Values", dynTrnCod.ToJavascriptSource(), true);
      }
      if ( dynTipEntCod.getItemCount() > 0 )
      {
         A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValidValue(GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0))))) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynTipEntCod.setValue( GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynTipEntCod.getInternalname(), "Values", dynTipEntCod.ToJavascriptSource(), true);
      }
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      }
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRecCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup4_Internalname, "", 1, 0, "px", 0, "px", "Group", "", "HLP_TALBDET.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbrent_cell_Internalname, 1, 0, "px", 0, "px", divAlbrent_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbREnt_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbREnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbREnt_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt), GXutil.rtrim( localUtil.format( A46AlbREnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbREnt_Visible, edtAlbREnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbrent2_cell_Internalname, 1, 0, "px", 0, "px", divAlbrent2_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbREnt2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbREnt2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbREnt2_Internalname, httpContext.getMessage( "Nº Albaran Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt2_Internalname, GXutil.rtrim( A5806AlbREnt2), GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbREnt2_Visible, edtAlbREnt2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRFen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRFen_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbRFen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFen_Internalname, localUtil.format(A49AlbRFen, "99/99/99"), localUtil.format( A49AlbRFen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRFen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDET.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynCliCod.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynCliCod.getInternalname(), httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynCliCod, dynCliCod.getInternalname(), GXutil.trim( GXutil.str( A252CliCod, 6, 0)), 1, dynCliCod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynCliCod.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "", true, (byte)(0), "HLP_TALBDET.htm");
      dynCliCod.setValue( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynCliCod.getInternalname(), "Values", dynCliCod.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynAlbRef.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynAlbRef.getInternalname(), httpContext.getMessage( "Codigo Referencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynAlbRef, dynAlbRef.getInternalname(), GXutil.rtrim( A45AlbRef), 1, dynAlbRef.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, dynAlbRef.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "", true, (byte)(0), "HLP_TALBDET.htm");
      dynAlbRef.setValue( GXutil.rtrim( A45AlbRef) );
      httpContext.ajax_rsp_assign_prop("", false, dynAlbRef.getInternalname(), "Values", dynAlbRef.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynProceCod.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynProceCod.getInternalname(), httpContext.getMessage( "Codigo Procedencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynProceCod, dynProceCod.getInternalname(), GXutil.trim( GXutil.str( A970ProceCod, 4, 0)), 1, dynProceCod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynProceCod.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "", true, (byte)(0), "HLP_TALBDET.htm");
      dynProceCod.setValue( GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynProceCod.getInternalname(), "Values", dynProceCod.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynTrnCod.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynTrnCod.getInternalname(), httpContext.getMessage( "Codigo Transportista", ""), "col-sm-4 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-8 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynTrnCod, dynTrnCod.getInternalname(), GXutil.trim( GXutil.str( A840TrnCod, 4, 0)), 1, dynTrnCod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", httpContext.getMessage( "Codigo Transportista", ""), 1, dynTrnCod.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "", true, (byte)(0), "HLP_TALBDET.htm");
      dynTrnCod.setValue( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynTrnCod.getInternalname(), "Values", dynTrnCod.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynTipEntCod.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynTipEntCod.getInternalname(), httpContext.getMessage( "Tipo Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynTipEntCod, dynTipEntCod.getInternalname(), GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)), 1, dynTipEntCod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynTipEntCod.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "", true, (byte)(0), "HLP_TALBDET.htm");
      dynTipEntCod.setValue( GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynTipEntCod.getInternalname(), "Values", dynTipEntCod.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRDes_Internalname, httpContext.getMessage( "Destino", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDes_Internalname, GXutil.rtrim( A1291AlbRDes), GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRDes_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET.htm");
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedgroup6_Internalname, tblTablemergedunnamedgroup6_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup6_Internalname, httpContext.getMessage( "Entradas", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TALBDET.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniEnt_Internalname, httpContext.getMessage( "Und Ent", ""), "col-sm-5 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-7 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRUni.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRUni.getInternalname(), httpContext.getMessage( "Und", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "", true, (byte)(0), "HLP_TALBDET.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieEnt_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrUniC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrUniC_Internalname, httpContext.getMessage( "Und Cli", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrUniC_Internalname, GXutil.ltrim( localUtil.ntoc( A6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrUniC_Enabled!=0) ? localUtil.format( A6180AlbrUniC, "ZZZZZ9.99") : localUtil.format( A6180AlbrUniC, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrUniC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrUniC_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrPieC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrPieC_Internalname, httpContext.getMessage( "Piezas Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrPieC_Internalname, GXutil.ltrim( localUtil.ntoc( A6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrPieC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrPieC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrPieC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbNumM_Internalname, httpContext.getMessage( "Nº Marcado", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumM_Internalname, GXutil.rtrim( A8029AlbNumM), GXutil.rtrim( localUtil.format( A8029AlbNumM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumM_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbNumM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup8_Internalname, httpContext.getMessage( "Stock", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TALBDET.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieUti_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieUti_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieUti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "col-sm-4 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-8 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniUti_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniUti_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "col-sm-5 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-7 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniUti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "col-sm-7 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-5 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRFecUlt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRFecUlt_Internalname, httpContext.getMessage( "Fecha Ult Uti", ""), "col-sm-5 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-7 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbRFecUlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFecUlt_Internalname, localUtil.format(A48AlbRFecUlt, "99/99/99"), localUtil.format( A48AlbRFecUlt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFecUlt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRFecUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFecUlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFecUlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDET.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbREst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbREst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-6 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-6 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbREst, cmbAlbREst.getInternalname(), GXutil.trim( GXutil.str( A47AlbREst, 1, 0)), 1, cmbAlbREst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbREst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBDET.htm");
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup10_Internalname, "", 1, 0, "px", 0, "px", "Group", "", "HLP_TALBDET.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLoc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLoc_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLoc_Internalname, GXutil.rtrim( A50AlbRLoc), GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLoc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRReo.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRReo.getInternalname(), httpContext.getMessage( "Reclamacion?", ""), "col-sm-4 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-8 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRReo, cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo), 1, cmbAlbRReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRReo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,137);\"", "", true, (byte)(0), "HLP_TALBDET.htm");
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLote_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLote_Internalname, GXutil.rtrim( A6463AlbRLote), GXutil.rtrim( localUtil.format( A6463AlbRLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET.htm");
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
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup12_Internalname, "", 1, 0, "px", 0, "px", "Group", "", "HLP_TALBDET.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRGrm2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRGrm2_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRGrm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRGrm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRAnc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRAnc_Internalname, httpContext.getMessage( "Ancho", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRAnc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPml_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPml_Internalname, httpContext.getMessage( "Pml", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPml_Internalname, GXutil.ltrim( localUtil.ntoc( A4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,158);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPml_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbPml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
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
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup14_Internalname, httpContext.getMessage( "Tejido Blanco Quimico o Optico, valores", ""), 1, 0, "px", 0, "px", grpUnnamedgroup14_Class, "", "HLP_TALBDET.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPh_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPh_Internalname, httpContext.getMessage( "Ph , Tejido Blanqueado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPh_Internalname, GXutil.ltrim( localUtil.ntoc( A13241AlbRPh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPh_Enabled!=0) ? localUtil.format( A13241AlbRPh, "ZZ9.99") : localUtil.format( A13241AlbRPh, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,167);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPh_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRRLong_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRRLong_Internalname, httpContext.getMessage( "Resistencia, Longitudinal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRRLong_Internalname, GXutil.ltrim( localUtil.ntoc( A13242AlbRRLong, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRRLong_Enabled!=0) ? localUtil.format( A13242AlbRRLong, "ZZ9.99") : localUtil.format( A13242AlbRRLong, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRRLong_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRRLong_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRRTrans_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRRTrans_Internalname, httpContext.getMessage( "Resistencia, Transversal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 175,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRRTrans_Internalname, GXutil.ltrim( localUtil.ntoc( A13243AlbRRTrans, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRRTrans_Enabled!=0) ? localUtil.format( A13243AlbRRTrans, "ZZ9.99") : localUtil.format( A13243AlbRRTrans, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,175);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRRTrans_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRRTrans_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_piezas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_piezas( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnnumerarpiezas_Internalname, "", httpContext.getMessage( "Numerar Piezas", ""), bttBtnnumerarpiezas_Jsonclick, 5, httpContext.getMessage( "Numerar Piezas", ""), "", StyleString, ClassString, bttBtnnumerarpiezas_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DONUMERARPIEZAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 223,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 227,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,227);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET.htm");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetPie_Internalname, GXutil.ltrim( localUtil.ntoc( A2152AlbDetPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2152AlbDetPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2152AlbDetPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetPie_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetPie_Visible, edtAlbDetPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2149AlbDetMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetMtr_Enabled!=0) ? localUtil.format( A2149AlbDetMtr, "ZZZZZ9.99") : localUtil.format( A2149AlbDetMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetMtr_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetMtr_Visible, edtAlbDetMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2146AlbDetKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetKgm_Enabled!=0) ? localUtil.format( A2146AlbDetKgm, "ZZZZZ9.99") : localUtil.format( A2146AlbDetKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetKgm_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetKgm_Visible, edtAlbDetKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2151AlbDetMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetMtrU_Enabled!=0) ? localUtil.format( A2151AlbDetMtrU, "ZZZZZ9.99") : localUtil.format( A2151AlbDetMtrU, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetMtrU_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetMtrU_Visible, edtAlbDetMtrU_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2148AlbDetKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetKgmU_Enabled!=0) ? localUtil.format( A2148AlbDetKgmU, "ZZZZZ9.99") : localUtil.format( A2148AlbDetKgmU, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetKgmU_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetKgmU_Visible, edtAlbDetKgmU_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetMtrD_Internalname, GXutil.ltrim( localUtil.ntoc( A2150AlbDetMtrD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetMtrD_Enabled!=0) ? localUtil.format( A2150AlbDetMtrD, "ZZZZZ9.99") : localUtil.format( A2150AlbDetMtrD, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetMtrD_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetMtrD_Visible, edtAlbDetMtrD_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetKgmD_Internalname, GXutil.ltrim( localUtil.ntoc( A2147AlbDetKgmD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetKgmD_Enabled!=0) ? localUtil.format( A2147AlbDetKgmD, "ZZZZZ9.99") : localUtil.format( A2147AlbDetKgmD, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetKgmD_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetKgmD_Visible, edtAlbDetKgmD_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetPieU_Internalname, GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetPieU_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2153AlbDetPieU), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2153AlbDetPieU), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetPieU_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbDetPieU_Visible, edtAlbDetPieU_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSumKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A10758SumKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSumKgs_Enabled!=0) ? localUtil.format( A10758SumKgs, "ZZZZZ9.99") : localUtil.format( A10758SumKgs, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSumKgs_Jsonclick, 0, "Attribute", "", "", "", "", edtSumKgs_Visible, edtSumKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSumMts_Internalname, GXutil.ltrim( localUtil.ntoc( A10759SumMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSumMts_Enabled!=0) ? localUtil.format( A10759SumMts, "ZZZZZ9.99") : localUtil.format( A10759SumMts, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSumMts_Jsonclick, 0, "Attribute", "", "", "", "", edtSumMts_Visible, edtSumMts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSumPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A10760SumPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSumPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10760SumPzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10760SumPzs), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSumPzs_Jsonclick, 0, "Attribute", "", "", "", "", edtSumPzs_Visible, edtSumPzs_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 240,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieReb_Internalname, GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieReb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,240);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieReb_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbRPieReb_Visible, edtAlbRPieReb_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbUltP_Internalname, GXutil.ltrim( localUtil.ntoc( A10761AlbUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbUltP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10761AlbUltP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10761AlbUltP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbUltP_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbUltP_Visible, edtAlbUltP_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 242,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumEti_Internalname, GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbNumEti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,242);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumEti_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbNumEti_Visible, edtAlbNumEti_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 243,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc), GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,243);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRefDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbRefDsc_Visible, edtAlbRefDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_piezas( )
   {
      /*  Grid Control  */
      startgridcontrol181( ) ;
      nGXsfl_181_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount299 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_299 = (short)(1) ;
            scanStart7C299( ) ;
            while ( RcdFound299 != 0 )
            {
               init_level_properties299( ) ;
               getByPrimaryKey7C299( ) ;
               addRow7C299( ) ;
               scanNext7C299( ) ;
            }
            scanEnd7C299( ) ;
            nBlankRcdCount299 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B10761AlbUltP = A10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         B10760SumPzs = A10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         B10758SumKgs = A10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         B10759SumMts = A10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         B5806AlbREnt2 = A5806AlbREnt2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         standaloneNotModal7C299( ) ;
         standaloneModal7C299( ) ;
         sMode299 = Gx_mode ;
         while ( nGXsfl_181_idx < nRC_GXsfl_181 )
         {
            bGXsfl_181_Refreshing = true ;
            readRow7C299( ) ;
            edtAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPIE_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtALRPIELOC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIELOC_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtALRPIELOC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIELOC_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbRecAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECANH_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecAnh_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTR_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGM_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbRecMtrU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTRU_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbRecKgmU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGMU_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlRPieClaC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIECLAC_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRPieClaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieClaC_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtBod_Talla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_TALLA_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Talla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Talla_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtBod_Und_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_UND_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Und_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbRecCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOL_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCol_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbRecIdPz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECIDPZ_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecIdPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecIdPz_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbRecIdRc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECIDRC_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecIdRc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecIdRc_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbRecPal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPAL_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPal_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlRPieTelT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIETELT_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRPieTelT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieTelT_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlRPieCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIECON_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRPieCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieCon_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlRPieOri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIEORI_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRPieOri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieOri_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlRPieDst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIEDST_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRPieDst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieDst_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlrPieKgmT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIEKGMT_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlrPieKgmT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrPieKgmT_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbPCont_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCONT_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPCont_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbPCont_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCONT_"+sGXsfl_181_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPCont_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPCont_Visible), 5, 0), !bGXsfl_181_Refreshing);
            if ( ( nRcdExists_299 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal7C299( ) ;
            }
            sendRow7C299( ) ;
            bGXsfl_181_Refreshing = false ;
         }
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A10761AlbUltP = B10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         A10760SumPzs = B10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         A10758SumKgs = B10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = B10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A5806AlbREnt2 = B5806AlbREnt2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount299 = (short)(5) ;
         nRcdExists_299 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart7C299( ) ;
            while ( RcdFound299 != 0 )
            {
               sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_181299( ) ;
               init_level_properties299( ) ;
               standaloneNotModal7C299( ) ;
               getByPrimaryKey7C299( ) ;
               standaloneModal7C299( ) ;
               addRow7C299( ) ;
               scanNext7C299( ) ;
            }
            scanEnd7C299( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode299 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_181299( ) ;
         initAll7C299( ) ;
         init_level_properties299( ) ;
         B10761AlbUltP = A10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         B10760SumPzs = A10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         B10758SumKgs = A10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         B10759SumMts = A10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         B5806AlbREnt2 = A5806AlbREnt2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         nRcdExists_299 = (short)(0) ;
         nIsMod_299 = (short)(0) ;
         nRcdDeleted_299 = (short)(0) ;
         nBlankRcdCount299 = (short)(nBlankRcdUsr299+nBlankRcdCount299) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount299 > 0 )
         {
            standaloneNotModal7C299( ) ;
            standaloneModal7C299( ) ;
            addRow7C299( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbRecPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount299 = (short)(nBlankRcdCount299-1) ;
         }
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A10761AlbUltP = B10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         A10760SumPzs = B10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         A10758SumKgs = B10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = B10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A5806AlbREnt2 = B5806AlbREnt2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_piezasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_piezas", Gridlevel_piezasContainer, subGridlevel_piezas_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_piezasContainerData", Gridlevel_piezasContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_piezasContainerData"+"V", Gridlevel_piezasContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_piezasContainerData"+"V"+"\" value='"+Gridlevel_piezasContainer.GridValuesHidden()+"'/>") ;
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
      e117C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5806AlbREnt2 = httpContext.cgiGet( "Z5806AlbREnt2") ;
            Z46AlbREnt = httpContext.cgiGet( "Z46AlbREnt") ;
            Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            Z60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
            Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "Z54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
            Z3613AlbRefDsc = httpContext.cgiGet( "Z3613AlbRefDsc") ;
            Z49AlbRFen = localUtil.ctod( httpContext.cgiGet( "Z49AlbRFen"), 0) ;
            Z4606AlbRHEn = localUtil.ctot( httpContext.cgiGet( "Z4606AlbRHEn"), 0) ;
            Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
            Z1291AlbRDes = httpContext.cgiGet( "Z1291AlbRDes") ;
            Z50AlbRLoc = httpContext.cgiGet( "Z50AlbRLoc") ;
            Z55AlbRReo = httpContext.cgiGet( "Z55AlbRReo") ;
            Z48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( "Z48AlbRFecUlt"), 0) ;
            Z6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( "Z6180AlbrUniC")) ;
            Z6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( "Z6181AlbrPieC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z4920AlbRGrm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z4921AlbRAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( "Z4922AlbPml"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6463AlbRLote = httpContext.cgiGet( "Z6463AlbRLote") ;
            Z13241AlbRPh = localUtil.ctond( httpContext.cgiGet( "Z13241AlbRPh")) ;
            Z13242AlbRRLong = localUtil.ctond( httpContext.cgiGet( "Z13242AlbRRLong")) ;
            Z13243AlbRRTrans = localUtil.ctond( httpContext.cgiGet( "Z13243AlbRRTrans")) ;
            Z8029AlbNumM = httpContext.cgiGet( "Z8029AlbNumM") ;
            Z53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "Z53AlbRPieReb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "Z59AlbRUniReb")) ;
            Z10761AlbUltP = (short)(localUtil.ctol( httpContext.cgiGet( "Z10761AlbUltP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7501AlbRecSec = (short)(localUtil.ctol( httpContext.cgiGet( "Z7501AlbRecSec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "Z1222AlbNumEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4606AlbRHEn = localUtil.ctot( httpContext.cgiGet( "Z4606AlbRHEn"), 0) ;
            n4606AlbRHEn = false ;
            A59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "Z59AlbRUniReb")) ;
            A7501AlbRecSec = (short)(localUtil.ctol( httpContext.cgiGet( "Z7501AlbRecSec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7501AlbRecSec = false ;
            O10761AlbUltP = (short)(localUtil.ctol( httpContext.cgiGet( "O10761AlbUltP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O10760SumPzs = (short)(localUtil.ctol( httpContext.cgiGet( "O10760SumPzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O10758SumKgs = localUtil.ctond( httpContext.cgiGet( "O10758SumKgs")) ;
            O10759SumMts = localUtil.ctond( httpContext.cgiGet( "O10759SumMts")) ;
            O5806AlbREnt2 = httpContext.cgiGet( "O5806AlbREnt2") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_181 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_181"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "N970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "N1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV46Modo = httpContext.cgiGet( "MODO") ;
            AV113EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV114AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV118Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV119Insert_ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PROCECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV120Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV121Insert_TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TIPENTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV88Enc20c = (byte)(localUtil.ctol( httpContext.cgiGet( "vENC20C"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV46Modo = httpContext.cgiGet( "vMODO") ;
            AV99Termilenio = (byte)(localUtil.ctol( httpContext.cgiGet( "vTERMILENIO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18AlbCum = httpContext.cgiGet( "vALBCUM") ;
            AV50FlagKgs = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGKGS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV51FlagMts = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGMTS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV92OldAlb2 = httpContext.cgiGet( "vOLDALB2") ;
            AV76ErrP = (byte)(localUtil.ctol( httpContext.cgiGet( "vERRP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4606AlbRHEn = localUtil.ctot( httpContext.cgiGet( "ALBRHEN"), 0) ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
            AV93Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV60FlagArt = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV58Rdto = localUtil.ctond( httpContext.cgiGet( "vRDTO")) ;
            AV59Pesoml = (short)(localUtil.ctol( httpContext.cgiGet( "vPESOML"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV109Anc = (short)(localUtil.ctol( httpContext.cgiGet( "vANC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV110grm2 = (short)(localUtil.ctol( httpContext.cgiGet( "vGRM2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV124Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV38Station = httpContext.cgiGet( "vSTATION") ;
            AV77ErrArt = (byte)(localUtil.ctol( httpContext.cgiGet( "vERRART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV98artblo = httpContext.cgiGet( "vARTBLO") ;
            AV81Flag = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAG"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV75Tintatex = (byte)(localUtil.ctol( httpContext.cgiGet( "vTINTATEX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV78SiArt = (byte)(localUtil.ctol( httpContext.cgiGet( "vSIART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV89Velluts = (byte)(localUtil.ctol( httpContext.cgiGet( "vVELLUTS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV106Msg_Ubica = httpContext.cgiGet( "vMSG_UBICA") ;
            AV105UbicaL = (byte)(localUtil.ctol( httpContext.cgiGet( "vUBICAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV108ValorUbica = (byte)(localUtil.ctol( httpContext.cgiGet( "vVALORUBICA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "ALBRUNIREB")) ;
            A7501AlbRecSec = (short)(localUtil.ctol( httpContext.cgiGet( "ALBRECSEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
            A971ProceNom = httpContext.cgiGet( "PROCENOM") ;
            n971ProceNom = false ;
            A1212TipEntNom = httpContext.cgiGet( "TIPENTNOM") ;
            n1212TipEntNom = false ;
            A4795AlRPieCal = httpContext.cgiGet( "ALRPIECAL") ;
            A4806AlRPieDefC = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIEDEFC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4806AlRPieDefC = false ;
            AV90PzaProd = (byte)(localUtil.ctol( httpContext.cgiGet( "vPZAPROD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV54PieUti = httpContext.cgiGet( "vPIEUTI") ;
            AV71Msg_err = httpContext.cgiGet( "vMSG_ERR") ;
            AV70NoPzaR = (byte)(localUtil.ctol( httpContext.cgiGet( "vNOPZAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_unnamedtable2_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A44AlbRecCod = 0 ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            else
            {
               A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
            A5806AlbREnt2 = httpContext.cgiGet( edtAlbREnt2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
            if ( localUtil.vcdate( httpContext.cgiGet( edtAlbRFen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBRFEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRFen_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A49AlbRFen = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
            }
            else
            {
               A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
            }
            dynCliCod.setName( dynCliCod.getInternalname() );
            dynCliCod.setValue( httpContext.cgiGet( dynCliCod.getInternalname()) );
            A252CliCod = (int)(GXutil.lval( httpContext.cgiGet( dynCliCod.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            dynAlbRef.setName( dynAlbRef.getInternalname() );
            dynAlbRef.setValue( httpContext.cgiGet( dynAlbRef.getInternalname()) );
            A45AlbRef = httpContext.cgiGet( dynAlbRef.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            dynProceCod.setName( dynProceCod.getInternalname() );
            dynProceCod.setValue( httpContext.cgiGet( dynProceCod.getInternalname()) );
            A970ProceCod = (short)(GXutil.lval( httpContext.cgiGet( dynProceCod.getInternalname()))) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            dynTrnCod.setName( dynTrnCod.getInternalname() );
            dynTrnCod.setValue( httpContext.cgiGet( dynTrnCod.getInternalname()) );
            A840TrnCod = (short)(GXutil.lval( httpContext.cgiGet( dynTrnCod.getInternalname()))) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            dynTipEntCod.setName( dynTipEntCod.getInternalname() );
            dynTipEntCod.setValue( httpContext.cgiGet( dynTipEntCod.getInternalname()) );
            A1211TipEntCod = (short)(GXutil.lval( httpContext.cgiGet( dynTipEntCod.getInternalname()))) ;
            n1211TipEntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
            A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbrUniC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6180AlbrUniC = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
            }
            else
            {
               A6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbrPieC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6181AlbrPieC = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
            }
            else
            {
               A6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
            }
            A8029AlbNumM = httpContext.cgiGet( edtAlbNumM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            cmbAlbREst.setName( cmbAlbREst.getInternalname() );
            cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
            A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
            cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
            cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
            A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
            A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRGRM2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRGrm2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4920AlbRGrm2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
            }
            else
            {
               A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4921AlbRAnc = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
            }
            else
            {
               A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPML");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbPml_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4922AlbPml = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
            }
            else
            {
               A4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRPh_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRPh_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRPh_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13241AlbRPh = DecimalUtil.ZERO ;
               n13241AlbRPh = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
            }
            else
            {
               A13241AlbRPh = localUtil.ctond( httpContext.cgiGet( edtAlbRPh_Internalname)) ;
               n13241AlbRPh = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRRLong_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRRLong_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRRLONG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRRLong_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13242AlbRRLong = DecimalUtil.ZERO ;
               n13242AlbRRLong = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
            }
            else
            {
               A13242AlbRRLong = localUtil.ctond( httpContext.cgiGet( edtAlbRRLong_Internalname)) ;
               n13242AlbRRLong = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRRTrans_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRRTrans_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRRTRANS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRRTrans_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13243AlbRRTrans = DecimalUtil.ZERO ;
               n13243AlbRRTrans = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
            }
            else
            {
               A13243AlbRRTrans = localUtil.ctond( httpContext.cgiGet( edtAlbRRTrans_Internalname)) ;
               n13243AlbRRTrans = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
            }
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A2152AlbDetPie = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDetPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
            A2149AlbDetMtr = localUtil.ctond( httpContext.cgiGet( edtAlbDetMtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
            A2146AlbDetKgm = localUtil.ctond( httpContext.cgiGet( edtAlbDetKgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
            A2151AlbDetMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbDetMtrU_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
            A2148AlbDetKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbDetKgmU_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
            A2150AlbDetMtrD = localUtil.ctond( httpContext.cgiGet( edtAlbDetMtrD_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
            A2147AlbDetKgmD = localUtil.ctond( httpContext.cgiGet( edtAlbDetKgmD_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
            A2153AlbDetPieU = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDetPieU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            A10758SumKgs = localUtil.ctond( httpContext.cgiGet( edtSumKgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            A10759SumMts = localUtil.ctond( httpContext.cgiGet( edtSumMts_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            A10760SumPzs = (short)(localUtil.ctol( httpContext.cgiGet( edtSumPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEREB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRPieReb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A53AlbRPieReb = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
            }
            else
            {
               A53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
            }
            A10761AlbUltP = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbUltP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10761AlbUltP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBNUMETI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbNumEti_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1222AlbNumEti = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
            }
            else
            {
               A1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
            }
            A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TALBDET");
            A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV46Modo, "")));
            forbiddenHiddens.add("AlbRHEn", localUtil.format( A4606AlbRHEn, "99/99/99 99:99"));
            forbiddenHiddens.add("AlbRUniReb", localUtil.format( A59AlbRUniReb, "ZZZZZ9.99"));
            forbiddenHiddens.add("AlbRecSec", localUtil.format( DecimalUtil.doubleToDec(A7501AlbRecSec), "ZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A44AlbRecCod != Z44AlbRecCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("talbdet:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
                  sMode7 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode7 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound7 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_7C0( ) ;
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
                        e117C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e127C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DONUMERARPIEZAS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoNumerarPiezas' */
                        e137C2 ();
                        nKeyPressed = (byte)(3) ;
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
         e127C2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll7C7( ) ;
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
         disableAttributes7C7( ) ;
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

   public void confirm_7C0( )
   {
      beforeValidate7C7( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls7C7( ) ;
         }
         else
         {
            checkExtendedTable7C7( ) ;
            closeExtendedTableCursors7C7( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode7 = Gx_mode ;
         confirm_7C299( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode7 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_7C299( )
   {
      s10761AlbUltP = O10761AlbUltP ;
      n10761AlbUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      s10760SumPzs = O10760SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      s10758SumKgs = O10758SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      s10759SumMts = O10759SumMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      sV93Inc_obs = OV93Inc_obs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
      s2147AlbDetKgmD = O2147AlbDetKgmD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      s2150AlbDetMtrD = O2150AlbDetMtrD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      s2153AlbDetPieU = O2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      s58AlbRUniEnt = O58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      s60AlbRUniUti = O60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      s52AlbRPieEnt = O52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      s54AlbRPieUti = O54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      s47AlbREst = O47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      sV18AlbCum = OV18AlbCum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      nGXsfl_181_idx = 0 ;
      while ( nGXsfl_181_idx < nRC_GXsfl_181 )
      {
         readRow7C299( ) ;
         if ( ( nRcdExists_299 != 0 ) || ( nIsMod_299 != 0 ) )
         {
            getKey7C299( ) ;
            if ( ( nRcdExists_299 == 0 ) && ( nRcdDeleted_299 == 0 ) )
            {
               if ( RcdFound299 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate7C299( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable7C299( ) ;
                     closeExtendedTableCursors7C299( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O10761AlbUltP = A10761AlbUltP ;
                     n10761AlbUltP = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
                     O10760SumPzs = A10760SumPzs ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
                     O10758SumKgs = A10758SumKgs ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
                     O10759SumMts = A10759SumMts ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
                     OV93Inc_obs = AV93Inc_obs ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
                     O2147AlbDetKgmD = A2147AlbDetKgmD ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                     O2150AlbDetMtrD = A2150AlbDetMtrD ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                     O2153AlbDetPieU = A2153AlbDetPieU ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                     O58AlbRUniEnt = A58AlbRUniEnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                     O60AlbRUniUti = A60AlbRUniUti ;
                     httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                     O52AlbRPieEnt = A52AlbRPieEnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                     O54AlbRPieUti = A54AlbRPieUti ;
                     httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                     O47AlbREst = A47AlbREst ;
                     httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                     OV18AlbCum = AV18AlbCum ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
                  }
               }
               else
               {
                  GXCCtl = "ALBRECPIE_" + sGXsfl_181_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRecPie_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound299 != 0 )
               {
                  if ( nRcdDeleted_299 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey7C299( ) ;
                     load7C299( ) ;
                     beforeValidate7C299( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls7C299( ) ;
                        O10761AlbUltP = A10761AlbUltP ;
                        n10761AlbUltP = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
                        O10760SumPzs = A10760SumPzs ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
                        O10758SumKgs = A10758SumKgs ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
                        O10759SumMts = A10759SumMts ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
                        OV93Inc_obs = AV93Inc_obs ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
                        O2147AlbDetKgmD = A2147AlbDetKgmD ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                        O2150AlbDetMtrD = A2150AlbDetMtrD ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                        O2153AlbDetPieU = A2153AlbDetPieU ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                        O58AlbRUniEnt = A58AlbRUniEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                        O60AlbRUniUti = A60AlbRUniUti ;
                        httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                        O52AlbRPieEnt = A52AlbRPieEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                        O54AlbRPieUti = A54AlbRPieUti ;
                        httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                        O47AlbREst = A47AlbREst ;
                        httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                        OV18AlbCum = AV18AlbCum ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
                     }
                  }
                  else
                  {
                     if ( nIsMod_299 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate7C299( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable7C299( ) ;
                           closeExtendedTableCursors7C299( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O10761AlbUltP = A10761AlbUltP ;
                           n10761AlbUltP = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
                           O10760SumPzs = A10760SumPzs ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
                           O10758SumKgs = A10758SumKgs ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
                           O10759SumMts = A10759SumMts ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
                           OV93Inc_obs = AV93Inc_obs ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
                           O2147AlbDetKgmD = A2147AlbDetKgmD ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                           O2150AlbDetMtrD = A2150AlbDetMtrD ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                           O2153AlbDetPieU = A2153AlbDetPieU ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                           O58AlbRUniEnt = A58AlbRUniEnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                           O60AlbRUniUti = A60AlbRUniUti ;
                           httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                           O52AlbRPieEnt = A52AlbRPieEnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                           O54AlbRPieUti = A54AlbRPieUti ;
                           httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                           O47AlbREst = A47AlbREst ;
                           httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                           OV18AlbCum = AV18AlbCum ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_299 == 0 )
                  {
                     GXCCtl = "ALBRECPIE_" + sGXsfl_181_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie)) ;
         httpContext.changePostValue( edtALRPIELOC_Internalname, GXutil.rtrim( A7408ALRPIELOC)) ;
         httpContext.changePostValue( edtAlbRecAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRPieClaC_Internalname, GXutil.rtrim( A4797AlRPieClaC)) ;
         httpContext.changePostValue( edtBod_Talla_Internalname, GXutil.rtrim( A8779Bod_Talla)) ;
         httpContext.changePostValue( edtBod_Und_Internalname, GXutil.ltrim( localUtil.ntoc( A8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecCol_Internalname, GXutil.ltrim( localUtil.ntoc( A3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecIdPz_Internalname, GXutil.rtrim( A3731AlbRecIdPz)) ;
         httpContext.changePostValue( edtAlbRecIdRc_Internalname, GXutil.ltrim( localUtil.ntoc( A3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecPal_Internalname, GXutil.ltrim( localUtil.ntoc( A4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRPieTelT_Internalname, GXutil.rtrim( A10180AlRPieTelT)) ;
         httpContext.changePostValue( edtAlRPieCon_Internalname, GXutil.ltrim( localUtil.ntoc( A10149AlRPieCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRPieOri_Internalname, GXutil.rtrim( A10181AlRPieOri)) ;
         httpContext.changePostValue( edtAlRPieDst_Internalname, GXutil.rtrim( A10182AlRPieDst)) ;
         httpContext.changePostValue( edtAlrPieKgmT_Internalname, GXutil.ltrim( localUtil.ntoc( A10183AlrPieKgmT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPCont_Internalname, GXutil.ltrim( localUtil.ntoc( A10762AlbPCont, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_181_idx, GXutil.rtrim( Z2159AlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_181_idx, GXutil.rtrim( Z4795AlRPieCal)) ;
         httpContext.changePostValue( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10762AlbPCont_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z10762AlbPCont, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8779Bod_Talla_"+sGXsfl_181_idx, GXutil.rtrim( Z8779Bod_Talla)) ;
         httpContext.changePostValue( "ZT_"+"Z8780Bod_Und_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3730AlbRecCol_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3731AlbRecIdPz_"+sGXsfl_181_idx, GXutil.rtrim( Z3731AlbRecIdPz)) ;
         httpContext.changePostValue( "ZT_"+"Z3732AlbRecIdRc_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4410AlbRecPal_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10180AlRPieTelT_"+sGXsfl_181_idx, GXutil.rtrim( Z10180AlRPieTelT)) ;
         httpContext.changePostValue( "ZT_"+"Z10149AlRPieCon_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z10149AlRPieCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10181AlRPieOri_"+sGXsfl_181_idx, GXutil.rtrim( Z10181AlRPieOri)) ;
         httpContext.changePostValue( "ZT_"+"Z10182AlRPieDst_"+sGXsfl_181_idx, GXutil.rtrim( Z10182AlRPieDst)) ;
         httpContext.changePostValue( "ZT_"+"Z10183AlrPieKgmT_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z10183AlrPieKgmT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7408ALRPIELOC_"+sGXsfl_181_idx, GXutil.rtrim( Z7408ALRPIELOC)) ;
         httpContext.changePostValue( "T2155AlbRecKgm_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( O2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2157AlbRecMtr_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( O2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_299_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_299_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_299_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_299 != 0 )
         {
            httpContext.changePostValue( "ALBRECPIE_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIELOC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIELOC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECANH_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTR_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGM_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTRU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGMU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIECLAC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieClaC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_TALLA_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Talla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_UND_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Und_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCOL_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECIDPZ_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdPz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECIDRC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdRc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECPAL_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIETELT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieTelT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIECON_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIEORI_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieOri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIEDST_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieDst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIEKGMT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlrPieKgmT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCONT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPCont_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCONT_"+sGXsfl_181_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtAlbPCont_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O10761AlbUltP = s10761AlbUltP ;
      n10761AlbUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      O10760SumPzs = s10760SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      O10758SumKgs = s10758SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      O10759SumMts = s10759SumMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      OV93Inc_obs = sV93Inc_obs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
      O2147AlbDetKgmD = s2147AlbDetKgmD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      O2150AlbDetMtrD = s2150AlbDetMtrD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      O2153AlbDetPieU = s2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      O58AlbRUniEnt = s58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      O60AlbRUniUti = s60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O52AlbRPieEnt = s52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      O54AlbRPieUti = s54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O47AlbREst = s47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      OV18AlbCum = sV18AlbCum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      /* Start of After( level) rules */
      /* Using cursor T007C7 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A2152AlbDetPie = T007C7_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T007C7_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T007C7_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T007C7_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T007C7_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A10758SumKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10760SumPzs = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption7C0( )
   {
   }

   public void e117C2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV38Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      talbdet_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Station", AV38Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char2, GXv_char3, GXv_char4) ;
      talbdet_impl.this.A396EmprCod = GXv_char2[0] ;
      talbdet_impl.this.AV16EmprNom = GXv_char3[0] ;
      talbdet_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = AV50FlagKgs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KILOS", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV50FlagKgs = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50FlagKgs", GXutil.str( AV50FlagKgs, 1, 0));
      GXt_int5 = AV51FlagMts ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "METROS", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV51FlagMts = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51FlagMts", GXutil.str( AV51FlagMts, 1, 0));
      GXt_int5 = AV53FlagGraf ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRAFIC", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV53FlagGraf = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53FlagGraf", GXutil.str( AV53FlagGraf, 1, 0));
      GXt_int5 = AV57SumPza ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUMPZA", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV57SumPza = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57SumPza", GXutil.str( AV57SumPza, 1, 0));
      GXt_int5 = AV61CalMKT ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CALMKT", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV61CalMKT = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61CalMKT", GXutil.str( AV61CalMKT, 1, 0));
      GXt_int5 = AV66Artextil ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV66Artextil = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Artextil", GXutil.str( AV66Artextil, 1, 0));
      GXt_int5 = (byte)(AV68f_NOTREC) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOTREC", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV68f_NOTREC = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68f_NOTREC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68f_NOTREC), 10, 0));
      GXt_int5 = AV70NoPzaR ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOPZRP", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV70NoPzaR = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70NoPzaR", GXutil.str( AV70NoPzaR, 1, 0));
      GXt_int5 = AV75Tintatex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTAT", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV75Tintatex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Tintatex", GXutil.str( AV75Tintatex, 1, 0));
      GXt_int5 = AV78SiArt ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIART", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV78SiArt = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78SiArt", GXutil.str( AV78SiArt, 1, 0));
      GXt_int5 = AV82Noctrlpz ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCTRLP", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV82Noctrlpz = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82Noctrlpz", GXutil.str( AV82Noctrlpz, 1, 0));
      GXt_int5 = AV83VerItm ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ITM000", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV83VerItm = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83VerItm", GXutil.str( AV83VerItm, 1, 0));
      GXt_int5 = AV88Enc20c ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV88Enc20c = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Enc20c", GXutil.str( AV88Enc20c, 1, 0));
      GXt_int5 = AV89Velluts ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VELLUT", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV89Velluts = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Velluts", GXutil.str( AV89Velluts, 1, 0));
      GXt_int5 = AV94Colorsol ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLORS", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV94Colorsol = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Colorsol", GXutil.str( AV94Colorsol, 1, 0));
      GXt_int5 = AV97PesSim ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PESSIM", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV97PesSim = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97PesSim", GXutil.str( AV97PesSim, 1, 0));
      GXt_int5 = AV99Termilenio ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TERMIL", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV99Termilenio = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99Termilenio", GXutil.str( AV99Termilenio, 1, 0));
      GXt_int5 = AV100stamperia ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STAMPE", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV100stamperia = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100stamperia", GXutil.str( AV100stamperia, 1, 0));
      GXt_int5 = AV103Piolera ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIOLER", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV103Piolera = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103Piolera", GXutil.str( AV103Piolera, 1, 0));
      GXt_int5 = AV104tintoriente ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ORIENT", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV104tintoriente = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104tintoriente", GXutil.str( AV104tintoriente, 1, 0));
      GXt_int5 = AV107Estampamos ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV107Estampamos = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107Estampamos", GXutil.str( AV107Estampamos, 1, 0));
      GXt_int5 = AV112biarprint ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BIARPR", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV112biarprint = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112biarprint", GXutil.str( AV112biarprint, 1, 0));
      GXt_int5 = AV105UbicaL ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UBICAL", ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      AV105UbicaL = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105UbicaL", GXutil.str( AV105UbicaL, 1, 0));
      GXt_int7 = AV108ValorUbica ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UBICAL", ""), GXv_int8) ;
      talbdet_impl.this.GXt_int7 = GXv_int8[0] ;
      AV108ValorUbica = (byte)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108ValorUbica", GXutil.str( AV108ValorUbica, 1, 0));
      GXt_char1 = AV38Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      talbdet_impl.this.GXt_char1 = GXv_char4[0] ;
      AV38Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Station", AV38Station);
      GXv_char4[0] = AV113EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char4, GXv_char3, GXv_char2) ;
      talbdet_impl.this.AV113EmprCod = GXv_char4[0] ;
      talbdet_impl.this.AV16EmprNom = GXv_char3[0] ;
      talbdet_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV113EmprCod", AV113EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV113EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext9[0] = AV115WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV115WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV116TrnContext.fromxml(AV117WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV116TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV124Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV125GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV125GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125GXV1), 8, 0));
         while ( AV125GXV1 <= AV116TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV122TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV116TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV125GXV1));
            if ( GXutil.strcmp(AV122TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV118Insert_CliCod = (int)(GXutil.lval( AV122TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV118Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118Insert_CliCod), 6, 0));
            }
            else if ( GXutil.strcmp(AV122TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ProceCod") == 0 )
            {
               AV119Insert_ProceCod = (short)(GXutil.lval( AV122TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV119Insert_ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119Insert_ProceCod), 4, 0));
            }
            else if ( GXutil.strcmp(AV122TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV120Insert_TrnCod = (short)(GXutil.lval( AV122TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV120Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120Insert_TrnCod), 4, 0));
            }
            else if ( GXutil.strcmp(AV122TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TipEntCod") == 0 )
            {
               AV121Insert_TipEntCod = (short)(GXutil.lval( AV122TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV121Insert_TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121Insert_TipEntCod), 4, 0));
            }
            AV125GXV1 = (int)(AV125GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtAlbDetPie_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetPie_Visible), 5, 0), true);
      edtAlbDetMtr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtr_Visible), 5, 0), true);
      edtAlbDetKgm_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgm_Visible), 5, 0), true);
      edtAlbDetMtrU_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetMtrU_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtrU_Visible), 5, 0), true);
      edtAlbDetKgmU_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetKgmU_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgmU_Visible), 5, 0), true);
      edtAlbDetMtrD_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetMtrD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtrD_Visible), 5, 0), true);
      edtAlbDetKgmD_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetKgmD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgmD_Visible), 5, 0), true);
      edtAlbDetPieU_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetPieU_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetPieU_Visible), 5, 0), true);
      edtSumKgs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumKgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumKgs_Visible), 5, 0), true);
      edtSumMts_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumMts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumMts_Visible), 5, 0), true);
      edtSumPzs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumPzs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumPzs_Visible), 5, 0), true);
      edtAlbRPieReb_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieReb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieReb_Visible), 5, 0), true);
      edtAlbUltP_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUltP_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUltP_Visible), 5, 0), true);
      edtAlbNumEti_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumEti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumEti_Visible), 5, 0), true);
      edtAlbRefDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Visible), 5, 0), true);
   }

   public void e127C2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A44AlbRecCod ;
      new app.pprueba5(remoteHandle, context).execute( GXv_char4, GXv_int8) ;
      talbdet_impl.this.A396EmprCod = GXv_char4[0] ;
      talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV116TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.talbdetww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e137C2( )
   {
      /* 'DoNumerarPiezas' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.webwnumpz2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A56AlbRUni))}, new String[] {"EmprCod","AlbRecCod","AlbrUni"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divAlbrent_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
      divAlbrent2_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
   }

   public void zm7C7( int GX_JID )
   {
      if ( ( GX_JID == 136 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5806AlbREnt2 = T007C9_A5806AlbREnt2[0] ;
            Z46AlbREnt = T007C9_A46AlbREnt[0] ;
            Z58AlbRUniEnt = T007C9_A58AlbRUniEnt[0] ;
            Z60AlbRUniUti = T007C9_A60AlbRUniUti[0] ;
            Z52AlbRPieEnt = T007C9_A52AlbRPieEnt[0] ;
            Z54AlbRPieUti = T007C9_A54AlbRPieUti[0] ;
            Z47AlbREst = T007C9_A47AlbREst[0] ;
            Z56AlbRUni = T007C9_A56AlbRUni[0] ;
            Z3613AlbRefDsc = T007C9_A3613AlbRefDsc[0] ;
            Z49AlbRFen = T007C9_A49AlbRFen[0] ;
            Z4606AlbRHEn = T007C9_A4606AlbRHEn[0] ;
            Z45AlbRef = T007C9_A45AlbRef[0] ;
            Z1291AlbRDes = T007C9_A1291AlbRDes[0] ;
            Z50AlbRLoc = T007C9_A50AlbRLoc[0] ;
            Z55AlbRReo = T007C9_A55AlbRReo[0] ;
            Z48AlbRFecUlt = T007C9_A48AlbRFecUlt[0] ;
            Z6180AlbrUniC = T007C9_A6180AlbrUniC[0] ;
            Z6181AlbrPieC = T007C9_A6181AlbrPieC[0] ;
            Z4920AlbRGrm2 = T007C9_A4920AlbRGrm2[0] ;
            Z4921AlbRAnc = T007C9_A4921AlbRAnc[0] ;
            Z4922AlbPml = T007C9_A4922AlbPml[0] ;
            Z6463AlbRLote = T007C9_A6463AlbRLote[0] ;
            Z13241AlbRPh = T007C9_A13241AlbRPh[0] ;
            Z13242AlbRRLong = T007C9_A13242AlbRRLong[0] ;
            Z13243AlbRRTrans = T007C9_A13243AlbRRTrans[0] ;
            Z8029AlbNumM = T007C9_A8029AlbNumM[0] ;
            Z53AlbRPieReb = T007C9_A53AlbRPieReb[0] ;
            Z59AlbRUniReb = T007C9_A59AlbRUniReb[0] ;
            Z10761AlbUltP = T007C9_A10761AlbUltP[0] ;
            Z7501AlbRecSec = T007C9_A7501AlbRecSec[0] ;
            Z1222AlbNumEti = T007C9_A1222AlbNumEti[0] ;
            Z252CliCod = T007C9_A252CliCod[0] ;
            Z840TrnCod = T007C9_A840TrnCod[0] ;
            Z970ProceCod = T007C9_A970ProceCod[0] ;
            Z1211TipEntCod = T007C9_A1211TipEntCod[0] ;
         }
         else
         {
            Z5806AlbREnt2 = A5806AlbREnt2 ;
            Z46AlbREnt = A46AlbREnt ;
            Z58AlbRUniEnt = A58AlbRUniEnt ;
            Z60AlbRUniUti = A60AlbRUniUti ;
            Z52AlbRPieEnt = A52AlbRPieEnt ;
            Z54AlbRPieUti = A54AlbRPieUti ;
            Z47AlbREst = A47AlbREst ;
            Z56AlbRUni = A56AlbRUni ;
            Z3613AlbRefDsc = A3613AlbRefDsc ;
            Z49AlbRFen = A49AlbRFen ;
            Z4606AlbRHEn = A4606AlbRHEn ;
            Z45AlbRef = A45AlbRef ;
            Z1291AlbRDes = A1291AlbRDes ;
            Z50AlbRLoc = A50AlbRLoc ;
            Z55AlbRReo = A55AlbRReo ;
            Z48AlbRFecUlt = A48AlbRFecUlt ;
            Z6180AlbrUniC = A6180AlbrUniC ;
            Z6181AlbrPieC = A6181AlbrPieC ;
            Z4920AlbRGrm2 = A4920AlbRGrm2 ;
            Z4921AlbRAnc = A4921AlbRAnc ;
            Z4922AlbPml = A4922AlbPml ;
            Z6463AlbRLote = A6463AlbRLote ;
            Z13241AlbRPh = A13241AlbRPh ;
            Z13242AlbRRLong = A13242AlbRRLong ;
            Z13243AlbRRTrans = A13243AlbRRTrans ;
            Z8029AlbNumM = A8029AlbNumM ;
            Z53AlbRPieReb = A53AlbRPieReb ;
            Z59AlbRUniReb = A59AlbRUniReb ;
            Z10761AlbUltP = A10761AlbUltP ;
            Z7501AlbRecSec = A7501AlbRecSec ;
            Z1222AlbNumEti = A1222AlbNumEti ;
            Z252CliCod = A252CliCod ;
            Z840TrnCod = A840TrnCod ;
            Z970ProceCod = A970ProceCod ;
            Z1211TipEntCod = A1211TipEntCod ;
         }
      }
      if ( GX_JID == -136 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z5806AlbREnt2 = A5806AlbREnt2 ;
         Z46AlbREnt = A46AlbREnt ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z47AlbREst = A47AlbREst ;
         Z56AlbRUni = A56AlbRUni ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z49AlbRFen = A49AlbRFen ;
         Z4606AlbRHEn = A4606AlbRHEn ;
         Z45AlbRef = A45AlbRef ;
         Z1291AlbRDes = A1291AlbRDes ;
         Z50AlbRLoc = A50AlbRLoc ;
         Z55AlbRReo = A55AlbRReo ;
         Z48AlbRFecUlt = A48AlbRFecUlt ;
         Z6180AlbrUniC = A6180AlbrUniC ;
         Z6181AlbrPieC = A6181AlbrPieC ;
         Z4920AlbRGrm2 = A4920AlbRGrm2 ;
         Z4921AlbRAnc = A4921AlbRAnc ;
         Z4922AlbPml = A4922AlbPml ;
         Z6463AlbRLote = A6463AlbRLote ;
         Z13241AlbRPh = A13241AlbRPh ;
         Z13242AlbRRLong = A13242AlbRRLong ;
         Z13243AlbRRTrans = A13243AlbRRTrans ;
         Z8029AlbNumM = A8029AlbNumM ;
         Z53AlbRPieReb = A53AlbRPieReb ;
         Z59AlbRUniReb = A59AlbRUniReb ;
         Z10761AlbUltP = A10761AlbUltP ;
         Z7501AlbRecSec = A7501AlbRecSec ;
         Z1222AlbNumEti = A1222AlbNumEti ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z840TrnCod = A840TrnCod ;
         Z970ProceCod = A970ProceCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z407EmprNom = A407EmprNom ;
         Z2152AlbDetPie = A2152AlbDetPie ;
         Z2149AlbDetMtr = A2149AlbDetMtr ;
         Z2146AlbDetKgm = A2146AlbDetKgm ;
         Z2151AlbDetMtrU = A2151AlbDetMtrU ;
         Z2148AlbDetKgmU = A2148AlbDetKgmU ;
         Z10758SumKgs = A10758SumKgs ;
         Z10759SumMts = A10759SumMts ;
         Z10760SumPzs = A10760SumPzs ;
         Z279CliNom = A279CliNom ;
         Z971ProceNom = A971ProceNom ;
         Z841TrnNom = A841TrnNom ;
         Z1212TipEntNom = A1212TipEntNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlbPCont_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPCont_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPCont_Visible), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbUltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUltP_Enabled), 5, 0), true);
      AV124Pgmname = "TALBDET" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV124Pgmname", AV124Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlbUltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUltP_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV113EmprCod)==0) )
      {
         A396EmprCod = AV113EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T007C10 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T007C10_A407EmprNom[0] ;
      n407EmprNom = T007C10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      gxaclicod_html7C7( A396EmprCod) ;
      gxaprocecod_html7C7( A396EmprCod) ;
      gxatrncod_html7C7( A396EmprCod) ;
      gxatipentcod_html7C7( A396EmprCod) ;
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 0 ) ) )
      {
         divAlbrent_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 0 )
         {
            divAlbrent_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divAlbrent2_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divAlbrent2_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "BIARPR", ""), ""), GXv_int6) ;
      talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         grpUnnamedgroup14_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, grpUnnamedgroup14_Internalname, "Class", grpUnnamedgroup14_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "BIARPR", ""), ""), GXv_int6) ;
         talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            grpUnnamedgroup14_Class = httpContext.getMessage( "Group", "") ;
            httpContext.ajax_rsp_assign_prop("", false, grpUnnamedgroup14_Internalname, "Class", grpUnnamedgroup14_Class, true);
         }
      }
      if ( ! (GXutil.strcmp("", AV113EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( true )
         {
            edtEmprCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
         }
         else
         {
            edtEmprCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
         }
      }
      if ( ! (GXutil.strcmp("", AV113EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV114AlbRecCod) )
      {
         A44AlbRecCod = AV114AlbRecCod ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      if ( ! (0==AV114AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRecCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV114AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( true )
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
         edtAlbREnt_Visible = ((GXt_int5==0) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
      }
      else
      {
         edtAlbREnt_Visible = ((AV88Enc20c==1) ? 0 : 1) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
      }
      if ( true )
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
         edtAlbREnt2_Visible = ((GXt_int5==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
      }
      else
      {
         edtAlbREnt2_Visible = AV88Enc20c ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV118Insert_CliCod) )
      {
         dynCliCod.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynCliCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCliCod.getEnabled(), 5, 0), true);
      }
      else
      {
         dynCliCod.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynCliCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCliCod.getEnabled(), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV119Insert_ProceCod) )
      {
         dynProceCod.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynProceCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynProceCod.getEnabled(), 5, 0), true);
      }
      else
      {
         dynProceCod.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynProceCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynProceCod.getEnabled(), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV120Insert_TrnCod) )
      {
         dynTrnCod.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynTrnCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynTrnCod.getEnabled(), 5, 0), true);
      }
      else
      {
         dynTrnCod.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynTrnCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynTrnCod.getEnabled(), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV121Insert_TipEntCod) )
      {
         dynTipEntCod.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynTipEntCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynTipEntCod.getEnabled(), 5, 0), true);
      }
      else
      {
         dynTipEntCod.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynTipEntCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynTipEntCod.getEnabled(), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         AV46Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Modo", AV46Modo);
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            AV46Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Modo", AV46Modo);
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               AV46Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46Modo", AV46Modo);
            }
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV121Insert_TipEntCod) )
      {
         A1211TipEntCod = AV121Insert_TipEntCod ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV120Insert_TrnCod) )
      {
         A840TrnCod = AV120Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV119Insert_ProceCod) )
      {
         A970ProceCod = AV119Insert_ProceCod ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV118Insert_CliCod) )
      {
         A252CliCod = AV118Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( AV88Enc20c == 0 )
      {
         A5806AlbREnt2 = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      }
      if ( isIns( )  && ( AV50FlagKgs == 1 ) )
      {
         A56AlbRUni = httpContext.getMessage( httpContext.getMessage( "K", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      else
      {
         if ( isIns( )  && ( AV51FlagMts == 1 ) )
         {
            A56AlbRUni = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         }
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A49AlbRFen)) && ( Gx_BScreen == 0 ) )
      {
         A49AlbRFen = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A55AlbRReo)==0) && ( Gx_BScreen == 0 ) )
      {
         A55AlbRReo = httpContext.getMessage( httpContext.getMessage( "NO", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A48AlbRFecUlt)) && ( Gx_BScreen == 0 ) )
      {
         A48AlbRFecUlt = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A4606AlbRHEn) && ( Gx_BScreen == 0 ) )
      {
         A4606AlbRHEn = GXutil.now( ) ;
         n4606AlbRHEn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T007C11 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T007C11_A279CliNom[0] ;
         pr_default.close(7);
         gxaalbref_html7C7( A396EmprCod, A252CliCod) ;
         /* Using cursor T007C13 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = T007C13_A971ProceNom[0] ;
         n971ProceNom = T007C13_n971ProceNom[0] ;
         pr_default.close(9);
         if ( ( AV75Tintatex == 1 ) && true /* After */ )
         {
            GXt_int5 = AV76ErrP ;
            GXv_char4[0] = " " ;
            GXv_int6[0] = GXt_int5 ;
            new app.pproced(remoteHandle, context).execute( A396EmprCod, A970ProceCod, GXv_char4, GXv_int6) ;
            talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
            AV76ErrP = GXt_int5 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76ErrP", GXutil.str( AV76ErrP, 1, 0));
         }
         /* Using cursor T007C12 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T007C12_A841TrnNom[0] ;
         n841TrnNom = T007C12_n841TrnNom[0] ;
         pr_default.close(8);
         /* Using cursor T007C14 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
         A1212TipEntNom = T007C14_A1212TipEntNom[0] ;
         n1212TipEntNom = T007C14_n1212TipEntNom[0] ;
         pr_default.close(10);
         /* Using cursor T007C7 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(3) != 101) )
         {
            A2152AlbDetPie = T007C7_A2152AlbDetPie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
            A2149AlbDetMtr = T007C7_A2149AlbDetMtr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
            A2146AlbDetKgm = T007C7_A2146AlbDetKgm[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
            A2151AlbDetMtrU = T007C7_A2151AlbDetMtrU[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
            A2148AlbDetKgmU = T007C7_A2148AlbDetKgmU[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
            A10758SumKgs = T007C7_A10758SumKgs[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            A10759SumMts = T007C7_A10759SumMts[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            A10760SumPzs = T007C7_A10760SumPzs[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         }
         else
         {
            A2152AlbDetPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
            A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
            A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
            A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
            A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
            A10758SumKgs = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            A10759SumMts = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            A10760SumPzs = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         }
         O10758SumKgs = A10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         O10759SumMts = A10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         O10760SumPzs = A10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         pr_default.close(3);
         if ( ! (0==A2152AlbDetPie) )
         {
            A52AlbRPieEnt = A2152AlbDetPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         }
         A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         AV92OldAlb2 = O5806AlbREnt2 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92OldAlb2", AV92OldAlb2);
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
         {
            A58AlbRUniEnt = A2149AlbDetMtr ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
         else
         {
            if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
            {
               A58AlbRUniEnt = A2146AlbDetKgm ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            }
         }
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
         {
            A60AlbRUniUti = A2151AlbDetMtrU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
            {
               A60AlbRUniUti = A2148AlbDetKgmU ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
         }
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            }
            else
            {
               A2153AlbDetPieU = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            }
         }
         if ( ! (0==A2153AlbDetPieU) )
         {
            A54AlbRPieUti = A2153AlbDetPieU ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         if ( ( AV88Enc20c == 1 ) && ( AV99Termilenio == 0 ) )
         {
            A46AlbREnt = A5806AlbREnt2 ;
            httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         }
      }
   }

   public void load7C7( )
   {
      /* Using cursor T007C16 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A5806AlbREnt2 = T007C16_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A46AlbREnt = T007C16_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A58AlbRUniEnt = T007C16_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = T007C16_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = T007C16_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = T007C16_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A47AlbREst = T007C16_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A56AlbRUni = T007C16_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A3613AlbRefDsc = T007C16_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A407EmprNom = T007C16_A407EmprNom[0] ;
         n407EmprNom = T007C16_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A49AlbRFen = T007C16_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A4606AlbRHEn = T007C16_A4606AlbRHEn[0] ;
         n4606AlbRHEn = T007C16_n4606AlbRHEn[0] ;
         A279CliNom = T007C16_A279CliNom[0] ;
         A45AlbRef = T007C16_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A971ProceNom = T007C16_A971ProceNom[0] ;
         n971ProceNom = T007C16_n971ProceNom[0] ;
         A841TrnNom = T007C16_A841TrnNom[0] ;
         n841TrnNom = T007C16_n841TrnNom[0] ;
         A1212TipEntNom = T007C16_A1212TipEntNom[0] ;
         n1212TipEntNom = T007C16_n1212TipEntNom[0] ;
         A1291AlbRDes = T007C16_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A50AlbRLoc = T007C16_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A55AlbRReo = T007C16_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A48AlbRFecUlt = T007C16_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A6180AlbrUniC = T007C16_A6180AlbrUniC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A6181AlbrPieC = T007C16_A6181AlbrPieC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A4920AlbRGrm2 = T007C16_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T007C16_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = T007C16_A4922AlbPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         A6463AlbRLote = T007C16_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A13241AlbRPh = T007C16_A13241AlbRPh[0] ;
         n13241AlbRPh = T007C16_n13241AlbRPh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
         A13242AlbRRLong = T007C16_A13242AlbRRLong[0] ;
         n13242AlbRRLong = T007C16_n13242AlbRRLong[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
         A13243AlbRRTrans = T007C16_A13243AlbRRTrans[0] ;
         n13243AlbRRTrans = T007C16_n13243AlbRRTrans[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
         A8029AlbNumM = T007C16_A8029AlbNumM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
         A53AlbRPieReb = T007C16_A53AlbRPieReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         A59AlbRUniReb = T007C16_A59AlbRUniReb[0] ;
         A10761AlbUltP = T007C16_A10761AlbUltP[0] ;
         n10761AlbUltP = T007C16_n10761AlbUltP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         A7501AlbRecSec = T007C16_A7501AlbRecSec[0] ;
         n7501AlbRecSec = T007C16_n7501AlbRecSec[0] ;
         A1222AlbNumEti = T007C16_A1222AlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         A252CliCod = T007C16_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T007C16_A840TrnCod[0] ;
         n840TrnCod = T007C16_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T007C16_A970ProceCod[0] ;
         n970ProceCod = T007C16_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T007C16_A1211TipEntCod[0] ;
         n1211TipEntCod = T007C16_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A2152AlbDetPie = T007C16_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T007C16_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T007C16_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T007C16_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T007C16_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A10758SumKgs = T007C16_A10758SumKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = T007C16_A10759SumMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10760SumPzs = T007C16_A10760SumPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         zm7C7( -136) ;
      }
      pr_default.close(11);
      onLoadActions7C7( ) ;
   }

   public void onLoadActions7C7( )
   {
      O10760SumPzs = A10760SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      O10758SumKgs = A10758SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      O10759SumMts = A10759SumMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      if ( ( AV88Enc20c == 1 ) && ( AV99Termilenio == 0 ) )
      {
         A46AlbREnt = A5806AlbREnt2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      }
      AV92OldAlb2 = O5806AlbREnt2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92OldAlb2", AV92OldAlb2);
      if ( ( AV75Tintatex == 1 ) && true /* After */ )
      {
         GXt_int5 = AV76ErrP ;
         GXv_char4[0] = " " ;
         GXv_int6[0] = GXt_int5 ;
         new app.pproced(remoteHandle, context).execute( A396EmprCod, A970ProceCod, GXv_char4, GXv_int6) ;
         talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
         AV76ErrP = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76ErrP", GXutil.str( AV76ErrP, 1, 0));
      }
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               A47AlbREst = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
            else
            {
               if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
               {
                  A47AlbREst = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               }
               else
               {
                  if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
                  {
                     A47AlbREst = (byte)(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  }
               }
            }
         }
      }
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      gxaalbref_html7C7( A396EmprCod, A252CliCod) ;
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      if ( ! (0==A2153AlbDetPieU) )
      {
         A54AlbRPieUti = A2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
   }

   public void checkExtendedTable7C7( )
   {
      nIsDirty_7 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ( AV88Enc20c == 1 ) && ( AV99Termilenio == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A46AlbREnt = A5806AlbREnt2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      }
      if ( isIns( )  && ( ! (0==A44AlbRecCod) ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran inexistente", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV89Velluts == 1 ) && ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Albaran¡¡¡", ""), 1, "ALBRENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbREnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV92OldAlb2 = O5806AlbREnt2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92OldAlb2", AV92OldAlb2);
      if ( ( AV89Velluts == 1 ) && ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Albaran¡¡¡", ""), 1, "ALBRENT2");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbREnt2_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char3[0] = A45AlbRef ;
         GXv_int6[0] = AV60FlagArt ;
         GXv_decimal10[0] = AV58Rdto ;
         GXv_int11[0] = AV59Pesoml ;
         GXv_int12[0] = AV109Anc ;
         GXv_int13[0] = AV110grm2 ;
         new app.pbusarp(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_int6, GXv_decimal10, GXv_int11, GXv_int12, GXv_int13) ;
         talbdet_impl.this.A396EmprCod = GXv_char4[0] ;
         talbdet_impl.this.A252CliCod = GXv_int8[0] ;
         talbdet_impl.this.A45AlbRef = GXv_char3[0] ;
         talbdet_impl.this.AV60FlagArt = GXv_int6[0] ;
         talbdet_impl.this.AV58Rdto = GXv_decimal10[0] ;
         talbdet_impl.this.AV59Pesoml = GXv_int11[0] ;
         talbdet_impl.this.AV109Anc = GXv_int12[0] ;
         talbdet_impl.this.AV110grm2 = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "AV60FlagArt", GXutil.str( AV60FlagArt, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV58Rdto", GXutil.ltrimstr( AV58Rdto, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV59Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Pesoml), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV109Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109Anc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV110grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110grm2), 4, 0));
      }
      if ( ( AV78SiArt == 1 ) && true /* After */ )
      {
         GXv_int13[0] = AV77ErrArt ;
         new app.core.pexiser(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_int13) ;
         talbdet_impl.this.AV77ErrArt = (byte)((byte)(GXv_int13[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77ErrArt", GXutil.str( AV77ErrArt, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char3[0] = A45AlbRef ;
         GXv_char2[0] = A3613AlbRefDsc ;
         GXv_char14[0] = AV98artblo ;
         GXv_int6[0] = AV81Flag ;
         new app.pbusardbloqueo(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_char14, GXv_int6) ;
         talbdet_impl.this.A396EmprCod = GXv_char4[0] ;
         talbdet_impl.this.A252CliCod = GXv_int8[0] ;
         talbdet_impl.this.A45AlbRef = GXv_char3[0] ;
         talbdet_impl.this.A3613AlbRefDsc = GXv_char2[0] ;
         talbdet_impl.this.AV98artblo = GXv_char14[0] ;
         talbdet_impl.this.AV81Flag = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV98artblo", AV98artblo);
         httpContext.ajax_rsp_assign_attri("", false, "AV81Flag", GXutil.str( AV81Flag, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( GXutil.strcmp(AV98artblo, httpContext.getMessage( "S", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Articulo BLOQUEADO. Consultar", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = dynAlbRef.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV78SiArt == 1 ) && true /* After */ && ( AV77ErrArt == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe ARTICULO ¡¡¡", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = dynAlbRef.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ( GXutil.strcmp(A45AlbRef, " ") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Articulo Incorrecto ¡¡¡", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = dynAlbRef.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV75Tintatex == 1 ) && true /* After */ )
      {
         GXt_int5 = AV76ErrP ;
         GXv_char14[0] = " " ;
         GXv_int6[0] = GXt_int5 ;
         new app.pproced(remoteHandle, context).execute( A396EmprCod, A970ProceCod, GXv_char14, GXv_int6) ;
         talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
         AV76ErrP = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76ErrP", GXutil.str( AV76ErrP, 1, 0));
      }
      if ( ( AV75Tintatex == 1 ) && true /* After */ && ( AV76ErrP == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Procedencia ¡¡¡", ""), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = dynProceCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV75Tintatex == 1 ) && true /* After */ && ( A970ProceCod == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No es posible Procedencia=0¡¡¡", ""), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = dynProceCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV89Velluts == 1 ) && ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Albaran¡¡¡", ""), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = dynProceCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) || ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV89Velluts == 1 ) && ( GXutil.strcmp(A50AlbRLoc, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Localizacion¡¡¡", ""), 1, "ALBRLOC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLoc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") != 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 0 ) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_char4[0] = A50AlbRLoc ;
         GXv_char3[0] = AV106Msg_Ubica ;
         new app.pcubitinte(remoteHandle, context).execute( GXv_char14, GXv_char4, GXv_char3) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         talbdet_impl.this.A50AlbRLoc = GXv_char4[0] ;
         talbdet_impl.this.AV106Msg_Ubica = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         httpContext.ajax_rsp_assign_attri("", false, "AV106Msg_Ubica", AV106Msg_Ubica);
      }
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") != 0 ) && ( GXutil.strcmp(AV106Msg_Ubica, " ") != 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV106Msg_Ubica, 1, "ALBRLOC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLoc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") == 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Campo Localizacion sin Valor ¡¡¡", ""), 1, "ALBRLOC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLoc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") != 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 1 ) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_char4[0] = A50AlbRLoc ;
         GXv_char3[0] = AV106Msg_Ubica ;
         new app.pubicacioncontrol(remoteHandle, context).execute( GXv_char14, GXv_char4, GXv_char3) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         talbdet_impl.this.A50AlbRLoc = GXv_char4[0] ;
         talbdet_impl.this.AV106Msg_Ubica = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         httpContext.ajax_rsp_assign_attri("", false, "AV106Msg_Ubica", AV106Msg_Ubica);
      }
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") != 0 ) && ( GXutil.strcmp(AV106Msg_Ubica, " ") != 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV106Msg_Ubica, 1, "ALBRLOC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLoc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") == 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Campo Localizacion sin Valor ¡¡¡", ""), 1, "ALBRLOC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLoc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) || ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Reclamacion?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRREO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRReo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T007C11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = dynCliCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T007C11_A279CliNom[0] ;
      pr_default.close(7);
      /* Using cursor T007C12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = dynTrnCod.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T007C12_A841TrnNom[0] ;
      n841TrnNom = T007C12_n841TrnNom[0] ;
      pr_default.close(8);
      /* Using cursor T007C13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = dynProceCod.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T007C13_A971ProceNom[0] ;
      n971ProceNom = T007C13_n971ProceNom[0] ;
      pr_default.close(9);
      /* Using cursor T007C14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = dynTipEntCod.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1212TipEntNom = T007C14_A1212TipEntNom[0] ;
      n1212TipEntNom = T007C14_n1212TipEntNom[0] ;
      pr_default.close(10);
      /* Using cursor T007C7 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A2152AlbDetPie = T007C7_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T007C7_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T007C7_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T007C7_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T007C7_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A10758SumKgs = T007C7_A10758SumKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = T007C7_A10759SumMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10760SumPzs = T007C7_A10760SumPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         nIsDirty_7 = (short)(1) ;
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         nIsDirty_7 = (short)(1) ;
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         nIsDirty_7 = (short)(1) ;
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         nIsDirty_7 = (short)(1) ;
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         nIsDirty_7 = (short)(1) ;
         A10758SumKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         nIsDirty_7 = (short)(1) ;
         A10759SumMts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         nIsDirty_7 = (short)(1) ;
         A10760SumPzs = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      pr_default.close(3);
      if ( ! (0==A2152AlbDetPie) )
      {
         nIsDirty_7 = (short)(1) ;
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            nIsDirty_7 = (short)(1) ;
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      nIsDirty_7 = (short)(1) ;
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      nIsDirty_7 = (short)(1) ;
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A47AlbREst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            nIsDirty_7 = (short)(1) ;
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               nIsDirty_7 = (short)(1) ;
               A47AlbREst = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
            else
            {
               if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
               {
                  nIsDirty_7 = (short)(1) ;
                  A47AlbREst = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               }
               else
               {
                  if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
                  {
                     nIsDirty_7 = (short)(1) ;
                     A47AlbREst = (byte)(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  }
               }
            }
         }
      }
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            nIsDirty_7 = (short)(1) ;
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      gxaalbref_html7C7( A396EmprCod, A252CliCod) ;
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            nIsDirty_7 = (short)(1) ;
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      if ( ! (0==A2153AlbDetPieU) )
      {
         nIsDirty_7 = (short)(1) ;
         A54AlbRPieUti = A2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      nIsDirty_7 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
   }

   public void closeExtendedTableCursors7C7( )
   {
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_138( String A396EmprCod ,
                           int A252CliCod )
   {
      /* Using cursor T007C17 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = dynCliCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T007C17_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_139( String A396EmprCod ,
                           short A840TrnCod )
   {
      /* Using cursor T007C18 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = dynTrnCod.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T007C18_A841TrnNom[0] ;
      n841TrnNom = T007C18_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_140( String A396EmprCod ,
                           short A970ProceCod )
   {
      /* Using cursor T007C19 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = dynProceCod.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T007C19_A971ProceNom[0] ;
      n971ProceNom = T007C19_n971ProceNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A971ProceNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_141( String A396EmprCod ,
                           short A1211TipEntCod )
   {
      /* Using cursor T007C20 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = dynTipEntCod.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1212TipEntNom = T007C20_A1212TipEntNom[0] ;
      n1212TipEntNom = T007C20_n1212TipEntNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1212TipEntNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_142( String A396EmprCod ,
                           int A44AlbRecCod )
   {
      /* Using cursor T007C22 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A2152AlbDetPie = T007C22_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T007C22_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T007C22_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T007C22_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T007C22_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A10758SumKgs = T007C22_A10758SumKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = T007C22_A10759SumMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10760SumPzs = T007C22_A10760SumPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A10758SumKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10760SumPzs = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2152AlbDetPie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2149AlbDetMtr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2146AlbDetKgm, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2151AlbDetMtrU, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2148AlbDetKgmU, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10758SumKgs, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10759SumMts, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10760SumPzs, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey7C7( )
   {
      /* Using cursor T007C23 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T007C9 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T007C9_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm7C7( 136) ;
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T007C9_A44AlbRecCod[0] ;
         n44AlbRecCod = T007C9_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A5806AlbREnt2 = T007C9_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A46AlbREnt = T007C9_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A58AlbRUniEnt = T007C9_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = T007C9_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = T007C9_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = T007C9_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A47AlbREst = T007C9_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A56AlbRUni = T007C9_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A3613AlbRefDsc = T007C9_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A49AlbRFen = T007C9_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A4606AlbRHEn = T007C9_A4606AlbRHEn[0] ;
         n4606AlbRHEn = T007C9_n4606AlbRHEn[0] ;
         A45AlbRef = T007C9_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A1291AlbRDes = T007C9_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A50AlbRLoc = T007C9_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A55AlbRReo = T007C9_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A48AlbRFecUlt = T007C9_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A6180AlbrUniC = T007C9_A6180AlbrUniC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A6181AlbrPieC = T007C9_A6181AlbrPieC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A4920AlbRGrm2 = T007C9_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T007C9_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = T007C9_A4922AlbPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         A6463AlbRLote = T007C9_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A13241AlbRPh = T007C9_A13241AlbRPh[0] ;
         n13241AlbRPh = T007C9_n13241AlbRPh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
         A13242AlbRRLong = T007C9_A13242AlbRRLong[0] ;
         n13242AlbRRLong = T007C9_n13242AlbRRLong[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
         A13243AlbRRTrans = T007C9_A13243AlbRRTrans[0] ;
         n13243AlbRRTrans = T007C9_n13243AlbRRTrans[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
         A8029AlbNumM = T007C9_A8029AlbNumM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
         A53AlbRPieReb = T007C9_A53AlbRPieReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         A59AlbRUniReb = T007C9_A59AlbRUniReb[0] ;
         A10761AlbUltP = T007C9_A10761AlbUltP[0] ;
         n10761AlbUltP = T007C9_n10761AlbUltP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         A7501AlbRecSec = T007C9_A7501AlbRecSec[0] ;
         n7501AlbRecSec = T007C9_n7501AlbRecSec[0] ;
         A1222AlbNumEti = T007C9_A1222AlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         A252CliCod = T007C9_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T007C9_A840TrnCod[0] ;
         n840TrnCod = T007C9_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T007C9_A970ProceCod[0] ;
         n970ProceCod = T007C9_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T007C9_A1211TipEntCod[0] ;
         n1211TipEntCod = T007C9_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         O10761AlbUltP = A10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         O5806AlbREnt2 = A5806AlbREnt2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load7C7( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKey7C7( ) ;
         }
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKey7C7( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey7C7( ) ;
      if ( RcdFound7 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T007C24 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T007C24_A44AlbRecCod[0] < A44AlbRecCod ) ) && ( GXutil.strcmp(T007C24_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T007C24_A44AlbRecCod[0] > A44AlbRecCod ) ) && ( GXutil.strcmp(T007C24_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A44AlbRecCod = T007C24_A44AlbRecCod[0] ;
            n44AlbRecCod = T007C24_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void move_previous( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T007C25 */
      pr_default.execute(19, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( T007C25_A44AlbRecCod[0] > A44AlbRecCod ) ) && ( GXutil.strcmp(T007C25_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( T007C25_A44AlbRecCod[0] < A44AlbRecCod ) ) && ( GXutil.strcmp(T007C25_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A44AlbRecCod = T007C25_A44AlbRecCod[0] ;
            n44AlbRecCod = T007C25_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey7C7( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A10761AlbUltP = O10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         A10760SumPzs = O10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         A10758SumKgs = O10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = O10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         AV93Inc_obs = OV93Inc_obs ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
         A2147AlbDetKgmD = O2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         A2150AlbDetMtrD = O2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2153AlbDetPieU = O2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         A58AlbRUniEnt = O58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = O60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = O52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = O54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A47AlbREst = O47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         AV18AlbCum = OV18AlbCum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert7C7( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound7 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               A44AlbRecCod = Z44AlbRecCod ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A10761AlbUltP = O10761AlbUltP ;
               n10761AlbUltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
               A10760SumPzs = O10760SumPzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
               A10758SumKgs = O10758SumKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
               A10759SumMts = O10759SumMts ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
               AV93Inc_obs = OV93Inc_obs ;
               httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               A58AlbRUniEnt = O58AlbRUniEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A52AlbRPieEnt = O52AlbRPieEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               AV18AlbCum = OV18AlbCum ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A10761AlbUltP = O10761AlbUltP ;
               n10761AlbUltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
               A10760SumPzs = O10760SumPzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
               A10758SumKgs = O10758SumKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
               A10759SumMts = O10759SumMts ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
               AV93Inc_obs = OV93Inc_obs ;
               httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               A58AlbRUniEnt = O58AlbRUniEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A52AlbRPieEnt = O52AlbRPieEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               AV18AlbCum = OV18AlbCum ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
               update7C7( ) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               /* Insert record */
               A10761AlbUltP = O10761AlbUltP ;
               n10761AlbUltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
               A10760SumPzs = O10760SumPzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
               A10758SumKgs = O10758SumKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
               A10759SumMts = O10759SumMts ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
               AV93Inc_obs = OV93Inc_obs ;
               httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               A58AlbRUniEnt = O58AlbRUniEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A52AlbRPieEnt = O52AlbRPieEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               AV18AlbCum = OV18AlbCum ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert7C7( ) ;
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
                  A10761AlbUltP = O10761AlbUltP ;
                  n10761AlbUltP = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
                  A10760SumPzs = O10760SumPzs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
                  A10758SumKgs = O10758SumKgs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
                  A10759SumMts = O10759SumMts ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
                  AV93Inc_obs = OV93Inc_obs ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
                  A2147AlbDetKgmD = O2147AlbDetKgmD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                  A2150AlbDetMtrD = O2150AlbDetMtrD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                  A2153AlbDetPieU = O2153AlbDetPieU ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                  A58AlbRUniEnt = O58AlbRUniEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                  A60AlbRUniUti = O60AlbRUniUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  A52AlbRPieEnt = O52AlbRPieEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                  A54AlbRPieUti = O54AlbRPieUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                  A47AlbREst = O47AlbREst ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  AV18AlbCum = OV18AlbCum ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
                  GX_FocusControl = edtAlbRecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert7C7( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         A44AlbRecCod = Z44AlbRecCod ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A10761AlbUltP = O10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         A10760SumPzs = O10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         A10758SumKgs = O10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = O10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         AV93Inc_obs = OV93Inc_obs ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
         A2147AlbDetKgmD = O2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         A2150AlbDetMtrD = O2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2153AlbDetPieU = O2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         A58AlbRUniEnt = O58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = O60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = O52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = O54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A47AlbREst = O47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         AV18AlbCum = OV18AlbCum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency7C7( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T007C8 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z5806AlbREnt2, T007C8_A5806AlbREnt2[0]) != 0 ) || ( GXutil.strcmp(Z46AlbREnt, T007C8_A46AlbREnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T007C8_A58AlbRUniEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z60AlbRUniUti, T007C8_A60AlbRUniUti[0]) != 0 ) || ( Z52AlbRPieEnt != T007C8_A52AlbRPieEnt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z54AlbRPieUti != T007C8_A54AlbRPieUti[0] ) || ( Z47AlbREst != T007C8_A47AlbREst[0] ) || ( GXutil.strcmp(Z56AlbRUni, T007C8_A56AlbRUni[0]) != 0 ) || ( GXutil.strcmp(Z3613AlbRefDsc, T007C8_A3613AlbRefDsc[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T007C8_A49AlbRFen[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z4606AlbRHEn, T007C8_A4606AlbRHEn[0]) ) || ( GXutil.strcmp(Z45AlbRef, T007C8_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z1291AlbRDes, T007C8_A1291AlbRDes[0]) != 0 ) || ( GXutil.strcmp(Z50AlbRLoc, T007C8_A50AlbRLoc[0]) != 0 ) || ( GXutil.strcmp(Z55AlbRReo, T007C8_A55AlbRReo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T007C8_A48AlbRFecUlt[0])) ) || ( DecimalUtil.compareTo(Z6180AlbrUniC, T007C8_A6180AlbrUniC[0]) != 0 ) || ( Z6181AlbrPieC != T007C8_A6181AlbrPieC[0] ) || ( Z4920AlbRGrm2 != T007C8_A4920AlbRGrm2[0] ) || ( Z4921AlbRAnc != T007C8_A4921AlbRAnc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4922AlbPml != T007C8_A4922AlbPml[0] ) || ( GXutil.strcmp(Z6463AlbRLote, T007C8_A6463AlbRLote[0]) != 0 ) || ( DecimalUtil.compareTo(Z13241AlbRPh, T007C8_A13241AlbRPh[0]) != 0 ) || ( DecimalUtil.compareTo(Z13242AlbRRLong, T007C8_A13242AlbRRLong[0]) != 0 ) || ( DecimalUtil.compareTo(Z13243AlbRRTrans, T007C8_A13243AlbRRTrans[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8029AlbNumM, T007C8_A8029AlbNumM[0]) != 0 ) || ( Z53AlbRPieReb != T007C8_A53AlbRPieReb[0] ) || ( DecimalUtil.compareTo(Z59AlbRUniReb, T007C8_A59AlbRUniReb[0]) != 0 ) || ( Z10761AlbUltP != T007C8_A10761AlbUltP[0] ) || ( Z7501AlbRecSec != T007C8_A7501AlbRecSec[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1222AlbNumEti != T007C8_A1222AlbNumEti[0] ) || ( Z252CliCod != T007C8_A252CliCod[0] ) || ( Z840TrnCod != T007C8_A840TrnCod[0] ) || ( Z970ProceCod != T007C8_A970ProceCod[0] ) || ( Z1211TipEntCod != T007C8_A1211TipEntCod[0] ) )
         {
            if ( GXutil.strcmp(Z5806AlbREnt2, T007C8_A5806AlbREnt2[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbREnt2");
               GXutil.writeLogRaw("Old: ",Z5806AlbREnt2);
               GXutil.writeLogRaw("Current: ",T007C8_A5806AlbREnt2[0]);
            }
            if ( GXutil.strcmp(Z46AlbREnt, T007C8_A46AlbREnt[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbREnt");
               GXutil.writeLogRaw("Old: ",Z46AlbREnt);
               GXutil.writeLogRaw("Current: ",T007C8_A46AlbREnt[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T007C8_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T007C8_A58AlbRUniEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z60AlbRUniUti, T007C8_A60AlbRUniUti[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRUniUti");
               GXutil.writeLogRaw("Old: ",Z60AlbRUniUti);
               GXutil.writeLogRaw("Current: ",T007C8_A60AlbRUniUti[0]);
            }
            if ( Z52AlbRPieEnt != T007C8_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T007C8_A52AlbRPieEnt[0]);
            }
            if ( Z54AlbRPieUti != T007C8_A54AlbRPieUti[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRPieUti");
               GXutil.writeLogRaw("Old: ",Z54AlbRPieUti);
               GXutil.writeLogRaw("Current: ",T007C8_A54AlbRPieUti[0]);
            }
            if ( Z47AlbREst != T007C8_A47AlbREst[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T007C8_A47AlbREst[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T007C8_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T007C8_A56AlbRUni[0]);
            }
            if ( GXutil.strcmp(Z3613AlbRefDsc, T007C8_A3613AlbRefDsc[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRefDsc");
               GXutil.writeLogRaw("Old: ",Z3613AlbRefDsc);
               GXutil.writeLogRaw("Current: ",T007C8_A3613AlbRefDsc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T007C8_A49AlbRFen[0])) ) )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRFen");
               GXutil.writeLogRaw("Old: ",Z49AlbRFen);
               GXutil.writeLogRaw("Current: ",T007C8_A49AlbRFen[0]);
            }
            if ( !( GXutil.dateCompare(Z4606AlbRHEn, T007C8_A4606AlbRHEn[0]) ) )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRHEn");
               GXutil.writeLogRaw("Old: ",Z4606AlbRHEn);
               GXutil.writeLogRaw("Current: ",T007C8_A4606AlbRHEn[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T007C8_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T007C8_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z1291AlbRDes, T007C8_A1291AlbRDes[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRDes");
               GXutil.writeLogRaw("Old: ",Z1291AlbRDes);
               GXutil.writeLogRaw("Current: ",T007C8_A1291AlbRDes[0]);
            }
            if ( GXutil.strcmp(Z50AlbRLoc, T007C8_A50AlbRLoc[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRLoc");
               GXutil.writeLogRaw("Old: ",Z50AlbRLoc);
               GXutil.writeLogRaw("Current: ",T007C8_A50AlbRLoc[0]);
            }
            if ( GXutil.strcmp(Z55AlbRReo, T007C8_A55AlbRReo[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRReo");
               GXutil.writeLogRaw("Old: ",Z55AlbRReo);
               GXutil.writeLogRaw("Current: ",T007C8_A55AlbRReo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T007C8_A48AlbRFecUlt[0])) ) )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRFecUlt");
               GXutil.writeLogRaw("Old: ",Z48AlbRFecUlt);
               GXutil.writeLogRaw("Current: ",T007C8_A48AlbRFecUlt[0]);
            }
            if ( DecimalUtil.compareTo(Z6180AlbrUniC, T007C8_A6180AlbrUniC[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbrUniC");
               GXutil.writeLogRaw("Old: ",Z6180AlbrUniC);
               GXutil.writeLogRaw("Current: ",T007C8_A6180AlbrUniC[0]);
            }
            if ( Z6181AlbrPieC != T007C8_A6181AlbrPieC[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbrPieC");
               GXutil.writeLogRaw("Old: ",Z6181AlbrPieC);
               GXutil.writeLogRaw("Current: ",T007C8_A6181AlbrPieC[0]);
            }
            if ( Z4920AlbRGrm2 != T007C8_A4920AlbRGrm2[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRGrm2");
               GXutil.writeLogRaw("Old: ",Z4920AlbRGrm2);
               GXutil.writeLogRaw("Current: ",T007C8_A4920AlbRGrm2[0]);
            }
            if ( Z4921AlbRAnc != T007C8_A4921AlbRAnc[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRAnc");
               GXutil.writeLogRaw("Old: ",Z4921AlbRAnc);
               GXutil.writeLogRaw("Current: ",T007C8_A4921AlbRAnc[0]);
            }
            if ( Z4922AlbPml != T007C8_A4922AlbPml[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbPml");
               GXutil.writeLogRaw("Old: ",Z4922AlbPml);
               GXutil.writeLogRaw("Current: ",T007C8_A4922AlbPml[0]);
            }
            if ( GXutil.strcmp(Z6463AlbRLote, T007C8_A6463AlbRLote[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRLote");
               GXutil.writeLogRaw("Old: ",Z6463AlbRLote);
               GXutil.writeLogRaw("Current: ",T007C8_A6463AlbRLote[0]);
            }
            if ( DecimalUtil.compareTo(Z13241AlbRPh, T007C8_A13241AlbRPh[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRPh");
               GXutil.writeLogRaw("Old: ",Z13241AlbRPh);
               GXutil.writeLogRaw("Current: ",T007C8_A13241AlbRPh[0]);
            }
            if ( DecimalUtil.compareTo(Z13242AlbRRLong, T007C8_A13242AlbRRLong[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRRLong");
               GXutil.writeLogRaw("Old: ",Z13242AlbRRLong);
               GXutil.writeLogRaw("Current: ",T007C8_A13242AlbRRLong[0]);
            }
            if ( DecimalUtil.compareTo(Z13243AlbRRTrans, T007C8_A13243AlbRRTrans[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRRTrans");
               GXutil.writeLogRaw("Old: ",Z13243AlbRRTrans);
               GXutil.writeLogRaw("Current: ",T007C8_A13243AlbRRTrans[0]);
            }
            if ( GXutil.strcmp(Z8029AlbNumM, T007C8_A8029AlbNumM[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbNumM");
               GXutil.writeLogRaw("Old: ",Z8029AlbNumM);
               GXutil.writeLogRaw("Current: ",T007C8_A8029AlbNumM[0]);
            }
            if ( Z53AlbRPieReb != T007C8_A53AlbRPieReb[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRPieReb");
               GXutil.writeLogRaw("Old: ",Z53AlbRPieReb);
               GXutil.writeLogRaw("Current: ",T007C8_A53AlbRPieReb[0]);
            }
            if ( DecimalUtil.compareTo(Z59AlbRUniReb, T007C8_A59AlbRUniReb[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRUniReb");
               GXutil.writeLogRaw("Old: ",Z59AlbRUniReb);
               GXutil.writeLogRaw("Current: ",T007C8_A59AlbRUniReb[0]);
            }
            if ( Z10761AlbUltP != T007C8_A10761AlbUltP[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbUltP");
               GXutil.writeLogRaw("Old: ",Z10761AlbUltP);
               GXutil.writeLogRaw("Current: ",T007C8_A10761AlbUltP[0]);
            }
            if ( Z7501AlbRecSec != T007C8_A7501AlbRecSec[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRecSec");
               GXutil.writeLogRaw("Old: ",Z7501AlbRecSec);
               GXutil.writeLogRaw("Current: ",T007C8_A7501AlbRecSec[0]);
            }
            if ( Z1222AlbNumEti != T007C8_A1222AlbNumEti[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbNumEti");
               GXutil.writeLogRaw("Old: ",Z1222AlbNumEti);
               GXutil.writeLogRaw("Current: ",T007C8_A1222AlbNumEti[0]);
            }
            if ( Z252CliCod != T007C8_A252CliCod[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T007C8_A252CliCod[0]);
            }
            if ( Z840TrnCod != T007C8_A840TrnCod[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T007C8_A840TrnCod[0]);
            }
            if ( Z970ProceCod != T007C8_A970ProceCod[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"ProceCod");
               GXutil.writeLogRaw("Old: ",Z970ProceCod);
               GXutil.writeLogRaw("Current: ",T007C8_A970ProceCod[0]);
            }
            if ( Z1211TipEntCod != T007C8_A1211TipEntCod[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"TipEntCod");
               GXutil.writeLogRaw("Old: ",Z1211TipEntCod);
               GXutil.writeLogRaw("Current: ",T007C8_A1211TipEntCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert7C7( )
   {
      beforeValidate7C7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable7C7( ) ;
      }
      if ( AnyError == 0 )
      {
         zm7C7( 0) ;
         checkOptimisticConcurrency7C7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm7C7( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert7C7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T007C26 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A5806AlbREnt2, A46AlbREnt, A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A56AlbRUni, A3613AlbRefDsc, A49AlbRFen, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A45AlbRef, A1291AlbRDes, A50AlbRLoc, A55AlbRReo, A48AlbRFecUlt, A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A6463AlbRLote, Boolean.valueOf(n13241AlbRPh), A13241AlbRPh, Boolean.valueOf(n13242AlbRRLong), A13242AlbRRLong, Boolean.valueOf(n13243AlbRRTrans), A13243AlbRRTrans, A8029AlbNumM, Integer.valueOf(A53AlbRPieReb), A59AlbRUniReb, Boolean.valueOf(n10761AlbUltP), Short.valueOf(A10761AlbUltP), Boolean.valueOf(n7501AlbRecSec), Short.valueOf(A7501AlbRecSec), Short.valueOf(A1222AlbNumEti), A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(20) == 1) )
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
                        processLevel7C7( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption7C0( ) ;
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
            load7C7( ) ;
         }
         endLevel7C7( ) ;
      }
      closeExtendedTableCursors7C7( ) ;
   }

   public void update7C7( )
   {
      beforeValidate7C7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable7C7( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency7C7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm7C7( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate7C7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T007C27 */
                  pr_default.execute(21, new Object[] {A5806AlbREnt2, A46AlbREnt, A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A56AlbRUni, A3613AlbRefDsc, A49AlbRFen, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A45AlbRef, A1291AlbRDes, A50AlbRLoc, A55AlbRReo, A48AlbRFecUlt, A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A6463AlbRLote, Boolean.valueOf(n13241AlbRPh), A13241AlbRPh, Boolean.valueOf(n13242AlbRRLong), A13242AlbRRLong, Boolean.valueOf(n13243AlbRRTrans), A13243AlbRRTrans, A8029AlbNumM, Integer.valueOf(A53AlbRPieReb), A59AlbRUniReb, Boolean.valueOf(n10761AlbUltP), Short.valueOf(A10761AlbUltP), Boolean.valueOf(n7501AlbRecSec), Short.valueOf(A7501AlbRecSec), Short.valueOf(A1222AlbNumEti), Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate7C7( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char14[0] = A396EmprCod ;
                     GXv_int8[0] = A44AlbRecCod ;
                     new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char14, GXv_int8) ;
                     talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
                     talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
                     /* Start of After( update) rules */
                     if ( true /* After */ && ( GXutil.strcmp(A5806AlbREnt2, AV92OldAlb2) != 0 ) )
                     {
                        AV93Inc_obs = httpContext.getMessage( httpContext.getMessage( "TALBDET-Modificacion Registro,AlbReccod=", ""), "") + GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( " Cliente=", ""), "") + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + GXutil.trim( A45AlbRef) + " " + GXutil.trim( A3613AlbRefDsc) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Guia (old) =", ""), "") + AV92OldAlb2 + httpContext.getMessage( httpContext.getMessage( " Guia (new) =", ""), "") + A5806AlbREnt2 + GXutil.newLine( ) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
                     }
                     if ( true /* After */ && ( GXutil.strcmp(A5806AlbREnt2, AV92OldAlb2) != 0 ) )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV124Pgmname, AV17UsurCod, AV38Station, AV93Inc_obs, A44AlbRecCod, (byte)(0), "@") ;
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel7C7( ) ;
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
         endLevel7C7( ) ;
      }
      closeExtendedTableCursors7C7( ) ;
   }

   public void deferredUpdate7C7( )
   {
   }

   public void delete( )
   {
      beforeValidate7C7( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency7C7( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls7C7( ) ;
         afterConfirm7C7( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete7C7( ) ;
            if ( AnyError == 0 )
            {
               A10761AlbUltP = O10761AlbUltP ;
               n10761AlbUltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
               A10760SumPzs = O10760SumPzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
               A10758SumKgs = O10758SumKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
               A10759SumMts = O10759SumMts ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
               AV93Inc_obs = OV93Inc_obs ;
               httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               A58AlbRUniEnt = O58AlbRUniEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A52AlbRPieEnt = O52AlbRPieEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               AV18AlbCum = OV18AlbCum ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
               scanStart7C299( ) ;
               while ( RcdFound299 != 0 )
               {
                  getByPrimaryKey7C299( ) ;
                  delete7C299( ) ;
                  scanNext7C299( ) ;
                  O10761AlbUltP = A10761AlbUltP ;
                  n10761AlbUltP = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
                  O10760SumPzs = A10760SumPzs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
                  O10758SumKgs = A10758SumKgs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
                  O10759SumMts = A10759SumMts ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
                  OV93Inc_obs = AV93Inc_obs ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
                  O2147AlbDetKgmD = A2147AlbDetKgmD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                  O2150AlbDetMtrD = A2150AlbDetMtrD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                  O2153AlbDetPieU = A2153AlbDetPieU ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                  O58AlbRUniEnt = A58AlbRUniEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                  O60AlbRUniUti = A60AlbRUniUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  O52AlbRPieEnt = A52AlbRPieEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                  O54AlbRPieUti = A54AlbRPieUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                  O47AlbREst = A47AlbREst ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  OV18AlbCum = AV18AlbCum ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
               }
               scanEnd7C299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T007C28 */
                  pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     if ( true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV124Pgmname, AV17UsurCod, AV38Station, AV93Inc_obs, A44AlbRecCod, (byte)(0), "@") ;
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
      }
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel7C7( ) ;
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls7C7( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && ( ! (0==A44AlbRecCod) ) && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran inexistente", ""), 1, "ALBRECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         AV92OldAlb2 = O5806AlbREnt2 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92OldAlb2", AV92OldAlb2);
         if ( ( AV75Tintatex == 1 ) && true /* After */ )
         {
            GXt_int5 = AV76ErrP ;
            GXv_char14[0] = " " ;
            GXv_int6[0] = GXt_int5 ;
            new app.pproced(remoteHandle, context).execute( A396EmprCod, A970ProceCod, GXv_char14, GXv_int6) ;
            talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
            AV76ErrP = GXt_int5 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76ErrP", GXutil.str( AV76ErrP, 1, 0));
         }
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         if ( A47AlbREst == 1 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
         else
         {
            if ( A47AlbREst == 0 )
            {
               AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
            }
         }
         /* Using cursor T007C29 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T007C29_A279CliNom[0] ;
         pr_default.close(23);
         /* Using cursor T007C30 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T007C30_A841TrnNom[0] ;
         n841TrnNom = T007C30_n841TrnNom[0] ;
         pr_default.close(24);
         /* Using cursor T007C31 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = T007C31_A971ProceNom[0] ;
         n971ProceNom = T007C31_n971ProceNom[0] ;
         pr_default.close(25);
         /* Using cursor T007C32 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
         A1212TipEntNom = T007C32_A1212TipEntNom[0] ;
         n1212TipEntNom = T007C32_n1212TipEntNom[0] ;
         pr_default.close(26);
         /* Using cursor T007C34 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            A2152AlbDetPie = T007C34_A2152AlbDetPie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
            A2149AlbDetMtr = T007C34_A2149AlbDetMtr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
            A2146AlbDetKgm = T007C34_A2146AlbDetKgm[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
            A2151AlbDetMtrU = T007C34_A2151AlbDetMtrU[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
            A2148AlbDetKgmU = T007C34_A2148AlbDetKgmU[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
            A10758SumKgs = T007C34_A10758SumKgs[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            A10759SumMts = T007C34_A10759SumMts[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            A10760SumPzs = T007C34_A10760SumPzs[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         }
         else
         {
            A2152AlbDetPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
            A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
            A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
            A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
            A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
            A10758SumKgs = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            A10759SumMts = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            A10760SumPzs = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         }
         pr_default.close(27);
         A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         gxaalbref_html7C7( A396EmprCod, A252CliCod) ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            }
            else
            {
               A2153AlbDetPieU = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T007C35 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Entradas Almacen Crudo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T007C36 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T007C37 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T007C38 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T007C39 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T007C40 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T007C41 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T007C42 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T007C43 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBRDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T007C44 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPieDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T007C45 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T007C46 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBROB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T007C47 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T007C48 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T007C49 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
      }
   }

   public void processNestedLevel7C299( )
   {
      s10761AlbUltP = O10761AlbUltP ;
      n10761AlbUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      s10760SumPzs = O10760SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      s10758SumKgs = O10758SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      s10759SumMts = O10759SumMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      sV93Inc_obs = OV93Inc_obs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
      s2147AlbDetKgmD = O2147AlbDetKgmD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      s2150AlbDetMtrD = O2150AlbDetMtrD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      s2153AlbDetPieU = O2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      s58AlbRUniEnt = O58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      s60AlbRUniUti = O60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      s52AlbRPieEnt = O52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      s54AlbRPieUti = O54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      s47AlbREst = O47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      sV18AlbCum = OV18AlbCum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      nGXsfl_181_idx = 0 ;
      while ( nGXsfl_181_idx < nRC_GXsfl_181 )
      {
         readRow7C299( ) ;
         if ( ( nRcdExists_299 != 0 ) || ( nIsMod_299 != 0 ) )
         {
            standaloneNotModal7C299( ) ;
            getKey7C299( ) ;
            if ( ( nRcdExists_299 == 0 ) && ( nRcdDeleted_299 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert7C299( ) ;
            }
            else
            {
               if ( RcdFound299 != 0 )
               {
                  if ( ( nRcdDeleted_299 != 0 ) && ( nRcdExists_299 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete7C299( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_299 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update7C299( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_299 == 0 )
                  {
                     GXCCtl = "ALBRECPIE_" + sGXsfl_181_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O10761AlbUltP = A10761AlbUltP ;
            n10761AlbUltP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
            O10760SumPzs = A10760SumPzs ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
            O10758SumKgs = A10758SumKgs ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            O10759SumMts = A10759SumMts ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            OV93Inc_obs = AV93Inc_obs ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
            O2147AlbDetKgmD = A2147AlbDetKgmD ;
            httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
            O2150AlbDetMtrD = A2150AlbDetMtrD ;
            httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
            O2153AlbDetPieU = A2153AlbDetPieU ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            O58AlbRUniEnt = A58AlbRUniEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            O60AlbRUniUti = A60AlbRUniUti ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            O52AlbRPieEnt = A52AlbRPieEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            O54AlbRPieUti = A54AlbRPieUti ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            O47AlbREst = A47AlbREst ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            OV18AlbCum = AV18AlbCum ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
         httpContext.changePostValue( edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie)) ;
         httpContext.changePostValue( edtALRPIELOC_Internalname, GXutil.rtrim( A7408ALRPIELOC)) ;
         httpContext.changePostValue( edtAlbRecAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRPieClaC_Internalname, GXutil.rtrim( A4797AlRPieClaC)) ;
         httpContext.changePostValue( edtBod_Talla_Internalname, GXutil.rtrim( A8779Bod_Talla)) ;
         httpContext.changePostValue( edtBod_Und_Internalname, GXutil.ltrim( localUtil.ntoc( A8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecCol_Internalname, GXutil.ltrim( localUtil.ntoc( A3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecIdPz_Internalname, GXutil.rtrim( A3731AlbRecIdPz)) ;
         httpContext.changePostValue( edtAlbRecIdRc_Internalname, GXutil.ltrim( localUtil.ntoc( A3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecPal_Internalname, GXutil.ltrim( localUtil.ntoc( A4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRPieTelT_Internalname, GXutil.rtrim( A10180AlRPieTelT)) ;
         httpContext.changePostValue( edtAlRPieCon_Internalname, GXutil.ltrim( localUtil.ntoc( A10149AlRPieCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRPieOri_Internalname, GXutil.rtrim( A10181AlRPieOri)) ;
         httpContext.changePostValue( edtAlRPieDst_Internalname, GXutil.rtrim( A10182AlRPieDst)) ;
         httpContext.changePostValue( edtAlrPieKgmT_Internalname, GXutil.ltrim( localUtil.ntoc( A10183AlrPieKgmT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPCont_Internalname, GXutil.ltrim( localUtil.ntoc( A10762AlbPCont, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_181_idx, GXutil.rtrim( Z2159AlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_181_idx, GXutil.rtrim( Z4795AlRPieCal)) ;
         httpContext.changePostValue( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10762AlbPCont_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z10762AlbPCont, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8779Bod_Talla_"+sGXsfl_181_idx, GXutil.rtrim( Z8779Bod_Talla)) ;
         httpContext.changePostValue( "ZT_"+"Z8780Bod_Und_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3730AlbRecCol_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3731AlbRecIdPz_"+sGXsfl_181_idx, GXutil.rtrim( Z3731AlbRecIdPz)) ;
         httpContext.changePostValue( "ZT_"+"Z3732AlbRecIdRc_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4410AlbRecPal_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10180AlRPieTelT_"+sGXsfl_181_idx, GXutil.rtrim( Z10180AlRPieTelT)) ;
         httpContext.changePostValue( "ZT_"+"Z10149AlRPieCon_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z10149AlRPieCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10181AlRPieOri_"+sGXsfl_181_idx, GXutil.rtrim( Z10181AlRPieOri)) ;
         httpContext.changePostValue( "ZT_"+"Z10182AlRPieDst_"+sGXsfl_181_idx, GXutil.rtrim( Z10182AlRPieDst)) ;
         httpContext.changePostValue( "ZT_"+"Z10183AlrPieKgmT_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z10183AlrPieKgmT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7408ALRPIELOC_"+sGXsfl_181_idx, GXutil.rtrim( Z7408ALRPIELOC)) ;
         httpContext.changePostValue( "T2155AlbRecKgm_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( O2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2157AlbRecMtr_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( O2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_299_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_299_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_299_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_299 != 0 )
         {
            httpContext.changePostValue( "ALBRECPIE_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIELOC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIELOC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECANH_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTR_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGM_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTRU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGMU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIECLAC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieClaC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_TALLA_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Talla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_UND_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Und_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCOL_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECIDPZ_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdPz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECIDRC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdRc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECPAL_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIETELT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieTelT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIECON_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIEORI_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieOri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIEDST_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieDst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIEKGMT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlrPieKgmT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCONT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPCont_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPCONT_"+sGXsfl_181_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtAlbPCont_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T007C34 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A2152AlbDetPie = T007C34_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T007C34_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T007C34_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T007C34_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T007C34_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A10758SumKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10760SumPzs = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      /* End of After( level) rules */
      initAll7C299( ) ;
      if ( AnyError != 0 )
      {
         O10761AlbUltP = s10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         O10760SumPzs = s10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         O10758SumKgs = s10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         O10759SumMts = s10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         OV93Inc_obs = sV93Inc_obs ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
         O2147AlbDetKgmD = s2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         O2150AlbDetMtrD = s2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         O2153AlbDetPieU = s2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         O58AlbRUniEnt = s58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         O60AlbRUniUti = s60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         O52AlbRPieEnt = s52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         O54AlbRPieUti = s54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O47AlbREst = s47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         OV18AlbCum = sV18AlbCum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      nRcdExists_299 = (short)(0) ;
      nIsMod_299 = (short)(0) ;
      nRcdDeleted_299 = (short)(0) ;
   }

   public void processLevel7C7( )
   {
      /* Save parent mode. */
      sMode7 = Gx_mode ;
      processNestedLevel7C299( ) ;
      if ( AnyError != 0 )
      {
         O10761AlbUltP = s10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         O10760SumPzs = s10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         O10758SumKgs = s10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         O10759SumMts = s10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         OV93Inc_obs = sV93Inc_obs ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
         O2147AlbDetKgmD = s2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         O2150AlbDetMtrD = s2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         O2153AlbDetPieU = s2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         O58AlbRUniEnt = s58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         O60AlbRUniUti = s60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         O52AlbRPieEnt = s52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         O54AlbRPieUti = s54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O47AlbREst = s47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         OV18AlbCum = sV18AlbCum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      /* Restore parent mode. */
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T007C50 */
      pr_default.execute(43, new Object[] {Boolean.valueOf(n10761AlbUltP), Short.valueOf(A10761AlbUltP), A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel7C7( )
   {
      pr_default.close(4);
      if ( AnyError == 0 )
      {
         beforeComplete7C7( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talbdet");
         if ( AnyError == 0 )
         {
            confirmValues7C0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talbdet");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart7C7( )
   {
      /* Scan By routine */
      /* Using cursor T007C51 */
      pr_default.execute(44, new Object[] {A396EmprCod});
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T007C51_A44AlbRecCod[0] ;
         n44AlbRecCod = T007C51_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext7C7( )
   {
      /* Scan next routine */
      pr_default.readNext(44);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T007C51_A44AlbRecCod[0] ;
         n44AlbRecCod = T007C51_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void scanEnd7C7( )
   {
      pr_default.close(44);
   }

   public void afterConfirm7C7( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && (0==A44AlbRecCod) && true /* Level */ && true /* After */ )
      {
         GXv_int8[0] = A44AlbRecCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int8) ;
         talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void beforeInsert7C7( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate7C7( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete7C7( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete7C7( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate7C7( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes7C7( )
   {
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), true);
      edtAlbREnt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Enabled), 5, 0), true);
      edtAlbRFen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      dynCliCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynCliCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynCliCod.getEnabled(), 5, 0), true);
      dynAlbRef.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynAlbRef.getInternalname(), "Enabled", GXutil.ltrimstr( dynAlbRef.getEnabled(), 5, 0), true);
      dynProceCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynProceCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynProceCod.getEnabled(), 5, 0), true);
      dynTrnCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynTrnCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynTrnCod.getEnabled(), 5, 0), true);
      dynTipEntCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynTipEntCod.getInternalname(), "Enabled", GXutil.ltrimstr( dynTipEntCod.getEnabled(), 5, 0), true);
      edtAlbRDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbrUniC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrUniC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrUniC_Enabled), 5, 0), true);
      edtAlbrPieC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrPieC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrPieC_Enabled), 5, 0), true);
      edtAlbNumM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumM_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlbRLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      cmbAlbRReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      edtAlbRLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Enabled), 5, 0), true);
      edtAlbRGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRGrm2_Enabled), 5, 0), true);
      edtAlbRAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAnc_Enabled), 5, 0), true);
      edtAlbPml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPml_Enabled), 5, 0), true);
      edtAlbRPh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPh_Enabled), 5, 0), true);
      edtAlbRRLong_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRRLong_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRRLong_Enabled), 5, 0), true);
      edtAlbRRTrans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRRTrans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRRTrans_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAlbDetPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetPie_Enabled), 5, 0), true);
      edtAlbDetMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtr_Enabled), 5, 0), true);
      edtAlbDetKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgm_Enabled), 5, 0), true);
      edtAlbDetMtrU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtrU_Enabled), 5, 0), true);
      edtAlbDetKgmU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgmU_Enabled), 5, 0), true);
      edtAlbDetMtrD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetMtrD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtrD_Enabled), 5, 0), true);
      edtAlbDetKgmD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetKgmD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgmD_Enabled), 5, 0), true);
      edtAlbDetPieU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetPieU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetPieU_Enabled), 5, 0), true);
      edtSumKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumKgs_Enabled), 5, 0), true);
      edtSumMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumMts_Enabled), 5, 0), true);
      edtSumPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumPzs_Enabled), 5, 0), true);
      edtAlbRPieReb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieReb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieReb_Enabled), 5, 0), true);
      edtAlbUltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUltP_Enabled), 5, 0), true);
      edtAlbNumEti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumEti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumEti_Enabled), 5, 0), true);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), true);
   }

   public void zm7C299( int GX_JID )
   {
      if ( ( GX_JID == 143 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4795AlRPieCal = T007C3_A4795AlRPieCal[0] ;
            Z2154AlbRecAnh = T007C3_A2154AlbRecAnh[0] ;
            Z10762AlbPCont = T007C3_A10762AlbPCont[0] ;
            Z2157AlbRecMtr = T007C3_A2157AlbRecMtr[0] ;
            Z2155AlbRecKgm = T007C3_A2155AlbRecKgm[0] ;
            Z2158AlbRecMtrU = T007C3_A2158AlbRecMtrU[0] ;
            Z2156AlbRecKgmU = T007C3_A2156AlbRecKgmU[0] ;
            Z8779Bod_Talla = T007C3_A8779Bod_Talla[0] ;
            Z8780Bod_Und = T007C3_A8780Bod_Und[0] ;
            Z3730AlbRecCol = T007C3_A3730AlbRecCol[0] ;
            Z3731AlbRecIdPz = T007C3_A3731AlbRecIdPz[0] ;
            Z3732AlbRecIdRc = T007C3_A3732AlbRecIdRc[0] ;
            Z4410AlbRecPal = T007C3_A4410AlbRecPal[0] ;
            Z10180AlRPieTelT = T007C3_A10180AlRPieTelT[0] ;
            Z10149AlRPieCon = T007C3_A10149AlRPieCon[0] ;
            Z10181AlRPieOri = T007C3_A10181AlRPieOri[0] ;
            Z10182AlRPieDst = T007C3_A10182AlRPieDst[0] ;
            Z10183AlrPieKgmT = T007C3_A10183AlrPieKgmT[0] ;
            Z7408ALRPIELOC = T007C3_A7408ALRPIELOC[0] ;
         }
         else
         {
            Z4795AlRPieCal = A4795AlRPieCal ;
            Z2154AlbRecAnh = A2154AlbRecAnh ;
            Z10762AlbPCont = A10762AlbPCont ;
            Z2157AlbRecMtr = A2157AlbRecMtr ;
            Z2155AlbRecKgm = A2155AlbRecKgm ;
            Z2158AlbRecMtrU = A2158AlbRecMtrU ;
            Z2156AlbRecKgmU = A2156AlbRecKgmU ;
            Z8779Bod_Talla = A8779Bod_Talla ;
            Z8780Bod_Und = A8780Bod_Und ;
            Z3730AlbRecCol = A3730AlbRecCol ;
            Z3731AlbRecIdPz = A3731AlbRecIdPz ;
            Z3732AlbRecIdRc = A3732AlbRecIdRc ;
            Z4410AlbRecPal = A4410AlbRecPal ;
            Z10180AlRPieTelT = A10180AlRPieTelT ;
            Z10149AlRPieCon = A10149AlRPieCon ;
            Z10181AlRPieOri = A10181AlRPieOri ;
            Z10182AlRPieDst = A10182AlRPieDst ;
            Z10183AlrPieKgmT = A10183AlrPieKgmT ;
            Z7408ALRPIELOC = A7408ALRPIELOC ;
         }
      }
      if ( GX_JID == -143 )
      {
         Z4795AlRPieCal = A4795AlRPieCal ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z2154AlbRecAnh = A2154AlbRecAnh ;
         Z10762AlbPCont = A10762AlbPCont ;
         Z2157AlbRecMtr = A2157AlbRecMtr ;
         Z2155AlbRecKgm = A2155AlbRecKgm ;
         Z2158AlbRecMtrU = A2158AlbRecMtrU ;
         Z2156AlbRecKgmU = A2156AlbRecKgmU ;
         Z8779Bod_Talla = A8779Bod_Talla ;
         Z8780Bod_Und = A8780Bod_Und ;
         Z3730AlbRecCol = A3730AlbRecCol ;
         Z3731AlbRecIdPz = A3731AlbRecIdPz ;
         Z3732AlbRecIdRc = A3732AlbRecIdRc ;
         Z4410AlbRecPal = A4410AlbRecPal ;
         Z10180AlRPieTelT = A10180AlRPieTelT ;
         Z10149AlRPieCon = A10149AlRPieCon ;
         Z10181AlRPieOri = A10181AlRPieOri ;
         Z10182AlRPieDst = A10182AlRPieDst ;
         Z10183AlrPieKgmT = A10183AlrPieKgmT ;
         Z7408ALRPIELOC = A7408ALRPIELOC ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal7C299( )
   {
      edtAlbPCont_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPCont_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieClaC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieClaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieClaC_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtBod_Talla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Talla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Talla_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtBod_Und_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Und_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCol_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecIdPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecIdPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecIdPz_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecIdRc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecIdRc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecIdRc_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecPal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPal_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieTelT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieTelT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieTelT_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieCon_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieOri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieOri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieOri_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieDst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieDst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieDst_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlrPieKgmT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlrPieKgmT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrPieKgmT_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbUltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUltP_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlbUltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUltP_Enabled), 5, 0), true);
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      O2153AlbDetPieU = A2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      if ( ! (0==A2153AlbDetPieU) )
      {
         A54AlbRPieUti = A2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
   }

   public void standaloneModal7C299( )
   {
      if ( isIns( )  )
      {
         A10761AlbUltP = (short)(O10761AlbUltP+1) ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      }
      if ( isIns( )  && (0==A2154AlbRecAnh) && ( Gx_BScreen == 0 ) )
      {
         A2154AlbRecAnh = A4921AlbRAnc ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A10762AlbPCont = A10761AlbUltP ;
      }
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               A47AlbREst = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
            else
            {
               if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
               {
                  A47AlbREst = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               }
               else
               {
                  if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
                  {
                     A47AlbREst = (byte)(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  }
               }
            }
         }
      }
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
      }
      if ( isIns( )  )
      {
         A10760SumPzs = (short)(O10760SumPzs+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A10760SumPzs = O10760SumPzs ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A10760SumPzs = (short)(O10760SumPzs-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbRecPie_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      }
      else
      {
         edtAlbRecPie_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      }
   }

   public void load7C299( )
   {
      /* Using cursor T007C52 */
      pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A4795AlRPieCal = T007C52_A4795AlRPieCal[0] ;
         A2154AlbRecAnh = T007C52_A2154AlbRecAnh[0] ;
         A10762AlbPCont = T007C52_A10762AlbPCont[0] ;
         A2157AlbRecMtr = T007C52_A2157AlbRecMtr[0] ;
         A2155AlbRecKgm = T007C52_A2155AlbRecKgm[0] ;
         A2158AlbRecMtrU = T007C52_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = T007C52_A2156AlbRecKgmU[0] ;
         A8779Bod_Talla = T007C52_A8779Bod_Talla[0] ;
         A8780Bod_Und = T007C52_A8780Bod_Und[0] ;
         A3730AlbRecCol = T007C52_A3730AlbRecCol[0] ;
         A3731AlbRecIdPz = T007C52_A3731AlbRecIdPz[0] ;
         A3732AlbRecIdRc = T007C52_A3732AlbRecIdRc[0] ;
         A4410AlbRecPal = T007C52_A4410AlbRecPal[0] ;
         A10180AlRPieTelT = T007C52_A10180AlRPieTelT[0] ;
         A10149AlRPieCon = T007C52_A10149AlRPieCon[0] ;
         A10181AlRPieOri = T007C52_A10181AlRPieOri[0] ;
         A10182AlRPieDst = T007C52_A10182AlRPieDst[0] ;
         A10183AlrPieKgmT = T007C52_A10183AlrPieKgmT[0] ;
         A7408ALRPIELOC = T007C52_A7408ALRPIELOC[0] ;
         zm7C299( -143) ;
      }
      pr_default.close(45);
      onLoadActions7C299( ) ;
   }

   public void onLoadActions7C299( )
   {
      /* Using cursor T007C5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A4806AlRPieDefC = T007C5_A4806AlRPieDefC[0] ;
         n4806AlRPieDefC = T007C5_n4806AlRPieDefC[0] ;
      }
      else
      {
         A4806AlRPieDefC = 0 ;
         n4806AlRPieDefC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      pr_default.close(2);
      if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
      {
         A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
      }
      else
      {
         if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
         {
            A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
            }
            else
            {
               A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
            }
         }
      }
      GXt_char1 = A4795AlRPieCal ;
      GXv_char14[0] = A396EmprCod ;
      GXv_int8[0] = A44AlbRecCod ;
      GXv_char4[0] = A2159AlbRecPie ;
      GXv_char3[0] = GXt_char1 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3) ;
      talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
      talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
      talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
      talbdet_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A4795AlRPieCal = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      if ( true /* Level */ && ( isUpd( )  || isDlt( )  ) )
      {
         GXt_char1 = AV54PieUti ;
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_char3[0] = GXt_char1 ;
         new app.palrpieuti(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
         talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         talbdet_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV54PieUti = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54PieUti", AV54PieUti);
      }
      if ( isIns( )  )
      {
         A10759SumMts = O10759SumMts.add(A2157AlbRecMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A10759SumMts = O10759SumMts.add(A2157AlbRecMtr).subtract(O2157AlbRecMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A10759SumMts = O10759SumMts.subtract(O2157AlbRecMtr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A10758SumKgs = O10758SumKgs.add(A2155AlbRecKgm) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A10758SumKgs = O10758SumKgs.add(A2155AlbRecKgm).subtract(O2155AlbRecKgm) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A10758SumKgs = O10758SumKgs.subtract(O2155AlbRecKgm) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            }
         }
      }
   }

   public void checkExtendedTable7C299( )
   {
      nIsDirty_299 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal7C299( ) ;
      /* Using cursor T007C5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A4806AlRPieDefC = T007C5_A4806AlRPieDefC[0] ;
         n4806AlRPieDefC = T007C5_n4806AlRPieDefC[0] ;
      }
      else
      {
         nIsDirty_299 = (short)(1) ;
         A4806AlRPieDefC = 0 ;
         n4806AlRPieDefC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      pr_default.close(2);
      if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
      {
         nIsDirty_299 = (short)(1) ;
         A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
      }
      else
      {
         if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
         {
            nIsDirty_299 = (short)(1) ;
            A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               nIsDirty_299 = (short)(1) ;
               A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
            }
            else
            {
               nIsDirty_299 = (short)(1) ;
               A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
            }
         }
      }
      nIsDirty_299 = (short)(1) ;
      GXt_char1 = A4795AlRPieCal ;
      GXv_char14[0] = A396EmprCod ;
      GXv_int8[0] = A44AlbRecCod ;
      GXv_char4[0] = A2159AlbRecPie ;
      GXv_char3[0] = GXt_char1 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3) ;
      talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
      talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
      talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
      talbdet_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A4795AlRPieCal = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      if ( true /* Level */ && ( isUpd( )  || isDlt( )  ) )
      {
         GXt_char1 = AV54PieUti ;
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_char3[0] = GXt_char1 ;
         new app.palrpieuti(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
         talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         talbdet_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV54PieUti = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54PieUti", AV54PieUti);
      }
      if ( isIns( )  && true /* After */ && ( AV82Noctrlpz == 0 ) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_char3[0] = AV71Msg_err ;
         new app.pexipzae(remoteHandle, context).execute( GXv_char14, GXv_char4, GXv_char3) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         talbdet_impl.this.AV71Msg_err = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV71Msg_err", AV71Msg_err);
      }
      if ( isIns( )  && true /* After */ && ( AV70NoPzaR == 1 ) && ( GXutil.strcmp(AV71Msg_err, " ") != 0 ) && ( AV89Velluts == 0 ) )
      {
         GXCCtl = "ALBRECPIE_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(AV71Msg_err, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && true /* After */ && ( AV70NoPzaR == 0 ) && ( GXutil.strcmp(AV71Msg_err, " ") != 0 ) && ( AV89Velluts == 0 ) && ( AV94Colorsol == 0 ) )
      {
         GXCCtl = "ALBRECPIE_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(AV71Msg_err, 0, GXCCtl);
      }
      if ( isIns( )  )
      {
         nIsDirty_299 = (short)(1) ;
         A10759SumMts = O10759SumMts.add(A2157AlbRecMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_299 = (short)(1) ;
            A10759SumMts = O10759SumMts.add(A2157AlbRecMtr).subtract(O2157AlbRecMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_299 = (short)(1) ;
               A10759SumMts = O10759SumMts.subtract(O2157AlbRecMtr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            }
         }
      }
      if ( DecimalUtil.compareTo(A2158AlbRecMtrU, A2157AlbRecMtr) > 0 )
      {
         GXCCtl = "ALBRECMTR_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Metros Insuficientes", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecMtr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV60FlagArt == 1 ) && true /* Level */ && true /* After */ && ( AV61CalMKT == 1 ) )
      {
         GXv_char14[0] = A56AlbRUni ;
         GXv_decimal10[0] = A2157AlbRecMtr ;
         GXv_decimal15[0] = A2155AlbRecKgm ;
         GXv_decimal16[0] = AV58Rdto ;
         GXv_int13[0] = AV59Pesoml ;
         GXv_int12[0] = AV109Anc ;
         GXv_int11[0] = AV110grm2 ;
         new app.pcalkmt(remoteHandle, context).execute( GXv_char14, GXv_decimal10, GXv_decimal15, GXv_decimal16, GXv_int13, GXv_int12, GXv_int11) ;
         talbdet_impl.this.A56AlbRUni = GXv_char14[0] ;
         talbdet_impl.this.A2157AlbRecMtr = GXv_decimal10[0] ;
         talbdet_impl.this.A2155AlbRecKgm = GXv_decimal15[0] ;
         talbdet_impl.this.AV58Rdto = GXv_decimal16[0] ;
         talbdet_impl.this.AV59Pesoml = GXv_int13[0] ;
         talbdet_impl.this.AV109Anc = GXv_int12[0] ;
         talbdet_impl.this.AV110grm2 = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.ajax_rsp_assign_attri("", false, "AV58Rdto", GXutil.ltrimstr( AV58Rdto, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV59Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Pesoml), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV109Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109Anc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV110grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110grm2), 4, 0));
      }
      if ( isIns( )  )
      {
         nIsDirty_299 = (short)(1) ;
         A10758SumKgs = O10758SumKgs.add(A2155AlbRecKgm) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_299 = (short)(1) ;
            A10758SumKgs = O10758SumKgs.add(A2155AlbRecKgm).subtract(O2155AlbRecKgm) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_299 = (short)(1) ;
               A10758SumKgs = O10758SumKgs.subtract(O2155AlbRecKgm) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            }
         }
      }
      if ( DecimalUtil.compareTo(A2156AlbRecKgmU, A2155AlbRecKgm) > 0 )
      {
         GXCCtl = "ALBRECKGM_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Kilos Insuficientes", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecKgm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && (GXutil.strcmp("", A2159AlbRecPie)==0) && ( AV57SumPza == 1 ) && true /* Level */ && true /* After */ )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         new app.pultpza(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
         talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void closeExtendedTableCursors7C299( )
   {
      pr_default.close(2);
   }

   public void enableDisable7C299( )
   {
   }

   public void gxload_144( String A396EmprCod ,
                           int A44AlbRecCod ,
                           String A2159AlbRecPie )
   {
      /* Using cursor T007C54 */
      pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(46) != 101) )
      {
         A4806AlRPieDefC = T007C54_A4806AlRPieDefC[0] ;
         n4806AlRPieDefC = T007C54_n4806AlRPieDefC[0] ;
      }
      else
      {
         A4806AlRPieDefC = 0 ;
         n4806AlRPieDefC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4806AlRPieDefC, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(46) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(46);
   }

   public void getKey7C299( )
   {
      /* Using cursor T007C55 */
      pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound299 = (short)(1) ;
      }
      else
      {
         RcdFound299 = (short)(0) ;
      }
      pr_default.close(47);
   }

   public void getByPrimaryKey7C299( )
   {
      /* Using cursor T007C3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T007C3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm7C299( 143) ;
         RcdFound299 = (short)(1) ;
         initializeNonKey7C299( ) ;
         A4795AlRPieCal = T007C3_A4795AlRPieCal[0] ;
         A2159AlbRecPie = T007C3_A2159AlbRecPie[0] ;
         A2154AlbRecAnh = T007C3_A2154AlbRecAnh[0] ;
         A10762AlbPCont = T007C3_A10762AlbPCont[0] ;
         A2157AlbRecMtr = T007C3_A2157AlbRecMtr[0] ;
         A2155AlbRecKgm = T007C3_A2155AlbRecKgm[0] ;
         A2158AlbRecMtrU = T007C3_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = T007C3_A2156AlbRecKgmU[0] ;
         A8779Bod_Talla = T007C3_A8779Bod_Talla[0] ;
         A8780Bod_Und = T007C3_A8780Bod_Und[0] ;
         A3730AlbRecCol = T007C3_A3730AlbRecCol[0] ;
         A3731AlbRecIdPz = T007C3_A3731AlbRecIdPz[0] ;
         A3732AlbRecIdRc = T007C3_A3732AlbRecIdRc[0] ;
         A4410AlbRecPal = T007C3_A4410AlbRecPal[0] ;
         A10180AlRPieTelT = T007C3_A10180AlRPieTelT[0] ;
         A10149AlRPieCon = T007C3_A10149AlRPieCon[0] ;
         A10181AlRPieOri = T007C3_A10181AlRPieOri[0] ;
         A10182AlRPieDst = T007C3_A10182AlRPieDst[0] ;
         A10183AlrPieKgmT = T007C3_A10183AlrPieKgmT[0] ;
         A7408ALRPIELOC = T007C3_A7408ALRPIELOC[0] ;
         O2155AlbRecKgm = A2155AlbRecKgm ;
         O2157AlbRecMtr = A2157AlbRecMtr ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         sMode299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load7C299( ) ;
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound299 = (short)(0) ;
         initializeNonKey7C299( ) ;
         sMode299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal7C299( ) ;
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes7C299( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency7C299( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T007C2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4795AlRPieCal, T007C2_A4795AlRPieCal[0]) != 0 ) || ( Z2154AlbRecAnh != T007C2_A2154AlbRecAnh[0] ) || ( Z10762AlbPCont != T007C2_A10762AlbPCont[0] ) || ( DecimalUtil.compareTo(Z2157AlbRecMtr, T007C2_A2157AlbRecMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z2155AlbRecKgm, T007C2_A2155AlbRecKgm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z2158AlbRecMtrU, T007C2_A2158AlbRecMtrU[0]) != 0 ) || ( DecimalUtil.compareTo(Z2156AlbRecKgmU, T007C2_A2156AlbRecKgmU[0]) != 0 ) || ( GXutil.strcmp(Z8779Bod_Talla, T007C2_A8779Bod_Talla[0]) != 0 ) || ( Z8780Bod_Und != T007C2_A8780Bod_Und[0] ) || ( Z3730AlbRecCol != T007C2_A3730AlbRecCol[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3731AlbRecIdPz, T007C2_A3731AlbRecIdPz[0]) != 0 ) || ( Z3732AlbRecIdRc != T007C2_A3732AlbRecIdRc[0] ) || ( DecimalUtil.compareTo(Z4410AlbRecPal, T007C2_A4410AlbRecPal[0]) != 0 ) || ( GXutil.strcmp(Z10180AlRPieTelT, T007C2_A10180AlRPieTelT[0]) != 0 ) || ( Z10149AlRPieCon != T007C2_A10149AlRPieCon[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10181AlRPieOri, T007C2_A10181AlRPieOri[0]) != 0 ) || ( GXutil.strcmp(Z10182AlRPieDst, T007C2_A10182AlRPieDst[0]) != 0 ) || ( DecimalUtil.compareTo(Z10183AlrPieKgmT, T007C2_A10183AlrPieKgmT[0]) != 0 ) || ( GXutil.strcmp(Z7408ALRPIELOC, T007C2_A7408ALRPIELOC[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4795AlRPieCal, T007C2_A4795AlRPieCal[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlRPieCal");
               GXutil.writeLogRaw("Old: ",Z4795AlRPieCal);
               GXutil.writeLogRaw("Current: ",T007C2_A4795AlRPieCal[0]);
            }
            if ( Z2154AlbRecAnh != T007C2_A2154AlbRecAnh[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRecAnh");
               GXutil.writeLogRaw("Old: ",Z2154AlbRecAnh);
               GXutil.writeLogRaw("Current: ",T007C2_A2154AlbRecAnh[0]);
            }
            if ( Z10762AlbPCont != T007C2_A10762AlbPCont[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbPCont");
               GXutil.writeLogRaw("Old: ",Z10762AlbPCont);
               GXutil.writeLogRaw("Current: ",T007C2_A10762AlbPCont[0]);
            }
            if ( DecimalUtil.compareTo(Z2157AlbRecMtr, T007C2_A2157AlbRecMtr[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRecMtr");
               GXutil.writeLogRaw("Old: ",Z2157AlbRecMtr);
               GXutil.writeLogRaw("Current: ",T007C2_A2157AlbRecMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z2155AlbRecKgm, T007C2_A2155AlbRecKgm[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRecKgm");
               GXutil.writeLogRaw("Old: ",Z2155AlbRecKgm);
               GXutil.writeLogRaw("Current: ",T007C2_A2155AlbRecKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z2158AlbRecMtrU, T007C2_A2158AlbRecMtrU[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRecMtrU");
               GXutil.writeLogRaw("Old: ",Z2158AlbRecMtrU);
               GXutil.writeLogRaw("Current: ",T007C2_A2158AlbRecMtrU[0]);
            }
            if ( DecimalUtil.compareTo(Z2156AlbRecKgmU, T007C2_A2156AlbRecKgmU[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRecKgmU");
               GXutil.writeLogRaw("Old: ",Z2156AlbRecKgmU);
               GXutil.writeLogRaw("Current: ",T007C2_A2156AlbRecKgmU[0]);
            }
            if ( GXutil.strcmp(Z8779Bod_Talla, T007C2_A8779Bod_Talla[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"Bod_Talla");
               GXutil.writeLogRaw("Old: ",Z8779Bod_Talla);
               GXutil.writeLogRaw("Current: ",T007C2_A8779Bod_Talla[0]);
            }
            if ( Z8780Bod_Und != T007C2_A8780Bod_Und[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"Bod_Und");
               GXutil.writeLogRaw("Old: ",Z8780Bod_Und);
               GXutil.writeLogRaw("Current: ",T007C2_A8780Bod_Und[0]);
            }
            if ( Z3730AlbRecCol != T007C2_A3730AlbRecCol[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRecCol");
               GXutil.writeLogRaw("Old: ",Z3730AlbRecCol);
               GXutil.writeLogRaw("Current: ",T007C2_A3730AlbRecCol[0]);
            }
            if ( GXutil.strcmp(Z3731AlbRecIdPz, T007C2_A3731AlbRecIdPz[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRecIdPz");
               GXutil.writeLogRaw("Old: ",Z3731AlbRecIdPz);
               GXutil.writeLogRaw("Current: ",T007C2_A3731AlbRecIdPz[0]);
            }
            if ( Z3732AlbRecIdRc != T007C2_A3732AlbRecIdRc[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRecIdRc");
               GXutil.writeLogRaw("Old: ",Z3732AlbRecIdRc);
               GXutil.writeLogRaw("Current: ",T007C2_A3732AlbRecIdRc[0]);
            }
            if ( DecimalUtil.compareTo(Z4410AlbRecPal, T007C2_A4410AlbRecPal[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlbRecPal");
               GXutil.writeLogRaw("Old: ",Z4410AlbRecPal);
               GXutil.writeLogRaw("Current: ",T007C2_A4410AlbRecPal[0]);
            }
            if ( GXutil.strcmp(Z10180AlRPieTelT, T007C2_A10180AlRPieTelT[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlRPieTelT");
               GXutil.writeLogRaw("Old: ",Z10180AlRPieTelT);
               GXutil.writeLogRaw("Current: ",T007C2_A10180AlRPieTelT[0]);
            }
            if ( Z10149AlRPieCon != T007C2_A10149AlRPieCon[0] )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlRPieCon");
               GXutil.writeLogRaw("Old: ",Z10149AlRPieCon);
               GXutil.writeLogRaw("Current: ",T007C2_A10149AlRPieCon[0]);
            }
            if ( GXutil.strcmp(Z10181AlRPieOri, T007C2_A10181AlRPieOri[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlRPieOri");
               GXutil.writeLogRaw("Old: ",Z10181AlRPieOri);
               GXutil.writeLogRaw("Current: ",T007C2_A10181AlRPieOri[0]);
            }
            if ( GXutil.strcmp(Z10182AlRPieDst, T007C2_A10182AlRPieDst[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlRPieDst");
               GXutil.writeLogRaw("Old: ",Z10182AlRPieDst);
               GXutil.writeLogRaw("Current: ",T007C2_A10182AlRPieDst[0]);
            }
            if ( DecimalUtil.compareTo(Z10183AlrPieKgmT, T007C2_A10183AlrPieKgmT[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"AlrPieKgmT");
               GXutil.writeLogRaw("Old: ",Z10183AlrPieKgmT);
               GXutil.writeLogRaw("Current: ",T007C2_A10183AlrPieKgmT[0]);
            }
            if ( GXutil.strcmp(Z7408ALRPIELOC, T007C2_A7408ALRPIELOC[0]) != 0 )
            {
               GXutil.writeLogln("talbdet:[seudo value changed for attri]"+"ALRPIELOC");
               GXutil.writeLogRaw("Old: ",Z7408ALRPIELOC);
               GXutil.writeLogRaw("Current: ",T007C2_A7408ALRPIELOC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBDET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert7C299( )
   {
      beforeValidate7C299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable7C299( ) ;
      }
      if ( AnyError == 0 )
      {
         zm7C299( 0) ;
         checkOptimisticConcurrency7C299( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm7C299( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert7C299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T007C56 */
                  pr_default.execute(48, new Object[] {A4795AlRPieCal, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A2154AlbRecAnh), Short.valueOf(A10762AlbPCont), A2157AlbRecMtr, A2155AlbRecKgm, A2158AlbRecMtrU, A2156AlbRecKgmU, A8779Bod_Talla, Short.valueOf(A8780Bod_Und), Short.valueOf(A3730AlbRecCol), A3731AlbRecIdPz, Integer.valueOf(A3732AlbRecIdRc), A4410AlbRecPal, A10180AlRPieTelT, Integer.valueOf(A10149AlRPieCon), A10181AlRPieOri, A10182AlRPieDst, A10183AlrPieKgmT, A7408ALRPIELOC, A396EmprCod, Boolean.valueOf(n4806AlRPieDefC), Integer.valueOf(A4806AlRPieDefC)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                  if ( (pr_default.getStatus(48) == 1) )
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
            load7C299( ) ;
         }
         endLevel7C299( ) ;
      }
      closeExtendedTableCursors7C299( ) ;
   }

   public void update7C299( )
   {
      beforeValidate7C299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable7C299( ) ;
      }
      if ( ( nIsMod_299 != 0 ) || ( nIsDirty_299 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency7C299( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm7C299( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate7C299( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T007C57 */
                     pr_default.execute(49, new Object[] {A4795AlRPieCal, Short.valueOf(A2154AlbRecAnh), Short.valueOf(A10762AlbPCont), A2157AlbRecMtr, A2155AlbRecKgm, A2158AlbRecMtrU, A2156AlbRecKgmU, A8779Bod_Talla, Short.valueOf(A8780Bod_Und), Short.valueOf(A3730AlbRecCol), A3731AlbRecIdPz, Integer.valueOf(A3732AlbRecIdRc), A4410AlbRecPal, A10180AlRPieTelT, Integer.valueOf(A10149AlRPieCon), A10181AlRPieOri, A10182AlRPieDst, A10183AlrPieKgmT, A7408ALRPIELOC, Boolean.valueOf(n4806AlRPieDefC), Integer.valueOf(A4806AlRPieDefC), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                     if ( (pr_default.getStatus(49) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate7C299( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char14[0] = A396EmprCod ;
                        GXv_int8[0] = A44AlbRecCod ;
                        new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char14, GXv_int8) ;
                        talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
                        talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
                        /* Start of After( update) rules */
                        if ( true /* After */ && ( GXutil.strcmp(A5806AlbREnt2, AV92OldAlb2) != 0 ) )
                        {
                           AV93Inc_obs = httpContext.getMessage( httpContext.getMessage( "TALBDET-Modificacion Registro,AlbReccod=", ""), "") + GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( " Cliente=", ""), "") + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + GXutil.trim( A45AlbRef) + " " + GXutil.trim( A3613AlbRefDsc) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Guia (old) =", ""), "") + AV92OldAlb2 + httpContext.getMessage( httpContext.getMessage( " Guia (new) =", ""), "") + A5806AlbREnt2 + GXutil.newLine( ) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
                        }
                        if ( true /* After */ && ( GXutil.strcmp(A5806AlbREnt2, AV92OldAlb2) != 0 ) )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV124Pgmname, AV17UsurCod, AV38Station, AV93Inc_obs, A44AlbRecCod, (byte)(0), "@") ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey7C299( ) ;
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
            endLevel7C299( ) ;
         }
      }
      closeExtendedTableCursors7C299( ) ;
   }

   public void deferredUpdate7C299( )
   {
   }

   public void delete7C299( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate7C299( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency7C299( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls7C299( ) ;
         afterConfirm7C299( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete7C299( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T007C58 */
               pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ )
                  {
                     AV93Inc_obs = httpContext.getMessage( httpContext.getMessage( "TALBDET-Eliminacion Registro,AlbReccod=", ""), "") + GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( " Cliente=", ""), "") + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + GXutil.trim( A45AlbRef) + " " + GXutil.trim( A3613AlbRefDsc) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Pieza =", ""), "") + A2159AlbRecPie + GXutil.newLine( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
                  }
                  if ( true /* After */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV124Pgmname, AV17UsurCod, AV38Station, AV93Inc_obs, A44AlbRecCod, (byte)(0), "@") ;
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
      sMode299 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel7C299( ) ;
      Gx_mode = sMode299 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls7C299( )
   {
      standaloneModal7C299( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* After */ && ( AV82Noctrlpz == 0 ) )
         {
            GXv_char14[0] = A396EmprCod ;
            GXv_char4[0] = A2159AlbRecPie ;
            GXv_char3[0] = AV71Msg_err ;
            new app.pexipzae(remoteHandle, context).execute( GXv_char14, GXv_char4, GXv_char3) ;
            talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
            talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
            talbdet_impl.this.AV71Msg_err = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV71Msg_err", AV71Msg_err);
         }
         if ( isIns( )  && true /* After */ && ( AV70NoPzaR == 1 ) && ( GXutil.strcmp(AV71Msg_err, " ") != 0 ) && ( AV89Velluts == 0 ) )
         {
            GXCCtl = "ALBRECPIE_" + sGXsfl_181_idx ;
            httpContext.GX_msglist.addItem(AV71Msg_err, 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRecPie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isIns( )  && true /* After */ && ( AV70NoPzaR == 0 ) && ( GXutil.strcmp(AV71Msg_err, " ") != 0 ) && ( AV89Velluts == 0 ) && ( AV94Colorsol == 0 ) )
         {
            GXCCtl = "ALBRECPIE_" + sGXsfl_181_idx ;
            httpContext.GX_msglist.addItem(AV71Msg_err, 0, GXCCtl);
         }
         if ( isIns( )  && (GXutil.strcmp("", A2159AlbRecPie)==0) && ( AV57SumPza == 1 ) && true /* Level */ && true /* After */ )
         {
            GXv_char14[0] = A396EmprCod ;
            GXv_int8[0] = A44AlbRecCod ;
            GXv_char4[0] = A2159AlbRecPie ;
            new app.pultpza(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4) ;
            talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
            talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
            talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
         /* Using cursor T007C60 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(51) != 101) )
         {
            A4806AlRPieDefC = T007C60_A4806AlRPieDefC[0] ;
            n4806AlRPieDefC = T007C60_n4806AlRPieDefC[0] ;
         }
         else
         {
            A4806AlRPieDefC = 0 ;
            n4806AlRPieDefC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         }
         pr_default.close(51);
         if ( ( isDlt( )  ) && true /* Level */ )
         {
            GXt_int5 = AV90PzaProd ;
            GXv_char14[0] = A396EmprCod ;
            GXv_int8[0] = A44AlbRecCod ;
            GXv_char4[0] = A2159AlbRecPie ;
            GXv_int6[0] = GXt_int5 ;
            new app.ppzaprod(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_int6) ;
            talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
            talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
            talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
            talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            AV90PzaProd = GXt_int5 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90PzaProd", GXutil.str( AV90PzaProd, 1, 0));
         }
         if ( ( AV90PzaProd == 1 ) && ( isDlt( )  ) && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Pieza en Produccion ¡¡¡", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( true /* Level */ && ( isUpd( )  || isDlt( )  ) )
         {
            GXt_char1 = AV54PieUti ;
            GXv_char14[0] = A396EmprCod ;
            GXv_int8[0] = A44AlbRecCod ;
            GXv_char4[0] = A2159AlbRecPie ;
            GXv_char3[0] = GXt_char1 ;
            new app.palrpieuti(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3) ;
            talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
            talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
            talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
            talbdet_impl.this.GXt_char1 = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            AV54PieUti = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54PieUti", AV54PieUti);
         }
         if ( isIns( )  )
         {
            A10759SumMts = O10759SumMts.add(A2157AlbRecMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A10759SumMts = O10759SumMts.add(A2157AlbRecMtr).subtract(O2157AlbRecMtr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A10759SumMts = O10759SumMts.subtract(O2157AlbRecMtr) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
               }
            }
         }
         if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
         {
            A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
            }
            else
            {
               if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
               {
                  A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
               }
               else
               {
                  A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
               }
            }
         }
         if ( isIns( )  )
         {
            A10758SumKgs = O10758SumKgs.add(A2155AlbRecKgm) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A10758SumKgs = O10758SumKgs.add(A2155AlbRecKgm).subtract(O2155AlbRecKgm) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A10758SumKgs = O10758SumKgs.subtract(O2155AlbRecKgm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T007C61 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlrPiF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T007C62 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HILZPZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T007C63 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPi1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T007C64 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Historia de las Piezas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T007C65 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPieDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
      }
   }

   public void endLevel7C299( )
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

   public void scanStart7C299( )
   {
      /* Scan By routine */
      /* Using cursor T007C66 */
      pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound299 = (short)(0) ;
      if ( (pr_default.getStatus(57) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A2159AlbRecPie = T007C66_A2159AlbRecPie[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext7C299( )
   {
      /* Scan next routine */
      pr_default.readNext(57);
      RcdFound299 = (short)(0) ;
      if ( (pr_default.getStatus(57) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A2159AlbRecPie = T007C66_A2159AlbRecPie[0] ;
      }
   }

   public void scanEnd7C299( )
   {
      pr_default.close(57);
   }

   public void afterConfirm7C299( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(A2159AlbRecPie, " ") == 0 ) && true /* After */ && true /* Level */ )
      {
         GXCCtl = "ALBRECPIE_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Numero de Pieza ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert7C299( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate7C299( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete7C299( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete7C299( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate7C299( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes7C299( )
   {
      edtAlbRecPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtALRPIELOC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALRPIELOC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIELOC_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecAnh_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecMtrU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecKgmU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieClaC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieClaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieClaC_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtBod_Talla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Talla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Talla_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtBod_Und_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Und_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCol_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecIdPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecIdPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecIdPz_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecIdRc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecIdRc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecIdRc_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecPal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPal_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieTelT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieTelT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieTelT_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieCon_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieOri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieOri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieOri_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieDst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieDst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieDst_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlrPieKgmT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlrPieKgmT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrPieKgmT_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbPCont_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPCont_Enabled), 5, 0), !bGXsfl_181_Refreshing);
   }

   public void send_integrity_lvl_hashes7C299( )
   {
   }

   public void send_integrity_lvl_hashes7C7( )
   {
   }

   public void subsflControlProps_181299( )
   {
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_181_idx ;
      edtALRPIELOC_Internalname = "ALRPIELOC_"+sGXsfl_181_idx ;
      edtAlbRecAnh_Internalname = "ALBRECANH_"+sGXsfl_181_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_181_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_181_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_181_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_181_idx ;
      edtAlRPieClaC_Internalname = "ALRPIECLAC_"+sGXsfl_181_idx ;
      edtBod_Talla_Internalname = "BOD_TALLA_"+sGXsfl_181_idx ;
      edtBod_Und_Internalname = "BOD_UND_"+sGXsfl_181_idx ;
      edtAlbRecCol_Internalname = "ALBRECCOL_"+sGXsfl_181_idx ;
      edtAlbRecIdPz_Internalname = "ALBRECIDPZ_"+sGXsfl_181_idx ;
      edtAlbRecIdRc_Internalname = "ALBRECIDRC_"+sGXsfl_181_idx ;
      edtAlbRecPal_Internalname = "ALBRECPAL_"+sGXsfl_181_idx ;
      edtAlRPieTelT_Internalname = "ALRPIETELT_"+sGXsfl_181_idx ;
      edtAlRPieCon_Internalname = "ALRPIECON_"+sGXsfl_181_idx ;
      edtAlRPieOri_Internalname = "ALRPIEORI_"+sGXsfl_181_idx ;
      edtAlRPieDst_Internalname = "ALRPIEDST_"+sGXsfl_181_idx ;
      edtAlrPieKgmT_Internalname = "ALRPIEKGMT_"+sGXsfl_181_idx ;
      edtAlbPCont_Internalname = "ALBPCONT_"+sGXsfl_181_idx ;
   }

   public void subsflControlProps_fel_181299( )
   {
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_181_fel_idx ;
      edtALRPIELOC_Internalname = "ALRPIELOC_"+sGXsfl_181_fel_idx ;
      edtAlbRecAnh_Internalname = "ALBRECANH_"+sGXsfl_181_fel_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_181_fel_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_181_fel_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_181_fel_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_181_fel_idx ;
      edtAlRPieClaC_Internalname = "ALRPIECLAC_"+sGXsfl_181_fel_idx ;
      edtBod_Talla_Internalname = "BOD_TALLA_"+sGXsfl_181_fel_idx ;
      edtBod_Und_Internalname = "BOD_UND_"+sGXsfl_181_fel_idx ;
      edtAlbRecCol_Internalname = "ALBRECCOL_"+sGXsfl_181_fel_idx ;
      edtAlbRecIdPz_Internalname = "ALBRECIDPZ_"+sGXsfl_181_fel_idx ;
      edtAlbRecIdRc_Internalname = "ALBRECIDRC_"+sGXsfl_181_fel_idx ;
      edtAlbRecPal_Internalname = "ALBRECPAL_"+sGXsfl_181_fel_idx ;
      edtAlRPieTelT_Internalname = "ALRPIETELT_"+sGXsfl_181_fel_idx ;
      edtAlRPieCon_Internalname = "ALRPIECON_"+sGXsfl_181_fel_idx ;
      edtAlRPieOri_Internalname = "ALRPIEORI_"+sGXsfl_181_fel_idx ;
      edtAlRPieDst_Internalname = "ALRPIEDST_"+sGXsfl_181_fel_idx ;
      edtAlrPieKgmT_Internalname = "ALRPIEKGMT_"+sGXsfl_181_fel_idx ;
      edtAlbPCont_Internalname = "ALBPCONT_"+sGXsfl_181_fel_idx ;
   }

   public void addRow7C299( )
   {
      nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
      sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_181299( ) ;
      sendRow7C299( ) ;
   }

   public void sendRow7C299( )
   {
      Gridlevel_piezasRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_piezas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_piezas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_piezas_Class, "") != 0 )
         {
            subGridlevel_piezas_Linesclass = subGridlevel_piezas_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_piezas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_piezas_Backstyle = (byte)(0) ;
         subGridlevel_piezas_Backcolor = subGridlevel_piezas_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_piezas_Class, "") != 0 )
         {
            subGridlevel_piezas_Linesclass = subGridlevel_piezas_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_piezas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_piezas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_piezas_Class, "") != 0 )
         {
            subGridlevel_piezas_Linesclass = subGridlevel_piezas_Class+"Odd" ;
         }
         subGridlevel_piezas_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_piezas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_piezas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_181_idx) % (2))) == 0 )
         {
            subGridlevel_piezas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_piezas_Class, "") != 0 )
            {
               subGridlevel_piezas_Linesclass = subGridlevel_piezas_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_piezas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_piezas_Class, "") != 0 )
            {
               subGridlevel_piezas_Linesclass = subGridlevel_piezas_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecPie_Internalname,GXutil.rtrim( A2159AlbRecPie),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,182);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecPie_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 183,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtALRPIELOC_Internalname,GXutil.rtrim( A7408ALRPIELOC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,183);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtALRPIELOC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtALRPIELOC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2154AlbRecAnh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2154AlbRecAnh), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,184);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecAnh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecMtr_Enabled!=0) ? localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99") : localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,185);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecKgm_Enabled!=0) ? localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99") : localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,186);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 187,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtrU_Internalname,GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecMtrU_Enabled!=0) ? localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99") : localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,187);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtrU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecMtrU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 188,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgmU_Internalname,GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecKgmU_Enabled!=0) ? localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99") : localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,188);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgmU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecKgmU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRPieClaC_Internalname,GXutil.rtrim( A4797AlRPieClaC),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRPieClaC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlRPieClaC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Talla_Internalname,GXutil.rtrim( A8779Bod_Talla),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Talla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBod_Talla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Und_Internalname,GXutil.ltrim( localUtil.ntoc( A8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBod_Und_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8780Bod_Und), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8780Bod_Und), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Und_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtBod_Und_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCol_Internalname,GXutil.ltrim( localUtil.ntoc( A3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3730AlbRecCol), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3730AlbRecCol), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRecCol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecIdPz_Internalname,GXutil.rtrim( A3731AlbRecIdPz),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecIdPz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRecIdPz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecIdRc_Internalname,GXutil.ltrim( localUtil.ntoc( A3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecIdRc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3732AlbRecIdRc), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3732AlbRecIdRc), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecIdRc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRecIdRc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecPal_Internalname,GXutil.ltrim( localUtil.ntoc( A4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecPal_Enabled!=0) ? localUtil.format( A4410AlbRecPal, "ZZZZZ9.99") : localUtil.format( A4410AlbRecPal, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecPal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbRecPal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRPieTelT_Internalname,GXutil.rtrim( A10180AlRPieTelT),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRPieTelT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlRPieTelT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRPieCon_Internalname,GXutil.ltrim( localUtil.ntoc( A10149AlRPieCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlRPieCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10149AlRPieCon), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10149AlRPieCon), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRPieCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlRPieCon_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRPieOri_Internalname,GXutil.rtrim( A10181AlRPieOri),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRPieOri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlRPieOri_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRPieDst_Internalname,GXutil.rtrim( A10182AlRPieDst),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRPieDst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlRPieDst_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlrPieKgmT_Internalname,GXutil.ltrim( localUtil.ntoc( A10183AlrPieKgmT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlrPieKgmT_Enabled!=0) ? localUtil.format( A10183AlrPieKgmT, "ZZZZZ9.99") : localUtil.format( A10183AlrPieKgmT, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlrPieKgmT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlrPieKgmT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPCont_Internalname,GXutil.ltrim( localUtil.ntoc( A10762AlbPCont, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPCont_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10762AlbPCont), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10762AlbPCont), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPCont_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtAlbPCont_Visible),Integer.valueOf(edtAlbPCont_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_piezasRow);
      send_integrity_lvl_hashes7C299( ) ;
      GXCCtl = "Z2159AlbRecPie_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2159AlbRecPie));
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4795AlRPieCal));
      GXCCtl = "Z2154AlbRecAnh_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10762AlbPCont_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10762AlbPCont, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2157AlbRecMtr_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2155AlbRecKgm_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2158AlbRecMtrU_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2156AlbRecKgmU_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8779Bod_Talla_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8779Bod_Talla));
      GXCCtl = "Z8780Bod_Und_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3730AlbRecCol_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3731AlbRecIdPz_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3731AlbRecIdPz));
      GXCCtl = "Z3732AlbRecIdRc_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4410AlbRecPal_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10180AlRPieTelT_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10180AlRPieTelT));
      GXCCtl = "Z10149AlRPieCon_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10149AlRPieCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10181AlRPieOri_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10181AlRPieOri));
      GXCCtl = "Z10182AlRPieDst_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10182AlRPieDst));
      GXCCtl = "Z10183AlrPieKgmT_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10183AlrPieKgmT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7408ALRPIELOC_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7408ALRPIELOC));
      GXCCtl = "O2155AlbRecKgm_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2157AlbRecMtr_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_299_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_299_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_299_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_181_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV116TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV116TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV113EmprCod));
      GXCCtl = "vALBRECCOD_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV114AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECPIE_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIELOC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIELOC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECANH_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTR_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGM_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTRU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGMU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIECLAC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieClaC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_TALLA_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Talla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_UND_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Und_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOL_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECIDPZ_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdPz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECIDRC_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdRc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECPAL_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIETELT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieTelT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIECON_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIEORI_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieOri_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIEDST_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieDst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIEKGMT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlrPieKgmT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCONT_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPCont_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCONT_"+sGXsfl_181_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtAlbPCont_Visible, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_piezasContainer.AddRow(Gridlevel_piezasRow);
   }

   public void readRow7C299( )
   {
      nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
      sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_181299( ) ;
      edtAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPIE_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtALRPIELOC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIELOC_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECANH_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTR_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGM_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecMtrU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTRU_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecKgmU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGMU_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRPieClaC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIECLAC_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Talla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_TALLA_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Und_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_UND_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOL_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecIdPz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECIDPZ_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecIdRc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECIDRC_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecPal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPAL_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRPieTelT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIETELT_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRPieCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIECON_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRPieOri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIEORI_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRPieDst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIEDST_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlrPieKgmT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIEKGMT_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPCont_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCONT_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPCont_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPCONT_"+sGXsfl_181_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
      A7408ALRPIELOC = httpContext.cgiGet( edtALRPIELOC_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "ALBRECANH_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecAnh_Internalname ;
         wbErr = true ;
         A2154AlbRecAnh = (short)(0) ;
      }
      else
      {
         A2154AlbRecAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECMTR_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecMtr_Internalname ;
         wbErr = true ;
         A2157AlbRecMtr = DecimalUtil.ZERO ;
      }
      else
      {
         A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECKGM_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecKgm_Internalname ;
         wbErr = true ;
         A2155AlbRecKgm = DecimalUtil.ZERO ;
      }
      else
      {
         A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECMTRU_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecMtrU_Internalname ;
         wbErr = true ;
         A2158AlbRecMtrU = DecimalUtil.ZERO ;
      }
      else
      {
         A2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECKGMU_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecKgmU_Internalname ;
         wbErr = true ;
         A2156AlbRecKgmU = DecimalUtil.ZERO ;
      }
      else
      {
         A2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)) ;
      }
      A4797AlRPieClaC = httpContext.cgiGet( edtAlRPieClaC_Internalname) ;
      A8779Bod_Talla = httpContext.cgiGet( edtBod_Talla_Internalname) ;
      A8780Bod_Und = (short)(localUtil.ctol( httpContext.cgiGet( edtBod_Und_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A3730AlbRecCol = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A3731AlbRecIdPz = httpContext.cgiGet( edtAlbRecIdPz_Internalname) ;
      A3732AlbRecIdRc = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecIdRc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4410AlbRecPal = localUtil.ctond( httpContext.cgiGet( edtAlbRecPal_Internalname)) ;
      A10180AlRPieTelT = httpContext.cgiGet( edtAlRPieTelT_Internalname) ;
      A10149AlRPieCon = (int)(localUtil.ctol( httpContext.cgiGet( edtAlRPieCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A10181AlRPieOri = httpContext.cgiGet( edtAlRPieOri_Internalname) ;
      A10182AlRPieDst = httpContext.cgiGet( edtAlRPieDst_Internalname) ;
      A10183AlrPieKgmT = localUtil.ctond( httpContext.cgiGet( edtAlrPieKgmT_Internalname)) ;
      A10762AlbPCont = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPCont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2159AlbRecPie_" + sGXsfl_181_idx ;
      Z2159AlbRecPie = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_181_idx ;
      Z4795AlRPieCal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2154AlbRecAnh_" + sGXsfl_181_idx ;
      Z2154AlbRecAnh = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10762AlbPCont_" + sGXsfl_181_idx ;
      Z10762AlbPCont = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2157AlbRecMtr_" + sGXsfl_181_idx ;
      Z2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2155AlbRecKgm_" + sGXsfl_181_idx ;
      Z2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2158AlbRecMtrU_" + sGXsfl_181_idx ;
      Z2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2156AlbRecKgmU_" + sGXsfl_181_idx ;
      Z2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8779Bod_Talla_" + sGXsfl_181_idx ;
      Z8779Bod_Talla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8780Bod_Und_" + sGXsfl_181_idx ;
      Z8780Bod_Und = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3730AlbRecCol_" + sGXsfl_181_idx ;
      Z3730AlbRecCol = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3731AlbRecIdPz_" + sGXsfl_181_idx ;
      Z3731AlbRecIdPz = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3732AlbRecIdRc_" + sGXsfl_181_idx ;
      Z3732AlbRecIdRc = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4410AlbRecPal_" + sGXsfl_181_idx ;
      Z4410AlbRecPal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10180AlRPieTelT_" + sGXsfl_181_idx ;
      Z10180AlRPieTelT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10149AlRPieCon_" + sGXsfl_181_idx ;
      Z10149AlRPieCon = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10181AlRPieOri_" + sGXsfl_181_idx ;
      Z10181AlRPieOri = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10182AlRPieDst_" + sGXsfl_181_idx ;
      Z10182AlRPieDst = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10183AlrPieKgmT_" + sGXsfl_181_idx ;
      Z10183AlrPieKgmT = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7408ALRPIELOC_" + sGXsfl_181_idx ;
      Z7408ALRPIELOC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_181_idx ;
      A4795AlRPieCal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O2155AlbRecKgm_" + sGXsfl_181_idx ;
      O2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2157AlbRecMtr_" + sGXsfl_181_idx ;
      O2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_299_" + sGXsfl_181_idx ;
      nRcdDeleted_299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_299_" + sGXsfl_181_idx ;
      nRcdExists_299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_299_" + sGXsfl_181_idx ;
      nIsMod_299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbPCont_Enabled = edtAlbPCont_Enabled ;
      defedtAlrPieKgmT_Enabled = edtAlrPieKgmT_Enabled ;
      defedtAlRPieDst_Enabled = edtAlRPieDst_Enabled ;
      defedtAlRPieOri_Enabled = edtAlRPieOri_Enabled ;
      defedtAlRPieCon_Enabled = edtAlRPieCon_Enabled ;
      defedtAlRPieTelT_Enabled = edtAlRPieTelT_Enabled ;
      defedtAlbRecPal_Enabled = edtAlbRecPal_Enabled ;
      defedtAlbRecIdRc_Enabled = edtAlbRecIdRc_Enabled ;
      defedtAlbRecIdPz_Enabled = edtAlbRecIdPz_Enabled ;
      defedtAlbRecCol_Enabled = edtAlbRecCol_Enabled ;
      defedtBod_Und_Enabled = edtBod_Und_Enabled ;
      defedtBod_Talla_Enabled = edtBod_Talla_Enabled ;
      defedtAlRPieClaC_Enabled = edtAlRPieClaC_Enabled ;
      defedtAlbRecPie_Enabled = edtAlbRecPie_Enabled ;
   }

   public void confirmValues7C0( )
   {
      nGXsfl_181_idx = 0 ;
      sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_181299( ) ;
      while ( nGXsfl_181_idx < nRC_GXsfl_181 )
      {
         nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
         sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_181299( ) ;
         httpContext.changePostValue( "Z2159AlbRecPie_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z4795AlRPieCal_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z2154AlbRecAnh_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z10762AlbPCont_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z10762AlbPCont_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10762AlbPCont_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z2157AlbRecMtr_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z2155AlbRecKgm_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z2158AlbRecMtrU_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z2156AlbRecKgmU_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z8779Bod_Talla_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z8779Bod_Talla_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8779Bod_Talla_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z8780Bod_Und_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z8780Bod_Und_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8780Bod_Und_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z3730AlbRecCol_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z3730AlbRecCol_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3730AlbRecCol_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z3731AlbRecIdPz_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z3731AlbRecIdPz_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3731AlbRecIdPz_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z3732AlbRecIdRc_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z3732AlbRecIdRc_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3732AlbRecIdRc_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z4410AlbRecPal_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z4410AlbRecPal_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4410AlbRecPal_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z10180AlRPieTelT_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z10180AlRPieTelT_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10180AlRPieTelT_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z10149AlRPieCon_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z10149AlRPieCon_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10149AlRPieCon_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z10181AlRPieOri_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z10181AlRPieOri_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10181AlRPieOri_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z10182AlRPieDst_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z10182AlRPieDst_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10182AlRPieDst_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z10183AlrPieKgmT_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z10183AlrPieKgmT_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10183AlrPieKgmT_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z7408ALRPIELOC_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z7408ALRPIELOC_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7408ALRPIELOC_"+sGXsfl_181_idx) ;
      }
      httpContext.changePostValue( "O2155AlbRecKgm", httpContext.cgiGet( "T2155AlbRecKgm")) ;
      httpContext.deletePostValue( "T2155AlbRecKgm") ;
      httpContext.changePostValue( "O2157AlbRecMtr", httpContext.cgiGet( "T2157AlbRecMtr")) ;
      httpContext.deletePostValue( "T2157AlbRecMtr") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.talbdet", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV113EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV114AlbRecCod,8,0))}, new String[] {"Gx_mode","EmprCod","AlbRecCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TALBDET");
      forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV46Modo, "")));
      forbiddenHiddens.add("AlbRHEn", localUtil.format( A4606AlbRHEn, "99/99/99 99:99"));
      forbiddenHiddens.add("AlbRUniReb", localUtil.format( A59AlbRUniReb, "ZZZZZ9.99"));
      forbiddenHiddens.add("AlbRecSec", localUtil.format( DecimalUtil.doubleToDec(A7501AlbRecSec), "ZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("talbdet:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5806AlbREnt2", GXutil.rtrim( Z5806AlbREnt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3613AlbRefDsc", GXutil.rtrim( Z3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z49AlbRFen", localUtil.dtoc( Z49AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4606AlbRHEn", localUtil.ttoc( Z4606AlbRHEn, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.dtoc( Z48AlbRFecUlt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6180AlbrUniC", GXutil.ltrim( localUtil.ntoc( Z6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6181AlbrPieC", GXutil.ltrim( localUtil.ntoc( Z6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( Z4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( Z4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4922AlbPml", GXutil.ltrim( localUtil.ntoc( Z4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6463AlbRLote", GXutil.rtrim( Z6463AlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13241AlbRPh", GXutil.ltrim( localUtil.ntoc( Z13241AlbRPh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13242AlbRRLong", GXutil.ltrim( localUtil.ntoc( Z13242AlbRRLong, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13243AlbRRTrans", GXutil.ltrim( localUtil.ntoc( Z13243AlbRRTrans, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8029AlbNumM", GXutil.rtrim( Z8029AlbNumM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10761AlbUltP", GXutil.ltrim( localUtil.ntoc( Z10761AlbUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7501AlbRecSec", GXutil.ltrim( localUtil.ntoc( Z7501AlbRecSec, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10761AlbUltP", GXutil.ltrim( localUtil.ntoc( O10761AlbUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10760SumPzs", GXutil.ltrim( localUtil.ntoc( O10760SumPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10758SumKgs", GXutil.ltrim( localUtil.ntoc( O10758SumKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10759SumMts", GXutil.ltrim( localUtil.ntoc( O10759SumMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5806AlbREnt2", GXutil.rtrim( O5806AlbREnt2));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_181", GXutil.ltrim( localUtil.ntoc( nGXsfl_181_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N1211TipEntCod", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV116TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV116TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV116TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO", GXutil.rtrim( AV46Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV113EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV113EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV114AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV114AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV118Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PROCECOD", GXutil.ltrim( localUtil.ntoc( AV119Insert_ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV120Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TIPENTCOD", GXutil.ltrim( localUtil.ntoc( AV121Insert_TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vENC20C", GXutil.ltrim( localUtil.ntoc( AV88Enc20c, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV46Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vTERMILENIO", GXutil.ltrim( localUtil.ntoc( AV99Termilenio, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCUM", GXutil.rtrim( AV18AlbCum));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGKGS", GXutil.ltrim( localUtil.ntoc( AV50FlagKgs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMTS", GXutil.ltrim( localUtil.ntoc( AV51FlagMts, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDALB2", GXutil.rtrim( AV92OldAlb2));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRP", GXutil.ltrim( localUtil.ntoc( AV76ErrP, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRHEN", localUtil.ttoc( A4606AlbRHEn, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV93Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGART", GXutil.ltrim( localUtil.ntoc( AV60FlagArt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRDTO", GXutil.ltrim( localUtil.ntoc( AV58Rdto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPESOML", GXutil.ltrim( localUtil.ntoc( AV59Pesoml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vANC", GXutil.ltrim( localUtil.ntoc( AV109Anc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRM2", GXutil.ltrim( localUtil.ntoc( AV110grm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV124Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV38Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRART", GXutil.ltrim( localUtil.ntoc( AV77ErrArt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTBLO", GXutil.rtrim( AV98artblo));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG", GXutil.ltrim( localUtil.ntoc( AV81Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINTATEX", GXutil.ltrim( localUtil.ntoc( AV75Tintatex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIART", GXutil.ltrim( localUtil.ntoc( AV78SiArt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVELLUTS", GXutil.ltrim( localUtil.ntoc( AV89Velluts, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_UBICA", GXutil.rtrim( AV106Msg_Ubica));
      app.GxWebStd.gx_hidden_field( httpContext, "vUBICAL", GXutil.ltrim( localUtil.ntoc( AV105UbicaL, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALORUBICA", GXutil.ltrim( localUtil.ntoc( AV108ValorUbica, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIREB", GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECSEC", GXutil.ltrim( localUtil.ntoc( A7501AlbRecSec, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCENOM", GXutil.rtrim( A971ProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPENTNOM", GXutil.rtrim( A1212TipEntNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIECAL", GXutil.rtrim( A4795AlRPieCal));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIEDEFC", GXutil.ltrim( localUtil.ntoc( A4806AlRPieDefC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPZAPROD", GXutil.ltrim( localUtil.ntoc( AV90PzaProd, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEUTI", GXutil.rtrim( AV54PieUti));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR", GXutil.rtrim( AV71Msg_err));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOPZAR", GXutil.ltrim( localUtil.ntoc( AV70NoPzaR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.talbdet", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV113EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV114AlbRecCod,8,0))}, new String[] {"Gx_mode","EmprCod","AlbRecCod"})  ;
   }

   public String getPgmname( )
   {
      return "TALBDET" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Almacen de Entrada, con detalle de rollos", "") ;
   }

   public void initializeNonKey7C7( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A1211TipEntCod = (short)(0) ;
      n1211TipEntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      AV46Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Modo", AV46Modo);
      A5806AlbREnt2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      A46AlbREnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      AV60FlagArt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60FlagArt", GXutil.str( AV60FlagArt, 1, 0));
      AV58Rdto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Rdto", GXutil.ltrimstr( AV58Rdto, 6, 2));
      AV59Pesoml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Pesoml), 4, 0));
      AV109Anc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109Anc), 4, 0));
      AV110grm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110grm2), 4, 0));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      AV18AlbCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      AV92OldAlb2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92OldAlb2", AV92OldAlb2);
      AV77ErrArt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77ErrArt", GXutil.str( AV77ErrArt, 1, 0));
      A3613AlbRefDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      AV98artblo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98artblo", AV98artblo);
      AV81Flag = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81Flag", GXutil.str( AV81Flag, 1, 0));
      AV76ErrP = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76ErrP", GXutil.str( AV76ErrP, 1, 0));
      AV106Msg_Ubica = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106Msg_Ubica", AV106Msg_Ubica);
      A2147AlbDetKgmD = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      A2150AlbDetMtrD = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A2153AlbDetPieU = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A971ProceNom = "" ;
      n971ProceNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A1212TipEntNom = "" ;
      n1212TipEntNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      A1291AlbRDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
      A50AlbRLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      A2152AlbDetPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
      A2149AlbDetMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
      A2146AlbDetKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
      A2151AlbDetMtrU = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
      A2148AlbDetKgmU = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      A10758SumKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      A10759SumMts = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      A10760SumPzs = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      A6180AlbrUniC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
      A6181AlbrPieC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
      A4920AlbRGrm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
      A4921AlbRAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      A4922AlbPml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
      A6463AlbRLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      A13241AlbRPh = DecimalUtil.ZERO ;
      n13241AlbRPh = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
      A13242AlbRRLong = DecimalUtil.ZERO ;
      n13242AlbRRLong = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
      A13243AlbRRTrans = DecimalUtil.ZERO ;
      n13243AlbRRTrans = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
      A8029AlbNumM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
      A53AlbRPieReb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
      A59AlbRUniReb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
      A10761AlbUltP = (short)(0) ;
      n10761AlbUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      A7501AlbRecSec = (short)(0) ;
      n7501AlbRecSec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7501AlbRecSec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7501AlbRecSec), 3, 0));
      A1222AlbNumEti = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
      AV93Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Inc_obs", AV93Inc_obs);
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A49AlbRFen = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      A4606AlbRHEn = GXutil.now( ) ;
      n4606AlbRHEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A55AlbRReo = httpContext.getMessage( "NO", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A48AlbRFecUlt = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      O10761AlbUltP = A10761AlbUltP ;
      n10761AlbUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      O10760SumPzs = A10760SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      O10758SumKgs = A10758SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      O10759SumMts = A10759SumMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      O5806AlbREnt2 = A5806AlbREnt2 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      Z5806AlbREnt2 = "" ;
      Z46AlbREnt = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z54AlbRPieUti = 0 ;
      Z47AlbREst = (byte)(0) ;
      Z56AlbRUni = "" ;
      Z3613AlbRefDsc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      Z45AlbRef = "" ;
      Z1291AlbRDes = "" ;
      Z50AlbRLoc = "" ;
      Z55AlbRReo = "" ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      Z6181AlbrPieC = 0 ;
      Z4920AlbRGrm2 = (short)(0) ;
      Z4921AlbRAnc = (short)(0) ;
      Z4922AlbPml = (short)(0) ;
      Z6463AlbRLote = "" ;
      Z13241AlbRPh = DecimalUtil.ZERO ;
      Z13242AlbRRLong = DecimalUtil.ZERO ;
      Z13243AlbRRTrans = DecimalUtil.ZERO ;
      Z8029AlbNumM = "" ;
      Z53AlbRPieReb = 0 ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z10761AlbUltP = (short)(0) ;
      Z7501AlbRecSec = (short)(0) ;
      Z1222AlbNumEti = (short)(0) ;
      Z252CliCod = 0 ;
      Z840TrnCod = (short)(0) ;
      Z970ProceCod = (short)(0) ;
      Z1211TipEntCod = (short)(0) ;
   }

   public void initAll7C7( )
   {
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      initializeNonKey7C7( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV46Modo = iV46Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Modo", AV46Modo);
      A56AlbRUni = i56AlbRUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A49AlbRFen = i49AlbRFen ;
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      A55AlbRReo = i55AlbRReo ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A48AlbRFecUlt = i48AlbRFecUlt ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      A4606AlbRHEn = i4606AlbRHEn ;
      n4606AlbRHEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void initializeNonKey7C299( )
   {
      A10762AlbPCont = (short)(0) ;
      AV90PzaProd = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90PzaProd", GXutil.str( AV90PzaProd, 1, 0));
      AV71Msg_err = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Msg_err", AV71Msg_err);
      AV54PieUti = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54PieUti", AV54PieUti);
      A4797AlRPieClaC = "" ;
      A4795AlRPieCal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A8779Bod_Talla = "" ;
      A8780Bod_Und = (short)(0) ;
      A3730AlbRecCol = (short)(0) ;
      A3731AlbRecIdPz = "" ;
      A3732AlbRecIdRc = 0 ;
      A4410AlbRecPal = DecimalUtil.ZERO ;
      A10180AlRPieTelT = "" ;
      A10149AlRPieCon = 0 ;
      A10181AlRPieOri = "" ;
      A10182AlRPieDst = "" ;
      A10183AlrPieKgmT = DecimalUtil.ZERO ;
      A7408ALRPIELOC = "" ;
      A4806AlRPieDefC = 0 ;
      n4806AlRPieDefC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      A2154AlbRecAnh = A4921AlbRAnc ;
      O2155AlbRecKgm = A2155AlbRecKgm ;
      O2157AlbRecMtr = A2157AlbRecMtr ;
      Z4795AlRPieCal = "" ;
      Z2154AlbRecAnh = (short)(0) ;
      Z10762AlbPCont = (short)(0) ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2158AlbRecMtrU = DecimalUtil.ZERO ;
      Z2156AlbRecKgmU = DecimalUtil.ZERO ;
      Z8779Bod_Talla = "" ;
      Z8780Bod_Und = (short)(0) ;
      Z3730AlbRecCol = (short)(0) ;
      Z3731AlbRecIdPz = "" ;
      Z3732AlbRecIdRc = 0 ;
      Z4410AlbRecPal = DecimalUtil.ZERO ;
      Z10180AlRPieTelT = "" ;
      Z10149AlRPieCon = 0 ;
      Z10181AlRPieOri = "" ;
      Z10182AlRPieDst = "" ;
      Z10183AlrPieKgmT = DecimalUtil.ZERO ;
      Z7408ALRPIELOC = "" ;
   }

   public void initAll7C299( )
   {
      A2159AlbRecPie = "" ;
      initializeNonKey7C299( ) ;
   }

   public void standaloneModalInsert7C299( )
   {
      A10761AlbUltP = i10761AlbUltP ;
      n10761AlbUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      A2154AlbRecAnh = i2154AlbRecAnh ;
      A10762AlbPCont = i10762AlbPCont ;
      A47AlbREst = i47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A10760SumPzs = i10760SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241515726", true, true);
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
      httpContext.AddJavascriptSource("talbdet.js", "?20268241515727", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties299( )
   {
      edtAlbPCont_Enabled = defedtAlbPCont_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPCont_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlrPieKgmT_Enabled = defedtAlrPieKgmT_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlrPieKgmT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlrPieKgmT_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieDst_Enabled = defedtAlRPieDst_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieDst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieDst_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieOri_Enabled = defedtAlRPieOri_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieOri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieOri_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieCon_Enabled = defedtAlRPieCon_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieCon_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieTelT_Enabled = defedtAlRPieTelT_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieTelT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieTelT_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecPal_Enabled = defedtAlbRecPal_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPal_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecIdRc_Enabled = defedtAlbRecIdRc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecIdRc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecIdRc_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecIdPz_Enabled = defedtAlbRecIdPz_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecIdPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecIdPz_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecCol_Enabled = defedtAlbRecCol_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCol_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtBod_Und_Enabled = defedtBod_Und_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Und_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtBod_Talla_Enabled = defedtBod_Talla_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Talla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Talla_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlRPieClaC_Enabled = defedtAlRPieClaC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRPieClaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRPieClaC_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecPie_Enabled = defedtAlbRecPie_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_181_Refreshing);
   }

   public void startgridcontrol181( )
   {
      Gridlevel_piezasContainer.AddObjectProperty("GridName", "Gridlevel_piezas");
      Gridlevel_piezasContainer.AddObjectProperty("Header", subGridlevel_piezas_Header);
      Gridlevel_piezasContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_piezasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_piezasContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.rtrim( A2159AlbRecPie));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.rtrim( A7408ALRPIELOC));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIELOC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.rtrim( A4797AlRPieClaC));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieClaC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.rtrim( A8779Bod_Talla));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Talla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8780Bod_Und, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Und_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3730AlbRecCol, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.rtrim( A3731AlbRecIdPz));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdPz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3732AlbRecIdRc, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdRc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4410AlbRecPal, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.rtrim( A10180AlRPieTelT));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieTelT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10149AlRPieCon, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.rtrim( A10181AlRPieOri));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieOri_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.rtrim( A10182AlRPieDst));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRPieDst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10183AlrPieKgmT, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlrPieKgmT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10762AlbPCont, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPCont_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbPCont_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbREnt_Internalname = "ALBRENT" ;
      divAlbrent_cell_Internalname = "ALBRENT_CELL" ;
      edtAlbREnt2_Internalname = "ALBRENT2" ;
      divAlbrent2_cell_Internalname = "ALBRENT2_CELL" ;
      edtAlbRFen_Internalname = "ALBRFEN" ;
      dynCliCod.setInternalname( "CLICOD" );
      dynAlbRef.setInternalname( "ALBREF" );
      dynProceCod.setInternalname( "PROCECOD" );
      dynTrnCod.setInternalname( "TRNCOD" );
      dynTipEntCod.setInternalname( "TIPENTCOD" );
      edtAlbRDes_Internalname = "ALBRDES" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      grpUnnamedgroup4_Internalname = "UNNAMEDGROUP4" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbrUniC_Internalname = "ALBRUNIC" ;
      edtAlbrPieC_Internalname = "ALBRPIEC" ;
      edtAlbNumM_Internalname = "ALBNUMM" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      grpUnnamedgroup6_Internalname = "UNNAMEDGROUP6" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtAlbRFecUlt_Internalname = "ALBRFECULT" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      grpUnnamedgroup8_Internalname = "UNNAMEDGROUP8" ;
      tblTablemergedunnamedgroup6_Internalname = "TABLEMERGEDUNNAMEDGROUP6" ;
      edtAlbRLoc_Internalname = "ALBRLOC" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      edtAlbRLote_Internalname = "ALBRLOTE" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      grpUnnamedgroup10_Internalname = "UNNAMEDGROUP10" ;
      edtAlbRGrm2_Internalname = "ALBRGRM2" ;
      edtAlbRAnc_Internalname = "ALBRANC" ;
      edtAlbPml_Internalname = "ALBPML" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      grpUnnamedgroup12_Internalname = "UNNAMEDGROUP12" ;
      edtAlbRPh_Internalname = "ALBRPH" ;
      edtAlbRRLong_Internalname = "ALBRRLONG" ;
      edtAlbRRTrans_Internalname = "ALBRRTRANS" ;
      divUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
      grpUnnamedgroup14_Internalname = "UNNAMEDGROUP14" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtAlbRecPie_Internalname = "ALBRECPIE" ;
      edtALRPIELOC_Internalname = "ALRPIELOC" ;
      edtAlbRecAnh_Internalname = "ALBRECANH" ;
      edtAlbRecMtr_Internalname = "ALBRECMTR" ;
      edtAlbRecKgm_Internalname = "ALBRECKGM" ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU" ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU" ;
      edtAlRPieClaC_Internalname = "ALRPIECLAC" ;
      edtBod_Talla_Internalname = "BOD_TALLA" ;
      edtBod_Und_Internalname = "BOD_UND" ;
      edtAlbRecCol_Internalname = "ALBRECCOL" ;
      edtAlbRecIdPz_Internalname = "ALBRECIDPZ" ;
      edtAlbRecIdRc_Internalname = "ALBRECIDRC" ;
      edtAlbRecPal_Internalname = "ALBRECPAL" ;
      edtAlRPieTelT_Internalname = "ALRPIETELT" ;
      edtAlRPieCon_Internalname = "ALRPIECON" ;
      edtAlRPieOri_Internalname = "ALRPIEORI" ;
      edtAlRPieDst_Internalname = "ALRPIEDST" ;
      edtAlrPieKgmT_Internalname = "ALRPIEKGMT" ;
      edtAlbPCont_Internalname = "ALBPCONT" ;
      bttBtnnumerarpiezas_Internalname = "BTNNUMERARPIEZAS" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTableleaflevel_piezas_Internalname = "TABLELEAFLEVEL_PIEZAS" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtAlbDetPie_Internalname = "ALBDETPIE" ;
      edtAlbDetMtr_Internalname = "ALBDETMTR" ;
      edtAlbDetKgm_Internalname = "ALBDETKGM" ;
      edtAlbDetMtrU_Internalname = "ALBDETMTRU" ;
      edtAlbDetKgmU_Internalname = "ALBDETKGMU" ;
      edtAlbDetMtrD_Internalname = "ALBDETMTRD" ;
      edtAlbDetKgmD_Internalname = "ALBDETKGMD" ;
      edtAlbDetPieU_Internalname = "ALBDETPIEU" ;
      edtSumKgs_Internalname = "SUMKGS" ;
      edtSumMts_Internalname = "SUMMTS" ;
      edtSumPzs_Internalname = "SUMPZS" ;
      edtAlbRPieReb_Internalname = "ALBRPIEREB" ;
      edtAlbUltP_Internalname = "ALBULTP" ;
      edtAlbNumEti_Internalname = "ALBNUMETI" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_piezas_Internalname = "GRIDLEVEL_PIEZAS" ;
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
      subGridlevel_piezas_Allowcollapsing = (byte)(0) ;
      subGridlevel_piezas_Allowselection = (byte)(0) ;
      subGridlevel_piezas_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Almacen de Entrada, con detalle de rollos", "") );
      edtAlbPCont_Jsonclick = "" ;
      edtAlrPieKgmT_Jsonclick = "" ;
      edtAlRPieDst_Jsonclick = "" ;
      edtAlRPieOri_Jsonclick = "" ;
      edtAlRPieCon_Jsonclick = "" ;
      edtAlRPieTelT_Jsonclick = "" ;
      edtAlbRecPal_Jsonclick = "" ;
      edtAlbRecIdRc_Jsonclick = "" ;
      edtAlbRecIdPz_Jsonclick = "" ;
      edtAlbRecCol_Jsonclick = "" ;
      edtBod_Und_Jsonclick = "" ;
      edtBod_Talla_Jsonclick = "" ;
      edtAlRPieClaC_Jsonclick = "" ;
      edtAlbRecKgmU_Jsonclick = "" ;
      edtAlbRecMtrU_Jsonclick = "" ;
      edtAlbRecKgm_Jsonclick = "" ;
      edtAlbRecMtr_Jsonclick = "" ;
      edtAlbRecAnh_Jsonclick = "" ;
      edtALRPIELOC_Jsonclick = "" ;
      edtAlbRecPie_Jsonclick = "" ;
      subGridlevel_piezas_Class = "GridNoBorder WorkWith" ;
      subGridlevel_piezas_Backcolorstyle = (byte)(0) ;
      edtAlbPCont_Visible = 0 ;
      edtAlbPCont_Enabled = 0 ;
      edtAlrPieKgmT_Enabled = 0 ;
      edtAlRPieDst_Enabled = 0 ;
      edtAlRPieOri_Enabled = 0 ;
      edtAlRPieCon_Enabled = 0 ;
      edtAlRPieTelT_Enabled = 0 ;
      edtAlbRecPal_Enabled = 0 ;
      edtAlbRecIdRc_Enabled = 0 ;
      edtAlbRecIdPz_Enabled = 0 ;
      edtAlbRecCol_Enabled = 0 ;
      edtBod_Und_Enabled = 0 ;
      edtBod_Talla_Enabled = 0 ;
      edtAlRPieClaC_Enabled = 0 ;
      edtAlbRecKgmU_Enabled = 1 ;
      edtAlbRecMtrU_Enabled = 1 ;
      edtAlbRecKgm_Enabled = 1 ;
      edtAlbRecMtr_Enabled = 1 ;
      edtAlbRecAnh_Enabled = 1 ;
      edtALRPIELOC_Enabled = 1 ;
      edtAlbRecPie_Enabled = 1 ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRefDsc_Enabled = 1 ;
      edtAlbRefDsc_Visible = 1 ;
      edtAlbNumEti_Jsonclick = "" ;
      edtAlbNumEti_Enabled = 1 ;
      edtAlbNumEti_Visible = 1 ;
      edtAlbUltP_Jsonclick = "" ;
      edtAlbUltP_Enabled = 0 ;
      edtAlbUltP_Visible = 1 ;
      edtAlbRPieReb_Jsonclick = "" ;
      edtAlbRPieReb_Enabled = 1 ;
      edtAlbRPieReb_Visible = 1 ;
      edtSumPzs_Jsonclick = "" ;
      edtSumPzs_Enabled = 0 ;
      edtSumPzs_Visible = 1 ;
      edtSumMts_Jsonclick = "" ;
      edtSumMts_Enabled = 0 ;
      edtSumMts_Visible = 1 ;
      edtSumKgs_Jsonclick = "" ;
      edtSumKgs_Enabled = 0 ;
      edtSumKgs_Visible = 1 ;
      edtAlbDetPieU_Jsonclick = "" ;
      edtAlbDetPieU_Enabled = 0 ;
      edtAlbDetPieU_Visible = 1 ;
      edtAlbDetKgmD_Jsonclick = "" ;
      edtAlbDetKgmD_Enabled = 0 ;
      edtAlbDetKgmD_Visible = 1 ;
      edtAlbDetMtrD_Jsonclick = "" ;
      edtAlbDetMtrD_Enabled = 0 ;
      edtAlbDetMtrD_Visible = 1 ;
      edtAlbDetKgmU_Jsonclick = "" ;
      edtAlbDetKgmU_Enabled = 0 ;
      edtAlbDetKgmU_Visible = 1 ;
      edtAlbDetMtrU_Jsonclick = "" ;
      edtAlbDetMtrU_Enabled = 0 ;
      edtAlbDetMtrU_Visible = 1 ;
      edtAlbDetKgm_Jsonclick = "" ;
      edtAlbDetKgm_Enabled = 0 ;
      edtAlbDetKgm_Visible = 1 ;
      edtAlbDetMtr_Jsonclick = "" ;
      edtAlbDetMtr_Enabled = 0 ;
      edtAlbDetMtr_Visible = 1 ;
      edtAlbDetPie_Jsonclick = "" ;
      edtAlbDetPie_Enabled = 0 ;
      edtAlbDetPie_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      bttBtnnumerarpiezas_Visible = 1 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      edtAlbRRTrans_Jsonclick = "" ;
      edtAlbRRTrans_Enabled = 1 ;
      edtAlbRRLong_Jsonclick = "" ;
      edtAlbRRLong_Enabled = 1 ;
      edtAlbRPh_Jsonclick = "" ;
      edtAlbRPh_Enabled = 1 ;
      grpUnnamedgroup14_Class = "Group" ;
      edtAlbPml_Jsonclick = "" ;
      edtAlbPml_Enabled = 1 ;
      edtAlbRAnc_Jsonclick = "" ;
      edtAlbRAnc_Enabled = 1 ;
      edtAlbRGrm2_Jsonclick = "" ;
      edtAlbRGrm2_Enabled = 1 ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbRLote_Enabled = 1 ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbRReo.setEnabled( 1 );
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRLoc_Enabled = 1 ;
      cmbAlbREst.setJsonclick( "" );
      cmbAlbREst.setEnabled( 0 );
      edtAlbRFecUlt_Jsonclick = "" ;
      edtAlbRFecUlt_Enabled = 0 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Enabled = 0 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbNumM_Jsonclick = "" ;
      edtAlbNumM_Enabled = 1 ;
      edtAlbrPieC_Jsonclick = "" ;
      edtAlbrPieC_Enabled = 1 ;
      edtAlbrUniC_Jsonclick = "" ;
      edtAlbrUniC_Enabled = 1 ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Enabled = 0 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 1 );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbRDes_Jsonclick = "" ;
      edtAlbRDes_Enabled = 1 ;
      dynTipEntCod.setJsonclick( "" );
      dynTipEntCod.setEnabled( 1 );
      dynTrnCod.setJsonclick( "" );
      dynTrnCod.setEnabled( 1 );
      dynProceCod.setJsonclick( "" );
      dynProceCod.setEnabled( 1 );
      dynAlbRef.setJsonclick( "" );
      dynAlbRef.setEnabled( 1 );
      dynCliCod.setJsonclick( "" );
      dynCliCod.setEnabled( 1 );
      edtAlbRFen_Jsonclick = "" ;
      edtAlbRFen_Enabled = 1 ;
      edtAlbREnt2_Jsonclick = "" ;
      edtAlbREnt2_Enabled = 1 ;
      edtAlbREnt2_Visible = 1 ;
      divAlbrent2_cell_Class = "col-xs-12 col-sm-3" ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbREnt_Enabled = 1 ;
      edtAlbREnt_Visible = 1 ;
      divAlbrent_cell_Class = "col-xs-12 col-sm-3" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
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
      gxaalbref_html7C7( A396EmprCod, A252CliCod) ;
      /* End function dynload_actions */
   }

   public void gxdlaclicod7C7( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaclicod_data7C7( A396EmprCod) ;
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

   public void gxaclicod_html7C7( String A396EmprCod )
   {
      int gxdynajaxvalue;
      gxdlaclicod_data7C7( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynCliCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (int)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynCliCod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 6, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlaclicod_data7C7( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T007C67 */
      pr_default.execute(58, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(58) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T007C67_A252CliCod[0], (byte)(6), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T007C67_A279CliNom[0]));
         pr_default.readNext(58);
      }
      pr_default.close(58);
   }

   public void gxdlaalbref7C7( String A396EmprCod ,
                               int A252CliCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaalbref_data7C7( A396EmprCod, A252CliCod) ;
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

   public void gxaalbref_html7C7( String A396EmprCod ,
                                  int A252CliCod )
   {
      String gxdynajaxvalue;
      gxdlaalbref_data7C7( A396EmprCod, A252CliCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynAlbRef.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynAlbRef.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlaalbref_data7C7( String A396EmprCod ,
                                       int A252CliCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T007C68 */
      pr_default.execute(59, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(59) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T007C68_A65ArtCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T007C68_A69ArtDsc[0]));
         pr_default.readNext(59);
      }
      pr_default.close(59);
   }

   public void gxdlaprocecod7C7( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaprocecod_data7C7( A396EmprCod) ;
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

   public void gxaprocecod_html7C7( String A396EmprCod )
   {
      short gxdynajaxvalue;
      gxdlaprocecod_data7C7( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynProceCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynProceCod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlaprocecod_data7C7( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T007C69 */
      pr_default.execute(60, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(60) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T007C69_A970ProceCod[0], (byte)(4), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T007C69_A971ProceNom[0]));
         pr_default.readNext(60);
      }
      pr_default.close(60);
   }

   public void gxdlatrncod7C7( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlatrncod_data7C7( A396EmprCod) ;
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

   public void gxatrncod_html7C7( String A396EmprCod )
   {
      short gxdynajaxvalue;
      gxdlatrncod_data7C7( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynTrnCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynTrnCod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlatrncod_data7C7( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T007C70 */
      pr_default.execute(61, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(61) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T007C70_A840TrnCod[0], (byte)(4), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T007C70_A841TrnNom[0]));
         pr_default.readNext(61);
      }
      pr_default.close(61);
   }

   public void gxdlatipentcod7C7( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlatipentcod_data7C7( A396EmprCod) ;
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

   public void gxatipentcod_html7C7( String A396EmprCod )
   {
      short gxdynajaxvalue;
      gxdlatipentcod_data7C7( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynTipEntCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynTipEntCod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlatipentcod_data7C7( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T007C71 */
      pr_default.execute(62, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(62) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T007C71_A1211TipEntCod[0], (byte)(4), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T007C71_A1212TipEntNom[0]));
         pr_default.readNext(62);
      }
      pr_default.close(62);
   }

   public void gxasa467C7( byte AV88Enc20c ,
                           String A396EmprCod )
   {
      if ( true )
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
         edtAlbREnt_Visible = ((GXt_int5==0) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
      }
      else
      {
         edtAlbREnt_Visible = ((AV88Enc20c==1) ? 0 : 1) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
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

   public void gxasa58067C7( byte AV88Enc20c ,
                             String A396EmprCod )
   {
      if ( true )
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
         edtAlbREnt2_Visible = ((GXt_int5==1) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
      }
      else
      {
         edtAlbREnt2_Visible = AV88Enc20c ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
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

   public void gx42asaerrp7C7( String A396EmprCod ,
                               short A970ProceCod )
   {
      if ( ( AV75Tintatex == 1 ) && true /* After */ )
      {
         GXt_int5 = AV76ErrP ;
         GXv_char14[0] = " " ;
         GXv_int6[0] = GXt_int5 ;
         new app.pproced(remoteHandle, context).execute( A396EmprCod, A970ProceCod, GXv_char14, GXv_int6) ;
         talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
         AV76ErrP = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76ErrP", GXutil.str( AV76ErrP, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV76ErrP, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx51asaalbdetpieu7C7( String A396EmprCod ,
                                     int A44AlbRecCod ,
                                     String A56AlbRUni )
   {
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx86asaalbdetpieu7C299( String A396EmprCod ,
                                       int A44AlbRecCod ,
                                       String A56AlbRUni )
   {
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx97asapzaprod7C299( String Gx_mode ,
                                    String A396EmprCod ,
                                    int A44AlbRecCod ,
                                    String A2159AlbRecPie )
   {
      if ( ( isDlt( )  ) && true /* Level */ )
      {
         GXt_int5 = AV90PzaProd ;
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_int6[0] = GXt_int5 ;
         new app.ppzaprod(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_int6) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
         talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV90PzaProd = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90PzaProd", GXutil.str( AV90PzaProd, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV90PzaProd, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx98asapieuti7C299( String Gx_mode ,
                                   String A396EmprCod ,
                                   int A44AlbRecCod ,
                                   String A2159AlbRecPie )
   {
      if ( true /* Level */ && ( isUpd( )  || isDlt( )  ) )
      {
         GXt_char1 = AV54PieUti ;
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_char3[0] = GXt_char1 ;
         new app.palrpieuti(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
         talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         talbdet_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV54PieUti = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54PieUti", AV54PieUti);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV54PieUti))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_63_7C7( String Gx_mode ,
                          String A396EmprCod ,
                          int A44AlbRecCod ,
                          String A45AlbRef )
   {
      if ( isIns( )  && (0==A44AlbRecCod) && true /* Level */ && true /* After */ )
      {
         GXv_int8[0] = A44AlbRecCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int8) ;
         A44AlbRecCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_64_7C7( String A396EmprCod ,
                          int A252CliCod ,
                          String A45AlbRef )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char4[0] = A45AlbRef ;
         GXv_int6[0] = AV60FlagArt ;
         GXv_decimal16[0] = AV58Rdto ;
         GXv_int13[0] = AV59Pesoml ;
         GXv_int12[0] = AV109Anc ;
         GXv_int11[0] = AV110grm2 ;
         new app.pbusarp(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_int6, GXv_decimal16, GXv_int13, GXv_int12, GXv_int11) ;
         A396EmprCod = GXv_char14[0] ;
         A252CliCod = GXv_int8[0] ;
         A45AlbRef = GXv_char4[0] ;
         AV60FlagArt = GXv_int6[0] ;
         AV58Rdto = GXv_decimal16[0] ;
         AV59Pesoml = GXv_int13[0] ;
         AV109Anc = GXv_int12[0] ;
         AV110grm2 = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "AV60FlagArt", GXutil.str( AV60FlagArt, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV58Rdto", GXutil.ltrimstr( AV58Rdto, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV59Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Pesoml), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV109Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109Anc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV110grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110grm2), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV60FlagArt, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV58Rdto, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV59Pesoml, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV109Anc, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV110grm2, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_65_7C7( String A396EmprCod ,
                          String AV124Pgmname ,
                          String AV17UsurCod ,
                          String AV38Station ,
                          String AV93Inc_obs ,
                          int A44AlbRecCod ,
                          String A5806AlbREnt2 ,
                          String AV92OldAlb2 )
   {
      if ( true /* After */ && ( GXutil.strcmp(A5806AlbREnt2, AV92OldAlb2) != 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV124Pgmname, AV17UsurCod, AV38Station, AV93Inc_obs, A44AlbRecCod, (byte)(0), "@") ;
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

   public void xc_66_7C7( String A396EmprCod ,
                          int A252CliCod ,
                          String A45AlbRef ,
                          byte AV78SiArt )
   {
      if ( ( AV78SiArt == 1 ) && true /* After */ )
      {
         GXv_int13[0] = AV77ErrArt ;
         new app.core.pexiser(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_int13) ;
         AV77ErrArt = (byte)((byte)(GXv_int13[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77ErrArt", GXutil.str( AV77ErrArt, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV77ErrArt, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_67_7C7( String A396EmprCod ,
                          int A252CliCod ,
                          String A45AlbRef )
   {
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char4[0] = A45AlbRef ;
         GXv_char3[0] = A3613AlbRefDsc ;
         GXv_char2[0] = AV98artblo ;
         GXv_int6[0] = AV81Flag ;
         new app.pbusardbloqueo(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3, GXv_char2, GXv_int6) ;
         A396EmprCod = GXv_char14[0] ;
         A252CliCod = GXv_int8[0] ;
         A45AlbRef = GXv_char4[0] ;
         A3613AlbRefDsc = GXv_char3[0] ;
         AV98artblo = GXv_char2[0] ;
         AV81Flag = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV98artblo", AV98artblo);
         httpContext.ajax_rsp_assign_attri("", false, "AV81Flag", GXutil.str( AV81Flag, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3613AlbRefDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV98artblo))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV81Flag, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_78_7C7( String A396EmprCod ,
                          String A50AlbRLoc ,
                          byte AV105UbicaL ,
                          byte AV108ValorUbica )
   {
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") != 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 0 ) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_char4[0] = A50AlbRLoc ;
         GXv_char3[0] = AV106Msg_Ubica ;
         new app.pcubitinte(remoteHandle, context).execute( GXv_char14, GXv_char4, GXv_char3) ;
         A396EmprCod = GXv_char14[0] ;
         A50AlbRLoc = GXv_char4[0] ;
         AV106Msg_Ubica = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         httpContext.ajax_rsp_assign_attri("", false, "AV106Msg_Ubica", AV106Msg_Ubica);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A50AlbRLoc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV106Msg_Ubica))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_81_7C7( String A396EmprCod ,
                          String A50AlbRLoc ,
                          String AV106Msg_Ubica ,
                          byte AV105UbicaL ,
                          byte AV108ValorUbica )
   {
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") != 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 1 ) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_char4[0] = A50AlbRLoc ;
         GXv_char3[0] = AV106Msg_Ubica ;
         new app.pubicacioncontrol(remoteHandle, context).execute( GXv_char14, GXv_char4, GXv_char3) ;
         A396EmprCod = GXv_char14[0] ;
         A50AlbRLoc = GXv_char4[0] ;
         AV106Msg_Ubica = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         httpContext.ajax_rsp_assign_attri("", false, "AV106Msg_Ubica", AV106Msg_Ubica);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A50AlbRLoc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV106Msg_Ubica))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_84_7C7( String A396EmprCod ,
                          String AV124Pgmname ,
                          String AV17UsurCod ,
                          String AV38Station ,
                          String AV93Inc_obs ,
                          int A44AlbRecCod )
   {
      if ( true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV124Pgmname, AV17UsurCod, AV38Station, AV93Inc_obs, A44AlbRecCod, (byte)(0), "@") ;
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

   public void xc_125_7C299( String A396EmprCod ,
                             String AV124Pgmname ,
                             String AV17UsurCod ,
                             String AV38Station ,
                             String AV93Inc_obs ,
                             int A44AlbRecCod ,
                             String A5806AlbREnt2 ,
                             String AV92OldAlb2 )
   {
      if ( true /* After */ && ( GXutil.strcmp(A5806AlbREnt2, AV92OldAlb2) != 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV124Pgmname, AV17UsurCod, AV38Station, AV93Inc_obs, A44AlbRecCod, (byte)(0), "@") ;
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

   public void xc_130_7C299( String Gx_mode ,
                             String A396EmprCod ,
                             String A2159AlbRecPie ,
                             byte AV82Noctrlpz )
   {
      if ( isIns( )  && true /* After */ && ( AV82Noctrlpz == 0 ) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_char3[0] = AV71Msg_err ;
         new app.pexipzae(remoteHandle, context).execute( GXv_char14, GXv_char4, GXv_char3) ;
         A396EmprCod = GXv_char14[0] ;
         A2159AlbRecPie = GXv_char4[0] ;
         AV71Msg_err = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV71Msg_err", AV71Msg_err);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2159AlbRecPie))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV71Msg_err))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_133_7C299( String Gx_mode ,
                             String A396EmprCod ,
                             int A44AlbRecCod ,
                             String A2159AlbRecPie ,
                             byte AV57SumPza ,
                             java.math.BigDecimal A2155AlbRecKgm )
   {
      if ( isIns( )  && (GXutil.strcmp("", A2159AlbRecPie)==0) && ( AV57SumPza == 1 ) && true /* Level */ && true /* After */ )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         new app.pultpza(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4) ;
         A396EmprCod = GXv_char14[0] ;
         A44AlbRecCod = GXv_int8[0] ;
         A2159AlbRecPie = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2159AlbRecPie))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_134_7C299( String A56AlbRUni ,
                             java.math.BigDecimal A2157AlbRecMtr ,
                             java.math.BigDecimal A2155AlbRecKgm ,
                             byte AV60FlagArt ,
                             String A2159AlbRecPie ,
                             byte AV61CalMKT )
   {
      if ( ( AV60FlagArt == 1 ) && true /* Level */ && true /* After */ && ( AV61CalMKT == 1 ) )
      {
         GXv_char14[0] = A56AlbRUni ;
         GXv_decimal16[0] = A2157AlbRecMtr ;
         GXv_decimal15[0] = A2155AlbRecKgm ;
         GXv_decimal10[0] = AV58Rdto ;
         GXv_int13[0] = AV59Pesoml ;
         GXv_int12[0] = AV109Anc ;
         GXv_int11[0] = AV110grm2 ;
         new app.pcalkmt(remoteHandle, context).execute( GXv_char14, GXv_decimal16, GXv_decimal15, GXv_decimal10, GXv_int13, GXv_int12, GXv_int11) ;
         A56AlbRUni = GXv_char14[0] ;
         A2157AlbRecMtr = GXv_decimal16[0] ;
         A2155AlbRecKgm = GXv_decimal15[0] ;
         AV58Rdto = GXv_decimal10[0] ;
         AV59Pesoml = GXv_int13[0] ;
         AV109Anc = GXv_int12[0] ;
         AV110grm2 = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.ajax_rsp_assign_attri("", false, "AV58Rdto", GXutil.ltrimstr( AV58Rdto, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV59Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Pesoml), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV109Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109Anc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV110grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110grm2), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV58Rdto, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV59Pesoml, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV109Anc, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV110grm2, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_135_7C299( String A396EmprCod ,
                             String AV124Pgmname ,
                             String AV17UsurCod ,
                             String AV38Station ,
                             String AV93Inc_obs ,
                             int A44AlbRecCod )
   {
      if ( true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV124Pgmname, AV17UsurCod, AV38Station, AV93Inc_obs, A44AlbRecCod, (byte)(0), "@") ;
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

   public void gxnrgridlevel_piezas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_181299( ) ;
      while ( nGXsfl_181_idx <= nRC_GXsfl_181 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal7C299( ) ;
         standaloneModal7C299( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow7C299( ) ;
         nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
         sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_181299( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_piezasContainer)) ;
      /* End function gxnrGridlevel_piezas_newrow */
   }

   public void init_web_controls( )
   {
      dynCliCod.setName( "CLICOD" );
      dynCliCod.setWebtags( "" );
      dynAlbRef.setName( "ALBREF" );
      dynAlbRef.setWebtags( "" );
      dynProceCod.setName( "PROCECOD" );
      dynProceCod.setWebtags( "" );
      dynTrnCod.setName( "TRNCOD" );
      dynTrnCod.setWebtags( "" );
      dynTipEntCod.setName( "TIPENTCOD" );
      dynTipEntCod.setWebtags( "" );
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "Kilos", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "Metros", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      cmbAlbREst.setName( "ALBREST" );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A47AlbREst) )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      cmbAlbRReo.setName( "ALBRREO" );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A55AlbRReo)==0) )
         {
            A55AlbRReo = httpContext.getMessage( "NO", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
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

   public void valid_Albreccod( )
   {
      n44AlbRecCod = false ;
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      /* Using cursor T007C73 */
      pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(63) != 101) )
      {
         A2152AlbDetPie = T007C73_A2152AlbDetPie[0] ;
         A2149AlbDetMtr = T007C73_A2149AlbDetMtr[0] ;
         A2146AlbDetKgm = T007C73_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = T007C73_A2151AlbDetMtrU[0] ;
         A2148AlbDetKgmU = T007C73_A2148AlbDetKgmU[0] ;
         A10758SumKgs = T007C73_A10758SumKgs[0] ;
         A10759SumMts = T007C73_A10759SumMts[0] ;
         A10760SumPzs = T007C73_A10760SumPzs[0] ;
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         A10758SumKgs = DecimalUtil.doubleToDec(0) ;
         A10759SumMts = DecimalUtil.doubleToDec(0) ;
         A10760SumPzs = (short)(0) ;
      }
      pr_default.close(63);
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
      }
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      if ( isIns( )  && ( ! (0==A44AlbRecCod) ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran inexistente", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrim( localUtil.ntoc( A2152AlbDetPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrim( localUtil.ntoc( A2149AlbDetMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrim( localUtil.ntoc( A2146AlbDetKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrim( localUtil.ntoc( A2151AlbDetMtrU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrim( localUtil.ntoc( A2148AlbDetKgmU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrim( localUtil.ntoc( A10758SumKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrim( localUtil.ntoc( A10759SumMts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrim( localUtil.ntoc( A10760SumPzs, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrim( localUtil.ntoc( A2150AlbDetMtrD, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrim( localUtil.ntoc( A2147AlbDetKgmD, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Emprcod( )
   {
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      gxaclicod_html7C7( A396EmprCod) ;
      gxaalbref_html7C7( A396EmprCod, A252CliCod) ;
      gxaprocecod_html7C7( A396EmprCod) ;
      gxatrncod_html7C7( A396EmprCod) ;
      gxatipentcod_html7C7( A396EmprCod) ;
      dynload_actions( ) ;
      if ( dynCliCod.getItemCount() > 0 )
      {
         A252CliCod = (int)(GXutil.lval( dynCliCod.getValidValue(GXutil.trim( GXutil.str( A252CliCod, 6, 0))))) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynCliCod.setValue( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
      }
      if ( dynAlbRef.getItemCount() > 0 )
      {
         A45AlbRef = dynAlbRef.getValidValue(A45AlbRef) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynAlbRef.setValue( GXutil.rtrim( A45AlbRef) );
      }
      if ( dynProceCod.getItemCount() > 0 )
      {
         A970ProceCod = (short)(GXutil.lval( dynProceCod.getValidValue(GXutil.trim( GXutil.str( A970ProceCod, 4, 0))))) ;
         n970ProceCod = false ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynProceCod.setValue( GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) );
      }
      if ( dynTrnCod.getItemCount() > 0 )
      {
         A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValidValue(GXutil.trim( GXutil.str( A840TrnCod, 4, 0))))) ;
         n840TrnCod = false ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynTrnCod.setValue( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
      }
      if ( dynTipEntCod.getItemCount() > 0 )
      {
         A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValidValue(GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0))))) ;
         n1211TipEntCod = false ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynTipEntCod.setValue( GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      dynCliCod.setValue( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynCliCod.getInternalname(), "Values", dynCliCod.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      dynAlbRef.setValue( GXutil.rtrim( A45AlbRef) );
      httpContext.ajax_rsp_assign_prop("", false, dynAlbRef.getInternalname(), "Values", dynAlbRef.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
      dynProceCod.setValue( GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynProceCod.getInternalname(), "Values", dynProceCod.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      dynTrnCod.setValue( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynTrnCod.getInternalname(), "Values", dynTrnCod.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      dynTipEntCod.setValue( GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynTipEntCod.getInternalname(), "Values", dynTipEntCod.ToJavascriptSource(), true);
   }

   public void valid_Albrent2( )
   {
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      if ( ( AV88Enc20c == 1 ) && ( AV99Termilenio == 0 ) )
      {
         A46AlbREnt = A5806AlbREnt2 ;
      }
      if ( ( AV89Velluts == 1 ) && ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Albaran¡¡¡", ""), 1, "ALBRENT2");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbREnt2_Internalname ;
      }
      AV92OldAlb2 = O5806AlbREnt2 ;
      if ( ( AV89Velluts == 1 ) && ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Albaran¡¡¡", ""), 1, "ALBRENT2");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbREnt2_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", GXutil.rtrim( A46AlbREnt));
      httpContext.ajax_rsp_assign_attri("", false, "AV92OldAlb2", GXutil.rtrim( AV92OldAlb2));
   }

   public void valid_Clicod( )
   {
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      /* Using cursor T007C74 */
      pr_default.execute(64, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(64) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = dynCliCod.getInternalname() ;
      }
      A279CliNom = T007C74_A279CliNom[0] ;
      pr_default.close(64);
      gxaalbref_html7C7( A396EmprCod, A252CliCod) ;
      dynload_actions( ) ;
      if ( dynAlbRef.getItemCount() > 0 )
      {
         A45AlbRef = dynAlbRef.getValidValue(A45AlbRef) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynAlbRef.setValue( GXutil.rtrim( A45AlbRef) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      dynAlbRef.setValue( GXutil.rtrim( A45AlbRef) );
      httpContext.ajax_rsp_assign_prop("", false, dynAlbRef.getInternalname(), "Values", dynAlbRef.ToJavascriptSource(), true);
   }

   public void valid_Albref( )
   {
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char4[0] = A45AlbRef ;
         GXv_int6[0] = AV60FlagArt ;
         GXv_decimal16[0] = AV58Rdto ;
         GXv_int13[0] = AV59Pesoml ;
         GXv_int12[0] = AV109Anc ;
         GXv_int11[0] = AV110grm2 ;
         new app.pbusarp(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_int6, GXv_decimal16, GXv_int13, GXv_int12, GXv_int11) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbdet_impl.this.A252CliCod = GXv_int8[0] ;
         A252CliCod = this.A252CliCod ;
         talbdet_impl.this.A45AlbRef = GXv_char4[0] ;
         A45AlbRef = this.A45AlbRef ;
         talbdet_impl.this.AV60FlagArt = GXv_int6[0] ;
         AV60FlagArt = this.AV60FlagArt ;
         talbdet_impl.this.AV58Rdto = GXv_decimal16[0] ;
         AV58Rdto = this.AV58Rdto ;
         talbdet_impl.this.AV59Pesoml = GXv_int13[0] ;
         AV59Pesoml = this.AV59Pesoml ;
         talbdet_impl.this.AV109Anc = GXv_int12[0] ;
         AV109Anc = this.AV109Anc ;
         talbdet_impl.this.AV110grm2 = GXv_int11[0] ;
         AV110grm2 = this.AV110grm2 ;
      }
      if ( ( AV78SiArt == 1 ) && true /* After */ )
      {
         GXv_int13[0] = AV77ErrArt ;
         new app.core.pexiser(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_int13) ;
         talbdet_impl.this.AV77ErrArt = (byte)((byte)(GXv_int13[0])) ;
         AV77ErrArt = this.AV77ErrArt ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char4[0] = A45AlbRef ;
         GXv_char3[0] = A3613AlbRefDsc ;
         GXv_char2[0] = AV98artblo ;
         GXv_int6[0] = AV81Flag ;
         new app.pbusardbloqueo(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3, GXv_char2, GXv_int6) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbdet_impl.this.A252CliCod = GXv_int8[0] ;
         A252CliCod = this.A252CliCod ;
         talbdet_impl.this.A45AlbRef = GXv_char4[0] ;
         A45AlbRef = this.A45AlbRef ;
         talbdet_impl.this.A3613AlbRefDsc = GXv_char3[0] ;
         A3613AlbRefDsc = this.A3613AlbRefDsc ;
         talbdet_impl.this.AV98artblo = GXv_char2[0] ;
         AV98artblo = this.AV98artblo ;
         talbdet_impl.this.AV81Flag = GXv_int6[0] ;
         AV81Flag = this.AV81Flag ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( GXutil.strcmp(AV98artblo, httpContext.getMessage( "S", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Articulo BLOQUEADO. Consultar", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = dynAlbRef.getInternalname() ;
      }
      if ( ( AV78SiArt == 1 ) && true /* After */ && ( AV77ErrArt == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe ARTICULO ¡¡¡", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = dynAlbRef.getInternalname() ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A45AlbRef, " ") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Articulo Incorrecto ¡¡¡", ""), 1, "ALBREF");
         AnyError = (short)(1) ;
         GX_FocusControl = dynAlbRef.getInternalname() ;
      }
      dynload_actions( ) ;
      if ( dynCliCod.getItemCount() > 0 )
      {
         A252CliCod = (int)(GXutil.lval( dynCliCod.getValidValue(GXutil.trim( GXutil.str( A252CliCod, 6, 0))))) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynCliCod.setValue( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
      }
      if ( dynAlbRef.getItemCount() > 0 )
      {
         A45AlbRef = dynAlbRef.getValidValue(A45AlbRef) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynAlbRef.setValue( GXutil.rtrim( A45AlbRef) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV60FlagArt", GXutil.ltrim( localUtil.ntoc( AV60FlagArt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV58Rdto", GXutil.ltrim( localUtil.ntoc( AV58Rdto, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV59Pesoml", GXutil.ltrim( localUtil.ntoc( AV59Pesoml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV109Anc", GXutil.ltrim( localUtil.ntoc( AV109Anc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV110grm2", GXutil.ltrim( localUtil.ntoc( AV110grm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV77ErrArt", GXutil.ltrim( localUtil.ntoc( AV77ErrArt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      dynCliCod.setValue( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynCliCod.getInternalname(), "Values", dynCliCod.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      dynAlbRef.setValue( GXutil.rtrim( A45AlbRef) );
      httpContext.ajax_rsp_assign_prop("", false, dynAlbRef.getInternalname(), "Values", dynAlbRef.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", GXutil.rtrim( A3613AlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV98artblo", GXutil.rtrim( AV98artblo));
      httpContext.ajax_rsp_assign_attri("", false, "AV81Flag", GXutil.ltrim( localUtil.ntoc( AV81Flag, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Procecod( )
   {
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      n971ProceNom = false ;
      /* Using cursor T007C75 */
      pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(65) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = dynProceCod.getInternalname() ;
         }
      }
      A971ProceNom = T007C75_A971ProceNom[0] ;
      n971ProceNom = T007C75_n971ProceNom[0] ;
      pr_default.close(65);
      if ( ( AV75Tintatex == 1 ) && true /* After */ )
      {
         GXt_int5 = AV76ErrP ;
         GXv_char14[0] = " " ;
         GXv_int6[0] = GXt_int5 ;
         new app.pproced(remoteHandle, context).execute( A396EmprCod, A970ProceCod, GXv_char14, GXv_int6) ;
         talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
         AV76ErrP = GXt_int5 ;
      }
      if ( ( AV75Tintatex == 1 ) && true /* After */ && ( AV76ErrP == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Procedencia ¡¡¡", ""), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = dynProceCod.getInternalname() ;
      }
      if ( ( AV75Tintatex == 1 ) && true /* After */ && ( A970ProceCod == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No es posible Procedencia=0¡¡¡", ""), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = dynProceCod.getInternalname() ;
      }
      if ( ( AV89Velluts == 1 ) && ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Albaran¡¡¡", ""), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = dynProceCod.getInternalname() ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV76ErrP", GXutil.ltrim( localUtil.ntoc( AV76ErrP, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Trncod( )
   {
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      n841TrnNom = false ;
      /* Using cursor T007C76 */
      pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(66) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = dynTrnCod.getInternalname() ;
         }
      }
      A841TrnNom = T007C76_A841TrnNom[0] ;
      n841TrnNom = T007C76_n841TrnNom[0] ;
      pr_default.close(66);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Tipentcod( )
   {
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      n1212TipEntNom = false ;
      /* Using cursor T007C77 */
      pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(67) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = dynTipEntCod.getInternalname() ;
         }
      }
      A1212TipEntNom = T007C77_A1212TipEntNom[0] ;
      n1212TipEntNom = T007C77_n1212TipEntNom[0] ;
      pr_default.close(67);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", GXutil.rtrim( A1212TipEntNom));
   }

   public void valid_Albruni( )
   {
      A56AlbRUni = cmbAlbRUni.getValue() ;
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      n44AlbRecCod = false ;
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      if ( ! ( ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) || ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      else
      {
         if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
         }
         else
         {
            if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               A47AlbREst = (byte)(1) ;
               cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
            }
            else
            {
               if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
               {
                  A47AlbREst = (byte)(0) ;
                  cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
               }
               else
               {
                  if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
                  {
                     A47AlbREst = (byte)(0) ;
                     cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
                  }
               }
            }
         }
      }
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         }
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
         }
      }
      if ( ! (0==A2153AlbDetPieU) )
      {
         A54AlbRPieUti = A2153AlbDetPieU ;
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      dynload_actions( ) ;
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", GXutil.rtrim( AV18AlbCum));
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Albrloc( )
   {
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      if ( ( AV89Velluts == 1 ) && ( GXutil.strcmp(A50AlbRLoc, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta informacion en Localizacion¡¡¡", ""), 1, "ALBRLOC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLoc_Internalname ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") != 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 0 ) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_char4[0] = A50AlbRLoc ;
         GXv_char3[0] = AV106Msg_Ubica ;
         new app.pcubitinte(remoteHandle, context).execute( GXv_char14, GXv_char4, GXv_char3) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbdet_impl.this.A50AlbRLoc = GXv_char4[0] ;
         A50AlbRLoc = this.A50AlbRLoc ;
         talbdet_impl.this.AV106Msg_Ubica = GXv_char3[0] ;
         AV106Msg_Ubica = this.AV106Msg_Ubica ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") != 0 ) && ( GXutil.strcmp(AV106Msg_Ubica, " ") != 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV106Msg_Ubica, 1, "ALBRLOC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLoc_Internalname ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") == 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Campo Localizacion sin Valor ¡¡¡", ""), 1, "ALBRLOC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLoc_Internalname ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") != 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 1 ) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_char4[0] = A50AlbRLoc ;
         GXv_char3[0] = AV106Msg_Ubica ;
         new app.pubicacioncontrol(remoteHandle, context).execute( GXv_char14, GXv_char4, GXv_char3) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbdet_impl.this.A50AlbRLoc = GXv_char4[0] ;
         A50AlbRLoc = this.A50AlbRLoc ;
         talbdet_impl.this.AV106Msg_Ubica = GXv_char3[0] ;
         AV106Msg_Ubica = this.AV106Msg_Ubica ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") != 0 ) && ( GXutil.strcmp(AV106Msg_Ubica, " ") != 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV106Msg_Ubica, 1, "ALBRLOC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLoc_Internalname ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A50AlbRLoc, " ") == 0 ) && ( AV105UbicaL == 1 ) && ( AV108ValorUbica == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Campo Localizacion sin Valor ¡¡¡", ""), 1, "ALBRLOC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLoc_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", GXutil.rtrim( A50AlbRLoc));
      httpContext.ajax_rsp_assign_attri("", false, "AV106Msg_Ubica", GXutil.rtrim( AV106Msg_Ubica));
   }

   public void valid_Albrecpie( )
   {
      n44AlbRecCod = false ;
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      n4806AlRPieDefC = false ;
      /* Using cursor T007C60 */
      pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(51) != 101) )
      {
         A4806AlRPieDefC = T007C60_A4806AlRPieDefC[0] ;
         n4806AlRPieDefC = T007C60_n4806AlRPieDefC[0] ;
      }
      else
      {
         A4806AlRPieDefC = 0 ;
         n4806AlRPieDefC = false ;
      }
      pr_default.close(51);
      GXt_char1 = A4795AlRPieCal ;
      GXv_char14[0] = A396EmprCod ;
      GXv_int8[0] = A44AlbRecCod ;
      GXv_char4[0] = A2159AlbRecPie ;
      GXv_char3[0] = GXt_char1 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3) ;
      talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
      A396EmprCod = this.A396EmprCod ;
      talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
      talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
      A2159AlbRecPie = this.A2159AlbRecPie ;
      talbdet_impl.this.GXt_char1 = GXv_char3[0] ;
      A4795AlRPieCal = GXt_char1 ;
      if ( ( isDlt( )  ) && true /* Level */ )
      {
         GXt_int5 = AV90PzaProd ;
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_int6[0] = GXt_int5 ;
         new app.ppzaprod(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_int6) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
         talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         A2159AlbRecPie = this.A2159AlbRecPie ;
         talbdet_impl.this.GXt_int5 = GXv_int6[0] ;
         AV90PzaProd = GXt_int5 ;
      }
      if ( ( AV90PzaProd == 1 ) && ( isDlt( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pieza en Produccion ¡¡¡", ""), 1, "ALBRECPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
      }
      if ( true /* Level */ && ( isUpd( )  || isDlt( )  ) )
      {
         GXt_char1 = AV54PieUti ;
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_char3[0] = GXt_char1 ;
         new app.palrpieuti(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4, GXv_char3) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
         talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         A2159AlbRecPie = this.A2159AlbRecPie ;
         talbdet_impl.this.GXt_char1 = GXv_char3[0] ;
         AV54PieUti = GXt_char1 ;
      }
      if ( isIns( )  && true /* After */ && ( AV82Noctrlpz == 0 ) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_char3[0] = AV71Msg_err ;
         new app.pexipzae(remoteHandle, context).execute( GXv_char14, GXv_char4, GXv_char3) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         A2159AlbRecPie = this.A2159AlbRecPie ;
         talbdet_impl.this.AV71Msg_err = GXv_char3[0] ;
         AV71Msg_err = this.AV71Msg_err ;
      }
      if ( isIns( )  && true /* After */ && ( AV70NoPzaR == 1 ) && ( GXutil.strcmp(AV71Msg_err, " ") != 0 ) && ( AV89Velluts == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV71Msg_err, 1, "ALBRECPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
      }
      if ( isIns( )  && true /* After */ && ( AV70NoPzaR == 0 ) && ( GXutil.strcmp(AV71Msg_err, " ") != 0 ) && ( AV89Velluts == 0 ) && ( AV94Colorsol == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV71Msg_err, 0, "ALBRECPIE");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrim( localUtil.ntoc( A4806AlRPieDefC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", GXutil.rtrim( A4795AlRPieCal));
      httpContext.ajax_rsp_assign_attri("", false, "AV90PzaProd", GXutil.ltrim( localUtil.ntoc( AV90PzaProd, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV54PieUti", GXutil.rtrim( AV54PieUti));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", GXutil.rtrim( A2159AlbRecPie));
      httpContext.ajax_rsp_assign_attri("", false, "AV71Msg_err", GXutil.rtrim( AV71Msg_err));
   }

   public void valid_Albrecmtr( )
   {
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      n4806AlRPieDefC = false ;
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
      {
         A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
      }
      else
      {
         if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
         {
            A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
            }
            else
            {
               A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
            }
         }
      }
      if ( ( AV60FlagArt == 1 ) && true /* Level */ && true /* After */ && ( AV61CalMKT == 1 ) )
      {
         GXv_char14[0] = A56AlbRUni ;
         GXv_decimal16[0] = A2157AlbRecMtr ;
         GXv_decimal15[0] = A2155AlbRecKgm ;
         GXv_decimal10[0] = AV58Rdto ;
         GXv_int13[0] = AV59Pesoml ;
         GXv_int12[0] = AV109Anc ;
         GXv_int11[0] = AV110grm2 ;
         new app.pcalkmt(remoteHandle, context).execute( GXv_char14, GXv_decimal16, GXv_decimal15, GXv_decimal10, GXv_int13, GXv_int12, GXv_int11) ;
         talbdet_impl.this.A56AlbRUni = GXv_char14[0] ;
         A56AlbRUni = this.A56AlbRUni ;
         talbdet_impl.this.A2157AlbRecMtr = GXv_decimal16[0] ;
         A2157AlbRecMtr = this.A2157AlbRecMtr ;
         talbdet_impl.this.A2155AlbRecKgm = GXv_decimal15[0] ;
         A2155AlbRecKgm = this.A2155AlbRecKgm ;
         talbdet_impl.this.AV58Rdto = GXv_decimal10[0] ;
         AV58Rdto = this.AV58Rdto ;
         talbdet_impl.this.AV59Pesoml = GXv_int13[0] ;
         AV59Pesoml = this.AV59Pesoml ;
         talbdet_impl.this.AV109Anc = GXv_int12[0] ;
         AV109Anc = this.AV109Anc ;
         talbdet_impl.this.AV110grm2 = GXv_int11[0] ;
         AV110grm2 = this.AV110grm2 ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", GXutil.rtrim( A4797AlRPieClaC));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A2157AlbRecMtr", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2155AlbRecKgm", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV58Rdto", GXutil.ltrim( localUtil.ntoc( AV58Rdto, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV59Pesoml", GXutil.ltrim( localUtil.ntoc( AV59Pesoml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV109Anc", GXutil.ltrim( localUtil.ntoc( AV109Anc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV110grm2", GXutil.ltrim( localUtil.ntoc( AV110grm2, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Albreckgm( )
   {
      n44AlbRecCod = false ;
      A252CliCod = (int)(GXutil.lval( dynCliCod.getValue())) ;
      A45AlbRef = dynAlbRef.getValue() ;
      n970ProceCod = false ;
      A970ProceCod = (short)(GXutil.lval( dynProceCod.getValue())) ;
      n970ProceCod = false ;
      n840TrnCod = false ;
      A840TrnCod = (short)(GXutil.lval( dynTrnCod.getValue())) ;
      n840TrnCod = false ;
      n1211TipEntCod = false ;
      A1211TipEntCod = (short)(GXutil.lval( dynTipEntCod.getValue())) ;
      n1211TipEntCod = false ;
      if ( isIns( )  && (GXutil.strcmp("", A2159AlbRecPie)==0) && ( AV57SumPza == 1 ) && true /* Level */ && true /* After */ )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         new app.pultpza(remoteHandle, context).execute( GXv_char14, GXv_int8, GXv_char4) ;
         talbdet_impl.this.A396EmprCod = GXv_char14[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbdet_impl.this.A44AlbRecCod = GXv_int8[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         talbdet_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         A2159AlbRecPie = this.A2159AlbRecPie ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", GXutil.rtrim( A2159AlbRecPie));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV113EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV114AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV116TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV113EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV114AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'AV46Modo',fld:'vMODO',pic:''},{av:'A4606AlbRHEn',fld:'ALBRHEN',pic:'99/99/99 99:99'},{av:'A59AlbRUniReb',fld:'ALBRUNIREB',pic:'ZZZZZ9.99'},{av:'A7501AlbRecSec',fld:'ALBRECSEC',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("AFTER TRN","{handler:'e127C2',iparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV116TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("'DONUMERARPIEZAS'","{handler:'e137C2',iparms:[{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("'DONUMERARPIEZAS'",",oparms:[{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2152AlbDetPie',fld:'ALBDETPIE',pic:'ZZZ9'},{av:'A2149AlbDetMtr',fld:'ALBDETMTR',pic:'ZZZZZ9.99'},{av:'A2151AlbDetMtrU',fld:'ALBDETMTRU',pic:'ZZZZZ9.99'},{av:'A2146AlbDetKgm',fld:'ALBDETKGM',pic:'ZZZZZ9.99'},{av:'A2148AlbDetKgmU',fld:'ALBDETKGMU',pic:'ZZZZZ9.99'},{av:'A10758SumKgs',fld:'SUMKGS',pic:'ZZZZZ9.99'},{av:'A10759SumMts',fld:'SUMMTS',pic:'ZZZZZ9.99'},{av:'A10760SumPzs',fld:'SUMPZS',pic:'ZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A2150AlbDetMtrD',fld:'ALBDETMTRD',pic:'ZZZZZ9.99'},{av:'A2147AlbDetKgmD',fld:'ALBDETKGMD',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A2152AlbDetPie',fld:'ALBDETPIE',pic:'ZZZ9'},{av:'A2149AlbDetMtr',fld:'ALBDETMTR',pic:'ZZZZZ9.99'},{av:'A2146AlbDetKgm',fld:'ALBDETKGM',pic:'ZZZZZ9.99'},{av:'A2151AlbDetMtrU',fld:'ALBDETMTRU',pic:'ZZZZZ9.99'},{av:'A2148AlbDetKgmU',fld:'ALBDETKGMU',pic:'ZZZZZ9.99'},{av:'A10758SumKgs',fld:'SUMKGS',pic:'ZZZZZ9.99'},{av:'A10759SumMts',fld:'SUMMTS',pic:'ZZZZZ9.99'},{av:'A10760SumPzs',fld:'SUMPZS',pic:'ZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A2150AlbDetMtrD',fld:'ALBDETMTRD',pic:'ZZZZZ9.99'},{av:'A2147AlbDetKgmD',fld:'ALBDETKGMD',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRENT","{handler:'valid_Albrent',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRENT",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRENT2","{handler:'valid_Albrent2',iparms:[{av:'O5806AlbREnt2'},{av:'A5806AlbREnt2',fld:'ALBRENT2',pic:''},{av:'AV88Enc20c',fld:'vENC20C',pic:'9'},{av:'AV99Termilenio',fld:'vTERMILENIO',pic:'9'},{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'AV92OldAlb2',fld:'vOLDALB2',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRENT2",",oparms:[{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'AV92OldAlb2',fld:'vOLDALB2',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[{av:'AV78SiArt',fld:'vSIART',pic:'9'},{av:'AV60FlagArt',fld:'vFLAGART',pic:'9'},{av:'AV58Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV59Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV109Anc',fld:'vANC',pic:'ZZZ9'},{av:'AV110grm2',fld:'vGRM2',pic:'ZZZ9'},{av:'AV77ErrArt',fld:'vERRART',pic:'9'},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'AV98artblo',fld:'vARTBLO',pic:'@!'},{av:'AV81Flag',fld:'vFLAG',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBREF",",oparms:[{av:'AV60FlagArt',fld:'vFLAGART',pic:'9'},{av:'AV58Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV59Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV109Anc',fld:'vANC',pic:'ZZZ9'},{av:'AV110grm2',fld:'vGRM2',pic:'ZZZ9'},{av:'AV77ErrArt',fld:'vERRART',pic:'9'},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'AV98artblo',fld:'vARTBLO',pic:'@!'},{av:'AV81Flag',fld:'vFLAG',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[{av:'A971ProceNom',fld:'PROCENOM',pic:''},{av:'AV76ErrP',fld:'vERRP',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_PROCECOD",",oparms:[{av:'A971ProceNom',fld:'PROCENOM',pic:''},{av:'AV76ErrP',fld:'vERRP',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_TIPENTCOD","{handler:'valid_Tipentcod',iparms:[{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_TIPENTCOD",",oparms:[{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A2149AlbDetMtr',fld:'ALBDETMTR',pic:'ZZZZZ9.99'},{av:'A2146AlbDetKgm',fld:'ALBDETKGM',pic:'ZZZZZ9.99'},{av:'A2151AlbDetMtrU',fld:'ALBDETMTRU',pic:'ZZZZZ9.99'},{av:'A2148AlbDetKgmU',fld:'ALBDETKGMU',pic:'ZZZZZ9.99'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A2147AlbDetKgmD',fld:'ALBDETKGMD',pic:'ZZZZZ9.99'},{av:'A2150AlbDetMtrD',fld:'ALBDETMTRD',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2153AlbDetPieU',fld:'ALBDETPIEU',pic:'ZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV18AlbCum',fld:'vALBCUM',pic:''},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV18AlbCum',fld:'vALBCUM',pic:''},{av:'A2153AlbDetPieU',fld:'ALBDETPIEU',pic:'ZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBREST","{handler:'valid_Albrest',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBREST",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRLOC","{handler:'valid_Albrloc',iparms:[{av:'AV108ValorUbica',fld:'vVALORUBICA',pic:'9'},{av:'AV105UbicaL',fld:'vUBICAL',pic:'9'},{av:'A50AlbRLoc',fld:'ALBRLOC',pic:''},{av:'AV106Msg_Ubica',fld:'vMSG_UBICA',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRLOC",",oparms:[{av:'A50AlbRLoc',fld:'ALBRLOC',pic:''},{av:'AV106Msg_Ubica',fld:'vMSG_UBICA',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRREO","{handler:'valid_Albrreo',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRREO",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRANC","{handler:'valid_Albranc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRANC",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBDETPIE","{handler:'valid_Albdetpie',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBDETPIE",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBDETMTR","{handler:'valid_Albdetmtr',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBDETMTR",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBDETKGM","{handler:'valid_Albdetkgm',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBDETKGM",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBDETMTRU","{handler:'valid_Albdetmtru',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBDETMTRU",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBDETKGMU","{handler:'valid_Albdetkgmu',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBDETKGMU",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBDETMTRD","{handler:'valid_Albdetmtrd',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBDETMTRD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBDETKGMD","{handler:'valid_Albdetkgmd',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBDETKGMD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBDETPIEU","{handler:'valid_Albdetpieu',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBDETPIEU",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBULTP","{handler:'valid_Albultp',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBULTP",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBREFDSC","{handler:'valid_Albrefdsc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBREFDSC",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECPIE","{handler:'valid_Albrecpie',iparms:[{av:'AV82Noctrlpz',fld:'vNOCTRLPZ',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'AV90PzaProd',fld:'vPZAPROD',pic:'9'},{av:'A4806AlRPieDefC',fld:'ALRPIEDEFC',pic:'ZZZZZ9'},{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'AV54PieUti',fld:'vPIEUTI',pic:''},{av:'AV71Msg_err',fld:'vMSG_ERR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECPIE",",oparms:[{av:'A4806AlRPieDefC',fld:'ALRPIEDEFC',pic:'ZZZZZ9'},{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'AV90PzaProd',fld:'vPZAPROD',pic:'9'},{av:'AV54PieUti',fld:'vPIEUTI',pic:''},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'AV71Msg_err',fld:'vMSG_ERR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECMTR","{handler:'valid_Albrecmtr',iparms:[{av:'AV61CalMKT',fld:'vCALMKT',pic:'9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'AV60FlagArt',fld:'vFLAGART',pic:'9'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O2157AlbRecMtr'},{av:'O10759SumMts'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A4806AlRPieDefC',fld:'ALRPIEDEFC',pic:'ZZZZZ9'},{av:'A4797AlRPieClaC',fld:'ALRPIECLAC',pic:''},{av:'AV58Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV59Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV109Anc',fld:'vANC',pic:'ZZZ9'},{av:'AV110grm2',fld:'vGRM2',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECMTR",",oparms:[{av:'A4797AlRPieClaC',fld:'ALRPIECLAC',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'AV58Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV59Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV109Anc',fld:'vANC',pic:'ZZZ9'},{av:'AV110grm2',fld:'vGRM2',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECKGM","{handler:'valid_Albreckgm',iparms:[{av:'AV57SumPza',fld:'vSUMPZA',pic:'9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O2155AlbRecKgm'},{av:'O10758SumKgs'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECKGM",",oparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECMTRU","{handler:'valid_Albrecmtru',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECMTRU",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECKGMU","{handler:'valid_Albreckgmu',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECKGMU",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBPCONT","{handler:'valid_Albpcont',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBPCONT",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynCliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'dynAlbRef'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'dynProceCod'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'dynTrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'dynTipEntCod'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'}]}");
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
      pr_default.close(51);
      pr_default.close(64);
      pr_default.close(23);
      pr_default.close(66);
      pr_default.close(24);
      pr_default.close(65);
      pr_default.close(25);
      pr_default.close(67);
      pr_default.close(26);
      pr_default.close(63);
      pr_default.close(27);
   }

   /* Aggregate/select formulas */
   public int getAlbDetPieU1( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor T007C78 */
      pr_default.execute(68, new Object[] {E396EmprCod, Boolean.valueOf(nA44AlbRecCod), Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(68) != 101) )
      {
         Gx_cnt = T007C78_Gx_cnt[0] ;
      }
      pr_default.close(68);
      return Gx_cnt ;
   }

   public int getAlbDetPieU0( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor T007C79 */
      pr_default.execute(69, new Object[] {E396EmprCod, Boolean.valueOf(nE44AlbRecCod), Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(69) != 101) )
      {
         Gx_cnt = T007C79_Gx_cnt[0] ;
      }
      pr_default.close(69);
      return Gx_cnt ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV113EmprCod = "" ;
      Z396EmprCod = "" ;
      Z5806AlbREnt2 = "" ;
      Z46AlbREnt = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z56AlbRUni = "" ;
      Z3613AlbRefDsc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      Z45AlbRef = "" ;
      Z1291AlbRDes = "" ;
      Z50AlbRLoc = "" ;
      Z55AlbRReo = "" ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      Z6463AlbRLote = "" ;
      Z13241AlbRPh = DecimalUtil.ZERO ;
      Z13242AlbRRLong = DecimalUtil.ZERO ;
      Z13243AlbRRTrans = DecimalUtil.ZERO ;
      Z8029AlbNumM = "" ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      O10758SumKgs = DecimalUtil.ZERO ;
      O10759SumMts = DecimalUtil.ZERO ;
      O5806AlbREnt2 = "" ;
      Z2159AlbRecPie = "" ;
      Z4795AlRPieCal = "" ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2158AlbRecMtrU = DecimalUtil.ZERO ;
      Z2156AlbRecKgmU = DecimalUtil.ZERO ;
      Z8779Bod_Talla = "" ;
      Z3731AlbRecIdPz = "" ;
      Z4410AlbRecPal = DecimalUtil.ZERO ;
      Z10180AlRPieTelT = "" ;
      Z10181AlRPieOri = "" ;
      Z10182AlRPieDst = "" ;
      Z10183AlrPieKgmT = DecimalUtil.ZERO ;
      Z7408ALRPIELOC = "" ;
      O2155AlbRecKgm = DecimalUtil.ZERO ;
      O2157AlbRecMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A45AlbRef = "" ;
      AV124Pgmname = "" ;
      AV17UsurCod = "" ;
      AV38Station = "" ;
      AV93Inc_obs = "" ;
      A5806AlbREnt2 = "" ;
      AV92OldAlb2 = "" ;
      A50AlbRLoc = "" ;
      AV106Msg_Ubica = "" ;
      A2159AlbRecPie = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      AV113EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A2147AlbDetKgmD = DecimalUtil.ZERO ;
      A2150AlbDetMtrD = DecimalUtil.ZERO ;
      A2146AlbDetKgm = DecimalUtil.ZERO ;
      A2148AlbDetKgmU = DecimalUtil.ZERO ;
      A2149AlbDetMtr = DecimalUtil.ZERO ;
      A2151AlbDetMtrU = DecimalUtil.ZERO ;
      A55AlbRReo = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A46AlbREnt = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A1291AlbRDes = "" ;
      sStyleString = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A6180AlbrUniC = DecimalUtil.ZERO ;
      A8029AlbNumM = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      A6463AlbRLote = "" ;
      A13241AlbRPh = DecimalUtil.ZERO ;
      A13242AlbRRLong = DecimalUtil.ZERO ;
      A13243AlbRRTrans = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnnumerarpiezas_Jsonclick = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A407EmprNom = "" ;
      A10758SumKgs = DecimalUtil.ZERO ;
      A10759SumMts = DecimalUtil.ZERO ;
      A3613AlbRefDsc = "" ;
      Gridlevel_piezasContainer = new com.genexus.webpanels.GXWebGrid(context);
      B10758SumKgs = DecimalUtil.ZERO ;
      B10759SumMts = DecimalUtil.ZERO ;
      B5806AlbREnt2 = "" ;
      sMode299 = "" ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      A59AlbRUniReb = DecimalUtil.ZERO ;
      AV46Modo = "" ;
      AV18AlbCum = "" ;
      A279CliNom = "" ;
      AV58Rdto = DecimalUtil.ZERO ;
      AV98artblo = "" ;
      A841TrnNom = "" ;
      A971ProceNom = "" ;
      A1212TipEntNom = "" ;
      A4795AlRPieCal = "" ;
      AV54PieUti = "" ;
      AV71Msg_err = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode7 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s10758SumKgs = DecimalUtil.ZERO ;
      s10759SumMts = DecimalUtil.ZERO ;
      sV93Inc_obs = "" ;
      OV93Inc_obs = "" ;
      s2147AlbDetKgmD = DecimalUtil.ZERO ;
      O2147AlbDetKgmD = DecimalUtil.ZERO ;
      s2150AlbDetMtrD = DecimalUtil.ZERO ;
      O2150AlbDetMtrD = DecimalUtil.ZERO ;
      s58AlbRUniEnt = DecimalUtil.ZERO ;
      O58AlbRUniEnt = DecimalUtil.ZERO ;
      s60AlbRUniUti = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      sV18AlbCum = "" ;
      OV18AlbCum = "" ;
      GXCCtl = "" ;
      A7408ALRPIELOC = "" ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A4797AlRPieClaC = "" ;
      A8779Bod_Talla = "" ;
      A3731AlbRecIdPz = "" ;
      A4410AlbRecPal = DecimalUtil.ZERO ;
      A10180AlRPieTelT = "" ;
      A10181AlRPieOri = "" ;
      A10182AlRPieDst = "" ;
      A10183AlrPieKgmT = DecimalUtil.ZERO ;
      T2155AlbRecKgm = DecimalUtil.ZERO ;
      T2157AlbRecMtr = DecimalUtil.ZERO ;
      T007C7_A2152AlbDetPie = new short[1] ;
      T007C7_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C7_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C7_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C7_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C7_A10758SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C7_A10759SumMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C7_A10760SumPzs = new short[1] ;
      AV16EmprNom = "" ;
      AV115WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV116TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV117WebSession = httpContext.getWebSession();
      AV122TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z2149AlbDetMtr = DecimalUtil.ZERO ;
      Z2146AlbDetKgm = DecimalUtil.ZERO ;
      Z2151AlbDetMtrU = DecimalUtil.ZERO ;
      Z2148AlbDetKgmU = DecimalUtil.ZERO ;
      Z10758SumKgs = DecimalUtil.ZERO ;
      Z10759SumMts = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      Z971ProceNom = "" ;
      Z841TrnNom = "" ;
      Z1212TipEntNom = "" ;
      T007C10_A407EmprNom = new String[] {""} ;
      T007C10_n407EmprNom = new boolean[] {false} ;
      T007C11_A279CliNom = new String[] {""} ;
      T007C13_A971ProceNom = new String[] {""} ;
      T007C13_n971ProceNom = new boolean[] {false} ;
      T007C12_A841TrnNom = new String[] {""} ;
      T007C12_n841TrnNom = new boolean[] {false} ;
      T007C14_A1212TipEntNom = new String[] {""} ;
      T007C14_n1212TipEntNom = new boolean[] {false} ;
      T007C16_A44AlbRecCod = new int[1] ;
      T007C16_n44AlbRecCod = new boolean[] {false} ;
      T007C16_A5806AlbREnt2 = new String[] {""} ;
      T007C16_A46AlbREnt = new String[] {""} ;
      T007C16_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C16_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C16_A52AlbRPieEnt = new int[1] ;
      T007C16_A54AlbRPieUti = new int[1] ;
      T007C16_A47AlbREst = new byte[1] ;
      T007C16_A56AlbRUni = new String[] {""} ;
      T007C16_A3613AlbRefDsc = new String[] {""} ;
      T007C16_A407EmprNom = new String[] {""} ;
      T007C16_n407EmprNom = new boolean[] {false} ;
      T007C16_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T007C16_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T007C16_n4606AlbRHEn = new boolean[] {false} ;
      T007C16_A279CliNom = new String[] {""} ;
      T007C16_A45AlbRef = new String[] {""} ;
      T007C16_A971ProceNom = new String[] {""} ;
      T007C16_n971ProceNom = new boolean[] {false} ;
      T007C16_A841TrnNom = new String[] {""} ;
      T007C16_n841TrnNom = new boolean[] {false} ;
      T007C16_A1212TipEntNom = new String[] {""} ;
      T007C16_n1212TipEntNom = new boolean[] {false} ;
      T007C16_A1291AlbRDes = new String[] {""} ;
      T007C16_A50AlbRLoc = new String[] {""} ;
      T007C16_A55AlbRReo = new String[] {""} ;
      T007C16_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T007C16_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C16_A6181AlbrPieC = new int[1] ;
      T007C16_A4920AlbRGrm2 = new short[1] ;
      T007C16_A4921AlbRAnc = new short[1] ;
      T007C16_A4922AlbPml = new short[1] ;
      T007C16_A6463AlbRLote = new String[] {""} ;
      T007C16_A13241AlbRPh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C16_n13241AlbRPh = new boolean[] {false} ;
      T007C16_A13242AlbRRLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C16_n13242AlbRRLong = new boolean[] {false} ;
      T007C16_A13243AlbRRTrans = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C16_n13243AlbRRTrans = new boolean[] {false} ;
      T007C16_A8029AlbNumM = new String[] {""} ;
      T007C16_A53AlbRPieReb = new int[1] ;
      T007C16_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C16_A10761AlbUltP = new short[1] ;
      T007C16_n10761AlbUltP = new boolean[] {false} ;
      T007C16_A7501AlbRecSec = new short[1] ;
      T007C16_n7501AlbRecSec = new boolean[] {false} ;
      T007C16_A1222AlbNumEti = new short[1] ;
      T007C16_A396EmprCod = new String[] {""} ;
      T007C16_A252CliCod = new int[1] ;
      T007C16_A840TrnCod = new short[1] ;
      T007C16_n840TrnCod = new boolean[] {false} ;
      T007C16_A970ProceCod = new short[1] ;
      T007C16_n970ProceCod = new boolean[] {false} ;
      T007C16_A1211TipEntCod = new short[1] ;
      T007C16_n1211TipEntCod = new boolean[] {false} ;
      T007C16_A2152AlbDetPie = new short[1] ;
      T007C16_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C16_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C16_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C16_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C16_A10758SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C16_A10759SumMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C16_A10760SumPzs = new short[1] ;
      T007C17_A279CliNom = new String[] {""} ;
      T007C18_A841TrnNom = new String[] {""} ;
      T007C18_n841TrnNom = new boolean[] {false} ;
      T007C19_A971ProceNom = new String[] {""} ;
      T007C19_n971ProceNom = new boolean[] {false} ;
      T007C20_A1212TipEntNom = new String[] {""} ;
      T007C20_n1212TipEntNom = new boolean[] {false} ;
      T007C22_A2152AlbDetPie = new short[1] ;
      T007C22_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C22_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C22_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C22_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C22_A10758SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C22_A10759SumMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C22_A10760SumPzs = new short[1] ;
      T007C23_A396EmprCod = new String[] {""} ;
      T007C23_A44AlbRecCod = new int[1] ;
      T007C23_n44AlbRecCod = new boolean[] {false} ;
      T007C9_A44AlbRecCod = new int[1] ;
      T007C9_n44AlbRecCod = new boolean[] {false} ;
      T007C9_A5806AlbREnt2 = new String[] {""} ;
      T007C9_A46AlbREnt = new String[] {""} ;
      T007C9_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C9_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C9_A52AlbRPieEnt = new int[1] ;
      T007C9_A54AlbRPieUti = new int[1] ;
      T007C9_A47AlbREst = new byte[1] ;
      T007C9_A56AlbRUni = new String[] {""} ;
      T007C9_A3613AlbRefDsc = new String[] {""} ;
      T007C9_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T007C9_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T007C9_n4606AlbRHEn = new boolean[] {false} ;
      T007C9_A45AlbRef = new String[] {""} ;
      T007C9_A1291AlbRDes = new String[] {""} ;
      T007C9_A50AlbRLoc = new String[] {""} ;
      T007C9_A55AlbRReo = new String[] {""} ;
      T007C9_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T007C9_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C9_A6181AlbrPieC = new int[1] ;
      T007C9_A4920AlbRGrm2 = new short[1] ;
      T007C9_A4921AlbRAnc = new short[1] ;
      T007C9_A4922AlbPml = new short[1] ;
      T007C9_A6463AlbRLote = new String[] {""} ;
      T007C9_A13241AlbRPh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C9_n13241AlbRPh = new boolean[] {false} ;
      T007C9_A13242AlbRRLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C9_n13242AlbRRLong = new boolean[] {false} ;
      T007C9_A13243AlbRRTrans = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C9_n13243AlbRRTrans = new boolean[] {false} ;
      T007C9_A8029AlbNumM = new String[] {""} ;
      T007C9_A53AlbRPieReb = new int[1] ;
      T007C9_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C9_A10761AlbUltP = new short[1] ;
      T007C9_n10761AlbUltP = new boolean[] {false} ;
      T007C9_A7501AlbRecSec = new short[1] ;
      T007C9_n7501AlbRecSec = new boolean[] {false} ;
      T007C9_A1222AlbNumEti = new short[1] ;
      T007C9_A396EmprCod = new String[] {""} ;
      T007C9_A252CliCod = new int[1] ;
      T007C9_A840TrnCod = new short[1] ;
      T007C9_n840TrnCod = new boolean[] {false} ;
      T007C9_A970ProceCod = new short[1] ;
      T007C9_n970ProceCod = new boolean[] {false} ;
      T007C9_A1211TipEntCod = new short[1] ;
      T007C9_n1211TipEntCod = new boolean[] {false} ;
      T007C24_A396EmprCod = new String[] {""} ;
      T007C24_A44AlbRecCod = new int[1] ;
      T007C24_n44AlbRecCod = new boolean[] {false} ;
      T007C25_A396EmprCod = new String[] {""} ;
      T007C25_A44AlbRecCod = new int[1] ;
      T007C25_n44AlbRecCod = new boolean[] {false} ;
      T007C8_A44AlbRecCod = new int[1] ;
      T007C8_n44AlbRecCod = new boolean[] {false} ;
      T007C8_A5806AlbREnt2 = new String[] {""} ;
      T007C8_A46AlbREnt = new String[] {""} ;
      T007C8_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C8_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C8_A52AlbRPieEnt = new int[1] ;
      T007C8_A54AlbRPieUti = new int[1] ;
      T007C8_A47AlbREst = new byte[1] ;
      T007C8_A56AlbRUni = new String[] {""} ;
      T007C8_A3613AlbRefDsc = new String[] {""} ;
      T007C8_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T007C8_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T007C8_n4606AlbRHEn = new boolean[] {false} ;
      T007C8_A45AlbRef = new String[] {""} ;
      T007C8_A1291AlbRDes = new String[] {""} ;
      T007C8_A50AlbRLoc = new String[] {""} ;
      T007C8_A55AlbRReo = new String[] {""} ;
      T007C8_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T007C8_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C8_A6181AlbrPieC = new int[1] ;
      T007C8_A4920AlbRGrm2 = new short[1] ;
      T007C8_A4921AlbRAnc = new short[1] ;
      T007C8_A4922AlbPml = new short[1] ;
      T007C8_A6463AlbRLote = new String[] {""} ;
      T007C8_A13241AlbRPh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C8_n13241AlbRPh = new boolean[] {false} ;
      T007C8_A13242AlbRRLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C8_n13242AlbRRLong = new boolean[] {false} ;
      T007C8_A13243AlbRRTrans = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C8_n13243AlbRRTrans = new boolean[] {false} ;
      T007C8_A8029AlbNumM = new String[] {""} ;
      T007C8_A53AlbRPieReb = new int[1] ;
      T007C8_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C8_A10761AlbUltP = new short[1] ;
      T007C8_n10761AlbUltP = new boolean[] {false} ;
      T007C8_A7501AlbRecSec = new short[1] ;
      T007C8_n7501AlbRecSec = new boolean[] {false} ;
      T007C8_A1222AlbNumEti = new short[1] ;
      T007C8_A396EmprCod = new String[] {""} ;
      T007C8_A252CliCod = new int[1] ;
      T007C8_A840TrnCod = new short[1] ;
      T007C8_n840TrnCod = new boolean[] {false} ;
      T007C8_A970ProceCod = new short[1] ;
      T007C8_n970ProceCod = new boolean[] {false} ;
      T007C8_A1211TipEntCod = new short[1] ;
      T007C8_n1211TipEntCod = new boolean[] {false} ;
      T007C29_A279CliNom = new String[] {""} ;
      T007C30_A841TrnNom = new String[] {""} ;
      T007C30_n841TrnNom = new boolean[] {false} ;
      T007C31_A971ProceNom = new String[] {""} ;
      T007C31_n971ProceNom = new boolean[] {false} ;
      T007C32_A1212TipEntNom = new String[] {""} ;
      T007C32_n1212TipEntNom = new boolean[] {false} ;
      T007C34_A2152AlbDetPie = new short[1] ;
      T007C34_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C34_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C34_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C34_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C34_A10758SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C34_A10759SumMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C34_A10760SumPzs = new short[1] ;
      T007C35_A396EmprCod = new String[] {""} ;
      T007C35_A13026PedDGId = new int[1] ;
      T007C35_A44AlbRecCod = new int[1] ;
      T007C35_n44AlbRecCod = new boolean[] {false} ;
      T007C36_A396EmprCod = new String[] {""} ;
      T007C36_A11669DevCruId = new int[1] ;
      T007C36_A44AlbRecCod = new int[1] ;
      T007C36_n44AlbRecCod = new boolean[] {false} ;
      T007C37_A396EmprCod = new String[] {""} ;
      T007C37_A44AlbRecCod = new int[1] ;
      T007C37_n44AlbRecCod = new boolean[] {false} ;
      T007C37_A9743Emp_CUb = new String[] {""} ;
      T007C37_A5860Emp_Anp = new short[1] ;
      T007C38_A396EmprCod = new String[] {""} ;
      T007C38_A44AlbRecCod = new int[1] ;
      T007C38_n44AlbRecCod = new boolean[] {false} ;
      T007C38_A7130MatC_Pz = new String[] {""} ;
      T007C39_A396EmprCod = new String[] {""} ;
      T007C39_A44AlbRecCod = new int[1] ;
      T007C39_n44AlbRecCod = new boolean[] {false} ;
      T007C39_A7132MatC_Talla = new String[] {""} ;
      T007C40_A396EmprCod = new String[] {""} ;
      T007C40_A44AlbRecCod = new int[1] ;
      T007C40_n44AlbRecCod = new boolean[] {false} ;
      T007C40_A7115MatC_Lin = new short[1] ;
      T007C41_A396EmprCod = new String[] {""} ;
      T007C41_A30AlbProCod = new long[1] ;
      T007C41_A129BarCod = new int[1] ;
      T007C41_A132BarCodReo = new byte[1] ;
      T007C41_A130BarCodPar = new String[] {""} ;
      T007C41_A6622AlbHdRLn = new short[1] ;
      T007C42_A396EmprCod = new String[] {""} ;
      T007C42_A6235DevEmpCod = new int[1] ;
      T007C42_A6243DevNumLin = new byte[1] ;
      T007C43_A396EmprCod = new String[] {""} ;
      T007C43_A44AlbRecCod = new int[1] ;
      T007C43_n44AlbRecCod = new boolean[] {false} ;
      T007C43_A4596AlbRDefCod = new short[1] ;
      T007C44_A396EmprCod = new String[] {""} ;
      T007C44_A44AlbRecCod = new int[1] ;
      T007C44_n44AlbRecCod = new boolean[] {false} ;
      T007C44_A2159AlbRecPie = new String[] {""} ;
      T007C44_A4395AlRDefCod = new short[1] ;
      T007C44_A4412AlRFasCod = new String[] {""} ;
      T007C45_A396EmprCod = new String[] {""} ;
      T007C45_A44AlbRecCod = new int[1] ;
      T007C45_n44AlbRecCod = new boolean[] {false} ;
      T007C45_A2165HisEmpLin = new short[1] ;
      T007C46_A396EmprCod = new String[] {""} ;
      T007C46_A44AlbRecCod = new int[1] ;
      T007C46_n44AlbRecCod = new boolean[] {false} ;
      T007C46_A1299AlbRLin = new byte[1] ;
      T007C47_A396EmprCod = new String[] {""} ;
      T007C47_A361DisCod = new int[1] ;
      T007C47_A44AlbRecCod = new int[1] ;
      T007C47_n44AlbRecCod = new boolean[] {false} ;
      T007C48_A396EmprCod = new String[] {""} ;
      T007C48_A323DevGenCod = new int[1] ;
      T007C49_A396EmprCod = new String[] {""} ;
      T007C49_A129BarCod = new int[1] ;
      T007C49_A132BarCodReo = new byte[1] ;
      T007C49_A130BarCodPar = new String[] {""} ;
      T007C49_A200BarPieCod = new String[] {""} ;
      T007C51_A396EmprCod = new String[] {""} ;
      T007C51_A44AlbRecCod = new int[1] ;
      T007C51_n44AlbRecCod = new boolean[] {false} ;
      T007C52_A4795AlRPieCal = new String[] {""} ;
      T007C52_A44AlbRecCod = new int[1] ;
      T007C52_n44AlbRecCod = new boolean[] {false} ;
      T007C52_A2159AlbRecPie = new String[] {""} ;
      T007C52_A2154AlbRecAnh = new short[1] ;
      T007C52_A10762AlbPCont = new short[1] ;
      T007C52_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C52_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C52_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C52_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C52_A8779Bod_Talla = new String[] {""} ;
      T007C52_A8780Bod_Und = new short[1] ;
      T007C52_A3730AlbRecCol = new short[1] ;
      T007C52_A3731AlbRecIdPz = new String[] {""} ;
      T007C52_A3732AlbRecIdRc = new int[1] ;
      T007C52_A4410AlbRecPal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C52_A10180AlRPieTelT = new String[] {""} ;
      T007C52_A10149AlRPieCon = new int[1] ;
      T007C52_A10181AlRPieOri = new String[] {""} ;
      T007C52_A10182AlRPieDst = new String[] {""} ;
      T007C52_A10183AlrPieKgmT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C52_A7408ALRPIELOC = new String[] {""} ;
      T007C52_A396EmprCod = new String[] {""} ;
      T007C5_A4806AlRPieDefC = new int[1] ;
      T007C5_n4806AlRPieDefC = new boolean[] {false} ;
      T007C54_A4806AlRPieDefC = new int[1] ;
      T007C54_n4806AlRPieDefC = new boolean[] {false} ;
      T007C55_A396EmprCod = new String[] {""} ;
      T007C55_A44AlbRecCod = new int[1] ;
      T007C55_n44AlbRecCod = new boolean[] {false} ;
      T007C55_A2159AlbRecPie = new String[] {""} ;
      T007C3_A4795AlRPieCal = new String[] {""} ;
      T007C3_A44AlbRecCod = new int[1] ;
      T007C3_n44AlbRecCod = new boolean[] {false} ;
      T007C3_A2159AlbRecPie = new String[] {""} ;
      T007C3_A2154AlbRecAnh = new short[1] ;
      T007C3_A10762AlbPCont = new short[1] ;
      T007C3_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C3_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C3_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C3_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C3_A8779Bod_Talla = new String[] {""} ;
      T007C3_A8780Bod_Und = new short[1] ;
      T007C3_A3730AlbRecCol = new short[1] ;
      T007C3_A3731AlbRecIdPz = new String[] {""} ;
      T007C3_A3732AlbRecIdRc = new int[1] ;
      T007C3_A4410AlbRecPal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C3_A10180AlRPieTelT = new String[] {""} ;
      T007C3_A10149AlRPieCon = new int[1] ;
      T007C3_A10181AlRPieOri = new String[] {""} ;
      T007C3_A10182AlRPieDst = new String[] {""} ;
      T007C3_A10183AlrPieKgmT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C3_A7408ALRPIELOC = new String[] {""} ;
      T007C3_A396EmprCod = new String[] {""} ;
      T007C2_A4795AlRPieCal = new String[] {""} ;
      T007C2_A44AlbRecCod = new int[1] ;
      T007C2_n44AlbRecCod = new boolean[] {false} ;
      T007C2_A2159AlbRecPie = new String[] {""} ;
      T007C2_A2154AlbRecAnh = new short[1] ;
      T007C2_A10762AlbPCont = new short[1] ;
      T007C2_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C2_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C2_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C2_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C2_A8779Bod_Talla = new String[] {""} ;
      T007C2_A8780Bod_Und = new short[1] ;
      T007C2_A3730AlbRecCol = new short[1] ;
      T007C2_A3731AlbRecIdPz = new String[] {""} ;
      T007C2_A3732AlbRecIdRc = new int[1] ;
      T007C2_A4410AlbRecPal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C2_A10180AlRPieTelT = new String[] {""} ;
      T007C2_A10149AlRPieCon = new int[1] ;
      T007C2_A10181AlRPieOri = new String[] {""} ;
      T007C2_A10182AlRPieDst = new String[] {""} ;
      T007C2_A10183AlrPieKgmT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C2_A7408ALRPIELOC = new String[] {""} ;
      T007C2_A396EmprCod = new String[] {""} ;
      T007C60_A4806AlRPieDefC = new int[1] ;
      T007C60_n4806AlRPieDefC = new boolean[] {false} ;
      T007C61_A396EmprCod = new String[] {""} ;
      T007C61_A44AlbRecCod = new int[1] ;
      T007C61_n44AlbRecCod = new boolean[] {false} ;
      T007C61_A2159AlbRecPie = new String[] {""} ;
      T007C61_A10188AlRFibOrd = new int[1] ;
      T007C62_A396EmprCod = new String[] {""} ;
      T007C62_A44AlbRecCod = new int[1] ;
      T007C62_n44AlbRecCod = new boolean[] {false} ;
      T007C62_A2159AlbRecPie = new String[] {""} ;
      T007C62_A9568CodHilz = new String[] {""} ;
      T007C63_A396EmprCod = new String[] {""} ;
      T007C63_A44AlbRecCod = new int[1] ;
      T007C63_n44AlbRecCod = new boolean[] {false} ;
      T007C63_A2159AlbRecPie = new String[] {""} ;
      T007C63_A7697AlREtiTpo = new byte[1] ;
      T007C64_A396EmprCod = new String[] {""} ;
      T007C64_A44AlbRecCod = new int[1] ;
      T007C64_n44AlbRecCod = new boolean[] {false} ;
      T007C64_A2159AlbRecPie = new String[] {""} ;
      T007C64_A5262AlbRecEvt = new short[1] ;
      T007C65_A396EmprCod = new String[] {""} ;
      T007C65_A44AlbRecCod = new int[1] ;
      T007C65_n44AlbRecCod = new boolean[] {false} ;
      T007C65_A2159AlbRecPie = new String[] {""} ;
      T007C65_A4395AlRDefCod = new short[1] ;
      T007C65_A4412AlRFasCod = new String[] {""} ;
      T007C66_A396EmprCod = new String[] {""} ;
      T007C66_A44AlbRecCod = new int[1] ;
      T007C66_n44AlbRecCod = new boolean[] {false} ;
      T007C66_A2159AlbRecPie = new String[] {""} ;
      Gridlevel_piezasRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_piezas_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV46Modo = "" ;
      i56AlbRUni = "" ;
      i49AlbRFen = GXutil.nullDate() ;
      i55AlbRReo = "" ;
      i48AlbRFecUlt = GXutil.nullDate() ;
      i4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      Gridlevel_piezasColumn = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T007C67_A396EmprCod = new String[] {""} ;
      T007C67_A252CliCod = new int[1] ;
      T007C67_A279CliNom = new String[] {""} ;
      T007C68_A396EmprCod = new String[] {""} ;
      T007C68_A252CliCod = new int[1] ;
      T007C68_A65ArtCod = new String[] {""} ;
      T007C68_A69ArtDsc = new String[] {""} ;
      T007C68_n69ArtDsc = new boolean[] {false} ;
      T007C68_A829TipArtCod = new short[1] ;
      T007C69_A396EmprCod = new String[] {""} ;
      T007C69_A970ProceCod = new short[1] ;
      T007C69_n970ProceCod = new boolean[] {false} ;
      T007C69_A971ProceNom = new String[] {""} ;
      T007C69_n971ProceNom = new boolean[] {false} ;
      T007C70_A396EmprCod = new String[] {""} ;
      T007C70_A840TrnCod = new short[1] ;
      T007C70_n840TrnCod = new boolean[] {false} ;
      T007C70_A841TrnNom = new String[] {""} ;
      T007C70_n841TrnNom = new boolean[] {false} ;
      T007C71_A396EmprCod = new String[] {""} ;
      T007C71_A1211TipEntCod = new short[1] ;
      T007C71_n1211TipEntCod = new boolean[] {false} ;
      T007C71_A1212TipEntNom = new String[] {""} ;
      T007C71_n1212TipEntNom = new boolean[] {false} ;
      T007C73_A2152AlbDetPie = new short[1] ;
      T007C73_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C73_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C73_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C73_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C73_A10758SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C73_A10759SumMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007C73_A10760SumPzs = new short[1] ;
      Z2150AlbDetMtrD = DecimalUtil.ZERO ;
      Z2147AlbDetKgmD = DecimalUtil.ZERO ;
      ZV92OldAlb2 = "" ;
      T007C74_A279CliNom = new String[] {""} ;
      GXv_char2 = new String[1] ;
      ZV58Rdto = DecimalUtil.ZERO ;
      ZV98artblo = "" ;
      T007C75_A971ProceNom = new String[] {""} ;
      T007C75_n971ProceNom = new boolean[] {false} ;
      T007C76_A841TrnNom = new String[] {""} ;
      T007C76_n841TrnNom = new boolean[] {false} ;
      T007C77_A1212TipEntNom = new String[] {""} ;
      T007C77_n1212TipEntNom = new boolean[] {false} ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZV18AlbCum = "" ;
      ZV106Msg_Ubica = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      ZV54PieUti = "" ;
      ZV71Msg_err = "" ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int13 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_int11 = new short[1] ;
      Z4797AlRPieClaC = "" ;
      GXv_char14 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char4 = new String[1] ;
      E396EmprCod = "" ;
      T007C78_Gx_cnt = new int[1] ;
      T007C79_Gx_cnt = new int[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talbdet__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talbdet__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talbdet__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talbdet__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdet__default(),
         new Object[] {
             new Object[] {
            T007C2_A4795AlRPieCal, T007C2_A44AlbRecCod, T007C2_A2159AlbRecPie, T007C2_A2154AlbRecAnh, T007C2_A10762AlbPCont, T007C2_A2157AlbRecMtr, T007C2_A2155AlbRecKgm, T007C2_A2158AlbRecMtrU, T007C2_A2156AlbRecKgmU, T007C2_A8779Bod_Talla,
            T007C2_A8780Bod_Und, T007C2_A3730AlbRecCol, T007C2_A3731AlbRecIdPz, T007C2_A3732AlbRecIdRc, T007C2_A4410AlbRecPal, T007C2_A10180AlRPieTelT, T007C2_A10149AlRPieCon, T007C2_A10181AlRPieOri, T007C2_A10182AlRPieDst, T007C2_A10183AlrPieKgmT,
            T007C2_A7408ALRPIELOC, T007C2_A396EmprCod
            }
            , new Object[] {
            T007C3_A4795AlRPieCal, T007C3_A44AlbRecCod, T007C3_A2159AlbRecPie, T007C3_A2154AlbRecAnh, T007C3_A10762AlbPCont, T007C3_A2157AlbRecMtr, T007C3_A2155AlbRecKgm, T007C3_A2158AlbRecMtrU, T007C3_A2156AlbRecKgmU, T007C3_A8779Bod_Talla,
            T007C3_A8780Bod_Und, T007C3_A3730AlbRecCol, T007C3_A3731AlbRecIdPz, T007C3_A3732AlbRecIdRc, T007C3_A4410AlbRecPal, T007C3_A10180AlRPieTelT, T007C3_A10149AlRPieCon, T007C3_A10181AlRPieOri, T007C3_A10182AlRPieDst, T007C3_A10183AlrPieKgmT,
            T007C3_A7408ALRPIELOC, T007C3_A396EmprCod
            }
            , new Object[] {
            T007C5_A4806AlRPieDefC, T007C5_n4806AlRPieDefC
            }
            , new Object[] {
            T007C7_A2152AlbDetPie, T007C7_A2149AlbDetMtr, T007C7_A2146AlbDetKgm, T007C7_A2151AlbDetMtrU, T007C7_A2148AlbDetKgmU, T007C7_A10758SumKgs, T007C7_A10759SumMts, T007C7_A10760SumPzs
            }
            , new Object[] {
            T007C8_A44AlbRecCod, T007C8_A5806AlbREnt2, T007C8_A46AlbREnt, T007C8_A58AlbRUniEnt, T007C8_A60AlbRUniUti, T007C8_A52AlbRPieEnt, T007C8_A54AlbRPieUti, T007C8_A47AlbREst, T007C8_A56AlbRUni, T007C8_A3613AlbRefDsc,
            T007C8_A49AlbRFen, T007C8_A4606AlbRHEn, T007C8_n4606AlbRHEn, T007C8_A45AlbRef, T007C8_A1291AlbRDes, T007C8_A50AlbRLoc, T007C8_A55AlbRReo, T007C8_A48AlbRFecUlt, T007C8_A6180AlbrUniC, T007C8_A6181AlbrPieC,
            T007C8_A4920AlbRGrm2, T007C8_A4921AlbRAnc, T007C8_A4922AlbPml, T007C8_A6463AlbRLote, T007C8_A13241AlbRPh, T007C8_n13241AlbRPh, T007C8_A13242AlbRRLong, T007C8_n13242AlbRRLong, T007C8_A13243AlbRRTrans, T007C8_n13243AlbRRTrans,
            T007C8_A8029AlbNumM, T007C8_A53AlbRPieReb, T007C8_A59AlbRUniReb, T007C8_A10761AlbUltP, T007C8_n10761AlbUltP, T007C8_A7501AlbRecSec, T007C8_n7501AlbRecSec, T007C8_A1222AlbNumEti, T007C8_A396EmprCod, T007C8_A252CliCod,
            T007C8_A840TrnCod, T007C8_n840TrnCod, T007C8_A970ProceCod, T007C8_n970ProceCod, T007C8_A1211TipEntCod, T007C8_n1211TipEntCod
            }
            , new Object[] {
            T007C9_A44AlbRecCod, T007C9_A5806AlbREnt2, T007C9_A46AlbREnt, T007C9_A58AlbRUniEnt, T007C9_A60AlbRUniUti, T007C9_A52AlbRPieEnt, T007C9_A54AlbRPieUti, T007C9_A47AlbREst, T007C9_A56AlbRUni, T007C9_A3613AlbRefDsc,
            T007C9_A49AlbRFen, T007C9_A4606AlbRHEn, T007C9_n4606AlbRHEn, T007C9_A45AlbRef, T007C9_A1291AlbRDes, T007C9_A50AlbRLoc, T007C9_A55AlbRReo, T007C9_A48AlbRFecUlt, T007C9_A6180AlbrUniC, T007C9_A6181AlbrPieC,
            T007C9_A4920AlbRGrm2, T007C9_A4921AlbRAnc, T007C9_A4922AlbPml, T007C9_A6463AlbRLote, T007C9_A13241AlbRPh, T007C9_n13241AlbRPh, T007C9_A13242AlbRRLong, T007C9_n13242AlbRRLong, T007C9_A13243AlbRRTrans, T007C9_n13243AlbRRTrans,
            T007C9_A8029AlbNumM, T007C9_A53AlbRPieReb, T007C9_A59AlbRUniReb, T007C9_A10761AlbUltP, T007C9_n10761AlbUltP, T007C9_A7501AlbRecSec, T007C9_n7501AlbRecSec, T007C9_A1222AlbNumEti, T007C9_A396EmprCod, T007C9_A252CliCod,
            T007C9_A840TrnCod, T007C9_n840TrnCod, T007C9_A970ProceCod, T007C9_n970ProceCod, T007C9_A1211TipEntCod, T007C9_n1211TipEntCod
            }
            , new Object[] {
            T007C10_A407EmprNom, T007C10_n407EmprNom
            }
            , new Object[] {
            T007C11_A279CliNom
            }
            , new Object[] {
            T007C12_A841TrnNom, T007C12_n841TrnNom
            }
            , new Object[] {
            T007C13_A971ProceNom, T007C13_n971ProceNom
            }
            , new Object[] {
            T007C14_A1212TipEntNom, T007C14_n1212TipEntNom
            }
            , new Object[] {
            T007C16_A44AlbRecCod, T007C16_A5806AlbREnt2, T007C16_A46AlbREnt, T007C16_A58AlbRUniEnt, T007C16_A60AlbRUniUti, T007C16_A52AlbRPieEnt, T007C16_A54AlbRPieUti, T007C16_A47AlbREst, T007C16_A56AlbRUni, T007C16_A3613AlbRefDsc,
            T007C16_A407EmprNom, T007C16_n407EmprNom, T007C16_A49AlbRFen, T007C16_A4606AlbRHEn, T007C16_n4606AlbRHEn, T007C16_A279CliNom, T007C16_A45AlbRef, T007C16_A971ProceNom, T007C16_n971ProceNom, T007C16_A841TrnNom,
            T007C16_n841TrnNom, T007C16_A1212TipEntNom, T007C16_n1212TipEntNom, T007C16_A1291AlbRDes, T007C16_A50AlbRLoc, T007C16_A55AlbRReo, T007C16_A48AlbRFecUlt, T007C16_A6180AlbrUniC, T007C16_A6181AlbrPieC, T007C16_A4920AlbRGrm2,
            T007C16_A4921AlbRAnc, T007C16_A4922AlbPml, T007C16_A6463AlbRLote, T007C16_A13241AlbRPh, T007C16_n13241AlbRPh, T007C16_A13242AlbRRLong, T007C16_n13242AlbRRLong, T007C16_A13243AlbRRTrans, T007C16_n13243AlbRRTrans, T007C16_A8029AlbNumM,
            T007C16_A53AlbRPieReb, T007C16_A59AlbRUniReb, T007C16_A10761AlbUltP, T007C16_n10761AlbUltP, T007C16_A7501AlbRecSec, T007C16_n7501AlbRecSec, T007C16_A1222AlbNumEti, T007C16_A396EmprCod, T007C16_A252CliCod, T007C16_A840TrnCod,
            T007C16_n840TrnCod, T007C16_A970ProceCod, T007C16_n970ProceCod, T007C16_A1211TipEntCod, T007C16_n1211TipEntCod, T007C16_A2152AlbDetPie, T007C16_A2149AlbDetMtr, T007C16_A2146AlbDetKgm, T007C16_A2151AlbDetMtrU, T007C16_A2148AlbDetKgmU,
            T007C16_A10758SumKgs, T007C16_A10759SumMts, T007C16_A10760SumPzs
            }
            , new Object[] {
            T007C17_A279CliNom
            }
            , new Object[] {
            T007C18_A841TrnNom, T007C18_n841TrnNom
            }
            , new Object[] {
            T007C19_A971ProceNom, T007C19_n971ProceNom
            }
            , new Object[] {
            T007C20_A1212TipEntNom, T007C20_n1212TipEntNom
            }
            , new Object[] {
            T007C22_A2152AlbDetPie, T007C22_A2149AlbDetMtr, T007C22_A2146AlbDetKgm, T007C22_A2151AlbDetMtrU, T007C22_A2148AlbDetKgmU, T007C22_A10758SumKgs, T007C22_A10759SumMts, T007C22_A10760SumPzs
            }
            , new Object[] {
            T007C23_A396EmprCod, T007C23_A44AlbRecCod
            }
            , new Object[] {
            T007C24_A396EmprCod, T007C24_A44AlbRecCod
            }
            , new Object[] {
            T007C25_A396EmprCod, T007C25_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T007C29_A279CliNom
            }
            , new Object[] {
            T007C30_A841TrnNom, T007C30_n841TrnNom
            }
            , new Object[] {
            T007C31_A971ProceNom, T007C31_n971ProceNom
            }
            , new Object[] {
            T007C32_A1212TipEntNom, T007C32_n1212TipEntNom
            }
            , new Object[] {
            T007C34_A2152AlbDetPie, T007C34_A2149AlbDetMtr, T007C34_A2146AlbDetKgm, T007C34_A2151AlbDetMtrU, T007C34_A2148AlbDetKgmU, T007C34_A10758SumKgs, T007C34_A10759SumMts, T007C34_A10760SumPzs
            }
            , new Object[] {
            T007C35_A396EmprCod, T007C35_A13026PedDGId, T007C35_A44AlbRecCod
            }
            , new Object[] {
            T007C36_A396EmprCod, T007C36_A11669DevCruId, T007C36_A44AlbRecCod
            }
            , new Object[] {
            T007C37_A396EmprCod, T007C37_A44AlbRecCod, T007C37_A9743Emp_CUb, T007C37_A5860Emp_Anp
            }
            , new Object[] {
            T007C38_A396EmprCod, T007C38_A44AlbRecCod, T007C38_A7130MatC_Pz
            }
            , new Object[] {
            T007C39_A396EmprCod, T007C39_A44AlbRecCod, T007C39_A7132MatC_Talla
            }
            , new Object[] {
            T007C40_A396EmprCod, T007C40_A44AlbRecCod, T007C40_A7115MatC_Lin
            }
            , new Object[] {
            T007C41_A396EmprCod, T007C41_A30AlbProCod, T007C41_A129BarCod, T007C41_A132BarCodReo, T007C41_A130BarCodPar, T007C41_A6622AlbHdRLn
            }
            , new Object[] {
            T007C42_A396EmprCod, T007C42_A6235DevEmpCod, T007C42_A6243DevNumLin
            }
            , new Object[] {
            T007C43_A396EmprCod, T007C43_A44AlbRecCod, T007C43_A4596AlbRDefCod
            }
            , new Object[] {
            T007C44_A396EmprCod, T007C44_A44AlbRecCod, T007C44_A2159AlbRecPie, T007C44_A4395AlRDefCod, T007C44_A4412AlRFasCod
            }
            , new Object[] {
            T007C45_A396EmprCod, T007C45_A44AlbRecCod, T007C45_A2165HisEmpLin
            }
            , new Object[] {
            T007C46_A396EmprCod, T007C46_A44AlbRecCod, T007C46_A1299AlbRLin
            }
            , new Object[] {
            T007C47_A396EmprCod, T007C47_A361DisCod, T007C47_A44AlbRecCod
            }
            , new Object[] {
            T007C48_A396EmprCod, T007C48_A323DevGenCod
            }
            , new Object[] {
            T007C49_A396EmprCod, T007C49_A129BarCod, T007C49_A132BarCodReo, T007C49_A130BarCodPar, T007C49_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            T007C51_A396EmprCod, T007C51_A44AlbRecCod
            }
            , new Object[] {
            T007C52_A4795AlRPieCal, T007C52_A44AlbRecCod, T007C52_A2159AlbRecPie, T007C52_A2154AlbRecAnh, T007C52_A10762AlbPCont, T007C52_A2157AlbRecMtr, T007C52_A2155AlbRecKgm, T007C52_A2158AlbRecMtrU, T007C52_A2156AlbRecKgmU, T007C52_A8779Bod_Talla,
            T007C52_A8780Bod_Und, T007C52_A3730AlbRecCol, T007C52_A3731AlbRecIdPz, T007C52_A3732AlbRecIdRc, T007C52_A4410AlbRecPal, T007C52_A10180AlRPieTelT, T007C52_A10149AlRPieCon, T007C52_A10181AlRPieOri, T007C52_A10182AlRPieDst, T007C52_A10183AlrPieKgmT,
            T007C52_A7408ALRPIELOC, T007C52_A396EmprCod
            }
            , new Object[] {
            T007C54_A4806AlRPieDefC, T007C54_n4806AlRPieDefC
            }
            , new Object[] {
            T007C55_A396EmprCod, T007C55_A44AlbRecCod, T007C55_A2159AlbRecPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T007C60_A4806AlRPieDefC, T007C60_n4806AlRPieDefC
            }
            , new Object[] {
            T007C61_A396EmprCod, T007C61_A44AlbRecCod, T007C61_A2159AlbRecPie, T007C61_A10188AlRFibOrd
            }
            , new Object[] {
            T007C62_A396EmprCod, T007C62_A44AlbRecCod, T007C62_A2159AlbRecPie, T007C62_A9568CodHilz
            }
            , new Object[] {
            T007C63_A396EmprCod, T007C63_A44AlbRecCod, T007C63_A2159AlbRecPie, T007C63_A7697AlREtiTpo
            }
            , new Object[] {
            T007C64_A396EmprCod, T007C64_A44AlbRecCod, T007C64_A2159AlbRecPie, T007C64_A5262AlbRecEvt
            }
            , new Object[] {
            T007C65_A396EmprCod, T007C65_A44AlbRecCod, T007C65_A2159AlbRecPie, T007C65_A4395AlRDefCod, T007C65_A4412AlRFasCod
            }
            , new Object[] {
            T007C66_A396EmprCod, T007C66_A44AlbRecCod, T007C66_A2159AlbRecPie
            }
            , new Object[] {
            T007C67_A396EmprCod, T007C67_A252CliCod, T007C67_A279CliNom
            }
            , new Object[] {
            T007C68_A396EmprCod, T007C68_A252CliCod, T007C68_A65ArtCod, T007C68_A69ArtDsc, T007C68_n69ArtDsc, T007C68_A829TipArtCod
            }
            , new Object[] {
            T007C69_A396EmprCod, T007C69_A970ProceCod, T007C69_A971ProceNom, T007C69_n971ProceNom
            }
            , new Object[] {
            T007C70_A396EmprCod, T007C70_A840TrnCod, T007C70_A841TrnNom, T007C70_n841TrnNom
            }
            , new Object[] {
            T007C71_A396EmprCod, T007C71_A1211TipEntCod, T007C71_A1212TipEntNom, T007C71_n1212TipEntNom
            }
            , new Object[] {
            T007C73_A2152AlbDetPie, T007C73_A2149AlbDetMtr, T007C73_A2146AlbDetKgm, T007C73_A2151AlbDetMtrU, T007C73_A2148AlbDetKgmU, T007C73_A10758SumKgs, T007C73_A10759SumMts, T007C73_A10760SumPzs
            }
            , new Object[] {
            T007C74_A279CliNom
            }
            , new Object[] {
            T007C75_A971ProceNom, T007C75_n971ProceNom
            }
            , new Object[] {
            T007C76_A841TrnNom, T007C76_n841TrnNom
            }
            , new Object[] {
            T007C77_A1212TipEntNom, T007C77_n1212TipEntNom
            }
            , new Object[] {
            T007C78_Gx_cnt
            }
            , new Object[] {
            T007C79_Gx_cnt
            }
         }
      );
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
      AV124Pgmname = "TALBDET" ;
      Z2154AlbRecAnh = (short)(0) ;
      A2154AlbRecAnh = (short)(0) ;
      i2154AlbRecAnh = (short)(0) ;
      Z4606AlbRHEn = GXutil.now( ) ;
      n4606AlbRHEn = false ;
      A4606AlbRHEn = GXutil.now( ) ;
      n4606AlbRHEn = false ;
      i4606AlbRHEn = GXutil.now( ) ;
      n4606AlbRHEn = false ;
      Z48AlbRFecUlt = GXutil.today( ) ;
      A48AlbRFecUlt = GXutil.today( ) ;
      i48AlbRFecUlt = GXutil.today( ) ;
      Z47AlbREst = (byte)(0) ;
      A47AlbREst = (byte)(0) ;
      O47AlbREst = (byte)(0) ;
      i47AlbREst = (byte)(0) ;
      Z55AlbRReo = httpContext.getMessage( "NO", "") ;
      A55AlbRReo = httpContext.getMessage( "NO", "") ;
      i55AlbRReo = httpContext.getMessage( "NO", "") ;
      Z49AlbRFen = GXutil.today( ) ;
      A49AlbRFen = GXutil.today( ) ;
      i49AlbRFen = GXutil.today( ) ;
   }

   private byte Z47AlbREst ;
   private byte GxWebError ;
   private byte AV78SiArt ;
   private byte AV105UbicaL ;
   private byte AV108ValorUbica ;
   private byte AV82Noctrlpz ;
   private byte AV57SumPza ;
   private byte AV60FlagArt ;
   private byte AV61CalMKT ;
   private byte AV88Enc20c ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A47AlbREst ;
   private byte AV99Termilenio ;
   private byte AV50FlagKgs ;
   private byte AV51FlagMts ;
   private byte AV76ErrP ;
   private byte AV77ErrArt ;
   private byte AV81Flag ;
   private byte AV75Tintatex ;
   private byte AV89Velluts ;
   private byte AV90PzaProd ;
   private byte AV70NoPzaR ;
   private byte s47AlbREst ;
   private byte O47AlbREst ;
   private byte AV53FlagGraf ;
   private byte AV66Artextil ;
   private byte AV83VerItm ;
   private byte AV94Colorsol ;
   private byte AV97PesSim ;
   private byte AV100stamperia ;
   private byte AV103Piolera ;
   private byte AV104tintoriente ;
   private byte AV107Estampamos ;
   private byte AV112biarprint ;
   private byte subGridlevel_piezas_Backcolorstyle ;
   private byte subGridlevel_piezas_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i47AlbREst ;
   private byte subGridlevel_piezas_Allowselection ;
   private byte subGridlevel_piezas_Allowhovering ;
   private byte subGridlevel_piezas_Allowcollapsing ;
   private byte subGridlevel_piezas_Collapsed ;
   private byte ZV60FlagArt ;
   private byte ZV77ErrArt ;
   private byte ZV81Flag ;
   private byte ZV76ErrP ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte ZV90PzaProd ;
   private short Z4920AlbRGrm2 ;
   private short Z4921AlbRAnc ;
   private short Z4922AlbPml ;
   private short Z10761AlbUltP ;
   private short Z7501AlbRecSec ;
   private short Z1222AlbNumEti ;
   private short Z840TrnCod ;
   private short Z970ProceCod ;
   private short Z1211TipEntCod ;
   private short O10761AlbUltP ;
   private short O10760SumPzs ;
   private short N970ProceCod ;
   private short N840TrnCod ;
   private short N1211TipEntCod ;
   private short Z2154AlbRecAnh ;
   private short Z10762AlbPCont ;
   private short Z8780Bod_Und ;
   private short Z3730AlbRecCol ;
   private short nRcdDeleted_299 ;
   private short nRcdExists_299 ;
   private short nIsMod_299 ;
   private short A970ProceCod ;
   private short A840TrnCod ;
   private short A1211TipEntCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4921AlbRAnc ;
   private short A10761AlbUltP ;
   private short A2152AlbDetPie ;
   private short A2153AlbDetPieU ;
   private short A4920AlbRGrm2 ;
   private short A4922AlbPml ;
   private short A10760SumPzs ;
   private short A1222AlbNumEti ;
   private short nBlankRcdCount299 ;
   private short RcdFound299 ;
   private short B10761AlbUltP ;
   private short B10760SumPzs ;
   private short nBlankRcdUsr299 ;
   private short A7501AlbRecSec ;
   private short AV119Insert_ProceCod ;
   private short AV120Insert_TrnCod ;
   private short AV121Insert_TipEntCod ;
   private short AV59Pesoml ;
   private short AV109Anc ;
   private short AV110grm2 ;
   private short RcdFound7 ;
   private short s10761AlbUltP ;
   private short s10760SumPzs ;
   private short s2153AlbDetPieU ;
   private short O2153AlbDetPieU ;
   private short A2154AlbRecAnh ;
   private short A8780Bod_Und ;
   private short A3730AlbRecCol ;
   private short A10762AlbPCont ;
   private short Z2152AlbDetPie ;
   private short Z10760SumPzs ;
   private short nIsDirty_7 ;
   private short nIsDirty_299 ;
   private short i10761AlbUltP ;
   private short i2154AlbRecAnh ;
   private short i10762AlbPCont ;
   private short i10760SumPzs ;
   private short ZV59Pesoml ;
   private short ZV109Anc ;
   private short ZV110grm2 ;
   private short Z2153AlbDetPieU ;
   private short GXv_int13[] ;
   private short GXv_int12[] ;
   private short GXv_int11[] ;
   private int wcpOAV114AlbRecCod ;
   private int Z44AlbRecCod ;
   private int Z52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int Z6181AlbrPieC ;
   private int Z53AlbRPieReb ;
   private int Z252CliCod ;
   private int nRC_GXsfl_181 ;
   private int nGXsfl_181_idx=1 ;
   private int N252CliCod ;
   private int Z3732AlbRecIdRc ;
   private int Z10149AlRPieCon ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV114AlbRecCod ;
   private int trnEnded ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbREnt_Visible ;
   private int edtAlbREnt_Enabled ;
   private int edtAlbREnt2_Visible ;
   private int edtAlbREnt2_Enabled ;
   private int edtAlbRFen_Enabled ;
   private int edtAlbRDes_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbrUniC_Enabled ;
   private int A6181AlbrPieC ;
   private int edtAlbrPieC_Enabled ;
   private int edtAlbNumM_Enabled ;
   private int A54AlbRPieUti ;
   private int edtAlbRPieUti_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtAlbRFecUlt_Enabled ;
   private int edtAlbRLoc_Enabled ;
   private int edtAlbRLote_Enabled ;
   private int edtAlbRGrm2_Enabled ;
   private int edtAlbRAnc_Enabled ;
   private int edtAlbPml_Enabled ;
   private int edtAlbRPh_Enabled ;
   private int edtAlbRRLong_Enabled ;
   private int edtAlbRRTrans_Enabled ;
   private int bttBtnnumerarpiezas_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtAlbDetPie_Enabled ;
   private int edtAlbDetPie_Visible ;
   private int edtAlbDetMtr_Enabled ;
   private int edtAlbDetMtr_Visible ;
   private int edtAlbDetKgm_Enabled ;
   private int edtAlbDetKgm_Visible ;
   private int edtAlbDetMtrU_Enabled ;
   private int edtAlbDetMtrU_Visible ;
   private int edtAlbDetKgmU_Enabled ;
   private int edtAlbDetKgmU_Visible ;
   private int edtAlbDetMtrD_Enabled ;
   private int edtAlbDetMtrD_Visible ;
   private int edtAlbDetKgmD_Enabled ;
   private int edtAlbDetKgmD_Visible ;
   private int edtAlbDetPieU_Enabled ;
   private int edtAlbDetPieU_Visible ;
   private int edtSumKgs_Enabled ;
   private int edtSumKgs_Visible ;
   private int edtSumMts_Enabled ;
   private int edtSumMts_Visible ;
   private int edtSumPzs_Enabled ;
   private int edtSumPzs_Visible ;
   private int A53AlbRPieReb ;
   private int edtAlbRPieReb_Enabled ;
   private int edtAlbRPieReb_Visible ;
   private int edtAlbUltP_Enabled ;
   private int edtAlbUltP_Visible ;
   private int edtAlbNumEti_Enabled ;
   private int edtAlbNumEti_Visible ;
   private int edtAlbRefDsc_Visible ;
   private int edtAlbRefDsc_Enabled ;
   private int edtAlbRecPie_Enabled ;
   private int edtALRPIELOC_Enabled ;
   private int edtAlbRecAnh_Enabled ;
   private int edtAlbRecMtr_Enabled ;
   private int edtAlbRecKgm_Enabled ;
   private int edtAlbRecMtrU_Enabled ;
   private int edtAlbRecKgmU_Enabled ;
   private int edtAlRPieClaC_Enabled ;
   private int edtBod_Talla_Enabled ;
   private int edtBod_Und_Enabled ;
   private int edtAlbRecCol_Enabled ;
   private int edtAlbRecIdPz_Enabled ;
   private int edtAlbRecIdRc_Enabled ;
   private int edtAlbRecPal_Enabled ;
   private int edtAlRPieTelT_Enabled ;
   private int edtAlRPieCon_Enabled ;
   private int edtAlRPieOri_Enabled ;
   private int edtAlRPieDst_Enabled ;
   private int edtAlrPieKgmT_Enabled ;
   private int edtAlbPCont_Enabled ;
   private int edtAlbPCont_Visible ;
   private int fRowAdded ;
   private int AV118Insert_CliCod ;
   private int A4806AlRPieDefC ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Dvpanel_unnamedtable2_Gxcontroltype ;
   private int s52AlbRPieEnt ;
   private int O52AlbRPieEnt ;
   private int s54AlbRPieUti ;
   private int O54AlbRPieUti ;
   private int A3732AlbRecIdRc ;
   private int A10149AlRPieCon ;
   private int GXt_int7 ;
   private int AV125GXV1 ;
   private int GX_JID ;
   private int subGridlevel_piezas_Backcolor ;
   private int subGridlevel_piezas_Allbackcolor ;
   private int defedtAlbPCont_Enabled ;
   private int defedtAlrPieKgmT_Enabled ;
   private int defedtAlRPieDst_Enabled ;
   private int defedtAlRPieOri_Enabled ;
   private int defedtAlRPieCon_Enabled ;
   private int defedtAlRPieTelT_Enabled ;
   private int defedtAlbRecPal_Enabled ;
   private int defedtAlbRecIdRc_Enabled ;
   private int defedtAlbRecIdPz_Enabled ;
   private int defedtAlbRecCol_Enabled ;
   private int defedtBod_Und_Enabled ;
   private int defedtBod_Talla_Enabled ;
   private int defedtAlRPieClaC_Enabled ;
   private int defedtAlbRecPie_Enabled ;
   private int idxLst ;
   private int subGridlevel_piezas_Selectedindex ;
   private int subGridlevel_piezas_Selectioncolor ;
   private int subGridlevel_piezas_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int Z51AlbRPieDis ;
   private int Z4806AlRPieDefC ;
   private int GXv_int8[] ;
   private int Gx_cnt ;
   private int E44AlbRecCod ;
   private long GRIDLEVEL_PIEZAS_nFirstRecordOnPage ;
   private long AV68f_NOTREC ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z6180AlbrUniC ;
   private java.math.BigDecimal Z13241AlbRPh ;
   private java.math.BigDecimal Z13242AlbRRLong ;
   private java.math.BigDecimal Z13243AlbRRTrans ;
   private java.math.BigDecimal Z59AlbRUniReb ;
   private java.math.BigDecimal O10758SumKgs ;
   private java.math.BigDecimal O10759SumMts ;
   private java.math.BigDecimal Z2157AlbRecMtr ;
   private java.math.BigDecimal Z2155AlbRecKgm ;
   private java.math.BigDecimal Z2158AlbRecMtrU ;
   private java.math.BigDecimal Z2156AlbRecKgmU ;
   private java.math.BigDecimal Z4410AlbRecPal ;
   private java.math.BigDecimal Z10183AlrPieKgmT ;
   private java.math.BigDecimal O2155AlbRecKgm ;
   private java.math.BigDecimal O2157AlbRecMtr ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2147AlbDetKgmD ;
   private java.math.BigDecimal A2150AlbDetMtrD ;
   private java.math.BigDecimal A2146AlbDetKgm ;
   private java.math.BigDecimal A2148AlbDetKgmU ;
   private java.math.BigDecimal A2149AlbDetMtr ;
   private java.math.BigDecimal A2151AlbDetMtrU ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A6180AlbrUniC ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A13241AlbRPh ;
   private java.math.BigDecimal A13242AlbRRLong ;
   private java.math.BigDecimal A13243AlbRRTrans ;
   private java.math.BigDecimal A10758SumKgs ;
   private java.math.BigDecimal A10759SumMts ;
   private java.math.BigDecimal B10758SumKgs ;
   private java.math.BigDecimal B10759SumMts ;
   private java.math.BigDecimal A59AlbRUniReb ;
   private java.math.BigDecimal AV58Rdto ;
   private java.math.BigDecimal s10758SumKgs ;
   private java.math.BigDecimal s10759SumMts ;
   private java.math.BigDecimal s2147AlbDetKgmD ;
   private java.math.BigDecimal O2147AlbDetKgmD ;
   private java.math.BigDecimal s2150AlbDetMtrD ;
   private java.math.BigDecimal O2150AlbDetMtrD ;
   private java.math.BigDecimal s58AlbRUniEnt ;
   private java.math.BigDecimal O58AlbRUniEnt ;
   private java.math.BigDecimal s60AlbRUniUti ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A4410AlbRecPal ;
   private java.math.BigDecimal A10183AlrPieKgmT ;
   private java.math.BigDecimal T2155AlbRecKgm ;
   private java.math.BigDecimal T2157AlbRecMtr ;
   private java.math.BigDecimal Z2149AlbDetMtr ;
   private java.math.BigDecimal Z2146AlbDetKgm ;
   private java.math.BigDecimal Z2151AlbDetMtrU ;
   private java.math.BigDecimal Z2148AlbDetKgmU ;
   private java.math.BigDecimal Z10758SumKgs ;
   private java.math.BigDecimal Z10759SumMts ;
   private java.math.BigDecimal Z2150AlbDetMtrD ;
   private java.math.BigDecimal Z2147AlbDetKgmD ;
   private java.math.BigDecimal ZV58Rdto ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV113EmprCod ;
   private String Z396EmprCod ;
   private String Z5806AlbREnt2 ;
   private String Z46AlbREnt ;
   private String Z56AlbRUni ;
   private String Z3613AlbRefDsc ;
   private String Z45AlbRef ;
   private String Z1291AlbRDes ;
   private String Z50AlbRLoc ;
   private String Z55AlbRReo ;
   private String Z6463AlbRLote ;
   private String Z8029AlbNumM ;
   private String O5806AlbREnt2 ;
   private String Z2159AlbRecPie ;
   private String Z4795AlRPieCal ;
   private String Z8779Bod_Talla ;
   private String Z3731AlbRecIdPz ;
   private String Z10180AlRPieTelT ;
   private String Z10181AlRPieOri ;
   private String Z10182AlRPieDst ;
   private String Z7408ALRPIELOC ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A45AlbRef ;
   private String AV124Pgmname ;
   private String AV17UsurCod ;
   private String AV38Station ;
   private String A5806AlbREnt2 ;
   private String AV92OldAlb2 ;
   private String A50AlbRLoc ;
   private String AV106Msg_Ubica ;
   private String A2159AlbRecPie ;
   private String A56AlbRUni ;
   private String AV113EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbRecCod_Internalname ;
   private String sGXsfl_181_idx="0001" ;
   private String A55AlbRReo ;
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
   private String edtAlbRecCod_Jsonclick ;
   private String grpUnnamedgroup4_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divAlbrent_cell_Internalname ;
   private String divAlbrent_cell_Class ;
   private String edtAlbREnt_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Jsonclick ;
   private String divAlbrent2_cell_Internalname ;
   private String divAlbrent2_cell_Class ;
   private String edtAlbREnt2_Internalname ;
   private String edtAlbREnt2_Jsonclick ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRFen_Jsonclick ;
   private String edtAlbRDes_Internalname ;
   private String A1291AlbRDes ;
   private String edtAlbRDes_Jsonclick ;
   private String sStyleString ;
   private String tblTablemergedunnamedgroup6_Internalname ;
   private String grpUnnamedgroup6_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbrUniC_Internalname ;
   private String edtAlbrUniC_Jsonclick ;
   private String edtAlbrPieC_Internalname ;
   private String edtAlbrPieC_Jsonclick ;
   private String edtAlbNumM_Internalname ;
   private String A8029AlbNumM ;
   private String edtAlbNumM_Jsonclick ;
   private String grpUnnamedgroup8_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRFecUlt_Internalname ;
   private String edtAlbRFecUlt_Jsonclick ;
   private String grpUnnamedgroup10_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtAlbRLoc_Internalname ;
   private String edtAlbRLoc_Jsonclick ;
   private String edtAlbRLote_Internalname ;
   private String A6463AlbRLote ;
   private String edtAlbRLote_Jsonclick ;
   private String grpUnnamedgroup12_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String edtAlbRGrm2_Internalname ;
   private String edtAlbRGrm2_Jsonclick ;
   private String edtAlbRAnc_Internalname ;
   private String edtAlbRAnc_Jsonclick ;
   private String edtAlbPml_Internalname ;
   private String edtAlbPml_Jsonclick ;
   private String grpUnnamedgroup14_Internalname ;
   private String grpUnnamedgroup14_Class ;
   private String divUnnamedtable13_Internalname ;
   private String edtAlbRPh_Internalname ;
   private String edtAlbRPh_Jsonclick ;
   private String edtAlbRRLong_Internalname ;
   private String edtAlbRRLong_Jsonclick ;
   private String edtAlbRRTrans_Internalname ;
   private String edtAlbRRTrans_Jsonclick ;
   private String divTableleaflevel_piezas_Internalname ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String tblUnnamedtable2_Internalname ;
   private String bttBtnnumerarpiezas_Internalname ;
   private String bttBtnnumerarpiezas_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtAlbDetPie_Internalname ;
   private String edtAlbDetPie_Jsonclick ;
   private String edtAlbDetMtr_Internalname ;
   private String edtAlbDetMtr_Jsonclick ;
   private String edtAlbDetKgm_Internalname ;
   private String edtAlbDetKgm_Jsonclick ;
   private String edtAlbDetMtrU_Internalname ;
   private String edtAlbDetMtrU_Jsonclick ;
   private String edtAlbDetKgmU_Internalname ;
   private String edtAlbDetKgmU_Jsonclick ;
   private String edtAlbDetMtrD_Internalname ;
   private String edtAlbDetMtrD_Jsonclick ;
   private String edtAlbDetKgmD_Internalname ;
   private String edtAlbDetKgmD_Jsonclick ;
   private String edtAlbDetPieU_Internalname ;
   private String edtAlbDetPieU_Jsonclick ;
   private String edtSumKgs_Internalname ;
   private String edtSumKgs_Jsonclick ;
   private String edtSumMts_Internalname ;
   private String edtSumMts_Jsonclick ;
   private String edtSumPzs_Internalname ;
   private String edtSumPzs_Jsonclick ;
   private String edtAlbRPieReb_Internalname ;
   private String edtAlbRPieReb_Jsonclick ;
   private String edtAlbUltP_Internalname ;
   private String edtAlbUltP_Jsonclick ;
   private String edtAlbNumEti_Internalname ;
   private String edtAlbNumEti_Jsonclick ;
   private String edtAlbRefDsc_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Jsonclick ;
   private String B5806AlbREnt2 ;
   private String sMode299 ;
   private String edtAlbRecPie_Internalname ;
   private String edtALRPIELOC_Internalname ;
   private String edtAlbRecAnh_Internalname ;
   private String edtAlbRecMtr_Internalname ;
   private String edtAlbRecKgm_Internalname ;
   private String edtAlbRecMtrU_Internalname ;
   private String edtAlbRecKgmU_Internalname ;
   private String edtAlRPieClaC_Internalname ;
   private String edtBod_Talla_Internalname ;
   private String edtBod_Und_Internalname ;
   private String edtAlbRecCol_Internalname ;
   private String edtAlbRecIdPz_Internalname ;
   private String edtAlbRecIdRc_Internalname ;
   private String edtAlbRecPal_Internalname ;
   private String edtAlRPieTelT_Internalname ;
   private String edtAlRPieCon_Internalname ;
   private String edtAlRPieOri_Internalname ;
   private String edtAlRPieDst_Internalname ;
   private String edtAlrPieKgmT_Internalname ;
   private String edtAlbPCont_Internalname ;
   private String subGridlevel_piezas_Internalname ;
   private String AV46Modo ;
   private String AV18AlbCum ;
   private String A279CliNom ;
   private String AV98artblo ;
   private String A841TrnNom ;
   private String A971ProceNom ;
   private String A1212TipEntNom ;
   private String A4795AlRPieCal ;
   private String AV54PieUti ;
   private String AV71Msg_err ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String hsh ;
   private String sMode7 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sV18AlbCum ;
   private String OV18AlbCum ;
   private String GXCCtl ;
   private String A7408ALRPIELOC ;
   private String A4797AlRPieClaC ;
   private String A8779Bod_Talla ;
   private String A3731AlbRecIdPz ;
   private String A10180AlRPieTelT ;
   private String A10181AlRPieOri ;
   private String A10182AlRPieDst ;
   private String AV16EmprNom ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z971ProceNom ;
   private String Z841TrnNom ;
   private String Z1212TipEntNom ;
   private String sGXsfl_181_fel_idx="0001" ;
   private String subGridlevel_piezas_Class ;
   private String subGridlevel_piezas_Linesclass ;
   private String ROClassString ;
   private String edtAlbRecPie_Jsonclick ;
   private String edtALRPIELOC_Jsonclick ;
   private String edtAlbRecAnh_Jsonclick ;
   private String edtAlbRecMtr_Jsonclick ;
   private String edtAlbRecKgm_Jsonclick ;
   private String edtAlbRecMtrU_Jsonclick ;
   private String edtAlbRecKgmU_Jsonclick ;
   private String edtAlRPieClaC_Jsonclick ;
   private String edtBod_Talla_Jsonclick ;
   private String edtBod_Und_Jsonclick ;
   private String edtAlbRecCol_Jsonclick ;
   private String edtAlbRecIdPz_Jsonclick ;
   private String edtAlbRecIdRc_Jsonclick ;
   private String edtAlbRecPal_Jsonclick ;
   private String edtAlRPieTelT_Jsonclick ;
   private String edtAlRPieCon_Jsonclick ;
   private String edtAlRPieOri_Jsonclick ;
   private String edtAlRPieDst_Jsonclick ;
   private String edtAlrPieKgmT_Jsonclick ;
   private String edtAlbPCont_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV46Modo ;
   private String i56AlbRUni ;
   private String i55AlbRReo ;
   private String subGridlevel_piezas_Header ;
   private String gxwrpcisep ;
   private String ZV92OldAlb2 ;
   private String GXv_char2[] ;
   private String ZV98artblo ;
   private String ZV18AlbCum ;
   private String ZV106Msg_Ubica ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String ZV54PieUti ;
   private String ZV71Msg_err ;
   private String Z4797AlRPieClaC ;
   private String GXv_char14[] ;
   private String GXv_char4[] ;
   private String E396EmprCod ;
   private java.util.Date Z4606AlbRHEn ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date i4606AlbRHEn ;
   private java.util.Date Z49AlbRFen ;
   private java.util.Date Z48AlbRFecUlt ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date i49AlbRFen ;
   private java.util.Date i48AlbRFecUlt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean n970ProceCod ;
   private boolean n840TrnCod ;
   private boolean n1211TipEntCod ;
   private boolean wbErr ;
   private boolean n10761AlbUltP ;
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
   private boolean bGXsfl_181_Refreshing=false ;
   private boolean n4606AlbRHEn ;
   private boolean n7501AlbRecSec ;
   private boolean n841TrnNom ;
   private boolean n971ProceNom ;
   private boolean n1212TipEntNom ;
   private boolean n4806AlRPieDefC ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean n13241AlbRPh ;
   private boolean n13242AlbRRLong ;
   private boolean n13243AlbRRTrans ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean nA44AlbRecCod ;
   private boolean nE44AlbRecCod ;
   private String AV93Inc_obs ;
   private String sV93Inc_obs ;
   private String OV93Inc_obs ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_piezasContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_piezasRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_piezasColumn ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV117WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice dynCliCod ;
   private HTMLChoice dynAlbRef ;
   private HTMLChoice dynProceCod ;
   private HTMLChoice dynTrnCod ;
   private HTMLChoice dynTipEntCod ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private HTMLChoice cmbAlbRReo ;
   private IDataStoreProvider pr_default ;
   private short[] T007C7_A2152AlbDetPie ;
   private java.math.BigDecimal[] T007C7_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T007C7_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T007C7_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T007C7_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] T007C7_A10758SumKgs ;
   private java.math.BigDecimal[] T007C7_A10759SumMts ;
   private short[] T007C7_A10760SumPzs ;
   private String[] T007C10_A407EmprNom ;
   private boolean[] T007C10_n407EmprNom ;
   private String[] T007C11_A279CliNom ;
   private String[] T007C13_A971ProceNom ;
   private boolean[] T007C13_n971ProceNom ;
   private String[] T007C12_A841TrnNom ;
   private boolean[] T007C12_n841TrnNom ;
   private String[] T007C14_A1212TipEntNom ;
   private boolean[] T007C14_n1212TipEntNom ;
   private int[] T007C16_A44AlbRecCod ;
   private boolean[] T007C16_n44AlbRecCod ;
   private String[] T007C16_A5806AlbREnt2 ;
   private String[] T007C16_A46AlbREnt ;
   private java.math.BigDecimal[] T007C16_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T007C16_A60AlbRUniUti ;
   private int[] T007C16_A52AlbRPieEnt ;
   private int[] T007C16_A54AlbRPieUti ;
   private byte[] T007C16_A47AlbREst ;
   private String[] T007C16_A56AlbRUni ;
   private String[] T007C16_A3613AlbRefDsc ;
   private String[] T007C16_A407EmprNom ;
   private boolean[] T007C16_n407EmprNom ;
   private java.util.Date[] T007C16_A49AlbRFen ;
   private java.util.Date[] T007C16_A4606AlbRHEn ;
   private boolean[] T007C16_n4606AlbRHEn ;
   private String[] T007C16_A279CliNom ;
   private String[] T007C16_A45AlbRef ;
   private String[] T007C16_A971ProceNom ;
   private boolean[] T007C16_n971ProceNom ;
   private String[] T007C16_A841TrnNom ;
   private boolean[] T007C16_n841TrnNom ;
   private String[] T007C16_A1212TipEntNom ;
   private boolean[] T007C16_n1212TipEntNom ;
   private String[] T007C16_A1291AlbRDes ;
   private String[] T007C16_A50AlbRLoc ;
   private String[] T007C16_A55AlbRReo ;
   private java.util.Date[] T007C16_A48AlbRFecUlt ;
   private java.math.BigDecimal[] T007C16_A6180AlbrUniC ;
   private int[] T007C16_A6181AlbrPieC ;
   private short[] T007C16_A4920AlbRGrm2 ;
   private short[] T007C16_A4921AlbRAnc ;
   private short[] T007C16_A4922AlbPml ;
   private String[] T007C16_A6463AlbRLote ;
   private java.math.BigDecimal[] T007C16_A13241AlbRPh ;
   private boolean[] T007C16_n13241AlbRPh ;
   private java.math.BigDecimal[] T007C16_A13242AlbRRLong ;
   private boolean[] T007C16_n13242AlbRRLong ;
   private java.math.BigDecimal[] T007C16_A13243AlbRRTrans ;
   private boolean[] T007C16_n13243AlbRRTrans ;
   private String[] T007C16_A8029AlbNumM ;
   private int[] T007C16_A53AlbRPieReb ;
   private java.math.BigDecimal[] T007C16_A59AlbRUniReb ;
   private short[] T007C16_A10761AlbUltP ;
   private boolean[] T007C16_n10761AlbUltP ;
   private short[] T007C16_A7501AlbRecSec ;
   private boolean[] T007C16_n7501AlbRecSec ;
   private short[] T007C16_A1222AlbNumEti ;
   private String[] T007C16_A396EmprCod ;
   private int[] T007C16_A252CliCod ;
   private short[] T007C16_A840TrnCod ;
   private boolean[] T007C16_n840TrnCod ;
   private short[] T007C16_A970ProceCod ;
   private boolean[] T007C16_n970ProceCod ;
   private short[] T007C16_A1211TipEntCod ;
   private boolean[] T007C16_n1211TipEntCod ;
   private short[] T007C16_A2152AlbDetPie ;
   private java.math.BigDecimal[] T007C16_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T007C16_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T007C16_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T007C16_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] T007C16_A10758SumKgs ;
   private java.math.BigDecimal[] T007C16_A10759SumMts ;
   private short[] T007C16_A10760SumPzs ;
   private String[] T007C17_A279CliNom ;
   private String[] T007C18_A841TrnNom ;
   private boolean[] T007C18_n841TrnNom ;
   private String[] T007C19_A971ProceNom ;
   private boolean[] T007C19_n971ProceNom ;
   private String[] T007C20_A1212TipEntNom ;
   private boolean[] T007C20_n1212TipEntNom ;
   private short[] T007C22_A2152AlbDetPie ;
   private java.math.BigDecimal[] T007C22_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T007C22_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T007C22_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T007C22_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] T007C22_A10758SumKgs ;
   private java.math.BigDecimal[] T007C22_A10759SumMts ;
   private short[] T007C22_A10760SumPzs ;
   private String[] T007C23_A396EmprCod ;
   private int[] T007C23_A44AlbRecCod ;
   private boolean[] T007C23_n44AlbRecCod ;
   private int[] T007C9_A44AlbRecCod ;
   private boolean[] T007C9_n44AlbRecCod ;
   private String[] T007C9_A5806AlbREnt2 ;
   private String[] T007C9_A46AlbREnt ;
   private java.math.BigDecimal[] T007C9_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T007C9_A60AlbRUniUti ;
   private int[] T007C9_A52AlbRPieEnt ;
   private int[] T007C9_A54AlbRPieUti ;
   private byte[] T007C9_A47AlbREst ;
   private String[] T007C9_A56AlbRUni ;
   private String[] T007C9_A3613AlbRefDsc ;
   private java.util.Date[] T007C9_A49AlbRFen ;
   private java.util.Date[] T007C9_A4606AlbRHEn ;
   private boolean[] T007C9_n4606AlbRHEn ;
   private String[] T007C9_A45AlbRef ;
   private String[] T007C9_A1291AlbRDes ;
   private String[] T007C9_A50AlbRLoc ;
   private String[] T007C9_A55AlbRReo ;
   private java.util.Date[] T007C9_A48AlbRFecUlt ;
   private java.math.BigDecimal[] T007C9_A6180AlbrUniC ;
   private int[] T007C9_A6181AlbrPieC ;
   private short[] T007C9_A4920AlbRGrm2 ;
   private short[] T007C9_A4921AlbRAnc ;
   private short[] T007C9_A4922AlbPml ;
   private String[] T007C9_A6463AlbRLote ;
   private java.math.BigDecimal[] T007C9_A13241AlbRPh ;
   private boolean[] T007C9_n13241AlbRPh ;
   private java.math.BigDecimal[] T007C9_A13242AlbRRLong ;
   private boolean[] T007C9_n13242AlbRRLong ;
   private java.math.BigDecimal[] T007C9_A13243AlbRRTrans ;
   private boolean[] T007C9_n13243AlbRRTrans ;
   private String[] T007C9_A8029AlbNumM ;
   private int[] T007C9_A53AlbRPieReb ;
   private java.math.BigDecimal[] T007C9_A59AlbRUniReb ;
   private short[] T007C9_A10761AlbUltP ;
   private boolean[] T007C9_n10761AlbUltP ;
   private short[] T007C9_A7501AlbRecSec ;
   private boolean[] T007C9_n7501AlbRecSec ;
   private short[] T007C9_A1222AlbNumEti ;
   private String[] T007C9_A396EmprCod ;
   private int[] T007C9_A252CliCod ;
   private short[] T007C9_A840TrnCod ;
   private boolean[] T007C9_n840TrnCod ;
   private short[] T007C9_A970ProceCod ;
   private boolean[] T007C9_n970ProceCod ;
   private short[] T007C9_A1211TipEntCod ;
   private boolean[] T007C9_n1211TipEntCod ;
   private String[] T007C24_A396EmprCod ;
   private int[] T007C24_A44AlbRecCod ;
   private boolean[] T007C24_n44AlbRecCod ;
   private String[] T007C25_A396EmprCod ;
   private int[] T007C25_A44AlbRecCod ;
   private boolean[] T007C25_n44AlbRecCod ;
   private int[] T007C8_A44AlbRecCod ;
   private boolean[] T007C8_n44AlbRecCod ;
   private String[] T007C8_A5806AlbREnt2 ;
   private String[] T007C8_A46AlbREnt ;
   private java.math.BigDecimal[] T007C8_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T007C8_A60AlbRUniUti ;
   private int[] T007C8_A52AlbRPieEnt ;
   private int[] T007C8_A54AlbRPieUti ;
   private byte[] T007C8_A47AlbREst ;
   private String[] T007C8_A56AlbRUni ;
   private String[] T007C8_A3613AlbRefDsc ;
   private java.util.Date[] T007C8_A49AlbRFen ;
   private java.util.Date[] T007C8_A4606AlbRHEn ;
   private boolean[] T007C8_n4606AlbRHEn ;
   private String[] T007C8_A45AlbRef ;
   private String[] T007C8_A1291AlbRDes ;
   private String[] T007C8_A50AlbRLoc ;
   private String[] T007C8_A55AlbRReo ;
   private java.util.Date[] T007C8_A48AlbRFecUlt ;
   private java.math.BigDecimal[] T007C8_A6180AlbrUniC ;
   private int[] T007C8_A6181AlbrPieC ;
   private short[] T007C8_A4920AlbRGrm2 ;
   private short[] T007C8_A4921AlbRAnc ;
   private short[] T007C8_A4922AlbPml ;
   private String[] T007C8_A6463AlbRLote ;
   private java.math.BigDecimal[] T007C8_A13241AlbRPh ;
   private boolean[] T007C8_n13241AlbRPh ;
   private java.math.BigDecimal[] T007C8_A13242AlbRRLong ;
   private boolean[] T007C8_n13242AlbRRLong ;
   private java.math.BigDecimal[] T007C8_A13243AlbRRTrans ;
   private boolean[] T007C8_n13243AlbRRTrans ;
   private String[] T007C8_A8029AlbNumM ;
   private int[] T007C8_A53AlbRPieReb ;
   private java.math.BigDecimal[] T007C8_A59AlbRUniReb ;
   private short[] T007C8_A10761AlbUltP ;
   private boolean[] T007C8_n10761AlbUltP ;
   private short[] T007C8_A7501AlbRecSec ;
   private boolean[] T007C8_n7501AlbRecSec ;
   private short[] T007C8_A1222AlbNumEti ;
   private String[] T007C8_A396EmprCod ;
   private int[] T007C8_A252CliCod ;
   private short[] T007C8_A840TrnCod ;
   private boolean[] T007C8_n840TrnCod ;
   private short[] T007C8_A970ProceCod ;
   private boolean[] T007C8_n970ProceCod ;
   private short[] T007C8_A1211TipEntCod ;
   private boolean[] T007C8_n1211TipEntCod ;
   private String[] T007C29_A279CliNom ;
   private String[] T007C30_A841TrnNom ;
   private boolean[] T007C30_n841TrnNom ;
   private String[] T007C31_A971ProceNom ;
   private boolean[] T007C31_n971ProceNom ;
   private String[] T007C32_A1212TipEntNom ;
   private boolean[] T007C32_n1212TipEntNom ;
   private short[] T007C34_A2152AlbDetPie ;
   private java.math.BigDecimal[] T007C34_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T007C34_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T007C34_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T007C34_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] T007C34_A10758SumKgs ;
   private java.math.BigDecimal[] T007C34_A10759SumMts ;
   private short[] T007C34_A10760SumPzs ;
   private String[] T007C35_A396EmprCod ;
   private int[] T007C35_A13026PedDGId ;
   private int[] T007C35_A44AlbRecCod ;
   private boolean[] T007C35_n44AlbRecCod ;
   private String[] T007C36_A396EmprCod ;
   private int[] T007C36_A11669DevCruId ;
   private int[] T007C36_A44AlbRecCod ;
   private boolean[] T007C36_n44AlbRecCod ;
   private String[] T007C37_A396EmprCod ;
   private int[] T007C37_A44AlbRecCod ;
   private boolean[] T007C37_n44AlbRecCod ;
   private String[] T007C37_A9743Emp_CUb ;
   private short[] T007C37_A5860Emp_Anp ;
   private String[] T007C38_A396EmprCod ;
   private int[] T007C38_A44AlbRecCod ;
   private boolean[] T007C38_n44AlbRecCod ;
   private String[] T007C38_A7130MatC_Pz ;
   private String[] T007C39_A396EmprCod ;
   private int[] T007C39_A44AlbRecCod ;
   private boolean[] T007C39_n44AlbRecCod ;
   private String[] T007C39_A7132MatC_Talla ;
   private String[] T007C40_A396EmprCod ;
   private int[] T007C40_A44AlbRecCod ;
   private boolean[] T007C40_n44AlbRecCod ;
   private short[] T007C40_A7115MatC_Lin ;
   private String[] T007C41_A396EmprCod ;
   private long[] T007C41_A30AlbProCod ;
   private int[] T007C41_A129BarCod ;
   private byte[] T007C41_A132BarCodReo ;
   private String[] T007C41_A130BarCodPar ;
   private short[] T007C41_A6622AlbHdRLn ;
   private String[] T007C42_A396EmprCod ;
   private int[] T007C42_A6235DevEmpCod ;
   private byte[] T007C42_A6243DevNumLin ;
   private String[] T007C43_A396EmprCod ;
   private int[] T007C43_A44AlbRecCod ;
   private boolean[] T007C43_n44AlbRecCod ;
   private short[] T007C43_A4596AlbRDefCod ;
   private String[] T007C44_A396EmprCod ;
   private int[] T007C44_A44AlbRecCod ;
   private boolean[] T007C44_n44AlbRecCod ;
   private String[] T007C44_A2159AlbRecPie ;
   private short[] T007C44_A4395AlRDefCod ;
   private String[] T007C44_A4412AlRFasCod ;
   private String[] T007C45_A396EmprCod ;
   private int[] T007C45_A44AlbRecCod ;
   private boolean[] T007C45_n44AlbRecCod ;
   private short[] T007C45_A2165HisEmpLin ;
   private String[] T007C46_A396EmprCod ;
   private int[] T007C46_A44AlbRecCod ;
   private boolean[] T007C46_n44AlbRecCod ;
   private byte[] T007C46_A1299AlbRLin ;
   private String[] T007C47_A396EmprCod ;
   private int[] T007C47_A361DisCod ;
   private int[] T007C47_A44AlbRecCod ;
   private boolean[] T007C47_n44AlbRecCod ;
   private String[] T007C48_A396EmprCod ;
   private int[] T007C48_A323DevGenCod ;
   private String[] T007C49_A396EmprCod ;
   private int[] T007C49_A129BarCod ;
   private byte[] T007C49_A132BarCodReo ;
   private String[] T007C49_A130BarCodPar ;
   private String[] T007C49_A200BarPieCod ;
   private String[] T007C51_A396EmprCod ;
   private int[] T007C51_A44AlbRecCod ;
   private boolean[] T007C51_n44AlbRecCod ;
   private String[] T007C52_A4795AlRPieCal ;
   private int[] T007C52_A44AlbRecCod ;
   private boolean[] T007C52_n44AlbRecCod ;
   private String[] T007C52_A2159AlbRecPie ;
   private short[] T007C52_A2154AlbRecAnh ;
   private short[] T007C52_A10762AlbPCont ;
   private java.math.BigDecimal[] T007C52_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T007C52_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T007C52_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T007C52_A2156AlbRecKgmU ;
   private String[] T007C52_A8779Bod_Talla ;
   private short[] T007C52_A8780Bod_Und ;
   private short[] T007C52_A3730AlbRecCol ;
   private String[] T007C52_A3731AlbRecIdPz ;
   private int[] T007C52_A3732AlbRecIdRc ;
   private java.math.BigDecimal[] T007C52_A4410AlbRecPal ;
   private String[] T007C52_A10180AlRPieTelT ;
   private int[] T007C52_A10149AlRPieCon ;
   private String[] T007C52_A10181AlRPieOri ;
   private String[] T007C52_A10182AlRPieDst ;
   private java.math.BigDecimal[] T007C52_A10183AlrPieKgmT ;
   private String[] T007C52_A7408ALRPIELOC ;
   private String[] T007C52_A396EmprCod ;
   private int[] T007C5_A4806AlRPieDefC ;
   private boolean[] T007C5_n4806AlRPieDefC ;
   private int[] T007C54_A4806AlRPieDefC ;
   private boolean[] T007C54_n4806AlRPieDefC ;
   private String[] T007C55_A396EmprCod ;
   private int[] T007C55_A44AlbRecCod ;
   private boolean[] T007C55_n44AlbRecCod ;
   private String[] T007C55_A2159AlbRecPie ;
   private String[] T007C3_A4795AlRPieCal ;
   private int[] T007C3_A44AlbRecCod ;
   private boolean[] T007C3_n44AlbRecCod ;
   private String[] T007C3_A2159AlbRecPie ;
   private short[] T007C3_A2154AlbRecAnh ;
   private short[] T007C3_A10762AlbPCont ;
   private java.math.BigDecimal[] T007C3_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T007C3_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T007C3_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T007C3_A2156AlbRecKgmU ;
   private String[] T007C3_A8779Bod_Talla ;
   private short[] T007C3_A8780Bod_Und ;
   private short[] T007C3_A3730AlbRecCol ;
   private String[] T007C3_A3731AlbRecIdPz ;
   private int[] T007C3_A3732AlbRecIdRc ;
   private java.math.BigDecimal[] T007C3_A4410AlbRecPal ;
   private String[] T007C3_A10180AlRPieTelT ;
   private int[] T007C3_A10149AlRPieCon ;
   private String[] T007C3_A10181AlRPieOri ;
   private String[] T007C3_A10182AlRPieDst ;
   private java.math.BigDecimal[] T007C3_A10183AlrPieKgmT ;
   private String[] T007C3_A7408ALRPIELOC ;
   private String[] T007C3_A396EmprCod ;
   private String[] T007C2_A4795AlRPieCal ;
   private int[] T007C2_A44AlbRecCod ;
   private boolean[] T007C2_n44AlbRecCod ;
   private String[] T007C2_A2159AlbRecPie ;
   private short[] T007C2_A2154AlbRecAnh ;
   private short[] T007C2_A10762AlbPCont ;
   private java.math.BigDecimal[] T007C2_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T007C2_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T007C2_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T007C2_A2156AlbRecKgmU ;
   private String[] T007C2_A8779Bod_Talla ;
   private short[] T007C2_A8780Bod_Und ;
   private short[] T007C2_A3730AlbRecCol ;
   private String[] T007C2_A3731AlbRecIdPz ;
   private int[] T007C2_A3732AlbRecIdRc ;
   private java.math.BigDecimal[] T007C2_A4410AlbRecPal ;
   private String[] T007C2_A10180AlRPieTelT ;
   private int[] T007C2_A10149AlRPieCon ;
   private String[] T007C2_A10181AlRPieOri ;
   private String[] T007C2_A10182AlRPieDst ;
   private java.math.BigDecimal[] T007C2_A10183AlrPieKgmT ;
   private String[] T007C2_A7408ALRPIELOC ;
   private String[] T007C2_A396EmprCod ;
   private int[] T007C60_A4806AlRPieDefC ;
   private boolean[] T007C60_n4806AlRPieDefC ;
   private String[] T007C61_A396EmprCod ;
   private int[] T007C61_A44AlbRecCod ;
   private boolean[] T007C61_n44AlbRecCod ;
   private String[] T007C61_A2159AlbRecPie ;
   private int[] T007C61_A10188AlRFibOrd ;
   private String[] T007C62_A396EmprCod ;
   private int[] T007C62_A44AlbRecCod ;
   private boolean[] T007C62_n44AlbRecCod ;
   private String[] T007C62_A2159AlbRecPie ;
   private String[] T007C62_A9568CodHilz ;
   private String[] T007C63_A396EmprCod ;
   private int[] T007C63_A44AlbRecCod ;
   private boolean[] T007C63_n44AlbRecCod ;
   private String[] T007C63_A2159AlbRecPie ;
   private byte[] T007C63_A7697AlREtiTpo ;
   private String[] T007C64_A396EmprCod ;
   private int[] T007C64_A44AlbRecCod ;
   private boolean[] T007C64_n44AlbRecCod ;
   private String[] T007C64_A2159AlbRecPie ;
   private short[] T007C64_A5262AlbRecEvt ;
   private String[] T007C65_A396EmprCod ;
   private int[] T007C65_A44AlbRecCod ;
   private boolean[] T007C65_n44AlbRecCod ;
   private String[] T007C65_A2159AlbRecPie ;
   private short[] T007C65_A4395AlRDefCod ;
   private String[] T007C65_A4412AlRFasCod ;
   private String[] T007C66_A396EmprCod ;
   private int[] T007C66_A44AlbRecCod ;
   private boolean[] T007C66_n44AlbRecCod ;
   private String[] T007C66_A2159AlbRecPie ;
   private String[] T007C67_A396EmprCod ;
   private int[] T007C67_A252CliCod ;
   private String[] T007C67_A279CliNom ;
   private String[] T007C68_A396EmprCod ;
   private int[] T007C68_A252CliCod ;
   private String[] T007C68_A65ArtCod ;
   private String[] T007C68_A69ArtDsc ;
   private boolean[] T007C68_n69ArtDsc ;
   private short[] T007C68_A829TipArtCod ;
   private String[] T007C69_A396EmprCod ;
   private short[] T007C69_A970ProceCod ;
   private boolean[] T007C69_n970ProceCod ;
   private String[] T007C69_A971ProceNom ;
   private boolean[] T007C69_n971ProceNom ;
   private String[] T007C70_A396EmprCod ;
   private short[] T007C70_A840TrnCod ;
   private boolean[] T007C70_n840TrnCod ;
   private String[] T007C70_A841TrnNom ;
   private boolean[] T007C70_n841TrnNom ;
   private String[] T007C71_A396EmprCod ;
   private short[] T007C71_A1211TipEntCod ;
   private boolean[] T007C71_n1211TipEntCod ;
   private String[] T007C71_A1212TipEntNom ;
   private boolean[] T007C71_n1212TipEntNom ;
   private short[] T007C73_A2152AlbDetPie ;
   private java.math.BigDecimal[] T007C73_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T007C73_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T007C73_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T007C73_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] T007C73_A10758SumKgs ;
   private java.math.BigDecimal[] T007C73_A10759SumMts ;
   private short[] T007C73_A10760SumPzs ;
   private String[] T007C74_A279CliNom ;
   private String[] T007C75_A971ProceNom ;
   private boolean[] T007C75_n971ProceNom ;
   private String[] T007C76_A841TrnNom ;
   private boolean[] T007C76_n841TrnNom ;
   private String[] T007C77_A1212TipEntNom ;
   private boolean[] T007C77_n1212TipEntNom ;
   private int[] T007C78_Gx_cnt ;
   private int[] T007C79_Gx_cnt ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV115WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV116TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV122TrnContextAtt ;
}

final  class talbdet__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbdet__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbdet__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbdet__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbdet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T007C2", "SELECT AlRPieCal, AlbRecCod, AlbRecPie, AlbRecAnh, AlbPCont, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, Bod_Talla, Bod_Und, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, ALRPIELOC, EmprCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlRPieCal, AlbRecAnh, AlbPCont, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, Bod_Talla, Bod_Und, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, ALRPIELOC, AlRPieDefC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C3", "SELECT AlRPieCal, AlbRecCod, AlbRecPie, AlbRecAnh, AlbPCont, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, Bod_Talla, Bod_Und, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, ALRPIELOC, EmprCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C5", "SELECT COALESCE( T1.AlRPieDefC, 0) AS AlRPieDefC FROM (SELECT SUM(AlRDefCru) AS AlRPieDefC, EmprCod, AlbRecCod, AlbRecPie FROM TXPAlRPie GROUP BY EmprCod, AlbRecCod, AlbRecPie ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? AND T1.AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C7", "SELECT COALESCE( T1.GXC1, 0) AS AlbDetPie, COALESCE( T1.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T1.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T1.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T1.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T1.AlbDetKgm, 0) AS SumKgs, COALESCE( T1.AlbDetMtr, 0) AS SumMts, COALESCE( T1.SumPzs, 0) AS SumPzs FROM (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtr) AS AlbDetMtr, COUNT(*) AS SumPzs FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C8", "SELECT AlbRecCod, AlbREnt2, AlbREnt, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst, AlbRUni, AlbRefDsc, AlbRFen, AlbRHEn, AlbRef, AlbRDes, AlbRLoc, AlbRReo, AlbRFecUlt, AlbrUniC, AlbrPieC, AlbRGrm2, AlbRAnc, AlbPml, AlbRLote, AlbRPh, AlbRRLong, AlbRRTrans, AlbNumM, AlbRPieReb, AlbRUniReb, AlbUltP, AlbRecSec, AlbNumEti, EmprCod, CliCod, TrnCod, ProceCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbREnt2, AlbREnt, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst, AlbRUni, AlbRefDsc, AlbRFen, AlbRHEn, AlbRef, AlbRDes, AlbRLoc, AlbRReo, AlbRFecUlt, AlbrUniC, AlbrPieC, AlbRGrm2, AlbRAnc, AlbPml, AlbRLote, AlbRPh, AlbRRLong, AlbRRTrans, AlbNumM, AlbRPieReb, AlbRUniReb, AlbUltP, AlbRecSec, AlbNumEti, CliCod, TrnCod, ProceCod, TipEntCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C9", "SELECT AlbRecCod, AlbREnt2, AlbREnt, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst, AlbRUni, AlbRefDsc, AlbRFen, AlbRHEn, AlbRef, AlbRDes, AlbRLoc, AlbRReo, AlbRFecUlt, AlbrUniC, AlbrPieC, AlbRGrm2, AlbRAnc, AlbPml, AlbRLote, AlbRPh, AlbRRLong, AlbRRTrans, AlbNumM, AlbRPieReb, AlbRUniReb, AlbUltP, AlbRecSec, AlbNumEti, EmprCod, CliCod, TrnCod, ProceCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C11", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C12", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C13", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C14", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C16", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbRecCod, TM1.AlbREnt2, TM1.AlbREnt, TM1.AlbRUniEnt, TM1.AlbRUniUti, TM1.AlbRPieEnt, TM1.AlbRPieUti, TM1.AlbREst, TM1.AlbRUni, TM1.AlbRefDsc, T2.EmprNom, TM1.AlbRFen, TM1.AlbRHEn, T4.CliNom, TM1.AlbRef, T5.ProceNom, T6.TrnNom, T7.TipEntNom, TM1.AlbRDes, TM1.AlbRLoc, TM1.AlbRReo, TM1.AlbRFecUlt, TM1.AlbrUniC, TM1.AlbrPieC, TM1.AlbRGrm2, TM1.AlbRAnc, TM1.AlbPml, TM1.AlbRLote, TM1.AlbRPh, TM1.AlbRRLong, TM1.AlbRRTrans, TM1.AlbNumM, TM1.AlbRPieReb, TM1.AlbRUniReb, TM1.AlbUltP, TM1.AlbRecSec, TM1.AlbNumEti, TM1.EmprCod, TM1.CliCod, TM1.TrnCod, TM1.ProceCod, TM1.TipEntCod, COALESCE( T3.GXC1, 0) AS AlbDetPie, COALESCE( T3.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T3.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T3.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T3.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T3.AlbDetKgm, 0) AS SumKgs, COALESCE( T3.AlbDetMtr, 0) AS SumMts, COALESCE( T3.SumPzs, 0) AS SumPzs FROM ((((((TXPALBREC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtr) AS AlbDetMtr, COUNT(*) AS SumPzs FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbRecCod = TM1.AlbRecCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProceCod = TM1.ProceCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.TrnCod) LEFT JOIN TXPENTRAD T7 ON T7.EmprCod = TM1.EmprCod AND T7.TipEntCod = TM1.TipEntCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C17", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C18", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C19", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C20", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C22", "SELECT COALESCE( T1.GXC1, 0) AS AlbDetPie, COALESCE( T1.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T1.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T1.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T1.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T1.AlbDetKgm, 0) AS SumKgs, COALESCE( T1.AlbDetMtr, 0) AS SumMts, COALESCE( T1.SumPzs, 0) AS SumPzs FROM (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtr) AS AlbDetMtr, COUNT(*) AS SumPzs FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C23", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C24", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE ( AlbRecCod > ?) and EmprCod = ? ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C25", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE ( AlbRecCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T007C26", "INSERT INTO TXPALBREC(AlbRecCod, AlbREnt2, AlbREnt, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst, AlbRUni, AlbRefDsc, AlbRFen, AlbRHEn, AlbRef, AlbRDes, AlbRLoc, AlbRReo, AlbRFecUlt, AlbrUniC, AlbrPieC, AlbRGrm2, AlbRAnc, AlbPml, AlbRLote, AlbRPh, AlbRRLong, AlbRRTrans, AlbNumM, AlbRPieReb, AlbRUniReb, AlbUltP, AlbRecSec, AlbNumEti, EmprCod, CliCod, TrnCod, ProceCod, TipEntCod, AlbRUlin, HisEmpULin, AlbRDisCli, AlbRImp, AlbPmPPza, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, ClasCod, AlbRPre, AlbRAju, AlbRRep, AlbrUsu, AlbrHor, AlbrNF, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, MatC_ULin, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Bod_UltPz, Emp_Item1, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, Cod_mta, AlbOEKOTEX, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ')", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T007C27", "UPDATE TXPALBREC SET AlbREnt2=?, AlbREnt=?, AlbRUniEnt=?, AlbRUniUti=?, AlbRPieEnt=?, AlbRPieUti=?, AlbREst=?, AlbRUni=?, AlbRefDsc=?, AlbRFen=?, AlbRHEn=?, AlbRef=?, AlbRDes=?, AlbRLoc=?, AlbRReo=?, AlbRFecUlt=?, AlbrUniC=?, AlbrPieC=?, AlbRGrm2=?, AlbRAnc=?, AlbPml=?, AlbRLote=?, AlbRPh=?, AlbRRLong=?, AlbRRTrans=?, AlbNumM=?, AlbRPieReb=?, AlbRUniReb=?, AlbUltP=?, AlbRecSec=?, AlbNumEti=?, CliCod=?, TrnCod=?, ProceCod=?, TipEntCod=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T007C28", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T007C29", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C30", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C31", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C32", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C34", "SELECT COALESCE( T1.GXC1, 0) AS AlbDetPie, COALESCE( T1.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T1.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T1.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T1.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T1.AlbDetKgm, 0) AS SumKgs, COALESCE( T1.AlbDetMtr, 0) AS SumMts, COALESCE( T1.SumPzs, 0) AS SumPzs FROM (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtr) AS AlbDetMtr, COUNT(*) AS SumPzs FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C35", "SELECT * FROM (SELECT EmprCod, PedDGId, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C36", "SELECT * FROM (SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C37", "SELECT * FROM (SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C38", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Pz FROM TXPREPPZS WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C39", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Talla FROM TXPREPTAL WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C40", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Lin FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C41", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C42", "SELECT * FROM (SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C43", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C44", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod FROM TXPAlRPie WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C45", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C46", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C47", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C48", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C49", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T007C50", "UPDATE TXPALBREC SET AlbUltP=?, AlbRUniEnt=?, AlbRUniUti=?, AlbRPieEnt=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T007C51", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C52", "SELECT AlRPieCal, AlbRecCod, AlbRecPie, AlbRecAnh, AlbPCont, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, Bod_Talla, Bod_Und, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, ALRPIELOC, EmprCod FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C54", "SELECT COALESCE( T1.AlRPieDefC, 0) AS AlRPieDefC FROM (SELECT SUM(AlRDefCru) AS AlRPieDefC, EmprCod, AlbRecCod, AlbRecPie FROM TXPAlRPie GROUP BY EmprCod, AlbRecCod, AlbRecPie ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? AND T1.AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C55", "SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T007C56", "INSERT INTO TXPALBDET(AlRPieCal, AlbRecCod, AlbRecPie, AlbRecAnh, AlbPCont, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, Bod_Talla, Bod_Und, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, ALRPIELOC, EmprCod, AlRPieDefC, AlRPieClaM, AlRPieUltC, AlRPieDefT, AlRExp1, AlRExp2, AlbRecFec, AlbRecPar, AlbRecCue, ALRPIETEL, ALRPIEOPE, ALRPIEST, AlbRecPnt, AlbRecCo1, AlbRecCo2, AlbHdr, AlbHdrr, AlbHdrp, AlbSerT, AlbColNm, AlbColNn, AlbKgsPf, AlbMtsPf, AlbAfin, AlbNPed, AlbObsp, Bod_Dib, Bod_Tua, Bod_Tub, Bod_Tuc, Bod_Hilz, Bod_FecE, Bod_PedOr, Bod_Rack, Bod_PoS, Bod_Ok, Bod_Medt, Bod_ColNNn, Bod_Por, Bod_codb, Bod_Pes, Bod_DibO, Bod_item3, Bod_ToE, Bod_DescP, Bod_CVar, Bod_NVar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPALBDET")
         ,new UpdateCursor("T007C57", "UPDATE TXPALBDET SET AlRPieCal=?, AlbRecAnh=?, AlbPCont=?, AlbRecMtr=?, AlbRecKgm=?, AlbRecMtrU=?, AlbRecKgmU=?, Bod_Talla=?, Bod_Und=?, AlbRecCol=?, AlbRecIdPz=?, AlbRecIdRc=?, AlbRecPal=?, AlRPieTelT=?, AlRPieCon=?, AlRPieOri=?, AlRPieDst=?, AlrPieKgmT=?, ALRPIELOC=?, AlRPieDefC=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new UpdateCursor("T007C58", "DELETE FROM TXPALBDET  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new ForEachCursor("T007C60", "SELECT COALESCE( T1.AlRPieDefC, 0) AS AlRPieDefC FROM (SELECT SUM(AlRDefCru) AS AlRPieDefC, EmprCod, AlbRecCod, AlbRecPie FROM TXPAlRPie GROUP BY EmprCod, AlbRecCod, AlbRecPie ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? AND T1.AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C61", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRFibOrd FROM TXPAlrPiF WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C62", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, CodHilz FROM TXPHILZPZ WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C63", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlREtiTpo FROM TXPAlRPi1 WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C64", "SELECT * FROM (SELECT EmprCod, albreccod, AlbRecPie, AlbRecEvt FROM TXPALRHIS WHERE EmprCod = ? AND albreccod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C65", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod FROM TXPAlRPie WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007C66", "SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C67", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? ORDER BY CliNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C68", "SELECT EmprCod, CliCod, ArtCod, ArtDsc, TipArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? ORDER BY ArtDsc ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C69", "SELECT EmprCod, ProceCod, ProceNom FROM TXPPROCED WHERE EmprCod = ? ORDER BY ProceNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C70", "SELECT EmprCod, TrnCod, TrnNom FROM TXPTRANSP WHERE EmprCod = ? ORDER BY TrnNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C71", "SELECT EmprCod, TipEntCod, TipEntNom FROM TXPENTRAD WHERE EmprCod = ? ORDER BY TipEntNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C73", "SELECT COALESCE( T1.GXC1, 0) AS AlbDetPie, COALESCE( T1.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T1.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T1.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T1.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T1.AlbDetKgm, 0) AS SumKgs, COALESCE( T1.AlbDetMtr, 0) AS SumMts, COALESCE( T1.SumPzs, 0) AS SumPzs FROM (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtr) AS AlbDetMtr, COUNT(*) AS SumPzs FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C74", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C75", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C76", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C77", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C78", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecKgm = AlbRecKgmU) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007C79", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecMtr = AlbRecMtrU) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 15);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 10);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[20])[0] = rslt.getString(21, 10);
               ((String[]) buf[21])[0] = rslt.getString(22, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 15);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 10);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[20])[0] = rslt.getString(21, 10);
               ((String[]) buf[21])[0] = rslt.getString(22, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((String[]) buf[15])[0] = rslt.getString(15, 10);
               ((String[]) buf[16])[0] = rslt.getString(16, 2);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 20);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(27, 10);
               ((int[]) buf[31])[0] = rslt.getInt(28);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(29,2);
               ((short[]) buf[33])[0] = rslt.getShort(30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(31);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(32);
               ((String[]) buf[38])[0] = rslt.getString(33, 3);
               ((int[]) buf[39])[0] = rslt.getInt(34);
               ((short[]) buf[40])[0] = rslt.getShort(35);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(36);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(37);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((String[]) buf[15])[0] = rslt.getString(15, 10);
               ((String[]) buf[16])[0] = rslt.getString(16, 2);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 20);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(27, 10);
               ((int[]) buf[31])[0] = rslt.getInt(28);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(29,2);
               ((short[]) buf[33])[0] = rslt.getShort(30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(31);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(32);
               ((String[]) buf[38])[0] = rslt.getString(33, 3);
               ((int[]) buf[39])[0] = rslt.getInt(34);
               ((short[]) buf[40])[0] = rslt.getShort(35);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(36);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(37);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 30);
               ((String[]) buf[16])[0] = rslt.getString(15, 16);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(18, 25);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 20);
               ((String[]) buf[24])[0] = rslt.getString(20, 10);
               ((String[]) buf[25])[0] = rslt.getString(21, 2);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(22);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[28])[0] = rslt.getInt(24);
               ((short[]) buf[29])[0] = rslt.getShort(25);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((short[]) buf[31])[0] = rslt.getShort(27);
               ((String[]) buf[32])[0] = rslt.getString(28, 20);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(32, 10);
               ((int[]) buf[40])[0] = rslt.getInt(33);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(34,2);
               ((short[]) buf[42])[0] = rslt.getShort(35);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(36);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((short[]) buf[46])[0] = rslt.getShort(37);
               ((String[]) buf[47])[0] = rslt.getString(38, 3);
               ((int[]) buf[48])[0] = rslt.getInt(39);
               ((short[]) buf[49])[0] = rslt.getShort(40);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(41);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(42);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(43);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(44,2);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(45,2);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(46,2);
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(47,2);
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(48,2);
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(49,2);
               ((short[]) buf[62])[0] = rslt.getShort(50);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 15);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 10);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[20])[0] = rslt.getString(21, 10);
               ((String[]) buf[21])[0] = rslt.getString(22, 3);
               return;
            case 46 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 51 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 25);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 63 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 68 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 69 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
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
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
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
            case 9 :
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 15 :
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
               return;
            case 17 :
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
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
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
               stmt.setString(2, (String)parms[2], 3);
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
               stmt.setString(2, (String)parms[2], 20);
               stmt.setString(3, (String)parms[3], 8);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setString(9, (String)parms[9], 1);
               stmt.setString(10, (String)parms[10], 26);
               stmt.setDate(11, (java.util.Date)parms[11]);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[13], false);
               }
               stmt.setString(13, (String)parms[14], 16);
               stmt.setString(14, (String)parms[15], 20);
               stmt.setString(15, (String)parms[16], 10);
               stmt.setString(16, (String)parms[17], 2);
               stmt.setDate(17, (java.util.Date)parms[18]);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[19], 2);
               stmt.setInt(19, ((Number) parms[20]).intValue());
               stmt.setShort(20, ((Number) parms[21]).shortValue());
               stmt.setShort(21, ((Number) parms[22]).shortValue());
               stmt.setShort(22, ((Number) parms[23]).shortValue());
               stmt.setString(23, (String)parms[24], 20);
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[30], 2);
               }
               stmt.setString(27, (String)parms[31], 10);
               stmt.setInt(28, ((Number) parms[32]).intValue());
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[33], 2);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[37]).shortValue());
               }
               stmt.setShort(32, ((Number) parms[38]).shortValue());
               stmt.setString(33, (String)parms[39], 3);
               stmt.setInt(34, ((Number) parms[40]).intValue());
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[42]).shortValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[44]).shortValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[46]).shortValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 26);
               stmt.setDate(10, (java.util.Date)parms[9]);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[11], false);
               }
               stmt.setString(12, (String)parms[12], 16);
               stmt.setString(13, (String)parms[13], 20);
               stmt.setString(14, (String)parms[14], 10);
               stmt.setString(15, (String)parms[15], 2);
               stmt.setDate(16, (java.util.Date)parms[16]);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[17], 2);
               stmt.setInt(18, ((Number) parms[18]).intValue());
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               stmt.setShort(20, ((Number) parms[20]).shortValue());
               stmt.setShort(21, ((Number) parms[21]).shortValue());
               stmt.setString(22, (String)parms[22], 20);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[28], 2);
               }
               stmt.setString(26, (String)parms[29], 10);
               stmt.setInt(27, ((Number) parms[30]).intValue());
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[31], 2);
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[35]).shortValue());
               }
               stmt.setShort(31, ((Number) parms[36]).shortValue());
               stmt.setInt(32, ((Number) parms[37]).intValue());
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[43]).shortValue());
               }
               stmt.setString(36, (String)parms[44], 3);
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(37, ((Number) parms[46]).intValue());
               }
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
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
            case 25 :
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 28 :
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
            case 29 :
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
            case 31 :
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
               return;
            case 35 :
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
            case 37 :
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
            case 38 :
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
            case 39 :
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
            case 40 :
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
            case 41 :
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
            case 42 :
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
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 3);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[9]).intValue());
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 16);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               stmt.setString(10, (String)parms[10], 4);
               stmt.setShort(11, ((Number) parms[11]).shortValue());
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setString(13, (String)parms[13], 15);
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setString(16, (String)parms[16], 1);
               stmt.setInt(17, ((Number) parms[17]).intValue());
               stmt.setString(18, (String)parms[18], 10);
               stmt.setString(19, (String)parms[19], 10);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[20], 2);
               stmt.setString(21, (String)parms[21], 10);
               stmt.setString(22, (String)parms[22], 3);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[24]).intValue());
               }
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 4);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 15);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setString(16, (String)parms[15], 10);
               stmt.setString(17, (String)parms[16], 10);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               stmt.setString(19, (String)parms[18], 10);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[20]).intValue());
               }
               stmt.setString(21, (String)parms[21], 3);
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[23]).intValue());
               }
               stmt.setString(23, (String)parms[24], 9);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 57 :
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
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 63 :
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
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 65 :
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
            case 66 :
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
            case 67 :
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
            case 68 :
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
            case 69 :
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

