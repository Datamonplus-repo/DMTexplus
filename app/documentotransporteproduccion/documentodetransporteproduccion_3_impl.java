package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_3_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action55") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         AV8AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbProCod), 10, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbProCod), "ZZZZZZZZZ9")));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_55_1U7195( AV7EmprCod, AV8AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action60") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_60_1U7195( Gx_mode, AV7EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action70") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         AV30FlagFas = (short)(GXutil.lval( httpContext.GetPar( "FlagFas"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30FlagFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagFas), 4, 0));
         AV31Moda21 = (byte)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Moda21", GXutil.str( AV31Moda21, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Moda21), "9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_70_1U7195( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV30FlagFas, AV31Moda21) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action71") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         AV30FlagFas = (short)(GXutil.lval( httpContext.GetPar( "FlagFas"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30FlagFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagFas), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_71_1U7195( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV30FlagFas) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action72") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         AV30FlagFas = (short)(GXutil.lval( httpContext.GetPar( "FlagFas"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30FlagFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagFas), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_72_1U7195( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV30FlagFas) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action73") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2839AlbProVal = httpContext.GetPar( "AlbProVal") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_73_1U7195( Gx_mode, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2839AlbProVal) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action74") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1261BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1263BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         AV22UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22UsurCod, "@!"))));
         AV20Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Station, ""))));
         AV31Moda21 = (byte)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Moda21", GXutil.str( AV31Moda21, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Moda21), "9")));
         AV37MetAnt = CommonUtil.decimalVal( httpContext.GetPar( "MetAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37MetAnt", GXutil.ltrimstr( AV37MetAnt, 9, 2));
         AV36KilAnt = CommonUtil.decimalVal( httpContext.GetPar( "KilAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36KilAnt", GXutil.ltrimstr( AV36KilAnt, 9, 2));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_74_1U7195( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A1261BarAlbKgmE, A1263BarAlbMtrE, AV22UsurCod, AV20Station, AV31Moda21, AV37MetAnt, AV36KilAnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action75") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1261BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1263BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         A1265BarAlbPie = (int)(GXutil.lval( httpContext.GetPar( "BarAlbPie"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
         AV36KilAnt = CommonUtil.decimalVal( httpContext.GetPar( "KilAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36KilAnt", GXutil.ltrimstr( AV36KilAnt, 9, 2));
         AV37MetAnt = CommonUtil.decimalVal( httpContext.GetPar( "MetAnt"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37MetAnt", GXutil.ltrimstr( AV37MetAnt, 9, 2));
         AV38PieAnt = (int)(GXutil.lval( httpContext.GetPar( "PieAnt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38PieAnt), 6, 0));
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_75_1U7195( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A1261BarAlbKgmE, A1263BarAlbMtrE, A1265BarAlbPie, AV36KilAnt, AV37MetAnt, AV38PieAnt, Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"PZSENTREGA") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asapzsentrega1U7195( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"MTSENTREGA") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asamtsentrega1U7195( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"KGSENTREGA") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asakgsentrega1U7195( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"KGSHDR") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asakgshdr1U7195( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"ALBCOLORCV") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asaalbcolorcv1U7195( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"PEDIDOCLIE") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
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
         gx8asapedidoclie1U7195( A396EmprCod, A4812BarEncCli, A143BarDisNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_78") == 0 )
      {
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_78( A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_80") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_80( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_81") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1206TubCod = (short)(GXutil.lval( httpContext.GetPar( "TubCod"))) ;
         n1206TubCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_81( A396EmprCod, A1206TubCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_82") == 0 )
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
         gxload_82( A396EmprCod, A30AlbProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_84") == 0 )
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
         gxload_84( A1253EmprGuiRem, A1243GuiRemCli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_83") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3153CodCod = httpContext.GetPar( "CodCod") ;
         n3153CodCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3153CodCod", A3153CodCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_83( A396EmprCod, A3153CodCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_85") == 0 )
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
         gxload_85( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_86") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_86( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_87") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_87( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
            AV8AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbProCod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbProCod), "ZZZZZZZZZ9")));
            AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
            AV10BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarCodReo), "9")));
            AV11BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodPar", AV11BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11BarCodPar, ""))));
            AV23Guiremcli = (int)(GXutil.lval( httpContext.GetPar( "Guiremcli"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Guiremcli), 6, 0));
            AV24GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24GuiRemCln", AV24GuiRemCln);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24GuiRemCln, ""))));
            AV25AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25AlbProFch", localUtil.format(AV25AlbProFch, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV25AlbProFch));
            AV26AlbSec = httpContext.GetPar( "AlbSec") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26AlbSec", AV26AlbSec);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26AlbSec, "@!"))));
            AV27AlbProPri = httpContext.GetPar( "AlbProPri") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27AlbProPri", AV27AlbProPri);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27AlbProPri, "9"))));
            AV28AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28AlbEnvFtp", GXutil.str( AV28AlbEnvFtp, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28AlbEnvFtp), "9")));
            AV29AlbLic = httpContext.GetPar( "AlbLic") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29AlbLic", AV29AlbLic);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29AlbLic, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Detalle de Producciones", ""), (short)(0)) ;
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

   public documentodetransporteproduccion_3_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_3_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_3_impl.class ));
   }

   public documentodetransporteproduccion_3_impl( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavClifacmtsp = UIFactory.getCheckbox(this);
      cmbAlbProVal = new HTMLChoice();
      chkBarTipCor = UIFactory.getCheckbox(this);
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
      AV35CliFacMtsP = ((GXutil.strcmp(GXutil.rtrim( AV35CliFacMtsP), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35CliFacMtsP", AV35CliFacMtsP);
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
         A2839AlbProVal = cmbAlbProVal.getValidValue(A2839AlbProVal) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), true);
      }
      A5291BarTipCor = ((GXutil.strcmp(GXutil.rtrim( A5291BarTipCor), "SI")==0) ? "SI" : "NO") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuiremcli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavGuiremcli_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV23Guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuiremcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23Guiremcli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV23Guiremcli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuiremcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGuiremcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbpropri_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavAlbpropri_Internalname, httpContext.getMessage( "Prioridad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbpropri_Internalname, GXutil.rtrim( AV27AlbProPri), GXutil.rtrim( localUtil.format( AV27AlbProPri, "9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbpropri_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbpropri_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavClifacmtsp.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkavClifacmtsp.getInternalname(), httpContext.getMessage( "Fatura Metros PL?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavClifacmtsp.getInternalname(), AV35CliFacMtsP, "", httpContext.getMessage( "Fatura Metros PL?", ""), 1, chkavClifacmtsp.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnverpiezas_Internalname, "", httpContext.getMessage( "Ver Peças", ""), bttBtnverpiezas_Jsonclick, 5, httpContext.getMessage( "Ver Peças", ""), "", StyleString, ClassString, bttBtnverpiezas_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOVERPIEZAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimirhdr_Internalname, "", httpContext.getMessage( "Imprimir OS", ""), bttBtnimprimirhdr_Jsonclick, 7, httpContext.getMessage( "Imprimir OS", ""), "", StyleString, ClassString, bttBtnimprimirhdr_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111u7195_client"+"'", TempTags, "", 2, "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpackinglist_Internalname, "", httpContext.getMessage( "Packing List", ""), bttBtnpackinglist_Jsonclick, 7, httpContext.getMessage( "Packing List", ""), "", StyleString, ClassString, bttBtnpackinglist_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121u7195_client"+"'", TempTags, "", 2, "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Nº OS", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "color:"+WebUtils.getHTMLColor( edtBarCod_Forecolor)+";"+((edtBarCod_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtBarCod_Backcolor)+";"), "", "", "", 1, edtBarCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop30", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", imgavPrompt_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPrompt_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Static Bitmap Variable */
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompt_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompt_gximage+"_Class") ;
      StyleString = "" ;
      AV42Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV42Prompt)==0)&&(GXutil.strcmp("", AV64Prompt_GXI)==0))||!(GXutil.strcmp("", AV42Prompt)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV42Prompt)==0) ? AV64Prompt_GXI : httpContext.getResourceRelative(AV42Prompt)) ;
      app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, imgavPrompt_Link, "", "", context.getHttpContext().getTheme( ), imgavPrompt_Visible, imgavPrompt_Enabled, "", "", 0, -1, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, AV42Prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "color:"+WebUtils.getHTMLColor( edtBarCodReo_Forecolor)+";"+((edtBarCodReo_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtBarCodReo_Backcolor)+";"), "", "", "", 1, edtBarCodReo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "color:"+WebUtils.getHTMLColor( edtBarCodPar_Forecolor)+";"+((edtBarCodPar_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtBarCodPar_Backcolor)+";"), "", "", "", 1, edtBarCodPar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAlbKgmE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAlbKgmE_Internalname, httpContext.getMessage( "Quilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbKgmE_Internalname, GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbKgmE_Enabled!=0) ? localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbKgmE_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAlbKgmE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdrAnc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdrAnc_Internalname, httpContext.getMessage( "Largura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdrAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3271AlbHdrAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3271AlbHdrAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrAnc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHdrAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdrgm2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdrgm2_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrgm2_Internalname, GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdrgm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5019AlbHdrgm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5019AlbHdrgm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrgm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHdrgm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAlbMtrE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAlbMtrE_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbMtrE_Internalname, GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbMtrE_Enabled!=0) ? localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbMtrE_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAlbMtrE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAlbPie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAlbPie_Internalname, httpContext.getMessage( "Peças", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbPie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAlbPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedtubcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktubcod_Internalname, httpContext.getMessage( "Tubo", ""), "", "", lblTextblocktubcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_tubcod.setProperty("Caption", Combo_tubcod_Caption);
      ucCombo_tubcod.setProperty("Cls", Combo_tubcod_Cls);
      ucCombo_tubcod.setProperty("EmptyItemText", Combo_tubcod_Emptyitemtext);
      ucCombo_tubcod.setProperty("DropDownOptionsData", AV47TubCod_Data);
      ucCombo_tubcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tubcod_Internalname, "COMBO_TUBCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTubCod_Internalname, httpContext.getMessage( "Tubo", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTubCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1206TubCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTubCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTubCod_Visible, edtTubCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAlbTub_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAlbTub_Internalname, httpContext.getMessage( "Qtd.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbTub_Internalname, GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbTub_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbTub_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAlbTub_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divCombo_plascod_cell_Internalname, 1, 0, "px", 0, "px", divCombo_plascod_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedplascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockplascod_Internalname, httpContext.getMessage( "Plastico", ""), "", "", lblTextblockplascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_plascod.setProperty("Caption", Combo_plascod_Caption);
      ucCombo_plascod.setProperty("Cls", Combo_plascod_Cls);
      ucCombo_plascod.setProperty("EmptyItemText", Combo_plascod_Emptyitemtext);
      ucCombo_plascod.setProperty("DropDownOptionsData", AV50PlasCod_Data);
      ucCombo_plascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_plascod_Internalname, "COMBO_PLASCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPlasCod_Internalname, httpContext.getMessage( "Codigo Plastico", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPlasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6466PlasCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPlasCod_Jsonclick, 0, "Attribute", "", "", "", "", edtPlasCod_Visible, edtPlasCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divBaralbplas_cell_Internalname, 1, 0, "px", 0, "px", divBaralbplas_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtBarAlbPlas_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAlbPlas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAlbPlas_Internalname, httpContext.getMessage( "Qtd.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbPlas_Internalname, GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbPlas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6467BarAlbPlas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6467BarAlbPlas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbPlas_Jsonclick, 0, "AttributeFL", "", "", "", "", edtBarAlbPlas_Visible, edtBarAlbPlas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProVal.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbProVal.getInternalname(), httpContext.getMessage( "F?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProVal, cmbAlbProVal.getInternalname(), GXutil.rtrim( A2839AlbProVal), 1, cmbAlbProVal.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbProVal.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdrObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdrObs_Internalname, httpContext.getMessage( "Observações", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrObs_Internalname, GXutil.rtrim( A2441AlbHdrObs), GXutil.rtrim( localUtil.format( A2441AlbHdrObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrObs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHdrObs_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedidoClie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedidoClie_Internalname, httpContext.getMessage( "Enc. Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedidoClie_Internalname, GXutil.rtrim( A13878PedidoClie), GXutil.rtrim( localUtil.format( A13878PedidoClie, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedidoClie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedidoClie_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbSer_Internalname, httpContext.getMessage( "Artigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbSer_Internalname, GXutil.rtrim( A3391AlbSer), GXutil.rtrim( localUtil.format( A3391AlbSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbSerD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbSerD_Internalname, httpContext.getMessage( "Descrição", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbSerD_Internalname, GXutil.rtrim( A8879AlbSerD), GXutil.rtrim( localUtil.format( A8879AlbSerD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbSerD_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbSerD_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbColNom_Internalname, httpContext.getMessage( "Cor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbColNom_Internalname, GXutil.rtrim( A3392AlbColNom), GXutil.rtrim( localUtil.format( A3392AlbColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbColNum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipCol_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbNomCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbNomCli_Internalname, httpContext.getMessage( "Cor Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNomCli_Internalname, GXutil.rtrim( A12232AlbNomCli), GXutil.rtrim( localUtil.format( A12232AlbNomCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNomCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSit_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSit_Internalname, httpContext.getMessage( "Sit.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkBarTipCor.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkBarTipCor.getInternalname(), httpContext.getMessage( "Exp?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkBarTipCor.getInternalname(), A5291BarTipCor, "", httpContext.getMessage( "Exp?", ""), 1, chkBarTipCor.getEnabled(), "SI", "", StyleString, ClassString, "", "", "");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      if ( ! isFullAjaxMode( ) )
      {
         /* WebComponent */
         app.GxWebStd.gx_hidden_field( httpContext, "W0192"+"", GXutil.rtrim( WebComp_Wcdocumentodetransporteproduccion_7_Component));
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0192"+""+"\""+((WebComp_Wcdocumentodetransporteproduccion_7_Visible==1) ? "" : " style=\"display:none;\"")) ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_7_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWcdocumentodetransporteproduccion_7), GXutil.lower( WebComp_Wcdocumentodetransporteproduccion_7_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0192"+"");
            }
            WebComp_Wcdocumentodetransporteproduccion_7.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWcdocumentodetransporteproduccion_7), GXutil.lower( WebComp_Wcdocumentodetransporteproduccion_7_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
         }
         httpContext.writeText( "</div>") ;
      }
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
      ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
      ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
      ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
      ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
      ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
      ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
      ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
      ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
      ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
      ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, "DVPANEL_UNNAMEDTABLE4Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMode_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavMode_Internalname, httpContext.getMessage( "Mode", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavMode_Internalname, GXutil.rtrim( Gx_mode), GXutil.rtrim( localUtil.format( Gx_mode, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMode_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMode_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtKgsHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtKgsHdr_Internalname, httpContext.getMessage( "Kgs Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtKgsHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A14353KgsHdr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtKgsHdr_Enabled!=0) ? localUtil.format( A14353KgsHdr, "ZZZZZ9.99") : localUtil.format( A14353KgsHdr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKgsHdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtKgsHdr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtKgsEntrega_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtKgsEntrega_Internalname, httpContext.getMessage( "Kgs Entregar", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtKgsEntrega_Internalname, GXutil.ltrim( localUtil.ntoc( A14354KgsEntrega, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtKgsEntrega_Enabled!=0) ? localUtil.format( A14354KgsEntrega, "ZZZZZ9.99") : localUtil.format( A14354KgsEntrega, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKgsEntrega_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtKgsEntrega_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMtsEntrega_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMtsEntrega_Internalname, httpContext.getMessage( "Mts Entregar", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMtsEntrega_Internalname, GXutil.ltrim( localUtil.ntoc( A14355MtsEntrega, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMtsEntrega_Enabled!=0) ? localUtil.format( A14355MtsEntrega, "ZZZZZ9.99") : localUtil.format( A14355MtsEntrega, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMtsEntrega_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMtsEntrega_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPzsEntrega_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPzsEntrega_Internalname, httpContext.getMessage( "Pzs Entregar", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPzsEntrega_Internalname, GXutil.ltrim( localUtil.ntoc( A14356PzsEntrega, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPzsEntrega_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14356PzsEntrega), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14356PzsEntrega), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPzsEntrega_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPzsEntrega_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV62Pgmname), GXutil.rtrim( localUtil.format( AV62Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_tubcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotubcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV49ComboTubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotubcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV49ComboTubCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV49ComboTubCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombotubcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotubcod_Visible, edtavCombotubcod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_plascod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboplascod_Internalname, GXutil.ltrim( localUtil.ntoc( AV51ComboPlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboplascod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV51ComboPlasCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV51ComboPlasCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboplascod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboplascod_Visible, edtavComboplascod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_3.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_trn_delete_Internalname, tblTabledvelop_confirmpanel_trn_delete_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
      /* User Defined Control */
      ucDvelop_confirmpanel_trn_delete.setProperty("Title", Dvelop_confirmpanel_trn_delete_Title);
      ucDvelop_confirmpanel_trn_delete.setProperty("ConfirmationText", Dvelop_confirmpanel_trn_delete_Confirmationtext);
      ucDvelop_confirmpanel_trn_delete.setProperty("YesButtonCaption", Dvelop_confirmpanel_trn_delete_Yesbuttoncaption);
      ucDvelop_confirmpanel_trn_delete.setProperty("NoButtonCaption", Dvelop_confirmpanel_trn_delete_Nobuttoncaption);
      ucDvelop_confirmpanel_trn_delete.setProperty("CancelButtonCaption", Dvelop_confirmpanel_trn_delete_Cancelbuttoncaption);
      ucDvelop_confirmpanel_trn_delete.setProperty("YesButtonPosition", Dvelop_confirmpanel_trn_delete_Yesbuttonposition);
      ucDvelop_confirmpanel_trn_delete.setProperty("ConfirmType", Dvelop_confirmpanel_trn_delete_Confirmtype);
      ucDvelop_confirmpanel_trn_delete.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_trn_delete_Internalname, "DVELOP_CONFIRMPANEL_TRN_DELETEContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_TRN_DELETEContainer"+"Body"+"\" style=\"display:none;\">") ;
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

   public void userMain( )
   {
      standaloneStartup( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( WebComp_Wcdocumentodetransporteproduccion_7_Visible != 0 )
         {
            if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_7_Component) != 0 )
            {
               WebComp_Wcdocumentodetransporteproduccion_7.componentstart();
            }
         }
      }
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
      e131U72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTUBCOD_DATA"), AV47TubCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPLASCOD_DATA"), AV50PlasCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z6466PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z6466PlasCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1266BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( "Z1266BarAlbTub"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( "Z1261BarAlbKgmE")) ;
            Z1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( "Z1265BarAlbPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( "Z1263BarAlbMtrE")) ;
            Z3271AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z3271AlbHdrAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3392AlbColNom = httpContext.cgiGet( "Z3392AlbColNom") ;
            Z3393AlbColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z3393AlbColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3394AlbTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3394AlbTipCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3391AlbSer = httpContext.cgiGet( "Z3391AlbSer") ;
            Z8879AlbSerD = httpContext.cgiGet( "Z8879AlbSerD") ;
            Z3886AlbCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z3886AlbCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12232AlbNomCli = httpContext.cgiGet( "Z12232AlbNomCli") ;
            Z12233AlbNumcli = (int)(localUtil.ctol( httpContext.cgiGet( "Z12233AlbNumcli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12234AlbTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z12234AlbTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5019AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z5019AlbHdrgm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4815AlbEncCli = httpContext.cgiGet( "Z4815AlbEncCli") ;
            Z1262BarPreKgm = localUtil.ctond( httpContext.cgiGet( "Z1262BarPreKgm")) ;
            Z1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( "Z1264BarPreMtr")) ;
            Z32AlbProEsp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z32AlbProEsp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z40AlbProRec = localUtil.ctond( httpContext.cgiGet( "Z40AlbProRec")) ;
            Z2398BarFasExt = httpContext.cgiGet( "Z2398BarFasExt") ;
            Z12195BarAlbUnd = (int)(localUtil.ctol( httpContext.cgiGet( "Z12195BarAlbUnd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12196BarPreUnd = localUtil.ctond( httpContext.cgiGet( "Z12196BarPreUnd")) ;
            Z6645AlbMetULi = (short)(localUtil.ctol( httpContext.cgiGet( "Z6645AlbMetULi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1461BarAlbPN = localUtil.ctond( httpContext.cgiGet( "Z1461BarAlbPN")) ;
            Z1095AlbTipEnt = httpContext.cgiGet( "Z1095AlbTipEnt") ;
            Z7994AlbDto = localUtil.ctond( httpContext.cgiGet( "Z7994AlbDto")) ;
            Z7993AlbMqTj = httpContext.cgiGet( "Z7993AlbMqTj") ;
            Z7992AlbDf3 = httpContext.cgiGet( "Z7992AlbDf3") ;
            Z7991AlbDf2 = httpContext.cgiGet( "Z7991AlbDf2") ;
            Z7990AlbDf1 = httpContext.cgiGet( "Z7990AlbDf1") ;
            Z7989AlbCald = httpContext.cgiGet( "Z7989AlbCald") ;
            Z7104AlbEncA = localUtil.ctond( httpContext.cgiGet( "Z7104AlbEncA")) ;
            Z7103AlbEncL = localUtil.ctond( httpContext.cgiGet( "Z7103AlbEncL")) ;
            Z6467BarAlbPlas = (short)(localUtil.ctol( httpContext.cgiGet( "Z6467BarAlbPlas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2761AlbBarRec = localUtil.ctond( httpContext.cgiGet( "Z2761AlbBarRec")) ;
            Z5354AlbImpMan = localUtil.ctond( httpContext.cgiGet( "Z5354AlbImpMan")) ;
            Z2441AlbHdrObs = httpContext.cgiGet( "Z2441AlbHdrObs") ;
            Z1458BarAlbBul = (short)(localUtil.ctol( httpContext.cgiGet( "Z1458BarAlbBul"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2839AlbProVal = httpContext.cgiGet( "Z2839AlbProVal") ;
            Z1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1248GuiFasULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2763AlbHdrUlin = (short)(localUtil.ctol( httpContext.cgiGet( "Z2763AlbHdrUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12905AlbCadEnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z12905AlbCadEnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2396BarAlbObs = httpContext.cgiGet( "Z2396BarAlbObs") ;
            Z14057AlbTiras = httpContext.cgiGet( "Z14057AlbTiras") ;
            Z14058AlbTirasKg = localUtil.ctond( httpContext.cgiGet( "Z14058AlbTirasKg")) ;
            Z14059AlbSinTest = httpContext.cgiGet( "Z14059AlbSinTest") ;
            Z1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1206TubCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3153CodCod = httpContext.cgiGet( "Z3153CodCod") ;
            A3394AlbTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3394AlbTipCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3886AlbCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z3886AlbCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12233AlbNumcli = (int)(localUtil.ctol( httpContext.cgiGet( "Z12233AlbNumcli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12234AlbTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z12234AlbTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4815AlbEncCli = httpContext.cgiGet( "Z4815AlbEncCli") ;
            A1262BarPreKgm = localUtil.ctond( httpContext.cgiGet( "Z1262BarPreKgm")) ;
            A1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( "Z1264BarPreMtr")) ;
            A32AlbProEsp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z32AlbProEsp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A40AlbProRec = localUtil.ctond( httpContext.cgiGet( "Z40AlbProRec")) ;
            A2398BarFasExt = httpContext.cgiGet( "Z2398BarFasExt") ;
            A12195BarAlbUnd = (int)(localUtil.ctol( httpContext.cgiGet( "Z12195BarAlbUnd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12196BarPreUnd = localUtil.ctond( httpContext.cgiGet( "Z12196BarPreUnd")) ;
            A6645AlbMetULi = (short)(localUtil.ctol( httpContext.cgiGet( "Z6645AlbMetULi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1461BarAlbPN = localUtil.ctond( httpContext.cgiGet( "Z1461BarAlbPN")) ;
            A1095AlbTipEnt = httpContext.cgiGet( "Z1095AlbTipEnt") ;
            A7994AlbDto = localUtil.ctond( httpContext.cgiGet( "Z7994AlbDto")) ;
            A7993AlbMqTj = httpContext.cgiGet( "Z7993AlbMqTj") ;
            A7992AlbDf3 = httpContext.cgiGet( "Z7992AlbDf3") ;
            A7991AlbDf2 = httpContext.cgiGet( "Z7991AlbDf2") ;
            A7990AlbDf1 = httpContext.cgiGet( "Z7990AlbDf1") ;
            A7989AlbCald = httpContext.cgiGet( "Z7989AlbCald") ;
            A7104AlbEncA = localUtil.ctond( httpContext.cgiGet( "Z7104AlbEncA")) ;
            A7103AlbEncL = localUtil.ctond( httpContext.cgiGet( "Z7103AlbEncL")) ;
            A2761AlbBarRec = localUtil.ctond( httpContext.cgiGet( "Z2761AlbBarRec")) ;
            A5354AlbImpMan = localUtil.ctond( httpContext.cgiGet( "Z5354AlbImpMan")) ;
            A1458BarAlbBul = (short)(localUtil.ctol( httpContext.cgiGet( "Z1458BarAlbBul"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1248GuiFasULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2763AlbHdrUlin = (short)(localUtil.ctol( httpContext.cgiGet( "Z2763AlbHdrUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12905AlbCadEnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z12905AlbCadEnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2396BarAlbObs = httpContext.cgiGet( "Z2396BarAlbObs") ;
            A14057AlbTiras = httpContext.cgiGet( "Z14057AlbTiras") ;
            A14058AlbTirasKg = localUtil.ctond( httpContext.cgiGet( "Z14058AlbTirasKg")) ;
            A14059AlbSinTest = httpContext.cgiGet( "Z14059AlbSinTest") ;
            A3153CodCod = httpContext.cgiGet( "Z3153CodCod") ;
            n3153CodCod = false ;
            O1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( "O1265BarAlbPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( "O1263BarAlbMtrE")) ;
            O1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( "O1261BarAlbKgmE")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N6466PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( "N6466PlasCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3153CodCod = httpContext.cgiGet( "N3153CodCod") ;
            N1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( "N1206TubCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV24GuiRemCln = httpContext.cgiGet( "vGUIREMCLN") ;
            AV55ImpCod = httpContext.cgiGet( "vIMPCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A14056AlbColorCv = httpContext.cgiGet( "ALBCOLORCV") ;
            A4812BarEncCli = httpContext.cgiGet( "BARENCCLI") ;
            A143BarDisNum = httpContext.cgiGet( "BARDISNUM") ;
            A898BarPieNDes = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIENDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            A199BarPie1 = (short)(localUtil.ctol( httpContext.cgiGet( "BARPIE1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1208TubPre = localUtil.ctond( httpContext.cgiGet( "TUBPRE")) ;
            n1208TubPre = false ;
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "EMPNUMDEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3915EmpNumDec = false ;
            A1281TubImp = localUtil.ctond( httpContext.cgiGet( "TUBIMP")) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8AlbProCod = localUtil.ctol( httpContext.cgiGet( "vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV11BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV15Insert_PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PLASCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17Insert_CodCod = httpContext.cgiGet( "vINSERT_CODCOD") ;
            A3153CodCod = httpContext.cgiGet( "CODCOD") ;
            AV18Insert_TubCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TUBCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV31Moda21 = (byte)(localUtil.ctol( httpContext.cgiGet( "vMODA21"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV39Plasticos = (short)(localUtil.ctol( httpContext.cgiGet( "vPLASTICOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36KilAnt = localUtil.ctond( httpContext.cgiGet( "vKILANT")) ;
            AV37MetAnt = localUtil.ctond( httpContext.cgiGet( "vMETANT")) ;
            AV38PieAnt = (int)(localUtil.ctol( httpContext.cgiGet( "vPIEANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14057AlbTiras = httpContext.cgiGet( "ALBTIRAS") ;
            A14059AlbSinTest = httpContext.cgiGet( "ALBSINTEST") ;
            AV54Mensaje = httpContext.cgiGet( "vMENSAJE") ;
            A3394AlbTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBTIPCOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3886AlbCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12233AlbNumcli = (int)(localUtil.ctol( httpContext.cgiGet( "ALBNUMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12234AlbTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "ALBTIPART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4815AlbEncCli = httpContext.cgiGet( "ALBENCCLI") ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A148BarEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( "BARESTREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV43errkgs = (short)(localUtil.ctol( httpContext.cgiGet( "vERRKGS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV30FlagFas = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGFAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1262BarPreKgm = localUtil.ctond( httpContext.cgiGet( "BARPREKGM")) ;
            A1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( "BARPREMTR")) ;
            A32AlbProEsp = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBPROESP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A40AlbProRec = localUtil.ctond( httpContext.cgiGet( "ALBPROREC")) ;
            A2398BarFasExt = httpContext.cgiGet( "BARFASEXT") ;
            AV20Station = httpContext.cgiGet( "vSTATION") ;
            AV22UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            A12195BarAlbUnd = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBUND"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12196BarPreUnd = localUtil.ctond( httpContext.cgiGet( "BARPREUND")) ;
            A6645AlbMetULi = (short)(localUtil.ctol( httpContext.cgiGet( "ALBMETULI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1461BarAlbPN = localUtil.ctond( httpContext.cgiGet( "BARALBPN")) ;
            A1095AlbTipEnt = httpContext.cgiGet( "ALBTIPENT") ;
            A7994AlbDto = localUtil.ctond( httpContext.cgiGet( "ALBDTO")) ;
            A7993AlbMqTj = httpContext.cgiGet( "ALBMQTJ") ;
            A7992AlbDf3 = httpContext.cgiGet( "ALBDF3") ;
            A7991AlbDf2 = httpContext.cgiGet( "ALBDF2") ;
            A7990AlbDf1 = httpContext.cgiGet( "ALBDF1") ;
            A7989AlbCald = httpContext.cgiGet( "ALBCALD") ;
            A7104AlbEncA = localUtil.ctond( httpContext.cgiGet( "ALBENCA")) ;
            A7103AlbEncL = localUtil.ctond( httpContext.cgiGet( "ALBENCL")) ;
            A2761AlbBarRec = localUtil.ctond( httpContext.cgiGet( "ALBBARREC")) ;
            A5354AlbImpMan = localUtil.ctond( httpContext.cgiGet( "ALBIMPMAN")) ;
            A1458BarAlbBul = (short)(localUtil.ctol( httpContext.cgiGet( "BARALBBUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( "GUIFASULIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2763AlbHdrUlin = (short)(localUtil.ctol( httpContext.cgiGet( "ALBHDRULIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12905AlbCadEnc = (short)(localUtil.ctol( httpContext.cgiGet( "ALBCADENC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2396BarAlbObs = httpContext.cgiGet( "BARALBOBS") ;
            A14058AlbTirasKg = localUtil.ctond( httpContext.cgiGet( "ALBTIRASKG")) ;
            A13890BarHDSusp = (byte)(localUtil.ctol( httpContext.cgiGet( "BARHDSUSP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13890BarHDSusp = false ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1234BarNomCli = httpContext.cgiGet( "BARNOMCLI") ;
            A5034BarEstTip = httpContext.cgiGet( "BARESTTIP") ;
            A5027BarGraCob = (byte)(localUtil.ctol( httpContext.cgiGet( "BARGRACOB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2010BarTipDis = httpContext.cgiGet( "BARTIPDIS") ;
            A4937BarCtrPdas = (byte)(localUtil.ctol( httpContext.cgiGet( "BARCTRPDAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4937BarCtrPdas = false ;
            A5253BarAcc = httpContext.cgiGet( "BARACC") ;
            A1909BarGraAca = (short)(localUtil.ctol( httpContext.cgiGet( "BARGRAACA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1652BarSerDsc = httpContext.cgiGet( "BARSERDSC") ;
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A135BarColNom = httpContext.cgiGet( "BARCOLNOM") ;
            A1503BarPart = (short)(localUtil.ctol( httpContext.cgiGet( "BARPART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A161BarFecSal = localUtil.ctod( httpContext.cgiGet( "BARFECSAL"), 0) ;
            A125BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( "BARANCACA1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A212BarSer = httpContext.cgiGet( "BARSER") ;
            A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( "BARACAANH"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "BARTIPART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n217BarTipArt = false ;
            A1253EmprGuiRem = httpContext.cgiGet( "EMPRGUIREM") ;
            A5805AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBENVFTP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7101AlbLic = httpContext.cgiGet( "ALBLIC") ;
            A34AlbProfch = localUtil.ctod( httpContext.cgiGet( "ALBPROFCH"), 0) ;
            A2242AlbSec = httpContext.cgiGet( "ALBSEC") ;
            A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "GUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3154CodDsc = httpContext.cgiGet( "CODDSC") ;
            n3154CodDsc = false ;
            A1244GuiRemCln = httpContext.cgiGet( "GUIREMCLN") ;
            A1279BarKla = localUtil.ctond( httpContext.cgiGet( "BARKLA")) ;
            A1280BarMla = localUtil.ctond( httpContext.cgiGet( "BARMLA")) ;
            A1292BarPlz = (short)(localUtil.ctol( httpContext.cgiGet( "BARPLZ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Combo_tubcod_Objectcall = httpContext.cgiGet( "COMBO_TUBCOD_Objectcall") ;
            Combo_tubcod_Class = httpContext.cgiGet( "COMBO_TUBCOD_Class") ;
            Combo_tubcod_Icontype = httpContext.cgiGet( "COMBO_TUBCOD_Icontype") ;
            Combo_tubcod_Icon = httpContext.cgiGet( "COMBO_TUBCOD_Icon") ;
            Combo_tubcod_Caption = httpContext.cgiGet( "COMBO_TUBCOD_Caption") ;
            Combo_tubcod_Tooltip = httpContext.cgiGet( "COMBO_TUBCOD_Tooltip") ;
            Combo_tubcod_Cls = httpContext.cgiGet( "COMBO_TUBCOD_Cls") ;
            Combo_tubcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TUBCOD_Selectedvalue_set") ;
            Combo_tubcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_TUBCOD_Selectedvalue_get") ;
            Combo_tubcod_Selectedtext_set = httpContext.cgiGet( "COMBO_TUBCOD_Selectedtext_set") ;
            Combo_tubcod_Selectedtext_get = httpContext.cgiGet( "COMBO_TUBCOD_Selectedtext_get") ;
            Combo_tubcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_TUBCOD_Gamoauthtoken") ;
            Combo_tubcod_Ddointernalname = httpContext.cgiGet( "COMBO_TUBCOD_Ddointernalname") ;
            Combo_tubcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_TUBCOD_Titlecontrolalign") ;
            Combo_tubcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TUBCOD_Dropdownoptionstype") ;
            Combo_tubcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TUBCOD_Enabled")) ;
            Combo_tubcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TUBCOD_Visible")) ;
            Combo_tubcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TUBCOD_Titlecontrolidtoreplace") ;
            Combo_tubcod_Datalisttype = httpContext.cgiGet( "COMBO_TUBCOD_Datalisttype") ;
            Combo_tubcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TUBCOD_Allowmultipleselection")) ;
            Combo_tubcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TUBCOD_Datalistfixedvalues") ;
            Combo_tubcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TUBCOD_Isgriditem")) ;
            Combo_tubcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TUBCOD_Hasdescription")) ;
            Combo_tubcod_Datalistproc = httpContext.cgiGet( "COMBO_TUBCOD_Datalistproc") ;
            Combo_tubcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TUBCOD_Datalistprocparametersprefix") ;
            Combo_tubcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TUBCOD_Remoteservicesparameters") ;
            Combo_tubcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TUBCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_tubcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TUBCOD_Includeonlyselectedoption")) ;
            Combo_tubcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TUBCOD_Includeselectalloption")) ;
            Combo_tubcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TUBCOD_Emptyitem")) ;
            Combo_tubcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TUBCOD_Includeaddnewoption")) ;
            Combo_tubcod_Htmltemplate = httpContext.cgiGet( "COMBO_TUBCOD_Htmltemplate") ;
            Combo_tubcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TUBCOD_Multiplevaluestype") ;
            Combo_tubcod_Loadingdata = httpContext.cgiGet( "COMBO_TUBCOD_Loadingdata") ;
            Combo_tubcod_Noresultsfound = httpContext.cgiGet( "COMBO_TUBCOD_Noresultsfound") ;
            Combo_tubcod_Emptyitemtext = httpContext.cgiGet( "COMBO_TUBCOD_Emptyitemtext") ;
            Combo_tubcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TUBCOD_Onlyselectedvalues") ;
            Combo_tubcod_Selectalltext = httpContext.cgiGet( "COMBO_TUBCOD_Selectalltext") ;
            Combo_tubcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TUBCOD_Multiplevaluesseparator") ;
            Combo_tubcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_TUBCOD_Addnewoptiontext") ;
            Combo_tubcod_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TUBCOD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_plascod_Objectcall = httpContext.cgiGet( "COMBO_PLASCOD_Objectcall") ;
            Combo_plascod_Class = httpContext.cgiGet( "COMBO_PLASCOD_Class") ;
            Combo_plascod_Icontype = httpContext.cgiGet( "COMBO_PLASCOD_Icontype") ;
            Combo_plascod_Icon = httpContext.cgiGet( "COMBO_PLASCOD_Icon") ;
            Combo_plascod_Caption = httpContext.cgiGet( "COMBO_PLASCOD_Caption") ;
            Combo_plascod_Tooltip = httpContext.cgiGet( "COMBO_PLASCOD_Tooltip") ;
            Combo_plascod_Cls = httpContext.cgiGet( "COMBO_PLASCOD_Cls") ;
            Combo_plascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PLASCOD_Selectedvalue_set") ;
            Combo_plascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PLASCOD_Selectedvalue_get") ;
            Combo_plascod_Selectedtext_set = httpContext.cgiGet( "COMBO_PLASCOD_Selectedtext_set") ;
            Combo_plascod_Selectedtext_get = httpContext.cgiGet( "COMBO_PLASCOD_Selectedtext_get") ;
            Combo_plascod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PLASCOD_Gamoauthtoken") ;
            Combo_plascod_Ddointernalname = httpContext.cgiGet( "COMBO_PLASCOD_Ddointernalname") ;
            Combo_plascod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PLASCOD_Titlecontrolalign") ;
            Combo_plascod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PLASCOD_Dropdownoptionstype") ;
            Combo_plascod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PLASCOD_Enabled")) ;
            Combo_plascod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PLASCOD_Visible")) ;
            Combo_plascod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PLASCOD_Titlecontrolidtoreplace") ;
            Combo_plascod_Datalisttype = httpContext.cgiGet( "COMBO_PLASCOD_Datalisttype") ;
            Combo_plascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PLASCOD_Allowmultipleselection")) ;
            Combo_plascod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PLASCOD_Datalistfixedvalues") ;
            Combo_plascod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PLASCOD_Isgriditem")) ;
            Combo_plascod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PLASCOD_Hasdescription")) ;
            Combo_plascod_Datalistproc = httpContext.cgiGet( "COMBO_PLASCOD_Datalistproc") ;
            Combo_plascod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PLASCOD_Datalistprocparametersprefix") ;
            Combo_plascod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PLASCOD_Remoteservicesparameters") ;
            Combo_plascod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PLASCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_plascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PLASCOD_Includeonlyselectedoption")) ;
            Combo_plascod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PLASCOD_Includeselectalloption")) ;
            Combo_plascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PLASCOD_Emptyitem")) ;
            Combo_plascod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PLASCOD_Includeaddnewoption")) ;
            Combo_plascod_Htmltemplate = httpContext.cgiGet( "COMBO_PLASCOD_Htmltemplate") ;
            Combo_plascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PLASCOD_Multiplevaluestype") ;
            Combo_plascod_Loadingdata = httpContext.cgiGet( "COMBO_PLASCOD_Loadingdata") ;
            Combo_plascod_Noresultsfound = httpContext.cgiGet( "COMBO_PLASCOD_Noresultsfound") ;
            Combo_plascod_Emptyitemtext = httpContext.cgiGet( "COMBO_PLASCOD_Emptyitemtext") ;
            Combo_plascod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PLASCOD_Onlyselectedvalues") ;
            Combo_plascod_Selectalltext = httpContext.cgiGet( "COMBO_PLASCOD_Selectalltext") ;
            Combo_plascod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PLASCOD_Multiplevaluesseparator") ;
            Combo_plascod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PLASCOD_Addnewoptiontext") ;
            Combo_plascod_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PLASCOD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_unnamedtable1_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_unnamedtable4_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Objectcall") ;
            Dvpanel_unnamedtable4_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Class") ;
            Dvpanel_unnamedtable4_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Enabled")) ;
            Dvpanel_unnamedtable4_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Width") ;
            Dvpanel_unnamedtable4_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Height") ;
            Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
            Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
            Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Cls") ;
            Dvpanel_unnamedtable4_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showheader")) ;
            Dvpanel_unnamedtable4_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Title") ;
            Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
            Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
            Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
            Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Iconposition") ;
            Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
            Dvpanel_unnamedtable4_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Visible")) ;
            Dvpanel_unnamedtable4_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvelop_confirmpanel_trn_delete_Objectcall = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Objectcall") ;
            Dvelop_confirmpanel_trn_delete_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Enabled")) ;
            Dvelop_confirmpanel_trn_delete_Width = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Width") ;
            Dvelop_confirmpanel_trn_delete_Height = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Height") ;
            Dvelop_confirmpanel_trn_delete_Class = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Class") ;
            Dvelop_confirmpanel_trn_delete_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Title") ;
            Dvelop_confirmpanel_trn_delete_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Confirmationtext") ;
            Dvelop_confirmpanel_trn_delete_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Yesbuttoncaption") ;
            Dvelop_confirmpanel_trn_delete_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Nobuttoncaption") ;
            Dvelop_confirmpanel_trn_delete_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Cancelbuttoncaption") ;
            Dvelop_confirmpanel_trn_delete_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Yesbuttonposition") ;
            Dvelop_confirmpanel_trn_delete_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Confirmtype") ;
            Dvelop_confirmpanel_trn_delete_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Comment") ;
            Dvelop_confirmpanel_trn_delete_Bodytype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Bodytype") ;
            Dvelop_confirmpanel_trn_delete_Bodycontentinternalname = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Bodycontentinternalname") ;
            Dvelop_confirmpanel_trn_delete_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Result") ;
            Dvelop_confirmpanel_trn_delete_Texttype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Texttype") ;
            Dvelop_confirmpanel_trn_delete_Visible = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Visible")) ;
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
            AV23Guiremcli = (int)(localUtil.ctol( httpContext.cgiGet( edtavGuiremcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Guiremcli), 6, 0));
            AV27AlbProPri = httpContext.cgiGet( edtavAlbpropri_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27AlbProPri", AV27AlbProPri);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27AlbProPri, "9"))));
            AV35CliFacMtsP = ((GXutil.strcmp(httpContext.cgiGet( chkavClifacmtsp.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35CliFacMtsP", AV35CliFacMtsP);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129BarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            AV42Prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCodReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A132BarCodReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBKGME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarAlbKgmE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1261BarAlbKgmE = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
            }
            else
            {
               A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBHDRANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbHdrAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3271AlbHdrAnc = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3271AlbHdrAnc), 4, 0));
            }
            else
            {
               A3271AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3271AlbHdrAnc), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBHDRGM2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbHdrgm2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5019AlbHdrgm2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5019AlbHdrgm2), 4, 0));
            }
            else
            {
               A5019AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5019AlbHdrgm2), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBMTRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarAlbMtrE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1263BarAlbMtrE = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
            }
            else
            {
               A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBPIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarAlbPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1265BarAlbPie = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
            }
            else
            {
               A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TUBCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTubCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1206TubCod = (short)(0) ;
               n1206TubCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
            }
            else
            {
               A1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1206TubCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBTUB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarAlbTub_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1266BarAlbTub = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1266BarAlbTub), 6, 0));
            }
            else
            {
               A1266BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1266BarAlbTub), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PLASCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPlasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6466PlasCod = (short)(0) ;
               n6466PlasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
            }
            else
            {
               A6466PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6466PlasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBPLAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarAlbPlas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6467BarAlbPlas = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6467BarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6467BarAlbPlas), 4, 0));
            }
            else
            {
               A6467BarAlbPlas = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6467BarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6467BarAlbPlas), 4, 0));
            }
            cmbAlbProVal.setValue( httpContext.cgiGet( cmbAlbProVal.getInternalname()) );
            A2839AlbProVal = httpContext.cgiGet( cmbAlbProVal.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
            A2441AlbHdrObs = httpContext.cgiGet( edtAlbHdrObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2441AlbHdrObs", A2441AlbHdrObs);
            A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
            A3391AlbSer = httpContext.cgiGet( edtAlbSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", A3391AlbSer);
            A8879AlbSerD = httpContext.cgiGet( edtAlbSerD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", A8879AlbSerD);
            A3392AlbColNom = httpContext.cgiGet( edtAlbColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", A3392AlbColNom);
            A3393AlbColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3393AlbColNum), 6, 0));
            A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
            A12232AlbNomCli = httpContext.cgiGet( edtAlbNomCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", A12232AlbNomCli);
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
            A5291BarTipCor = ((GXutil.strcmp(httpContext.cgiGet( chkBarTipCor.getInternalname()), "SI")==0) ? "SI" : "NO") ;
            httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
            Gx_mode = GXutil.upper( httpContext.cgiGet( edtavMode_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            A14353KgsHdr = localUtil.ctond( httpContext.cgiGet( edtKgsHdr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14353KgsHdr", GXutil.ltrimstr( A14353KgsHdr, 9, 2));
            A14354KgsEntrega = localUtil.ctond( httpContext.cgiGet( edtKgsEntrega_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14354KgsEntrega", GXutil.ltrimstr( A14354KgsEntrega, 9, 2));
            A14355MtsEntrega = localUtil.ctond( httpContext.cgiGet( edtMtsEntrega_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14355MtsEntrega", GXutil.ltrimstr( A14355MtsEntrega, 9, 2));
            A14356PzsEntrega = (int)(localUtil.ctol( httpContext.cgiGet( edtPzsEntrega_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14356PzsEntrega", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14356PzsEntrega), 6, 0));
            AV62Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62Pgmname", AV62Pgmname);
            AV49ComboTubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombotubcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49ComboTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49ComboTubCod), 4, 0));
            AV51ComboPlasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavComboplascod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51ComboPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51ComboPlasCod), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_3");
            Gx_mode = httpContext.cgiGet( edtavMode_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV62Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62Pgmname", AV62Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV62Pgmname, "")));
            forbiddenHiddens.add("BarAlbUnd", localUtil.format( DecimalUtil.doubleToDec(A12195BarAlbUnd), "ZZZZZ9"));
            forbiddenHiddens.add("BarPreUnd", localUtil.format( A12196BarPreUnd, "ZZZZZZ9.99999"));
            forbiddenHiddens.add("AlbMetULi", localUtil.format( DecimalUtil.doubleToDec(A6645AlbMetULi), "ZZZ9"));
            forbiddenHiddens.add("BarAlbPN", localUtil.format( A1461BarAlbPN, "ZZZZZ9.99"));
            forbiddenHiddens.add("AlbTipEnt", GXutil.rtrim( localUtil.format( A1095AlbTipEnt, "@!")));
            forbiddenHiddens.add("AlbDto", localUtil.format( A7994AlbDto, "Z9.999"));
            forbiddenHiddens.add("AlbMqTj", GXutil.rtrim( localUtil.format( A7993AlbMqTj, "")));
            forbiddenHiddens.add("AlbDf3", GXutil.rtrim( localUtil.format( A7992AlbDf3, "")));
            forbiddenHiddens.add("AlbDf2", GXutil.rtrim( localUtil.format( A7991AlbDf2, "")));
            forbiddenHiddens.add("AlbDf1", GXutil.rtrim( localUtil.format( A7990AlbDf1, "")));
            forbiddenHiddens.add("AlbCald", GXutil.rtrim( localUtil.format( A7989AlbCald, "")));
            forbiddenHiddens.add("AlbEncA", localUtil.format( A7104AlbEncA, "ZZZ9.99"));
            forbiddenHiddens.add("AlbEncL", localUtil.format( A7103AlbEncL, "ZZZ9.99"));
            forbiddenHiddens.add("AlbBarRec", localUtil.format( A2761AlbBarRec, "ZZ9.99"));
            forbiddenHiddens.add("AlbImpMan", localUtil.format( A5354AlbImpMan, "ZZZZZZZ9.99"));
            forbiddenHiddens.add("BarAlbBul", localUtil.format( DecimalUtil.doubleToDec(A1458BarAlbBul), "ZZZ9"));
            forbiddenHiddens.add("GuiFasULin", localUtil.format( DecimalUtil.doubleToDec(A1248GuiFasULin), "ZZZ9"));
            forbiddenHiddens.add("AlbHdrUlin", localUtil.format( DecimalUtil.doubleToDec(A2763AlbHdrUlin), "ZZZ9"));
            forbiddenHiddens.add("AlbCadEnc", localUtil.format( DecimalUtil.doubleToDec(A12905AlbCadEnc), "ZZZ9"));
            forbiddenHiddens.add("BarAlbObs", GXutil.rtrim( localUtil.format( A2396BarAlbObs, "")));
            forbiddenHiddens.add("AlbTiras", GXutil.rtrim( localUtil.format( A14057AlbTiras, "")));
            forbiddenHiddens.add("AlbTirasKg", localUtil.format( A14058AlbTirasKg, "ZZZZZ9.99"));
            forbiddenHiddens.add("AlbSinTest", GXutil.rtrim( localUtil.format( A14059AlbSinTest, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("documentotransporteproduccion\\documentodetransporteproduccion_3:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
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
                  sMode195 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode195 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound195 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1U70( ) ;
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
                        e131U72 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e141U72 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOVERPIEZAS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoVerPiezas' */
                        e151U72 ();
                        nKeyPressed = (byte)(3) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "BARALBKGME.CONTROLVALUECHANGED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e161U72 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ALBHDRGM2.CONTROLVALUECHANGED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e171U72 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ALBHDRANC.CONTROLVALUECHANGED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e181U72 ();
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
               else if ( GXutil.strcmp(sEvtType, "W") == 0 )
               {
                  sEvtType = GXutil.left( sEvt, 4) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                  nCmpId = (short)(GXutil.lval( sEvtType)) ;
                  if ( nCmpId == 192 )
                  {
                     OldWcdocumentodetransporteproduccion_7 = httpContext.cgiGet( "W0192") ;
                     if ( ( GXutil.len( OldWcdocumentodetransporteproduccion_7) == 0 ) || ( GXutil.strcmp(OldWcdocumentodetransporteproduccion_7, WebComp_Wcdocumentodetransporteproduccion_7_Component) != 0 ) )
                     {
                        WebComp_Wcdocumentodetransporteproduccion_7 = WebUtils.getWebComponent(getClass(), "app." + OldWcdocumentodetransporteproduccion_7 + "_impl", remoteHandle, context);
                        WebComp_Wcdocumentodetransporteproduccion_7_Component = OldWcdocumentodetransporteproduccion_7 ;
                     }
                     if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_7_Component) != 0 )
                     {
                        WebComp_Wcdocumentodetransporteproduccion_7.componentprocess("W0192", "", sEvt);
                     }
                     WebComp_Wcdocumentodetransporteproduccion_7_Component = OldWcdocumentodetransporteproduccion_7 ;
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
         e141U72 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1U7195( ) ;
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
         disableAttributes1U7195( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcli_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbpropri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbpropri_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, chkavClifacmtsp.getInternalname(), "Enabled", GXutil.ltrimstr( chkavClifacmtsp.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavMode_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMode_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotubcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotubcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboplascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboplascod_Enabled), 5, 0), true);
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

   public void confirm_1U70( )
   {
      beforeValidate1U7195( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1U7195( ) ;
         }
         else
         {
            checkExtendedTable1U7195( ) ;
            closeExtendedTableCursors1U7195( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1U70( )
   {
   }

   public void e131U72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentodetransporteproduccion_3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Station, ""))));
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentodetransporteproduccion_3_impl.this.AV7EmprCod = GXv_char2[0] ;
      documentodetransporteproduccion_3_impl.this.AV21EmprNom = GXv_char3[0] ;
      documentodetransporteproduccion_3_impl.this.AV22UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprNom", AV21EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22UsurCod, "@!"))));
      GXv_SdtWWPContext5[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV12WWPContext = GXv_SdtWWPContext5[0] ;
      edtPlasCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Visible), 5, 0), true);
      AV51ComboPlasCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51ComboPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51ComboPlasCod), 4, 0));
      edtavComboplascod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboplascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboplascod_Visible), 5, 0), true);
      edtTubCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTubCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Visible), 5, 0), true);
      AV49ComboTubCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49ComboTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49ComboTubCod), 4, 0));
      edtavCombotubcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotubcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotubcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOTUBCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
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
      /* Execute user subroutine: 'LOADCOMBOPLASCOD' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
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
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
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
      AV13TrnContext.fromxml(AV14WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV13TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV62Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV63GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63GXV1), 8, 0));
         while ( AV63GXV1 <= AV13TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV19TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV13TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV63GXV1));
            if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PlasCod") == 0 )
            {
               AV15Insert_PlasCod = (short)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Insert_PlasCod), 4, 0));
               if ( ! (0==AV15Insert_PlasCod) )
               {
                  AV51ComboPlasCod = AV15Insert_PlasCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV51ComboPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51ComboPlasCod), 4, 0));
                  Combo_plascod_Selectedvalue_set = GXutil.trim( GXutil.str( AV51ComboPlasCod, 4, 0)) ;
                  ucCombo_plascod.sendProperty(context, "", false, Combo_plascod_Internalname, "SelectedValue_set", Combo_plascod_Selectedvalue_set);
                  Combo_plascod_Enabled = false ;
                  ucCombo_plascod.sendProperty(context, "", false, Combo_plascod_Internalname, "Enabled", GXutil.booltostr( Combo_plascod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CodCod") == 0 )
            {
               AV17Insert_CodCod = AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Insert_CodCod", AV17Insert_CodCod);
            }
            else if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TubCod") == 0 )
            {
               AV18Insert_TubCod = (short)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Insert_TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Insert_TubCod), 4, 0));
               if ( ! (0==AV18Insert_TubCod) )
               {
                  AV49ComboTubCod = AV18Insert_TubCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV49ComboTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49ComboTubCod), 4, 0));
                  Combo_tubcod_Selectedvalue_set = GXutil.trim( GXutil.str( AV49ComboTubCod, 4, 0)) ;
                  ucCombo_tubcod.sendProperty(context, "", false, Combo_tubcod_Internalname, "SelectedValue_set", Combo_tubcod_Selectedvalue_set);
                  Combo_tubcod_Enabled = false ;
                  ucCombo_tubcod.sendProperty(context, "", false, Combo_tubcod_Internalname, "Enabled", GXutil.booltostr( Combo_tubcod_Enabled));
               }
            }
            AV63GXV1 = (int)(AV63GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63GXV1), 8, 0));
         }
      }
      GXt_int6 = AV31Moda21 ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int7) ;
      documentodetransporteproduccion_3_impl.this.GXt_int6 = GXv_int7[0] ;
      AV31Moda21 = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Moda21", GXutil.str( AV31Moda21, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Moda21), "9")));
      GXt_int6 = (byte)(AV60Nofases) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "NOFASE", ""), GXv_int7) ;
      documentodetransporteproduccion_3_impl.this.GXt_int6 = GXv_int7[0] ;
      AV60Nofases = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Nofases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Nofases), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOFASES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60Nofases), "ZZZ9")));
      AV35CliFacMtsP = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35CliFacMtsP", AV35CliFacMtsP);
      if ( AV31Moda21 == 1 )
      {
         GXv_char4[0] = AV7EmprCod ;
         GXv_int8[0] = AV23Guiremcli ;
         GXv_char3[0] = AV35CliFacMtsP ;
         new app.pclimtspl(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         documentodetransporteproduccion_3_impl.this.AV7EmprCod = GXv_char4[0] ;
         documentodetransporteproduccion_3_impl.this.AV23Guiremcli = GXv_int8[0] ;
         documentodetransporteproduccion_3_impl.this.AV35CliFacMtsP = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Guiremcli), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35CliFacMtsP", AV35CliFacMtsP);
      }
      GXt_int6 = (byte)(AV39Plasticos) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "PLASTI", ""), GXv_int7) ;
      documentodetransporteproduccion_3_impl.this.GXt_int6 = GXv_int7[0] ;
      AV39Plasticos = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Plasticos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Plasticos), 4, 0));
      GXt_int6 = (byte)(AV40Tubos) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "TUBOSS", ""), GXv_int7) ;
      documentodetransporteproduccion_3_impl.this.GXt_int6 = GXv_int7[0] ;
      AV40Tubos = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Tubos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Tubos), 4, 0));
      GXt_int6 = (byte)(AV43errkgs) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "ERRKGS", ""), GXv_int7) ;
      documentodetransporteproduccion_3_impl.this.GXt_int6 = GXv_int7[0] ;
      AV43errkgs = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43errkgs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43errkgs), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43errkgs), "ZZZ9")));
      GXt_int6 = (byte)(AV30FlagFas) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "ALBFAS", ""), GXv_int7) ;
      documentodetransporteproduccion_3_impl.this.GXt_int6 = GXv_int7[0] ;
      AV30FlagFas = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30FlagFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagFas), 4, 0));
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV42Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV42Prompt)==0) ? AV64Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV42Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV42Prompt), true);
      AV64Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV42Prompt)==0) ? AV64Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV42Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV42Prompt), true);
      WebComp_Wcdocumentodetransporteproduccion_7_Visible = (((GXutil.strcmp(Gx_mode, "INS")!=0) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0192"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdocumentodetransporteproduccion_7_Visible), 5, 0), true);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcdocumentodetransporteproduccion_7 = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdocumentodetransporteproduccion_7_Component), GXutil.lower( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_7")) != 0 )
      {
         WebComp_Wcdocumentodetransporteproduccion_7 = WebUtils.getWebComponent(getClass(), "app.documentotransporteproduccion.documentodetransporteproduccion_7_impl", remoteHandle, context);
         WebComp_Wcdocumentodetransporteproduccion_7_Component = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_7" ;
      }
      if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_7_Component) != 0 )
      {
         WebComp_Wcdocumentodetransporteproduccion_7.setjustcreated();
         WebComp_Wcdocumentodetransporteproduccion_7.componentprepare(new Object[] {"W0192","",AV7EmprCod,Long.valueOf(AV8AlbProCod),Integer.valueOf(AV23Guiremcli),AV24GuiRemCln,AV25AlbProFch,AV26AlbSec,AV27AlbProPri,Byte.valueOf(AV28AlbEnvFtp),AV29AlbLic,Gx_mode});
         WebComp_Wcdocumentodetransporteproduccion_7.componentbind(new Object[] {"","","vGUIREMCLI","","","","vALBPROPRI","","","vMODE"});
      }
      imgavPrompt_Visible = (((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgavPrompt_Visible), 5, 0), true);
      AV56IN_Barsit = (byte)(5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56IN_Barsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56IN_Barsit), 2, 0));
   }

   public void e141U72( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
      {
         AV57Pzs = A1265BarAlbPie ;
         AV58Kgs = A1261BarAlbKgmE ;
         AV59Mts = A1263BarAlbMtrE ;
         GXv_int8[0] = AV57Pzs ;
         GXv_decimal9[0] = AV58Kgs ;
         GXv_decimal10[0] = AV59Mts ;
         GXv_char4[0] = AV53MetPieCtr ;
         GXv_char3[0] = Gx_msg ;
         new app.pmetpiacopy1(remoteHandle, context).execute( AV7EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV8AlbProCod, GXv_int8, GXv_decimal9, GXv_decimal10, GXv_char4, GXv_char3) ;
         documentodetransporteproduccion_3_impl.this.AV57Pzs = GXv_int8[0] ;
         documentodetransporteproduccion_3_impl.this.AV58Kgs = GXv_decimal9[0] ;
         documentodetransporteproduccion_3_impl.this.AV59Mts = GXv_decimal10[0] ;
         documentodetransporteproduccion_3_impl.this.AV53MetPieCtr = GXv_char4[0] ;
         documentodetransporteproduccion_3_impl.this.Gx_msg = GXv_char3[0] ;
         httpContext.popup(formatLink("app.tmetpi", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim("9999999999")),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV57Pzs,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV58Kgs)),GXutil.URLEncode(DecimalUtil.decToString(AV59Mts)),GXutil.URLEncode(GXutil.rtrim(AV53MetPieCtr)),GXutil.URLEncode(GXutil.rtrim(AV54Mensaje))}, new String[] {"Mode","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","AlbProcod","Pzs","Kgs","Mts","MetPiectr","Mensaje"}) , new Object[] {});
      }
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_8", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(A1261BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(A1263BarAlbMtrE)),GXutil.URLEncode(GXutil.ltrimstr(A1265BarAlbPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV36KilAnt)),GXutil.URLEncode(DecimalUtil.decToString(AV37MetAnt)),GXutil.URLEncode(GXutil.ltrimstr(AV38PieAnt,6,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV52barsit,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV25AlbProFch))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarAlbKgmE","BarAlbMtrE","BarAlbPie","KilAnt","MtrAnt","PieAnt","Mode","BarSit","AlbProFch"}) , new Object[] {});
      if ( (0==AV60Nofases) )
      {
         httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_4", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV28AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV29AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","AlbEnvFtp","AlbLic"}) , new Object[] {});
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcdocumentodetransporteproduccion_7 = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdocumentodetransporteproduccion_7_Component), GXutil.lower( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_7")) != 0 )
         {
            WebComp_Wcdocumentodetransporteproduccion_7 = WebUtils.getWebComponent(getClass(), "app.documentotransporteproduccion.documentodetransporteproduccion_7_impl", remoteHandle, context);
            WebComp_Wcdocumentodetransporteproduccion_7_Component = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_7" ;
         }
         if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_7_Component) != 0 )
         {
            WebComp_Wcdocumentodetransporteproduccion_7.setjustcreated();
            WebComp_Wcdocumentodetransporteproduccion_7.componentprepare(new Object[] {"W0192","",AV7EmprCod,Long.valueOf(AV8AlbProCod),Integer.valueOf(AV23Guiremcli),AV24GuiRemCln,AV25AlbProFch,AV26AlbSec,AV27AlbProPri,Byte.valueOf(AV28AlbEnvFtp),AV29AlbLic,Gx_mode});
            WebComp_Wcdocumentodetransporteproduccion_7.componentbind(new Object[] {"","","vGUIREMCLI","","","","vALBPROPRI","","","vMODE"});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcdocumentodetransporteproduccion_7 )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0192"+"");
            WebComp_Wcdocumentodetransporteproduccion_7.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
         callWebObject(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_3", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(AV23Guiremcli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV24GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV25AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV26AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV27AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(AV28AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV29AlbLic))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
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
      if ( 1 == 0 )
      {
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
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

   public void e151U72( )
   {
      /* 'DoVerPiezas' Routine */
      returnInSub = false ;
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
      {
         GXv_int8[0] = A1265BarAlbPie ;
         GXv_decimal10[0] = A1261BarAlbKgmE ;
         GXv_decimal9[0] = A1263BarAlbMtrE ;
         GXv_char4[0] = AV53MetPieCtr ;
         GXv_char3[0] = Gx_msg ;
         new app.pmetpiacopy1(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A30AlbProCod, GXv_int8, GXv_decimal10, GXv_decimal9, GXv_char4, GXv_char3) ;
         documentodetransporteproduccion_3_impl.this.A1265BarAlbPie = GXv_int8[0] ;
         documentodetransporteproduccion_3_impl.this.A1261BarAlbKgmE = GXv_decimal10[0] ;
         documentodetransporteproduccion_3_impl.this.A1263BarAlbMtrE = GXv_decimal9[0] ;
         documentodetransporteproduccion_3_impl.this.AV53MetPieCtr = GXv_char4[0] ;
         documentodetransporteproduccion_3_impl.this.Gx_msg = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         httpContext.popup(formatLink("app.tmetpi", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim("9999999999")),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A1265BarAlbPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(A1261BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(A1263BarAlbMtrE)),GXutil.URLEncode(GXutil.rtrim(AV53MetPieCtr)),GXutil.URLEncode(GXutil.rtrim(AV54Mensaje))}, new String[] {"Mode","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","AlbProcod","Pzs","Kgs","Mts","MetPiectr","Mensaje"}) , new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      Combo_plascod_Visible = false ;
      ucCombo_plascod.sendProperty(context, "", false, Combo_plascod_Internalname, "Visible", GXutil.booltostr( Combo_plascod_Visible));
      divCombo_plascod_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divCombo_plascod_cell_Internalname, "Class", divCombo_plascod_cell_Class, true);
      edtBarAlbPlas_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), true);
      divBaralbplas_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divBaralbplas_cell_Internalname, "Class", divBaralbplas_cell_Class, true);
   }

   public void S122( )
   {
      /* 'LOADCOMBOPLASCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item11 = AV50PlasCod_Data ;
      GXv_char4[0] = AV48ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item12[0] = GXt_objcol_SdtDVB_SDTComboData_Item11 ;
      new app.documentotransporteproduccion.documentodetransporteproduccion_3loaddvcombo(remoteHandle, context).execute( "PlasCod", Gx_mode, AV7EmprCod, AV8AlbProCod, AV9BarCod, AV10BarCodReo, AV11BarCodPar, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item12) ;
      documentodetransporteproduccion_3_impl.this.AV48ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item11 = GXv_objcol_SdtDVB_SDTComboData_Item12[0] ;
      AV50PlasCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item11 ;
      Combo_plascod_Selectedvalue_set = AV48ComboSelectedValue ;
      ucCombo_plascod.sendProperty(context, "", false, Combo_plascod_Internalname, "SelectedValue_set", Combo_plascod_Selectedvalue_set);
      AV51ComboPlasCod = (short)(GXutil.lval( AV48ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51ComboPlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51ComboPlasCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_plascod_Enabled = false ;
         ucCombo_plascod.sendProperty(context, "", false, Combo_plascod_Internalname, "Enabled", GXutil.booltostr( Combo_plascod_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOTUBCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item11 = AV47TubCod_Data ;
      GXv_char4[0] = AV48ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item12[0] = GXt_objcol_SdtDVB_SDTComboData_Item11 ;
      new app.documentotransporteproduccion.documentodetransporteproduccion_3loaddvcombo(remoteHandle, context).execute( "TubCod", Gx_mode, AV7EmprCod, AV8AlbProCod, AV9BarCod, AV10BarCodReo, AV11BarCodPar, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item12) ;
      documentodetransporteproduccion_3_impl.this.AV48ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item11 = GXv_objcol_SdtDVB_SDTComboData_Item12[0] ;
      AV47TubCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item11 ;
      Combo_tubcod_Selectedvalue_set = AV48ComboSelectedValue ;
      ucCombo_tubcod.sendProperty(context, "", false, Combo_tubcod_Internalname, "SelectedValue_set", Combo_tubcod_Selectedvalue_set);
      AV49ComboTubCod = (short)(GXutil.lval( AV48ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49ComboTubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49ComboTubCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_tubcod_Enabled = false ;
         ucCombo_tubcod.sendProperty(context, "", false, Combo_tubcod_Internalname, "Enabled", GXutil.booltostr( Combo_tubcod_Enabled));
      }
   }

   public void e161U72( )
   {
      /* BarAlbKgmE_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV31Moda21 == 1 )
      {
         if ( ( DecimalUtil.compareTo(A1261BarAlbKgmE, A14353KgsHdr) > 0 ) && ( AV43errkgs == 1 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Os quilos saidos= ", "")+GXutil.trim( GXutil.str( A1261BarAlbKgmE, 9, 2))+httpContext.getMessage( ", são maiores do que os quilos da OS= ", "")+GXutil.trim( GXutil.str( A14353KgsHdr, 9, 2)));
            GX_FocusControl = edtBarAlbKgmE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( GXutil.strcmp(AV35CliFacMtsP, "N") == 0 )
            {
               AV41BarAlbMtrE = (((A5019AlbHdrgm2*A3271AlbHdrAnc)>0) ? (A1261BarAlbKgmE.divide(DecimalUtil.doubleToDec((A5019AlbHdrgm2*(A3271AlbHdrAnc/ (double) (100)))), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)) ;
               GXv_decimal10[0] = A1263BarAlbMtrE ;
               new app.documentotransporteproduccion.baralbmtre_prc(remoteHandle, context).execute( AV41BarAlbMtrE, GXv_decimal10) ;
               documentodetransporteproduccion_3_impl.this.A1263BarAlbMtrE = GXv_decimal10[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
               GXv_char4[0] = Gx_msg ;
               new app.pmodmercopy1(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A1261BarAlbKgmE, AV22UsurCod, AV20Station, AV62Pgmname, GXv_char4) ;
               documentodetransporteproduccion_3_impl.this.Gx_msg = GXv_char4[0] ;
               if ( ! (GXutil.strcmp("", Gx_msg)==0) )
               {
                  httpContext.GX_msglist.addItem(Gx_msg);
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e171U72( )
   {
      /* AlbHdrgm2_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(AV35CliFacMtsP, "N") == 0 ) )
      {
         AV41BarAlbMtrE = (((A5019AlbHdrgm2*A3271AlbHdrAnc)>0) ? (A1261BarAlbKgmE.divide(DecimalUtil.doubleToDec((A5019AlbHdrgm2*(A3271AlbHdrAnc/ (double) (100)))), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)) ;
         GXv_decimal10[0] = A1263BarAlbMtrE ;
         new app.documentotransporteproduccion.baralbmtre_prc(remoteHandle, context).execute( AV41BarAlbMtrE, GXv_decimal10) ;
         documentodetransporteproduccion_3_impl.this.A1263BarAlbMtrE = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
      }
      /*  Sending Event outputs  */
   }

   public void e181U72( )
   {
      /* AlbHdrAnc_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(AV35CliFacMtsP, "N") == 0 ) )
      {
         AV41BarAlbMtrE = (((A5019AlbHdrgm2*A3271AlbHdrAnc)>0) ? (A1261BarAlbKgmE.divide(DecimalUtil.doubleToDec((A5019AlbHdrgm2*(A3271AlbHdrAnc/ (double) (100)))), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)) ;
         GXv_decimal10[0] = A1263BarAlbMtrE ;
         new app.documentotransporteproduccion.baralbmtre_prc(remoteHandle, context).execute( AV41BarAlbMtrE, GXv_decimal10) ;
         documentodetransporteproduccion_3_impl.this.A1263BarAlbMtrE = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
      }
      /*  Sending Event outputs  */
   }

   public void zm1U7195( int GX_JID )
   {
      if ( ( GX_JID == 77 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6466PlasCod = T01U73_A6466PlasCod[0] ;
            Z1266BarAlbTub = T01U73_A1266BarAlbTub[0] ;
            Z1261BarAlbKgmE = T01U73_A1261BarAlbKgmE[0] ;
            Z1265BarAlbPie = T01U73_A1265BarAlbPie[0] ;
            Z1263BarAlbMtrE = T01U73_A1263BarAlbMtrE[0] ;
            Z3271AlbHdrAnc = T01U73_A3271AlbHdrAnc[0] ;
            Z3392AlbColNom = T01U73_A3392AlbColNom[0] ;
            Z3393AlbColNum = T01U73_A3393AlbColNum[0] ;
            Z3394AlbTipCol = T01U73_A3394AlbTipCol[0] ;
            Z3391AlbSer = T01U73_A3391AlbSer[0] ;
            Z8879AlbSerD = T01U73_A8879AlbSerD[0] ;
            Z3886AlbCliCod = T01U73_A3886AlbCliCod[0] ;
            Z12232AlbNomCli = T01U73_A12232AlbNomCli[0] ;
            Z12233AlbNumcli = T01U73_A12233AlbNumcli[0] ;
            Z12234AlbTipArt = T01U73_A12234AlbTipArt[0] ;
            Z5019AlbHdrgm2 = T01U73_A5019AlbHdrgm2[0] ;
            Z4815AlbEncCli = T01U73_A4815AlbEncCli[0] ;
            Z1262BarPreKgm = T01U73_A1262BarPreKgm[0] ;
            Z1264BarPreMtr = T01U73_A1264BarPreMtr[0] ;
            Z32AlbProEsp = T01U73_A32AlbProEsp[0] ;
            Z40AlbProRec = T01U73_A40AlbProRec[0] ;
            Z2398BarFasExt = T01U73_A2398BarFasExt[0] ;
            Z12195BarAlbUnd = T01U73_A12195BarAlbUnd[0] ;
            Z12196BarPreUnd = T01U73_A12196BarPreUnd[0] ;
            Z6645AlbMetULi = T01U73_A6645AlbMetULi[0] ;
            Z1461BarAlbPN = T01U73_A1461BarAlbPN[0] ;
            Z1095AlbTipEnt = T01U73_A1095AlbTipEnt[0] ;
            Z7994AlbDto = T01U73_A7994AlbDto[0] ;
            Z7993AlbMqTj = T01U73_A7993AlbMqTj[0] ;
            Z7992AlbDf3 = T01U73_A7992AlbDf3[0] ;
            Z7991AlbDf2 = T01U73_A7991AlbDf2[0] ;
            Z7990AlbDf1 = T01U73_A7990AlbDf1[0] ;
            Z7989AlbCald = T01U73_A7989AlbCald[0] ;
            Z7104AlbEncA = T01U73_A7104AlbEncA[0] ;
            Z7103AlbEncL = T01U73_A7103AlbEncL[0] ;
            Z6467BarAlbPlas = T01U73_A6467BarAlbPlas[0] ;
            Z2761AlbBarRec = T01U73_A2761AlbBarRec[0] ;
            Z5354AlbImpMan = T01U73_A5354AlbImpMan[0] ;
            Z2441AlbHdrObs = T01U73_A2441AlbHdrObs[0] ;
            Z1458BarAlbBul = T01U73_A1458BarAlbBul[0] ;
            Z2839AlbProVal = T01U73_A2839AlbProVal[0] ;
            Z1248GuiFasULin = T01U73_A1248GuiFasULin[0] ;
            Z2763AlbHdrUlin = T01U73_A2763AlbHdrUlin[0] ;
            Z12905AlbCadEnc = T01U73_A12905AlbCadEnc[0] ;
            Z2396BarAlbObs = T01U73_A2396BarAlbObs[0] ;
            Z14057AlbTiras = T01U73_A14057AlbTiras[0] ;
            Z14058AlbTirasKg = T01U73_A14058AlbTirasKg[0] ;
            Z14059AlbSinTest = T01U73_A14059AlbSinTest[0] ;
            Z1206TubCod = T01U73_A1206TubCod[0] ;
            Z3153CodCod = T01U73_A3153CodCod[0] ;
         }
         else
         {
            Z6466PlasCod = A6466PlasCod ;
            Z1266BarAlbTub = A1266BarAlbTub ;
            Z1261BarAlbKgmE = A1261BarAlbKgmE ;
            Z1265BarAlbPie = A1265BarAlbPie ;
            Z1263BarAlbMtrE = A1263BarAlbMtrE ;
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
            Z4815AlbEncCli = A4815AlbEncCli ;
            Z1262BarPreKgm = A1262BarPreKgm ;
            Z1264BarPreMtr = A1264BarPreMtr ;
            Z32AlbProEsp = A32AlbProEsp ;
            Z40AlbProRec = A40AlbProRec ;
            Z2398BarFasExt = A2398BarFasExt ;
            Z12195BarAlbUnd = A12195BarAlbUnd ;
            Z12196BarPreUnd = A12196BarPreUnd ;
            Z6645AlbMetULi = A6645AlbMetULi ;
            Z1461BarAlbPN = A1461BarAlbPN ;
            Z1095AlbTipEnt = A1095AlbTipEnt ;
            Z7994AlbDto = A7994AlbDto ;
            Z7993AlbMqTj = A7993AlbMqTj ;
            Z7992AlbDf3 = A7992AlbDf3 ;
            Z7991AlbDf2 = A7991AlbDf2 ;
            Z7990AlbDf1 = A7990AlbDf1 ;
            Z7989AlbCald = A7989AlbCald ;
            Z7104AlbEncA = A7104AlbEncA ;
            Z7103AlbEncL = A7103AlbEncL ;
            Z6467BarAlbPlas = A6467BarAlbPlas ;
            Z2761AlbBarRec = A2761AlbBarRec ;
            Z5354AlbImpMan = A5354AlbImpMan ;
            Z2441AlbHdrObs = A2441AlbHdrObs ;
            Z1458BarAlbBul = A1458BarAlbBul ;
            Z2839AlbProVal = A2839AlbProVal ;
            Z1248GuiFasULin = A1248GuiFasULin ;
            Z2763AlbHdrUlin = A2763AlbHdrUlin ;
            Z12905AlbCadEnc = A12905AlbCadEnc ;
            Z2396BarAlbObs = A2396BarAlbObs ;
            Z14057AlbTiras = A14057AlbTiras ;
            Z14058AlbTirasKg = A14058AlbTirasKg ;
            Z14059AlbSinTest = A14059AlbSinTest ;
            Z1206TubCod = A1206TubCod ;
            Z3153CodCod = A3153CodCod ;
         }
      }
      if ( GX_JID == -77 )
      {
         Z6466PlasCod = A6466PlasCod ;
         Z1266BarAlbTub = A1266BarAlbTub ;
         Z1261BarAlbKgmE = A1261BarAlbKgmE ;
         Z1265BarAlbPie = A1265BarAlbPie ;
         Z1263BarAlbMtrE = A1263BarAlbMtrE ;
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
         Z4815AlbEncCli = A4815AlbEncCli ;
         Z1262BarPreKgm = A1262BarPreKgm ;
         Z1264BarPreMtr = A1264BarPreMtr ;
         Z32AlbProEsp = A32AlbProEsp ;
         Z40AlbProRec = A40AlbProRec ;
         Z2398BarFasExt = A2398BarFasExt ;
         Z12195BarAlbUnd = A12195BarAlbUnd ;
         Z12196BarPreUnd = A12196BarPreUnd ;
         Z6645AlbMetULi = A6645AlbMetULi ;
         Z1461BarAlbPN = A1461BarAlbPN ;
         Z1095AlbTipEnt = A1095AlbTipEnt ;
         Z7994AlbDto = A7994AlbDto ;
         Z7993AlbMqTj = A7993AlbMqTj ;
         Z7992AlbDf3 = A7992AlbDf3 ;
         Z7991AlbDf2 = A7991AlbDf2 ;
         Z7990AlbDf1 = A7990AlbDf1 ;
         Z7989AlbCald = A7989AlbCald ;
         Z7104AlbEncA = A7104AlbEncA ;
         Z7103AlbEncL = A7103AlbEncL ;
         Z6467BarAlbPlas = A6467BarAlbPlas ;
         Z2761AlbBarRec = A2761AlbBarRec ;
         Z5354AlbImpMan = A5354AlbImpMan ;
         Z2441AlbHdrObs = A2441AlbHdrObs ;
         Z1458BarAlbBul = A1458BarAlbBul ;
         Z2839AlbProVal = A2839AlbProVal ;
         Z1248GuiFasULin = A1248GuiFasULin ;
         Z2763AlbHdrUlin = A2763AlbHdrUlin ;
         Z12905AlbCadEnc = A12905AlbCadEnc ;
         Z2396BarAlbObs = A2396BarAlbObs ;
         Z14057AlbTiras = A14057AlbTiras ;
         Z14058AlbTirasKg = A14058AlbTirasKg ;
         Z14059AlbSinTest = A14059AlbSinTest ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z1206TubCod = A1206TubCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z3153CodCod = A3153CodCod ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z3154CodDsc = A3154CodDsc ;
         Z1253EmprGuiRem = A1253EmprGuiRem ;
         Z5805AlbEnvFtp = A5805AlbEnvFtp ;
         Z7101AlbLic = A7101AlbLic ;
         Z34AlbProfch = A34AlbProfch ;
         Z2242AlbSec = A2242AlbSec ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z1244GuiRemCln = A1244GuiRemCln ;
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
         Z1279BarKla = A1279BarKla ;
         Z1280BarMla = A1280BarMla ;
         Z1292BarPlz = A1292BarPlz ;
         Z898BarPieNDes = A898BarPieNDes ;
         Z199BarPie1 = A199BarPie1 ;
         Z1208TubPre = A1208TubPre ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSer_Enabled), 5, 0), true);
      edtAlbSerD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSerD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSerD_Enabled), 5, 0), true);
      edtAlbColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNom_Enabled), 5, 0), true);
      edtAlbColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNum_Enabled), 5, 0), true);
      edtAlbNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNomCli_Enabled), 5, 0), true);
      chkBarTipCor.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarTipCor.getEnabled(), 5, 0), true);
      AV62Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_3" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Pgmname", AV62Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      imgavPrompt_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.seleccionhdrprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"BARCOD"+"'), id:'"+"BARCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"BARCODREO"+"'), id:'"+"BARCODREO"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"BARCODPAR"+"'), id:'"+"BARCODPAR"+"'"+",IOType:'inout',isKey:true,isLastKey:true}"+","+"{Ctrl:gx.dom.el('"+"vGUIREMCLI"+"'), id:'"+"vGUIREMCLI"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vIN_BARSIT"+"'), id:'"+"vIN_BARSIT"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Link", imgavPrompt_Link, true);
      edtAlbSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSer_Enabled), 5, 0), true);
      edtAlbSerD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSerD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSerD_Enabled), 5, 0), true);
      edtAlbColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNom_Enabled), 5, 0), true);
      edtAlbColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNum_Enabled), 5, 0), true);
      edtAlbNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNomCli_Enabled), 5, 0), true);
      chkBarTipCor.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarTipCor.getEnabled(), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01U76 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01U76_A407EmprNom[0] ;
      n407EmprNom = T01U76_n407EmprNom[0] ;
      A3915EmpNumDec = T01U76_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01U76_n3915EmpNumDec[0] ;
      pr_default.close(3);
      if ( ! (0==AV8AlbProCod) )
      {
         A30AlbProCod = AV8AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      if ( ! (0==AV8AlbProCod) )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8AlbProCod) )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9BarCod) )
      {
         A129BarCod = AV9BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV9BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            edtBarCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
         }
         else
         {
            edtBarCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
         }
      }
      if ( ! (0==AV9BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV10BarCodReo) )
      {
         A132BarCodReo = AV10BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (0==AV10BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            edtBarCodReo_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
         }
         else
         {
            edtBarCodReo_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
         }
      }
      if ( ! (0==AV10BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV11BarCodPar)==0) )
      {
         A130BarCodPar = AV11BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (GXutil.strcmp("", AV11BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
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
      if ( ! (GXutil.strcmp("", AV11BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV15Insert_PlasCod) )
      {
         edtPlasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Enabled), 5, 0), true);
      }
      else
      {
         edtPlasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV18Insert_TubCod) )
      {
         edtTubCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTubCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTubCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTubCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Enabled), 5, 0), true);
      }
      if ( AV31Moda21 == 1 )
      {
         bttBtnverpiezas_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtnverpiezas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnverpiezas_Visible), 5, 0), true);
      }
      else
      {
         if ( ! ( ( AV31Moda21 == 1 ) ) )
         {
            bttBtnverpiezas_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtnverpiezas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnverpiezas_Visible), 5, 0), true);
         }
      }
      if ( AV31Moda21 == 1 )
      {
         bttBtnimprimirhdr_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtnimprimirhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnimprimirhdr_Visible), 5, 0), true);
      }
      else
      {
         if ( ! ( ( AV31Moda21 == 1 ) ) )
         {
            bttBtnimprimirhdr_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtnimprimirhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnimprimirhdr_Visible), 5, 0), true);
         }
      }
      Combo_plascod_Visible = (boolean)((AV39Plasticos==1)) ;
      ucCombo_plascod.sendProperty(context, "", false, Combo_plascod_Internalname, "Visible", GXutil.booltostr( Combo_plascod_Visible));
      if ( ! ( ( AV39Plasticos == 1 ) ) )
      {
         divCombo_plascod_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divCombo_plascod_cell_Internalname, "Class", divCombo_plascod_cell_Class, true);
      }
      else
      {
         if ( AV39Plasticos == 1 )
         {
            divCombo_plascod_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divCombo_plascod_cell_Internalname, "Class", divCombo_plascod_cell_Class, true);
         }
      }
      edtBarAlbPlas_Visible = ((AV39Plasticos==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Visible), 5, 0), true);
      if ( ! ( ( AV39Plasticos == 1 ) ) )
      {
         divBaralbplas_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divBaralbplas_cell_Internalname, "Class", divBaralbplas_cell_Class, true);
      }
      else
      {
         if ( AV39Plasticos == 1 )
         {
            divBaralbplas_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-1 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divBaralbplas_cell_Internalname, "Class", divBaralbplas_cell_Class, true);
         }
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV17Insert_CodCod)==0) )
      {
         A3153CodCod = AV17Insert_CodCod ;
         n3153CodCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3153CodCod", A3153CodCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV18Insert_TubCod) )
      {
         A1206TubCod = AV18Insert_TubCod ;
         n1206TubCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
      }
      else
      {
         if ( (0==AV49ComboTubCod) )
         {
            A1206TubCod = (short)(0) ;
            n1206TubCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
            n1206TubCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
         }
         else
         {
            if ( ! (0==AV49ComboTubCod) )
            {
               A1206TubCod = AV49ComboTubCod ;
               n1206TubCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
            }
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV15Insert_PlasCod) )
      {
         A6466PlasCod = AV15Insert_PlasCod ;
         n6466PlasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
      }
      else
      {
         if ( (0==AV51ComboPlasCod) )
         {
            A6466PlasCod = (short)(0) ;
            n6466PlasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
            n6466PlasCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
         }
         else
         {
            if ( ! (0==AV51ComboPlasCod) )
            {
               A6466PlasCod = AV51ComboPlasCod ;
               n6466PlasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
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
      if ( isIns( )  && (GXutil.strcmp("", A2839AlbProVal)==0) && ( Gx_BScreen == 0 ) )
      {
         A2839AlbProVal = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
      }
      if ( isIns( )  && (GXutil.strcmp("", A14057AlbTiras)==0) && ( Gx_BScreen == 0 ) )
      {
         A14057AlbTiras = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14057AlbTiras", A14057AlbTiras);
      }
      if ( isIns( )  && (GXutil.strcmp("", A14059AlbSinTest)==0) && ( Gx_BScreen == 0 ) )
      {
         A14059AlbSinTest = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14059AlbSinTest", A14059AlbSinTest);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01U79 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         A1253EmprGuiRem = T01U79_A1253EmprGuiRem[0] ;
         A5805AlbEnvFtp = T01U79_A5805AlbEnvFtp[0] ;
         A7101AlbLic = T01U79_A7101AlbLic[0] ;
         A34AlbProfch = T01U79_A34AlbProfch[0] ;
         A2242AlbSec = T01U79_A2242AlbSec[0] ;
         A1243GuiRemCli = T01U79_A1243GuiRemCli[0] ;
         pr_default.close(6);
         /* Using cursor T01U711 */
         pr_default.execute(8, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01U711_A1244GuiRemCln[0] ;
         pr_default.close(8);
         /* Using cursor T01U75 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A13890BarHDSusp = T01U75_A13890BarHDSusp[0] ;
            n13890BarHDSusp = T01U75_n13890BarHDSusp[0] ;
         }
         else
         {
            A13890BarHDSusp = (byte)(0) ;
            n13890BarHDSusp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13890BarHDSusp", GXutil.str( A13890BarHDSusp, 1, 0));
         }
         pr_default.close(2);
         /* Using cursor T01U77 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A361DisCod = T01U77_A361DisCod[0] ;
         A1235BarNumCli = T01U77_A1235BarNumCli[0] ;
         A1234BarNomCli = T01U77_A1234BarNomCli[0] ;
         A5034BarEstTip = T01U77_A5034BarEstTip[0] ;
         A5291BarTipCor = T01U77_A5291BarTipCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
         A5027BarGraCob = T01U77_A5027BarGraCob[0] ;
         A2010BarTipDis = T01U77_A2010BarTipDis[0] ;
         A4937BarCtrPdas = T01U77_A4937BarCtrPdas[0] ;
         n4937BarCtrPdas = T01U77_n4937BarCtrPdas[0] ;
         A5253BarAcc = T01U77_A5253BarAcc[0] ;
         A148BarEstReo = T01U77_A148BarEstReo[0] ;
         A143BarDisNum = T01U77_A143BarDisNum[0] ;
         A1909BarGraAca = T01U77_A1909BarGraAca[0] ;
         A4812BarEncCli = T01U77_A4812BarEncCli[0] ;
         A1652BarSerDsc = T01U77_A1652BarSerDsc[0] ;
         A218BarTipCol = T01U77_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A136BarColNum = T01U77_A136BarColNum[0] ;
         A135BarColNom = T01U77_A135BarColNom[0] ;
         A1503BarPart = T01U77_A1503BarPart[0] ;
         A161BarFecSal = T01U77_A161BarFecSal[0] ;
         A125BarAncAca1 = T01U77_A125BarAncAca1[0] ;
         A213BarSit = T01U77_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A212BarSer = T01U77_A212BarSer[0] ;
         A4466BarAcaAnh = T01U77_A4466BarAcaAnh[0] ;
         A252CliCod = T01U77_A252CliCod[0] ;
         n252CliCod = T01U77_n252CliCod[0] ;
         A217BarTipArt = T01U77_A217BarTipArt[0] ;
         n217BarTipArt = T01U77_n217BarTipArt[0] ;
         pr_default.close(4);
         /* Using cursor T01U712 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A365DisDes = T01U712_A365DisDes[0] ;
         pr_default.close(9);
         GXt_char1 = A13878PedidoClie ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char2[0] = A143BarDisNum ;
         GXv_char13[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char13) ;
         documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char4[0] ;
         documentodetransporteproduccion_3_impl.this.A4812BarEncCli = GXv_char3[0] ;
         documentodetransporteproduccion_3_impl.this.A143BarDisNum = GXv_char2[0] ;
         documentodetransporteproduccion_3_impl.this.GXt_char1 = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
         /* Using cursor T01U714 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(10) != 101) )
         {
            A1279BarKla = T01U714_A1279BarKla[0] ;
            A1280BarMla = T01U714_A1280BarMla[0] ;
            A1292BarPlz = T01U714_A1292BarPlz[0] ;
         }
         else
         {
            A1279BarKla = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
            A1280BarMla = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
            A1292BarPlz = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
         }
         pr_default.close(10);
         /* Using cursor T01U716 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(11) != 101) )
         {
            A898BarPieNDes = T01U716_A898BarPieNDes[0] ;
            A199BarPie1 = T01U716_A199BarPie1[0] ;
         }
         else
         {
            A898BarPieNDes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
            A199BarPie1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         }
         pr_default.close(11);
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         else
         {
            A198BarPie = A199BarPie1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         GXt_int14 = A14356PzsEntrega ;
         GXv_int8[0] = GXt_int14 ;
         new app.piezasaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
         documentodetransporteproduccion_3_impl.this.GXt_int14 = GXv_int8[0] ;
         A14356PzsEntrega = GXt_int14 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14356PzsEntrega", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14356PzsEntrega), 6, 0));
         GXt_decimal15 = A14355MtsEntrega ;
         GXv_decimal10[0] = GXt_decimal15 ;
         new app.metrosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal10) ;
         documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal10[0] ;
         A14355MtsEntrega = GXt_decimal15 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14355MtsEntrega", GXutil.ltrimstr( A14355MtsEntrega, 9, 2));
         GXt_decimal15 = A14354KgsEntrega ;
         GXv_decimal10[0] = GXt_decimal15 ;
         new app.kilosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal10) ;
         documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal10[0] ;
         A14354KgsEntrega = GXt_decimal15 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14354KgsEntrega", GXutil.ltrimstr( A14354KgsEntrega, 9, 2));
         GXt_decimal15 = A14353KgsHdr ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int8[0] = A129BarCod ;
         GXv_int7[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal10[0] = GXt_decimal15 ;
         new app.pkilos(remoteHandle, context).execute( GXv_char13, GXv_int8, GXv_int7, GXv_char4, GXv_decimal10) ;
         documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char13[0] ;
         documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int8[0] ;
         documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int7[0] ;
         documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char4[0] ;
         documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14353KgsHdr = GXt_decimal15 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14353KgsHdr", GXutil.ltrimstr( A14353KgsHdr, 9, 2));
         GXt_char1 = A14056AlbColorCv ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int8[0] = A129BarCod ;
         GXv_int7[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = GXt_char1 ;
         new app.pnortt(remoteHandle, context).execute( GXv_char13, GXv_int8, GXv_int7, GXv_char4, GXv_char3) ;
         documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char13[0] ;
         documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int8[0] ;
         documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int7[0] ;
         documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char4[0] ;
         documentodetransporteproduccion_3_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14056AlbColorCv = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14056AlbColorCv", A14056AlbColorCv);
         /* Using cursor T01U710 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n3153CodCod), A3153CodCod});
         A3154CodDsc = T01U710_A3154CodDsc[0] ;
         n3154CodDsc = T01U710_n3154CodDsc[0] ;
         pr_default.close(7);
         /* Using cursor T01U78 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod)});
         A1208TubPre = T01U78_A1208TubPre[0] ;
         n1208TubPre = T01U78_n1208TubPre[0] ;
         pr_default.close(5);
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
         {
            edtBarCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Forecolor), 9, 0), true);
         }
         else
         {
            if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
            {
               edtBarCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
               httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Forecolor), 9, 0), true);
            }
         }
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCod_Backcolor = GXutil.getColor( 255, 255, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Backcolor), 9, 0), true);
         }
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
         {
            edtBarCodReo_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Forecolor), 9, 0), true);
         }
         else
         {
            if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
            {
               edtBarCodReo_Forecolor = GXutil.getColor( 0, 0, 0) ;
               httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Forecolor), 9, 0), true);
            }
         }
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCodReo_Backcolor = GXutil.getColor( 255, 255, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Backcolor), 9, 0), true);
         }
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
         {
            edtBarCodPar_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Forecolor), 9, 0), true);
         }
         else
         {
            if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
            {
               edtBarCodPar_Forecolor = GXutil.getColor( 0, 0, 0) ;
               httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Forecolor), 9, 0), true);
            }
         }
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCodPar_Backcolor = GXutil.getColor( 255, 255, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Backcolor), 9, 0), true);
         }
      }
   }

   public void load1U7195( )
   {
      /* Using cursor T01U719 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A1253EmprGuiRem = T01U719_A1253EmprGuiRem[0] ;
         A361DisCod = T01U719_A361DisCod[0] ;
         A6466PlasCod = T01U719_A6466PlasCod[0] ;
         n6466PlasCod = T01U719_n6466PlasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
         A1266BarAlbTub = T01U719_A1266BarAlbTub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1266BarAlbTub), 6, 0));
         A1261BarAlbKgmE = T01U719_A1261BarAlbKgmE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1265BarAlbPie = T01U719_A1265BarAlbPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
         A1263BarAlbMtrE = T01U719_A1263BarAlbMtrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         A3271AlbHdrAnc = T01U719_A3271AlbHdrAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3271AlbHdrAnc), 4, 0));
         A3392AlbColNom = T01U719_A3392AlbColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", A3392AlbColNom);
         A3393AlbColNum = T01U719_A3393AlbColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3393AlbColNum), 6, 0));
         A3394AlbTipCol = T01U719_A3394AlbTipCol[0] ;
         A3391AlbSer = T01U719_A3391AlbSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", A3391AlbSer);
         A8879AlbSerD = T01U719_A8879AlbSerD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", A8879AlbSerD);
         A3886AlbCliCod = T01U719_A3886AlbCliCod[0] ;
         A12232AlbNomCli = T01U719_A12232AlbNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", A12232AlbNomCli);
         A12233AlbNumcli = T01U719_A12233AlbNumcli[0] ;
         A12234AlbTipArt = T01U719_A12234AlbTipArt[0] ;
         A5019AlbHdrgm2 = T01U719_A5019AlbHdrgm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5019AlbHdrgm2), 4, 0));
         A4815AlbEncCli = T01U719_A4815AlbEncCli[0] ;
         A1262BarPreKgm = T01U719_A1262BarPreKgm[0] ;
         A1264BarPreMtr = T01U719_A1264BarPreMtr[0] ;
         A32AlbProEsp = T01U719_A32AlbProEsp[0] ;
         A40AlbProRec = T01U719_A40AlbProRec[0] ;
         A2398BarFasExt = T01U719_A2398BarFasExt[0] ;
         A407EmprNom = T01U719_A407EmprNom[0] ;
         n407EmprNom = T01U719_n407EmprNom[0] ;
         A5805AlbEnvFtp = T01U719_A5805AlbEnvFtp[0] ;
         A7101AlbLic = T01U719_A7101AlbLic[0] ;
         A1244GuiRemCln = T01U719_A1244GuiRemCln[0] ;
         A34AlbProfch = T01U719_A34AlbProfch[0] ;
         A2242AlbSec = T01U719_A2242AlbSec[0] ;
         A1235BarNumCli = T01U719_A1235BarNumCli[0] ;
         A1234BarNomCli = T01U719_A1234BarNomCli[0] ;
         A12195BarAlbUnd = T01U719_A12195BarAlbUnd[0] ;
         A12196BarPreUnd = T01U719_A12196BarPreUnd[0] ;
         A5034BarEstTip = T01U719_A5034BarEstTip[0] ;
         A6645AlbMetULi = T01U719_A6645AlbMetULi[0] ;
         A5291BarTipCor = T01U719_A5291BarTipCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
         A5027BarGraCob = T01U719_A5027BarGraCob[0] ;
         A2010BarTipDis = T01U719_A2010BarTipDis[0] ;
         A1461BarAlbPN = T01U719_A1461BarAlbPN[0] ;
         A4937BarCtrPdas = T01U719_A4937BarCtrPdas[0] ;
         n4937BarCtrPdas = T01U719_n4937BarCtrPdas[0] ;
         A1095AlbTipEnt = T01U719_A1095AlbTipEnt[0] ;
         A7994AlbDto = T01U719_A7994AlbDto[0] ;
         A7993AlbMqTj = T01U719_A7993AlbMqTj[0] ;
         A7992AlbDf3 = T01U719_A7992AlbDf3[0] ;
         A7991AlbDf2 = T01U719_A7991AlbDf2[0] ;
         A7990AlbDf1 = T01U719_A7990AlbDf1[0] ;
         A7989AlbCald = T01U719_A7989AlbCald[0] ;
         A7104AlbEncA = T01U719_A7104AlbEncA[0] ;
         A7103AlbEncL = T01U719_A7103AlbEncL[0] ;
         A6467BarAlbPlas = T01U719_A6467BarAlbPlas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6467BarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6467BarAlbPlas), 4, 0));
         A2761AlbBarRec = T01U719_A2761AlbBarRec[0] ;
         A5253BarAcc = T01U719_A5253BarAcc[0] ;
         A5354AlbImpMan = T01U719_A5354AlbImpMan[0] ;
         A148BarEstReo = T01U719_A148BarEstReo[0] ;
         A143BarDisNum = T01U719_A143BarDisNum[0] ;
         A1909BarGraAca = T01U719_A1909BarGraAca[0] ;
         A4812BarEncCli = T01U719_A4812BarEncCli[0] ;
         A2441AlbHdrObs = T01U719_A2441AlbHdrObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2441AlbHdrObs", A2441AlbHdrObs);
         A1652BarSerDsc = T01U719_A1652BarSerDsc[0] ;
         A218BarTipCol = T01U719_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A136BarColNum = T01U719_A136BarColNum[0] ;
         A135BarColNom = T01U719_A135BarColNom[0] ;
         A3154CodDsc = T01U719_A3154CodDsc[0] ;
         n3154CodDsc = T01U719_n3154CodDsc[0] ;
         A1503BarPart = T01U719_A1503BarPart[0] ;
         A1458BarAlbBul = T01U719_A1458BarAlbBul[0] ;
         A2839AlbProVal = T01U719_A2839AlbProVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
         A365DisDes = T01U719_A365DisDes[0] ;
         A161BarFecSal = T01U719_A161BarFecSal[0] ;
         A1208TubPre = T01U719_A1208TubPre[0] ;
         n1208TubPre = T01U719_n1208TubPre[0] ;
         A125BarAncAca1 = T01U719_A125BarAncAca1[0] ;
         A213BarSit = T01U719_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A212BarSer = T01U719_A212BarSer[0] ;
         A1248GuiFasULin = T01U719_A1248GuiFasULin[0] ;
         A2763AlbHdrUlin = T01U719_A2763AlbHdrUlin[0] ;
         A4466BarAcaAnh = T01U719_A4466BarAcaAnh[0] ;
         A12905AlbCadEnc = T01U719_A12905AlbCadEnc[0] ;
         A2396BarAlbObs = T01U719_A2396BarAlbObs[0] ;
         A14057AlbTiras = T01U719_A14057AlbTiras[0] ;
         A14058AlbTirasKg = T01U719_A14058AlbTirasKg[0] ;
         A14059AlbSinTest = T01U719_A14059AlbSinTest[0] ;
         A3915EmpNumDec = T01U719_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01U719_n3915EmpNumDec[0] ;
         A1206TubCod = T01U719_A1206TubCod[0] ;
         n1206TubCod = T01U719_n1206TubCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
         A3153CodCod = T01U719_A3153CodCod[0] ;
         n3153CodCod = T01U719_n3153CodCod[0] ;
         A1243GuiRemCli = T01U719_A1243GuiRemCli[0] ;
         A252CliCod = T01U719_A252CliCod[0] ;
         n252CliCod = T01U719_n252CliCod[0] ;
         A217BarTipArt = T01U719_A217BarTipArt[0] ;
         n217BarTipArt = T01U719_n217BarTipArt[0] ;
         A1279BarKla = T01U719_A1279BarKla[0] ;
         A1280BarMla = T01U719_A1280BarMla[0] ;
         A1292BarPlz = T01U719_A1292BarPlz[0] ;
         A898BarPieNDes = T01U719_A898BarPieNDes[0] ;
         A199BarPie1 = T01U719_A199BarPie1[0] ;
         zm1U7195( -77) ;
      }
      pr_default.close(12);
      onLoadActions1U7195( ) ;
   }

   public void onLoadActions1U7195( )
   {
      /* Using cursor T01U75 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A13890BarHDSusp = T01U75_A13890BarHDSusp[0] ;
         n13890BarHDSusp = T01U75_n13890BarHDSusp[0] ;
      }
      else
      {
         A13890BarHDSusp = (byte)(0) ;
         n13890BarHDSusp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13890BarHDSusp", GXutil.str( A13890BarHDSusp, 1, 0));
      }
      pr_default.close(2);
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
      {
         edtBarCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Forecolor), 9, 0), true);
      }
      else
      {
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Forecolor), 9, 0), true);
         }
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
      {
         edtBarCod_Backcolor = GXutil.getColor( 255, 255, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Backcolor), 9, 0), true);
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
      {
         edtBarCodReo_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Forecolor), 9, 0), true);
      }
      else
      {
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCodReo_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Forecolor), 9, 0), true);
         }
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
      {
         edtBarCodReo_Backcolor = GXutil.getColor( 255, 255, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Backcolor), 9, 0), true);
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
      {
         edtBarCodPar_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Forecolor), 9, 0), true);
      }
      else
      {
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCodPar_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Forecolor), 9, 0), true);
         }
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
      {
         edtBarCodPar_Backcolor = GXutil.getColor( 255, 255, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Backcolor), 9, 0), true);
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      GXt_int14 = A14356PzsEntrega ;
      GXv_int8[0] = GXt_int14 ;
      new app.piezasaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
      documentodetransporteproduccion_3_impl.this.GXt_int14 = GXv_int8[0] ;
      A14356PzsEntrega = GXt_int14 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14356PzsEntrega", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14356PzsEntrega), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A1265BarAlbPie) )
      {
         A1265BarAlbPie = A14356PzsEntrega ;
         httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
      }
      GXt_decimal15 = A14355MtsEntrega ;
      GXv_decimal10[0] = GXt_decimal15 ;
      new app.metrosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal10) ;
      documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal10[0] ;
      A14355MtsEntrega = GXt_decimal15 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14355MtsEntrega", GXutil.ltrimstr( A14355MtsEntrega, 9, 2));
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1263BarAlbMtrE)==0) )
      {
         A1263BarAlbMtrE = A14355MtsEntrega ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
      }
      GXt_decimal15 = A14354KgsEntrega ;
      GXv_decimal10[0] = GXt_decimal15 ;
      new app.kilosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal10) ;
      documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal10[0] ;
      A14354KgsEntrega = GXt_decimal15 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14354KgsEntrega", GXutil.ltrimstr( A14354KgsEntrega, 9, 2));
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1261BarAlbKgmE)==0) )
      {
         A1261BarAlbKgmE = A14354KgsEntrega ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
      }
      GXt_decimal15 = A14353KgsHdr ;
      GXv_char13[0] = A396EmprCod ;
      GXv_int8[0] = A129BarCod ;
      GXv_int7[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_decimal10[0] = GXt_decimal15 ;
      new app.pkilos(remoteHandle, context).execute( GXv_char13, GXv_int8, GXv_int7, GXv_char4, GXv_decimal10) ;
      documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char13[0] ;
      documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int8[0] ;
      documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int7[0] ;
      documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char4[0] ;
      documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A14353KgsHdr = GXt_decimal15 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14353KgsHdr", GXutil.ltrimstr( A14353KgsHdr, 9, 2));
      GXt_char1 = A14056AlbColorCv ;
      GXv_char13[0] = A396EmprCod ;
      GXv_int8[0] = A129BarCod ;
      GXv_int7[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_char3[0] = GXt_char1 ;
      new app.pnortt(remoteHandle, context).execute( GXv_char13, GXv_int8, GXv_int7, GXv_char4, GXv_char3) ;
      documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char13[0] ;
      documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int8[0] ;
      documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int7[0] ;
      documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char4[0] ;
      documentodetransporteproduccion_3_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A14056AlbColorCv = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14056AlbColorCv", A14056AlbColorCv);
      GXt_char1 = A13878PedidoClie ;
      GXv_char13[0] = A396EmprCod ;
      GXv_char4[0] = A4812BarEncCli ;
      GXv_char3[0] = A143BarDisNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char13, GXv_char4, GXv_char3, GXv_char2) ;
      documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char13[0] ;
      documentodetransporteproduccion_3_impl.this.A4812BarEncCli = GXv_char4[0] ;
      documentodetransporteproduccion_3_impl.this.A143BarDisNum = GXv_char3[0] ;
      documentodetransporteproduccion_3_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A13878PedidoClie = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      if ( ( A1206TubCod > 0 ) && isIns( )  )
      {
         A1266BarAlbTub = A1265BarAlbPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1266BarAlbTub), 6, 0));
      }
      AV38PieAnt = O1265BarAlbPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38PieAnt), 6, 0));
      AV37MetAnt = O1263BarAlbMtrE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37MetAnt", GXutil.ltrimstr( AV37MetAnt, 9, 2));
      AV36KilAnt = O1261BarAlbKgmE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36KilAnt", GXutil.ltrimstr( AV36KilAnt, 9, 2));
      if ( A3915EmpNumDec == 2 )
      {
         A1281TubImp = GXutil.roundDecimal( A1208TubPre.multiply(DecimalUtil.doubleToDec(A1266BarAlbTub)), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1281TubImp", GXutil.ltrimstr( A1281TubImp, 12, 2));
      }
      else
      {
         if ( A3915EmpNumDec == 0 )
         {
            A1281TubImp = GXutil.roundDecimal( A1208TubPre.multiply(DecimalUtil.doubleToDec(A1266BarAlbTub)), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1281TubImp", GXutil.ltrimstr( A1281TubImp, 12, 2));
         }
         else
         {
            A1281TubImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1281TubImp", GXutil.ltrimstr( A1281TubImp, 12, 2));
         }
      }
   }

   public void checkExtendedTable1U7195( )
   {
      nIsDirty_195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01U75 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A13890BarHDSusp = T01U75_A13890BarHDSusp[0] ;
         n13890BarHDSusp = T01U75_n13890BarHDSusp[0] ;
      }
      else
      {
         nIsDirty_195 = (short)(1) ;
         A13890BarHDSusp = (byte)(0) ;
         n13890BarHDSusp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13890BarHDSusp", GXutil.str( A13890BarHDSusp, 1, 0));
      }
      pr_default.close(2);
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         GXv_char13[0] = AV54Mensaje ;
         new app.ctrlhdrguia(remoteHandle, context).execute( AV7EmprCod, AV8AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_char13) ;
         documentodetransporteproduccion_3_impl.this.AV54Mensaje = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54Mensaje", AV54Mensaje);
      }
      if ( ! (GXutil.strcmp("", AV54Mensaje)==0) )
      {
         httpContext.GX_msglist.addItem(AV54Mensaje, 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  )
      {
         GXv_int16[0] = A3271AlbHdrAnc ;
         GXv_char13[0] = A3392AlbColNom ;
         GXv_int8[0] = A3393AlbColNum ;
         GXv_int7[0] = A3394AlbTipCol ;
         GXv_char4[0] = A3391AlbSer ;
         GXv_char3[0] = A8879AlbSerD ;
         GXv_int17[0] = A3886AlbCliCod ;
         GXv_char2[0] = A12232AlbNomCli ;
         GXv_int18[0] = A12233AlbNumcli ;
         GXv_int19[0] = A12234AlbTipArt ;
         GXv_int20[0] = A5019AlbHdrgm2 ;
         GXv_char21[0] = A4815AlbEncCli ;
         GXv_int22[0] = (byte)(0) ;
         GXv_char23[0] = "" ;
         GXv_int24[0] = (byte)(0) ;
         new app.documentotransporteproduccion.documentodetransporteproduccion_datoshdrguia(remoteHandle, context).execute( AV7EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int16, GXv_char13, GXv_int8, GXv_int7, GXv_char4, GXv_char3, GXv_int17, GXv_char2, GXv_int18, GXv_int19, GXv_int20, GXv_char21, GXv_int22, GXv_char23, GXv_int24) ;
         documentodetransporteproduccion_3_impl.this.A3271AlbHdrAnc = GXv_int16[0] ;
         documentodetransporteproduccion_3_impl.this.A3392AlbColNom = GXv_char13[0] ;
         documentodetransporteproduccion_3_impl.this.A3393AlbColNum = GXv_int8[0] ;
         documentodetransporteproduccion_3_impl.this.A3394AlbTipCol = GXv_int7[0] ;
         documentodetransporteproduccion_3_impl.this.A3391AlbSer = GXv_char4[0] ;
         documentodetransporteproduccion_3_impl.this.A8879AlbSerD = GXv_char3[0] ;
         documentodetransporteproduccion_3_impl.this.A3886AlbCliCod = GXv_int17[0] ;
         documentodetransporteproduccion_3_impl.this.A12232AlbNomCli = GXv_char2[0] ;
         documentodetransporteproduccion_3_impl.this.A12233AlbNumcli = GXv_int18[0] ;
         documentodetransporteproduccion_3_impl.this.A12234AlbTipArt = GXv_int19[0] ;
         documentodetransporteproduccion_3_impl.this.A5019AlbHdrgm2 = GXv_int20[0] ;
         documentodetransporteproduccion_3_impl.this.A4815AlbEncCli = GXv_char21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3271AlbHdrAnc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", A3392AlbColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3393AlbColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3394AlbTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3394AlbTipCol), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", A3391AlbSer);
         httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", A8879AlbSerD);
         httpContext.ajax_rsp_assign_attri("", false, "A3886AlbCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3886AlbCliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", A12232AlbNomCli);
         httpContext.ajax_rsp_assign_attri("", false, "A12233AlbNumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12233AlbNumcli), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A12234AlbTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12234AlbTipArt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5019AlbHdrgm2), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
      }
      if ( ( GXutil.strcmp(AV27AlbProPri, "1") == 0 ) && ( A148BarEstReo == 2 ) && true /* After */ && ( AV31Moda21 == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço nao autorizada. Es uma Reclamaçao ¡¡¡", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01U77 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Nº HDR", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T01U77_A361DisCod[0] ;
      A1235BarNumCli = T01U77_A1235BarNumCli[0] ;
      A1234BarNomCli = T01U77_A1234BarNomCli[0] ;
      A5034BarEstTip = T01U77_A5034BarEstTip[0] ;
      A5291BarTipCor = T01U77_A5291BarTipCor[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
      A5027BarGraCob = T01U77_A5027BarGraCob[0] ;
      A2010BarTipDis = T01U77_A2010BarTipDis[0] ;
      A4937BarCtrPdas = T01U77_A4937BarCtrPdas[0] ;
      n4937BarCtrPdas = T01U77_n4937BarCtrPdas[0] ;
      A5253BarAcc = T01U77_A5253BarAcc[0] ;
      A148BarEstReo = T01U77_A148BarEstReo[0] ;
      A143BarDisNum = T01U77_A143BarDisNum[0] ;
      A1909BarGraAca = T01U77_A1909BarGraAca[0] ;
      A4812BarEncCli = T01U77_A4812BarEncCli[0] ;
      A1652BarSerDsc = T01U77_A1652BarSerDsc[0] ;
      A218BarTipCol = T01U77_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A136BarColNum = T01U77_A136BarColNum[0] ;
      A135BarColNom = T01U77_A135BarColNom[0] ;
      A1503BarPart = T01U77_A1503BarPart[0] ;
      A161BarFecSal = T01U77_A161BarFecSal[0] ;
      A125BarAncAca1 = T01U77_A125BarAncAca1[0] ;
      A213BarSit = T01U77_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A212BarSer = T01U77_A212BarSer[0] ;
      A4466BarAcaAnh = T01U77_A4466BarAcaAnh[0] ;
      A252CliCod = T01U77_A252CliCod[0] ;
      n252CliCod = T01U77_n252CliCod[0] ;
      A217BarTipArt = T01U77_A217BarTipArt[0] ;
      n217BarTipArt = T01U77_n217BarTipArt[0] ;
      pr_default.close(4);
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
      {
         edtBarCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Forecolor), 9, 0), true);
      }
      else
      {
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Forecolor), 9, 0), true);
         }
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
      {
         edtBarCod_Backcolor = GXutil.getColor( 255, 255, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Backcolor), 9, 0), true);
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
      {
         edtBarCodReo_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Forecolor), 9, 0), true);
      }
      else
      {
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCodReo_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Forecolor), 9, 0), true);
         }
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
      {
         edtBarCodReo_Backcolor = GXutil.getColor( 255, 255, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Backcolor), 9, 0), true);
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
      {
         edtBarCodPar_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Forecolor), 9, 0), true);
      }
      else
      {
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCodPar_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Forecolor), 9, 0), true);
         }
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
      {
         edtBarCodPar_Backcolor = GXutil.getColor( 255, 255, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Backcolor), 9, 0), true);
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
      if ( A252CliCod != AV23Guiremcli )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente errado", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01U78 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1206TubCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TUBOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TUBCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTubCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1208TubPre = T01U78_A1208TubPre[0] ;
      n1208TubPre = T01U78_n1208TubPre[0] ;
      pr_default.close(5);
      /* Using cursor T01U79 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1253EmprGuiRem = T01U79_A1253EmprGuiRem[0] ;
      A5805AlbEnvFtp = T01U79_A5805AlbEnvFtp[0] ;
      A7101AlbLic = T01U79_A7101AlbLic[0] ;
      A34AlbProfch = T01U79_A34AlbProfch[0] ;
      A2242AlbSec = T01U79_A2242AlbSec[0] ;
      A1243GuiRemCli = T01U79_A1243GuiRemCli[0] ;
      pr_default.close(6);
      /* Using cursor T01U711 */
      pr_default.execute(8, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01U711_A1244GuiRemCln[0] ;
      pr_default.close(8);
      /* Using cursor T01U710 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n3153CodCod), A3153CodCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3153CodCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODCOD");
            AnyError = (short)(1) ;
         }
      }
      A3154CodDsc = T01U710_A3154CodDsc[0] ;
      n3154CodDsc = T01U710_n3154CodDsc[0] ;
      pr_default.close(7);
      /* Using cursor T01U712 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A365DisDes = T01U712_A365DisDes[0] ;
      pr_default.close(9);
      /* Using cursor T01U714 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A1279BarKla = T01U714_A1279BarKla[0] ;
         A1280BarMla = T01U714_A1280BarMla[0] ;
         A1292BarPlz = T01U714_A1292BarPlz[0] ;
      }
      else
      {
         nIsDirty_195 = (short)(1) ;
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         nIsDirty_195 = (short)(1) ;
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         nIsDirty_195 = (short)(1) ;
         A1292BarPlz = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
      }
      pr_default.close(10);
      /* Using cursor T01U716 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A898BarPieNDes = T01U716_A898BarPieNDes[0] ;
         A199BarPie1 = T01U716_A199BarPie1[0] ;
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
      pr_default.close(11);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         nIsDirty_195 = (short)(1) ;
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         nIsDirty_195 = (short)(1) ;
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      nIsDirty_195 = (short)(1) ;
      GXt_int14 = A14356PzsEntrega ;
      GXv_int18[0] = GXt_int14 ;
      new app.piezasaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int18) ;
      documentodetransporteproduccion_3_impl.this.GXt_int14 = GXv_int18[0] ;
      A14356PzsEntrega = GXt_int14 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14356PzsEntrega", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14356PzsEntrega), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A1265BarAlbPie) )
      {
         nIsDirty_195 = (short)(1) ;
         A1265BarAlbPie = A14356PzsEntrega ;
         httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
      }
      nIsDirty_195 = (short)(1) ;
      GXt_decimal15 = A14355MtsEntrega ;
      GXv_decimal10[0] = GXt_decimal15 ;
      new app.metrosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal10) ;
      documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal10[0] ;
      A14355MtsEntrega = GXt_decimal15 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14355MtsEntrega", GXutil.ltrimstr( A14355MtsEntrega, 9, 2));
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1263BarAlbMtrE)==0) )
      {
         nIsDirty_195 = (short)(1) ;
         A1263BarAlbMtrE = A14355MtsEntrega ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
      }
      nIsDirty_195 = (short)(1) ;
      GXt_decimal15 = A14354KgsEntrega ;
      GXv_decimal10[0] = GXt_decimal15 ;
      new app.kilosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal10) ;
      documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal10[0] ;
      A14354KgsEntrega = GXt_decimal15 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14354KgsEntrega", GXutil.ltrimstr( A14354KgsEntrega, 9, 2));
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1261BarAlbKgmE)==0) )
      {
         nIsDirty_195 = (short)(1) ;
         A1261BarAlbKgmE = A14354KgsEntrega ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
      }
      nIsDirty_195 = (short)(1) ;
      GXt_decimal15 = A14353KgsHdr ;
      GXv_char23[0] = A396EmprCod ;
      GXv_int18[0] = A129BarCod ;
      GXv_int24[0] = A132BarCodReo ;
      GXv_char21[0] = A130BarCodPar ;
      GXv_decimal10[0] = GXt_decimal15 ;
      new app.pkilos(remoteHandle, context).execute( GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_decimal10) ;
      documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
      documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
      documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
      documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
      documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A14353KgsHdr = GXt_decimal15 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14353KgsHdr", GXutil.ltrimstr( A14353KgsHdr, 9, 2));
      if ( ( AV31Moda21 == 1 ) && ( DecimalUtil.compareTo(A1261BarAlbKgmE, A14353KgsHdr) > 0 ) && ( AV43errkgs == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Os quilos saidos= ", "")+GXutil.trim( GXutil.str( A1261BarAlbKgmE, 9, 2))+httpContext.getMessage( ", são maiores do que os quilos da OS= ", "")+GXutil.trim( GXutil.str( A14353KgsHdr, 9, 2)), 1, "BARALBKGME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_195 = (short)(1) ;
      GXt_char1 = A14056AlbColorCv ;
      GXv_char23[0] = A396EmprCod ;
      GXv_int18[0] = A129BarCod ;
      GXv_int24[0] = A132BarCodReo ;
      GXv_char21[0] = A130BarCodPar ;
      GXv_char13[0] = GXt_char1 ;
      new app.pnortt(remoteHandle, context).execute( GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_char13) ;
      documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
      documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
      documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
      documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
      documentodetransporteproduccion_3_impl.this.GXt_char1 = GXv_char13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A14056AlbColorCv = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14056AlbColorCv", A14056AlbColorCv);
      nIsDirty_195 = (short)(1) ;
      GXt_char1 = A13878PedidoClie ;
      GXv_char23[0] = A396EmprCod ;
      GXv_char21[0] = A4812BarEncCli ;
      GXv_char13[0] = A143BarDisNum ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char23, GXv_char21, GXv_char13, GXv_char4) ;
      documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
      documentodetransporteproduccion_3_impl.this.A4812BarEncCli = GXv_char21[0] ;
      documentodetransporteproduccion_3_impl.this.A143BarDisNum = GXv_char13[0] ;
      documentodetransporteproduccion_3_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A13878PedidoClie = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      if ( ( A1206TubCod > 0 ) && isIns( )  )
      {
         nIsDirty_195 = (short)(1) ;
         A1266BarAlbTub = A1265BarAlbPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1266BarAlbTub), 6, 0));
      }
      AV38PieAnt = O1265BarAlbPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38PieAnt), 6, 0));
      AV37MetAnt = O1263BarAlbMtrE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37MetAnt", GXutil.ltrimstr( AV37MetAnt, 9, 2));
      AV36KilAnt = O1261BarAlbKgmE ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36KilAnt", GXutil.ltrimstr( AV36KilAnt, 9, 2));
      if ( A3915EmpNumDec == 2 )
      {
         nIsDirty_195 = (short)(1) ;
         A1281TubImp = GXutil.roundDecimal( A1208TubPre.multiply(DecimalUtil.doubleToDec(A1266BarAlbTub)), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1281TubImp", GXutil.ltrimstr( A1281TubImp, 12, 2));
      }
      else
      {
         if ( A3915EmpNumDec == 0 )
         {
            nIsDirty_195 = (short)(1) ;
            A1281TubImp = GXutil.roundDecimal( A1208TubPre.multiply(DecimalUtil.doubleToDec(A1266BarAlbTub)), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1281TubImp", GXutil.ltrimstr( A1281TubImp, 12, 2));
         }
         else
         {
            nIsDirty_195 = (short)(1) ;
            A1281TubImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1281TubImp", GXutil.ltrimstr( A1281TubImp, 12, 2));
         }
      }
   }

   public void closeExtendedTableCursors1U7195( )
   {
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(11);
   }

   public void enableDisable( )
   {
   }

   public void gxload_78( int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01U721 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A13890BarHDSusp = T01U721_A13890BarHDSusp[0] ;
         n13890BarHDSusp = T01U721_n13890BarHDSusp[0] ;
      }
      else
      {
         A13890BarHDSusp = (byte)(0) ;
         n13890BarHDSusp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13890BarHDSusp", GXutil.str( A13890BarHDSusp, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13890BarHDSusp, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_80( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01U722 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Nº HDR", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T01U722_A361DisCod[0] ;
      A1235BarNumCli = T01U722_A1235BarNumCli[0] ;
      A1234BarNomCli = T01U722_A1234BarNomCli[0] ;
      A5034BarEstTip = T01U722_A5034BarEstTip[0] ;
      A5291BarTipCor = T01U722_A5291BarTipCor[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
      A5027BarGraCob = T01U722_A5027BarGraCob[0] ;
      A2010BarTipDis = T01U722_A2010BarTipDis[0] ;
      A4937BarCtrPdas = T01U722_A4937BarCtrPdas[0] ;
      n4937BarCtrPdas = T01U722_n4937BarCtrPdas[0] ;
      A5253BarAcc = T01U722_A5253BarAcc[0] ;
      A148BarEstReo = T01U722_A148BarEstReo[0] ;
      A143BarDisNum = T01U722_A143BarDisNum[0] ;
      A1909BarGraAca = T01U722_A1909BarGraAca[0] ;
      A4812BarEncCli = T01U722_A4812BarEncCli[0] ;
      A1652BarSerDsc = T01U722_A1652BarSerDsc[0] ;
      A218BarTipCol = T01U722_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A136BarColNum = T01U722_A136BarColNum[0] ;
      A135BarColNom = T01U722_A135BarColNom[0] ;
      A1503BarPart = T01U722_A1503BarPart[0] ;
      A161BarFecSal = T01U722_A161BarFecSal[0] ;
      A125BarAncAca1 = T01U722_A125BarAncAca1[0] ;
      A213BarSit = T01U722_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A212BarSer = T01U722_A212BarSer[0] ;
      A4466BarAcaAnh = T01U722_A4466BarAcaAnh[0] ;
      A252CliCod = T01U722_A252CliCod[0] ;
      n252CliCod = T01U722_n252CliCod[0] ;
      A217BarTipArt = T01U722_A217BarTipArt[0] ;
      n217BarTipArt = T01U722_n217BarTipArt[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1234BarNomCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5034BarEstTip))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5291BarTipCor))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5027BarGraCob, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2010BarTipDis))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4937BarCtrPdas, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5253BarAcc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A143BarDisNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4812BarEncCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1652BarSerDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A161BarFecSal, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_81( String A396EmprCod ,
                          short A1206TubCod )
   {
      /* Using cursor T01U723 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1206TubCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TUBOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TUBCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTubCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1208TubPre = T01U723_A1208TubPre[0] ;
      n1208TubPre = T01U723_n1208TubPre[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1208TubPre, (byte)(10), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_82( String A396EmprCod ,
                          long A30AlbProCod )
   {
      /* Using cursor T01U724 */
      pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1253EmprGuiRem = T01U724_A1253EmprGuiRem[0] ;
      A5805AlbEnvFtp = T01U724_A5805AlbEnvFtp[0] ;
      A7101AlbLic = T01U724_A7101AlbLic[0] ;
      A34AlbProfch = T01U724_A34AlbProfch[0] ;
      A2242AlbSec = T01U724_A2242AlbSec[0] ;
      A1243GuiRemCli = T01U724_A1243GuiRemCli[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1253EmprGuiRem))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7101AlbLic))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A34AlbProfch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2242AlbSec))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_84( String A1253EmprGuiRem ,
                          int A1243GuiRemCli )
   {
      /* Using cursor T01U725 */
      pr_default.execute(17, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01U725_A1244GuiRemCln[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1244GuiRemCln))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_83( String A396EmprCod ,
                          String A3153CodCod )
   {
      /* Using cursor T01U726 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n3153CodCod), A3153CodCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3153CodCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODCOD");
            AnyError = (short)(1) ;
         }
      }
      A3154CodDsc = T01U726_A3154CodDsc[0] ;
      n3154CodDsc = T01U726_n3154CodDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3154CodDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_85( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01U727 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A365DisDes = T01U727_A365DisDes[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_86( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01U729 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(20) != 101) )
      {
         A1279BarKla = T01U729_A1279BarKla[0] ;
         A1280BarMla = T01U729_A1280BarMla[0] ;
         A1292BarPlz = T01U729_A1292BarPlz[0] ;
      }
      else
      {
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         A1292BarPlz = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1292BarPlz, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_87( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01U731 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(21) != 101) )
      {
         A898BarPieNDes = T01U731_A898BarPieNDes[0] ;
         A199BarPie1 = T01U731_A199BarPie1[0] ;
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
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void getKey1U7195( )
   {
      /* Using cursor T01U732 */
      pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      else
      {
         RcdFound195 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01U73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1U7195( 77) ;
         RcdFound195 = (short)(1) ;
         A6466PlasCod = T01U73_A6466PlasCod[0] ;
         n6466PlasCod = T01U73_n6466PlasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
         A1266BarAlbTub = T01U73_A1266BarAlbTub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1266BarAlbTub), 6, 0));
         A1261BarAlbKgmE = T01U73_A1261BarAlbKgmE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1265BarAlbPie = T01U73_A1265BarAlbPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
         A1263BarAlbMtrE = T01U73_A1263BarAlbMtrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         A3271AlbHdrAnc = T01U73_A3271AlbHdrAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3271AlbHdrAnc), 4, 0));
         A3392AlbColNom = T01U73_A3392AlbColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", A3392AlbColNom);
         A3393AlbColNum = T01U73_A3393AlbColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3393AlbColNum), 6, 0));
         A3394AlbTipCol = T01U73_A3394AlbTipCol[0] ;
         A3391AlbSer = T01U73_A3391AlbSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", A3391AlbSer);
         A8879AlbSerD = T01U73_A8879AlbSerD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", A8879AlbSerD);
         A3886AlbCliCod = T01U73_A3886AlbCliCod[0] ;
         A12232AlbNomCli = T01U73_A12232AlbNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", A12232AlbNomCli);
         A12233AlbNumcli = T01U73_A12233AlbNumcli[0] ;
         A12234AlbTipArt = T01U73_A12234AlbTipArt[0] ;
         A5019AlbHdrgm2 = T01U73_A5019AlbHdrgm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5019AlbHdrgm2), 4, 0));
         A4815AlbEncCli = T01U73_A4815AlbEncCli[0] ;
         A1262BarPreKgm = T01U73_A1262BarPreKgm[0] ;
         A1264BarPreMtr = T01U73_A1264BarPreMtr[0] ;
         A32AlbProEsp = T01U73_A32AlbProEsp[0] ;
         A40AlbProRec = T01U73_A40AlbProRec[0] ;
         A2398BarFasExt = T01U73_A2398BarFasExt[0] ;
         A12195BarAlbUnd = T01U73_A12195BarAlbUnd[0] ;
         A12196BarPreUnd = T01U73_A12196BarPreUnd[0] ;
         A6645AlbMetULi = T01U73_A6645AlbMetULi[0] ;
         A1461BarAlbPN = T01U73_A1461BarAlbPN[0] ;
         A1095AlbTipEnt = T01U73_A1095AlbTipEnt[0] ;
         A7994AlbDto = T01U73_A7994AlbDto[0] ;
         A7993AlbMqTj = T01U73_A7993AlbMqTj[0] ;
         A7992AlbDf3 = T01U73_A7992AlbDf3[0] ;
         A7991AlbDf2 = T01U73_A7991AlbDf2[0] ;
         A7990AlbDf1 = T01U73_A7990AlbDf1[0] ;
         A7989AlbCald = T01U73_A7989AlbCald[0] ;
         A7104AlbEncA = T01U73_A7104AlbEncA[0] ;
         A7103AlbEncL = T01U73_A7103AlbEncL[0] ;
         A6467BarAlbPlas = T01U73_A6467BarAlbPlas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6467BarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6467BarAlbPlas), 4, 0));
         A2761AlbBarRec = T01U73_A2761AlbBarRec[0] ;
         A5354AlbImpMan = T01U73_A5354AlbImpMan[0] ;
         A2441AlbHdrObs = T01U73_A2441AlbHdrObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2441AlbHdrObs", A2441AlbHdrObs);
         A1458BarAlbBul = T01U73_A1458BarAlbBul[0] ;
         A2839AlbProVal = T01U73_A2839AlbProVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
         A1248GuiFasULin = T01U73_A1248GuiFasULin[0] ;
         A2763AlbHdrUlin = T01U73_A2763AlbHdrUlin[0] ;
         A12905AlbCadEnc = T01U73_A12905AlbCadEnc[0] ;
         A2396BarAlbObs = T01U73_A2396BarAlbObs[0] ;
         A14057AlbTiras = T01U73_A14057AlbTiras[0] ;
         A14058AlbTirasKg = T01U73_A14058AlbTirasKg[0] ;
         A14059AlbSinTest = T01U73_A14059AlbSinTest[0] ;
         A396EmprCod = T01U73_A396EmprCod[0] ;
         A129BarCod = T01U73_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01U73_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01U73_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1206TubCod = T01U73_A1206TubCod[0] ;
         n1206TubCod = T01U73_n1206TubCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
         A30AlbProCod = T01U73_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A3153CodCod = T01U73_A3153CodCod[0] ;
         n3153CodCod = T01U73_n3153CodCod[0] ;
         O1265BarAlbPie = A1265BarAlbPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
         O1263BarAlbMtrE = A1263BarAlbMtrE ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         O1261BarAlbKgmE = A1261BarAlbKgmE ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1U7195( ) ;
         if ( AnyError == 1 )
         {
            RcdFound195 = (short)(0) ;
            initializeNonKey1U7195( ) ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound195 = (short)(0) ;
         initializeNonKey1U7195( ) ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1U7195( ) ;
      if ( RcdFound195 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T01U733 */
      pr_default.execute(23, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         while ( (pr_default.getStatus(23) != 101) && ( ( GXutil.strcmp(T01U733_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01U733_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U733_A129BarCod[0] < A129BarCod ) || ( T01U733_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01U733_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U733_A132BarCodReo[0] < A132BarCodReo ) || ( T01U733_A132BarCodReo[0] == A132BarCodReo ) && ( T01U733_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01U733_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01U733_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01U733_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01U733_A132BarCodReo[0] == A132BarCodReo ) && ( T01U733_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01U733_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U733_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            pr_default.readNext(23);
         }
         if ( (pr_default.getStatus(23) != 101) && ( ( GXutil.strcmp(T01U733_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01U733_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U733_A129BarCod[0] > A129BarCod ) || ( T01U733_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01U733_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U733_A132BarCodReo[0] > A132BarCodReo ) || ( T01U733_A132BarCodReo[0] == A132BarCodReo ) && ( T01U733_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01U733_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01U733_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01U733_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01U733_A132BarCodReo[0] == A132BarCodReo ) && ( T01U733_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01U733_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U733_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            A396EmprCod = T01U733_A396EmprCod[0] ;
            A129BarCod = T01U733_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01U733_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01U733_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A30AlbProCod = T01U733_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(23);
   }

   public void move_previous( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T01U734 */
      pr_default.execute(24, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         while ( (pr_default.getStatus(24) != 101) && ( ( GXutil.strcmp(T01U734_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01U734_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U734_A129BarCod[0] > A129BarCod ) || ( T01U734_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01U734_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U734_A132BarCodReo[0] > A132BarCodReo ) || ( T01U734_A132BarCodReo[0] == A132BarCodReo ) && ( T01U734_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01U734_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01U734_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01U734_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01U734_A132BarCodReo[0] == A132BarCodReo ) && ( T01U734_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01U734_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U734_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            pr_default.readNext(24);
         }
         if ( (pr_default.getStatus(24) != 101) && ( ( GXutil.strcmp(T01U734_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01U734_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U734_A129BarCod[0] < A129BarCod ) || ( T01U734_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01U734_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U734_A132BarCodReo[0] < A132BarCodReo ) || ( T01U734_A132BarCodReo[0] == A132BarCodReo ) && ( T01U734_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01U734_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01U734_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01U734_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01U734_A132BarCodReo[0] == A132BarCodReo ) && ( T01U734_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01U734_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U734_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            A396EmprCod = T01U734_A396EmprCod[0] ;
            A129BarCod = T01U734_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01U734_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01U734_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A30AlbProCod = T01U734_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(24);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1U7195( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1U7195( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound195 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ALBPROCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
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
               update1U7195( ) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1U7195( ) ;
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
                  GX_FocusControl = edtAlbProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1U7195( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
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

   public void checkOptimisticConcurrency1U7195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01U72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z6466PlasCod != T01U72_A6466PlasCod[0] ) || ( Z1266BarAlbTub != T01U72_A1266BarAlbTub[0] ) || ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01U72_A1261BarAlbKgmE[0]) != 0 ) || ( Z1265BarAlbPie != T01U72_A1265BarAlbPie[0] ) || ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01U72_A1263BarAlbMtrE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3271AlbHdrAnc != T01U72_A3271AlbHdrAnc[0] ) || ( GXutil.strcmp(Z3392AlbColNom, T01U72_A3392AlbColNom[0]) != 0 ) || ( Z3393AlbColNum != T01U72_A3393AlbColNum[0] ) || ( Z3394AlbTipCol != T01U72_A3394AlbTipCol[0] ) || ( GXutil.strcmp(Z3391AlbSer, T01U72_A3391AlbSer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8879AlbSerD, T01U72_A8879AlbSerD[0]) != 0 ) || ( Z3886AlbCliCod != T01U72_A3886AlbCliCod[0] ) || ( GXutil.strcmp(Z12232AlbNomCli, T01U72_A12232AlbNomCli[0]) != 0 ) || ( Z12233AlbNumcli != T01U72_A12233AlbNumcli[0] ) || ( Z12234AlbTipArt != T01U72_A12234AlbTipArt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5019AlbHdrgm2 != T01U72_A5019AlbHdrgm2[0] ) || ( GXutil.strcmp(Z4815AlbEncCli, T01U72_A4815AlbEncCli[0]) != 0 ) || ( DecimalUtil.compareTo(Z1262BarPreKgm, T01U72_A1262BarPreKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z1264BarPreMtr, T01U72_A1264BarPreMtr[0]) != 0 ) || ( Z32AlbProEsp != T01U72_A32AlbProEsp[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z40AlbProRec, T01U72_A40AlbProRec[0]) != 0 ) || ( GXutil.strcmp(Z2398BarFasExt, T01U72_A2398BarFasExt[0]) != 0 ) || ( Z12195BarAlbUnd != T01U72_A12195BarAlbUnd[0] ) || ( DecimalUtil.compareTo(Z12196BarPreUnd, T01U72_A12196BarPreUnd[0]) != 0 ) || ( Z6645AlbMetULi != T01U72_A6645AlbMetULi[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1461BarAlbPN, T01U72_A1461BarAlbPN[0]) != 0 ) || ( GXutil.strcmp(Z1095AlbTipEnt, T01U72_A1095AlbTipEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z7994AlbDto, T01U72_A7994AlbDto[0]) != 0 ) || ( GXutil.strcmp(Z7993AlbMqTj, T01U72_A7993AlbMqTj[0]) != 0 ) || ( GXutil.strcmp(Z7992AlbDf3, T01U72_A7992AlbDf3[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7991AlbDf2, T01U72_A7991AlbDf2[0]) != 0 ) || ( GXutil.strcmp(Z7990AlbDf1, T01U72_A7990AlbDf1[0]) != 0 ) || ( GXutil.strcmp(Z7989AlbCald, T01U72_A7989AlbCald[0]) != 0 ) || ( DecimalUtil.compareTo(Z7104AlbEncA, T01U72_A7104AlbEncA[0]) != 0 ) || ( DecimalUtil.compareTo(Z7103AlbEncL, T01U72_A7103AlbEncL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6467BarAlbPlas != T01U72_A6467BarAlbPlas[0] ) || ( DecimalUtil.compareTo(Z2761AlbBarRec, T01U72_A2761AlbBarRec[0]) != 0 ) || ( DecimalUtil.compareTo(Z5354AlbImpMan, T01U72_A5354AlbImpMan[0]) != 0 ) || ( GXutil.strcmp(Z2441AlbHdrObs, T01U72_A2441AlbHdrObs[0]) != 0 ) || ( Z1458BarAlbBul != T01U72_A1458BarAlbBul[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2839AlbProVal, T01U72_A2839AlbProVal[0]) != 0 ) || ( Z1248GuiFasULin != T01U72_A1248GuiFasULin[0] ) || ( Z2763AlbHdrUlin != T01U72_A2763AlbHdrUlin[0] ) || ( Z12905AlbCadEnc != T01U72_A12905AlbCadEnc[0] ) || ( GXutil.strcmp(Z2396BarAlbObs, T01U72_A2396BarAlbObs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14057AlbTiras, T01U72_A14057AlbTiras[0]) != 0 ) || ( DecimalUtil.compareTo(Z14058AlbTirasKg, T01U72_A14058AlbTirasKg[0]) != 0 ) || ( GXutil.strcmp(Z14059AlbSinTest, T01U72_A14059AlbSinTest[0]) != 0 ) || ( Z1206TubCod != T01U72_A1206TubCod[0] ) || ( GXutil.strcmp(Z3153CodCod, T01U72_A3153CodCod[0]) != 0 ) )
         {
            if ( Z6466PlasCod != T01U72_A6466PlasCod[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"PlasCod");
               GXutil.writeLogRaw("Old: ",Z6466PlasCod);
               GXutil.writeLogRaw("Current: ",T01U72_A6466PlasCod[0]);
            }
            if ( Z1266BarAlbTub != T01U72_A1266BarAlbTub[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"BarAlbTub");
               GXutil.writeLogRaw("Old: ",Z1266BarAlbTub);
               GXutil.writeLogRaw("Current: ",T01U72_A1266BarAlbTub[0]);
            }
            if ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01U72_A1261BarAlbKgmE[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"BarAlbKgmE");
               GXutil.writeLogRaw("Old: ",Z1261BarAlbKgmE);
               GXutil.writeLogRaw("Current: ",T01U72_A1261BarAlbKgmE[0]);
            }
            if ( Z1265BarAlbPie != T01U72_A1265BarAlbPie[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"BarAlbPie");
               GXutil.writeLogRaw("Old: ",Z1265BarAlbPie);
               GXutil.writeLogRaw("Current: ",T01U72_A1265BarAlbPie[0]);
            }
            if ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01U72_A1263BarAlbMtrE[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"BarAlbMtrE");
               GXutil.writeLogRaw("Old: ",Z1263BarAlbMtrE);
               GXutil.writeLogRaw("Current: ",T01U72_A1263BarAlbMtrE[0]);
            }
            if ( Z3271AlbHdrAnc != T01U72_A3271AlbHdrAnc[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbHdrAnc");
               GXutil.writeLogRaw("Old: ",Z3271AlbHdrAnc);
               GXutil.writeLogRaw("Current: ",T01U72_A3271AlbHdrAnc[0]);
            }
            if ( GXutil.strcmp(Z3392AlbColNom, T01U72_A3392AlbColNom[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbColNom");
               GXutil.writeLogRaw("Old: ",Z3392AlbColNom);
               GXutil.writeLogRaw("Current: ",T01U72_A3392AlbColNom[0]);
            }
            if ( Z3393AlbColNum != T01U72_A3393AlbColNum[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbColNum");
               GXutil.writeLogRaw("Old: ",Z3393AlbColNum);
               GXutil.writeLogRaw("Current: ",T01U72_A3393AlbColNum[0]);
            }
            if ( Z3394AlbTipCol != T01U72_A3394AlbTipCol[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbTipCol");
               GXutil.writeLogRaw("Old: ",Z3394AlbTipCol);
               GXutil.writeLogRaw("Current: ",T01U72_A3394AlbTipCol[0]);
            }
            if ( GXutil.strcmp(Z3391AlbSer, T01U72_A3391AlbSer[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbSer");
               GXutil.writeLogRaw("Old: ",Z3391AlbSer);
               GXutil.writeLogRaw("Current: ",T01U72_A3391AlbSer[0]);
            }
            if ( GXutil.strcmp(Z8879AlbSerD, T01U72_A8879AlbSerD[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbSerD");
               GXutil.writeLogRaw("Old: ",Z8879AlbSerD);
               GXutil.writeLogRaw("Current: ",T01U72_A8879AlbSerD[0]);
            }
            if ( Z3886AlbCliCod != T01U72_A3886AlbCliCod[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbCliCod");
               GXutil.writeLogRaw("Old: ",Z3886AlbCliCod);
               GXutil.writeLogRaw("Current: ",T01U72_A3886AlbCliCod[0]);
            }
            if ( GXutil.strcmp(Z12232AlbNomCli, T01U72_A12232AlbNomCli[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbNomCli");
               GXutil.writeLogRaw("Old: ",Z12232AlbNomCli);
               GXutil.writeLogRaw("Current: ",T01U72_A12232AlbNomCli[0]);
            }
            if ( Z12233AlbNumcli != T01U72_A12233AlbNumcli[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbNumcli");
               GXutil.writeLogRaw("Old: ",Z12233AlbNumcli);
               GXutil.writeLogRaw("Current: ",T01U72_A12233AlbNumcli[0]);
            }
            if ( Z12234AlbTipArt != T01U72_A12234AlbTipArt[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbTipArt");
               GXutil.writeLogRaw("Old: ",Z12234AlbTipArt);
               GXutil.writeLogRaw("Current: ",T01U72_A12234AlbTipArt[0]);
            }
            if ( Z5019AlbHdrgm2 != T01U72_A5019AlbHdrgm2[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbHdrgm2");
               GXutil.writeLogRaw("Old: ",Z5019AlbHdrgm2);
               GXutil.writeLogRaw("Current: ",T01U72_A5019AlbHdrgm2[0]);
            }
            if ( GXutil.strcmp(Z4815AlbEncCli, T01U72_A4815AlbEncCli[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbEncCli");
               GXutil.writeLogRaw("Old: ",Z4815AlbEncCli);
               GXutil.writeLogRaw("Current: ",T01U72_A4815AlbEncCli[0]);
            }
            if ( DecimalUtil.compareTo(Z1262BarPreKgm, T01U72_A1262BarPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"BarPreKgm");
               GXutil.writeLogRaw("Old: ",Z1262BarPreKgm);
               GXutil.writeLogRaw("Current: ",T01U72_A1262BarPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z1264BarPreMtr, T01U72_A1264BarPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"BarPreMtr");
               GXutil.writeLogRaw("Old: ",Z1264BarPreMtr);
               GXutil.writeLogRaw("Current: ",T01U72_A1264BarPreMtr[0]);
            }
            if ( Z32AlbProEsp != T01U72_A32AlbProEsp[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbProEsp");
               GXutil.writeLogRaw("Old: ",Z32AlbProEsp);
               GXutil.writeLogRaw("Current: ",T01U72_A32AlbProEsp[0]);
            }
            if ( DecimalUtil.compareTo(Z40AlbProRec, T01U72_A40AlbProRec[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbProRec");
               GXutil.writeLogRaw("Old: ",Z40AlbProRec);
               GXutil.writeLogRaw("Current: ",T01U72_A40AlbProRec[0]);
            }
            if ( GXutil.strcmp(Z2398BarFasExt, T01U72_A2398BarFasExt[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"BarFasExt");
               GXutil.writeLogRaw("Old: ",Z2398BarFasExt);
               GXutil.writeLogRaw("Current: ",T01U72_A2398BarFasExt[0]);
            }
            if ( Z12195BarAlbUnd != T01U72_A12195BarAlbUnd[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"BarAlbUnd");
               GXutil.writeLogRaw("Old: ",Z12195BarAlbUnd);
               GXutil.writeLogRaw("Current: ",T01U72_A12195BarAlbUnd[0]);
            }
            if ( DecimalUtil.compareTo(Z12196BarPreUnd, T01U72_A12196BarPreUnd[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"BarPreUnd");
               GXutil.writeLogRaw("Old: ",Z12196BarPreUnd);
               GXutil.writeLogRaw("Current: ",T01U72_A12196BarPreUnd[0]);
            }
            if ( Z6645AlbMetULi != T01U72_A6645AlbMetULi[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbMetULi");
               GXutil.writeLogRaw("Old: ",Z6645AlbMetULi);
               GXutil.writeLogRaw("Current: ",T01U72_A6645AlbMetULi[0]);
            }
            if ( DecimalUtil.compareTo(Z1461BarAlbPN, T01U72_A1461BarAlbPN[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"BarAlbPN");
               GXutil.writeLogRaw("Old: ",Z1461BarAlbPN);
               GXutil.writeLogRaw("Current: ",T01U72_A1461BarAlbPN[0]);
            }
            if ( GXutil.strcmp(Z1095AlbTipEnt, T01U72_A1095AlbTipEnt[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbTipEnt");
               GXutil.writeLogRaw("Old: ",Z1095AlbTipEnt);
               GXutil.writeLogRaw("Current: ",T01U72_A1095AlbTipEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z7994AlbDto, T01U72_A7994AlbDto[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbDto");
               GXutil.writeLogRaw("Old: ",Z7994AlbDto);
               GXutil.writeLogRaw("Current: ",T01U72_A7994AlbDto[0]);
            }
            if ( GXutil.strcmp(Z7993AlbMqTj, T01U72_A7993AlbMqTj[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbMqTj");
               GXutil.writeLogRaw("Old: ",Z7993AlbMqTj);
               GXutil.writeLogRaw("Current: ",T01U72_A7993AlbMqTj[0]);
            }
            if ( GXutil.strcmp(Z7992AlbDf3, T01U72_A7992AlbDf3[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbDf3");
               GXutil.writeLogRaw("Old: ",Z7992AlbDf3);
               GXutil.writeLogRaw("Current: ",T01U72_A7992AlbDf3[0]);
            }
            if ( GXutil.strcmp(Z7991AlbDf2, T01U72_A7991AlbDf2[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbDf2");
               GXutil.writeLogRaw("Old: ",Z7991AlbDf2);
               GXutil.writeLogRaw("Current: ",T01U72_A7991AlbDf2[0]);
            }
            if ( GXutil.strcmp(Z7990AlbDf1, T01U72_A7990AlbDf1[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbDf1");
               GXutil.writeLogRaw("Old: ",Z7990AlbDf1);
               GXutil.writeLogRaw("Current: ",T01U72_A7990AlbDf1[0]);
            }
            if ( GXutil.strcmp(Z7989AlbCald, T01U72_A7989AlbCald[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbCald");
               GXutil.writeLogRaw("Old: ",Z7989AlbCald);
               GXutil.writeLogRaw("Current: ",T01U72_A7989AlbCald[0]);
            }
            if ( DecimalUtil.compareTo(Z7104AlbEncA, T01U72_A7104AlbEncA[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbEncA");
               GXutil.writeLogRaw("Old: ",Z7104AlbEncA);
               GXutil.writeLogRaw("Current: ",T01U72_A7104AlbEncA[0]);
            }
            if ( DecimalUtil.compareTo(Z7103AlbEncL, T01U72_A7103AlbEncL[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbEncL");
               GXutil.writeLogRaw("Old: ",Z7103AlbEncL);
               GXutil.writeLogRaw("Current: ",T01U72_A7103AlbEncL[0]);
            }
            if ( Z6467BarAlbPlas != T01U72_A6467BarAlbPlas[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"BarAlbPlas");
               GXutil.writeLogRaw("Old: ",Z6467BarAlbPlas);
               GXutil.writeLogRaw("Current: ",T01U72_A6467BarAlbPlas[0]);
            }
            if ( DecimalUtil.compareTo(Z2761AlbBarRec, T01U72_A2761AlbBarRec[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbBarRec");
               GXutil.writeLogRaw("Old: ",Z2761AlbBarRec);
               GXutil.writeLogRaw("Current: ",T01U72_A2761AlbBarRec[0]);
            }
            if ( DecimalUtil.compareTo(Z5354AlbImpMan, T01U72_A5354AlbImpMan[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbImpMan");
               GXutil.writeLogRaw("Old: ",Z5354AlbImpMan);
               GXutil.writeLogRaw("Current: ",T01U72_A5354AlbImpMan[0]);
            }
            if ( GXutil.strcmp(Z2441AlbHdrObs, T01U72_A2441AlbHdrObs[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbHdrObs");
               GXutil.writeLogRaw("Old: ",Z2441AlbHdrObs);
               GXutil.writeLogRaw("Current: ",T01U72_A2441AlbHdrObs[0]);
            }
            if ( Z1458BarAlbBul != T01U72_A1458BarAlbBul[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"BarAlbBul");
               GXutil.writeLogRaw("Old: ",Z1458BarAlbBul);
               GXutil.writeLogRaw("Current: ",T01U72_A1458BarAlbBul[0]);
            }
            if ( GXutil.strcmp(Z2839AlbProVal, T01U72_A2839AlbProVal[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbProVal");
               GXutil.writeLogRaw("Old: ",Z2839AlbProVal);
               GXutil.writeLogRaw("Current: ",T01U72_A2839AlbProVal[0]);
            }
            if ( Z1248GuiFasULin != T01U72_A1248GuiFasULin[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"GuiFasULin");
               GXutil.writeLogRaw("Old: ",Z1248GuiFasULin);
               GXutil.writeLogRaw("Current: ",T01U72_A1248GuiFasULin[0]);
            }
            if ( Z2763AlbHdrUlin != T01U72_A2763AlbHdrUlin[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbHdrUlin");
               GXutil.writeLogRaw("Old: ",Z2763AlbHdrUlin);
               GXutil.writeLogRaw("Current: ",T01U72_A2763AlbHdrUlin[0]);
            }
            if ( Z12905AlbCadEnc != T01U72_A12905AlbCadEnc[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbCadEnc");
               GXutil.writeLogRaw("Old: ",Z12905AlbCadEnc);
               GXutil.writeLogRaw("Current: ",T01U72_A12905AlbCadEnc[0]);
            }
            if ( GXutil.strcmp(Z2396BarAlbObs, T01U72_A2396BarAlbObs[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"BarAlbObs");
               GXutil.writeLogRaw("Old: ",Z2396BarAlbObs);
               GXutil.writeLogRaw("Current: ",T01U72_A2396BarAlbObs[0]);
            }
            if ( GXutil.strcmp(Z14057AlbTiras, T01U72_A14057AlbTiras[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbTiras");
               GXutil.writeLogRaw("Old: ",Z14057AlbTiras);
               GXutil.writeLogRaw("Current: ",T01U72_A14057AlbTiras[0]);
            }
            if ( DecimalUtil.compareTo(Z14058AlbTirasKg, T01U72_A14058AlbTirasKg[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbTirasKg");
               GXutil.writeLogRaw("Old: ",Z14058AlbTirasKg);
               GXutil.writeLogRaw("Current: ",T01U72_A14058AlbTirasKg[0]);
            }
            if ( GXutil.strcmp(Z14059AlbSinTest, T01U72_A14059AlbSinTest[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"AlbSinTest");
               GXutil.writeLogRaw("Old: ",Z14059AlbSinTest);
               GXutil.writeLogRaw("Current: ",T01U72_A14059AlbSinTest[0]);
            }
            if ( Z1206TubCod != T01U72_A1206TubCod[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"TubCod");
               GXutil.writeLogRaw("Old: ",Z1206TubCod);
               GXutil.writeLogRaw("Current: ",T01U72_A1206TubCod[0]);
            }
            if ( GXutil.strcmp(Z3153CodCod, T01U72_A3153CodCod[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_3:[seudo value changed for attri]"+"CodCod");
               GXutil.writeLogRaw("Old: ",Z3153CodCod);
               GXutil.writeLogRaw("Current: ",T01U72_A3153CodCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1U7195( )
   {
      beforeValidate1U7195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U7195( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1U7195( 0) ;
         checkOptimisticConcurrency1U7195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1U7195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1U7195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01U735 */
                  pr_default.execute(25, new Object[] {Boolean.valueOf(n6466PlasCod), Short.valueOf(A6466PlasCod), Integer.valueOf(A1266BarAlbTub), A1261BarAlbKgmE, Integer.valueOf(A1265BarAlbPie), A1263BarAlbMtrE, Short.valueOf(A3271AlbHdrAnc), A3392AlbColNom, Integer.valueOf(A3393AlbColNum), Byte.valueOf(A3394AlbTipCol), A3391AlbSer, A8879AlbSerD, Integer.valueOf(A3886AlbCliCod), A12232AlbNomCli, Integer.valueOf(A12233AlbNumcli), Short.valueOf(A12234AlbTipArt), Short.valueOf(A5019AlbHdrgm2), A4815AlbEncCli, A1262BarPreKgm, A1264BarPreMtr, Byte.valueOf(A32AlbProEsp), A40AlbProRec, A2398BarFasExt, Integer.valueOf(A12195BarAlbUnd), A12196BarPreUnd, Short.valueOf(A6645AlbMetULi), A1461BarAlbPN, A1095AlbTipEnt, A7994AlbDto, A7993AlbMqTj, A7992AlbDf3, A7991AlbDf2, A7990AlbDf1, A7989AlbCald, A7104AlbEncA, A7103AlbEncL, Short.valueOf(A6467BarAlbPlas), A2761AlbBarRec, A5354AlbImpMan, A2441AlbHdrObs, Short.valueOf(A1458BarAlbBul), A2839AlbProVal, Short.valueOf(A1248GuiFasULin), Short.valueOf(A2763AlbHdrUlin), Short.valueOf(A12905AlbCadEnc), A2396BarAlbObs, A14057AlbTiras, A14058AlbTirasKg, A14059AlbSinTest, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod), Long.valueOf(A30AlbProCod), Boolean.valueOf(n3153CodCod), A3153CodCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(25) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && ( AV30FlagFas == 1 ) && ( AV31Moda21 == 1 ) )
                     {
                        GXv_char23[0] = A396EmprCod ;
                        GXv_int25[0] = A30AlbProCod ;
                        GXv_int18[0] = A129BarCod ;
                        GXv_int24[0] = A132BarCodReo ;
                        GXv_char21[0] = A130BarCodPar ;
                        new app.pfas618(remoteHandle, context).execute( GXv_char23, GXv_int25, GXv_int18, GXv_int24, GXv_char21) ;
                        documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
                        documentodetransporteproduccion_3_impl.this.A30AlbProCod = GXv_int25[0] ;
                        documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
                        documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
                        documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                     }
                     if ( true /* After */ && ( AV30FlagFas == 1 ) )
                     {
                        GXv_char23[0] = A396EmprCod ;
                        GXv_int25[0] = A30AlbProCod ;
                        GXv_int18[0] = A129BarCod ;
                        GXv_int24[0] = A132BarCodReo ;
                        GXv_char21[0] = A130BarCodPar ;
                        new app.pcopfas(remoteHandle, context).execute( GXv_char23, GXv_int25, GXv_int18, GXv_int24, GXv_char21) ;
                        documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
                        documentodetransporteproduccion_3_impl.this.A30AlbProCod = GXv_int25[0] ;
                        documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
                        documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
                        documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                     }
                     if ( true /* After */ && ( AV30FlagFas == 1 ) )
                     {
                        GXv_char23[0] = A396EmprCod ;
                        GXv_int25[0] = A30AlbProCod ;
                        GXv_int18[0] = A129BarCod ;
                        GXv_int24[0] = A132BarCodReo ;
                        GXv_char21[0] = A130BarCodPar ;
                        new app.pkilfas(remoteHandle, context).execute( GXv_char23, GXv_int25, GXv_int18, GXv_int24, GXv_char21) ;
                        documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
                        documentodetransporteproduccion_3_impl.this.A30AlbProCod = GXv_int25[0] ;
                        documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
                        documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
                        documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char23[0] = A396EmprCod ;
                        GXv_int18[0] = A129BarCod ;
                        GXv_int24[0] = A132BarCodReo ;
                        GXv_char21[0] = A130BarCodPar ;
                        GXv_decimal10[0] = A1261BarAlbKgmE ;
                        GXv_decimal9[0] = A1263BarAlbMtrE ;
                        GXv_int17[0] = A1265BarAlbPie ;
                        GXv_decimal26[0] = AV36KilAnt ;
                        GXv_decimal27[0] = AV37MetAnt ;
                        GXv_int8[0] = AV38PieAnt ;
                        GXv_char13[0] = Gx_mode ;
                        new app.pcampie(remoteHandle, context).execute( GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_decimal10, GXv_decimal9, GXv_int17, GXv_decimal26, GXv_decimal27, GXv_int8, GXv_char13) ;
                        documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
                        documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
                        documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
                        documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
                        documentodetransporteproduccion_3_impl.this.A1261BarAlbKgmE = GXv_decimal10[0] ;
                        documentodetransporteproduccion_3_impl.this.A1263BarAlbMtrE = GXv_decimal9[0] ;
                        documentodetransporteproduccion_3_impl.this.A1265BarAlbPie = GXv_int17[0] ;
                        documentodetransporteproduccion_3_impl.this.AV36KilAnt = GXv_decimal26[0] ;
                        documentodetransporteproduccion_3_impl.this.AV37MetAnt = GXv_decimal27[0] ;
                        documentodetransporteproduccion_3_impl.this.AV38PieAnt = GXv_int8[0] ;
                        documentodetransporteproduccion_3_impl.this.Gx_mode = GXv_char13[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                        httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV36KilAnt", GXutil.ltrimstr( AV36KilAnt, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV37MetAnt", GXutil.ltrimstr( AV37MetAnt, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV38PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38PieAnt), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1U70( ) ;
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
            load1U7195( ) ;
         }
         endLevel1U7195( ) ;
      }
      closeExtendedTableCursors1U7195( ) ;
   }

   public void update1U7195( )
   {
      beforeValidate1U7195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U7195( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1U7195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1U7195( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1U7195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01U736 */
                  pr_default.execute(26, new Object[] {Boolean.valueOf(n6466PlasCod), Short.valueOf(A6466PlasCod), Integer.valueOf(A1266BarAlbTub), A1261BarAlbKgmE, Integer.valueOf(A1265BarAlbPie), A1263BarAlbMtrE, Short.valueOf(A3271AlbHdrAnc), A3392AlbColNom, Integer.valueOf(A3393AlbColNum), Byte.valueOf(A3394AlbTipCol), A3391AlbSer, A8879AlbSerD, Integer.valueOf(A3886AlbCliCod), A12232AlbNomCli, Integer.valueOf(A12233AlbNumcli), Short.valueOf(A12234AlbTipArt), Short.valueOf(A5019AlbHdrgm2), A4815AlbEncCli, A1262BarPreKgm, A1264BarPreMtr, Byte.valueOf(A32AlbProEsp), A40AlbProRec, A2398BarFasExt, Integer.valueOf(A12195BarAlbUnd), A12196BarPreUnd, Short.valueOf(A6645AlbMetULi), A1461BarAlbPN, A1095AlbTipEnt, A7994AlbDto, A7993AlbMqTj, A7992AlbDf3, A7991AlbDf2, A7990AlbDf1, A7989AlbCald, A7104AlbEncA, A7103AlbEncL, Short.valueOf(A6467BarAlbPlas), A2761AlbBarRec, A5354AlbImpMan, A2441AlbHdrObs, Short.valueOf(A1458BarAlbBul), A2839AlbProVal, Short.valueOf(A1248GuiFasULin), Short.valueOf(A2763AlbHdrUlin), Short.valueOf(A12905AlbCadEnc), A2396BarAlbObs, A14057AlbTiras, A14058AlbTirasKg, A14059AlbSinTest, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod), Boolean.valueOf(n3153CodCod), A3153CodCod, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(26) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1U7195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( ( AV31Moda21 == 1 ) && ( ( DecimalUtil.compareTo(AV37MetAnt, A1263BarAlbMtrE) != 0 ) || ( DecimalUtil.compareTo(AV36KilAnt, A1261BarAlbKgmE) != 0 ) ) && true /* After */ )
                     {
                        GXv_char23[0] = A396EmprCod ;
                        GXv_int25[0] = A30AlbProCod ;
                        GXv_int18[0] = A129BarCod ;
                        GXv_int24[0] = A132BarCodReo ;
                        GXv_char21[0] = A130BarCodPar ;
                        GXv_decimal27[0] = A1261BarAlbKgmE ;
                        GXv_decimal26[0] = A1263BarAlbMtrE ;
                        GXv_char13[0] = AV22UsurCod ;
                        GXv_char4[0] = AV20Station ;
                        new app.pupdmtsfs(remoteHandle, context).execute( GXv_char23, GXv_int25, GXv_int18, GXv_int24, GXv_char21, GXv_decimal27, GXv_decimal26, GXv_char13, GXv_char4) ;
                        documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
                        documentodetransporteproduccion_3_impl.this.A30AlbProCod = GXv_int25[0] ;
                        documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
                        documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
                        documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
                        documentodetransporteproduccion_3_impl.this.A1261BarAlbKgmE = GXv_decimal27[0] ;
                        documentodetransporteproduccion_3_impl.this.A1263BarAlbMtrE = GXv_decimal26[0] ;
                        documentodetransporteproduccion_3_impl.this.AV22UsurCod = GXv_char13[0] ;
                        documentodetransporteproduccion_3_impl.this.AV20Station = GXv_char4[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                        httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
                        app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22UsurCod, "@!"))));
                        httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
                        app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Station, ""))));
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char23[0] = A396EmprCod ;
                        GXv_int18[0] = A129BarCod ;
                        GXv_int24[0] = A132BarCodReo ;
                        GXv_char21[0] = A130BarCodPar ;
                        GXv_decimal27[0] = A1261BarAlbKgmE ;
                        GXv_decimal26[0] = A1263BarAlbMtrE ;
                        GXv_int17[0] = A1265BarAlbPie ;
                        GXv_decimal10[0] = AV36KilAnt ;
                        GXv_decimal9[0] = AV37MetAnt ;
                        GXv_int8[0] = AV38PieAnt ;
                        GXv_char13[0] = Gx_mode ;
                        new app.pcampie(remoteHandle, context).execute( GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_decimal27, GXv_decimal26, GXv_int17, GXv_decimal10, GXv_decimal9, GXv_int8, GXv_char13) ;
                        documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
                        documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
                        documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
                        documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
                        documentodetransporteproduccion_3_impl.this.A1261BarAlbKgmE = GXv_decimal27[0] ;
                        documentodetransporteproduccion_3_impl.this.A1263BarAlbMtrE = GXv_decimal26[0] ;
                        documentodetransporteproduccion_3_impl.this.A1265BarAlbPie = GXv_int17[0] ;
                        documentodetransporteproduccion_3_impl.this.AV36KilAnt = GXv_decimal10[0] ;
                        documentodetransporteproduccion_3_impl.this.AV37MetAnt = GXv_decimal9[0] ;
                        documentodetransporteproduccion_3_impl.this.AV38PieAnt = GXv_int8[0] ;
                        documentodetransporteproduccion_3_impl.this.Gx_mode = GXv_char13[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                        httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV36KilAnt", GXutil.ltrimstr( AV36KilAnt, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV37MetAnt", GXutil.ltrimstr( AV37MetAnt, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV38PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38PieAnt), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
         endLevel1U7195( ) ;
      }
      closeExtendedTableCursors1U7195( ) ;
   }

   public void deferredUpdate1U7195( )
   {
   }

   public void delete( )
   {
      beforeValidate1U7195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1U7195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1U7195( ) ;
         afterConfirm1U7195( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1U7195( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01U737 */
               pr_default.execute(27, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
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
      sMode195 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1U7195( ) ;
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1U7195( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            GXv_int20[0] = A3271AlbHdrAnc ;
            GXv_char23[0] = A3392AlbColNom ;
            GXv_int18[0] = A3393AlbColNum ;
            GXv_int24[0] = A3394AlbTipCol ;
            GXv_char21[0] = A3391AlbSer ;
            GXv_char13[0] = A8879AlbSerD ;
            GXv_int17[0] = A3886AlbCliCod ;
            GXv_char4[0] = A12232AlbNomCli ;
            GXv_int8[0] = A12233AlbNumcli ;
            GXv_int19[0] = A12234AlbTipArt ;
            GXv_int16[0] = A5019AlbHdrgm2 ;
            GXv_char3[0] = A4815AlbEncCli ;
            GXv_int22[0] = (byte)(0) ;
            GXv_char2[0] = "" ;
            GXv_int7[0] = (byte)(0) ;
            new app.documentotransporteproduccion.documentodetransporteproduccion_datoshdrguia(remoteHandle, context).execute( AV7EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int20, GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_char13, GXv_int17, GXv_char4, GXv_int8, GXv_int19, GXv_int16, GXv_char3, GXv_int22, GXv_char2, GXv_int7) ;
            documentodetransporteproduccion_3_impl.this.A3271AlbHdrAnc = GXv_int20[0] ;
            documentodetransporteproduccion_3_impl.this.A3392AlbColNom = GXv_char23[0] ;
            documentodetransporteproduccion_3_impl.this.A3393AlbColNum = GXv_int18[0] ;
            documentodetransporteproduccion_3_impl.this.A3394AlbTipCol = GXv_int24[0] ;
            documentodetransporteproduccion_3_impl.this.A3391AlbSer = GXv_char21[0] ;
            documentodetransporteproduccion_3_impl.this.A8879AlbSerD = GXv_char13[0] ;
            documentodetransporteproduccion_3_impl.this.A3886AlbCliCod = GXv_int17[0] ;
            documentodetransporteproduccion_3_impl.this.A12232AlbNomCli = GXv_char4[0] ;
            documentodetransporteproduccion_3_impl.this.A12233AlbNumcli = GXv_int8[0] ;
            documentodetransporteproduccion_3_impl.this.A12234AlbTipArt = GXv_int19[0] ;
            documentodetransporteproduccion_3_impl.this.A5019AlbHdrgm2 = GXv_int16[0] ;
            documentodetransporteproduccion_3_impl.this.A4815AlbEncCli = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3271AlbHdrAnc), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", A3392AlbColNom);
            httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3393AlbColNum), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A3394AlbTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3394AlbTipCol), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", A3391AlbSer);
            httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", A8879AlbSerD);
            httpContext.ajax_rsp_assign_attri("", false, "A3886AlbCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3886AlbCliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", A12232AlbNomCli);
            httpContext.ajax_rsp_assign_attri("", false, "A12233AlbNumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12233AlbNumcli), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A12234AlbTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12234AlbTipArt), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5019AlbHdrgm2), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
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
         /* Using cursor T01U739 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            A13890BarHDSusp = T01U739_A13890BarHDSusp[0] ;
            n13890BarHDSusp = T01U739_n13890BarHDSusp[0] ;
         }
         else
         {
            A13890BarHDSusp = (byte)(0) ;
            n13890BarHDSusp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13890BarHDSusp", GXutil.str( A13890BarHDSusp, 1, 0));
         }
         pr_default.close(28);
         AV38PieAnt = O1265BarAlbPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38PieAnt), 6, 0));
         AV37MetAnt = O1263BarAlbMtrE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37MetAnt", GXutil.ltrimstr( AV37MetAnt, 9, 2));
         AV36KilAnt = O1261BarAlbKgmE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36KilAnt", GXutil.ltrimstr( AV36KilAnt, 9, 2));
         /* Using cursor T01U740 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A361DisCod = T01U740_A361DisCod[0] ;
         A1235BarNumCli = T01U740_A1235BarNumCli[0] ;
         A1234BarNomCli = T01U740_A1234BarNomCli[0] ;
         A5034BarEstTip = T01U740_A5034BarEstTip[0] ;
         A5291BarTipCor = T01U740_A5291BarTipCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
         A5027BarGraCob = T01U740_A5027BarGraCob[0] ;
         A2010BarTipDis = T01U740_A2010BarTipDis[0] ;
         A4937BarCtrPdas = T01U740_A4937BarCtrPdas[0] ;
         n4937BarCtrPdas = T01U740_n4937BarCtrPdas[0] ;
         A5253BarAcc = T01U740_A5253BarAcc[0] ;
         A148BarEstReo = T01U740_A148BarEstReo[0] ;
         A143BarDisNum = T01U740_A143BarDisNum[0] ;
         A1909BarGraAca = T01U740_A1909BarGraAca[0] ;
         A4812BarEncCli = T01U740_A4812BarEncCli[0] ;
         A1652BarSerDsc = T01U740_A1652BarSerDsc[0] ;
         A218BarTipCol = T01U740_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A136BarColNum = T01U740_A136BarColNum[0] ;
         A135BarColNom = T01U740_A135BarColNom[0] ;
         A1503BarPart = T01U740_A1503BarPart[0] ;
         A161BarFecSal = T01U740_A161BarFecSal[0] ;
         A125BarAncAca1 = T01U740_A125BarAncAca1[0] ;
         A213BarSit = T01U740_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A212BarSer = T01U740_A212BarSer[0] ;
         A4466BarAcaAnh = T01U740_A4466BarAcaAnh[0] ;
         A252CliCod = T01U740_A252CliCod[0] ;
         n252CliCod = T01U740_n252CliCod[0] ;
         A217BarTipArt = T01U740_A217BarTipArt[0] ;
         n217BarTipArt = T01U740_n217BarTipArt[0] ;
         pr_default.close(29);
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
         {
            edtBarCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Forecolor), 9, 0), true);
         }
         else
         {
            if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
            {
               edtBarCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
               httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Forecolor), 9, 0), true);
            }
         }
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCod_Backcolor = GXutil.getColor( 255, 255, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Backcolor), 9, 0), true);
         }
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
         {
            edtBarCodReo_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Forecolor), 9, 0), true);
         }
         else
         {
            if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
            {
               edtBarCodReo_Forecolor = GXutil.getColor( 0, 0, 0) ;
               httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Forecolor), 9, 0), true);
            }
         }
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCodReo_Backcolor = GXutil.getColor( 255, 255, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Backcolor), 9, 0), true);
         }
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
         {
            edtBarCodPar_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Forecolor), 9, 0), true);
         }
         else
         {
            if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
            {
               edtBarCodPar_Forecolor = GXutil.getColor( 0, 0, 0) ;
               httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Forecolor), 9, 0), true);
            }
         }
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCodPar_Backcolor = GXutil.getColor( 255, 255, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Backcolor), 9, 0), true);
         }
         /* Using cursor T01U741 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod)});
         A1208TubPre = T01U741_A1208TubPre[0] ;
         n1208TubPre = T01U741_n1208TubPre[0] ;
         pr_default.close(30);
         if ( A3915EmpNumDec == 2 )
         {
            A1281TubImp = GXutil.roundDecimal( A1208TubPre.multiply(DecimalUtil.doubleToDec(A1266BarAlbTub)), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1281TubImp", GXutil.ltrimstr( A1281TubImp, 12, 2));
         }
         else
         {
            if ( A3915EmpNumDec == 0 )
            {
               A1281TubImp = GXutil.roundDecimal( A1208TubPre.multiply(DecimalUtil.doubleToDec(A1266BarAlbTub)), 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1281TubImp", GXutil.ltrimstr( A1281TubImp, 12, 2));
            }
            else
            {
               A1281TubImp = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1281TubImp", GXutil.ltrimstr( A1281TubImp, 12, 2));
            }
         }
         /* Using cursor T01U742 */
         pr_default.execute(31, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         A1253EmprGuiRem = T01U742_A1253EmprGuiRem[0] ;
         A5805AlbEnvFtp = T01U742_A5805AlbEnvFtp[0] ;
         A7101AlbLic = T01U742_A7101AlbLic[0] ;
         A34AlbProfch = T01U742_A34AlbProfch[0] ;
         A2242AlbSec = T01U742_A2242AlbSec[0] ;
         A1243GuiRemCli = T01U742_A1243GuiRemCli[0] ;
         pr_default.close(31);
         /* Using cursor T01U743 */
         pr_default.execute(32, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01U743_A1244GuiRemCln[0] ;
         pr_default.close(32);
         /* Using cursor T01U744 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n3153CodCod), A3153CodCod});
         A3154CodDsc = T01U744_A3154CodDsc[0] ;
         n3154CodDsc = T01U744_n3154CodDsc[0] ;
         pr_default.close(33);
         /* Using cursor T01U745 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A365DisDes = T01U745_A365DisDes[0] ;
         pr_default.close(34);
         /* Using cursor T01U747 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            A1279BarKla = T01U747_A1279BarKla[0] ;
            A1280BarMla = T01U747_A1280BarMla[0] ;
            A1292BarPlz = T01U747_A1292BarPlz[0] ;
         }
         else
         {
            A1279BarKla = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
            A1280BarMla = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
            A1292BarPlz = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
         }
         pr_default.close(35);
         /* Using cursor T01U749 */
         pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            A898BarPieNDes = T01U749_A898BarPieNDes[0] ;
            A199BarPie1 = T01U749_A199BarPie1[0] ;
         }
         else
         {
            A898BarPieNDes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
            A199BarPie1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         }
         pr_default.close(36);
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         else
         {
            A198BarPie = A199BarPie1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         GXt_int14 = A14356PzsEntrega ;
         GXv_int18[0] = GXt_int14 ;
         new app.piezasaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int18) ;
         documentodetransporteproduccion_3_impl.this.GXt_int14 = GXv_int18[0] ;
         A14356PzsEntrega = GXt_int14 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14356PzsEntrega", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14356PzsEntrega), 6, 0));
         GXt_decimal15 = A14355MtsEntrega ;
         GXv_decimal27[0] = GXt_decimal15 ;
         new app.metrosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal27) ;
         documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal27[0] ;
         A14355MtsEntrega = GXt_decimal15 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14355MtsEntrega", GXutil.ltrimstr( A14355MtsEntrega, 9, 2));
         GXt_decimal15 = A14354KgsEntrega ;
         GXv_decimal27[0] = GXt_decimal15 ;
         new app.kilosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal27) ;
         documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal27[0] ;
         A14354KgsEntrega = GXt_decimal15 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14354KgsEntrega", GXutil.ltrimstr( A14354KgsEntrega, 9, 2));
         GXt_decimal15 = A14353KgsHdr ;
         GXv_char23[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int24[0] = A132BarCodReo ;
         GXv_char21[0] = A130BarCodPar ;
         GXv_decimal27[0] = GXt_decimal15 ;
         new app.pkilos(remoteHandle, context).execute( GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_decimal27) ;
         documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
         documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
         documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
         documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
         documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal27[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14353KgsHdr = GXt_decimal15 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14353KgsHdr", GXutil.ltrimstr( A14353KgsHdr, 9, 2));
         GXt_char1 = A14056AlbColorCv ;
         GXv_char23[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int24[0] = A132BarCodReo ;
         GXv_char21[0] = A130BarCodPar ;
         GXv_char13[0] = GXt_char1 ;
         new app.pnortt(remoteHandle, context).execute( GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_char13) ;
         documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
         documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
         documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
         documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
         documentodetransporteproduccion_3_impl.this.GXt_char1 = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14056AlbColorCv = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14056AlbColorCv", A14056AlbColorCv);
         GXt_char1 = A13878PedidoClie ;
         GXv_char23[0] = A396EmprCod ;
         GXv_char21[0] = A4812BarEncCli ;
         GXv_char13[0] = A143BarDisNum ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char23, GXv_char21, GXv_char13, GXv_char4) ;
         documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
         documentodetransporteproduccion_3_impl.this.A4812BarEncCli = GXv_char21[0] ;
         documentodetransporteproduccion_3_impl.this.A143BarDisNum = GXv_char13[0] ;
         documentodetransporteproduccion_3_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A13878PedidoClie = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01U750 */
         pr_default.execute(37, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01U751 */
         pr_default.execute(38, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EDIETI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01U752 */
         pr_default.execute(39, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01U753 */
         pr_default.execute(40, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01U754 */
         pr_default.execute(41, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01U755 */
         pr_default.execute(42, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01U756 */
         pr_default.execute(43, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPCK", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01U757 */
         pr_default.execute(44, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01U758 */
         pr_default.execute(45, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01U759 */
         pr_default.execute(46, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01U760 */
         pr_default.execute(47, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
      }
   }

   public void endLevel1U7195( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1U7195( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.documentodetransporteproduccion_3");
         if ( AnyError == 0 )
         {
            confirmValues1U70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.documentodetransporteproduccion_3");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1U7195( )
   {
      /* Scan By routine */
      /* Using cursor T01U761 */
      pr_default.execute(48);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A396EmprCod = T01U761_A396EmprCod[0] ;
         A30AlbProCod = T01U761_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01U761_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01U761_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01U761_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1U7195( )
   {
      /* Scan next routine */
      pr_default.readNext(48);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A396EmprCod = T01U761_A396EmprCod[0] ;
         A30AlbProCod = T01U761_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01U761_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01U761_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01U761_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void scanEnd1U7195( )
   {
      pr_default.close(48);
   }

   public void afterConfirm1U7195( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1261BarAlbKgmE)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1263BarAlbMtrE)==0) && (0==A1265BarAlbPie) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay valores en Kilos, Metros, Piezas", ""), 1, "BARALBKGME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  )
      {
         GXv_decimal27[0] = A1262BarPreKgm ;
         GXv_decimal26[0] = A1264BarPreMtr ;
         GXv_int24[0] = A32AlbProEsp ;
         GXv_decimal10[0] = A40AlbProRec ;
         GXv_char23[0] = A2398BarFasExt ;
         new app.pbuspre4(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal27, GXv_decimal26, GXv_int24, GXv_decimal10, GXv_char23) ;
         documentodetransporteproduccion_3_impl.this.A1262BarPreKgm = GXv_decimal27[0] ;
         documentodetransporteproduccion_3_impl.this.A1264BarPreMtr = GXv_decimal26[0] ;
         documentodetransporteproduccion_3_impl.this.A32AlbProEsp = GXv_int24[0] ;
         documentodetransporteproduccion_3_impl.this.A40AlbProRec = GXv_decimal10[0] ;
         documentodetransporteproduccion_3_impl.this.A2398BarFasExt = GXv_char23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1262BarPreKgm", GXutil.ltrimstr( A1262BarPreKgm, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A1264BarPreMtr", GXutil.ltrimstr( A1264BarPreMtr, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A32AlbProEsp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A32AlbProEsp), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A40AlbProRec", GXutil.ltrimstr( A40AlbProRec, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", A2398BarFasExt);
      }
   }

   public void beforeInsert1U7195( )
   {
      /* Before Insert Rules */
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1261BarAlbKgmE)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1263BarAlbMtrE)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Os quilos e metros introduzidos têm o valor 0", ""), 1, "BARALBKGME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV31Moda21 == 1 ) && ( DecimalUtil.compareTo(A1261BarAlbKgmE, A14353KgsHdr) > 0 ) && ( AV43errkgs == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Os quilos saidos= ", "")+GXutil.trim( GXutil.str( A1261BarAlbKgmE, 9, 2))+httpContext.getMessage( ", são maiores do que os quilos da OS= ", "")+GXutil.trim( GXutil.str( A14353KgsHdr, 9, 2)), 1, "BARALBKGME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeUpdate1U7195( )
   {
      /* Before Update Rules */
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1261BarAlbKgmE)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1263BarAlbMtrE)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Os quilos e metros introduzidos têm o valor 0", ""), 1, "BARALBKGME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV31Moda21 == 1 ) && ( DecimalUtil.compareTo(A1261BarAlbKgmE, A14353KgsHdr) > 0 ) && ( AV43errkgs == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Os quilos saidos= ", "")+GXutil.trim( GXutil.str( A1261BarAlbKgmE, 9, 2))+httpContext.getMessage( ", são maiores do que os quilos da OS= ", "")+GXutil.trim( GXutil.str( A14353KgsHdr, 9, 2)), 1, "BARALBKGME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeDelete1U7195( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1U7195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1U7195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1U7195( )
   {
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtavGuiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcli_Enabled), 5, 0), true);
      edtavAlbpropri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbpropri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbpropri_Enabled), 5, 0), true);
      chkavClifacmtsp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavClifacmtsp.getInternalname(), "Enabled", GXutil.ltrimstr( chkavClifacmtsp.getEnabled(), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarAlbKgmE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgmE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Enabled), 5, 0), true);
      edtAlbHdrAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrAnc_Enabled), 5, 0), true);
      edtAlbHdrgm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrgm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrgm2_Enabled), 5, 0), true);
      edtBarAlbMtrE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtrE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Enabled), 5, 0), true);
      edtBarAlbPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPie_Enabled), 5, 0), true);
      edtTubCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTubCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Enabled), 5, 0), true);
      edtBarAlbTub_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbTub_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Enabled), 5, 0), true);
      edtPlasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Enabled), 5, 0), true);
      edtBarAlbPlas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Enabled), 5, 0), true);
      cmbAlbProVal.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProVal.getEnabled(), 5, 0), true);
      edtAlbHdrObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrObs_Enabled), 5, 0), true);
      edtPedidoClie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedidoClie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Enabled), 5, 0), true);
      edtAlbSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSer_Enabled), 5, 0), true);
      edtAlbSerD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSerD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSerD_Enabled), 5, 0), true);
      edtAlbColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNom_Enabled), 5, 0), true);
      edtAlbColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtAlbNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNomCli_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      chkBarTipCor.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarTipCor.getEnabled(), 5, 0), true);
      edtavMode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMode_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMode_Enabled), 5, 0), true);
      edtKgsHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgsHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgsHdr_Enabled), 5, 0), true);
      edtKgsEntrega_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgsEntrega_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgsEntrega_Enabled), 5, 0), true);
      edtMtsEntrega_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtsEntrega_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsEntrega_Enabled), 5, 0), true);
      edtPzsEntrega_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPzsEntrega_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPzsEntrega_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombotubcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotubcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotubcod_Enabled), 5, 0), true);
      edtavComboplascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboplascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboplascod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1U7195( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27AlbProPri, "9"))));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1U70( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_3", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV23Guiremcli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV24GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV25AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV26AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV27AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(AV28AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV29AlbLic))}, new String[] {"Gx_mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27AlbProPri, "9"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_3");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV62Pgmname, "")));
      forbiddenHiddens.add("BarAlbUnd", localUtil.format( DecimalUtil.doubleToDec(A12195BarAlbUnd), "ZZZZZ9"));
      forbiddenHiddens.add("BarPreUnd", localUtil.format( A12196BarPreUnd, "ZZZZZZ9.99999"));
      forbiddenHiddens.add("AlbMetULi", localUtil.format( DecimalUtil.doubleToDec(A6645AlbMetULi), "ZZZ9"));
      forbiddenHiddens.add("BarAlbPN", localUtil.format( A1461BarAlbPN, "ZZZZZ9.99"));
      forbiddenHiddens.add("AlbTipEnt", GXutil.rtrim( localUtil.format( A1095AlbTipEnt, "@!")));
      forbiddenHiddens.add("AlbDto", localUtil.format( A7994AlbDto, "Z9.999"));
      forbiddenHiddens.add("AlbMqTj", GXutil.rtrim( localUtil.format( A7993AlbMqTj, "")));
      forbiddenHiddens.add("AlbDf3", GXutil.rtrim( localUtil.format( A7992AlbDf3, "")));
      forbiddenHiddens.add("AlbDf2", GXutil.rtrim( localUtil.format( A7991AlbDf2, "")));
      forbiddenHiddens.add("AlbDf1", GXutil.rtrim( localUtil.format( A7990AlbDf1, "")));
      forbiddenHiddens.add("AlbCald", GXutil.rtrim( localUtil.format( A7989AlbCald, "")));
      forbiddenHiddens.add("AlbEncA", localUtil.format( A7104AlbEncA, "ZZZ9.99"));
      forbiddenHiddens.add("AlbEncL", localUtil.format( A7103AlbEncL, "ZZZ9.99"));
      forbiddenHiddens.add("AlbBarRec", localUtil.format( A2761AlbBarRec, "ZZ9.99"));
      forbiddenHiddens.add("AlbImpMan", localUtil.format( A5354AlbImpMan, "ZZZZZZZ9.99"));
      forbiddenHiddens.add("BarAlbBul", localUtil.format( DecimalUtil.doubleToDec(A1458BarAlbBul), "ZZZ9"));
      forbiddenHiddens.add("GuiFasULin", localUtil.format( DecimalUtil.doubleToDec(A1248GuiFasULin), "ZZZ9"));
      forbiddenHiddens.add("AlbHdrUlin", localUtil.format( DecimalUtil.doubleToDec(A2763AlbHdrUlin), "ZZZ9"));
      forbiddenHiddens.add("AlbCadEnc", localUtil.format( DecimalUtil.doubleToDec(A12905AlbCadEnc), "ZZZ9"));
      forbiddenHiddens.add("BarAlbObs", GXutil.rtrim( localUtil.format( A2396BarAlbObs, "")));
      forbiddenHiddens.add("AlbTiras", GXutil.rtrim( localUtil.format( A14057AlbTiras, "")));
      forbiddenHiddens.add("AlbTirasKg", localUtil.format( A14058AlbTirasKg, "ZZZZZ9.99"));
      forbiddenHiddens.add("AlbSinTest", GXutil.rtrim( localUtil.format( A14059AlbSinTest, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_3:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6466PlasCod", GXutil.ltrim( localUtil.ntoc( Z6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1266BarAlbTub", GXutil.ltrim( localUtil.ntoc( Z1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1265BarAlbPie", GXutil.ltrim( localUtil.ntoc( Z1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3271AlbHdrAnc", GXutil.ltrim( localUtil.ntoc( Z3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3392AlbColNom", GXutil.rtrim( Z3392AlbColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3393AlbColNum", GXutil.ltrim( localUtil.ntoc( Z3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3394AlbTipCol", GXutil.ltrim( localUtil.ntoc( Z3394AlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3391AlbSer", GXutil.rtrim( Z3391AlbSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8879AlbSerD", GXutil.rtrim( Z8879AlbSerD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3886AlbCliCod", GXutil.ltrim( localUtil.ntoc( Z3886AlbCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12232AlbNomCli", GXutil.rtrim( Z12232AlbNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12233AlbNumcli", GXutil.ltrim( localUtil.ntoc( Z12233AlbNumcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12234AlbTipArt", GXutil.ltrim( localUtil.ntoc( Z12234AlbTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5019AlbHdrgm2", GXutil.ltrim( localUtil.ntoc( Z5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4815AlbEncCli", GXutil.rtrim( Z4815AlbEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1262BarPreKgm", GXutil.ltrim( localUtil.ntoc( Z1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1264BarPreMtr", GXutil.ltrim( localUtil.ntoc( Z1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z32AlbProEsp", GXutil.ltrim( localUtil.ntoc( Z32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z40AlbProRec", GXutil.ltrim( localUtil.ntoc( Z40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2398BarFasExt", GXutil.rtrim( Z2398BarFasExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12195BarAlbUnd", GXutil.ltrim( localUtil.ntoc( Z12195BarAlbUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12196BarPreUnd", GXutil.ltrim( localUtil.ntoc( Z12196BarPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6645AlbMetULi", GXutil.ltrim( localUtil.ntoc( Z6645AlbMetULi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1461BarAlbPN", GXutil.ltrim( localUtil.ntoc( Z1461BarAlbPN, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1095AlbTipEnt", GXutil.rtrim( Z1095AlbTipEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7994AlbDto", GXutil.ltrim( localUtil.ntoc( Z7994AlbDto, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7993AlbMqTj", GXutil.rtrim( Z7993AlbMqTj));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7992AlbDf3", GXutil.rtrim( Z7992AlbDf3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7991AlbDf2", GXutil.rtrim( Z7991AlbDf2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7990AlbDf1", GXutil.rtrim( Z7990AlbDf1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7989AlbCald", GXutil.rtrim( Z7989AlbCald));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7104AlbEncA", GXutil.ltrim( localUtil.ntoc( Z7104AlbEncA, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7103AlbEncL", GXutil.ltrim( localUtil.ntoc( Z7103AlbEncL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6467BarAlbPlas", GXutil.ltrim( localUtil.ntoc( Z6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2761AlbBarRec", GXutil.ltrim( localUtil.ntoc( Z2761AlbBarRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5354AlbImpMan", GXutil.ltrim( localUtil.ntoc( Z5354AlbImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2441AlbHdrObs", GXutil.rtrim( Z2441AlbHdrObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1458BarAlbBul", GXutil.ltrim( localUtil.ntoc( Z1458BarAlbBul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2839AlbProVal", GXutil.rtrim( Z2839AlbProVal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( Z1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2763AlbHdrUlin", GXutil.ltrim( localUtil.ntoc( Z2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12905AlbCadEnc", GXutil.ltrim( localUtil.ntoc( Z12905AlbCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2396BarAlbObs", GXutil.rtrim( Z2396BarAlbObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14057AlbTiras", GXutil.rtrim( Z14057AlbTiras));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14058AlbTirasKg", GXutil.ltrim( localUtil.ntoc( Z14058AlbTirasKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14059AlbSinTest", GXutil.rtrim( Z14059AlbSinTest));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1206TubCod", GXutil.ltrim( localUtil.ntoc( Z1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3153CodCod", GXutil.rtrim( Z3153CodCod));
      app.GxWebStd.gx_hidden_field( httpContext, "O1265BarAlbPie", GXutil.ltrim( localUtil.ntoc( O1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( O1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( O1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N6466PlasCod", GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3153CodCod", GXutil.rtrim( A3153CodCod));
      app.GxWebStd.gx_hidden_field( httpContext, "N1206TubCod", GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTUBCOD_DATA", AV47TubCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTUBCOD_DATA", AV47TubCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPLASCOD_DATA", AV50PlasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPLASCOD_DATA", AV50PlasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV52barsit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52barsit), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCH", localUtil.dtoc( AV25AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV25AlbProFch));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOFASES", GXutil.ltrim( localUtil.ntoc( AV60Nofases, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOFASES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60Nofases), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBENVFTP", GXutil.ltrim( localUtil.ntoc( AV28AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28AlbEnvFtp), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBLIC", GXutil.rtrim( AV29AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29AlbLic, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGUIREMCLN", GXutil.rtrim( AV24GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24GuiRemCln, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV26AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV55ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV55ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOLORCV", GXutil.rtrim( A14056AlbColorCv));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TUBPRE", GXutil.ltrim( localUtil.ntoc( A1208TubPre, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPNUMDEC", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TUBIMP", GXutil.ltrim( localUtil.ntoc( A1281TubImp, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV8AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV11BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PLASCOD", GXutil.ltrim( localUtil.ntoc( AV15Insert_PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CODCOD", GXutil.rtrim( AV17Insert_CodCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CODCOD", GXutil.rtrim( A3153CodCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TUBCOD", GXutil.ltrim( localUtil.ntoc( AV18Insert_TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV31Moda21, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Moda21), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPLASTICOS", GXutil.ltrim( localUtil.ntoc( AV39Plasticos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILANT", GXutil.ltrim( localUtil.ntoc( AV36KilAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETANT", GXutil.ltrim( localUtil.ntoc( AV37MetAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEANT", GXutil.ltrim( localUtil.ntoc( AV38PieAnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTIRAS", GXutil.rtrim( A14057AlbTiras));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBSINTEST", GXutil.rtrim( A14059AlbSinTest));
      app.GxWebStd.gx_hidden_field( httpContext, "vMENSAJE", AV54Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTIPCOL", GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCLICOD", GXutil.ltrim( localUtil.ntoc( A3886AlbCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBNUMCLI", GXutil.ltrim( localUtil.ntoc( A12233AlbNumcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTIPART", GXutil.ltrim( localUtil.ntoc( A12234AlbTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBENCCLI", GXutil.rtrim( A4815AlbEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARESTREO", GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRKGS", GXutil.ltrim( localUtil.ntoc( AV43errkgs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43errkgs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGFAS", GXutil.ltrim( localUtil.ntoc( AV30FlagFas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPREKGM", GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPREMTR", GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROESP", GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROREC", GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEXT", GXutil.rtrim( A2398BarFasExt));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV20Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV22UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBUND", GXutil.ltrim( localUtil.ntoc( A12195BarAlbUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPREUND", GXutil.ltrim( localUtil.ntoc( A12196BarPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMETULI", GXutil.ltrim( localUtil.ntoc( A6645AlbMetULi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBPN", GXutil.ltrim( localUtil.ntoc( A1461BarAlbPN, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTIPENT", GXutil.rtrim( A1095AlbTipEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDTO", GXutil.ltrim( localUtil.ntoc( A7994AlbDto, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMQTJ", GXutil.rtrim( A7993AlbMqTj));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDF3", GXutil.rtrim( A7992AlbDf3));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDF2", GXutil.rtrim( A7991AlbDf2));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDF1", GXutil.rtrim( A7990AlbDf1));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCALD", GXutil.rtrim( A7989AlbCald));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBENCA", GXutil.ltrim( localUtil.ntoc( A7104AlbEncA, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBENCL", GXutil.ltrim( localUtil.ntoc( A7103AlbEncL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBBARREC", GXutil.ltrim( localUtil.ntoc( A2761AlbBarRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBIMPMAN", GXutil.ltrim( localUtil.ntoc( A5354AlbImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBBUL", GXutil.ltrim( localUtil.ntoc( A1458BarAlbBul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASULIN", GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRULIN", GXutil.ltrim( localUtil.ntoc( A2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCADENC", GXutil.ltrim( localUtil.ntoc( A12905AlbCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBOBS", GXutil.rtrim( A2396BarAlbObs));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTIRASKG", GXutil.ltrim( localUtil.ntoc( A14058AlbTirasKg, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHDSUSP", GXutil.ltrim( localUtil.ntoc( A13890BarHDSusp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMCLI", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNOMCLI", GXutil.rtrim( A1234BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARESTTIP", GXutil.rtrim( A5034BarEstTip));
      app.GxWebStd.gx_hidden_field( httpContext, "BARGRACOB", GXutil.ltrim( localUtil.ntoc( A5027BarGraCob, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPDIS", GXutil.rtrim( A2010BarTipDis));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCTRPDAS", GXutil.ltrim( localUtil.ntoc( A4937BarCtrPdas, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARACC", GXutil.rtrim( A5253BarAcc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARGRAACA", GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC", GXutil.rtrim( A1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPART", GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECSAL", localUtil.dtoc( A161BarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "BARANCACA1", GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "BARACAANH", GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPART", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRGUIREM", GXutil.rtrim( A1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBENVFTP", GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLIC", GXutil.rtrim( A7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROFCH", localUtil.dtoc( A34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBSEC", GXutil.rtrim( A2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMCLI", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODDSC", GXutil.rtrim( A3154CodDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMCLN", GXutil.rtrim( A1244GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKLA", GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMLA", GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPLZ", GXutil.ltrim( localUtil.ntoc( A1292BarPlz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Objectcall", GXutil.rtrim( Combo_tubcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Cls", GXutil.rtrim( Combo_tubcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Selectedvalue_set", GXutil.rtrim( Combo_tubcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Enabled", GXutil.booltostr( Combo_tubcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Emptyitemtext", GXutil.rtrim( Combo_tubcod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PLASCOD_Objectcall", GXutil.rtrim( Combo_plascod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PLASCOD_Cls", GXutil.rtrim( Combo_plascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PLASCOD_Selectedvalue_set", GXutil.rtrim( Combo_plascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PLASCOD_Enabled", GXutil.booltostr( Combo_plascod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PLASCOD_Visible", GXutil.booltostr( Combo_plascod_Visible));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PLASCOD_Emptyitemtext", GXutil.rtrim( Combo_plascod_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable4_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Enabled", GXutil.booltostr( Dvpanel_unnamedtable4_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Objectcall", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Enabled", GXutil.booltostr( Dvelop_confirmpanel_trn_delete_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Title", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Confirmtype));
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
      if ( ! ( WebComp_Wcdocumentodetransporteproduccion_7 == null ) )
      {
         WebComp_Wcdocumentodetransporteproduccion_7.componentjscripts();
      }
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
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( WebComp_Wcdocumentodetransporteproduccion_7_Visible != 0 )
         {
            if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_7_Component) != 0 )
            {
               WebComp_Wcdocumentodetransporteproduccion_7.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( WebComp_Wcdocumentodetransporteproduccion_7_Visible != 0 )
         {
            if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_7_Component) != 0 )
            {
               WebComp_Wcdocumentodetransporteproduccion_7.componentstart();
            }
         }
      }
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
      return formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_3", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV23Guiremcli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV24GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV25AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV26AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV27AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(AV28AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV29AlbLic))}, new String[] {"Gx_mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_3" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Detalle de Producciones", "") ;
   }

   public void initializeNonKey1U7195( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A1253EmprGuiRem = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      A6466PlasCod = (short)(0) ;
      n6466PlasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
      A3153CodCod = "" ;
      n3153CodCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3153CodCod", A3153CodCod);
      A1206TubCod = (short)(0) ;
      n1206TubCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
      AV54Mensaje = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Mensaje", AV54Mensaje);
      A1266BarAlbTub = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1266BarAlbTub), 6, 0));
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
      A1265BarAlbPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
      A3271AlbHdrAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3271AlbHdrAnc), 4, 0));
      A3392AlbColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", A3392AlbColNom);
      A3393AlbColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3393AlbColNum), 6, 0));
      A3394AlbTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3394AlbTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3394AlbTipCol), 2, 0));
      A3391AlbSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", A3391AlbSer);
      A8879AlbSerD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", A8879AlbSerD);
      A3886AlbCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3886AlbCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3886AlbCliCod), 6, 0));
      A12232AlbNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", A12232AlbNomCli);
      A12233AlbNumcli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12233AlbNumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12233AlbNumcli), 6, 0));
      A12234AlbTipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12234AlbTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12234AlbTipArt), 4, 0));
      A5019AlbHdrgm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5019AlbHdrgm2), 4, 0));
      A4815AlbEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
      AV36KilAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36KilAnt", GXutil.ltrimstr( AV36KilAnt, 9, 2));
      AV37MetAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37MetAnt", GXutil.ltrimstr( AV37MetAnt, 9, 2));
      AV38PieAnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38PieAnt), 6, 0));
      A1262BarPreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1262BarPreKgm", GXutil.ltrimstr( A1262BarPreKgm, 13, 5));
      A1264BarPreMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1264BarPreMtr", GXutil.ltrimstr( A1264BarPreMtr, 13, 5));
      A32AlbProEsp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A32AlbProEsp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A32AlbProEsp), 2, 0));
      A40AlbProRec = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A40AlbProRec", GXutil.ltrimstr( A40AlbProRec, 13, 5));
      A2398BarFasExt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", A2398BarFasExt);
      A1281TubImp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1281TubImp", GXutil.ltrimstr( A1281TubImp, 12, 2));
      A198BarPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      A13878PedidoClie = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      A13890BarHDSusp = (byte)(0) ;
      n13890BarHDSusp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13890BarHDSusp", GXutil.str( A13890BarHDSusp, 1, 0));
      A14056AlbColorCv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14056AlbColorCv", A14056AlbColorCv);
      A14353KgsHdr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14353KgsHdr", GXutil.ltrimstr( A14353KgsHdr, 9, 2));
      A14354KgsEntrega = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14354KgsEntrega", GXutil.ltrimstr( A14354KgsEntrega, 9, 2));
      A14355MtsEntrega = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14355MtsEntrega", GXutil.ltrimstr( A14355MtsEntrega, 9, 2));
      A14356PzsEntrega = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14356PzsEntrega", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14356PzsEntrega), 6, 0));
      A5805AlbEnvFtp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A7101AlbLic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
      A1243GuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      A1244GuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A34AlbProfch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A2242AlbSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      A217BarTipArt = (short)(0) ;
      n217BarTipArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
      A1235BarNumCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      A1234BarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A12195BarAlbUnd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12195BarAlbUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12195BarAlbUnd), 6, 0));
      A12196BarPreUnd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12196BarPreUnd", GXutil.ltrimstr( A12196BarPreUnd, 13, 5));
      A5034BarEstTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5034BarEstTip", A5034BarEstTip);
      A6645AlbMetULi = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6645AlbMetULi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6645AlbMetULi), 4, 0));
      A5291BarTipCor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
      A5027BarGraCob = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5027BarGraCob", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5027BarGraCob), 2, 0));
      A2010BarTipDis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
      A1461BarAlbPN = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1461BarAlbPN", GXutil.ltrimstr( A1461BarAlbPN, 9, 2));
      A4937BarCtrPdas = (byte)(0) ;
      n4937BarCtrPdas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4937BarCtrPdas", GXutil.str( A4937BarCtrPdas, 1, 0));
      A1095AlbTipEnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1095AlbTipEnt", A1095AlbTipEnt);
      A7994AlbDto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7994AlbDto", GXutil.ltrimstr( A7994AlbDto, 6, 3));
      A7993AlbMqTj = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7993AlbMqTj", A7993AlbMqTj);
      A7992AlbDf3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7992AlbDf3", A7992AlbDf3);
      A7991AlbDf2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7991AlbDf2", A7991AlbDf2);
      A7990AlbDf1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7990AlbDf1", A7990AlbDf1);
      A7989AlbCald = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7989AlbCald", A7989AlbCald);
      A7104AlbEncA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7104AlbEncA", GXutil.ltrimstr( A7104AlbEncA, 7, 2));
      A7103AlbEncL = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7103AlbEncL", GXutil.ltrimstr( A7103AlbEncL, 7, 2));
      A6467BarAlbPlas = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6467BarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6467BarAlbPlas), 4, 0));
      A2761AlbBarRec = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2761AlbBarRec", GXutil.ltrimstr( A2761AlbBarRec, 6, 2));
      A5253BarAcc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5253BarAcc", A5253BarAcc);
      A5354AlbImpMan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5354AlbImpMan", GXutil.ltrimstr( A5354AlbImpMan, 11, 2));
      A148BarEstReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
      A143BarDisNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A1909BarGraAca = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A4812BarEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A2441AlbHdrObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2441AlbHdrObs", A2441AlbHdrObs);
      A1652BarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A218BarTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A3154CodDsc = "" ;
      n3154CodDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3154CodDsc", A3154CodDsc);
      A1503BarPart = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1503BarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1503BarPart), 4, 0));
      A1458BarAlbBul = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1458BarAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1458BarAlbBul), 4, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      A1279BarKla = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
      A1280BarMla = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
      A1292BarPlz = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
      A161BarFecSal = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A161BarFecSal", localUtil.format(A161BarFecSal, "99/99/99"));
      A1208TubPre = DecimalUtil.ZERO ;
      n1208TubPre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1208TubPre", GXutil.ltrimstr( A1208TubPre, 10, 5));
      A125BarAncAca1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1248GuiFasULin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      A2763AlbHdrUlin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
      A4466BarAcaAnh = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
      A12905AlbCadEnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12905AlbCadEnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12905AlbCadEnc), 4, 0));
      A2396BarAlbObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2396BarAlbObs", A2396BarAlbObs);
      A14058AlbTirasKg = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14058AlbTirasKg", GXutil.ltrimstr( A14058AlbTirasKg, 9, 2));
      A898BarPieNDes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      A199BarPie1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      A2839AlbProVal = httpContext.getMessage( "S", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
      A14057AlbTiras = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14057AlbTiras", A14057AlbTiras);
      A14059AlbSinTest = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14059AlbSinTest", A14059AlbSinTest);
      O1265BarAlbPie = A1265BarAlbPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
      O1263BarAlbMtrE = A1263BarAlbMtrE ;
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
      O1261BarAlbKgmE = A1261BarAlbKgmE ;
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
      Z6466PlasCod = (short)(0) ;
      Z1266BarAlbTub = 0 ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1265BarAlbPie = 0 ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
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
      Z4815AlbEncCli = "" ;
      Z1262BarPreKgm = DecimalUtil.ZERO ;
      Z1264BarPreMtr = DecimalUtil.ZERO ;
      Z32AlbProEsp = (byte)(0) ;
      Z40AlbProRec = DecimalUtil.ZERO ;
      Z2398BarFasExt = "" ;
      Z12195BarAlbUnd = 0 ;
      Z12196BarPreUnd = DecimalUtil.ZERO ;
      Z6645AlbMetULi = (short)(0) ;
      Z1461BarAlbPN = DecimalUtil.ZERO ;
      Z1095AlbTipEnt = "" ;
      Z7994AlbDto = DecimalUtil.ZERO ;
      Z7993AlbMqTj = "" ;
      Z7992AlbDf3 = "" ;
      Z7991AlbDf2 = "" ;
      Z7990AlbDf1 = "" ;
      Z7989AlbCald = "" ;
      Z7104AlbEncA = DecimalUtil.ZERO ;
      Z7103AlbEncL = DecimalUtil.ZERO ;
      Z6467BarAlbPlas = (short)(0) ;
      Z2761AlbBarRec = DecimalUtil.ZERO ;
      Z5354AlbImpMan = DecimalUtil.ZERO ;
      Z2441AlbHdrObs = "" ;
      Z1458BarAlbBul = (short)(0) ;
      Z2839AlbProVal = "" ;
      Z1248GuiFasULin = (short)(0) ;
      Z2763AlbHdrUlin = (short)(0) ;
      Z12905AlbCadEnc = (short)(0) ;
      Z2396BarAlbObs = "" ;
      Z14057AlbTiras = "" ;
      Z14058AlbTirasKg = DecimalUtil.ZERO ;
      Z14059AlbSinTest = "" ;
      Z1206TubCod = (short)(0) ;
      Z3153CodCod = "" ;
   }

   public void initAll1U7195( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      initializeNonKey1U7195( ) ;
   }

   public void standaloneModalInsert( )
   {
      A2839AlbProVal = i2839AlbProVal ;
      httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
      A14057AlbTiras = i14057AlbTiras ;
      httpContext.ajax_rsp_assign_attri("", false, "A14057AlbTiras", A14057AlbTiras);
      A14059AlbSinTest = i14059AlbSinTest ;
      httpContext.ajax_rsp_assign_attri("", false, "A14059AlbSinTest", A14059AlbSinTest);
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcdocumentodetransporteproduccion_7 == null ) )
      {
         if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_7_Component) != 0 )
         {
            WebComp_Wcdocumentodetransporteproduccion_7.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415125778", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_3.js", "?202682415125779", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtavGuiremcli_Internalname = "vGUIREMCLI" ;
      edtavAlbpropri_Internalname = "vALBPROPRI" ;
      chkavClifacmtsp.setInternalname( "vCLIFACMTSP" );
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtnverpiezas_Internalname = "BTNVERPIEZAS" ;
      bttBtnimprimirhdr_Internalname = "BTNIMPRIMIRHDR" ;
      bttBtnpackinglist_Internalname = "BTNPACKINGLIST" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtBarCod_Internalname = "BARCOD" ;
      imgavPrompt_Internalname = "vPROMPT" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarAlbKgmE_Internalname = "BARALBKGME" ;
      edtAlbHdrAnc_Internalname = "ALBHDRANC" ;
      edtAlbHdrgm2_Internalname = "ALBHDRGM2" ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE" ;
      edtBarAlbPie_Internalname = "BARALBPIE" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      lblTextblocktubcod_Internalname = "TEXTBLOCKTUBCOD" ;
      Combo_tubcod_Internalname = "COMBO_TUBCOD" ;
      edtTubCod_Internalname = "TUBCOD" ;
      divTablesplittedtubcod_Internalname = "TABLESPLITTEDTUBCOD" ;
      edtBarAlbTub_Internalname = "BARALBTUB" ;
      lblTextblockplascod_Internalname = "TEXTBLOCKPLASCOD" ;
      Combo_plascod_Internalname = "COMBO_PLASCOD" ;
      edtPlasCod_Internalname = "PLASCOD" ;
      divTablesplittedplascod_Internalname = "TABLESPLITTEDPLASCOD" ;
      divCombo_plascod_cell_Internalname = "COMBO_PLASCOD_CELL" ;
      edtBarAlbPlas_Internalname = "BARALBPLAS" ;
      divBaralbplas_cell_Internalname = "BARALBPLAS_CELL" ;
      cmbAlbProVal.setInternalname( "ALBPROVAL" );
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtAlbHdrObs_Internalname = "ALBHDROBS" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtPedidoClie_Internalname = "PEDIDOCLIE" ;
      edtAlbSer_Internalname = "ALBSER" ;
      edtAlbSerD_Internalname = "ALBSERD" ;
      edtAlbColNom_Internalname = "ALBCOLNOM" ;
      edtAlbColNum_Internalname = "ALBCOLNUM" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      edtAlbNomCli_Internalname = "ALBNOMCLI" ;
      edtBarSit_Internalname = "BARSIT" ;
      chkBarTipCor.setInternalname( "BARTIPCOR" );
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavMode_Internalname = "vMODE" ;
      edtKgsHdr_Internalname = "KGSHDR" ;
      edtKgsEntrega_Internalname = "KGSENTREGA" ;
      edtMtsEntrega_Internalname = "MTSENTREGA" ;
      edtPzsEntrega_Internalname = "PZSENTREGA" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombotubcod_Internalname = "vCOMBOTUBCOD" ;
      divSectionattribute_tubcod_Internalname = "SECTIONATTRIBUTE_TUBCOD" ;
      edtavComboplascod_Internalname = "vCOMBOPLASCOD" ;
      divSectionattribute_plascod_Internalname = "SECTIONATTRIBUTE_PLASCOD" ;
      Dvelop_confirmpanel_trn_delete_Internalname = "DVELOP_CONFIRMPANEL_TRN_DELETE" ;
      tblTabledvelop_confirmpanel_trn_delete_Internalname = "TABLEDVELOP_CONFIRMPANEL_TRN_DELETE" ;
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
      Form.setCaption( httpContext.getMessage( "Detalle de Producciones", "") );
      Combo_plascod_Visible = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_trn_delete_Confirmtype = "1" ;
      Dvelop_confirmpanel_trn_delete_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_trn_delete_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_trn_delete_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_trn_delete_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_trn_delete_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_trn_delete_Title = "" ;
      edtavComboplascod_Jsonclick = "" ;
      edtavComboplascod_Enabled = 0 ;
      edtavComboplascod_Visible = 1 ;
      edtavCombotubcod_Jsonclick = "" ;
      edtavCombotubcod_Enabled = 0 ;
      edtavCombotubcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtPzsEntrega_Jsonclick = "" ;
      edtPzsEntrega_Enabled = 0 ;
      edtMtsEntrega_Jsonclick = "" ;
      edtMtsEntrega_Enabled = 0 ;
      edtKgsEntrega_Jsonclick = "" ;
      edtKgsEntrega_Enabled = 0 ;
      edtKgsHdr_Jsonclick = "" ;
      edtKgsHdr_Enabled = 0 ;
      edtavMode_Jsonclick = "" ;
      edtavMode_Enabled = 0 ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Control Variables Provisional", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      WebComp_Wcdocumentodetransporteproduccion_7_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, "gxHTMLWrpW0192"+"", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(WebComp_Wcdocumentodetransporteproduccion_7_Visible), 5, 0), true);
      chkBarTipCor.setEnabled( 0 );
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Enabled = 0 ;
      edtAlbNomCli_Jsonclick = "" ;
      edtAlbNomCli_Enabled = 0 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarTipCol_Enabled = 0 ;
      edtAlbColNum_Jsonclick = "" ;
      edtAlbColNum_Enabled = 0 ;
      edtAlbColNom_Jsonclick = "" ;
      edtAlbColNom_Enabled = 0 ;
      edtAlbSerD_Jsonclick = "" ;
      edtAlbSerD_Enabled = 0 ;
      edtAlbSer_Jsonclick = "" ;
      edtAlbSer_Enabled = 0 ;
      edtPedidoClie_Jsonclick = "" ;
      edtPedidoClie_Enabled = 0 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Mais dados", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      edtAlbHdrObs_Jsonclick = "" ;
      edtAlbHdrObs_Enabled = 1 ;
      cmbAlbProVal.setJsonclick( "" );
      cmbAlbProVal.setEnabled( 1 );
      edtBarAlbPlas_Jsonclick = "" ;
      edtBarAlbPlas_Enabled = 1 ;
      edtBarAlbPlas_Visible = 1 ;
      divBaralbplas_cell_Class = "col-xs-12 col-sm-1" ;
      edtPlasCod_Jsonclick = "" ;
      edtPlasCod_Enabled = 1 ;
      edtPlasCod_Visible = 1 ;
      Combo_plascod_Emptyitemtext = "" ;
      Combo_plascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_plascod_Enabled = GXutil.toBoolean( -1) ;
      divCombo_plascod_cell_Class = "col-xs-12 col-sm-4" ;
      edtBarAlbTub_Jsonclick = "" ;
      edtBarAlbTub_Enabled = 1 ;
      edtTubCod_Jsonclick = "" ;
      edtTubCod_Enabled = 1 ;
      edtTubCod_Visible = 1 ;
      Combo_tubcod_Emptyitemtext = "" ;
      Combo_tubcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tubcod_Enabled = GXutil.toBoolean( -1) ;
      edtBarAlbPie_Jsonclick = "" ;
      edtBarAlbPie_Enabled = 1 ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtBarAlbMtrE_Enabled = 1 ;
      edtAlbHdrgm2_Jsonclick = "" ;
      edtAlbHdrgm2_Enabled = 1 ;
      edtAlbHdrAnc_Jsonclick = "" ;
      edtAlbHdrAnc_Enabled = 1 ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtBarAlbKgmE_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backstyle = (byte)(-1) ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Forecolor = (int)(0x000000) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backstyle = (byte)(-1) ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Forecolor = (int)(0x000000) ;
      edtBarCodReo_Enabled = 1 ;
      imgavPrompt_gximage = "" ;
      imgavPrompt_Enabled = 1 ;
      imgavPrompt_Link = "" ;
      imgavPrompt_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backstyle = (byte)(-1) ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Forecolor = (int)(0x000000) ;
      edtBarCod_Enabled = 1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtnpackinglist_Visible = 1 ;
      bttBtnimprimirhdr_Visible = 1 ;
      bttBtnverpiezas_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      chkavClifacmtsp.setEnabled( 0 );
      edtavAlbpropri_Jsonclick = "" ;
      edtavAlbpropri_Enabled = 0 ;
      edtavGuiremcli_Jsonclick = "" ;
      edtavGuiremcli_Enabled = 0 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
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

   public void gx3asapzsentrega1U7195( String A396EmprCod ,
                                       int A129BarCod ,
                                       byte A132BarCodReo ,
                                       String A130BarCodPar )
   {
      GXt_int14 = A14356PzsEntrega ;
      GXv_int18[0] = GXt_int14 ;
      new app.piezasaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int18) ;
      documentodetransporteproduccion_3_impl.this.GXt_int14 = GXv_int18[0] ;
      A14356PzsEntrega = GXt_int14 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14356PzsEntrega", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14356PzsEntrega), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14356PzsEntrega, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asamtsentrega1U7195( String A396EmprCod ,
                                       int A129BarCod ,
                                       byte A132BarCodReo ,
                                       String A130BarCodPar )
   {
      GXt_decimal15 = A14355MtsEntrega ;
      GXv_decimal27[0] = GXt_decimal15 ;
      new app.metrosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal27) ;
      documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal27[0] ;
      A14355MtsEntrega = GXt_decimal15 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14355MtsEntrega", GXutil.ltrimstr( A14355MtsEntrega, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14355MtsEntrega, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asakgsentrega1U7195( String A396EmprCod ,
                                       int A129BarCod ,
                                       byte A132BarCodReo ,
                                       String A130BarCodPar )
   {
      GXt_decimal15 = A14354KgsEntrega ;
      GXv_decimal27[0] = GXt_decimal15 ;
      new app.kilosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal27) ;
      documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal27[0] ;
      A14354KgsEntrega = GXt_decimal15 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14354KgsEntrega", GXutil.ltrimstr( A14354KgsEntrega, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14354KgsEntrega, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asakgshdr1U7195( String A396EmprCod ,
                                   int A129BarCod ,
                                   byte A132BarCodReo ,
                                   String A130BarCodPar )
   {
      GXt_decimal15 = A14353KgsHdr ;
      GXv_char23[0] = A396EmprCod ;
      GXv_int18[0] = A129BarCod ;
      GXv_int24[0] = A132BarCodReo ;
      GXv_char21[0] = A130BarCodPar ;
      GXv_decimal27[0] = GXt_decimal15 ;
      new app.pkilos(remoteHandle, context).execute( GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_decimal27) ;
      documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
      documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
      documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
      documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
      documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal27[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A14353KgsHdr = GXt_decimal15 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14353KgsHdr", GXutil.ltrimstr( A14353KgsHdr, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14353KgsHdr, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx7asaalbcolorcv1U7195( String A396EmprCod ,
                                       int A129BarCod ,
                                       byte A132BarCodReo ,
                                       String A130BarCodPar )
   {
      GXt_char1 = A14056AlbColorCv ;
      GXv_char23[0] = A396EmprCod ;
      GXv_int18[0] = A129BarCod ;
      GXv_int24[0] = A132BarCodReo ;
      GXv_char21[0] = A130BarCodPar ;
      GXv_char13[0] = GXt_char1 ;
      new app.pnortt(remoteHandle, context).execute( GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_char13) ;
      documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
      documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
      documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
      documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
      documentodetransporteproduccion_3_impl.this.GXt_char1 = GXv_char13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A14056AlbColorCv = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14056AlbColorCv", A14056AlbColorCv);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14056AlbColorCv))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx8asapedidoclie1U7195( String A396EmprCod ,
                                       String A4812BarEncCli ,
                                       String A143BarDisNum )
   {
      GXt_char1 = A13878PedidoClie ;
      GXv_char23[0] = A396EmprCod ;
      GXv_char21[0] = A4812BarEncCli ;
      GXv_char13[0] = A143BarDisNum ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char23, GXv_char21, GXv_char13, GXv_char4) ;
      documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
      documentodetransporteproduccion_3_impl.this.A4812BarEncCli = GXv_char21[0] ;
      documentodetransporteproduccion_3_impl.this.A143BarDisNum = GXv_char13[0] ;
      documentodetransporteproduccion_3_impl.this.GXt_char1 = GXv_char4[0] ;
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

   public void xc_55_1U7195( String AV7EmprCod ,
                             long AV8AlbProCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             String Gx_mode )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         GXv_char23[0] = AV54Mensaje ;
         new app.ctrlhdrguia(remoteHandle, context).execute( AV7EmprCod, AV8AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_char23) ;
         AV54Mensaje = GXv_char23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54Mensaje", AV54Mensaje);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( AV54Mensaje)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_60_1U7195( String Gx_mode ,
                             String AV7EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar )
   {
      if ( isIns( )  )
      {
         GXv_int20[0] = A3271AlbHdrAnc ;
         GXv_char23[0] = A3392AlbColNom ;
         GXv_int18[0] = A3393AlbColNum ;
         GXv_int24[0] = A3394AlbTipCol ;
         GXv_char21[0] = A3391AlbSer ;
         GXv_char13[0] = A8879AlbSerD ;
         GXv_int17[0] = A3886AlbCliCod ;
         GXv_char4[0] = A12232AlbNomCli ;
         GXv_int8[0] = A12233AlbNumcli ;
         GXv_int19[0] = A12234AlbTipArt ;
         GXv_int16[0] = A5019AlbHdrgm2 ;
         GXv_char3[0] = A4815AlbEncCli ;
         GXv_int22[0] = (byte)(0) ;
         GXv_char2[0] = "" ;
         GXv_int7[0] = (byte)(0) ;
         new app.documentotransporteproduccion.documentodetransporteproduccion_datoshdrguia(remoteHandle, context).execute( AV7EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int20, GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_char13, GXv_int17, GXv_char4, GXv_int8, GXv_int19, GXv_int16, GXv_char3, GXv_int22, GXv_char2, GXv_int7) ;
         A3271AlbHdrAnc = GXv_int20[0] ;
         A3392AlbColNom = GXv_char23[0] ;
         A3393AlbColNum = GXv_int18[0] ;
         A3394AlbTipCol = GXv_int24[0] ;
         A3391AlbSer = GXv_char21[0] ;
         A8879AlbSerD = GXv_char13[0] ;
         A3886AlbCliCod = GXv_int17[0] ;
         A12232AlbNomCli = GXv_char4[0] ;
         A12233AlbNumcli = GXv_int8[0] ;
         A12234AlbTipArt = GXv_int19[0] ;
         A5019AlbHdrgm2 = GXv_int16[0] ;
         A4815AlbEncCli = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3271AlbHdrAnc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", A3392AlbColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3393AlbColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3394AlbTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3394AlbTipCol), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", A3391AlbSer);
         httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", A8879AlbSerD);
         httpContext.ajax_rsp_assign_attri("", false, "A3886AlbCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3886AlbCliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", A12232AlbNomCli);
         httpContext.ajax_rsp_assign_attri("", false, "A12233AlbNumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12233AlbNumcli), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A12234AlbTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12234AlbTipArt), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5019AlbHdrgm2), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3392AlbColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3391AlbSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8879AlbSerD))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3886AlbCliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12232AlbNomCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12233AlbNumcli, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12234AlbTipArt, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4815AlbEncCli))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_70_1U7195( String A396EmprCod ,
                             long A30AlbProCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             short AV30FlagFas ,
                             byte AV31Moda21 )
   {
      if ( true /* After */ && ( AV30FlagFas == 1 ) && ( AV31Moda21 == 1 ) )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_int25[0] = A30AlbProCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int24[0] = A132BarCodReo ;
         GXv_char21[0] = A130BarCodPar ;
         new app.pfas618(remoteHandle, context).execute( GXv_char23, GXv_int25, GXv_int18, GXv_int24, GXv_char21) ;
         A396EmprCod = GXv_char23[0] ;
         A30AlbProCod = GXv_int25[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int24[0] ;
         A130BarCodPar = GXv_char21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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

   public void xc_71_1U7195( String A396EmprCod ,
                             long A30AlbProCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             short AV30FlagFas )
   {
      if ( true /* After */ && ( AV30FlagFas == 1 ) )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_int25[0] = A30AlbProCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int24[0] = A132BarCodReo ;
         GXv_char21[0] = A130BarCodPar ;
         new app.pcopfas(remoteHandle, context).execute( GXv_char23, GXv_int25, GXv_int18, GXv_int24, GXv_char21) ;
         A396EmprCod = GXv_char23[0] ;
         A30AlbProCod = GXv_int25[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int24[0] ;
         A130BarCodPar = GXv_char21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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

   public void xc_72_1U7195( String A396EmprCod ,
                             long A30AlbProCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             short AV30FlagFas )
   {
      if ( true /* After */ && ( AV30FlagFas == 1 ) )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_int25[0] = A30AlbProCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int24[0] = A132BarCodReo ;
         GXv_char21[0] = A130BarCodPar ;
         new app.pkilfas(remoteHandle, context).execute( GXv_char23, GXv_int25, GXv_int18, GXv_int24, GXv_char21) ;
         A396EmprCod = GXv_char23[0] ;
         A30AlbProCod = GXv_int25[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int24[0] ;
         A130BarCodPar = GXv_char21[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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

   public void xc_73_1U7195( String Gx_mode ,
                             String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             String A2839AlbProVal )
   {
      if ( true /* After */ && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  )
      {
         GXv_decimal27[0] = A1262BarPreKgm ;
         GXv_decimal26[0] = A1264BarPreMtr ;
         GXv_int24[0] = A32AlbProEsp ;
         GXv_decimal10[0] = A40AlbProRec ;
         GXv_char23[0] = A2398BarFasExt ;
         new app.pbuspre4(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal27, GXv_decimal26, GXv_int24, GXv_decimal10, GXv_char23) ;
         A1262BarPreKgm = GXv_decimal27[0] ;
         A1264BarPreMtr = GXv_decimal26[0] ;
         A32AlbProEsp = GXv_int24[0] ;
         A40AlbProRec = GXv_decimal10[0] ;
         A2398BarFasExt = GXv_char23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1262BarPreKgm", GXutil.ltrimstr( A1262BarPreKgm, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A1264BarPreMtr", GXutil.ltrimstr( A1264BarPreMtr, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A32AlbProEsp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A32AlbProEsp), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A40AlbProRec", GXutil.ltrimstr( A40AlbProRec, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", A2398BarFasExt);
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

   public void xc_74_1U7195( String A396EmprCod ,
                             long A30AlbProCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             java.math.BigDecimal A1261BarAlbKgmE ,
                             java.math.BigDecimal A1263BarAlbMtrE ,
                             String AV22UsurCod ,
                             String AV20Station ,
                             byte AV31Moda21 ,
                             java.math.BigDecimal AV37MetAnt ,
                             java.math.BigDecimal AV36KilAnt )
   {
      if ( ( AV31Moda21 == 1 ) && ( ( DecimalUtil.compareTo(AV37MetAnt, A1263BarAlbMtrE) != 0 ) || ( DecimalUtil.compareTo(AV36KilAnt, A1261BarAlbKgmE) != 0 ) ) && true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_int25[0] = A30AlbProCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int24[0] = A132BarCodReo ;
         GXv_char21[0] = A130BarCodPar ;
         GXv_decimal27[0] = A1261BarAlbKgmE ;
         GXv_decimal26[0] = A1263BarAlbMtrE ;
         GXv_char13[0] = AV22UsurCod ;
         GXv_char4[0] = AV20Station ;
         new app.pupdmtsfs(remoteHandle, context).execute( GXv_char23, GXv_int25, GXv_int18, GXv_int24, GXv_char21, GXv_decimal27, GXv_decimal26, GXv_char13, GXv_char4) ;
         A396EmprCod = GXv_char23[0] ;
         A30AlbProCod = GXv_int25[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int24[0] ;
         A130BarCodPar = GXv_char21[0] ;
         A1261BarAlbKgmE = GXv_decimal27[0] ;
         A1263BarAlbMtrE = GXv_decimal26[0] ;
         AV22UsurCod = GXv_char13[0] ;
         AV20Station = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22UsurCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Station, ""))));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV22UsurCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV20Station))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_75_1U7195( String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             java.math.BigDecimal A1261BarAlbKgmE ,
                             java.math.BigDecimal A1263BarAlbMtrE ,
                             int A1265BarAlbPie ,
                             java.math.BigDecimal AV36KilAnt ,
                             java.math.BigDecimal AV37MetAnt ,
                             int AV38PieAnt ,
                             String Gx_mode )
   {
      if ( true /* After */ || true /* After */ )
      {
         GXv_char23[0] = A396EmprCod ;
         GXv_int18[0] = A129BarCod ;
         GXv_int24[0] = A132BarCodReo ;
         GXv_char21[0] = A130BarCodPar ;
         GXv_decimal27[0] = A1261BarAlbKgmE ;
         GXv_decimal26[0] = A1263BarAlbMtrE ;
         GXv_int17[0] = A1265BarAlbPie ;
         GXv_decimal10[0] = AV36KilAnt ;
         GXv_decimal9[0] = AV37MetAnt ;
         GXv_int8[0] = AV38PieAnt ;
         GXv_char13[0] = Gx_mode ;
         new app.pcampie(remoteHandle, context).execute( GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_decimal27, GXv_decimal26, GXv_int17, GXv_decimal10, GXv_decimal9, GXv_int8, GXv_char13) ;
         A396EmprCod = GXv_char23[0] ;
         A129BarCod = GXv_int18[0] ;
         A132BarCodReo = GXv_int24[0] ;
         A130BarCodPar = GXv_char21[0] ;
         A1261BarAlbKgmE = GXv_decimal27[0] ;
         A1263BarAlbMtrE = GXv_decimal26[0] ;
         A1265BarAlbPie = GXv_int17[0] ;
         AV36KilAnt = GXv_decimal10[0] ;
         AV37MetAnt = GXv_decimal9[0] ;
         AV38PieAnt = GXv_int8[0] ;
         Gx_mode = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV36KilAnt", GXutil.ltrimstr( AV36KilAnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV37MetAnt", GXutil.ltrimstr( AV37MetAnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV38PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38PieAnt), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV36KilAnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV37MetAnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV38PieAnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_mode))+"\"") ;
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
      chkavClifacmtsp.setName( "vCLIFACMTSP" );
      chkavClifacmtsp.setWebtags( "" );
      chkavClifacmtsp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavClifacmtsp.getInternalname(), "TitleCaption", chkavClifacmtsp.getCaption(), true);
      chkavClifacmtsp.setCheckedValue( "N" );
      AV35CliFacMtsP = ((GXutil.strcmp(GXutil.rtrim( AV35CliFacMtsP), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35CliFacMtsP", AV35CliFacMtsP);
      cmbAlbProVal.setName( "ALBPROVAL" );
      cmbAlbProVal.setWebtags( "" );
      cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A2839AlbProVal)==0) )
         {
            A2839AlbProVal = httpContext.getMessage( "S", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
         }
      }
      chkBarTipCor.setName( "BARTIPCOR" );
      chkBarTipCor.setWebtags( "" );
      chkBarTipCor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "TitleCaption", chkBarTipCor.getCaption(), true);
      chkBarTipCor.setCheckedValue( "NO" );
      A5291BarTipCor = ((GXutil.strcmp(GXutil.rtrim( A5291BarTipCor), "SI")==0) ? "SI" : "NO") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
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
      /* Using cursor T01U742 */
      pr_default.execute(31, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
      }
      A1253EmprGuiRem = T01U742_A1253EmprGuiRem[0] ;
      A5805AlbEnvFtp = T01U742_A5805AlbEnvFtp[0] ;
      A7101AlbLic = T01U742_A7101AlbLic[0] ;
      A34AlbProfch = T01U742_A34AlbProfch[0] ;
      A2242AlbSec = T01U742_A2242AlbSec[0] ;
      A1243GuiRemCli = T01U742_A1243GuiRemCli[0] ;
      pr_default.close(31);
      /* Using cursor T01U743 */
      pr_default.execute(32, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01U743_A1244GuiRemCln[0] ;
      pr_default.close(32);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", GXutil.rtrim( A1253EmprGuiRem));
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", GXutil.rtrim( A7101AlbLic));
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", GXutil.rtrim( A2242AlbSec));
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", GXutil.rtrim( A1244GuiRemCln));
   }

   public void valid_Barcodpar( )
   {
      n252CliCod = false ;
      n13890BarHDSusp = false ;
      n4937BarCtrPdas = false ;
      n217BarTipArt = false ;
      /* Using cursor T01U739 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(28) != 101) )
      {
         A13890BarHDSusp = T01U739_A13890BarHDSusp[0] ;
         n13890BarHDSusp = T01U739_n13890BarHDSusp[0] ;
      }
      else
      {
         A13890BarHDSusp = (byte)(0) ;
         n13890BarHDSusp = false ;
      }
      pr_default.close(28);
      /* Using cursor T01U740 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Nº HDR", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A361DisCod = T01U740_A361DisCod[0] ;
      A1235BarNumCli = T01U740_A1235BarNumCli[0] ;
      A1234BarNomCli = T01U740_A1234BarNomCli[0] ;
      A5034BarEstTip = T01U740_A5034BarEstTip[0] ;
      A5291BarTipCor = T01U740_A5291BarTipCor[0] ;
      A5027BarGraCob = T01U740_A5027BarGraCob[0] ;
      A2010BarTipDis = T01U740_A2010BarTipDis[0] ;
      A4937BarCtrPdas = T01U740_A4937BarCtrPdas[0] ;
      n4937BarCtrPdas = T01U740_n4937BarCtrPdas[0] ;
      A5253BarAcc = T01U740_A5253BarAcc[0] ;
      A148BarEstReo = T01U740_A148BarEstReo[0] ;
      A143BarDisNum = T01U740_A143BarDisNum[0] ;
      A1909BarGraAca = T01U740_A1909BarGraAca[0] ;
      A4812BarEncCli = T01U740_A4812BarEncCli[0] ;
      A1652BarSerDsc = T01U740_A1652BarSerDsc[0] ;
      A218BarTipCol = T01U740_A218BarTipCol[0] ;
      A136BarColNum = T01U740_A136BarColNum[0] ;
      A135BarColNom = T01U740_A135BarColNom[0] ;
      A1503BarPart = T01U740_A1503BarPart[0] ;
      A161BarFecSal = T01U740_A161BarFecSal[0] ;
      A125BarAncAca1 = T01U740_A125BarAncAca1[0] ;
      A213BarSit = T01U740_A213BarSit[0] ;
      A212BarSer = T01U740_A212BarSer[0] ;
      A4466BarAcaAnh = T01U740_A4466BarAcaAnh[0] ;
      A252CliCod = T01U740_A252CliCod[0] ;
      n252CliCod = T01U740_n252CliCod[0] ;
      A217BarTipArt = T01U740_A217BarTipArt[0] ;
      n217BarTipArt = T01U740_n217BarTipArt[0] ;
      pr_default.close(29);
      /* Using cursor T01U745 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A365DisDes = T01U745_A365DisDes[0] ;
      pr_default.close(34);
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
      {
         edtBarCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
      }
      else
      {
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
         }
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
      {
         edtBarCod_Backcolor = GXutil.getColor( 255, 255, 0) ;
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
      {
         edtBarCodReo_Forecolor = GXutil.getColor( 0, 0, 0) ;
      }
      else
      {
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCodReo_Forecolor = GXutil.getColor( 0, 0, 0) ;
         }
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
      {
         edtBarCodReo_Backcolor = GXutil.getColor( 255, 255, 0) ;
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "NO") == 0 ) )
      {
         edtBarCodPar_Forecolor = GXutil.getColor( 0, 0, 0) ;
      }
      else
      {
         if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
         {
            edtBarCodPar_Forecolor = GXutil.getColor( 0, 0, 0) ;
         }
      }
      if ( ( AV31Moda21 == 1 ) && ( GXutil.strcmp(A5291BarTipCor, "SI") == 0 ) )
      {
         edtBarCodPar_Backcolor = GXutil.getColor( 255, 255, 0) ;
      }
      GXt_char1 = A13878PedidoClie ;
      GXv_char23[0] = A396EmprCod ;
      GXv_char21[0] = A4812BarEncCli ;
      GXv_char13[0] = A143BarDisNum ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char23, GXv_char21, GXv_char13, GXv_char4) ;
      documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
      documentodetransporteproduccion_3_impl.this.A4812BarEncCli = GXv_char21[0] ;
      A4812BarEncCli = this.A4812BarEncCli ;
      documentodetransporteproduccion_3_impl.this.A143BarDisNum = GXv_char13[0] ;
      A143BarDisNum = this.A143BarDisNum ;
      documentodetransporteproduccion_3_impl.this.GXt_char1 = GXv_char4[0] ;
      A13878PedidoClie = GXt_char1 ;
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
      if ( A252CliCod != AV23Guiremcli )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente errado", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      /* Using cursor T01U747 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(35) != 101) )
      {
         A1279BarKla = T01U747_A1279BarKla[0] ;
         A1280BarMla = T01U747_A1280BarMla[0] ;
         A1292BarPlz = T01U747_A1292BarPlz[0] ;
      }
      else
      {
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         A1292BarPlz = (short)(0) ;
      }
      pr_default.close(35);
      /* Using cursor T01U749 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(36) != 101) )
      {
         A898BarPieNDes = T01U749_A898BarPieNDes[0] ;
         A199BarPie1 = T01U749_A199BarPie1[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         A199BarPie1 = (short)(0) ;
      }
      pr_default.close(36);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
      }
      else
      {
         A198BarPie = A199BarPie1 ;
      }
      GXt_int14 = A14356PzsEntrega ;
      GXv_int18[0] = GXt_int14 ;
      new app.piezasaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int18) ;
      documentodetransporteproduccion_3_impl.this.GXt_int14 = GXv_int18[0] ;
      A14356PzsEntrega = GXt_int14 ;
      GXt_decimal15 = A14355MtsEntrega ;
      GXv_decimal27[0] = GXt_decimal15 ;
      new app.metrosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal27) ;
      documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal27[0] ;
      A14355MtsEntrega = GXt_decimal15 ;
      GXt_decimal15 = A14354KgsEntrega ;
      GXv_decimal27[0] = GXt_decimal15 ;
      new app.kilosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal27) ;
      documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal27[0] ;
      A14354KgsEntrega = GXt_decimal15 ;
      GXt_decimal15 = A14353KgsHdr ;
      GXv_char23[0] = A396EmprCod ;
      GXv_int18[0] = A129BarCod ;
      GXv_int24[0] = A132BarCodReo ;
      GXv_char21[0] = A130BarCodPar ;
      GXv_decimal27[0] = GXt_decimal15 ;
      new app.pkilos(remoteHandle, context).execute( GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_decimal27) ;
      documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
      documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
      documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
      documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
      documentodetransporteproduccion_3_impl.this.GXt_decimal15 = GXv_decimal27[0] ;
      A14353KgsHdr = GXt_decimal15 ;
      GXt_char1 = A14056AlbColorCv ;
      GXv_char23[0] = A396EmprCod ;
      GXv_int18[0] = A129BarCod ;
      GXv_int24[0] = A132BarCodReo ;
      GXv_char21[0] = A130BarCodPar ;
      GXv_char13[0] = GXt_char1 ;
      new app.pnortt(remoteHandle, context).execute( GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_char13) ;
      documentodetransporteproduccion_3_impl.this.A396EmprCod = GXv_char23[0] ;
      documentodetransporteproduccion_3_impl.this.A129BarCod = GXv_int18[0] ;
      documentodetransporteproduccion_3_impl.this.A132BarCodReo = GXv_int24[0] ;
      documentodetransporteproduccion_3_impl.this.A130BarCodPar = GXv_char21[0] ;
      documentodetransporteproduccion_3_impl.this.GXt_char1 = GXv_char13[0] ;
      A14056AlbColorCv = GXt_char1 ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         GXv_char23[0] = AV54Mensaje ;
         new app.ctrlhdrguia(remoteHandle, context).execute( AV7EmprCod, AV8AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_char23) ;
         documentodetransporteproduccion_3_impl.this.AV54Mensaje = GXv_char23[0] ;
         AV54Mensaje = this.AV54Mensaje ;
      }
      if ( ! (GXutil.strcmp("", AV54Mensaje)==0) )
      {
         httpContext.GX_msglist.addItem(AV54Mensaje, 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      if ( isIns( )  )
      {
         GXv_int20[0] = A3271AlbHdrAnc ;
         GXv_char23[0] = A3392AlbColNom ;
         GXv_int18[0] = A3393AlbColNum ;
         GXv_int24[0] = A3394AlbTipCol ;
         GXv_char21[0] = A3391AlbSer ;
         GXv_char13[0] = A8879AlbSerD ;
         GXv_int17[0] = A3886AlbCliCod ;
         GXv_char4[0] = A12232AlbNomCli ;
         GXv_int8[0] = A12233AlbNumcli ;
         GXv_int19[0] = A12234AlbTipArt ;
         GXv_int16[0] = A5019AlbHdrgm2 ;
         GXv_char3[0] = A4815AlbEncCli ;
         GXv_int22[0] = (byte)(0) ;
         GXv_char2[0] = "" ;
         GXv_int7[0] = (byte)(0) ;
         new app.documentotransporteproduccion.documentodetransporteproduccion_datoshdrguia(remoteHandle, context).execute( AV7EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int20, GXv_char23, GXv_int18, GXv_int24, GXv_char21, GXv_char13, GXv_int17, GXv_char4, GXv_int8, GXv_int19, GXv_int16, GXv_char3, GXv_int22, GXv_char2, GXv_int7) ;
         documentodetransporteproduccion_3_impl.this.A3271AlbHdrAnc = GXv_int20[0] ;
         A3271AlbHdrAnc = this.A3271AlbHdrAnc ;
         documentodetransporteproduccion_3_impl.this.A3392AlbColNom = GXv_char23[0] ;
         A3392AlbColNom = this.A3392AlbColNom ;
         documentodetransporteproduccion_3_impl.this.A3393AlbColNum = GXv_int18[0] ;
         A3393AlbColNum = this.A3393AlbColNum ;
         documentodetransporteproduccion_3_impl.this.A3394AlbTipCol = GXv_int24[0] ;
         A3394AlbTipCol = this.A3394AlbTipCol ;
         documentodetransporteproduccion_3_impl.this.A3391AlbSer = GXv_char21[0] ;
         A3391AlbSer = this.A3391AlbSer ;
         documentodetransporteproduccion_3_impl.this.A8879AlbSerD = GXv_char13[0] ;
         A8879AlbSerD = this.A8879AlbSerD ;
         documentodetransporteproduccion_3_impl.this.A3886AlbCliCod = GXv_int17[0] ;
         A3886AlbCliCod = this.A3886AlbCliCod ;
         documentodetransporteproduccion_3_impl.this.A12232AlbNomCli = GXv_char4[0] ;
         A12232AlbNomCli = this.A12232AlbNomCli ;
         documentodetransporteproduccion_3_impl.this.A12233AlbNumcli = GXv_int8[0] ;
         A12233AlbNumcli = this.A12233AlbNumcli ;
         documentodetransporteproduccion_3_impl.this.A12234AlbTipArt = GXv_int19[0] ;
         A12234AlbTipArt = this.A12234AlbTipArt ;
         documentodetransporteproduccion_3_impl.this.A5019AlbHdrgm2 = GXv_int16[0] ;
         A5019AlbHdrgm2 = this.A5019AlbHdrgm2 ;
         documentodetransporteproduccion_3_impl.this.A4815AlbEncCli = GXv_char3[0] ;
         A4815AlbEncCli = this.A4815AlbEncCli ;
      }
      if ( ( GXutil.strcmp(AV27AlbProPri, "1") == 0 ) && ( A148BarEstReo == 2 ) && true /* After */ && ( AV31Moda21 == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem Serviço nao autorizada. Es uma Reclamaçao ¡¡¡", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      dynload_actions( ) ;
      A5291BarTipCor = ((GXutil.strcmp(GXutil.rtrim( A5291BarTipCor), "SI")==0) ? "SI" : "NO") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13890BarHDSusp", GXutil.ltrim( localUtil.ntoc( A13890BarHDSusp, (byte)(1), (byte)(0), ".", "")));
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
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Forecolor), 9, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Backcolor), 9, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Forecolor), 9, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Backcolor), 9, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Forecolor), 9, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Backcolor), 9, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", GXutil.rtrim( A13878PedidoClie));
      httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrim( localUtil.ntoc( A1292BarPlz, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14356PzsEntrega", GXutil.ltrim( localUtil.ntoc( A14356PzsEntrega, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14355MtsEntrega", GXutil.ltrim( localUtil.ntoc( A14355MtsEntrega, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14354KgsEntrega", GXutil.ltrim( localUtil.ntoc( A14354KgsEntrega, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14353KgsHdr", GXutil.ltrim( localUtil.ntoc( A14353KgsHdr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14056AlbColorCv", GXutil.rtrim( A14056AlbColorCv));
      httpContext.ajax_rsp_assign_attri("", false, "AV54Mensaje", AV54Mensaje);
      httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", GXutil.rtrim( A3392AlbColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3394AlbTipCol", GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", GXutil.rtrim( A3391AlbSer));
      httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", GXutil.rtrim( A8879AlbSerD));
      httpContext.ajax_rsp_assign_attri("", false, "A3886AlbCliCod", GXutil.ltrim( localUtil.ntoc( A3886AlbCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", GXutil.rtrim( A12232AlbNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A12233AlbNumcli", GXutil.ltrim( localUtil.ntoc( A12233AlbNumcli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12234AlbTipArt", GXutil.ltrim( localUtil.ntoc( A12234AlbTipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", GXutil.rtrim( A4815AlbEncCli));
   }

   public void valid_Baralbkgme( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1261BarAlbKgmE)==0) )
      {
         A1261BarAlbKgmE = A14354KgsEntrega ;
      }
      AV36KilAnt = O1261BarAlbKgmE ;
      if ( ( AV31Moda21 == 1 ) && ( DecimalUtil.compareTo(A1261BarAlbKgmE, A14353KgsHdr) > 0 ) && ( AV43errkgs == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Os quilos saidos= ", "")+GXutil.trim( GXutil.str( A1261BarAlbKgmE, 9, 2))+httpContext.getMessage( ", são maiores do que os quilos da OS= ", "")+GXutil.trim( GXutil.str( A14353KgsHdr, 9, 2)), 1, "BARALBKGME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV36KilAnt", GXutil.ltrim( localUtil.ntoc( AV36KilAnt, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Baralbmtre( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1263BarAlbMtrE)==0) )
      {
         A1263BarAlbMtrE = A14355MtsEntrega ;
      }
      AV37MetAnt = O1263BarAlbMtrE ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV37MetAnt", GXutil.ltrim( localUtil.ntoc( AV37MetAnt, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Baralbpie( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A1265BarAlbPie) )
      {
         A1265BarAlbPie = A14356PzsEntrega ;
      }
      AV38PieAnt = O1265BarAlbPie ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV38PieAnt", GXutil.ltrim( localUtil.ntoc( AV38PieAnt, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Tubcod( )
   {
      n1206TubCod = false ;
      n1208TubPre = false ;
      /* Using cursor T01U741 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1206TubCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TUBOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TUBCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTubCod_Internalname ;
         }
      }
      A1208TubPre = T01U741_A1208TubPre[0] ;
      n1208TubPre = T01U741_n1208TubPre[0] ;
      pr_default.close(30);
      if ( ( A1206TubCod > 0 ) && isIns( )  )
      {
         A1266BarAlbTub = A1265BarAlbPie ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1208TubPre", GXutil.ltrim( localUtil.ntoc( A1208TubPre, (byte)(10), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV23Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV24GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV25AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV26AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV27AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV28AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV29AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV52barsit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV25AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV60Nofases',fld:'vNOFASES',pic:'ZZZ9',hsh:true},{av:'AV28AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV29AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV24GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV26AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV55ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV31Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'AV43errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'AV20Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV22UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV27AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'A12195BarAlbUnd',fld:'BARALBUND',pic:'ZZZZZ9'},{av:'A12196BarPreUnd',fld:'BARPREUND',pic:'ZZZZZZ9.99999'},{av:'A6645AlbMetULi',fld:'ALBMETULI',pic:'ZZZ9'},{av:'A1461BarAlbPN',fld:'BARALBPN',pic:'ZZZZZ9.99'},{av:'A1095AlbTipEnt',fld:'ALBTIPENT',pic:'@!'},{av:'A7994AlbDto',fld:'ALBDTO',pic:'Z9.999'},{av:'A7993AlbMqTj',fld:'ALBMQTJ',pic:''},{av:'A7992AlbDf3',fld:'ALBDF3',pic:''},{av:'A7991AlbDf2',fld:'ALBDF2',pic:''},{av:'A7990AlbDf1',fld:'ALBDF1',pic:''},{av:'A7989AlbCald',fld:'ALBCALD',pic:''},{av:'A7104AlbEncA',fld:'ALBENCA',pic:'ZZZ9.99'},{av:'A7103AlbEncL',fld:'ALBENCL',pic:'ZZZ9.99'},{av:'A2761AlbBarRec',fld:'ALBBARREC',pic:'ZZ9.99'},{av:'A5354AlbImpMan',fld:'ALBIMPMAN',pic:'ZZZZZZZ9.99'},{av:'A1458BarAlbBul',fld:'BARALBBUL',pic:'ZZZ9'},{av:'A1248GuiFasULin',fld:'GUIFASULIN',pic:'ZZZ9'},{av:'A2763AlbHdrUlin',fld:'ALBHDRULIN',pic:'ZZZ9'},{av:'A12905AlbCadEnc',fld:'ALBCADENC',pic:'ZZZ9'},{av:'A2396BarAlbObs',fld:'BARALBOBS',pic:''},{av:'A14057AlbTiras',fld:'ALBTIRAS',pic:''},{av:'A14058AlbTirasKg',fld:'ALBTIRASKG',pic:'ZZZZZ9.99'},{av:'A14059AlbSinTest',fld:'ALBSINTEST',pic:''},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e141U72',iparms:[{av:'AV31Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV54Mensaje',fld:'vMENSAJE',pic:''},{av:'AV36KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV37MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV38PieAnt',fld:'vPIEANT',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV52barsit',fld:'vBARSIT',pic:'Z9',hsh:true},{av:'AV25AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV60Nofases',fld:'vNOFASES',pic:'ZZZ9',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV28AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV29AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV23Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV24GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV26AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV27AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{ctrl:'WCDOCUMENTODETRANSPORTEPRODUCCION_7'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("'DOVERPIEZAS'","{handler:'e151U72',iparms:[{av:'AV31Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV54Mensaje',fld:'vMENSAJE',pic:''},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("'DOVERPIEZAS'",",oparms:[{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("'DOIMPRIMIRHDR'","{handler:'e111U7195',iparms:[{av:'AV31Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV55ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("'DOIMPRIMIRHDR'",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("'DOPACKINGLIST'","{handler:'e121U7195',iparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV23Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV24GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''},{av:'A3391AlbSer',fld:'ALBSER',pic:''},{av:'A8879AlbSerD',fld:'ALBSERD',pic:''},{av:'A3392AlbColNom',fld:'ALBCOLNOM',pic:''},{av:'A3393AlbColNum',fld:'ALBCOLNUM',pic:'ZZZZZ9'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("'DOPACKINGLIST'",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("BARALBKGME.CONTROLVALUECHANGED","{handler:'e161U72',iparms:[{av:'AV31Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A14353KgsHdr',fld:'KGSHDR',pic:'ZZZZZ9.99'},{av:'AV43errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'A5019AlbHdrgm2',fld:'ALBHDRGM2',pic:'ZZZ9'},{av:'A3271AlbHdrAnc',fld:'ALBHDRANC',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV22UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV20Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("BARALBKGME.CONTROLVALUECHANGED",",oparms:[{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("ALBHDRGM2.CONTROLVALUECHANGED","{handler:'e171U72',iparms:[{av:'AV31Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A5019AlbHdrgm2',fld:'ALBHDRGM2',pic:'ZZZ9'},{av:'A3271AlbHdrAnc',fld:'ALBHDRANC',pic:'ZZZ9'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("ALBHDRGM2.CONTROLVALUECHANGED",",oparms:[{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("ALBHDRANC.CONTROLVALUECHANGED","{handler:'e181U72',iparms:[{av:'AV31Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A5019AlbHdrgm2',fld:'ALBHDRGM2',pic:'ZZZ9'},{av:'A3271AlbHdrAnc',fld:'ALBHDRANC',pic:'ZZZ9'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("ALBHDRANC.CONTROLVALUECHANGED",",oparms:[{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALIDV_GUIREMCLI","{handler:'validv_Guiremcli',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALIDV_GUIREMCLI",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_BARCOD",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_BARCODREO",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV31Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV23Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV54Mensaje',fld:'vMENSAJE',pic:''},{av:'A13890BarHDSusp',fld:'BARHDSUSP',pic:'9'},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A5034BarEstTip',fld:'BARESTTIP',pic:''},{av:'A5027BarGraCob',fld:'BARGRACOB',pic:'Z9'},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A4937BarCtrPdas',fld:'BARCTRPDAS',pic:'9'},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A1909BarGraAca',fld:'BARGRAACA',pic:'ZZZ9'},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A1503BarPart',fld:'BARPART',pic:'ZZZ9'},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''},{av:'A1279BarKla',fld:'BARKLA',pic:'ZZZZZ9.99'},{av:'A1280BarMla',fld:'BARMLA',pic:'ZZZZZ9.99'},{av:'A1292BarPlz',fld:'BARPLZ',pic:'ZZZ9'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A14356PzsEntrega',fld:'PZSENTREGA',pic:'ZZZZZ9'},{av:'A14355MtsEntrega',fld:'MTSENTREGA',pic:'ZZZZZ9.99'},{av:'A14354KgsEntrega',fld:'KGSENTREGA',pic:'ZZZZZ9.99'},{av:'A14353KgsHdr',fld:'KGSHDR',pic:'ZZZZZ9.99'},{av:'A14056AlbColorCv',fld:'ALBCOLORCV',pic:''},{av:'A3271AlbHdrAnc',fld:'ALBHDRANC',pic:'ZZZ9'},{av:'A3392AlbColNom',fld:'ALBCOLNOM',pic:''},{av:'A3393AlbColNum',fld:'ALBCOLNUM',pic:'ZZZZZ9'},{av:'A3394AlbTipCol',fld:'ALBTIPCOL',pic:'Z9'},{av:'A3391AlbSer',fld:'ALBSER',pic:''},{av:'A8879AlbSerD',fld:'ALBSERD',pic:''},{av:'A3886AlbCliCod',fld:'ALBCLICOD',pic:'ZZZZZ9'},{av:'A12232AlbNomCli',fld:'ALBNOMCLI',pic:''},{av:'A12233AlbNumcli',fld:'ALBNUMCLI',pic:'ZZZZZ9'},{av:'A12234AlbTipArt',fld:'ALBTIPART',pic:'ZZZ9'},{av:'A5019AlbHdrgm2',fld:'ALBHDRGM2',pic:'ZZZ9'},{av:'A4815AlbEncCli',fld:'ALBENCCLI',pic:''},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A13890BarHDSusp',fld:'BARHDSUSP',pic:'9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A5034BarEstTip',fld:'BARESTTIP',pic:''},{av:'A5027BarGraCob',fld:'BARGRACOB',pic:'Z9'},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A4937BarCtrPdas',fld:'BARCTRPDAS',pic:'9'},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A1909BarGraAca',fld:'BARGRAACA',pic:'ZZZ9'},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A1503BarPart',fld:'BARPART',pic:'ZZZ9'},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'edtBarCod_Forecolor',ctrl:'BARCOD',prop:'Forecolor'},{av:'edtBarCod_Backcolor',ctrl:'BARCOD',prop:'Backcolor'},{av:'edtBarCodReo_Forecolor',ctrl:'BARCODREO',prop:'Forecolor'},{av:'edtBarCodReo_Backcolor',ctrl:'BARCODREO',prop:'Backcolor'},{av:'edtBarCodPar_Forecolor',ctrl:'BARCODPAR',prop:'Forecolor'},{av:'edtBarCodPar_Backcolor',ctrl:'BARCODPAR',prop:'Backcolor'},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:''},{av:'A1279BarKla',fld:'BARKLA',pic:'ZZZZZ9.99'},{av:'A1280BarMla',fld:'BARMLA',pic:'ZZZZZ9.99'},{av:'A1292BarPlz',fld:'BARPLZ',pic:'ZZZ9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A14356PzsEntrega',fld:'PZSENTREGA',pic:'ZZZZZ9'},{av:'A14355MtsEntrega',fld:'MTSENTREGA',pic:'ZZZZZ9.99'},{av:'A14354KgsEntrega',fld:'KGSENTREGA',pic:'ZZZZZ9.99'},{av:'A14353KgsHdr',fld:'KGSHDR',pic:'ZZZZZ9.99'},{av:'A14056AlbColorCv',fld:'ALBCOLORCV',pic:''},{av:'AV54Mensaje',fld:'vMENSAJE',pic:''},{av:'A3271AlbHdrAnc',fld:'ALBHDRANC',pic:'ZZZ9'},{av:'A3392AlbColNom',fld:'ALBCOLNOM',pic:''},{av:'A3393AlbColNum',fld:'ALBCOLNUM',pic:'ZZZZZ9'},{av:'A3394AlbTipCol',fld:'ALBTIPCOL',pic:'Z9'},{av:'A3391AlbSer',fld:'ALBSER',pic:''},{av:'A8879AlbSerD',fld:'ALBSERD',pic:''},{av:'A3886AlbCliCod',fld:'ALBCLICOD',pic:'ZZZZZ9'},{av:'A12232AlbNomCli',fld:'ALBNOMCLI',pic:''},{av:'A12233AlbNumcli',fld:'ALBNUMCLI',pic:'ZZZZZ9'},{av:'A12234AlbTipArt',fld:'ALBTIPART',pic:'ZZZ9'},{av:'A5019AlbHdrgm2',fld:'ALBHDRGM2',pic:'ZZZ9'},{av:'A4815AlbEncCli',fld:'ALBENCCLI',pic:''},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_BARALBKGME","{handler:'valid_Baralbkgme',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O1261BarAlbKgmE'},{av:'A14354KgsEntrega',fld:'KGSENTREGA',pic:'ZZZZZ9.99'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'AV31Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A14353KgsHdr',fld:'KGSHDR',pic:'ZZZZZ9.99'},{av:'AV43errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'AV36KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_BARALBKGME",",oparms:[{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'AV36KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_BARALBMTRE","{handler:'valid_Baralbmtre',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O1263BarAlbMtrE'},{av:'A14355MtsEntrega',fld:'MTSENTREGA',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV37MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_BARALBMTRE",",oparms:[{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV37MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_BARALBPIE","{handler:'valid_Baralbpie',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O1265BarAlbPie'},{av:'A14356PzsEntrega',fld:'PZSENTREGA',pic:'ZZZZZ9'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV38PieAnt',fld:'vPIEANT',pic:'ZZZZZ9'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_BARALBPIE",",oparms:[{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'AV38PieAnt',fld:'vPIEANT',pic:'ZZZZZ9'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_TUBCOD","{handler:'valid_Tubcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1206TubCod',fld:'TUBCOD',pic:'ZZZ9'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'A1208TubPre',fld:'TUBPRE',pic:'ZZZ9.999'},{av:'A1266BarAlbTub',fld:'BARALBTUB',pic:'ZZZ9'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_TUBCOD",",oparms:[{av:'A1208TubPre',fld:'TUBPRE',pic:'ZZZ9.999'},{av:'A1266BarAlbTub',fld:'BARALBTUB',pic:'ZZZ9'},{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_BARALBTUB","{handler:'valid_Baralbtub',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_BARALBTUB",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_ALBPROVAL","{handler:'valid_Albproval',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_ALBPROVAL",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_BARSIT","{handler:'valid_Barsit',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_BARSIT",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_BARTIPCOR","{handler:'valid_Bartipcor',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_BARTIPCOR",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALIDV_GX_MODE","{handler:'validv_Gx_mode',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALIDV_GX_MODE",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_KGSHDR","{handler:'valid_Kgshdr',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_KGSHDR",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_KGSENTREGA","{handler:'valid_Kgsentrega',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_KGSENTREGA",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_MTSENTREGA","{handler:'valid_Mtsentrega',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_MTSENTREGA",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALID_PZSENTREGA","{handler:'valid_Pzsentrega',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALID_PZSENTREGA",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALIDV_COMBOTUBCOD","{handler:'validv_Combotubcod',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALIDV_COMBOTUBCOD",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
      setEventMetadata("VALIDV_COMBOPLASCOD","{handler:'validv_Comboplascod',iparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]");
      setEventMetadata("VALIDV_COMBOPLASCOD",",oparms:[{av:'AV35CliFacMtsP',fld:'vCLIFACMTSP',pic:''},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''}]}");
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
      pr_default.close(29);
      pr_default.close(30);
      pr_default.close(31);
      pr_default.close(33);
      pr_default.close(32);
      pr_default.close(34);
      pr_default.close(28);
      pr_default.close(35);
      pr_default.close(36);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV11BarCodPar = "" ;
      wcpOAV24GuiRemCln = "" ;
      wcpOAV25AlbProFch = GXutil.nullDate() ;
      wcpOAV26AlbSec = "" ;
      wcpOAV27AlbProPri = "" ;
      wcpOAV29AlbLic = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z3392AlbColNom = "" ;
      Z3391AlbSer = "" ;
      Z8879AlbSerD = "" ;
      Z12232AlbNomCli = "" ;
      Z4815AlbEncCli = "" ;
      Z1262BarPreKgm = DecimalUtil.ZERO ;
      Z1264BarPreMtr = DecimalUtil.ZERO ;
      Z40AlbProRec = DecimalUtil.ZERO ;
      Z2398BarFasExt = "" ;
      Z12196BarPreUnd = DecimalUtil.ZERO ;
      Z1461BarAlbPN = DecimalUtil.ZERO ;
      Z1095AlbTipEnt = "" ;
      Z7994AlbDto = DecimalUtil.ZERO ;
      Z7993AlbMqTj = "" ;
      Z7992AlbDf3 = "" ;
      Z7991AlbDf2 = "" ;
      Z7990AlbDf1 = "" ;
      Z7989AlbCald = "" ;
      Z7104AlbEncA = DecimalUtil.ZERO ;
      Z7103AlbEncL = DecimalUtil.ZERO ;
      Z2761AlbBarRec = DecimalUtil.ZERO ;
      Z5354AlbImpMan = DecimalUtil.ZERO ;
      Z2441AlbHdrObs = "" ;
      Z2839AlbProVal = "" ;
      Z2396BarAlbObs = "" ;
      Z14057AlbTiras = "" ;
      Z14058AlbTirasKg = DecimalUtil.ZERO ;
      Z14059AlbSinTest = "" ;
      Z3153CodCod = "" ;
      O1263BarAlbMtrE = DecimalUtil.ZERO ;
      O1261BarAlbKgmE = DecimalUtil.ZERO ;
      N3153CodCod = "" ;
      Combo_plascod_Selectedvalue_get = "" ;
      Combo_tubcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7EmprCod = "" ;
      A130BarCodPar = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A2839AlbProVal = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV22UsurCod = "" ;
      AV20Station = "" ;
      AV37MetAnt = DecimalUtil.ZERO ;
      AV36KilAnt = DecimalUtil.ZERO ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A1253EmprGuiRem = "" ;
      A3153CodCod = "" ;
      AV11BarCodPar = "" ;
      AV24GuiRemCln = "" ;
      AV25AlbProFch = GXutil.nullDate() ;
      AV26AlbSec = "" ;
      AV27AlbProPri = "" ;
      AV29AlbLic = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      AV35CliFacMtsP = "" ;
      A5291BarTipCor = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtnverpiezas_Jsonclick = "" ;
      bttBtnimprimirhdr_Jsonclick = "" ;
      bttBtnpackinglist_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV42Prompt = "" ;
      AV64Prompt_GXI = "" ;
      sImgUrl = "" ;
      lblTextblocktubcod_Jsonclick = "" ;
      ucCombo_tubcod = new com.genexus.webpanels.GXUserControl();
      Combo_tubcod_Caption = "" ;
      AV47TubCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockplascod_Jsonclick = "" ;
      ucCombo_plascod = new com.genexus.webpanels.GXUserControl();
      Combo_plascod_Caption = "" ;
      AV50PlasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A2441AlbHdrObs = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      A13878PedidoClie = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A3392AlbColNom = "" ;
      A12232AlbNomCli = "" ;
      WebComp_Wcdocumentodetransporteproduccion_7_Component = "" ;
      OldWcdocumentodetransporteproduccion_7 = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      A14353KgsHdr = DecimalUtil.ZERO ;
      A14354KgsEntrega = DecimalUtil.ZERO ;
      A14355MtsEntrega = DecimalUtil.ZERO ;
      AV62Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      sStyleString = "" ;
      ucDvelop_confirmpanel_trn_delete = new com.genexus.webpanels.GXUserControl();
      A4815AlbEncCli = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A2398BarFasExt = "" ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A1095AlbTipEnt = "" ;
      A7994AlbDto = DecimalUtil.ZERO ;
      A7993AlbMqTj = "" ;
      A7992AlbDf3 = "" ;
      A7991AlbDf2 = "" ;
      A7990AlbDf1 = "" ;
      A7989AlbCald = "" ;
      A7104AlbEncA = DecimalUtil.ZERO ;
      A7103AlbEncL = DecimalUtil.ZERO ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A2396BarAlbObs = "" ;
      A14057AlbTiras = "" ;
      A14058AlbTirasKg = DecimalUtil.ZERO ;
      A14059AlbSinTest = "" ;
      AV55ImpCod = "" ;
      A14056AlbColorCv = "" ;
      A365DisDes = "" ;
      A1208TubPre = DecimalUtil.ZERO ;
      A1281TubImp = DecimalUtil.ZERO ;
      AV17Insert_CodCod = "" ;
      AV54Mensaje = "" ;
      A407EmprNom = "" ;
      A1234BarNomCli = "" ;
      A5034BarEstTip = "" ;
      A2010BarTipDis = "" ;
      A5253BarAcc = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      A7101AlbLic = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A2242AlbSec = "" ;
      A3154CodDsc = "" ;
      A1244GuiRemCln = "" ;
      A1279BarKla = DecimalUtil.ZERO ;
      A1280BarMla = DecimalUtil.ZERO ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_tubcod_Objectcall = "" ;
      Combo_tubcod_Class = "" ;
      Combo_tubcod_Icontype = "" ;
      Combo_tubcod_Icon = "" ;
      Combo_tubcod_Tooltip = "" ;
      Combo_tubcod_Selectedvalue_set = "" ;
      Combo_tubcod_Selectedtext_set = "" ;
      Combo_tubcod_Selectedtext_get = "" ;
      Combo_tubcod_Gamoauthtoken = "" ;
      Combo_tubcod_Ddointernalname = "" ;
      Combo_tubcod_Titlecontrolalign = "" ;
      Combo_tubcod_Dropdownoptionstype = "" ;
      Combo_tubcod_Titlecontrolidtoreplace = "" ;
      Combo_tubcod_Datalisttype = "" ;
      Combo_tubcod_Datalistfixedvalues = "" ;
      Combo_tubcod_Datalistproc = "" ;
      Combo_tubcod_Datalistprocparametersprefix = "" ;
      Combo_tubcod_Remoteservicesparameters = "" ;
      Combo_tubcod_Htmltemplate = "" ;
      Combo_tubcod_Multiplevaluestype = "" ;
      Combo_tubcod_Loadingdata = "" ;
      Combo_tubcod_Noresultsfound = "" ;
      Combo_tubcod_Onlyselectedvalues = "" ;
      Combo_tubcod_Selectalltext = "" ;
      Combo_tubcod_Multiplevaluesseparator = "" ;
      Combo_tubcod_Addnewoptiontext = "" ;
      Combo_plascod_Objectcall = "" ;
      Combo_plascod_Class = "" ;
      Combo_plascod_Icontype = "" ;
      Combo_plascod_Icon = "" ;
      Combo_plascod_Tooltip = "" ;
      Combo_plascod_Selectedvalue_set = "" ;
      Combo_plascod_Selectedtext_set = "" ;
      Combo_plascod_Selectedtext_get = "" ;
      Combo_plascod_Gamoauthtoken = "" ;
      Combo_plascod_Ddointernalname = "" ;
      Combo_plascod_Titlecontrolalign = "" ;
      Combo_plascod_Dropdownoptionstype = "" ;
      Combo_plascod_Titlecontrolidtoreplace = "" ;
      Combo_plascod_Datalisttype = "" ;
      Combo_plascod_Datalistfixedvalues = "" ;
      Combo_plascod_Datalistproc = "" ;
      Combo_plascod_Datalistprocparametersprefix = "" ;
      Combo_plascod_Remoteservicesparameters = "" ;
      Combo_plascod_Htmltemplate = "" ;
      Combo_plascod_Multiplevaluestype = "" ;
      Combo_plascod_Loadingdata = "" ;
      Combo_plascod_Noresultsfound = "" ;
      Combo_plascod_Onlyselectedvalues = "" ;
      Combo_plascod_Selectalltext = "" ;
      Combo_plascod_Multiplevaluesseparator = "" ;
      Combo_plascod_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      Dvpanel_unnamedtable4_Objectcall = "" ;
      Dvpanel_unnamedtable4_Class = "" ;
      Dvpanel_unnamedtable4_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Dvelop_confirmpanel_trn_delete_Objectcall = "" ;
      Dvelop_confirmpanel_trn_delete_Width = "" ;
      Dvelop_confirmpanel_trn_delete_Height = "" ;
      Dvelop_confirmpanel_trn_delete_Class = "" ;
      Dvelop_confirmpanel_trn_delete_Comment = "" ;
      Dvelop_confirmpanel_trn_delete_Bodytype = "" ;
      Dvelop_confirmpanel_trn_delete_Bodycontentinternalname = "" ;
      Dvelop_confirmpanel_trn_delete_Result = "" ;
      Dvelop_confirmpanel_trn_delete_Texttype = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode195 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV21EmprNom = "" ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14WebSession = httpContext.getWebSession();
      AV19TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV58Kgs = DecimalUtil.ZERO ;
      AV59Mts = DecimalUtil.ZERO ;
      AV53MetPieCtr = "" ;
      Gx_msg = "" ;
      AV48ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item12 = new GXBaseCollection[1] ;
      AV41BarAlbMtrE = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z3154CodDsc = "" ;
      Z1253EmprGuiRem = "" ;
      Z7101AlbLic = "" ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z2242AlbSec = "" ;
      Z1244GuiRemCln = "" ;
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
      Z1279BarKla = DecimalUtil.ZERO ;
      Z1280BarMla = DecimalUtil.ZERO ;
      Z1208TubPre = DecimalUtil.ZERO ;
      T01U76_A407EmprNom = new String[] {""} ;
      T01U76_n407EmprNom = new boolean[] {false} ;
      T01U76_A3915EmpNumDec = new byte[1] ;
      T01U76_n3915EmpNumDec = new boolean[] {false} ;
      T01U79_A1253EmprGuiRem = new String[] {""} ;
      T01U79_A5805AlbEnvFtp = new byte[1] ;
      T01U79_A7101AlbLic = new String[] {""} ;
      T01U79_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01U79_A2242AlbSec = new String[] {""} ;
      T01U79_A1243GuiRemCli = new int[1] ;
      T01U711_A1244GuiRemCln = new String[] {""} ;
      T01U75_A13890BarHDSusp = new byte[1] ;
      T01U75_n13890BarHDSusp = new boolean[] {false} ;
      T01U77_A361DisCod = new int[1] ;
      T01U77_A1235BarNumCli = new int[1] ;
      T01U77_A1234BarNomCli = new String[] {""} ;
      T01U77_A5034BarEstTip = new String[] {""} ;
      T01U77_A5291BarTipCor = new String[] {""} ;
      T01U77_A5027BarGraCob = new byte[1] ;
      T01U77_A2010BarTipDis = new String[] {""} ;
      T01U77_A4937BarCtrPdas = new byte[1] ;
      T01U77_n4937BarCtrPdas = new boolean[] {false} ;
      T01U77_A5253BarAcc = new String[] {""} ;
      T01U77_A148BarEstReo = new byte[1] ;
      T01U77_A143BarDisNum = new String[] {""} ;
      T01U77_A1909BarGraAca = new short[1] ;
      T01U77_A4812BarEncCli = new String[] {""} ;
      T01U77_A1652BarSerDsc = new String[] {""} ;
      T01U77_A218BarTipCol = new byte[1] ;
      T01U77_A136BarColNum = new int[1] ;
      T01U77_A135BarColNom = new String[] {""} ;
      T01U77_A1503BarPart = new short[1] ;
      T01U77_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01U77_A125BarAncAca1 = new short[1] ;
      T01U77_A213BarSit = new byte[1] ;
      T01U77_A212BarSer = new String[] {""} ;
      T01U77_A4466BarAcaAnh = new short[1] ;
      T01U77_A252CliCod = new int[1] ;
      T01U77_n252CliCod = new boolean[] {false} ;
      T01U77_A217BarTipArt = new short[1] ;
      T01U77_n217BarTipArt = new boolean[] {false} ;
      T01U712_A365DisDes = new String[] {""} ;
      T01U714_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U714_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U714_A1292BarPlz = new short[1] ;
      T01U716_A898BarPieNDes = new int[1] ;
      T01U716_A199BarPie1 = new short[1] ;
      T01U710_A3154CodDsc = new String[] {""} ;
      T01U710_n3154CodDsc = new boolean[] {false} ;
      T01U78_A1208TubPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U78_n1208TubPre = new boolean[] {false} ;
      T01U719_A1253EmprGuiRem = new String[] {""} ;
      T01U719_A361DisCod = new int[1] ;
      T01U719_A6466PlasCod = new short[1] ;
      T01U719_n6466PlasCod = new boolean[] {false} ;
      T01U719_A1266BarAlbTub = new int[1] ;
      T01U719_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A1265BarAlbPie = new int[1] ;
      T01U719_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A3271AlbHdrAnc = new short[1] ;
      T01U719_A3392AlbColNom = new String[] {""} ;
      T01U719_A3393AlbColNum = new int[1] ;
      T01U719_A3394AlbTipCol = new byte[1] ;
      T01U719_A3391AlbSer = new String[] {""} ;
      T01U719_A8879AlbSerD = new String[] {""} ;
      T01U719_A3886AlbCliCod = new int[1] ;
      T01U719_A12232AlbNomCli = new String[] {""} ;
      T01U719_A12233AlbNumcli = new int[1] ;
      T01U719_A12234AlbTipArt = new short[1] ;
      T01U719_A5019AlbHdrgm2 = new short[1] ;
      T01U719_A4815AlbEncCli = new String[] {""} ;
      T01U719_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A32AlbProEsp = new byte[1] ;
      T01U719_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A2398BarFasExt = new String[] {""} ;
      T01U719_A407EmprNom = new String[] {""} ;
      T01U719_n407EmprNom = new boolean[] {false} ;
      T01U719_A5805AlbEnvFtp = new byte[1] ;
      T01U719_A7101AlbLic = new String[] {""} ;
      T01U719_A1244GuiRemCln = new String[] {""} ;
      T01U719_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01U719_A2242AlbSec = new String[] {""} ;
      T01U719_A1235BarNumCli = new int[1] ;
      T01U719_A1234BarNomCli = new String[] {""} ;
      T01U719_A12195BarAlbUnd = new int[1] ;
      T01U719_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A5034BarEstTip = new String[] {""} ;
      T01U719_A6645AlbMetULi = new short[1] ;
      T01U719_A5291BarTipCor = new String[] {""} ;
      T01U719_A5027BarGraCob = new byte[1] ;
      T01U719_A2010BarTipDis = new String[] {""} ;
      T01U719_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A4937BarCtrPdas = new byte[1] ;
      T01U719_n4937BarCtrPdas = new boolean[] {false} ;
      T01U719_A1095AlbTipEnt = new String[] {""} ;
      T01U719_A7994AlbDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A7993AlbMqTj = new String[] {""} ;
      T01U719_A7992AlbDf3 = new String[] {""} ;
      T01U719_A7991AlbDf2 = new String[] {""} ;
      T01U719_A7990AlbDf1 = new String[] {""} ;
      T01U719_A7989AlbCald = new String[] {""} ;
      T01U719_A7104AlbEncA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A7103AlbEncL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A6467BarAlbPlas = new short[1] ;
      T01U719_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A5253BarAcc = new String[] {""} ;
      T01U719_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A148BarEstReo = new byte[1] ;
      T01U719_A143BarDisNum = new String[] {""} ;
      T01U719_A1909BarGraAca = new short[1] ;
      T01U719_A4812BarEncCli = new String[] {""} ;
      T01U719_A2441AlbHdrObs = new String[] {""} ;
      T01U719_A1652BarSerDsc = new String[] {""} ;
      T01U719_A218BarTipCol = new byte[1] ;
      T01U719_A136BarColNum = new int[1] ;
      T01U719_A135BarColNom = new String[] {""} ;
      T01U719_A3154CodDsc = new String[] {""} ;
      T01U719_n3154CodDsc = new boolean[] {false} ;
      T01U719_A1503BarPart = new short[1] ;
      T01U719_A1458BarAlbBul = new short[1] ;
      T01U719_A2839AlbProVal = new String[] {""} ;
      T01U719_A365DisDes = new String[] {""} ;
      T01U719_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01U719_A1208TubPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_n1208TubPre = new boolean[] {false} ;
      T01U719_A125BarAncAca1 = new short[1] ;
      T01U719_A213BarSit = new byte[1] ;
      T01U719_A212BarSer = new String[] {""} ;
      T01U719_A1248GuiFasULin = new short[1] ;
      T01U719_A2763AlbHdrUlin = new short[1] ;
      T01U719_A4466BarAcaAnh = new short[1] ;
      T01U719_A12905AlbCadEnc = new short[1] ;
      T01U719_A2396BarAlbObs = new String[] {""} ;
      T01U719_A14057AlbTiras = new String[] {""} ;
      T01U719_A14058AlbTirasKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A14059AlbSinTest = new String[] {""} ;
      T01U719_A3915EmpNumDec = new byte[1] ;
      T01U719_n3915EmpNumDec = new boolean[] {false} ;
      T01U719_A396EmprCod = new String[] {""} ;
      T01U719_A129BarCod = new int[1] ;
      T01U719_A132BarCodReo = new byte[1] ;
      T01U719_A130BarCodPar = new String[] {""} ;
      T01U719_A1206TubCod = new short[1] ;
      T01U719_n1206TubCod = new boolean[] {false} ;
      T01U719_A30AlbProCod = new long[1] ;
      T01U719_A3153CodCod = new String[] {""} ;
      T01U719_n3153CodCod = new boolean[] {false} ;
      T01U719_A1243GuiRemCli = new int[1] ;
      T01U719_A252CliCod = new int[1] ;
      T01U719_n252CliCod = new boolean[] {false} ;
      T01U719_A217BarTipArt = new short[1] ;
      T01U719_n217BarTipArt = new boolean[] {false} ;
      T01U719_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U719_A1292BarPlz = new short[1] ;
      T01U719_A898BarPieNDes = new int[1] ;
      T01U719_A199BarPie1 = new short[1] ;
      T01U721_A13890BarHDSusp = new byte[1] ;
      T01U721_n13890BarHDSusp = new boolean[] {false} ;
      T01U722_A361DisCod = new int[1] ;
      T01U722_A1235BarNumCli = new int[1] ;
      T01U722_A1234BarNomCli = new String[] {""} ;
      T01U722_A5034BarEstTip = new String[] {""} ;
      T01U722_A5291BarTipCor = new String[] {""} ;
      T01U722_A5027BarGraCob = new byte[1] ;
      T01U722_A2010BarTipDis = new String[] {""} ;
      T01U722_A4937BarCtrPdas = new byte[1] ;
      T01U722_n4937BarCtrPdas = new boolean[] {false} ;
      T01U722_A5253BarAcc = new String[] {""} ;
      T01U722_A148BarEstReo = new byte[1] ;
      T01U722_A143BarDisNum = new String[] {""} ;
      T01U722_A1909BarGraAca = new short[1] ;
      T01U722_A4812BarEncCli = new String[] {""} ;
      T01U722_A1652BarSerDsc = new String[] {""} ;
      T01U722_A218BarTipCol = new byte[1] ;
      T01U722_A136BarColNum = new int[1] ;
      T01U722_A135BarColNom = new String[] {""} ;
      T01U722_A1503BarPart = new short[1] ;
      T01U722_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01U722_A125BarAncAca1 = new short[1] ;
      T01U722_A213BarSit = new byte[1] ;
      T01U722_A212BarSer = new String[] {""} ;
      T01U722_A4466BarAcaAnh = new short[1] ;
      T01U722_A252CliCod = new int[1] ;
      T01U722_n252CliCod = new boolean[] {false} ;
      T01U722_A217BarTipArt = new short[1] ;
      T01U722_n217BarTipArt = new boolean[] {false} ;
      T01U723_A1208TubPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U723_n1208TubPre = new boolean[] {false} ;
      T01U724_A1253EmprGuiRem = new String[] {""} ;
      T01U724_A5805AlbEnvFtp = new byte[1] ;
      T01U724_A7101AlbLic = new String[] {""} ;
      T01U724_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01U724_A2242AlbSec = new String[] {""} ;
      T01U724_A1243GuiRemCli = new int[1] ;
      T01U725_A1244GuiRemCln = new String[] {""} ;
      T01U726_A3154CodDsc = new String[] {""} ;
      T01U726_n3154CodDsc = new boolean[] {false} ;
      T01U727_A365DisDes = new String[] {""} ;
      T01U729_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U729_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U729_A1292BarPlz = new short[1] ;
      T01U731_A898BarPieNDes = new int[1] ;
      T01U731_A199BarPie1 = new short[1] ;
      T01U732_A396EmprCod = new String[] {""} ;
      T01U732_A30AlbProCod = new long[1] ;
      T01U732_A129BarCod = new int[1] ;
      T01U732_A132BarCodReo = new byte[1] ;
      T01U732_A130BarCodPar = new String[] {""} ;
      T01U73_A6466PlasCod = new short[1] ;
      T01U73_n6466PlasCod = new boolean[] {false} ;
      T01U73_A1266BarAlbTub = new int[1] ;
      T01U73_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U73_A1265BarAlbPie = new int[1] ;
      T01U73_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U73_A3271AlbHdrAnc = new short[1] ;
      T01U73_A3392AlbColNom = new String[] {""} ;
      T01U73_A3393AlbColNum = new int[1] ;
      T01U73_A3394AlbTipCol = new byte[1] ;
      T01U73_A3391AlbSer = new String[] {""} ;
      T01U73_A8879AlbSerD = new String[] {""} ;
      T01U73_A3886AlbCliCod = new int[1] ;
      T01U73_A12232AlbNomCli = new String[] {""} ;
      T01U73_A12233AlbNumcli = new int[1] ;
      T01U73_A12234AlbTipArt = new short[1] ;
      T01U73_A5019AlbHdrgm2 = new short[1] ;
      T01U73_A4815AlbEncCli = new String[] {""} ;
      T01U73_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U73_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U73_A32AlbProEsp = new byte[1] ;
      T01U73_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U73_A2398BarFasExt = new String[] {""} ;
      T01U73_A12195BarAlbUnd = new int[1] ;
      T01U73_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U73_A6645AlbMetULi = new short[1] ;
      T01U73_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U73_A1095AlbTipEnt = new String[] {""} ;
      T01U73_A7994AlbDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U73_A7993AlbMqTj = new String[] {""} ;
      T01U73_A7992AlbDf3 = new String[] {""} ;
      T01U73_A7991AlbDf2 = new String[] {""} ;
      T01U73_A7990AlbDf1 = new String[] {""} ;
      T01U73_A7989AlbCald = new String[] {""} ;
      T01U73_A7104AlbEncA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U73_A7103AlbEncL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U73_A6467BarAlbPlas = new short[1] ;
      T01U73_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U73_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U73_A2441AlbHdrObs = new String[] {""} ;
      T01U73_A1458BarAlbBul = new short[1] ;
      T01U73_A2839AlbProVal = new String[] {""} ;
      T01U73_A1248GuiFasULin = new short[1] ;
      T01U73_A2763AlbHdrUlin = new short[1] ;
      T01U73_A12905AlbCadEnc = new short[1] ;
      T01U73_A2396BarAlbObs = new String[] {""} ;
      T01U73_A14057AlbTiras = new String[] {""} ;
      T01U73_A14058AlbTirasKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U73_A14059AlbSinTest = new String[] {""} ;
      T01U73_A396EmprCod = new String[] {""} ;
      T01U73_A129BarCod = new int[1] ;
      T01U73_A132BarCodReo = new byte[1] ;
      T01U73_A130BarCodPar = new String[] {""} ;
      T01U73_A1206TubCod = new short[1] ;
      T01U73_n1206TubCod = new boolean[] {false} ;
      T01U73_A30AlbProCod = new long[1] ;
      T01U73_A3153CodCod = new String[] {""} ;
      T01U73_n3153CodCod = new boolean[] {false} ;
      T01U733_A396EmprCod = new String[] {""} ;
      T01U733_A129BarCod = new int[1] ;
      T01U733_A132BarCodReo = new byte[1] ;
      T01U733_A130BarCodPar = new String[] {""} ;
      T01U733_A30AlbProCod = new long[1] ;
      T01U734_A396EmprCod = new String[] {""} ;
      T01U734_A129BarCod = new int[1] ;
      T01U734_A132BarCodReo = new byte[1] ;
      T01U734_A130BarCodPar = new String[] {""} ;
      T01U734_A30AlbProCod = new long[1] ;
      T01U72_A6466PlasCod = new short[1] ;
      T01U72_n6466PlasCod = new boolean[] {false} ;
      T01U72_A1266BarAlbTub = new int[1] ;
      T01U72_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U72_A1265BarAlbPie = new int[1] ;
      T01U72_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U72_A3271AlbHdrAnc = new short[1] ;
      T01U72_A3392AlbColNom = new String[] {""} ;
      T01U72_A3393AlbColNum = new int[1] ;
      T01U72_A3394AlbTipCol = new byte[1] ;
      T01U72_A3391AlbSer = new String[] {""} ;
      T01U72_A8879AlbSerD = new String[] {""} ;
      T01U72_A3886AlbCliCod = new int[1] ;
      T01U72_A12232AlbNomCli = new String[] {""} ;
      T01U72_A12233AlbNumcli = new int[1] ;
      T01U72_A12234AlbTipArt = new short[1] ;
      T01U72_A5019AlbHdrgm2 = new short[1] ;
      T01U72_A4815AlbEncCli = new String[] {""} ;
      T01U72_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U72_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U72_A32AlbProEsp = new byte[1] ;
      T01U72_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U72_A2398BarFasExt = new String[] {""} ;
      T01U72_A12195BarAlbUnd = new int[1] ;
      T01U72_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U72_A6645AlbMetULi = new short[1] ;
      T01U72_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U72_A1095AlbTipEnt = new String[] {""} ;
      T01U72_A7994AlbDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U72_A7993AlbMqTj = new String[] {""} ;
      T01U72_A7992AlbDf3 = new String[] {""} ;
      T01U72_A7991AlbDf2 = new String[] {""} ;
      T01U72_A7990AlbDf1 = new String[] {""} ;
      T01U72_A7989AlbCald = new String[] {""} ;
      T01U72_A7104AlbEncA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U72_A7103AlbEncL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U72_A6467BarAlbPlas = new short[1] ;
      T01U72_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U72_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U72_A2441AlbHdrObs = new String[] {""} ;
      T01U72_A1458BarAlbBul = new short[1] ;
      T01U72_A2839AlbProVal = new String[] {""} ;
      T01U72_A1248GuiFasULin = new short[1] ;
      T01U72_A2763AlbHdrUlin = new short[1] ;
      T01U72_A12905AlbCadEnc = new short[1] ;
      T01U72_A2396BarAlbObs = new String[] {""} ;
      T01U72_A14057AlbTiras = new String[] {""} ;
      T01U72_A14058AlbTirasKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U72_A14059AlbSinTest = new String[] {""} ;
      T01U72_A396EmprCod = new String[] {""} ;
      T01U72_A129BarCod = new int[1] ;
      T01U72_A132BarCodReo = new byte[1] ;
      T01U72_A130BarCodPar = new String[] {""} ;
      T01U72_A1206TubCod = new short[1] ;
      T01U72_n1206TubCod = new boolean[] {false} ;
      T01U72_A30AlbProCod = new long[1] ;
      T01U72_A3153CodCod = new String[] {""} ;
      T01U72_n3153CodCod = new boolean[] {false} ;
      T01U739_A13890BarHDSusp = new byte[1] ;
      T01U739_n13890BarHDSusp = new boolean[] {false} ;
      T01U740_A361DisCod = new int[1] ;
      T01U740_A1235BarNumCli = new int[1] ;
      T01U740_A1234BarNomCli = new String[] {""} ;
      T01U740_A5034BarEstTip = new String[] {""} ;
      T01U740_A5291BarTipCor = new String[] {""} ;
      T01U740_A5027BarGraCob = new byte[1] ;
      T01U740_A2010BarTipDis = new String[] {""} ;
      T01U740_A4937BarCtrPdas = new byte[1] ;
      T01U740_n4937BarCtrPdas = new boolean[] {false} ;
      T01U740_A5253BarAcc = new String[] {""} ;
      T01U740_A148BarEstReo = new byte[1] ;
      T01U740_A143BarDisNum = new String[] {""} ;
      T01U740_A1909BarGraAca = new short[1] ;
      T01U740_A4812BarEncCli = new String[] {""} ;
      T01U740_A1652BarSerDsc = new String[] {""} ;
      T01U740_A218BarTipCol = new byte[1] ;
      T01U740_A136BarColNum = new int[1] ;
      T01U740_A135BarColNom = new String[] {""} ;
      T01U740_A1503BarPart = new short[1] ;
      T01U740_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01U740_A125BarAncAca1 = new short[1] ;
      T01U740_A213BarSit = new byte[1] ;
      T01U740_A212BarSer = new String[] {""} ;
      T01U740_A4466BarAcaAnh = new short[1] ;
      T01U740_A252CliCod = new int[1] ;
      T01U740_n252CliCod = new boolean[] {false} ;
      T01U740_A217BarTipArt = new short[1] ;
      T01U740_n217BarTipArt = new boolean[] {false} ;
      T01U741_A1208TubPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U741_n1208TubPre = new boolean[] {false} ;
      T01U742_A1253EmprGuiRem = new String[] {""} ;
      T01U742_A5805AlbEnvFtp = new byte[1] ;
      T01U742_A7101AlbLic = new String[] {""} ;
      T01U742_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01U742_A2242AlbSec = new String[] {""} ;
      T01U742_A1243GuiRemCli = new int[1] ;
      T01U743_A1244GuiRemCln = new String[] {""} ;
      T01U744_A3154CodDsc = new String[] {""} ;
      T01U744_n3154CodDsc = new boolean[] {false} ;
      T01U745_A365DisDes = new String[] {""} ;
      T01U747_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U747_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U747_A1292BarPlz = new short[1] ;
      T01U749_A898BarPieNDes = new int[1] ;
      T01U749_A199BarPie1 = new short[1] ;
      T01U750_A396EmprCod = new String[] {""} ;
      T01U750_A30AlbProCod = new long[1] ;
      T01U750_A129BarCod = new int[1] ;
      T01U750_A132BarCodReo = new byte[1] ;
      T01U750_A130BarCodPar = new String[] {""} ;
      T01U750_A6648AlbMetLin = new short[1] ;
      T01U751_A396EmprCod = new String[] {""} ;
      T01U751_A30AlbProCod = new long[1] ;
      T01U751_A129BarCod = new int[1] ;
      T01U751_A132BarCodReo = new byte[1] ;
      T01U751_A130BarCodPar = new String[] {""} ;
      T01U751_A9639Et_Numero = new short[1] ;
      T01U752_A396EmprCod = new String[] {""} ;
      T01U752_A30AlbProCod = new long[1] ;
      T01U752_A129BarCod = new int[1] ;
      T01U752_A132BarCodReo = new byte[1] ;
      T01U752_A130BarCodPar = new String[] {""} ;
      T01U752_A6622AlbHdRLn = new short[1] ;
      T01U753_A396EmprCod = new String[] {""} ;
      T01U753_A30AlbProCod = new long[1] ;
      T01U753_A129BarCod = new int[1] ;
      T01U753_A132BarCodReo = new byte[1] ;
      T01U753_A130BarCodPar = new String[] {""} ;
      T01U753_A5456P_ForLin = new short[1] ;
      T01U754_A396EmprCod = new String[] {""} ;
      T01U754_A30AlbProCod = new long[1] ;
      T01U754_A129BarCod = new int[1] ;
      T01U754_A132BarCodReo = new byte[1] ;
      T01U754_A130BarCodPar = new String[] {""} ;
      T01U754_A2524DisComLin = new byte[1] ;
      T01U754_A1056DisComCod = new String[] {""} ;
      T01U754_A1032FonCod = new String[] {""} ;
      T01U755_A396EmprCod = new String[] {""} ;
      T01U755_A3617AlbTrnCod = new long[1] ;
      T01U755_A30AlbProCod = new long[1] ;
      T01U755_A129BarCod = new int[1] ;
      T01U755_A132BarCodReo = new byte[1] ;
      T01U755_A130BarCodPar = new String[] {""} ;
      T01U756_A396EmprCod = new String[] {""} ;
      T01U756_A30AlbProCod = new long[1] ;
      T01U756_A129BarCod = new int[1] ;
      T01U756_A132BarCodReo = new byte[1] ;
      T01U756_A130BarCodPar = new String[] {""} ;
      T01U756_A3621AlbPckLin = new short[1] ;
      T01U757_A396EmprCod = new String[] {""} ;
      T01U757_A30AlbProCod = new long[1] ;
      T01U757_A129BarCod = new int[1] ;
      T01U757_A132BarCodReo = new byte[1] ;
      T01U757_A130BarCodPar = new String[] {""} ;
      T01U757_A2764AlbHdrLin = new short[1] ;
      T01U758_A396EmprCod = new String[] {""} ;
      T01U758_A30AlbProCod = new long[1] ;
      T01U758_A129BarCod = new int[1] ;
      T01U758_A132BarCodReo = new byte[1] ;
      T01U758_A130BarCodPar = new String[] {""} ;
      T01U758_A1468AlbPrdLin = new short[1] ;
      T01U759_A396EmprCod = new String[] {""} ;
      T01U759_A30AlbProCod = new long[1] ;
      T01U759_A129BarCod = new int[1] ;
      T01U759_A132BarCodReo = new byte[1] ;
      T01U759_A130BarCodPar = new String[] {""} ;
      T01U759_A200BarPieCod = new String[] {""} ;
      T01U760_A396EmprCod = new String[] {""} ;
      T01U760_A30AlbProCod = new long[1] ;
      T01U760_A129BarCod = new int[1] ;
      T01U760_A132BarCodReo = new byte[1] ;
      T01U760_A130BarCodPar = new String[] {""} ;
      T01U760_A1240GuiFasLin = new short[1] ;
      T01U761_A396EmprCod = new String[] {""} ;
      T01U761_A30AlbProCod = new long[1] ;
      T01U761_A129BarCod = new int[1] ;
      T01U761_A132BarCodReo = new byte[1] ;
      T01U761_A130BarCodPar = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i2839AlbProVal = "" ;
      i14057AlbTiras = "" ;
      i14059AlbSinTest = "" ;
      GXv_int25 = new long[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXt_decimal15 = DecimalUtil.ZERO ;
      GXv_decimal27 = new java.math.BigDecimal[1] ;
      GXt_char1 = "" ;
      GXv_int20 = new short[1] ;
      GXv_char23 = new String[1] ;
      GXv_int18 = new int[1] ;
      GXv_int24 = new byte[1] ;
      GXv_char21 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int17 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int19 = new short[1] ;
      GXv_int16 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_int22 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new byte[1] ;
      Z13878PedidoClie = "" ;
      Z14355MtsEntrega = DecimalUtil.ZERO ;
      Z14354KgsEntrega = DecimalUtil.ZERO ;
      Z14353KgsHdr = DecimalUtil.ZERO ;
      Z14056AlbColorCv = "" ;
      ZV54Mensaje = "" ;
      ZV36KilAnt = DecimalUtil.ZERO ;
      ZV37MetAnt = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_3__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_3__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_3__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_3__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_3__default(),
         new Object[] {
             new Object[] {
            T01U72_A6466PlasCod, T01U72_n6466PlasCod, T01U72_A1266BarAlbTub, T01U72_A1261BarAlbKgmE, T01U72_A1265BarAlbPie, T01U72_A1263BarAlbMtrE, T01U72_A3271AlbHdrAnc, T01U72_A3392AlbColNom, T01U72_A3393AlbColNum, T01U72_A3394AlbTipCol,
            T01U72_A3391AlbSer, T01U72_A8879AlbSerD, T01U72_A3886AlbCliCod, T01U72_A12232AlbNomCli, T01U72_A12233AlbNumcli, T01U72_A12234AlbTipArt, T01U72_A5019AlbHdrgm2, T01U72_A4815AlbEncCli, T01U72_A1262BarPreKgm, T01U72_A1264BarPreMtr,
            T01U72_A32AlbProEsp, T01U72_A40AlbProRec, T01U72_A2398BarFasExt, T01U72_A12195BarAlbUnd, T01U72_A12196BarPreUnd, T01U72_A6645AlbMetULi, T01U72_A1461BarAlbPN, T01U72_A1095AlbTipEnt, T01U72_A7994AlbDto, T01U72_A7993AlbMqTj,
            T01U72_A7992AlbDf3, T01U72_A7991AlbDf2, T01U72_A7990AlbDf1, T01U72_A7989AlbCald, T01U72_A7104AlbEncA, T01U72_A7103AlbEncL, T01U72_A6467BarAlbPlas, T01U72_A2761AlbBarRec, T01U72_A5354AlbImpMan, T01U72_A2441AlbHdrObs,
            T01U72_A1458BarAlbBul, T01U72_A2839AlbProVal, T01U72_A1248GuiFasULin, T01U72_A2763AlbHdrUlin, T01U72_A12905AlbCadEnc, T01U72_A2396BarAlbObs, T01U72_A14057AlbTiras, T01U72_A14058AlbTirasKg, T01U72_A14059AlbSinTest, T01U72_A396EmprCod,
            T01U72_A129BarCod, T01U72_A132BarCodReo, T01U72_A130BarCodPar, T01U72_A1206TubCod, T01U72_n1206TubCod, T01U72_A30AlbProCod, T01U72_A3153CodCod, T01U72_n3153CodCod
            }
            , new Object[] {
            T01U73_A6466PlasCod, T01U73_n6466PlasCod, T01U73_A1266BarAlbTub, T01U73_A1261BarAlbKgmE, T01U73_A1265BarAlbPie, T01U73_A1263BarAlbMtrE, T01U73_A3271AlbHdrAnc, T01U73_A3392AlbColNom, T01U73_A3393AlbColNum, T01U73_A3394AlbTipCol,
            T01U73_A3391AlbSer, T01U73_A8879AlbSerD, T01U73_A3886AlbCliCod, T01U73_A12232AlbNomCli, T01U73_A12233AlbNumcli, T01U73_A12234AlbTipArt, T01U73_A5019AlbHdrgm2, T01U73_A4815AlbEncCli, T01U73_A1262BarPreKgm, T01U73_A1264BarPreMtr,
            T01U73_A32AlbProEsp, T01U73_A40AlbProRec, T01U73_A2398BarFasExt, T01U73_A12195BarAlbUnd, T01U73_A12196BarPreUnd, T01U73_A6645AlbMetULi, T01U73_A1461BarAlbPN, T01U73_A1095AlbTipEnt, T01U73_A7994AlbDto, T01U73_A7993AlbMqTj,
            T01U73_A7992AlbDf3, T01U73_A7991AlbDf2, T01U73_A7990AlbDf1, T01U73_A7989AlbCald, T01U73_A7104AlbEncA, T01U73_A7103AlbEncL, T01U73_A6467BarAlbPlas, T01U73_A2761AlbBarRec, T01U73_A5354AlbImpMan, T01U73_A2441AlbHdrObs,
            T01U73_A1458BarAlbBul, T01U73_A2839AlbProVal, T01U73_A1248GuiFasULin, T01U73_A2763AlbHdrUlin, T01U73_A12905AlbCadEnc, T01U73_A2396BarAlbObs, T01U73_A14057AlbTiras, T01U73_A14058AlbTirasKg, T01U73_A14059AlbSinTest, T01U73_A396EmprCod,
            T01U73_A129BarCod, T01U73_A132BarCodReo, T01U73_A130BarCodPar, T01U73_A1206TubCod, T01U73_n1206TubCod, T01U73_A30AlbProCod, T01U73_A3153CodCod, T01U73_n3153CodCod
            }
            , new Object[] {
            T01U75_A13890BarHDSusp, T01U75_n13890BarHDSusp
            }
            , new Object[] {
            T01U76_A407EmprNom, T01U76_n407EmprNom, T01U76_A3915EmpNumDec, T01U76_n3915EmpNumDec
            }
            , new Object[] {
            T01U77_A361DisCod, T01U77_A1235BarNumCli, T01U77_A1234BarNomCli, T01U77_A5034BarEstTip, T01U77_A5291BarTipCor, T01U77_A5027BarGraCob, T01U77_A2010BarTipDis, T01U77_A4937BarCtrPdas, T01U77_n4937BarCtrPdas, T01U77_A5253BarAcc,
            T01U77_A148BarEstReo, T01U77_A143BarDisNum, T01U77_A1909BarGraAca, T01U77_A4812BarEncCli, T01U77_A1652BarSerDsc, T01U77_A218BarTipCol, T01U77_A136BarColNum, T01U77_A135BarColNom, T01U77_A1503BarPart, T01U77_A161BarFecSal,
            T01U77_A125BarAncAca1, T01U77_A213BarSit, T01U77_A212BarSer, T01U77_A4466BarAcaAnh, T01U77_A252CliCod, T01U77_n252CliCod, T01U77_A217BarTipArt, T01U77_n217BarTipArt
            }
            , new Object[] {
            T01U78_A1208TubPre, T01U78_n1208TubPre
            }
            , new Object[] {
            T01U79_A1253EmprGuiRem, T01U79_A5805AlbEnvFtp, T01U79_A7101AlbLic, T01U79_A34AlbProfch, T01U79_A2242AlbSec, T01U79_A1243GuiRemCli
            }
            , new Object[] {
            T01U710_A3154CodDsc, T01U710_n3154CodDsc
            }
            , new Object[] {
            T01U711_A1244GuiRemCln
            }
            , new Object[] {
            T01U712_A365DisDes
            }
            , new Object[] {
            T01U714_A1279BarKla, T01U714_A1280BarMla, T01U714_A1292BarPlz
            }
            , new Object[] {
            T01U716_A898BarPieNDes, T01U716_A199BarPie1
            }
            , new Object[] {
            T01U719_A1253EmprGuiRem, T01U719_A361DisCod, T01U719_A6466PlasCod, T01U719_n6466PlasCod, T01U719_A1266BarAlbTub, T01U719_A1261BarAlbKgmE, T01U719_A1265BarAlbPie, T01U719_A1263BarAlbMtrE, T01U719_A3271AlbHdrAnc, T01U719_A3392AlbColNom,
            T01U719_A3393AlbColNum, T01U719_A3394AlbTipCol, T01U719_A3391AlbSer, T01U719_A8879AlbSerD, T01U719_A3886AlbCliCod, T01U719_A12232AlbNomCli, T01U719_A12233AlbNumcli, T01U719_A12234AlbTipArt, T01U719_A5019AlbHdrgm2, T01U719_A4815AlbEncCli,
            T01U719_A1262BarPreKgm, T01U719_A1264BarPreMtr, T01U719_A32AlbProEsp, T01U719_A40AlbProRec, T01U719_A2398BarFasExt, T01U719_A407EmprNom, T01U719_n407EmprNom, T01U719_A5805AlbEnvFtp, T01U719_A7101AlbLic, T01U719_A1244GuiRemCln,
            T01U719_A34AlbProfch, T01U719_A2242AlbSec, T01U719_A1235BarNumCli, T01U719_A1234BarNomCli, T01U719_A12195BarAlbUnd, T01U719_A12196BarPreUnd, T01U719_A5034BarEstTip, T01U719_A6645AlbMetULi, T01U719_A5291BarTipCor, T01U719_A5027BarGraCob,
            T01U719_A2010BarTipDis, T01U719_A1461BarAlbPN, T01U719_A4937BarCtrPdas, T01U719_n4937BarCtrPdas, T01U719_A1095AlbTipEnt, T01U719_A7994AlbDto, T01U719_A7993AlbMqTj, T01U719_A7992AlbDf3, T01U719_A7991AlbDf2, T01U719_A7990AlbDf1,
            T01U719_A7989AlbCald, T01U719_A7104AlbEncA, T01U719_A7103AlbEncL, T01U719_A6467BarAlbPlas, T01U719_A2761AlbBarRec, T01U719_A5253BarAcc, T01U719_A5354AlbImpMan, T01U719_A148BarEstReo, T01U719_A143BarDisNum, T01U719_A1909BarGraAca,
            T01U719_A4812BarEncCli, T01U719_A2441AlbHdrObs, T01U719_A1652BarSerDsc, T01U719_A218BarTipCol, T01U719_A136BarColNum, T01U719_A135BarColNom, T01U719_A3154CodDsc, T01U719_n3154CodDsc, T01U719_A1503BarPart, T01U719_A1458BarAlbBul,
            T01U719_A2839AlbProVal, T01U719_A365DisDes, T01U719_A161BarFecSal, T01U719_A1208TubPre, T01U719_n1208TubPre, T01U719_A125BarAncAca1, T01U719_A213BarSit, T01U719_A212BarSer, T01U719_A1248GuiFasULin, T01U719_A2763AlbHdrUlin,
            T01U719_A4466BarAcaAnh, T01U719_A12905AlbCadEnc, T01U719_A2396BarAlbObs, T01U719_A14057AlbTiras, T01U719_A14058AlbTirasKg, T01U719_A14059AlbSinTest, T01U719_A3915EmpNumDec, T01U719_n3915EmpNumDec, T01U719_A396EmprCod, T01U719_A129BarCod,
            T01U719_A132BarCodReo, T01U719_A130BarCodPar, T01U719_A1206TubCod, T01U719_n1206TubCod, T01U719_A30AlbProCod, T01U719_A3153CodCod, T01U719_n3153CodCod, T01U719_A1243GuiRemCli, T01U719_A252CliCod, T01U719_n252CliCod,
            T01U719_A217BarTipArt, T01U719_n217BarTipArt, T01U719_A1279BarKla, T01U719_A1280BarMla, T01U719_A1292BarPlz, T01U719_A898BarPieNDes, T01U719_A199BarPie1
            }
            , new Object[] {
            T01U721_A13890BarHDSusp, T01U721_n13890BarHDSusp
            }
            , new Object[] {
            T01U722_A361DisCod, T01U722_A1235BarNumCli, T01U722_A1234BarNomCli, T01U722_A5034BarEstTip, T01U722_A5291BarTipCor, T01U722_A5027BarGraCob, T01U722_A2010BarTipDis, T01U722_A4937BarCtrPdas, T01U722_n4937BarCtrPdas, T01U722_A5253BarAcc,
            T01U722_A148BarEstReo, T01U722_A143BarDisNum, T01U722_A1909BarGraAca, T01U722_A4812BarEncCli, T01U722_A1652BarSerDsc, T01U722_A218BarTipCol, T01U722_A136BarColNum, T01U722_A135BarColNom, T01U722_A1503BarPart, T01U722_A161BarFecSal,
            T01U722_A125BarAncAca1, T01U722_A213BarSit, T01U722_A212BarSer, T01U722_A4466BarAcaAnh, T01U722_A252CliCod, T01U722_n252CliCod, T01U722_A217BarTipArt, T01U722_n217BarTipArt
            }
            , new Object[] {
            T01U723_A1208TubPre, T01U723_n1208TubPre
            }
            , new Object[] {
            T01U724_A1253EmprGuiRem, T01U724_A5805AlbEnvFtp, T01U724_A7101AlbLic, T01U724_A34AlbProfch, T01U724_A2242AlbSec, T01U724_A1243GuiRemCli
            }
            , new Object[] {
            T01U725_A1244GuiRemCln
            }
            , new Object[] {
            T01U726_A3154CodDsc, T01U726_n3154CodDsc
            }
            , new Object[] {
            T01U727_A365DisDes
            }
            , new Object[] {
            T01U729_A1279BarKla, T01U729_A1280BarMla, T01U729_A1292BarPlz
            }
            , new Object[] {
            T01U731_A898BarPieNDes, T01U731_A199BarPie1
            }
            , new Object[] {
            T01U732_A396EmprCod, T01U732_A30AlbProCod, T01U732_A129BarCod, T01U732_A132BarCodReo, T01U732_A130BarCodPar
            }
            , new Object[] {
            T01U733_A396EmprCod, T01U733_A129BarCod, T01U733_A132BarCodReo, T01U733_A130BarCodPar, T01U733_A30AlbProCod
            }
            , new Object[] {
            T01U734_A396EmprCod, T01U734_A129BarCod, T01U734_A132BarCodReo, T01U734_A130BarCodPar, T01U734_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01U739_A13890BarHDSusp, T01U739_n13890BarHDSusp
            }
            , new Object[] {
            T01U740_A361DisCod, T01U740_A1235BarNumCli, T01U740_A1234BarNomCli, T01U740_A5034BarEstTip, T01U740_A5291BarTipCor, T01U740_A5027BarGraCob, T01U740_A2010BarTipDis, T01U740_A4937BarCtrPdas, T01U740_n4937BarCtrPdas, T01U740_A5253BarAcc,
            T01U740_A148BarEstReo, T01U740_A143BarDisNum, T01U740_A1909BarGraAca, T01U740_A4812BarEncCli, T01U740_A1652BarSerDsc, T01U740_A218BarTipCol, T01U740_A136BarColNum, T01U740_A135BarColNom, T01U740_A1503BarPart, T01U740_A161BarFecSal,
            T01U740_A125BarAncAca1, T01U740_A213BarSit, T01U740_A212BarSer, T01U740_A4466BarAcaAnh, T01U740_A252CliCod, T01U740_n252CliCod, T01U740_A217BarTipArt, T01U740_n217BarTipArt
            }
            , new Object[] {
            T01U741_A1208TubPre, T01U741_n1208TubPre
            }
            , new Object[] {
            T01U742_A1253EmprGuiRem, T01U742_A5805AlbEnvFtp, T01U742_A7101AlbLic, T01U742_A34AlbProfch, T01U742_A2242AlbSec, T01U742_A1243GuiRemCli
            }
            , new Object[] {
            T01U743_A1244GuiRemCln
            }
            , new Object[] {
            T01U744_A3154CodDsc, T01U744_n3154CodDsc
            }
            , new Object[] {
            T01U745_A365DisDes
            }
            , new Object[] {
            T01U747_A1279BarKla, T01U747_A1280BarMla, T01U747_A1292BarPlz
            }
            , new Object[] {
            T01U749_A898BarPieNDes, T01U749_A199BarPie1
            }
            , new Object[] {
            T01U750_A396EmprCod, T01U750_A30AlbProCod, T01U750_A129BarCod, T01U750_A132BarCodReo, T01U750_A130BarCodPar, T01U750_A6648AlbMetLin
            }
            , new Object[] {
            T01U751_A396EmprCod, T01U751_A30AlbProCod, T01U751_A129BarCod, T01U751_A132BarCodReo, T01U751_A130BarCodPar, T01U751_A9639Et_Numero
            }
            , new Object[] {
            T01U752_A396EmprCod, T01U752_A30AlbProCod, T01U752_A129BarCod, T01U752_A132BarCodReo, T01U752_A130BarCodPar, T01U752_A6622AlbHdRLn
            }
            , new Object[] {
            T01U753_A396EmprCod, T01U753_A30AlbProCod, T01U753_A129BarCod, T01U753_A132BarCodReo, T01U753_A130BarCodPar, T01U753_A5456P_ForLin
            }
            , new Object[] {
            T01U754_A396EmprCod, T01U754_A30AlbProCod, T01U754_A129BarCod, T01U754_A132BarCodReo, T01U754_A130BarCodPar, T01U754_A2524DisComLin, T01U754_A1056DisComCod, T01U754_A1032FonCod
            }
            , new Object[] {
            T01U755_A396EmprCod, T01U755_A3617AlbTrnCod, T01U755_A30AlbProCod, T01U755_A129BarCod, T01U755_A132BarCodReo, T01U755_A130BarCodPar
            }
            , new Object[] {
            T01U756_A396EmprCod, T01U756_A30AlbProCod, T01U756_A129BarCod, T01U756_A132BarCodReo, T01U756_A130BarCodPar, T01U756_A3621AlbPckLin
            }
            , new Object[] {
            T01U757_A396EmprCod, T01U757_A30AlbProCod, T01U757_A129BarCod, T01U757_A132BarCodReo, T01U757_A130BarCodPar, T01U757_A2764AlbHdrLin
            }
            , new Object[] {
            T01U758_A396EmprCod, T01U758_A30AlbProCod, T01U758_A129BarCod, T01U758_A132BarCodReo, T01U758_A130BarCodPar, T01U758_A1468AlbPrdLin
            }
            , new Object[] {
            T01U759_A396EmprCod, T01U759_A30AlbProCod, T01U759_A129BarCod, T01U759_A132BarCodReo, T01U759_A130BarCodPar, T01U759_A200BarPieCod
            }
            , new Object[] {
            T01U760_A396EmprCod, T01U760_A30AlbProCod, T01U760_A129BarCod, T01U760_A132BarCodReo, T01U760_A130BarCodPar, T01U760_A1240GuiFasLin
            }
            , new Object[] {
            T01U761_A396EmprCod, T01U761_A30AlbProCod, T01U761_A129BarCod, T01U761_A132BarCodReo, T01U761_A130BarCodPar
            }
         }
      );
      AV62Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_3" ;
      Z14059AlbSinTest = httpContext.getMessage( "N", "") ;
      A14059AlbSinTest = httpContext.getMessage( "N", "") ;
      i14059AlbSinTest = httpContext.getMessage( "N", "") ;
      Z14057AlbTiras = httpContext.getMessage( "N", "") ;
      A14057AlbTiras = httpContext.getMessage( "N", "") ;
      i14057AlbTiras = httpContext.getMessage( "N", "") ;
      Z2839AlbProVal = httpContext.getMessage( "S", "") ;
      i2839AlbProVal = httpContext.getMessage( "S", "") ;
      A2839AlbProVal = httpContext.getMessage( "S", "") ;
      WebComp_Wcdocumentodetransporteproduccion_7 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV10BarCodReo ;
   private byte wcpOAV28AlbEnvFtp ;
   private byte Z132BarCodReo ;
   private byte Z3394AlbTipCol ;
   private byte Z32AlbProEsp ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV31Moda21 ;
   private byte AV10BarCodReo ;
   private byte AV28AlbEnvFtp ;
   private byte nKeyPressed ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A3394AlbTipCol ;
   private byte A32AlbProEsp ;
   private byte A3915EmpNumDec ;
   private byte Gx_BScreen ;
   private byte A148BarEstReo ;
   private byte A13890BarHDSusp ;
   private byte A5027BarGraCob ;
   private byte A4937BarCtrPdas ;
   private byte A5805AlbEnvFtp ;
   private byte GXt_int6 ;
   private byte AV56IN_Barsit ;
   private byte AV52barsit ;
   private byte Z3915EmpNumDec ;
   private byte Z5805AlbEnvFtp ;
   private byte Z5027BarGraCob ;
   private byte Z4937BarCtrPdas ;
   private byte Z148BarEstReo ;
   private byte Z218BarTipCol ;
   private byte Z213BarSit ;
   private byte gxajaxcallmode ;
   private byte edtBarCodPar_Backstyle ;
   private byte edtBarCodReo_Backstyle ;
   private byte edtBarCod_Backstyle ;
   private byte GXv_int24[] ;
   private byte GXv_int22[] ;
   private byte GXv_int7[] ;
   private byte Z13890BarHDSusp ;
   private short Z6466PlasCod ;
   private short Z3271AlbHdrAnc ;
   private short Z12234AlbTipArt ;
   private short Z5019AlbHdrgm2 ;
   private short Z6645AlbMetULi ;
   private short Z6467BarAlbPlas ;
   private short Z1458BarAlbBul ;
   private short Z1248GuiFasULin ;
   private short Z2763AlbHdrUlin ;
   private short Z12905AlbCadEnc ;
   private short Z1206TubCod ;
   private short N6466PlasCod ;
   private short N1206TubCod ;
   private short AV30FlagFas ;
   private short A1206TubCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short AV49ComboTubCod ;
   private short AV51ComboPlasCod ;
   private short A12234AlbTipArt ;
   private short A6645AlbMetULi ;
   private short A1458BarAlbBul ;
   private short A1248GuiFasULin ;
   private short A2763AlbHdrUlin ;
   private short A12905AlbCadEnc ;
   private short A199BarPie1 ;
   private short AV15Insert_PlasCod ;
   private short AV18Insert_TubCod ;
   private short AV39Plasticos ;
   private short AV43errkgs ;
   private short A1909BarGraAca ;
   private short A1503BarPart ;
   private short A125BarAncAca1 ;
   private short A4466BarAcaAnh ;
   private short A217BarTipArt ;
   private short A1292BarPlz ;
   private short RcdFound195 ;
   private short nCmpId ;
   private short AV60Nofases ;
   private short AV40Tubos ;
   private short Z1909BarGraAca ;
   private short Z1503BarPart ;
   private short Z125BarAncAca1 ;
   private short Z4466BarAcaAnh ;
   private short Z217BarTipArt ;
   private short Z1292BarPlz ;
   private short Z199BarPie1 ;
   private short nIsDirty_195 ;
   private short GXv_int20[] ;
   private short GXv_int19[] ;
   private short GXv_int16[] ;
   private int wcpOAV9BarCod ;
   private int wcpOAV23Guiremcli ;
   private int Z129BarCod ;
   private int Z1266BarAlbTub ;
   private int Z1265BarAlbPie ;
   private int Z3393AlbColNum ;
   private int Z3886AlbCliCod ;
   private int Z12233AlbNumcli ;
   private int Z12195BarAlbUnd ;
   private int O1265BarAlbPie ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int AV38PieAnt ;
   private int A1243GuiRemCli ;
   private int A361DisCod ;
   private int AV9BarCod ;
   private int AV23Guiremcli ;
   private int trnEnded ;
   private int edtAlbProCod_Enabled ;
   private int edtavGuiremcli_Enabled ;
   private int edtavAlbpropri_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtnverpiezas_Visible ;
   private int bttBtnimprimirhdr_Visible ;
   private int bttBtnpackinglist_Visible ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtBarCod_Forecolor ;
   private int edtBarCod_Backcolor ;
   private int edtBarCod_Enabled ;
   private int imgavPrompt_Visible ;
   private int imgavPrompt_Enabled ;
   private int edtBarCodReo_Forecolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Forecolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodPar_Enabled ;
   private int edtBarAlbKgmE_Enabled ;
   private int edtAlbHdrAnc_Enabled ;
   private int edtAlbHdrgm2_Enabled ;
   private int edtBarAlbMtrE_Enabled ;
   private int edtBarAlbPie_Enabled ;
   private int edtTubCod_Visible ;
   private int edtTubCod_Enabled ;
   private int A1266BarAlbTub ;
   private int edtBarAlbTub_Enabled ;
   private int edtPlasCod_Visible ;
   private int edtPlasCod_Enabled ;
   private int edtBarAlbPlas_Visible ;
   private int edtBarAlbPlas_Enabled ;
   private int edtAlbHdrObs_Enabled ;
   private int edtPedidoClie_Enabled ;
   private int edtAlbSer_Enabled ;
   private int edtAlbSerD_Enabled ;
   private int edtAlbColNom_Enabled ;
   private int A3393AlbColNum ;
   private int edtAlbColNum_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtAlbNomCli_Enabled ;
   private int edtBarSit_Enabled ;
   private int WebComp_Wcdocumentodetransporteproduccion_7_Visible ;
   private int edtavMode_Enabled ;
   private int edtKgsHdr_Enabled ;
   private int edtKgsEntrega_Enabled ;
   private int edtMtsEntrega_Enabled ;
   private int A14356PzsEntrega ;
   private int edtPzsEntrega_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombotubcod_Enabled ;
   private int edtavCombotubcod_Visible ;
   private int edtavComboplascod_Enabled ;
   private int edtavComboplascod_Visible ;
   private int A3886AlbCliCod ;
   private int A12233AlbNumcli ;
   private int A12195BarAlbUnd ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int A252CliCod ;
   private int A1235BarNumCli ;
   private int A136BarColNum ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Combo_tubcod_Datalistupdateminimumcharacters ;
   private int Combo_tubcod_Gxcontroltype ;
   private int Combo_plascod_Datalistupdateminimumcharacters ;
   private int Combo_plascod_Gxcontroltype ;
   private int Dvpanel_unnamedtable1_Gxcontroltype ;
   private int Dvpanel_unnamedtable2_Gxcontroltype ;
   private int Dvpanel_unnamedtable4_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int AV63GXV1 ;
   private int AV57Pzs ;
   private int GX_JID ;
   private int Z1243GuiRemCli ;
   private int Z361DisCod ;
   private int Z1235BarNumCli ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int Z898BarPieNDes ;
   private int idxLst ;
   private int GXt_int14 ;
   private int GXv_int18[] ;
   private int GXv_int17[] ;
   private int GXv_int8[] ;
   private int Z198BarPie ;
   private int Z14356PzsEntrega ;
   private int ZV38PieAnt ;
   private long wcpOAV8AlbProCod ;
   private long Z30AlbProCod ;
   private long AV8AlbProCod ;
   private long A30AlbProCod ;
   private long GXv_int25[] ;
   private java.math.BigDecimal Z1261BarAlbKgmE ;
   private java.math.BigDecimal Z1263BarAlbMtrE ;
   private java.math.BigDecimal Z1262BarPreKgm ;
   private java.math.BigDecimal Z1264BarPreMtr ;
   private java.math.BigDecimal Z40AlbProRec ;
   private java.math.BigDecimal Z12196BarPreUnd ;
   private java.math.BigDecimal Z1461BarAlbPN ;
   private java.math.BigDecimal Z7994AlbDto ;
   private java.math.BigDecimal Z7104AlbEncA ;
   private java.math.BigDecimal Z7103AlbEncL ;
   private java.math.BigDecimal Z2761AlbBarRec ;
   private java.math.BigDecimal Z5354AlbImpMan ;
   private java.math.BigDecimal Z14058AlbTirasKg ;
   private java.math.BigDecimal O1263BarAlbMtrE ;
   private java.math.BigDecimal O1261BarAlbKgmE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV37MetAnt ;
   private java.math.BigDecimal AV36KilAnt ;
   private java.math.BigDecimal A14353KgsHdr ;
   private java.math.BigDecimal A14354KgsEntrega ;
   private java.math.BigDecimal A14355MtsEntrega ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A12196BarPreUnd ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal A7994AlbDto ;
   private java.math.BigDecimal A7104AlbEncA ;
   private java.math.BigDecimal A7103AlbEncL ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A14058AlbTirasKg ;
   private java.math.BigDecimal A1208TubPre ;
   private java.math.BigDecimal A1281TubImp ;
   private java.math.BigDecimal A1279BarKla ;
   private java.math.BigDecimal A1280BarMla ;
   private java.math.BigDecimal AV58Kgs ;
   private java.math.BigDecimal AV59Mts ;
   private java.math.BigDecimal AV41BarAlbMtrE ;
   private java.math.BigDecimal Z1279BarKla ;
   private java.math.BigDecimal Z1280BarMla ;
   private java.math.BigDecimal Z1208TubPre ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXt_decimal15 ;
   private java.math.BigDecimal GXv_decimal27[] ;
   private java.math.BigDecimal Z14355MtsEntrega ;
   private java.math.BigDecimal Z14354KgsEntrega ;
   private java.math.BigDecimal Z14353KgsHdr ;
   private java.math.BigDecimal ZV36KilAnt ;
   private java.math.BigDecimal ZV37MetAnt ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV11BarCodPar ;
   private String wcpOAV24GuiRemCln ;
   private String wcpOAV26AlbSec ;
   private String wcpOAV27AlbProPri ;
   private String wcpOAV29AlbLic ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z3392AlbColNom ;
   private String Z3391AlbSer ;
   private String Z8879AlbSerD ;
   private String Z12232AlbNomCli ;
   private String Z4815AlbEncCli ;
   private String Z2398BarFasExt ;
   private String Z1095AlbTipEnt ;
   private String Z7993AlbMqTj ;
   private String Z7992AlbDf3 ;
   private String Z7991AlbDf2 ;
   private String Z7990AlbDf1 ;
   private String Z7989AlbCald ;
   private String Z2441AlbHdrObs ;
   private String Z2839AlbProVal ;
   private String Z2396BarAlbObs ;
   private String Z14057AlbTiras ;
   private String Z14059AlbSinTest ;
   private String Z3153CodCod ;
   private String N3153CodCod ;
   private String Combo_plascod_Selectedvalue_get ;
   private String Combo_tubcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7EmprCod ;
   private String A130BarCodPar ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A2839AlbProVal ;
   private String AV22UsurCod ;
   private String AV20Station ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A1253EmprGuiRem ;
   private String A3153CodCod ;
   private String AV11BarCodPar ;
   private String AV24GuiRemCln ;
   private String AV26AlbSec ;
   private String AV27AlbProPri ;
   private String AV29AlbLic ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbProCod_Internalname ;
   private String AV35CliFacMtsP ;
   private String A5291BarTipCor ;
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
   private String divUnnamedtable9_Internalname ;
   private String TempTags ;
   private String edtAlbProCod_Jsonclick ;
   private String edtavGuiremcli_Internalname ;
   private String edtavGuiremcli_Jsonclick ;
   private String edtavAlbpropri_Internalname ;
   private String edtavAlbpropri_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtnverpiezas_Internalname ;
   private String bttBtnverpiezas_Jsonclick ;
   private String bttBtnimprimirhdr_Internalname ;
   private String bttBtnimprimirhdr_Jsonclick ;
   private String bttBtnpackinglist_Internalname ;
   private String bttBtnpackinglist_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String imgavPrompt_Internalname ;
   private String imgavPrompt_gximage ;
   private String sImgUrl ;
   private String imgavPrompt_Link ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtAlbHdrAnc_Internalname ;
   private String edtAlbHdrAnc_Jsonclick ;
   private String edtAlbHdrgm2_Internalname ;
   private String edtAlbHdrgm2_Jsonclick ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtBarAlbPie_Internalname ;
   private String edtBarAlbPie_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String divTablesplittedtubcod_Internalname ;
   private String lblTextblocktubcod_Internalname ;
   private String lblTextblocktubcod_Jsonclick ;
   private String Combo_tubcod_Caption ;
   private String Combo_tubcod_Cls ;
   private String Combo_tubcod_Emptyitemtext ;
   private String Combo_tubcod_Internalname ;
   private String edtTubCod_Internalname ;
   private String edtTubCod_Jsonclick ;
   private String edtBarAlbTub_Internalname ;
   private String edtBarAlbTub_Jsonclick ;
   private String divCombo_plascod_cell_Internalname ;
   private String divCombo_plascod_cell_Class ;
   private String divTablesplittedplascod_Internalname ;
   private String lblTextblockplascod_Internalname ;
   private String lblTextblockplascod_Jsonclick ;
   private String Combo_plascod_Caption ;
   private String Combo_plascod_Cls ;
   private String Combo_plascod_Emptyitemtext ;
   private String Combo_plascod_Internalname ;
   private String edtPlasCod_Internalname ;
   private String edtPlasCod_Jsonclick ;
   private String divBaralbplas_cell_Internalname ;
   private String divBaralbplas_cell_Class ;
   private String edtBarAlbPlas_Internalname ;
   private String edtBarAlbPlas_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtAlbHdrObs_Internalname ;
   private String A2441AlbHdrObs ;
   private String edtAlbHdrObs_Jsonclick ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtPedidoClie_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Jsonclick ;
   private String edtAlbSer_Internalname ;
   private String A3391AlbSer ;
   private String edtAlbSer_Jsonclick ;
   private String edtAlbSerD_Internalname ;
   private String A8879AlbSerD ;
   private String edtAlbSerD_Jsonclick ;
   private String edtAlbColNom_Internalname ;
   private String A3392AlbColNom ;
   private String edtAlbColNom_Jsonclick ;
   private String edtAlbColNum_Internalname ;
   private String edtAlbColNum_Jsonclick ;
   private String edtBarTipCol_Internalname ;
   private String edtBarTipCol_Jsonclick ;
   private String edtAlbNomCli_Internalname ;
   private String A12232AlbNomCli ;
   private String edtAlbNomCli_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String WebComp_Wcdocumentodetransporteproduccion_7_Component ;
   private String OldWcdocumentodetransporteproduccion_7 ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavMode_Internalname ;
   private String edtavMode_Jsonclick ;
   private String edtKgsHdr_Internalname ;
   private String edtKgsHdr_Jsonclick ;
   private String edtKgsEntrega_Internalname ;
   private String edtKgsEntrega_Jsonclick ;
   private String edtMtsEntrega_Internalname ;
   private String edtMtsEntrega_Jsonclick ;
   private String edtPzsEntrega_Internalname ;
   private String edtPzsEntrega_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV62Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_tubcod_Internalname ;
   private String edtavCombotubcod_Internalname ;
   private String edtavCombotubcod_Jsonclick ;
   private String divSectionattribute_plascod_Internalname ;
   private String edtavComboplascod_Internalname ;
   private String edtavComboplascod_Jsonclick ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_trn_delete_Internalname ;
   private String Dvelop_confirmpanel_trn_delete_Title ;
   private String Dvelop_confirmpanel_trn_delete_Confirmationtext ;
   private String Dvelop_confirmpanel_trn_delete_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_trn_delete_Nobuttoncaption ;
   private String Dvelop_confirmpanel_trn_delete_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_trn_delete_Yesbuttonposition ;
   private String Dvelop_confirmpanel_trn_delete_Confirmtype ;
   private String Dvelop_confirmpanel_trn_delete_Internalname ;
   private String A4815AlbEncCli ;
   private String A2398BarFasExt ;
   private String A1095AlbTipEnt ;
   private String A7993AlbMqTj ;
   private String A7992AlbDf3 ;
   private String A7991AlbDf2 ;
   private String A7990AlbDf1 ;
   private String A7989AlbCald ;
   private String A2396BarAlbObs ;
   private String A14057AlbTiras ;
   private String A14059AlbSinTest ;
   private String AV55ImpCod ;
   private String A14056AlbColorCv ;
   private String A365DisDes ;
   private String AV17Insert_CodCod ;
   private String A407EmprNom ;
   private String A1234BarNomCli ;
   private String A5034BarEstTip ;
   private String A2010BarTipDis ;
   private String A5253BarAcc ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A7101AlbLic ;
   private String A2242AlbSec ;
   private String A3154CodDsc ;
   private String A1244GuiRemCln ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_tubcod_Objectcall ;
   private String Combo_tubcod_Class ;
   private String Combo_tubcod_Icontype ;
   private String Combo_tubcod_Icon ;
   private String Combo_tubcod_Tooltip ;
   private String Combo_tubcod_Selectedvalue_set ;
   private String Combo_tubcod_Selectedtext_set ;
   private String Combo_tubcod_Selectedtext_get ;
   private String Combo_tubcod_Gamoauthtoken ;
   private String Combo_tubcod_Ddointernalname ;
   private String Combo_tubcod_Titlecontrolalign ;
   private String Combo_tubcod_Dropdownoptionstype ;
   private String Combo_tubcod_Titlecontrolidtoreplace ;
   private String Combo_tubcod_Datalisttype ;
   private String Combo_tubcod_Datalistfixedvalues ;
   private String Combo_tubcod_Datalistproc ;
   private String Combo_tubcod_Datalistprocparametersprefix ;
   private String Combo_tubcod_Remoteservicesparameters ;
   private String Combo_tubcod_Htmltemplate ;
   private String Combo_tubcod_Multiplevaluestype ;
   private String Combo_tubcod_Loadingdata ;
   private String Combo_tubcod_Noresultsfound ;
   private String Combo_tubcod_Onlyselectedvalues ;
   private String Combo_tubcod_Selectalltext ;
   private String Combo_tubcod_Multiplevaluesseparator ;
   private String Combo_tubcod_Addnewoptiontext ;
   private String Combo_plascod_Objectcall ;
   private String Combo_plascod_Class ;
   private String Combo_plascod_Icontype ;
   private String Combo_plascod_Icon ;
   private String Combo_plascod_Tooltip ;
   private String Combo_plascod_Selectedvalue_set ;
   private String Combo_plascod_Selectedtext_set ;
   private String Combo_plascod_Selectedtext_get ;
   private String Combo_plascod_Gamoauthtoken ;
   private String Combo_plascod_Ddointernalname ;
   private String Combo_plascod_Titlecontrolalign ;
   private String Combo_plascod_Dropdownoptionstype ;
   private String Combo_plascod_Titlecontrolidtoreplace ;
   private String Combo_plascod_Datalisttype ;
   private String Combo_plascod_Datalistfixedvalues ;
   private String Combo_plascod_Datalistproc ;
   private String Combo_plascod_Datalistprocparametersprefix ;
   private String Combo_plascod_Remoteservicesparameters ;
   private String Combo_plascod_Htmltemplate ;
   private String Combo_plascod_Multiplevaluestype ;
   private String Combo_plascod_Loadingdata ;
   private String Combo_plascod_Noresultsfound ;
   private String Combo_plascod_Onlyselectedvalues ;
   private String Combo_plascod_Selectalltext ;
   private String Combo_plascod_Multiplevaluesseparator ;
   private String Combo_plascod_Addnewoptiontext ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String Dvpanel_unnamedtable4_Objectcall ;
   private String Dvpanel_unnamedtable4_Class ;
   private String Dvpanel_unnamedtable4_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Dvelop_confirmpanel_trn_delete_Objectcall ;
   private String Dvelop_confirmpanel_trn_delete_Width ;
   private String Dvelop_confirmpanel_trn_delete_Height ;
   private String Dvelop_confirmpanel_trn_delete_Class ;
   private String Dvelop_confirmpanel_trn_delete_Comment ;
   private String Dvelop_confirmpanel_trn_delete_Bodytype ;
   private String Dvelop_confirmpanel_trn_delete_Bodycontentinternalname ;
   private String Dvelop_confirmpanel_trn_delete_Result ;
   private String Dvelop_confirmpanel_trn_delete_Texttype ;
   private String hsh ;
   private String sMode195 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV21EmprNom ;
   private String AV53MetPieCtr ;
   private String Gx_msg ;
   private String Z407EmprNom ;
   private String Z3154CodDsc ;
   private String Z1253EmprGuiRem ;
   private String Z7101AlbLic ;
   private String Z2242AlbSec ;
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
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i2839AlbProVal ;
   private String i14057AlbTiras ;
   private String i14059AlbSinTest ;
   private String GXt_char1 ;
   private String GXv_char23[] ;
   private String GXv_char21[] ;
   private String GXv_char13[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z13878PedidoClie ;
   private String Z14056AlbColorCv ;
   private java.util.Date wcpOAV25AlbProFch ;
   private java.util.Date AV25AlbProFch ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Z34AlbProfch ;
   private java.util.Date Z161BarFecSal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1206TubCod ;
   private boolean n3153CodCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean AV42Prompt_IsBlob ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean n1208TubPre ;
   private boolean n3915EmpNumDec ;
   private boolean n252CliCod ;
   private boolean n13890BarHDSusp ;
   private boolean n407EmprNom ;
   private boolean n4937BarCtrPdas ;
   private boolean n217BarTipArt ;
   private boolean n3154CodDsc ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_tubcod_Enabled ;
   private boolean Combo_tubcod_Visible ;
   private boolean Combo_tubcod_Allowmultipleselection ;
   private boolean Combo_tubcod_Isgriditem ;
   private boolean Combo_tubcod_Hasdescription ;
   private boolean Combo_tubcod_Includeonlyselectedoption ;
   private boolean Combo_tubcod_Includeselectalloption ;
   private boolean Combo_tubcod_Emptyitem ;
   private boolean Combo_tubcod_Includeaddnewoption ;
   private boolean Combo_plascod_Enabled ;
   private boolean Combo_plascod_Visible ;
   private boolean Combo_plascod_Allowmultipleselection ;
   private boolean Combo_plascod_Isgriditem ;
   private boolean Combo_plascod_Hasdescription ;
   private boolean Combo_plascod_Includeonlyselectedoption ;
   private boolean Combo_plascod_Includeselectalloption ;
   private boolean Combo_plascod_Emptyitem ;
   private boolean Combo_plascod_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean Dvpanel_unnamedtable4_Enabled ;
   private boolean Dvpanel_unnamedtable4_Showheader ;
   private boolean Dvpanel_unnamedtable4_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Dvelop_confirmpanel_trn_delete_Enabled ;
   private boolean Dvelop_confirmpanel_trn_delete_Visible ;
   private boolean n6466PlasCod ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcdocumentodetransporteproduccion_7 ;
   private boolean Gx_longc ;
   private String AV64Prompt_GXI ;
   private String AV54Mensaje ;
   private String AV48ComboSelectedValue ;
   private String ZV54Mensaje ;
   private String AV42Prompt ;
   private GXWebComponent WebComp_Wcdocumentodetransporteproduccion_7 ;
   private com.genexus.webpanels.WebSession AV14WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_tubcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_plascod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_trn_delete ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavClifacmtsp ;
   private HTMLChoice cmbAlbProVal ;
   private ICheckbox chkBarTipCor ;
   private IDataStoreProvider pr_default ;
   private String[] T01U76_A407EmprNom ;
   private boolean[] T01U76_n407EmprNom ;
   private byte[] T01U76_A3915EmpNumDec ;
   private boolean[] T01U76_n3915EmpNumDec ;
   private String[] T01U79_A1253EmprGuiRem ;
   private byte[] T01U79_A5805AlbEnvFtp ;
   private String[] T01U79_A7101AlbLic ;
   private java.util.Date[] T01U79_A34AlbProfch ;
   private String[] T01U79_A2242AlbSec ;
   private int[] T01U79_A1243GuiRemCli ;
   private String[] T01U711_A1244GuiRemCln ;
   private byte[] T01U75_A13890BarHDSusp ;
   private boolean[] T01U75_n13890BarHDSusp ;
   private int[] T01U77_A361DisCod ;
   private int[] T01U77_A1235BarNumCli ;
   private String[] T01U77_A1234BarNomCli ;
   private String[] T01U77_A5034BarEstTip ;
   private String[] T01U77_A5291BarTipCor ;
   private byte[] T01U77_A5027BarGraCob ;
   private String[] T01U77_A2010BarTipDis ;
   private byte[] T01U77_A4937BarCtrPdas ;
   private boolean[] T01U77_n4937BarCtrPdas ;
   private String[] T01U77_A5253BarAcc ;
   private byte[] T01U77_A148BarEstReo ;
   private String[] T01U77_A143BarDisNum ;
   private short[] T01U77_A1909BarGraAca ;
   private String[] T01U77_A4812BarEncCli ;
   private String[] T01U77_A1652BarSerDsc ;
   private byte[] T01U77_A218BarTipCol ;
   private int[] T01U77_A136BarColNum ;
   private String[] T01U77_A135BarColNom ;
   private short[] T01U77_A1503BarPart ;
   private java.util.Date[] T01U77_A161BarFecSal ;
   private short[] T01U77_A125BarAncAca1 ;
   private byte[] T01U77_A213BarSit ;
   private String[] T01U77_A212BarSer ;
   private short[] T01U77_A4466BarAcaAnh ;
   private int[] T01U77_A252CliCod ;
   private boolean[] T01U77_n252CliCod ;
   private short[] T01U77_A217BarTipArt ;
   private boolean[] T01U77_n217BarTipArt ;
   private String[] T01U712_A365DisDes ;
   private java.math.BigDecimal[] T01U714_A1279BarKla ;
   private java.math.BigDecimal[] T01U714_A1280BarMla ;
   private short[] T01U714_A1292BarPlz ;
   private int[] T01U716_A898BarPieNDes ;
   private short[] T01U716_A199BarPie1 ;
   private String[] T01U710_A3154CodDsc ;
   private boolean[] T01U710_n3154CodDsc ;
   private java.math.BigDecimal[] T01U78_A1208TubPre ;
   private boolean[] T01U78_n1208TubPre ;
   private String[] T01U719_A1253EmprGuiRem ;
   private int[] T01U719_A361DisCod ;
   private short[] T01U719_A6466PlasCod ;
   private boolean[] T01U719_n6466PlasCod ;
   private int[] T01U719_A1266BarAlbTub ;
   private java.math.BigDecimal[] T01U719_A1261BarAlbKgmE ;
   private int[] T01U719_A1265BarAlbPie ;
   private java.math.BigDecimal[] T01U719_A1263BarAlbMtrE ;
   private short[] T01U719_A3271AlbHdrAnc ;
   private String[] T01U719_A3392AlbColNom ;
   private int[] T01U719_A3393AlbColNum ;
   private byte[] T01U719_A3394AlbTipCol ;
   private String[] T01U719_A3391AlbSer ;
   private String[] T01U719_A8879AlbSerD ;
   private int[] T01U719_A3886AlbCliCod ;
   private String[] T01U719_A12232AlbNomCli ;
   private int[] T01U719_A12233AlbNumcli ;
   private short[] T01U719_A12234AlbTipArt ;
   private short[] T01U719_A5019AlbHdrgm2 ;
   private String[] T01U719_A4815AlbEncCli ;
   private java.math.BigDecimal[] T01U719_A1262BarPreKgm ;
   private java.math.BigDecimal[] T01U719_A1264BarPreMtr ;
   private byte[] T01U719_A32AlbProEsp ;
   private java.math.BigDecimal[] T01U719_A40AlbProRec ;
   private String[] T01U719_A2398BarFasExt ;
   private String[] T01U719_A407EmprNom ;
   private boolean[] T01U719_n407EmprNom ;
   private byte[] T01U719_A5805AlbEnvFtp ;
   private String[] T01U719_A7101AlbLic ;
   private String[] T01U719_A1244GuiRemCln ;
   private java.util.Date[] T01U719_A34AlbProfch ;
   private String[] T01U719_A2242AlbSec ;
   private int[] T01U719_A1235BarNumCli ;
   private String[] T01U719_A1234BarNomCli ;
   private int[] T01U719_A12195BarAlbUnd ;
   private java.math.BigDecimal[] T01U719_A12196BarPreUnd ;
   private String[] T01U719_A5034BarEstTip ;
   private short[] T01U719_A6645AlbMetULi ;
   private String[] T01U719_A5291BarTipCor ;
   private byte[] T01U719_A5027BarGraCob ;
   private String[] T01U719_A2010BarTipDis ;
   private java.math.BigDecimal[] T01U719_A1461BarAlbPN ;
   private byte[] T01U719_A4937BarCtrPdas ;
   private boolean[] T01U719_n4937BarCtrPdas ;
   private String[] T01U719_A1095AlbTipEnt ;
   private java.math.BigDecimal[] T01U719_A7994AlbDto ;
   private String[] T01U719_A7993AlbMqTj ;
   private String[] T01U719_A7992AlbDf3 ;
   private String[] T01U719_A7991AlbDf2 ;
   private String[] T01U719_A7990AlbDf1 ;
   private String[] T01U719_A7989AlbCald ;
   private java.math.BigDecimal[] T01U719_A7104AlbEncA ;
   private java.math.BigDecimal[] T01U719_A7103AlbEncL ;
   private short[] T01U719_A6467BarAlbPlas ;
   private java.math.BigDecimal[] T01U719_A2761AlbBarRec ;
   private String[] T01U719_A5253BarAcc ;
   private java.math.BigDecimal[] T01U719_A5354AlbImpMan ;
   private byte[] T01U719_A148BarEstReo ;
   private String[] T01U719_A143BarDisNum ;
   private short[] T01U719_A1909BarGraAca ;
   private String[] T01U719_A4812BarEncCli ;
   private String[] T01U719_A2441AlbHdrObs ;
   private String[] T01U719_A1652BarSerDsc ;
   private byte[] T01U719_A218BarTipCol ;
   private int[] T01U719_A136BarColNum ;
   private String[] T01U719_A135BarColNom ;
   private String[] T01U719_A3154CodDsc ;
   private boolean[] T01U719_n3154CodDsc ;
   private short[] T01U719_A1503BarPart ;
   private short[] T01U719_A1458BarAlbBul ;
   private String[] T01U719_A2839AlbProVal ;
   private String[] T01U719_A365DisDes ;
   private java.util.Date[] T01U719_A161BarFecSal ;
   private java.math.BigDecimal[] T01U719_A1208TubPre ;
   private boolean[] T01U719_n1208TubPre ;
   private short[] T01U719_A125BarAncAca1 ;
   private byte[] T01U719_A213BarSit ;
   private String[] T01U719_A212BarSer ;
   private short[] T01U719_A1248GuiFasULin ;
   private short[] T01U719_A2763AlbHdrUlin ;
   private short[] T01U719_A4466BarAcaAnh ;
   private short[] T01U719_A12905AlbCadEnc ;
   private String[] T01U719_A2396BarAlbObs ;
   private String[] T01U719_A14057AlbTiras ;
   private java.math.BigDecimal[] T01U719_A14058AlbTirasKg ;
   private String[] T01U719_A14059AlbSinTest ;
   private byte[] T01U719_A3915EmpNumDec ;
   private boolean[] T01U719_n3915EmpNumDec ;
   private String[] T01U719_A396EmprCod ;
   private int[] T01U719_A129BarCod ;
   private byte[] T01U719_A132BarCodReo ;
   private String[] T01U719_A130BarCodPar ;
   private short[] T01U719_A1206TubCod ;
   private boolean[] T01U719_n1206TubCod ;
   private long[] T01U719_A30AlbProCod ;
   private String[] T01U719_A3153CodCod ;
   private boolean[] T01U719_n3153CodCod ;
   private int[] T01U719_A1243GuiRemCli ;
   private int[] T01U719_A252CliCod ;
   private boolean[] T01U719_n252CliCod ;
   private short[] T01U719_A217BarTipArt ;
   private boolean[] T01U719_n217BarTipArt ;
   private java.math.BigDecimal[] T01U719_A1279BarKla ;
   private java.math.BigDecimal[] T01U719_A1280BarMla ;
   private short[] T01U719_A1292BarPlz ;
   private int[] T01U719_A898BarPieNDes ;
   private short[] T01U719_A199BarPie1 ;
   private byte[] T01U721_A13890BarHDSusp ;
   private boolean[] T01U721_n13890BarHDSusp ;
   private int[] T01U722_A361DisCod ;
   private int[] T01U722_A1235BarNumCli ;
   private String[] T01U722_A1234BarNomCli ;
   private String[] T01U722_A5034BarEstTip ;
   private String[] T01U722_A5291BarTipCor ;
   private byte[] T01U722_A5027BarGraCob ;
   private String[] T01U722_A2010BarTipDis ;
   private byte[] T01U722_A4937BarCtrPdas ;
   private boolean[] T01U722_n4937BarCtrPdas ;
   private String[] T01U722_A5253BarAcc ;
   private byte[] T01U722_A148BarEstReo ;
   private String[] T01U722_A143BarDisNum ;
   private short[] T01U722_A1909BarGraAca ;
   private String[] T01U722_A4812BarEncCli ;
   private String[] T01U722_A1652BarSerDsc ;
   private byte[] T01U722_A218BarTipCol ;
   private int[] T01U722_A136BarColNum ;
   private String[] T01U722_A135BarColNom ;
   private short[] T01U722_A1503BarPart ;
   private java.util.Date[] T01U722_A161BarFecSal ;
   private short[] T01U722_A125BarAncAca1 ;
   private byte[] T01U722_A213BarSit ;
   private String[] T01U722_A212BarSer ;
   private short[] T01U722_A4466BarAcaAnh ;
   private int[] T01U722_A252CliCod ;
   private boolean[] T01U722_n252CliCod ;
   private short[] T01U722_A217BarTipArt ;
   private boolean[] T01U722_n217BarTipArt ;
   private java.math.BigDecimal[] T01U723_A1208TubPre ;
   private boolean[] T01U723_n1208TubPre ;
   private String[] T01U724_A1253EmprGuiRem ;
   private byte[] T01U724_A5805AlbEnvFtp ;
   private String[] T01U724_A7101AlbLic ;
   private java.util.Date[] T01U724_A34AlbProfch ;
   private String[] T01U724_A2242AlbSec ;
   private int[] T01U724_A1243GuiRemCli ;
   private String[] T01U725_A1244GuiRemCln ;
   private String[] T01U726_A3154CodDsc ;
   private boolean[] T01U726_n3154CodDsc ;
   private String[] T01U727_A365DisDes ;
   private java.math.BigDecimal[] T01U729_A1279BarKla ;
   private java.math.BigDecimal[] T01U729_A1280BarMla ;
   private short[] T01U729_A1292BarPlz ;
   private int[] T01U731_A898BarPieNDes ;
   private short[] T01U731_A199BarPie1 ;
   private String[] T01U732_A396EmprCod ;
   private long[] T01U732_A30AlbProCod ;
   private int[] T01U732_A129BarCod ;
   private byte[] T01U732_A132BarCodReo ;
   private String[] T01U732_A130BarCodPar ;
   private short[] T01U73_A6466PlasCod ;
   private boolean[] T01U73_n6466PlasCod ;
   private int[] T01U73_A1266BarAlbTub ;
   private java.math.BigDecimal[] T01U73_A1261BarAlbKgmE ;
   private int[] T01U73_A1265BarAlbPie ;
   private java.math.BigDecimal[] T01U73_A1263BarAlbMtrE ;
   private short[] T01U73_A3271AlbHdrAnc ;
   private String[] T01U73_A3392AlbColNom ;
   private int[] T01U73_A3393AlbColNum ;
   private byte[] T01U73_A3394AlbTipCol ;
   private String[] T01U73_A3391AlbSer ;
   private String[] T01U73_A8879AlbSerD ;
   private int[] T01U73_A3886AlbCliCod ;
   private String[] T01U73_A12232AlbNomCli ;
   private int[] T01U73_A12233AlbNumcli ;
   private short[] T01U73_A12234AlbTipArt ;
   private short[] T01U73_A5019AlbHdrgm2 ;
   private String[] T01U73_A4815AlbEncCli ;
   private java.math.BigDecimal[] T01U73_A1262BarPreKgm ;
   private java.math.BigDecimal[] T01U73_A1264BarPreMtr ;
   private byte[] T01U73_A32AlbProEsp ;
   private java.math.BigDecimal[] T01U73_A40AlbProRec ;
   private String[] T01U73_A2398BarFasExt ;
   private int[] T01U73_A12195BarAlbUnd ;
   private java.math.BigDecimal[] T01U73_A12196BarPreUnd ;
   private short[] T01U73_A6645AlbMetULi ;
   private java.math.BigDecimal[] T01U73_A1461BarAlbPN ;
   private String[] T01U73_A1095AlbTipEnt ;
   private java.math.BigDecimal[] T01U73_A7994AlbDto ;
   private String[] T01U73_A7993AlbMqTj ;
   private String[] T01U73_A7992AlbDf3 ;
   private String[] T01U73_A7991AlbDf2 ;
   private String[] T01U73_A7990AlbDf1 ;
   private String[] T01U73_A7989AlbCald ;
   private java.math.BigDecimal[] T01U73_A7104AlbEncA ;
   private java.math.BigDecimal[] T01U73_A7103AlbEncL ;
   private short[] T01U73_A6467BarAlbPlas ;
   private java.math.BigDecimal[] T01U73_A2761AlbBarRec ;
   private java.math.BigDecimal[] T01U73_A5354AlbImpMan ;
   private String[] T01U73_A2441AlbHdrObs ;
   private short[] T01U73_A1458BarAlbBul ;
   private String[] T01U73_A2839AlbProVal ;
   private short[] T01U73_A1248GuiFasULin ;
   private short[] T01U73_A2763AlbHdrUlin ;
   private short[] T01U73_A12905AlbCadEnc ;
   private String[] T01U73_A2396BarAlbObs ;
   private String[] T01U73_A14057AlbTiras ;
   private java.math.BigDecimal[] T01U73_A14058AlbTirasKg ;
   private String[] T01U73_A14059AlbSinTest ;
   private String[] T01U73_A396EmprCod ;
   private int[] T01U73_A129BarCod ;
   private byte[] T01U73_A132BarCodReo ;
   private String[] T01U73_A130BarCodPar ;
   private short[] T01U73_A1206TubCod ;
   private boolean[] T01U73_n1206TubCod ;
   private long[] T01U73_A30AlbProCod ;
   private String[] T01U73_A3153CodCod ;
   private boolean[] T01U73_n3153CodCod ;
   private String[] T01U733_A396EmprCod ;
   private int[] T01U733_A129BarCod ;
   private byte[] T01U733_A132BarCodReo ;
   private String[] T01U733_A130BarCodPar ;
   private long[] T01U733_A30AlbProCod ;
   private String[] T01U734_A396EmprCod ;
   private int[] T01U734_A129BarCod ;
   private byte[] T01U734_A132BarCodReo ;
   private String[] T01U734_A130BarCodPar ;
   private long[] T01U734_A30AlbProCod ;
   private short[] T01U72_A6466PlasCod ;
   private boolean[] T01U72_n6466PlasCod ;
   private int[] T01U72_A1266BarAlbTub ;
   private java.math.BigDecimal[] T01U72_A1261BarAlbKgmE ;
   private int[] T01U72_A1265BarAlbPie ;
   private java.math.BigDecimal[] T01U72_A1263BarAlbMtrE ;
   private short[] T01U72_A3271AlbHdrAnc ;
   private String[] T01U72_A3392AlbColNom ;
   private int[] T01U72_A3393AlbColNum ;
   private byte[] T01U72_A3394AlbTipCol ;
   private String[] T01U72_A3391AlbSer ;
   private String[] T01U72_A8879AlbSerD ;
   private int[] T01U72_A3886AlbCliCod ;
   private String[] T01U72_A12232AlbNomCli ;
   private int[] T01U72_A12233AlbNumcli ;
   private short[] T01U72_A12234AlbTipArt ;
   private short[] T01U72_A5019AlbHdrgm2 ;
   private String[] T01U72_A4815AlbEncCli ;
   private java.math.BigDecimal[] T01U72_A1262BarPreKgm ;
   private java.math.BigDecimal[] T01U72_A1264BarPreMtr ;
   private byte[] T01U72_A32AlbProEsp ;
   private java.math.BigDecimal[] T01U72_A40AlbProRec ;
   private String[] T01U72_A2398BarFasExt ;
   private int[] T01U72_A12195BarAlbUnd ;
   private java.math.BigDecimal[] T01U72_A12196BarPreUnd ;
   private short[] T01U72_A6645AlbMetULi ;
   private java.math.BigDecimal[] T01U72_A1461BarAlbPN ;
   private String[] T01U72_A1095AlbTipEnt ;
   private java.math.BigDecimal[] T01U72_A7994AlbDto ;
   private String[] T01U72_A7993AlbMqTj ;
   private String[] T01U72_A7992AlbDf3 ;
   private String[] T01U72_A7991AlbDf2 ;
   private String[] T01U72_A7990AlbDf1 ;
   private String[] T01U72_A7989AlbCald ;
   private java.math.BigDecimal[] T01U72_A7104AlbEncA ;
   private java.math.BigDecimal[] T01U72_A7103AlbEncL ;
   private short[] T01U72_A6467BarAlbPlas ;
   private java.math.BigDecimal[] T01U72_A2761AlbBarRec ;
   private java.math.BigDecimal[] T01U72_A5354AlbImpMan ;
   private String[] T01U72_A2441AlbHdrObs ;
   private short[] T01U72_A1458BarAlbBul ;
   private String[] T01U72_A2839AlbProVal ;
   private short[] T01U72_A1248GuiFasULin ;
   private short[] T01U72_A2763AlbHdrUlin ;
   private short[] T01U72_A12905AlbCadEnc ;
   private String[] T01U72_A2396BarAlbObs ;
   private String[] T01U72_A14057AlbTiras ;
   private java.math.BigDecimal[] T01U72_A14058AlbTirasKg ;
   private String[] T01U72_A14059AlbSinTest ;
   private String[] T01U72_A396EmprCod ;
   private int[] T01U72_A129BarCod ;
   private byte[] T01U72_A132BarCodReo ;
   private String[] T01U72_A130BarCodPar ;
   private short[] T01U72_A1206TubCod ;
   private boolean[] T01U72_n1206TubCod ;
   private long[] T01U72_A30AlbProCod ;
   private String[] T01U72_A3153CodCod ;
   private boolean[] T01U72_n3153CodCod ;
   private byte[] T01U739_A13890BarHDSusp ;
   private boolean[] T01U739_n13890BarHDSusp ;
   private int[] T01U740_A361DisCod ;
   private int[] T01U740_A1235BarNumCli ;
   private String[] T01U740_A1234BarNomCli ;
   private String[] T01U740_A5034BarEstTip ;
   private String[] T01U740_A5291BarTipCor ;
   private byte[] T01U740_A5027BarGraCob ;
   private String[] T01U740_A2010BarTipDis ;
   private byte[] T01U740_A4937BarCtrPdas ;
   private boolean[] T01U740_n4937BarCtrPdas ;
   private String[] T01U740_A5253BarAcc ;
   private byte[] T01U740_A148BarEstReo ;
   private String[] T01U740_A143BarDisNum ;
   private short[] T01U740_A1909BarGraAca ;
   private String[] T01U740_A4812BarEncCli ;
   private String[] T01U740_A1652BarSerDsc ;
   private byte[] T01U740_A218BarTipCol ;
   private int[] T01U740_A136BarColNum ;
   private String[] T01U740_A135BarColNom ;
   private short[] T01U740_A1503BarPart ;
   private java.util.Date[] T01U740_A161BarFecSal ;
   private short[] T01U740_A125BarAncAca1 ;
   private byte[] T01U740_A213BarSit ;
   private String[] T01U740_A212BarSer ;
   private short[] T01U740_A4466BarAcaAnh ;
   private int[] T01U740_A252CliCod ;
   private boolean[] T01U740_n252CliCod ;
   private short[] T01U740_A217BarTipArt ;
   private boolean[] T01U740_n217BarTipArt ;
   private java.math.BigDecimal[] T01U741_A1208TubPre ;
   private boolean[] T01U741_n1208TubPre ;
   private String[] T01U742_A1253EmprGuiRem ;
   private byte[] T01U742_A5805AlbEnvFtp ;
   private String[] T01U742_A7101AlbLic ;
   private java.util.Date[] T01U742_A34AlbProfch ;
   private String[] T01U742_A2242AlbSec ;
   private int[] T01U742_A1243GuiRemCli ;
   private String[] T01U743_A1244GuiRemCln ;
   private String[] T01U744_A3154CodDsc ;
   private boolean[] T01U744_n3154CodDsc ;
   private String[] T01U745_A365DisDes ;
   private java.math.BigDecimal[] T01U747_A1279BarKla ;
   private java.math.BigDecimal[] T01U747_A1280BarMla ;
   private short[] T01U747_A1292BarPlz ;
   private int[] T01U749_A898BarPieNDes ;
   private short[] T01U749_A199BarPie1 ;
   private String[] T01U750_A396EmprCod ;
   private long[] T01U750_A30AlbProCod ;
   private int[] T01U750_A129BarCod ;
   private byte[] T01U750_A132BarCodReo ;
   private String[] T01U750_A130BarCodPar ;
   private short[] T01U750_A6648AlbMetLin ;
   private String[] T01U751_A396EmprCod ;
   private long[] T01U751_A30AlbProCod ;
   private int[] T01U751_A129BarCod ;
   private byte[] T01U751_A132BarCodReo ;
   private String[] T01U751_A130BarCodPar ;
   private short[] T01U751_A9639Et_Numero ;
   private String[] T01U752_A396EmprCod ;
   private long[] T01U752_A30AlbProCod ;
   private int[] T01U752_A129BarCod ;
   private byte[] T01U752_A132BarCodReo ;
   private String[] T01U752_A130BarCodPar ;
   private short[] T01U752_A6622AlbHdRLn ;
   private String[] T01U753_A396EmprCod ;
   private long[] T01U753_A30AlbProCod ;
   private int[] T01U753_A129BarCod ;
   private byte[] T01U753_A132BarCodReo ;
   private String[] T01U753_A130BarCodPar ;
   private short[] T01U753_A5456P_ForLin ;
   private String[] T01U754_A396EmprCod ;
   private long[] T01U754_A30AlbProCod ;
   private int[] T01U754_A129BarCod ;
   private byte[] T01U754_A132BarCodReo ;
   private String[] T01U754_A130BarCodPar ;
   private byte[] T01U754_A2524DisComLin ;
   private String[] T01U754_A1056DisComCod ;
   private String[] T01U754_A1032FonCod ;
   private String[] T01U755_A396EmprCod ;
   private long[] T01U755_A3617AlbTrnCod ;
   private long[] T01U755_A30AlbProCod ;
   private int[] T01U755_A129BarCod ;
   private byte[] T01U755_A132BarCodReo ;
   private String[] T01U755_A130BarCodPar ;
   private String[] T01U756_A396EmprCod ;
   private long[] T01U756_A30AlbProCod ;
   private int[] T01U756_A129BarCod ;
   private byte[] T01U756_A132BarCodReo ;
   private String[] T01U756_A130BarCodPar ;
   private short[] T01U756_A3621AlbPckLin ;
   private String[] T01U757_A396EmprCod ;
   private long[] T01U757_A30AlbProCod ;
   private int[] T01U757_A129BarCod ;
   private byte[] T01U757_A132BarCodReo ;
   private String[] T01U757_A130BarCodPar ;
   private short[] T01U757_A2764AlbHdrLin ;
   private String[] T01U758_A396EmprCod ;
   private long[] T01U758_A30AlbProCod ;
   private int[] T01U758_A129BarCod ;
   private byte[] T01U758_A132BarCodReo ;
   private String[] T01U758_A130BarCodPar ;
   private short[] T01U758_A1468AlbPrdLin ;
   private String[] T01U759_A396EmprCod ;
   private long[] T01U759_A30AlbProCod ;
   private int[] T01U759_A129BarCod ;
   private byte[] T01U759_A132BarCodReo ;
   private String[] T01U759_A130BarCodPar ;
   private String[] T01U759_A200BarPieCod ;
   private String[] T01U760_A396EmprCod ;
   private long[] T01U760_A30AlbProCod ;
   private int[] T01U760_A129BarCod ;
   private byte[] T01U760_A132BarCodReo ;
   private String[] T01U760_A130BarCodPar ;
   private short[] T01U760_A1240GuiFasLin ;
   private String[] T01U761_A396EmprCod ;
   private long[] T01U761_A30AlbProCod ;
   private int[] T01U761_A129BarCod ;
   private byte[] T01U761_A132BarCodReo ;
   private String[] T01U761_A130BarCodPar ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV47TubCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV50PlasCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item11 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item12[] ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV19TrnContextAtt ;
}

final  class documentodetransporteproduccion_3__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentodetransporteproduccion_3__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentodetransporteproduccion_3__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentodetransporteproduccion_3__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentodetransporteproduccion_3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01U72", "SELECT PlasCod, BarAlbTub, BarAlbKgmE, BarAlbPie, BarAlbMtrE, AlbHdrAnc, AlbColNom, AlbColNum, AlbTipCol, AlbSer, AlbSerD, AlbCliCod, AlbNomCli, AlbNumcli, AlbTipArt, AlbHdrgm2, AlbEncCli, BarPreKgm, BarPreMtr, AlbProEsp, AlbProRec, BarFasExt, BarAlbUnd, BarPreUnd, AlbMetULi, BarAlbPN, AlbTipEnt, AlbDto, AlbMqTj, AlbDf3, AlbDf2, AlbDf1, AlbCald, AlbEncA, AlbEncL, BarAlbPlas, AlbBarRec, AlbImpMan, AlbHdrObs, BarAlbBul, AlbProVal, GuiFasULin, AlbHdrUlin, AlbCadEnc, BarAlbObs, AlbTiras, AlbTirasKg, AlbSinTest, EmprCod, BarCod, BarCodReo, BarCodPar, TubCod, AlbProCod, CodCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF PlasCod, BarAlbTub, BarAlbKgmE, BarAlbPie, BarAlbMtrE, AlbHdrAnc, AlbColNom, AlbColNum, AlbTipCol, AlbSer, AlbSerD, AlbCliCod, AlbNomCli, AlbNumcli, AlbTipArt, AlbHdrgm2, AlbEncCli, BarPreKgm, BarPreMtr, AlbProEsp, AlbProRec, BarFasExt, BarAlbUnd, BarPreUnd, AlbMetULi, BarAlbPN, AlbTipEnt, AlbDto, AlbMqTj, AlbDf3, AlbDf2, AlbDf1, AlbCald, AlbEncA, AlbEncL, BarAlbPlas, AlbBarRec, AlbImpMan, AlbHdrObs, BarAlbBul, AlbProVal, GuiFasULin, AlbHdrUlin, AlbCadEnc, BarAlbObs, AlbTiras, AlbTirasKg, AlbSinTest, TubCod, CodCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U73", "SELECT PlasCod, BarAlbTub, BarAlbKgmE, BarAlbPie, BarAlbMtrE, AlbHdrAnc, AlbColNom, AlbColNum, AlbTipCol, AlbSer, AlbSerD, AlbCliCod, AlbNomCli, AlbNumcli, AlbTipArt, AlbHdrgm2, AlbEncCli, BarPreKgm, BarPreMtr, AlbProEsp, AlbProRec, BarFasExt, BarAlbUnd, BarPreUnd, AlbMetULi, BarAlbPN, AlbTipEnt, AlbDto, AlbMqTj, AlbDf3, AlbDf2, AlbDf1, AlbCald, AlbEncA, AlbEncL, BarAlbPlas, AlbBarRec, AlbImpMan, AlbHdrObs, BarAlbBul, AlbProVal, GuiFasULin, AlbHdrUlin, AlbCadEnc, BarAlbObs, AlbTiras, AlbTirasKg, AlbSinTest, EmprCod, BarCod, BarCodReo, BarCodPar, TubCod, AlbProCod, CodCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U75", "SELECT COALESCE( T1.BarHDSusp, 0) AS BarHDSusp FROM (SELECT MIN(Stp_Est) AS BarHDSusp FROM TXPHDSTO1 WHERE (EmprCod = ?) AND (Stp_hdr = ?) AND (Stp_r = ?) AND (Stp_p = ?) AND (Stp_Est = 1) ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U76", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U77", "SELECT DisCod, BarNumCli, BarNomCli, BarEstTip, BarTipCor, BarGraCob, BarTipDis, BarCtrPdas, BarAcc, BarEstReo, BarDisNum, BarGraAca, BarEncCli, BarSerDsc, BarTipCol, BarColNum, BarColNom, BarPart, BarFecSal, BarAncAca1, BarSit, BarSer, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U78", "SELECT TubPre FROM TXPTUBOS WHERE EmprCod = ? AND TubCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U79", "SELECT EmprGuiRem, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U710", "SELECT CodDsc FROM TXPCODFAC WHERE EmprCod = ? AND CodCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U711", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U712", "SELECT DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U714", "SELECT COALESCE( T1.BarKla, 0) AS BarKla, COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarPlz, 0) AS BarPlz FROM (SELECT SUM(BarKilLan) AS BarKla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarMetLan) AS BarMla, SUM(BarPieLzd) AS BarPlz FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U716", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U719", "SELECT /*+ FIRST_ROWS(100) */ T4.EmprGuiRem AS EmprGuiRem, T6.DisCod, TM1.PlasCod, TM1.BarAlbTub, TM1.BarAlbKgmE, TM1.BarAlbPie, TM1.BarAlbMtrE, TM1.AlbHdrAnc, TM1.AlbColNom, TM1.AlbColNum, TM1.AlbTipCol, TM1.AlbSer, TM1.AlbSerD, TM1.AlbCliCod, TM1.AlbNomCli, TM1.AlbNumcli, TM1.AlbTipArt, TM1.AlbHdrgm2, TM1.AlbEncCli, TM1.BarPreKgm, TM1.BarPreMtr, TM1.AlbProEsp, TM1.AlbProRec, TM1.BarFasExt, T2.EmprNom, T4.AlbEnvFtp, T4.AlbLic, T5.CliNom AS GuiRemCln, T4.AlbProfch, T4.AlbSec, T6.BarNumCli, T6.BarNomCli, TM1.BarAlbUnd, TM1.BarPreUnd, T6.BarEstTip, TM1.AlbMetULi, T6.BarTipCor, T6.BarGraCob, T6.BarTipDis, TM1.BarAlbPN, T6.BarCtrPdas, TM1.AlbTipEnt, TM1.AlbDto, TM1.AlbMqTj, TM1.AlbDf3, TM1.AlbDf2, TM1.AlbDf1, TM1.AlbCald, TM1.AlbEncA, TM1.AlbEncL, TM1.BarAlbPlas, TM1.AlbBarRec, T6.BarAcc, TM1.AlbImpMan, T6.BarEstReo, T6.BarDisNum, T6.BarGraAca, T6.BarEncCli, TM1.AlbHdrObs, T6.BarSerDsc, T6.BarTipCol, T6.BarColNum, T6.BarColNom, T3.CodDsc, T6.BarPart, TM1.BarAlbBul, TM1.AlbProVal, T7.DisDes, T6.BarFecSal, T10.TubPre, T6.BarAncAca1, T6.BarSit, T6.BarSer, TM1.GuiFasULin, TM1.AlbHdrUlin, T6.BarAcaAnh, TM1.AlbCadEnc, TM1.BarAlbObs, TM1.AlbTiras, TM1.AlbTirasKg, TM1.AlbSinTest, T2.EmpNumDec, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.TubCod, TM1.AlbProCod, TM1.CodCod, T4.GuiRemCli AS GuiRemCli, T6.CliCod, T6.BarTipArt, COALESCE( T8.BarKla, 0) AS BarKla, COALESCE( T8.BarMla, 0) AS BarMla, COALESCE( T8.BarPlz, 0) AS BarPlz, COALESCE( T9.BarPieNDes, 0) AS BarPieNDes, COALESCE( T9.BarPie1, 0) AS BarPie1 FROM (((((((((TXPALBBAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCODFAC T3 ON T3.EmprCod = TM1.EmprCod AND T3.CodCod = TM1.CodCod) INNER JOIN TXPCALPRD T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbProCod = TM1.AlbProCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T4.EmprGuiRem AND T5.CliCod = T4.GuiRemCli) INNER JOIN TXPBARCAD T6 ON T6.EmprCod = TM1.EmprCod AND T6.BarCod = TM1.BarCod AND T6.BarCodReo = TM1.BarCodReo AND T6.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPDISPOS T7 ON T7.EmprCod = TM1.EmprCod AND T7.DisCod = T6.DisCod) LEFT JOIN (SELECT SUM(BarKilLan) AS BarKla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarMetLan) AS BarMla, SUM(BarPieLzd) AS BarPlz FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T8 ON T8.EmprCod = TM1.EmprCod AND T8.BarCod = TM1.BarCod AND T8.BarCodReo = TM1.BarCodReo AND T8.BarCodPar = TM1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = TM1.EmprCod AND T9.BarCod = TM1.BarCod AND T9.BarCodReo = TM1.BarCodReo AND T9.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPTUBOS T10 ON T10.EmprCod = TM1.EmprCod AND T10.TubCod = TM1.TubCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U721", "SELECT COALESCE( T1.BarHDSusp, 0) AS BarHDSusp FROM (SELECT MIN(Stp_Est) AS BarHDSusp FROM TXPHDSTO1 WHERE (EmprCod = ?) AND (Stp_hdr = ?) AND (Stp_r = ?) AND (Stp_p = ?) AND (Stp_Est = 1) ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U722", "SELECT DisCod, BarNumCli, BarNomCli, BarEstTip, BarTipCor, BarGraCob, BarTipDis, BarCtrPdas, BarAcc, BarEstReo, BarDisNum, BarGraAca, BarEncCli, BarSerDsc, BarTipCol, BarColNum, BarColNom, BarPart, BarFecSal, BarAncAca1, BarSit, BarSer, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U723", "SELECT TubPre FROM TXPTUBOS WHERE EmprCod = ? AND TubCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U724", "SELECT EmprGuiRem, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U725", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U726", "SELECT CodDsc FROM TXPCODFAC WHERE EmprCod = ? AND CodCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U727", "SELECT DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U729", "SELECT COALESCE( T1.BarKla, 0) AS BarKla, COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarPlz, 0) AS BarPlz FROM (SELECT SUM(BarKilLan) AS BarKla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarMetLan) AS BarMla, SUM(BarPieLzd) AS BarPlz FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U731", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U732", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U733", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and AlbProCod > ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U734", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and AlbProCod < ?) ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01U735", "INSERT INTO TXPALBBAR(PlasCod, BarAlbTub, BarAlbKgmE, BarAlbPie, BarAlbMtrE, AlbHdrAnc, AlbColNom, AlbColNum, AlbTipCol, AlbSer, AlbSerD, AlbCliCod, AlbNomCli, AlbNumcli, AlbTipArt, AlbHdrgm2, AlbEncCli, BarPreKgm, BarPreMtr, AlbProEsp, AlbProRec, BarFasExt, BarAlbUnd, BarPreUnd, AlbMetULi, BarAlbPN, AlbTipEnt, AlbDto, AlbMqTj, AlbDf3, AlbDf2, AlbDf1, AlbCald, AlbEncA, AlbEncL, BarAlbPlas, AlbBarRec, AlbImpMan, AlbHdrObs, BarAlbBul, AlbProVal, GuiFasULin, AlbHdrUlin, AlbCadEnc, BarAlbObs, AlbTiras, AlbTirasKg, AlbSinTest, EmprCod, BarCod, BarCodReo, BarCodPar, TubCod, AlbProCod, CodCod, AlbPConPie, BarAlbTar, BarAlbFor, BarAlbTip, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarFasExtD, BarAlbExt, BarAlbTin, AlbBarDto, AlbTipCon, AlbPckUlin, TipAcaCod, P_ForULin, AlbHdRUl, AlbObsM, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, Et_UltNum, BarKgsCli) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01U736", "UPDATE TXPALBBAR SET PlasCod=?, BarAlbTub=?, BarAlbKgmE=?, BarAlbPie=?, BarAlbMtrE=?, AlbHdrAnc=?, AlbColNom=?, AlbColNum=?, AlbTipCol=?, AlbSer=?, AlbSerD=?, AlbCliCod=?, AlbNomCli=?, AlbNumcli=?, AlbTipArt=?, AlbHdrgm2=?, AlbEncCli=?, BarPreKgm=?, BarPreMtr=?, AlbProEsp=?, AlbProRec=?, BarFasExt=?, BarAlbUnd=?, BarPreUnd=?, AlbMetULi=?, BarAlbPN=?, AlbTipEnt=?, AlbDto=?, AlbMqTj=?, AlbDf3=?, AlbDf2=?, AlbDf1=?, AlbCald=?, AlbEncA=?, AlbEncL=?, BarAlbPlas=?, AlbBarRec=?, AlbImpMan=?, AlbHdrObs=?, BarAlbBul=?, AlbProVal=?, GuiFasULin=?, AlbHdrUlin=?, AlbCadEnc=?, BarAlbObs=?, AlbTiras=?, AlbTirasKg=?, AlbSinTest=?, TubCod=?, CodCod=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01U737", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01U739", "SELECT COALESCE( T1.BarHDSusp, 0) AS BarHDSusp FROM (SELECT MIN(Stp_Est) AS BarHDSusp FROM TXPHDSTO1 WHERE (EmprCod = ?) AND (Stp_hdr = ?) AND (Stp_r = ?) AND (Stp_p = ?) AND (Stp_Est = 1) ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U740", "SELECT DisCod, BarNumCli, BarNomCli, BarEstTip, BarTipCor, BarGraCob, BarTipDis, BarCtrPdas, BarAcc, BarEstReo, BarDisNum, BarGraAca, BarEncCli, BarSerDsc, BarTipCol, BarColNum, BarColNom, BarPart, BarFecSal, BarAncAca1, BarSit, BarSer, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U741", "SELECT TubPre FROM TXPTUBOS WHERE EmprCod = ? AND TubCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U742", "SELECT EmprGuiRem, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U743", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U744", "SELECT CodDsc FROM TXPCODFAC WHERE EmprCod = ? AND CodCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U745", "SELECT DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U747", "SELECT COALESCE( T1.BarKla, 0) AS BarKla, COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarPlz, 0) AS BarPlz FROM (SELECT SUM(BarKilLan) AS BarKla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarMetLan) AS BarMla, SUM(BarPieLzd) AS BarPlz FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U749", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U750", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbMetLin FROM TXPMETCAL WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U751", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, Et_Numero FROM TXPEDIETI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U752", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U753", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin FROM TXPALBQUI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U754", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U755", "SELECT * FROM (SELECT EmprCod, AlbTrnCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U756", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U757", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U758", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U759", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U760", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U761", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,5);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,5);
               ((byte[]) buf[20])[0] = rslt.getByte(20);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,5);
               ((String[]) buf[22])[0] = rslt.getString(22, 8);
               ((int[]) buf[23])[0] = rslt.getInt(23);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,5);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(26,2);
               ((String[]) buf[27])[0] = rslt.getString(27, 1);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(28,3);
               ((String[]) buf[29])[0] = rslt.getString(29, 16);
               ((String[]) buf[30])[0] = rslt.getString(30, 50);
               ((String[]) buf[31])[0] = rslt.getString(31, 50);
               ((String[]) buf[32])[0] = rslt.getString(32, 50);
               ((String[]) buf[33])[0] = rslt.getString(33, 12);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(35,2);
               ((short[]) buf[36])[0] = rslt.getShort(36);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(37,2);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(38,2);
               ((String[]) buf[39])[0] = rslt.getString(39, 60);
               ((short[]) buf[40])[0] = rslt.getShort(40);
               ((String[]) buf[41])[0] = rslt.getString(41, 1);
               ((short[]) buf[42])[0] = rslt.getShort(42);
               ((short[]) buf[43])[0] = rslt.getShort(43);
               ((short[]) buf[44])[0] = rslt.getShort(44);
               ((String[]) buf[45])[0] = rslt.getString(45, 30);
               ((String[]) buf[46])[0] = rslt.getString(46, 1);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(47,2);
               ((String[]) buf[48])[0] = rslt.getString(48, 1);
               ((String[]) buf[49])[0] = rslt.getString(49, 3);
               ((int[]) buf[50])[0] = rslt.getInt(50);
               ((byte[]) buf[51])[0] = rslt.getByte(51);
               ((String[]) buf[52])[0] = rslt.getString(52, 1);
               ((short[]) buf[53])[0] = rslt.getShort(53);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(54);
               ((String[]) buf[56])[0] = rslt.getString(55, 6);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,5);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,5);
               ((byte[]) buf[20])[0] = rslt.getByte(20);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,5);
               ((String[]) buf[22])[0] = rslt.getString(22, 8);
               ((int[]) buf[23])[0] = rslt.getInt(23);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,5);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(26,2);
               ((String[]) buf[27])[0] = rslt.getString(27, 1);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(28,3);
               ((String[]) buf[29])[0] = rslt.getString(29, 16);
               ((String[]) buf[30])[0] = rslt.getString(30, 50);
               ((String[]) buf[31])[0] = rslt.getString(31, 50);
               ((String[]) buf[32])[0] = rslt.getString(32, 50);
               ((String[]) buf[33])[0] = rslt.getString(33, 12);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(35,2);
               ((short[]) buf[36])[0] = rslt.getShort(36);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(37,2);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(38,2);
               ((String[]) buf[39])[0] = rslt.getString(39, 60);
               ((short[]) buf[40])[0] = rslt.getShort(40);
               ((String[]) buf[41])[0] = rslt.getString(41, 1);
               ((short[]) buf[42])[0] = rslt.getShort(42);
               ((short[]) buf[43])[0] = rslt.getShort(43);
               ((short[]) buf[44])[0] = rslt.getShort(44);
               ((String[]) buf[45])[0] = rslt.getString(45, 30);
               ((String[]) buf[46])[0] = rslt.getString(46, 1);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(47,2);
               ((String[]) buf[48])[0] = rslt.getString(48, 1);
               ((String[]) buf[49])[0] = rslt.getString(49, 3);
               ((int[]) buf[50])[0] = rslt.getInt(50);
               ((byte[]) buf[51])[0] = rslt.getByte(51);
               ((String[]) buf[52])[0] = rslt.getString(52, 1);
               ((short[]) buf[53])[0] = rslt.getShort(53);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(54);
               ((String[]) buf[56])[0] = rslt.getString(55, 6);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
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
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,5);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,5);
               ((byte[]) buf[22])[0] = rslt.getByte(22);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,5);
               ((String[]) buf[24])[0] = rslt.getString(24, 8);
               ((String[]) buf[25])[0] = rslt.getString(25, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(26);
               ((String[]) buf[28])[0] = rslt.getString(27, 20);
               ((String[]) buf[29])[0] = rslt.getString(28, 30);
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(29);
               ((String[]) buf[31])[0] = rslt.getString(30, 1);
               ((int[]) buf[32])[0] = rslt.getInt(31);
               ((String[]) buf[33])[0] = rslt.getString(32, 13);
               ((int[]) buf[34])[0] = rslt.getInt(33);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(34,5);
               ((String[]) buf[36])[0] = rslt.getString(35, 1);
               ((short[]) buf[37])[0] = rslt.getShort(36);
               ((String[]) buf[38])[0] = rslt.getString(37, 2);
               ((byte[]) buf[39])[0] = rslt.getByte(38);
               ((String[]) buf[40])[0] = rslt.getString(39, 1);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(40,2);
               ((byte[]) buf[42])[0] = rslt.getByte(41);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(42, 1);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(43,3);
               ((String[]) buf[46])[0] = rslt.getString(44, 16);
               ((String[]) buf[47])[0] = rslt.getString(45, 50);
               ((String[]) buf[48])[0] = rslt.getString(46, 50);
               ((String[]) buf[49])[0] = rslt.getString(47, 50);
               ((String[]) buf[50])[0] = rslt.getString(48, 12);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(49,2);
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(50,2);
               ((short[]) buf[53])[0] = rslt.getShort(51);
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(52,2);
               ((String[]) buf[55])[0] = rslt.getString(53, 1);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(54,2);
               ((byte[]) buf[57])[0] = rslt.getByte(55);
               ((String[]) buf[58])[0] = rslt.getString(56, 8);
               ((short[]) buf[59])[0] = rslt.getShort(57);
               ((String[]) buf[60])[0] = rslt.getString(58, 20);
               ((String[]) buf[61])[0] = rslt.getString(59, 60);
               ((String[]) buf[62])[0] = rslt.getString(60, 26);
               ((byte[]) buf[63])[0] = rslt.getByte(61);
               ((int[]) buf[64])[0] = rslt.getInt(62);
               ((String[]) buf[65])[0] = rslt.getString(63, 13);
               ((String[]) buf[66])[0] = rslt.getString(64, 30);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(65);
               ((short[]) buf[69])[0] = rslt.getShort(66);
               ((String[]) buf[70])[0] = rslt.getString(67, 1);
               ((String[]) buf[71])[0] = rslt.getString(68, 1);
               ((java.util.Date[]) buf[72])[0] = rslt.getGXDate(69);
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(70,5);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(71);
               ((byte[]) buf[76])[0] = rslt.getByte(72);
               ((String[]) buf[77])[0] = rslt.getString(73, 16);
               ((short[]) buf[78])[0] = rslt.getShort(74);
               ((short[]) buf[79])[0] = rslt.getShort(75);
               ((short[]) buf[80])[0] = rslt.getShort(76);
               ((short[]) buf[81])[0] = rslt.getShort(77);
               ((String[]) buf[82])[0] = rslt.getString(78, 30);
               ((String[]) buf[83])[0] = rslt.getString(79, 1);
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(80,2);
               ((String[]) buf[85])[0] = rslt.getString(81, 1);
               ((byte[]) buf[86])[0] = rslt.getByte(82);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(83, 3);
               ((int[]) buf[89])[0] = rslt.getInt(84);
               ((byte[]) buf[90])[0] = rslt.getByte(85);
               ((String[]) buf[91])[0] = rslt.getString(86, 1);
               ((short[]) buf[92])[0] = rslt.getShort(87);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((long[]) buf[94])[0] = rslt.getLong(88);
               ((String[]) buf[95])[0] = rslt.getString(89, 6);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((int[]) buf[97])[0] = rslt.getInt(90);
               ((int[]) buf[98])[0] = rslt.getInt(91);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((short[]) buf[100])[0] = rslt.getShort(92);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[102])[0] = rslt.getBigDecimal(93,2);
               ((java.math.BigDecimal[]) buf[103])[0] = rslt.getBigDecimal(94,2);
               ((short[]) buf[104])[0] = rslt.getShort(95);
               ((int[]) buf[105])[0] = rslt.getInt(96);
               ((short[]) buf[106])[0] = rslt.getShort(97);
               return;
            case 13 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
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
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 20 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 28 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
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
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 35 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 36 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
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
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setLong(15, ((Number) parms[14]).longValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setLong(15, ((Number) parms[14]).longValue());
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setString(7, (String)parms[7], 13);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setString(10, (String)parms[10], 16);
               stmt.setString(11, (String)parms[11], 26);
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setString(13, (String)parms[13], 13);
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setShort(15, ((Number) parms[15]).shortValue());
               stmt.setShort(16, ((Number) parms[16]).shortValue());
               stmt.setString(17, (String)parms[17], 20);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[18], 5);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 5);
               stmt.setByte(20, ((Number) parms[20]).byteValue());
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[21], 5);
               stmt.setString(22, (String)parms[22], 8);
               stmt.setInt(23, ((Number) parms[23]).intValue());
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[24], 5);
               stmt.setShort(25, ((Number) parms[25]).shortValue());
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[26], 2);
               stmt.setString(27, (String)parms[27], 1);
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[28], 3);
               stmt.setString(29, (String)parms[29], 16);
               stmt.setString(30, (String)parms[30], 50);
               stmt.setString(31, (String)parms[31], 50);
               stmt.setString(32, (String)parms[32], 50);
               stmt.setString(33, (String)parms[33], 12);
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[34], 2);
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[35], 2);
               stmt.setShort(36, ((Number) parms[36]).shortValue());
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[37], 2);
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[38], 2);
               stmt.setString(39, (String)parms[39], 60);
               stmt.setShort(40, ((Number) parms[40]).shortValue());
               stmt.setString(41, (String)parms[41], 1);
               stmt.setShort(42, ((Number) parms[42]).shortValue());
               stmt.setShort(43, ((Number) parms[43]).shortValue());
               stmt.setShort(44, ((Number) parms[44]).shortValue());
               stmt.setString(45, (String)parms[45], 30);
               stmt.setString(46, (String)parms[46], 1);
               stmt.setBigDecimal(47, (java.math.BigDecimal)parms[47], 2);
               stmt.setString(48, (String)parms[48], 1);
               stmt.setString(49, (String)parms[49], 3);
               stmt.setInt(50, ((Number) parms[50]).intValue());
               stmt.setByte(51, ((Number) parms[51]).byteValue());
               stmt.setString(52, (String)parms[52], 1);
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(53, ((Number) parms[54]).shortValue());
               }
               stmt.setLong(54, ((Number) parms[55]).longValue());
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[57], 6);
               }
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setString(7, (String)parms[7], 13);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setString(10, (String)parms[10], 16);
               stmt.setString(11, (String)parms[11], 26);
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setString(13, (String)parms[13], 13);
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setShort(15, ((Number) parms[15]).shortValue());
               stmt.setShort(16, ((Number) parms[16]).shortValue());
               stmt.setString(17, (String)parms[17], 20);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[18], 5);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 5);
               stmt.setByte(20, ((Number) parms[20]).byteValue());
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[21], 5);
               stmt.setString(22, (String)parms[22], 8);
               stmt.setInt(23, ((Number) parms[23]).intValue());
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[24], 5);
               stmt.setShort(25, ((Number) parms[25]).shortValue());
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[26], 2);
               stmt.setString(27, (String)parms[27], 1);
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[28], 3);
               stmt.setString(29, (String)parms[29], 16);
               stmt.setString(30, (String)parms[30], 50);
               stmt.setString(31, (String)parms[31], 50);
               stmt.setString(32, (String)parms[32], 50);
               stmt.setString(33, (String)parms[33], 12);
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[34], 2);
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[35], 2);
               stmt.setShort(36, ((Number) parms[36]).shortValue());
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[37], 2);
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[38], 2);
               stmt.setString(39, (String)parms[39], 60);
               stmt.setShort(40, ((Number) parms[40]).shortValue());
               stmt.setString(41, (String)parms[41], 1);
               stmt.setShort(42, ((Number) parms[42]).shortValue());
               stmt.setShort(43, ((Number) parms[43]).shortValue());
               stmt.setShort(44, ((Number) parms[44]).shortValue());
               stmt.setString(45, (String)parms[45], 30);
               stmt.setString(46, (String)parms[46], 1);
               stmt.setBigDecimal(47, (java.math.BigDecimal)parms[47], 2);
               stmt.setString(48, (String)parms[48], 1);
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(49, ((Number) parms[50]).shortValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[52], 6);
               }
               stmt.setString(51, (String)parms[53], 3);
               stmt.setLong(52, ((Number) parms[54]).longValue());
               stmt.setInt(53, ((Number) parms[55]).intValue());
               stmt.setByte(54, ((Number) parms[56]).byteValue());
               stmt.setString(55, (String)parms[57], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
      }
   }

}

