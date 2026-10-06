package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbtet_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"DISCOMTRP") == 0 )
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
         A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
         A1056DisComCod = httpContext.GetPar( "DisComCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
         A1032FonCod = httpContext.GetPar( "FonCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asadiscomtrpL1533( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"DISCOMTMP") == 0 )
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
         A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
         A1056DisComCod = httpContext.GetPar( "DisComCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
         A1032FonCod = httpContext.GetPar( "FonCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asadiscomtmpL1533( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"DISCOMTRS") == 0 )
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
         A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
         A1056DisComCod = httpContext.GetPar( "DisComCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
         A1032FonCod = httpContext.GetPar( "FonCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asadiscomtrsL1533( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"DISCOMTMS") == 0 )
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
         A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
         A1056DisComCod = httpContext.GetPar( "DisComCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
         A1032FonCod = httpContext.GetPar( "FonCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asadiscomtmsL1533( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"DISCOMTRS") == 0 )
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
         A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
         A1056DisComCod = httpContext.GetPar( "DisComCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
         A1032FonCod = httpContext.GetPar( "FonCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx8asadiscomtrsL1674( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"DISCOMTRP") == 0 )
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
         A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
         A1056DisComCod = httpContext.GetPar( "DisComCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
         A1032FonCod = httpContext.GetPar( "FonCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asadiscomtrpL1674( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"DISCOMTMS") == 0 )
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
         A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
         A1056DisComCod = httpContext.GetPar( "DisComCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
         A1032FonCod = httpContext.GetPar( "FonCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx11asadiscomtmsL1674( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel12"+"_"+"DISCOMTMP") == 0 )
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
         A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
         A1056DisComCod = httpContext.GetPar( "DisComCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
         A1032FonCod = httpContext.GetPar( "FonCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx12asadiscomtmpL1674( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
            A1056DisComCod = httpContext.GetPar( "DisComCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
            A1032FonCod = httpContext.GetPar( "FonCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TROZOS COMBINACION", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
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
      nRC_GXsfl_100 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_100"))) ;
      nGXsfl_100_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_100_idx"))) ;
      sGXsfl_100_idx = httpContext.GetPar( "sGXsfl_100_idx") ;
      A4430DisComUtr = (short)(GXutil.lval( httpContext.GetPar( "DisComUtr"))) ;
      n4430DisComUtr = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
      A1056DisComCod = httpContext.GetPar( "DisComCod") ;
      A1032FonCod = httpContext.GetPar( "FonCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public talbtet_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbtet_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbtet_impl.class ));
   }

   public talbtet_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbDisComTtp = new HTMLChoice();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBTET.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBTET.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBTET.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBTET.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TALBTET.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Linea Combinacion", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisComLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComLin_Jsonclick, 0, "", "", "", "", "", 1, edtDisComLin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Código Combinación", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComCod_Internalname, GXutil.rtrim( A1056DisComCod), GXutil.rtrim( localUtil.format( A1056DisComCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisComCod_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Código de Fondo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFonCod_Internalname, GXutil.rtrim( A1032FonCod), GXutil.rtrim( localUtil.format( A1032FonCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFonCod_Jsonclick, 0, "", "", "", "", "", 1, edtFonCod_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBTET.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComUtr_Internalname, GXutil.ltrim( localUtil.ntoc( A4430DisComUtr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisComUtr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4430DisComUtr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4430DisComUtr), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComUtr_Jsonclick, 0, "", "", "", "", "", 1, edtDisComUtr_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Total Trozos", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComTTr_Internalname, GXutil.ltrim( localUtil.ntoc( A4431DisComTTr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisComTTr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4431DisComTTr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4431DisComTTr), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComTTr_Jsonclick, 0, "", "", "", "", "", 1, edtDisComTTr_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Total Metros", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComTM_Internalname, GXutil.ltrim( localUtil.ntoc( A4432DisComTM, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisComTM_Enabled!=0) ? localUtil.format( A4432DisComTM, "ZZZZZZ9.99") : localUtil.format( A4432DisComTM, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComTM_Jsonclick, 0, "", "", "", "", "", 1, edtDisComTM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Total Trozos 1ª", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComTrP_Internalname, GXutil.ltrim( localUtil.ntoc( A4788DisComTrP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisComTrP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4788DisComTrP), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4788DisComTrP), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComTrP_Jsonclick, 0, "", "", "", "", "", 1, edtDisComTrP_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Total Metros Primera", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComTMP_Internalname, GXutil.ltrim( localUtil.ntoc( A4437DisComTMP, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisComTMP_Enabled!=0) ? localUtil.format( A4437DisComTMP, "ZZZZZZ9.99") : localUtil.format( A4437DisComTMP, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComTMP_Jsonclick, 0, "", "", "", "", "", 1, edtDisComTMP_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Total Trozos 2ª", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComTrS_Internalname, GXutil.ltrim( localUtil.ntoc( A4789DisComTrS, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisComTrS_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4789DisComTrS), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4789DisComTrS), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComTrS_Jsonclick, 0, "", "", "", "", "", 1, edtDisComTrS_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Total Metros Segunda", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComTMS_Internalname, GXutil.ltrim( localUtil.ntoc( A4438DisComTMS, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisComTMS_Enabled!=0) ? localUtil.format( A4438DisComTMS, "ZZZZZZ9.99") : localUtil.format( A4438DisComTMS, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComTMS_Jsonclick, 0, "", "", "", "", "", 1, edtDisComTMS_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBTET.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol100( ) ;
      nGXsfl_100_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount674 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_674 = (short)(1) ;
            scanStartL1674( ) ;
            while ( RcdFound674 != 0 )
            {
               init_level_properties674( ) ;
               getByPrimaryKeyL1674( ) ;
               addRowL1674( ) ;
               scanNextL1674( ) ;
            }
            scanEndL1674( ) ;
            nBlankRcdCount674 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4430DisComUtr = A4430DisComUtr ;
         n4430DisComUtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
         B4432DisComTM = A4432DisComTM ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
         B4431DisComTTr = A4431DisComTTr ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         standaloneNotModalL1674( ) ;
         standaloneModalL1674( ) ;
         sMode674 = Gx_mode ;
         while ( nGXsfl_100_idx < nRC_GXsfl_100 )
         {
            bGXsfl_100_Refreshing = true ;
            readRowL1674( ) ;
            edtavnRcdDeleted_674_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_674_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_674_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_674_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtDisComTro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMTRO_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComTro_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtDisComNTr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMNTR_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComNTr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComNTr_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtDisComMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMMTS_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComMts_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            cmbDisComTtp.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMTTP_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbDisComTtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDisComTtp.getEnabled(), 5, 0), !bGXsfl_100_Refreshing);
            edtDisComTMT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMTMT_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComTMT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComTMT_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            if ( ( nRcdExists_674 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalL1674( ) ;
            }
            sendRowL1674( ) ;
            bGXsfl_100_Refreshing = false ;
         }
         Gx_mode = sMode674 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4430DisComUtr = B4430DisComUtr ;
         n4430DisComUtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
         A4432DisComTM = B4432DisComTM ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
         A4431DisComTTr = B4431DisComTTr ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount674 = (short)(5) ;
         nRcdExists_674 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartL1674( ) ;
            while ( RcdFound674 != 0 )
            {
               sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_100674( ) ;
               init_level_properties674( ) ;
               standaloneNotModalL1674( ) ;
               getByPrimaryKeyL1674( ) ;
               standaloneModalL1674( ) ;
               addRowL1674( ) ;
               scanNextL1674( ) ;
            }
            scanEndL1674( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode674 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_100674( ) ;
      initAllL1674( ) ;
      init_level_properties674( ) ;
      B4430DisComUtr = A4430DisComUtr ;
      n4430DisComUtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
      B4432DisComTM = A4432DisComTM ;
      httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      B4431DisComTTr = A4431DisComTTr ;
      httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
      nRcdExists_674 = (short)(0) ;
      nIsMod_674 = (short)(0) ;
      nRcdDeleted_674 = (short)(0) ;
      nBlankRcdCount674 = (short)(nBlankRcdUsr674+nBlankRcdCount674) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount674 > 0 )
      {
         standaloneNotModalL1674( ) ;
         standaloneModalL1674( ) ;
         addRowL1674( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDisComNTr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount674 = (short)(nBlankRcdCount674-1) ;
      }
      Gx_mode = sMode674 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A4430DisComUtr = B4430DisComUtr ;
      n4430DisComUtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
      A4432DisComTM = B4432DisComTM ;
      httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      A4431DisComTTr = B4431DisComTTr ;
      httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBTET.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBTET.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBTET.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBTET.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TALBTET.htm");
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
         Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z2524DisComLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2524DisComLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1056DisComCod = httpContext.cgiGet( "Z1056DisComCod") ;
         Z1032FonCod = httpContext.cgiGet( "Z1032FonCod") ;
         Z4430DisComUtr = (short)(localUtil.ctol( httpContext.cgiGet( "Z4430DisComUtr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O4430DisComUtr = (short)(localUtil.ctol( httpContext.cgiGet( "O4430DisComUtr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O4432DisComTM = localUtil.ctond( httpContext.cgiGet( "O4432DisComTM")) ;
         O4431DisComTTr = (int)(localUtil.ctol( httpContext.cgiGet( "O4431DisComTTr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_100 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_100"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2524DisComLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
         A1056DisComCod = httpContext.cgiGet( edtDisComCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
         A1032FonCod = httpContext.cgiGet( edtFonCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
         A4430DisComUtr = (short)(localUtil.ctol( httpContext.cgiGet( edtDisComUtr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4430DisComUtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
         A4431DisComTTr = (int)(localUtil.ctol( httpContext.cgiGet( edtDisComTTr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         A4432DisComTM = localUtil.ctond( httpContext.cgiGet( edtDisComTM_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
         A4788DisComTrP = (int)(localUtil.ctol( httpContext.cgiGet( edtDisComTrP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
         A4437DisComTMP = localUtil.ctond( httpContext.cgiGet( edtDisComTMP_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
         A4789DisComTrS = (int)(localUtil.ctol( httpContext.cgiGet( edtDisComTrS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
         A4438DisComTMS = localUtil.ctond( httpContext.cgiGet( edtDisComTMS_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2524DisComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2524DisComLin), 2, 0));
            A1056DisComCod = httpContext.GetPar( "DisComCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1056DisComCod", A1056DisComCod);
            A1032FonCod = httpContext.GetPar( "FonCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1032FonCod", A1032FonCod);
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons_dsp( ) ;
            standaloneModal( ) ;
         }
         else
         {
            getEqualNoModal( ) ;
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
            initAllL1533( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_674_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_674_Enabled), 5, 0), !bGXsfl_100_Refreshing);
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
      disableAttributesL1533( ) ;
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

   public void confirm_L10( )
   {
      beforeValidateL1533( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsL1533( ) ;
         }
         else
         {
            checkExtendedTableL1533( ) ;
            if ( AnyError == 0 )
            {
               zmL1533( 19) ;
               zmL1533( 20) ;
               zmL1533( 21) ;
            }
            closeExtendedTableCursorsL1533( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode533 = Gx_mode ;
         confirm_L1674( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode533 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesL10( ) ;
      }
   }

   public void confirm_L1674( )
   {
      s4430DisComUtr = O4430DisComUtr ;
      n4430DisComUtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
      s4432DisComTM = O4432DisComTM ;
      httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      s4431DisComTTr = O4431DisComTTr ;
      httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
      s4437DisComTMP = O4437DisComTMP ;
      httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
      s4438DisComTMS = O4438DisComTMS ;
      httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
      s4788DisComTrP = O4788DisComTrP ;
      httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
      s4789DisComTrS = O4789DisComTrS ;
      httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRowL1674( ) ;
         if ( ( nRcdExists_674 != 0 ) || ( nIsMod_674 != 0 ) )
         {
            getKeyL1674( ) ;
            if ( ( nRcdExists_674 == 0 ) && ( nRcdDeleted_674 == 0 ) )
            {
               if ( RcdFound674 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateL1674( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableL1674( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsL1674( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O4430DisComUtr = A4430DisComUtr ;
                     n4430DisComUtr = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
                     O4432DisComTM = A4432DisComTM ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
                     O4431DisComTTr = A4431DisComTTr ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
                     O4437DisComTMP = A4437DisComTMP ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
                     O4438DisComTMS = A4438DisComTMS ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
                     O4788DisComTrP = A4788DisComTrP ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
                     O4789DisComTrS = A4789DisComTrS ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound674 != 0 )
               {
                  if ( nRcdDeleted_674 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyL1674( ) ;
                     loadL1674( ) ;
                     beforeValidateL1674( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsL1674( ) ;
                        O4430DisComUtr = A4430DisComUtr ;
                        n4430DisComUtr = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
                        O4432DisComTM = A4432DisComTM ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
                        O4431DisComTTr = A4431DisComTTr ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
                        O4437DisComTMP = A4437DisComTMP ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
                        O4438DisComTMS = A4438DisComTMS ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
                        O4788DisComTrP = A4788DisComTrP ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
                        O4789DisComTrS = A4789DisComTrS ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_674 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateL1674( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableL1674( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsL1674( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O4430DisComUtr = A4430DisComUtr ;
                           n4430DisComUtr = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
                           O4432DisComTM = A4432DisComTM ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
                           O4431DisComTTr = A4431DisComTTr ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
                           O4437DisComTMP = A4437DisComTMP ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
                           O4438DisComTMS = A4438DisComTMS ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
                           O4788DisComTrP = A4788DisComTrP ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
                           O4789DisComTrS = A4789DisComTrS ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_674 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_674_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_674, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComTro_Internalname, GXutil.ltrim( localUtil.ntoc( A4433DisComTro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComNTr_Internalname, GXutil.ltrim( localUtil.ntoc( A4434DisComNTr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComMts_Internalname, GXutil.ltrim( localUtil.ntoc( A4435DisComMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbDisComTtp.getInternalname(), GXutil.rtrim( A4436DisComTtp)) ;
         httpContext.changePostValue( edtDisComTMT_Internalname, GXutil.ltrim( localUtil.ntoc( A4790DisComTMT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4433DisComTro_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z4433DisComTro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4790DisComTMT_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z4790DisComTMT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4434DisComNTr_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z4434DisComNTr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4435DisComMts_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z4435DisComMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4436DisComTtp_"+sGXsfl_100_idx, GXutil.rtrim( Z4436DisComTtp)) ;
         httpContext.changePostValue( "T4790DisComTMT_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O4790DisComTMT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4434DisComNTr_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O4434DisComNTr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_674_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_674, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_674_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_674, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_674_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_674, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_674 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_674_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_674_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMTRO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComTro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMNTR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComNTr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMMTS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMTTP_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbDisComTtp.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMTMT_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComTMT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O4430DisComUtr = s4430DisComUtr ;
      n4430DisComUtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
      O4432DisComTM = s4432DisComTM ;
      httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      O4431DisComTTr = s4431DisComTTr ;
      httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
      O4437DisComTMP = s4437DisComTMP ;
      httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
      O4438DisComTMS = s4438DisComTMS ;
      httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
      O4788DisComTrP = s4788DisComTrP ;
      httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
      O4789DisComTrS = s4789DisComTrS ;
      httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionL10( )
   {
   }

   public void zmL1533( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4430DisComUtr = T00L15_A4430DisComUtr[0] ;
         }
         else
         {
            Z4430DisComUtr = A4430DisComUtr ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         Z4430DisComUtr = A4430DisComUtr ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z30AlbProCod = A30AlbProCod ;
         Z407EmprNom = A407EmprNom ;
         Z4431DisComTTr = A4431DisComTTr ;
         Z4432DisComTM = A4432DisComTM ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisComUtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComUtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComUtr_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisComUtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComUtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComUtr_Enabled), 5, 0), true);
      /* Using cursor T00L16 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00L16_A407EmprNom[0] ;
      n407EmprNom = T00L16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T00L17 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
      /* Using cursor T00L19 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A4431DisComTTr = T00L19_A4431DisComTTr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         A4432DisComTM = T00L19_A4432DisComTM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      }
      else
      {
         A4431DisComTTr = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         A4432DisComTM = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      }
      O4431DisComTTr = A4431DisComTTr ;
      httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
      O4432DisComTM = A4432DisComTM ;
      httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      pr_default.close(6);
      A4788DisComTrP = getDisComTrP0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
      A4437DisComTMP = getDisComTMP0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
      A4789DisComTrS = getDisComTrS0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
      A4438DisComTMS = getDisComTMS0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
   }

   public void standaloneModal( )
   {
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

   public void loadL1533( )
   {
      /* Using cursor T00L111 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound533 = (short)(1) ;
         A407EmprNom = T00L111_A407EmprNom[0] ;
         n407EmprNom = T00L111_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4430DisComUtr = T00L111_A4430DisComUtr[0] ;
         n4430DisComUtr = T00L111_n4430DisComUtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
         A4431DisComTTr = T00L111_A4431DisComTTr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         A4432DisComTM = T00L111_A4432DisComTM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
         zmL1533( -18) ;
      }
      pr_default.close(7);
      onLoadActionsL1533( ) ;
   }

   public void onLoadActionsL1533( )
   {
      O4432DisComTM = A4432DisComTM ;
      httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      O4431DisComTTr = A4431DisComTTr ;
      httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
   }

   public void checkExtendedTableL1533( )
   {
      nIsDirty_533 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsL1533( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyL1533( )
   {
      /* Using cursor T00L112 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound533 = (short)(1) ;
      }
      else
      {
         RcdFound533 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00L15 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(3) != 101) && ( T00L15_A2524DisComLin[0] == A2524DisComLin ) && ( GXutil.strcmp(T00L15_A1056DisComCod[0], A1056DisComCod) == 0 ) && ( GXutil.strcmp(T00L15_A1032FonCod[0], A1032FonCod) == 0 ) && ( GXutil.strcmp(T00L15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L15_A129BarCod[0] == A129BarCod ) && ( T00L15_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00L15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00L15_A30AlbProCod[0] == A30AlbProCod ) )
      {
         zmL1533( 18) ;
         RcdFound533 = (short)(1) ;
         A4430DisComUtr = T00L15_A4430DisComUtr[0] ;
         n4430DisComUtr = T00L15_n4430DisComUtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
         O4430DisComUtr = A4430DisComUtr ;
         n4430DisComUtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         sMode533 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadL1533( ) ;
         if ( AnyError == 1 )
         {
            RcdFound533 = (short)(0) ;
            initializeNonKeyL1533( ) ;
         }
         Gx_mode = sMode533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound533 = (short)(0) ;
         initializeNonKeyL1533( ) ;
         sMode533 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyL1533( ) ;
      if ( RcdFound533 == 0 )
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
      RcdFound533 = (short)(0) ;
      /* Using cursor T00L113 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00L113_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L113_A30AlbProCod[0] == A30AlbProCod ) && ( T00L113_A129BarCod[0] == A129BarCod ) && ( T00L113_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00L113_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00L113_A2524DisComLin[0] == A2524DisComLin ) && ( GXutil.strcmp(T00L113_A1056DisComCod[0], A1056DisComCod) == 0 ) && ( GXutil.strcmp(T00L113_A1032FonCod[0], A1032FonCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00L113_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L113_A30AlbProCod[0] == A30AlbProCod ) && ( T00L113_A129BarCod[0] == A129BarCod ) && ( T00L113_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00L113_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00L113_A2524DisComLin[0] == A2524DisComLin ) && ( GXutil.strcmp(T00L113_A1056DisComCod[0], A1056DisComCod) == 0 ) && ( GXutil.strcmp(T00L113_A1032FonCod[0], A1032FonCod) == 0 ) )
         {
            RcdFound533 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound533 = (short)(0) ;
      /* Using cursor T00L114 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00L114_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L114_A30AlbProCod[0] == A30AlbProCod ) && ( T00L114_A129BarCod[0] == A129BarCod ) && ( T00L114_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00L114_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00L114_A2524DisComLin[0] == A2524DisComLin ) && ( GXutil.strcmp(T00L114_A1056DisComCod[0], A1056DisComCod) == 0 ) && ( GXutil.strcmp(T00L114_A1032FonCod[0], A1032FonCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00L114_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L114_A30AlbProCod[0] == A30AlbProCod ) && ( T00L114_A129BarCod[0] == A129BarCod ) && ( T00L114_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00L114_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00L114_A2524DisComLin[0] == A2524DisComLin ) && ( GXutil.strcmp(T00L114_A1056DisComCod[0], A1056DisComCod) == 0 ) && ( GXutil.strcmp(T00L114_A1032FonCod[0], A1032FonCod) == 0 ) )
         {
            RcdFound533 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyL1533( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A4430DisComUtr = O4430DisComUtr ;
         n4430DisComUtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
         A4432DisComTM = O4432DisComTM ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
         A4431DisComTTr = O4431DisComTTr ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         A4437DisComTMP = O4437DisComTMP ;
         httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
         A4438DisComTMS = O4438DisComTMS ;
         httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
         A4788DisComTrP = O4788DisComTrP ;
         httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
         A4789DisComTrS = O4789DisComTrS ;
         httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
         insertL1533( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound533 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2524DisComLin != Z2524DisComLin ) || ( GXutil.strcmp(A1056DisComCod, Z1056DisComCod) != 0 ) || ( GXutil.strcmp(A1032FonCod, Z1032FonCod) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A4430DisComUtr = O4430DisComUtr ;
               n4430DisComUtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
               A4432DisComTM = O4432DisComTM ;
               httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
               A4431DisComTTr = O4431DisComTTr ;
               httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
               A4437DisComTMP = O4437DisComTMP ;
               httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
               A4438DisComTMS = O4438DisComTMS ;
               httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
               A4788DisComTrP = O4788DisComTrP ;
               httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
               A4789DisComTrS = O4789DisComTrS ;
               httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A4430DisComUtr = O4430DisComUtr ;
               n4430DisComUtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
               A4432DisComTM = O4432DisComTM ;
               httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
               A4431DisComTTr = O4431DisComTTr ;
               httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
               A4437DisComTMP = O4437DisComTMP ;
               httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
               A4438DisComTMS = O4438DisComTMS ;
               httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
               A4788DisComTrP = O4788DisComTrP ;
               httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
               A4789DisComTrS = O4789DisComTrS ;
               httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
               updateL1533( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2524DisComLin != Z2524DisComLin ) || ( GXutil.strcmp(A1056DisComCod, Z1056DisComCod) != 0 ) || ( GXutil.strcmp(A1032FonCod, Z1032FonCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A4430DisComUtr = O4430DisComUtr ;
               n4430DisComUtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
               A4432DisComTM = O4432DisComTM ;
               httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
               A4431DisComTTr = O4431DisComTTr ;
               httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
               A4437DisComTMP = O4437DisComTMP ;
               httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
               A4438DisComTMS = O4438DisComTMS ;
               httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
               A4788DisComTrP = O4788DisComTrP ;
               httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
               A4789DisComTrS = O4789DisComTrS ;
               httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
               insertL1533( ) ;
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
                  A4430DisComUtr = O4430DisComUtr ;
                  n4430DisComUtr = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
                  A4432DisComTM = O4432DisComTM ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
                  A4431DisComTTr = O4431DisComTTr ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
                  A4437DisComTMP = O4437DisComTMP ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
                  A4438DisComTMS = O4438DisComTMS ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
                  A4788DisComTrP = O4788DisComTrP ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
                  A4789DisComTrS = O4789DisComTrS ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
                  insertL1533( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2524DisComLin != Z2524DisComLin ) || ( GXutil.strcmp(A1056DisComCod, Z1056DisComCod) != 0 ) || ( GXutil.strcmp(A1032FonCod, Z1032FonCod) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A4430DisComUtr = O4430DisComUtr ;
         n4430DisComUtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
         A4432DisComTM = O4432DisComTM ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
         A4431DisComTTr = O4431DisComTTr ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         A4437DisComTMP = O4437DisComTMP ;
         httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
         A4438DisComTMS = O4438DisComTMS ;
         httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
         A4788DisComTrP = O4788DisComTrP ;
         httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
         A4789DisComTrS = O4789DisComTrS ;
         httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
         delete( ) ;
         afterTrn( ) ;
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
      getKeyL1533( ) ;
      if ( RcdFound533 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2524DisComLin != Z2524DisComLin ) || ( GXutil.strcmp(A1056DisComCod, Z1056DisComCod) != 0 ) || ( GXutil.strcmp(A1032FonCod, Z1032FonCod) != 0 ) )
         {
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2524DisComLin != Z2524DisComLin ) || ( GXutil.strcmp(A1056DisComCod, Z1056DisComCod) != 0 ) || ( GXutil.strcmp(A1032FonCod, Z1032FonCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "talbtet");
   }

   public void insert_check( )
   {
      confirm_L10( ) ;
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
      if ( RcdFound533 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartL1533( ) ;
      if ( RcdFound533 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndL1533( ) ;
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
      if ( RcdFound533 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
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
      if ( RcdFound533 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartL1533( ) ;
      if ( RcdFound533 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound533 != 0 )
         {
            scanNextL1533( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndL1533( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyL1533( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00L14 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEST"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z4430DisComUtr != T00L14_A4430DisComUtr[0] ) )
         {
            if ( Z4430DisComUtr != T00L14_A4430DisComUtr[0] )
            {
               GXutil.writeLogln("talbtet:[seudo value changed for attri]"+"DisComUtr");
               GXutil.writeLogRaw("Old: ",Z4430DisComUtr);
               GXutil.writeLogRaw("Current: ",T00L14_A4430DisComUtr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBEST"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertL1533( )
   {
      beforeValidateL1533( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL1533( ) ;
      }
      if ( AnyError == 0 )
      {
         zmL1533( 0) ;
         checkOptimisticConcurrencyL1533( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmL1533( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertL1533( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L115 */
                  pr_default.execute(11, new Object[] {Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n4430DisComUtr), Short.valueOf(A4430DisComUtr), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        processLevelL1533( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionL10( ) ;
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
            loadL1533( ) ;
         }
         endLevelL1533( ) ;
      }
      closeExtendedTableCursorsL1533( ) ;
   }

   public void updateL1533( )
   {
      beforeValidateL1533( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL1533( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyL1533( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmL1533( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateL1533( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L116 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n4430DisComUtr), Short.valueOf(A4430DisComUtr), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEST"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateL1533( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelL1533( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionL10( ) ;
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
         endLevelL1533( ) ;
      }
      closeExtendedTableCursorsL1533( ) ;
   }

   public void deferredUpdateL1533( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateL1533( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyL1533( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsL1533( ) ;
         afterConfirmL1533( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteL1533( ) ;
            if ( AnyError == 0 )
            {
               A4430DisComUtr = O4430DisComUtr ;
               n4430DisComUtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
               A4432DisComTM = O4432DisComTM ;
               httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
               A4431DisComTTr = O4431DisComTTr ;
               httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
               A4437DisComTMP = O4437DisComTMP ;
               httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
               A4438DisComTMS = O4438DisComTMS ;
               httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
               A4788DisComTrP = O4788DisComTrP ;
               httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
               A4789DisComTrS = O4789DisComTrS ;
               httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
               scanStartL1674( ) ;
               while ( RcdFound674 != 0 )
               {
                  getByPrimaryKeyL1674( ) ;
                  deleteL1674( ) ;
                  scanNextL1674( ) ;
                  O4430DisComUtr = A4430DisComUtr ;
                  n4430DisComUtr = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
                  O4432DisComTM = A4432DisComTM ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
                  O4431DisComTTr = A4431DisComTTr ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
                  O4437DisComTMP = A4437DisComTMP ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
                  O4438DisComTMS = A4438DisComTMS ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
                  O4788DisComTrP = A4788DisComTrP ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
                  O4789DisComTrS = A4789DisComTrS ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
               }
               scanEndL1674( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L117 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound533 == 0 )
                        {
                           initAllL1533( ) ;
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
                        resetCaptionL10( ) ;
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
      sMode533 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelL1533( ) ;
      Gx_mode = sMode533 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsL1533( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00L118 */
         pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T00L119 */
         pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METROS PIEZA (ALB.ESTAMPACION)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T00L120 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBETE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00L121 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void processNestedLevelL1674( )
   {
      s4430DisComUtr = O4430DisComUtr ;
      n4430DisComUtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
      s4432DisComTM = O4432DisComTM ;
      httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      s4431DisComTTr = O4431DisComTTr ;
      httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
      s4437DisComTMP = O4437DisComTMP ;
      httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
      s4438DisComTMS = O4438DisComTMS ;
      httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
      s4788DisComTrP = O4788DisComTrP ;
      httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
      s4789DisComTrS = O4789DisComTrS ;
      httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRowL1674( ) ;
         if ( ( nRcdExists_674 != 0 ) || ( nIsMod_674 != 0 ) )
         {
            standaloneNotModalL1674( ) ;
            getKeyL1674( ) ;
            if ( ( nRcdExists_674 == 0 ) && ( nRcdDeleted_674 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertL1674( ) ;
            }
            else
            {
               if ( RcdFound674 != 0 )
               {
                  if ( ( nRcdDeleted_674 != 0 ) && ( nRcdExists_674 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteL1674( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_674 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateL1674( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_674 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O4430DisComUtr = A4430DisComUtr ;
            n4430DisComUtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
            O4432DisComTM = A4432DisComTM ;
            httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
            O4431DisComTTr = A4431DisComTTr ;
            httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
            O4437DisComTMP = A4437DisComTMP ;
            httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
            O4438DisComTMS = A4438DisComTMS ;
            httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
            O4788DisComTrP = A4788DisComTrP ;
            httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
            O4789DisComTrS = A4789DisComTrS ;
            httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_674_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_674, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComTro_Internalname, GXutil.ltrim( localUtil.ntoc( A4433DisComTro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComNTr_Internalname, GXutil.ltrim( localUtil.ntoc( A4434DisComNTr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComMts_Internalname, GXutil.ltrim( localUtil.ntoc( A4435DisComMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbDisComTtp.getInternalname(), GXutil.rtrim( A4436DisComTtp)) ;
         httpContext.changePostValue( edtDisComTMT_Internalname, GXutil.ltrim( localUtil.ntoc( A4790DisComTMT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4433DisComTro_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z4433DisComTro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4790DisComTMT_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z4790DisComTMT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4434DisComNTr_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z4434DisComNTr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4435DisComMts_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z4435DisComMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4436DisComTtp_"+sGXsfl_100_idx, GXutil.rtrim( Z4436DisComTtp)) ;
         httpContext.changePostValue( "T4790DisComTMT_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O4790DisComTMT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4434DisComNTr_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O4434DisComNTr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_674_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_674, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_674_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_674, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_674_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_674, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_674 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_674_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_674_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMTRO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComTro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMNTR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComNTr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMMTS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMTTP_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbDisComTtp.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMTMT_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComTMT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllL1674( ) ;
      if ( AnyError != 0 )
      {
         O4430DisComUtr = s4430DisComUtr ;
         n4430DisComUtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
         O4432DisComTM = s4432DisComTM ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
         O4431DisComTTr = s4431DisComTTr ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         O4437DisComTMP = s4437DisComTMP ;
         httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
         O4438DisComTMS = s4438DisComTMS ;
         httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
         O4788DisComTrP = s4788DisComTrP ;
         httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
         O4789DisComTrS = s4789DisComTrS ;
         httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
      }
      nRcdExists_674 = (short)(0) ;
      nIsMod_674 = (short)(0) ;
      nRcdDeleted_674 = (short)(0) ;
   }

   public void processLevelL1533( )
   {
      /* Save parent mode. */
      sMode533 = Gx_mode ;
      processNestedLevelL1674( ) ;
      if ( AnyError != 0 )
      {
         O4430DisComUtr = s4430DisComUtr ;
         n4430DisComUtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
         O4432DisComTM = s4432DisComTM ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
         O4431DisComTTr = s4431DisComTTr ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         O4437DisComTMP = s4437DisComTMP ;
         httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
         O4438DisComTMS = s4438DisComTMS ;
         httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
         O4788DisComTrP = s4788DisComTrP ;
         httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
         O4789DisComTrS = s4789DisComTrS ;
         httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode533 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00L122 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n4430DisComUtr), Short.valueOf(A4430DisComUtr), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
   }

   public void endLevelL1533( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeCompleteL1533( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talbtet");
         if ( AnyError == 0 )
         {
            confirmValuesL10( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talbtet");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartL1533( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A30AlbProCod = A30AlbProCod ;
      this.A129BarCod = A129BarCod ;
      this.A132BarCodReo = A132BarCodReo ;
      this.A130BarCodPar = A130BarCodPar ;
      this.A2524DisComLin = A2524DisComLin ;
      this.A1056DisComCod = A1056DisComCod ;
      this.A1032FonCod = A1032FonCod ;
      /* Scan By routine */
      /* Using cursor T00L123 */
      pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      RcdFound533 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound533 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextL1533( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound533 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound533 = (short)(1) ;
      }
   }

   public void scanEndL1533( )
   {
      pr_default.close(19);
   }

   public void afterConfirmL1533( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertL1533( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateL1533( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteL1533( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteL1533( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateL1533( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesL1533( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtDisComLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), true);
      edtDisComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), true);
      edtFonCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), true);
      edtDisComUtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComUtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComUtr_Enabled), 5, 0), true);
      edtDisComTTr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComTTr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComTTr_Enabled), 5, 0), true);
      edtDisComTM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComTM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComTM_Enabled), 5, 0), true);
      edtDisComTrP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComTrP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComTrP_Enabled), 5, 0), true);
      edtDisComTMP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComTMP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComTMP_Enabled), 5, 0), true);
      edtDisComTrS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComTrS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComTrS_Enabled), 5, 0), true);
      edtDisComTMS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComTMS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComTMS_Enabled), 5, 0), true);
   }

   public void zmL1674( int GX_JID )
   {
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4790DisComTMT = T00L13_A4790DisComTMT[0] ;
            Z4434DisComNTr = T00L13_A4434DisComNTr[0] ;
            Z4435DisComMts = T00L13_A4435DisComMts[0] ;
            Z4436DisComTtp = T00L13_A4436DisComTtp[0] ;
         }
         else
         {
            Z4790DisComTMT = A4790DisComTMT ;
            Z4434DisComNTr = A4434DisComNTr ;
            Z4435DisComMts = A4435DisComMts ;
            Z4436DisComTtp = A4436DisComTtp ;
         }
      }
      if ( GX_JID == -22 )
      {
         Z4790DisComTMT = A4790DisComTMT ;
         Z30AlbProCod = A30AlbProCod ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         Z4433DisComTro = A4433DisComTro ;
         Z4434DisComNTr = A4434DisComNTr ;
         Z4435DisComMts = A4435DisComMts ;
         Z4436DisComTtp = A4436DisComTtp ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
      }
   }

   public void standaloneNotModalL1674( )
   {
      edtDisComTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComTro_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtDisComUtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComUtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComUtr_Enabled), 5, 0), true);
      edtDisComUtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComUtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComUtr_Enabled), 5, 0), true);
      A4789DisComTrS = getDisComTrS0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
      O4789DisComTrS = A4789DisComTrS ;
      httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
      A4788DisComTrP = getDisComTrP0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
      O4788DisComTrP = A4788DisComTrP ;
      httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
      A4438DisComTMS = getDisComTMS0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
      O4438DisComTMS = A4438DisComTMS ;
      httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
      A4437DisComTMP = getDisComTMP0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
      O4437DisComTMP = A4437DisComTMP ;
      httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
   }

   public void standaloneModalL1674( )
   {
      if ( isIns( )  )
      {
         A4430DisComUtr = (short)(O4430DisComUtr+10) ;
         n4430DisComUtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A4433DisComTro = A4430DisComUtr ;
      }
   }

   public void loadL1674( )
   {
      /* Using cursor T00L124 */
      pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A4433DisComTro)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound674 = (short)(1) ;
         A4790DisComTMT = T00L124_A4790DisComTMT[0] ;
         A4434DisComNTr = T00L124_A4434DisComNTr[0] ;
         n4434DisComNTr = T00L124_n4434DisComNTr[0] ;
         A4435DisComMts = T00L124_A4435DisComMts[0] ;
         n4435DisComMts = T00L124_n4435DisComMts[0] ;
         A4436DisComTtp = T00L124_A4436DisComTtp[0] ;
         n4436DisComTtp = T00L124_n4436DisComTtp[0] ;
         zmL1674( -22) ;
      }
      pr_default.close(20);
      onLoadActionsL1674( ) ;
   }

   public void onLoadActionsL1674( )
   {
      A4790DisComTMT = DecimalUtil.doubleToDec(A4434DisComNTr).multiply(A4435DisComMts) ;
      if ( isIns( )  )
      {
         A4431DisComTTr = (int)(O4431DisComTTr+A4434DisComNTr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A4431DisComTTr = (int)(O4431DisComTTr+A4434DisComNTr-O4434DisComNTr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A4431DisComTTr = (int)(O4431DisComTTr-O4434DisComNTr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         A4432DisComTM = O4432DisComTM.add(A4790DisComTMT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A4432DisComTM = O4432DisComTM.add(A4790DisComTMT).subtract(O4790DisComTMT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A4432DisComTM = O4432DisComTM.subtract(O4790DisComTMT) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
            }
         }
      }
   }

   public void checkExtendedTableL1674( )
   {
      nIsDirty_674 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalL1674( ) ;
      nIsDirty_674 = (short)(1) ;
      A4790DisComTMT = DecimalUtil.doubleToDec(A4434DisComNTr).multiply(A4435DisComMts) ;
      if ( isIns( )  )
      {
         nIsDirty_674 = (short)(1) ;
         A4431DisComTTr = (int)(O4431DisComTTr+A4434DisComNTr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_674 = (short)(1) ;
            A4431DisComTTr = (int)(O4431DisComTTr+A4434DisComNTr-O4434DisComNTr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_674 = (short)(1) ;
               A4431DisComTTr = (int)(O4431DisComTTr-O4434DisComNTr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_674 = (short)(1) ;
         A4432DisComTM = O4432DisComTM.add(A4790DisComTMT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_674 = (short)(1) ;
            A4432DisComTM = O4432DisComTM.add(A4790DisComTMT).subtract(O4790DisComTMT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_674 = (short)(1) ;
               A4432DisComTM = O4432DisComTM.subtract(O4790DisComTMT) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
            }
         }
      }
   }

   public void closeExtendedTableCursorsL1674( )
   {
   }

   public void enableDisableL1674( )
   {
   }

   public void getKeyL1674( )
   {
      /* Using cursor T00L125 */
      pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A4433DisComTro)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound674 = (short)(1) ;
      }
      else
      {
         RcdFound674 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKeyL1674( )
   {
      /* Using cursor T00L13 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A4433DisComTro)});
      if ( (pr_default.getStatus(1) != 101) && ( T00L13_A30AlbProCod[0] == A30AlbProCod ) && ( T00L13_A2524DisComLin[0] == A2524DisComLin ) && ( GXutil.strcmp(T00L13_A1056DisComCod[0], A1056DisComCod) == 0 ) && ( GXutil.strcmp(T00L13_A1032FonCod[0], A1032FonCod) == 0 ) && ( GXutil.strcmp(T00L13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L13_A129BarCod[0] == A129BarCod ) && ( T00L13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00L13_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zmL1674( 22) ;
         RcdFound674 = (short)(1) ;
         initializeNonKeyL1674( ) ;
         A4790DisComTMT = T00L13_A4790DisComTMT[0] ;
         A4433DisComTro = T00L13_A4433DisComTro[0] ;
         A4434DisComNTr = T00L13_A4434DisComNTr[0] ;
         n4434DisComNTr = T00L13_n4434DisComNTr[0] ;
         A4435DisComMts = T00L13_A4435DisComMts[0] ;
         n4435DisComMts = T00L13_n4435DisComMts[0] ;
         A4436DisComTtp = T00L13_A4436DisComTtp[0] ;
         n4436DisComTtp = T00L13_n4436DisComTtp[0] ;
         O4790DisComTMT = A4790DisComTMT ;
         O4434DisComNTr = A4434DisComNTr ;
         n4434DisComNTr = false ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         Z4433DisComTro = A4433DisComTro ;
         sMode674 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalL1674( ) ;
         loadL1674( ) ;
         Gx_mode = sMode674 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound674 = (short)(0) ;
         initializeNonKeyL1674( ) ;
         sMode674 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalL1674( ) ;
         Gx_mode = sMode674 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesL1674( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyL1674( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00L12 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A4433DisComTro)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBTET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z4790DisComTMT, T00L12_A4790DisComTMT[0]) != 0 ) || ( Z4434DisComNTr != T00L12_A4434DisComNTr[0] ) || ( DecimalUtil.compareTo(Z4435DisComMts, T00L12_A4435DisComMts[0]) != 0 ) || ( GXutil.strcmp(Z4436DisComTtp, T00L12_A4436DisComTtp[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z4790DisComTMT, T00L12_A4790DisComTMT[0]) != 0 )
            {
               GXutil.writeLogln("talbtet:[seudo value changed for attri]"+"DisComTMT");
               GXutil.writeLogRaw("Old: ",Z4790DisComTMT);
               GXutil.writeLogRaw("Current: ",T00L12_A4790DisComTMT[0]);
            }
            if ( Z4434DisComNTr != T00L12_A4434DisComNTr[0] )
            {
               GXutil.writeLogln("talbtet:[seudo value changed for attri]"+"DisComNTr");
               GXutil.writeLogRaw("Old: ",Z4434DisComNTr);
               GXutil.writeLogRaw("Current: ",T00L12_A4434DisComNTr[0]);
            }
            if ( DecimalUtil.compareTo(Z4435DisComMts, T00L12_A4435DisComMts[0]) != 0 )
            {
               GXutil.writeLogln("talbtet:[seudo value changed for attri]"+"DisComMts");
               GXutil.writeLogRaw("Old: ",Z4435DisComMts);
               GXutil.writeLogRaw("Current: ",T00L12_A4435DisComMts[0]);
            }
            if ( GXutil.strcmp(Z4436DisComTtp, T00L12_A4436DisComTtp[0]) != 0 )
            {
               GXutil.writeLogln("talbtet:[seudo value changed for attri]"+"DisComTtp");
               GXutil.writeLogRaw("Old: ",Z4436DisComTtp);
               GXutil.writeLogRaw("Current: ",T00L12_A4436DisComTtp[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBTET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertL1674( )
   {
      beforeValidateL1674( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL1674( ) ;
      }
      if ( AnyError == 0 )
      {
         zmL1674( 0) ;
         checkOptimisticConcurrencyL1674( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmL1674( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertL1674( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L126 */
                  pr_default.execute(22, new Object[] {A4790DisComTMT, Long.valueOf(A30AlbProCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A4433DisComTro), Boolean.valueOf(n4434DisComNTr), Short.valueOf(A4434DisComNTr), Boolean.valueOf(n4435DisComMts), A4435DisComMts, Boolean.valueOf(n4436DisComTtp), A4436DisComTtp, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTET");
                  if ( (pr_default.getStatus(22) == 1) )
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
            loadL1674( ) ;
         }
         endLevelL1674( ) ;
      }
      closeExtendedTableCursorsL1674( ) ;
   }

   public void updateL1674( )
   {
      beforeValidateL1674( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL1674( ) ;
      }
      if ( ( nIsMod_674 != 0 ) || ( nIsDirty_674 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyL1674( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmL1674( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateL1674( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00L127 */
                     pr_default.execute(23, new Object[] {A4790DisComTMT, Boolean.valueOf(n4434DisComNTr), Short.valueOf(A4434DisComNTr), Boolean.valueOf(n4435DisComMts), A4435DisComMts, Boolean.valueOf(n4436DisComTtp), A4436DisComTtp, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A4433DisComTro)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTET");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBTET"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateL1674( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyL1674( ) ;
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
            endLevelL1674( ) ;
         }
      }
      closeExtendedTableCursorsL1674( ) ;
   }

   public void deferredUpdateL1674( )
   {
   }

   public void deleteL1674( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateL1674( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyL1674( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsL1674( ) ;
         afterConfirmL1674( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteL1674( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00L128 */
               pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A4433DisComTro)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTET");
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
      sMode674 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelL1674( ) ;
      Gx_mode = sMode674 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsL1674( )
   {
      standaloneModalL1674( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A4431DisComTTr = (int)(O4431DisComTTr+A4434DisComNTr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A4431DisComTTr = (int)(O4431DisComTTr+A4434DisComNTr-O4434DisComNTr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A4431DisComTTr = (int)(O4431DisComTTr-O4434DisComNTr) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
               }
            }
         }
         if ( isIns( )  )
         {
            A4432DisComTM = O4432DisComTM.add(A4790DisComTMT) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A4432DisComTM = O4432DisComTM.add(A4790DisComTMT).subtract(O4790DisComTMT) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A4432DisComTM = O4432DisComTM.subtract(O4790DisComTMT) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
               }
            }
         }
      }
   }

   public void endLevelL1674( )
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

   public void scanStartL1674( )
   {
      /* Scan By routine */
      /* Using cursor T00L129 */
      pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      RcdFound674 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound674 = (short)(1) ;
         A4433DisComTro = T00L129_A4433DisComTro[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextL1674( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound674 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound674 = (short)(1) ;
         A4433DisComTro = T00L129_A4433DisComTro[0] ;
      }
   }

   public void scanEndL1674( )
   {
      pr_default.close(25);
   }

   public void afterConfirmL1674( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertL1674( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateL1674( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteL1674( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteL1674( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateL1674( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesL1674( )
   {
      edtDisComTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComTro_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtDisComNTr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComNTr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComNTr_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtDisComMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComMts_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      cmbDisComTtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisComTtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDisComTtp.getEnabled(), 5, 0), !bGXsfl_100_Refreshing);
      edtDisComTMT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComTMT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComTMT_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void send_integrity_lvl_hashesL1674( )
   {
   }

   public void send_integrity_lvl_hashesL1533( )
   {
   }

   public void subsflControlProps_100674( )
   {
      edtavnRcdDeleted_674_Internalname = "vNRCDDELETED_674_"+sGXsfl_100_idx ;
      edtDisComTro_Internalname = "DISCOMTRO_"+sGXsfl_100_idx ;
      edtDisComNTr_Internalname = "DISCOMNTR_"+sGXsfl_100_idx ;
      edtDisComMts_Internalname = "DISCOMMTS_"+sGXsfl_100_idx ;
      cmbDisComTtp.setInternalname( "DISCOMTTP_"+sGXsfl_100_idx );
      edtDisComTMT_Internalname = "DISCOMTMT_"+sGXsfl_100_idx ;
   }

   public void subsflControlProps_fel_100674( )
   {
      edtavnRcdDeleted_674_Internalname = "vNRCDDELETED_674_"+sGXsfl_100_fel_idx ;
      edtDisComTro_Internalname = "DISCOMTRO_"+sGXsfl_100_fel_idx ;
      edtDisComNTr_Internalname = "DISCOMNTR_"+sGXsfl_100_fel_idx ;
      edtDisComMts_Internalname = "DISCOMMTS_"+sGXsfl_100_fel_idx ;
      cmbDisComTtp.setInternalname( "DISCOMTTP_"+sGXsfl_100_fel_idx );
      edtDisComTMT_Internalname = "DISCOMTMT_"+sGXsfl_100_fel_idx ;
   }

   public void addRowL1674( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_100674( ) ;
      sendRowL1674( ) ;
   }

   public void sendRowL1674( )
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
         if ( ((int)((nGXsfl_100_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_674_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_674_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_674, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_674_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_674), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_674), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_674_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_674_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComTro_Internalname,GXutil.ltrim( localUtil.ntoc( A4433DisComTro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComTro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4433DisComTro), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4433DisComTro), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComTro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComTro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_674_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComNTr_Internalname,GXutil.ltrim( localUtil.ntoc( A4434DisComNTr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComNTr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4434DisComNTr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4434DisComNTr), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComNTr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComNTr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_674_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComMts_Internalname,GXutil.ltrim( localUtil.ntoc( A4435DisComMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComMts_Enabled!=0) ? localUtil.format( A4435DisComMts, "ZZZZZ9.99") : localUtil.format( A4435DisComMts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,104);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_674_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      if ( ( cmbDisComTtp.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "DISCOMTTP_" + sGXsfl_100_idx ;
         cmbDisComTtp.setName( GXCCtl );
         cmbDisComTtp.setWebtags( "" );
         cmbDisComTtp.addItem("P", httpContext.getMessage( "Primera", ""), (short)(0));
         cmbDisComTtp.addItem("S", httpContext.getMessage( "Segunda", ""), (short)(0));
         if ( cmbDisComTtp.getItemCount() > 0 )
         {
            A4436DisComTtp = cmbDisComTtp.getValidValue(A4436DisComTtp) ;
            n4436DisComTtp = false ;
         }
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbDisComTtp,cmbDisComTtp.getInternalname(),GXutil.rtrim( A4436DisComTtp),Integer.valueOf(1),cmbDisComTtp.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbDisComTtp.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbDisComTtp.setValue( GXutil.rtrim( A4436DisComTtp) );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisComTtp.getInternalname(), "Values", cmbDisComTtp.ToJavascriptSource(), !bGXsfl_100_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComTMT_Internalname,GXutil.ltrim( localUtil.ntoc( A4790DisComTMT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComTMT_Enabled!=0) ? localUtil.format( A4790DisComTMT, "ZZZZZ9.99") : localUtil.format( A4790DisComTMT, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComTMT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComTMT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesL1674( ) ;
      GXCCtl = "Z4433DisComTro_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4433DisComTro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4790DisComTMT_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4790DisComTMT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4434DisComNTr_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4434DisComNTr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4435DisComMts_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4435DisComMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4436DisComTtp_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4436DisComTtp));
      GXCCtl = "O4790DisComTMT_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4790DisComTMT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4434DisComNTr_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4434DisComNTr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_674_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_674, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_674_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_674, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_674_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_674, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_674_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_674_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMTRO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComTro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMNTR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComNTr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMMTS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMTTP_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbDisComTtp.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMTMT_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComTMT_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowL1674( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_100674( ) ;
      edtavnRcdDeleted_674_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_674_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComTro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMTRO_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComNTr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMNTR_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMMTS_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbDisComTtp.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMTTP_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtDisComTMT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMTMT_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_674_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_674_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_674");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_674_Internalname ;
         wbErr = true ;
         nRcdDeleted_674 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_674 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_674_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4433DisComTro = (short)(localUtil.ctol( httpContext.cgiGet( edtDisComTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisComNTr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisComNTr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISCOMNTR_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComNTr_Internalname ;
         wbErr = true ;
         A4434DisComNTr = (short)(0) ;
         n4434DisComNTr = false ;
      }
      else
      {
         A4434DisComNTr = (short)(localUtil.ctol( httpContext.cgiGet( edtDisComNTr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4434DisComNTr = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisComMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisComMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DISCOMMTS_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComMts_Internalname ;
         wbErr = true ;
         A4435DisComMts = DecimalUtil.ZERO ;
         n4435DisComMts = false ;
      }
      else
      {
         A4435DisComMts = localUtil.ctond( httpContext.cgiGet( edtDisComMts_Internalname)) ;
         n4435DisComMts = false ;
      }
      cmbDisComTtp.setName( cmbDisComTtp.getInternalname() );
      cmbDisComTtp.setValue( httpContext.cgiGet( cmbDisComTtp.getInternalname()) );
      A4436DisComTtp = httpContext.cgiGet( cmbDisComTtp.getInternalname()) ;
      n4436DisComTtp = false ;
      A4790DisComTMT = localUtil.ctond( httpContext.cgiGet( edtDisComTMT_Internalname)) ;
      GXCCtl = "Z4433DisComTro_" + sGXsfl_100_idx ;
      Z4433DisComTro = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4790DisComTMT_" + sGXsfl_100_idx ;
      Z4790DisComTMT = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4434DisComNTr_" + sGXsfl_100_idx ;
      Z4434DisComNTr = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4435DisComMts_" + sGXsfl_100_idx ;
      Z4435DisComMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4436DisComTtp_" + sGXsfl_100_idx ;
      Z4436DisComTtp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O4790DisComTMT_" + sGXsfl_100_idx ;
      O4790DisComTMT = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O4434DisComNTr_" + sGXsfl_100_idx ;
      O4434DisComNTr = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_674_" + sGXsfl_100_idx ;
      nRcdDeleted_674 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_674_" + sGXsfl_100_idx ;
      nRcdExists_674 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_674_" + sGXsfl_100_idx ;
      nIsMod_674 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDisComTro_Enabled = edtDisComTro_Enabled ;
   }

   public void confirmValuesL10( )
   {
      nGXsfl_100_idx = 0 ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_100674( ) ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_100674( ) ;
         httpContext.changePostValue( "Z4433DisComTro_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z4433DisComTro_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4433DisComTro_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z4790DisComTMT_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z4790DisComTMT_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4790DisComTMT_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z4434DisComNTr_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z4434DisComNTr_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4434DisComNTr_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z4435DisComMts_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z4435DisComMts_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4435DisComMts_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z4436DisComTtp_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z4436DisComTtp_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4436DisComTtp_"+sGXsfl_100_idx) ;
      }
      httpContext.changePostValue( "O4790DisComTMT", httpContext.cgiGet( "T4790DisComTMT")) ;
      httpContext.deletePostValue( "T4790DisComTMT") ;
      httpContext.changePostValue( "O4434DisComNTr", httpContext.cgiGet( "T4434DisComNTr")) ;
      httpContext.deletePostValue( "T4434DisComNTr") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.talbtet", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2524DisComLin,2,0)),GXutil.URLEncode(GXutil.rtrim(A1056DisComCod)),GXutil.URLEncode(GXutil.rtrim(A1032FonCod))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","DisComLin","DisComCod","FonCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2524DisComLin", GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1056DisComCod", GXutil.rtrim( Z1056DisComCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1032FonCod", GXutil.rtrim( Z1032FonCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4430DisComUtr", GXutil.ltrim( localUtil.ntoc( Z4430DisComUtr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4430DisComUtr", GXutil.ltrim( localUtil.ntoc( O4430DisComUtr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4432DisComTM", GXutil.ltrim( localUtil.ntoc( O4432DisComTM, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4431DisComTTr", GXutil.ltrim( localUtil.ntoc( O4431DisComTTr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_100", GXutil.ltrim( localUtil.ntoc( nGXsfl_100_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.talbtet", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2524DisComLin,2,0)),GXutil.URLEncode(GXutil.rtrim(A1056DisComCod)),GXutil.URLEncode(GXutil.rtrim(A1032FonCod))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","DisComLin","DisComCod","FonCod"})  ;
   }

   public String getPgmname( )
   {
      return "TALBTET" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TROZOS COMBINACION", "") ;
   }

   public void initializeNonKeyL1533( )
   {
      A4430DisComUtr = (short)(0) ;
      n4430DisComUtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
      O4430DisComUtr = A4430DisComUtr ;
      n4430DisComUtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
      O4432DisComTM = A4432DisComTM ;
      httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      O4431DisComTTr = A4431DisComTTr ;
      httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
      Z4430DisComUtr = (short)(0) ;
   }

   public void initAllL1533( )
   {
      initializeNonKeyL1533( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyL1674( )
   {
      A4790DisComTMT = DecimalUtil.ZERO ;
      A4434DisComNTr = (short)(0) ;
      n4434DisComNTr = false ;
      A4435DisComMts = DecimalUtil.ZERO ;
      n4435DisComMts = false ;
      A4436DisComTtp = "" ;
      n4436DisComTtp = false ;
      O4790DisComTMT = A4790DisComTMT ;
      O4434DisComNTr = A4434DisComNTr ;
      n4434DisComNTr = false ;
      Z4790DisComTMT = DecimalUtil.ZERO ;
      Z4434DisComNTr = (short)(0) ;
      Z4435DisComMts = DecimalUtil.ZERO ;
      Z4436DisComTtp = "" ;
   }

   public void initAllL1674( )
   {
      A4433DisComTro = (short)(0) ;
      initializeNonKeyL1674( ) ;
   }

   public void standaloneModalInsertL1674( )
   {
      A4430DisComUtr = i4430DisComUtr ;
      n4430DisComUtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4430DisComUtr), 4, 0));
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241522289", true, true);
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
      httpContext.AddJavascriptSource("talbtet.js", "?20268241522289", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties674( )
   {
      edtDisComTro_Enabled = defedtDisComTro_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComTro_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void startgridcontrol100( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_674, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_674_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4433DisComTro, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComTro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4434DisComNTr, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComNTr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4435DisComMts, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4436DisComTtp));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbDisComTtp.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4790DisComTMT, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComTMT_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDisComLin_Internalname = "DISCOMLIN" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDisComCod_Internalname = "DISCOMCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtFonCod_Internalname = "FONCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDisComUtr_Internalname = "DISCOMUTR" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDisComTTr_Internalname = "DISCOMTTR" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDisComTM_Internalname = "DISCOMTM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDisComTrP_Internalname = "DISCOMTRP" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDisComTMP_Internalname = "DISCOMTMP" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDisComTrS_Internalname = "DISCOMTRS" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDisComTMS_Internalname = "DISCOMTMS" ;
      edtavnRcdDeleted_674_Internalname = "vNRCDDELETED_674" ;
      edtDisComTro_Internalname = "DISCOMTRO" ;
      edtDisComNTr_Internalname = "DISCOMNTR" ;
      edtDisComMts_Internalname = "DISCOMMTS" ;
      cmbDisComTtp.setInternalname( "DISCOMTTP" );
      edtDisComTMT_Internalname = "DISCOMTMT" ;
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
      Form.setCaption( httpContext.getMessage( "TROZOS COMBINACION", "") );
      edtDisComTMT_Jsonclick = "" ;
      cmbDisComTtp.setJsonclick( "" );
      edtDisComMts_Jsonclick = "" ;
      edtDisComNTr_Jsonclick = "" ;
      edtDisComTro_Jsonclick = "" ;
      edtavnRcdDeleted_674_Jsonclick = "" ;
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
      edtDisComTMT_Enabled = 0 ;
      cmbDisComTtp.setEnabled( 1 );
      edtDisComMts_Enabled = 1 ;
      edtDisComNTr_Enabled = 1 ;
      edtDisComTro_Enabled = 0 ;
      edtavnRcdDeleted_674_Enabled = 1 ;
      edtDisComTMS_Jsonclick = "" ;
      edtDisComTMS_Backcolor = (int)(0xFFFFFF) ;
      edtDisComTMS_Enabled = 0 ;
      edtDisComTrS_Jsonclick = "" ;
      edtDisComTrS_Backcolor = (int)(0xFFFFFF) ;
      edtDisComTrS_Enabled = 0 ;
      edtDisComTMP_Jsonclick = "" ;
      edtDisComTMP_Backcolor = (int)(0xFFFFFF) ;
      edtDisComTMP_Enabled = 0 ;
      edtDisComTrP_Jsonclick = "" ;
      edtDisComTrP_Backcolor = (int)(0xFFFFFF) ;
      edtDisComTrP_Enabled = 0 ;
      edtDisComTM_Jsonclick = "" ;
      edtDisComTM_Backcolor = (int)(0xFFFFFF) ;
      edtDisComTM_Enabled = 0 ;
      edtDisComTTr_Jsonclick = "" ;
      edtDisComTTr_Backcolor = (int)(0xFFFFFF) ;
      edtDisComTTr_Enabled = 0 ;
      edtDisComUtr_Jsonclick = "" ;
      edtDisComUtr_Backcolor = (int)(0xFFFFFF) ;
      edtDisComUtr_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtFonCod_Jsonclick = "" ;
      edtFonCod_Backcolor = (int)(0xFFFFFF) ;
      edtFonCod_Enabled = 0 ;
      edtDisComCod_Jsonclick = "" ;
      edtDisComCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisComCod_Enabled = 0 ;
      edtDisComLin_Jsonclick = "" ;
      edtDisComLin_Backcolor = (int)(0xFFFFFF) ;
      edtDisComLin_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbProCod_Enabled = 0 ;
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

   public void gx3asadiscomtrpL1533( String A396EmprCod ,
                                     long A30AlbProCod ,
                                     int A129BarCod ,
                                     byte A132BarCodReo ,
                                     String A130BarCodPar ,
                                     byte A2524DisComLin ,
                                     String A1056DisComCod ,
                                     String A1032FonCod )
   {
      A4788DisComTrP = getDisComTrP0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4788DisComTrP, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asadiscomtmpL1533( String A396EmprCod ,
                                     long A30AlbProCod ,
                                     int A129BarCod ,
                                     byte A132BarCodReo ,
                                     String A130BarCodPar ,
                                     byte A2524DisComLin ,
                                     String A1056DisComCod ,
                                     String A1032FonCod )
   {
      A4437DisComTMP = getDisComTMP0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4437DisComTMP, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asadiscomtrsL1533( String A396EmprCod ,
                                     long A30AlbProCod ,
                                     int A129BarCod ,
                                     byte A132BarCodReo ,
                                     String A130BarCodPar ,
                                     byte A2524DisComLin ,
                                     String A1056DisComCod ,
                                     String A1032FonCod )
   {
      A4789DisComTrS = getDisComTrS0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4789DisComTrS, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asadiscomtmsL1533( String A396EmprCod ,
                                     long A30AlbProCod ,
                                     int A129BarCod ,
                                     byte A132BarCodReo ,
                                     String A130BarCodPar ,
                                     byte A2524DisComLin ,
                                     String A1056DisComCod ,
                                     String A1032FonCod )
   {
      A4438DisComTMS = getDisComTMS0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4438DisComTMS, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx8asadiscomtrsL1674( String A396EmprCod ,
                                     long A30AlbProCod ,
                                     int A129BarCod ,
                                     byte A132BarCodReo ,
                                     String A130BarCodPar ,
                                     byte A2524DisComLin ,
                                     String A1056DisComCod ,
                                     String A1032FonCod )
   {
      A4789DisComTrS = getDisComTrS0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4789DisComTrS), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4789DisComTrS, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx9asadiscomtrpL1674( String A396EmprCod ,
                                     long A30AlbProCod ,
                                     int A129BarCod ,
                                     byte A132BarCodReo ,
                                     String A130BarCodPar ,
                                     byte A2524DisComLin ,
                                     String A1056DisComCod ,
                                     String A1032FonCod )
   {
      A4788DisComTrP = getDisComTrP0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4788DisComTrP), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4788DisComTrP, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx11asadiscomtmsL1674( String A396EmprCod ,
                                      long A30AlbProCod ,
                                      int A129BarCod ,
                                      byte A132BarCodReo ,
                                      String A130BarCodPar ,
                                      byte A2524DisComLin ,
                                      String A1056DisComCod ,
                                      String A1032FonCod )
   {
      A4438DisComTMS = getDisComTMS0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrimstr( A4438DisComTMS, 10, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4438DisComTMS, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx12asadiscomtmpL1674( String A396EmprCod ,
                                      long A30AlbProCod ,
                                      int A129BarCod ,
                                      byte A132BarCodReo ,
                                      String A130BarCodPar ,
                                      byte A2524DisComLin ,
                                      String A1056DisComCod ,
                                      String A1032FonCod )
   {
      A4437DisComTMP = getDisComTMP0( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrimstr( A4437DisComTMP, 10, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4437DisComTMP, (byte)(10), (byte)(2), ".", "")))+"\"") ;
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
      subsflControlProps_100674( ) ;
      while ( nGXsfl_100_idx <= nRC_GXsfl_100 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalL1674( ) ;
         standaloneModalL1674( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowL1674( ) ;
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_100674( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "DISCOMTTP_" + sGXsfl_100_idx ;
      cmbDisComTtp.setName( GXCCtl );
      cmbDisComTtp.setWebtags( "" );
      cmbDisComTtp.addItem("P", httpContext.getMessage( "Primera", ""), (short)(0));
      cmbDisComTtp.addItem("S", httpContext.getMessage( "Segunda", ""), (short)(0));
      if ( cmbDisComTtp.getItemCount() > 0 )
      {
         A4436DisComTtp = cmbDisComTtp.getValidValue(A4436DisComTtp) ;
         n4436DisComTtp = false ;
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00L130 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00L130_A407EmprNom[0] ;
      n407EmprNom = T00L130_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(26);
      /* Using cursor T00L131 */
      pr_default.execute(27, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      pr_default.close(27);
      /* Using cursor T00L133 */
      pr_default.execute(28, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(28) != 101) )
      {
         A4431DisComTTr = T00L133_A4431DisComTTr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         A4432DisComTM = T00L133_A4432DisComTM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      }
      else
      {
         A4431DisComTTr = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4431DisComTTr), 6, 0));
         A4432DisComTM = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrimstr( A4432DisComTM, 10, 2));
      }
      pr_default.close(28);
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
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

   public void valid_Foncod( )
   {
      n4430DisComUtr = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4430DisComUtr", GXutil.ltrim( localUtil.ntoc( A4430DisComUtr, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4431DisComTTr", GXutil.ltrim( localUtil.ntoc( A4431DisComTTr, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4432DisComTM", GXutil.ltrim( localUtil.ntoc( A4432DisComTM, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4788DisComTrP", GXutil.ltrim( localUtil.ntoc( A4788DisComTrP, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4437DisComTMP", GXutil.ltrim( localUtil.ntoc( A4437DisComTMP, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4789DisComTrS", GXutil.ltrim( localUtil.ntoc( A4789DisComTrS, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4438DisComTMS", GXutil.ltrim( localUtil.ntoc( A4438DisComTMS, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2524DisComLin", GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1056DisComCod", GXutil.rtrim( Z1056DisComCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1032FonCod", GXutil.rtrim( Z1032FonCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4430DisComUtr", GXutil.ltrim( localUtil.ntoc( Z4430DisComUtr, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4431DisComTTr", GXutil.ltrim( localUtil.ntoc( Z4431DisComTTr, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4432DisComTM", GXutil.ltrim( localUtil.ntoc( Z4432DisComTM, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4788DisComTrP", GXutil.ltrim( localUtil.ntoc( Z4788DisComTrP, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4437DisComTMP", GXutil.ltrim( localUtil.ntoc( Z4437DisComTMP, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4789DisComTrS", GXutil.ltrim( localUtil.ntoc( Z4789DisComTrS, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4438DisComTMS", GXutil.ltrim( localUtil.ntoc( Z4438DisComTMS, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4430DisComUtr", GXutil.ltrim( localUtil.ntoc( O4430DisComUtr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4432DisComTM", GXutil.ltrim( localUtil.ntoc( O4432DisComTM, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4431DisComTTr", GXutil.ltrim( localUtil.ntoc( O4431DisComTTr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2524DisComLin',fld:'DISCOMLIN',pic:'Z9'},{av:'A1056DisComCod',fld:'DISCOMCOD',pic:''},{av:'A1032FonCod',fld:'FONCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_DISCOMLIN","{handler:'valid_Discomlin',iparms:[]");
      setEventMetadata("VALID_DISCOMLIN",",oparms:[]}");
      setEventMetadata("VALID_DISCOMCOD","{handler:'valid_Discomcod',iparms:[]");
      setEventMetadata("VALID_DISCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_FONCOD","{handler:'valid_Foncod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A4430DisComUtr',fld:'DISCOMUTR',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2524DisComLin',fld:'DISCOMLIN',pic:'Z9'},{av:'A1056DisComCod',fld:'DISCOMCOD',pic:''},{av:'A1032FonCod',fld:'FONCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_FONCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4430DisComUtr',fld:'DISCOMUTR',pic:'ZZZ9'},{av:'A4431DisComTTr',fld:'DISCOMTTR',pic:'ZZZZZ9'},{av:'A4432DisComTM',fld:'DISCOMTM',pic:'ZZZZZZ9.99'},{av:'A4788DisComTrP',fld:'DISCOMTRP',pic:'ZZZZZ9'},{av:'A4437DisComTMP',fld:'DISCOMTMP',pic:'ZZZZZZ9.99'},{av:'A4789DisComTrS',fld:'DISCOMTRS',pic:'ZZZZZ9'},{av:'A4438DisComTMS',fld:'DISCOMTMS',pic:'ZZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z30AlbProCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2524DisComLin'},{av:'Z1056DisComCod'},{av:'Z1032FonCod'},{av:'Z407EmprNom'},{av:'Z4430DisComUtr'},{av:'Z4431DisComTTr'},{av:'Z4432DisComTM'},{av:'Z4788DisComTrP'},{av:'Z4437DisComTMP'},{av:'Z4789DisComTrS'},{av:'Z4438DisComTMS'},{av:'O4430DisComUtr'},{av:'O4432DisComTM'},{av:'O4431DisComTTr'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DISCOMUTR","{handler:'valid_Discomutr',iparms:[]");
      setEventMetadata("VALID_DISCOMUTR",",oparms:[]}");
      setEventMetadata("VALID_DISCOMTRO","{handler:'valid_Discomtro',iparms:[]");
      setEventMetadata("VALID_DISCOMTRO",",oparms:[]}");
      setEventMetadata("VALID_DISCOMNTR","{handler:'valid_Discomntr',iparms:[]");
      setEventMetadata("VALID_DISCOMNTR",",oparms:[]}");
      setEventMetadata("VALID_DISCOMMTS","{handler:'valid_Discommts',iparms:[]");
      setEventMetadata("VALID_DISCOMMTS",",oparms:[]}");
      setEventMetadata("VALID_DISCOMTMT","{handler:'valid_Discomtmt',iparms:[]");
      setEventMetadata("VALID_DISCOMTMT",",oparms:[]}");
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
      pr_default.close(26);
      pr_default.close(27);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisComTMS0( String E396EmprCod ,
                                              long E30AlbProCod ,
                                              int E129BarCod ,
                                              byte E132BarCodReo ,
                                              String E130BarCodPar ,
                                              byte E2524DisComLin ,
                                              String E1056DisComCod ,
                                              String E1032FonCod )
   {
      X4790DisComTMT = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor T00L134 */
      pr_default.execute(29, new Object[] {E396EmprCod, Long.valueOf(E30AlbProCod), Integer.valueOf(E129BarCod), Byte.valueOf(E132BarCodReo), E130BarCodPar, Byte.valueOf(E2524DisComLin), E1056DisComCod, E1032FonCod});
      while ( (pr_default.getStatus(29) != 101) )
      {
         if ( ( ( GXutil.strcmp(T00L134_A4436DisComTtp[0], httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E30AlbProCod == E30AlbProCod ) && ( E129BarCod == E129BarCod ) && ( E132BarCodReo == E132BarCodReo ) && ( GXutil.strcmp(E130BarCodPar, E130BarCodPar) == 0 ) && ( E2524DisComLin == E2524DisComLin ) && ( GXutil.strcmp(E1056DisComCod, E1056DisComCod) == 0 ) && ( GXutil.strcmp(E1032FonCod, E1032FonCod) == 0 ) ) )
         {
            if ( Gx_first )
            {
               X4790DisComTMT = T00L134_A4790DisComTMT[0] ;
               Gx_first = false ;
            }
            else
            {
               X4790DisComTMT = X4790DisComTMT.add(T00L134_A4790DisComTMT[0]) ;
            }
         }
         pr_default.readNext(29);
      }
      pr_default.close(29);
      return X4790DisComTMT ;
   }

   public int getDisComTrS0( String E396EmprCod ,
                             long E30AlbProCod ,
                             int E129BarCod ,
                             byte E132BarCodReo ,
                             String E130BarCodPar ,
                             byte E2524DisComLin ,
                             String E1056DisComCod ,
                             String E1032FonCod )
   {
      X4434DisComNTr = (short)(0) ;
      Gx_first = true ;
      /* Using cursor T00L135 */
      pr_default.execute(30, new Object[] {E396EmprCod, Long.valueOf(E30AlbProCod), Integer.valueOf(E129BarCod), Byte.valueOf(E132BarCodReo), E130BarCodPar, Byte.valueOf(E2524DisComLin), E1056DisComCod, E1032FonCod});
      while ( (pr_default.getStatus(30) != 101) )
      {
         if ( ( ( GXutil.strcmp(T00L135_A4436DisComTtp[0], httpContext.getMessage( httpContext.getMessage( "S", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E30AlbProCod == E30AlbProCod ) && ( E129BarCod == E129BarCod ) && ( E132BarCodReo == E132BarCodReo ) && ( GXutil.strcmp(E130BarCodPar, E130BarCodPar) == 0 ) && ( E2524DisComLin == E2524DisComLin ) && ( GXutil.strcmp(E1056DisComCod, E1056DisComCod) == 0 ) && ( GXutil.strcmp(E1032FonCod, E1032FonCod) == 0 ) ) )
         {
            if ( Gx_first )
            {
               X4434DisComNTr = T00L135_A4434DisComNTr[0] ;
               nX4434DisComNTr = false ;
               Gx_first = false ;
            }
            else
            {
               X4434DisComNTr = (short)(X4434DisComNTr+T00L135_A4434DisComNTr[0]) ;
               nX4434DisComNTr = false ;
            }
         }
         pr_default.readNext(30);
      }
      pr_default.close(30);
      return X4434DisComNTr ;
   }

   public java.math.BigDecimal getDisComTMP0( String E396EmprCod ,
                                              long E30AlbProCod ,
                                              int E129BarCod ,
                                              byte E132BarCodReo ,
                                              String E130BarCodPar ,
                                              byte E2524DisComLin ,
                                              String E1056DisComCod ,
                                              String E1032FonCod )
   {
      X4790DisComTMT = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor T00L136 */
      pr_default.execute(31, new Object[] {E396EmprCod, Long.valueOf(E30AlbProCod), Integer.valueOf(E129BarCod), Byte.valueOf(E132BarCodReo), E130BarCodPar, Byte.valueOf(E2524DisComLin), E1056DisComCod, E1032FonCod});
      while ( (pr_default.getStatus(31) != 101) )
      {
         if ( ( ( GXutil.strcmp(T00L136_A4436DisComTtp[0], httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E30AlbProCod == E30AlbProCod ) && ( E129BarCod == E129BarCod ) && ( E132BarCodReo == E132BarCodReo ) && ( GXutil.strcmp(E130BarCodPar, E130BarCodPar) == 0 ) && ( E2524DisComLin == E2524DisComLin ) && ( GXutil.strcmp(E1056DisComCod, E1056DisComCod) == 0 ) && ( GXutil.strcmp(E1032FonCod, E1032FonCod) == 0 ) ) )
         {
            if ( Gx_first )
            {
               X4790DisComTMT = T00L136_A4790DisComTMT[0] ;
               Gx_first = false ;
            }
            else
            {
               X4790DisComTMT = X4790DisComTMT.add(T00L136_A4790DisComTMT[0]) ;
            }
         }
         pr_default.readNext(31);
      }
      pr_default.close(31);
      return X4790DisComTMT ;
   }

   public int getDisComTrP0( String E396EmprCod ,
                             long E30AlbProCod ,
                             int E129BarCod ,
                             byte E132BarCodReo ,
                             String E130BarCodPar ,
                             byte E2524DisComLin ,
                             String E1056DisComCod ,
                             String E1032FonCod )
   {
      X4434DisComNTr = (short)(0) ;
      Gx_first = true ;
      /* Using cursor T00L137 */
      pr_default.execute(32, new Object[] {E396EmprCod, Long.valueOf(E30AlbProCod), Integer.valueOf(E129BarCod), Byte.valueOf(E132BarCodReo), E130BarCodPar, Byte.valueOf(E2524DisComLin), E1056DisComCod, E1032FonCod});
      while ( (pr_default.getStatus(32) != 101) )
      {
         if ( ( ( GXutil.strcmp(T00L137_A4436DisComTtp[0], httpContext.getMessage( httpContext.getMessage( "P", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E30AlbProCod == E30AlbProCod ) && ( E129BarCod == E129BarCod ) && ( E132BarCodReo == E132BarCodReo ) && ( GXutil.strcmp(E130BarCodPar, E130BarCodPar) == 0 ) && ( E2524DisComLin == E2524DisComLin ) && ( GXutil.strcmp(E1056DisComCod, E1056DisComCod) == 0 ) && ( GXutil.strcmp(E1032FonCod, E1032FonCod) == 0 ) ) )
         {
            if ( Gx_first )
            {
               X4434DisComNTr = T00L137_A4434DisComNTr[0] ;
               nX4434DisComNTr = false ;
               Gx_first = false ;
            }
            else
            {
               X4434DisComNTr = (short)(X4434DisComNTr+T00L137_A4434DisComNTr[0]) ;
               nX4434DisComNTr = false ;
            }
         }
         pr_default.readNext(32);
      }
      pr_default.close(32);
      return X4434DisComNTr ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA1056DisComCod = "" ;
      wcpOA1032FonCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z1056DisComCod = "" ;
      Z1032FonCod = "" ;
      O4432DisComTM = DecimalUtil.ZERO ;
      Z4790DisComTMT = DecimalUtil.ZERO ;
      Z4435DisComMts = DecimalUtil.ZERO ;
      Z4436DisComTtp = "" ;
      O4790DisComTMT = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A4432DisComTM = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A4437DisComTMP = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A4438DisComTMS = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B4432DisComTM = DecimalUtil.ZERO ;
      sMode674 = "" ;
      Gx_mode = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode533 = "" ;
      s4432DisComTM = DecimalUtil.ZERO ;
      s4437DisComTMP = DecimalUtil.ZERO ;
      O4437DisComTMP = DecimalUtil.ZERO ;
      s4438DisComTMS = DecimalUtil.ZERO ;
      O4438DisComTMS = DecimalUtil.ZERO ;
      A4435DisComMts = DecimalUtil.ZERO ;
      A4436DisComTtp = "" ;
      A4790DisComTMT = DecimalUtil.ZERO ;
      T4790DisComTMT = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z4432DisComTM = DecimalUtil.ZERO ;
      T00L16_A407EmprNom = new String[] {""} ;
      T00L16_n407EmprNom = new boolean[] {false} ;
      T00L17_A396EmprCod = new String[] {""} ;
      T00L19_A4431DisComTTr = new int[1] ;
      T00L19_A4432DisComTM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L111_A2524DisComLin = new byte[1] ;
      T00L111_A1056DisComCod = new String[] {""} ;
      T00L111_A1032FonCod = new String[] {""} ;
      T00L111_A407EmprNom = new String[] {""} ;
      T00L111_n407EmprNom = new boolean[] {false} ;
      T00L111_A4430DisComUtr = new short[1] ;
      T00L111_n4430DisComUtr = new boolean[] {false} ;
      T00L111_A396EmprCod = new String[] {""} ;
      T00L111_A129BarCod = new int[1] ;
      T00L111_A132BarCodReo = new byte[1] ;
      T00L111_A130BarCodPar = new String[] {""} ;
      T00L111_A30AlbProCod = new long[1] ;
      T00L111_A4431DisComTTr = new int[1] ;
      T00L111_A4432DisComTM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L112_A396EmprCod = new String[] {""} ;
      T00L112_A30AlbProCod = new long[1] ;
      T00L112_A129BarCod = new int[1] ;
      T00L112_A132BarCodReo = new byte[1] ;
      T00L112_A130BarCodPar = new String[] {""} ;
      T00L112_A2524DisComLin = new byte[1] ;
      T00L112_A1056DisComCod = new String[] {""} ;
      T00L112_A1032FonCod = new String[] {""} ;
      T00L15_A2524DisComLin = new byte[1] ;
      T00L15_A1056DisComCod = new String[] {""} ;
      T00L15_A1032FonCod = new String[] {""} ;
      T00L15_A4430DisComUtr = new short[1] ;
      T00L15_n4430DisComUtr = new boolean[] {false} ;
      T00L15_A396EmprCod = new String[] {""} ;
      T00L15_A129BarCod = new int[1] ;
      T00L15_A132BarCodReo = new byte[1] ;
      T00L15_A130BarCodPar = new String[] {""} ;
      T00L15_A30AlbProCod = new long[1] ;
      T00L113_A396EmprCod = new String[] {""} ;
      T00L113_A30AlbProCod = new long[1] ;
      T00L113_A129BarCod = new int[1] ;
      T00L113_A132BarCodReo = new byte[1] ;
      T00L113_A130BarCodPar = new String[] {""} ;
      T00L113_A2524DisComLin = new byte[1] ;
      T00L113_A1056DisComCod = new String[] {""} ;
      T00L113_A1032FonCod = new String[] {""} ;
      T00L114_A396EmprCod = new String[] {""} ;
      T00L114_A30AlbProCod = new long[1] ;
      T00L114_A129BarCod = new int[1] ;
      T00L114_A132BarCodReo = new byte[1] ;
      T00L114_A130BarCodPar = new String[] {""} ;
      T00L114_A2524DisComLin = new byte[1] ;
      T00L114_A1056DisComCod = new String[] {""} ;
      T00L114_A1032FonCod = new String[] {""} ;
      T00L14_A2524DisComLin = new byte[1] ;
      T00L14_A1056DisComCod = new String[] {""} ;
      T00L14_A1032FonCod = new String[] {""} ;
      T00L14_A4430DisComUtr = new short[1] ;
      T00L14_n4430DisComUtr = new boolean[] {false} ;
      T00L14_A396EmprCod = new String[] {""} ;
      T00L14_A129BarCod = new int[1] ;
      T00L14_A132BarCodReo = new byte[1] ;
      T00L14_A130BarCodPar = new String[] {""} ;
      T00L14_A30AlbProCod = new long[1] ;
      T00L118_A396EmprCod = new String[] {""} ;
      T00L118_A30AlbProCod = new long[1] ;
      T00L118_A129BarCod = new int[1] ;
      T00L118_A132BarCodReo = new byte[1] ;
      T00L118_A130BarCodPar = new String[] {""} ;
      T00L118_A2524DisComLin = new byte[1] ;
      T00L118_A1056DisComCod = new String[] {""} ;
      T00L118_A1032FonCod = new String[] {""} ;
      T00L118_A200BarPieCod = new String[] {""} ;
      T00L119_A396EmprCod = new String[] {""} ;
      T00L119_A30AlbProCod = new long[1] ;
      T00L119_A129BarCod = new int[1] ;
      T00L119_A132BarCodReo = new byte[1] ;
      T00L119_A130BarCodPar = new String[] {""} ;
      T00L119_A2524DisComLin = new byte[1] ;
      T00L119_A1056DisComCod = new String[] {""} ;
      T00L119_A1032FonCod = new String[] {""} ;
      T00L119_A4336AlbEstPLin = new short[1] ;
      T00L120_A396EmprCod = new String[] {""} ;
      T00L120_A30AlbProCod = new long[1] ;
      T00L120_A129BarCod = new int[1] ;
      T00L120_A132BarCodReo = new byte[1] ;
      T00L120_A130BarCodPar = new String[] {""} ;
      T00L120_A2524DisComLin = new byte[1] ;
      T00L120_A1056DisComCod = new String[] {""} ;
      T00L120_A1032FonCod = new String[] {""} ;
      T00L120_A1761ExtCod = new short[1] ;
      T00L121_A396EmprCod = new String[] {""} ;
      T00L121_A30AlbProCod = new long[1] ;
      T00L121_A129BarCod = new int[1] ;
      T00L121_A132BarCodReo = new byte[1] ;
      T00L121_A130BarCodPar = new String[] {""} ;
      T00L121_A2524DisComLin = new byte[1] ;
      T00L121_A1056DisComCod = new String[] {""} ;
      T00L121_A1032FonCod = new String[] {""} ;
      T00L121_A2666ProceCodA = new short[1] ;
      T00L123_A396EmprCod = new String[] {""} ;
      T00L123_A30AlbProCod = new long[1] ;
      T00L123_A129BarCod = new int[1] ;
      T00L123_A132BarCodReo = new byte[1] ;
      T00L123_A130BarCodPar = new String[] {""} ;
      T00L123_A2524DisComLin = new byte[1] ;
      T00L123_A1056DisComCod = new String[] {""} ;
      T00L123_A1032FonCod = new String[] {""} ;
      T00L124_A4790DisComTMT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L124_A30AlbProCod = new long[1] ;
      T00L124_A2524DisComLin = new byte[1] ;
      T00L124_A1056DisComCod = new String[] {""} ;
      T00L124_A1032FonCod = new String[] {""} ;
      T00L124_A4433DisComTro = new short[1] ;
      T00L124_A4434DisComNTr = new short[1] ;
      T00L124_n4434DisComNTr = new boolean[] {false} ;
      T00L124_A4435DisComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L124_n4435DisComMts = new boolean[] {false} ;
      T00L124_A4436DisComTtp = new String[] {""} ;
      T00L124_n4436DisComTtp = new boolean[] {false} ;
      T00L124_A396EmprCod = new String[] {""} ;
      T00L124_A129BarCod = new int[1] ;
      T00L124_A132BarCodReo = new byte[1] ;
      T00L124_A130BarCodPar = new String[] {""} ;
      T00L125_A396EmprCod = new String[] {""} ;
      T00L125_A30AlbProCod = new long[1] ;
      T00L125_A129BarCod = new int[1] ;
      T00L125_A132BarCodReo = new byte[1] ;
      T00L125_A130BarCodPar = new String[] {""} ;
      T00L125_A2524DisComLin = new byte[1] ;
      T00L125_A1056DisComCod = new String[] {""} ;
      T00L125_A1032FonCod = new String[] {""} ;
      T00L125_A4433DisComTro = new short[1] ;
      T00L13_A4790DisComTMT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L13_A30AlbProCod = new long[1] ;
      T00L13_A2524DisComLin = new byte[1] ;
      T00L13_A1056DisComCod = new String[] {""} ;
      T00L13_A1032FonCod = new String[] {""} ;
      T00L13_A4433DisComTro = new short[1] ;
      T00L13_A4434DisComNTr = new short[1] ;
      T00L13_n4434DisComNTr = new boolean[] {false} ;
      T00L13_A4435DisComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L13_n4435DisComMts = new boolean[] {false} ;
      T00L13_A4436DisComTtp = new String[] {""} ;
      T00L13_n4436DisComTtp = new boolean[] {false} ;
      T00L13_A396EmprCod = new String[] {""} ;
      T00L13_A129BarCod = new int[1] ;
      T00L13_A132BarCodReo = new byte[1] ;
      T00L13_A130BarCodPar = new String[] {""} ;
      T00L12_A4790DisComTMT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L12_A30AlbProCod = new long[1] ;
      T00L12_A2524DisComLin = new byte[1] ;
      T00L12_A1056DisComCod = new String[] {""} ;
      T00L12_A1032FonCod = new String[] {""} ;
      T00L12_A4433DisComTro = new short[1] ;
      T00L12_A4434DisComNTr = new short[1] ;
      T00L12_n4434DisComNTr = new boolean[] {false} ;
      T00L12_A4435DisComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L12_n4435DisComMts = new boolean[] {false} ;
      T00L12_A4436DisComTtp = new String[] {""} ;
      T00L12_n4436DisComTtp = new boolean[] {false} ;
      T00L12_A396EmprCod = new String[] {""} ;
      T00L12_A129BarCod = new int[1] ;
      T00L12_A132BarCodReo = new byte[1] ;
      T00L12_A130BarCodPar = new String[] {""} ;
      T00L129_A396EmprCod = new String[] {""} ;
      T00L129_A30AlbProCod = new long[1] ;
      T00L129_A129BarCod = new int[1] ;
      T00L129_A132BarCodReo = new byte[1] ;
      T00L129_A130BarCodPar = new String[] {""} ;
      T00L129_A2524DisComLin = new byte[1] ;
      T00L129_A1056DisComCod = new String[] {""} ;
      T00L129_A1032FonCod = new String[] {""} ;
      T00L129_A4433DisComTro = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00L130_A407EmprNom = new String[] {""} ;
      T00L130_n407EmprNom = new boolean[] {false} ;
      T00L131_A396EmprCod = new String[] {""} ;
      T00L133_A4431DisComTTr = new int[1] ;
      T00L133_A4432DisComTM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      Z4437DisComTMP = DecimalUtil.ZERO ;
      Z4438DisComTMS = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ1056DisComCod = "" ;
      ZZ1032FonCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ4432DisComTM = DecimalUtil.ZERO ;
      ZZ4437DisComTMP = DecimalUtil.ZERO ;
      ZZ4438DisComTMS = DecimalUtil.ZERO ;
      ZO4432DisComTM = DecimalUtil.ZERO ;
      X4790DisComTMT = DecimalUtil.ZERO ;
      T00L134_A396EmprCod = new String[] {""} ;
      T00L134_A30AlbProCod = new long[1] ;
      T00L134_A129BarCod = new int[1] ;
      T00L134_A132BarCodReo = new byte[1] ;
      T00L134_A130BarCodPar = new String[] {""} ;
      T00L134_A2524DisComLin = new byte[1] ;
      T00L134_A1056DisComCod = new String[] {""} ;
      T00L134_A1032FonCod = new String[] {""} ;
      T00L134_A4433DisComTro = new short[1] ;
      T00L134_A4790DisComTMT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L134_A4436DisComTtp = new String[] {""} ;
      T00L134_n4436DisComTtp = new boolean[] {false} ;
      T00L135_A396EmprCod = new String[] {""} ;
      T00L135_A30AlbProCod = new long[1] ;
      T00L135_A129BarCod = new int[1] ;
      T00L135_A132BarCodReo = new byte[1] ;
      T00L135_A130BarCodPar = new String[] {""} ;
      T00L135_A2524DisComLin = new byte[1] ;
      T00L135_A1056DisComCod = new String[] {""} ;
      T00L135_A1032FonCod = new String[] {""} ;
      T00L135_A4433DisComTro = new short[1] ;
      T00L135_A4434DisComNTr = new short[1] ;
      T00L135_n4434DisComNTr = new boolean[] {false} ;
      T00L135_A4436DisComTtp = new String[] {""} ;
      T00L135_n4436DisComTtp = new boolean[] {false} ;
      T00L136_A396EmprCod = new String[] {""} ;
      T00L136_A30AlbProCod = new long[1] ;
      T00L136_A129BarCod = new int[1] ;
      T00L136_A132BarCodReo = new byte[1] ;
      T00L136_A130BarCodPar = new String[] {""} ;
      T00L136_A2524DisComLin = new byte[1] ;
      T00L136_A1056DisComCod = new String[] {""} ;
      T00L136_A1032FonCod = new String[] {""} ;
      T00L136_A4433DisComTro = new short[1] ;
      T00L136_A4790DisComTMT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L136_A4436DisComTtp = new String[] {""} ;
      T00L136_n4436DisComTtp = new boolean[] {false} ;
      T00L137_A396EmprCod = new String[] {""} ;
      T00L137_A30AlbProCod = new long[1] ;
      T00L137_A129BarCod = new int[1] ;
      T00L137_A132BarCodReo = new byte[1] ;
      T00L137_A130BarCodPar = new String[] {""} ;
      T00L137_A2524DisComLin = new byte[1] ;
      T00L137_A1056DisComCod = new String[] {""} ;
      T00L137_A1032FonCod = new String[] {""} ;
      T00L137_A4433DisComTro = new short[1] ;
      T00L137_A4434DisComNTr = new short[1] ;
      T00L137_n4434DisComNTr = new boolean[] {false} ;
      T00L137_A4436DisComTtp = new String[] {""} ;
      T00L137_n4436DisComTtp = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talbtet__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talbtet__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talbtet__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talbtet__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbtet__default(),
         new Object[] {
             new Object[] {
            T00L12_A4790DisComTMT, T00L12_A30AlbProCod, T00L12_A2524DisComLin, T00L12_A1056DisComCod, T00L12_A1032FonCod, T00L12_A4433DisComTro, T00L12_A4434DisComNTr, T00L12_n4434DisComNTr, T00L12_A4435DisComMts, T00L12_n4435DisComMts,
            T00L12_A4436DisComTtp, T00L12_n4436DisComTtp, T00L12_A396EmprCod, T00L12_A129BarCod, T00L12_A132BarCodReo, T00L12_A130BarCodPar
            }
            , new Object[] {
            T00L13_A4790DisComTMT, T00L13_A30AlbProCod, T00L13_A2524DisComLin, T00L13_A1056DisComCod, T00L13_A1032FonCod, T00L13_A4433DisComTro, T00L13_A4434DisComNTr, T00L13_n4434DisComNTr, T00L13_A4435DisComMts, T00L13_n4435DisComMts,
            T00L13_A4436DisComTtp, T00L13_n4436DisComTtp, T00L13_A396EmprCod, T00L13_A129BarCod, T00L13_A132BarCodReo, T00L13_A130BarCodPar
            }
            , new Object[] {
            T00L14_A2524DisComLin, T00L14_A1056DisComCod, T00L14_A1032FonCod, T00L14_A4430DisComUtr, T00L14_n4430DisComUtr, T00L14_A396EmprCod, T00L14_A129BarCod, T00L14_A132BarCodReo, T00L14_A130BarCodPar, T00L14_A30AlbProCod
            }
            , new Object[] {
            T00L15_A2524DisComLin, T00L15_A1056DisComCod, T00L15_A1032FonCod, T00L15_A4430DisComUtr, T00L15_n4430DisComUtr, T00L15_A396EmprCod, T00L15_A129BarCod, T00L15_A132BarCodReo, T00L15_A130BarCodPar, T00L15_A30AlbProCod
            }
            , new Object[] {
            T00L16_A407EmprNom, T00L16_n407EmprNom
            }
            , new Object[] {
            T00L17_A396EmprCod
            }
            , new Object[] {
            T00L19_A4431DisComTTr, T00L19_A4432DisComTM
            }
            , new Object[] {
            T00L111_A2524DisComLin, T00L111_A1056DisComCod, T00L111_A1032FonCod, T00L111_A407EmprNom, T00L111_n407EmprNom, T00L111_A4430DisComUtr, T00L111_n4430DisComUtr, T00L111_A396EmprCod, T00L111_A129BarCod, T00L111_A132BarCodReo,
            T00L111_A130BarCodPar, T00L111_A30AlbProCod, T00L111_A4431DisComTTr, T00L111_A4432DisComTM
            }
            , new Object[] {
            T00L112_A396EmprCod, T00L112_A30AlbProCod, T00L112_A129BarCod, T00L112_A132BarCodReo, T00L112_A130BarCodPar, T00L112_A2524DisComLin, T00L112_A1056DisComCod, T00L112_A1032FonCod
            }
            , new Object[] {
            T00L113_A396EmprCod, T00L113_A30AlbProCod, T00L113_A129BarCod, T00L113_A132BarCodReo, T00L113_A130BarCodPar, T00L113_A2524DisComLin, T00L113_A1056DisComCod, T00L113_A1032FonCod
            }
            , new Object[] {
            T00L114_A396EmprCod, T00L114_A30AlbProCod, T00L114_A129BarCod, T00L114_A132BarCodReo, T00L114_A130BarCodPar, T00L114_A2524DisComLin, T00L114_A1056DisComCod, T00L114_A1032FonCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00L118_A396EmprCod, T00L118_A30AlbProCod, T00L118_A129BarCod, T00L118_A132BarCodReo, T00L118_A130BarCodPar, T00L118_A2524DisComLin, T00L118_A1056DisComCod, T00L118_A1032FonCod, T00L118_A200BarPieCod
            }
            , new Object[] {
            T00L119_A396EmprCod, T00L119_A30AlbProCod, T00L119_A129BarCod, T00L119_A132BarCodReo, T00L119_A130BarCodPar, T00L119_A2524DisComLin, T00L119_A1056DisComCod, T00L119_A1032FonCod, T00L119_A4336AlbEstPLin
            }
            , new Object[] {
            T00L120_A396EmprCod, T00L120_A30AlbProCod, T00L120_A129BarCod, T00L120_A132BarCodReo, T00L120_A130BarCodPar, T00L120_A2524DisComLin, T00L120_A1056DisComCod, T00L120_A1032FonCod, T00L120_A1761ExtCod
            }
            , new Object[] {
            T00L121_A396EmprCod, T00L121_A30AlbProCod, T00L121_A129BarCod, T00L121_A132BarCodReo, T00L121_A130BarCodPar, T00L121_A2524DisComLin, T00L121_A1056DisComCod, T00L121_A1032FonCod, T00L121_A2666ProceCodA
            }
            , new Object[] {
            }
            , new Object[] {
            T00L123_A396EmprCod, T00L123_A30AlbProCod, T00L123_A129BarCod, T00L123_A132BarCodReo, T00L123_A130BarCodPar, T00L123_A2524DisComLin, T00L123_A1056DisComCod, T00L123_A1032FonCod
            }
            , new Object[] {
            T00L124_A4790DisComTMT, T00L124_A30AlbProCod, T00L124_A2524DisComLin, T00L124_A1056DisComCod, T00L124_A1032FonCod, T00L124_A4433DisComTro, T00L124_A4434DisComNTr, T00L124_n4434DisComNTr, T00L124_A4435DisComMts, T00L124_n4435DisComMts,
            T00L124_A4436DisComTtp, T00L124_n4436DisComTtp, T00L124_A396EmprCod, T00L124_A129BarCod, T00L124_A132BarCodReo, T00L124_A130BarCodPar
            }
            , new Object[] {
            T00L125_A396EmprCod, T00L125_A30AlbProCod, T00L125_A129BarCod, T00L125_A132BarCodReo, T00L125_A130BarCodPar, T00L125_A2524DisComLin, T00L125_A1056DisComCod, T00L125_A1032FonCod, T00L125_A4433DisComTro
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00L129_A396EmprCod, T00L129_A30AlbProCod, T00L129_A129BarCod, T00L129_A132BarCodReo, T00L129_A130BarCodPar, T00L129_A2524DisComLin, T00L129_A1056DisComCod, T00L129_A1032FonCod, T00L129_A4433DisComTro
            }
            , new Object[] {
            T00L130_A407EmprNom, T00L130_n407EmprNom
            }
            , new Object[] {
            T00L131_A396EmprCod
            }
            , new Object[] {
            T00L133_A4431DisComTTr, T00L133_A4432DisComTM
            }
            , new Object[] {
            T00L134_A396EmprCod, T00L134_A30AlbProCod, T00L134_A129BarCod, T00L134_A132BarCodReo, T00L134_A130BarCodPar, T00L134_A2524DisComLin, T00L134_A1056DisComCod, T00L134_A1032FonCod, T00L134_A4433DisComTro, T00L134_A4790DisComTMT,
            T00L134_A4436DisComTtp, T00L134_n4436DisComTtp
            }
            , new Object[] {
            T00L135_A396EmprCod, T00L135_A30AlbProCod, T00L135_A129BarCod, T00L135_A132BarCodReo, T00L135_A130BarCodPar, T00L135_A2524DisComLin, T00L135_A1056DisComCod, T00L135_A1032FonCod, T00L135_A4433DisComTro, T00L135_A4434DisComNTr,
            T00L135_n4434DisComNTr, T00L135_A4436DisComTtp, T00L135_n4436DisComTtp
            }
            , new Object[] {
            T00L136_A396EmprCod, T00L136_A30AlbProCod, T00L136_A129BarCod, T00L136_A132BarCodReo, T00L136_A130BarCodPar, T00L136_A2524DisComLin, T00L136_A1056DisComCod, T00L136_A1032FonCod, T00L136_A4433DisComTro, T00L136_A4790DisComTMT,
            T00L136_A4436DisComTtp, T00L136_n4436DisComTtp
            }
            , new Object[] {
            T00L137_A396EmprCod, T00L137_A30AlbProCod, T00L137_A129BarCod, T00L137_A132BarCodReo, T00L137_A130BarCodPar, T00L137_A2524DisComLin, T00L137_A1056DisComCod, T00L137_A1032FonCod, T00L137_A4433DisComTro, T00L137_A4434DisComNTr,
            T00L137_n4434DisComNTr, T00L137_A4436DisComTtp, T00L137_n4436DisComTtp
            }
         }
      );
      Z1032FonCod = "" ;
      E1032FonCod = "" ;
      A1032FonCod = "" ;
      Z1056DisComCod = "" ;
      E1056DisComCod = "" ;
      A1056DisComCod = "" ;
      Z2524DisComLin = (byte)(0) ;
      E2524DisComLin = (byte)(0) ;
      A2524DisComLin = (byte)(0) ;
      Z130BarCodPar = "" ;
      E130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      E132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      E129BarCod = 0 ;
      A129BarCod = 0 ;
      Z30AlbProCod = 0 ;
      E30AlbProCod = 0 ;
      A30AlbProCod = 0 ;
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte wcpOA2524DisComLin ;
   private byte Z132BarCodReo ;
   private byte Z2524DisComLin ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ2524DisComLin ;
   private byte E132BarCodReo ;
   private byte E2524DisComLin ;
   private short Z4430DisComUtr ;
   private short O4430DisComUtr ;
   private short Z4433DisComTro ;
   private short Z4434DisComNTr ;
   private short O4434DisComNTr ;
   private short nRcdDeleted_674 ;
   private short nRcdExists_674 ;
   private short nIsMod_674 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4430DisComUtr ;
   private short nBlankRcdCount674 ;
   private short RcdFound674 ;
   private short B4430DisComUtr ;
   private short nBlankRcdUsr674 ;
   private short s4430DisComUtr ;
   private short A4433DisComTro ;
   private short A4434DisComNTr ;
   private short T4434DisComNTr ;
   private short RcdFound533 ;
   private short nIsDirty_533 ;
   private short nIsDirty_674 ;
   private short i4430DisComUtr ;
   private short ZZ4430DisComUtr ;
   private short ZO4430DisComUtr ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int O4431DisComTTr ;
   private int nRC_GXsfl_100 ;
   private int nGXsfl_100_idx=1 ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbProCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtDisComLin_Enabled ;
   private int edtDisComCod_Enabled ;
   private int edtFonCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDisComUtr_Enabled ;
   private int A4431DisComTTr ;
   private int edtDisComTTr_Enabled ;
   private int edtDisComTM_Enabled ;
   private int A4788DisComTrP ;
   private int edtDisComTrP_Enabled ;
   private int edtDisComTMP_Enabled ;
   private int A4789DisComTrS ;
   private int edtDisComTrS_Enabled ;
   private int edtDisComTMS_Enabled ;
   private int B4431DisComTTr ;
   private int edtavnRcdDeleted_674_Enabled ;
   private int edtDisComTro_Enabled ;
   private int edtDisComNTr_Enabled ;
   private int edtDisComMts_Enabled ;
   private int edtDisComTMT_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s4431DisComTTr ;
   private int s4788DisComTrP ;
   private int O4788DisComTrP ;
   private int s4789DisComTrS ;
   private int O4789DisComTrS ;
   private int GX_JID ;
   private int Z4431DisComTTr ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtDisComTro_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtDisComTMS_Backcolor ;
   private int edtDisComTrS_Backcolor ;
   private int edtDisComTMP_Backcolor ;
   private int edtDisComTrP_Backcolor ;
   private int edtDisComTM_Backcolor ;
   private int edtDisComTTr_Backcolor ;
   private int edtDisComUtr_Backcolor ;
   private int edtFonCod_Backcolor ;
   private int edtDisComCod_Backcolor ;
   private int edtDisComLin_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtAlbProCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int Z4788DisComTrP ;
   private int Z4789DisComTrS ;
   private int ZZ129BarCod ;
   private int ZZ4431DisComTTr ;
   private int ZZ4788DisComTrP ;
   private int ZZ4789DisComTrS ;
   private int ZO4431DisComTTr ;
   private int E129BarCod ;
   private int X4434DisComNTr ;
   private long wcpOA30AlbProCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long ZZ30AlbProCod ;
   private long E30AlbProCod ;
   private java.math.BigDecimal O4432DisComTM ;
   private java.math.BigDecimal Z4790DisComTMT ;
   private java.math.BigDecimal Z4435DisComMts ;
   private java.math.BigDecimal O4790DisComTMT ;
   private java.math.BigDecimal A4432DisComTM ;
   private java.math.BigDecimal A4437DisComTMP ;
   private java.math.BigDecimal A4438DisComTMS ;
   private java.math.BigDecimal B4432DisComTM ;
   private java.math.BigDecimal s4432DisComTM ;
   private java.math.BigDecimal s4437DisComTMP ;
   private java.math.BigDecimal O4437DisComTMP ;
   private java.math.BigDecimal s4438DisComTMS ;
   private java.math.BigDecimal O4438DisComTMS ;
   private java.math.BigDecimal A4435DisComMts ;
   private java.math.BigDecimal A4790DisComTMT ;
   private java.math.BigDecimal T4790DisComTMT ;
   private java.math.BigDecimal Z4432DisComTM ;
   private java.math.BigDecimal Z4437DisComTMP ;
   private java.math.BigDecimal Z4438DisComTMS ;
   private java.math.BigDecimal ZZ4432DisComTM ;
   private java.math.BigDecimal ZZ4437DisComTMP ;
   private java.math.BigDecimal ZZ4438DisComTMS ;
   private java.math.BigDecimal ZO4432DisComTM ;
   private java.math.BigDecimal X4790DisComTMT ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA1056DisComCod ;
   private String wcpOA1032FonCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z1056DisComCod ;
   private String Z1032FonCod ;
   private String Z4436DisComTtp ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_100_idx="0001" ;
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
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDisComLin_Internalname ;
   private String edtDisComLin_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDisComCod_Internalname ;
   private String edtDisComCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtFonCod_Internalname ;
   private String edtFonCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtDisComUtr_Internalname ;
   private String edtDisComUtr_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtDisComTTr_Internalname ;
   private String edtDisComTTr_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtDisComTM_Internalname ;
   private String edtDisComTM_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtDisComTrP_Internalname ;
   private String edtDisComTrP_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtDisComTMP_Internalname ;
   private String edtDisComTMP_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtDisComTrS_Internalname ;
   private String edtDisComTrS_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtDisComTMS_Internalname ;
   private String edtDisComTMS_Jsonclick ;
   private String sMode674 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_674_Internalname ;
   private String edtDisComTro_Internalname ;
   private String edtDisComNTr_Internalname ;
   private String edtDisComMts_Internalname ;
   private String edtDisComTMT_Internalname ;
   private String GX_FocusControl ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode533 ;
   private String A4436DisComTtp ;
   private String Z407EmprNom ;
   private String sGXsfl_100_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_674_Jsonclick ;
   private String edtDisComTro_Jsonclick ;
   private String edtDisComNTr_Jsonclick ;
   private String edtDisComMts_Jsonclick ;
   private String GXCCtl ;
   private String edtDisComTMT_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ1056DisComCod ;
   private String ZZ1032FonCod ;
   private String ZZ407EmprNom ;
   private String E396EmprCod ;
   private String E130BarCodPar ;
   private String E1056DisComCod ;
   private String E1032FonCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n4430DisComUtr ;
   private boolean bGXsfl_100_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4434DisComNTr ;
   private boolean n4435DisComMts ;
   private boolean n4436DisComTtp ;
   private boolean Gx_first ;
   private boolean nX4434DisComNTr ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private HTMLChoice cmbDisComTtp ;
   private IDataStoreProvider pr_default ;
   private String[] T00L16_A407EmprNom ;
   private boolean[] T00L16_n407EmprNom ;
   private String[] T00L17_A396EmprCod ;
   private int[] T00L19_A4431DisComTTr ;
   private java.math.BigDecimal[] T00L19_A4432DisComTM ;
   private byte[] T00L111_A2524DisComLin ;
   private String[] T00L111_A1056DisComCod ;
   private String[] T00L111_A1032FonCod ;
   private String[] T00L111_A407EmprNom ;
   private boolean[] T00L111_n407EmprNom ;
   private short[] T00L111_A4430DisComUtr ;
   private boolean[] T00L111_n4430DisComUtr ;
   private String[] T00L111_A396EmprCod ;
   private int[] T00L111_A129BarCod ;
   private byte[] T00L111_A132BarCodReo ;
   private String[] T00L111_A130BarCodPar ;
   private long[] T00L111_A30AlbProCod ;
   private int[] T00L111_A4431DisComTTr ;
   private java.math.BigDecimal[] T00L111_A4432DisComTM ;
   private String[] T00L112_A396EmprCod ;
   private long[] T00L112_A30AlbProCod ;
   private int[] T00L112_A129BarCod ;
   private byte[] T00L112_A132BarCodReo ;
   private String[] T00L112_A130BarCodPar ;
   private byte[] T00L112_A2524DisComLin ;
   private String[] T00L112_A1056DisComCod ;
   private String[] T00L112_A1032FonCod ;
   private byte[] T00L15_A2524DisComLin ;
   private String[] T00L15_A1056DisComCod ;
   private String[] T00L15_A1032FonCod ;
   private short[] T00L15_A4430DisComUtr ;
   private boolean[] T00L15_n4430DisComUtr ;
   private String[] T00L15_A396EmprCod ;
   private int[] T00L15_A129BarCod ;
   private byte[] T00L15_A132BarCodReo ;
   private String[] T00L15_A130BarCodPar ;
   private long[] T00L15_A30AlbProCod ;
   private String[] T00L113_A396EmprCod ;
   private long[] T00L113_A30AlbProCod ;
   private int[] T00L113_A129BarCod ;
   private byte[] T00L113_A132BarCodReo ;
   private String[] T00L113_A130BarCodPar ;
   private byte[] T00L113_A2524DisComLin ;
   private String[] T00L113_A1056DisComCod ;
   private String[] T00L113_A1032FonCod ;
   private String[] T00L114_A396EmprCod ;
   private long[] T00L114_A30AlbProCod ;
   private int[] T00L114_A129BarCod ;
   private byte[] T00L114_A132BarCodReo ;
   private String[] T00L114_A130BarCodPar ;
   private byte[] T00L114_A2524DisComLin ;
   private String[] T00L114_A1056DisComCod ;
   private String[] T00L114_A1032FonCod ;
   private byte[] T00L14_A2524DisComLin ;
   private String[] T00L14_A1056DisComCod ;
   private String[] T00L14_A1032FonCod ;
   private short[] T00L14_A4430DisComUtr ;
   private boolean[] T00L14_n4430DisComUtr ;
   private String[] T00L14_A396EmprCod ;
   private int[] T00L14_A129BarCod ;
   private byte[] T00L14_A132BarCodReo ;
   private String[] T00L14_A130BarCodPar ;
   private long[] T00L14_A30AlbProCod ;
   private String[] T00L118_A396EmprCod ;
   private long[] T00L118_A30AlbProCod ;
   private int[] T00L118_A129BarCod ;
   private byte[] T00L118_A132BarCodReo ;
   private String[] T00L118_A130BarCodPar ;
   private byte[] T00L118_A2524DisComLin ;
   private String[] T00L118_A1056DisComCod ;
   private String[] T00L118_A1032FonCod ;
   private String[] T00L118_A200BarPieCod ;
   private String[] T00L119_A396EmprCod ;
   private long[] T00L119_A30AlbProCod ;
   private int[] T00L119_A129BarCod ;
   private byte[] T00L119_A132BarCodReo ;
   private String[] T00L119_A130BarCodPar ;
   private byte[] T00L119_A2524DisComLin ;
   private String[] T00L119_A1056DisComCod ;
   private String[] T00L119_A1032FonCod ;
   private short[] T00L119_A4336AlbEstPLin ;
   private String[] T00L120_A396EmprCod ;
   private long[] T00L120_A30AlbProCod ;
   private int[] T00L120_A129BarCod ;
   private byte[] T00L120_A132BarCodReo ;
   private String[] T00L120_A130BarCodPar ;
   private byte[] T00L120_A2524DisComLin ;
   private String[] T00L120_A1056DisComCod ;
   private String[] T00L120_A1032FonCod ;
   private short[] T00L120_A1761ExtCod ;
   private String[] T00L121_A396EmprCod ;
   private long[] T00L121_A30AlbProCod ;
   private int[] T00L121_A129BarCod ;
   private byte[] T00L121_A132BarCodReo ;
   private String[] T00L121_A130BarCodPar ;
   private byte[] T00L121_A2524DisComLin ;
   private String[] T00L121_A1056DisComCod ;
   private String[] T00L121_A1032FonCod ;
   private short[] T00L121_A2666ProceCodA ;
   private String[] T00L123_A396EmprCod ;
   private long[] T00L123_A30AlbProCod ;
   private int[] T00L123_A129BarCod ;
   private byte[] T00L123_A132BarCodReo ;
   private String[] T00L123_A130BarCodPar ;
   private byte[] T00L123_A2524DisComLin ;
   private String[] T00L123_A1056DisComCod ;
   private String[] T00L123_A1032FonCod ;
   private java.math.BigDecimal[] T00L124_A4790DisComTMT ;
   private long[] T00L124_A30AlbProCod ;
   private byte[] T00L124_A2524DisComLin ;
   private String[] T00L124_A1056DisComCod ;
   private String[] T00L124_A1032FonCod ;
   private short[] T00L124_A4433DisComTro ;
   private short[] T00L124_A4434DisComNTr ;
   private boolean[] T00L124_n4434DisComNTr ;
   private java.math.BigDecimal[] T00L124_A4435DisComMts ;
   private boolean[] T00L124_n4435DisComMts ;
   private String[] T00L124_A4436DisComTtp ;
   private boolean[] T00L124_n4436DisComTtp ;
   private String[] T00L124_A396EmprCod ;
   private int[] T00L124_A129BarCod ;
   private byte[] T00L124_A132BarCodReo ;
   private String[] T00L124_A130BarCodPar ;
   private String[] T00L125_A396EmprCod ;
   private long[] T00L125_A30AlbProCod ;
   private int[] T00L125_A129BarCod ;
   private byte[] T00L125_A132BarCodReo ;
   private String[] T00L125_A130BarCodPar ;
   private byte[] T00L125_A2524DisComLin ;
   private String[] T00L125_A1056DisComCod ;
   private String[] T00L125_A1032FonCod ;
   private short[] T00L125_A4433DisComTro ;
   private java.math.BigDecimal[] T00L13_A4790DisComTMT ;
   private long[] T00L13_A30AlbProCod ;
   private byte[] T00L13_A2524DisComLin ;
   private String[] T00L13_A1056DisComCod ;
   private String[] T00L13_A1032FonCod ;
   private short[] T00L13_A4433DisComTro ;
   private short[] T00L13_A4434DisComNTr ;
   private boolean[] T00L13_n4434DisComNTr ;
   private java.math.BigDecimal[] T00L13_A4435DisComMts ;
   private boolean[] T00L13_n4435DisComMts ;
   private String[] T00L13_A4436DisComTtp ;
   private boolean[] T00L13_n4436DisComTtp ;
   private String[] T00L13_A396EmprCod ;
   private int[] T00L13_A129BarCod ;
   private byte[] T00L13_A132BarCodReo ;
   private String[] T00L13_A130BarCodPar ;
   private java.math.BigDecimal[] T00L12_A4790DisComTMT ;
   private long[] T00L12_A30AlbProCod ;
   private byte[] T00L12_A2524DisComLin ;
   private String[] T00L12_A1056DisComCod ;
   private String[] T00L12_A1032FonCod ;
   private short[] T00L12_A4433DisComTro ;
   private short[] T00L12_A4434DisComNTr ;
   private boolean[] T00L12_n4434DisComNTr ;
   private java.math.BigDecimal[] T00L12_A4435DisComMts ;
   private boolean[] T00L12_n4435DisComMts ;
   private String[] T00L12_A4436DisComTtp ;
   private boolean[] T00L12_n4436DisComTtp ;
   private String[] T00L12_A396EmprCod ;
   private int[] T00L12_A129BarCod ;
   private byte[] T00L12_A132BarCodReo ;
   private String[] T00L12_A130BarCodPar ;
   private String[] T00L129_A396EmprCod ;
   private long[] T00L129_A30AlbProCod ;
   private int[] T00L129_A129BarCod ;
   private byte[] T00L129_A132BarCodReo ;
   private String[] T00L129_A130BarCodPar ;
   private byte[] T00L129_A2524DisComLin ;
   private String[] T00L129_A1056DisComCod ;
   private String[] T00L129_A1032FonCod ;
   private short[] T00L129_A4433DisComTro ;
   private String[] T00L130_A407EmprNom ;
   private boolean[] T00L130_n407EmprNom ;
   private String[] T00L131_A396EmprCod ;
   private int[] T00L133_A4431DisComTTr ;
   private java.math.BigDecimal[] T00L133_A4432DisComTM ;
   private String[] T00L134_A396EmprCod ;
   private long[] T00L134_A30AlbProCod ;
   private int[] T00L134_A129BarCod ;
   private byte[] T00L134_A132BarCodReo ;
   private String[] T00L134_A130BarCodPar ;
   private byte[] T00L134_A2524DisComLin ;
   private String[] T00L134_A1056DisComCod ;
   private String[] T00L134_A1032FonCod ;
   private short[] T00L134_A4433DisComTro ;
   private java.math.BigDecimal[] T00L134_A4790DisComTMT ;
   private String[] T00L134_A4436DisComTtp ;
   private boolean[] T00L134_n4436DisComTtp ;
   private String[] T00L135_A396EmprCod ;
   private long[] T00L135_A30AlbProCod ;
   private int[] T00L135_A129BarCod ;
   private byte[] T00L135_A132BarCodReo ;
   private String[] T00L135_A130BarCodPar ;
   private byte[] T00L135_A2524DisComLin ;
   private String[] T00L135_A1056DisComCod ;
   private String[] T00L135_A1032FonCod ;
   private short[] T00L135_A4433DisComTro ;
   private short[] T00L135_A4434DisComNTr ;
   private boolean[] T00L135_n4434DisComNTr ;
   private String[] T00L135_A4436DisComTtp ;
   private boolean[] T00L135_n4436DisComTtp ;
   private String[] T00L136_A396EmprCod ;
   private long[] T00L136_A30AlbProCod ;
   private int[] T00L136_A129BarCod ;
   private byte[] T00L136_A132BarCodReo ;
   private String[] T00L136_A130BarCodPar ;
   private byte[] T00L136_A2524DisComLin ;
   private String[] T00L136_A1056DisComCod ;
   private String[] T00L136_A1032FonCod ;
   private short[] T00L136_A4433DisComTro ;
   private java.math.BigDecimal[] T00L136_A4790DisComTMT ;
   private String[] T00L136_A4436DisComTtp ;
   private boolean[] T00L136_n4436DisComTtp ;
   private String[] T00L137_A396EmprCod ;
   private long[] T00L137_A30AlbProCod ;
   private int[] T00L137_A129BarCod ;
   private byte[] T00L137_A132BarCodReo ;
   private String[] T00L137_A130BarCodPar ;
   private byte[] T00L137_A2524DisComLin ;
   private String[] T00L137_A1056DisComCod ;
   private String[] T00L137_A1032FonCod ;
   private short[] T00L137_A4433DisComTro ;
   private short[] T00L137_A4434DisComNTr ;
   private boolean[] T00L137_n4434DisComNTr ;
   private String[] T00L137_A4436DisComTtp ;
   private boolean[] T00L137_n4436DisComTtp ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talbtet__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbtet__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbtet__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbtet__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbtet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00L12", "SELECT DisComTMT, AlbProCod, DisComLin, DisComCod, FonCod, DisComTro, DisComNTr, DisComMts, DisComTtp, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBTET WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND DisComTro = ?  FOR UPDATE OF DisComTMT, DisComNTr, DisComMts, DisComTtp NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L13", "SELECT DisComTMT, AlbProCod, DisComLin, DisComCod, FonCod, DisComTro, DisComNTr, DisComMts, DisComTtp, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBTET WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND DisComTro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L14", "SELECT DisComLin, DisComCod, FonCod, DisComUtr, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?  FOR UPDATE OF DisComUtr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L15", "SELECT DisComLin, DisComCod, FonCod, DisComUtr, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L17", "SELECT EmprCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L19", "SELECT COALESCE( T1.DisComTTr, 0) AS DisComTTr, COALESCE( T1.DisComTM, 0) AS DisComTM FROM (SELECT SUM(DisComNTr) AS DisComTTr, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, SUM(DisComTMT) AS DisComTM FROM TXPALBTET GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.DisComLin = ? AND T1.DisComCod = ? AND T1.FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L111", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisComLin, TM1.DisComCod, TM1.FonCod, T2.EmprNom, TM1.DisComUtr, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.AlbProCod, COALESCE( T3.DisComTTr, 0) AS DisComTTr, COALESCE( T3.DisComTM, 0) AS DisComTM FROM ((TXPALBEST TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(DisComNTr) AS DisComTTr, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, SUM(DisComTMT) AS DisComTM FROM TXPALBTET GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbProCod = TM1.AlbProCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar AND T3.DisComLin = TM1.DisComLin AND T3.DisComCod = TM1.DisComCod AND T3.FonCod = TM1.FonCod) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.DisComLin = ? and TM1.DisComCod = ? and TM1.FonCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.DisComLin, TM1.DisComCod, TM1.FonCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L112", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L113", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L114", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, DisComLin DESC, DisComCod DESC, FonCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00L115", "INSERT INTO TXPALBEST(DisComLin, DisComCod, FonCod, DisComUtr, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, AlbEComM, AlbEComP, AlbEComPre, AlbEstObs, AlbEComUPz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0)", GX_NOMASK, "TXPALBEST")
         ,new UpdateCursor("T00L116", "UPDATE TXPALBEST SET DisComUtr=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK, "TXPALBEST")
         ,new UpdateCursor("T00L117", "DELETE FROM TXPALBEST  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK, "TXPALBEST")
         ,new ForEachCursor("T00L118", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarPieCod FROM TXPALBTEP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L119", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, AlbEstPLin FROM TXPALESTP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L120", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ExtCod FROM TXPALBETE WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L121", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ProceCodA FROM TXPALBEPR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00L122", "UPDATE TXPALBEST SET DisComUtr=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK, "TXPALBEST")
         ,new ForEachCursor("T00L123", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L124", "SELECT DisComTMT, AlbProCod, DisComLin, DisComCod, FonCod, DisComTro, DisComNTr, DisComMts, DisComTtp, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBTET WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and DisComTro = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L125", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro FROM TXPALBTET WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND DisComTro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00L126", "INSERT INTO TXPALBTET(DisComTMT, AlbProCod, DisComLin, DisComCod, FonCod, DisComTro, DisComNTr, DisComMts, DisComTtp, EmprCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPALBTET")
         ,new UpdateCursor("T00L127", "UPDATE TXPALBTET SET DisComTMT=?, DisComNTr=?, DisComMts=?, DisComTtp=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND DisComTro = ?", GX_NOMASK, "TXPALBTET")
         ,new UpdateCursor("T00L128", "DELETE FROM TXPALBTET  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND DisComTro = ?", GX_NOMASK, "TXPALBTET")
         ,new ForEachCursor("T00L129", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro FROM TXPALBTET WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L130", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L131", "SELECT EmprCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L133", "SELECT COALESCE( T1.DisComTTr, 0) AS DisComTTr, COALESCE( T1.DisComTM, 0) AS DisComTM FROM (SELECT SUM(DisComNTr) AS DisComTTr, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, SUM(DisComTMT) AS DisComTM FROM TXPALBTET GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.DisComLin = ? AND T1.DisComCod = ? AND T1.FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L134", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro, DisComTMT, DisComTtp FROM TXPALBTET WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L135", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro, DisComNTr, DisComTtp FROM TXPALBTET WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L136", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro, DisComTMT, DisComTtp FROM TXPALBTET WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L137", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro, DisComNTr, DisComTtp FROM TXPALBTET WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((long[]) buf[9])[0] = rslt.getLong(9);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((long[]) buf[9])[0] = rslt.getLong(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((long[]) buf[11])[0] = rslt.getLong(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 20 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 11 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 12);
               stmt.setString(3, (String)parms[2], 12);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               stmt.setString(5, (String)parms[5], 3);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 1);
               stmt.setLong(9, ((Number) parms[9]).longValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 12);
               stmt.setString(9, (String)parms[9], 12);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 12);
               stmt.setString(9, (String)parms[9], 12);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 22 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[11], 1);
               }
               stmt.setString(10, (String)parms[12], 3);
               stmt.setInt(11, ((Number) parms[13]).intValue());
               stmt.setByte(12, ((Number) parms[14]).byteValue());
               stmt.setString(13, (String)parms[15], 1);
               return;
            case 23 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setString(5, (String)parms[7], 3);
               stmt.setLong(6, ((Number) parms[8]).longValue());
               stmt.setInt(7, ((Number) parms[9]).intValue());
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               stmt.setString(9, (String)parms[11], 1);
               stmt.setByte(10, ((Number) parms[12]).byteValue());
               stmt.setString(11, (String)parms[13], 12);
               stmt.setString(12, (String)parms[14], 12);
               stmt.setShort(13, ((Number) parms[15]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
      }
   }

}

